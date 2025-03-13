package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.i0;
import b3.g;
import com.bumptech.glide.g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import d3.j;
import f3.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.i;
import r2.m;
import s2.c;
import t2.h;
import t2.i;
import u2.a;
import v2.a;
import v2.b;
import v2.c;
import v2.d;
import v2.e;
import v2.j;
import v2.s;
import v2.t;
import v2.u;
import v2.v;
import v2.w;
import w2.a;
import w2.b;
import w2.c;
import w2.d;
import w2.e;
import y2.d;
import y2.e;
import y2.f;
import y2.k;
import y2.n;
import y2.p;
import y2.r;
import y2.s;
import y7.b0;
import z2.a;

public final class b implements ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile b f2911i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f2912j;

    /* renamed from: a  reason: collision with root package name */
    public final c f2913a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2914b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2915c;

    /* renamed from: d  reason: collision with root package name */
    public final i f2916d;
    public final s2.b e;

    /* renamed from: f  reason: collision with root package name */
    public final j f2917f;

    /* renamed from: g  reason: collision with root package name */
    public final d3.c f2918g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2919h = new ArrayList();

    public interface a {
    }

    public b(Context context, m mVar, h hVar, c cVar, s2.b bVar, j jVar, d3.c cVar2, int i8, c cVar3, Map map, List list, g gVar) {
        i iVar;
        i iVar2;
        s.c cVar4;
        a3.c cVar5;
        Context context2 = context;
        c cVar6 = cVar;
        s2.b bVar2 = bVar;
        this.f2913a = cVar6;
        this.e = bVar2;
        this.f2914b = hVar;
        this.f2917f = jVar;
        this.f2918g = cVar2;
        Resources resources = context.getResources();
        i iVar3 = new i();
        this.f2916d = iVar3;
        f fVar = new f();
        a2.b bVar3 = iVar3.f2941g;
        synchronized (bVar3) {
            bVar3.f66a.add(fVar);
        }
        k kVar = new k();
        a2.b bVar4 = iVar3.f2941g;
        synchronized (bVar4) {
            bVar4.f66a.add(kVar);
        }
        List<ImageHeaderParser> d9 = iVar3.d();
        b3.a aVar = new b3.a(context2, d9, cVar6, bVar2);
        y2.s sVar = new y2.s(cVar6, new s.g());
        y2.h hVar2 = new y2.h(iVar3.d(), resources.getDisplayMetrics(), cVar6, bVar2);
        if (gVar.f2929a.containsKey(d.class)) {
            iVar2 = new n();
            iVar = new e();
        } else {
            iVar = new d(hVar2, 0);
            iVar2 = new p(hVar2, bVar2);
        }
        a3.c cVar7 = new a3.c(context2);
        s.c cVar8 = new s.c(resources);
        s.d dVar = new s.d(resources);
        s.b bVar5 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        y2.a aVar3 = new y2.a(bVar2);
        s.a aVar4 = aVar2;
        c3.a aVar5 = new c3.a();
        s.d dVar2 = dVar;
        b0 b0Var = new b0(8);
        ContentResolver contentResolver = context.getContentResolver();
        b0 b0Var2 = new b0(6);
        Class<ByteBuffer> cls = ByteBuffer.class;
        s.b bVar6 = bVar5;
        f3.a aVar6 = iVar3.f2937b;
        synchronized (aVar6) {
            cVar4 = cVar8;
            cVar5 = cVar7;
            aVar6.f4377a.add(new a.C0055a(cls, b0Var2));
        }
        h2.d dVar3 = new h2.d(5, bVar2);
        Class<InputStream> cls2 = InputStream.class;
        f3.a aVar7 = iVar3.f2937b;
        synchronized (aVar7) {
            aVar7.f4377a.add(new a.C0055a(cls2, dVar3));
        }
        Class<Bitmap> cls3 = Bitmap.class;
        iVar3.c(iVar, cls, cls3, "Bitmap");
        iVar3.c(iVar2, cls2, cls3, "Bitmap");
        d dVar4 = new d(hVar2, 1);
        Class<ParcelFileDescriptor> cls4 = ParcelFileDescriptor.class;
        iVar3.c(dVar4, cls4, cls3, "Bitmap");
        iVar3.c(sVar, cls4, cls3, "Bitmap");
        Class<AssetFileDescriptor> cls5 = AssetFileDescriptor.class;
        iVar3.c(new y2.s(cVar6, new s.c()), cls5, cls3, "Bitmap");
        u.a<?> aVar8 = u.a.f7916a;
        iVar3.a(cls3, cls3, aVar8);
        Class<AssetFileDescriptor> cls6 = cls5;
        iVar3.c(new r(), cls3, cls3, "Bitmap");
        iVar3.b(cls3, aVar3);
        o2.e eVar = new o2.e(resources, iVar);
        Class<BitmapDrawable> cls7 = BitmapDrawable.class;
        Class<Bitmap> cls8 = cls3;
        iVar3.c(eVar, cls, cls7, "BitmapDrawable");
        iVar3.c(new o2.e(resources, iVar2), cls2, cls7, "BitmapDrawable");
        iVar3.c(new o2.e(resources, sVar), cls4, cls7, "BitmapDrawable");
        iVar3.b(cls7, new androidx.appcompat.widget.p(cVar6, aVar3));
        s2.b bVar7 = bVar;
        Class<b3.c> cls9 = b3.c.class;
        iVar3.c(new g(d9, aVar, bVar7), cls2, cls9, "Gif");
        iVar3.c(aVar, cls, cls9, "Gif");
        iVar3.b(cls9, new b0(7));
        Class<n2.a> cls10 = n2.a.class;
        iVar3.a(cls10, cls10, aVar8);
        Class<Bitmap> cls11 = cls8;
        iVar3.c(new o2.c(1, cVar6), cls10, cls11, "Bitmap");
        Class<Uri> cls12 = Uri.class;
        Class<Drawable> cls13 = Drawable.class;
        a3.c cVar9 = cVar5;
        iVar3.c(cVar9, cls12, cls13, "legacy_append");
        Class<b3.c> cls14 = cls9;
        iVar3.c(new o2.e(cVar9, 2, cVar6), cls12, cls11, "legacy_append");
        iVar3.g(new a.C0159a());
        Class<File> cls15 = File.class;
        iVar3.a(cls15, cls, new c.b());
        iVar3.a(cls15, cls2, new e.C0147e());
        iVar3.c(new a3.d(1), cls15, cls15, "legacy_append");
        iVar3.a(cls15, cls4, new e.b());
        iVar3.a(cls15, cls15, aVar8);
        iVar3.g(new j.a(bVar7));
        iVar3.g(new ParcelFileDescriptorRewinder.a());
        Class cls16 = Integer.TYPE;
        s.c cVar10 = cVar4;
        iVar3.a(cls16, cls2, cVar10);
        s.b bVar8 = bVar6;
        iVar3.a(cls16, cls4, bVar8);
        Class<Integer> cls17 = Integer.class;
        iVar3.a(cls17, cls2, cVar10);
        iVar3.a(cls17, cls4, bVar8);
        s.d dVar5 = dVar2;
        iVar3.a(cls17, cls12, dVar5);
        s.a aVar9 = aVar4;
        Class<AssetFileDescriptor> cls18 = cls6;
        iVar3.a(cls16, cls18, aVar9);
        iVar3.a(cls17, cls18, aVar9);
        iVar3.a(cls16, cls12, dVar5);
        Class<String> cls19 = String.class;
        iVar3.a(cls19, cls2, new d.c());
        iVar3.a(cls12, cls2, new d.c());
        iVar3.a(cls19, cls2, new t.c());
        iVar3.a(cls19, cls4, new t.b());
        iVar3.a(cls19, cls18, new t.a());
        iVar3.a(cls12, cls2, new a.c(context.getAssets()));
        iVar3.a(cls12, cls4, new a.b(context.getAssets()));
        Context context3 = context;
        iVar3.a(cls12, cls2, new b.a(context3));
        iVar3.a(cls12, cls2, new c.a(context3));
        iVar3.a(cls12, cls2, new d.c(context3));
        iVar3.a(cls12, cls4, new d.b(context3));
        ContentResolver contentResolver2 = contentResolver;
        iVar3.a(cls12, cls2, new v.d(contentResolver2));
        iVar3.a(cls12, cls4, new v.b(contentResolver2));
        iVar3.a(cls12, cls18, new v.a(contentResolver2));
        iVar3.a(cls12, cls2, new w.a());
        iVar3.a(URL.class, cls2, new e.a());
        iVar3.a(cls12, cls15, new j.a(context3));
        iVar3.a(v2.f.class, cls2, new a.C0151a());
        Class<byte[]> cls20 = byte[].class;
        iVar3.a(cls20, cls, new b.a());
        iVar3.a(cls20, cls2, new b.d());
        iVar3.a(cls12, cls12, aVar8);
        iVar3.a(cls13, cls13, aVar8);
        iVar3.c(new a3.d(0), cls13, cls13, "legacy_append");
        Class<Bitmap> cls21 = cls8;
        iVar3.h(cls21, cls7, new h2.d(resources));
        c3.a aVar10 = aVar5;
        iVar3.h(cls21, cls20, aVar10);
        s2.c cVar11 = cVar;
        b0 b0Var3 = b0Var;
        iVar3.h(cls13, cls20, new i0(cVar11, aVar10, b0Var3));
        iVar3.h(cls14, cls20, b0Var3);
        y2.s sVar2 = new y2.s(cVar11, new s.d());
        iVar3.c(sVar2, ByteBuffer.class, cls21, "legacy_append");
        iVar3.c(new o2.e(resources, sVar2), ByteBuffer.class, cls7, "legacy_append");
        this.f2915c = new f(context, bVar, iVar3, cVar3, map, list, mVar, gVar, i8);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        c cVar;
        s2.c cVar2;
        if (!f2912j) {
            f2912j = true;
            p.a aVar = new p.a();
            g.a aVar2 = new g.a();
            c cVar3 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            Log.isLoggable("ManifestParser", 3);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    Log.isLoggable("ManifestParser", 3);
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(e3.e.a(next));
                            Log.isLoggable("ManifestParser", 3);
                        }
                    }
                    Log.isLoggable("ManifestParser", 3);
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c9 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e3.c cVar4 = (e3.c) it.next();
                        if (c9.contains(cVar4.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                cVar4.toString();
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((e3.c) it2.next()).getClass().toString();
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((e3.c) it3.next()).a();
                }
                if (u2.a.f7724h == 0) {
                    u2.a.f7724h = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i8 = u2.a.f7724h;
                if (!TextUtils.isEmpty("source")) {
                    u2.a aVar3 = new u2.a(new ThreadPoolExecutor(i8, i8, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0138a("source", false)));
                    int i9 = u2.a.f7724h;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        u2.a aVar4 = new u2.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0138a("disk-cache", true)));
                        if (u2.a.f7724h == 0) {
                            u2.a.f7724h = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        int i10 = u2.a.f7724h >= 4 ? 2 : 1;
                        if (!TextUtils.isEmpty("animation")) {
                            u2.a aVar5 = new u2.a(new ThreadPoolExecutor(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0138a("animation", true)));
                            t2.i iVar = new t2.i(new i.a(applicationContext));
                            d3.e eVar = new d3.e();
                            int i11 = iVar.f7478a;
                            if (i11 > 0) {
                                cVar = cVar3;
                                cVar2 = new s2.h((long) i11);
                            } else {
                                cVar = cVar3;
                                cVar2 = new s2.d();
                            }
                            s2.g gVar = new s2.g(iVar.f7480c);
                            t2.g gVar2 = new t2.g((long) iVar.f7479b);
                            b bVar = new b(applicationContext, new m(gVar2, new t2.f(applicationContext), aVar4, aVar3, new u2.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, u2.a.f7723g, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0138a("source-unlimited", false))), aVar5), gVar2, cVar2, gVar, new d3.j((j.b) null), eVar, 4, cVar, aVar, Collections.emptyList(), new g(aVar2));
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                e3.c cVar5 = (e3.c) it4.next();
                                try {
                                    cVar5.b(applicationContext, bVar, bVar.f2916d);
                                } catch (AbstractMethodError e4) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar5.getClass().getName()), e4);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar);
                            f2911i = bVar;
                            f2912j = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e9) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e9);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2911i == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            }
            synchronized (b.class) {
                if (f2911i == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f2911i;
    }

    public static k d(Context context) {
        if (context != null) {
            return b(context).f2917f.b(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void c(k kVar) {
        synchronized (this.f2919h) {
            if (this.f2919h.contains(kVar)) {
                this.f2919h.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        char[] cArr = k3.k.f5169a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((k3.g) this.f2914b).e(0);
            this.f2913a.b();
            this.e.b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public final void onTrimMemory(int i8) {
        long j8;
        char[] cArr = k3.k.f5169a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            synchronized (this.f2919h) {
                Iterator it = this.f2919h.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).getClass();
                }
            }
            t2.g gVar = (t2.g) this.f2914b;
            gVar.getClass();
            if (i8 >= 40) {
                gVar.e(0);
            } else if (i8 >= 20 || i8 == 15) {
                synchronized (gVar) {
                    j8 = gVar.f5139b;
                }
                gVar.e(j8 / 2);
            }
            this.f2913a.a(i8);
            this.e.a(i8);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}
