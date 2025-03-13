package q7;

import i7.o;
import java.util.NoSuchElementException;

public final class b extends o {

    /* renamed from: f  reason: collision with root package name */
    public final int[] f6624f;

    /* renamed from: g  reason: collision with root package name */
    public int f6625g;

    public b(int[] iArr) {
        this.f6624f = iArr;
    }

    public final boolean hasNext() {
        return this.f6625g < this.f6624f.length;
    }

    public final int nextInt() {
        try {
            int[] iArr = this.f6624f;
            int i8 = this.f6625g;
            this.f6625g = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6625g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
