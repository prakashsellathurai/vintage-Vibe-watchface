package androidx.recyclerview.widget;

import android.view.View;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f1789a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1790b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1791a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1792b;

        /* renamed from: c  reason: collision with root package name */
        public int f1793c;

        /* renamed from: d  reason: collision with root package name */
        public int f1794d;
        public int e;

        public final boolean a() {
            int i8 = this.f1791a;
            int i9 = 2;
            if ((i8 & 7) != 0) {
                int i10 = this.f1794d;
                int i11 = this.f1792b;
                if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 0) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 112) != 0) {
                int i12 = this.f1794d;
                int i13 = this.f1793c;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 4) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 1792) != 0) {
                int i14 = this.e;
                int i15 = this.f1792b;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 8) & i8) == 0) {
                    return false;
                }
            }
            if ((i8 & 28672) != 0) {
                int i16 = this.e;
                int i17 = this.f1793c;
                if (i16 > i17) {
                    i9 = 1;
                } else if (i16 != i17) {
                    i9 = 4;
                }
                if (((i9 << 12) & i8) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a();

        int b(View view);

        View c(int i8);

        int d();

        int e(View view);
    }

    public c0(b bVar) {
        this.f1789a = bVar;
    }

    public final View a(int i8, int i9, int i10, int i11) {
        b bVar = this.f1789a;
        int d9 = bVar.d();
        int a9 = bVar.a();
        int i12 = i9 > i8 ? 1 : -1;
        View view = null;
        while (i8 != i9) {
            View c9 = bVar.c(i8);
            int b9 = bVar.b(c9);
            int e = bVar.e(c9);
            a aVar = this.f1790b;
            aVar.f1792b = d9;
            aVar.f1793c = a9;
            aVar.f1794d = b9;
            aVar.e = e;
            if (i10 != 0) {
                aVar.f1791a = i10 | 0;
                if (aVar.a()) {
                    return c9;
                }
            }
            if (i11 != 0) {
                aVar.f1791a = i11 | 0;
                if (aVar.a()) {
                    view = c9;
                }
            }
            i8 += i12;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f1789a;
        int d9 = bVar.d();
        int a9 = bVar.a();
        int b9 = bVar.b(view);
        int e = bVar.e(view);
        a aVar = this.f1790b;
        aVar.f1792b = d9;
        aVar.f1793c = a9;
        aVar.f1794d = b9;
        aVar.e = e;
        aVar.f1791a = 24579 | 0;
        return aVar.a();
    }
}
