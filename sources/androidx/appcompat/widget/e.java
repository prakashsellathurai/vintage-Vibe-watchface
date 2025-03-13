package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import j0.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f702a;

    /* renamed from: b  reason: collision with root package name */
    public final i f703b;

    /* renamed from: c  reason: collision with root package name */
    public int f704c = -1;

    /* renamed from: d  reason: collision with root package name */
    public m0 f705d;
    public m0 e;

    /* renamed from: f  reason: collision with root package name */
    public m0 f706f;

    public e(View view) {
        this.f702a = view;
        this.f703b = i.a();
    }

    public final void a() {
        View view = this.f702a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z8 = false;
            if (this.f705d != null) {
                if (this.f706f == null) {
                    this.f706f = new m0();
                }
                m0 m0Var = this.f706f;
                m0Var.f776a = null;
                m0Var.f779d = false;
                m0Var.f777b = null;
                m0Var.f778c = false;
                int[] iArr = x.f4957a;
                ColorStateList g9 = x.h.g(view);
                if (g9 != null) {
                    m0Var.f779d = true;
                    m0Var.f776a = g9;
                }
                PorterDuff.Mode h8 = x.h.h(view);
                if (h8 != null) {
                    m0Var.f778c = true;
                    m0Var.f777b = h8;
                }
                if (m0Var.f779d || m0Var.f778c) {
                    i.e(background, m0Var, view.getDrawableState());
                    z8 = true;
                }
                if (z8) {
                    return;
                }
            }
            m0 m0Var2 = this.e;
            if (m0Var2 != null) {
                i.e(background, m0Var2, view.getDrawableState());
                return;
            }
            m0 m0Var3 = this.f705d;
            if (m0Var3 != null) {
                i.e(background, m0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        m0 m0Var = this.e;
        if (m0Var != null) {
            return m0Var.f776a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        m0 m0Var = this.e;
        if (m0Var != null) {
            return m0Var.f777b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r1.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.f702a
            android.content.Context r1 = r0.getContext()
            int[] r4 = a1.a.H
            androidx.appcompat.widget.o0 r1 = androidx.appcompat.widget.o0.l(r1, r10, r4, r11)
            android.view.View r2 = r9.f702a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.f782b
            r8 = 0
            int[] r5 = j0.x.f4957a
            r5 = r10
            r7 = r11
            j0.x.m.c(r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            boolean r11 = r1.k(r10)     // Catch:{ all -> 0x0068 }
            r2 = -1
            if (r11 == 0) goto L_0x0043
            int r10 = r1.h(r10, r2)     // Catch:{ all -> 0x0068 }
            r9.f704c = r10     // Catch:{ all -> 0x0068 }
            androidx.appcompat.widget.i r10 = r9.f703b     // Catch:{ all -> 0x0068 }
            android.content.Context r11 = r0.getContext()     // Catch:{ all -> 0x0068 }
            int r3 = r9.f704c     // Catch:{ all -> 0x0068 }
            monitor-enter(r10)     // Catch:{ all -> 0x0068 }
            androidx.appcompat.widget.f0 r4 = r10.f738a     // Catch:{ all -> 0x0040 }
            android.content.res.ColorStateList r11 = r4.h(r11, r3)     // Catch:{ all -> 0x0040 }
            monitor-exit(r10)     // Catch:{ all -> 0x0068 }
            if (r11 == 0) goto L_0x0043
            r9.g(r11)     // Catch:{ all -> 0x0068 }
            goto L_0x0043
        L_0x0040:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0068 }
            throw r9     // Catch:{ all -> 0x0068 }
        L_0x0043:
            r9 = 1
            boolean r10 = r1.k(r9)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0051
            android.content.res.ColorStateList r9 = r1.b(r9)     // Catch:{ all -> 0x0068 }
            j0.x.h.q(r0, r9)     // Catch:{ all -> 0x0068 }
        L_0x0051:
            r9 = 2
            boolean r10 = r1.k(r9)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0064
            int r9 = r1.g(r9, r2)     // Catch:{ all -> 0x0068 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.w.c(r9, r10)     // Catch:{ all -> 0x0068 }
            j0.x.h.r(r0, r9)     // Catch:{ all -> 0x0068 }
        L_0x0064:
            r1.m()
            return
        L_0x0068:
            r9 = move-exception
            r1.m()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f704c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i8) {
        ColorStateList colorStateList;
        this.f704c = i8;
        i iVar = this.f703b;
        if (iVar != null) {
            Context context = this.f702a.getContext();
            synchronized (iVar) {
                colorStateList = iVar.f738a.h(context, i8);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f705d == null) {
                this.f705d = new m0();
            }
            m0 m0Var = this.f705d;
            m0Var.f776a = colorStateList;
            m0Var.f779d = true;
        } else {
            this.f705d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new m0();
        }
        m0 m0Var = this.e;
        m0Var.f776a = colorStateList;
        m0Var.f779d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new m0();
        }
        m0 m0Var = this.e;
        m0Var.f777b = mode;
        m0Var.f778c = true;
        a();
    }
}
