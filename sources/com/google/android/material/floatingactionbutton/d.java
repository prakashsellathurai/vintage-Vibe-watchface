package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import k3.j;
import y4.i;

public class d {
    public static final int[] A = {16843623, 16842910};
    public static final int[] B = {16842910};
    public static final int[] C = new int[0];
    public static final TimeInterpolator w = f4.a.f4393c;

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f3329x = {16842919, 16842910};
    public static final int[] y = {16843623, 16842908, 16842910};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f3330z = {16842908, 16842910};

    /* renamed from: a  reason: collision with root package name */
    public i f3331a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3332b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3333c = true;

    /* renamed from: d  reason: collision with root package name */
    public float f3334d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f3335f;

    /* renamed from: g  reason: collision with root package name */
    public f4.g f3336g;

    /* renamed from: h  reason: collision with root package name */
    public f4.g f3337h;

    /* renamed from: i  reason: collision with root package name */
    public Animator f3338i;

    /* renamed from: j  reason: collision with root package name */
    public f4.g f3339j;

    /* renamed from: k  reason: collision with root package name */
    public f4.g f3340k;

    /* renamed from: l  reason: collision with root package name */
    public float f3341l;

    /* renamed from: m  reason: collision with root package name */
    public float f3342m = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f3343n = 0;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3344o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f3345p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<e> f3346q;
    public final FloatingActionButton r;

    /* renamed from: s  reason: collision with root package name */
    public final x4.b f3347s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f3348t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Matrix f3349u;

    /* renamed from: v  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f3350v;

    public class a extends f4.f {
        public a() {
        }

        public final Object evaluate(float f9, Object obj, Object obj2) {
            d.this.f3342m = f9;
            float[] fArr = this.f4399a;
            ((Matrix) obj).getValues(fArr);
            float[] fArr2 = this.f4400b;
            ((Matrix) obj2).getValues(fArr2);
            for (int i8 = 0; i8 < 9; i8++) {
                float f10 = fArr2[i8];
                float f11 = fArr[i8];
                fArr2[i8] = f11 + ((f10 - f11) * f9);
            }
            Matrix matrix = this.f4401c;
            matrix.setValues(fArr2);
            return matrix;
        }
    }

    public class b extends h {
        public b(t4.b bVar) {
            super(bVar);
        }

        public final float a() {
            return 0.0f;
        }
    }

    public class c extends h {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3352c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(t4.b bVar) {
            super(bVar);
            this.f3352c = bVar;
        }

        public final float a() {
            d dVar = this.f3352c;
            return dVar.f3334d + dVar.e;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0035d extends h {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3353c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0035d(t4.b bVar) {
            super(bVar);
            this.f3353c = bVar;
        }

        public final float a() {
            d dVar = this.f3353c;
            return dVar.f3334d + dVar.f3335f;
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
    }

    public class g extends h {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f3354c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(t4.b bVar) {
            super(bVar);
            this.f3354c = bVar;
        }

        public final float a() {
            return this.f3354c.f3334d;
        }
    }

    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3355a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f3356b;

        public h(t4.b bVar) {
            this.f3356b = bVar;
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            this.f3356b.getClass();
            this.f3355a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z8 = this.f3355a;
            d dVar = this.f3356b;
            if (!z8) {
                dVar.getClass();
                a();
                this.f3355a = true;
            }
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        new RectF();
        new RectF();
        this.f3349u = new Matrix();
        this.r = floatingActionButton;
        this.f3347s = bVar;
        u4.g gVar = new u4.g();
        t4.b bVar2 = (t4.b) this;
        gVar.a(f3329x, b(new C0035d(bVar2)));
        gVar.a(y, b(new c(bVar2)));
        gVar.a(f3330z, b(new c(bVar2)));
        gVar.a(A, b(new c(bVar2)));
        gVar.a(B, b(new g(bVar2)));
        gVar.a(C, b(new b(bVar2)));
        this.f3341l = floatingActionButton.getRotation();
    }

    public static ValueAnimator b(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(w);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final AnimatorSet a(f4.g gVar, float f9, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f9};
        FloatingActionButton floatingActionButton = this.r;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, new float[]{f10});
        gVar.c("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, new float[]{f10});
        gVar.c("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        Matrix matrix = this.f3349u;
        matrix.reset();
        floatingActionButton.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new f4.e(), new a(), new Matrix[]{new Matrix(matrix)});
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        j.R(animatorSet, arrayList);
        return animatorSet;
    }

    public float c() {
        throw null;
    }

    public void d(Rect rect) {
        int i8 = 0;
        if (this.f3332b) {
            i8 = (0 - this.r.getSizeDimension()) / 2;
        }
        float c9 = this.f3333c ? c() + this.f3335f : 0.0f;
        int max = Math.max(i8, (int) Math.ceil((double) c9));
        int max2 = Math.max(i8, (int) Math.ceil((double) (c9 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void e() {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(int[] iArr) {
        throw null;
    }

    public void h(float f9, float f10, float f11) {
        throw null;
    }

    public final void i() {
        ArrayList<e> arrayList = this.f3346q;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public final void l() {
        d(this.f3348t);
        throw new NullPointerException("Didn't initialize content background");
    }
}
