package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import s2.b;
import y2.o;

public final class j implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final o f2997a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f2998a;

        public a(b bVar) {
            this.f2998a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new j((InputStream) obj, this.f2998a);
        }
    }

    public j(InputStream inputStream, b bVar) {
        o oVar = new o(inputStream, bVar);
        this.f2997a = oVar;
        oVar.mark(5242880);
    }

    public final Object a() {
        o oVar = this.f2997a;
        oVar.reset();
        return oVar;
    }

    public final void b() {
        this.f2997a.c();
    }
}
