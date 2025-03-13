package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import d0.b;
import n0.c;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f724a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f725b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f726c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f727d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f728f;

    public h(CompoundButton compoundButton) {
        this.f724a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f724a;
        Drawable a9 = c.a(compoundButton);
        if (a9 == null) {
            return;
        }
        if (this.f727d || this.e) {
            Drawable mutate = a9.mutate();
            if (this.f727d) {
                b.h(mutate, this.f725b);
            }
            if (this.e) {
                b.i(mutate, this.f726c);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC, Splitter:B:11:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[Catch:{ all -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.CompoundButton r8 = r8.f724a
            android.content.Context r0 = r8.getContext()
            int[] r2 = a1.a.f48v
            androidx.appcompat.widget.o0 r7 = androidx.appcompat.widget.o0.l(r0, r9, r2, r10)
            android.content.Context r1 = r8.getContext()
            android.content.res.TypedArray r4 = r7.f782b
            r6 = 0
            int[] r0 = j0.x.f4957a
            r0 = r8
            r3 = r9
            r5 = r10
            j0.x.m.c(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r7.k(r9)     // Catch:{ all -> 0x0075 }
            r0 = 0
            if (r10 == 0) goto L_0x0035
            int r10 = r7.h(r9, r0)     // Catch:{ all -> 0x0075 }
            if (r10 == 0) goto L_0x0035
            android.content.Context r1 = r8.getContext()     // Catch:{ NotFoundException -> 0x0035 }
            android.graphics.drawable.Drawable r10 = g.a.a(r1, r10)     // Catch:{ NotFoundException -> 0x0035 }
            r8.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r9 = r0
        L_0x0036:
            if (r9 != 0) goto L_0x004f
            boolean r9 = r7.k(r0)     // Catch:{ all -> 0x0075 }
            if (r9 == 0) goto L_0x004f
            int r9 = r7.h(r0, r0)     // Catch:{ all -> 0x0075 }
            if (r9 == 0) goto L_0x004f
            android.content.Context r10 = r8.getContext()     // Catch:{ all -> 0x0075 }
            android.graphics.drawable.Drawable r9 = g.a.a(r10, r9)     // Catch:{ all -> 0x0075 }
            r8.setButtonDrawable(r9)     // Catch:{ all -> 0x0075 }
        L_0x004f:
            r9 = 2
            boolean r10 = r7.k(r9)     // Catch:{ all -> 0x0075 }
            if (r10 == 0) goto L_0x005d
            android.content.res.ColorStateList r9 = r7.b(r9)     // Catch:{ all -> 0x0075 }
            n0.b.c(r8, r9)     // Catch:{ all -> 0x0075 }
        L_0x005d:
            r9 = 3
            boolean r10 = r7.k(r9)     // Catch:{ all -> 0x0075 }
            if (r10 == 0) goto L_0x0071
            r10 = -1
            int r9 = r7.g(r9, r10)     // Catch:{ all -> 0x0075 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.w.c(r9, r10)     // Catch:{ all -> 0x0075 }
            n0.b.d(r8, r9)     // Catch:{ all -> 0x0075 }
        L_0x0071:
            r7.m()
            return
        L_0x0075:
            r8 = move-exception
            r7.m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.b(android.util.AttributeSet, int):void");
    }
}
