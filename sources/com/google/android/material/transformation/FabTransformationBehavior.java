package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f4.g;
import f4.h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3569c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f3570d = new RectF();
    public final RectF e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3571f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f3572g;

    /* renamed from: h  reason: collision with root package name */
    public float f3573h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3574a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3575b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3576c;

        public a(boolean z8, View view, View view2) {
            this.f3574a = z8;
            this.f3575b = view;
            this.f3576c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3574a) {
                this.f3575b.setVisibility(4);
                View view = this.f3576c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f3574a) {
                this.f3575b.setVisibility(0);
                View view = this.f3576c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f3577a;

        /* renamed from: b  reason: collision with root package name */
        public a1.a f3578b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Pair u(float f9, float f10, boolean z8, b bVar) {
        String str;
        g gVar;
        h hVar;
        int i8;
        if (f9 == 0.0f || f10 == 0.0f) {
            hVar = bVar.f3577a.c("translationXLinear");
            gVar = bVar.f3577a;
            str = "translationYLinear";
        } else if ((!z8 || f10 >= 0.0f) && (z8 || i8 <= 0)) {
            hVar = bVar.f3577a.c("translationXCurveDownwards");
            gVar = bVar.f3577a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f3577a.c("translationXCurveUpwards");
            gVar = bVar.f3577a;
            str = "translationYCurveUpwards";
        }
        return new Pair(hVar, gVar.c(str));
    }

    public static float x(b bVar, h hVar, float f9) {
        long j8 = hVar.f4404a;
        h c9 = bVar.f3577a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c9.f4404a + c9.f4405b) + 17) - j8)) / ((float) hVar.f4405b));
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        return f9 + (interpolation * (0.0f - f9));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) r3).getExpandedComponentIdHint();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.View r2, android.view.View r3) {
        /*
            r1 = this;
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x001e
            boolean r1 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r1 == 0) goto L_0x001c
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
            int r1 = r3.getExpandedComponentIdHint()
            if (r1 == 0) goto L_0x001a
            int r2 = r2.getId()
            if (r1 != r2) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View):boolean");
    }

    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1029h == 0) {
            fVar.f1029h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03f7 A[LOOP:1: B:114:0x03f5->B:115:0x03f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x037b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet t(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            android.content.Context r4 = r27.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.z(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r26.getTranslationX()
            r0.f3572g = r5
            float r5 = r26.getTranslationY()
            r0.f3573h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int[] r7 = j0.x.f4957a
            float r7 = j0.x.h.i(r27)
            float r8 = j0.x.h.i(r26)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r29 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            f4.g r11 = r4.f3577a
            java.lang.String r12 = "elevation"
            f4.h r11 = r11.c(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f3570d
            a1.a r11 = r4.f3578b
            float r11 = r0.v(r1, r2, r11)
            a1.a r12 = r4.f3578b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            f4.h r14 = (f4.h) r14
            java.lang.Object r13 = r13.second
            f4.h r13 = (f4.h) r13
            android.graphics.RectF r15 = r0.e
            android.graphics.Rect r8 = r0.f3569c
            if (r3 == 0) goto L_0x00c8
            if (r29 != 0) goto L_0x008c
            float r10 = -r11
            r2.setTranslationX(r10)
            float r10 = -r12
            r2.setTranslationY(r10)
        L_0x008c:
            android.util.Property r10 = android.view.View.TRANSLATION_X
            r18 = r6
            float[] r6 = new float[r9]
            r16 = 0
            r17 = 0
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            r19 = r6
            float[] r6 = new float[r9]
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            float r10 = -r11
            float r11 = -r12
            float r10 = x(r4, r14, r10)
            float r11 = x(r4, r13, r11)
            r2.getWindowVisibleDisplayFrame(r8)
            r7.set(r8)
            r0.y(r2, r15)
            r15.offset(r10, r11)
            r15.intersect(r7)
            r7.set(r15)
            r10 = r6
            r6 = r19
            goto L_0x00e2
        L_0x00c8:
            r18 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r10 = new float[r9]
            float r11 = -r11
            r17 = 0
            r10[r17] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r10)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r10, r11)
        L_0x00e2:
            r14.a(r6)
            r13.a(r10)
            r5.add(r6)
            r5.add(r10)
            float r6 = r7.width()
            float r10 = r7.height()
            a1.a r11 = r4.f3578b
            float r11 = r0.v(r1, r2, r11)
            a1.a r12 = r4.f3578b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            f4.h r14 = (f4.h) r14
            java.lang.Object r13 = r13.second
            f4.h r13 = (f4.h) r13
            r19 = r11
            android.util.Property r11 = android.view.View.TRANSLATION_X
            r20 = r12
            float[] r12 = new float[r9]
            if (r3 == 0) goto L_0x011b
            r9 = r19
            goto L_0x011d
        L_0x011b:
            float r9 = r0.f3572g
        L_0x011d:
            r17 = 0
            r12[r17] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r11, r12)
            android.util.Property r11 = android.view.View.TRANSLATION_Y
            r21 = r10
            r12 = 1
            float[] r10 = new float[r12]
            if (r3 == 0) goto L_0x0131
            r12 = r20
            goto L_0x0133
        L_0x0131:
            float r12 = r0.f3573h
        L_0x0133:
            r10[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r1, r11, r10)
            r14.a(r9)
            r13.a(r10)
            r5.add(r9)
            r5.add(r10)
            boolean r9 = r2 instanceof o4.d
            if (r9 == 0) goto L_0x01a7
            boolean r10 = r1 instanceof android.widget.ImageView
            if (r10 != 0) goto L_0x014e
            goto L_0x01a7
        L_0x014e:
            r10 = r2
            o4.d r10 = (o4.d) r10
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.graphics.drawable.Drawable r11 = r11.getDrawable()
            if (r11 != 0) goto L_0x015b
            goto L_0x01a7
        L_0x015b:
            r11.mutate()
            r12 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0177
            if (r29 != 0) goto L_0x0167
            r11.setAlpha(r12)
        L_0x0167:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r12 = f4.d.f4397a
            r13 = 1
            int[] r14 = new int[r13]
            r17 = 0
            r14[r17] = r17
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r12, r14)
            r20 = r6
            goto L_0x0186
        L_0x0177:
            r13 = 1
            r17 = 0
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = f4.d.f4397a
            r20 = r6
            int[] r6 = new int[r13]
            r6[r17] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r14, r6)
        L_0x0186:
            com.google.android.material.transformation.a r6 = new com.google.android.material.transformation.a
            r6.<init>(r2)
            r12.addUpdateListener(r6)
            f4.g r6 = r4.f3577a
            java.lang.String r13 = "iconFade"
            f4.h r6 = r6.c(r13)
            r6.a(r12)
            r5.add(r12)
            com.google.android.material.transformation.b r6 = new com.google.android.material.transformation.b
            r6.<init>(r10, r11)
            r10 = r18
            r10.add(r6)
            goto L_0x01ab
        L_0x01a7:
            r20 = r6
            r10 = r18
        L_0x01ab:
            if (r9 != 0) goto L_0x01b5
            r25 = r4
            r3 = r5
            r24 = r9
            r4 = r10
            goto L_0x031b
        L_0x01b5:
            r11 = r2
            o4.d r11 = (o4.d) r11
            a1.a r12 = r4.f3578b
            r0.y(r1, r7)
            float r13 = r0.f3572g
            float r14 = r0.f3573h
            r7.offset(r13, r14)
            r0.y(r2, r15)
            float r12 = r0.v(r1, r2, r12)
            float r12 = -r12
            r13 = 0
            r15.offset(r12, r13)
            float r12 = r7.centerX()
            float r13 = r15.left
            float r12 = r12 - r13
            a1.a r13 = r4.f3578b
            r0.y(r1, r7)
            float r14 = r0.f3572g
            float r6 = r0.f3573h
            r7.offset(r14, r6)
            r0.y(r2, r15)
            float r0 = r0.w(r1, r2, r13)
            float r0 = -r0
            r6 = 0
            r15.offset(r6, r0)
            float r0 = r7.centerY()
            float r6 = r15.top
            float r0 = r0 - r6
            r6 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r6
            boolean r7 = j0.x.f.c(r6)
            if (r7 != 0) goto L_0x0404
            int r6 = r8.width()
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            f4.g r7 = r4.f3577a
            java.lang.String r8 = "expansion"
            f4.h r7 = r7.c(r8)
            if (r3 == 0) goto L_0x0297
            if (r29 != 0) goto L_0x021b
            o4.d$d r8 = new o4.d$d
            r8.<init>(r12, r0, r6)
            r11.setRevealInfo(r8)
        L_0x021b:
            if (r29 == 0) goto L_0x0223
            o4.d$d r6 = r11.getRevealInfo()
            float r6 = r6.f6116c
        L_0x0223:
            r8 = 0
            float r15 = r8 - r12
            float r13 = r8 - r0
            double r14 = (double) r15
            r24 = r9
            double r8 = (double) r13
            r13 = r4
            double r3 = java.lang.Math.hypot(r14, r8)
            float r3 = (float) r3
            float r4 = r20 - r12
            r20 = r5
            double r4 = (double) r4
            double r8 = java.lang.Math.hypot(r4, r8)
            float r8 = (float) r8
            float r9 = r21 - r0
            r21 = r10
            double r9 = (double) r9
            double r4 = java.lang.Math.hypot(r4, r9)
            float r4 = (float) r4
            double r9 = java.lang.Math.hypot(r14, r9)
            float r5 = (float) r9
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0258
            int r9 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0258
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0258
            goto L_0x0269
        L_0x0258:
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0262
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0262
            r3 = r8
            goto L_0x0269
        L_0x0262:
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0268
            r3 = r4
            goto L_0x0269
        L_0x0268:
            r3 = r5
        L_0x0269:
            android.animation.AnimatorSet r3 = o4.b.a(r11, r12, r0, r3)
            com.google.android.material.transformation.c r4 = new com.google.android.material.transformation.c
            r4.<init>(r11)
            r3.addListener(r4)
            long r4 = r7.f4404a
            int r8 = (int) r12
            int r0 = (int) r0
            r9 = 0
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x028f
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r8, r0, r6, r6)
            r0.setStartDelay(r9)
            r0.setDuration(r4)
            r4 = r20
            r4.add(r0)
            goto L_0x0291
        L_0x028f:
            r4 = r20
        L_0x0291:
            r5 = r3
            r3 = r4
            r25 = r13
            goto L_0x030b
        L_0x0297:
            r13 = r4
            r4 = r5
            r24 = r9
            r21 = r10
            o4.d$d r3 = r11.getRevealInfo()
            float r3 = r3.f6116c
            android.animation.AnimatorSet r5 = o4.b.a(r11, r12, r0, r6)
            long r8 = r7.f4404a
            int r10 = (int) r12
            int r0 = (int) r0
            r14 = 0
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x02be
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r2, r10, r0, r3, r3)
            r3.setStartDelay(r14)
            r3.setDuration(r8)
            r4.add(r3)
        L_0x02be:
            r3 = r13
            f4.g r8 = r3.f3577a
            p.f<java.lang.String, f4.h> r8 = r8.f4402a
            int r9 = r8.f6235h
            r13 = r14
            r12 = 0
        L_0x02c7:
            if (r12 >= r9) goto L_0x02eb
            java.lang.Object r15 = r8.l(r12)
            f4.h r15 = (f4.h) r15
            r20 = r8
            r22 = r9
            long r8 = r15.f4404a
            r25 = r3
            r23 = r4
            long r3 = r15.f4405b
            long r8 = r8 + r3
            long r13 = java.lang.Math.max(r13, r8)
            int r12 = r12 + 1
            r3 = r25
            r8 = r20
            r9 = r22
            r4 = r23
            goto L_0x02c7
        L_0x02eb:
            r25 = r3
            r23 = r4
            long r3 = r7.f4404a
            long r8 = r7.f4405b
            long r3 = r3 + r8
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x0309
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r10, r0, r6, r6)
            r0.setStartDelay(r3)
            long r13 = r13 - r3
            r0.setDuration(r13)
            r3 = r23
            r3.add(r0)
            goto L_0x030b
        L_0x0309:
            r3 = r23
        L_0x030b:
            r7.a(r5)
            r3.add(r5)
            o4.a r0 = new o4.a
            r0.<init>(r11)
            r4 = r21
            r4.add(r0)
        L_0x031b:
            if (r24 != 0) goto L_0x0322
            r5 = r25
            r7 = r28
            goto L_0x0376
        L_0x0322:
            r0 = r2
            o4.d r0 = (o4.d) r0
            int[] r5 = j0.x.f4957a
            android.content.res.ColorStateList r5 = j0.x.h.g(r26)
            if (r5 == 0) goto L_0x033a
            int[] r6 = r26.getDrawableState()
            int r7 = r5.getDefaultColor()
            int r5 = r5.getColorForState(r6, r7)
            goto L_0x033b
        L_0x033a:
            r5 = 0
        L_0x033b:
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r5
            r7 = r28
            if (r7 == 0) goto L_0x0355
            if (r29 != 0) goto L_0x0348
            r0.setCircularRevealScrimColor(r5)
        L_0x0348:
            android.util.Property<o4.d, java.lang.Integer> r5 = o4.d.c.f6113a
            r8 = 1
            int[] r9 = new int[r8]
            r10 = 0
            r9[r10] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r9)
            goto L_0x0361
        L_0x0355:
            r8 = 1
            r10 = 0
            android.util.Property<o4.d, java.lang.Integer> r6 = o4.d.c.f6113a
            int[] r9 = new int[r8]
            r9[r10] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r6, r9)
        L_0x0361:
            f4.b r5 = f4.b.f4395a
            r0.setEvaluator(r5)
            r5 = r25
            f4.g r6 = r5.f3577a
            java.lang.String r8 = "color"
            f4.h r6 = r6.c(r8)
            r6.a(r0)
            r3.add(r0)
        L_0x0376:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x037b
            goto L_0x03e0
        L_0x037b:
            r6 = -2146762443(0xffffffff800b0135, float:-1.010623E-39)
            android.view.View r6 = r2.findViewById(r6)
            if (r6 == 0) goto L_0x0385
            goto L_0x039f
        L_0x0385:
            boolean r6 = r2 instanceof e5.c
            if (r6 != 0) goto L_0x0396
            boolean r6 = r2 instanceof e5.b
            if (r6 == 0) goto L_0x038e
            goto L_0x0396
        L_0x038e:
            if (r0 == 0) goto L_0x0394
            r6 = r2
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x03a5
        L_0x0394:
            r6 = 0
            goto L_0x03a5
        L_0x0396:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6 = 0
            android.view.View r0 = r0.getChildAt(r6)
            r6 = r0
        L_0x039f:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0394
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x03a5:
            if (r6 != 0) goto L_0x03a8
            goto L_0x03e0
        L_0x03a8:
            if (r7 == 0) goto L_0x03c5
            if (r29 != 0) goto L_0x03b6
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = f4.c.f4396a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r0.set(r6, r8)
        L_0x03b6:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = f4.c.f4396a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r0, r8)
            goto L_0x03d2
        L_0x03c5:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = f4.c.f4396a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r0, r8)
        L_0x03d2:
            f4.g r5 = r5.f3577a
            java.lang.String r6 = "contentFade"
            f4.h r5 = r5.c(r6)
            r5.a(r0)
            r3.add(r0)
        L_0x03e0:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            k3.j.R(r0, r3)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r3.<init>(r7, r2, r1)
            r0.addListener(r3)
            int r1 = r4.size()
            r10 = 0
        L_0x03f5:
            if (r10 >= r1) goto L_0x0403
            java.lang.Object r2 = r4.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L_0x03f5
        L_0x0403:
            return r0
        L_0x0404:
            int r0 = r6.getWidth()
            int r1 = r6.getHeight()
            r2 = 0
            r8.set(r2, r2, r0, r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, a1.a aVar) {
        RectF rectF = this.f3570d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.f3572g, this.f3573h);
        y(view2, rectF2);
        aVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, a1.a aVar) {
        RectF rectF = this.f3570d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.f3572g, this.f3573h);
        y(view2, rectF2);
        aVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f3571f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract b z(Context context, boolean z8);
}
