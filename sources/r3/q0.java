package r3;

import android.os.Parcelable;

public final class q0 implements Parcelable.Creator<e> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r10.setDataPosition(r2 + r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r9 = s3.b.i(r10)
            r0 = 0
            r1 = 0
            r3 = r0
            r6 = r3
            r8 = r6
            r4 = r1
            r5 = r4
            r7 = r5
        L_0x000c:
            int r1 = r10.dataPosition()
            if (r1 >= r9) goto L_0x005d
            int r1 = r10.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004e;
                case 3: goto L_0x0049;
                case 4: goto L_0x0038;
                case 5: goto L_0x0033;
                case 6: goto L_0x001e;
                default: goto L_0x001a;
            }
        L_0x001a:
            s3.b.h(r10, r1)
            goto L_0x000c
        L_0x001e:
            int r1 = s3.b.g(r10, r1)
            int r2 = r10.dataPosition()
            if (r1 != 0) goto L_0x002a
            r8 = r0
            goto L_0x000c
        L_0x002a:
            int[] r8 = r10.createIntArray()
        L_0x002e:
            int r2 = r2 + r1
            r10.setDataPosition(r2)
            goto L_0x000c
        L_0x0033:
            int r7 = s3.b.f(r10, r1)
            goto L_0x000c
        L_0x0038:
            int r1 = s3.b.g(r10, r1)
            int r2 = r10.dataPosition()
            if (r1 != 0) goto L_0x0044
            r6 = r0
            goto L_0x000c
        L_0x0044:
            int[] r6 = r10.createIntArray()
            goto L_0x002e
        L_0x0049:
            boolean r5 = s3.b.e(r10, r1)
            goto L_0x000c
        L_0x004e:
            boolean r4 = s3.b.e(r10, r1)
            goto L_0x000c
        L_0x0053:
            android.os.Parcelable$Creator<r3.n> r2 = r3.n.CREATOR
            android.os.Parcelable r1 = s3.b.a(r10, r1, r2)
            r3 = r1
            r3.n r3 = (r3.n) r3
            goto L_0x000c
        L_0x005d:
            s3.b.d(r10, r9)
            r3.e r9 = new r3.e
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.q0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new e[i8];
    }
}
