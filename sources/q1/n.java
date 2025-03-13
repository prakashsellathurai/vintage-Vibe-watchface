package q1;

import android.annotation.SuppressLint;
import android.support.wearable.complications.ComplicationData;

public final class n extends b {

    /* renamed from: j  reason: collision with root package name */
    public final b f6475j;
    @SuppressLint({"NewApi"})

    /* renamed from: k  reason: collision with root package name */
    public final c f6476k;

    public n() {
        this((b) null, (ComplicationData) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(q1.b r10, android.support.wearable.complications.ComplicationData r11) {
        /*
            r9 = this;
            q1.d r1 = q1.d.NO_DATA
            r8 = 0
            if (r10 == 0) goto L_0x0009
            android.app.PendingIntent r0 = r10.f6419b
            r2 = r0
            goto L_0x000a
        L_0x0009:
            r2 = r8
        L_0x000a:
            r4 = 0
            r0 = 0
            if (r10 == 0) goto L_0x0012
            int r3 = r10.f6422f
            r5 = r3
            goto L_0x0013
        L_0x0012:
            r5 = r0
        L_0x0013:
            if (r10 == 0) goto L_0x0017
            int r0 = r10.f6423g
        L_0x0017:
            r6 = r0
            r0 = r9
            r3 = r11
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f6475j = r10
            boolean r11 = r10 instanceof q1.t
            if (r11 == 0) goto L_0x0029
            q1.t r10 = (q1.t) r10
            q1.c r8 = r10.f6502o
            goto L_0x0067
        L_0x0029:
            boolean r11 = r10 instanceof q1.k
            if (r11 == 0) goto L_0x0032
            q1.k r10 = (q1.k) r10
            q1.c r8 = r10.f6468o
            goto L_0x0067
        L_0x0032:
            boolean r11 = r10 instanceof q1.s
            if (r11 == 0) goto L_0x003b
            q1.s r10 = (q1.s) r10
            q1.c r8 = r10.f6496u
            goto L_0x0067
        L_0x003b:
            boolean r11 = r10 instanceof q1.m
            if (r11 == 0) goto L_0x0044
            q1.m r10 = (q1.m) r10
            q1.c r8 = r10.f6474l
            goto L_0x0067
        L_0x0044:
            boolean r11 = r10 instanceof q1.v
            if (r11 == 0) goto L_0x004d
            q1.v r10 = (q1.v) r10
            q1.c r8 = r10.f6509l
            goto L_0x0067
        L_0x004d:
            boolean r11 = r10 instanceof q1.q
            if (r11 == 0) goto L_0x0056
            q1.q r10 = (q1.q) r10
            q1.c r8 = r10.f6484l
            goto L_0x0067
        L_0x0056:
            boolean r11 = r10 instanceof q1.i
            if (r11 == 0) goto L_0x005f
            q1.i r10 = (q1.i) r10
            q1.c r8 = r10.f6462s
            goto L_0x0067
        L_0x005f:
            boolean r11 = r10 instanceof q1.b0
            if (r11 == 0) goto L_0x0067
            q1.b0 r10 = (q1.b0) r10
            q1.c r8 = r10.f6433q
        L_0x0067:
            r9.f6476k = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.n.<init>(q1.b, android.support.wearable.complications.ComplicationData):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.c(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.wearable.complications.TimeDependentText c(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            q7.k.e(r2, r0)
            q1.b r1 = r1.f6475j
            if (r1 == 0) goto L_0x000f
            android.support.wearable.complications.TimeDependentText r1 = r1.c(r2)
            if (r1 != 0) goto L_0x001a
        L_0x000f:
            android.support.wearable.complications.ComplicationText r1 = new android.support.wearable.complications.ComplicationText
            r0 = -2146369536(0xffffffff80110000, float:-1.561203E-39)
            java.lang.String r2 = r2.getString(r0)
            r1.<init>((java.lang.CharSequence) r2)
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.n.c(android.content.Context):android.support.wearable.complications.TimeDependentText");
    }

    public final String toString() {
        return "NoDataComplicationData(placeholder=" + this.f6475j + ", tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ')';
    }
}
