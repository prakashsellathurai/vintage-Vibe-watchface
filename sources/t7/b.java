package t7;

import i7.o;
import java.util.NoSuchElementException;

public final class b extends o {

    /* renamed from: f  reason: collision with root package name */
    public final int f7537f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7538g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7539h;

    /* renamed from: i  reason: collision with root package name */
    public int f7540i;

    public b(int i8, int i9, int i10) {
        this.f7537f = i10;
        this.f7538g = i9;
        boolean z8 = true;
        if (i10 <= 0 ? i8 < i9 : i8 > i9) {
            z8 = false;
        }
        this.f7539h = z8;
        this.f7540i = !z8 ? i9 : i8;
    }

    public final boolean hasNext() {
        return this.f7539h;
    }

    public final int nextInt() {
        int i8 = this.f7540i;
        if (i8 != this.f7538g) {
            this.f7540i = this.f7537f + i8;
        } else if (this.f7539h) {
            this.f7539h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i8;
    }
}
