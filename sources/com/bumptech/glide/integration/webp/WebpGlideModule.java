package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import e3.c;
import f3.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o2.a;
import o2.d;
import o2.e;
import o2.f;
import o2.j;
import y7.b0;

@Deprecated
public class WebpGlideModule implements c {
    public final void a() {
    }

    public final void b(Context context, b bVar, i iVar) {
        Resources resources = context.getResources();
        s2.c cVar = bVar.f2913a;
        s2.b bVar2 = bVar.e;
        o2.i iVar2 = new o2.i(iVar.d(), resources.getDisplayMetrics(), cVar, bVar2);
        a aVar = new a(bVar2, cVar);
        o2.c cVar2 = new o2.c(0, iVar2);
        e eVar = new e(iVar2, 0, bVar2);
        d dVar = new d(context, bVar2, cVar);
        iVar.f(cVar2, ByteBuffer.class, Bitmap.class, "Bitmap");
        iVar.f(eVar, InputStream.class, Bitmap.class, "Bitmap");
        iVar.f(new e(resources, cVar2), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        iVar.f(new e(resources, eVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        iVar.f(new o2.b(aVar, 0), ByteBuffer.class, Bitmap.class, "Bitmap");
        iVar.f(new o2.b(aVar, 1), InputStream.class, Bitmap.class, "Bitmap");
        iVar.f(dVar, ByteBuffer.class, j.class, "legacy_prepend_all");
        iVar.f(new f(dVar, bVar2), InputStream.class, j.class, "legacy_prepend_all");
        Class<j> cls = j.class;
        b0 b0Var = new b0(3);
        f3.d dVar2 = iVar.f2939d;
        synchronized (dVar2) {
            dVar2.f4388a.add(0, new d.a(cls, b0Var));
        }
    }
}
