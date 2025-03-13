package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import d4.b;
import d4.d;
import d4.h;
import i0.c;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p.a;
import p2.g;
import p2.j;
import q3.k;
import r2.v;

public final class p implements j, b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f784a;

    /* renamed from: b  reason: collision with root package name */
    public Object f785b;

    /* renamed from: c  reason: collision with root package name */
    public Object f786c;

    public p(int i8) {
        this.f784a = i8;
        if (i8 == 3) {
            this.f785b = new HashMap();
            this.f786c = new HashMap();
        } else if (i8 == 5) {
            this.f785b = new AtomicReference();
            this.f786c = new a();
        }
    }

    public final void a(h hVar) {
        ((k) this.f786c).f6569b.remove((d) this.f785b);
    }

    public final boolean equals(Object obj) {
        switch (this.f784a) {
            case 2:
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                if (!(this.f785b == null)) {
                    return false;
                }
                return this.f786c == null;
            default:
                return super.equals(obj);
        }
    }

    public final boolean f(Object obj, File file, g gVar) {
        return ((j) this.f786c).f(new y2.c(((BitmapDrawable) ((v) obj).get()).getBitmap(), (s2.c) this.f785b), file, gVar);
    }

    public final p2.c h(g gVar) {
        return ((j) this.f786c).h(gVar);
    }

    public final int hashCode() {
        switch (this.f784a) {
            case 2:
                Object obj = this.f785b;
                int i8 = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f786c;
                if (obj2 != null) {
                    i8 = obj2.hashCode();
                }
                return hashCode ^ i8;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f784a) {
            case 2:
                return "Pair{" + String.valueOf(this.f785b) + " " + String.valueOf(this.f786c) + "}";
            default:
                return super.toString();
        }
    }

    public p(Context context) {
        this.f784a = 7;
        this.f785b = new HashMap();
        this.f786c = context;
    }

    public p(Handler handler) {
        this.f784a = 1;
        this.f785b = handler;
    }

    public p(k kVar, d dVar) {
        this.f784a = 6;
        this.f786c = kVar;
        this.f785b = dVar;
    }

    public p(s2.c cVar, y2.a aVar) {
        this.f784a = 4;
        this.f785b = cVar;
        this.f786c = aVar;
    }
}
