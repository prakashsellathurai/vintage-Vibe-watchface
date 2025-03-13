package android.support.wearable.complications;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.wear.protolayout.protobuf.h;
import androidx.wear.protolayout.protobuf.n;
import i7.f;
import i7.m;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l1.e;
import m1.a0;
import q7.k;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationData implements Parcelable, Serializable {
    private static final String[] COMMON_OPTIONAL_FIELDS;
    public static final Parcelable.Creator<ComplicationData> CREATOR = new b();
    public static final c Companion = new c();
    private static final String EXP_FIELD_LIST_ENTRIES = "EXP_LIST_ENTRIES";
    private static final String EXP_FIELD_LIST_ENTRY_TYPE = "EXP_LIST_ENTRY_TYPE";
    private static final String EXP_FIELD_LIST_STYLE_HINT = "EXP_LIST_STYLE_HINT";
    private static final String EXP_FIELD_PROTO_LAYOUT_AMBIENT = "EXP_FIELD_PROTO_LAYOUT_AMBIENT";
    private static final String EXP_FIELD_PROTO_LAYOUT_INTERACTIVE = "EXP_FIELD_PROTO_LAYOUT_INTERACTIVE";
    private static final String EXP_FIELD_PROTO_LAYOUT_RESOURCES = "EXP_FIELD_PROTO_LAYOUT_RESOURCES";
    public static final int EXP_TYPE_LIST = -12;
    public static final int EXP_TYPE_PROTO_LAYOUT = -11;
    private static final String FIELD_COLOR_RAMP = "COLOR_RAMP";
    private static final String FIELD_COLOR_RAMP_INTERPOLATED = "COLOR_RAMP_INTERPOLATED";
    private static final String FIELD_CONTENT_DESCRIPTION = "IMAGE_CONTENT_DESCRIPTION";
    private static final String FIELD_DATA_SOURCE = "FIELD_DATA_SOURCE";
    private static final String FIELD_DISPLAY_POLICY = "DISPLAY_POLICY";
    private static final String FIELD_DYNAMIC_VALUE = "DYNAMIC_VALUE";
    private static final String FIELD_ELEMENT_BACKGROUND_COLOR = "ELEMENT_BACKGROUND_COLOR";
    private static final String FIELD_ELEMENT_COLORS = "ELEMENT_COLORS";
    private static final String FIELD_ELEMENT_WEIGHTS = "ELEMENT_WEIGHTS";
    private static final String FIELD_END_TIME = "END_TIME";
    private static final String FIELD_ICON = "ICON";
    private static final String FIELD_ICON_BURN_IN_PROTECTION = "ICON_BURN_IN_PROTECTION";
    private static final String FIELD_IMAGE_STYLE = "IMAGE_STYLE";
    private static final String FIELD_LARGE_IMAGE = "LARGE_IMAGE";
    private static final String FIELD_LONG_TEXT = "LONG_TEXT";
    private static final String FIELD_LONG_TITLE = "LONG_TITLE";
    private static final String FIELD_MAX_VALUE = "MAX_VALUE";
    private static final String FIELD_MIN_VALUE = "MIN_VALUE";
    private static final String FIELD_PERSISTENCE_POLICY = "PERSISTENCE_POLICY";
    private static final String FIELD_PLACEHOLDER_FIELDS = "PLACEHOLDER_FIELDS";
    private static final String FIELD_PLACEHOLDER_TYPE = "PLACEHOLDER_TYPE";
    private static final String FIELD_SHORT_TEXT = "SHORT_TEXT";
    private static final String FIELD_SHORT_TITLE = "SHORT_TITLE";
    private static final String FIELD_SMALL_IMAGE = "SMALL_IMAGE";
    private static final String FIELD_SMALL_IMAGE_BURN_IN_PROTECTION = "SMALL_IMAGE_BURN_IN_PROTECTION";
    private static final String FIELD_START_TIME = "START_TIME";
    private static final String FIELD_TAP_ACTION = "TAP_ACTION";
    private static final String FIELD_TAP_ACTION_LOST = "FIELD_TAP_ACTION_LOST";
    private static final String FIELD_TARGET_VALUE = "TARGET_VALUE";
    private static final String FIELD_TIMELINE_END_TIME = "TIMELINE_END_TIME";
    private static final String FIELD_TIMELINE_ENTRIES = "TIMELINE";
    private static final String FIELD_TIMELINE_ENTRY_TYPE = "TIMELINE_ENTRY_TYPE";
    private static final String FIELD_TIMELINE_START_TIME = "TIMELINE_START_TIME";
    private static final String FIELD_VALUE = "VALUE";
    private static final String FIELD_VALUE_TYPE = "VALUE_TYPE";
    public static final int IMAGE_STYLE_ICON = 2;
    public static final int IMAGE_STYLE_PHOTO = 1;
    /* access modifiers changed from: private */
    public static final Map<Integer, Set<String>> OPTIONAL_FIELDS;
    public static final String PLACEHOLDER_STRING = "__placeholder__";
    /* access modifiers changed from: private */
    public static final Map<Integer, Set<String>> REQUIRED_FIELDS;
    /* access modifiers changed from: private */
    public static final Map<Integer, Set<Set<String>>> REQUIRED_ONE_OF_FIELDS;
    private static final String TAG = "ComplicationData";
    public static final int TYPE_EMPTY = 2;
    public static final int TYPE_GOAL_PROGRESS = 13;
    public static final int TYPE_ICON = 6;
    public static final int TYPE_LARGE_IMAGE = 8;
    public static final int TYPE_LONG_TEXT = 4;
    public static final int TYPE_NOT_CONFIGURED = 1;
    public static final int TYPE_NO_DATA = 10;
    public static final int TYPE_NO_PERMISSION = 9;
    public static final int TYPE_RANGED_VALUE = 5;
    public static final int TYPE_SHORT_TEXT = 3;
    public static final int TYPE_SMALL_IMAGE = 7;
    public static final int TYPE_WEIGHTED_ELEMENTS = 14;
    /* access modifiers changed from: private */
    public static final Set<Integer> VALID_TYPES = a1.a.G(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, 13, 14);
    /* access modifiers changed from: private */
    public final Bundle fields;
    private final int type;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f232a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f233b;

        public a(int i8) {
            this.f232a = i8;
            Bundle bundle = new Bundle();
            this.f233b = bundle;
            if (i8 == 4 || i8 == 7) {
                ComplicationData.Companion.getClass();
                c.a(i8, ComplicationData.FIELD_IMAGE_STYLE);
                bundle.putInt(ComplicationData.FIELD_IMAGE_STYLE, 1);
            }
        }

        public a(ComplicationData complicationData) {
            this.f232a = complicationData.getType();
            Object clone = complicationData.fields.clone();
            k.c(clone, "null cannot be cast to non-null type android.os.Bundle");
            this.f233b = (Bundle) clone;
        }

        public final ComplicationData a() {
            boolean z8;
            int i8;
            boolean z9;
            Map access$getREQUIRED_FIELDS$cp = ComplicationData.REQUIRED_FIELDS;
            int i9 = this.f232a;
            Object obj = access$getREQUIRED_FIELDS$cp.get(Integer.valueOf(i9));
            k.b(obj);
            Iterator it = ((Set) obj).iterator();
            do {
                boolean hasNext = it.hasNext();
                z8 = false;
                Bundle bundle = this.f233b;
                if (hasNext) {
                    String str = (String) it.next();
                    if (bundle.containsKey(str)) {
                        if (!(!bundle.containsKey(ComplicationData.FIELD_ICON_BURN_IN_PROTECTION) || bundle.containsKey(ComplicationData.FIELD_ICON))) {
                            throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.".toString());
                        } else if (!bundle.containsKey(ComplicationData.FIELD_SMALL_IMAGE_BURN_IN_PROTECTION) || bundle.containsKey(ComplicationData.FIELD_SMALL_IMAGE)) {
                            z8 = true;
                            continue;
                        }
                    } else {
                        throw new IllegalStateException(("Field " + str + " is required for type " + i9).toString());
                    }
                } else {
                    Object obj2 = ComplicationData.REQUIRED_ONE_OF_FIELDS.get(Integer.valueOf(i9));
                    k.b(obj2);
                    for (Set<String> set : (Set) obj2) {
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            i8 = 0;
                            for (String containsKey : set) {
                                if (bundle.containsKey(containsKey) && (i8 = i8 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        } else {
                            i8 = 0;
                        }
                        if (i8 >= 1) {
                            z9 = true;
                            continue;
                        } else {
                            z9 = false;
                            continue;
                        }
                        if (!z9) {
                            throw new IllegalStateException(("One of " + set + " must be provided.").toString());
                        }
                    }
                    return new ComplicationData(this);
                }
            } while (z8);
            throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.".toString());
        }

        public final void b(Object obj, String str) {
            ComplicationData.Companion.getClass();
            c.a(this.f232a, str);
            Bundle bundle = this.f233b;
            if (obj == null) {
                bundle.remove(str);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else {
                throw new IllegalArgumentException("Unexpected object type: " + obj.getClass());
            }
        }

        public final void c(ComplicationText complicationText) {
            b(complicationText, ComplicationData.FIELD_CONTENT_DESCRIPTION);
        }

        public final void d(ComplicationData complicationData) {
            Bundle bundle = this.f233b;
            if (complicationData == null) {
                bundle.remove(ComplicationData.FIELD_PLACEHOLDER_FIELDS);
                bundle.remove(ComplicationData.FIELD_PLACEHOLDER_TYPE);
                return;
            }
            c cVar = ComplicationData.Companion;
            cVar.getClass();
            int i8 = this.f232a;
            c.a(i8, ComplicationData.FIELD_PLACEHOLDER_FIELDS);
            bundle.putBundle(ComplicationData.FIELD_PLACEHOLDER_FIELDS, complicationData.fields);
            int type = complicationData.getType();
            cVar.getClass();
            c.a(i8, ComplicationData.FIELD_PLACEHOLDER_TYPE);
            bundle.putInt(ComplicationData.FIELD_PLACEHOLDER_TYPE, type);
        }

        public final void e(PendingIntent pendingIntent) {
            b(pendingIntent, ComplicationData.FIELD_TAP_ACTION);
        }

        public final void f(boolean z8) {
            if (z8) {
                this.f233b.putBoolean(ComplicationData.FIELD_TAP_ACTION_LOST, z8);
            }
        }
    }

    public static final class b implements Parcelable.Creator<ComplicationData> {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "source");
            return new ComplicationData(parcel);
        }

        public final Object[] newArray(int i8) {
            ComplicationData[] complicationDataArr = new ComplicationData[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                complicationDataArr[i9] = null;
            }
            return complicationDataArr;
        }
    }

    public static final class c {
        public static void a(int i8, String str) {
            if (!ComplicationData.VALID_TYPES.contains(Integer.valueOf(i8))) {
                throw new IllegalStateException(("Type " + i8 + " can not be recognized").toString());
            } else if (!c(i8, str)) {
                throw new IllegalStateException(("Field " + str + " is not supported for type " + i8).toString());
            }
        }

        public static void b(int i8, String str) {
            if (!ComplicationData.VALID_TYPES.contains(Integer.valueOf(i8))) {
                Log.w(ComplicationData.TAG, "Type " + i8 + " can not be recognized");
                return;
            }
            c(i8, str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean c(int r4, java.lang.String r5) {
            /*
                java.util.Map r0 = android.support.wearable.complications.ComplicationData.REQUIRED_FIELDS
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r1)
                q7.k.b(r0)
                java.util.Set r0 = (java.util.Set) r0
                boolean r0 = r0.contains(r5)
                r1 = 1
                if (r0 != 0) goto L_0x006c
                java.util.Map r0 = android.support.wearable.complications.ComplicationData.REQUIRED_ONE_OF_FIELDS
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.get(r2)
                q7.k.b(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r2 = r0 instanceof java.util.Collection
                r3 = 0
                if (r2 == 0) goto L_0x0038
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0038
                goto L_0x0050
            L_0x0038:
                java.util.Iterator r0 = r0.iterator()
            L_0x003c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0050
                java.lang.Object r2 = r0.next()
                java.util.Set r2 = (java.util.Set) r2
                boolean r2 = r2.contains(r5)
                if (r2 == 0) goto L_0x003c
                r0 = r1
                goto L_0x0051
            L_0x0050:
                r0 = r3
            L_0x0051:
                if (r0 != 0) goto L_0x006c
                java.util.Map r0 = android.support.wearable.complications.ComplicationData.OPTIONAL_FIELDS
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r4 = r0.get(r4)
                q7.k.b(r4)
                java.util.Set r4 = (java.util.Set) r4
                boolean r4 = r4.contains(r5)
                if (r4 == 0) goto L_0x006b
                goto L_0x006c
            L_0x006b:
                r1 = r3
            L_0x006c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.ComplicationData.c.c(int, java.lang.String):boolean");
        }

        public static boolean d() {
            return !Log.isLoggable(ComplicationData.TAG, 3);
        }
    }

    public static final class d implements Serializable {
    }

    static {
        m mVar = m.f4881f;
        Set F = a1.a.F(FIELD_SHORT_TEXT);
        String str = FIELD_SHORT_TEXT;
        Set F2 = a1.a.F(FIELD_LONG_TEXT);
        String str2 = FIELD_LONG_TEXT;
        String[] strArr = {FIELD_MIN_VALUE, FIELD_MAX_VALUE};
        String str3 = FIELD_MIN_VALUE;
        Set G = a1.a.G(strArr);
        String str4 = FIELD_MAX_VALUE;
        Set F3 = a1.a.F(FIELD_ICON);
        String str5 = FIELD_ICON;
        String[] strArr2 = {FIELD_SMALL_IMAGE, FIELD_IMAGE_STYLE};
        String str6 = FIELD_IMAGE_STYLE;
        Set G2 = a1.a.G(strArr2);
        String str7 = FIELD_SMALL_IMAGE;
        REQUIRED_FIELDS = f.O(new h7.d(1, mVar), new h7.d(2, mVar), new h7.d(3, F), new h7.d(4, F2), new h7.d(5, G), new h7.d(6, F3), new h7.d(7, G2), new h7.d(8, a1.a.F(FIELD_LARGE_IMAGE)), new h7.d(9, mVar), new h7.d(10, mVar), new h7.d(-11, a1.a.G(EXP_FIELD_PROTO_LAYOUT_AMBIENT, EXP_FIELD_PROTO_LAYOUT_INTERACTIVE, EXP_FIELD_PROTO_LAYOUT_RESOURCES)), new h7.d(-12, a1.a.F(EXP_FIELD_LIST_ENTRIES)), new h7.d(13, a1.a.F(FIELD_TARGET_VALUE)), new h7.d(14, a1.a.G(FIELD_ELEMENT_WEIGHTS, FIELD_ELEMENT_COLORS, FIELD_ELEMENT_BACKGROUND_COLOR)));
        REQUIRED_ONE_OF_FIELDS = f.O(new h7.d(1, mVar), new h7.d(2, mVar), new h7.d(3, mVar), new h7.d(4, mVar), new h7.d(5, a1.a.F(a1.a.G(FIELD_VALUE, FIELD_DYNAMIC_VALUE))), new h7.d(6, mVar), new h7.d(7, mVar), new h7.d(8, mVar), new h7.d(9, mVar), new h7.d(10, mVar), new h7.d(-11, mVar), new h7.d(-12, mVar), new h7.d(13, a1.a.F(a1.a.G(FIELD_VALUE, FIELD_DYNAMIC_VALUE))), new h7.d(14, mVar));
        String[] strArr3 = {FIELD_TAP_ACTION, FIELD_CONTENT_DESCRIPTION, FIELD_DATA_SOURCE, FIELD_PERSISTENCE_POLICY, FIELD_DISPLAY_POLICY, FIELD_TIMELINE_START_TIME, FIELD_TIMELINE_END_TIME, FIELD_START_TIME, FIELD_END_TIME, FIELD_TIMELINE_ENTRIES, FIELD_TIMELINE_ENTRY_TYPE, FIELD_PLACEHOLDER_FIELDS, FIELD_PLACEHOLDER_TYPE};
        COMMON_OPTIONAL_FIELDS = strArr3;
        h7.d[] dVarArr = new h7.d[14];
        dVarArr[0] = new h7.d(1, mVar);
        dVarArr[1] = new h7.d(2, mVar);
        ArrayList arrayList = new ArrayList(7);
        if (strArr3.length > 0) {
            arrayList.ensureCapacity(arrayList.size() + strArr3.length);
            Collections.addAll(arrayList, strArr3);
        }
        arrayList.add(FIELD_SHORT_TITLE);
        String str8 = str5;
        arrayList.add(str8);
        arrayList.add(FIELD_ICON_BURN_IN_PROTECTION);
        String str9 = str7;
        arrayList.add(str9);
        arrayList.add(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        String str10 = str6;
        arrayList.add(str10);
        String str11 = FIELD_DYNAMIC_VALUE;
        Set G3 = a1.a.G(arrayList.toArray(new String[arrayList.size()]));
        String str12 = FIELD_VALUE;
        dVarArr[2] = new h7.d(3, G3);
        ArrayList arrayList2 = new ArrayList(7);
        if (strArr3.length > 0) {
            arrayList2.ensureCapacity(arrayList2.size() + strArr3.length);
            Collections.addAll(arrayList2, strArr3);
        }
        arrayList2.add(FIELD_LONG_TITLE);
        arrayList2.add(str8);
        arrayList2.add(FIELD_ICON_BURN_IN_PROTECTION);
        arrayList2.add(str9);
        arrayList2.add(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        arrayList2.add(str10);
        dVarArr[3] = new h7.d(4, a1.a.G(arrayList2.toArray(new String[arrayList2.size()])));
        h2.d dVar = new h2.d(11);
        dVar.b(strArr3);
        String str13 = str;
        dVar.a(str13);
        dVar.a(FIELD_SHORT_TITLE);
        dVar.a(str8);
        dVar.a(FIELD_ICON_BURN_IN_PROTECTION);
        dVar.a(str9);
        dVar.a(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVar.a(str10);
        dVar.a(FIELD_COLOR_RAMP);
        String str14 = FIELD_COLOR_RAMP;
        dVar.a(FIELD_COLOR_RAMP_INTERPOLATED);
        String str15 = FIELD_COLOR_RAMP_INTERPOLATED;
        dVar.a(FIELD_VALUE_TYPE);
        dVarArr[4] = new h7.d(5, a1.a.G(dVar.i(new String[dVar.g()])));
        ArrayList arrayList3 = new ArrayList(2);
        if (strArr3.length > 0) {
            arrayList3.ensureCapacity(arrayList3.size() + strArr3.length);
            Collections.addAll(arrayList3, strArr3);
        }
        arrayList3.add(FIELD_ICON_BURN_IN_PROTECTION);
        dVarArr[5] = new h7.d(6, a1.a.G(arrayList3.toArray(new String[arrayList3.size()])));
        ArrayList arrayList4 = new ArrayList(2);
        if (strArr3.length > 0) {
            arrayList4.ensureCapacity(arrayList4.size() + strArr3.length);
            Collections.addAll(arrayList4, strArr3);
        }
        arrayList4.add(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVarArr[6] = new h7.d(7, a1.a.G(arrayList4.toArray(new String[arrayList4.size()])));
        dVarArr[7] = new h7.d(8, a1.a.G(Arrays.copyOf(strArr3, 13)));
        h2.d dVar2 = new h2.d(8);
        dVar2.b(strArr3);
        dVar2.a(str13);
        dVar2.a(FIELD_SHORT_TITLE);
        dVar2.a(str8);
        dVar2.a(FIELD_ICON_BURN_IN_PROTECTION);
        dVar2.a(str9);
        dVar2.a(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVar2.a(str10);
        dVarArr[8] = new h7.d(9, a1.a.G(dVar2.i(new String[dVar2.g()])));
        h2.d dVar3 = new h2.d(29);
        dVar3.b(strArr3);
        String str16 = str14;
        dVar3.a(str16);
        String str17 = str15;
        dVar3.a(str17);
        dVar3.a(FIELD_ELEMENT_BACKGROUND_COLOR);
        dVar3.a(FIELD_ELEMENT_COLORS);
        dVar3.a(FIELD_ELEMENT_WEIGHTS);
        dVar3.a(str8);
        dVar3.a(FIELD_ICON_BURN_IN_PROTECTION);
        dVar3.a(str10);
        dVar3.a(FIELD_LARGE_IMAGE);
        dVar3.a(FIELD_LONG_TITLE);
        dVar3.a(str2);
        dVar3.a(str4);
        dVar3.a(str3);
        dVar3.a(str9);
        dVar3.a(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVar3.a(FIELD_SHORT_TITLE);
        dVar3.a(str13);
        dVar3.a(FIELD_TAP_ACTION_LOST);
        dVar3.a(FIELD_TARGET_VALUE);
        dVar3.a(str12);
        dVar3.a(str11);
        dVar3.a(FIELD_VALUE_TYPE);
        dVar3.a(EXP_FIELD_LIST_ENTRIES);
        dVar3.a(EXP_FIELD_LIST_ENTRY_TYPE);
        dVar3.a(EXP_FIELD_LIST_STYLE_HINT);
        dVar3.a(EXP_FIELD_PROTO_LAYOUT_AMBIENT);
        dVar3.a(EXP_FIELD_PROTO_LAYOUT_INTERACTIVE);
        dVar3.a(EXP_FIELD_PROTO_LAYOUT_RESOURCES);
        dVarArr[9] = new h7.d(10, a1.a.G(dVar3.i(new String[dVar3.g()])));
        dVarArr[10] = new h7.d(-11, a1.a.G(Arrays.copyOf(strArr3, 13)));
        ArrayList arrayList5 = new ArrayList(2);
        if (strArr3.length > 0) {
            arrayList5.ensureCapacity(arrayList5.size() + strArr3.length);
            Collections.addAll(arrayList5, strArr3);
        }
        arrayList5.add(EXP_FIELD_LIST_STYLE_HINT);
        dVarArr[11] = new h7.d(-12, a1.a.G(arrayList5.toArray(new String[arrayList5.size()])));
        h2.d dVar4 = new h2.d(10);
        dVar4.b(strArr3);
        dVar4.a(str13);
        dVar4.a(FIELD_SHORT_TITLE);
        dVar4.a(str8);
        dVar4.a(FIELD_ICON_BURN_IN_PROTECTION);
        dVar4.a(str9);
        dVar4.a(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVar4.a(str10);
        dVar4.a(str16);
        dVar4.a(str17);
        dVarArr[12] = new h7.d(13, a1.a.G(dVar4.i(new String[dVar4.g()])));
        h2.d dVar5 = new h2.d(8);
        dVar5.b(strArr3);
        dVar5.a(str13);
        dVar5.a(FIELD_SHORT_TITLE);
        dVar5.a(str8);
        dVar5.a(FIELD_ICON_BURN_IN_PROTECTION);
        dVar5.a(str9);
        dVar5.a(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        dVar5.a(str10);
        dVarArr[13] = new h7.d(14, a1.a.G(dVar5.i(new String[dVar5.g()])));
        OPTIONAL_FIELDS = f.O(dVarArr);
    }

    public ComplicationData(int i8, Bundle bundle) {
        k.e(bundle, "fields");
        this.type = i8;
        this.fields = bundle;
        bundle.setClassLoader(ComplicationData.class.getClassLoader());
    }

    public ComplicationData(Parcel parcel) {
        k.e(parcel, "input");
        this.type = parcel.readInt();
        Bundle readBundle = parcel.readBundle(ComplicationData.class.getClassLoader());
        if (readBundle == null) {
            Log.w(TAG, "ComplicationData parcel input has null bundle.");
            readBundle = new Bundle();
        }
        this.fields = readBundle;
    }

    public ComplicationData(a aVar) {
        k.e(aVar, "builder");
        this.type = aVar.f232a;
        this.fields = aVar.f233b;
    }

    private final boolean equalsUnevaluated(ComplicationData complicationData, ComplicationData complicationData2) {
        if (complicationData == null && complicationData2 == null) {
            return true;
        }
        if (complicationData == null || complicationData2 == null) {
            return false;
        }
        return complicationData.equalsUnevaluated(complicationData2);
    }

    private final boolean equalsUnevaluated(ComplicationText complicationText, ComplicationText complicationText2) {
        if (complicationText == null && complicationText2 == null) {
            return true;
        }
        if (complicationText == null || complicationText2 == null) {
            return false;
        }
        if (complicationText.getDynamicValue() == null) {
            return complicationText.equals(complicationText2);
        }
        e.u dynamicValue = complicationText.getDynamicValue();
        byte[] bArr = null;
        byte[] a9 = dynamicValue != null ? dynamicValue.a() : null;
        e.u dynamicValue2 = complicationText2.getDynamicValue();
        if (dynamicValue2 != null) {
            bArr = dynamicValue2.a();
        }
        return Arrays.equals(a9, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean equalsUnevaluated(java.util.List<android.support.wearable.complications.ComplicationData> r4, java.util.List<android.support.wearable.complications.ComplicationData> r5) {
        /*
            r3 = this;
            r3 = 1
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0006
            return r3
        L_0x0006:
            r0 = 0
            if (r4 == 0) goto L_0x0047
            if (r5 != 0) goto L_0x000c
            goto L_0x0047
        L_0x000c:
            int r1 = r4.size()
            int r2 = r5.size()
            if (r1 != r2) goto L_0x0045
            java.util.ArrayList r4 = i7.i.e0(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0021
            goto L_0x0041
        L_0x0021:
            java.util.Iterator r4 = r4.iterator()
        L_0x0025:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r4.next()
            h7.d r5 = (h7.d) r5
            A r1 = r5.f4781f
            android.support.wearable.complications.ComplicationData r1 = (android.support.wearable.complications.ComplicationData) r1
            B r5 = r5.f4782g
            android.support.wearable.complications.ComplicationData r5 = (android.support.wearable.complications.ComplicationData) r5
            boolean r5 = r1.equalsUnevaluated(r5)
            if (r5 != 0) goto L_0x0025
            r4 = r0
            goto L_0x0042
        L_0x0041:
            r4 = r3
        L_0x0042:
            if (r4 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = r0
        L_0x0046:
            return r3
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.ComplicationData.equalsUnevaluated(java.util.List, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if ((getRangedMinValue() == r7.getRangedMinValue()) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if ((getRangedMaxValue() == r7.getRangedMaxValue()) != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cc, code lost:
        if ((getTargetValue() == r7.getTargetValue()) != false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean equalsWithoutDynamicValues(android.support.wearable.complications.ComplicationData r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 == r7) goto L_0x0298
            int r1 = r6.type
            int r2 = r7.type
            r3 = 0
            if (r1 != r2) goto L_0x0297
            android.support.wearable.complications.ComplicationData$c r2 = Companion
            r2.getClass()
            java.lang.String r2 = "FIELD_TAP_ACTION_LOST"
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r1, r2)
            if (r1 == 0) goto L_0x0021
            boolean r1 = r6.getTapActionLostDueToSerialization()
            boolean r2 = r7.getTapActionLostDueToSerialization()
            if (r1 != r2) goto L_0x0297
        L_0x0021:
            java.lang.String r1 = "TIMELINE_START_TIME"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0039
            java.lang.Long r1 = r6.getTimelineStartEpochSecond()
            java.lang.Long r2 = r7.getTimelineStartEpochSecond()
            boolean r1 = q7.k.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0039:
            java.lang.String r1 = "TIMELINE_END_TIME"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0051
            java.lang.Long r1 = r6.getTimelineEndEpochSecond()
            java.lang.Long r2 = r7.getTimelineEndEpochSecond()
            boolean r1 = q7.k.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0051:
            java.lang.String r1 = "FIELD_DATA_SOURCE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0069
            android.content.ComponentName r1 = r6.getDataSource()
            android.content.ComponentName r2 = r7.getDataSource()
            boolean r1 = q7.k.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0069:
            java.lang.String r1 = "VALUE_TYPE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x007d
            int r1 = r6.getRangedValueType()
            int r2 = r7.getRangedValueType()
            if (r1 != r2) goto L_0x0297
        L_0x007d:
            java.lang.String r1 = "MIN_VALUE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0098
            float r1 = r6.getRangedMinValue()
            float r2 = r7.getRangedMinValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0095
            r1 = r0
            goto L_0x0096
        L_0x0095:
            r1 = r3
        L_0x0096:
            if (r1 == 0) goto L_0x0297
        L_0x0098:
            java.lang.String r1 = "MAX_VALUE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x00b3
            float r1 = r6.getRangedMaxValue()
            float r2 = r7.getRangedMaxValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00b0
            r1 = r0
            goto L_0x00b1
        L_0x00b0:
            r1 = r3
        L_0x00b1:
            if (r1 == 0) goto L_0x0297
        L_0x00b3:
            java.lang.String r1 = "TARGET_VALUE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x00ce
            float r1 = r6.getTargetValue()
            float r2 = r7.getTargetValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00cb
            r1 = r0
            goto L_0x00cc
        L_0x00cb:
            r1 = r3
        L_0x00cc:
            if (r1 == 0) goto L_0x0297
        L_0x00ce:
            java.lang.String r1 = "COLOR_RAMP"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x00e6
            int[] r1 = r6.getColorRamp()
            int[] r2 = r7.getColorRamp()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x00e6:
            java.lang.String r1 = "COLOR_RAMP_INTERPOLATED"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x00fe
            java.lang.Boolean r1 = r6.isColorRampInterpolated()
            java.lang.Boolean r2 = r7.isColorRampInterpolated()
            boolean r1 = q7.k.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x00fe:
            java.lang.String r1 = "ICON"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0116
            android.graphics.drawable.Icon r1 = r6.getIcon()
            android.graphics.drawable.Icon r2 = r7.getIcon()
            boolean r1 = v1.b.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0116:
            java.lang.String r1 = "ICON_BURN_IN_PROTECTION"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x012e
            android.graphics.drawable.Icon r1 = r6.getBurnInProtectionIcon()
            android.graphics.drawable.Icon r2 = r7.getBurnInProtectionIcon()
            boolean r1 = v1.b.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x012e:
            java.lang.String r1 = "SMALL_IMAGE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0146
            android.graphics.drawable.Icon r1 = r6.getSmallImage()
            android.graphics.drawable.Icon r2 = r7.getSmallImage()
            boolean r1 = v1.b.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0146:
            java.lang.String r1 = "SMALL_IMAGE_BURN_IN_PROTECTION"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x015e
            android.graphics.drawable.Icon r1 = r6.getBurnInProtectionSmallImage()
            android.graphics.drawable.Icon r2 = r7.getBurnInProtectionSmallImage()
            boolean r1 = v1.b.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x015e:
            java.lang.String r1 = "IMAGE_STYLE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0172
            int r1 = r6.getSmallImageStyle()
            int r2 = r7.getSmallImageStyle()
            if (r1 != r2) goto L_0x0297
        L_0x0172:
            java.lang.String r1 = "LARGE_IMAGE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x018a
            android.graphics.drawable.Icon r1 = r6.getLargeImage()
            android.graphics.drawable.Icon r2 = r7.getLargeImage()
            boolean r1 = v1.b.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x018a:
            java.lang.String r1 = "TAP_ACTION"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x01a2
            android.app.PendingIntent r1 = r6.getTapAction()
            android.app.PendingIntent r2 = r7.getTapAction()
            boolean r1 = q7.k.a(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x01a2:
            java.lang.String r1 = "ELEMENT_WEIGHTS"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x01ba
            float[] r1 = r6.getElementWeights()
            float[] r2 = r7.getElementWeights()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x01ba:
            java.lang.String r1 = "ELEMENT_COLORS"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x01d2
            int[] r1 = r6.getElementColors()
            int[] r2 = r7.getElementColors()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x01d2:
            java.lang.String r1 = "ELEMENT_BACKGROUND_COLOR"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x01e6
            int r1 = r6.getElementBackgroundColor()
            int r2 = r7.getElementBackgroundColor()
            if (r1 != r2) goto L_0x0297
        L_0x01e6:
            java.lang.String r1 = "EXP_FIELD_PROTO_LAYOUT_INTERACTIVE"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x01fe
            byte[] r1 = r6.getInteractiveLayout()
            byte[] r2 = r7.getInteractiveLayout()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x01fe:
            java.lang.String r1 = "EXP_LIST_STYLE_HINT"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0212
            int r1 = r6.getListStyleHint()
            int r2 = r7.getListStyleHint()
            if (r1 != r2) goto L_0x0297
        L_0x0212:
            java.lang.String r1 = "EXP_FIELD_PROTO_LAYOUT_AMBIENT"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x022a
            byte[] r1 = r6.getAmbientLayout()
            byte[] r2 = r7.getAmbientLayout()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x022a:
            java.lang.String r1 = "EXP_FIELD_PROTO_LAYOUT_RESOURCES"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0242
            byte[] r1 = r6.getLayoutResources()
            byte[] r2 = r7.getLayoutResources()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0297
        L_0x0242:
            java.lang.String r1 = "PERSISTENCE_POLICY"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0256
            int r1 = r6.getPersistencePolicy()
            int r2 = r7.getPersistencePolicy()
            if (r1 != r2) goto L_0x0297
        L_0x0256:
            java.lang.String r1 = "DISPLAY_POLICY"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x026a
            int r1 = r6.getDisplayPolicy()
            int r2 = r7.getDisplayPolicy()
            if (r1 != r2) goto L_0x0297
        L_0x026a:
            java.lang.String r1 = "START_TIME"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0280
            long r1 = r6.getStartDateTimeMillis()
            long r4 = r7.getStartDateTimeMillis()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0297
        L_0x0280:
            java.lang.String r1 = "END_TIME"
            int r2 = r6.type
            boolean r1 = android.support.wearable.complications.ComplicationData.c.c(r2, r1)
            if (r1 == 0) goto L_0x0298
            long r1 = r6.getEndDateTimeMillis()
            long r6 = r7.getEndDateTimeMillis()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0297
            goto L_0x0298
        L_0x0297:
            r0 = r3
        L_0x0298:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.ComplicationData.equalsWithoutDynamicValues(android.support.wearable.complications.ComplicationData):boolean");
    }

    public static /* synthetic */ void getDisplayPolicy$annotations() {
    }

    private final <T extends Parcelable> T getParcelableField(String str) {
        try {
            return this.fields.getParcelable(str);
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    private final <T extends Parcelable> T getParcelableFieldOrWarn(String str) {
        try {
            return this.fields.getParcelable(str);
        } catch (BadParcelableException e) {
            Log.w(TAG, "Could not unparcel ComplicationData. Provider apps must exclude wearable support complication classes from proguard.", e);
            return null;
        }
    }

    public static /* synthetic */ void getPersistencePolicy$annotations() {
    }

    public static /* synthetic */ void getSmallImageStyle$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    private final boolean hasParcelableField(String str) {
        return getParcelableField(str) != null;
    }

    private final boolean isTimeDependentField(String str) {
        ComplicationText complicationText = (ComplicationText) getParcelableFieldOrWarn(str);
        return complicationText != null && complicationText.isTimeDependent();
    }

    public static final String maybeRedact(CharSequence charSequence) {
        Companion.getClass();
        if (charSequence == null) {
            return "(null)";
        }
        String obj = charSequence.toString();
        return (!c.d() || k.a(obj, PLACEHOLDER_STRING)) ? obj : "REDACTED";
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static final boolean shouldRedact() {
        Companion.getClass();
        return c.d();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ComplicationData)) {
            return false;
        }
        ComplicationData complicationData = (ComplicationData) obj;
        if (!equalsWithoutDynamicValues(complicationData)) {
            return false;
        }
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        if (c.c(i8, FIELD_VALUE)) {
            if (!(getRangedValue() == complicationData.getRangedValue())) {
                return false;
            }
        }
        if (c.c(this.type, FIELD_DYNAMIC_VALUE)) {
            e.r rangedDynamicValue = getRangedDynamicValue();
            byte[] bArr = null;
            byte[] a9 = rangedDynamicValue != null ? rangedDynamicValue.a() : null;
            e.r rangedDynamicValue2 = complicationData.getRangedDynamicValue();
            if (rangedDynamicValue2 != null) {
                bArr = rangedDynamicValue2.a();
            }
            if (!Arrays.equals(a9, bArr)) {
                return false;
            }
        }
        if (c.c(this.type, FIELD_SHORT_TITLE) && !k.a(getShortTitle(), complicationData.getShortTitle())) {
            return false;
        }
        if (c.c(this.type, FIELD_SHORT_TEXT) && !k.a(getShortText(), complicationData.getShortText())) {
            return false;
        }
        if (c.c(this.type, FIELD_LONG_TITLE) && !k.a(getLongTitle(), complicationData.getLongTitle())) {
            return false;
        }
        if (c.c(this.type, FIELD_LONG_TEXT) && !k.a(getLongText(), complicationData.getLongText())) {
            return false;
        }
        if (c.c(this.type, FIELD_CONTENT_DESCRIPTION) && !k.a(getContentDescription(), complicationData.getContentDescription())) {
            return false;
        }
        if (c.c(this.type, FIELD_PLACEHOLDER_TYPE) && !k.a(getPlaceholder(), complicationData.getPlaceholder())) {
            return false;
        }
        if (!c.c(this.type, FIELD_TIMELINE_ENTRIES) || k.a(getTimelineEntries(), complicationData.getTimelineEntries())) {
            return !c.c(this.type, EXP_FIELD_LIST_ENTRIES) || k.a(getListEntries(), complicationData.getListEntries());
        }
        return false;
    }

    public final boolean equalsUnevaluated(ComplicationData complicationData) {
        boolean z8;
        k.e(complicationData, "other");
        if (!equalsWithoutDynamicValues(complicationData)) {
            return false;
        }
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        if (!c.c(i8, FIELD_DYNAMIC_VALUE) || getRangedDynamicValue() == null) {
            if (c.c(this.type, FIELD_VALUE)) {
                if (!(getRangedValue() == complicationData.getRangedValue())) {
                    z8 = false;
                }
            }
            z8 = true;
        } else {
            e.r rangedDynamicValue = getRangedDynamicValue();
            byte[] bArr = null;
            byte[] a9 = rangedDynamicValue != null ? rangedDynamicValue.a() : null;
            e.r rangedDynamicValue2 = complicationData.getRangedDynamicValue();
            if (rangedDynamicValue2 != null) {
                bArr = rangedDynamicValue2.a();
            }
            z8 = Arrays.equals(a9, bArr);
        }
        if (!z8) {
            return false;
        }
        if (c.c(this.type, FIELD_SHORT_TITLE) && !equalsUnevaluated(getShortTitle(), complicationData.getShortTitle())) {
            return false;
        }
        if (c.c(this.type, FIELD_SHORT_TEXT) && !equalsUnevaluated(getShortText(), complicationData.getShortText())) {
            return false;
        }
        if (c.c(this.type, FIELD_LONG_TITLE) && !equalsUnevaluated(getLongTitle(), complicationData.getLongTitle())) {
            return false;
        }
        if (c.c(this.type, FIELD_LONG_TEXT) && !equalsUnevaluated(getLongText(), complicationData.getLongText())) {
            return false;
        }
        if (c.c(this.type, FIELD_CONTENT_DESCRIPTION) && !equalsUnevaluated(getContentDescription(), complicationData.getContentDescription())) {
            return false;
        }
        if (c.c(this.type, FIELD_PLACEHOLDER_TYPE) && !equalsUnevaluated(getPlaceholder(), complicationData.getPlaceholder())) {
            return false;
        }
        if (!c.c(this.type, FIELD_TIMELINE_ENTRIES) || equalsUnevaluated(getTimelineEntries(), complicationData.getTimelineEntries())) {
            return !c.c(this.type, EXP_FIELD_LIST_ENTRIES) || equalsUnevaluated(getListEntries(), complicationData.getListEntries());
        }
        return false;
    }

    public final byte[] getAmbientLayout() {
        return this.fields.getByteArray(EXP_FIELD_PROTO_LAYOUT_AMBIENT);
    }

    public final Icon getBurnInProtectionIcon() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_ICON_BURN_IN_PROTECTION);
        return (Icon) getParcelableFieldOrWarn(FIELD_ICON_BURN_IN_PROTECTION);
    }

    public final Icon getBurnInProtectionSmallImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
        return (Icon) getParcelableFieldOrWarn(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
    }

    public final int[] getColorRamp() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_COLOR_RAMP);
        if (this.fields.containsKey(FIELD_COLOR_RAMP)) {
            return this.fields.getIntArray(FIELD_COLOR_RAMP);
        }
        return null;
    }

    public final ComplicationText getContentDescription() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_CONTENT_DESCRIPTION);
        return (ComplicationText) getParcelableFieldOrWarn(FIELD_CONTENT_DESCRIPTION);
    }

    public final ComponentName getDataSource() {
        return (ComponentName) getParcelableField(FIELD_DATA_SOURCE);
    }

    public final int getDisplayPolicy() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_DISPLAY_POLICY);
        return this.fields.getInt(FIELD_DISPLAY_POLICY, 0);
    }

    public final int getElementBackgroundColor() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_ELEMENT_BACKGROUND_COLOR);
        return this.fields.getInt(FIELD_ELEMENT_BACKGROUND_COLOR);
    }

    public final int[] getElementColors() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_ELEMENT_COLORS);
        return this.fields.getIntArray(FIELD_ELEMENT_COLORS);
    }

    public final float[] getElementWeights() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_ELEMENT_WEIGHTS);
        return this.fields.getFloatArray(FIELD_ELEMENT_WEIGHTS);
    }

    public final long getEndDateTimeMillis() {
        return this.fields.getLong(FIELD_END_TIME, Long.MAX_VALUE);
    }

    public final Icon getIcon() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_ICON);
        return (Icon) getParcelableFieldOrWarn(FIELD_ICON);
    }

    public final byte[] getInteractiveLayout() {
        return this.fields.getByteArray(EXP_FIELD_PROTO_LAYOUT_INTERACTIVE);
    }

    public final Icon getLargeImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_LARGE_IMAGE);
        return (Icon) getParcelableFieldOrWarn(FIELD_LARGE_IMAGE);
    }

    public final byte[] getLayoutResources() {
        return this.fields.getByteArray(EXP_FIELD_PROTO_LAYOUT_RESOURCES);
    }

    public final List<ComplicationData> getListEntries() {
        Parcelable[] parcelableArray = this.fields.getParcelableArray(EXP_FIELD_LIST_ENTRIES);
        if (parcelableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            k.c(parcelable, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(ComplicationData.class.getClassLoader());
            arrayList.add(new ComplicationData(bundle.getInt(EXP_FIELD_LIST_ENTRY_TYPE), bundle));
        }
        return arrayList;
    }

    public final int getListStyleHint() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.a(i8, EXP_FIELD_LIST_STYLE_HINT);
        return this.fields.getInt(EXP_FIELD_LIST_STYLE_HINT);
    }

    public final ComplicationText getLongText() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_LONG_TEXT);
        return (ComplicationText) getParcelableFieldOrWarn(FIELD_LONG_TEXT);
    }

    public final ComplicationText getLongTitle() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_LONG_TITLE);
        return (ComplicationText) getParcelableFieldOrWarn(FIELD_LONG_TITLE);
    }

    public final int getPersistencePolicy() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_PERSISTENCE_POLICY);
        return this.fields.getInt(FIELD_PERSISTENCE_POLICY, 0);
    }

    public final ComplicationData getPlaceholder() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.a(i8, FIELD_PLACEHOLDER_FIELDS);
        c.a(this.type, FIELD_PLACEHOLDER_TYPE);
        if (!this.fields.containsKey(FIELD_PLACEHOLDER_FIELDS) || !this.fields.containsKey(FIELD_PLACEHOLDER_TYPE)) {
            return null;
        }
        int i9 = this.fields.getInt(FIELD_PLACEHOLDER_TYPE);
        Bundle bundle = this.fields.getBundle(FIELD_PLACEHOLDER_FIELDS);
        k.b(bundle);
        return new ComplicationData(i9, bundle);
    }

    public final e.r getRangedDynamicValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_DYNAMIC_VALUE);
        byte[] byteArray = this.fields.getByteArray(FIELD_DYNAMIC_VALUE);
        if (byteArray == null) {
            return null;
        }
        try {
            return e.c(a0.Q(h.d(byteArray, 0, byteArray.length, false), n.a()));
        } catch (IOException e) {
            throw new IllegalArgumentException("Byte array could not be parsed into DynamicFloat", e);
        }
    }

    public final float getRangedMaxValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_MAX_VALUE);
        return this.fields.getFloat(FIELD_MAX_VALUE);
    }

    public final float getRangedMinValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_MIN_VALUE);
        return this.fields.getFloat(FIELD_MIN_VALUE);
    }

    public final float getRangedValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_VALUE);
        return this.fields.getFloat(FIELD_VALUE);
    }

    public final int getRangedValueType() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_VALUE_TYPE);
        return this.fields.getInt(FIELD_VALUE_TYPE);
    }

    public final ComplicationText getShortText() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_SHORT_TEXT);
        return (ComplicationText) getParcelableFieldOrWarn(FIELD_SHORT_TEXT);
    }

    public final ComplicationText getShortTitle() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_SHORT_TITLE);
        return (ComplicationText) getParcelableFieldOrWarn(FIELD_SHORT_TITLE);
    }

    public final Icon getSmallImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_SMALL_IMAGE);
        return (Icon) getParcelableFieldOrWarn(FIELD_SMALL_IMAGE);
    }

    public final int getSmallImageStyle() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_IMAGE_STYLE);
        return this.fields.getInt(FIELD_IMAGE_STYLE);
    }

    public final long getStartDateTimeMillis() {
        return this.fields.getLong(FIELD_START_TIME, 0);
    }

    public final PendingIntent getTapAction() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_TAP_ACTION);
        return (PendingIntent) getParcelableFieldOrWarn(FIELD_TAP_ACTION);
    }

    public final boolean getTapActionLostDueToSerialization() {
        return this.fields.getBoolean(FIELD_TAP_ACTION_LOST);
    }

    public final float getTargetValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_TARGET_VALUE);
        return this.fields.getFloat(FIELD_TARGET_VALUE);
    }

    public final Long getTimelineEndEpochSecond() {
        long j8 = this.fields.getLong(FIELD_TIMELINE_END_TIME, -1);
        if (j8 == -1) {
            return null;
        }
        return Long.valueOf(j8);
    }

    public final List<ComplicationData> getTimelineEntries() {
        Parcelable[] parcelableArray = this.fields.getParcelableArray(FIELD_TIMELINE_ENTRIES);
        if (parcelableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            k.c(parcelable, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(ComplicationData.class.getClassLoader());
            arrayList.add(new ComplicationData(bundle.getInt(FIELD_TIMELINE_ENTRY_TYPE, this.type), bundle));
        }
        return arrayList;
    }

    public final Long getTimelineStartEpochSecond() {
        long j8 = this.fields.getLong(FIELD_TIMELINE_START_TIME, -1);
        if (j8 == -1) {
            return null;
        }
        return Long.valueOf(j8);
    }

    public final int getType() {
        return this.type;
    }

    public final boolean hasBurnInProtectionIcon() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_ICON_BURN_IN_PROTECTION) && hasParcelableField(FIELD_ICON_BURN_IN_PROTECTION);
    }

    public final boolean hasBurnInProtectionSmallImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_SMALL_IMAGE_BURN_IN_PROTECTION) && hasParcelableField(FIELD_SMALL_IMAGE_BURN_IN_PROTECTION);
    }

    public final boolean hasContentDescription() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_CONTENT_DESCRIPTION) && hasParcelableField(FIELD_CONTENT_DESCRIPTION);
    }

    public final boolean hasDynamicValues() {
        boolean z8;
        boolean z9;
        if (hasRangedDynamicValue() && getRangedDynamicValue() != null) {
            return true;
        }
        e.u uVar = null;
        if (hasLongText()) {
            ComplicationText longText = getLongText();
            if ((longText != null ? longText.getDynamicValue() : null) != null) {
                return true;
            }
        }
        if (hasLongTitle()) {
            ComplicationText longTitle = getLongTitle();
            if ((longTitle != null ? longTitle.getDynamicValue() : null) != null) {
                return true;
            }
        }
        if (hasShortText()) {
            ComplicationText shortText = getShortText();
            if ((shortText != null ? shortText.getDynamicValue() : null) != null) {
                return true;
            }
        }
        if (hasShortTitle()) {
            ComplicationText shortTitle = getShortTitle();
            if ((shortTitle != null ? shortTitle.getDynamicValue() : null) != null) {
                return true;
            }
        }
        if (hasContentDescription()) {
            ComplicationText contentDescription = getContentDescription();
            if (contentDescription != null) {
                uVar = contentDescription.getDynamicValue();
            }
            if (uVar != null) {
                return true;
            }
        }
        ComplicationData placeholder = getPlaceholder();
        if (placeholder != null ? placeholder.hasDynamicValues() : false) {
            return true;
        }
        List<ComplicationData> timelineEntries = getTimelineEntries();
        if (timelineEntries != null && !timelineEntries.isEmpty()) {
            Iterator<T> it = timelineEntries.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ComplicationData) it.next()).hasDynamicValues()) {
                        z8 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z8 = false;
        if (z8) {
            return true;
        }
        List<ComplicationData> listEntries = getListEntries();
        if (listEntries != null && !listEntries.isEmpty()) {
            Iterator<T> it2 = listEntries.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((ComplicationData) it2.next()).hasDynamicValues()) {
                        z9 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z9 = false;
        return z9;
    }

    public final boolean hasIcon() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_ICON) && hasParcelableField(FIELD_ICON);
    }

    public final boolean hasLargeImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_LARGE_IMAGE) && hasParcelableField(FIELD_LARGE_IMAGE);
    }

    public final boolean hasLongText() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_LONG_TEXT) && hasParcelableField(FIELD_LONG_TEXT);
    }

    public final boolean hasLongTitle() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_LONG_TITLE) && hasParcelableField(FIELD_LONG_TITLE);
    }

    public final boolean hasRangedDynamicValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_DYNAMIC_VALUE) && this.fields.containsKey(FIELD_DYNAMIC_VALUE);
    }

    public final boolean hasRangedMaxValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_MAX_VALUE);
    }

    public final boolean hasRangedMinValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_MIN_VALUE);
    }

    public final boolean hasRangedValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_VALUE);
    }

    public final boolean hasRangedValueType() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_VALUE_TYPE);
    }

    public final boolean hasShortText() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_SHORT_TEXT) && hasParcelableField(FIELD_SHORT_TEXT);
    }

    public final boolean hasShortTitle() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_SHORT_TITLE) && hasParcelableField(FIELD_SHORT_TITLE);
    }

    public final boolean hasSmallImage() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_SMALL_IMAGE) && hasParcelableField(FIELD_SMALL_IMAGE);
    }

    public final boolean hasTapAction() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_TAP_ACTION) && hasParcelableField(FIELD_TAP_ACTION);
    }

    public final boolean hasTargetValue() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        return c.c(i8, FIELD_TARGET_VALUE);
    }

    public int hashCode() {
        Integer num;
        Icon largeImage;
        Icon burnInProtectionSmallImage;
        Icon smallImage;
        Icon burnInProtectionIcon;
        Icon icon;
        Object[] objArr = new Object[39];
        objArr[0] = Integer.valueOf(this.type);
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        boolean c9 = c.c(i8, FIELD_TAP_ACTION_LOST);
        Long l8 = null;
        objArr[1] = c9 ? Boolean.valueOf(getTapActionLostDueToSerialization()) : null;
        objArr[2] = c.c(this.type, FIELD_TIMELINE_START_TIME) ? getTimelineStartEpochSecond() : null;
        objArr[3] = c.c(this.type, FIELD_TIMELINE_END_TIME) ? getTimelineEndEpochSecond() : null;
        objArr[4] = c.c(this.type, FIELD_TIMELINE_ENTRIES) ? getTimelineEntries() : null;
        objArr[5] = c.c(this.type, EXP_FIELD_LIST_ENTRIES) ? getListEntries() : null;
        objArr[6] = c.c(this.type, FIELD_DATA_SOURCE) ? getDataSource() : null;
        objArr[7] = c.c(this.type, FIELD_VALUE) ? Float.valueOf(getRangedValue()) : null;
        if (c.c(this.type, FIELD_DYNAMIC_VALUE)) {
            e.r rangedDynamicValue = getRangedDynamicValue();
            num = Integer.valueOf(Arrays.hashCode(rangedDynamicValue != null ? rangedDynamicValue.a() : null));
        } else {
            num = null;
        }
        objArr[8] = num;
        objArr[9] = c.c(this.type, FIELD_VALUE_TYPE) ? Integer.valueOf(getRangedValueType()) : null;
        objArr[10] = c.c(this.type, FIELD_MIN_VALUE) ? Float.valueOf(getRangedMinValue()) : null;
        objArr[11] = c.c(this.type, FIELD_MAX_VALUE) ? Float.valueOf(getRangedMaxValue()) : null;
        objArr[12] = c.c(this.type, FIELD_TARGET_VALUE) ? Float.valueOf(getTargetValue()) : null;
        objArr[13] = c.c(this.type, FIELD_COLOR_RAMP) ? Integer.valueOf(Arrays.hashCode(getColorRamp())) : null;
        objArr[14] = c.c(this.type, FIELD_COLOR_RAMP_INTERPOLATED) ? isColorRampInterpolated() : null;
        objArr[15] = c.c(this.type, FIELD_SHORT_TITLE) ? getShortTitle() : null;
        objArr[16] = c.c(this.type, FIELD_SHORT_TEXT) ? getShortText() : null;
        objArr[17] = c.c(this.type, FIELD_LONG_TITLE) ? getLongTitle() : null;
        objArr[18] = c.c(this.type, FIELD_LONG_TEXT) ? getLongText() : null;
        objArr[19] = (!c.c(this.type, FIELD_ICON) || (icon = getIcon()) == null) ? null : Integer.valueOf(v1.b.b(icon));
        objArr[20] = (!c.c(this.type, FIELD_ICON_BURN_IN_PROTECTION) || (burnInProtectionIcon = getBurnInProtectionIcon()) == null) ? null : Integer.valueOf(v1.b.b(burnInProtectionIcon));
        objArr[21] = (!c.c(this.type, FIELD_SMALL_IMAGE) || (smallImage = getSmallImage()) == null) ? null : Integer.valueOf(v1.b.b(smallImage));
        objArr[22] = (!c.c(this.type, FIELD_SMALL_IMAGE_BURN_IN_PROTECTION) || (burnInProtectionSmallImage = getBurnInProtectionSmallImage()) == null) ? null : Integer.valueOf(v1.b.b(burnInProtectionSmallImage));
        objArr[23] = c.c(this.type, FIELD_IMAGE_STYLE) ? Integer.valueOf(getSmallImageStyle()) : null;
        objArr[24] = (!c.c(this.type, FIELD_LARGE_IMAGE) || (largeImage = getLargeImage()) == null) ? null : Integer.valueOf(v1.b.b(largeImage));
        objArr[25] = c.c(this.type, FIELD_TAP_ACTION) ? getTapAction() : null;
        objArr[26] = c.c(this.type, FIELD_CONTENT_DESCRIPTION) ? getContentDescription() : null;
        objArr[27] = c.c(this.type, FIELD_ELEMENT_WEIGHTS) ? Integer.valueOf(Arrays.hashCode(getElementWeights())) : null;
        objArr[28] = c.c(this.type, FIELD_ELEMENT_COLORS) ? Integer.valueOf(Arrays.hashCode(getElementColors())) : null;
        objArr[29] = c.c(this.type, FIELD_ELEMENT_BACKGROUND_COLOR) ? Integer.valueOf(getElementBackgroundColor()) : null;
        objArr[30] = c.c(this.type, FIELD_PLACEHOLDER_TYPE) ? getPlaceholder() : null;
        objArr[31] = c.c(this.type, EXP_FIELD_PROTO_LAYOUT_INTERACTIVE) ? Integer.valueOf(Arrays.hashCode(getInteractiveLayout())) : null;
        objArr[32] = c.c(this.type, EXP_FIELD_LIST_STYLE_HINT) ? Integer.valueOf(getListStyleHint()) : null;
        objArr[33] = c.c(this.type, EXP_FIELD_PROTO_LAYOUT_AMBIENT) ? Integer.valueOf(Arrays.hashCode(getAmbientLayout())) : null;
        objArr[34] = c.c(this.type, EXP_FIELD_PROTO_LAYOUT_RESOURCES) ? Integer.valueOf(Arrays.hashCode(getLayoutResources())) : null;
        objArr[35] = c.c(this.type, FIELD_PERSISTENCE_POLICY) ? Integer.valueOf(getPersistencePolicy()) : null;
        objArr[36] = c.c(this.type, FIELD_DISPLAY_POLICY) ? Integer.valueOf(getDisplayPolicy()) : null;
        objArr[37] = c.c(this.type, FIELD_START_TIME) ? Long.valueOf(getStartDateTimeMillis()) : null;
        if (c.c(this.type, FIELD_END_TIME)) {
            l8 = Long.valueOf(getEndDateTimeMillis());
        }
        objArr[38] = l8;
        return Objects.hash(objArr);
    }

    public final boolean isActiveAt(long j8) {
        return j8 >= this.fields.getLong(FIELD_START_TIME, 0) && j8 <= this.fields.getLong(FIELD_END_TIME, Long.MAX_VALUE);
    }

    public final Boolean isColorRampInterpolated() {
        c cVar = Companion;
        int i8 = this.type;
        cVar.getClass();
        c.b(i8, FIELD_COLOR_RAMP_INTERPOLATED);
        if (this.fields.containsKey(FIELD_COLOR_RAMP_INTERPOLATED)) {
            return Boolean.valueOf(this.fields.getBoolean(FIELD_COLOR_RAMP_INTERPOLATED));
        }
        return null;
    }

    public final boolean isTimeDependent() {
        return isTimeDependentField(FIELD_SHORT_TEXT) || isTimeDependentField(FIELD_SHORT_TITLE) || isTimeDependentField(FIELD_LONG_TEXT) || isTimeDependentField(FIELD_LONG_TITLE);
    }

    public final void setDataSource(ComponentName componentName) {
        this.fields.putParcelable(FIELD_DATA_SOURCE, componentName);
    }

    public final void setTimelineEndEpochSecond(Long l8) {
        Bundle bundle = this.fields;
        if (l8 == null) {
            bundle.remove(FIELD_TIMELINE_END_TIME);
        } else {
            bundle.putLong(FIELD_TIMELINE_END_TIME, l8.longValue());
        }
    }

    public final void setTimelineEntryCollection(Collection<ComplicationData> collection) {
        Bundle bundle = this.fields;
        if (collection == null) {
            bundle.remove(FIELD_TIMELINE_ENTRIES);
            return;
        }
        ArrayList arrayList = new ArrayList(f.M(collection));
        for (ComplicationData complicationData : collection) {
            complicationData.fields.putInt(FIELD_TIMELINE_ENTRY_TYPE, complicationData.type);
            arrayList.add(complicationData.fields);
        }
        bundle.putParcelableArray(FIELD_TIMELINE_ENTRIES, (Parcelable[]) arrayList.toArray(new Bundle[0]));
    }

    public final void setTimelineStartEpochSecond(Long l8) {
        Bundle bundle = this.fields;
        if (l8 == null) {
            bundle.remove(FIELD_TIMELINE_START_TIME);
        } else {
            bundle.putLong(FIELD_TIMELINE_START_TIME, l8.longValue());
        }
    }

    public String toString() {
        Companion.getClass();
        if (!c.d()) {
            return toStringNoRedaction();
        }
        return "ComplicationData{mType=" + this.type + ", mFields=REDACTED}";
    }

    public final String toStringNoRedaction() {
        return "ComplicationData{mType=" + this.type + ", mFields=" + this.fields + '}';
    }

    public final Object writeReplace() {
        return new d();
    }

    public void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        parcel.writeInt(this.type);
        parcel.writeBundle(this.fields);
    }
}
