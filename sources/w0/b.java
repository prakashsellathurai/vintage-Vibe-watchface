package w0;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.io.PrintWriter;
import p.g;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final r f7970a;

    /* renamed from: b  reason: collision with root package name */
    public final C0150b f7971b;

    public static class a<D> extends y<D> {
        public final void f() {
            throw null;
        }

        public final void g() {
            throw null;
        }

        public final void h(z<? super D> zVar) {
            super.h(zVar);
        }

        public final void i(D d9) {
            super.i(d9);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            a1.a.h((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: w0.b$b  reason: collision with other inner class name */
    public static class C0150b extends j0 {
        public static final a e = new a();

        /* renamed from: d  reason: collision with root package name */
        public final g<a> f7972d = new g<>();

        /* renamed from: w0.b$b$a */
        public static class a implements l0.b {
            public final <T extends j0> T a(Class<T> cls) {
                return new C0150b();
            }
        }

        public final void b() {
            g<a> gVar = this.f7972d;
            int i8 = gVar.f6239h;
            if (i8 <= 0) {
                Object[] objArr = gVar.f6238g;
                for (int i9 = 0; i9 < i8; i9++) {
                    objArr[i9] = null;
                }
                gVar.f6239h = 0;
                return;
            }
            ((a) gVar.f6238g[0]).getClass();
            throw null;
        }
    }

    public b(r rVar, n0 n0Var) {
        this.f7970a = rVar;
        this.f7971b = (C0150b) new l0(n0Var, C0150b.e).a(C0150b.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        g<a> gVar = this.f7971b.f7972d;
        if (gVar.f6239h > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (gVar.f6239h > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(gVar.f6237f[0]);
                printWriter.print(": ");
                printWriter.println(((a) gVar.f6238g[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a1.a.h(this.f7970a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
