package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import k3.j;
import t.d;
import t.e;
import t.f;
import u.b;
import v.c;

public class ConstraintLayout extends ViewGroup {
    public static final /* synthetic */ int r = 0;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<View> f861a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<a> f862b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public final e f863c = new e();

    /* renamed from: d  reason: collision with root package name */
    public int f864d = 0;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f865f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public int f866g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public boolean f867h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f868i = 257;

    /* renamed from: j  reason: collision with root package name */
    public b f869j = null;

    /* renamed from: k  reason: collision with root package name */
    public v.b f870k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f871l = -1;

    /* renamed from: m  reason: collision with root package name */
    public HashMap<String, Integer> f872m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray<d> f873n = new SparseArray<>();

    /* renamed from: o  reason: collision with root package name */
    public final b f874o = new b(this);

    /* renamed from: p  reason: collision with root package name */
    public int f875p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f876q = 0;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public final int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public String U = null;
        public boolean V = true;
        public boolean W = true;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f877a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f878a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f879b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public int f880b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f881c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public int f882c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f883d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public int f884d0 = -1;
        public int e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int f885e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f886f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public int f887f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f888g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f889g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f890h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public float f891h0 = 0.5f;

        /* renamed from: i  reason: collision with root package name */
        public int f892i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f893i0;

        /* renamed from: j  reason: collision with root package name */
        public int f894j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f895j0;

        /* renamed from: k  reason: collision with root package name */
        public int f896k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public float f897k0;

        /* renamed from: l  reason: collision with root package name */
        public int f898l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public d f899l0 = new d();

        /* renamed from: m  reason: collision with root package name */
        public int f900m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f901n = 0;

        /* renamed from: o  reason: collision with root package name */
        public float f902o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public int f903p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f904q = -1;
        public int r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f905s = -1;

        /* renamed from: t  reason: collision with root package name */
        public final int f906t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f907u = -1;

        /* renamed from: v  reason: collision with root package name */
        public final int f908v = -1;
        public int w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f909x = -1;
        public int y = -1;

        /* renamed from: z  reason: collision with root package name */
        public float f910z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0010a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f911a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f911a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public a() {
            super(-2, -2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x013b, code lost:
            android.util.Log.e("ConstraintLayout", r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f877a = r0
                r9.f879b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f881c = r1
                r9.f883d = r0
                r9.e = r0
                r9.f886f = r0
                r9.f888g = r0
                r9.f890h = r0
                r9.f892i = r0
                r9.f894j = r0
                r9.f896k = r0
                r9.f898l = r0
                r9.f900m = r0
                r2 = 0
                r9.f901n = r2
                r3 = 0
                r9.f902o = r3
                r9.f903p = r0
                r9.f904q = r0
                r9.r = r0
                r9.f905s = r0
                r9.f906t = r0
                r9.f907u = r0
                r9.f908v = r0
                r9.w = r0
                r9.f909x = r0
                r9.y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r9.f910z = r4
                r9.A = r4
                r5 = 0
                r9.B = r5
                r6 = 1
                r9.C = r6
                r9.D = r1
                r9.E = r1
                r9.F = r2
                r9.G = r2
                r9.H = r2
                r9.I = r2
                r9.J = r2
                r9.K = r2
                r9.L = r2
                r9.M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.N = r1
                r9.O = r1
                r9.P = r0
                r9.Q = r0
                r9.R = r0
                r9.S = r2
                r9.T = r2
                r9.U = r5
                r9.V = r6
                r9.W = r6
                r9.X = r2
                r9.Y = r2
                r9.Z = r2
                r9.f878a0 = r2
                r9.f880b0 = r0
                r9.f882c0 = r0
                r9.f884d0 = r0
                r9.f885e0 = r0
                r9.f887f0 = r0
                r9.f889g0 = r0
                r9.f891h0 = r4
                t.d r1 = new t.d
                r1.<init>()
                r9.f899l0 = r1
                int[] r1 = k3.j.f5155j
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = r2
            L_0x0098:
                if (r1 >= r11) goto L_0x03be
                int r4 = r10.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.a.C0010a.f911a
                int r5 = r5.get(r4)
                r7 = 2
                r8 = -2
                switch(r5) {
                    case 1: goto L_0x02e0;
                    case 2: goto L_0x02ce;
                    case 3: goto L_0x02c4;
                    case 4: goto L_0x02ae;
                    case 5: goto L_0x02a4;
                    case 6: goto L_0x029a;
                    case 7: goto L_0x0290;
                    case 8: goto L_0x027e;
                    case 9: goto L_0x026c;
                    case 10: goto L_0x025a;
                    case 11: goto L_0x0248;
                    case 12: goto L_0x0236;
                    case 13: goto L_0x0224;
                    case 14: goto L_0x0212;
                    case 15: goto L_0x0200;
                    case 16: goto L_0x01ee;
                    case 17: goto L_0x01dc;
                    case 18: goto L_0x01ca;
                    case 19: goto L_0x01b8;
                    case 20: goto L_0x01a6;
                    case 21: goto L_0x019c;
                    case 22: goto L_0x0192;
                    case 23: goto L_0x0188;
                    case 24: goto L_0x017e;
                    case 25: goto L_0x0174;
                    case 26: goto L_0x016a;
                    case 27: goto L_0x0160;
                    case 28: goto L_0x0156;
                    case 29: goto L_0x014c;
                    case 30: goto L_0x0142;
                    case 31: goto L_0x0131;
                    case 32: goto L_0x0126;
                    case 33: goto L_0x0110;
                    case 34: goto L_0x00fa;
                    case 35: goto L_0x00ea;
                    case 36: goto L_0x00d4;
                    case 37: goto L_0x00be;
                    case 38: goto L_0x00ae;
                    default: goto L_0x00a9;
                }
            L_0x00a9:
                switch(r5) {
                    case 44: goto L_0x032a;
                    case 45: goto L_0x0320;
                    case 46: goto L_0x0316;
                    case 47: goto L_0x030e;
                    case 48: goto L_0x0306;
                    case 49: goto L_0x02fc;
                    case 50: goto L_0x02f2;
                    case 51: goto L_0x02ea;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                goto L_0x03ba
            L_0x00ae:
                float r5 = r9.O
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.O = r4
                r9.I = r7
                goto L_0x03ba
            L_0x00be:
                int r5 = r9.M     // Catch:{ Exception -> 0x00c8 }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00c8 }
                r9.M = r5     // Catch:{ Exception -> 0x00c8 }
                goto L_0x03ba
            L_0x00c8:
                int r5 = r9.M
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.M = r8
                goto L_0x03ba
            L_0x00d4:
                int r5 = r9.K     // Catch:{ Exception -> 0x00de }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x00de }
                r9.K = r5     // Catch:{ Exception -> 0x00de }
                goto L_0x03ba
            L_0x00de:
                int r5 = r9.K
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.K = r8
                goto L_0x03ba
            L_0x00ea:
                float r5 = r9.N
                float r4 = r10.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r9.N = r4
                r9.H = r7
                goto L_0x03ba
            L_0x00fa:
                int r5 = r9.L     // Catch:{ Exception -> 0x0104 }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x0104 }
                r9.L = r5     // Catch:{ Exception -> 0x0104 }
                goto L_0x03ba
            L_0x0104:
                int r5 = r9.L
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.L = r8
                goto L_0x03ba
            L_0x0110:
                int r5 = r9.J     // Catch:{ Exception -> 0x011a }
                int r5 = r10.getDimensionPixelSize(r4, r5)     // Catch:{ Exception -> 0x011a }
                r9.J = r5     // Catch:{ Exception -> 0x011a }
                goto L_0x03ba
            L_0x011a:
                int r5 = r9.J
                int r4 = r10.getInt(r4, r5)
                if (r4 != r8) goto L_0x03ba
                r9.J = r8
                goto L_0x03ba
            L_0x0126:
                int r4 = r10.getInt(r4, r2)
                r9.I = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x013b
            L_0x0131:
                int r4 = r10.getInt(r4, r2)
                r9.H = r4
                if (r4 != r6) goto L_0x03ba
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x013b:
                java.lang.String r5 = "ConstraintLayout"
                android.util.Log.e(r5, r4)
                goto L_0x03ba
            L_0x0142:
                float r5 = r9.A
                float r4 = r10.getFloat(r4, r5)
                r9.A = r4
                goto L_0x03ba
            L_0x014c:
                float r5 = r9.f910z
                float r4 = r10.getFloat(r4, r5)
                r9.f910z = r4
                goto L_0x03ba
            L_0x0156:
                boolean r5 = r9.T
                boolean r4 = r10.getBoolean(r4, r5)
                r9.T = r4
                goto L_0x03ba
            L_0x0160:
                boolean r5 = r9.S
                boolean r4 = r10.getBoolean(r4, r5)
                r9.S = r4
                goto L_0x03ba
            L_0x016a:
                int r5 = r9.y
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.y = r4
                goto L_0x03ba
            L_0x0174:
                int r5 = r9.f909x
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f909x = r4
                goto L_0x03ba
            L_0x017e:
                int r5 = r9.w
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.w = r4
                goto L_0x03ba
            L_0x0188:
                int r5 = r9.f908v
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f908v = r4
                goto L_0x03ba
            L_0x0192:
                int r5 = r9.f907u
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f907u = r4
                goto L_0x03ba
            L_0x019c:
                int r5 = r9.f906t
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f906t = r4
                goto L_0x03ba
            L_0x01a6:
                int r5 = r9.f905s
                int r5 = r10.getResourceId(r4, r5)
                r9.f905s = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f905s = r4
                goto L_0x03ba
            L_0x01b8:
                int r5 = r9.r
                int r5 = r10.getResourceId(r4, r5)
                r9.r = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.r = r4
                goto L_0x03ba
            L_0x01ca:
                int r5 = r9.f904q
                int r5 = r10.getResourceId(r4, r5)
                r9.f904q = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f904q = r4
                goto L_0x03ba
            L_0x01dc:
                int r5 = r9.f903p
                int r5 = r10.getResourceId(r4, r5)
                r9.f903p = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f903p = r4
                goto L_0x03ba
            L_0x01ee:
                int r5 = r9.f898l
                int r5 = r10.getResourceId(r4, r5)
                r9.f898l = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f898l = r4
                goto L_0x03ba
            L_0x0200:
                int r5 = r9.f896k
                int r5 = r10.getResourceId(r4, r5)
                r9.f896k = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f896k = r4
                goto L_0x03ba
            L_0x0212:
                int r5 = r9.f894j
                int r5 = r10.getResourceId(r4, r5)
                r9.f894j = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f894j = r4
                goto L_0x03ba
            L_0x0224:
                int r5 = r9.f892i
                int r5 = r10.getResourceId(r4, r5)
                r9.f892i = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f892i = r4
                goto L_0x03ba
            L_0x0236:
                int r5 = r9.f890h
                int r5 = r10.getResourceId(r4, r5)
                r9.f890h = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f890h = r4
                goto L_0x03ba
            L_0x0248:
                int r5 = r9.f888g
                int r5 = r10.getResourceId(r4, r5)
                r9.f888g = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f888g = r4
                goto L_0x03ba
            L_0x025a:
                int r5 = r9.f886f
                int r5 = r10.getResourceId(r4, r5)
                r9.f886f = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f886f = r4
                goto L_0x03ba
            L_0x026c:
                int r5 = r9.e
                int r5 = r10.getResourceId(r4, r5)
                r9.e = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.e = r4
                goto L_0x03ba
            L_0x027e:
                int r5 = r9.f883d
                int r5 = r10.getResourceId(r4, r5)
                r9.f883d = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f883d = r4
                goto L_0x03ba
            L_0x0290:
                float r5 = r9.f881c
                float r4 = r10.getFloat(r4, r5)
                r9.f881c = r4
                goto L_0x03ba
            L_0x029a:
                int r5 = r9.f879b
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f879b = r4
                goto L_0x03ba
            L_0x02a4:
                int r5 = r9.f877a
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.f877a = r4
                goto L_0x03ba
            L_0x02ae:
                float r5 = r9.f902o
                float r4 = r10.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r9.f902o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x03ba
                float r4 = r5 - r4
                float r4 = r4 % r5
                r9.f902o = r4
                goto L_0x03ba
            L_0x02c4:
                int r5 = r9.f901n
                int r4 = r10.getDimensionPixelSize(r4, r5)
                r9.f901n = r4
                goto L_0x03ba
            L_0x02ce:
                int r5 = r9.f900m
                int r5 = r10.getResourceId(r4, r5)
                r9.f900m = r5
                if (r5 != r0) goto L_0x03ba
                int r4 = r10.getInt(r4, r0)
                r9.f900m = r4
                goto L_0x03ba
            L_0x02e0:
                int r5 = r9.R
                int r4 = r10.getInt(r4, r5)
                r9.R = r4
                goto L_0x03ba
            L_0x02ea:
                java.lang.String r4 = r10.getString(r4)
                r9.U = r4
                goto L_0x03ba
            L_0x02f2:
                int r5 = r9.Q
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.Q = r4
                goto L_0x03ba
            L_0x02fc:
                int r5 = r9.P
                int r4 = r10.getDimensionPixelOffset(r4, r5)
                r9.P = r4
                goto L_0x03ba
            L_0x0306:
                int r4 = r10.getInt(r4, r2)
                r9.G = r4
                goto L_0x03ba
            L_0x030e:
                int r4 = r10.getInt(r4, r2)
                r9.F = r4
                goto L_0x03ba
            L_0x0316:
                float r5 = r9.E
                float r4 = r10.getFloat(r4, r5)
                r9.E = r4
                goto L_0x03ba
            L_0x0320:
                float r5 = r9.D
                float r4 = r10.getFloat(r4, r5)
                r9.D = r4
                goto L_0x03ba
            L_0x032a:
                java.lang.String r4 = r10.getString(r4)
                r9.B = r4
                r9.C = r0
                if (r4 == 0) goto L_0x03ba
                int r4 = r4.length()
                java.lang.String r5 = r9.B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L_0x0364
                int r7 = r4 + -1
                if (r5 >= r7) goto L_0x0364
                java.lang.String r7 = r9.B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x0357
                r9.C = r2
                goto L_0x0361
            L_0x0357:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L_0x0361
                r9.C = r6
            L_0x0361:
                int r5 = r5 + 1
                goto L_0x0365
            L_0x0364:
                r5 = r2
            L_0x0365:
                java.lang.String r7 = r9.B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L_0x03ab
                int r4 = r4 + -1
                if (r7 >= r4) goto L_0x03ab
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r9.B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x03ba
                int r7 = r5.length()
                if (r7 <= 0) goto L_0x03ba
                float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x03ba
                int r7 = r9.C     // Catch:{ NumberFormatException -> 0x03ba }
                if (r7 != r6) goto L_0x03a6
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x03a6:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch:{ NumberFormatException -> 0x03ba }
                goto L_0x03ba
            L_0x03ab:
                java.lang.String r4 = r9.B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x03ba
                java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x03ba }
            L_0x03ba:
                int r1 = r1 + 1
                goto L_0x0098
            L_0x03be:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i8 = this.width;
            if (i8 == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i9 = this.height;
            if (i9 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.V = false;
                if (i8 == 0 && this.H == 1) {
                    this.width = -2;
                    this.S = true;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.W = false;
                if (i9 == 0 && this.I == 1) {
                    this.height = -2;
                    this.T = true;
                }
            }
            if (this.f881c != -1.0f || this.f877a != -1 || this.f879b != -1) {
                this.Y = true;
                this.V = true;
                this.W = true;
                if (!(this.f899l0 instanceof f)) {
                    this.f899l0 = new f();
                }
                ((f) this.f899l0).F(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
            if (r1 > 0) goto L_0x00cc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00eb  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.f884d0 = r4
                r9.f885e0 = r4
                r9.f880b0 = r4
                r9.f882c0 = r4
                int r5 = r9.f906t
                r9.f887f0 = r5
                int r5 = r9.f908v
                r9.f889g0 = r5
                float r5 = r9.f910z
                r9.f891h0 = r5
                int r6 = r9.f877a
                r9.f893i0 = r6
                int r7 = r9.f879b
                r9.f895j0 = r7
                float r8 = r9.f881c
                r9.f897k0 = r8
                if (r10 == 0) goto L_0x008c
                int r10 = r9.f903p
                if (r10 == r4) goto L_0x003d
                r9.f884d0 = r10
            L_0x003b:
                r2 = r3
                goto L_0x0044
            L_0x003d:
                int r10 = r9.f904q
                if (r10 == r4) goto L_0x0044
                r9.f885e0 = r10
                goto L_0x003b
            L_0x0044:
                int r10 = r9.r
                if (r10 == r4) goto L_0x004b
                r9.f882c0 = r10
                r2 = r3
            L_0x004b:
                int r10 = r9.f905s
                if (r10 == r4) goto L_0x0052
                r9.f880b0 = r10
                r2 = r3
            L_0x0052:
                int r10 = r9.f909x
                if (r10 == r4) goto L_0x0058
                r9.f889g0 = r10
            L_0x0058:
                int r10 = r9.y
                if (r10 == r4) goto L_0x005e
                r9.f887f0 = r10
            L_0x005e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0066
                float r2 = r10 - r5
                r9.f891h0 = r2
            L_0x0066:
                boolean r2 = r9.Y
                if (r2 == 0) goto L_0x00b0
                int r2 = r9.R
                if (r2 != r3) goto L_0x00b0
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007c
                float r10 = r10 - r8
                r9.f897k0 = r10
                r9.f893i0 = r4
                r9.f895j0 = r4
                goto L_0x00b0
            L_0x007c:
                if (r6 == r4) goto L_0x0085
                r9.f895j0 = r6
                r9.f893i0 = r4
            L_0x0082:
                r9.f897k0 = r2
                goto L_0x00b0
            L_0x0085:
                if (r7 == r4) goto L_0x00b0
                r9.f893i0 = r7
                r9.f895j0 = r4
                goto L_0x0082
            L_0x008c:
                int r10 = r9.f903p
                if (r10 == r4) goto L_0x0092
                r9.f882c0 = r10
            L_0x0092:
                int r10 = r9.f904q
                if (r10 == r4) goto L_0x0098
                r9.f880b0 = r10
            L_0x0098:
                int r10 = r9.r
                if (r10 == r4) goto L_0x009e
                r9.f884d0 = r10
            L_0x009e:
                int r10 = r9.f905s
                if (r10 == r4) goto L_0x00a4
                r9.f885e0 = r10
            L_0x00a4:
                int r10 = r9.f909x
                if (r10 == r4) goto L_0x00aa
                r9.f887f0 = r10
            L_0x00aa:
                int r10 = r9.y
                if (r10 == r4) goto L_0x00b0
                r9.f889g0 = r10
            L_0x00b0:
                int r10 = r9.r
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f905s
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f904q
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f903p
                if (r10 != r4) goto L_0x00f8
                int r10 = r9.f886f
                if (r10 == r4) goto L_0x00cf
                r9.f884d0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
            L_0x00cc:
                r9.rightMargin = r1
                goto L_0x00dc
            L_0x00cf:
                int r10 = r9.f888g
                if (r10 == r4) goto L_0x00dc
                r9.f885e0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00dc
                if (r1 <= 0) goto L_0x00dc
                goto L_0x00cc
            L_0x00dc:
                int r10 = r9.f883d
                if (r10 == r4) goto L_0x00eb
                r9.f880b0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
            L_0x00e8:
                r9.leftMargin = r0
                goto L_0x00f8
            L_0x00eb:
                int r10 = r9.e
                if (r10 == r4) goto L_0x00f8
                r9.f882c0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00f8
                if (r0 <= 0) goto L_0x00f8
                goto L_0x00e8
            L_0x00f8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public class b implements b.C0126b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f912a;

        /* renamed from: b  reason: collision with root package name */
        public int f913b;

        /* renamed from: c  reason: collision with root package name */
        public int f914c;

        /* renamed from: d  reason: collision with root package name */
        public int f915d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f916f;

        /* renamed from: g  reason: collision with root package name */
        public int f917g;

        public b(ConstraintLayout constraintLayout) {
            this.f912a = constraintLayout;
        }

        public static boolean a(int i8, int i9, int i10) {
            if (i8 == i9) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i8);
            View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i10 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:113:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x019f  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01e0  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01e2  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e6  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0134  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t.d r19, u.b.a r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f7325d0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.A
                if (r3 != 0) goto L_0x001b
                r2.e = r5
                r2.f7556f = r5
                r2.f7557g = r5
                return
            L_0x001b:
                t.d r3 = r1.Q
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                int r3 = r2.f7552a
                int r4 = r2.f7553b
                int r6 = r2.f7554c
                int r7 = r2.f7555d
                int r8 = r0.f913b
                int r9 = r0.f914c
                int r8 = r8 + r9
                int r9 = r0.f915d
                java.lang.Object r10 = r1.f7323c0
                android.view.View r10 = (android.view.View) r10
                int r11 = s.g.b(r3)
                r12 = 3
                r15 = 1
                r14 = 2
                t.c r13 = r1.G
                t.c r5 = r1.E
                if (r11 == 0) goto L_0x00af
                if (r11 == r15) goto L_0x00a5
                if (r11 == r14) goto L_0x0061
                if (r11 == r12) goto L_0x0049
                r6 = 0
                goto L_0x00b5
            L_0x0049:
                int r6 = r0.f916f
                if (r5 == 0) goto L_0x0054
                int r11 = r5.f7306g
                r16 = 0
                int r11 = r11 + 0
                goto L_0x0055
            L_0x0054:
                r11 = 0
            L_0x0055:
                if (r13 == 0) goto L_0x005a
                int r12 = r13.f7306g
                int r11 = r11 + r12
            L_0x005a:
                int r9 = r9 + r11
                r11 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                goto L_0x00b5
            L_0x0061:
                int r6 = r0.f916f
                r11 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                int r9 = r1.f7341m
                if (r9 != r15) goto L_0x006e
                r9 = r15
                goto L_0x006f
            L_0x006e:
                r9 = 0
            L_0x006f:
                int r11 = r2.f7560j
                if (r11 == r15) goto L_0x0079
                if (r11 != r14) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b5
            L_0x0079:
                int r11 = r10.getMeasuredHeight()
                int r12 = r19.i()
                if (r11 != r12) goto L_0x0085
                r11 = r15
                goto L_0x0086
            L_0x0085:
                r11 = 0
            L_0x0086:
                int r12 = r2.f7560j
                if (r12 == r14) goto L_0x009d
                if (r9 == 0) goto L_0x009d
                if (r9 == 0) goto L_0x0090
                if (r11 != 0) goto L_0x009d
            L_0x0090:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.d
                if (r9 != 0) goto L_0x009d
                boolean r9 = r19.t()
                if (r9 == 0) goto L_0x009b
                goto L_0x009d
            L_0x009b:
                r9 = 0
                goto L_0x009e
            L_0x009d:
                r9 = r15
            L_0x009e:
                if (r9 == 0) goto L_0x0076
                int r6 = r19.k()
                goto L_0x00af
            L_0x00a5:
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f916f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00b5
            L_0x00af:
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b5:
                int r9 = s.g.b(r4)
                if (r9 == 0) goto L_0x0134
                if (r9 == r15) goto L_0x012a
                if (r9 == r14) goto L_0x00e0
                r7 = 3
                if (r9 == r7) goto L_0x00c5
                r5 = 0
                goto L_0x013a
            L_0x00c5:
                int r7 = r0.f917g
                if (r5 == 0) goto L_0x00d0
                t.c r5 = r1.F
                int r5 = r5.f7306g
                r9 = 0
                int r5 = r5 + r9
                goto L_0x00d1
            L_0x00d0:
                r5 = 0
            L_0x00d1:
                if (r13 == 0) goto L_0x00d8
                t.c r9 = r1.H
                int r9 = r9.f7306g
                int r5 = r5 + r9
            L_0x00d8:
                int r8 = r8 + r5
                r5 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r5)
                r5 = r7
                goto L_0x013a
            L_0x00e0:
                int r5 = r0.f917g
                r7 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r8, r7)
                int r7 = r1.f7342n
                if (r7 != r15) goto L_0x00ed
                r7 = r15
                goto L_0x00ee
            L_0x00ed:
                r7 = 0
            L_0x00ee:
                int r8 = r2.f7560j
                if (r8 == r15) goto L_0x00f8
                if (r8 != r14) goto L_0x00f5
                goto L_0x00f8
            L_0x00f5:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013a
            L_0x00f8:
                int r8 = r10.getMeasuredWidth()
                int r9 = r19.k()
                if (r8 != r9) goto L_0x0104
                r8 = r15
                goto L_0x0105
            L_0x0104:
                r8 = 0
            L_0x0105:
                int r9 = r2.f7560j
                if (r9 == r14) goto L_0x011c
                if (r7 == 0) goto L_0x011c
                if (r7 == 0) goto L_0x010f
                if (r8 != 0) goto L_0x011c
            L_0x010f:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.d
                if (r7 != 0) goto L_0x011c
                boolean r7 = r19.u()
                if (r7 == 0) goto L_0x011a
                goto L_0x011c
            L_0x011a:
                r7 = 0
                goto L_0x011d
            L_0x011c:
                r7 = r15
            L_0x011d:
                if (r7 == 0) goto L_0x00f5
                int r5 = r19.i()
                r9 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
                goto L_0x013a
            L_0x012a:
                r9 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f917g
                r7 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r8, r7)
                goto L_0x013a
            L_0x0134:
                r9 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013a:
                t.d r7 = r1.Q
                t.e r7 = (t.e) r7
                androidx.constraintlayout.widget.ConstraintLayout r0 = androidx.constraintlayout.widget.ConstraintLayout.this
                if (r7 == 0) goto L_0x01b0
                int r8 = r0.f868i
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = k3.j.r(r8, r9)
                if (r8 == 0) goto L_0x01b0
                int r8 = r10.getMeasuredWidth()
                int r9 = r19.k()
                if (r8 != r9) goto L_0x01b0
                int r8 = r10.getMeasuredWidth()
                int r9 = r7.k()
                if (r8 >= r9) goto L_0x01b0
                int r8 = r10.getMeasuredHeight()
                int r9 = r19.i()
                if (r8 != r9) goto L_0x01b0
                int r8 = r10.getMeasuredHeight()
                int r7 = r7.i()
                if (r8 >= r7) goto L_0x01b0
                int r7 = r10.getBaseline()
                int r8 = r1.X
                if (r7 != r8) goto L_0x01b0
                boolean r7 = r19.s()
                if (r7 != 0) goto L_0x01b0
                int r7 = r1.C
                int r8 = r19.k()
                boolean r7 = a(r7, r6, r8)
                if (r7 == 0) goto L_0x019c
                int r7 = r1.D
                int r8 = r19.i()
                boolean r7 = a(r7, r5, r8)
                if (r7 == 0) goto L_0x019c
                r7 = r15
                goto L_0x019d
            L_0x019c:
                r7 = 0
            L_0x019d:
                if (r7 == 0) goto L_0x01b0
                int r0 = r19.k()
                r2.e = r0
                int r0 = r19.i()
                r2.f7556f = r0
                int r0 = r1.X
                r2.f7557g = r0
                return
            L_0x01b0:
                r7 = 3
                if (r3 != r7) goto L_0x01b5
                r8 = r15
                goto L_0x01b6
            L_0x01b5:
                r8 = 0
            L_0x01b6:
                if (r4 != r7) goto L_0x01ba
                r7 = r15
                goto L_0x01bb
            L_0x01ba:
                r7 = 0
            L_0x01bb:
                r9 = 4
                if (r4 == r9) goto L_0x01c3
                if (r4 != r15) goto L_0x01c1
                goto L_0x01c3
            L_0x01c1:
                r4 = 0
                goto L_0x01c4
            L_0x01c3:
                r4 = r15
            L_0x01c4:
                if (r3 == r9) goto L_0x01cb
                if (r3 != r15) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r3 = 0
                goto L_0x01cc
            L_0x01cb:
                r3 = r15
            L_0x01cc:
                r9 = 0
                if (r8 == 0) goto L_0x01d7
                float r11 = r1.T
                int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x01d7
                r11 = r15
                goto L_0x01d8
            L_0x01d7:
                r11 = 0
            L_0x01d8:
                if (r7 == 0) goto L_0x01e2
                float r12 = r1.T
                int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x01e2
                r9 = r15
                goto L_0x01e3
            L_0x01e2:
                r9 = 0
            L_0x01e3:
                if (r10 != 0) goto L_0x01e6
                return
            L_0x01e6:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r12 = (androidx.constraintlayout.widget.ConstraintLayout.a) r12
                int r13 = r2.f7560j
                if (r13 == r15) goto L_0x0206
                if (r13 == r14) goto L_0x0206
                if (r8 == 0) goto L_0x0206
                int r8 = r1.f7341m
                if (r8 != 0) goto L_0x0206
                if (r7 == 0) goto L_0x0206
                int r7 = r1.f7342n
                if (r7 == 0) goto L_0x01ff
                goto L_0x0206
            L_0x01ff:
                r0 = 0
                r3 = -1
                r13 = 0
                r14 = 0
                r15 = 0
                goto L_0x02a9
            L_0x0206:
                boolean r7 = r10 instanceof v.e
                if (r7 == 0) goto L_0x0215
                boolean r7 = r1 instanceof t.i
                if (r7 == 0) goto L_0x0215
                r7 = r1
                t.i r7 = (t.i) r7
                r7 = r10
                v.e r7 = (v.e) r7
                goto L_0x0218
            L_0x0215:
                r10.measure(r6, r5)
            L_0x0218:
                r1.C = r6
                r1.D = r5
                r7 = 0
                r1.f7329g = r7
                int r7 = r10.getMeasuredWidth()
                int r8 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.f7344p
                if (r14 <= 0) goto L_0x0234
                int r14 = java.lang.Math.max(r14, r7)
                goto L_0x0235
            L_0x0234:
                r14 = r7
            L_0x0235:
                int r15 = r1.f7345q
                if (r15 <= 0) goto L_0x023d
                int r14 = java.lang.Math.min(r15, r14)
            L_0x023d:
                int r15 = r1.f7346s
                if (r15 <= 0) goto L_0x0248
                int r15 = java.lang.Math.max(r15, r8)
                r17 = r5
                goto L_0x024b
            L_0x0248:
                r17 = r5
                r15 = r8
            L_0x024b:
                int r5 = r1.f7347t
                if (r5 <= 0) goto L_0x0253
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0253:
                int r0 = r0.f868i
                r5 = 1
                boolean r0 = k3.j.r(r0, r5)
                if (r0 != 0) goto L_0x0275
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x026a
                if (r4 == 0) goto L_0x026a
                float r3 = r1.T
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x0275
            L_0x026a:
                if (r9 == 0) goto L_0x0275
                if (r3 == 0) goto L_0x0275
                float r3 = r1.T
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x0275:
                if (r7 != r14) goto L_0x027d
                if (r8 == r15) goto L_0x027a
                goto L_0x027d
            L_0x027a:
                r0 = 0
            L_0x027b:
                r3 = -1
                goto L_0x02a9
            L_0x027d:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r7 == r14) goto L_0x0285
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
            L_0x0285:
                if (r8 == r15) goto L_0x028c
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x028e
            L_0x028c:
                r5 = r17
            L_0x028e:
                r10.measure(r6, r5)
                r1.C = r6
                r1.D = r5
                r0 = 0
                r1.f7329g = r0
                int r16 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r15 = r3
                r13 = r4
                r14 = r16
                goto L_0x027b
            L_0x02a9:
                if (r13 == r3) goto L_0x02ae
                r16 = 1
                goto L_0x02b0
            L_0x02ae:
                r16 = r0
            L_0x02b0:
                int r3 = r2.f7554c
                if (r14 != r3) goto L_0x02bb
                int r3 = r2.f7555d
                if (r15 == r3) goto L_0x02b9
                goto L_0x02bb
            L_0x02b9:
                r5 = r0
                goto L_0x02bc
            L_0x02bb:
                r5 = 1
            L_0x02bc:
                r2.f7559i = r5
                boolean r0 = r12.X
                if (r0 == 0) goto L_0x02c4
                r5 = 1
                goto L_0x02c6
            L_0x02c4:
                r5 = r16
            L_0x02c6:
                if (r5 == 0) goto L_0x02d2
                r0 = -1
                if (r13 == r0) goto L_0x02d2
                int r0 = r1.X
                if (r0 == r13) goto L_0x02d2
                r0 = 1
                r2.f7559i = r0
            L_0x02d2:
                r2.e = r14
                r2.f7556f = r15
                r2.f7558h = r5
                r2.f7557g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(t.d, u.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c(attributeSet, i8);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
    }

    public final d b(View view) {
        if (view == this) {
            return this.f863c;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).f899l0;
    }

    public final void c(AttributeSet attributeSet, int i8) {
        e eVar = this.f863c;
        eVar.f7323c0 = this;
        b bVar = this.f874o;
        eVar.f7354p0 = bVar;
        eVar.f7353o0.f7567f = bVar;
        this.f861a.put(getId(), this);
        this.f869j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f5155j, i8, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 9) {
                    this.f864d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f864d);
                } else if (index == 10) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 7) {
                    this.f865f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f865f);
                } else if (index == 8) {
                    this.f866g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f866g);
                } else if (index == 90) {
                    this.f868i = obtainStyledAttributes.getInt(index, this.f868i);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f870k = new v.b(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f870k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar2 = new b();
                        this.f869j = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f869j = null;
                    }
                    this.f871l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.y0 = this.f868i;
        s.d.f7138p = eVar.L(512);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f862b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i10 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i11 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f9 = (float) i10;
                        float f10 = (float) i11;
                        float f11 = (float) (i10 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = f10;
                        float f13 = f10;
                        float f14 = f11;
                        float f15 = f9;
                        Paint paint2 = paint;
                        canvas2.drawLine(f9, f12, f14, f13, paint);
                        float parseInt4 = (float) (i11 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f16 = f11;
                        float f17 = parseInt4;
                        canvas2.drawLine(f16, f13, f14, f17, paint);
                        float f18 = parseInt4;
                        float f19 = f15;
                        canvas2.drawLine(f16, f18, f19, f17, paint);
                        float f20 = f15;
                        canvas2.drawLine(f20, f18, f19, f13, paint);
                        paint.setColor(-16711936);
                        float f21 = f11;
                        Paint paint3 = paint;
                        canvas2.drawLine(f20, f13, f21, parseInt4, paint);
                        canvas2.drawLine(f20, parseInt4, f21, f13, paint);
                    }
                }
            }
        }
    }

    public final void e(int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
        b bVar = this.f874o;
        int i12 = bVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i10 + bVar.f915d, i8, 0);
        int min = Math.min(this.f865f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f866g, View.resolveSizeAndState(i11 + i12, i9, 0) & 16777215);
        if (z8) {
            min |= 16777216;
        }
        if (z9) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public final void f(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f872m == null) {
                this.f872m = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f872m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void forceLayout() {
        this.f867h = true;
        super.forceLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010a, code lost:
        r7 = java.lang.Integer.valueOf(r7);
        r2 = r14.f924g;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r26.getChildCount()
            r2 = 0
            r3 = r2
        L_0x0008:
            r4 = 1
            if (r3 >= r1) goto L_0x001a
            android.view.View r5 = r0.getChildAt(r3)
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L_0x0017
            r1 = r4
            goto L_0x001b
        L_0x0017:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r1 == 0) goto L_0x055a
            boolean r3 = r26.isInEditMode()
            int r5 = r26.getChildCount()
            r6 = r2
        L_0x0026:
            if (r6 >= r5) goto L_0x0039
            android.view.View r7 = r0.getChildAt(r6)
            t.d r7 = r0.b(r7)
            if (r7 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r7.v()
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0039:
            android.util.SparseArray<android.view.View> r6 = r0.f861a
            r7 = 0
            r8 = -1
            t.e r9 = r0.f863c
            if (r3 == 0) goto L_0x00a2
            r10 = r2
        L_0x0042:
            if (r10 >= r5) goto L_0x00a2
            android.view.View r11 = r0.getChildAt(r10)
            android.content.res.Resources r12 = r26.getResources()     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.String r12 = r12.getResourceName(r13)     // Catch:{ NotFoundException -> 0x009f }
            int r13 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            r0.f(r12, r13)     // Catch:{ NotFoundException -> 0x009f }
            r13 = 47
            int r13 = r12.indexOf(r13)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == r8) goto L_0x006d
            int r13 = r13 + 1
            java.lang.String r12 = r12.substring(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x006d:
            int r11 = r11.getId()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != 0) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            java.lang.Object r13 = r6.get(r11)     // Catch:{ NotFoundException -> 0x009f }
            android.view.View r13 = (android.view.View) r13     // Catch:{ NotFoundException -> 0x009f }
            if (r13 != 0) goto L_0x008d
            android.view.View r13 = r0.findViewById(r11)     // Catch:{ NotFoundException -> 0x009f }
            if (r13 == 0) goto L_0x008d
            if (r13 == r0) goto L_0x008d
            android.view.ViewParent r11 = r13.getParent()     // Catch:{ NotFoundException -> 0x009f }
            if (r11 != r0) goto L_0x008d
            r0.onViewAdded(r13)     // Catch:{ NotFoundException -> 0x009f }
        L_0x008d:
            if (r13 != r0) goto L_0x0091
        L_0x008f:
            r11 = r9
            goto L_0x009d
        L_0x0091:
            if (r13 != 0) goto L_0x0095
            r11 = r7
            goto L_0x009d
        L_0x0095:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()     // Catch:{ NotFoundException -> 0x009f }
            androidx.constraintlayout.widget.ConstraintLayout$a r11 = (androidx.constraintlayout.widget.ConstraintLayout.a) r11     // Catch:{ NotFoundException -> 0x009f }
            t.d r11 = r11.f899l0     // Catch:{ NotFoundException -> 0x009f }
        L_0x009d:
            r11.f7326e0 = r12     // Catch:{ NotFoundException -> 0x009f }
        L_0x009f:
            int r10 = r10 + 1
            goto L_0x0042
        L_0x00a2:
            int r10 = r0.f871l
            if (r10 == r8) goto L_0x00c4
            r10 = r2
        L_0x00a7:
            if (r10 >= r5) goto L_0x00c4
            android.view.View r11 = r0.getChildAt(r10)
            int r12 = r11.getId()
            int r13 = r0.f871l
            if (r12 != r13) goto L_0x00c1
            boolean r12 = r11 instanceof androidx.constraintlayout.widget.c
            if (r12 == 0) goto L_0x00c1
            androidx.constraintlayout.widget.c r11 = (androidx.constraintlayout.widget.c) r11
            androidx.constraintlayout.widget.b r11 = r11.getConstraintSet()
            r0.f869j = r11
        L_0x00c1:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x00c4:
            androidx.constraintlayout.widget.b r10 = r0.f869j
            if (r10 == 0) goto L_0x00cb
            r10.a(r0)
        L_0x00cb:
            java.util.ArrayList<t.d> r10 = r9.f7370m0
            r10.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r10 = r0.f862b
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0171
            r13 = r2
        L_0x00d9:
            if (r13 >= r11) goto L_0x0171
            java.lang.Object r14 = r10.get(r13)
            androidx.constraintlayout.widget.a r14 = (androidx.constraintlayout.widget.a) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x00ec
            java.lang.String r15 = r14.e
            r14.setIds(r15)
        L_0x00ec:
            t.a r15 = r14.f922d
            if (r15 != 0) goto L_0x00f2
            goto L_0x0169
        L_0x00f2:
            r15.f7369n0 = r2
            t.d[] r15 = r15.f7368m0
            java.util.Arrays.fill(r15, r7)
            r15 = r2
        L_0x00fa:
            int r7 = r14.f920b
            if (r15 >= r7) goto L_0x0164
            int[] r7 = r14.f919a
            r7 = r7[r15]
            java.lang.Object r17 = r6.get(r7)
            android.view.View r17 = (android.view.View) r17
            if (r17 != 0) goto L_0x012f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r14.f924g
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r14.e(r0, r7)
            if (r8 == 0) goto L_0x012f
            int[] r12 = r14.f919a
            r12[r15] = r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r2.put(r12, r7)
            java.lang.Object r2 = r6.get(r8)
            r17 = r2
            android.view.View r17 = (android.view.View) r17
        L_0x012f:
            r2 = r17
            if (r2 == 0) goto L_0x015e
            t.a r7 = r14.f922d
            t.d r2 = r0.b(r2)
            r7.getClass()
            if (r2 == r7) goto L_0x015e
            if (r2 != 0) goto L_0x0141
            goto L_0x015e
        L_0x0141:
            int r8 = r7.f7369n0
            int r8 = r8 + r4
            t.d[] r12 = r7.f7368m0
            int r4 = r12.length
            if (r8 <= r4) goto L_0x0154
            int r4 = r12.length
            r8 = 2
            int r4 = r4 * r8
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r12, r4)
            t.d[] r4 = (t.d[]) r4
            r7.f7368m0 = r4
        L_0x0154:
            t.d[] r4 = r7.f7368m0
            int r8 = r7.f7369n0
            r4[r8] = r2
            r2 = 1
            int r8 = r8 + r2
            r7.f7369n0 = r8
        L_0x015e:
            int r15 = r15 + 1
            r2 = 0
            r4 = 1
            r8 = -1
            goto L_0x00fa
        L_0x0164:
            t.a r2 = r14.f922d
            r2.getClass()
        L_0x0169:
            int r13 = r13 + 1
            r2 = 0
            r4 = 1
            r7 = 0
            r8 = -1
            goto L_0x00d9
        L_0x0171:
            r2 = 0
        L_0x0172:
            if (r2 >= r5) goto L_0x01af
            android.view.View r4 = r0.getChildAt(r2)
            boolean r7 = r4 instanceof androidx.constraintlayout.widget.d
            if (r7 == 0) goto L_0x01ab
            androidx.constraintlayout.widget.d r4 = (androidx.constraintlayout.widget.d) r4
            int r7 = r4.f997a
            r8 = -1
            if (r7 != r8) goto L_0x018e
            boolean r7 = r4.isInEditMode()
            if (r7 != 0) goto L_0x018e
            int r7 = r4.f999c
            r4.setVisibility(r7)
        L_0x018e:
            int r7 = r4.f997a
            android.view.View r7 = r0.findViewById(r7)
            r4.f998b = r7
            if (r7 == 0) goto L_0x01ab
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            r8 = 1
            r7.f878a0 = r8
            android.view.View r7 = r4.f998b
            r8 = 0
            r7.setVisibility(r8)
            r4.setVisibility(r8)
            goto L_0x01ac
        L_0x01ab:
            r8 = 0
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0172
        L_0x01af:
            r8 = 0
            android.util.SparseArray<t.d> r2 = r0.f873n
            r2.clear()
            r2.put(r8, r9)
            int r4 = r26.getId()
            r2.put(r4, r9)
            r4 = 0
        L_0x01c0:
            if (r4 >= r5) goto L_0x01d4
            android.view.View r7 = r0.getChildAt(r4)
            t.d r8 = r0.b(r7)
            int r7 = r7.getId()
            r2.put(r7, r8)
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 >= r5) goto L_0x055a
            android.view.View r4 = r0.getChildAt(r8)
            t.d r7 = r0.b(r4)
            if (r7 != 0) goto L_0x01e3
            goto L_0x0252
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r10 = r4.getLayoutParams()
            r15 = r10
            androidx.constraintlayout.widget.ConstraintLayout$a r15 = (androidx.constraintlayout.widget.ConstraintLayout.a) r15
            java.util.ArrayList<t.d> r10 = r9.f7370m0
            r10.add(r7)
            t.d r10 = r7.Q
            if (r10 == 0) goto L_0x01fd
            t.j r10 = (t.j) r10
            java.util.ArrayList<t.d> r10 = r10.f7370m0
            r10.remove(r7)
            r7.v()
        L_0x01fd:
            r7.Q = r9
            r15.a()
            int r10 = r4.getVisibility()
            r7.f7325d0 = r10
            boolean r10 = r15.f878a0
            if (r10 == 0) goto L_0x0213
            r10 = 1
            r7.A = r10
            r10 = 8
            r7.f7325d0 = r10
        L_0x0213:
            r7.f7323c0 = r4
            boolean r10 = r4 instanceof androidx.constraintlayout.widget.a
            if (r10 == 0) goto L_0x0220
            androidx.constraintlayout.widget.a r4 = (androidx.constraintlayout.widget.a) r4
            boolean r10 = r9.f7355q0
            r4.g(r7, r10)
        L_0x0220:
            boolean r4 = r15.Y
            if (r4 == 0) goto L_0x0262
            t.f r7 = (t.f) r7
            int r4 = r15.f893i0
            int r10 = r15.f895j0
            float r11 = r15.f897k0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x023c
            if (r13 <= 0) goto L_0x0252
            r7.f7362m0 = r11
            r11 = -1
            r7.f7363n0 = r11
            r7.f7364o0 = r11
            goto L_0x0252
        L_0x023c:
            r11 = -1
            if (r4 == r11) goto L_0x0248
            if (r4 <= r11) goto L_0x0252
            r7.f7362m0 = r12
            r7.f7363n0 = r4
            r7.f7364o0 = r11
            goto L_0x0252
        L_0x0248:
            if (r10 == r11) goto L_0x0252
            if (r10 <= r11) goto L_0x0252
            r7.f7362m0 = r12
            r7.f7363n0 = r11
            r7.f7364o0 = r10
        L_0x0252:
            r19 = r1
            r21 = r3
            r16 = r5
            r20 = r8
            r18 = r9
            r0 = 2
            r1 = -1
            r4 = 1
            r8 = 0
            goto L_0x054b
        L_0x0262:
            int r4 = r15.f880b0
            int r10 = r15.f882c0
            int r14 = r15.f884d0
            int r13 = r15.f885e0
            int r12 = r15.f887f0
            int r11 = r15.f889g0
            float r0 = r15.f891h0
            r16 = r5
            int r5 = r15.f900m
            r18 = r9
            t.c$a r9 = t.c.a.f7311h
            r19 = r1
            t.c$a r1 = t.c.a.f7309f
            r20 = r8
            t.c$a r8 = t.c.a.f7312i
            r21 = r3
            t.c$a r3 = t.c.a.f7310g
            r22 = r0
            r0 = -1
            if (r5 == r0) goto L_0x02a7
            java.lang.Object r0 = r2.get(r5)
            r12 = r0
            t.d r12 = (t.d) r12
            if (r12 == 0) goto L_0x02a4
            float r0 = r15.f902o
            int r14 = r15.f901n
            t.c$a r13 = t.c.a.f7314k
            r4 = 0
            r10 = r7
            r11 = r13
            r5 = r15
            r15 = r4
            r10.o(r11, r12, r13, r14, r15)
            r7.y = r0
            goto L_0x03be
        L_0x02a4:
            r5 = r15
            goto L_0x03be
        L_0x02a7:
            r5 = r15
            if (r4 == r0) goto L_0x02b8
            java.lang.Object r4 = r2.get(r4)
            t.d r4 = (t.d) r4
            if (r4 == 0) goto L_0x02d7
            int r10 = r5.leftMargin
            r0 = r4
            r15 = r10
            r4 = r1
            goto L_0x02c6
        L_0x02b8:
            if (r10 == r0) goto L_0x02d7
            java.lang.Object r0 = r2.get(r10)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x02d7
            int r4 = r5.leftMargin
            r15 = r4
            r4 = r9
        L_0x02c6:
            r10 = r7
            r23 = r11
            r11 = r1
            r24 = r12
            r12 = r0
            r0 = r13
            r13 = r4
            r4 = r14
            r14 = r15
            r15 = r24
            r10.o(r11, r12, r13, r14, r15)
            goto L_0x02db
        L_0x02d7:
            r23 = r11
            r0 = r13
            r4 = r14
        L_0x02db:
            r10 = -1
            if (r4 == r10) goto L_0x02ec
            java.lang.Object r0 = r2.get(r4)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0302
            int r4 = r5.rightMargin
            r12 = r0
            r13 = r1
            r14 = r4
            goto L_0x02fb
        L_0x02ec:
            if (r0 == r10) goto L_0x0302
            java.lang.Object r0 = r2.get(r0)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0302
            int r4 = r5.rightMargin
            r12 = r0
            r14 = r4
            r13 = r9
        L_0x02fb:
            r10 = r7
            r11 = r9
            r15 = r23
            r10.o(r11, r12, r13, r14, r15)
        L_0x0302:
            int r0 = r5.f890h
            r4 = -1
            if (r0 == r4) goto L_0x0318
            java.lang.Object r0 = r2.get(r0)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0331
            int r10 = r5.topMargin
            int r11 = r5.f907u
            r12 = r0
            r13 = r3
            r14 = r10
            r15 = r11
            goto L_0x032c
        L_0x0318:
            int r0 = r5.f892i
            if (r0 == r4) goto L_0x0331
            java.lang.Object r0 = r2.get(r0)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0331
            int r4 = r5.topMargin
            int r10 = r5.f907u
            r12 = r0
            r14 = r4
            r13 = r8
            r15 = r10
        L_0x032c:
            r10 = r7
            r11 = r3
            r10.o(r11, r12, r13, r14, r15)
        L_0x0331:
            int r0 = r5.f894j
            r4 = -1
            if (r0 == r4) goto L_0x0347
            java.lang.Object r0 = r2.get(r0)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0360
            int r10 = r5.bottomMargin
            int r11 = r5.w
            r12 = r0
            r13 = r3
            r14 = r10
            r15 = r11
            goto L_0x035b
        L_0x0347:
            int r0 = r5.f896k
            if (r0 == r4) goto L_0x0360
            java.lang.Object r0 = r2.get(r0)
            t.d r0 = (t.d) r0
            if (r0 == 0) goto L_0x0360
            int r4 = r5.bottomMargin
            int r10 = r5.w
            r12 = r0
            r14 = r4
            r13 = r8
            r15 = r10
        L_0x035b:
            r10 = r7
            r11 = r8
            r10.o(r11, r12, r13, r14, r15)
        L_0x0360:
            int r0 = r5.f898l
            r4 = -1
            if (r0 == r4) goto L_0x03ad
            java.lang.Object r0 = r6.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r4 = r5.f898l
            java.lang.Object r4 = r2.get(r4)
            t.d r4 = (t.d) r4
            if (r4 == 0) goto L_0x03ad
            if (r0 == 0) goto L_0x03ad
            android.view.ViewGroup$LayoutParams r10 = r0.getLayoutParams()
            boolean r10 = r10 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x03ad
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.a) r0
            r10 = 1
            r5.X = r10
            r0.X = r10
            t.c$a r11 = t.c.a.f7313j
            t.c r12 = r7.g(r11)
            t.c r4 = r4.g(r11)
            r11 = -1
            r13 = 0
            r12.a(r4, r13, r11)
            r7.f7351z = r10
            t.d r0 = r0.f899l0
            r0.f7351z = r10
            t.c r0 = r7.g(r3)
            r0.g()
            t.c r0 = r7.g(r8)
            r0.g()
        L_0x03ad:
            r0 = 0
            int r4 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x03b6
            r4 = r22
            r7.f7319a0 = r4
        L_0x03b6:
            float r4 = r5.A
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x03be
            r7.f7321b0 = r4
        L_0x03be:
            if (r21 == 0) goto L_0x03cf
            int r0 = r5.P
            r4 = -1
            if (r0 != r4) goto L_0x03c9
            int r10 = r5.Q
            if (r10 == r4) goto L_0x03cf
        L_0x03c9:
            int r4 = r5.Q
            r7.V = r0
            r7.W = r4
        L_0x03cf:
            boolean r0 = r5.V
            r4 = 4
            r10 = 3
            r11 = -2
            if (r0 != 0) goto L_0x03ff
            int r0 = r5.width
            r12 = -1
            if (r0 != r12) goto L_0x03f7
            boolean r0 = r5.S
            if (r0 == 0) goto L_0x03e3
            r7.A(r10)
            goto L_0x03e6
        L_0x03e3:
            r7.A(r4)
        L_0x03e6:
            t.c r0 = r7.g(r1)
            int r1 = r5.leftMargin
            r0.f7306g = r1
            t.c r0 = r7.g(r9)
            int r1 = r5.rightMargin
            r0.f7306g = r1
            goto L_0x0410
        L_0x03f7:
            r7.A(r10)
            r0 = 0
            r7.C(r0)
            goto L_0x0410
        L_0x03ff:
            r0 = 1
            r7.A(r0)
            int r0 = r5.width
            r7.C(r0)
            int r0 = r5.width
            if (r0 != r11) goto L_0x0410
            r0 = 2
            r7.A(r0)
        L_0x0410:
            boolean r0 = r5.W
            if (r0 != 0) goto L_0x043d
            int r0 = r5.height
            r1 = -1
            if (r0 != r1) goto L_0x0435
            boolean r0 = r5.T
            if (r0 == 0) goto L_0x0421
            r7.B(r10)
            goto L_0x0424
        L_0x0421:
            r7.B(r4)
        L_0x0424:
            t.c r0 = r7.g(r3)
            int r3 = r5.topMargin
            r0.f7306g = r3
            t.c r0 = r7.g(r8)
            int r3 = r5.bottomMargin
            r0.f7306g = r3
            goto L_0x044f
        L_0x0435:
            r7.B(r10)
            r0 = 0
            r7.z(r0)
            goto L_0x044f
        L_0x043d:
            r0 = 1
            r1 = -1
            r7.B(r0)
            int r0 = r5.height
            r7.z(r0)
            int r0 = r5.height
            if (r0 != r11) goto L_0x044f
            r0 = 2
            r7.B(r0)
        L_0x044f:
            java.lang.String r0 = r5.B
            if (r0 == 0) goto L_0x04eb
            int r3 = r0.length()
            if (r3 != 0) goto L_0x045b
            goto L_0x04eb
        L_0x045b:
            int r3 = r0.length()
            r4 = 44
            int r4 = r0.indexOf(r4)
            if (r4 <= 0) goto L_0x048d
            int r8 = r3 + -1
            if (r4 >= r8) goto L_0x048d
            r8 = 0
            java.lang.String r9 = r0.substring(r8, r4)
            java.lang.String r8 = "W"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x047a
            r8 = 0
            goto L_0x0485
        L_0x047a:
            java.lang.String r8 = "H"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0484
            r8 = 1
            goto L_0x0485
        L_0x0484:
            r8 = r1
        L_0x0485:
            int r4 = r4 + 1
            r25 = r8
            r8 = r4
            r4 = r25
            goto L_0x048f
        L_0x048d:
            r4 = r1
            r8 = 0
        L_0x048f:
            r9 = 58
            int r9 = r0.indexOf(r9)
            if (r9 < 0) goto L_0x04d1
            int r3 = r3 + -1
            if (r9 >= r3) goto L_0x04d1
            java.lang.String r3 = r0.substring(r8, r9)
            int r9 = r9 + 1
            java.lang.String r0 = r0.substring(r9)
            int r8 = r3.length()
            if (r8 <= 0) goto L_0x04e0
            int r8 = r0.length()
            if (r8 <= 0) goto L_0x04e0
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x04e0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x04e0
            int r9 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x04e0
            r8 = 1
            if (r4 != r8) goto L_0x04cb
            float r0 = r0 / r3
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04cb:
            float r3 = r3 / r0
            float r0 = java.lang.Math.abs(r3)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04d1:
            java.lang.String r0 = r0.substring(r8)
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x04e0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04e0:
            r0 = 0
        L_0x04e1:
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x04ee
            r7.T = r0
            r7.U = r4
            goto L_0x04ee
        L_0x04eb:
            r3 = 0
            r7.T = r3
        L_0x04ee:
            float r0 = r5.D
            float[] r3 = r7.f7332h0
            r8 = 0
            r3[r8] = r0
            float r0 = r5.E
            r4 = 1
            r3[r4] = r0
            int r0 = r5.F
            r7.f7328f0 = r0
            int r0 = r5.G
            r7.f7330g0 = r0
            int r0 = r5.H
            int r3 = r5.J
            int r9 = r5.L
            float r10 = r5.N
            r7.f7341m = r0
            r7.f7344p = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r3) goto L_0x0514
            r9 = r8
        L_0x0514:
            r7.f7345q = r9
            r7.r = r10
            r9 = 0
            int r11 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r11 <= 0) goto L_0x0528
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x0528
            if (r0 != 0) goto L_0x0528
            r0 = 2
            r7.f7341m = r0
        L_0x0528:
            int r0 = r5.I
            int r10 = r5.K
            int r11 = r5.M
            float r5 = r5.O
            r7.f7342n = r0
            r7.f7346s = r10
            if (r11 != r3) goto L_0x0537
            r11 = r8
        L_0x0537:
            r7.f7347t = r11
            r7.f7348u = r5
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x054a
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x054a
            if (r0 != 0) goto L_0x054a
            r0 = 2
            r7.f7342n = r0
            goto L_0x054b
        L_0x054a:
            r0 = 2
        L_0x054b:
            int r3 = r20 + 1
            r0 = r26
            r8 = r3
            r5 = r16
            r9 = r18
            r1 = r19
            r3 = r21
            goto L_0x01d5
        L_0x055a:
            r19 = r1
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g():boolean");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f866g;
    }

    public int getMaxWidth() {
        return this.f865f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.f864d;
    }

    public int getOptimizationLevel() {
        return this.f863c.y0;
    }

    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.f899l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.f878a0) {
                int l8 = dVar.l();
                int m8 = dVar.m();
                int k8 = dVar.k() + l8;
                int i13 = dVar.i() + m8;
                childAt.layout(l8, m8, k8, i13);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l8, m8, k8, i13);
                }
            }
        }
        ArrayList<a> arrayList = this.f862b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.get(i14).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x053f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r0.f867h
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0023
            int r3 = r28.getChildCount()
            r6 = r5
        L_0x0011:
            if (r6 >= r3) goto L_0x0023
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x0020
            r0.f867h = r4
            goto L_0x0023
        L_0x0020:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0023:
            boolean r3 = r0.f867h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            t.e r8 = r0.f863c
            if (r3 != 0) goto L_0x0071
            int r3 = r0.f875p
            if (r3 != r1) goto L_0x0040
            int r9 = r0.f876q
            if (r9 != r2) goto L_0x0040
            int r3 = r8.k()
            int r4 = r8.i()
        L_0x003d:
            boolean r5 = r8.f7361z0
            goto L_0x006d
        L_0x0040:
            if (r3 != r1) goto L_0x0071
            int r3 = android.view.View.MeasureSpec.getMode(r29)
            if (r3 != r7) goto L_0x0071
            int r3 = android.view.View.MeasureSpec.getMode(r30)
            if (r3 != r6) goto L_0x0071
            int r3 = r0.f876q
            int r3 = android.view.View.MeasureSpec.getMode(r3)
            if (r3 != r6) goto L_0x0071
            int r3 = android.view.View.MeasureSpec.getSize(r30)
            int r9 = r8.i()
            if (r3 < r9) goto L_0x0071
            r0.f875p = r1
            r0.f876q = r2
            int r3 = r8.k()
            int r4 = r8.i()
            goto L_0x003d
        L_0x006d:
            boolean r6 = r8.A0
            goto L_0x07cc
        L_0x0071:
            r0.f875p = r1
            r0.f876q = r2
            boolean r3 = r28.d()
            r8.f7355q0 = r3
            boolean r3 = r0.f867h
            u.b r9 = r8.f7352n0
            if (r3 == 0) goto L_0x008c
            r0.f867h = r5
            boolean r3 = r28.g()
            if (r3 == 0) goto L_0x008c
            r9.c(r8)
        L_0x008c:
            int r3 = r0.f868i
            int r10 = android.view.View.MeasureSpec.getMode(r29)
            int r11 = android.view.View.MeasureSpec.getSize(r29)
            int r12 = android.view.View.MeasureSpec.getMode(r30)
            int r13 = android.view.View.MeasureSpec.getSize(r30)
            int r14 = r28.getPaddingTop()
            int r14 = java.lang.Math.max(r5, r14)
            int r15 = r28.getPaddingBottom()
            int r15 = java.lang.Math.max(r5, r15)
            int r4 = r14 + r15
            int r7 = r28.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = r0.f874o
            r6.f913b = r14
            r6.f914c = r15
            r6.f915d = r7
            r6.e = r4
            r6.f916f = r1
            r6.f917g = r2
            int r15 = r28.getPaddingStart()
            int r15 = java.lang.Math.max(r5, r15)
            int r1 = r28.getPaddingEnd()
            int r1 = java.lang.Math.max(r5, r1)
            if (r15 > 0) goto L_0x00e0
            if (r1 <= 0) goto L_0x00d7
            goto L_0x00e0
        L_0x00d7:
            int r1 = r28.getPaddingLeft()
            int r15 = java.lang.Math.max(r5, r1)
            goto L_0x00e7
        L_0x00e0:
            boolean r19 = r28.d()
            if (r19 == 0) goto L_0x00e7
            r15 = r1
        L_0x00e7:
            int r11 = r11 - r7
            int r13 = r13 - r4
            int r1 = r6.e
            int r4 = r6.f915d
            int r6 = r28.getChildCount()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L_0x0113
            if (r10 == 0) goto L_0x0109
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x00fd
            r7 = 1
            goto L_0x010d
        L_0x00fd:
            int r7 = r0.f865f
            int r7 = r7 - r4
            int r7 = java.lang.Math.min(r7, r11)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 1
            goto L_0x0121
        L_0x0109:
            if (r6 != 0) goto L_0x010c
            goto L_0x0115
        L_0x010c:
            r7 = 2
        L_0x010d:
            r20 = r7
            r7 = r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0121
        L_0x0113:
            if (r6 != 0) goto L_0x011c
        L_0x0115:
            int r7 = r0.f864d
            int r7 = java.lang.Math.max(r5, r7)
            goto L_0x011d
        L_0x011c:
            r7 = r11
        L_0x011d:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2
        L_0x0121:
            if (r12 == r5) goto L_0x013b
            if (r12 == 0) goto L_0x0135
            r5 = 1073741824(0x40000000, float:2.0)
            if (r12 == r5) goto L_0x012b
            r5 = 1
            goto L_0x0139
        L_0x012b:
            int r5 = r0.f866g
            int r5 = r5 - r1
            int r5 = java.lang.Math.min(r5, r13)
            r6 = r5
            r5 = 1
            goto L_0x0148
        L_0x0135:
            if (r6 != 0) goto L_0x0138
            goto L_0x013d
        L_0x0138:
            r5 = 2
        L_0x0139:
            r6 = 0
            goto L_0x0148
        L_0x013b:
            if (r6 != 0) goto L_0x0145
        L_0x013d:
            int r5 = r0.e
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            goto L_0x0146
        L_0x0145:
            r5 = r13
        L_0x0146:
            r6 = r5
            r5 = 2
        L_0x0148:
            int r2 = r8.k()
            r21 = r13
            u.e r13 = r8.f7353o0
            if (r7 != r2) goto L_0x0158
            int r2 = r8.i()
            if (r6 == r2) goto L_0x015b
        L_0x0158:
            r2 = 1
            r13.f7565c = r2
        L_0x015b:
            r2 = 0
            r8.V = r2
            r8.W = r2
            int r2 = r0.f865f
            int r2 = r2 - r4
            r22 = r13
            int[] r13 = r8.f7350x
            r23 = r11
            r11 = 0
            r13[r11] = r2
            int r2 = r0.f866g
            int r2 = r2 - r1
            r16 = 1
            r13[r16] = r2
            r8.Y = r11
            r8.Z = r11
            r2 = r20
            r8.A(r2)
            r8.C(r7)
            r8.B(r5)
            r8.z(r6)
            int r2 = r0.f864d
            int r2 = r2 - r4
            if (r2 >= 0) goto L_0x018b
            r2 = 0
        L_0x018b:
            r8.Y = r2
            int r2 = r0.e
            int r1 = r2 - r1
            if (r1 >= 0) goto L_0x0194
            r1 = 0
        L_0x0194:
            r8.Z = r1
            r8.s0 = r15
            r8.f7357t0 = r14
            r9.getClass()
            u.b$b r1 = r8.f7354p0
            java.util.ArrayList<t.d> r2 = r8.f7370m0
            int r2 = r2.size()
            int r4 = r8.k()
            int r5 = r8.i()
            r6 = 128(0x80, float:1.794E-43)
            boolean r6 = k3.j.r(r3, r6)
            r7 = 64
            if (r6 != 0) goto L_0x01c0
            boolean r3 = k3.j.r(r3, r7)
            if (r3 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r3 = 0
            goto L_0x01c1
        L_0x01c0:
            r3 = 1
        L_0x01c1:
            r14 = 3
            if (r3 == 0) goto L_0x0220
            r15 = 0
        L_0x01c5:
            if (r15 >= r2) goto L_0x0220
            java.util.ArrayList<t.d> r7 = r8.f7370m0
            java.lang.Object r7 = r7.get(r15)
            t.d r7 = (t.d) r7
            int[] r11 = r7.P
            r18 = 0
            r0 = r11[r18]
            if (r0 != r14) goto L_0x01d9
            r0 = 1
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            r16 = 1
            r11 = r11[r16]
            if (r11 != r14) goto L_0x01e2
            r11 = 1
            goto L_0x01e3
        L_0x01e2:
            r11 = 0
        L_0x01e3:
            if (r0 == 0) goto L_0x01f0
            if (r11 == 0) goto L_0x01f0
            float r0 = r7.T
            r11 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f0
            r0 = 1
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            boolean r11 = r7.q()
            if (r11 == 0) goto L_0x01fa
            if (r0 == 0) goto L_0x01fa
            goto L_0x021c
        L_0x01fa:
            boolean r11 = r7.r()
            if (r11 == 0) goto L_0x0203
            if (r0 == 0) goto L_0x0203
            goto L_0x021c
        L_0x0203:
            boolean r0 = r7 instanceof t.i
            if (r0 == 0) goto L_0x0208
            goto L_0x021c
        L_0x0208:
            boolean r0 = r7.q()
            if (r0 != 0) goto L_0x021c
            boolean r0 = r7.r()
            if (r0 == 0) goto L_0x0215
            goto L_0x021c
        L_0x0215:
            int r15 = r15 + 1
            r7 = 64
            r0 = r28
            goto L_0x01c5
        L_0x021c:
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            goto L_0x0222
        L_0x0220:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0222:
            if (r10 != r0) goto L_0x0226
            if (r12 == r0) goto L_0x0228
        L_0x0226:
            if (r6 == 0) goto L_0x022a
        L_0x0228:
            r0 = 1
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            r0 = r0 & r3
            if (r0 == 0) goto L_0x048a
            r3 = 0
            r7 = r13[r3]
            r11 = r23
            int r3 = java.lang.Math.min(r7, r11)
            r7 = 1
            r11 = r13[r7]
            r13 = r21
            int r11 = java.lang.Math.min(r11, r13)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 != r13) goto L_0x0252
            int r15 = r8.k()
            if (r15 == r3) goto L_0x0252
            r8.C(r3)
            r3 = r22
            r3.f7564b = r7
            goto L_0x0254
        L_0x0252:
            r3 = r22
        L_0x0254:
            if (r12 != r13) goto L_0x0261
            int r15 = r8.i()
            if (r15 == r11) goto L_0x0261
            r8.z(r11)
            r3.f7564b = r7
        L_0x0261:
            if (r10 != r13) goto L_0x03e8
            if (r12 != r13) goto L_0x03e8
            r6 = r6 & r7
            boolean r7 = r3.f7564b
            t.e r11 = r3.f7563a
            if (r7 != 0) goto L_0x0273
            boolean r7 = r3.f7565c
            if (r7 == 0) goto L_0x0271
            goto L_0x0273
        L_0x0271:
            r15 = 0
            goto L_0x02a9
        L_0x0273:
            java.util.ArrayList<t.d> r7 = r11.f7370m0
            java.util.Iterator r7 = r7.iterator()
        L_0x0279:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x0297
            java.lang.Object r13 = r7.next()
            t.d r13 = (t.d) r13
            r13.f()
            r15 = 0
            r13.f7318a = r15
            u.l r14 = r13.f7324d
            r14.n()
            u.n r13 = r13.e
            r13.m()
            r14 = 3
            goto L_0x0279
        L_0x0297:
            r15 = 0
            r11.f()
            r11.f7318a = r15
            u.l r7 = r11.f7324d
            r7.n()
            u.n r7 = r11.e
            r7.m()
            r3.f7565c = r15
        L_0x02a9:
            t.e r7 = r3.f7566d
            r3.b(r7)
            r11.V = r15
            r11.W = r15
            int r7 = r11.h(r15)
            r13 = 1
            int r14 = r11.h(r13)
            boolean r13 = r3.f7564b
            if (r13 == 0) goto L_0x02c2
            r3.c()
        L_0x02c2:
            int r13 = r11.l()
            int r15 = r11.m()
            r22 = r0
            u.l r0 = r11.f7324d
            u.f r0 = r0.f7599h
            r0.d(r13)
            u.n r0 = r11.e
            u.f r0 = r0.f7599h
            r0.d(r15)
            r3.g()
            java.util.ArrayList<u.p> r0 = r3.e
            r23 = r1
            r1 = 2
            if (r7 == r1) goto L_0x02ea
            if (r14 != r1) goto L_0x02e7
            goto L_0x02ea
        L_0x02e7:
            r25 = r4
            goto L_0x033f
        L_0x02ea:
            if (r6 == 0) goto L_0x0303
            java.util.Iterator r1 = r0.iterator()
        L_0x02f0:
            boolean r25 = r1.hasNext()
            if (r25 == 0) goto L_0x0303
            java.lang.Object r25 = r1.next()
            u.p r25 = (u.p) r25
            boolean r25 = r25.k()
            if (r25 != 0) goto L_0x02f0
            r6 = 0
        L_0x0303:
            if (r6 == 0) goto L_0x0322
            r1 = 2
            if (r7 != r1) goto L_0x0322
            r1 = 1
            r11.A(r1)
            r25 = r4
            r1 = 0
            int r4 = r3.d(r11, r1)
            r11.C(r4)
            u.l r1 = r11.f7324d
            u.g r1 = r1.e
            int r4 = r11.k()
            r1.d(r4)
            goto L_0x0324
        L_0x0322:
            r25 = r4
        L_0x0324:
            if (r6 == 0) goto L_0x033f
            r1 = 2
            if (r14 != r1) goto L_0x033f
            r1 = 1
            r11.B(r1)
            int r4 = r3.d(r11, r1)
            r11.z(r4)
            u.n r1 = r11.e
            u.g r1 = r1.e
            int r4 = r11.i()
            r1.d(r4)
        L_0x033f:
            int[] r1 = r11.P
            r4 = 0
            r6 = r1[r4]
            r4 = 4
            r26 = r5
            r5 = 1
            if (r6 == r5) goto L_0x034f
            if (r6 != r4) goto L_0x034d
            goto L_0x034f
        L_0x034d:
            r1 = 0
            goto L_0x0385
        L_0x034f:
            int r5 = r11.k()
            int r5 = r5 + r13
            u.l r6 = r11.f7324d
            u.f r6 = r6.f7600i
            r6.d(r5)
            u.l r6 = r11.f7324d
            u.g r6 = r6.e
            int r5 = r5 - r13
            r6.d(r5)
            r3.g()
            r5 = 1
            r1 = r1[r5]
            if (r1 == r5) goto L_0x036d
            if (r1 != r4) goto L_0x0381
        L_0x036d:
            int r1 = r11.i()
            int r1 = r1 + r15
            u.n r4 = r11.e
            u.f r4 = r4.f7600i
            r4.d(r1)
            u.n r4 = r11.e
            u.g r4 = r4.e
            int r1 = r1 - r15
            r4.d(r1)
        L_0x0381:
            r3.g()
            r1 = 1
        L_0x0385:
            java.util.Iterator r3 = r0.iterator()
        L_0x0389:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03a2
            java.lang.Object r4 = r3.next()
            u.p r4 = (u.p) r4
            t.d r5 = r4.f7594b
            if (r5 != r11) goto L_0x039e
            boolean r5 = r4.f7598g
            if (r5 != 0) goto L_0x039e
            goto L_0x0389
        L_0x039e:
            r4.e()
            goto L_0x0389
        L_0x03a2:
            java.util.Iterator r0 = r0.iterator()
        L_0x03a6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03db
            java.lang.Object r3 = r0.next()
            u.p r3 = (u.p) r3
            if (r1 != 0) goto L_0x03b9
            t.d r4 = r3.f7594b
            if (r4 != r11) goto L_0x03b9
            goto L_0x03a6
        L_0x03b9:
            u.f r4 = r3.f7599h
            boolean r4 = r4.f7578j
            if (r4 != 0) goto L_0x03c0
            goto L_0x03d9
        L_0x03c0:
            u.f r4 = r3.f7600i
            boolean r4 = r4.f7578j
            if (r4 != 0) goto L_0x03cb
            boolean r4 = r3 instanceof u.j
            if (r4 != 0) goto L_0x03cb
            goto L_0x03d9
        L_0x03cb:
            u.g r4 = r3.e
            boolean r4 = r4.f7578j
            if (r4 != 0) goto L_0x03a6
            boolean r4 = r3 instanceof u.c
            if (r4 != 0) goto L_0x03a6
            boolean r3 = r3 instanceof u.j
            if (r3 != 0) goto L_0x03a6
        L_0x03d9:
            r0 = 0
            goto L_0x03dc
        L_0x03db:
            r0 = 1
        L_0x03dc:
            r11.A(r7)
            r11.B(r14)
            r1 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = 2
            goto L_0x047a
        L_0x03e8:
            r22 = r0
            r23 = r1
            r25 = r4
            r26 = r5
            boolean r0 = r3.f7564b
            t.e r1 = r3.f7563a
            if (r0 == 0) goto L_0x0445
            java.util.ArrayList<t.d> r0 = r1.f7370m0
            java.util.Iterator r0 = r0.iterator()
        L_0x03fc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0425
            java.lang.Object r4 = r0.next()
            t.d r4 = (t.d) r4
            r4.f()
            r5 = 0
            r4.f7318a = r5
            u.l r7 = r4.f7324d
            u.g r11 = r7.e
            r11.f7578j = r5
            r7.f7598g = r5
            r7.n()
            u.n r4 = r4.e
            u.g r7 = r4.e
            r7.f7578j = r5
            r4.f7598g = r5
            r4.m()
            goto L_0x03fc
        L_0x0425:
            r5 = 0
            r1.f()
            r1.f7318a = r5
            u.l r0 = r1.f7324d
            u.g r4 = r0.e
            r4.f7578j = r5
            r0.f7598g = r5
            r0.n()
            u.n r0 = r1.e
            u.g r4 = r0.e
            r4.f7578j = r5
            r0.f7598g = r5
            r0.m()
            r3.c()
            goto L_0x0446
        L_0x0445:
            r5 = 0
        L_0x0446:
            t.e r0 = r3.f7566d
            r3.b(r0)
            r1.V = r5
            r1.W = r5
            u.l r0 = r1.f7324d
            u.f r0 = r0.f7599h
            r0.d(r5)
            u.n r0 = r1.e
            u.f r0 = r0.f7599h
            r0.d(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x046c
            boolean r1 = r8.J(r5, r6)
            r3 = 1
            r16 = r1 & 1
            r4 = r3
            r1 = r16
            goto L_0x046f
        L_0x046c:
            r3 = 1
            r1 = r3
            r4 = 0
        L_0x046f:
            if (r12 != r0) goto L_0x0479
            boolean r5 = r8.J(r3, r6)
            r1 = r1 & r5
            int r3 = r4 + 1
            goto L_0x047a
        L_0x0479:
            r3 = r4
        L_0x047a:
            if (r1 == 0) goto L_0x0494
            if (r10 != r0) goto L_0x0480
            r4 = 1
            goto L_0x0481
        L_0x0480:
            r4 = 0
        L_0x0481:
            if (r12 != r0) goto L_0x0485
            r0 = 1
            goto L_0x0486
        L_0x0485:
            r0 = 0
        L_0x0486:
            r8.D(r4, r0)
            goto L_0x0494
        L_0x048a:
            r22 = r0
            r23 = r1
            r25 = r4
            r26 = r5
            r1 = 0
            r3 = 0
        L_0x0494:
            if (r1 == 0) goto L_0x049d
            r0 = 2
            if (r3 == r0) goto L_0x049a
            goto L_0x049d
        L_0x049a:
            r3 = r8
            goto L_0x07bc
        L_0x049d:
            int r0 = r8.y0
            r1 = 8
            if (r2 <= 0) goto L_0x05af
            java.util.ArrayList<t.d> r3 = r8.f7370m0
            int r3 = r3.size()
            r4 = 64
            boolean r4 = r8.L(r4)
            u.b$b r5 = r8.f7354p0
            r6 = 0
        L_0x04b2:
            if (r6 >= r3) goto L_0x0543
            java.util.ArrayList<t.d> r7 = r8.f7370m0
            java.lang.Object r7 = r7.get(r6)
            t.d r7 = (t.d) r7
            boolean r10 = r7 instanceof t.f
            if (r10 == 0) goto L_0x04c1
            goto L_0x04e1
        L_0x04c1:
            boolean r10 = r7 instanceof t.a
            if (r10 == 0) goto L_0x04c6
            goto L_0x04e1
        L_0x04c6:
            boolean r10 = r7.B
            if (r10 == 0) goto L_0x04cb
            goto L_0x04e1
        L_0x04cb:
            if (r4 == 0) goto L_0x04e4
            u.l r10 = r7.f7324d
            if (r10 == 0) goto L_0x04e4
            u.n r11 = r7.e
            if (r11 == 0) goto L_0x04e4
            u.g r10 = r10.e
            boolean r10 = r10.f7578j
            if (r10 == 0) goto L_0x04e4
            u.g r10 = r11.e
            boolean r10 = r10.f7578j
            if (r10 == 0) goto L_0x04e4
        L_0x04e1:
            r10 = 3
            r12 = 0
            goto L_0x053f
        L_0x04e4:
            r10 = 0
            int r11 = r7.h(r10)
            r10 = 1
            int r12 = r7.h(r10)
            r13 = 3
            if (r11 != r13) goto L_0x04fd
            int r14 = r7.f7341m
            if (r14 == r10) goto L_0x04fd
            if (r12 != r13) goto L_0x04fd
            int r13 = r7.f7342n
            if (r13 == r10) goto L_0x04fd
            r13 = r10
            goto L_0x04fe
        L_0x04fd:
            r13 = 0
        L_0x04fe:
            if (r13 != 0) goto L_0x0536
            boolean r14 = r8.L(r10)
            if (r14 == 0) goto L_0x0536
            boolean r10 = r7 instanceof t.i
            if (r10 != 0) goto L_0x0536
            r10 = 3
            if (r11 != r10) goto L_0x051a
            int r14 = r7.f7341m
            if (r14 != 0) goto L_0x051a
            if (r12 == r10) goto L_0x051a
            boolean r14 = r7.q()
            if (r14 != 0) goto L_0x051a
            r13 = 1
        L_0x051a:
            if (r12 != r10) goto L_0x0529
            int r14 = r7.f7342n
            if (r14 != 0) goto L_0x0529
            if (r11 == r10) goto L_0x0529
            boolean r14 = r7.q()
            if (r14 != 0) goto L_0x0529
            r13 = 1
        L_0x0529:
            if (r11 == r10) goto L_0x052d
            if (r12 != r10) goto L_0x0537
        L_0x052d:
            float r11 = r7.T
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0538
            r13 = 1
            goto L_0x0538
        L_0x0536:
            r10 = 3
        L_0x0537:
            r12 = 0
        L_0x0538:
            if (r13 == 0) goto L_0x053b
            goto L_0x053f
        L_0x053b:
            r11 = 0
            r9.a(r5, r7, r11)
        L_0x053f:
            int r6 = r6 + 1
            goto L_0x04b2
        L_0x0543:
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.b) r5
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f912a
            int r4 = r3.getChildCount()
            r5 = 0
        L_0x054c:
            if (r5 >= r4) goto L_0x0598
            android.view.View r6 = r3.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.constraintlayout.widget.d
            if (r7 == 0) goto L_0x0595
            androidx.constraintlayout.widget.d r6 = (androidx.constraintlayout.widget.d) r6
            android.view.View r7 = r6.f998b
            if (r7 != 0) goto L_0x055d
            goto L_0x0595
        L_0x055d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            android.view.View r6 = r6.f998b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r6 = (androidx.constraintlayout.widget.ConstraintLayout.a) r6
            t.d r10 = r6.f899l0
            r11 = 0
            r10.f7325d0 = r11
            t.d r12 = r7.f899l0
            int[] r13 = r12.P
            r13 = r13[r11]
            r11 = 1
            if (r13 == r11) goto L_0x0580
            int r10 = r10.k()
            r12.C(r10)
        L_0x0580:
            t.d r7 = r7.f899l0
            int[] r10 = r7.P
            r10 = r10[r11]
            if (r10 == r11) goto L_0x0591
            t.d r10 = r6.f899l0
            int r10 = r10.i()
            r7.z(r10)
        L_0x0591:
            t.d r6 = r6.f899l0
            r6.f7325d0 = r1
        L_0x0595:
            int r5 = r5 + 1
            goto L_0x054c
        L_0x0598:
            java.util.ArrayList<androidx.constraintlayout.widget.a> r3 = r3.f862b
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x05af
            r5 = 0
        L_0x05a1:
            if (r5 >= r4) goto L_0x05af
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.a) r6
            r6.getClass()
            int r5 = r5 + 1
            goto L_0x05a1
        L_0x05af:
            r9.c(r8)
            java.util.ArrayList<t.d> r3 = r9.f7549a
            int r4 = r3.size()
            if (r2 <= 0) goto L_0x05c2
            r2 = r25
            r5 = r26
            r9.b(r8, r2, r5)
            goto L_0x05c6
        L_0x05c2:
            r2 = r25
            r5 = r26
        L_0x05c6:
            if (r4 <= 0) goto L_0x07ad
            int[] r6 = r8.P
            r7 = 0
            r10 = r6[r7]
            r7 = 2
            if (r10 != r7) goto L_0x05d2
            r10 = 1
            goto L_0x05d3
        L_0x05d2:
            r10 = 0
        L_0x05d3:
            r11 = 1
            r6 = r6[r11]
            if (r6 != r7) goto L_0x05da
            r6 = 1
            goto L_0x05db
        L_0x05da:
            r6 = 0
        L_0x05db:
            int r7 = r8.k()
            t.e r11 = r9.f7551c
            int r12 = r11.Y
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r8.i()
            int r11 = r11.Z
            int r11 = java.lang.Math.max(r12, r11)
            r12 = r7
            r13 = r11
            r7 = 0
            r11 = 0
        L_0x05f5:
            t.c$a r14 = t.c.a.f7312i
            t.c$a r15 = t.c.a.f7311h
            if (r7 >= r4) goto L_0x069b
            java.lang.Object r17 = r3.get(r7)
            r1 = r17
            t.d r1 = (t.d) r1
            r17 = r0
            boolean r0 = r1 instanceof t.i
            if (r0 != 0) goto L_0x0614
            r25 = r2
            r26 = r5
            r21 = r8
            r5 = r23
            r0 = 0
            goto L_0x068b
        L_0x0614:
            int r0 = r1.k()
            r25 = r2
            int r2 = r1.i()
            r26 = r5
            r21 = r8
            r5 = r23
            r8 = 1
            boolean r23 = r9.a(r5, r1, r8)
            r8 = r11 | r23
            int r11 = r1.k()
            r23 = r8
            int r8 = r1.i()
            if (r11 == r0) goto L_0x065c
            r1.C(r11)
            if (r10 == 0) goto L_0x065a
            int r0 = r1.l()
            int r11 = r1.R
            int r0 = r0 + r11
            if (r0 <= r12) goto L_0x065a
            int r0 = r1.l()
            int r11 = r1.R
            int r0 = r0 + r11
            t.c r11 = r1.g(r15)
            int r11 = r11.d()
            int r0 = r0 + r11
            int r0 = java.lang.Math.max(r12, r0)
            r12 = r0
        L_0x065a:
            r23 = 1
        L_0x065c:
            if (r8 == r2) goto L_0x0683
            r1.z(r8)
            if (r6 == 0) goto L_0x0681
            int r0 = r1.m()
            int r2 = r1.S
            int r0 = r0 + r2
            if (r0 <= r13) goto L_0x0681
            int r0 = r1.m()
            int r2 = r1.S
            int r0 = r0 + r2
            t.c r2 = r1.g(r14)
            int r2 = r2.d()
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r13, r0)
            r13 = r0
        L_0x0681:
            r2 = 1
            goto L_0x0685
        L_0x0683:
            r2 = r23
        L_0x0685:
            t.i r1 = (t.i) r1
            r0 = 0
            r1 = r2 | 0
            r11 = r1
        L_0x068b:
            int r7 = r7 + 1
            r23 = r5
            r0 = r17
            r8 = r21
            r2 = r25
            r5 = r26
            r1 = 8
            goto L_0x05f5
        L_0x069b:
            r17 = r0
            r25 = r2
            r26 = r5
            r21 = r8
            r5 = r23
            r0 = 0
            r1 = r0
            r2 = 2
        L_0x06a8:
            if (r1 >= r2) goto L_0x0784
            r7 = r0
        L_0x06ab:
            if (r7 >= r4) goto L_0x076a
            java.lang.Object r8 = r3.get(r7)
            t.d r8 = (t.d) r8
            boolean r0 = r8 instanceof t.g
            if (r0 == 0) goto L_0x06bb
            boolean r0 = r8 instanceof t.i
            if (r0 == 0) goto L_0x06bf
        L_0x06bb:
            boolean r0 = r8 instanceof t.f
            if (r0 == 0) goto L_0x06c2
        L_0x06bf:
            r2 = 8
            goto L_0x06e0
        L_0x06c2:
            int r0 = r8.f7325d0
            r2 = 8
            if (r0 != r2) goto L_0x06c9
            goto L_0x06e0
        L_0x06c9:
            if (r22 == 0) goto L_0x06dc
            u.l r0 = r8.f7324d
            u.g r0 = r0.e
            boolean r0 = r0.f7578j
            if (r0 == 0) goto L_0x06dc
            u.n r0 = r8.e
            u.g r0 = r0.e
            boolean r0 = r0.f7578j
            if (r0 == 0) goto L_0x06dc
            goto L_0x06e0
        L_0x06dc:
            boolean r0 = r8 instanceof t.i
            if (r0 == 0) goto L_0x06e6
        L_0x06e0:
            r23 = r3
            r24 = r4
            goto L_0x0760
        L_0x06e6:
            int r0 = r8.k()
            int r2 = r8.i()
            r23 = r3
            int r3 = r8.X
            r24 = r4
            r4 = 1
            if (r1 != r4) goto L_0x06f8
            r4 = 2
        L_0x06f8:
            boolean r4 = r9.a(r5, r8, r4)
            r4 = r4 | r11
            int r11 = r8.k()
            r27 = r4
            int r4 = r8.i()
            if (r11 == r0) goto L_0x072d
            r8.C(r11)
            if (r10 == 0) goto L_0x072b
            int r0 = r8.l()
            int r11 = r8.R
            int r0 = r0 + r11
            if (r0 <= r12) goto L_0x072b
            int r0 = r8.l()
            int r11 = r8.R
            int r0 = r0 + r11
            t.c r11 = r8.g(r15)
            int r11 = r11.d()
            int r0 = r0 + r11
            int r12 = java.lang.Math.max(r12, r0)
        L_0x072b:
            r27 = 1
        L_0x072d:
            if (r4 == r2) goto L_0x0753
            r8.z(r4)
            if (r6 == 0) goto L_0x0751
            int r0 = r8.m()
            int r2 = r8.S
            int r0 = r0 + r2
            if (r0 <= r13) goto L_0x0751
            int r0 = r8.m()
            int r2 = r8.S
            int r0 = r0 + r2
            t.c r2 = r8.g(r14)
            int r2 = r2.d()
            int r0 = r0 + r2
            int r13 = java.lang.Math.max(r13, r0)
        L_0x0751:
            r2 = 1
            goto L_0x0755
        L_0x0753:
            r2 = r27
        L_0x0755:
            boolean r0 = r8.f7351z
            if (r0 == 0) goto L_0x075f
            int r0 = r8.X
            if (r3 == r0) goto L_0x075f
            r11 = 1
            goto L_0x0760
        L_0x075f:
            r11 = r2
        L_0x0760:
            int r7 = r7 + 1
            r3 = r23
            r4 = r24
            r0 = 0
            r2 = 2
            goto L_0x06ab
        L_0x076a:
            r23 = r3
            r24 = r4
            if (r11 == 0) goto L_0x0784
            r3 = r21
            r0 = r25
            r2 = r26
            r9.b(r3, r0, r2)
            int r1 = r1 + 1
            r3 = r23
            r4 = r24
            r0 = 0
            r2 = 2
            r11 = 0
            goto L_0x06a8
        L_0x0784:
            r3 = r21
            r0 = r25
            r2 = r26
            if (r11 == 0) goto L_0x07b0
            r9.b(r3, r0, r2)
            int r1 = r3.k()
            if (r1 >= r12) goto L_0x079a
            r3.C(r12)
            r5 = 1
            goto L_0x079b
        L_0x079a:
            r5 = 0
        L_0x079b:
            int r1 = r3.i()
            if (r1 >= r13) goto L_0x07a6
            r3.z(r13)
            r4 = 1
            goto L_0x07a7
        L_0x07a6:
            r4 = r5
        L_0x07a7:
            if (r4 == 0) goto L_0x07b0
            r9.b(r3, r0, r2)
            goto L_0x07b0
        L_0x07ad:
            r17 = r0
            r3 = r8
        L_0x07b0:
            r0 = r17
            r3.y0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r3.L(r0)
            s.d.f7138p = r0
        L_0x07bc:
            int r0 = r3.k()
            int r1 = r3.i()
            boolean r2 = r3.f7361z0
            boolean r3 = r3.A0
            r4 = r1
            r5 = r2
            r6 = r3
            r3 = r0
        L_0x07cc:
            r0 = r28
            r1 = r29
            r2 = r30
            r0.e(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d b9 = b(view);
        if ((view instanceof Guideline) && !(b9 instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.f899l0 = fVar;
            aVar.Y = true;
            fVar.F(aVar.R);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.h();
            ((a) view.getLayoutParams()).Z = true;
            ArrayList<a> arrayList = this.f862b;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f861a.put(view.getId(), view);
        this.f867h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f861a.remove(view.getId());
        d b9 = b(view);
        this.f863c.f7370m0.remove(b9);
        b9.v();
        this.f862b.remove(view);
        this.f867h = true;
    }

    public final void removeView(View view) {
        super.removeView(view);
    }

    public final void requestLayout() {
        this.f867h = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.f869j = bVar;
    }

    public void setId(int i8) {
        int id = getId();
        SparseArray<View> sparseArray = this.f861a;
        sparseArray.remove(id);
        super.setId(i8);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i8) {
        if (i8 != this.f866g) {
            this.f866g = i8;
            requestLayout();
        }
    }

    public void setMaxWidth(int i8) {
        if (i8 != this.f865f) {
            this.f865f = i8;
            requestLayout();
        }
    }

    public void setMinHeight(int i8) {
        if (i8 != this.e) {
            this.e = i8;
            requestLayout();
        }
    }

    public void setMinWidth(int i8) {
        if (i8 != this.f864d) {
            this.f864d = i8;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(c cVar) {
        v.b bVar = this.f870k;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i8) {
        this.f868i = i8;
        e eVar = this.f863c;
        eVar.y0 = i8;
        s.d.f7138p = eVar.L(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
