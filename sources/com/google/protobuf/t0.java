package com.google.protobuf;

import java.util.List;
import java.util.Map;

public final class t0 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i8, String str, Object obj) {
        String str2;
        String str3;
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
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                str2 = k1.a(i.l((String) obj));
            } else if (obj instanceof i) {
                sb.append(": \"");
                str2 = k1.a((i) obj);
            } else {
                if (obj instanceof y) {
                    sb.append(" {");
                    c((y) obj, sb, i8 + 2);
                    sb.append("\n");
                    while (i9 < i8) {
                        sb.append(' ');
                        i9++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i11 = i8 + 2;
                    b(sb, i11, "key", entry.getKey());
                    b(sb, i11, "value", entry.getValue());
                    sb.append("\n");
                    while (i9 < i8) {
                        sb.append(' ');
                        i9++;
                    }
                } else {
                    sb.append(": ");
                    str3 = obj.toString();
                    sb.append(str3);
                    return;
                }
                str3 = "}";
                sb.append(str3);
                return;
            }
            sb.append(str2);
            sb.append('\"');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ab, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bd, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d3, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L_0x0203;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.google.protobuf.r0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x0222
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00be
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00be
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00be
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00be
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00be
            java.lang.String r3 = a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.protobuf.y.invokeOrDie(r9, r13, r4)
            goto L_0x021d
        L_0x00be:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0121
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0121
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0121
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0121
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0121
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0121
            java.lang.String r4 = a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.protobuf.y.invokeOrDie(r3, r13, r6)
            b(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0121:
            java.lang.String r3 = "set"
            java.lang.String r3 = r3.concat(r6)
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L_0x0131
            goto L_0x004d
        L_0x0131:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x0157
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            int r4 = r6.length()
            int r4 = r4 + -5
            java.lang.String r4 = r6.substring(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0157
            goto L_0x004d
        L_0x0157:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.substring(r5, r10)
            java.lang.String r4 = r4.toLowerCase()
            r3.append(r4)
            java.lang.String r4 = r6.substring(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r7.concat(r6)
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            java.lang.String r6 = r8.concat(r6)
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.protobuf.y.invokeOrDie(r4, r13, r8)
            if (r6 != 0) goto L_0x020b
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01a0
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L_0x0206
        L_0x01a0:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01ae
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x0205
            goto L_0x0203
        L_0x01ae:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x01c0
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            if (r6 != 0) goto L_0x0205
            goto L_0x0203
        L_0x01c0:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x01d6
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            long r8 = java.lang.Double.doubleToRawLongBits(r8)
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0205
            goto L_0x0203
        L_0x01d6:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x01dd
            java.lang.String r6 = ""
            goto L_0x01e3
        L_0x01dd:
            boolean r6 = r4 instanceof com.google.protobuf.i
            if (r6 == 0) goto L_0x01e8
            com.google.protobuf.i$f r6 = com.google.protobuf.i.f3648g
        L_0x01e3:
            boolean r6 = r4.equals(r6)
            goto L_0x0206
        L_0x01e8:
            boolean r6 = r4 instanceof com.google.protobuf.r0
            if (r6 == 0) goto L_0x01f6
            r6 = r4
            com.google.protobuf.r0 r6 = (com.google.protobuf.r0) r6
            com.google.protobuf.r0 r6 = r6.getDefaultInstanceForType()
            if (r4 != r6) goto L_0x0205
            goto L_0x0203
        L_0x01f6:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x0205
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x0205
        L_0x0203:
            r6 = r10
            goto L_0x0206
        L_0x0205:
            r6 = r5
        L_0x0206:
            if (r6 != 0) goto L_0x0209
            goto L_0x0217
        L_0x0209:
            r10 = r5
            goto L_0x0217
        L_0x020b:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.protobuf.y.invokeOrDie(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0217:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = a(r3)
        L_0x021d:
            b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x0222:
            boolean r0 = r13 instanceof com.google.protobuf.y.c
            if (r0 == 0) goto L_0x025e
            r0 = r13
            com.google.protobuf.y$c r0 = (com.google.protobuf.y.c) r0
            com.google.protobuf.u<com.google.protobuf.y$d> r0 = r0.f3810f
            java.util.Iterator r0 = r0.m()
        L_0x022f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x025e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object r3 = r1.getKey()
            com.google.protobuf.y$d r3 = (com.google.protobuf.y.d) r3
            int r3 = r3.f3812g
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.getValue()
            b(r14, r15, r2, r1)
            goto L_0x022f
        L_0x025e:
            com.google.protobuf.y r13 = (com.google.protobuf.y) r13
            com.google.protobuf.n1 r13 = r13.unknownFields
            if (r13 == 0) goto L_0x027b
        L_0x0264:
            int r0 = r13.f3727a
            if (r5 >= r0) goto L_0x027b
            int[] r0 = r13.f3728b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f3729c
            r1 = r1[r5]
            b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x0264
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.c(com.google.protobuf.r0, java.lang.StringBuilder, int):void");
    }
}
