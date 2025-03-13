package androidx.lifecycle;

import android.annotation.SuppressLint;
import c8.m;
import d8.c;
import j7.d;
import j7.f;
import k3.j;
import l7.e;
import l7.h;
import p7.p;
import q7.k;
import y7.l0;
import y7.z;

public final class w<T> implements v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f1512a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1513b;

    @e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1514j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ w<T> f1515k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ T f1516l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w<T> wVar, T t8, d<? super a> dVar) {
            super(2, dVar);
            this.f1515k = wVar;
            this.f1516l = t8;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f1515k, this.f1516l, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f1514j;
            w<T> wVar = this.f1515k;
            if (i8 == 0) {
                a1.a.I(obj);
                g<T> gVar = wVar.f1512a;
                this.f1514j = 1;
                if (gVar.k(this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar.f1512a.i(this.f1516l);
            return h7.h.f4787a;
        }
    }

    public w(g<T> gVar, f fVar) {
        k.e(gVar, "target");
        k.e(fVar, "context");
        this.f1512a = gVar;
        c cVar = l0.f8580a;
        this.f1513b = fVar.t(m.f2865a.P());
    }

    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object emit(T t8, d<? super h7.h> dVar) {
        Object i02 = j.i0(this.f1513b, new a(this, t8, (d<? super a>) null), dVar);
        return i02 == k7.a.f5217f ? i02 : h7.h.f4787a;
    }
}
