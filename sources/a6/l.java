package a6;

import s.g;

public final class l extends a {

    /* renamed from: b  reason: collision with root package name */
    public String f188b;

    /* renamed from: c  reason: collision with root package name */
    public int f189c;

    public l(a aVar, String str) {
        super(10);
        this.f188b = str;
        this.f189c = l(aVar, str);
    }

    public static int l(a aVar, String str) {
        String str2 = str;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                if (str2.equals("!")) {
                    c9 = 0;
                    break;
                }
                break;
            case EXERCISE_TYPE_HIKING_VALUE:
                if (str2.equals("%")) {
                    c9 = 1;
                    break;
                }
                break;
            case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                if (str2.equals("&")) {
                    c9 = 2;
                    break;
                }
                break;
            case EXERCISE_TYPE_JUMP_ROPE_VALUE:
                if (str2.equals("(")) {
                    c9 = 3;
                    break;
                }
                break;
            case EXERCISE_TYPE_JUMPING_JACK_VALUE:
                if (str2.equals(")")) {
                    c9 = 4;
                    break;
                }
                break;
            case EXERCISE_TYPE_LAT_PULL_DOWN_VALUE:
                if (str2.equals("*")) {
                    c9 = 5;
                    break;
                }
                break;
            case EXERCISE_TYPE_LUNGE_VALUE:
                if (str2.equals("+")) {
                    c9 = 6;
                    break;
                }
                break;
            case EXERCISE_TYPE_MARTIAL_ARTS_VALUE:
                if (str2.equals(",")) {
                    c9 = 7;
                    break;
                }
                break;
            case EXERCISE_TYPE_MEDITATION_VALUE:
                if (str2.equals("-")) {
                    c9 = 8;
                    break;
                }
                break;
            case EXERCISE_TYPE_PARA_GLIDING_VALUE:
                if (str2.equals("/")) {
                    c9 = 9;
                    break;
                }
                break;
            case EXERCISE_TYPE_SAILING_VALUE:
                if (str2.equals(":")) {
                    c9 = 10;
                    break;
                }
                break;
            case EXERCISE_TYPE_SCUBA_DIVING_VALUE:
                if (str2.equals(";")) {
                    c9 = 11;
                    break;
                }
                break;
            case EXERCISE_TYPE_SKATING_VALUE:
                if (str2.equals("<")) {
                    c9 = 12;
                    break;
                }
                break;
            case EXERCISE_TYPE_SKIING_VALUE:
                if (str2.equals("=")) {
                    c9 = 13;
                    break;
                }
                break;
            case EXERCISE_TYPE_SNOWBOARDING_VALUE:
                if (str2.equals(">")) {
                    c9 = 14;
                    break;
                }
                break;
            case EXERCISE_TYPE_SNOWSHOEING_VALUE:
                if (str2.equals("?")) {
                    c9 = 15;
                    break;
                }
                break;
            case 124:
                if (str2.equals("|")) {
                    c9 = 16;
                    break;
                }
                break;
            case 126:
                if (str2.equals("~")) {
                    c9 = 17;
                    break;
                }
                break;
            case 1084:
                if (str2.equals("!=")) {
                    c9 = 18;
                    break;
                }
                break;
            case 1216:
                if (str2.equals("&&")) {
                    c9 = 19;
                    break;
                }
                break;
            case 1921:
                if (str2.equals("<=")) {
                    c9 = 20;
                    break;
                }
                break;
            case 1951:
                if (str2.equals("=<")) {
                    c9 = 21;
                    break;
                }
                break;
            case 1952:
                if (str2.equals("==")) {
                    c9 = 22;
                    break;
                }
                break;
            case 1953:
                if (str2.equals("=>")) {
                    c9 = 23;
                    break;
                }
                break;
            case 1983:
                if (str2.equals(">=")) {
                    c9 = 24;
                    break;
                }
                break;
            case 3968:
                if (str2.equals("||")) {
                    c9 = 25;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 9;
            case 1:
                return 8;
            case 2:
                return 13;
            case 3:
                return 21;
            case 4:
                return 22;
            case 5:
                return 6;
            case 6:
                return n(aVar) ? 2 : 4;
            case 7:
                return 26;
            case 8:
                return n(aVar) ? 3 : 5;
            case 9:
                return 7;
            case 10:
                return 24;
            case 11:
                return 25;
            case 12:
                return 17;
            case 13:
                return 27;
            case 14:
                return 18;
            case 15:
                return 23;
            case 16:
                return 14;
            case 17:
                return 12;
            case 18:
                return 16;
            case 19:
                return 10;
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
            case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                return 19;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                return 15;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                return 20;
            case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                return 11;
            default:
                return 1;
        }
    }

    public static int m(int i8) {
        if (i8 != 0) {
            switch (i8 - 1) {
                case 1:
                case 2:
                case 8:
                    return 0;
                case 3:
                case 4:
                    return -2;
                case 5:
                case 6:
                case 7:
                    return -1;
                case 9:
                case 10:
                    return -5;
                case 14:
                case 15:
                    return -4;
                case 16:
                case 17:
                case 18:
                case 19:
                    return -3;
                case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                    return -8;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                    return -6;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                    return -7;
                default:
                    return -9;
            }
        } else {
            throw null;
        }
    }

    public static boolean n(a aVar) {
        if (aVar == null) {
            return true;
        }
        if (!(aVar instanceof l)) {
            return false;
        }
        switch (g.b(((l) aVar).f189c)) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
            case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[LOOP:0: B:8:0x0018->B:28:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.util.Stack<a6.a> r8, java.util.List<a6.a> r9) {
        /*
            r7 = this;
            int r0 = r7.f189c
            int r0 = s.g.b(r0)
            r1 = 20
            if (r0 == r1) goto L_0x00fc
            r1 = 21
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x00bf
            r4 = 23
            if (r0 == r4) goto L_0x008e
            r4 = 25
            if (r0 == r4) goto L_0x0067
        L_0x0018:
            boolean r0 = r8.empty()
            if (r0 != 0) goto L_0x00fc
            java.lang.Object r0 = r8.peek()
            a6.a r0 = (a6.a) r0
            int r1 = r7.f189c
            boolean r4 = r0 instanceof a6.l
            if (r4 == 0) goto L_0x005a
            a6.l r0 = (a6.l) r0
            int r0 = r0.f189c
            int r4 = s.g.b(r1)
            r5 = 2
            if (r4 == r3) goto L_0x0040
            if (r4 == r5) goto L_0x0040
            r6 = 8
            if (r4 == r6) goto L_0x0040
            switch(r4) {
                case 22: goto L_0x0040;
                case 23: goto L_0x0040;
                case 24: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r4 = r5
        L_0x0041:
            if (r4 != r5) goto L_0x004e
            int r0 = m(r0)
            int r1 = m(r1)
            if (r0 <= r1) goto L_0x005a
            goto L_0x0058
        L_0x004e:
            int r0 = m(r0)
            int r1 = m(r1)
            if (r0 < r1) goto L_0x005a
        L_0x0058:
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r8.pop()
            a6.a r0 = (a6.a) r0
            r9.add(r0)
            goto L_0x0018
        L_0x0067:
            boolean r7 = r8.empty()
            if (r7 != 0) goto L_0x00ff
            java.lang.Object r7 = r8.peek()
            a6.a r7 = (a6.a) r7
            boolean r0 = r7 instanceof a6.l
            if (r0 == 0) goto L_0x007f
            a6.l r7 = (a6.l) r7
            int r7 = r7.f189c
            if (r7 != r1) goto L_0x007f
            r7 = r3
            goto L_0x0080
        L_0x007f:
            r7 = r2
        L_0x0080:
            if (r7 == 0) goto L_0x0084
            goto L_0x00ff
        L_0x0084:
            java.lang.Object r7 = r8.pop()
            a6.a r7 = (a6.a) r7
            r9.add(r7)
            goto L_0x0067
        L_0x008e:
            boolean r7 = r8.empty()
            if (r7 != 0) goto L_0x00ff
            java.lang.Object r7 = r8.peek()
            a6.a r7 = (a6.a) r7
            boolean r0 = r7 instanceof a6.l
            if (r0 == 0) goto L_0x00a6
            a6.l r7 = (a6.l) r7
            int r7 = r7.f189c
            if (r7 != r4) goto L_0x00a6
            r7 = r3
            goto L_0x00a7
        L_0x00a6:
            r7 = r2
        L_0x00a7:
            if (r7 == 0) goto L_0x00b5
            r8.pop()
            a6.l r7 = new a6.l
            r9 = 0
            java.lang.String r0 = ";"
            r7.<init>(r9, r0)
            goto L_0x00fc
        L_0x00b5:
            java.lang.Object r7 = r8.pop()
            a6.a r7 = (a6.a) r7
            r9.add(r7)
            goto L_0x008e
        L_0x00bf:
            boolean r7 = r8.empty()
            if (r7 != 0) goto L_0x00e0
            java.lang.Object r7 = r8.pop()
            a6.a r7 = (a6.a) r7
            boolean r0 = r7 instanceof a6.l
            if (r0 == 0) goto L_0x00d8
            r0 = r7
            a6.l r0 = (a6.l) r0
            int r0 = r0.f189c
            if (r0 != r1) goto L_0x00d8
            r0 = r3
            goto L_0x00d9
        L_0x00d8:
            r0 = r2
        L_0x00d9:
            if (r0 == 0) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            r9.add(r7)
            goto L_0x00bf
        L_0x00e0:
            boolean r7 = r8.empty()
            if (r7 != 0) goto L_0x00ff
            java.lang.Object r7 = r8.peek()
            a6.a r7 = (a6.a) r7
            int r7 = r7.f171a
            r0 = 11
            if (r7 != r0) goto L_0x00ff
            java.lang.Object r7 = r8.pop()
            a6.a r7 = (a6.a) r7
            r9.add(r7)
            goto L_0x00ff
        L_0x00fc:
            r8.push(r7)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.l.c(java.util.Stack, java.util.List):void");
    }
}
