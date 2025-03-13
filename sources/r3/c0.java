package r3;

import android.os.Parcelable;

public final class c0 implements Parcelable.Creator<b0> {
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.Parcelable] */
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
            r7 = r6
            r4 = r1
            r5 = r4
        L_0x000b:
            int r0 = r10.dataPosition()
            if (r0 >= r9) goto L_0x0057
            int r0 = r10.readInt()
            char r2 = (char) r0
            r8 = 1
            if (r2 == r8) goto L_0x0052
            r8 = 2
            if (r2 == r8) goto L_0x003d
            r8 = 3
            if (r2 == r8) goto L_0x0033
            r8 = 4
            if (r2 == r8) goto L_0x002e
            r8 = 5
            if (r2 == r8) goto L_0x0029
            s3.b.h(r10, r0)
            goto L_0x000b
        L_0x0029:
            boolean r7 = s3.b.e(r10, r0)
            goto L_0x000b
        L_0x002e:
            boolean r6 = s3.b.e(r10, r0)
            goto L_0x000b
        L_0x0033:
            android.os.Parcelable$Creator<o3.a> r2 = o3.a.CREATOR
            android.os.Parcelable r0 = s3.b.a(r10, r0, r2)
            r5 = r0
            o3.a r5 = (o3.a) r5
            goto L_0x000b
        L_0x003d:
            int r0 = s3.b.g(r10, r0)
            int r2 = r10.dataPosition()
            if (r0 != 0) goto L_0x0049
            r4 = r1
            goto L_0x000b
        L_0x0049:
            android.os.IBinder r4 = r10.readStrongBinder()
            int r2 = r2 + r0
            r10.setDataPosition(r2)
            goto L_0x000b
        L_0x0052:
            int r3 = s3.b.f(r10, r0)
            goto L_0x000b
        L_0x0057:
            s3.b.d(r10, r9)
            r3.b0 r9 = new r3.b0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.c0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new b0[i8];
    }
}
