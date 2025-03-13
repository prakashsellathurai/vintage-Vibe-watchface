package q7;

import i7.n;
import java.util.NoSuchElementException;

public final class a extends n {

    /* renamed from: f  reason: collision with root package name */
    public final float[] f6622f;

    /* renamed from: g  reason: collision with root package name */
    public int f6623g;

    public a(float[] fArr) {
        this.f6622f = fArr;
    }

    public final float a() {
        try {
            float[] fArr = this.f6622f;
            int i8 = this.f6623g;
            this.f6623g = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6623g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f6623g < this.f6622f.length;
    }
}
