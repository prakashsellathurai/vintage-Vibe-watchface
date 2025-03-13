package androidx.appcompat.view.menu;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.o0;
import androidx.health.services.client.R;
import j0.x;

public class ListMenuItemView extends LinearLayout implements h.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public e f340a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f341b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f342c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f343d;
    public CheckBox e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f344f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f345g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f346h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f347i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f348j;

    /* renamed from: k  reason: collision with root package name */
    public final int f349k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f350l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f351m;

    /* renamed from: n  reason: collision with root package name */
    public final Drawable f352n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f353o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f354p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f355q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0 l8 = o0.l(getContext(), attributeSet, a.A, R.attr.listMenuViewStyle);
        this.f348j = l8.e(5);
        this.f349k = l8.h(1, -1);
        this.f351m = l8.a(7, false);
        this.f350l = context;
        this.f352n = l8.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f353o = obtainStyledAttributes.hasValue(0);
        l8.m();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f354p == null) {
            this.f354p = LayoutInflater.from(getContext());
        }
        return this.f354p;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        ImageView imageView = this.f345g;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f346h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f346h.getLayoutParams();
            rect.top += this.f346h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.appcompat.view.menu.e r11) {
        /*
            r10 = this;
            r10.f340a = r11
            boolean r0 = r11.isVisible()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.d r0 = r11.f430n
            boolean r3 = r0.n()
            r4 = 1
            if (r3 == 0) goto L_0x0035
            boolean r3 = r0.m()
            if (r3 == 0) goto L_0x002f
            char r3 = r11.f426j
            goto L_0x0031
        L_0x002f:
            char r3 = r11.f424h
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            r0.m()
            if (r3 == 0) goto L_0x0058
            androidx.appcompat.view.menu.e r0 = r10.f340a
            androidx.appcompat.view.menu.d r3 = r0.f430n
            boolean r5 = r3.n()
            if (r5 == 0) goto L_0x0054
            boolean r3 = r3.m()
            if (r3 == 0) goto L_0x004e
            char r0 = r0.f426j
            goto L_0x0050
        L_0x004e:
            char r0 = r0.f424h
        L_0x0050:
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            if (r1 != 0) goto L_0x0109
            android.widget.TextView r0 = r10.f344f
            androidx.appcompat.view.menu.e r3 = r10.f340a
            androidx.appcompat.view.menu.d r5 = r3.f430n
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x006a
            char r5 = r3.f426j
            goto L_0x006c
        L_0x006a:
            char r5 = r3.f424h
        L_0x006c:
            if (r5 != 0) goto L_0x0072
            java.lang.String r2 = ""
            goto L_0x0106
        L_0x0072:
            androidx.appcompat.view.menu.d r6 = r3.f430n
            android.content.Context r7 = r6.f399a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f399a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x0095
            r9 = -2146369516(0xffffffff80110014, float:-1.561231E-39)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x0095:
            boolean r6 = r6.m()
            if (r6 == 0) goto L_0x009e
            int r3 = r3.f427k
            goto L_0x00a0
        L_0x009e:
            int r3 = r3.f425i
        L_0x00a0:
            r6 = -2146369520(0xffffffff80110010, float:-1.561226E-39)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            androidx.appcompat.view.menu.e.c(r8, r3, r9, r6)
            r6 = -2146369524(0xffffffff8011000c, float:-1.56122E-39)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            androidx.appcompat.view.menu.e.c(r8, r3, r9, r6)
            r6 = -2146369525(0xffffffff8011000b, float:-1.561219E-39)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            androidx.appcompat.view.menu.e.c(r8, r3, r9, r6)
            r6 = -2146369519(0xffffffff80110011, float:-1.561227E-39)
            java.lang.String r6 = r7.getString(r6)
            androidx.appcompat.view.menu.e.c(r8, r3, r4, r6)
            r4 = -2146369517(0xffffffff80110013, float:-1.56123E-39)
            java.lang.String r4 = r7.getString(r4)
            r6 = 4
            androidx.appcompat.view.menu.e.c(r8, r3, r6, r4)
            r4 = -2146369521(0xffffffff8011000f, float:-1.561224E-39)
            java.lang.String r4 = r7.getString(r4)
            androidx.appcompat.view.menu.e.c(r8, r3, r2, r4)
            if (r5 == r2) goto L_0x00f8
            r2 = 10
            if (r5 == r2) goto L_0x00f4
            r2 = 32
            if (r5 == r2) goto L_0x00f0
            r8.append(r5)
            goto L_0x0102
        L_0x00f0:
            r2 = -2146369518(0xffffffff80110012, float:-1.561229E-39)
            goto L_0x00fb
        L_0x00f4:
            r2 = -2146369522(0xffffffff8011000e, float:-1.561223E-39)
            goto L_0x00fb
        L_0x00f8:
            r2 = -2146369523(0xffffffff8011000d, float:-1.561222E-39)
        L_0x00fb:
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
        L_0x0102:
            java.lang.String r2 = r8.toString()
        L_0x0106:
            r0.setText(r2)
        L_0x0109:
            android.widget.TextView r0 = r10.f344f
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0116
            android.widget.TextView r0 = r10.f344f
            r0.setVisibility(r1)
        L_0x0116:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f433q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(androidx.appcompat.view.menu.e):void");
    }

    public e getItemData() {
        return this.f340a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int[] iArr = x.f4957a;
        x.c.q(this, this.f348j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f343d = textView;
        int i8 = this.f349k;
        if (i8 != -1) {
            textView.setTextAppearance(this.f350l, i8);
        }
        this.f344f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f345g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f352n);
        }
        this.f346h = (ImageView) findViewById(R.id.group_divider);
        this.f347i = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i8, int i9) {
        if (this.f341b != null && this.f351m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f341b.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i8, i9);
    }

    public void setCheckable(boolean z8) {
        View view;
        CompoundButton compoundButton;
        if (z8 || this.f342c != null || this.e != null) {
            if ((this.f340a.f438x & 4) != 0) {
                if (this.f342c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f342c = radioButton;
                    LinearLayout linearLayout = this.f347i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f342c;
                view = this.e;
            } else {
                if (this.e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.e = checkBox;
                    LinearLayout linearLayout2 = this.f347i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.e;
                view = this.f342c;
            }
            if (z8) {
                compoundButton.setChecked(this.f340a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f342c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if ((this.f340a.f438x & 4) != 0) {
            if (this.f342c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f342c = radioButton;
                LinearLayout linearLayout = this.f347i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f342c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.f347i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f355q = z8;
        this.f351m = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        ImageView imageView = this.f346h;
        if (imageView != null) {
            imageView.setVisibility((this.f353o || !z8) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f340a.f430n.getClass();
        boolean z8 = this.f355q;
        if (z8 || this.f351m) {
            ImageView imageView = this.f341b;
            if (imageView != null || drawable != null || this.f351m) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f341b = imageView2;
                    LinearLayout linearLayout = this.f347i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f351m) {
                    ImageView imageView3 = this.f341b;
                    if (!z8) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f341b.getVisibility() != 0) {
                        this.f341b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f341b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f343d.setText(charSequence);
            if (this.f343d.getVisibility() != 0) {
                this.f343d.setVisibility(0);
            }
        } else if (this.f343d.getVisibility() != 8) {
            this.f343d.setVisibility(8);
        }
    }
}
