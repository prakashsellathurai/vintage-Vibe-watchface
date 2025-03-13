package androidx.wear.protolayout.protobuf;

import a1.a;
import androidx.wear.protolayout.protobuf.g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2167a;

    static {
        char[] cArr = new char[80];
        f2167a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i8, StringBuilder sb) {
        while (i8 > 0) {
            int i9 = 80;
            if (i8 <= 80) {
                i9 = i8;
            }
            sb.append(f2167a, 0, i9);
            i8 -= i9;
        }
    }

    public static void b(StringBuilder sb, int i8, String str, Object obj) {
        String str2;
        if (obj instanceof List) {
            for (Object b9 : (List) obj) {
                b(sb, i8, str, b9);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b10 : ((Map) obj).entrySet()) {
                b(sb, i8, str, b10);
            }
        } else {
            sb.append(10);
            a(i8, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i9 = 1; i9 < str.length(); i9++) {
                    char charAt = str.charAt(i9);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                g.f fVar = g.f2096g;
                str2 = a.r(new g.f(((String) obj).getBytes(x.f2214a)));
            } else if (obj instanceof g) {
                sb.append(": \"");
                str2 = a.r((g) obj);
            } else {
                if (obj instanceof v) {
                    sb.append(" {");
                    c((v) obj, sb, i8 + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i10 = i8 + 2;
                    b(sb, i10, "key", entry.getKey());
                    b(sb, i10, "value", entry.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                a(i8, sb);
                sb.append("}");
                return;
            }
            sb.append(str2);
            sb.append('\"');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bc, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x01ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(androidx.wear.protolayout.protobuf.o0 r20, java.lang.StringBuilder r21, int r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r20.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            r10 = 3
            java.lang.String r11 = "get"
            java.lang.String r12 = "has"
            java.lang.String r13 = "set"
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r10) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r10 = r14.getName()
            boolean r10 = r10.startsWith(r13)
            if (r10 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r10 = r14.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isPublic(r10)
            if (r10 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r10 = r14.getParameterTypes()
            int r10 = r10.length
            if (r10 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r10 = r14.getName()
            boolean r10 = r10.startsWith(r12)
            if (r10 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r10 = r14.getName()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0208
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r10)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto L_0x00e5
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto L_0x00e5
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto L_0x00e5
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L_0x00e5
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r10 = java.util.List.class
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x00e5
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.wear.protolayout.protobuf.v.m(r14, r0, r9)
            goto L_0x0129
        L_0x00e5:
            java.lang.String r10 = "Map"
            boolean r14 = r9.endsWith(r10)
            if (r14 == 0) goto L_0x012e
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x012e
            java.lang.Object r10 = r7.getValue()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto L_0x012e
            java.lang.Class r14 = r10.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x012e
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r10.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x012e
            int r14 = r10.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x012e
            int r7 = r9.length()
            r14 = 3
            int r7 = r7 - r14
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = androidx.wear.protolayout.protobuf.v.m(r10, r0, r9)
        L_0x0129:
            b(r1, r2, r7, r9)
            goto L_0x0205
        L_0x012e:
            java.lang.String r10 = r13.concat(r9)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L_0x013a
            goto L_0x0205
        L_0x013a:
            java.lang.String r10 = "Bytes"
            boolean r10 = r9.endsWith(r10)
            if (r10 == 0) goto L_0x0160
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            int r14 = r9.length()
            int r14 = r14 + -5
            java.lang.String r14 = r9.substring(r8, r14)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            boolean r10 = r5.containsKey(r10)
            if (r10 == 0) goto L_0x0160
            goto L_0x0205
        L_0x0160:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r10 = r12.concat(r9)
            java.lang.Object r10 = r4.get(r10)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r7 == 0) goto L_0x0205
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.wear.protolayout.protobuf.v.m(r7, r0, r14)
            if (r10 != 0) goto L_0x01f4
            boolean r10 = r7 instanceof java.lang.Boolean
            r14 = 1
            if (r10 == 0) goto L_0x0189
            r10 = r7
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r10 = r10 ^ r14
            goto L_0x01ef
        L_0x0189:
            boolean r10 = r7 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0197
            r10 = r7
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 != 0) goto L_0x01ee
            goto L_0x01ec
        L_0x0197:
            boolean r10 = r7 instanceof java.lang.Float
            if (r10 == 0) goto L_0x01a9
            r10 = r7
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            if (r10 != 0) goto L_0x01ee
            goto L_0x01ec
        L_0x01a9:
            boolean r10 = r7 instanceof java.lang.Double
            if (r10 == 0) goto L_0x01bf
            r10 = r7
            java.lang.Double r10 = (java.lang.Double) r10
            double r16 = r10.doubleValue()
            long r16 = java.lang.Double.doubleToRawLongBits(r16)
            r18 = 0
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 != 0) goto L_0x01ee
            goto L_0x01ec
        L_0x01bf:
            boolean r10 = r7 instanceof java.lang.String
            if (r10 == 0) goto L_0x01c6
            java.lang.String r10 = ""
            goto L_0x01cc
        L_0x01c6:
            boolean r10 = r7 instanceof androidx.wear.protolayout.protobuf.g
            if (r10 == 0) goto L_0x01d1
            androidx.wear.protolayout.protobuf.g$f r10 = androidx.wear.protolayout.protobuf.g.f2096g
        L_0x01cc:
            boolean r10 = r7.equals(r10)
            goto L_0x01ef
        L_0x01d1:
            boolean r10 = r7 instanceof androidx.wear.protolayout.protobuf.o0
            if (r10 == 0) goto L_0x01df
            r10 = r7
            androidx.wear.protolayout.protobuf.o0 r10 = (androidx.wear.protolayout.protobuf.o0) r10
            androidx.wear.protolayout.protobuf.v r10 = r10.b()
            if (r7 != r10) goto L_0x01ee
            goto L_0x01ec
        L_0x01df:
            boolean r10 = r7 instanceof java.lang.Enum
            if (r10 == 0) goto L_0x01ee
            r10 = r7
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
            if (r10 != 0) goto L_0x01ee
        L_0x01ec:
            r10 = r14
            goto L_0x01ef
        L_0x01ee:
            r10 = r8
        L_0x01ef:
            if (r10 != 0) goto L_0x01f2
            goto L_0x0200
        L_0x01f2:
            r14 = r8
            goto L_0x0200
        L_0x01f4:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r10 = androidx.wear.protolayout.protobuf.v.m(r10, r0, r14)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r14 = r10.booleanValue()
        L_0x0200:
            if (r14 == 0) goto L_0x0205
            b(r1, r2, r9, r7)
        L_0x0205:
            r10 = 3
            goto L_0x0094
        L_0x0208:
            boolean r3 = r0 instanceof androidx.wear.protolayout.protobuf.v.c
            if (r3 == 0) goto L_0x0234
            r3 = r0
            androidx.wear.protolayout.protobuf.v$c r3 = (androidx.wear.protolayout.protobuf.v.c) r3
            androidx.wear.protolayout.protobuf.r<androidx.wear.protolayout.protobuf.v$d> r3 = r3.extensions
            java.util.Iterator r3 = r3.l()
        L_0x0215:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0234
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            androidx.wear.protolayout.protobuf.v$d r5 = (androidx.wear.protolayout.protobuf.v.d) r5
            r5.getClass()
            java.lang.String r5 = "[0]"
            java.lang.Object r4 = r4.getValue()
            b(r1, r2, r5, r4)
            goto L_0x0215
        L_0x0234:
            androidx.wear.protolayout.protobuf.v r0 = (androidx.wear.protolayout.protobuf.v) r0
            androidx.wear.protolayout.protobuf.i1 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x0252
        L_0x023a:
            int r3 = r0.f2121a
            if (r8 >= r3) goto L_0x0252
            int[] r3 = r0.f2122b
            r3 = r3[r8]
            r4 = 3
            int r3 = r3 >>> r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r5 = r0.f2123c
            r5 = r5[r8]
            b(r1, r2, r3, r5)
            int r8 = r8 + 1
            goto L_0x023a
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.q0.c(androidx.wear.protolayout.protobuf.o0, java.lang.StringBuilder, int):void");
    }
}
