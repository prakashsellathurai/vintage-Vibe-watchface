package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import h7.h;
import java.util.ArrayList;
import p7.a;
import q7.l;
import q7.p;
import u1.m;

public final class o extends l implements a<h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ XmlResourceParser f7702f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList<m.c.b> f7703g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Resources f7704h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ float f7705i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f7706j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<m.i> f7707k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(XmlResourceParser xmlResourceParser, ArrayList<m.c.b> arrayList, Resources resources, float f9, float f10, p<m.i> pVar) {
        super(0);
        this.f7702f = xmlResourceParser;
        this.f7703g = arrayList;
        this.f7704h = resources;
        this.f7705i = f9;
        this.f7706j = f10;
        this.f7707k = pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: android.graphics.drawable.Icon} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.graphics.drawable.Icon} */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            android.content.res.XmlResourceParser r1 = r0.f7702f
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "ComplicationSlotOverlay"
            boolean r3 = q7.k.a(r2, r3)
            r4 = 0
            java.lang.String r5 = "resources"
            android.content.res.Resources r6 = r0.f7704h
            if (r3 == 0) goto L_0x0098
            q7.k.e(r6, r5)
            java.lang.String r2 = "complicationSlotId"
            java.lang.Integer r2 = k3.j.y(r6, r1, r2)
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0024
            r7 = r3
            goto L_0x0025
        L_0x0024:
            r7 = r5
        L_0x0025:
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "enabled"
            boolean r8 = k3.j.F(r1, r7)
            java.lang.String r9 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x003b
            boolean r3 = r1.getAttributeBooleanValue(r9, r7, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r12 = r3
            goto L_0x003c
        L_0x003b:
            r12 = r4
        L_0x003c:
            java.lang.String r3 = "accessibilityTraversalIndex"
            boolean r7 = k3.j.F(r1, r3)
            if (r7 == 0) goto L_0x004e
            int r3 = r1.getAttributeIntValue(r9, r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14 = r3
            goto L_0x004f
        L_0x004e:
            r14 = r4
        L_0x004f:
            java.lang.String r3 = "name"
            boolean r7 = k3.j.F(r1, r3)
            if (r7 == 0) goto L_0x0061
            int r3 = r1.getAttributeResourceValue(r9, r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15 = r3
            goto L_0x0062
        L_0x0061:
            r15 = r4
        L_0x0062:
            java.lang.String r3 = "screenReaderName"
            boolean r7 = k3.j.F(r1, r3)
            if (r7 == 0) goto L_0x0072
            int r3 = r1.getAttributeResourceValue(r9, r3, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L_0x0072:
            r16 = r4
            float r3 = r0.f7705i
            float r4 = r0.f7706j
            p1.f r13 = p1.f.a.a(r6, r1, r3, r4)
            u1.m$c$b r1 = new u1.m$c$b
            int r11 = r2.intValue()
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.ArrayList<u1.m$c$b> r0 = r0.f7703g
            r0.add(r1)
            goto L_0x00c3
        L_0x008c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ComplicationSlotOverlay missing complicationSlotId"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            java.lang.String r3 = "OnWatchEditorData"
            boolean r2 = q7.k.a(r2, r3)
            if (r2 == 0) goto L_0x00cc
            q7.p<u1.m$i> r0 = r0.f7707k
            T r2 = r0.f6643f
            if (r2 != 0) goto L_0x00c6
            q7.k.e(r6, r5)
            java.lang.String r2 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "icon"
            r5 = -1
            int r1 = r1.getAttributeResourceValue(r2, r3, r5)
            if (r1 == r5) goto L_0x00bc
            java.lang.String r2 = r6.getResourcePackageName(r1)
            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r2, r1)
        L_0x00bc:
            u1.m$i r1 = new u1.m$i
            r1.<init>(r4)
            r0.f6643f = r1
        L_0x00c3:
            h7.h r0 = h7.h.f4787a
            return r0
        L_0x00c6:
            p1.h r0 = new p1.h
            r0.<init>(r1)
            throw r0
        L_0x00cc:
            p1.h r0 = new p1.h
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.o.invoke():java.lang.Object");
    }
}
