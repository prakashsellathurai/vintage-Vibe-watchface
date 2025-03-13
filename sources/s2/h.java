package s2;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import k3.k;

public final class h implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config f7190f = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final i f7191a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f7192b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7193c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final long f7194d;
    public long e;

    public static final class a {
    }

    public h(long j8) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f7194d = j8;
        this.f7191a = kVar;
        this.f7192b = unmodifiableSet;
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i8) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i8 >= 40 || i8 >= 20) {
            b();
        } else if (i8 >= 20 || i8 == 15) {
            g(this.f7194d / 2);
        }
    }

    public final void b() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0);
    }

    public final Bitmap c(int i8, int i9, Bitmap.Config config) {
        Bitmap f9 = f(i8, i9, config);
        if (f9 != null) {
            return f9;
        }
        if (config == null) {
            config = f7190f;
        }
        return Bitmap.createBitmap(i8, i9, config);
    }

    public final Bitmap d(int i8, int i9, Bitmap.Config config) {
        Bitmap f9 = f(i8, i9, config);
        if (f9 != null) {
            f9.eraseColor(0);
            return f9;
        }
        if (config == null) {
            config = f7190f;
        }
        return Bitmap.createBitmap(i8, i9, config);
    }

    public final synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((k) this.f7191a).getClass();
                        if (((long) k.c(bitmap)) <= this.f7194d) {
                            if (this.f7192b.contains(bitmap.getConfig())) {
                                ((k) this.f7191a).getClass();
                                int c9 = k.c(bitmap);
                                ((k) this.f7191a).f(bitmap);
                                this.f7193c.getClass();
                                this.e += (long) c9;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    ((k) this.f7191a).e(bitmap);
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Objects.toString(this.f7191a);
                                }
                                g(this.f7194d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((k) this.f7191a).e(bitmap);
                        bitmap.isMutable();
                        this.f7192b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final synchronized Bitmap f(int i8, int i9, Bitmap.Config config) {
        Bitmap b9;
        try {
            if (config != Bitmap.Config.HARDWARE) {
                b9 = ((k) this.f7191a).b(i8, i9, config != null ? config : f7190f);
                if (b9 != null) {
                    long j8 = this.e;
                    ((k) this.f7191a).getClass();
                    this.e = j8 - ((long) k.c(b9));
                    this.f7193c.getClass();
                    b9.setHasAlpha(true);
                    b9.setPremultiplied(true);
                } else if (Log.isLoggable("LruBitmapPool", 3)) {
                    ((k) this.f7191a).getClass();
                    k.c(k.b(i8, i9, config), config);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    ((k) this.f7191a).getClass();
                    k.c(k.b(i8, i9, config), config);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f7191a);
                }
            } else {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return b9;
    }

    public final synchronized void g(long j8) {
        while (this.e > j8) {
            k kVar = (k) this.f7191a;
            Bitmap c9 = kVar.f7200b.c();
            if (c9 != null) {
                kVar.a(Integer.valueOf(k.c(c9)), c9);
            }
            if (c9 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    Objects.toString(this.f7191a);
                }
                this.e = 0;
                return;
            }
            this.f7193c.getClass();
            long j9 = this.e;
            ((k) this.f7191a).getClass();
            this.e = j9 - ((long) k.c(c9));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((k) this.f7191a).e(c9);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f7191a);
            }
            c9.recycle();
        }
    }
}
