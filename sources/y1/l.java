package y1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import androidx.fragment.app.i0;
import i2.p;
import j2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class l extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f8250a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public f f8251b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.d f8252c;

    /* renamed from: d  reason: collision with root package name */
    public float f8253d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8254f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8255g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<n> f8256h;

    /* renamed from: i  reason: collision with root package name */
    public c2.b f8257i;

    /* renamed from: j  reason: collision with root package name */
    public String f8258j;

    /* renamed from: k  reason: collision with root package name */
    public c2.a f8259k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8260l;

    /* renamed from: m  reason: collision with root package name */
    public g2.c f8261m;

    /* renamed from: n  reason: collision with root package name */
    public int f8262n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8263o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8264p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8265q;
    public final boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8266s;

    public class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8267a;

        public a(String str) {
            this.f8267a = str;
        }

        public final void run() {
            l.this.l(this.f8267a);
        }
    }

    public class b implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8269a;

        public b(int i8) {
            this.f8269a = i8;
        }

        public final void run() {
            l.this.h(this.f8269a);
        }
    }

    public class c implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8271a;

        public c(float f9) {
            this.f8271a = f9;
        }

        public final void run() {
            l.this.p(this.f8271a);
        }
    }

    public class d implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d2.e f8273a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f8274b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i0 f8275c;

        public d(d2.e eVar, Object obj, i0 i0Var) {
            this.f8273a = eVar;
            this.f8274b = obj;
            this.f8275c = i0Var;
        }

        public final void run() {
            l.this.a(this.f8273a, this.f8274b, this.f8275c);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f9;
            l lVar = l.this;
            g2.c cVar = lVar.f8261m;
            if (cVar != null) {
                k2.d dVar = lVar.f8252c;
                f fVar = dVar.f5114o;
                if (fVar == null) {
                    f9 = 0.0f;
                } else {
                    float f10 = dVar.f5110k;
                    float f11 = fVar.f8228k;
                    f9 = (f10 - f11) / (fVar.f8229l - f11);
                }
                cVar.q(f9);
            }
        }
    }

    public class f implements n {
        public f() {
        }

        public final void run() {
            l.this.f();
        }
    }

    public class g implements n {
        public g() {
        }

        public final void run() {
            l.this.g();
        }
    }

    public class h implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8280a;

        public h(int i8) {
            this.f8280a = i8;
        }

        public final void run() {
            l.this.m(this.f8280a);
        }
    }

    public class i implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8282a;

        public i(float f9) {
            this.f8282a = f9;
        }

        public final void run() {
            l.this.o(this.f8282a);
        }
    }

    public class j implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8284a;

        public j(int i8) {
            this.f8284a = i8;
        }

        public final void run() {
            l.this.i(this.f8284a);
        }
    }

    public class k implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8286a;

        public k(float f9) {
            this.f8286a = f9;
        }

        public final void run() {
            l.this.k(this.f8286a);
        }
    }

    /* renamed from: y1.l$l  reason: collision with other inner class name */
    public class C0156l implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8288a;

        public C0156l(String str) {
            this.f8288a = str;
        }

        public final void run() {
            l.this.n(this.f8288a);
        }
    }

    public class m implements n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8290a;

        public m(String str) {
            this.f8290a = str;
        }

        public final void run() {
            l.this.j(this.f8290a);
        }
    }

    public interface n {
        void run();
    }

    public l() {
        k2.d dVar = new k2.d();
        this.f8252c = dVar;
        this.f8253d = 1.0f;
        this.e = true;
        this.f8254f = false;
        this.f8255g = false;
        this.f8256h = new ArrayList<>();
        e eVar = new e();
        this.f8262n = 255;
        this.r = true;
        this.f8266s = false;
        dVar.addUpdateListener(eVar);
    }

    public final <T> void a(d2.e eVar, T t8, i0 i0Var) {
        float f9;
        g2.c cVar = this.f8261m;
        if (cVar == null) {
            this.f8256h.add(new d(eVar, t8, i0Var));
            return;
        }
        boolean z8 = true;
        if (eVar == d2.e.f3996c) {
            cVar.h(i0Var, t8);
        } else {
            d2.f fVar = eVar.f3998b;
            if (fVar != null) {
                fVar.h(i0Var, t8);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f8261m.c(eVar, 0, arrayList, new d2.e(new String[0]));
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    ((d2.e) arrayList.get(i8)).f3998b.h(i0Var, t8);
                }
                z8 = true ^ arrayList.isEmpty();
            }
        }
        if (z8) {
            invalidateSelf();
            if (t8 == q.C) {
                k2.d dVar = this.f8252c;
                f fVar2 = dVar.f5114o;
                if (fVar2 == null) {
                    f9 = 0.0f;
                } else {
                    float f10 = dVar.f5110k;
                    float f11 = fVar2.f8228k;
                    f9 = (f10 - f11) / (fVar2.f8229l - f11);
                }
                p(f9);
            }
        }
    }

    public final boolean b() {
        return this.e || this.f8254f;
    }

    public final void c() {
        f fVar = this.f8251b;
        b.a aVar = p.f4822a;
        Rect rect = fVar.f8227j;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        e2.d dVar = r16;
        e2.d dVar2 = new e2.d();
        g2.e eVar = r2;
        Rect rect2 = rect;
        g2.e eVar2 = new g2.e(emptyList, fVar, "__container", -1, 1, -1, (String) null, emptyList2, dVar, 0, 0, 0, 0.0f, 0.0f, rect2.width(), rect2.height(), (e2.a) null, (s.c) null, Collections.emptyList(), 1, (e2.b) null, false);
        f fVar2 = this.f8251b;
        g2.c cVar = new g2.c(this, eVar, fVar2.f8226i, fVar2);
        this.f8261m = cVar;
        if (this.f8264p) {
            cVar.p(true);
        }
    }

    public final void d() {
        k2.d dVar = this.f8252c;
        if (dVar.f5115p) {
            dVar.cancel();
        }
        this.f8251b = null;
        this.f8261m = null;
        this.f8257i = null;
        dVar.f5114o = null;
        dVar.f5112m = -2.14748365E9f;
        dVar.f5113n = 2.14748365E9f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f8266s = false;
        if (this.f8255g) {
            try {
                e(canvas);
            } catch (Throwable unused) {
                k2.c.f5106a.getClass();
            }
        } else {
            e(canvas);
        }
        k3.j.s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r10) {
        /*
            r9 = this;
            y1.f r0 = r9.f8251b
            if (r0 == 0) goto L_0x0032
            android.graphics.Rect r1 = r9.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x0032
        L_0x000f:
            android.graphics.Rect r1 = r9.getBounds()
            int r2 = r1.width()
            float r2 = (float) r2
            int r1 = r1.height()
            float r1 = (float) r1
            float r2 = r2 / r1
            android.graphics.Rect r0 = r0.f8227j
            int r1 = r0.width()
            float r1 = (float) r1
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            android.graphics.Matrix r1 = r9.f8250a
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x00a9
            g2.c r0 = r9.f8261m
            if (r0 != 0) goto L_0x0042
            goto L_0x011a
        L_0x0042:
            android.graphics.Rect r0 = r9.getBounds()
            int r5 = r0.width()
            float r5 = (float) r5
            y1.f r6 = r9.f8251b
            android.graphics.Rect r6 = r6.f8227j
            int r6 = r6.width()
            float r6 = (float) r6
            float r5 = r5 / r6
            int r6 = r0.height()
            float r6 = (float) r6
            y1.f r7 = r9.f8251b
            android.graphics.Rect r7 = r7.f8227j
            int r7 = r7.height()
            float r7 = (float) r7
            float r6 = r6 / r7
            boolean r7 = r9.r
            if (r7 == 0) goto L_0x0095
            float r7 = java.lang.Math.min(r5, r6)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0075
            float r8 = r4 / r7
            float r5 = r5 / r8
            float r6 = r6 / r8
            goto L_0x0076
        L_0x0075:
            r8 = r4
        L_0x0076:
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0095
            int r3 = r10.save()
            int r4 = r0.width()
            float r4 = (float) r4
            float r4 = r4 / r2
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r2
            float r2 = r4 * r7
            float r7 = r7 * r0
            float r4 = r4 - r2
            float r0 = r0 - r7
            r10.translate(r4, r0)
            r10.scale(r8, r8, r2, r7)
        L_0x0095:
            r1.reset()
            r1.preScale(r5, r6)
            g2.c r0 = r9.f8261m
            int r9 = r9.f8262n
            r0.f(r10, r1, r9)
            if (r3 <= 0) goto L_0x011a
            r10.restoreToCount(r3)
            goto L_0x011a
        L_0x00a9:
            g2.c r0 = r9.f8261m
            if (r0 != 0) goto L_0x00ae
            goto L_0x011a
        L_0x00ae:
            float r0 = r9.f8253d
            int r5 = r10.getWidth()
            float r5 = (float) r5
            y1.f r6 = r9.f8251b
            android.graphics.Rect r6 = r6.f8227j
            int r6 = r6.width()
            float r6 = (float) r6
            float r5 = r5 / r6
            int r6 = r10.getHeight()
            float r6 = (float) r6
            y1.f r7 = r9.f8251b
            android.graphics.Rect r7 = r7.f8227j
            int r7 = r7.height()
            float r7 = (float) r7
            float r6 = r6 / r7
            float r5 = java.lang.Math.min(r5, r6)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00da
            float r0 = r9.f8253d
            float r0 = r0 / r5
            goto L_0x00dc
        L_0x00da:
            r5 = r0
            r0 = r4
        L_0x00dc:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0108
            int r3 = r10.save()
            y1.f r4 = r9.f8251b
            android.graphics.Rect r4 = r4.f8227j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 / r2
            y1.f r6 = r9.f8251b
            android.graphics.Rect r6 = r6.f8227j
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 / r2
            float r2 = r4 * r5
            float r7 = r6 * r5
            float r8 = r9.f8253d
            float r4 = r4 * r8
            float r4 = r4 - r2
            float r8 = r8 * r6
            float r8 = r8 - r7
            r10.translate(r4, r8)
            r10.scale(r0, r0, r2, r7)
        L_0x0108:
            r1.reset()
            r1.preScale(r5, r5)
            g2.c r0 = r9.f8261m
            int r9 = r9.f8262n
            r0.f(r10, r1, r9)
            if (r3 <= 0) goto L_0x011a
            r10.restoreToCount(r3)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.e(android.graphics.Canvas):void");
    }

    public final void f() {
        if (this.f8261m == null) {
            this.f8256h.add(new f());
            return;
        }
        boolean b9 = b();
        k2.d dVar = this.f8252c;
        if (b9 || dVar.getRepeatCount() == 0) {
            dVar.f5115p = true;
            boolean d9 = dVar.d();
            Iterator it = dVar.f5104g.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationStart(dVar, d9);
            }
            dVar.f((float) ((int) (dVar.d() ? dVar.b() : dVar.c())));
            dVar.f5109j = 0;
            dVar.f5111l = 0;
            if (dVar.f5115p) {
                dVar.e(false);
                Choreographer.getInstance().postFrameCallback(dVar);
            }
        }
        if (!b()) {
            h((int) (dVar.f5107h < 0.0f ? dVar.c() : dVar.b()));
            dVar.e(true);
            boolean d10 = dVar.d();
            Iterator it2 = dVar.f5104g.iterator();
            while (it2.hasNext()) {
                ((Animator.AnimatorListener) it2.next()).onAnimationEnd(dVar, d10);
            }
        }
    }

    public final void g() {
        float f9;
        if (this.f8261m == null) {
            this.f8256h.add(new g());
            return;
        }
        boolean b9 = b();
        k2.d dVar = this.f8252c;
        if (b9 || dVar.getRepeatCount() == 0) {
            dVar.f5115p = true;
            dVar.e(false);
            Choreographer.getInstance().postFrameCallback(dVar);
            dVar.f5109j = 0;
            if (dVar.d() && dVar.f5110k == dVar.c()) {
                f9 = dVar.b();
            } else if (!dVar.d() && dVar.f5110k == dVar.b()) {
                f9 = dVar.c();
            }
            dVar.f5110k = f9;
        }
        if (!b()) {
            h((int) (dVar.f5107h < 0.0f ? dVar.c() : dVar.b()));
            dVar.e(true);
            boolean d9 = dVar.d();
            Iterator it = dVar.f5104g.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationEnd(dVar, d9);
            }
        }
    }

    public final int getAlpha() {
        return this.f8262n;
    }

    public final int getIntrinsicHeight() {
        f fVar = this.f8251b;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f8227j.height()) * this.f8253d);
    }

    public final int getIntrinsicWidth() {
        f fVar = this.f8251b;
        if (fVar == null) {
            return -1;
        }
        return (int) (((float) fVar.f8227j.width()) * this.f8253d);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h(int i8) {
        if (this.f8251b == null) {
            this.f8256h.add(new b(i8));
        } else {
            this.f8252c.f((float) i8);
        }
    }

    public final void i(int i8) {
        if (this.f8251b == null) {
            this.f8256h.add(new j(i8));
            return;
        }
        k2.d dVar = this.f8252c;
        dVar.g(dVar.f5112m, ((float) i8) + 0.99f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.f8266s) {
            this.f8266s = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        k2.d dVar = this.f8252c;
        if (dVar == null) {
            return false;
        }
        return dVar.f5115p;
    }

    public final void j(String str) {
        f fVar = this.f8251b;
        if (fVar == null) {
            this.f8256h.add(new m(str));
            return;
        }
        d2.h c9 = fVar.c(str);
        if (c9 != null) {
            i((int) (c9.f4002b + c9.f4003c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final void k(float f9) {
        f fVar = this.f8251b;
        if (fVar == null) {
            this.f8256h.add(new k(f9));
            return;
        }
        float f10 = fVar.f8228k;
        float f11 = fVar.f8229l;
        PointF pointF = k2.f.f5117a;
        i((int) (f10 + (f9 * (f11 - f10))));
    }

    public final void l(String str) {
        f fVar = this.f8251b;
        ArrayList<n> arrayList = this.f8256h;
        if (fVar == null) {
            arrayList.add(new a(str));
            return;
        }
        d2.h c9 = fVar.c(str);
        if (c9 != null) {
            int i8 = (int) c9.f4002b;
            int i9 = ((int) c9.f4003c) + i8;
            if (this.f8251b == null) {
                arrayList.add(new m(this, i8, i9));
                return;
            }
            this.f8252c.g((float) i8, ((float) i9) + 0.99f);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final void m(int i8) {
        if (this.f8251b == null) {
            this.f8256h.add(new h(i8));
            return;
        }
        k2.d dVar = this.f8252c;
        dVar.g((float) i8, (float) ((int) dVar.f5113n));
    }

    public final void n(String str) {
        f fVar = this.f8251b;
        if (fVar == null) {
            this.f8256h.add(new C0156l(str));
            return;
        }
        d2.h c9 = fVar.c(str);
        if (c9 != null) {
            m((int) c9.f4002b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final void o(float f9) {
        f fVar = this.f8251b;
        if (fVar == null) {
            this.f8256h.add(new i(f9));
            return;
        }
        float f10 = fVar.f8228k;
        float f11 = fVar.f8229l;
        PointF pointF = k2.f.f5117a;
        m((int) (f10 + (f9 * (f11 - f10))));
    }

    public final void p(float f9) {
        f fVar = this.f8251b;
        if (fVar == null) {
            this.f8256h.add(new c(f9));
            return;
        }
        float f10 = fVar.f8228k;
        float f11 = fVar.f8229l;
        PointF pointF = k2.f.f5117a;
        this.f8252c.f(f10 + (f9 * (f11 - f10)));
        k3.j.s();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    public final void setAlpha(int i8) {
        this.f8262n = i8;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        k2.c.b("Use addColorFilter instead.");
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            f();
        }
    }

    public final void stop() {
        this.f8256h.clear();
        k2.d dVar = this.f8252c;
        dVar.e(true);
        boolean d9 = dVar.d();
        Iterator it = dVar.f5104g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(dVar, d9);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
