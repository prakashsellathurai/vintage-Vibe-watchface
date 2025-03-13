package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final l0 f3720g;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3721f = true;

    static {
        l0 l0Var = new l0();
        f3720g = l0Var;
        l0Var.f3721f = false;
    }

    public l0() {
    }

    public l0(Map<K, V> map) {
        super(map);
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = a0.f3589a;
            int length = bArr.length;
            int i8 = length;
            for (int i9 = 0; i9 < 0 + length; i9++) {
                i8 = (i8 * 31) + bArr[i9];
            }
            if (i8 == 0) {
                return 1;
            }
            return i8;
        } else if (!(obj instanceof a0.c)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        if (!this.f3721f) {
            throw new UnsupportedOperationException();
        }
    }

    public final l0<K, V> c() {
        return isEmpty() ? new l0<>() : new l0<>(this);
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r6 = (java.util.Map) r6
            r0 = 1
            if (r5 != r6) goto L_0x000c
        L_0x000a:
            r5 = r0
            goto L_0x005b
        L_0x000c:
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L_0x0018
        L_0x0016:
            r5 = r1
            goto L_0x005b
        L_0x0018:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0020:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x000a
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r6.get(r2)
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L_0x0054
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L_0x0054
            byte[] r3 = (byte[]) r3
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r3, r2)
            goto L_0x0058
        L_0x0054:
            boolean r2 = r3.equals(r2)
        L_0x0058:
            if (r2 != 0) goto L_0x0020
            goto L_0x0016
        L_0x005b:
            if (r5 == 0) goto L_0x005e
            r1 = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i8 = 0;
        for (Map.Entry entry : entrySet()) {
            i8 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i8;
    }

    public final V put(K k8, V v8) {
        b();
        Charset charset = a0.f3589a;
        k8.getClass();
        v8.getClass();
        return super.put(k8, v8);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (Object next : map.keySet()) {
            Charset charset = a0.f3589a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
