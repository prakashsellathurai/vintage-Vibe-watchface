package s;

import i0.d;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7154a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7155b;

    /* renamed from: c  reason: collision with root package name */
    public int f7156c;

    public e(int i8, int i9) {
        this.f7154a = i9;
        if (i9 != 1) {
            if (i8 > 0) {
                this.f7155b = new Object[i8];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i8 > 0) {
            this.f7155b = new Object[i8];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public boolean a(Object obj) {
        int i8;
        boolean z8;
        int i9 = this.f7154a;
        Object[] objArr = this.f7155b;
        switch (i9) {
            case 0:
                int i10 = this.f7156c;
                if (i10 >= objArr.length) {
                    return false;
                }
                objArr[i10] = obj;
                this.f7156c = i10 + 1;
                return true;
            default:
                int i11 = 0;
                while (true) {
                    i8 = this.f7156c;
                    if (i11 >= i8) {
                        z8 = false;
                    } else if (objArr[i11] == obj) {
                        z8 = true;
                    } else {
                        i11++;
                    }
                }
                if (z8) {
                    throw new IllegalStateException("Already in the pool!");
                } else if (i8 >= objArr.length) {
                    return false;
                } else {
                    objArr[i8] = obj;
                    this.f7156c = i8 + 1;
                    return true;
                }
        }
    }

    public Object b() {
        int i8 = this.f7154a;
        Object[] objArr = this.f7155b;
        switch (i8) {
            case 0:
                int i9 = this.f7156c;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object obj = objArr[i10];
                objArr[i10] = null;
                this.f7156c = i10;
                return obj;
            default:
                int i11 = this.f7156c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj2 = objArr[i12];
                objArr[i12] = null;
                this.f7156c = i12;
                return obj2;
        }
    }
}
