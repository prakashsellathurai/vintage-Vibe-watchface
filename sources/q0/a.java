package q0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import j0.x;
import java.util.ArrayList;
import k0.d;
import q0.b;

public abstract class a extends j0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f6378n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0110a f6379o = new C0110a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f6380p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f6381d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f6382f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f6383g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f6384h;

    /* renamed from: i  reason: collision with root package name */
    public final View f6385i;

    /* renamed from: j  reason: collision with root package name */
    public c f6386j;

    /* renamed from: k  reason: collision with root package name */
    public int f6387k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f6388l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f6389m = Integer.MIN_VALUE;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    public static class C0110a implements b.a<k0.c> {
    }

    public static class b {
    }

    public class c extends d {
        public c() {
        }

        public final k0.c a(int i8) {
            return new k0.c(AccessibilityNodeInfo.obtain(a.this.n(i8).f5085a));
        }

        public final k0.c b(int i8) {
            a aVar = a.this;
            int i9 = i8 == 2 ? aVar.f6387k : aVar.f6388l;
            if (i9 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i9);
        }

        public final boolean c(int i8, int i9, Bundle bundle) {
            int i10;
            a aVar = a.this;
            View view = aVar.f6385i;
            if (i8 != -1) {
                boolean z8 = true;
                if (i9 == 1) {
                    return aVar.s(i8);
                }
                if (i9 == 2) {
                    return aVar.j(i8);
                }
                if (i9 == 64) {
                    AccessibilityManager accessibilityManager = aVar.f6384h;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i10 = aVar.f6387k) != i8) {
                        if (i10 != Integer.MIN_VALUE) {
                            aVar.f6387k = Integer.MIN_VALUE;
                            aVar.f6385i.invalidate();
                            aVar.t(i10, 65536);
                        }
                        aVar.f6387k = i8;
                        view.invalidate();
                        aVar.t(i8, 32768);
                        return z8;
                    }
                } else if (i9 != 128) {
                    return aVar.o(i8, i9);
                } else {
                    if (aVar.f6387k == i8) {
                        aVar.f6387k = Integer.MIN_VALUE;
                        view.invalidate();
                        aVar.t(i8, 65536);
                        return z8;
                    }
                }
                z8 = false;
                return z8;
            }
            int[] iArr = x.f4957a;
            return x.c.j(view, i9, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f6385i = view;
            this.f6384h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            int[] iArr = x.f4957a;
            if (x.c.c(view) == 0) {
                x.c.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final d b(View view) {
        if (this.f6386j == null) {
            this.f6386j = new c();
        }
        return this.f6386j;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    public final void d(View view, k0.c cVar) {
        this.f4917a.onInitializeAccessibilityNodeInfo(view, cVar.f5085a);
        p(cVar);
    }

    public final boolean j(int i8) {
        if (this.f6388l != i8) {
            return false;
        }
        this.f6388l = Integer.MIN_VALUE;
        r(i8, false);
        t(i8, 8);
        return true;
    }

    public final k0.c k(int i8) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k0.c cVar = new k0.c(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        cVar.f("android.view.View");
        Rect rect = f6378n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        cVar.f5086b = -1;
        View view = this.f6385i;
        obtain.setParent(view);
        q(i8, cVar);
        if (cVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        cVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(view.getContext().getPackageName());
                cVar.f5087c = i8;
                obtain.setSource(view, i8);
                boolean z8 = false;
                if (this.f6387k == i8) {
                    obtain.setAccessibilityFocused(true);
                    cVar.a(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    cVar.a(64);
                }
                boolean z9 = this.f6388l == i8;
                if (z9) {
                    cVar.a(2);
                } else if (obtain.isFocusable()) {
                    cVar.a(1);
                }
                obtain.setFocused(z9);
                int[] iArr = this.f6383g;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.f6381d;
                obtain.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    cVar.d(rect3);
                    if (cVar.f5086b != -1) {
                        k0.c cVar2 = new k0.c(AccessibilityNodeInfo.obtain());
                        int i9 = cVar.f5086b;
                        while (true) {
                            accessibilityNodeInfo = cVar2.f5085a;
                            if (i9 == -1) {
                                break;
                            }
                            cVar2.f5086b = -1;
                            accessibilityNodeInfo.setParent(view, -1);
                            accessibilityNodeInfo.setBoundsInParent(rect);
                            q(i9, cVar2);
                            cVar2.d(rect2);
                            rect3.offset(rect2.left, rect2.top);
                            i9 = cVar2.f5086b;
                        }
                        accessibilityNodeInfo.recycle();
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.f6382f;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        cVar.f5085a.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            while (true) {
                                ViewParent parent = view.getParent();
                                if (parent instanceof View) {
                                    view = (View) parent;
                                    if (view.getAlpha() > 0.0f) {
                                        if (view.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z8 = true;
                                }
                            }
                        }
                        if (z8) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
                return cVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        if (r15 < (((r13 * 13) * r13) + (r14 * r14))) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0137 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            p.g r4 = new p.g
            r4.<init>()
            r6 = 0
        L_0x0014:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0024
            k0.c r7 = r0.k(r6)
            r4.d(r6, r7)
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0024:
            int r3 = r0.f6388l
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x002d
            r3 = r6
            goto L_0x0033
        L_0x002d:
            java.lang.Object r3 = r4.c(r3, r6)
            k0.c r3 = (k0.c) r3
        L_0x0033:
            r9 = 1
            q0.a$a r10 = f6379o
            q0.a$b r11 = f6380p
            android.view.View r12 = r0.f6385i
            r13 = 2
            if (r1 == r9) goto L_0x0141
            if (r1 == r13) goto L_0x0141
            r13 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r6 = 17
            if (r1 == r6) goto L_0x0058
            if (r1 == r15) goto L_0x0058
            if (r1 == r14) goto L_0x0058
            if (r1 != r13) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        L_0x0058:
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            int r5 = r0.f6388l
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r7) goto L_0x006b
            k0.c r2 = r0.n(r5)
            r2.d(r9)
            goto L_0x009c
        L_0x006b:
            if (r2 == 0) goto L_0x0071
            r9.set(r2)
            goto L_0x009c
        L_0x0071:
            int r2 = r12.getWidth()
            int r5 = r12.getHeight()
            if (r1 == r6) goto L_0x0098
            if (r1 == r15) goto L_0x0093
            if (r1 == r14) goto L_0x008d
            if (r1 != r13) goto L_0x0087
            r5 = 0
            r12 = -1
            r9.set(r5, r12, r2, r12)
            goto L_0x009c
        L_0x0087:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L_0x008d:
            r2 = 0
            r12 = -1
            r9.set(r12, r2, r12, r5)
            goto L_0x009c
        L_0x0093:
            r12 = 0
            r9.set(r12, r5, r2, r5)
            goto L_0x009c
        L_0x0098:
            r12 = 0
            r9.set(r2, r12, r2, r5)
        L_0x009c:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r9)
            if (r1 == r6) goto L_0x00cb
            if (r1 == r15) goto L_0x00c0
            if (r1 == r14) goto L_0x00b7
            if (r1 != r13) goto L_0x00b1
            int r5 = r9.height()
            r6 = 1
            int r5 = r5 + r6
            int r5 = -r5
            goto L_0x00c6
        L_0x00b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r8)
            throw r0
        L_0x00b7:
            r6 = 1
            int r5 = r9.width()
            int r5 = r5 + r6
            int r5 = -r5
            r8 = 0
            goto L_0x00d2
        L_0x00c0:
            r6 = 1
            int r5 = r9.height()
            int r5 = r5 + r6
        L_0x00c6:
            r8 = 0
            r2.offset(r8, r5)
            goto L_0x00d5
        L_0x00cb:
            r6 = 1
            r8 = 0
            int r5 = r9.width()
            int r5 = r5 + r6
        L_0x00d2:
            r2.offset(r5, r8)
        L_0x00d5:
            r11.getClass()
            int r5 = r4.f6239h
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r11 = r8
            r16 = 0
        L_0x00e2:
            if (r11 >= r5) goto L_0x013a
            java.lang.Object[] r12 = r4.f6238g
            r12 = r12[r11]
            k0.c r12 = (k0.c) r12
            if (r12 != r3) goto L_0x00ed
            goto L_0x0137
        L_0x00ed:
            r10.getClass()
            r12.d(r6)
            boolean r13 = q0.b.c(r1, r9, r6)
            if (r13 != 0) goto L_0x00fa
            goto L_0x012f
        L_0x00fa:
            boolean r13 = q0.b.c(r1, r9, r2)
            if (r13 != 0) goto L_0x0101
            goto L_0x012d
        L_0x0101:
            boolean r13 = q0.b.a(r1, r9, r6, r2)
            if (r13 == 0) goto L_0x0108
            goto L_0x012d
        L_0x0108:
            boolean r13 = q0.b.a(r1, r9, r2, r6)
            if (r13 == 0) goto L_0x010f
            goto L_0x012f
        L_0x010f:
            int r13 = q0.b.d(r1, r9, r6)
            int r14 = q0.b.e(r1, r9, r6)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r15 = r15 + r14
            int r13 = q0.b.d(r1, r9, r2)
            int r14 = q0.b.e(r1, r9, r2)
            int r17 = r13 * 13
            int r17 = r17 * r13
            int r14 = r14 * r14
            int r13 = r17 + r14
            if (r15 >= r13) goto L_0x012f
        L_0x012d:
            r13 = 1
            goto L_0x0130
        L_0x012f:
            r13 = r8
        L_0x0130:
            if (r13 == 0) goto L_0x0137
            r2.set(r6)
            r16 = r12
        L_0x0137:
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x013a:
            k0.c r16 = (k0.c) r16
            r1 = r16
            r2 = -1
            goto L_0x01af
        L_0x0141:
            r8 = 0
            int[] r2 = j0.x.f4957a
            int r2 = j0.x.d.d(r12)
            r5 = 1
            if (r2 != r5) goto L_0x014d
            r5 = 1
            goto L_0x014e
        L_0x014d:
            r5 = r8
        L_0x014e:
            r11.getClass()
            int r2 = r4.f6239h
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            r9 = r8
        L_0x0159:
            if (r9 >= r2) goto L_0x0167
            java.lang.Object[] r11 = r4.f6238g
            r11 = r11[r9]
            k0.c r11 = (k0.c) r11
            r6.add(r11)
            int r9 = r9 + 1
            goto L_0x0159
        L_0x0167:
            q0.b$b r2 = new q0.b$b
            r2.<init>(r5, r10)
            java.util.Collections.sort(r6, r2)
            r2 = 1
            if (r1 == r2) goto L_0x0194
            if (r1 != r13) goto L_0x018c
            int r1 = r6.size()
            if (r3 != 0) goto L_0x017c
            r12 = -1
            goto L_0x0180
        L_0x017c:
            int r12 = r6.lastIndexOf(r3)
        L_0x0180:
            int r12 = r12 + r2
            if (r12 >= r1) goto L_0x0189
            java.lang.Object r1 = r6.get(r12)
            r6 = r1
            goto L_0x018a
        L_0x0189:
            r6 = 0
        L_0x018a:
            r2 = -1
            goto L_0x01a9
        L_0x018c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r0.<init>(r1)
            throw r0
        L_0x0194:
            int r1 = r6.size()
            if (r3 != 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            int r1 = r6.indexOf(r3)
        L_0x019f:
            r2 = -1
            int r1 = r1 + r2
            if (r1 < 0) goto L_0x01a8
            java.lang.Object r6 = r6.get(r1)
            goto L_0x01a9
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            r16 = r6
            k0.c r16 = (k0.c) r16
            r1 = r16
        L_0x01af:
            if (r1 != 0) goto L_0x01b2
            goto L_0x01c7
        L_0x01b2:
            r5 = r8
        L_0x01b3:
            int r3 = r4.f6239h
            if (r5 >= r3) goto L_0x01c2
            java.lang.Object[] r3 = r4.f6238g
            r3 = r3[r5]
            if (r3 != r1) goto L_0x01bf
            r8 = r5
            goto L_0x01c3
        L_0x01bf:
            int r5 = r5 + 1
            goto L_0x01b3
        L_0x01c2:
            r8 = r2
        L_0x01c3:
            int[] r1 = r4.f6237f
            r7 = r1[r8]
        L_0x01c7:
            boolean r0 = r0.s(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.m(int, android.graphics.Rect):boolean");
    }

    public final k0.c n(int i8) {
        if (i8 != -1) {
            return k(i8);
        }
        View view = this.f6385i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        k0.c cVar = new k0.c(obtain);
        int[] iArr = x.f4957a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                cVar.f5085a.addChild(view, ((Integer) arrayList.get(i9)).intValue());
            }
            return cVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean o(int i8, int i9);

    public void p(k0.c cVar) {
    }

    public abstract void q(int i8, k0.c cVar);

    public void r(int i8, boolean z8) {
    }

    public final boolean s(int i8) {
        int i9;
        View view = this.f6385i;
        if ((!view.isFocused() && !view.requestFocus()) || (i9 = this.f6388l) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            j(i9);
        }
        this.f6388l = i8;
        r(i8, true);
        t(i8, 8);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r4.f6385i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r5, int r6) {
        /*
            r4 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x008b
            android.view.accessibility.AccessibilityManager r0 = r4.f6384h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x000e
            goto L_0x008b
        L_0x000e:
            android.view.View r0 = r4.f6385i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            r2 = -1
            if (r5 == r2) goto L_0x0081
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            k0.c r4 = r4.n(r5)
            java.util.List r2 = r6.getText()
            java.lang.CharSequence r3 = r4.e()
            r2.add(r3)
            android.view.accessibility.AccessibilityNodeInfo r4 = r4.f5085a
            java.lang.CharSequence r2 = r4.getContentDescription()
            r6.setContentDescription(r2)
            boolean r2 = r4.isScrollable()
            r6.setScrollable(r2)
            boolean r2 = r4.isPassword()
            r6.setPassword(r2)
            boolean r2 = r4.isEnabled()
            r6.setEnabled(r2)
            boolean r2 = r4.isChecked()
            r6.setChecked(r2)
            java.util.List r2 = r6.getText()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x006b
            java.lang.CharSequence r2 = r6.getContentDescription()
            if (r2 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r4.<init>(r5)
            throw r4
        L_0x006b:
            java.lang.CharSequence r4 = r4.getClassName()
            r6.setClassName(r4)
            k0.f.a(r6, r0, r5)
            android.content.Context r4 = r0.getContext()
            java.lang.String r4 = r4.getPackageName()
            r6.setPackageName(r4)
            goto L_0x0088
        L_0x0081:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            r0.onInitializeAccessibilityEvent(r6)
        L_0x0088:
            r1.requestSendAccessibilityEvent(r0, r6)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.t(int, int):void");
    }

    public final void u(int i8) {
        int i9 = this.f6389m;
        if (i9 != i8) {
            this.f6389m = i8;
            t(i8, 128);
            t(i9, 256);
        }
    }
}
