package q1;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import h7.d;
import java.time.Instant;
import java.util.ArrayList;
import q1.b0;
import q7.k;
import q7.l;

public final class e {

    public static final class a extends l implements p7.l<d<? extends Float, ? extends Integer>, b0.a> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f6451f = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            d dVar = (d) obj;
            k.e(dVar, "<name for destructuring parameter 0>");
            return new b0.a(((Number) dVar.f4782g).intValue(), ((Number) dVar.f4781f).floatValue());
        }
    }

    public static final void a(ComplicationTextTemplate.b bVar, c cVar, c cVar2) {
        c c9;
        c c10;
        ArrayList arrayList = bVar.f235a;
        if (!(cVar == null || (c10 = c(cVar)) == null)) {
            arrayList.add(c10.a());
        }
        if (cVar2 != null && (c9 = c(cVar2)) != null) {
            arrayList.add(c9.a());
        }
    }

    public static final ComplicationTextTemplate b(ComplicationTextTemplate.b bVar) {
        ArrayList arrayList = bVar.f235a;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            return new ComplicationTextTemplate((CharSequence) null, (ComplicationText[]) arrayList.toArray(new ComplicationText[arrayList.size()]));
        }
        throw new IllegalStateException("At least one text must be specified.");
    }

    public static final c c(c cVar) {
        k.e(cVar, "<this>");
        if (cVar.c()) {
            return null;
        }
        return cVar;
    }

    public static final l d(ComplicationData complicationData, boolean z8) {
        Icon icon = complicationData.getIcon();
        if (icon != null) {
            return (!z8 || !j.a(icon)) ? new l(icon, complicationData.getBurnInProtectionIcon()) : l.f6469c;
        }
        return null;
    }

    public static final u e(ComplicationData complicationData, boolean z8) {
        Icon smallImage = complicationData.getSmallImage();
        if (smallImage == null) {
            return null;
        }
        if (z8 && j.a(smallImage)) {
            return u.f6503d;
        }
        int smallImageStyle = complicationData.getSmallImageStyle();
        int i8 = 2;
        if (smallImageStyle != 1 && smallImageStyle == 2) {
            i8 = 1;
        }
        return new u(smallImage, i8, complicationData.getBurnInProtectionSmallImage());
    }

    public static final z f(ComplicationData complicationData) {
        boolean z8 = true;
        boolean z9 = complicationData.getStartDateTimeMillis() == 0;
        if (complicationData.getEndDateTimeMillis() != Long.MAX_VALUE) {
            z8 = false;
        }
        if (z9 && z8) {
            return null;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(complicationData.getStartDateTimeMillis());
        k.d(ofEpochMilli, "ofEpochMilli(startDateTimeMillis)");
        Instant ofEpochMilli2 = Instant.ofEpochMilli(complicationData.getEndDateTimeMillis());
        k.d(ofEpochMilli2, "ofEpochMilli(endDateTimeMillis)");
        return new z(ofEpochMilli, ofEpochMilli2);
    }

    public static final void g(z zVar, ComplicationData.a aVar) {
        if (zVar != null) {
            Instant instant = Instant.MIN;
            Instant instant2 = zVar.f6511a;
            int compareTo = instant2.compareTo(instant);
            Bundle bundle = aVar.f233b;
            if (compareTo > 0) {
                bundle.putLong("START_TIME", instant2.toEpochMilli());
            }
            Instant instant3 = Instant.MAX;
            Instant instant4 = zVar.f6512b;
            if (!k.a(instant4, instant3)) {
                bundle.putLong("END_TIME", instant4.toEpochMilli());
            }
        }
    }

    public static final b h(ComplicationData complicationData) {
        return i(complicationData, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: i7.k} */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r1v71, types: [q1.b0] */
    /* JADX WARNING: type inference failed for: r1v72, types: [q1.q] */
    /* JADX WARNING: type inference failed for: r1v73, types: [q1.v] */
    /* JADX WARNING: type inference failed for: r1v74, types: [q1.m] */
    /* JADX WARNING: type inference failed for: r1v75, types: [q1.k] */
    /* JADX WARNING: type inference failed for: r1v76, types: [q1.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0406 A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x040c A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0413 A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0418 A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x041f A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0425 A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0440 A[Catch:{ Exception -> 0x045c }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0449  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final q1.b i(android.support.wearable.complications.ComplicationData r26, boolean r27) {
        /*
            r15 = r26
            r0 = r27
            java.lang.String r14 = "Data.kt"
            int r1 = r26.getType()     // Catch:{ Exception -> 0x046a }
            r3 = 2
            r4 = 10
            r5 = 1
            if (r1 != r4) goto L_0x0036
            q1.n r0 = new q1.n     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0030
            int r6 = r1.getType()     // Catch:{ Exception -> 0x046a }
            if (r6 != r4) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            if (r6 != r3) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            if (r6 != r5) goto L_0x0025
            goto L_0x0030
        L_0x0025:
            q1.b r1 = i(r1, r5)     // Catch:{ Exception -> 0x046a }
            boolean r3 = r1 instanceof q1.n     // Catch:{ Exception -> 0x046a }
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = r1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            r0.<init>(r2, r15)     // Catch:{ Exception -> 0x046a }
            goto L_0x0467
        L_0x0036:
            if (r1 != r3) goto L_0x003f
            q1.h r0 = new q1.h     // Catch:{ Exception -> 0x046a }
            r0.<init>()     // Catch:{ Exception -> 0x046a }
            goto L_0x0467
        L_0x003f:
            if (r1 != r5) goto L_0x0048
            q1.p r0 = new q1.p     // Catch:{ Exception -> 0x046a }
            r0.<init>()     // Catch:{ Exception -> 0x046a }
            goto L_0x0467
        L_0x0048:
            r3 = 3
            r4 = 0
            if (r1 != r3) goto L_0x00b0
            q1.t r16 = new q1.t     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortText()     // Catch:{ Exception -> 0x046a }
            q7.k.b(r1)     // Catch:{ Exception -> 0x046a }
            q1.c r3 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortTitle()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0065
            q1.c r1 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            r5 = r1
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            q1.l r6 = d(r26, r27)     // Catch:{ Exception -> 0x046a }
            q1.u r0 = e(r26, r27)     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getContentDescription()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x007a
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x046a }
            r7 = r1
            goto L_0x007b
        L_0x007a:
            r7 = 0
        L_0x007b:
            android.app.PendingIntent r8 = r26.getTapAction()     // Catch:{ Exception -> 0x046a }
            q1.z r9 = f(r26)     // Catch:{ Exception -> 0x046a }
            android.content.ComponentName r10 = r26.getDataSource()     // Catch:{ Exception -> 0x046a }
            int r11 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x046a }
            int r12 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x009d
            q1.b r1 = h(r1)     // Catch:{ Exception -> 0x046a }
            q1.t r1 = (q1.t) r1     // Catch:{ Exception -> 0x046a }
            r13 = r1
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            r1 = r16
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r0
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x046a }
        L_0x00ac:
            r0 = r16
            goto L_0x0467
        L_0x00b0:
            r3 = 4
            if (r1 != r3) goto L_0x0114
            q1.k r16 = new q1.k     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getLongText()     // Catch:{ Exception -> 0x046a }
            q7.k.b(r1)     // Catch:{ Exception -> 0x046a }
            q1.c r3 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getLongTitle()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x00cc
            q1.c r1 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            r5 = r1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            q1.l r6 = d(r26, r27)     // Catch:{ Exception -> 0x046a }
            q1.u r0 = e(r26, r27)     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getContentDescription()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x00e1
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x046a }
            r7 = r1
            goto L_0x00e2
        L_0x00e1:
            r7 = 0
        L_0x00e2:
            android.app.PendingIntent r8 = r26.getTapAction()     // Catch:{ Exception -> 0x046a }
            q1.z r9 = f(r26)     // Catch:{ Exception -> 0x046a }
            android.content.ComponentName r10 = r26.getDataSource()     // Catch:{ Exception -> 0x046a }
            int r11 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x046a }
            int r12 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0104
            q1.b r1 = h(r1)     // Catch:{ Exception -> 0x046a }
            q1.k r1 = (q1.k) r1     // Catch:{ Exception -> 0x046a }
            r13 = r1
            goto L_0x0105
        L_0x0104:
            r13 = 0
        L_0x0105:
            r1 = r16
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r0
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x046a }
            goto L_0x00ac
        L_0x0114:
            r3 = 5
            if (r1 != r3) goto L_0x01bf
            float r3 = r26.getRangedValue()     // Catch:{ Exception -> 0x046a }
            l1.e$r r5 = r26.getRangedDynamicValue()     // Catch:{ Exception -> 0x046a }
            float r6 = r26.getRangedMinValue()     // Catch:{ Exception -> 0x046a }
            float r7 = r26.getRangedMaxValue()     // Catch:{ Exception -> 0x046a }
            q1.l r8 = d(r26, r27)     // Catch:{ Exception -> 0x046a }
            q1.u r9 = e(r26, r27)     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortTitle()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x013b
            q1.c r1 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            r10 = r1
            goto L_0x013c
        L_0x013b:
            r10 = 0
        L_0x013c:
            android.support.wearable.complications.ComplicationText r1 = r26.getShortText()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0147
            q1.c r0 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x046a }
            goto L_0x0148
        L_0x0147:
            r0 = 0
        L_0x0148:
            android.support.wearable.complications.ComplicationText r1 = r26.getContentDescription()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0154
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x046a }
            r11 = r1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            android.app.PendingIntent r12 = r26.getTapAction()     // Catch:{ Exception -> 0x046a }
            q1.z r13 = f(r26)     // Catch:{ Exception -> 0x046a }
            android.content.ComponentName r16 = r26.getDataSource()     // Catch:{ Exception -> 0x046a }
            int[] r1 = r26.getColorRamp()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x017a
            q1.a r4 = new q1.a     // Catch:{ Exception -> 0x046a }
            java.lang.Boolean r17 = r26.isColorRampInterpolated()     // Catch:{ Exception -> 0x046a }
            q7.k.b(r17)     // Catch:{ Exception -> 0x046a }
            boolean r2 = r17.booleanValue()     // Catch:{ Exception -> 0x046a }
            r4.<init>(r1, r2)     // Catch:{ Exception -> 0x046a }
            r17 = r4
            goto L_0x017c
        L_0x017a:
            r17 = 0
        L_0x017c:
            int r19 = r26.getRangedValueType()     // Catch:{ Exception -> 0x046a }
            int r20 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x046a }
            int r21 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x046a }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x046a }
            if (r1 == 0) goto L_0x0197
            q1.b r1 = h(r1)     // Catch:{ Exception -> 0x046a }
            q1.s r1 = (q1.s) r1     // Catch:{ Exception -> 0x046a }
            r22 = r1
            goto L_0x0199
        L_0x0197:
            r22 = 0
        L_0x0199:
            q1.s r23 = new q1.s     // Catch:{ Exception -> 0x046a }
            r1 = r23
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r0
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r26
            r24 = r14
            r14 = r16
            r15 = r17
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0206 }
            r0 = r23
            goto L_0x0467
        L_0x01bf:
            r24 = r14
            r2 = 6
            if (r1 != r2) goto L_0x020b
            q1.m r11 = new q1.m     // Catch:{ Exception -> 0x0206 }
            q1.l r2 = d(r26, r27)     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r2)     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationText r0 = r26.getContentDescription()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x01d9
            q1.c r0 = q1.w.a(r0, r4)     // Catch:{ Exception -> 0x0206 }
            r3 = r0
            goto L_0x01da
        L_0x01d9:
            r3 = 0
        L_0x01da:
            android.app.PendingIntent r4 = r26.getTapAction()     // Catch:{ Exception -> 0x0206 }
            q1.z r5 = f(r26)     // Catch:{ Exception -> 0x0206 }
            android.content.ComponentName r7 = r26.getDataSource()     // Catch:{ Exception -> 0x0206 }
            int r8 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x0206 }
            int r9 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationData r0 = r26.getPlaceholder()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x01fc
            q1.b r0 = h(r0)     // Catch:{ Exception -> 0x0206 }
            q1.m r0 = (q1.m) r0     // Catch:{ Exception -> 0x0206 }
            r10 = r0
            goto L_0x01fd
        L_0x01fc:
            r10 = 0
        L_0x01fd:
            r1 = r11
            r6 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0206 }
        L_0x0203:
            r0 = r11
            goto L_0x0467
        L_0x0206:
            r0 = move-exception
        L_0x0207:
            r25 = r24
            goto L_0x046d
        L_0x020b:
            r2 = 7
            if (r1 != r2) goto L_0x024e
            q1.v r11 = new q1.v     // Catch:{ Exception -> 0x0206 }
            q1.u r2 = e(r26, r27)     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r2)     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationText r0 = r26.getContentDescription()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x0223
            q1.c r0 = q1.w.a(r0, r4)     // Catch:{ Exception -> 0x0206 }
            r3 = r0
            goto L_0x0224
        L_0x0223:
            r3 = 0
        L_0x0224:
            android.app.PendingIntent r4 = r26.getTapAction()     // Catch:{ Exception -> 0x0206 }
            q1.z r5 = f(r26)     // Catch:{ Exception -> 0x0206 }
            android.content.ComponentName r7 = r26.getDataSource()     // Catch:{ Exception -> 0x0206 }
            int r8 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x0206 }
            int r9 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationData r0 = r26.getPlaceholder()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x0246
            q1.b r0 = h(r0)     // Catch:{ Exception -> 0x0206 }
            q1.v r0 = (q1.v) r0     // Catch:{ Exception -> 0x0206 }
            r10 = r0
            goto L_0x0247
        L_0x0246:
            r10 = 0
        L_0x0247:
            r1 = r11
            r6 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0206 }
            goto L_0x0203
        L_0x024e:
            android.graphics.drawable.Icon r2 = q1.q.f6481m     // Catch:{ Exception -> 0x0206 }
            r2 = 8
            if (r1 != r2) goto L_0x02a6
            q1.q r11 = new q1.q     // Catch:{ Exception -> 0x0206 }
            android.graphics.drawable.Icon r1 = r26.getLargeImage()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x026a
            if (r0 == 0) goto L_0x0268
            boolean r0 = q1.j.a(r1)     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x0268
            android.graphics.drawable.Icon r0 = q1.q.f6481m     // Catch:{ Exception -> 0x0206 }
            r2 = r0
            goto L_0x026b
        L_0x0268:
            r2 = r1
            goto L_0x026b
        L_0x026a:
            r2 = 0
        L_0x026b:
            q7.k.b(r2)     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationText r0 = r26.getContentDescription()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x027a
            q1.c r0 = q1.w.a(r0, r4)     // Catch:{ Exception -> 0x0206 }
            r3 = r0
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            android.app.PendingIntent r4 = r26.getTapAction()     // Catch:{ Exception -> 0x0206 }
            q1.z r5 = f(r26)     // Catch:{ Exception -> 0x0206 }
            android.content.ComponentName r7 = r26.getDataSource()     // Catch:{ Exception -> 0x0206 }
            int r8 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x0206 }
            int r9 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationData r0 = r26.getPlaceholder()     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x029d
            q1.b r0 = h(r0)     // Catch:{ Exception -> 0x0206 }
            q1.q r0 = (q1.q) r0     // Catch:{ Exception -> 0x0206 }
            r10 = r0
            goto L_0x029e
        L_0x029d:
            r10 = 0
        L_0x029e:
            r1 = r11
            r6 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0206 }
            goto L_0x0203
        L_0x02a6:
            r2 = 9
            if (r1 != r2) goto L_0x02ed
            q1.o r0 = new q1.o     // Catch:{ Exception -> 0x02e8 }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortText()     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x02b8
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x0206 }
            r2 = r1
            goto L_0x02b9
        L_0x02b8:
            r2 = 0
        L_0x02b9:
            android.support.wearable.complications.ComplicationText r1 = r26.getShortTitle()     // Catch:{ Exception -> 0x02e8 }
            if (r1 == 0) goto L_0x02c7
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x0206 }
            r15 = r26
            r3 = r1
            goto L_0x02ca
        L_0x02c7:
            r3 = 0
            r15 = r26
        L_0x02ca:
            q1.l r5 = d(r15, r4)     // Catch:{ Exception -> 0x0206 }
            q1.u r6 = e(r15, r4)     // Catch:{ Exception -> 0x0206 }
            android.content.ComponentName r7 = r26.getDataSource()     // Catch:{ Exception -> 0x0206 }
            int r8 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x0206 }
            int r9 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x0206 }
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0206 }
            goto L_0x0467
        L_0x02e8:
            r0 = move-exception
            r15 = r26
            goto L_0x0207
        L_0x02ed:
            r15 = r26
            r2 = 13
            if (r1 != r2) goto L_0x0383
            float r2 = r26.getRangedValue()     // Catch:{ Exception -> 0x0206 }
            l1.e$r r3 = r26.getRangedDynamicValue()     // Catch:{ Exception -> 0x0206 }
            float r5 = r26.getTargetValue()     // Catch:{ Exception -> 0x0206 }
            q1.l r6 = d(r26, r27)     // Catch:{ Exception -> 0x0206 }
            q1.u r7 = e(r26, r27)     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortTitle()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x0313
            q1.c r1 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x0206 }
            r8 = r1
            goto L_0x0314
        L_0x0313:
            r8 = 0
        L_0x0314:
            android.support.wearable.complications.ComplicationText r1 = r26.getShortText()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x031f
            q1.c r0 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x0206 }
            goto L_0x0320
        L_0x031f:
            r0 = 0
        L_0x0320:
            android.support.wearable.complications.ComplicationText r1 = r26.getContentDescription()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x032c
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x0206 }
            r9 = r1
            goto L_0x032d
        L_0x032c:
            r9 = 0
        L_0x032d:
            android.app.PendingIntent r10 = r26.getTapAction()     // Catch:{ Exception -> 0x0206 }
            q1.z r11 = f(r26)     // Catch:{ Exception -> 0x0206 }
            android.content.ComponentName r13 = r26.getDataSource()     // Catch:{ Exception -> 0x0206 }
            int[] r1 = r26.getColorRamp()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x0351
            q1.a r4 = new q1.a     // Catch:{ Exception -> 0x0206 }
            java.lang.Boolean r12 = r26.isColorRampInterpolated()     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r12)     // Catch:{ Exception -> 0x0206 }
            boolean r12 = r12.booleanValue()     // Catch:{ Exception -> 0x0206 }
            r4.<init>(r1, r12)     // Catch:{ Exception -> 0x0206 }
            r14 = r4
            goto L_0x0352
        L_0x0351:
            r14 = 0
        L_0x0352:
            int r16 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x0206 }
            int r17 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x0206 }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x0206 }
            if (r1 == 0) goto L_0x0369
            q1.b r1 = h(r1)     // Catch:{ Exception -> 0x0206 }
            q1.i r1 = (q1.i) r1     // Catch:{ Exception -> 0x0206 }
            r18 = r1
            goto L_0x036b
        L_0x0369:
            r18 = 0
        L_0x036b:
            q1.i r19 = new q1.i     // Catch:{ Exception -> 0x0206 }
            r1 = r19
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            r12 = r26
            r15 = r16
            r16 = r17
            r17 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0206 }
            r0 = r19
            goto L_0x0467
        L_0x0383:
            java.util.List<q1.b0$a> r2 = q1.b0.r     // Catch:{ Exception -> 0x0206 }
            r2 = 14
            if (r1 != r2) goto L_0x0460
            q1.b0 r16 = new q1.b0     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x03a2
            float[] r1 = r26.getElementWeights()     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r1)     // Catch:{ Exception -> 0x0206 }
            int r1 = r1.length     // Catch:{ Exception -> 0x0206 }
            if (r1 != 0) goto L_0x0399
            r1 = r5
            goto L_0x039a
        L_0x0399:
            r1 = r4
        L_0x039a:
            if (r1 == 0) goto L_0x03a2
            i7.k r1 = i7.k.f4879f     // Catch:{ Exception -> 0x0206 }
            r2 = r1
            r15 = r24
            goto L_0x03f4
        L_0x03a2:
            float[] r1 = r26.getElementWeights()     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r1)     // Catch:{ Exception -> 0x0206 }
            int[] r2 = r26.getElementColors()     // Catch:{ Exception -> 0x0206 }
            q7.k.b(r2)     // Catch:{ Exception -> 0x0206 }
            int r3 = r1.length     // Catch:{ Exception -> 0x0206 }
            int r6 = r2.length     // Catch:{ Exception -> 0x0206 }
            if (r3 == r6) goto L_0x03bc
            java.lang.String r3 = "elementWeights and elementColors must have the same size"
            r15 = r24
            android.util.Log.e(r15, r3)     // Catch:{ Exception -> 0x045c }
            goto L_0x03be
        L_0x03bc:
            r15 = r24
        L_0x03be:
            int r3 = r1.length     // Catch:{ Exception -> 0x045c }
            if (r3 != 0) goto L_0x03c3
            r3 = r5
            goto L_0x03c4
        L_0x03c3:
            r3 = r4
        L_0x03c4:
            v7.b r6 = v7.b.f7957a
            if (r3 == 0) goto L_0x03ca
            r3 = r6
            goto L_0x03cf
        L_0x03ca:
            i7.e r3 = new i7.e     // Catch:{ Exception -> 0x045c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x045c }
        L_0x03cf:
            int r1 = r2.length     // Catch:{ Exception -> 0x045c }
            if (r1 != 0) goto L_0x03d3
            goto L_0x03d4
        L_0x03d3:
            r5 = r4
        L_0x03d4:
            if (r5 == 0) goto L_0x03d7
            goto L_0x03dc
        L_0x03d7:
            i7.d r6 = new i7.d     // Catch:{ Exception -> 0x045c }
            r6.<init>(r2)     // Catch:{ Exception -> 0x045c }
        L_0x03dc:
            v7.c r1 = new v7.c     // Catch:{ Exception -> 0x045c }
            v7.g r2 = v7.g.f7965f     // Catch:{ Exception -> 0x045c }
            r1.<init>(r3, r6, r2)     // Catch:{ Exception -> 0x045c }
            q1.e$a r2 = q1.e.a.f6451f     // Catch:{ Exception -> 0x045c }
            java.lang.String r3 = "transform"
            q7.k.e(r2, r3)     // Catch:{ Exception -> 0x045c }
            v7.i r3 = new v7.i     // Catch:{ Exception -> 0x045c }
            r3.<init>(r1, r2)     // Catch:{ Exception -> 0x045c }
            java.util.List r1 = v7.h.n0(r3)     // Catch:{ Exception -> 0x045c }
            r2 = r1
        L_0x03f4:
            int r3 = r26.getElementBackgroundColor()     // Catch:{ Exception -> 0x045c }
            q1.l r5 = d(r26, r27)     // Catch:{ Exception -> 0x045c }
            q1.u r6 = e(r26, r27)     // Catch:{ Exception -> 0x045c }
            android.support.wearable.complications.ComplicationText r1 = r26.getShortTitle()     // Catch:{ Exception -> 0x045c }
            if (r1 == 0) goto L_0x040c
            q1.c r1 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x045c }
            r7 = r1
            goto L_0x040d
        L_0x040c:
            r7 = 0
        L_0x040d:
            android.support.wearable.complications.ComplicationText r1 = r26.getShortText()     // Catch:{ Exception -> 0x045c }
            if (r1 == 0) goto L_0x0418
            q1.c r0 = q1.w.a(r1, r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x0419
        L_0x0418:
            r0 = 0
        L_0x0419:
            android.support.wearable.complications.ComplicationText r1 = r26.getContentDescription()     // Catch:{ Exception -> 0x045c }
            if (r1 == 0) goto L_0x0425
            q1.c r1 = q1.w.a(r1, r4)     // Catch:{ Exception -> 0x045c }
            r8 = r1
            goto L_0x0426
        L_0x0425:
            r8 = 0
        L_0x0426:
            android.app.PendingIntent r9 = r26.getTapAction()     // Catch:{ Exception -> 0x045c }
            q1.z r10 = f(r26)     // Catch:{ Exception -> 0x045c }
            android.content.ComponentName r12 = r26.getDataSource()     // Catch:{ Exception -> 0x045c }
            int r13 = r26.getPersistencePolicy()     // Catch:{ Exception -> 0x045c }
            int r14 = r26.getDisplayPolicy()     // Catch:{ Exception -> 0x045c }
            android.support.wearable.complications.ComplicationData r1 = r26.getPlaceholder()     // Catch:{ Exception -> 0x045c }
            if (r1 == 0) goto L_0x0449
            q1.b r1 = h(r1)     // Catch:{ Exception -> 0x045c }
            q1.b0 r1 = (q1.b0) r1     // Catch:{ Exception -> 0x045c }
            r18 = r1
            goto L_0x044b
        L_0x0449:
            r18 = 0
        L_0x044b:
            r1 = r16
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            r11 = r26
            r25 = r15
            r15 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0468 }
            goto L_0x00ac
        L_0x045c:
            r0 = move-exception
            r25 = r15
            goto L_0x046d
        L_0x0460:
            r25 = r24
            q1.n r0 = new q1.n     // Catch:{ Exception -> 0x0468 }
            r0.<init>()     // Catch:{ Exception -> 0x0468 }
        L_0x0467:
            return r0
        L_0x0468:
            r0 = move-exception
            goto L_0x046d
        L_0x046a:
            r0 = move-exception
            r25 = r14
        L_0x046d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WireComplicationData.toApiComplicationData failed for "
            r1.<init>(r2)
            java.lang.String r2 = r26.toStringNoRedaction()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r25
            android.util.Log.e(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.e.i(android.support.wearable.complications.ComplicationData, boolean):q1.b");
    }
}
