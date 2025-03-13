package m3;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = s3.b.i(r21)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r4
        L_0x001a:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x0087
            int r2 = r21.readInt()
            char r4 = (char) r2
            switch(r4) {
                case 1: goto L_0x0082;
                case 2: goto L_0x007d;
                case 3: goto L_0x0078;
                case 4: goto L_0x0073;
                case 5: goto L_0x006e;
                case 6: goto L_0x0064;
                case 7: goto L_0x005f;
                case 8: goto L_0x0055;
                case 9: goto L_0x0050;
                case 10: goto L_0x0036;
                case 11: goto L_0x0031;
                case 12: goto L_0x002c;
                default: goto L_0x0028;
            }
        L_0x0028:
            s3.b.h(r0, r2)
            goto L_0x001a
        L_0x002c:
            java.lang.String r19 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0031:
            java.lang.String r18 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            int r2 = s3.b.g(r0, r2)
            int r5 = r21.dataPosition()
            if (r2 != 0) goto L_0x0045
            r17 = r3
            goto L_0x001a
        L_0x0045:
            java.util.ArrayList r4 = r0.createTypedArrayList(r4)
            int r5 = r5 + r2
            r0.setDataPosition(r5)
            r17 = r4
            goto L_0x001a
        L_0x0050:
            java.lang.String r16 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0055:
            r4 = 8
            s3.b.j(r0, r2, r4)
            long r14 = r21.readLong()
            goto L_0x001a
        L_0x005f:
            java.lang.String r13 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0064:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = s3.b.a(r0, r2, r4)
            r12 = r2
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x001a
        L_0x006e:
            java.lang.String r11 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0073:
            java.lang.String r10 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0078:
            java.lang.String r9 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x007d:
            java.lang.String r8 = s3.b.b(r0, r2)
            goto L_0x001a
        L_0x0082:
            int r7 = s3.b.f(r0, r2)
            goto L_0x001a
        L_0x0087:
            s3.b.d(r0, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new GoogleSignInAccount[i8];
    }
}
