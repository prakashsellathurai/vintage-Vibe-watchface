package com.samsung.android.wearable.watchfacestudio.editor;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class e0 extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerticalOptionView f3887b;

    public e0(VerticalOptionView verticalOptionView, FrameLayout frameLayout) {
        this.f3887b = verticalOptionView;
        this.f3886a = frameLayout;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [androidx.recyclerview.widget.RecyclerView$a0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, androidx.recyclerview.widget.RecyclerView r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x00e4
            int r9 = com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView.K0
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r9 = r8.f3887b
            r9.getClass()
            int r0 = r10.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r1
            androidx.recyclerview.widget.b r1 = r10.e
            int r1 = r1.e()
        L_0x001d:
            int r1 = r1 + -1
            r3 = 0
            if (r1 < 0) goto L_0x0059
            androidx.recyclerview.widget.b r4 = r10.e
            android.view.View r4 = r4.d(r1)
            float r5 = r4.getTranslationX()
            float r6 = r4.getTranslationY()
            int r7 = r4.getLeft()
            float r7 = (float) r7
            float r7 = r7 + r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x001d
            int r7 = r4.getRight()
            float r7 = (float) r7
            float r7 = r7 + r5
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x001d
            int r5 = r4.getTop()
            float r5 = (float) r5
            float r5 = r5 + r6
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x001d
            int r5 = r4.getBottom()
            float r5 = (float) r5
            float r5 = r5 + r6
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x001d
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 == 0) goto L_0x0067
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r10.H(r4)
            boolean r1 = r0 instanceof com.samsung.android.wearable.watchfacestudio.editor.a0.a
            if (r1 == 0) goto L_0x0067
            r3 = r0
            com.samsung.android.wearable.watchfacestudio.editor.a0$a r3 = (com.samsung.android.wearable.watchfacestudio.editor.a0.a) r3
        L_0x0067:
            if (r3 == 0) goto L_0x00e4
            androidx.recyclerview.widget.RecyclerView$d r10 = r10.getAdapter()
            com.samsung.android.wearable.watchfacestudio.editor.a0 r10 = (com.samsung.android.wearable.watchfacestudio.editor.a0) r10
            if (r10 == 0) goto L_0x00e4
            int r0 = r3.c()
            r1 = 1
            r2 = 0
            u1.m r4 = r10.f3872d
            if (r0 < 0) goto L_0x0087
            java.util.List<u1.m$h> r5 = r4.f7645f
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0087
            r10.f3873f = r0
            r0 = r1
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            if (r0 == 0) goto L_0x00e4
            r9.f0(r2)
            boolean r0 = r9.G0
            if (r0 == 0) goto L_0x0093
            r9.G0 = r2
        L_0x0093:
            com.samsung.android.wearable.watchfacestudio.editor.x r9 = r9.I0
            u1.m$h r0 = r3.f3874u
            com.samsung.android.wearable.watchfacestudio.editor.h r9 = (com.samsung.android.wearable.watchfacestudio.editor.h) r9
            com.samsung.android.wearable.watchfacestudio.editor.w r9 = r9.f3893b
            com.samsung.android.wearable.watchfacestudio.editor.a r3 = r9.u0
            u1.d r5 = r3.f3867b
            r5.i(r4, r0)
            com.samsung.android.wearable.watchfacestudio.editor.a$a r3 = r3.f3869d
            r3.a()
            com.samsung.android.wearable.watchfacestudio.editor.b0 r9 = r9.f3932d0
            r9.getClass()
            u1.m$e r3 = r4.f7641a
            java.lang.String r5 = r3.f7683a
            java.util.Map<java.lang.String, b6.b> r6 = r9.f4047j
            java.lang.Object r5 = r6.get(r5)
            b6.b r5 = (b6.b) r5
            java.util.ArrayList r0 = g7.a.a(r5, r0)
            java.lang.Object r2 = r0.get(r2)
            w5.f r2 = (w5.f) r2
            java.lang.String r3 = r3.f7683a
            r9.q(r3, r2)
            int r2 = r0.size()
            if (r2 <= r1) goto L_0x00d5
            i5.g r2 = new i5.g
            r2.<init>(r9, r4, r0, r1)
            r0.forEach(r2)
        L_0x00d5:
            java.util.ArrayList r9 = r10.e
            int r10 = r10.f3873f
            java.lang.Object r9 = r9.get(r10)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            android.widget.FrameLayout r8 = r8.f3886a
            r8.setContentDescription(r9)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.editor.e0.a(int, androidx.recyclerview.widget.RecyclerView):void");
    }

    public final void b(RecyclerView recyclerView, int i8, int i9) {
    }
}
