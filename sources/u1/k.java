package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import h7.h;
import java.util.ArrayList;
import java.util.HashMap;
import p7.a;
import q7.l;

public final class k extends l implements a<h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ XmlResourceParser f7631f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList<m> f7632g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Resources f7633h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ float f7634i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f7635j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ HashMap<String, m> f7636k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(XmlResourceParser xmlResourceParser, ArrayList<m> arrayList, Resources resources, float f9, float f10, HashMap<String, m> hashMap) {
        super(0);
        this.f7631f = xmlResourceParser;
        this.f7632g = arrayList;
        this.f7633h = resources;
        this.f7634i = f9;
        this.f7635j = f10;
        this.f7636k = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r6 = r6.f7632g;
        r6.add(r0);
        r3.put(((u1.m) i7.i.X(r6)).f7641a.f7683a, i7.i.X(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        return h7.h.f4787a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            android.content.res.XmlResourceParser r0 = r6.f7631f
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L_0x007b
            int r2 = r1.hashCode()
            java.util.HashMap<java.lang.String, u1.m> r3 = r6.f7636k
            android.content.res.Resources r4 = r6.f7633h
            switch(r2) {
                case -999148874: goto L_0x0054;
                case -9090837: goto L_0x0045;
                case 703102305: goto L_0x0032;
                case 1357975282: goto L_0x0023;
                case 1585775528: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x007b
        L_0x0014:
            java.lang.String r2 = "ListUserStyleSetting"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007b
            u1.m$f$a r1 = u1.m.f.f7684k
            u1.m$f r0 = r1.a(r4, r0, r3)
            goto L_0x0062
        L_0x0023:
            java.lang.String r2 = "BooleanUserStyleSetting"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007b
            u1.m$a$b r1 = u1.m.a.f7649k
            u1.m$a r0 = r1.a(r4, r0)
            goto L_0x0062
        L_0x0032:
            java.lang.String r2 = "ComplicationSlotsUserStyleSetting"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007b
            u1.m$c$a r1 = u1.m.c.f7667k
            float r2 = r6.f7634i
            float r5 = r6.f7635j
            u1.m$c r0 = r1.a(r4, r0, r2, r5)
            goto L_0x0062
        L_0x0045:
            java.lang.String r2 = "LongRangeUserStyleSetting"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007b
            u1.m$g$a r1 = u1.m.g.f7689k
            u1.m$g r0 = r1.a(r4, r0)
            goto L_0x0062
        L_0x0054:
            java.lang.String r2 = "DoubleRangeUserStyleSetting"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007b
            u1.m$d$a r1 = u1.m.d.f7678k
            u1.m$d r0 = r1.a(r4, r0)
        L_0x0062:
            java.util.ArrayList<u1.m> r6 = r6.f7632g
            r6.add(r0)
            java.lang.Object r0 = i7.i.X(r6)
            u1.m r0 = (u1.m) r0
            u1.m$e r0 = r0.f7641a
            java.lang.String r0 = r0.f7683a
            java.lang.Object r6 = i7.i.X(r6)
            r3.put(r0, r6)
            h7.h r6 = h7.h.f4787a
            return r6
        L_0x007b:
            p1.h r6 = new p1.h
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.k.invoke():java.lang.Object");
    }
}
