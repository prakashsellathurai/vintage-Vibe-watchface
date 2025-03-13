package k3;

import a8.f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.health.services.client.R;
import androidx.versionedparcelable.ParcelImpl;
import c8.r;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d8.c;
import e2.b;
import h2.d;
import h2.e;
import h7.h;
import i2.o;
import i2.t;
import j0.x;
import j7.e;
import j7.g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import o6.l;
import p7.p;
import q7.k;
import q7.s;
import t2.a;
import y4.f;
import y7.b0;
import y7.f1;
import y7.g1;
import y7.h0;
import y7.j0;
import y7.k0;
import y7.l0;
import y7.n1;
import y7.o0;
import y7.p0;
import y7.q;
import y7.q0;
import y7.q1;
import y7.r1;
import y7.s1;
import y7.u;
import y7.u1;
import y7.v;
import y7.w0;
import y7.x;
import y7.x0;
import y7.z;
import y7.z0;

public class j implements l, a {
    public static final int[] A = {16842930, 16843256, R.attr.entries, R.attr.entryValues, R.attr.useSimpleSummaryProvider};
    public static final int[] B = {16842930, 16843256, R.attr.entries, R.attr.entryValues};
    public static final int[] C = {16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, R.attr.allowDividerAbove, R.attr.allowDividerBelow, R.attr.defaultValue, R.attr.dependency, R.attr.enableCopying, R.attr.enabled, R.attr.fragment, R.attr.icon, R.attr.iconSpaceReserved, R.attr.isPreferenceVisible, R.attr.key, R.attr.layout, R.attr.order, R.attr.persistent, R.attr.selectable, R.attr.shouldDisableView, R.attr.singleLineTitle, R.attr.summary, R.attr.title, R.attr.widgetLayout};
    public static final int[] D = {16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml};
    public static final int[] E = {16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth};
    public static final int[] F = {16842994, 16843062, R.attr.adjustable, R.attr.min, R.attr.seekBarIncrement, R.attr.showSeekBarValue, R.attr.updatesContinuously};
    public static final int[] G = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};
    public static final int[] H = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};
    public static int I;
    public static volatile e J;
    public static volatile d K;
    public static final int[] L = {R.attr.lottie_autoPlay, R.attr.lottie_cacheComposition, R.attr.lottie_colorFilter, R.attr.lottie_enableMergePathsForKitKatAndAbove, R.attr.lottie_fallbackRes, R.attr.lottie_fileName, R.attr.lottie_ignoreDisabledSystemAnimations, R.attr.lottie_imageAssetsFolder, R.attr.lottie_loop, R.attr.lottie_progress, R.attr.lottie_rawRes, R.attr.lottie_renderMode, R.attr.lottie_repeatCount, R.attr.lottie_repeatMode, R.attr.lottie_scale, R.attr.lottie_speed, R.attr.lottie_url};
    public static final d M = new d(9, "RESUME_TOKEN");
    public static final d N = new d(9, "REMOVED_TASK");
    public static final d O = new d(9, "CLOSED_EMPTY");
    public static final d P = new d(9, "COMPLETING_ALREADY");
    public static final d Q = new d(9, "COMPLETING_WAITING_CHILDREN");
    public static final d R = new d(9, "COMPLETING_RETRY");
    public static final d S = new d(9, "TOO_LATE_TO_CANCEL");
    public static final d T = new d(9, "SEALED");
    public static final p0 U = new p0(false);
    public static final p0 V = new p0(true);

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5147a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f5148b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f5149c = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f5150d = new Object[0];
    public static final String[] e = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f5151f = {16842755, 16842960, 16842961};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f5152g = {16842755, 16842961};

    /* renamed from: h  reason: collision with root package name */
    public static final boolean[] f5153h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f5154i = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f5155j = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843840, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_optimizationLevel};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5156k = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843189, 16843190, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animate_relativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.deriveConstraintsFrom, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.transitionEasing, R.attr.transitionPathRotate};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f5157l = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customStringValue};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5158m = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5159n = {R.attr.animate_relativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.transitionEasing};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f5160o = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f5161p = {16842960, R.attr.constraints};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f5162q = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840};
    public static final int[] r = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};

    /* renamed from: s  reason: collision with root package name */
    public static final j f5163s = new j();

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f5164t = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f5165u = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f5166v = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};
    public static final int[] w = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f5167x = {16843247, 16843248, 16843249, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn};
    public static final int[] y = {16843250, 16843251, 16843252, 16843253, 16843254, 16843255, R.attr.dialogIcon, R.attr.dialogLayout, R.attr.dialogMessage, R.attr.dialogTitle, R.attr.negativeButtonText, R.attr.positiveButtonText};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f5168z = {R.attr.useSimpleSummaryProvider};

    public /* synthetic */ j() {
    }

    public static final r A(Object obj) {
        if (obj != a1.a.f26i) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final String B(Resources resources, XmlResourceParser xmlResourceParser, String str) {
        k.e(resources, "resources");
        k.e(xmlResourceParser, "parser");
        if (!F(xmlResourceParser, str)) {
            return null;
        }
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", str, 0);
        return attributeResourceValue == 0 ? xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str) : resources.getString(attributeResourceValue);
    }

    public static final Object C(f fVar, Object obj) {
        k.e(fVar, "<this>");
        if (!E(fVar)) {
            return obj;
        }
        Object value = fVar.getValue();
        k.b(value);
        return value;
    }

    public static final void D(j7.f fVar, Throwable th) {
        Throwable th2;
        for (x j8 : c8.d.f2837a) {
            try {
                j8.j(fVar, th);
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    a1.a.f(th2, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        try {
            a1.a.f(th, new c8.e(fVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean E(f fVar) {
        k.e(fVar, "<this>");
        return fVar.getValue() != null;
    }

    public static final boolean F(XmlResourceParser xmlResourceParser, String str) {
        k.e(xmlResourceParser, "<this>");
        return xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str) != null;
    }

    public static byte[] G(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e4) {
            if (!Log.isLoggable("Utils", 5)) {
                return null;
            }
            Log.w("Utils", "Error reading data from stream", e4);
            return null;
        }
    }

    public static boolean H(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean I(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static final void J(XmlResourceParser xmlResourceParser, p7.a aVar) {
        k.e(xmlResourceParser, "<this>");
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && xmlResourceParser.getDepth() > depth) {
                if (next == 2) {
                    aVar.invoke();
                }
            } else {
                return;
            }
        }
    }

    public static n1 K(z zVar, g1 g1Var, p pVar, int i8) {
        j7.f fVar = g1Var;
        if ((i8 & 1) != 0) {
            fVar = g.f5052f;
        }
        boolean z8 = false;
        int i9 = (i8 & 2) != 0 ? 1 : 0;
        j7.f a9 = u.a(zVar.f(), fVar, true);
        c cVar = l0.f8580a;
        if (a9 != cVar && a9.d(e.a.f5050f) == null) {
            a9 = a9.t(cVar);
        }
        if (i9 == 2) {
            z8 = true;
        }
        n1 f1Var = z8 ? new f1(a9, pVar) : new n1(a9, true);
        f1Var.k0(i9, f1Var, pVar);
        return f1Var;
    }

    public static int L(float f9, int i8, int i9) {
        return c0.a.a(c0.a.b(i9, Math.round(((float) Color.alpha(i9)) * f9)), i8);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final void M(android.content.res.XmlResourceParser r2, java.lang.String r3) {
        /*
        L_0x0000:
            int r0 = r2.next()
            r1 = 1
            if (r0 == r1) goto L_0x000a
            r1 = 2
            if (r0 != r1) goto L_0x0000
        L_0x000a:
            java.lang.String r0 = r2.getName()
            boolean r0 = q7.k.a(r0, r3)
            if (r0 == 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected a "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " node but is "
            r0.append(r3)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.M(android.content.res.XmlResourceParser, java.lang.String):void");
    }

    public static e2.a N(j2.c cVar, y1.f fVar) {
        return new e2.a(0, o.a(cVar, fVar, 1.0f, a1.a.f39o0, false));
    }

    public static b O(j2.b bVar, y1.f fVar, boolean z8) {
        return new b(o.a(bVar, fVar, z8 ? k2.g.c() : 1.0f, i2.g.f4806a, false));
    }

    public static e2.a P(j2.c cVar, y1.f fVar) {
        return new e2.a(2, o.a(cVar, fVar, 1.0f, i2.l.f4815a, false));
    }

    public static e2.a Q(j2.c cVar, y1.f fVar) {
        return new e2.a(3, o.a(cVar, fVar, k2.g.c(), t.f4831a, true));
    }

    public static void R(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Animator animator = (Animator) arrayList.get(i8);
            j8 = Math.max(j8, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j8);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static byte[] S(int i8, InputStream inputStream) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read >= 0) {
                i9 += read;
            } else {
                throw new IllegalStateException("Not enough bytes to read: " + i8);
            }
        }
        return bArr;
    }

    public static byte[] T(FileInputStream fileInputStream, int i8, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i8) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
            }
            if (i10 != i8) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i10);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e4) {
            throw new IllegalStateException(e4.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long U(int i8, InputStream inputStream) {
        byte[] S2 = S(i8, inputStream);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 += ((long) (S2[i9] & 255)) << (i9 * 8);
        }
        return j8;
    }

    public static int V(InputStream inputStream) {
        return (int) U(2, inputStream);
    }

    public static final Object W(Object obj) {
        return obj instanceof q ? a1.a.q(((q) obj).f8593a) : obj;
    }

    public static final float X(XmlResourceParser xmlResourceParser, String str, Resources resources, float f9) {
        k.e(xmlResourceParser, "<this>");
        k.e(resources, "resources");
        Float w8 = w(xmlResourceParser, str, resources, f9);
        if (w8 != null) {
            return w8.floatValue();
        }
        throw new IllegalArgumentException(("ComplicationSlotBounds must define '" + str + '\'').toString());
    }

    public static final void Y(k0 k0Var, j7.d dVar, boolean z8) {
        Object j8 = k0Var.j();
        Throwable f9 = k0Var.f(j8);
        Object q8 = f9 != null ? a1.a.q(f9) : k0Var.g(j8);
        if (z8) {
            k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            c8.f fVar = (c8.f) dVar;
            j7.d<T> dVar2 = fVar.f2841j;
            j7.f a9 = dVar2.a();
            Object b9 = c8.t.b(a9, fVar.f2843l);
            u1<?> b10 = b9 != c8.t.f2871a ? u.b(dVar2, a9, b9) : null;
            try {
                fVar.f2841j.i(q8);
                h hVar = h.f4787a;
            } finally {
                if (b10 == null || b10.l0()) {
                    c8.t.a(a9, b9);
                }
            }
        } else {
            dVar.i(q8);
        }
    }

    public static Object Z(p pVar) {
        g gVar = g.f5052f;
        Thread currentThread = Thread.currentThread();
        e.a aVar = e.a.f5050f;
        q0 a9 = q1.a();
        j7.f a10 = u.a(gVar, a9, true);
        c cVar = l0.f8580a;
        if (a10 != cVar && a10.d(aVar) == null) {
            a10 = a10.t(cVar);
        }
        y7.c cVar2 = new y7.c(a10, currentThread, a9);
        cVar2.k0(1, cVar2, pVar);
        q0 q0Var = cVar2.f8549j;
        if (q0Var != null) {
            int i8 = q0.f8594k;
            q0Var.Q(false);
        }
        while (!Thread.interrupted()) {
            try {
                long R2 = q0Var != null ? q0Var.R() : Long.MAX_VALUE;
                if (!cVar2.V()) {
                    LockSupport.parkNanos(cVar2, R2);
                } else {
                    Object h02 = h0(cVar2.R());
                    q qVar = h02 instanceof q ? (q) h02 : null;
                    if (qVar == null) {
                        return h02;
                    }
                    throw qVar.f8593a;
                }
            } finally {
                if (q0Var != null) {
                    int i9 = q0.f8594k;
                    q0Var.P(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar2.y(interruptedException);
        throw interruptedException;
    }

    public static void b0(View view, y4.f fVar) {
        r4.a aVar = fVar.f8412a.f8434b;
        if (aVar != null && aVar.f7060a) {
            float f9 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                int[] iArr = j0.x.f4957a;
                f9 += x.h.i((View) parent);
            }
            f.b bVar = fVar.f8412a;
            if (bVar.f8444m != f9) {
                bVar.f8444m = f9;
                fVar.m();
            }
        }
    }

    public static final Object c0(c8.q qVar, Object obj, p pVar) {
        Object obj2;
        Object Y;
        try {
            s.a(2, pVar);
            obj2 = pVar.g(obj, qVar);
        } catch (Throwable th) {
            obj2 = new q(th, false);
        }
        k7.a aVar = k7.a.f5217f;
        if (obj2 == aVar || (Y = qVar.Y(obj2)) == Q) {
            return aVar;
        }
        if (!(Y instanceof q)) {
            return h0(Y);
        }
        throw ((q) Y).f8593a;
    }

    public static y7.o d() {
        return new y7.o((z0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long d0(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            int r5 = c8.s.f2870a
            java.lang.String r6 = java.lang.System.getProperty(r23)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r8 = r24
            goto L_0x00c5
        L_0x0014:
            t7.c r7 = new t7.c
            r8 = 2
            r9 = 36
            r7.<init>(r8, r9)
            r10 = 0
            r11 = 1
            int r7 = r7.f7535g
            r12 = 10
            if (r12 > r7) goto L_0x0026
            r7 = r11
            goto L_0x0027
        L_0x0026:
            r7 = r10
        L_0x0027:
            if (r7 == 0) goto L_0x011a
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0033
        L_0x002f:
            r19 = r6
            goto L_0x0096
        L_0x0033:
            char r8 = r6.charAt(r10)
            r9 = 48
            if (r8 >= r9) goto L_0x003d
            r9 = -1
            goto L_0x0042
        L_0x003d:
            if (r8 != r9) goto L_0x0041
            r9 = r10
            goto L_0x0042
        L_0x0041:
            r9 = r11
        L_0x0042:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= 0) goto L_0x005b
            if (r7 != r11) goto L_0x004c
            goto L_0x002f
        L_0x004c:
            r9 = 45
            if (r8 != r9) goto L_0x0054
            r13 = -9223372036854775808
            r8 = r11
            goto L_0x005c
        L_0x0054:
            r9 = 43
            if (r8 != r9) goto L_0x002f
            r9 = r10
            r8 = r11
            goto L_0x005d
        L_0x005b:
            r8 = r10
        L_0x005c:
            r9 = r8
        L_0x005d:
            r15 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r17 = 0
            r10 = r17
            r17 = r15
        L_0x0068:
            if (r8 >= r7) goto L_0x00a0
            char r5 = r6.charAt(r8)
            int r5 = java.lang.Character.digit(r5, r12)
            if (r5 >= 0) goto L_0x0075
            goto L_0x002f
        L_0x0075:
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0089
            int r17 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x002f
            r19 = r6
            r20 = r7
            long r6 = (long) r12
            long r17 = r13 / r6
            int r6 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            goto L_0x0096
        L_0x0089:
            r19 = r6
            r20 = r7
        L_0x008d:
            long r6 = (long) r12
            long r10 = r10 * r6
            long r5 = (long) r5
            long r21 = r13 + r5
            int r7 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
        L_0x0096:
            r5 = 0
            goto L_0x00ae
        L_0x0098:
            long r10 = r10 - r5
            int r8 = r8 + 1
            r6 = r19
            r7 = r20
            goto L_0x0068
        L_0x00a0:
            r19 = r6
            if (r9 == 0) goto L_0x00a9
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            goto L_0x00ae
        L_0x00a9:
            long r5 = -r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
        L_0x00ae:
            r6 = 39
            java.lang.String r7 = "System property '"
            if (r5 == 0) goto L_0x00f7
            long r8 = r5.longValue()
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00c2
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x00c2
            r10 = 1
            goto L_0x00c3
        L_0x00c2:
            r10 = 0
        L_0x00c3:
            if (r10 == 0) goto L_0x00c6
        L_0x00c5:
            return r8
        L_0x00c6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r8)
            r10.append(r6)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00f7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r5 = r19
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x011a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "radix 10 was not in valid range "
            r1.<init>(r2)
            t7.c r2 = new t7.c
            r2.<init>(r8, r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.d0(java.lang.String, long, long, long):long");
    }

    public static float e(float f9) {
        return f9 <= 0.04045f ? f9 / 12.92f : (float) Math.pow((double) ((f9 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static int e0(String str, int i8, int i9, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return (int) d0(str, (long) i8, (long) i9, (long) i10);
    }

    public static float f(float f9) {
        return f9 <= 0.0031308f ? f9 * 12.92f : (float) ((Math.pow((double) f9, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final Object[] f0(Collection collection) {
        k.e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f5150d;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            objArr2[i8] = it.next();
            if (i9 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    i10 = 2147483645;
                    if (i9 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i10);
                k.d(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i9);
                k.d(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i8 = i9;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0260, code lost:
        if (r3.f7304d == r8) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        if (r4.f7304d == r13) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x048a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0279 A[EDGE_INSN: B:420:0x0279->B:169:0x0279 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x056a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(t.e r36, s.d r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.u0
            t.b[] r2 = r0.f7360x0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.f7358v0
            t.b[] r2 = r0.f7359w0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0704
            r1 = r15[r9]
            boolean r2 = r1.f7300q
            r3 = 3
            r8 = 8
            r5 = 1
            t.d r7 = r1.f7285a
            r17 = 0
            if (r2 != 0) goto L_0x013d
            int r2 = r1.f7295l
            int r6 = r2 * 2
            r13 = r7
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x0107
            int r4 = r1.f7292i
            int r4 = r4 + r5
            r1.f7292i = r4
            t.d[] r4 = r13.f7336j0
            r4[r2] = r17
            t.d[] r4 = r13.f7334i0
            r4[r2] = r17
            int r4 = r13.f7325d0
            t.c[] r5 = r13.M
            if (r4 == r8) goto L_0x00d3
            int r4 = r13.h(r2)
            r4 = r5[r6]
            r4.d()
            int r4 = r6 + 1
            r23 = r5[r4]
            r23.d()
            r23 = r5[r6]
            r23.d()
            r4 = r5[r4]
            r4.d()
            t.d r4 = r1.f7286b
            if (r4 != 0) goto L_0x0069
            r1.f7286b = r13
        L_0x0069:
            r1.f7288d = r13
            int[] r4 = r13.P
            r4 = r4[r2]
            if (r4 != r3) goto L_0x00d3
            int[] r8 = r13.f7343o
            r8 = r8[r2]
            if (r8 == 0) goto L_0x007b
            if (r8 == r3) goto L_0x007b
            if (r8 != r12) goto L_0x00d3
        L_0x007b:
            int r12 = r1.f7293j
            r22 = 1
            int r12 = r12 + 1
            r1.f7293j = r12
            float[] r12 = r13.f7332h0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0092
            float r3 = r1.f7294k
            float r3 = r3 + r12
            r1.f7294k = r3
        L_0x0092:
            int r3 = r13.f7325d0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00a3
            r3 = 3
            if (r4 != r3) goto L_0x00a3
            if (r8 == 0) goto L_0x00a1
            if (r8 != r3) goto L_0x00a3
        L_0x00a1:
            r3 = 1
            goto L_0x00a4
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            if (r3 == 0) goto L_0x00c2
            r3 = 0
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00af
            r3 = 1
            r1.f7297n = r3
            goto L_0x00b2
        L_0x00af:
            r3 = 1
            r1.f7298o = r3
        L_0x00b2:
            java.util.ArrayList<t.d> r3 = r1.f7291h
            if (r3 != 0) goto L_0x00bd
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f7291h = r3
        L_0x00bd:
            java.util.ArrayList<t.d> r3 = r1.f7291h
            r3.add(r13)
        L_0x00c2:
            t.d r3 = r1.f7289f
            if (r3 != 0) goto L_0x00c8
            r1.f7289f = r13
        L_0x00c8:
            t.d r3 = r1.f7290g
            if (r3 == 0) goto L_0x00d0
            t.d[] r3 = r3.f7334i0
            r3[r2] = r13
        L_0x00d0:
            r1.f7290g = r13
            goto L_0x00d5
        L_0x00d3:
            r25 = r9
        L_0x00d5:
            r3 = r20
            if (r3 == r13) goto L_0x00dd
            t.d[] r3 = r3.f7336j0
            r3[r2] = r13
        L_0x00dd:
            int r3 = r6 + 1
            r3 = r5[r3]
            t.c r3 = r3.f7305f
            if (r3 == 0) goto L_0x00f3
            t.d r3 = r3.f7304d
            t.c[] r4 = r3.M
            r4 = r4[r6]
            t.c r4 = r4.f7305f
            if (r4 == 0) goto L_0x00f3
            t.d r4 = r4.f7304d
            if (r4 == r13) goto L_0x00f5
        L_0x00f3:
            r3 = r17
        L_0x00f5:
            if (r3 == 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r3 = r13
            r18 = 1
        L_0x00fb:
            r20 = r13
            r9 = r25
            r5 = 1
            r8 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x0107:
            r25 = r9
            t.d r3 = r1.f7286b
            if (r3 == 0) goto L_0x0114
            t.c[] r3 = r3.M
            r3 = r3[r6]
            r3.d()
        L_0x0114:
            t.d r3 = r1.f7288d
            if (r3 == 0) goto L_0x0121
            int r6 = r6 + 1
            t.c[] r3 = r3.M
            r3 = r3[r6]
            r3.d()
        L_0x0121:
            r1.f7287c = r13
            if (r2 != 0) goto L_0x012c
            boolean r2 = r1.f7296m
            if (r2 == 0) goto L_0x012c
            r1.e = r13
            goto L_0x012e
        L_0x012c:
            r1.e = r7
        L_0x012e:
            boolean r2 = r1.f7298o
            if (r2 == 0) goto L_0x0138
            boolean r2 = r1.f7297n
            if (r2 == 0) goto L_0x0138
            r2 = 1
            goto L_0x0139
        L_0x0138:
            r2 = 0
        L_0x0139:
            r1.f7299p = r2
            r2 = 1
            goto L_0x0140
        L_0x013d:
            r25 = r9
            r2 = r5
        L_0x0140:
            r1.f7300q = r2
            if (r11 == 0) goto L_0x0155
            boolean r2 = r11.contains(r7)
            if (r2 == 0) goto L_0x014b
            goto L_0x0155
        L_0x014b:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x06f7
        L_0x0155:
            t.d r12 = r1.f7287c
            t.d r13 = r1.f7286b
            t.d r9 = r1.f7288d
            t.d r2 = r1.e
            float r3 = r1.f7294k
            int[] r4 = r0.P
            r4 = r4[r39]
            r8 = 2
            if (r4 != r8) goto L_0x0168
            r4 = 1
            goto L_0x0169
        L_0x0168:
            r4 = 0
        L_0x0169:
            if (r39 != 0) goto L_0x0184
            int r5 = r2.f7328f0
            r6 = 1
            if (r5 != 0) goto L_0x0173
            r22 = 1
            goto L_0x0175
        L_0x0173:
            r22 = 0
        L_0x0175:
            if (r5 != r6) goto L_0x017a
            r18 = r6
            goto L_0x017c
        L_0x017a:
            r18 = 0
        L_0x017c:
            if (r5 != r8) goto L_0x0181
            r5 = r22
            goto L_0x0199
        L_0x0181:
            r5 = r22
            goto L_0x01a3
        L_0x0184:
            r6 = 1
            int r5 = r2.f7330g0
            if (r5 != 0) goto L_0x018c
            r18 = r6
            goto L_0x018e
        L_0x018c:
            r18 = 0
        L_0x018e:
            if (r5 != r6) goto L_0x0192
            r6 = 1
            goto L_0x0193
        L_0x0192:
            r6 = 0
        L_0x0193:
            if (r5 != r8) goto L_0x019f
            r5 = r18
            r18 = r6
        L_0x0199:
            r20 = r18
            r18 = r5
            r5 = 1
            goto L_0x01a8
        L_0x019f:
            r5 = r18
            r18 = r6
        L_0x01a3:
            r20 = r18
            r18 = r5
            r5 = 0
        L_0x01a8:
            r26 = r3
            r8 = r7
            r6 = 0
        L_0x01ac:
            t.c[] r3 = r0.M
            if (r6 != 0) goto L_0x0279
            r28 = r6
            t.c[] r6 = r8.M
            r6 = r6[r16]
            if (r5 == 0) goto L_0x01bb
            r27 = 1
            goto L_0x01bd
        L_0x01bb:
            r27 = 4
        L_0x01bd:
            int r29 = r6.d()
            int[] r11 = r8.P
            r30 = r14
            r14 = r11[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01d4
            int[] r14 = r8.f7343o
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01d4
            r14 = 1
            goto L_0x01d5
        L_0x01d4:
            r14 = 0
        L_0x01d5:
            t.c r15 = r6.f7305f
            if (r15 == 0) goto L_0x01e1
            if (r8 == r7) goto L_0x01e1
            int r15 = r15.d()
            int r29 = r29 + r15
        L_0x01e1:
            r15 = r29
            if (r5 == 0) goto L_0x01ee
            if (r8 == r7) goto L_0x01ee
            if (r8 == r13) goto L_0x01ee
            r29 = r2
            r27 = 8
            goto L_0x01f0
        L_0x01ee:
            r29 = r2
        L_0x01f0:
            t.c r2 = r6.f7305f
            r32 = r7
            if (r2 == 0) goto L_0x021d
            if (r8 != r13) goto L_0x0200
            s.h r7 = r6.f7308i
            s.h r2 = r2.f7308i
            r33 = r13
            r13 = 6
            goto L_0x0208
        L_0x0200:
            r33 = r13
            s.h r7 = r6.f7308i
            s.h r2 = r2.f7308i
            r13 = 8
        L_0x0208:
            r10.f(r7, r2, r15, r13)
            if (r14 == 0) goto L_0x0211
            if (r5 != 0) goto L_0x0211
            r2 = 5
            goto L_0x0213
        L_0x0211:
            r2 = r27
        L_0x0213:
            s.h r7 = r6.f7308i
            t.c r6 = r6.f7305f
            s.h r6 = r6.f7308i
            r10.e(r7, r6, r15, r2)
            goto L_0x021f
        L_0x021d:
            r33 = r13
        L_0x021f:
            t.c[] r2 = r8.M
            if (r4 == 0) goto L_0x024c
            int r6 = r8.f7325d0
            r7 = 8
            if (r6 == r7) goto L_0x023e
            r6 = r11[r39]
            r7 = 3
            if (r6 != r7) goto L_0x023e
            int r6 = r16 + 1
            r6 = r2[r6]
            s.h r6 = r6.f7308i
            r7 = r2[r16]
            s.h r7 = r7.f7308i
            r11 = 5
            r13 = 0
            r10.f(r6, r7, r13, r11)
            goto L_0x023f
        L_0x023e:
            r13 = 0
        L_0x023f:
            r6 = r2[r16]
            s.h r6 = r6.f7308i
            r3 = r3[r16]
            s.h r3 = r3.f7308i
            r7 = 8
            r10.f(r6, r3, r13, r7)
        L_0x024c:
            int r3 = r16 + 1
            r2 = r2[r3]
            t.c r2 = r2.f7305f
            if (r2 == 0) goto L_0x0262
            t.d r2 = r2.f7304d
            t.c[] r3 = r2.M
            r3 = r3[r16]
            t.c r3 = r3.f7305f
            if (r3 == 0) goto L_0x0262
            t.d r3 = r3.f7304d
            if (r3 == r8) goto L_0x0264
        L_0x0262:
            r2 = r17
        L_0x0264:
            if (r2 == 0) goto L_0x026a
            r8 = r2
            r6 = r28
            goto L_0x026b
        L_0x026a:
            r6 = 1
        L_0x026b:
            r11 = r38
            r2 = r29
            r14 = r30
            r15 = r31
            r7 = r32
            r13 = r33
            goto L_0x01ac
        L_0x0279:
            r29 = r2
            r32 = r7
            r33 = r13
            r30 = r14
            r31 = r15
            r11 = 5
            if (r9 == 0) goto L_0x02e1
            t.c[] r2 = r12.M
            int r6 = r16 + 1
            r2 = r2[r6]
            t.c r2 = r2.f7305f
            if (r2 == 0) goto L_0x02e1
            t.c[] r2 = r9.M
            r2 = r2[r6]
            int[] r7 = r9.P
            r7 = r7[r39]
            r8 = 3
            if (r7 != r8) goto L_0x02a3
            int[] r7 = r9.f7343o
            r7 = r7[r39]
            if (r7 != 0) goto L_0x02a3
            r7 = 1
            goto L_0x02a4
        L_0x02a3:
            r7 = 0
        L_0x02a4:
            if (r7 == 0) goto L_0x02b9
            if (r5 != 0) goto L_0x02b9
            t.c r7 = r2.f7305f
            t.d r8 = r7.f7304d
            if (r8 != r0) goto L_0x02b9
            s.h r8 = r2.f7308i
            s.h r7 = r7.f7308i
            int r13 = r2.d()
            int r13 = -r13
            r14 = r11
            goto L_0x02cb
        L_0x02b9:
            if (r5 == 0) goto L_0x02ce
            t.c r7 = r2.f7305f
            t.d r8 = r7.f7304d
            if (r8 != r0) goto L_0x02ce
            s.h r8 = r2.f7308i
            s.h r7 = r7.f7308i
            int r13 = r2.d()
            int r13 = -r13
            r14 = 4
        L_0x02cb:
            r10.e(r8, r7, r13, r14)
        L_0x02ce:
            s.h r7 = r2.f7308i
            t.c[] r8 = r12.M
            r6 = r8[r6]
            t.c r6 = r6.f7305f
            s.h r6 = r6.f7308i
            int r2 = r2.d()
            int r2 = -r2
            r8 = 6
            r10.g(r7, r6, r2, r8)
        L_0x02e1:
            if (r4 == 0) goto L_0x02f8
            int r2 = r16 + 1
            r3 = r3[r2]
            s.h r3 = r3.f7308i
            t.c[] r4 = r12.M
            r2 = r4[r2]
            s.h r4 = r2.f7308i
            int r2 = r2.d()
            r6 = 8
            r10.f(r3, r4, r2, r6)
        L_0x02f8:
            java.util.ArrayList<t.d> r2 = r1.f7291h
            if (r2 == 0) goto L_0x0413
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0413
            boolean r6 = r1.f7297n
            if (r6 == 0) goto L_0x030f
            boolean r6 = r1.f7299p
            if (r6 != 0) goto L_0x030f
            int r6 = r1.f7293j
            float r6 = (float) r6
            goto L_0x0311
        L_0x030f:
            r6 = r26
        L_0x0311:
            r8 = r17
            r7 = 0
            r13 = 0
        L_0x0315:
            if (r13 >= r3) goto L_0x0413
            java.lang.Object r14 = r2.get(r13)
            t.d r14 = (t.d) r14
            float[] r15 = r14.f7332h0
            r15 = r15[r39]
            r21 = 0
            int r22 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            t.c[] r11 = r14.M
            if (r22 >= 0) goto L_0x0347
            boolean r15 = r1.f7299p
            if (r15 == 0) goto L_0x0340
            int r4 = r16 + 1
            r4 = r11[r4]
            s.h r4 = r4.f7308i
            r11 = r11[r16]
            s.h r11 = r11.f7308i
            r14 = 0
            r15 = 4
            r10.e(r4, r11, r14, r15)
            r22 = r15
            r15 = r14
            goto L_0x035f
        L_0x0340:
            r15 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r22 = 4
            goto L_0x034b
        L_0x0347:
            r22 = 4
            r21 = 0
        L_0x034b:
            int r26 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x036b
            int r4 = r16 + 1
            r4 = r11[r4]
            s.h r4 = r4.f7308i
            r11 = r11[r16]
            s.h r11 = r11.f7308i
            r14 = 8
            r15 = 0
            r10.e(r4, r11, r15, r14)
        L_0x035f:
            r27 = r2
            r28 = r3
            r26 = r6
            r19 = r15
            r21 = 0
            goto L_0x0405
        L_0x036b:
            r19 = 0
            if (r8 == 0) goto L_0x03fb
            t.c[] r8 = r8.M
            r4 = r8[r16]
            s.h r4 = r4.f7308i
            int r27 = r16 + 1
            r8 = r8[r27]
            s.h r8 = r8.f7308i
            r0 = r11[r16]
            s.h r0 = r0.f7308i
            r11 = r11[r27]
            s.h r11 = r11.f7308i
            r27 = r2
            s.b r2 = r37.m()
            r28 = r3
            r3 = 0
            r2.f7131b = r3
            int r21 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r21 == 0) goto L_0x03db
            int r21 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r21 != 0) goto L_0x0399
            goto L_0x03db
        L_0x0399:
            r21 = 0
            int r34 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r34 != 0) goto L_0x03ac
            s.b$a r0 = r2.f7133d
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.b(r4, r7)
            s.b$a r0 = r2.f7133d
            r0.b(r8, r3)
            goto L_0x03bc
        L_0x03ac:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03bf
            s.b$a r4 = r2.f7133d
            r4.b(r0, r3)
            s.b$a r0 = r2.f7133d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.b(r11, r3)
        L_0x03bc:
            r26 = r6
            goto L_0x03f7
        L_0x03bf:
            float r7 = r7 / r6
            float r26 = r15 / r6
            float r7 = r7 / r26
            r26 = r6
            s.b$a r6 = r2.f7133d
            r6.b(r4, r3)
            s.b$a r3 = r2.f7133d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.b(r8, r6)
            s.b$a r3 = r2.f7133d
            r3.b(r11, r7)
            s.b$a r3 = r2.f7133d
            float r4 = -r7
            goto L_0x03f4
        L_0x03db:
            r26 = r6
            r21 = 0
            r6 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            s.b$a r7 = r2.f7133d
            r7.b(r4, r3)
            s.b$a r4 = r2.f7133d
            r4.b(r8, r6)
            s.b$a r4 = r2.f7133d
            r4.b(r11, r3)
            s.b$a r3 = r2.f7133d
            r4 = r6
        L_0x03f4:
            r3.b(r0, r4)
        L_0x03f7:
            r10.c(r2)
            goto L_0x0403
        L_0x03fb:
            r27 = r2
            r28 = r3
            r26 = r6
            r21 = 0
        L_0x0403:
            r8 = r14
            r7 = r15
        L_0x0405:
            int r13 = r13 + 1
            r6 = r26
            r2 = r27
            r3 = r28
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x0315
        L_0x0413:
            r19 = 0
            r22 = 4
            if (r33 == 0) goto L_0x0480
            r0 = r33
            if (r0 == r9) goto L_0x0427
            if (r5 == 0) goto L_0x0420
            goto L_0x0427
        L_0x0420:
            r15 = r9
            r14 = r25
            r7 = r32
            goto L_0x0487
        L_0x0427:
            r7 = r32
            t.c[] r1 = r7.M
            r1 = r1[r16]
            t.c[] r2 = r12.M
            int r3 = r16 + 1
            r2 = r2[r3]
            t.c r1 = r1.f7305f
            if (r1 == 0) goto L_0x043b
            s.h r1 = r1.f7308i
            r4 = r1
            goto L_0x043d
        L_0x043b:
            r4 = r17
        L_0x043d:
            t.c r1 = r2.f7305f
            if (r1 == 0) goto L_0x0445
            s.h r1 = r1.f7308i
            r6 = r1
            goto L_0x0447
        L_0x0445:
            r6 = r17
        L_0x0447:
            t.c[] r1 = r0.M
            r1 = r1[r16]
            t.c[] r2 = r9.M
            r2 = r2[r3]
            if (r4 == 0) goto L_0x047a
            if (r6 == 0) goto L_0x047a
            r3 = r29
            if (r39 != 0) goto L_0x045a
            float r3 = r3.f7319a0
            goto L_0x045c
        L_0x045a:
            float r3 = r3.f7321b0
        L_0x045c:
            r5 = r3
            int r7 = r1.d()
            int r8 = r2.d()
            s.h r3 = r1.f7308i
            s.h r11 = r2.f7308i
            r13 = 7
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r11
            r11 = 2
            r15 = r9
            r14 = r25
            r9 = r13
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x069c
        L_0x047a:
            r15 = r9
            r14 = r25
            r11 = 2
            goto L_0x069c
        L_0x0480:
            r15 = r9
            r14 = r25
            r7 = r32
            r0 = r33
        L_0x0487:
            r11 = 2
            if (r18 == 0) goto L_0x0571
            if (r0 == 0) goto L_0x0571
            int r2 = r1.f7293j
            if (r2 <= 0) goto L_0x0497
            int r1 = r1.f7292i
            if (r1 != r2) goto L_0x0497
            r24 = 1
            goto L_0x0499
        L_0x0497:
            r24 = r19
        L_0x0499:
            r9 = r0
            r13 = r9
        L_0x049b:
            if (r13 == 0) goto L_0x069c
            t.d[] r1 = r13.f7336j0
            r1 = r1[r39]
            r8 = r1
        L_0x04a2:
            if (r8 == 0) goto L_0x04af
            int r1 = r8.f7325d0
            r6 = 8
            if (r1 != r6) goto L_0x04b1
            t.d[] r1 = r8.f7336j0
            r8 = r1[r39]
            goto L_0x04a2
        L_0x04af:
            r6 = 8
        L_0x04b1:
            if (r8 != 0) goto L_0x04bd
            if (r13 != r15) goto L_0x04b6
            goto L_0x04bd
        L_0x04b6:
            r11 = r7
            r23 = r8
            r21 = r9
            goto L_0x0561
        L_0x04bd:
            t.c[] r1 = r13.M
            r2 = r1[r16]
            s.h r3 = r2.f7308i
            t.c r4 = r2.f7305f
            if (r4 == 0) goto L_0x04ca
            s.h r4 = r4.f7308i
            goto L_0x04cc
        L_0x04ca:
            r4 = r17
        L_0x04cc:
            if (r9 == r13) goto L_0x04d5
            t.c[] r4 = r9.M
            int r5 = r16 + 1
            r4 = r4[r5]
            goto L_0x04e1
        L_0x04d5:
            if (r13 != r0) goto L_0x04e6
            if (r9 != r13) goto L_0x04e6
            t.c[] r4 = r7.M
            r4 = r4[r16]
            t.c r4 = r4.f7305f
            if (r4 == 0) goto L_0x04e4
        L_0x04e1:
            s.h r4 = r4.f7308i
            goto L_0x04e6
        L_0x04e4:
            r4 = r17
        L_0x04e6:
            int r2 = r2.d()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.d()
            if (r8 == 0) goto L_0x04fd
            t.c[] r6 = r8.M
            r6 = r6[r16]
            s.h r11 = r6.f7308i
            r1 = r1[r5]
            goto L_0x050c
        L_0x04fd:
            t.c[] r6 = r12.M
            r6 = r6[r5]
            t.c r6 = r6.f7305f
            if (r6 == 0) goto L_0x0508
            s.h r11 = r6.f7308i
            goto L_0x050a
        L_0x0508:
            r11 = r17
        L_0x050a:
            r1 = r1[r5]
        L_0x050c:
            s.h r1 = r1.f7308i
            if (r6 == 0) goto L_0x0516
            int r6 = r6.d()
            int r21 = r21 + r6
        L_0x0516:
            if (r9 == 0) goto L_0x0521
            t.c[] r6 = r9.M
            r6 = r6[r5]
            int r6 = r6.d()
            int r2 = r2 + r6
        L_0x0521:
            if (r3 == 0) goto L_0x04b6
            if (r4 == 0) goto L_0x04b6
            if (r11 == 0) goto L_0x04b6
            if (r1 == 0) goto L_0x04b6
            if (r13 != r0) goto L_0x0533
            t.c[] r2 = r0.M
            r2 = r2[r16]
            int r2 = r2.d()
        L_0x0533:
            r6 = r2
            if (r13 != r15) goto L_0x0540
            t.c[] r2 = r15.M
            r2 = r2[r5]
            int r2 = r2.d()
            r21 = r2
        L_0x0540:
            if (r24 == 0) goto L_0x0545
            r22 = 8
            goto L_0x0547
        L_0x0545:
            r22 = 5
        L_0x0547:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r9
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0561:
            int r1 = r13.f7325d0
            r9 = 8
            if (r1 == r9) goto L_0x0568
            goto L_0x056a
        L_0x0568:
            r13 = r21
        L_0x056a:
            r7 = r11
            r9 = r13
            r13 = r23
            r11 = 2
            goto L_0x049b
        L_0x0571:
            r11 = r7
            r9 = 8
            if (r20 == 0) goto L_0x069c
            if (r0 == 0) goto L_0x069c
            int r2 = r1.f7293j
            if (r2 <= 0) goto L_0x0583
            int r1 = r1.f7292i
            if (r1 != r2) goto L_0x0583
            r24 = 1
            goto L_0x0585
        L_0x0583:
            r24 = r19
        L_0x0585:
            r8 = r0
            r13 = r8
        L_0x0587:
            if (r13 == 0) goto L_0x063b
            t.d[] r1 = r13.f7336j0
            r1 = r1[r39]
        L_0x058d:
            if (r1 == 0) goto L_0x0598
            int r2 = r1.f7325d0
            if (r2 != r9) goto L_0x0598
            t.d[] r1 = r1.f7336j0
            r1 = r1[r39]
            goto L_0x058d
        L_0x0598:
            if (r13 == r0) goto L_0x0628
            if (r13 == r15) goto L_0x0628
            if (r1 == 0) goto L_0x0628
            if (r1 != r15) goto L_0x05a3
            r7 = r17
            goto L_0x05a4
        L_0x05a3:
            r7 = r1
        L_0x05a4:
            t.c[] r1 = r13.M
            r2 = r1[r16]
            s.h r3 = r2.f7308i
            t.c[] r4 = r8.M
            int r5 = r16 + 1
            r4 = r4[r5]
            s.h r4 = r4.f7308i
            int r2 = r2.d()
            r6 = r1[r5]
            int r6 = r6.d()
            if (r7 == 0) goto L_0x05d0
            t.c[] r1 = r7.M
            r1 = r1[r16]
            s.h r9 = r1.f7308i
            r21 = r7
            t.c r7 = r1.f7305f
            if (r7 == 0) goto L_0x05cd
            s.h r7 = r7.f7308i
            goto L_0x05e6
        L_0x05cd:
            r7 = r17
            goto L_0x05e6
        L_0x05d0:
            r21 = r7
            t.c[] r7 = r15.M
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05db
            s.h r9 = r7.f7308i
            goto L_0x05dd
        L_0x05db:
            r9 = r17
        L_0x05dd:
            r1 = r1[r5]
            s.h r1 = r1.f7308i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x05e6:
            if (r1 == 0) goto L_0x05ed
            int r1 = r1.d()
            int r6 = r6 + r1
        L_0x05ed:
            r23 = r6
            t.c[] r1 = r8.M
            r1 = r1[r5]
            int r1 = r1.d()
            int r5 = r2 + r1
            if (r24 == 0) goto L_0x05fe
            r25 = 8
            goto L_0x0600
        L_0x05fe:
            r25 = r22
        L_0x0600:
            if (r3 == 0) goto L_0x061f
            if (r4 == 0) goto L_0x061f
            if (r9 == 0) goto L_0x061f
            if (r7 == 0) goto L_0x061f
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r14
            r14 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0625
        L_0x061f:
            r26 = r8
            r23 = r14
            r14 = 8
        L_0x0625:
            r1 = r21
            goto L_0x062d
        L_0x0628:
            r26 = r8
            r23 = r14
            r14 = r9
        L_0x062d:
            int r2 = r13.f7325d0
            if (r2 == r14) goto L_0x0633
            r8 = r13
            goto L_0x0635
        L_0x0633:
            r8 = r26
        L_0x0635:
            r13 = r1
            r9 = r14
            r14 = r23
            goto L_0x0587
        L_0x063b:
            r23 = r14
            t.c[] r1 = r0.M
            r1 = r1[r16]
            t.c[] r2 = r11.M
            r2 = r2[r16]
            t.c r2 = r2.f7305f
            t.c[] r3 = r15.M
            int r4 = r16 + 1
            r11 = r3[r4]
            t.c[] r3 = r12.M
            r3 = r3[r4]
            t.c r13 = r3.f7305f
            if (r2 == 0) goto L_0x068a
            if (r0 == r15) goto L_0x0664
            s.h r3 = r1.f7308i
            s.h r2 = r2.f7308i
            int r1 = r1.d()
            r14 = 5
            r10.e(r3, r2, r1, r14)
            goto L_0x068b
        L_0x0664:
            r14 = 5
            if (r13 == 0) goto L_0x068b
            s.h r3 = r1.f7308i
            s.h r4 = r2.f7308i
            int r5 = r1.d()
            r6 = 1056964608(0x3f000000, float:0.5)
            s.h r7 = r11.f7308i
            s.h r8 = r13.f7308i
            int r9 = r11.d()
            r21 = 5
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r21
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x068b
        L_0x068a:
            r14 = 5
        L_0x068b:
            if (r13 == 0) goto L_0x069e
            if (r0 == r15) goto L_0x069e
            s.h r1 = r11.f7308i
            s.h r2 = r13.f7308i
            int r3 = r11.d()
            int r3 = -r3
            r10.e(r1, r2, r3, r14)
            goto L_0x069e
        L_0x069c:
            r23 = r14
        L_0x069e:
            if (r18 != 0) goto L_0x06a2
            if (r20 == 0) goto L_0x06f7
        L_0x06a2:
            if (r0 == 0) goto L_0x06f7
            if (r0 == r15) goto L_0x06f7
            t.c[] r1 = r0.M
            r2 = r1[r16]
            t.c[] r3 = r15.M
            int r4 = r16 + 1
            r3 = r3[r4]
            t.c r5 = r2.f7305f
            if (r5 == 0) goto L_0x06b7
            s.h r5 = r5.f7308i
            goto L_0x06b9
        L_0x06b7:
            r5 = r17
        L_0x06b9:
            t.c r6 = r3.f7305f
            if (r6 == 0) goto L_0x06c0
            s.h r6 = r6.f7308i
            goto L_0x06c2
        L_0x06c0:
            r6 = r17
        L_0x06c2:
            if (r12 == r15) goto L_0x06d2
            t.c[] r6 = r12.M
            r6 = r6[r4]
            t.c r6 = r6.f7305f
            if (r6 == 0) goto L_0x06d0
            s.h r6 = r6.f7308i
            r17 = r6
        L_0x06d0:
            r6 = r17
        L_0x06d2:
            if (r0 != r15) goto L_0x06d6
            r3 = r1[r4]
        L_0x06d6:
            if (r5 == 0) goto L_0x06f7
            if (r6 == 0) goto L_0x06f7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r7 = r2.d()
            t.c[] r1 = r15.M
            r1 = r1[r4]
            int r8 = r1.d()
            s.h r2 = r2.f7308i
            s.h r9 = r3.f7308i
            r11 = 5
            r1 = r37
            r3 = r5
            r4 = r7
            r5 = r0
            r7 = r9
            r9 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x06f7:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0704:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.j.g(t.e, s.d, java.util.ArrayList, int):void");
    }

    public static final Object[] g0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        k.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i8 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    k.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i9 = i8 + 1;
                    objArr2[i8] = it.next();
                    if (i9 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i10 = ((i9 * 3) + 1) >>> 1;
                        if (i10 <= i9) {
                            i10 = 2147483645;
                            if (i9 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i10);
                        k.d(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i9] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i9);
                        k.d(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i8 = i9;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static int h(int i8, int i9, int[] iArr) {
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else if (i13 <= i9) {
                return i12;
            } else {
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final Object h0(Object obj) {
        w0 w0Var;
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        return (x0Var == null || (w0Var = x0Var.f8625a) == null) ? obj : w0Var;
    }

    public static int i(long[] jArr, int i8, long j8) {
        int i9 = i8 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = (jArr[i11] > j8 ? 1 : (jArr[i11] == j8 ? 0 : -1));
            if (i12 < 0) {
                i10 = i11 + 1;
            } else if (i12 <= 0) {
                return i11;
            } else {
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    /* JADX INFO: finally extract failed */
    public static final Object i0(j7.f fVar, p pVar, j7.d dVar) {
        j7.f a9 = dVar.a();
        boolean z8 = false;
        j7.f t8 = !((Boolean) fVar.q(Boolean.FALSE, v.f8618f)).booleanValue() ? a9.t(fVar) : u.a(a9, fVar, false);
        z0 z0Var = (z0) t8.d(z0.b.f8628f);
        if (z0Var != null && !z0Var.c()) {
            throw z0Var.D();
        } else if (t8 == a9) {
            c8.q qVar = new c8.q(dVar, t8);
            return c0(qVar, qVar, pVar);
        } else {
            e.a aVar = e.a.f5050f;
            if (k.a(t8.d(aVar), a9.d(aVar))) {
                u1 u1Var = new u1(dVar, t8);
                j7.f fVar2 = u1Var.f8544h;
                Object b9 = c8.t.b(fVar2, (Object) null);
                try {
                    Object c02 = c0(u1Var, u1Var, pVar);
                    c8.t.a(fVar2, b9);
                    return c02;
                } catch (Throwable th) {
                    c8.t.a(fVar2, b9);
                    throw th;
                }
            } else {
                j0 j0Var = new j0(dVar, t8);
                try {
                    a1.a.E(h.f4787a, a1.a.x(a1.a.p(j0Var, j0Var, pVar)), (p7.l) null);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.f8577j;
                        int i8 = atomicIntegerFieldUpdater.get(j0Var);
                        if (i8 == 0) {
                            if (atomicIntegerFieldUpdater.compareAndSet(j0Var, 0, 1)) {
                                z8 = true;
                                break;
                            }
                        } else if (i8 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                    }
                    if (z8) {
                        return k7.a.f5217f;
                    }
                    Object h02 = h0(j0Var.R());
                    if (!(h02 instanceof q)) {
                        return h02;
                    }
                    throw ((q) h02).f8593a;
                } catch (Throwable th2) {
                    j0Var.i(a1.a.q(th2));
                    throw th2;
                }
            }
        }
    }

    public static void j(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final Object j0(long j8, p pVar, j7.d dVar) {
        Object obj;
        Object Y;
        if (j8 > 0) {
            s1 s1Var = new s1(j8, dVar);
            boolean z8 = false;
            s1Var.A(false, true, new o0(h0.b(s1Var.f2867i.a()).s(s1Var.f8611j, s1Var, s1Var.f8544h)));
            try {
                s.a(2, pVar);
                obj = pVar.g(s1Var, s1Var);
            } catch (Throwable th) {
                obj = new q(th, false);
            }
            k7.a aVar = k7.a.f5217f;
            if (obj == aVar || (Y = s1Var.Y(obj)) == Q) {
                return aVar;
            }
            if (Y instanceof q) {
                Throwable th2 = ((q) Y).f8593a;
                if (!(th2 instanceof r1) || ((r1) th2).f8610f != s1Var) {
                    z8 = true;
                }
                if (z8) {
                    throw th2;
                } else if (obj instanceof q) {
                    throw ((q) obj).f8593a;
                }
            } else {
                obj = h0(Y);
            }
            return obj;
        }
        throw new r1("Timed out immediately", (z0) null);
    }

    public static void k(t.e eVar, s.d dVar, t.d dVar2) {
        dVar2.f7337k = -1;
        dVar2.f7339l = -1;
        int i8 = eVar.P[0];
        int[] iArr = dVar2.P;
        if (i8 != 2 && iArr[0] == 4) {
            t.c cVar = dVar2.E;
            int i9 = cVar.f7306g;
            int k8 = eVar.k();
            t.c cVar2 = dVar2.G;
            int i10 = k8 - cVar2.f7306g;
            cVar.f7308i = dVar.l(cVar);
            cVar2.f7308i = dVar.l(cVar2);
            dVar.d(cVar.f7308i, i9);
            dVar.d(cVar2.f7308i, i10);
            dVar2.f7337k = 2;
            dVar2.V = i9;
            int i11 = i10 - i9;
            dVar2.R = i11;
            int i12 = dVar2.Y;
            if (i11 < i12) {
                dVar2.R = i12;
            }
        }
        if (eVar.P[1] != 2 && iArr[1] == 4) {
            t.c cVar3 = dVar2.F;
            int i13 = cVar3.f7306g;
            int i14 = eVar.i();
            t.c cVar4 = dVar2.H;
            int i15 = i14 - cVar4.f7306g;
            cVar3.f7308i = dVar.l(cVar3);
            cVar4.f7308i = dVar.l(cVar4);
            dVar.d(cVar3.f7308i, i13);
            dVar.d(cVar4.f7308i, i15);
            if (dVar2.X > 0 || dVar2.f7325d0 == 8) {
                t.c cVar5 = dVar2.I;
                s.h l8 = dVar.l(cVar5);
                cVar5.f7308i = l8;
                dVar.d(l8, dVar2.X + i13);
            }
            dVar2.f7339l = 2;
            dVar2.W = i13;
            int i16 = i15 - i13;
            dVar2.S = i16;
            int i17 = dVar2.Z;
            if (i16 < i17) {
                dVar2.S = i17;
            }
        }
    }

    public static final void k0(RectF rectF, DataOutputStream dataOutputStream) {
        dataOutputStream.writeFloat(rectF.left);
        dataOutputStream.writeFloat(rectF.right);
        dataOutputStream.writeFloat(rectF.top);
        dataOutputStream.writeFloat(rectF.bottom);
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, long j8, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) ((int) ((j8 >> (i9 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void m(int i8) {
        boolean z8 = true;
        if (i8 < 1) {
            z8 = false;
        }
        if (!z8) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i8).toString());
        }
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        l0(byteArrayOutputStream, (long) i8, 2);
    }

    public static final void n(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            a1.a.f(th, th2);
        }
    }

    public static final void o(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            a1.a.f(th, th2);
        }
    }

    public static byte[] p(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static b0 q(int i8) {
        return i8 != 0 ? i8 != 1 ? new y4.h() : new y4.d() : new y4.h();
    }

    public static final boolean r(int i8, int i9) {
        return (i8 & i9) == i9;
    }

    public static void s() {
        int i8 = I;
        if (i8 > 0) {
            I = i8 - 1;
        }
    }

    public static final boolean t(char c9, char c10, boolean z8) {
        if (c9 == c10) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int u(float f9, int i8, int i9) {
        if (i8 == i9) {
            return i8;
        }
        float f10 = ((float) ((i8 >> 24) & 255)) / 255.0f;
        float e4 = e(((float) ((i8 >> 16) & 255)) / 255.0f);
        float e9 = e(((float) ((i8 >> 8) & 255)) / 255.0f);
        float e10 = e(((float) (i8 & 255)) / 255.0f);
        float e11 = e(((float) ((i9 >> 16) & 255)) / 255.0f);
        float e12 = e(((float) ((i9 >> 8) & 255)) / 255.0f);
        float e13 = e10 + (f9 * (e(((float) (i9 & 255)) / 255.0f) - e10));
        return (Math.round(f(e4 + ((e11 - e4) * f9)) * 255.0f) << 16) | (Math.round((f10 + (((((float) ((i9 >> 24) & 255)) / 255.0f) - f10) * f9)) * 255.0f) << 24) | (Math.round(f(e9 + ((e12 - e9) * f9)) * 255.0f) << 8) | Math.round(f(e13) * 255.0f);
    }

    public static g1.d v(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).f1930f;
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static final Float w(XmlResourceParser xmlResourceParser, String str, Resources resources, float f9) {
        float f10;
        float f11;
        k.e(xmlResourceParser, "<this>");
        k.e(resources, "resources");
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        if (attributeValue == null) {
            return null;
        }
        boolean z8 = false;
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", str, 0);
        if (attributeResourceValue != 0) {
            f11 = resources.getDimension(attributeResourceValue);
        } else if (attributeValue.endsWith("dip")) {
            String substring = attributeValue.substring(0, attributeValue.length() - 3);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            f11 = TypedValue.applyDimension(1, Float.parseFloat(substring), resources.getDisplayMetrics());
        } else {
            if (f9 > 0.0f) {
                z8 = true;
            }
            if (z8) {
                f10 = Float.parseFloat(attributeValue) / f9;
                return Float.valueOf(f10);
            }
            throw new IllegalArgumentException("scale should be positive".toString());
        }
        f10 = f11 / ((float) resources.getDisplayMetrics().widthPixels);
        return Float.valueOf(f10);
    }

    public static int x(View view, int i8) {
        return v4.b.b(view.getContext(), i8, view.getClass().getCanonicalName());
    }

    public static final Integer y(Resources resources, XmlResourceParser xmlResourceParser, String str) {
        int i8;
        k.e(resources, "resources");
        k.e(xmlResourceParser, "parser");
        if (!F(xmlResourceParser, str)) {
            return null;
        }
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", str, 0);
        if (attributeResourceValue == 0) {
            String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
            k.d(attributeValue, "parser.getAttributeValue(NAMESPACE_APP, name)");
            i8 = Integer.parseInt(attributeValue);
        } else {
            i8 = resources.getInteger(attributeResourceValue);
        }
        return Integer.valueOf(i8);
    }

    public static final Class z(u7.b bVar) {
        k.e(bVar, "<this>");
        Class<?> a9 = ((q7.e) bVar).a();
        if (!a9.isPrimitive()) {
            return a9;
        }
        String name = a9.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a9 : Double.class;
            case 104431:
                return !name.equals("int") ? a9 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a9 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a9 : Character.class;
            case 3327612:
                return !name.equals("long") ? a9 : Long.class;
            case 3625364:
                return !name.equals("void") ? a9 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a9 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a9 : Float.class;
            case 109413500:
                return !name.equals("short") ? a9 : Short.class;
            default:
                return a9;
        }
    }

    public File a(p2.e eVar) {
        return null;
    }

    public void a0() {
        Process.setThreadPriority(Process.myPid(), -4);
    }

    public boolean b(o6.q qVar) {
        String str;
        boolean isEnabled = qVar.isEnabled();
        String str2 = qVar.f6174b;
        Object[] objArr = new Object[6];
        StringBuilder sb = new StringBuilder();
        o6.q qVar2 = qVar.f6175c;
        while (qVar2 != null) {
            qVar2 = qVar2.f6175c;
            sb.append("|    ");
        }
        objArr[0] = sb.toString();
        objArr[1] = qVar.getClass().getSimpleName();
        objArr[2] = Integer.toHexString(System.identityHashCode(qVar));
        objArr[3] = isEnabled ? "E" : "D";
        if (n6.g.e(str2)) {
            str = "";
        } else {
            str = "<" + qVar.f6174b + ">";
        }
        objArr[4] = str;
        objArr[5] = qVar.q();
        String format = String.format("%s[%s@%s][%s]%s %s", objArr);
        if (isEnabled) {
            Log.i("DWF:RootNode", format);
        }
        return true;
    }

    public void c(p2.e eVar, r2.g gVar) {
    }

    public /* synthetic */ j(int i8) {
    }

    public /* synthetic */ j(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f3073f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f3071c = 0;
    }
}
