package g0;

import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b9 = bArr[i8];
            byte b10 = bArr2[i8];
            if (b9 != b10) {
                return b9 - b10;
            }
        }
        return 0;
    }
}
