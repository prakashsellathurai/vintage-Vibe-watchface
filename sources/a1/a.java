package a1;

import a8.g;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.t0;
import androidx.health.services.client.R;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import c3.b;
import c7.n;
import h2.d;
import h7.e;
import i2.e0;
import i7.f;
import i7.m;
import j7.e;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k3.j;
import k7.c;
import n1.h;
import n1.p;
import o6.q;
import q7.k;
import r2.v;
import y7.l0;
import y7.o1;
import y7.z0;

public class a implements b, e0, p {
    public static final int[] A = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] B = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] C = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] D = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] E = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] F = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16843958, 16843959, 16844144, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] G = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] H = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] I = {16842960, 16842994, 16842995};
    public static final int[] J = {R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] K = {R.attr.backgroundColor, R.attr.badgeGravity, R.attr.badgeTextColor, R.attr.horizontalOffset, R.attr.maxCharacterCount, R.attr.number, R.attr.verticalOffset};
    public static final int[] L = {16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] M = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] N = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};
    public static final int[] O = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] P = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] Q = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] R = {R.attr.behavior_autoHide};
    public static final int[] S = {R.attr.itemSpacing, R.attr.lineSpacing};
    public static final int[] T = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] U = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] V = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] W = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] X = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] Y = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] Z = {16843958, 16844159, R.attr.lineHeight};

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11a = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f12a0 = {16842804, 16844159, R.attr.lineHeight};

    /* renamed from: b  reason: collision with root package name */
    public static final d f13b = new d(9, "NO_VALUE");

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f14b0 = {R.attr.navigationIconTint};

    /* renamed from: c  reason: collision with root package name */
    public static final d f15c = new d(9, "NONE");

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f16c0 = {R.attr.materialCircleRadius};

    /* renamed from: d  reason: collision with root package name */
    public static final d f17d = new d(9, "PENDING");

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f18d0 = {R.attr.behavior_overlapTop};
    public static final j7.d[] e = new j7.d[0];

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f19e0 = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};

    /* renamed from: f  reason: collision with root package name */
    public static final d f20f = new d(9, "NULL");

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f21f0 = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};

    /* renamed from: g  reason: collision with root package name */
    public static final a f22g = new a();

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f23g0 = {R.attr.tabBackground, R.attr.tabContentStart, R.attr.tabGravity, R.attr.tabIconTint, R.attr.tabIconTintMode, R.attr.tabIndicator, R.attr.tabIndicatorAnimationDuration, R.attr.tabIndicatorAnimationMode, R.attr.tabIndicatorColor, R.attr.tabIndicatorFullWidth, R.attr.tabIndicatorGravity, R.attr.tabIndicatorHeight, R.attr.tabInlineLabel, R.attr.tabMaxWidth, R.attr.tabMinWidth, R.attr.tabMode, R.attr.tabPadding, R.attr.tabPaddingBottom, R.attr.tabPaddingEnd, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabRippleColor, R.attr.tabSelectedTextColor, R.attr.tabTextAppearance, R.attr.tabTextColor, R.attr.tabUnboundedRipple};

    /* renamed from: h  reason: collision with root package name */
    public static final Object f24h = new d(9, "NO_DECISION");

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f25h0 = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16843958, 16843959, 16844144, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: i  reason: collision with root package name */
    public static final d f26i = new d(9, "CLOSED");

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f27i0 = {R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: j  reason: collision with root package name */
    public static final d f28j = new d(9, "UNDEFINED");

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f29j0 = {16842766, 16842906, 16843088, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};

    /* renamed from: k  reason: collision with root package name */
    public static final d f30k = new d(9, "REUSABLE_CLAIMED");

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f31k0 = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    /* renamed from: l  reason: collision with root package name */
    public static final Object f32l = new d(9, "CONDITION_FALSE");

    /* renamed from: l0  reason: collision with root package name */
    public static final d f33l0 = new d(9, "NO_OWNER");

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f34m = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};

    /* renamed from: m0  reason: collision with root package name */
    public static final a f35m0 = new a();

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f36n = {16842931};

    /* renamed from: n0  reason: collision with root package name */
    public static final int[] f37n0 = {16842948};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f38o = {16843071};

    /* renamed from: o0  reason: collision with root package name */
    public static final a f39o0 = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f40p = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f41p0 = {R.attr.boxedEdges, R.attr.layout_boxedEdges};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f42q = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f43q0 = {16843033, R.attr.background_border_cap, R.attr.background_border_color, R.attr.background_border_width, R.attr.background_color, R.attr.background_radius, R.attr.background_radius_percent, R.attr.background_radius_pressed, R.attr.background_radius_pressed_percent, R.attr.background_shadow_width, R.attr.clip_dimen, R.attr.img_circle_percentage, R.attr.img_horizontal_offset_percentage, R.attr.img_padding, R.attr.img_tint};
    public static final int[] r = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f44r0 = {R.attr.wsPageIndicatorDotColor, R.attr.wsPageIndicatorDotColorSelected, R.attr.wsPageIndicatorDotFadeInDuration, R.attr.wsPageIndicatorDotFadeOutDelay, R.attr.wsPageIndicatorDotFadeOutDuration, R.attr.wsPageIndicatorDotFadeWhenIdle, R.attr.wsPageIndicatorDotRadius, R.attr.wsPageIndicatorDotRadiusSelected, R.attr.wsPageIndicatorDotShadowColor, R.attr.wsPageIndicatorDotShadowDx, R.attr.wsPageIndicatorDotShadowDy, R.attr.wsPageIndicatorDotShadowRadius, R.attr.wsPageIndicatorDotSpacing};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f45s = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f46t = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f47u = {R.attr.allowStacking};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f48v = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] w = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f49x = {16843436, 16843437};
    public static final int[] y = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f50z = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};

    public static final List A(Object obj) {
        List singletonList = Collections.singletonList(obj);
        k.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List B(Object... objArr) {
        return objArr.length > 0 ? f.L(objArr) : i7.k.f4879f;
    }

    public static final int C(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((((float) i8) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void D(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof t0) {
                    editorInfo.hintText = ((t0) parent).a();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r5.l0() != false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(java.lang.Object r9, j7.d r10, p7.l r11) {
        /*
            boolean r0 = r10 instanceof c8.f
            if (r0 == 0) goto L_0x00d1
            c8.f r10 = (c8.f) r10
            java.lang.Throwable r0 = h7.e.a(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            if (r11 == 0) goto L_0x0015
            y7.r r0 = new y7.r
            r0.<init>(r11, r9)
            goto L_0x001d
        L_0x0015:
            r0 = r9
            goto L_0x001d
        L_0x0017:
            y7.q r11 = new y7.q
            r11.<init>(r0, r1)
            r0 = r11
        L_0x001d:
            j7.d<T> r11 = r10.f2841j
            r10.a()
            y7.w r2 = r10.f2840i
            boolean r3 = r2.O()
            r4 = 1
            if (r3 == 0) goto L_0x0038
            r10.f2842k = r0
            r10.f8578h = r4
            j7.f r9 = r10.a()
            r2.N(r9, r10)
            goto L_0x00d4
        L_0x0038:
            y7.q0 r2 = y7.q1.a()
            long r5 = r2.f8595h
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0049
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r1
        L_0x004a:
            if (r3 == 0) goto L_0x0060
            r10.f2842k = r0
            r10.f8578h = r4
            i7.c<y7.k0<?>> r9 = r2.f8597j
            if (r9 != 0) goto L_0x005b
            i7.c r9 = new i7.c
            r9.<init>()
            r2.f8597j = r9
        L_0x005b:
            r9.addLast(r10)
            goto L_0x00d4
        L_0x0060:
            r2.Q(r4)
            r3 = 0
            j7.f r5 = r10.a()     // Catch:{ all -> 0x0088 }
            y7.z0$b r6 = y7.z0.b.f8628f     // Catch:{ all -> 0x0088 }
            j7.f$b r5 = r5.d(r6)     // Catch:{ all -> 0x0088 }
            y7.z0 r5 = (y7.z0) r5     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x008a
            boolean r6 = r5.c()     // Catch:{ all -> 0x0088 }
            if (r6 != 0) goto L_0x008a
            java.util.concurrent.CancellationException r1 = r5.D()     // Catch:{ all -> 0x0088 }
            r10.c(r0, r1)     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = q(r1)     // Catch:{ all -> 0x0088 }
            r10.i(r0)     // Catch:{ all -> 0x0088 }
            r1 = r4
            goto L_0x008a
        L_0x0088:
            r9 = move-exception
            goto L_0x00c5
        L_0x008a:
            if (r1 != 0) goto L_0x00be
            java.lang.Object r0 = r10.f2843l     // Catch:{ all -> 0x0088 }
            j7.f r1 = r11.a()     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = c8.t.b(r1, r0)     // Catch:{ all -> 0x0088 }
            h2.d r5 = c8.t.f2871a     // Catch:{ all -> 0x0088 }
            if (r0 == r5) goto L_0x009f
            y7.u1 r5 = y7.u.b(r11, r1, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x00a0
        L_0x009f:
            r5 = r3
        L_0x00a0:
            r11.i(r9)     // Catch:{ all -> 0x00b1 }
            h7.h r9 = h7.h.f4787a     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00ad
            boolean r9 = r5.l0()     // Catch:{ all -> 0x0088 }
            if (r9 == 0) goto L_0x00be
        L_0x00ad:
            c8.t.a(r1, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x00be
        L_0x00b1:
            r9 = move-exception
            if (r5 == 0) goto L_0x00ba
            boolean r11 = r5.l0()     // Catch:{ all -> 0x0088 }
            if (r11 == 0) goto L_0x00bd
        L_0x00ba:
            c8.t.a(r1, r0)     // Catch:{ all -> 0x0088 }
        L_0x00bd:
            throw r9     // Catch:{ all -> 0x0088 }
        L_0x00be:
            boolean r9 = r2.S()     // Catch:{ all -> 0x0088 }
            if (r9 != 0) goto L_0x00be
            goto L_0x00c8
        L_0x00c5:
            r10.h(r9, r3)     // Catch:{ all -> 0x00cc }
        L_0x00c8:
            r2.P(r4)
            goto L_0x00d4
        L_0x00cc:
            r9 = move-exception
            r2.P(r4)
            throw r9
        L_0x00d1:
            r10.i(r9)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.E(java.lang.Object, j7.d, p7.l):void");
    }

    public static final Set F(Object obj) {
        Set singleton = Collections.singleton(obj);
        k.d(singleton, "singleton(element)");
        return singleton;
    }

    public static final Set G(Object... objArr) {
        k.e(objArr, "elements");
        return objArr.length > 0 ? f.R(objArr) : m.f4881f;
    }

    public static final void I(Object obj) {
        if (obj instanceof e.a) {
            throw ((e.a) obj).f4783f;
        }
    }

    public static final Map J(LinkedHashMap linkedHashMap) {
        k.e(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        k.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final g c(Object obj) {
        if (obj == null) {
            obj = f20f;
        }
        return new g(obj);
    }

    public static final void f(Throwable th, Throwable th2) {
        k.e(th, "<this>");
        k.e(th2, "exception");
        if (th != th2) {
            m7.b.f5468a.a(th, th2);
        }
    }

    public static final androidx.lifecycle.g g(a8.f fVar) {
        k.e(fVar, "<this>");
        androidx.lifecycle.g gVar = new androidx.lifecycle.g(j7.g.f5052f, 5000, new i(fVar, (j7.d<? super i>) null));
        boolean k8 = l.b.j().k();
        Object value = fVar.getValue();
        if (k8) {
            gVar.i(value);
        } else {
            gVar.j(value);
        }
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.h(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static void j(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static float k(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f9));
    }

    public static int l(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    public static final int m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static q1.d n(x5.a aVar) {
        int ordinal = aVar.ordinal();
        return ordinal != 0 ? ordinal != 8 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 10 ? ordinal != 11 ? q1.d.EMPTY : q1.d.PHOTO_IMAGE : q1.d.MONOCHROMATIC_IMAGE : q1.d.RANGED_VALUE : q1.d.LONG_TEXT : q1.d.SHORT_TEXT : q1.d.NO_PERMISSION : q1.d.NO_DATA : q1.d.SMALL_IMAGE : q1.d.NOT_CONFIGURED;
    }

    public static Rect o(RectF rectF) {
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static final j7.d p(Object obj, j7.d dVar, p7.p pVar) {
        k.e(pVar, "<this>");
        k.e(dVar, "completion");
        if (pVar instanceof l7.a) {
            return ((l7.a) pVar).c(obj, dVar);
        }
        j7.f a9 = dVar.a();
        return a9 == j7.g.f5052f ? new k7.b(obj, dVar, pVar) : new c(dVar, a9, pVar, obj);
    }

    public static final Object q(Throwable th) {
        k.e(th, "exception");
        return new e.a(th);
    }

    public static String r(androidx.wear.protolayout.protobuf.g gVar) {
        String str;
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i8 = 0; i8 < gVar.size(); i8++) {
            int i9 = gVar.i(i8);
            if (i9 == 34) {
                str = "\\\"";
            } else if (i9 == 39) {
                str = "\\'";
            } else if (i9 != 92) {
                switch (i9) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (i9 < 32 || i9 > 126) {
                            sb.append('\\');
                            sb.append((char) (((i9 >>> 6) & 3) + 48));
                            sb.append((char) (((i9 >>> 3) & 7) + 48));
                            i9 = (i9 & 7) + 48;
                        }
                        sb.append((char) i9);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=f8.g, code=c8.r, for r4v0, types: [f8.g] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(c8.r r4, long r5, p7.p r7) {
        /*
        L_0x0000:
            long r0 = r4.f2869h
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return r4
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = c8.b.f2834f
            java.lang.Object r0 = r0.get(r4)
            h2.d r1 = f26i
            if (r0 != r1) goto L_0x0019
            return r1
        L_0x0019:
            c8.b r0 = (c8.b) r0
            c8.r r0 = (c8.r) r0
            if (r0 == 0) goto L_0x0021
        L_0x001f:
            r4 = r0
            goto L_0x0000
        L_0x0021:
            long r0 = r4.f2869h
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.g(r0, r4)
            c8.r r0 = (c8.r) r0
        L_0x0030:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = c8.b.f2834f
            r2 = 0
            boolean r2 = r1.compareAndSet(r4, r2, r0)
            if (r2 == 0) goto L_0x003b
            r1 = 1
            goto L_0x0042
        L_0x003b:
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x0030
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0000
            boolean r1 = r4.a()
            if (r1 == 0) goto L_0x001f
            r4.b()
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.s(f8.g, long, p7.p):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: z5.b} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o6.q t(r5.e r6, i6.e r7, o6.q r8) {
        /*
            java.lang.String r0 = r7.f4862a
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1679829819: goto L_0x003d;
                case -1085510111: goto L_0x0032;
                case 198012600: goto L_0x0027;
                case 1142656251: goto L_0x001c;
                case 1843423419: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0048
        L_0x0011:
            java.lang.String r1 = "Expressions"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r0 = r2
            goto L_0x0049
        L_0x001c:
            java.lang.String r1 = "Condition"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            goto L_0x0048
        L_0x0025:
            r0 = r3
            goto L_0x0049
        L_0x0027:
            java.lang.String r1 = "Expression"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x0048
        L_0x0030:
            r0 = r4
            goto L_0x0049
        L_0x0032:
            java.lang.String r1 = "Default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0048
        L_0x003b:
            r0 = r5
            goto L_0x0049
        L_0x003d:
            java.lang.String r1 = "Compare"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = -1
        L_0x0049:
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            if (r0 == r5) goto L_0x0096
            if (r0 == r4) goto L_0x0073
            if (r0 == r3) goto L_0x006d
            if (r0 == r2) goto L_0x0056
            goto L_0x00c9
        L_0x0056:
            java.util.ArrayList r7 = r7.f4863b
            java.util.Iterator r7 = r7.iterator()
        L_0x005c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r7.next()
            i6.e r0 = (i6.e) r0
            t(r6, r0, r8)
            goto L_0x005c
        L_0x006c:
            return r1
        L_0x006d:
            o6.d r7 = new o6.d
            r7.<init>(r8)
            goto L_0x009b
        L_0x0073:
            boolean r0 = r8 instanceof o6.d
            if (r0 == 0) goto L_0x00c9
            o6.d r8 = (o6.d) r8
            java.lang.String r0 = i6.g.d(r7)
            if (r0 == 0) goto L_0x0095
            z5.b r2 = new z5.b
            v5.b r6 = r6.f7077h
            r2.<init>(r0, r6, r1)
            java.lang.String r6 = "name"
            i6.a r6 = r7.b(r6)
            java.lang.String r6 = r6.d()
            java.util.HashMap r7 = r8.f6132i
            r7.put(r6, r2)
        L_0x0095:
            return r1
        L_0x0096:
            o6.f r7 = new o6.f
            r7.<init>(r8)
        L_0x009b:
            r1 = r7
            r5.d r6 = r6.f7074d
            r1.f6179h = r6
            goto L_0x00c9
        L_0x00a1:
            boolean r0 = r8 instanceof o6.d
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "expression"
            i6.a r7 = r7.b(r0)
            java.lang.String r0 = ""
            java.lang.String r7 = r7.e(r0)
            r0 = r8
            o6.d r0 = (o6.d) r0
            java.util.HashMap r0 = r0.f6132i
            java.lang.Object r7 = r0.get(r7)
            r1 = r7
            z5.b r1 = (z5.b) r1
        L_0x00bd:
            o6.a r7 = new o6.a
            v5.b r0 = r6.f7077h
            r7.<init>(r8, r1, r0)
            r5.d r6 = r6.f7074d
            r7.f6179h = r6
            r1 = r7
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.t(r5.e, i6.e, o6.q):o6.q");
    }

    public static final int u(List list) {
        k.e(list, "<this>");
        return list.size() - 1;
    }

    public static final LifecycleCoroutineScopeImpl v(r rVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z8;
        k.e(rVar, "<this>");
        androidx.lifecycle.m lifecycle = rVar.getLifecycle();
        k.e(lifecycle, "<this>");
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f1489a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                o1 o1Var = new o1((z0) null);
                d8.c cVar = l0.f8580a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, o1Var.t(c8.m.f2865a.P()));
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z8 = false;
                            continue;
                            break;
                        }
                    } else {
                        z8 = true;
                        continue;
                        break;
                    }
                }
                if (z8) {
                    d8.c cVar2 = l0.f8580a;
                    j.K(lifecycleCoroutineScopeImpl, c8.m.f2865a.P(), new o(lifecycleCoroutineScopeImpl, (j7.d<? super o>) null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static PointF w(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new PointF(fArr[2], fArr[5]);
    }

    public static final j7.d x(j7.d<Object> dVar) {
        k.e(dVar, "<this>");
        l7.c cVar = dVar instanceof l7.c ? (l7.c) dVar : null;
        if (cVar != null && (dVar = cVar.f5331h) == null) {
            j7.e eVar = (j7.e) cVar.a().d(e.a.f5050f);
            if (eVar == null || (dVar = eVar.h(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f5331h = dVar;
        }
        return dVar;
    }

    public static boolean y(MotionEvent motionEvent, int i8) {
        return (motionEvent.getSource() & i8) == i8;
    }

    public static final h7.f z(p7.a aVar) {
        k.e(aVar, "initializer");
        return new h7.f(aVar);
    }

    public void H() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void K(q qVar, Object obj) {
        if (qVar instanceof c7.q) {
            c7.q qVar2 = (c7.q) qVar;
            c7.o oVar = (c7.o) obj;
            qVar2.E(oVar);
            n nVar = qVar2.f2826j;
            if (nVar != null) {
                nVar.c(oVar);
            }
        }
    }

    public boolean a(h hVar, Rect rect, int i8, int i9) {
        return false;
    }

    public boolean b(h hVar, Rect rect, int i8, int i9, boolean z8) {
        return false;
    }

    public Object d(j2.b bVar, float f9) {
        boolean z8 = true;
        if (bVar.t() != 1) {
            z8 = false;
        }
        if (z8) {
            bVar.a();
        }
        double o8 = bVar.o();
        double o9 = bVar.o();
        double o10 = bVar.o();
        double o11 = bVar.t() == 7 ? bVar.o() : 1.0d;
        if (z8) {
            bVar.d();
        }
        if (o8 <= 1.0d && o9 <= 1.0d && o10 <= 1.0d) {
            o8 *= 255.0d;
            o9 *= 255.0d;
            o10 *= 255.0d;
            if (o11 <= 1.0d) {
                o11 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) o11, (int) o8, (int) o9, (int) o10));
    }

    public v e(v vVar, p2.g gVar) {
        return vVar;
    }

    public void i() {
        throw null;
    }
}
