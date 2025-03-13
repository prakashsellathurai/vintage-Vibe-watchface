package o6;

import a1.a;
import b0.c;
import c7.o;
import i5.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Predicate;
import s5.d;

public abstract class q extends d implements k {

    /* renamed from: b  reason: collision with root package name */
    public String f6174b;

    /* renamed from: c  reason: collision with root package name */
    public q f6175c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f6176d = new ArrayList();
    public boolean e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6177f = true;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f6178g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public r5.d f6179h = null;

    public q(q qVar) {
        this.f6175c = qVar;
        if (qVar != null) {
            qVar.o(this);
            this.f6177f = qVar.isEnabled();
        }
    }

    public boolean isEnabled() {
        return this.e && this.f6177f;
    }

    public final ArrayList l(a aVar, Predicate predicate, o oVar) {
        ArrayList arrayList = new ArrayList();
        if (!((com.samsung.android.wearable.watchfacestudio.editor.q) predicate).test(this)) {
            return arrayList;
        }
        x();
        return u(aVar, predicate, oVar);
    }

    public final void m(l lVar, Predicate<q> predicate) {
        if (((com.samsung.android.wearable.watchfacestudio.editor.q) predicate).test(this)) {
            x();
            v(lVar, predicate);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Stack<android.graphics.Matrix>, java.util.Stack] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(androidx.health.services.client.impl.k r4, java.util.function.Predicate<o6.q> r5, java.util.Stack<android.graphics.Matrix> r6) {
        /*
            r3 = this;
            r0 = r5
            e6.a r0 = (e6.a) r0
            boolean r1 = r0.test(r3)
            if (r1 == 0) goto L_0x007c
            r3.x()
            boolean r1 = r3.s()
            if (r1 == 0) goto L_0x0028
            android.graphics.Matrix r1 = new android.graphics.Matrix
            java.lang.Object r2 = r6.peek()
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r1.<init>(r2)
            r2 = r3
            o6.g r2 = (o6.g) r2
            android.graphics.Matrix r2 = r2.f6138l
            r1.preConcat(r2)
            r6.push(r1)
        L_0x0028:
            java.util.ArrayList r1 = r3.f6176d
            int r2 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L_0x0032:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.previous()
            o6.q r2 = (o6.q) r2
            r2.n(r4, r5, r6)
            goto L_0x0032
        L_0x0042:
            boolean r5 = r3.s()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r6.pop()
            goto L_0x0051
        L_0x004d:
            java.lang.Object r5 = r6.peek()
        L_0x0051:
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            boolean r6 = r0.test(r3)
            if (r6 == 0) goto L_0x007c
            java.lang.Object r6 = r4.f1393b
            o6.t r6 = (o6.t) r6
            java.lang.Object r0 = r4.f1395d
            r5.b r0 = (r5.b) r0
            java.lang.Object r4 = r4.f1394c
            android.graphics.Point r4 = (android.graphics.Point) r4
            r6.getClass()
            boolean r1 = r3.s()
            if (r1 == 0) goto L_0x007c
            o6.g r3 = (o6.g) r3
            java.lang.String r0 = r0.toString()
            boolean r4 = r3.F(r0, r5, r4)
            if (r4 == 0) goto L_0x007c
            r6.H = r3
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.q.n(androidx.health.services.client.impl.k, java.util.function.Predicate, java.util.Stack):void");
    }

    public void o(q qVar) {
        this.f6176d.add(qVar);
    }

    public final void p(j jVar, d dVar) {
        this.f6178g.add(jVar);
        if (dVar != null) {
            dVar.k(new c(this, 16, jVar));
        }
    }

    public String q() {
        return "";
    }

    public void r() {
        ArrayList arrayList = this.f6176d;
        arrayList.forEach(new j(7));
        arrayList.clear();
        this.f6178g.clear();
        this.f6175c = null;
        this.f6179h = null;
        this.f7217a.forEach(new j(3));
    }

    public boolean s() {
        return false;
    }

    public final void t() {
        Iterator it = this.f6178g.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b(isEnabled());
        }
    }

    public ArrayList u(a aVar, Predicate predicate, o oVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            ArrayList l8 = ((q) it.next()).l(aVar, predicate, oVar);
            if (l8 != null) {
                arrayList.addAll(l8);
            }
        }
        return arrayList;
    }

    public void v(l lVar, Predicate<q> predicate) {
        if (lVar.b(this)) {
            ListIterator listIterator = this.f6176d.listIterator();
            while (listIterator.hasNext()) {
                ((q) listIterator.next()).m(lVar, predicate);
            }
        }
    }

    public void w() {
    }

    public void x() {
    }

    public final void y(boolean z8) {
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            qVar.f6177f = z8;
            if (qVar.e) {
                qVar.w();
                qVar.y(z8 && this.e);
                qVar.t();
            }
        }
    }

    public final void z(boolean z8) {
        if (this.e != z8) {
            this.e = z8;
            w();
            y(z8);
            t();
        }
    }
}
