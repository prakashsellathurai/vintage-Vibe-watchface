package r3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.c;

public final class r0 implements Parcelable.Creator<f> {
    public static void a(f fVar, Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, fVar.f6972f);
        c.b(parcel, 2, fVar.f6973g);
        c.b(parcel, 3, fVar.f6974h);
        c.d(parcel, 4, fVar.f6975i);
        IBinder iBinder = fVar.f6976j;
        if (iBinder != null) {
            int g10 = c.g(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            c.h(parcel, g10);
        }
        c.e(parcel, 6, fVar.f6977k, i8);
        Bundle bundle = fVar.f6978l;
        if (bundle != null) {
            int g11 = c.g(parcel, 7);
            parcel.writeBundle(bundle);
            c.h(parcel, g11);
        }
        c.c(parcel, 8, fVar.f6979m, i8);
        c.e(parcel, 10, fVar.f6980n, i8);
        c.e(parcel, 11, fVar.f6981o, i8);
        c.a(parcel, 12, fVar.f6982p);
        c.b(parcel, 13, fVar.f6983q);
        c.a(parcel, 14, fVar.r);
        c.d(parcel, 15, fVar.f6984s);
        c.h(parcel, g9);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            int r1 = s3.b.i(r20)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r15 = r7
            r16 = r15
            r17 = r16
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r18 = r14
        L_0x0019:
            int r2 = r20.dataPosition()
            if (r2 >= r1) goto L_0x00a8
            int r2 = r20.readInt()
            char r4 = (char) r2
            switch(r4) {
                case 1: goto L_0x00a2;
                case 2: goto L_0x009c;
                case 3: goto L_0x0096;
                case 4: goto L_0x0091;
                case 5: goto L_0x007c;
                case 6: goto L_0x0072;
                case 7: goto L_0x005d;
                case 8: goto L_0x0053;
                case 9: goto L_0x0027;
                case 10: goto L_0x0049;
                case 11: goto L_0x003f;
                case 12: goto L_0x003a;
                case 13: goto L_0x0035;
                case 14: goto L_0x0030;
                case 15: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            s3.b.h(r0, r2)
            goto L_0x0019
        L_0x002b:
            java.lang.String r18 = s3.b.b(r0, r2)
            goto L_0x0019
        L_0x0030:
            boolean r17 = s3.b.e(r0, r2)
            goto L_0x0019
        L_0x0035:
            int r16 = s3.b.f(r0, r2)
            goto L_0x0019
        L_0x003a:
            boolean r15 = s3.b.e(r0, r2)
            goto L_0x0019
        L_0x003f:
            android.os.Parcelable$Creator<o3.c> r4 = o3.c.CREATOR
            java.lang.Object[] r2 = s3.b.c(r0, r2, r4)
            r14 = r2
            o3.c[] r14 = (o3.c[]) r14
            goto L_0x0019
        L_0x0049:
            android.os.Parcelable$Creator<o3.c> r4 = o3.c.CREATOR
            java.lang.Object[] r2 = s3.b.c(r0, r2, r4)
            r13 = r2
            o3.c[] r13 = (o3.c[]) r13
            goto L_0x0019
        L_0x0053:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = s3.b.a(r0, r2, r4)
            r12 = r2
            android.accounts.Account r12 = (android.accounts.Account) r12
            goto L_0x0019
        L_0x005d:
            int r2 = s3.b.g(r0, r2)
            int r4 = r20.dataPosition()
            if (r2 != 0) goto L_0x0069
            r11 = r3
            goto L_0x0019
        L_0x0069:
            android.os.Bundle r11 = r20.readBundle()
            int r4 = r4 + r2
            r0.setDataPosition(r4)
            goto L_0x0019
        L_0x0072:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = s3.b.c(r0, r2, r4)
            r10 = r2
            com.google.android.gms.common.api.Scope[] r10 = (com.google.android.gms.common.api.Scope[]) r10
            goto L_0x0019
        L_0x007c:
            int r2 = s3.b.g(r0, r2)
            int r4 = r20.dataPosition()
            if (r2 != 0) goto L_0x0088
            r9 = r3
            goto L_0x0019
        L_0x0088:
            android.os.IBinder r9 = r20.readStrongBinder()
            int r4 = r4 + r2
            r0.setDataPosition(r4)
            goto L_0x0019
        L_0x0091:
            java.lang.String r8 = s3.b.b(r0, r2)
            goto L_0x0019
        L_0x0096:
            int r7 = s3.b.f(r0, r2)
            goto L_0x0019
        L_0x009c:
            int r6 = s3.b.f(r0, r2)
            goto L_0x0019
        L_0x00a2:
            int r5 = s3.b.f(r0, r2)
            goto L_0x0019
        L_0x00a8:
            s3.b.d(r0, r1)
            r3.f r0 = new r3.f
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.r0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new f[i8];
    }
}
