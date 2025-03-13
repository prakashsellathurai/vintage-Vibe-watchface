package d7;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import c7.h;
import c7.n;
import c7.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class e extends f {

    /* renamed from: d  reason: collision with root package name */
    public final int f4116d;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4117a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.graphics.Paint$Align[] r0 = android.graphics.Paint.Align.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4117a = r0
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4117a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.e.a.<clinit>():void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f4118a;

        /* renamed from: b  reason: collision with root package name */
        public float f4119b;

        /* renamed from: c  reason: collision with root package name */
        public final n f4120c;

        /* renamed from: d  reason: collision with root package name */
        public o f4121d;

        public b(float f9, n nVar, o oVar, String str) {
            this.f4118a = str;
            this.f4119b = f9;
            this.f4120c = nVar;
            this.f4121d = oVar;
        }
    }

    public e(Paint.Align align, boolean z8, int i8) {
        super(align, z8);
        this.f4116d = i8;
    }

    public static int h(float f9, n nVar, o oVar, String str) {
        if (!(nVar instanceof h)) {
            return oVar.breakText(str, true, f9, (float[]) null);
        }
        ArrayList<Drawable> a9 = nVar.f2818f != null ? oVar.a(str) : ((h) nVar).f2801j;
        int i8 = 0;
        if (a9 == null) {
            return 0;
        }
        Iterator<Drawable> it = a9.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            f10 += (float) j6.b.c(it.next()).width();
            if (f10 > f9) {
                break;
            }
            i8++;
        }
        return i8;
    }

    public static float i(String str, n nVar, o oVar) {
        if (!(nVar instanceof h)) {
            return oVar.measureText(str);
        }
        ArrayList<Drawable> a9 = nVar.f2818f != null ? oVar.a(str) : ((h) nVar).f2801j;
        float f9 = 0.0f;
        if (a9 == null) {
            return 0.0f;
        }
        Iterator<Drawable> it = a9.iterator();
        while (it.hasNext()) {
            f9 += (float) j6.b.c(it.next()).width();
        }
        return f9;
    }

    public final RectF c(Rect rect, Rect rect2) {
        RectF rectF = new RectF(rect2);
        rectF.offsetTo(0.0f, 0.0f);
        Objects.toString(this.f4122a);
        rectF.toString();
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r1 = (int) (((float) r30.getHeight()) / r16);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r30, android.graphics.Paint r31, android.graphics.RectF r32, android.graphics.Rect r33, java.util.ArrayList r34) {
        /*
            r29 = this;
            r10 = r29
            android.graphics.Rect r0 = a1.a.o(r32)
            r1 = r33
            android.graphics.RectF r0 = r10.c(r0, r1)
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            float r1 = r0.left
            float r2 = r0.top
            r11.postTranslate(r1, r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            r12 = 0
            r13 = r30
            r13.drawColor(r12, r1)
            int r1 = r34.size()
            r14 = 1
            if (r1 >= r14) goto L_0x0028
            return
        L_0x0028:
            boolean r1 = r34.isEmpty()
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "no elements"
            goto L_0x0109
        L_0x0032:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r1 = r30.getWidth()
            float r9 = (float) r1
            float r0 = r0.height()
            java.util.Iterator r1 = r34.iterator()
            r16 = r0
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r1.next()
            c7.n r0 = (c7.n) r0
            android.graphics.Rect r2 = r0.f2819g
            if (r2 == 0) goto L_0x0068
            int r2 = r2.height()
            float r2 = (float) r2
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            android.graphics.Rect r2 = r0.f2819g
            int r2 = r2.height()
            float r2 = (float) r2
            r16 = r2
        L_0x0068:
            c7.o r2 = r0.f2820h
            if (r2 == 0) goto L_0x0046
            float r2 = r2.getFontSpacing()
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0046
            c7.o r0 = r0.f2820h
            float r16 = r0.getFontSpacing()
            goto L_0x0046
        L_0x007b:
            java.util.Iterator r0 = r34.iterator()
            r17 = 0
            r18 = r17
        L_0x0083:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r0.next()
            c7.n r1 = (c7.n) r1
            boolean r2 = r1 instanceof c7.h
            if (r2 == 0) goto L_0x0094
            goto L_0x0083
        L_0x0094:
            android.graphics.Rect r1 = r1.f2819g
            if (r1 == 0) goto L_0x0083
            int r1 = r1.bottom
            float r1 = (float) r1
            int r2 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0083
            r18 = r1
            goto L_0x0083
        L_0x00a2:
            java.util.Iterator r0 = r34.iterator()
            r1 = r17
        L_0x00a8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r0.next()
            c7.n r2 = (c7.n) r2
            c7.o r2 = r2.f2820h
            if (r2 != 0) goto L_0x00b9
            goto L_0x00a8
        L_0x00b9:
            android.graphics.Paint$FontMetrics r2 = r2.getFontMetrics()
            float r3 = r2.ascent
            float r2 = r2.top
            float r3 = r3 - r2
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a8
            r1 = r3
            goto L_0x00a8
        L_0x00c8:
            int r8 = (int) r1
            java.util.Iterator r0 = r34.iterator()
            r1 = r17
        L_0x00cf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r0.next()
            c7.n r2 = (c7.n) r2
            c7.o r2 = r2.f2820h
            if (r2 != 0) goto L_0x00e0
            goto L_0x00cf
        L_0x00e0:
            android.graphics.Paint$FontMetrics r2 = r2.getFontMetrics()
            float r2 = r2.descent
            int r3 = (int) r2
            float r3 = (float) r3
            float r2 = r2 - r3
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00cf
            r1 = r2
            goto L_0x00cf
        L_0x00ef:
            int r7 = (int) r1
            int r0 = r10.f4116d
            boolean r6 = r10.f4123b
            if (r6 == 0) goto L_0x0104
            int r1 = r30.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r16
            int r1 = (int) r1
            if (r0 > r1) goto L_0x0102
            if (r0 >= 0) goto L_0x0104
        L_0x0102:
            r5 = r1
            goto L_0x0105
        L_0x0104:
            r5 = r0
        L_0x0105:
            if (r5 != 0) goto L_0x0110
            java.lang.String r0 = "maxLines is 0"
        L_0x0109:
            java.lang.String r1 = "DWF:MultilineTextRenderer"
            android.util.Log.w(r1, r0)
            goto L_0x0359
        L_0x0110:
            java.util.Iterator r19 = r34.iterator()
            r3 = r12
            r0 = r17
            r1 = r0
        L_0x0118:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x0321
            java.lang.Object r2 = r19.next()
            r4 = r2
            c7.n r4 = (c7.n) r4
            java.lang.String r2 = r4.f2818f
            java.lang.String r12 = " "
            if (r2 != 0) goto L_0x0138
            boolean r2 = r4 instanceof c7.h
            if (r2 == 0) goto L_0x0136
            java.lang.String r2 = "*"
            java.lang.String[] r1 = new java.lang.String[]{r2}
            goto L_0x013c
        L_0x0136:
            r12 = 0
            goto L_0x0118
        L_0x0138:
            java.lang.String[] r1 = r2.split(r12)
        L_0x013c:
            r28 = r2
            r2 = r1
            r1 = r28
            c7.o r14 = r4.f2820h
            if (r14 != 0) goto L_0x0153
            c7.o r14 = new c7.o
            r10 = r31
            r14.<init>((android.graphics.Paint) r10)
            r34 = r1
            r1 = 1
            r14.setAntiAlias(r1)
            goto L_0x0157
        L_0x0153:
            r10 = r31
            r34 = r1
        L_0x0157:
            float r20 = r14.measureText(r12)
            r21 = r3
            r3 = 0
        L_0x015e:
            int r1 = r2.length
            if (r3 >= r1) goto L_0x02e3
            r1 = r2[r3]
            float r1 = i(r1, r4, r14)
            float r22 = r0 + r1
            int r22 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r22 > 0) goto L_0x019d
            float r1 = r1 + r20
            float r0 = r0 + r1
            r22 = r0
            d7.e$b r0 = new d7.e$b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r13 = r2[r3]
            r10.append(r13)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r0.<init>(r1, r4, r14, r10)
            r15.add(r0)
            int r3 = r3 + 1
            r25 = r2
            r27 = r4
            r10 = r5
            r23 = r6
            r24 = r8
            r13 = r9
            r0 = r22
            r22 = r7
            goto L_0x02d1
        L_0x019d:
            boolean r1 = r15.isEmpty()
            java.lang.String r10 = "..."
            java.lang.String r13 = "... "
            if (r1 == 0) goto L_0x0209
            if (r6 == 0) goto L_0x01ce
            int r0 = r21 + 1
            if (r0 != r5) goto L_0x01ce
            float r0 = r14.measureText(r10)
            r1 = r2[r3]
            float r0 = r9 - r0
            int r0 = h(r0, r4, r14, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r10 = r2[r3]
            r22 = r7
            r7 = 0
            java.lang.String r10 = r10.substring(r7, r0)
            r1.append(r10)
            r1.append(r13)
            goto L_0x01e8
        L_0x01ce:
            r22 = r7
            r7 = 0
            r0 = r2[r3]
            int r0 = h(r9, r4, r14, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r10 = r2[r3]
            java.lang.String r10 = r10.substring(r7, r0)
            r1.append(r10)
            r1.append(r12)
        L_0x01e8:
            java.lang.String r1 = r1.toString()
            float r7 = i(r1, r4, r14)
            d7.e$b r10 = new d7.e$b
            float r13 = r7 + r20
            r10.<init>(r13, r4, r14, r1)
            r15.add(r10)
            r1 = r2[r3]
            java.lang.String r0 = r1.substring(r0)
            r2[r3] = r0
            r23 = r5
            r24 = r6
            r0 = r7
            goto L_0x0283
        L_0x0209:
            r22 = r7
            if (r6 == 0) goto L_0x027f
            int r1 = r21 + 1
            if (r1 != r5) goto L_0x027f
            float r1 = r14.measureText(r10)
            float r7 = r0 + r1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0251
            int r7 = r15.size()
            r10 = 1
            int r7 = r7 - r10
            java.lang.Object r7 = r15.get(r7)
            d7.e$b r7 = (d7.e.b) r7
            float r1 = r1 + r20
            float r10 = r7.f4119b
            float r10 = r10 - r1
            r7.f4119b = r10
            java.lang.String r1 = r7.f4118a
            int r1 = h(r10, r4, r14, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r23 = r5
            java.lang.String r5 = r7.f4118a
            r24 = r6
            r6 = 0
            java.lang.String r1 = r5.substring(r6, r1)
            r10.append(r1)
            r10.append(r13)
            java.lang.String r1 = r10.toString()
            r7.f4118a = r1
            goto L_0x0283
        L_0x0251:
            r23 = r5
            r24 = r6
            float r5 = r9 - r0
            r6 = r2[r3]
            float r1 = r5 - r1
            int r1 = h(r1, r4, r14, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r2[r3]
            r10 = 0
            java.lang.String r1 = r7.substring(r10, r1)
            r6.append(r1)
            r6.append(r13)
            java.lang.String r1 = r6.toString()
            d7.e$b r6 = new d7.e$b
            float r0 = r0 + r5
            r6.<init>(r0, r4, r14, r1)
            r15.add(r6)
            goto L_0x0283
        L_0x027f:
            r23 = r5
            r24 = r6
        L_0x0283:
            int r1 = r15.size()
            r10 = 1
            int r1 = r1 - r10
            java.lang.Object r1 = r15.get(r1)
            d7.e$b r1 = (d7.e.b) r1
            java.lang.String r5 = r1.f4118a
            int r6 = r5.length()
            int r6 = r6 - r10
            r7 = 0
            java.lang.String r5 = r5.substring(r7, r6)
            r1.f4118a = r5
            float r13 = r0 - r20
            r0 = r29
            r7 = r34
            r1 = r30
            r25 = r2
            r2 = r11
            r26 = r3
            r3 = r21
            r27 = r4
            r4 = r8
            r6 = r23
            r5 = r22
            r10 = r6
            r23 = r24
            r6 = r16
            r7 = r18
            r24 = r8
            r8 = r13
            r13 = r9
            r9 = r15
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.clear()
            int r0 = r21 + 1
            if (r0 != r10) goto L_0x02cb
            goto L_0x0359
        L_0x02cb:
            r21 = r0
            r0 = r17
            r3 = r26
        L_0x02d1:
            r5 = r10
            r9 = r13
            r7 = r22
            r6 = r23
            r8 = r24
            r2 = r25
            r4 = r27
            r13 = r30
            r10 = r31
            goto L_0x015e
        L_0x02e3:
            r10 = r5
            r23 = r6
            r22 = r7
            r24 = r8
            r13 = r9
            int r1 = r34.length()
            int r1 = r1 + -1
            r2 = r34
            char r1 = r2.charAt(r1)
            r2 = 32
            if (r1 == r2) goto L_0x030d
            int r1 = r15.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r15.get(r1)
            d7.e$b r1 = (d7.e.b) r1
            float r2 = r1.f4119b
            float r2 = r2 - r20
            r1.f4119b = r2
        L_0x030d:
            r5 = r10
            r9 = r13
            r1 = r20
            r3 = r21
            r7 = r22
            r6 = r23
            r8 = r24
            r12 = 0
            r14 = 1
            r10 = r29
            r13 = r30
            goto L_0x0118
        L_0x0321:
            r22 = r7
            r24 = r8
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x0359
            int r2 = r15.size()
            int r2 = r2 + -1
            java.lang.Object r2 = r15.get(r2)
            d7.e$b r2 = (d7.e.b) r2
            java.lang.String r4 = r2.f4118a
            int r5 = r4.length()
            int r5 = r5 + -1
            r6 = 0
            java.lang.String r4 = r4.substring(r6, r5)
            r2.f4118a = r4
            float r8 = r0 - r1
            r0 = r29
            r1 = r30
            r2 = r11
            r4 = r24
            r5 = r22
            r6 = r16
            r7 = r18
            r9 = r15
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.f(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, android.graphics.Rect, java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.graphics.Canvas r3, android.graphics.Matrix r4, int r5, int r6, int r7, float r8, float r9, float r10, java.util.ArrayList<d7.e.b> r11) {
        /*
            r2 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r4)
            android.graphics.PointF r4 = a1.a.w(r0)
            float r4 = r4.x
            float r6 = (float) r6
            r1 = 1
            int r5 = r5 + r1
            float r5 = (float) r5
            float r7 = (float) r7
            float r8 = r8 + r7
            float r5 = r5 * r8
            float r6 = r6 + r5
            float r6 = r6 - r9
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int[] r7 = d7.e.a.f4117a
            android.graphics.Paint$Align r2 = r2.f4122a
            int r2 = r2.ordinal()
            r2 = r7[r2]
            if (r2 == r1) goto L_0x002b
            r7 = 2
            if (r2 == r7) goto L_0x0029
            goto L_0x0030
        L_0x0029:
            float r5 = r5 - r10
            goto L_0x002f
        L_0x002b:
            float r5 = r5 - r10
            r2 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r2
        L_0x002f:
            float r4 = r4 + r5
        L_0x0030:
            java.util.Iterator r2 = r11.iterator()
        L_0x0034:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00e1
            java.lang.Object r5 = r2.next()
            d7.e$b r5 = (d7.e.b) r5
            c7.n r7 = r5.f4120c
            boolean r8 = r7 instanceof c7.b
            if (r8 == 0) goto L_0x0078
            c7.b r7 = (c7.b) r7
            c7.o r8 = r5.f4121d
            java.util.ArrayList r8 = r7.e(r8)
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x005f
            r7 = 0
            java.lang.Object r7 = r8.get(r7)
            c7.o r7 = (c7.o) r7
            r5.f4121d = r7
            goto L_0x00d2
        L_0x005f:
            java.util.Iterator r7 = r8.iterator()
        L_0x0063:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d2
            java.lang.Object r8 = r7.next()
            c7.o r8 = (c7.o) r8
            java.lang.String r10 = r5.f4118a
            r8.getClass()
            r3.drawText(r10, r4, r6, r8)
            goto L_0x0063
        L_0x0078:
            boolean r8 = r7 instanceof c7.h
            if (r8 == 0) goto L_0x00d2
            java.lang.String r8 = r7.f2818f
            if (r8 == 0) goto L_0x0089
            c7.o r7 = r5.f4121d
            java.lang.String r5 = r5.f4118a
            java.util.ArrayList r5 = r7.a(r5)
            goto L_0x008d
        L_0x0089:
            c7.h r7 = (c7.h) r7
            java.util.ArrayList<android.graphics.drawable.Drawable> r5 = r7.f2801j
        L_0x008d:
            if (r5 != 0) goto L_0x0090
            goto L_0x0034
        L_0x0090:
            float r7 = r6 + r9
            r0.postTranslate(r4, r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x0099:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00cd
            java.lang.Object r7 = r5.next()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            android.graphics.Rect r8 = j6.b.c(r7)
            int r8 = r8.width()
            float r8 = (float) r8
            android.graphics.Rect r10 = j6.b.c(r7)
            int r10 = r10.height()
            float r10 = (float) r10
            r11 = 0
            float r1 = -r10
            r0.postTranslate(r11, r1)
            r3.save()
            r3.setMatrix(r0)
            r7.draw(r3)
            r3.restore()
            r0.postTranslate(r8, r10)
            float r4 = r4 + r8
            goto L_0x0099
        L_0x00cd:
            r0.reset()
            goto L_0x0034
        L_0x00d2:
            java.lang.String r7 = r5.f4118a
            c7.o r8 = r5.f4121d
            r8.getClass()
            r3.drawText(r7, r4, r6, r8)
            float r5 = r5.f4119b
            float r4 = r4 + r5
            goto L_0x0034
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.e.g(android.graphics.Canvas, android.graphics.Matrix, int, int, int, float, float, float, java.util.ArrayList):void");
    }
}
