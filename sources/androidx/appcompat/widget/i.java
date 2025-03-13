package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.f0;
import androidx.health.services.client.R;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f736b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static i f737c;

    /* renamed from: a  reason: collision with root package name */
    public f0 f738a;

    public class a implements f0.b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f739a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f740b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f741c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f742d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f743f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i8) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i8) {
            int c9 = k0.c(context, R.attr.colorControlHighlight);
            int b9 = k0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{k0.f766b, k0.f768d, k0.f767c, k0.f769f}, new int[]{b9, c0.a.a(c9, i8), c0.a.a(c9, i8), i8});
        }

        public static LayerDrawable c(f0 f0Var, Context context, int i8) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            Drawable e4 = f0Var.e(context, R.drawable.abc_star_black_48dp);
            Drawable e9 = f0Var.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e4 instanceof BitmapDrawable) && e4.getIntrinsicWidth() == dimensionPixelSize && e4.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) e4;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e4.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((e9 instanceof BitmapDrawable) && e9.getIntrinsicWidth() == dimensionPixelSize && e9.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e9;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e9.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i8, PorterDuff.Mode mode) {
            if (w.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f736b;
            }
            drawable.setColorFilter(i.c(i8, mode));
        }

        public final ColorStateList d(Context context, int i8) {
            if (i8 == R.drawable.abc_edit_text_material) {
                Object obj = g.a.f4440a;
                return context.getColorStateList(R.color.abc_tint_edittext);
            } else if (i8 == R.drawable.abc_switch_track_mtrl_alpha) {
                Object obj2 = g.a.f4440a;
                return context.getColorStateList(R.color.abc_tint_switch_track);
            } else if (i8 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d9 = k0.d(context, R.attr.colorSwitchThumbNormal);
                if (d9 == null || !d9.isStateful()) {
                    iArr[0] = k0.f766b;
                    iArr2[0] = k0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = k0.e;
                    iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                    iArr[2] = k0.f769f;
                    iArr2[2] = k0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = k0.f766b;
                    iArr[0] = iArr3;
                    iArr2[0] = d9.getColorForState(iArr3, 0);
                    iArr[1] = k0.e;
                    iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                    iArr[2] = k0.f769f;
                    iArr2[2] = d9.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i8 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, k0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i8 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i8 == R.drawable.abc_btn_colored_material) {
                    return b(context, k0.c(context, R.attr.colorAccent));
                }
                if (i8 == R.drawable.abc_spinner_mtrl_am_alpha || i8 == R.drawable.abc_spinner_textfield_background_material) {
                    Object obj3 = g.a.f4440a;
                    return context.getColorStateList(R.color.abc_tint_spinner);
                } else if (a(this.f740b, i8)) {
                    return k0.d(context, R.attr.colorControlNormal);
                } else {
                    if (a(this.e, i8)) {
                        Object obj4 = g.a.f4440a;
                        return context.getColorStateList(R.color.abc_tint_default);
                    } else if (a(this.f743f, i8)) {
                        Object obj5 = g.a.f4440a;
                        return context.getColorStateList(R.color.abc_tint_btn_checkable);
                    } else if (i8 != R.drawable.abc_seekbar_thumb_material) {
                        return null;
                    } else {
                        Object obj6 = g.a.f4440a;
                        return context.getColorStateList(R.color.abc_tint_seek_thumb);
                    }
                }
            }
        }
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f737c == null) {
                d();
            }
            iVar = f737c;
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter c(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter g9;
        synchronized (i.class) {
            g9 = f0.g(i8, mode);
        }
        return g9;
    }

    public static synchronized void d() {
        synchronized (i.class) {
            if (f737c == null) {
                i iVar = new i();
                f737c = iVar;
                iVar.f738a = f0.c();
                f0 f0Var = f737c.f738a;
                a aVar = new a();
                synchronized (f0Var) {
                    f0Var.e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, m0 m0Var, int[] iArr) {
        PorterDuff.Mode mode = f0.f714f;
        if (!w.a(drawable) || drawable.mutate() == drawable) {
            boolean z8 = m0Var.f779d;
            if (z8 || m0Var.f778c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z8 ? m0Var.f776a : null;
                PorterDuff.Mode mode2 = m0Var.f778c ? m0Var.f777b : f0.f714f;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = f0.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    public final synchronized Drawable b(Context context, int i8) {
        return this.f738a.e(context, i8);
    }
}
