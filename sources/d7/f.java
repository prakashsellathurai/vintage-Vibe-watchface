package d7;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Objects;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.Align f4122a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4123b;

    /* renamed from: c  reason: collision with root package name */
    public d f4124c;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4125a;

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
                f4125a = r0
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4125a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.f.a.<clinit>():void");
        }
    }

    public f(Paint.Align align, boolean z8) {
        this.f4122a = align;
        this.f4123b = z8;
    }

    public void b() {
    }

    public RectF c(Rect rect, Rect rect2) {
        float f9;
        RectF rectF = new RectF(rect2);
        if (this.f4123b) {
            rectF.right = rectF.left + ((float) rect.width());
        }
        int[] iArr = a.f4125a;
        Paint.Align align = this.f4122a;
        int i8 = iArr[align.ordinal()];
        if (i8 == 1) {
            f9 = rectF.left;
        } else if (i8 != 2) {
            int i9 = (rectF.right > ((float) rect2.right) ? 1 : (rectF.right == ((float) rect2.right) ? 0 : -1));
            int width = rect.width();
            f9 = (float) Math.floor((double) ((i9 < 0 ? ((float) width) - rectF.right : (float) (width - rect2.right)) * 0.5f));
        } else {
            int i10 = (rectF.right > ((float) rect2.right) ? 1 : (rectF.right == ((float) rect2.right) ? 0 : -1));
            int width2 = rect.width();
            f9 = i10 < 0 ? ((float) width2) - rectF.right : (float) (width2 - rect2.right);
        }
        rectF.offsetTo(f9, 0.0f);
        Objects.toString(align);
        rectF.toString();
        return rectF;
    }

    public void d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0182 A[LOOP:0: B:4:0x002c->B:49:0x0182, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0191 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.graphics.Canvas r22, android.graphics.Paint r23, android.graphics.RectF r24, android.graphics.Rect r25, java.util.ArrayList r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            android.graphics.Rect r2 = a1.a.o(r24)
            r3 = r25
            android.graphics.RectF r2 = r0.c(r2, r3)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r2.left
            float r5 = r2.top
            r3.postTranslate(r4, r5)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR
            r5 = 0
            r1.drawColor(r5, r4)
            int r4 = r26.size()
            r6 = 1
            if (r4 >= r6) goto L_0x0028
            return
        L_0x0028:
            java.util.Iterator r4 = r26.iterator()
        L_0x002c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0191
            java.lang.Object r7 = r4.next()
            c7.n r7 = (c7.n) r7
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>(r3)
            c7.o r9 = r7.f2820h
            if (r9 == 0) goto L_0x004b
            c7.o r9 = new c7.o
            c7.o r10 = r7.f2820h
            r9.<init>((c7.o) r10)
            r10 = r23
            goto L_0x0052
        L_0x004b:
            c7.o r9 = new c7.o
            r10 = r23
            r9.<init>((android.graphics.Paint) r10)
        L_0x0052:
            android.graphics.Rect r11 = r7.f2819g
            boolean r12 = r7 instanceof c7.h
            boolean r13 = r0.f4123b
            r15 = 0
            java.lang.String r6 = "..."
            if (r12 == 0) goto L_0x00d5
            r12 = r7
            c7.h r12 = (c7.h) r12
            int r11 = r11.left
            float r11 = (float) r11
            r8.postTranslate(r11, r15)
            java.util.ArrayList<android.graphics.drawable.Drawable> r11 = r12.f2801j
            java.util.Iterator r11 = r11.iterator()
        L_0x006c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x017e
            java.lang.Object r12 = r11.next()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            android.graphics.Rect r16 = j6.b.c(r12)
            android.graphics.PointF r5 = a1.a.w(r8)
            float r5 = r5.x
            int r15 = r16.width()
            float r15 = (float) r15
            float r15 = r15 + r5
            if (r13 == 0) goto L_0x0092
            float r14 = r2.right
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x0092
            r14 = 1
            goto L_0x0093
        L_0x0092:
            r14 = 0
        L_0x0093:
            if (r14 == 0) goto L_0x00ad
            int r8 = r22.getHeight()
            float r8 = (float) r8
            r14 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r14
            float r11 = r9.descent()
            float r12 = r9.ascent()
            float r11 = r11 + r12
            float r11 = r11 * r14
            float r8 = r8 - r11
            r1.drawText(r6, r5, r8, r9)
            goto L_0x0145
        L_0x00ad:
            r14 = 1056964608(0x3f000000, float:0.5)
            int r5 = r22.getHeight()
            int r15 = r16.height()
            int r5 = r5 - r15
            float r5 = (float) r5
            float r5 = r5 * r14
            r15 = 0
            r8.postTranslate(r15, r5)
            r22.save()
            r1.setMatrix(r8)
            r12.draw(r1)
            r22.restore()
            int r12 = r16.width()
            float r12 = (float) r12
            float r5 = -r5
            r8.postTranslate(r12, r5)
            r5 = 0
            goto L_0x006c
        L_0x00d5:
            java.lang.String r5 = r7.f2818f
            if (r5 == 0) goto L_0x017e
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x017e
            android.graphics.PointF r8 = a1.a.w(r8)
            float r8 = r8.x
            int r12 = r22.getHeight()
            float r12 = (float) r12
            r14 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r14
            float r16 = r9.descent()
            float r17 = r9.ascent()
            float r16 = r16 + r17
            float r16 = r16 * r14
            float r14 = r12 - r16
            int r11 = r11.right
            float r11 = (float) r11
            float r11 = r11 + r8
            if (r13 == 0) goto L_0x0109
            float r12 = r2.right
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0109
            r11 = 1
            goto L_0x010a
        L_0x0109:
            r11 = 0
        L_0x010a:
            if (r11 == 0) goto L_0x0147
            float r11 = r9.measureText(r6)
            float r12 = r2.right
            float r12 = r12 - r8
            float r16 = r12 - r11
            r13 = 0
            int r17 = r5.length()
            r18 = 1
            r19 = 0
            r11 = r9
            r12 = r5
            r20 = r14
            r14 = r17
            r15 = r18
            r17 = r19
            int r11 = r11.breakText(r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 0
            java.lang.String r5 = r5.substring(r13, r11)
            r12.append(r5)
            r12.append(r6)
            java.lang.String r5 = r12.toString()
            r12 = r20
            r1.drawText(r5, r8, r12, r9)
        L_0x0145:
            r13 = 1
            goto L_0x017f
        L_0x0147:
            r12 = r14
            boolean r6 = r7 instanceof c7.b
            if (r6 == 0) goto L_0x0178
            r6 = r7
            c7.b r6 = (c7.b) r6
            java.util.ArrayList r11 = r6.e(r9)
            boolean r6 = r6.d()
            if (r6 == 0) goto L_0x0161
            r6 = 0
            java.lang.Object r9 = r11.get(r6)
            c7.o r9 = (c7.o) r9
            goto L_0x0178
        L_0x0161:
            java.util.Iterator r6 = r11.iterator()
        L_0x0165:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0178
            java.lang.Object r11 = r6.next()
            c7.o r11 = (c7.o) r11
            r11.getClass()
            r1.drawText(r5, r8, r12, r11)
            goto L_0x0165
        L_0x0178:
            r9.getClass()
            r1.drawText(r5, r8, r12, r9)
        L_0x017e:
            r13 = 0
        L_0x017f:
            if (r13 == 0) goto L_0x0182
            goto L_0x0191
        L_0x0182:
            android.graphics.Rect r5 = r7.f2819g
            int r5 = r5.right
            float r5 = (float) r5
            r6 = 0
            r3.postTranslate(r5, r6)
            r5 = 0
            r7.f2821i = r5
            r6 = 1
            goto L_0x002c
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.f(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, android.graphics.Rect, java.util.ArrayList):void");
    }
}
