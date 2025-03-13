package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.m;
import androidx.fragment.app.i0;
import androidx.health.services.client.R;
import d2.e;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import k2.g;
import k3.j;
import y1.f;
import y1.h;
import y1.i;
import y1.k;
import y1.l;
import y1.o;
import y1.p;
import y1.q;
import y1.t;
import y1.u;
import y1.v;
import y1.w;
import y1.x;

public class LottieAnimationView extends m {

    /* renamed from: v  reason: collision with root package name */
    public static final a f2884v = new a();

    /* renamed from: c  reason: collision with root package name */
    public final b f2885c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final c f2886d = new c();
    public o<Throwable> e;

    /* renamed from: f  reason: collision with root package name */
    public int f2887f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2888g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2889h;

    /* renamed from: i  reason: collision with root package name */
    public String f2890i;

    /* renamed from: j  reason: collision with root package name */
    public int f2891j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2892k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2893l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2894m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2895n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2896o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2897p;

    /* renamed from: q  reason: collision with root package name */
    public v f2898q;
    public final HashSet r;

    /* renamed from: s  reason: collision with root package name */
    public int f2899s;

    /* renamed from: t  reason: collision with root package name */
    public t<f> f2900t;

    /* renamed from: u  reason: collision with root package name */
    public f f2901u;

    public class a implements o<Throwable> {
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            ThreadLocal<PathMeasure> threadLocal = g.f5118a;
            if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
                k2.c.c("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public class b implements o<f> {
        public b() {
        }

        public final void a(Object obj) {
            LottieAnimationView.this.setComposition((f) obj);
        }
    }

    public class c implements o<Throwable> {
        public c() {
        }

        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i8 = lottieAnimationView.f2887f;
            if (i8 != 0) {
                lottieAnimationView.setImageResource(i8);
            }
            o oVar = lottieAnimationView.e;
            if (oVar == null) {
                oVar = LottieAnimationView.f2884v;
            }
            oVar.a(th);
        }
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public String f2904f;

        /* renamed from: g  reason: collision with root package name */
        public int f2905g;

        /* renamed from: h  reason: collision with root package name */
        public float f2906h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2907i;

        /* renamed from: j  reason: collision with root package name */
        public String f2908j;

        /* renamed from: k  reason: collision with root package name */
        public int f2909k;

        /* renamed from: l  reason: collision with root package name */
        public int f2910l;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f2904f = parcel.readString();
            this.f2906h = parcel.readFloat();
            this.f2907i = parcel.readInt() != 1 ? false : true;
            this.f2908j = parcel.readString();
            this.f2909k = parcel.readInt();
            this.f2910l = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.f2904f);
            parcel.writeFloat(this.f2906h);
            parcel.writeInt(this.f2907i ? 1 : 0);
            parcel.writeString(this.f2908j);
            parcel.writeInt(this.f2909k);
            parcel.writeInt(this.f2910l);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean z8 = false;
        this.f2887f = 0;
        l lVar = new l();
        this.f2888g = lVar;
        this.f2892k = false;
        this.f2893l = false;
        this.f2894m = false;
        this.f2895n = false;
        this.f2896o = false;
        this.f2897p = true;
        this.f2898q = v.f8332f;
        this.r = new HashSet();
        this.f2899s = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.L, R.attr.lottieAnimationViewStyle, 0);
        this.f2897p = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.f2894m = true;
                this.f2896o = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                lVar.f8252c.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                setRepeatMode(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                setRepeatCount(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(7));
            setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z9 = obtainStyledAttributes.getBoolean(3, false);
            if (lVar.f8260l != z9) {
                lVar.f8260l = z9;
                if (lVar.f8251b != null) {
                    lVar.c();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
                Context context2 = getContext();
                Object obj = g.a.f4440a;
                lVar.a(new e("**"), q.E, new i0((Object) new w(context2.getColorStateList(resourceId2).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                lVar.f8253d = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i8 = obtainStyledAttributes.getInt(11, 0);
                setRenderMode(v.values()[i8 >= v.values().length ? 0 : i8]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
            obtainStyledAttributes.recycle();
            Context context3 = getContext();
            ThreadLocal<PathMeasure> threadLocal = g.f5118a;
            lVar.e = Boolean.valueOf(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z8).booleanValue();
            d();
            this.f2889h = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(t<f> tVar) {
        this.f2901u = null;
        this.f2888g.d();
        b();
        b bVar = this.f2885c;
        synchronized (tVar) {
            if (!(tVar.f8327d == null || tVar.f8327d.f8321a == null)) {
                bVar.a(tVar.f8327d.f8321a);
            }
            tVar.f8324a.add(bVar);
        }
        c cVar = this.f2886d;
        synchronized (tVar) {
            if (!(tVar.f8327d == null || tVar.f8327d.f8322b == null)) {
                cVar.a(tVar.f8327d.f8322b);
            }
            tVar.f8325b.add(cVar);
        }
        this.f2900t = tVar;
    }

    public final void b() {
        t<f> tVar = this.f2900t;
        if (tVar != null) {
            b bVar = this.f2885c;
            synchronized (tVar) {
                tVar.f8324a.remove(bVar);
            }
            t<f> tVar2 = this.f2900t;
            c cVar = this.f2886d;
            synchronized (tVar2) {
                tVar2.f8325b.remove(cVar);
            }
        }
    }

    public final void buildDrawingCache(boolean z8) {
        this.f2899s++;
        super.buildDrawingCache(z8);
        if (this.f2899s == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z8) == null) {
            setRenderMode(v.f8333g);
        }
        this.f2899s--;
        j.s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((r0 == null || r0.f8232o <= 4) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            y1.v r0 = r4.f2898q
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r2) goto L_0x0020
        L_0x000c:
            r1 = r2
            goto L_0x0020
        L_0x000e:
            y1.f r0 = r4.f2901u
            if (r0 == 0) goto L_0x0014
            boolean r3 = r0.f8231n
        L_0x0014:
            if (r0 == 0) goto L_0x001d
            int r0 = r0.f8232o
            r3 = 4
            if (r0 <= r3) goto L_0x001d
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            if (r0 == 0) goto L_0x000c
        L_0x0020:
            int r0 = r4.getLayerType()
            if (r1 == r0) goto L_0x002a
            r0 = 0
            r4.setLayerType(r1, r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d():void");
    }

    public final void e() {
        if (isShown()) {
            this.f2888g.f();
            d();
            return;
        }
        this.f2892k = true;
    }

    public f getComposition() {
        return this.f2901u;
    }

    public long getDuration() {
        f fVar = this.f2901u;
        if (fVar != null) {
            return (long) fVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f2888g.f8252c.f5110k;
    }

    public String getImageAssetsFolder() {
        return this.f2888g.f8258j;
    }

    public float getMaxFrame() {
        return this.f2888g.f8252c.b();
    }

    public float getMinFrame() {
        return this.f2888g.f8252c.c();
    }

    public u getPerformanceTracker() {
        f fVar = this.f2888g.f8251b;
        if (fVar != null) {
            return fVar.f8219a;
        }
        return null;
    }

    public float getProgress() {
        k2.d dVar = this.f2888g.f8252c;
        f fVar = dVar.f5114o;
        if (fVar == null) {
            return 0.0f;
        }
        float f9 = dVar.f5110k;
        float f10 = fVar.f8228k;
        return (f9 - f10) / (fVar.f8229l - f10);
    }

    public int getRepeatCount() {
        return this.f2888g.f8252c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f2888g.f8252c.getRepeatMode();
    }

    public float getScale() {
        return this.f2888g.f8253d;
    }

    public float getSpeed() {
        return this.f2888g.f8252c.f5107h;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        l lVar = this.f2888g;
        if (drawable2 == lVar) {
            super.invalidateDrawable(lVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.f2896o || this.f2894m) {
            e();
            this.f2896o = false;
            this.f2894m = false;
        }
    }

    public final void onDetachedFromWindow() {
        l lVar = this.f2888g;
        k2.d dVar = lVar.f8252c;
        if (dVar == null ? false : dVar.f5115p) {
            this.f2894m = false;
            this.f2893l = false;
            this.f2892k = false;
            lVar.f8256h.clear();
            lVar.f8252c.cancel();
            d();
            this.f2894m = true;
        }
        super.onDetachedFromWindow();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.f2904f;
        this.f2890i = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f2890i);
        }
        int i8 = dVar.f2905g;
        this.f2891j = i8;
        if (i8 != 0) {
            setAnimation(i8);
        }
        setProgress(dVar.f2906h);
        if (dVar.f2907i) {
            e();
        }
        this.f2888g.f8258j = dVar.f2908j;
        setRepeatMode(dVar.f2909k);
        setRepeatCount(dVar.f2910l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r6.f2894m != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$d r1 = new com.airbnb.lottie.LottieAnimationView$d
            r1.<init>((android.os.Parcelable) r0)
            java.lang.String r0 = r6.f2890i
            r1.f2904f = r0
            int r0 = r6.f2891j
            r1.f2905g = r0
            y1.l r0 = r6.f2888g
            k2.d r2 = r0.f8252c
            y1.f r3 = r2.f5114o
            if (r3 != 0) goto L_0x001b
            r3 = 0
            goto L_0x0025
        L_0x001b:
            float r4 = r2.f5110k
            float r5 = r3.f8228k
            float r4 = r4 - r5
            float r3 = r3.f8229l
            float r3 = r3 - r5
            float r3 = r4 / r3
        L_0x0025:
            r1.f2906h = r3
            r3 = 0
            if (r2 != 0) goto L_0x002c
            r2 = r3
            goto L_0x002e
        L_0x002c:
            boolean r2 = r2.f5115p
        L_0x002e:
            if (r2 != 0) goto L_0x003c
            int[] r2 = j0.x.f4957a
            boolean r2 = j0.x.f.b(r6)
            if (r2 != 0) goto L_0x003d
            boolean r6 = r6.f2894m
            if (r6 == 0) goto L_0x003d
        L_0x003c:
            r3 = 1
        L_0x003d:
            r1.f2907i = r3
            java.lang.String r6 = r0.f8258j
            r1.f2908j = r6
            k2.d r6 = r0.f8252c
            int r0 = r6.getRepeatMode()
            r1.f2909k = r0
            int r6 = r6.getRepeatCount()
            r1.f2910l = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onVisibilityChanged(View view, int i8) {
        if (this.f2889h) {
            boolean isShown = isShown();
            l lVar = this.f2888g;
            if (isShown) {
                if (this.f2893l) {
                    if (isShown()) {
                        lVar.g();
                        d();
                    } else {
                        this.f2892k = false;
                        this.f2893l = true;
                    }
                } else if (this.f2892k) {
                    e();
                }
                this.f2893l = false;
                this.f2892k = false;
                return;
            }
            k2.d dVar = lVar.f8252c;
            if (dVar == null ? false : dVar.f5115p) {
                this.f2896o = false;
                this.f2894m = false;
                this.f2893l = false;
                this.f2892k = false;
                lVar.f8256h.clear();
                lVar.f8252c.e(true);
                d();
                this.f2893l = true;
            }
        }
    }

    public void setAnimation(int i8) {
        t<f> tVar;
        t<f> tVar2;
        this.f2891j = i8;
        this.f2890i = null;
        if (isInEditMode()) {
            tVar = new t<>(new y1.d(this, i8), true);
        } else {
            boolean z8 = this.f2897p;
            Context context = getContext();
            if (z8) {
                String h8 = y1.g.h(context, i8);
                tVar2 = y1.g.a(h8, new y1.j(new WeakReference(context), context.getApplicationContext(), i8, h8));
            } else {
                HashMap hashMap = y1.g.f8233a;
                tVar2 = y1.g.a((String) null, new y1.j(new WeakReference(context), context.getApplicationContext(), i8, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(y1.g.a((String) null, new k(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        t<f> tVar;
        if (this.f2897p) {
            Context context = getContext();
            HashMap hashMap = y1.g.f8233a;
            String str2 = "url_" + str;
            tVar = y1.g.a(str2, new h(context, str, str2));
        } else {
            tVar = y1.g.a((String) null, new h(getContext(), str, (String) null));
        }
        setCompositionTask(tVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f2888g.f8265q = z8;
    }

    public void setCacheComposition(boolean z8) {
        this.f2897p = z8;
    }

    public void setComposition(f fVar) {
        float f9;
        float f10;
        l lVar = this.f2888g;
        lVar.setCallback(this);
        this.f2901u = fVar;
        boolean z8 = true;
        this.f2895n = true;
        boolean z9 = false;
        if (lVar.f8251b == fVar) {
            z8 = false;
        } else {
            lVar.f8266s = false;
            lVar.d();
            lVar.f8251b = fVar;
            lVar.c();
            k2.d dVar = lVar.f8252c;
            boolean z10 = dVar.f5114o == null;
            dVar.f5114o = fVar;
            if (z10) {
                f10 = (float) ((int) Math.max(dVar.f5112m, fVar.f8228k));
                f9 = Math.min(dVar.f5113n, fVar.f8229l);
            } else {
                f10 = (float) ((int) fVar.f8228k);
                f9 = fVar.f8229l;
            }
            dVar.g(f10, (float) ((int) f9));
            float f11 = dVar.f5110k;
            dVar.f5110k = 0.0f;
            dVar.f((float) ((int) f11));
            dVar.a();
            lVar.p(dVar.getAnimatedFraction());
            lVar.f8253d = lVar.f8253d;
            ArrayList<l.n> arrayList = lVar.f8256h;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                l.n nVar = (l.n) it.next();
                if (nVar != null) {
                    nVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            fVar.f8219a.f8329a = lVar.f8263o;
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(lVar);
            }
        }
        this.f2895n = false;
        d();
        if (getDrawable() != lVar || z8) {
            if (!z8) {
                k2.d dVar2 = lVar.f8252c;
                if (dVar2 != null) {
                    z9 = dVar2.f5115p;
                }
                setImageDrawable((Drawable) null);
                setImageDrawable(lVar);
                if (z9) {
                    lVar.g();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.r.iterator();
            while (it2.hasNext()) {
                ((p) it2.next()).a();
            }
        }
    }

    public void setFailureListener(o<Throwable> oVar) {
        this.e = oVar;
    }

    public void setFallbackResource(int i8) {
        this.f2887f = i8;
    }

    public void setFontAssetDelegate(y1.a aVar) {
        c2.a aVar2 = this.f2888g.f8259k;
    }

    public void setFrame(int i8) {
        this.f2888g.h(i8);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f2888g.f8254f = z8;
    }

    public void setImageAssetDelegate(y1.b bVar) {
        c2.b bVar2 = this.f2888g.f8257i;
    }

    public void setImageAssetsFolder(String str) {
        this.f2888g.f8258j = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        b();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        b();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i8) {
        b();
        super.setImageResource(i8);
    }

    public void setMaxFrame(int i8) {
        this.f2888g.i(i8);
    }

    public void setMaxFrame(String str) {
        this.f2888g.j(str);
    }

    public void setMaxProgress(float f9) {
        this.f2888g.k(f9);
    }

    public void setMinAndMaxFrame(String str) {
        this.f2888g.l(str);
    }

    public void setMinFrame(int i8) {
        this.f2888g.m(i8);
    }

    public void setMinFrame(String str) {
        this.f2888g.n(str);
    }

    public void setMinProgress(float f9) {
        this.f2888g.o(f9);
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        l lVar = this.f2888g;
        if (lVar.f8264p != z8) {
            lVar.f8264p = z8;
            g2.c cVar = lVar.f8261m;
            if (cVar != null) {
                cVar.p(z8);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        l lVar = this.f2888g;
        lVar.f8263o = z8;
        f fVar = lVar.f8251b;
        if (fVar != null) {
            fVar.f8219a.f8329a = z8;
        }
    }

    public void setProgress(float f9) {
        this.f2888g.p(f9);
    }

    public void setRenderMode(v vVar) {
        this.f2898q = vVar;
        d();
    }

    public void setRepeatCount(int i8) {
        this.f2888g.f8252c.setRepeatCount(i8);
    }

    public void setRepeatMode(int i8) {
        this.f2888g.f8252c.setRepeatMode(i8);
    }

    public void setSafeMode(boolean z8) {
        this.f2888g.f8255g = z8;
    }

    public void setScale(float f9) {
        l lVar = this.f2888g;
        lVar.f8253d = f9;
        if (getDrawable() == lVar) {
            k2.d dVar = lVar.f8252c;
            boolean z8 = dVar == null ? false : dVar.f5115p;
            setImageDrawable((Drawable) null);
            setImageDrawable(lVar);
            if (z8) {
                lVar.g();
            }
        }
    }

    public void setSpeed(float f9) {
        this.f2888g.f8252c.f5107h = f9;
    }

    public void setTextDelegate(x xVar) {
        this.f2888g.getClass();
    }

    public final void unscheduleDrawable(Drawable drawable) {
        l lVar;
        boolean z8 = this.f2895n;
        boolean z9 = false;
        if (!z8 && drawable == (lVar = this.f2888g)) {
            k2.d dVar = lVar.f8252c;
            if (dVar == null ? false : dVar.f5115p) {
                this.f2896o = false;
                this.f2894m = false;
                this.f2893l = false;
                this.f2892k = false;
                lVar.f8256h.clear();
                lVar.f8252c.e(true);
                d();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z8 && (drawable instanceof l)) {
            l lVar2 = (l) drawable;
            k2.d dVar2 = lVar2.f8252c;
            if (dVar2 != null) {
                z9 = dVar2.f5115p;
            }
            if (z9) {
                lVar2.f8256h.clear();
                lVar2.f8252c.e(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimation(String str) {
        t<f> tVar;
        t<f> tVar2;
        this.f2890i = str;
        this.f2891j = 0;
        if (isInEditMode()) {
            tVar = new t<>(new y1.e(this, str), true);
        } else {
            boolean z8 = this.f2897p;
            Context context = getContext();
            if (z8) {
                HashMap hashMap = y1.g.f8233a;
                String str2 = "asset_" + str;
                tVar2 = y1.g.a(str2, new i(context.getApplicationContext(), str, str2));
            } else {
                HashMap hashMap2 = y1.g.f8233a;
                tVar2 = y1.g.a((String) null, new i(context.getApplicationContext(), str, (String) null));
            }
            tVar = tVar2;
        }
        setCompositionTask(tVar);
    }
}
