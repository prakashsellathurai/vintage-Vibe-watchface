package com.samsung.android.wearable.watchfacestudio.editor;

import androidx.recyclerview.widget.RecyclerView;

public final class s extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f3908a;

    public s(w wVar) {
        this.f3908a = wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c5, code lost:
        if (r9 <= 0.5f) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d7, code lost:
        if (r9 <= 0.5f) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01df, code lost:
        r2 = 0.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r26, int r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            com.samsung.android.wearable.watchfacestudio.editor.w r0 = r0.f3908a
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip r1 = r0.f3948v0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x02eb
            r1 = r28
            float r1 = (float) r1
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r2 = r0.f3950x0
            int r2 = r2.getHeight()
            float r3 = (float) r2
            float r1 = r1 / r3
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r3 = r0.f3950x0
            int r3 = r3.computeVerticalScrollOffset()
            int r3 = r3 % r2
            r2 = 1
            r4 = 0
            if (r3 != 0) goto L_0x0024
            r3 = r2
            goto L_0x0025
        L_0x0024:
            r3 = r4
        L_0x0025:
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip r12 = r0.f3948v0
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView r0 = r0.f3950x0
            com.samsung.android.wearable.watchfacestudio.editor.VerticalOptionView$RecyclerViewLinearLayoutManager r0 = r0.J0
            int r0 = r0.O0()
            r12.getClass()
            r13 = 1120403456(0x42c80000, float:100.0)
            float r5 = r1 * r13
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 / r13
            int r6 = r12.y
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r6 = r12.i(r6)
            if (r6 != 0) goto L_0x0046
            goto L_0x02eb
        L_0x0046:
            androidx.constraintlayout.widget.ConstraintLayout r14 = r12.f3956x
            float r7 = r14.getRotation()
            r15 = 1093140480(0x41280000, float:10.5)
            float r8 = r5 * r15
            float r8 = r8 * r13
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r8 = r8 / r13
            r9 = 2
            r10 = 0
            if (r3 == 0) goto L_0x00bc
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r3 = r12.i(r0)
            if (r3 == 0) goto L_0x00ba
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            float r3 = r3.f3961d
            if (r8 >= 0) goto L_0x0090
            float r3 = r3 - r7
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r8 = r3 / r13
            float r3 = r14.getRotation()
            float r3 = r3 + r8
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r13
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Float r16 = java.lang.Float.valueOf(r8)
            r11[r4] = r16
            java.lang.Float r16 = java.lang.Float.valueOf(r3)
            r11[r2] = r16
            java.lang.String r10 = "Up : %f  / %f"
            java.lang.String.format(r10, r11)
            goto L_0x00c8
        L_0x0090:
            float r3 = r7 - r3
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r8 = r3 / r13
            float r3 = r14.getRotation()
            float r3 = r3 - r8
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r13
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Float r11 = java.lang.Float.valueOf(r8)
            r10[r4] = r11
            java.lang.Float r11 = java.lang.Float.valueOf(r3)
            r10[r2] = r11
            java.lang.String r11 = "Down : %f  / %f"
            java.lang.String.format(r11, r10)
            goto L_0x00c8
        L_0x00ba:
            r3 = 0
            goto L_0x00c8
        L_0x00bc:
            float r3 = r14.getRotation()
            float r3 = r3 - r8
            float r3 = r3 * r13
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r13
        L_0x00c8:
            r14.setRotation(r3)
            float r3 = r14.getRotation()
            r10 = 1107034112(0x41fc0000, float:31.5)
            float r11 = r3 + r10
            int r11 = java.lang.Math.round(r11)
            float r11 = (float) r11
            float r10 = r3 - r10
            int r10 = java.lang.Math.round(r10)
            float r10 = (float) r10
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r13 = r12.i(r0)
            r15 = 7
            java.lang.Object[] r15 = new java.lang.Object[r15]
            if (r13 != 0) goto L_0x00eb
            r13 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x00ed
        L_0x00eb:
            float r13 = r13.f3961d
        L_0x00ed:
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15[r4] = r13
            float r6 = r6.f3961d
            java.lang.Float r13 = java.lang.Float.valueOf(r6)
            r15[r2] = r13
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r15[r9] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            r5 = 3
            r15[r5] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r13 = 4
            r15[r13] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r7 = 5
            r15[r7] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r7 = 6
            r15[r7] = r1
            java.lang.String r1 = "Center: [%f / %f] | RawAngle: [%f / %f] | Move : [%f / %f / %f]"
            java.lang.String.format(r1, r15)
            int r1 = r12.y
            int r15 = r12.f3952s
            int r16 = r1 - r15
            int r1 = r1 + r15
            if (r16 >= 0) goto L_0x012d
            r16 = r4
        L_0x012d:
            java.util.ArrayList<n5.a> r15 = r12.f3953t
            int r13 = r15.size()
            if (r1 < r13) goto L_0x013a
            int r1 = r15.size()
            int r1 = r1 - r2
        L_0x013a:
            r13 = r16
        L_0x013c:
            if (r13 > r1) goto L_0x01f4
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r5 = r12.i(r13)
            if (r5 != 0) goto L_0x0150
            r21 = r2
            r18 = r9
            r16 = 3
            r17 = 4
            r23 = 5
            goto L_0x01e8
        L_0x0150:
            float r9 = r5.f3961d
            float r19 = r9 - r3
            float r19 = java.lang.Math.abs(r19)
            r20 = 1036831949(0x3dcccccd, float:0.1)
            float r19 = r19 * r20
            r20 = 1041328243(0x3e116873, float:0.142)
            float r19 = r19 * r20
            r20 = 1065353216(0x3f800000, float:1.0)
            float r2 = r20 - r19
            r5.e = r2
            android.widget.ImageView r4 = r5.f3958a
            r4.setScaleX(r2)
            r5.f3962f = r2
            r4.setScaleY(r2)
            float r2 = r4.getRotation()
            float r2 = r2 + r8
            r4.setRotation(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r22 = java.lang.Integer.valueOf(r13)
            r19 = 0
            r2[r19] = r22
            java.lang.Float r22 = java.lang.Float.valueOf(r9)
            r21 = 1
            r2[r21] = r22
            float r22 = r9 - r6
            java.lang.Float r22 = java.lang.Float.valueOf(r22)
            r18 = 2
            r2[r18] = r22
            float r7 = r5.f3960c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r16 = 3
            r2[r16] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r11)
            r17 = 4
            r2[r17] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r10)
            r23 = 5
            r2[r23] = r7
            java.lang.String r7 = "# SetAlpha : [%d] | Base: [%f] | Delta: [%f] | Angle : [%f] | Visible: [%f / %f]"
            java.lang.String.format(r7, r2)
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r2 <= 0) goto L_0x01c8
            float r9 = r9 - r11
            r2 = 1093140480(0x41280000, float:10.5)
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x01df
            goto L_0x01d9
        L_0x01c8:
            r2 = 1093140480(0x41280000, float:10.5)
            int r24 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r24 >= 0) goto L_0x01e1
            float r9 = r10 - r9
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x01df
        L_0x01d9:
            r2 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r2
            float r20 = r20 - r9
            goto L_0x01e1
        L_0x01df:
            r2 = 0
            goto L_0x01e3
        L_0x01e1:
            r2 = r20
        L_0x01e3:
            r5.f3963g = r2
            r4.setAlpha(r2)
        L_0x01e8:
            int r13 = r13 + 1
            r5 = r16
            r9 = r18
            r2 = r21
            r4 = 0
            r7 = 6
            goto L_0x013c
        L_0x01f4:
            int r1 = r12.y
            if (r1 == r0) goto L_0x02eb
            r12.y = r0
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r0 = r12.i(r0)
            java.util.ArrayList<com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a> r1 = r12.f3954u
            if (r0 != 0) goto L_0x0203
            goto L_0x024a
        L_0x0203:
            java.util.Iterator r2 = r1.iterator()
        L_0x0207:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x024a
            java.lang.Object r3 = r2.next()
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r3 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip.a) r3
            int r4 = r3.f3959b
            int r5 = r12.y
            float r6 = r0.f3961d
            float r7 = r3.f3961d
            if (r4 > r5) goto L_0x0223
            float r6 = r6 - r7
            float r4 = java.lang.Math.abs(r6)
            goto L_0x0228
        L_0x0223:
            float r7 = r7 - r6
            float r4 = java.lang.Math.abs(r7)
        L_0x0228:
            int r5 = r12.f3952s
            float r5 = (float) r5
            r6 = 1093140480(0x41280000, float:10.5)
            float r5 = r5 * r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0207
            r2.remove()
            android.widget.ImageView r3 = r3.f3958a
            r14.removeView(r3)
            androidx.constraintlayout.widget.b r3 = r12.f3955v
            r3.b(r14)
            r3.a(r14)
            r3 = 0
            r14.setConstraintSet(r3)
            r14.requestLayout()
            goto L_0x0207
        L_0x024a:
            int r0 = r12.y
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r0 = r12.i(r0)
            if (r0 != 0) goto L_0x0254
            goto L_0x02eb
        L_0x0254:
            int r0 = r0.f3959b
            int r2 = r12.f3952s
            int r3 = r0 - r2
            int r2 = r2 + r0
            if (r3 >= 0) goto L_0x025e
            r3 = 0
        L_0x025e:
            int r4 = r15.size()
            if (r2 < r4) goto L_0x026a
            int r2 = r15.size()
            int r2 = r2 + -1
        L_0x026a:
            r4 = 0
            java.lang.Object r5 = r1.get(r4)
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r5 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip.a) r5
            int r4 = r1.size()
            int r4 = r4 + -1
            java.lang.Object r4 = r1.get(r4)
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r4 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip.a) r4
            int r6 = r5.f3959b
            if (r3 >= r6) goto L_0x02a7
            if (r3 == r0) goto L_0x02a7
        L_0x0283:
            int r0 = r5.f3959b
            if (r3 >= r0) goto L_0x02eb
            float r2 = r5.f3960c
            float r4 = r14.getRotation()
            float r11 = -r4
            r6 = 0
            int r7 = r0 + -1
            float r0 = r5.f3961d
            r4 = 1093140480(0x41280000, float:10.5)
            float r8 = r0 + r4
            r9 = 0
            float r10 = r2 - r4
            r5 = r12
            r5.h(r6, r7, r8, r9, r10, r11)
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            r5 = r2
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r5 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip.a) r5
            goto L_0x0283
        L_0x02a7:
            int r3 = r4.f3959b
            if (r2 <= r3) goto L_0x02eb
            if (r2 == r0) goto L_0x02eb
        L_0x02ad:
            int r0 = r4.f3959b
            if (r2 <= r0) goto L_0x02eb
            float r3 = r4.f3960c
            float r5 = r14.getRotation()
            float r11 = -r5
            r1.size()
            int r5 = r1.size()
            float r5 = (float) r5
            float r5 = r5 * r3
            r13 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r13
            r6 = 1119092736(0x42b40000, float:90.0)
            float r5 = r5 + r6
            java.lang.Math.round(r5)
            int r6 = r1.size()
            int r7 = r0 + 1
            float r0 = r4.f3961d
            r4 = 1093140480(0x41280000, float:10.5)
            float r8 = r0 - r4
            r9 = 0
            float r10 = r3 + r4
            r5 = r12
            r5.h(r6, r7, r8, r9, r10, r11)
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r1.get(r0)
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a r0 = (com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip.a) r0
            r4 = r0
            goto L_0x02ad
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.editor.s.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
