package y4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import y4.j;
import y4.l;

public class f extends Drawable implements m {
    public static final Paint w = new Paint(1);

    /* renamed from: a  reason: collision with root package name */
    public b f8412a;

    /* renamed from: b  reason: collision with root package name */
    public final l.f[] f8413b;

    /* renamed from: c  reason: collision with root package name */
    public final l.f[] f8414c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f8415d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f8416f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f8417g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f8418h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f8419i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f8420j;

    /* renamed from: k  reason: collision with root package name */
    public final Region f8421k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f8422l;

    /* renamed from: m  reason: collision with root package name */
    public i f8423m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f8424n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f8425o;

    /* renamed from: p  reason: collision with root package name */
    public final x4.a f8426p;

    /* renamed from: q  reason: collision with root package name */
    public final a f8427q;
    public final j r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuffColorFilter f8428s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f8429t;

    /* renamed from: u  reason: collision with root package name */
    public final RectF f8430u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8431v;

    public class a {
        public a() {
        }
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f8433a;

        /* renamed from: b  reason: collision with root package name */
        public r4.a f8434b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f8435c = null;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f8436d = null;
        public final ColorStateList e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f8437f = null;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f8438g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f8439h = null;

        /* renamed from: i  reason: collision with root package name */
        public final float f8440i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f8441j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f8442k;

        /* renamed from: l  reason: collision with root package name */
        public int f8443l = 255;

        /* renamed from: m  reason: collision with root package name */
        public float f8444m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f8445n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public final float f8446o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public final int f8447p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f8448q = 0;
        public int r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f8449s = 0;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f8450t = false;

        /* renamed from: u  reason: collision with root package name */
        public final Paint.Style f8451u = Paint.Style.FILL_AND_STROKE;

        public b(b bVar) {
            this.f8433a = bVar.f8433a;
            this.f8434b = bVar.f8434b;
            this.f8442k = bVar.f8442k;
            this.f8435c = bVar.f8435c;
            this.f8436d = bVar.f8436d;
            this.f8438g = bVar.f8438g;
            this.f8437f = bVar.f8437f;
            this.f8443l = bVar.f8443l;
            this.f8440i = bVar.f8440i;
            this.r = bVar.r;
            this.f8447p = bVar.f8447p;
            this.f8450t = bVar.f8450t;
            this.f8441j = bVar.f8441j;
            this.f8444m = bVar.f8444m;
            this.f8445n = bVar.f8445n;
            this.f8446o = bVar.f8446o;
            this.f8448q = bVar.f8448q;
            this.f8449s = bVar.f8449s;
            this.e = bVar.e;
            this.f8451u = bVar.f8451u;
            if (bVar.f8439h != null) {
                this.f8439h = new Rect(bVar.f8439h);
            }
        }

        public b(i iVar) {
            this.f8433a = iVar;
            this.f8434b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.e = true;
            return fVar;
        }
    }

    public f() {
        this(new i());
    }

    public f(Context context, AttributeSet attributeSet, int i8, int i9) {
        this(i.b(context, attributeSet, i8, i9).a());
    }

    public f(b bVar) {
        j jVar;
        this.f8413b = new l.f[4];
        this.f8414c = new l.f[4];
        this.f8415d = new BitSet(8);
        this.f8416f = new Matrix();
        this.f8417g = new Path();
        this.f8418h = new Path();
        this.f8419i = new RectF();
        this.f8420j = new RectF();
        this.f8421k = new Region();
        this.f8422l = new Region();
        Paint paint = new Paint(1);
        this.f8424n = paint;
        Paint paint2 = new Paint(1);
        this.f8425o = paint2;
        this.f8426p = new x4.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f8487a;
        } else {
            jVar = new j();
        }
        this.r = jVar;
        this.f8430u = new RectF();
        this.f8431v = true;
        this.f8412a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = w;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        l();
        k(getState());
        this.f8427q = new a();
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.r;
        b bVar = this.f8412a;
        i iVar = bVar.f8433a;
        float f9 = bVar.f8441j;
        jVar.a(iVar, f9, rectF, this.f8427q, path);
        if (this.f8412a.f8440i != 1.0f) {
            Matrix matrix = this.f8416f;
            matrix.reset();
            float f10 = this.f8412a.f8440i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f8430u, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.d(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002f
            int r2 = r4.getColor()
            int r1 = r1.d(r2)
            if (r1 == r2) goto L_0x002f
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r1, r3)
            r1 = r2
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i8) {
        b bVar = this.f8412a;
        float f9 = bVar.f8445n + bVar.f8446o + bVar.f8444m;
        r4.a aVar = bVar.f8434b;
        if (aVar == null || !aVar.f7060a) {
            return i8;
        }
        if (!(c0.a.b(i8, 255) == aVar.f7062c)) {
            return i8;
        }
        float f10 = aVar.f7063d;
        float f11 = 0.0f;
        if (f10 > 0.0f && f9 > 0.0f) {
            f11 = Math.min(((((float) Math.log1p((double) (f9 / f10))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return c0.a.b(k3.j.L(f11, c0.a.b(i8, 255), aVar.f7061b), Color.alpha(i8));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            android.graphics.Paint r8 = r6.f8424n
            android.graphics.PorterDuffColorFilter r0 = r6.f8428s
            r8.setColorFilter(r0)
            int r9 = r8.getAlpha()
            y4.f$b r0 = r6.f8412a
            int r0 = r0.f8443l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r9
            int r0 = r0 >>> 8
            r8.setAlpha(r0)
            android.graphics.Paint r10 = r6.f8425o
            android.graphics.PorterDuffColorFilter r0 = r6.f8429t
            r10.setColorFilter(r0)
            y4.f$b r0 = r6.f8412a
            float r0 = r0.f8442k
            r10.setStrokeWidth(r0)
            int r11 = r10.getAlpha()
            y4.f$b r0 = r6.f8412a
            int r0 = r0.f8443l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r11
            int r0 = r0 >>> 8
            r10.setAlpha(r0)
            boolean r0 = r6.e
            android.graphics.Path r5 = r6.f8418h
            android.graphics.Path r3 = r6.f8417g
            android.graphics.RectF r4 = r6.f8420j
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 0
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0101
            y4.f$b r0 = r6.f8412a
            android.graphics.Paint$Style r0 = r0.f8451u
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r12) goto L_0x0057
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            if (r0 != r12) goto L_0x0061
        L_0x0057:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 == 0) goto L_0x006b
            float r0 = r10.getStrokeWidth()
            float r0 = r0 / r18
            goto L_0x006d
        L_0x006b:
            r0 = r19
        L_0x006d:
            float r0 = -r0
            y4.f$b r12 = r6.f8412a
            y4.i r12 = r12.f8433a
            r12.getClass()
            y4.i$a r13 = new y4.i$a
            r13.<init>(r12)
            y4.c r14 = r12.e
            boolean r15 = r14 instanceof y4.g
            if (r15 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            y4.b r15 = new y4.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x0087:
            r13.e = r14
            y4.c r14 = r12.f8458f
            boolean r15 = r14 instanceof y4.g
            if (r15 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            y4.b r15 = new y4.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x0096:
            r13.f8469f = r14
            y4.c r14 = r12.f8460h
            boolean r15 = r14 instanceof y4.g
            if (r15 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            y4.b r15 = new y4.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x00a5:
            r13.f8471h = r14
            y4.c r12 = r12.f8459g
            boolean r14 = r12 instanceof y4.g
            if (r14 == 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            y4.b r14 = new y4.b
            r14.<init>(r0, r12)
            r12 = r14
        L_0x00b4:
            r13.f8470g = r12
            y4.i r0 = new y4.i
            r0.<init>(r13)
            r6.f8423m = r0
            y4.j r12 = r6.r
            y4.f$b r13 = r6.f8412a
            float r14 = r13.f8441j
            android.graphics.RectF r13 = r20.g()
            r4.set(r13)
            y4.f$b r13 = r6.f8412a
            android.graphics.Paint$Style r13 = r13.f8451u
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r13 == r15) goto L_0x00d6
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.STROKE
            if (r13 != r15) goto L_0x00e0
        L_0x00d6:
            float r13 = r10.getStrokeWidth()
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 <= 0) goto L_0x00e0
            r13 = r2
            goto L_0x00e1
        L_0x00e0:
            r13 = r1
        L_0x00e1:
            if (r13 == 0) goto L_0x00ea
            float r13 = r10.getStrokeWidth()
            float r13 = r13 / r18
            goto L_0x00ec
        L_0x00ea:
            r13 = r19
        L_0x00ec:
            r4.inset(r13, r13)
            r16 = 0
            r13 = r0
            r15 = r4
            r17 = r5
            r12.a(r13, r14, r15, r16, r17)
            android.graphics.RectF r0 = r20.g()
            r6.b(r0, r3)
            r6.e = r1
        L_0x0101:
            y4.f$b r0 = r6.f8412a
            int r12 = r0.f8447p
            r13 = 2
            if (r12 == r2) goto L_0x0120
            int r14 = r0.f8448q
            if (r14 <= 0) goto L_0x0120
            if (r12 == r13) goto L_0x011e
            y4.i r0 = r0.f8433a
            android.graphics.RectF r12 = r20.g()
            boolean r0 = r0.d(r12)
            if (r0 != 0) goto L_0x0120
            r3.isConvex()
            goto L_0x0120
        L_0x011e:
            r0 = r2
            goto L_0x0121
        L_0x0120:
            r0 = r1
        L_0x0121:
            if (r0 != 0) goto L_0x0125
            goto L_0x01cc
        L_0x0125:
            r21.save()
            y4.f$b r0 = r6.f8412a
            int r12 = r0.r
            double r14 = (double) r12
            int r0 = r0.f8449s
            double r1 = (double) r0
            double r0 = java.lang.Math.toRadians(r1)
            double r0 = java.lang.Math.sin(r0)
            double r14 = r14 * r0
            int r0 = (int) r14
            y4.f$b r1 = r6.f8412a
            int r2 = r1.r
            double r14 = (double) r2
            int r1 = r1.f8449s
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            double r1 = java.lang.Math.cos(r1)
            double r14 = r14 * r1
            int r1 = (int) r14
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.f8431v
            if (r0 != 0) goto L_0x0159
            r20.e(r21)
            goto L_0x01c9
        L_0x0159:
            android.graphics.RectF r0 = r6.f8430u
            float r1 = r0.width()
            android.graphics.Rect r2 = r20.getBounds()
            int r2 = r2.width()
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = r0.height()
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.height()
            float r14 = (float) r14
            float r2 = r2 - r14
            int r2 = (int) r2
            if (r1 < 0) goto L_0x024d
            if (r2 < 0) goto L_0x024d
            float r14 = r0.width()
            int r14 = (int) r14
            y4.f$b r15 = r6.f8412a
            int r15 = r15.f8448q
            int r15 = r15 * r13
            int r14 = r14 + r15
            int r14 = r14 + r1
            float r0 = r0.height()
            int r0 = (int) r0
            y4.f$b r15 = r6.f8412a
            int r15 = r15.f8448q
            int r15 = r15 * r13
            int r0 = r0 + r15
            int r0 = r0 + r2
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r14, r0, r13)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r0)
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.left
            y4.f$b r15 = r6.f8412a
            int r15 = r15.f8448q
            int r14 = r14 - r15
            int r14 = r14 - r1
            float r1 = (float) r14
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.top
            y4.f$b r15 = r6.f8412a
            int r15 = r15.f8448q
            int r14 = r14 - r15
            int r14 = r14 - r2
            float r2 = (float) r14
            float r14 = -r1
            float r15 = -r2
            r13.translate(r14, r15)
            r6.e(r13)
            r13 = 0
            r7.drawBitmap(r0, r1, r2, r13)
            r0.recycle()
        L_0x01c9:
            r21.restore()
        L_0x01cc:
            y4.f$b r0 = r6.f8412a
            android.graphics.Paint$Style r1 = r0.f8451u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01db
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            r1 = 0
            goto L_0x01dc
        L_0x01db:
            r1 = 1
        L_0x01dc:
            if (r1 == 0) goto L_0x01f3
            y4.i r13 = r0.f8433a
            android.graphics.RectF r14 = r20.g()
            r0 = r20
            r15 = 0
            r1 = r21
            r12 = 1
            r2 = r8
            r12 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r0.f(r1, r2, r3, r4, r5)
            goto L_0x01f6
        L_0x01f3:
            r12 = r4
            r13 = r5
            r15 = 0
        L_0x01f6:
            y4.f$b r0 = r6.f8412a
            android.graphics.Paint$Style r0 = r0.f8451u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0202
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x020c
        L_0x0202:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x020c
            r2 = 1
            goto L_0x020d
        L_0x020c:
            r2 = r15
        L_0x020d:
            if (r2 == 0) goto L_0x0246
            y4.i r4 = r6.f8423m
            android.graphics.RectF r0 = r20.g()
            r12.set(r0)
            y4.f$b r0 = r6.f8412a
            android.graphics.Paint$Style r0 = r0.f8451u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0224
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x022e
        L_0x0224:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x022e
            r2 = 1
            goto L_0x022f
        L_0x022e:
            r2 = r15
        L_0x022f:
            if (r2 == 0) goto L_0x0237
            float r0 = r10.getStrokeWidth()
            float r19 = r0 / r18
        L_0x0237:
            r0 = r19
            r12.inset(r0, r0)
            r0 = r20
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r12
            r0.f(r1, r2, r3, r4, r5)
        L_0x0246:
            r8.setAlpha(r9)
            r10.setAlpha(r11)
            return
        L_0x024d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f8415d.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i8 = this.f8412a.r;
        Path path = this.f8417g;
        x4.a aVar = this.f8426p;
        if (i8 != 0) {
            canvas.drawPath(path, aVar.f8125a);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            l.f fVar = this.f8413b[i9];
            int i10 = this.f8412a.f8448q;
            Matrix matrix = l.f.f8510a;
            fVar.a(matrix, aVar, i10, canvas);
            this.f8414c[i9].a(matrix, aVar, this.f8412a.f8448q, canvas);
        }
        if (this.f8431v) {
            b bVar = this.f8412a;
            int sin = (int) (((double) bVar.r) * Math.sin(Math.toRadians((double) bVar.f8449s)));
            b bVar2 = this.f8412a;
            int cos = (int) (((double) bVar2.r) * Math.cos(Math.toRadians((double) bVar2.f8449s)));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, w);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.d(rectF)) {
            float a9 = iVar.f8458f.a(rectF) * this.f8412a.f8441j;
            canvas.drawRoundRect(rectF, a9, a9, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final RectF g() {
        RectF rectF = this.f8419i;
        rectF.set(getBounds());
        return rectF;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f8412a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f8412a;
        if (bVar.f8447p != 2) {
            if (bVar.f8433a.d(g())) {
                outline.setRoundRect(getBounds(), this.f8412a.f8433a.e.a(g()) * this.f8412a.f8441j);
                return;
            }
            RectF g9 = g();
            Path path = this.f8417g;
            b(g9, path);
            path.isConvex();
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f8412a.f8439h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f8421k;
        region.set(bounds);
        RectF g9 = g();
        Path path = this.f8417g;
        b(g9, path);
        Region region2 = this.f8422l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f8412a.f8434b = new r4.a(context);
        m();
    }

    public final void i(float f9) {
        b bVar = this.f8412a;
        if (bVar.f8445n != f9) {
            bVar.f8445n = f9;
            m();
        }
    }

    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f8412a.f8436d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r1.f8412a.f8435c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f8412a.f8437f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f8412a.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            y4.f$b r0 = r1.f8412a
            android.content.res.ColorStateList r0 = r0.f8437f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            y4.f$b r0 = r1.f8412a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            y4.f$b r0 = r1.f8412a
            android.content.res.ColorStateList r0 = r0.f8436d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            y4.f$b r1 = r1.f8412a
            android.content.res.ColorStateList r1 = r1.f8435c
            if (r1 == 0) goto L_0x0037
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.f.isStateful():boolean");
    }

    public final void j(ColorStateList colorStateList) {
        b bVar = this.f8412a;
        if (bVar.f8435c != colorStateList) {
            bVar.f8435c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z8;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f8412a.f8435c == null || (color2 = paint2.getColor()) == (colorForState2 = this.f8412a.f8435c.getColorForState(iArr, color2))) {
            z8 = false;
        } else {
            (paint2 = this.f8424n).setColor(colorForState2);
            z8 = true;
        }
        if (this.f8412a.f8436d == null || (color = paint.getColor()) == (colorForState = this.f8412a.f8436d.getColorForState(iArr, color))) {
            return z8;
        }
        (paint = this.f8425o).setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.f8428s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8429t;
        b bVar = this.f8412a;
        this.f8428s = c(bVar.f8437f, bVar.f8438g, this.f8424n, true);
        b bVar2 = this.f8412a;
        this.f8429t = c(bVar2.e, bVar2.f8438g, this.f8425o, false);
        b bVar3 = this.f8412a;
        if (bVar3.f8450t) {
            this.f8426p.a(bVar3.f8437f.getColorForState(getState(), 0));
        }
        return !i0.b.a(porterDuffColorFilter, this.f8428s) || !i0.b.a(porterDuffColorFilter2, this.f8429t);
    }

    public final void m() {
        b bVar = this.f8412a;
        float f9 = bVar.f8445n + bVar.f8446o;
        bVar.f8448q = (int) Math.ceil((double) (0.75f * f9));
        this.f8412a.r = (int) Math.ceil((double) (f9 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public final Drawable mutate() {
        this.f8412a = new b(this.f8412a);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z8 = k(iArr) || l();
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    public void setAlpha(int i8) {
        b bVar = this.f8412a;
        if (bVar.f8443l != i8) {
            bVar.f8443l = i8;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8412a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(i iVar) {
        this.f8412a.f8433a = iVar;
        invalidateSelf();
    }

    public final void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f8412a.f8437f = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f8412a;
        if (bVar.f8438g != mode) {
            bVar.f8438g = mode;
            l();
            super.invalidateSelf();
        }
    }
}
