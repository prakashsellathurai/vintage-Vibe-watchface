package s5;

import com.samsung.android.wearable.watchfacestudio.editor.r;
import i6.e;
import java.util.HashMap;
import o6.q;
import w5.c;
import w5.f;
import w5.g;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<q, e> f7232a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final r5.e f7233b;

    public i(r5.e eVar) {
        this.f7233b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[LOOP:1: B:10:0x0035->B:13:0x003d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(o6.q r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.HashMap<o6.q, i6.e> r0 = r3.f7232a
            java.lang.Object r0 = r0.get(r4)
            i6.e r0 = (i6.e) r0
            if (r0 == 0) goto L_0x002d
            java.util.ArrayList r0 = r0.f4863b
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()
            i6.e r1 = (i6.e) r1
            java.lang.String r2 = "id"
            i6.a r2 = r1.b(r2)
            java.lang.String r2 = r2.d()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0035
            r5.e r3 = r3.f7233b
            s5.u.c(r3, r1, r4)
        L_0x0035:
            if (r4 == 0) goto L_0x0040
            boolean r3 = r4.s()
            if (r3 != 0) goto L_0x0040
            o6.q r4 = r4.f6175c
            goto L_0x0035
        L_0x0040:
            o6.g r4 = (o6.g) r4
            if (r4 == 0) goto L_0x0047
            r4.K()
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.i.a(o6.q, java.lang.String):void");
    }

    public final void g(c cVar, f fVar) {
        this.f7232a.keySet().stream().filter(new r5.g(1, cVar.f8018a.substring(14))).forEach(new r(this, 3, fVar));
    }
}
