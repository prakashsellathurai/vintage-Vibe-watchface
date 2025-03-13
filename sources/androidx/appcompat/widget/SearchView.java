package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.health.services.client.R;
import j0.x;
import java.util.WeakHashMap;

public class SearchView extends a0 implements j.a {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f539g0 = 0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public o0.a O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f540a0;

    /* renamed from: b0  reason: collision with root package name */
    public SearchableInfo f541b0;

    /* renamed from: c0  reason: collision with root package name */
    public Bundle f542c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Runnable f543d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Runnable f544e0;

    /* renamed from: f0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f545f0;

    /* renamed from: p  reason: collision with root package name */
    public final SearchAutoComplete f546p;

    /* renamed from: q  reason: collision with root package name */
    public final View f547q;
    public final View r;

    /* renamed from: s  reason: collision with root package name */
    public final View f548s;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f549t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f550u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f551v;
    public final ImageView w;

    /* renamed from: x  reason: collision with root package name */
    public final View f552x;
    public o y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f553z;

    public static class SearchAutoComplete extends d {

        /* renamed from: d  reason: collision with root package name */
        public int f554d = getThreshold();
        public SearchView e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f555f;

        /* renamed from: g  reason: collision with root package name */
        public final Runnable f556g = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f555f) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f555f = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i8 >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final boolean enoughToFilter() {
            return this.f554d <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f555f) {
                Runnable runnable = this.f556g;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z8, int i8, Rect rect) {
            super.onFocusChanged(z8, i8, rect);
            SearchView searchView = this.e;
            searchView.u(searchView.N);
            searchView.post(searchView.f543d0);
            SearchAutoComplete searchAutoComplete = searchView.f546p;
            if (searchAutoComplete.hasFocus()) {
                searchAutoComplete.refreshAutoCompleteResults();
            }
        }

        public final boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z8) {
            super.onWindowFocusChanged(z8);
            if (z8 && this.e.hasFocus() && getVisibility() == 0) {
                this.f555f = true;
                Context context = getContext();
                int i8 = SearchView.f539g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    setInputMethodMode(1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z8) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            Runnable runnable = this.f556g;
            if (!z8) {
                this.f555f = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f555f = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f555f = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.e = searchView;
        }

        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f554d = i8;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f546p.getText();
            searchView.V = text;
            boolean z8 = !TextUtils.isEmpty(text);
            searchView.t(z8);
            boolean z9 = !z8;
            int i11 = 8;
            if (searchView.U && !searchView.N && z9) {
                searchView.f550u.setVisibility(8);
                i11 = 0;
            }
            searchView.w.setVisibility(i11);
            searchView.p();
            searchView.s();
            charSequence.toString();
            searchView.getClass();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.q();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            o0.a aVar = SearchView.this.O;
            if (aVar instanceof j0) {
                aVar.b((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z8) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z8);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.f552x;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.r.getPaddingLeft();
                Rect rect = new Rect();
                boolean a9 = s0.a(searchView);
                int dimensionPixelSize = searchView.M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                SearchAutoComplete searchAutoComplete = searchView.f546p;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                int i16 = rect.left;
                searchAutoComplete.setDropDownHorizontalOffset(a9 ? -i16 : paddingLeft - (i16 + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f549t;
            SearchAutoComplete searchAutoComplete = searchView.f546p;
            if (view == imageView) {
                searchView.u(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.L;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f551v) {
                searchView.k();
            } else if (view == searchView.f550u) {
                searchView.o();
            } else if (view == searchView.w) {
                SearchableInfo searchableInfo = searchView.f541b0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.H);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.j(searchView.I, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchAutoComplete.refreshAutoCompleteResults();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f541b0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f546p;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
                return true;
            } else if (searchView.f541b0 == null || searchView.O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            } else {
                if (i8 == 66 || i8 == 84 || i8 == 61) {
                    searchView.l(searchAutoComplete.getListSelection());
                } else if (i8 == 21 || i8 == 22) {
                    searchAutoComplete.setSelection(i8 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.setInputMethodMode(1);
                    if (searchAutoComplete.enoughToFilter()) {
                        searchAutoComplete.showDropDown();
                    }
                } else if (i8 != 19) {
                    return false;
                } else {
                    searchAutoComplete.getListSelection();
                    return false;
                }
                return true;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.o();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.l(i8);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
            SearchView.this.m(i8);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    public static class n extends p0.a {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f568h;

        public class a implements Parcelable.ClassLoaderCreator<n> {
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new n[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f568h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public n(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f568h + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeValue(Boolean.valueOf(this.f568h));
        }
    }

    public static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f569a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f570b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f571c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f572d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f573f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f570b = rect3;
            Rect rect4 = new Rect();
            this.f572d = rect4;
            Rect rect5 = new Rect();
            this.f571c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i8 = -scaledTouchSlop;
            rect4.inset(i8, i8);
            rect5.set(rect2);
            this.f569a = view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f573f
                r8.f573f = r4
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f573f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f572d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r5 = r2
                r2 = r4
                goto L_0x0041
            L_0x002f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f570b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f573f = r5
                r2 = r5
                goto L_0x0041
            L_0x003f:
                r2 = r5
                r5 = r4
            L_0x0041:
                if (r5 == 0) goto L_0x006a
                android.graphics.Rect r4 = r8.f571c
                android.view.View r8 = r8.f569a
                if (r2 == 0) goto L_0x005b
                boolean r2 = r4.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                int r0 = r8.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                int r1 = r8.getHeight()
                int r1 = r1 / r3
                goto L_0x0062
            L_0x005b:
                int r2 = r4.left
                int r0 = r0 - r2
                float r0 = (float) r0
                int r2 = r4.top
                int r1 = r1 - r2
            L_0x0062:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                boolean r4 = r8.dispatchTouchEvent(r9)
            L_0x006a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Context context2 = context;
        this.f553z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f543d0 = new b();
        this.f544e0 = new c();
        this.f545f0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        o0 o0Var = new o0(context2, context2.obtainStyledAttributes(attributeSet, a1.a.D, i8, 0));
        LayoutInflater.from(context).inflate(o0Var.h(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f546p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f547q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f548s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f549t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f550u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f551v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        g gVar2 = gVar;
        Drawable e4 = o0Var.e(10);
        int[] iArr = x.f4957a;
        x.c.q(findViewById, e4);
        x.c.q(findViewById2, o0Var.e(14));
        imageView.setImageDrawable(o0Var.e(13));
        imageView2.setImageDrawable(o0Var.e(7));
        imageView3.setImageDrawable(o0Var.e(4));
        imageView4.setImageDrawable(o0Var.e(16));
        imageView5.setImageDrawable(o0Var.e(13));
        this.E = o0Var.e(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.F = o0Var.h(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = o0Var.h(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar2);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(o0Var.a(8, true));
        int d9 = o0Var.d(1, -1);
        if (d9 != -1) {
            setMaxWidth(d9);
        }
        this.J = o0Var.j(6);
        this.Q = o0Var.j(11);
        int g9 = o0Var.g(3, -1);
        if (g9 != -1) {
            setImeOptions(g9);
        }
        int g10 = o0Var.g(2, -1);
        if (g10 != -1) {
            setInputType(g10);
        }
        setFocusable(o0Var.a(0, true));
        o0Var.m();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f552x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        u(this.M);
        r();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f546p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f546p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.f546p.getImeOptions();
    }

    public int getInputType() {
        return this.f546p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f546p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f541b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f541b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public o0.a getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f542c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f541b0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f542c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f546p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i8) {
        int i9;
        String h8;
        Cursor cursor = this.O.f5978c;
        if (cursor != null && cursor.moveToPosition(i8)) {
            Intent intent = null;
            try {
                int i10 = j0.f747x;
                String h9 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h9 == null) {
                    h9 = this.f541b0.getSuggestIntentAction();
                }
                if (h9 == null) {
                    h9 = "android.intent.action.SEARCH";
                }
                String h10 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h10 == null) {
                    h10 = this.f541b0.getSuggestIntentData();
                }
                if (!(h10 == null || (h8 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h10 = h10 + "/" + Uri.encode(h8);
                }
                intent = i(h9, h10 == null ? null : Uri.parse(h10), j0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), j0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    i9 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i9 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i9 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e9) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e9);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f546p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i8) {
        String c9;
        Editable text = this.f546p.getText();
        Cursor cursor = this.O.f5978c;
        if (cursor != null) {
            if (!cursor.moveToPosition(i8) || (c9 = this.O.c(cursor)) == null) {
                setQuery(text);
            } else {
                setQuery(c9);
            }
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f546p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f541b0 != null) {
                getContext().startActivity(i("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f546p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.V = "";
        clearFocus();
        u(true);
        searchAutoComplete.setImeOptions(this.f540a0);
        this.W = false;
    }

    public final void onActionViewExpanded() {
        if (!this.W) {
            this.W = true;
            SearchAutoComplete searchAutoComplete = this.f546p;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f540a0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f543d0);
        post(this.f544e0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8) {
            SearchAutoComplete searchAutoComplete = this.f546p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i12 = iArr[1] - iArr2[1];
            int i13 = iArr[0] - iArr2[0];
            Rect rect = this.f553z;
            rect.set(i13, i12, searchAutoComplete.getWidth() + i13, searchAutoComplete.getHeight() + i12);
            int i14 = rect.left;
            int i15 = rect.right;
            int i16 = i11 - i9;
            Rect rect2 = this.A;
            rect2.set(i14, 0, i15, i16);
            o oVar = this.y;
            if (oVar == null) {
                o oVar2 = new o(rect2, rect, searchAutoComplete);
                this.y = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.f570b.set(rect2);
            Rect rect3 = oVar.f572d;
            rect3.set(rect2);
            int i17 = -oVar.e;
            rect3.inset(i17, i17);
            oVar.f571c.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.N
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.T
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.T
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.T
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.f6241f);
        u(nVar.f568h);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f568h = this.N;
        return nVar;
    }

    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        post(this.f543d0);
    }

    public final void p() {
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f546p.getText());
        int i8 = 0;
        if (!z9 && (!this.M || this.W)) {
            z8 = false;
        }
        if (!z8) {
            i8 = 8;
        }
        ImageView imageView = this.f551v;
        imageView.setVisibility(i8);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z9 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f546p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f548s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z8 = this.M;
        SearchAutoComplete searchAutoComplete = this.f546p;
        if (z8 && (drawable = this.E) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final boolean requestFocus(int i8, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (this.N) {
            return super.requestFocus(i8, rect);
        }
        boolean requestFocus = this.f546p.requestFocus(i8, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        int i8 = 0;
        if (!((this.P || this.U) && !this.N) || !(this.f550u.getVisibility() == 0 || this.w.getVisibility() == 0)) {
            i8 = 8;
        }
        this.f548s.setVisibility(i8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f542c0 = bundle;
    }

    public void setIconified(boolean z8) {
        if (z8) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f546p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z8) {
        if (this.M != z8) {
            this.M = z8;
            u(z8);
            r();
        }
    }

    public void setImeOptions(int i8) {
        this.f546p.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.f546p.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.T = i8;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z8) {
        this.R = z8;
        o0.a aVar = this.O;
        if (aVar instanceof j0) {
            ((j0) aVar).f753p = z8 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f541b0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f546p
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L_0x0068
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f541b0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f541b0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L_0x0034
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f541b0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L_0x0034
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L_0x0034:
            r0.setInputType(r8)
            o0.a r8 = r7.O
            if (r8 == 0) goto L_0x003e
            r8.b(r3)
        L_0x003e:
            android.app.SearchableInfo r8 = r7.f541b0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L_0x0065
            androidx.appcompat.widget.j0 r8 = new androidx.appcompat.widget.j0
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f541b0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f545f0
            r8.<init>(r4, r7, r5, r6)
            r7.O = r8
            r0.setAdapter(r8)
            o0.a r8 = r7.O
            androidx.appcompat.widget.j0 r8 = (androidx.appcompat.widget.j0) r8
            boolean r4 = r7.R
            if (r4 == 0) goto L_0x0062
            r4 = 2
            goto L_0x0063
        L_0x0062:
            r4 = r1
        L_0x0063:
            r8.f753p = r4
        L_0x0065:
            r7.r()
        L_0x0068:
            android.app.SearchableInfo r8 = r7.f541b0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L_0x0098
            android.app.SearchableInfo r8 = r7.f541b0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L_0x007d
            android.content.Intent r3 = r7.H
            goto L_0x0087
        L_0x007d:
            android.app.SearchableInfo r8 = r7.f541b0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L_0x0087
            android.content.Intent r3 = r7.I
        L_0x0087:
            if (r3 == 0) goto L_0x0098
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            r7.U = r1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        L_0x00a2:
            boolean r8 = r7.N
            r7.u(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z8) {
        this.P = z8;
        u(this.N);
    }

    public void setSuggestionsAdapter(o0.a aVar) {
        this.O = aVar;
        this.f546p.setAdapter(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2.U == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.P
            if (r0 == 0) goto L_0x0021
            r1 = 0
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.U
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.N
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.U
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r2 = r2.f550u
            r2.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.t(boolean):void");
    }

    public final void u(boolean z8) {
        this.N = z8;
        int i8 = 0;
        int i9 = z8 ? 0 : 8;
        boolean z9 = !TextUtils.isEmpty(this.f546p.getText());
        this.f549t.setVisibility(i9);
        t(z9);
        this.f547q.setVisibility(z8 ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.M) ? 8 : 0);
        p();
        boolean z10 = !z9;
        if (!this.U || this.N || !z10) {
            i8 = 8;
        } else {
            this.f550u.setVisibility(8);
        }
        this.w.setVisibility(i8);
        s();
    }
}
