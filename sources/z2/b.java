package z2;

import java.io.File;
import k3.j;
import r2.v;

public final class b implements v {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8686f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8687g;

    public b(File file) {
        j.l(file);
        this.f8687g = file;
    }

    public final int b() {
        switch (this.f8686f) {
            case 0:
                return ((byte[]) this.f8687g).length;
            default:
                return 1;
        }
    }

    public final Class c() {
        switch (this.f8686f) {
            case 0:
                return byte[].class;
            default:
                return this.f8687g.getClass();
        }
    }

    public final void d() {
    }

    public final Object get() {
        int i8 = this.f8686f;
        Object obj = this.f8687g;
        switch (i8) {
            case 0:
                return (byte[]) obj;
            default:
                return obj;
        }
    }

    public b(byte[] bArr) {
        j.l(bArr);
        this.f8687g = bArr;
    }
}
