package j0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.health.services.client.R;
import j0.a;
import j0.d;
import j0.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k0.c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4957a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: b  reason: collision with root package name */
    public static final u f4958b = new u();

    public static abstract class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f4959a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f4960b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4961c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4962d;

        public a(int i8, Class<T> cls, int i9, int i10) {
            this.f4959a = i8;
            this.f4960b = cls;
            this.f4962d = i9;
            this.f4961c = i10;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t8);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f4961c) {
                return b(view);
            }
            T tag = view.getTag(this.f4959a);
            if (this.f4960b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t8) {
            if (Build.VERSION.SDK_INT >= this.f4961c) {
                c(view, t8);
            } else if (f(d(view), t8)) {
                int[] iArr = x.f4957a;
                View.AccessibilityDelegate a9 = m.a(view);
                a aVar = a9 == null ? null : a9 instanceof a.C0066a ? ((a.C0066a) a9).f4919a : new a(a9);
                if (aVar == null) {
                    aVar = new a();
                }
                x.i(view, aVar);
                view.setTag(this.f4959a, t8);
                x.d(view, this.f4962d);
            }
        }

        public abstract boolean f(T t8, T t9);
    }

    public static class b {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class c {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i8, Bundle bundle) {
            return view.performAccessibilityAction(i8, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i8, int i9, int i10, int i11) {
            view.postInvalidateOnAnimation(i8, i9, i10, i11);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j8) {
            view.postOnAnimationDelayed(runnable, j8);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z8) {
            view.setHasTransientState(z8);
        }

        public static void s(View view, int i8) {
            view.setImportantForAccessibility(i8);
        }
    }

    public static class d {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i8) {
            view.setLabelFor(i8);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i8) {
            view.setLayoutDirection(i8);
        }

        public static void k(View view, int i8, int i9, int i10, int i11) {
            view.setPaddingRelative(i8, i9, i10, i11);
        }
    }

    public static class e {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class f {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i8);
        }

        public static void f(View view, int i8) {
            view.setAccessibilityLiveRegion(i8);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i8) {
            accessibilityEvent.setContentChangeTypes(i8);
        }
    }

    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p f4963a;

            public a(View view, p pVar) {
                this.f4963a = pVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return this.f4963a.a(view, d0.g(windowInsets, view)).f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static d0 b(View view, d0 d0Var, Rect rect) {
            WindowInsets f9 = d0Var.f();
            if (f9 != null) {
                return d0.g(view.computeSystemWindowInsets(f9, rect), view);
            }
            rect.setEmpty();
            return d0Var;
        }

        public static boolean c(View view, float f9, float f10, boolean z8) {
            return view.dispatchNestedFling(f9, f10, z8);
        }

        public static boolean d(View view, float f9, float f10) {
            return view.dispatchNestedPreFling(f9, f10);
        }

        public static boolean e(View view, int i8, int i9, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i8, i9, iArr, iArr2);
        }

        public static boolean f(View view, int i8, int i9, int i10, int i11, int[] iArr) {
            return view.dispatchNestedScroll(i8, i9, i10, i11, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static d0 j(View view) {
            if (d0.a.f4937d && view.isAttachedToWindow()) {
                try {
                    Object obj = d0.a.f4934a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) d0.a.f4935b.get(obj);
                        Rect rect2 = (Rect) d0.a.f4936c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            d0.c cVar = new d0.c();
                            cVar.c(c0.b.a(rect.left, rect.top, rect.right, rect.bottom));
                            cVar.d(c0.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            d0 b9 = cVar.b();
                            b9.f4933a.m(b9);
                            b9.f4933a.d(view.getRootView());
                            return b9;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f9) {
            view.setElevation(f9);
        }

        public static void t(View view, boolean z8) {
            view.setNestedScrollingEnabled(z8);
        }

        public static void u(View view, p pVar) {
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f9) {
            view.setTranslationZ(f9);
        }

        public static void x(View view, float f9) {
            view.setZ(f9);
        }

        public static boolean y(View view, int i8) {
            return view.startNestedScroll(i8);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class i {
        public static d0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            d0 g9 = d0.g(rootWindowInsets, (View) null);
            d0.j jVar = g9.f4933a;
            jVar.m(g9);
            jVar.d(view.getRootView());
            return g9;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i8) {
            view.setScrollIndicators(i8);
        }

        public static void d(View view, int i8, int i9) {
            view.setScrollIndicators(i8, i9);
        }
    }

    public static class j {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i8) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i8);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class k {
        public static void a(View view, Collection<View> collection, int i8) {
            view.addKeyboardNavigationClusters(collection, i8);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i8) {
            return view.keyboardNavigationClusterSearch(view2, i8);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z8) {
            view.setFocusedByDefault(z8);
        }

        public static void l(View view, int i8) {
            view.setImportantForAutofill(i8);
        }

        public static void m(View view, boolean z8) {
            view.setKeyboardNavigationCluster(z8);
        }

        public static void n(View view, int i8) {
            view.setNextClusterForwardId(i8);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class l {
        public static void a(View view, q qVar) {
            p.f fVar = (p.f) view.getTag(R.id.tag_unhandled_key_listeners);
            if (fVar == null) {
                fVar = new p.f();
                view.setTag(R.id.tag_unhandled_key_listeners, fVar);
            }
            Objects.requireNonNull(qVar);
            y yVar = new y(qVar);
            fVar.put(qVar, yVar);
            view.addOnUnhandledKeyEventListener(yVar);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p.f fVar = (p.f) view.getTag(R.id.tag_unhandled_key_listeners);
            if (fVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) fVar.getOrDefault(qVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i8) {
            return view.requireViewById(i8);
        }

        public static void g(View view, boolean z8) {
            view.setAccessibilityHeading(z8);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z8) {
            view.setScreenReaderFocusable(z8);
        }
    }

    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i9);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static d b(View view, d dVar) {
            ContentInfo c9 = dVar.f4921a.c();
            Objects.requireNonNull(c9);
            ContentInfo f9 = view.performReceiveContent(c9);
            if (f9 == null) {
                return null;
            }
            return f9 == c9 ? dVar : new d(new d.C0067d(f9));
        }

        public static void c(View view, String[] strArr, q qVar) {
            if (qVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(qVar));
            }
        }
    }

    public static final class p implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final q f4964a;

        public p(q qVar) {
            this.f4964a = qVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            d dVar = new d(new d.C0067d(contentInfo));
            d a9 = this.f4964a.a(view, dVar);
            if (a9 == null) {
                return null;
            }
            if (a9 == dVar) {
                return contentInfo;
            }
            ContentInfo c9 = a9.f4921a.c();
            Objects.requireNonNull(c9);
            return c9;
        }
    }

    public interface q {
        boolean a();
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static d0 a(View view, d0 d0Var) {
        WindowInsets f9 = d0Var.f();
        if (f9 != null) {
            WindowInsets a9 = g.a(view, f9);
            if (!a9.equals(f9)) {
                return d0.g(a9, view);
            }
        }
        return d0Var;
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] c(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void d(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z8 = l.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i9 = 32;
            if (f.a(view) != 0 || z8) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z8) {
                    i9 = 2048;
                }
                obtain.setEventType(i9);
                f.g(obtain, i8);
                if (z8) {
                    obtain.getText().add(l.b(view));
                    if (c.c(view) == 0) {
                        c.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (c.c((View) parent) == 4) {
                            c.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i8 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                f.g(obtain2, i8);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l.b(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    f.e(view.getParent(), view, view, i8);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                }
            }
        }
    }

    public static d0 e(View view, d0 d0Var) {
        WindowInsets f9 = d0Var.f();
        if (f9 != null) {
            WindowInsets b9 = g.b(view, f9);
            if (!b9.equals(f9)) {
                return d0.g(b9, view);
            }
        }
        return d0Var;
    }

    public static d f(View view, d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(dVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        q qVar = (q) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f4958b;
        if (qVar != null) {
            d a9 = qVar.a(view, dVar);
            if (a9 == null) {
                return null;
            }
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(a9);
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(dVar);
    }

    public static void g(View view, int i8) {
        ArrayList b9 = b(view);
        for (int i9 = 0; i9 < b9.size(); i9++) {
            if (((c.a) b9.get(i9)).a() == i8) {
                b9.remove(i9);
                return;
            }
        }
    }

    public static void h(View view, c.a aVar, k0.g gVar) {
        if (gVar == null) {
            g(view, aVar.a());
            d(view, 0);
            return;
        }
        c.a aVar2 = new c.a((Object) null, aVar.f5096b, (String) null, gVar, aVar.f5097c);
        View.AccessibilityDelegate a9 = m.a(view);
        a aVar3 = a9 == null ? null : a9 instanceof a.C0066a ? ((a.C0066a) a9).f4919a : new a(a9);
        if (aVar3 == null) {
            aVar3 = new a();
        }
        i(view, aVar3);
        g(view, aVar2.a());
        b(view).add(aVar2);
        d(view, 0);
    }

    public static void i(View view, a aVar) {
        if (aVar == null && (m.a(view) instanceof a.C0066a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f4918b);
    }
}
