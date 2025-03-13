package k0;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f5085a;

    /* renamed from: b  reason: collision with root package name */
    public int f5086b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f5087c = -1;

    public static class a {
        public static final a e = new a(16);

        /* renamed from: f  reason: collision with root package name */
        public static final a f5088f = new a(4096);

        /* renamed from: g  reason: collision with root package name */
        public static final a f5089g = new a(8192);

        /* renamed from: h  reason: collision with root package name */
        public static final a f5090h = new a(262144);

        /* renamed from: i  reason: collision with root package name */
        public static final a f5091i = new a(524288);

        /* renamed from: j  reason: collision with root package name */
        public static final a f5092j = new a(1048576);

        /* renamed from: k  reason: collision with root package name */
        public static final a f5093k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (g) null, (Class) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f5094l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (g) null, (Class) null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f5095a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5096b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends g.a> f5097c;

        /* renamed from: d  reason: collision with root package name */
        public final g f5098d;

        static {
            new a(1);
            new a(2);
            new a(4);
            new a(8);
            new a(32);
            new a(64);
            new a(128);
            Class<g.b> cls = g.b.class;
            new a(256, cls);
            new a(512, cls);
            Class<g.c> cls2 = g.c.class;
            new a(1024, cls2);
            new a(2048, cls2);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, g.C0073g.class);
            new a(2097152, g.h.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (g) null, g.e.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (g) null, g.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (String) null, (g) null, g.d.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, 16908362, (String) null, (g) null, (Class) null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, 16908372, (String) null, (g) null, (Class) null);
        }

        public a(int i8) {
            this((Object) null, i8, (String) null, (g) null, (Class) null);
        }

        public a(int i8, Class cls) {
            this((Object) null, i8, (String) null, (g) null, cls);
        }

        public a(Object obj, int i8, String str, g gVar, Class cls) {
            this.f5096b = i8;
            this.f5098d = gVar;
            this.f5095a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i8, str) : obj;
            this.f5097c = cls;
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5095a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f5095a;
            Object obj3 = this.f5095a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f5095a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5099a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f5099a = collectionInfo;
        }

        public static b a(int i8, int i9, int i10) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i9, false, i10));
        }
    }

    /* renamed from: k0.c$c  reason: collision with other inner class name */
    public static class C0072c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5100a;

        public C0072c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f5100a = collectionItemInfo;
        }

        public static C0072c a(int i8, int i9, int i10, int i11, boolean z8) {
            return new C0072c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i9, i10, i11, false, z8));
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5085a = accessibilityNodeInfo;
    }

    public final void a(int i8) {
        this.f5085a.addAction(i8);
    }

    public final void b(a aVar) {
        this.f5085a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5095a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5085a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f5085a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        boolean z8 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5085a;
        if (!z8) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList c9 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i8 = 0; i8 < c9.size(); i8++) {
            spannableString.setSpan(new a(((Integer) c12.get(i8)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c9.get(i8)).intValue(), ((Integer) c10.get(i8)).intValue(), ((Integer) c11.get(i8)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f5085a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f5087c == cVar.f5087c && this.f5086b == cVar.f5086b;
    }

    public final void f(String str) {
        this.f5085a.setClassName(str);
    }

    public final void g(Object obj) {
        this.f5085a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C0072c) obj).f5100a);
    }

    public final void h(CharSequence charSequence) {
        this.f5085a.setContentDescription(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5085a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5085a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add(new a(actionList.get(i8), 0, (String) null, (g) null, (Class) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            a aVar = (a) arrayList.get(i9);
            int a9 = aVar.a();
            if (a9 == 1) {
                str = "ACTION_FOCUS";
            } else if (a9 != 2) {
                switch (a9) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case EXERCISE_TYPE_GOLF_VALUE:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case EXERCISE_TYPE_SOCCER_VALUE:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    case 16908372:
                        str = "ACTION_IME_ENTER";
                        break;
                    default:
                        switch (a9) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a9) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN")) {
                Object obj = aVar.f5095a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    str = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(str);
            if (i9 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
