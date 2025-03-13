package com.samsung.android.wearable.watchfacestudio.editor;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.n;
import androidx.health.services.client.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;
import com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p5.a;
import q1.b;
import q1.d;
import r5.k;
import t1.r;
import u1.e;
import u1.l;
import u1.m;

public final class w extends n {
    public static final /* synthetic */ int A0 = 0;
    public final z Z;

    /* renamed from: a0  reason: collision with root package name */
    public EditorActivity f3929a0;

    /* renamed from: b0  reason: collision with root package name */
    public FrameLayout f3930b0;

    /* renamed from: c0  reason: collision with root package name */
    public k f3931c0;

    /* renamed from: d0  reason: collision with root package name */
    public b0 f3932d0;

    /* renamed from: e0  reason: collision with root package name */
    public a f3933e0;

    /* renamed from: f0  reason: collision with root package name */
    public r f3934f0;

    /* renamed from: g0  reason: collision with root package name */
    public f7.a f3935g0;

    /* renamed from: h0  reason: collision with root package name */
    public Map<Integer, b> f3936h0;

    /* renamed from: i0  reason: collision with root package name */
    public Map<Integer, p1.a> f3937i0 = new HashMap();

    /* renamed from: j0  reason: collision with root package name */
    public Instant f3938j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public e f3939k0;

    /* renamed from: l0  reason: collision with root package name */
    public l f3940l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f3941m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public ViewPager2 f3942n0;

    /* renamed from: o0  reason: collision with root package name */
    public MotionEvent f3943o0;

    /* renamed from: p0  reason: collision with root package name */
    public MotionEvent f3944p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3945q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3946r0 = 0;
    public TutorialView s0 = null;

    /* renamed from: t0  reason: collision with root package name */
    public o5.a f3947t0;
    public a u0;

    /* renamed from: v0  reason: collision with root package name */
    public ColorChip f3948v0;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView f3949w0;

    /* renamed from: x0  reason: collision with root package name */
    public VerticalOptionView f3950x0;
    public FrameLayout y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f3951z0;

    public w(z zVar) {
        this.Z = zVar;
    }

    public final void n() {
        this.f3948v0.setVisibility(8);
        this.f3949w0.setVisibility(8);
    }

    public final void o() {
        d dVar;
        d dVar2;
        Map<Integer, b> map = this.f3936h0;
        if (map == null) {
            Log.w("DWF:EditorFragment", "updateComplicationPreview: no preview data");
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            b bVar = (b) next.getValue();
            p1.a aVar = this.f3937i0.get(Integer.valueOf(intValue));
            if (bVar != null) {
                if (!(aVar == null || (dVar = bVar.f6418a) == (dVar2 = aVar.f6245d))) {
                    Log.w("DWF:EditorFragment", String.format("the type between complication provider and data is different: <%s/%s>: data(%s) <-> provider(%s)", new Object[]{aVar.f6242a, aVar.f6243b, dVar, dVar2}));
                }
                this.f3935g0.u(intValue, bVar, this.f3938j0, false);
            } else {
                Log.w("DWF:EditorFragment", "updateComplicationPreview: no complication data: " + intValue);
                if (aVar != null) {
                    this.f3935g0.u(intValue, (b) aVar.f6246f.getValue(), this.f3938j0, false);
                }
            }
        }
        if (this.f3951z0 == this.f3936h0.size()) {
            this.Z.b(this.f3931c0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = 0;
        this.f3930b0 = (FrameLayout) layoutInflater.inflate(R.layout.default_layout, viewGroup, false);
        k kVar = this.f3931c0;
        z zVar = this.Z;
        zVar.b(kVar);
        zVar.f3967c = new h(this, 2);
        FrameLayout frameLayout = this.f3930b0;
        if (!zVar.f3968d) {
            i8 = 8;
        }
        frameLayout.setVisibility(i8);
        return this.f3930b0;
    }

    public final void onDestroyView() {
        this.F = true;
        k kVar = this.f3931c0;
        if (kVar != null) {
            kVar.a();
            this.f3931c0 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x060b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r1 = r22
            android.content.res.Resources r0 = r22.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1.f3946r0 = r0
            androidx.fragment.app.s r0 = r22.getActivity()
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r0 = (com.samsung.android.wearable.watchfacestudio.editor.EditorActivity) r0
            r1.f3929a0 = r0
            if (r0 == 0) goto L_0x0613
            t1.r r0 = r0.f3864z
            r1.f3934f0 = r0
            java.lang.String r2 = "DWF:EditorFragment"
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "no editor session"
            goto L_0x0033
        L_0x0023:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            u1.e r0 = (u1.e) r0
            r1.f3939k0 = r0
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "no UserStyle"
        L_0x0033:
            android.util.Log.e(r2, r0)
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r0 = r1.f3929a0
            r0.finish()
            return
        L_0x003c:
            t1.r r0 = r1.f3934f0
            u1.l r0 = r0.e()
            r1.f3940l0 = r0
            t1.r r0 = r1.f3934f0
            a8.f r0 = r0.p()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            int r0 = r0.size()
            r1.f3951z0 = r0
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L_0x005c
            r5 = r3
            goto L_0x005d
        L_0x005c:
            r5 = r4
        L_0x005d:
            android.widget.FrameLayout r0 = r1.f3930b0
            r6 = -2146762316(0xffffffff800b01b4, float:-1.010801E-39)
            android.view.View r0 = r0.findViewById(r6)
            r6 = r0
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            android.widget.FrameLayout r0 = r1.f3930b0
            r7 = -2146762600(0xffffffff800b0098, float:-1.010403E-39)
            android.view.View r0 = r0.findViewById(r7)
            r7 = r0
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            android.widget.FrameLayout r0 = r1.f3930b0
            r8 = -2146762602(0xffffffff800b0096, float:-1.0104E-39)
            android.view.View r0 = r0.findViewById(r8)
            r8 = r0
            com.samsung.android.wearable.watchfacestudio.editor.ConfigPreview r8 = (com.samsung.android.wearable.watchfacestudio.editor.ConfigPreview) r8
            android.widget.FrameLayout r0 = r1.f3930b0
            r9 = -2146762400(0xffffffff800b0160, float:-1.010684E-39)
            android.view.View r0 = r0.findViewById(r9)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.y0 = r0
            android.widget.FrameLayout r0 = r1.f3930b0
            r9 = -2146762414(0xffffffff800b0152, float:-1.010664E-39)
            android.view.View r0 = r0.findViewById(r9)
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r1.f3942n0 = r0
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r0 = androidx.viewpager2.widget.ViewPager2.class
            java.lang.String r9 = "j"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r9)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            r0.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            androidx.viewpager2.widget.ViewPager2 r9 = r1.f3942n0     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r9 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.String r10 = "S"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            r9.setAccessible(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            java.lang.Object r10 = r9.get(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            int r10 = r10.intValue()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            int r10 = r10 * 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            r9.set(r0, r10)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x00cd }
            goto L_0x00d5
        L_0x00cd:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r2, r0)
        L_0x00d5:
            android.widget.FrameLayout r0 = r1.f3930b0
            r9 = -2146762257(0xffffffff800b01ef, float:-1.010884E-39)
            android.view.View r0 = r0.findViewById(r9)
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r0 = (com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView) r0
            r1.f3950x0 = r0
            android.widget.FrameLayout r9 = r1.y0
            com.samsung.android.wearable.watchfacestudio.editor.h r10 = new com.samsung.android.wearable.watchfacestudio.editor.h
            r10.<init>(r1, r4)
            com.samsung.android.wearable.watchfacestudio.editor.j r11 = new com.samsung.android.wearable.watchfacestudio.editor.j
            r11.<init>(r1)
            r0.I0 = r10
            r0.H0 = r11
            r0.requestFocus()
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView$RecyclerViewLinearLayoutManager r10 = new com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView$RecyclerViewLinearLayoutManager
            r0.getContext()
            r10.<init>()
            r0.J0 = r10
            r0.setLayoutManager(r10)
            h6.a r10 = new h6.a
            com.samsung.android.wearable.watchfacestudio.editor.m r11 = new com.samsung.android.wearable.watchfacestudio.editor.m
            r11.<init>(r0)
            r10.<init>(r11)
            com.samsung.android.wearable.watchfacestudio.editor.d0 r11 = new com.samsung.android.wearable.watchfacestudio.editor.d0
            r11.<init>(r10, r7)
            r0.setOnTouchListener(r11)
            android.content.Context r10 = r0.getContext()
            android.view.ViewConfiguration r10 = android.view.ViewConfiguration.get(r10)
            r0.getContext()
            float r10 = j0.z.b(r10)
            com.samsung.android.wearable.watchfacestudio.editor.c0 r11 = new com.samsung.android.wearable.watchfacestudio.editor.c0
            r11.<init>(r0, r10)
            r0.setOnGenericMotionListener(r11)
            com.samsung.android.wearable.watchfacestudio.editor.e0 r10 = new com.samsung.android.wearable.watchfacestudio.editor.e0
            r10.<init>(r0, r9)
            r0.g(r10)
            androidx.recyclerview.widget.p r9 = new androidx.recyclerview.widget.p
            r9.<init>()
            r9.a(r0)
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r0 = r1.f3950x0
            com.samsung.android.wearable.watchfacestudio.editor.s r9 = new com.samsung.android.wearable.watchfacestudio.editor.s
            r9.<init>(r1)
            r0.g(r9)
            r5.h r9 = new r5.h
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r0 = r1.f3929a0
            r9.<init>(r0)
            java.util.Map r0 = r9.b()
            android.widget.FrameLayout r10 = r1.f3930b0
            r11 = -2146762605(0xffffffff800b0093, float:-1.010396E-39)
            android.view.View r10 = r10.findViewById(r11)
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip r10 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip) r10
            r1.f3948v0 = r10
            android.widget.FrameLayout r10 = r1.f3930b0
            r11 = -2146762604(0xffffffff800b0094, float:-1.010398E-39)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1.f3949w0 = r10
            u1.l r10 = r1.f3940l0
            java.util.List<u1.m> r10 = r10.f7637a
            java.util.stream.Stream r10 = r10.stream()
            com.samsung.android.wearable.watchfacestudio.editor.q r11 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r11.<init>(r4)
            java.util.stream.Stream r10 = r10.filter(r11)
            java.util.Optional r10 = r10.findFirst()
            com.samsung.android.wearable.watchfacestudio.editor.r r11 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r11.<init>(r1, r4, r0)
            r10.ifPresent(r11)
            t1.f r0 = r9.f7096j
            java.lang.Object r0 = r0.f7429d
            java.time.Instant r0 = (java.time.Instant) r0
            r1.f3938j0 = r0
            if (r0 != 0) goto L_0x0197
            t1.r r0 = r1.f3934f0
            java.time.Instant r0 = r0.f7453i
            r1.f3938j0 = r0
        L_0x0197:
            f7.a r0 = new f7.a
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r4 = r1.f3929a0
            r0.<init>(r4)
            r1.f3935g0 = r0
            u1.l r0 = r1.f3940l0
            java.util.List<u1.m> r0 = r0.f7637a
            java.util.Iterator r0 = r0.iterator()
        L_0x01a8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r4 = r0.next()
            u1.m r4 = (u1.m) r4
            com.samsung.android.wearable.watchfacestudio.editor.a0 r10 = new com.samsung.android.wearable.watchfacestudio.editor.a0
            u1.e r11 = r1.f3939k0
            r10.<init>(r11, r4)
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r4 = r1.f3950x0
            java.util.ArrayList r4 = r4.C0
            r4.add(r10)
            goto L_0x01a8
        L_0x01c3:
            java.util.ArrayList r4 = r1.f3941m0
            if (r5 == 0) goto L_0x0316
            java.util.List r0 = r9.a()
            i5.j r10 = new i5.j
            r10.<init>(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.forEach(r10)
            e6.b r10 = new e6.b
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x01de:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01f8
            java.lang.Object r12 = r11.next()
            x5.c r12 = (x5.c) r12
            int r13 = r12.f8147a
            java.util.HashMap r14 = r10.f4255a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r12 = r12.f8148b
            r14.put(r13, r12)
            goto L_0x01de
        L_0x01f8:
            f7.a r11 = r1.f3935g0
            r11.f4259k = r10
            t1.r r10 = r1.f3934f0
            a8.f r10 = r10.p()
            java.lang.Object r10 = r10.getValue()
            java.util.Map r10 = (java.util.Map) r10
            java.util.LinkedList r11 = new java.util.LinkedList
            java.util.Set r10 = r10.entrySet()
            r11.<init>(r10)
            java.util.Comparator r10 = java.util.Map.Entry.comparingByKey()
            r11.sort(r10)
            java.util.Iterator r10 = r11.iterator()
        L_0x021c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02f7
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            o1.a r12 = (o1.a) r12
            boolean r12 = r12.f5994h
            if (r12 != 0) goto L_0x02e4
            l5.a r12 = new l5.a
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r13 = r1.f3929a0
            r12.<init>(r13)
            java.lang.Object r13 = r11.getKey()
            java.lang.Integer r13 = (java.lang.Integer) r13
            java.lang.Object r11 = r11.getValue()
            o1.a r11 = (o1.a) r11
            java.util.List<q1.d> r11 = r11.f5990c
            g6.c r14 = r9.c()
            java.util.stream.Stream r15 = r0.stream()
            r23 = r10
            com.samsung.android.wearable.watchfacestudio.editor.o r10 = new com.samsung.android.wearable.watchfacestudio.editor.o
            r10.<init>(r3, r13)
            java.util.stream.Stream r10 = r15.filter(r10)
            java.util.Optional r10 = r10.findFirst()
            com.samsung.android.wearable.watchfacestudio.editor.p r15 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r15.<init>(r3)
            java.util.Optional r3 = r10.map(r15)
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            java.lang.Object r3 = r3.orElse(r10)
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            android.graphics.RectF r10 = new android.graphics.RectF
            float r15 = r3.left
            r24 = r8
            int r8 = r14.e
            float r8 = (float) r8
            float r15 = r15 / r8
            r20 = r5
            float r5 = r3.top
            int r14 = r14.f4674f
            float r14 = (float) r14
            float r5 = r5 / r14
            r21 = r6
            float r6 = r3.right
            float r6 = r6 / r8
            float r3 = r3.bottom
            float r3 = r3 / r14
            r10.<init>(r15, r5, r6, r3)
            java.util.stream.Stream r3 = r0.stream()
            com.samsung.android.wearable.watchfacestudio.editor.o r5 = new com.samsung.android.wearable.watchfacestudio.editor.o
            r6 = 0
            r5.<init>(r6, r13)
            java.util.stream.Stream r3 = r3.filter(r5)
            java.util.Optional r3 = r3.findFirst()
            com.samsung.android.wearable.watchfacestudio.editor.p r5 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5.<init>(r6)
            java.util.Optional r3 = r3.map(r5)
            r5 = 0
            java.lang.Object r3 = r3.orElse(r5)
            r18 = r3
            y5.e r18 = (y5.e) r18
            android.util.Size r3 = new android.util.Size
            g6.c r5 = r9.c()
            int r5 = r5.e
            g6.c r6 = r9.c()
            int r6 = r6.f4674f
            r3.<init>(r5, r6)
            com.samsung.android.wearable.watchfacestudio.editor.h r5 = new com.samsung.android.wearable.watchfacestudio.editor.h
            r6 = 1
            r5.<init>(r1, r6)
            r12.f5312d = r5
            r12.e = r13
            l5.a$a r5 = new l5.a$a
            int r15 = r13.intValue()
            r14 = r5
            r16 = r11
            r17 = r10
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r12.f5311c = r5
            r4.add(r12)
            goto L_0x02ec
        L_0x02e4:
            r20 = r5
            r21 = r6
            r24 = r8
            r23 = r10
        L_0x02ec:
            r3 = 1
            r10 = r23
            r8 = r24
            r5 = r20
            r6 = r21
            goto L_0x021c
        L_0x02f7:
            r20 = r5
            r21 = r6
            r24 = r8
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x031c
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r0 = r1.f3950x0
            l5.b r3 = new l5.b
            com.samsung.android.wearable.watchfacestudio.editor.k r5 = new com.samsung.android.wearable.watchfacestudio.editor.k
            r6 = 0
            r5.<init>(r6, r7)
            r3.<init>(r5)
            java.util.ArrayList r0 = r0.C0
            r0.add(r3)
            goto L_0x031c
        L_0x0316:
            r20 = r5
            r21 = r6
            r24 = r8
        L_0x031c:
            p5.a r0 = new p5.a
            android.widget.FrameLayout r3 = r1.f3930b0
            r0.<init>(r3)
            r1.f3933e0 = r0
            com.samsung.android.wearable.watchfacestudio.editor.a r3 = new com.samsung.android.wearable.watchfacestudio.editor.a
            android.widget.FrameLayout r0 = r1.f3930b0
            r5 = -2146762380(0xffffffff800b0174, float:-1.010712E-39)
            android.view.View r0 = r0.findViewById(r5)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            t1.r r12 = r1.f3934f0
            u1.e r0 = r1.f3939k0
            r0.getClass()
            u1.d r13 = new u1.d
            r13.<init>(r0)
            com.samsung.android.wearable.watchfacestudio.editor.l r14 = new com.samsung.android.wearable.watchfacestudio.editor.l
            r14.<init>(r1)
            java.lang.Class<android.os.Build$VERSION> r0 = android.os.Build.VERSION.class
            java.lang.String r5 = "SEM_PLATFORM_INT"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r5)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x035a }
            r5 = 0
            int r0 = r0.getInt(r5)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x0358 }
            r6 = 120000(0x1d4c0, float:1.68156E-40)
            if (r0 <= r6) goto L_0x0371
            r0 = 1
            goto L_0x0372
        L_0x0358:
            r0 = move-exception
            goto L_0x035c
        L_0x035a:
            r0 = move-exception
            r5 = 0
        L_0x035c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Button Enabled : "
            r6.<init>(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.i(r2, r0)
        L_0x0371:
            r0 = 0
        L_0x0372:
            r15 = r0
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r1.u0 = r3
            com.samsung.android.wearable.watchfacestudio.editor.b0 r0 = new com.samsung.android.wearable.watchfacestudio.editor.b0
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r3 = r1.f3929a0
            java.util.Map r6 = r9.b()
            u1.e r7 = r1.f3939k0
            r0.<init>(r3, r6, r7)
            r1.f3932d0 = r0
            androidx.viewpager2.widget.ViewPager2 r0 = r1.f3942n0
            com.samsung.android.wearable.watchfacestudio.editor.t r3 = new com.samsung.android.wearable.watchfacestudio.editor.t
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r6 = r1.f3929a0
            r3.<init>(r1, r6)
            r0.setAdapter(r3)
            com.google.android.material.tabs.e r0 = new com.google.android.material.tabs.e
            androidx.viewpager2.widget.ViewPager2 r3 = r1.f3942n0
            androidx.health.services.client.impl.d r6 = new androidx.health.services.client.impl.d
            r7 = 8
            r6.<init>(r7)
            r7 = r21
            r0.<init>(r7, r3, r6)
            boolean r6 = r0.e
            if (r6 != 0) goto L_0x060b
            androidx.recyclerview.widget.RecyclerView$d r6 = r3.getAdapter()
            r0.f3432d = r6
            if (r6 == 0) goto L_0x0603
            r6 = 1
            r0.e = r6
            com.google.android.material.tabs.e$c r8 = new com.google.android.material.tabs.e$c
            r8.<init>(r7)
            androidx.viewpager2.widget.a r10 = r3.f1990c
            java.util.ArrayList r10 = r10.f2019a
            r10.add(r8)
            com.google.android.material.tabs.e$d r8 = new com.google.android.material.tabs.e$d
            r8.<init>(r3, r6)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r6 = r7.G
            boolean r10 = r6.contains(r8)
            if (r10 != 0) goto L_0x03cf
            r6.add(r8)
        L_0x03cf:
            com.google.android.material.tabs.e$a r6 = new com.google.android.material.tabs.e$a
            r6.<init>()
            androidx.recyclerview.widget.RecyclerView$d<?> r8 = r0.f3432d
            androidx.recyclerview.widget.RecyclerView$e r8 = r8.f1649a
            r8.registerObserver(r6)
            r0.a()
            int r0 = r3.getCurrentItem()
            r3 = 0
            r6 = 1
            r7.k(r0, r3, r6, r6)
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r0 = r1.f3950x0
            android.widget.FrameLayout r6 = r1.y0
            r7 = 0
            r1.p(r0, r6, r7)
            m5.d r0 = new m5.d
            android.widget.FrameLayout r6 = r1.y0
            u1.l r7 = r1.f3940l0
            java.util.List<u1.m> r7 = r7.f7637a
            int r7 = r7.size()
            if (r20 == 0) goto L_0x03fe
            goto L_0x03ff
        L_0x03fe:
            r4 = r5
        L_0x03ff:
            r0.<init>(r6, r7, r4)
            androidx.viewpager2.widget.ViewPager2 r4 = r1.f3942n0
            com.samsung.android.wearable.watchfacestudio.editor.v r5 = new com.samsung.android.wearable.watchfacestudio.editor.v
            r5.<init>(r1, r0)
            androidx.viewpager2.widget.a r0 = r4.f1990c
            java.util.ArrayList r0 = r0.f2019a
            r0.add(r5)
            androidx.viewpager2.widget.ViewPager2 r0 = r1.f3942n0
            r4 = 0
            android.view.View r0 = r0.getChildAt(r4)
            com.samsung.android.wearable.watchfacestudio.editor.k r4 = new com.samsung.android.wearable.watchfacestudio.editor.k
            r5 = 1
            r4.<init>(r5, r1)
            r0.setOnTouchListener(r4)
            r5.k r0 = new r5.k
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r11 = r1.f3929a0
            java.util.Objects.requireNonNull(r24)
            com.samsung.android.wearable.watchfacestudio.editor.m r12 = new com.samsung.android.wearable.watchfacestudio.editor.m
            r4 = r24
            r12.<init>(r4)
            com.samsung.android.wearable.watchfacestudio.editor.b0 r14 = r1.f3932d0
            f7.a r15 = r1.f3935g0
            d6.f r13 = new d6.f
            r13.<init>(r11, r5)
            r16 = 1
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.f3931c0 = r0
            r5 = 0
            r0.d(r9, r5)
            r5.k r0 = r1.f3931c0
            v5.b r0 = r0.f7113k
            d6.d r0 = r0.f7952a
            boolean r5 = r0.f4058j
            r6 = 1
            if (r5 == r6) goto L_0x0453
            r0.f4058j = r6
            r0.r()
        L_0x0453:
            r5.k r0 = r1.f3931c0
            r4.f3862d = r0
            java.time.Instant r4 = r1.f3938j0
            java.time.ZonedDateTime r4 = r5.k.e(r4)
            r0.h(r4)
            r5.k r0 = r1.f3931c0
            r0.g()
            if (r20 == 0) goto L_0x0496
            t1.r r0 = r1.f3934f0
            a8.f r0 = r0.r()
            androidx.lifecycle.g r0 = a1.a.g(r0)
            androidx.lifecycle.r r4 = r22.getViewLifecycleOwner()
            com.samsung.android.wearable.watchfacestudio.editor.h r5 = new com.samsung.android.wearable.watchfacestudio.editor.h
            r6 = 4
            r5.<init>(r1, r6)
            r0.d(r4, r5)
            t1.r r0 = r1.f3934f0
            a8.f r0 = r0.K()
            androidx.lifecycle.g r0 = a1.a.g(r0)
            androidx.lifecycle.r r4 = r22.getViewLifecycleOwner()
            com.samsung.android.wearable.watchfacestudio.editor.h r5 = new com.samsung.android.wearable.watchfacestudio.editor.h
            r6 = 5
            r5.<init>(r1, r6)
            r0.d(r4, r5)
            goto L_0x049d
        L_0x0496:
            com.samsung.android.wearable.watchfacestudio.editor.z r0 = r1.Z
            r5.k r4 = r1.f3931c0
            r0.b(r4)
        L_0x049d:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r4 = "samsung"
            boolean r0 = r0.startsWith(r4)
            if (r0 == 0) goto L_0x0613
            o5.a r0 = new o5.a
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r4 = r1.f3929a0
            r0.<init>(r4)
            r1.f3947t0 = r0
            java.lang.String r5 = "pref_key_tutorial_key"
            android.content.SharedPreferences r6 = r0.f6119b
            r7 = 0
            boolean r5 = r6.getBoolean(r5, r7)
            r0.f6120c = r5
            if (r5 != 0) goto L_0x0520
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r4 = o5.a.f6117d
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r4
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)
            java.lang.String r6 = "DWF:TutorialStatusCheck"
            if (r5 != 0) goto L_0x04e2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "failed to get contents from "
            r0.<init>(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r6, r0)
            goto L_0x0520
        L_0x04e2:
            boolean r4 = r5.moveToFirst()
            if (r4 == 0) goto L_0x0518
            java.lang.String r4 = "settings"
            int r4 = r5.getColumnIndex(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "data from url: id = "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = ", settingVal = "
            r7.append(r8)
            java.lang.String r8 = r5.getString(r4)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.i(r6, r7)
            java.lang.String r4 = r5.getString(r4)
            java.lang.String r6 = "true"
            boolean r4 = r4.equals(r6)
            r0.f6120c = r4
            goto L_0x051d
        L_0x0518:
            java.lang.String r0 = "cursor.moveToFirst failed!!"
            android.util.Log.e(r6, r0)
        L_0x051d:
            r5.close()
        L_0x0520:
            o5.a r0 = r1.f3947t0
            boolean r0 = r0.f6120c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "skip tutorial = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r2, r4)
            if (r0 != 0) goto L_0x0613
            java.lang.String r0 = "showTutorialView started"
            android.util.Log.i(r2, r0)
            com.samsung.android.wearable.watchfacestudio.editor.a r0 = r1.u0
            com.samsung.android.wearable.watchfacestudio.editor.a$a r0 = r0.f3869d
            r2 = 0
            r0.b(r2)
            android.widget.FrameLayout r0 = r1.f3930b0
            r2 = -2146762265(0xffffffff800b01e7, float:-1.010873E-39)
            android.view.View r0 = r0.findViewById(r2)
            com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView r0 = (com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView) r0
            r1.s0 = r0
            android.content.Context r2 = r0.getContext()
            java.lang.String r4 = "layout_inflater"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            r4 = -2146566012(0xffffffff800e0084, float:-1.285882E-39)
            r5 = 0
            android.view.View r2 = r2.inflate(r4, r0, r5)
            r2.requestFocus()
            o5.b r4 = new o5.b
            r4.<init>(r0)
            r2.setOnGenericMotionListener(r4)
            r0.addView(r2)
            com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView$b r2 = com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView.b.f3920f
            r0.f3912b = r2
            r2 = -2146762256(0xffffffff800b01f0, float:-1.010886E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r0.f3913c = r2
            r2 = -2146762510(0xffffffff800b00f2, float:-1.01053E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.e = r2
            r4 = 1061158912(0x3f400000, float:0.75)
            int r5 = android.graphics.Color.argb(r4, r3, r3, r3)
            r2.setBackgroundColor(r5)
            r2 = -2146762264(0xffffffff800b01e8, float:-1.010874E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f3916g = r2
            r5 = 1064514355(0x3f733333, float:0.95)
            r2.setLineSpacing(r3, r5)
            r2 = -2146762508(0xffffffff800b00f4, float:-1.010532E-39)
            android.view.View r2 = r0.findViewById(r2)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            r0.f3918i = r2
            r2 = -2146762507(0xffffffff800b00f5, float:-1.010534E-39)
            android.view.View r2 = r0.findViewById(r2)
            com.airbnb.lottie.LottieAnimationView r2 = (com.airbnb.lottie.LottieAnimationView) r2
            r0.f3919j = r2
            r2 = -2146762255(0xffffffff800b01f1, float:-1.010887E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r0.f3914d = r2
            r2 = -2146762509(0xffffffff800b00f3, float:-1.010531E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f3915f = r2
            int r4 = android.graphics.Color.argb(r4, r3, r3, r3)
            r2.setBackgroundColor(r4)
            r2 = -2146762263(0xffffffff800b01e9, float:-1.010876E-39)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f3917h = r2
            r2.setLineSpacing(r3, r5)
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x05f1
            r0.a()
        L_0x05f1:
            com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView r0 = r1.s0
            r2 = 0
            r0.setVisibility(r2)
            com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView r0 = r1.s0
            com.samsung.android.wearable.watchfacestudio.editor.h r2 = new com.samsung.android.wearable.watchfacestudio.editor.h
            r3 = 3
            r2.<init>(r1, r3)
            r0.setOnTutorialFinished(r2)
            goto L_0x0613
        L_0x0603:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator attached before ViewPager2 has an adapter"
            r0.<init>(r1)
            throw r0
        L_0x060b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TabLayoutMediator is already attached"
            r0.<init>(r1)
            throw r0
        L_0x0613:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.editor.w.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void p(VerticalOptionView verticalOptionView, FrameLayout frameLayout, int i8) {
        RecyclerView.d dVar = (RecyclerView.d) verticalOptionView.C0.get(i8);
        verticalOptionView.setAdapter(dVar);
        boolean z8 = dVar instanceof a0;
        ArrayList arrayList = this.f3941m0;
        if (z8) {
            a0 a0Var = (a0) dVar;
            m mVar = a0Var.f3872d;
            this.f3933e0.a(mVar.c(), mVar.b(), i8);
            frameLayout.setContentDescription((CharSequence) a0Var.e.get(a0Var.f3873f));
            verticalOptionView.Z(a0Var.f3873f);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
            if (mVar.f7641a.f7683a.equals("themeColor")) {
                this.f3948v0.setVisibility(0);
                this.f3949w0.setVisibility(0);
                return;
            }
        } else if (dVar instanceof l5.b) {
            this.f3933e0.a(this.f3929a0.getResources().getText(R.string.complication), "", i8);
            frameLayout.setContentDescription("");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(0);
            }
        } else {
            return;
        }
        n();
    }
}
