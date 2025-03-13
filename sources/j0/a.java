package j0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.health.services.client.R;
import j0.x;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import k0.c;
import k0.d;
import k0.g;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f4916c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f4917a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f4918b;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    public static final class C0066a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f4919a;

        public C0066a(a aVar) {
            this.f4919a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4919a.a(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d b9 = this.f4919a.b(view);
            if (b9 != null) {
                return (AccessibilityNodeProvider) b9.f5101a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4919a.c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c cVar = new c(accessibilityNodeInfo);
            int[] iArr = x.f4957a;
            Boolean valueOf = Boolean.valueOf(x.l.d(view));
            boolean z8 = true;
            accessibilityNodeInfo.setScreenReaderFocusable(valueOf != null && valueOf.booleanValue());
            Boolean valueOf2 = Boolean.valueOf(x.l.c(view));
            if (valueOf2 == null || !valueOf2.booleanValue()) {
                z8 = false;
            }
            accessibilityNodeInfo.setHeading(z8);
            accessibilityNodeInfo.setPaneTitle(x.l.b(view));
            accessibilityNodeInfo.setStateDescription(x.n.a(view));
            this.f4919a.d(view, cVar);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                cVar.b((c.a) list.get(i8));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4919a.e(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4919a.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f4919a.g(view, i8, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i8) {
            this.f4919a.h(view, i8);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4919a.i(view, accessibilityEvent);
        }
    }

    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i8, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i8, bundle);
        }
    }

    public a() {
        this(f4916c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4917a = accessibilityDelegate;
        this.f4918b = new C0066a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4917a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public d b(View view) {
        AccessibilityNodeProvider a9 = b.a(this.f4917a, view);
        if (a9 != null) {
            return new d(a9);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4917a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c cVar) {
        this.f4917a.onInitializeAccessibilityNodeInfo(view, cVar.f5085a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4917a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4917a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i8, Bundle bundle) {
        boolean z8;
        WeakReference weakReference;
        boolean z9;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= list.size()) {
                break;
            }
            c.a aVar = (c.a) list.get(i9);
            if (aVar.a() == i8) {
                g gVar = aVar.f5098d;
                if (gVar != null) {
                    Class<? extends g.a> cls = aVar.f5097c;
                    if (cls != null) {
                        try {
                            ((g.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z8 = gVar.a(view);
                }
            } else {
                i9++;
            }
        }
        z8 = false;
        if (!z8) {
            z8 = b.b(this.f4917a, view, i8, bundle);
        }
        if (z8 || i8 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z8;
        }
        int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                int i11 = 0;
                while (true) {
                    if (clickableSpanArr == null || i11 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i11])) {
                        z9 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            z9 = false;
            if (z9) {
                clickableSpan.onClick(view);
                z10 = true;
            }
        }
        return z10;
    }

    public void h(View view, int i8) {
        this.f4917a.sendAccessibilityEvent(view, i8);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4917a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
