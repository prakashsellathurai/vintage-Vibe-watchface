package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import q7.k;

public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f1442f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1443a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f1444b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1445c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1446d;
    public final c0 e;

    public static final class a {
        public static d0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        Object obj = parcelableArrayList.get(i8);
                        k.c(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
                    }
                    return new d0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new d0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    k.d(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new d0(hashMap);
            }
        }
    }

    public d0() {
        this.f1443a = new LinkedHashMap();
        this.f1444b = new LinkedHashMap();
        this.f1445c = new LinkedHashMap();
        this.f1446d = new LinkedHashMap();
        this.e = new c0(1, this);
    }

    public d0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1443a = linkedHashMap;
        this.f1444b = new LinkedHashMap();
        this.f1445c = new LinkedHashMap();
        this.f1446d = new LinkedHashMap();
        this.e = new c0(0, this);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: androidx.lifecycle.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0090 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(androidx.lifecycle.d0 r10) {
        /*
            java.lang.String r0 = "this$0"
            q7.k.e(r10, r0)
            java.util.LinkedHashMap r0 = r10.f1444b
            java.lang.String r1 = "<this>"
            q7.k.e(r0, r1)
            int r1 = r0.size()
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x001b
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            goto L_0x0022
        L_0x001b:
            java.util.Map r1 = a1.a.J(r0)
            goto L_0x0022
        L_0x0020:
            i7.l r1 = i7.l.f4880f
        L_0x0022:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r1 = r0.hasNext()
            java.util.LinkedHashMap r3 = r10.f1443a
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.a$b r1 = (androidx.savedstate.a.b) r1
            android.os.Bundle r1 = r1.a()
            java.lang.String r7 = "key"
            q7.k.e(r6, r7)
            if (r1 != 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.Class<? extends java.lang.Object>[] r7 = f1442f
            r8 = r5
        L_0x0055:
            r9 = 29
            if (r8 >= r9) goto L_0x0069
            r9 = r7[r8]
            q7.k.b(r9)
            boolean r9 = r9.isInstance(r1)
            if (r9 == 0) goto L_0x0066
        L_0x0064:
            r5 = r2
            goto L_0x0069
        L_0x0066:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0069:
            if (r5 == 0) goto L_0x0090
            java.util.LinkedHashMap r5 = r10.f1445c
            java.lang.Object r5 = r5.get(r6)
            boolean r7 = r5 instanceof androidx.lifecycle.y
            if (r7 == 0) goto L_0x0078
            r4 = r5
            androidx.lifecycle.y r4 = (androidx.lifecycle.y) r4
        L_0x0078:
            if (r4 == 0) goto L_0x007e
            r4.i(r1)
            goto L_0x0081
        L_0x007e:
            r3.put(r6, r1)
        L_0x0081:
            java.util.LinkedHashMap r3 = r10.f1446d
            java.lang.Object r3 = r3.get(r6)
            kotlinx.coroutines.flow.MutableStateFlow r3 = (kotlinx.coroutines.flow.MutableStateFlow) r3
            if (r3 != 0) goto L_0x008c
            goto L_0x002a
        L_0x008c:
            r3.setValue(r1)
            goto L_0x002a
        L_0x0090:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't put value with type "
            r0.<init>(r2)
            q7.k.b(r1)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " into saved state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00b0:
            java.util.Set r10 = r3.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r6 = r0.size()
            r1.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x00ca:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r10.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.add(r6)
            java.lang.Object r6 = r3.get(r6)
            r1.add(r6)
            goto L_0x00ca
        L_0x00e1:
            r10 = 2
            h7.d[] r3 = new h7.d[r10]
            h7.d r6 = new h7.d
            java.lang.String r7 = "keys"
            r6.<init>(r7, r0)
            r3[r5] = r6
            h7.d r0 = new h7.d
            java.lang.String r6 = "values"
            r0.<init>(r6, r1)
            r3[r2] = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r10)
        L_0x00fb:
            if (r5 >= r10) goto L_0x02b2
            r1 = r3[r5]
            int r5 = r5 + 1
            A r2 = r1.f4781f
            java.lang.String r2 = (java.lang.String) r2
            B r1 = r1.f4782g
            if (r1 != 0) goto L_0x010d
            r0.putString(r2, r4)
            goto L_0x00fb
        L_0x010d:
            boolean r6 = r1 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x011b
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.putBoolean(r2, r1)
            goto L_0x00fb
        L_0x011b:
            boolean r6 = r1 instanceof java.lang.Byte
            if (r6 == 0) goto L_0x0129
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            r0.putByte(r2, r1)
            goto L_0x00fb
        L_0x0129:
            boolean r6 = r1 instanceof java.lang.Character
            if (r6 == 0) goto L_0x0137
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.putChar(r2, r1)
            goto L_0x00fb
        L_0x0137:
            boolean r6 = r1 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0145
            java.lang.Number r1 = (java.lang.Number) r1
            double r6 = r1.doubleValue()
            r0.putDouble(r2, r6)
            goto L_0x00fb
        L_0x0145:
            boolean r6 = r1 instanceof java.lang.Float
            if (r6 == 0) goto L_0x0153
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.putFloat(r2, r1)
            goto L_0x00fb
        L_0x0153:
            boolean r6 = r1 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0161
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
            goto L_0x00fb
        L_0x0161:
            boolean r6 = r1 instanceof java.lang.Long
            if (r6 == 0) goto L_0x016f
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            r0.putLong(r2, r6)
            goto L_0x00fb
        L_0x016f:
            boolean r6 = r1 instanceof java.lang.Short
            if (r6 == 0) goto L_0x017e
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            r0.putShort(r2, r1)
            goto L_0x00fb
        L_0x017e:
            boolean r6 = r1 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0189
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.putBundle(r2, r1)
            goto L_0x00fb
        L_0x0189:
            boolean r6 = r1 instanceof java.lang.CharSequence
            if (r6 == 0) goto L_0x0194
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.putCharSequence(r2, r1)
            goto L_0x00fb
        L_0x0194:
            boolean r6 = r1 instanceof android.os.Parcelable
            if (r6 == 0) goto L_0x019f
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r2, r1)
            goto L_0x00fb
        L_0x019f:
            boolean r6 = r1 instanceof boolean[]
            if (r6 == 0) goto L_0x01aa
            boolean[] r1 = (boolean[]) r1
            r0.putBooleanArray(r2, r1)
            goto L_0x00fb
        L_0x01aa:
            boolean r6 = r1 instanceof byte[]
            if (r6 == 0) goto L_0x01b5
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L_0x00fb
        L_0x01b5:
            boolean r6 = r1 instanceof char[]
            if (r6 == 0) goto L_0x01c0
            char[] r1 = (char[]) r1
            r0.putCharArray(r2, r1)
            goto L_0x00fb
        L_0x01c0:
            boolean r6 = r1 instanceof double[]
            if (r6 == 0) goto L_0x01cb
            double[] r1 = (double[]) r1
            r0.putDoubleArray(r2, r1)
            goto L_0x00fb
        L_0x01cb:
            boolean r6 = r1 instanceof float[]
            if (r6 == 0) goto L_0x01d6
            float[] r1 = (float[]) r1
            r0.putFloatArray(r2, r1)
            goto L_0x00fb
        L_0x01d6:
            boolean r6 = r1 instanceof int[]
            if (r6 == 0) goto L_0x01e1
            int[] r1 = (int[]) r1
            r0.putIntArray(r2, r1)
            goto L_0x00fb
        L_0x01e1:
            boolean r6 = r1 instanceof long[]
            if (r6 == 0) goto L_0x01ec
            long[] r1 = (long[]) r1
            r0.putLongArray(r2, r1)
            goto L_0x00fb
        L_0x01ec:
            boolean r6 = r1 instanceof short[]
            if (r6 == 0) goto L_0x01f7
            short[] r1 = (short[]) r1
            r0.putShortArray(r2, r1)
            goto L_0x00fb
        L_0x01f7:
            boolean r6 = r1 instanceof java.lang.Object[]
            r7 = 34
            java.lang.String r8 = " for key \""
            if (r6 == 0) goto L_0x0261
            java.lang.Class r6 = r1.getClass()
            java.lang.Class r6 = r6.getComponentType()
            q7.k.b(r6)
            java.lang.Class<android.os.Parcelable> r9 = android.os.Parcelable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0219
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            r0.putParcelableArray(r2, r1)
            goto L_0x00fb
        L_0x0219:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0228
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.putStringArray(r2, r1)
            goto L_0x00fb
        L_0x0228:
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0237
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            r0.putCharSequenceArray(r2, r1)
            goto L_0x00fb
        L_0x0237:
            java.lang.Class<java.io.Serializable> r9 = java.io.Serializable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L_0x0240
            goto L_0x0265
        L_0x0240:
            java.lang.String r10 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal value array type "
            r1.<init>(r3)
            r1.append(r10)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0261:
            boolean r6 = r1 instanceof java.io.Serializable
            if (r6 == 0) goto L_0x026c
        L_0x0265:
            java.io.Serializable r1 = (java.io.Serializable) r1
            r0.putSerializable(r2, r1)
            goto L_0x00fb
        L_0x026c:
            boolean r6 = r1 instanceof android.os.IBinder
            if (r6 == 0) goto L_0x0277
            android.os.IBinder r1 = (android.os.IBinder) r1
            r0.putBinder(r2, r1)
            goto L_0x00fb
        L_0x0277:
            boolean r6 = r1 instanceof android.util.Size
            if (r6 == 0) goto L_0x0282
            android.util.Size r1 = (android.util.Size) r1
            r0.putSize(r2, r1)
            goto L_0x00fb
        L_0x0282:
            boolean r6 = r1 instanceof android.util.SizeF
            if (r6 == 0) goto L_0x028d
            android.util.SizeF r1 = (android.util.SizeF) r1
            r0.putSizeF(r2, r1)
            goto L_0x00fb
        L_0x028d:
            java.lang.Class r10 = r1.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal value type "
            r1.<init>(r3)
            r1.append(r10)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x02b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.d0.a(androidx.lifecycle.d0):android.os.Bundle");
    }
}
