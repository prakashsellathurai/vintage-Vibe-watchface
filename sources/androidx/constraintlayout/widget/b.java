package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k3.j;
import org.xmlpull.v1.XmlPullParserException;
import s.g;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f925d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, v.a> f926a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f927b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, a> f928c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f929a;

        /* renamed from: b  reason: collision with root package name */
        public final d f930b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f931c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0011b f932d = new C0011b();
        public final e e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, v.a> f933f = new HashMap<>();

        public final void a(ConstraintLayout.a aVar) {
            C0011b bVar = this.f932d;
            aVar.f883d = bVar.f946g;
            aVar.e = bVar.f948h;
            aVar.f886f = bVar.f950i;
            aVar.f888g = bVar.f952j;
            aVar.f890h = bVar.f953k;
            aVar.f892i = bVar.f954l;
            aVar.f894j = bVar.f955m;
            aVar.f896k = bVar.f956n;
            aVar.f898l = bVar.f957o;
            aVar.f903p = bVar.f958p;
            aVar.f904q = bVar.f959q;
            aVar.r = bVar.r;
            aVar.f905s = bVar.f960s;
            aVar.leftMargin = bVar.C;
            aVar.rightMargin = bVar.D;
            aVar.topMargin = bVar.E;
            aVar.bottomMargin = bVar.F;
            aVar.f909x = bVar.N;
            aVar.y = bVar.M;
            aVar.f907u = bVar.J;
            aVar.w = bVar.L;
            aVar.f910z = bVar.f961t;
            aVar.A = bVar.f962u;
            aVar.f900m = bVar.w;
            aVar.f901n = bVar.f964x;
            aVar.f902o = bVar.y;
            aVar.B = bVar.f963v;
            aVar.P = bVar.f965z;
            aVar.Q = bVar.A;
            aVar.E = bVar.O;
            aVar.D = bVar.P;
            aVar.G = bVar.R;
            aVar.F = bVar.Q;
            aVar.S = bVar.f947g0;
            aVar.T = bVar.f949h0;
            aVar.H = bVar.S;
            aVar.I = bVar.T;
            aVar.L = bVar.U;
            aVar.M = bVar.V;
            aVar.J = bVar.W;
            aVar.K = bVar.X;
            aVar.N = bVar.Y;
            aVar.O = bVar.Z;
            aVar.R = bVar.B;
            aVar.f881c = bVar.f944f;
            aVar.f877a = bVar.f941d;
            aVar.f879b = bVar.e;
            aVar.width = bVar.f937b;
            aVar.height = bVar.f939c;
            String str = bVar.f945f0;
            if (str != null) {
                aVar.U = str;
            }
            aVar.setMarginStart(bVar.H);
            aVar.setMarginEnd(bVar.G);
            aVar.a();
        }

        public final void b(int i8, ConstraintLayout.a aVar) {
            this.f929a = i8;
            int i9 = aVar.f883d;
            C0011b bVar = this.f932d;
            bVar.f946g = i9;
            bVar.f948h = aVar.e;
            bVar.f950i = aVar.f886f;
            bVar.f952j = aVar.f888g;
            bVar.f953k = aVar.f890h;
            bVar.f954l = aVar.f892i;
            bVar.f955m = aVar.f894j;
            bVar.f956n = aVar.f896k;
            bVar.f957o = aVar.f898l;
            bVar.f958p = aVar.f903p;
            bVar.f959q = aVar.f904q;
            bVar.r = aVar.r;
            bVar.f960s = aVar.f905s;
            bVar.f961t = aVar.f910z;
            bVar.f962u = aVar.A;
            bVar.f963v = aVar.B;
            bVar.w = aVar.f900m;
            bVar.f964x = aVar.f901n;
            bVar.y = aVar.f902o;
            bVar.f965z = aVar.P;
            bVar.A = aVar.Q;
            bVar.B = aVar.R;
            bVar.f944f = aVar.f881c;
            bVar.f941d = aVar.f877a;
            bVar.e = aVar.f879b;
            bVar.f937b = aVar.width;
            bVar.f939c = aVar.height;
            bVar.C = aVar.leftMargin;
            bVar.D = aVar.rightMargin;
            bVar.E = aVar.topMargin;
            bVar.F = aVar.bottomMargin;
            bVar.O = aVar.E;
            bVar.P = aVar.D;
            bVar.R = aVar.G;
            bVar.Q = aVar.F;
            bVar.f947g0 = aVar.S;
            bVar.f949h0 = aVar.T;
            bVar.S = aVar.H;
            bVar.T = aVar.I;
            bVar.U = aVar.L;
            bVar.V = aVar.M;
            bVar.W = aVar.J;
            bVar.X = aVar.K;
            bVar.Y = aVar.N;
            bVar.Z = aVar.O;
            bVar.f945f0 = aVar.U;
            bVar.J = aVar.f907u;
            bVar.L = aVar.w;
            bVar.I = aVar.f906t;
            bVar.K = aVar.f908v;
            bVar.N = aVar.f909x;
            bVar.M = aVar.y;
            bVar.G = aVar.getMarginEnd();
            bVar.H = aVar.getMarginStart();
        }

        public final void c(int i8, c.a aVar) {
            b(i8, aVar);
            this.f930b.f972c = aVar.f987m0;
            float f9 = aVar.f990p0;
            e eVar = this.e;
            eVar.f975a = f9;
            eVar.f976b = aVar.f991q0;
            eVar.f977c = aVar.f992r0;
            eVar.f978d = aVar.s0;
            eVar.e = aVar.f993t0;
            eVar.f979f = aVar.u0;
            eVar.f980g = aVar.f994v0;
            eVar.f981h = aVar.f995w0;
            eVar.f982i = aVar.f996x0;
            eVar.f983j = aVar.y0;
            eVar.f985l = aVar.f989o0;
            eVar.f984k = aVar.f988n0;
        }

        public final Object clone() {
            a aVar = new a();
            C0011b bVar = aVar.f932d;
            bVar.getClass();
            C0011b bVar2 = this.f932d;
            bVar.f935a = bVar2.f935a;
            bVar.f937b = bVar2.f937b;
            bVar.f939c = bVar2.f939c;
            bVar.f941d = bVar2.f941d;
            bVar.e = bVar2.e;
            bVar.f944f = bVar2.f944f;
            bVar.f946g = bVar2.f946g;
            bVar.f948h = bVar2.f948h;
            bVar.f950i = bVar2.f950i;
            bVar.f952j = bVar2.f952j;
            bVar.f953k = bVar2.f953k;
            bVar.f954l = bVar2.f954l;
            bVar.f955m = bVar2.f955m;
            bVar.f956n = bVar2.f956n;
            bVar.f957o = bVar2.f957o;
            bVar.f958p = bVar2.f958p;
            bVar.f959q = bVar2.f959q;
            bVar.r = bVar2.r;
            bVar.f960s = bVar2.f960s;
            bVar.f961t = bVar2.f961t;
            bVar.f962u = bVar2.f962u;
            bVar.f963v = bVar2.f963v;
            bVar.w = bVar2.w;
            bVar.f964x = bVar2.f964x;
            bVar.y = bVar2.y;
            bVar.f965z = bVar2.f965z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f936a0 = bVar2.f936a0;
            bVar.f938b0 = bVar2.f938b0;
            bVar.f940c0 = bVar2.f940c0;
            bVar.f945f0 = bVar2.f945f0;
            int[] iArr = bVar2.f942d0;
            if (iArr != null) {
                bVar.f942d0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f942d0 = null;
            }
            bVar.f943e0 = bVar2.f943e0;
            bVar.f947g0 = bVar2.f947g0;
            bVar.f949h0 = bVar2.f949h0;
            bVar.f951i0 = bVar2.f951i0;
            c cVar = aVar.f931c;
            cVar.getClass();
            c cVar2 = this.f931c;
            cVar2.getClass();
            cVar.f966a = cVar2.f966a;
            cVar.f967b = cVar2.f967b;
            cVar.f969d = cVar2.f969d;
            cVar.f968c = cVar2.f968c;
            d dVar = aVar.f930b;
            dVar.getClass();
            d dVar2 = this.f930b;
            dVar2.getClass();
            dVar.f970a = dVar2.f970a;
            dVar.f972c = dVar2.f972c;
            dVar.f973d = dVar2.f973d;
            dVar.f971b = dVar2.f971b;
            e eVar = aVar.e;
            eVar.getClass();
            e eVar2 = this.e;
            eVar2.getClass();
            eVar.f975a = eVar2.f975a;
            eVar.f976b = eVar2.f976b;
            eVar.f977c = eVar2.f977c;
            eVar.f978d = eVar2.f978d;
            eVar.e = eVar2.e;
            eVar.f979f = eVar2.f979f;
            eVar.f980g = eVar2.f980g;
            eVar.f981h = eVar2.f981h;
            eVar.f982i = eVar2.f982i;
            eVar.f983j = eVar2.f983j;
            eVar.f984k = eVar2.f984k;
            eVar.f985l = eVar2.f985l;
            aVar.f929a = this.f929a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0011b {

        /* renamed from: j0  reason: collision with root package name */
        public static final SparseIntArray f934j0;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public float O = -1.0f;
        public float P = -1.0f;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = -1;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public float Y = 1.0f;
        public float Z = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f935a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f936a0 = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f937b;

        /* renamed from: b0  reason: collision with root package name */
        public int f938b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f939c;

        /* renamed from: c0  reason: collision with root package name */
        public int f940c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f941d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public int[] f942d0;
        public int e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public String f943e0;

        /* renamed from: f  reason: collision with root package name */
        public float f944f = -1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public String f945f0;

        /* renamed from: g  reason: collision with root package name */
        public int f946g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public boolean f947g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f948h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f949h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f950i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f951i0 = true;

        /* renamed from: j  reason: collision with root package name */
        public int f952j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f953k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f954l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f955m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f956n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f957o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f958p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f959q = -1;
        public int r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f960s = -1;

        /* renamed from: t  reason: collision with root package name */
        public float f961t = 0.5f;

        /* renamed from: u  reason: collision with root package name */
        public float f962u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public String f963v = null;
        public int w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f964x = 0;
        public float y = 0.0f;

        /* renamed from: z  reason: collision with root package name */
        public int f965z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f934j0 = sparseIntArray;
            sparseIntArray.append(39, 24);
            sparseIntArray.append(40, 25);
            sparseIntArray.append(42, 28);
            sparseIntArray.append(43, 29);
            sparseIntArray.append(48, 35);
            sparseIntArray.append(47, 34);
            sparseIntArray.append(21, 4);
            sparseIntArray.append(20, 3);
            sparseIntArray.append(18, 1);
            sparseIntArray.append(56, 6);
            sparseIntArray.append(57, 7);
            sparseIntArray.append(28, 17);
            sparseIntArray.append(29, 18);
            sparseIntArray.append(30, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(44, 31);
            sparseIntArray.append(45, 32);
            sparseIntArray.append(27, 10);
            sparseIntArray.append(26, 9);
            sparseIntArray.append(60, 13);
            sparseIntArray.append(63, 16);
            sparseIntArray.append(61, 14);
            sparseIntArray.append(58, 11);
            sparseIntArray.append(62, 15);
            sparseIntArray.append(59, 12);
            sparseIntArray.append(51, 38);
            sparseIntArray.append(37, 37);
            sparseIntArray.append(36, 39);
            sparseIntArray.append(50, 40);
            sparseIntArray.append(35, 20);
            sparseIntArray.append(49, 36);
            sparseIntArray.append(25, 5);
            sparseIntArray.append(38, 76);
            sparseIntArray.append(46, 76);
            sparseIntArray.append(41, 76);
            sparseIntArray.append(19, 76);
            sparseIntArray.append(17, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(22, 61);
            sparseIntArray.append(24, 62);
            sparseIntArray.append(23, 63);
            sparseIntArray.append(55, 69);
            sparseIntArray.append(34, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5158m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                SparseIntArray sparseIntArray = f934j0;
                int i9 = sparseIntArray.get(index);
                if (i9 == 80) {
                    this.f947g0 = obtainStyledAttributes.getBoolean(index, this.f947g0);
                } else if (i9 != 81) {
                    switch (i9) {
                        case 1:
                            this.f957o = b.g(obtainStyledAttributes, index, this.f957o);
                            break;
                        case 2:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 3:
                            this.f956n = b.g(obtainStyledAttributes, index, this.f956n);
                            break;
                        case 4:
                            this.f955m = b.g(obtainStyledAttributes, index, this.f955m);
                            break;
                        case 5:
                            this.f963v = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f965z = obtainStyledAttributes.getDimensionPixelOffset(index, this.f965z);
                            break;
                        case 7:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 8:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 9:
                            this.f960s = b.g(obtainStyledAttributes, index, this.f960s);
                            break;
                        case 10:
                            this.r = b.g(obtainStyledAttributes, index, this.r);
                            break;
                        case 11:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 12:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 13:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 14:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 15:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 16:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 17:
                            this.f941d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f941d);
                            break;
                        case 18:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case 19:
                            this.f944f = obtainStyledAttributes.getFloat(index, this.f944f);
                            break;
                        case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                            this.f961t = obtainStyledAttributes.getFloat(index, this.f961t);
                            break;
                        case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                            this.f939c = obtainStyledAttributes.getLayoutDimension(index, this.f939c);
                            break;
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                            this.f937b = obtainStyledAttributes.getLayoutDimension(index, this.f937b);
                            break;
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                            this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                            this.f946g = b.g(obtainStyledAttributes, index, this.f946g);
                            break;
                        case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                            this.f948h = b.g(obtainStyledAttributes, index, this.f948h);
                            break;
                        case EXERCISE_TYPE_EXERCISE_CLASS_VALUE:
                            this.B = obtainStyledAttributes.getInt(index, this.B);
                            break;
                        case 27:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case EXERCISE_TYPE_FRISBEE_DISC_VALUE:
                            this.f950i = b.g(obtainStyledAttributes, index, this.f950i);
                            break;
                        case EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE:
                            this.f952j = b.g(obtainStyledAttributes, index, this.f952j);
                            break;
                        case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
                            this.f958p = b.g(obtainStyledAttributes, index, this.f958p);
                            break;
                        case EXERCISE_TYPE_GOLF_VALUE:
                            this.f959q = b.g(obtainStyledAttributes, index, this.f959q);
                            break;
                        case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case EXERCISE_TYPE_GYMNASTICS_VALUE:
                            this.f954l = b.g(obtainStyledAttributes, index, this.f954l);
                            break;
                        case EXERCISE_TYPE_HANDBALL_VALUE:
                            this.f953k = b.g(obtainStyledAttributes, index, this.f953k);
                            break;
                        case EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE:
                            this.f962u = obtainStyledAttributes.getFloat(index, this.f962u);
                            break;
                        case EXERCISE_TYPE_HIKING_VALUE:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                            this.O = obtainStyledAttributes.getFloat(index, this.O);
                            break;
                        case EXERCISE_TYPE_ICE_SKATING_VALUE:
                            this.Q = obtainStyledAttributes.getInt(index, this.Q);
                            break;
                        case EXERCISE_TYPE_JUMP_ROPE_VALUE:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        default:
                            switch (i9) {
                                case EXERCISE_TYPE_ROWING_MACHINE_VALUE:
                                    this.S = obtainStyledAttributes.getInt(index, this.S);
                                    break;
                                case EXERCISE_TYPE_RUNNING_VALUE:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case EXERCISE_TYPE_RUNNING_TREADMILL_VALUE:
                                    this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                    break;
                                case EXERCISE_TYPE_RUGBY_VALUE:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case EXERCISE_TYPE_SAILING_VALUE:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case EXERCISE_TYPE_SCUBA_DIVING_VALUE:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                default:
                                    switch (i9) {
                                        case EXERCISE_TYPE_SKIING_VALUE:
                                            this.w = b.g(obtainStyledAttributes, index, this.w);
                                            break;
                                        case EXERCISE_TYPE_SNOWBOARDING_VALUE:
                                            this.f964x = obtainStyledAttributes.getDimensionPixelSize(index, this.f964x);
                                            break;
                                        case EXERCISE_TYPE_SNOWSHOEING_VALUE:
                                            this.y = obtainStyledAttributes.getFloat(index, this.y);
                                            break;
                                        default:
                                            switch (i9) {
                                                case EXERCISE_TYPE_STAIR_CLIMBING_MACHINE_VALUE:
                                                    this.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case EXERCISE_TYPE_STRENGTH_TRAINING_VALUE:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case EXERCISE_TYPE_STRETCHING_VALUE:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case EXERCISE_TYPE_SURFING_VALUE:
                                                    this.f936a0 = obtainStyledAttributes.getInt(index, this.f936a0);
                                                    continue;
                                                case EXERCISE_TYPE_SWIMMING_OPEN_WATER_VALUE:
                                                    this.f938b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f938b0);
                                                    continue;
                                                case EXERCISE_TYPE_SWIMMING_POOL_VALUE:
                                                    this.f943e0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case EXERCISE_TYPE_TABLE_TENNIS_VALUE:
                                                    this.f951i0 = obtainStyledAttributes.getBoolean(index, this.f951i0);
                                                    continue;
                                                case EXERCISE_TYPE_TENNIS_VALUE:
                                                    sb = new StringBuilder("unused attribute 0x");
                                                    break;
                                                case EXERCISE_TYPE_UPPER_TWIST_VALUE:
                                                    this.f945f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder("Unknown attribute 0x");
                                                    break;
                                            }
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(sparseIntArray.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f949h0 = obtainStyledAttributes.getBoolean(index, this.f949h0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static final SparseIntArray e;

        /* renamed from: a  reason: collision with root package name */
        public int f966a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f967b = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f968c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f969d = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            e = sparseIntArray;
            sparseIntArray.append(2, 1);
            sparseIntArray.append(4, 2);
            sparseIntArray.append(5, 3);
            sparseIntArray.append(1, 4);
            sparseIntArray.append(0, 5);
            sparseIntArray.append(3, 6);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5159n);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (e.get(index)) {
                    case 1:
                        this.f969d = obtainStyledAttributes.getFloat(index, this.f969d);
                        break;
                    case 2:
                        this.f967b = obtainStyledAttributes.getInt(index, this.f967b);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            String str = j.e[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f966a = b.g(obtainStyledAttributes, index, this.f966a);
                        break;
                    case 6:
                        this.f968c = obtainStyledAttributes.getFloat(index, this.f968c);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f970a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f971b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f972c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f973d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5160o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 1) {
                    this.f972c = obtainStyledAttributes.getFloat(index, this.f972c);
                } else if (index == 0) {
                    int i9 = obtainStyledAttributes.getInt(index, this.f970a);
                    this.f970a = i9;
                    this.f970a = b.f925d[i9];
                } else if (index == 4) {
                    this.f971b = obtainStyledAttributes.getInt(index, this.f971b);
                } else if (index == 3) {
                    this.f973d = obtainStyledAttributes.getFloat(index, this.f973d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: m  reason: collision with root package name */
        public static final SparseIntArray f974m;

        /* renamed from: a  reason: collision with root package name */
        public float f975a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f976b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f977c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f978d = 1.0f;
        public float e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f979f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f980g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f981h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f982i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f983j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public boolean f984k = false;

        /* renamed from: l  reason: collision with root package name */
        public float f985l = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f974m = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5162q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (f974m.get(index)) {
                    case 1:
                        this.f975a = obtainStyledAttributes.getFloat(index, this.f975a);
                        break;
                    case 2:
                        this.f976b = obtainStyledAttributes.getFloat(index, this.f976b);
                        break;
                    case 3:
                        this.f977c = obtainStyledAttributes.getFloat(index, this.f977c);
                        break;
                    case 4:
                        this.f978d = obtainStyledAttributes.getFloat(index, this.f978d);
                        break;
                    case 5:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 6:
                        this.f979f = obtainStyledAttributes.getDimension(index, this.f979f);
                        break;
                    case 7:
                        this.f980g = obtainStyledAttributes.getDimension(index, this.f980g);
                        break;
                    case 8:
                        this.f981h = obtainStyledAttributes.getDimension(index, this.f981h);
                        break;
                    case 9:
                        this.f982i = obtainStyledAttributes.getDimension(index, this.f982i);
                        break;
                    case 10:
                        this.f983j = obtainStyledAttributes.getDimension(index, this.f983j);
                        break;
                    case 11:
                        this.f984k = true;
                        this.f985l = obtainStyledAttributes.getDimension(index, this.f985l);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(102, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(107, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(104, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(103, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(105, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    public static int[] d(View view, String str) {
        int i8;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i9 = 0;
        int i10 = 0;
        while (i9 < split.length) {
            String trim = split[i9].trim();
            Integer num = null;
            try {
                i8 = v.d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i8 = 0;
            }
            if (i8 == 0) {
                i8 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i8 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f872m) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f872m.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i8 = num.intValue();
                }
            }
            iArr[i10] = i8;
            i9++;
            i10++;
        }
        return i10 != split.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e3, code lost:
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0378, code lost:
        r4.append(java.lang.Integer.toHexString(r3));
        r4.append("   ");
        r4.append(r9.get(r3));
        android.util.Log.w("ConstraintSet", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0392, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.widget.b.a e(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
            r0.<init>()
            int[] r1 = k3.j.f5154i
            android.content.res.TypedArray r13 = r13.obtainStyledAttributes(r14, r1)
            int r14 = r13.getIndexCount()
            r1 = 0
            r2 = r1
        L_0x0011:
            if (r2 >= r14) goto L_0x0396
            int r3 = r13.getIndex(r2)
            r4 = 1
            androidx.constraintlayout.widget.b$d r5 = r0.f930b
            androidx.constraintlayout.widget.b$c r6 = r0.f931c
            androidx.constraintlayout.widget.b$e r7 = r0.e
            androidx.constraintlayout.widget.b$b r8 = r0.f932d
            if (r3 == r4) goto L_0x0036
            r9 = 23
            if (r9 == r3) goto L_0x0036
            r9 = 24
            if (r9 == r3) goto L_0x0036
            r6.getClass()
            r8.getClass()
            r5.getClass()
            r7.getClass()
        L_0x0036:
            android.util.SparseIntArray r9 = e
            int r10 = r9.get(r3)
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "ConstraintSet"
            switch(r10) {
                case 1: goto L_0x036f;
                case 2: goto L_0x0366;
                case 3: goto L_0x035d;
                case 4: goto L_0x0354;
                case 5: goto L_0x034d;
                case 6: goto L_0x0344;
                case 7: goto L_0x033b;
                case 8: goto L_0x0332;
                case 9: goto L_0x0329;
                case 10: goto L_0x0320;
                case 11: goto L_0x0316;
                case 12: goto L_0x030c;
                case 13: goto L_0x0302;
                case 14: goto L_0x02f8;
                case 15: goto L_0x02ee;
                case 16: goto L_0x02e4;
                case 17: goto L_0x02da;
                case 18: goto L_0x02d0;
                case 19: goto L_0x02c6;
                case 20: goto L_0x02bc;
                case 21: goto L_0x02b2;
                case 22: goto L_0x02a4;
                case 23: goto L_0x029a;
                case 24: goto L_0x0290;
                case 25: goto L_0x0286;
                case 26: goto L_0x027c;
                case 27: goto L_0x0272;
                case 28: goto L_0x0268;
                case 29: goto L_0x025e;
                case 30: goto L_0x0254;
                case 31: goto L_0x024a;
                case 32: goto L_0x0240;
                case 33: goto L_0x0236;
                case 34: goto L_0x022c;
                case 35: goto L_0x0222;
                case 36: goto L_0x0218;
                case 37: goto L_0x020e;
                case 38: goto L_0x0204;
                case 39: goto L_0x01fa;
                case 40: goto L_0x01f0;
                case 41: goto L_0x01e6;
                case 42: goto L_0x01dc;
                case 43: goto L_0x01d2;
                case 44: goto L_0x01c6;
                case 45: goto L_0x01bc;
                case 46: goto L_0x01b2;
                case 47: goto L_0x01a8;
                case 48: goto L_0x019e;
                case 49: goto L_0x0194;
                case 50: goto L_0x018a;
                case 51: goto L_0x0180;
                case 52: goto L_0x0176;
                case 53: goto L_0x016c;
                case 54: goto L_0x0162;
                case 55: goto L_0x0158;
                case 56: goto L_0x014e;
                case 57: goto L_0x0144;
                case 58: goto L_0x013a;
                case 59: goto L_0x0130;
                case 60: goto L_0x0126;
                case 61: goto L_0x011c;
                case 62: goto L_0x0112;
                case 63: goto L_0x0108;
                case 64: goto L_0x00fe;
                case 65: goto L_0x00e8;
                case 66: goto L_0x00e0;
                case 67: goto L_0x00d6;
                case 68: goto L_0x00cc;
                case 69: goto L_0x00c4;
                case 70: goto L_0x00bc;
                case 71: goto L_0x00b5;
                case 72: goto L_0x00ab;
                case 73: goto L_0x00a1;
                case 74: goto L_0x0099;
                case 75: goto L_0x008f;
                case 76: goto L_0x0085;
                case 77: goto L_0x007d;
                case 78: goto L_0x0073;
                case 79: goto L_0x0069;
                case 80: goto L_0x005f;
                case 81: goto L_0x0055;
                case 82: goto L_0x004c;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unknown attribute 0x"
            r4.<init>(r5)
            goto L_0x0378
        L_0x004c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "unused attribute 0x"
            r4.<init>(r5)
            goto L_0x0378
        L_0x0055:
            boolean r4 = r8.f949h0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f949h0 = r3
            goto L_0x0392
        L_0x005f:
            boolean r4 = r8.f947g0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f947g0 = r3
            goto L_0x0392
        L_0x0069:
            float r4 = r6.f968c
            float r3 = r13.getFloat(r3, r4)
            r6.f968c = r3
            goto L_0x0392
        L_0x0073:
            int r4 = r5.f971b
            int r3 = r13.getInt(r3, r4)
            r5.f971b = r3
            goto L_0x0392
        L_0x007d:
            java.lang.String r3 = r13.getString(r3)
            r8.f945f0 = r3
            goto L_0x0392
        L_0x0085:
            int r4 = r6.f967b
            int r3 = r13.getInt(r3, r4)
            r6.f967b = r3
            goto L_0x0392
        L_0x008f:
            boolean r4 = r8.f951i0
            boolean r3 = r13.getBoolean(r3, r4)
            r8.f951i0 = r3
            goto L_0x0392
        L_0x0099:
            java.lang.String r3 = r13.getString(r3)
            r8.f943e0 = r3
            goto L_0x0392
        L_0x00a1:
            int r4 = r8.f938b0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.f938b0 = r3
            goto L_0x0392
        L_0x00ab:
            int r4 = r8.f936a0
            int r3 = r13.getInt(r3, r4)
            r8.f936a0 = r3
            goto L_0x0392
        L_0x00b5:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r12, r3)
            goto L_0x0392
        L_0x00bc:
            float r3 = r13.getFloat(r3, r11)
            r8.Z = r3
            goto L_0x0392
        L_0x00c4:
            float r3 = r13.getFloat(r3, r11)
            r8.Y = r3
            goto L_0x0392
        L_0x00cc:
            float r4 = r5.f973d
            float r3 = r13.getFloat(r3, r4)
            r5.f973d = r3
            goto L_0x0392
        L_0x00d6:
            float r4 = r6.f969d
            float r3 = r13.getFloat(r3, r4)
            r6.f969d = r3
            goto L_0x0392
        L_0x00e0:
            r13.getInt(r3, r1)
        L_0x00e3:
            r6.getClass()
            goto L_0x0392
        L_0x00e8:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 3
            if (r4 != r5) goto L_0x00f5
            r13.getString(r3)
            goto L_0x00e3
        L_0x00f5:
            java.lang.String[] r4 = k3.j.e
            int r3 = r13.getInteger(r3, r1)
            r3 = r4[r3]
            goto L_0x00e3
        L_0x00fe:
            int r4 = r6.f966a
            int r3 = g(r13, r3, r4)
            r6.f966a = r3
            goto L_0x0392
        L_0x0108:
            float r4 = r8.y
            float r3 = r13.getFloat(r3, r4)
            r8.y = r3
            goto L_0x0392
        L_0x0112:
            int r4 = r8.f964x
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.f964x = r3
            goto L_0x0392
        L_0x011c:
            int r4 = r8.w
            int r3 = g(r13, r3, r4)
            r8.w = r3
            goto L_0x0392
        L_0x0126:
            float r4 = r7.f975a
            float r3 = r13.getFloat(r3, r4)
            r7.f975a = r3
            goto L_0x0392
        L_0x0130:
            int r4 = r8.X
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.X = r3
            goto L_0x0392
        L_0x013a:
            int r4 = r8.W
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.W = r3
            goto L_0x0392
        L_0x0144:
            int r4 = r8.V
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.V = r3
            goto L_0x0392
        L_0x014e:
            int r4 = r8.U
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.U = r3
            goto L_0x0392
        L_0x0158:
            int r4 = r8.T
            int r3 = r13.getInt(r3, r4)
            r8.T = r3
            goto L_0x0392
        L_0x0162:
            int r4 = r8.S
            int r3 = r13.getInt(r3, r4)
            r8.S = r3
            goto L_0x0392
        L_0x016c:
            float r4 = r7.f983j
            float r3 = r13.getDimension(r3, r4)
            r7.f983j = r3
            goto L_0x0392
        L_0x0176:
            float r4 = r7.f982i
            float r3 = r13.getDimension(r3, r4)
            r7.f982i = r3
            goto L_0x0392
        L_0x0180:
            float r4 = r7.f981h
            float r3 = r13.getDimension(r3, r4)
            r7.f981h = r3
            goto L_0x0392
        L_0x018a:
            float r4 = r7.f980g
            float r3 = r13.getDimension(r3, r4)
            r7.f980g = r3
            goto L_0x0392
        L_0x0194:
            float r4 = r7.f979f
            float r3 = r13.getDimension(r3, r4)
            r7.f979f = r3
            goto L_0x0392
        L_0x019e:
            float r4 = r7.e
            float r3 = r13.getFloat(r3, r4)
            r7.e = r3
            goto L_0x0392
        L_0x01a8:
            float r4 = r7.f978d
            float r3 = r13.getFloat(r3, r4)
            r7.f978d = r3
            goto L_0x0392
        L_0x01b2:
            float r4 = r7.f977c
            float r3 = r13.getFloat(r3, r4)
            r7.f977c = r3
            goto L_0x0392
        L_0x01bc:
            float r4 = r7.f976b
            float r3 = r13.getFloat(r3, r4)
            r7.f976b = r3
            goto L_0x0392
        L_0x01c6:
            r7.f984k = r4
            float r4 = r7.f985l
            float r3 = r13.getDimension(r3, r4)
            r7.f985l = r3
            goto L_0x0392
        L_0x01d2:
            float r4 = r5.f972c
            float r3 = r13.getFloat(r3, r4)
            r5.f972c = r3
            goto L_0x0392
        L_0x01dc:
            int r4 = r8.R
            int r3 = r13.getInt(r3, r4)
            r8.R = r3
            goto L_0x0392
        L_0x01e6:
            int r4 = r8.Q
            int r3 = r13.getInt(r3, r4)
            r8.Q = r3
            goto L_0x0392
        L_0x01f0:
            float r4 = r8.O
            float r3 = r13.getFloat(r3, r4)
            r8.O = r3
            goto L_0x0392
        L_0x01fa:
            float r4 = r8.P
            float r3 = r13.getFloat(r3, r4)
            r8.P = r3
            goto L_0x0392
        L_0x0204:
            int r4 = r0.f929a
            int r3 = r13.getResourceId(r3, r4)
            r0.f929a = r3
            goto L_0x0392
        L_0x020e:
            float r4 = r8.f962u
            float r3 = r13.getFloat(r3, r4)
            r8.f962u = r3
            goto L_0x0392
        L_0x0218:
            int r4 = r8.f953k
            int r3 = g(r13, r3, r4)
            r8.f953k = r3
            goto L_0x0392
        L_0x0222:
            int r4 = r8.f954l
            int r3 = g(r13, r3, r4)
            r8.f954l = r3
            goto L_0x0392
        L_0x022c:
            int r4 = r8.E
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.E = r3
            goto L_0x0392
        L_0x0236:
            int r4 = r8.f959q
            int r3 = g(r13, r3, r4)
            r8.f959q = r3
            goto L_0x0392
        L_0x0240:
            int r4 = r8.f958p
            int r3 = g(r13, r3, r4)
            r8.f958p = r3
            goto L_0x0392
        L_0x024a:
            int r4 = r8.H
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.H = r3
            goto L_0x0392
        L_0x0254:
            int r4 = r8.f952j
            int r3 = g(r13, r3, r4)
            r8.f952j = r3
            goto L_0x0392
        L_0x025e:
            int r4 = r8.f950i
            int r3 = g(r13, r3, r4)
            r8.f950i = r3
            goto L_0x0392
        L_0x0268:
            int r4 = r8.D
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.D = r3
            goto L_0x0392
        L_0x0272:
            int r4 = r8.B
            int r3 = r13.getInt(r3, r4)
            r8.B = r3
            goto L_0x0392
        L_0x027c:
            int r4 = r8.f948h
            int r3 = g(r13, r3, r4)
            r8.f948h = r3
            goto L_0x0392
        L_0x0286:
            int r4 = r8.f946g
            int r3 = g(r13, r3, r4)
            r8.f946g = r3
            goto L_0x0392
        L_0x0290:
            int r4 = r8.C
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.C = r3
            goto L_0x0392
        L_0x029a:
            int r4 = r8.f937b
            int r3 = r13.getLayoutDimension(r3, r4)
            r8.f937b = r3
            goto L_0x0392
        L_0x02a4:
            int r4 = r5.f970a
            int r3 = r13.getInt(r3, r4)
            int[] r4 = f925d
            r3 = r4[r3]
            r5.f970a = r3
            goto L_0x0392
        L_0x02b2:
            int r4 = r8.f939c
            int r3 = r13.getLayoutDimension(r3, r4)
            r8.f939c = r3
            goto L_0x0392
        L_0x02bc:
            float r4 = r8.f961t
            float r3 = r13.getFloat(r3, r4)
            r8.f961t = r3
            goto L_0x0392
        L_0x02c6:
            float r4 = r8.f944f
            float r3 = r13.getFloat(r3, r4)
            r8.f944f = r3
            goto L_0x0392
        L_0x02d0:
            int r4 = r8.e
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.e = r3
            goto L_0x0392
        L_0x02da:
            int r4 = r8.f941d
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.f941d = r3
            goto L_0x0392
        L_0x02e4:
            int r4 = r8.J
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.J = r3
            goto L_0x0392
        L_0x02ee:
            int r4 = r8.N
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.N = r3
            goto L_0x0392
        L_0x02f8:
            int r4 = r8.K
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.K = r3
            goto L_0x0392
        L_0x0302:
            int r4 = r8.I
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.I = r3
            goto L_0x0392
        L_0x030c:
            int r4 = r8.M
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.M = r3
            goto L_0x0392
        L_0x0316:
            int r4 = r8.L
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.L = r3
            goto L_0x0392
        L_0x0320:
            int r4 = r8.r
            int r3 = g(r13, r3, r4)
            r8.r = r3
            goto L_0x0392
        L_0x0329:
            int r4 = r8.f960s
            int r3 = g(r13, r3, r4)
            r8.f960s = r3
            goto L_0x0392
        L_0x0332:
            int r4 = r8.G
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.G = r3
            goto L_0x0392
        L_0x033b:
            int r4 = r8.A
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.A = r3
            goto L_0x0392
        L_0x0344:
            int r4 = r8.f965z
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r8.f965z = r3
            goto L_0x0392
        L_0x034d:
            java.lang.String r3 = r13.getString(r3)
            r8.f963v = r3
            goto L_0x0392
        L_0x0354:
            int r4 = r8.f955m
            int r3 = g(r13, r3, r4)
            r8.f955m = r3
            goto L_0x0392
        L_0x035d:
            int r4 = r8.f956n
            int r3 = g(r13, r3, r4)
            r8.f956n = r3
            goto L_0x0392
        L_0x0366:
            int r4 = r8.F
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r8.F = r3
            goto L_0x0392
        L_0x036f:
            int r4 = r8.f957o
            int r3 = g(r13, r3, r4)
            r8.f957o = r3
            goto L_0x0392
        L_0x0378:
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            java.lang.String r5 = "   "
            r4.append(r5)
            int r3 = r9.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r12, r3)
        L_0x0392:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0396:
            r13.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.e(android.content.Context, android.util.AttributeSet):androidx.constraintlayout.widget.b$a");
    }

    public static int g(TypedArray typedArray, int i8, int i9) {
        int resourceId = typedArray.getResourceId(i8, i9);
        return resourceId == -1 ? typedArray.getInt(i8, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int i8;
        ConstraintLayout constraintLayout2;
        int i9;
        HashMap<String, v.a> hashMap;
        StringBuilder sb;
        String str;
        b bVar = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap2 = bVar.f928c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i10 = 0;
        while (i10 < i8) {
            View childAt = constraintLayout3.getChildAt(i10);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                Log.w("ConstraintSet", sb2.toString());
            } else if (bVar.f927b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && hashMap2.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                a aVar = hashMap2.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    aVar.f932d.f940c0 = 1;
                }
                int i11 = aVar.f932d.f940c0;
                if (i11 != -1 && i11 == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    C0011b bVar2 = aVar.f932d;
                    barrier.setType(bVar2.f936a0);
                    barrier.setMargin(bVar2.f938b0);
                    barrier.setAllowsGoneWidget(bVar2.f951i0);
                    int[] iArr = bVar2.f942d0;
                    if (iArr != null) {
                        barrier.setReferencedIds(iArr);
                    } else {
                        String str2 = bVar2.f943e0;
                        if (str2 != null) {
                            int[] d9 = d(barrier, str2);
                            bVar2.f942d0 = d9;
                            barrier.setReferencedIds(d9);
                        }
                    }
                }
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                aVar2.a();
                aVar.a(aVar2);
                HashMap<String, v.a> hashMap3 = aVar.f933f;
                Class<?> cls = childAt.getClass();
                for (String next : hashMap3.keySet()) {
                    v.a aVar3 = hashMap3.get(next);
                    int i12 = i8;
                    String str3 = "set" + next;
                    try {
                        switch (g.b(aVar3.f7815a)) {
                            case 0:
                                hashMap = hashMap3;
                                Class[] clsArr = new Class[1];
                                try {
                                    clsArr[0] = Integer.TYPE;
                                    cls.getMethod(str3, clsArr).invoke(childAt, new Object[]{Integer.valueOf(aVar3.f7816b)});
                                } catch (NoSuchMethodException e4) {
                                    e = e4;
                                    break;
                                } catch (IllegalAccessException e9) {
                                    e = e9;
                                    sb = new StringBuilder(" Custom Attribute \"");
                                    sb.append(next);
                                    sb.append("\" not found on ");
                                    sb.append(cls.getName());
                                    Log.e("TransitionLayout", sb.toString());
                                    e.printStackTrace();
                                    ConstraintLayout constraintLayout4 = constraintLayout;
                                    i8 = i12;
                                    hashMap3 = hashMap;
                                } catch (InvocationTargetException e10) {
                                    e = e10;
                                    sb = new StringBuilder(" Custom Attribute \"");
                                    sb.append(next);
                                    sb.append("\" not found on ");
                                    sb.append(cls.getName());
                                    Log.e("TransitionLayout", sb.toString());
                                    e.printStackTrace();
                                    ConstraintLayout constraintLayout42 = constraintLayout;
                                    i8 = i12;
                                    hashMap3 = hashMap;
                                }
                            case 1:
                                hashMap = hashMap3;
                                cls.getMethod(str3, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(aVar3.f7817c)});
                                break;
                            case 2:
                                hashMap = hashMap3;
                                cls.getMethod(str3, new Class[]{Integer.TYPE}).invoke(childAt, new Object[]{Integer.valueOf(aVar3.f7819f)});
                                break;
                            case 3:
                                hashMap = hashMap3;
                                Method method = cls.getMethod(str3, new Class[]{Drawable.class});
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(aVar3.f7819f);
                                method.invoke(childAt, new Object[]{colorDrawable});
                                break;
                            case 4:
                                hashMap = hashMap3;
                                cls.getMethod(str3, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{aVar3.f7818d});
                                break;
                            case 5:
                                hashMap = hashMap3;
                                cls.getMethod(str3, new Class[]{Boolean.TYPE}).invoke(childAt, new Object[]{Boolean.valueOf(aVar3.e)});
                                break;
                            case 6:
                                hashMap = hashMap3;
                                try {
                                    cls.getMethod(str3, new Class[]{Float.TYPE}).invoke(childAt, new Object[]{Float.valueOf(aVar3.f7817c)});
                                } catch (NoSuchMethodException e11) {
                                    e = e11;
                                    Log.e("TransitionLayout", e.getMessage());
                                    Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                    Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                    ConstraintLayout constraintLayout422 = constraintLayout;
                                    i8 = i12;
                                    hashMap3 = hashMap;
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    sb = new StringBuilder(" Custom Attribute \"");
                                    sb.append(next);
                                    sb.append("\" not found on ");
                                    sb.append(cls.getName());
                                    Log.e("TransitionLayout", sb.toString());
                                    e.printStackTrace();
                                    ConstraintLayout constraintLayout4222 = constraintLayout;
                                    i8 = i12;
                                    hashMap3 = hashMap;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    sb = new StringBuilder(" Custom Attribute \"");
                                    sb.append(next);
                                    sb.append("\" not found on ");
                                    sb.append(cls.getName());
                                    Log.e("TransitionLayout", sb.toString());
                                    e.printStackTrace();
                                    ConstraintLayout constraintLayout42222 = constraintLayout;
                                    i8 = i12;
                                    hashMap3 = hashMap;
                                }
                            default:
                                ConstraintLayout constraintLayout5 = constraintLayout;
                                i8 = i12;
                                break;
                        }
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        hashMap = hashMap3;
                        Log.e("TransitionLayout", e.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                        ConstraintLayout constraintLayout422222 = constraintLayout;
                        i8 = i12;
                        hashMap3 = hashMap;
                    } catch (IllegalAccessException e15) {
                        e = e15;
                        hashMap = hashMap3;
                        sb = new StringBuilder(" Custom Attribute \"");
                        sb.append(next);
                        sb.append("\" not found on ");
                        sb.append(cls.getName());
                        Log.e("TransitionLayout", sb.toString());
                        e.printStackTrace();
                        ConstraintLayout constraintLayout4222222 = constraintLayout;
                        i8 = i12;
                        hashMap3 = hashMap;
                    } catch (InvocationTargetException e16) {
                        e = e16;
                        hashMap = hashMap3;
                        sb = new StringBuilder(" Custom Attribute \"");
                        sb.append(next);
                        sb.append("\" not found on ");
                        sb.append(cls.getName());
                        Log.e("TransitionLayout", sb.toString());
                        e.printStackTrace();
                        ConstraintLayout constraintLayout42222222 = constraintLayout;
                        i8 = i12;
                        hashMap3 = hashMap;
                    }
                }
                i9 = i8;
                childAt.setLayoutParams(aVar2);
                d dVar = aVar.f930b;
                if (dVar.f971b == 0) {
                    childAt.setVisibility(dVar.f970a);
                }
                childAt.setAlpha(dVar.f972c);
                e eVar = aVar.e;
                childAt.setRotation(eVar.f975a);
                childAt.setRotationX(eVar.f976b);
                childAt.setRotationY(eVar.f977c);
                childAt.setScaleX(eVar.f978d);
                childAt.setScaleY(eVar.e);
                if (!Float.isNaN(eVar.f979f)) {
                    childAt.setPivotX(eVar.f979f);
                }
                if (!Float.isNaN(eVar.f980g)) {
                    childAt.setPivotY(eVar.f980g);
                }
                childAt.setTranslationX(eVar.f981h);
                childAt.setTranslationY(eVar.f982i);
                childAt.setTranslationZ(eVar.f983j);
                if (eVar.f984k) {
                    childAt.setElevation(eVar.f985l);
                }
                i10++;
                bVar = this;
                constraintLayout3 = constraintLayout;
                childCount = i9;
            }
            i9 = i8;
            i10++;
            bVar = this;
            constraintLayout3 = constraintLayout;
            childCount = i9;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar4 = hashMap2.get(num);
            C0011b bVar3 = aVar4.f932d;
            int i13 = bVar3.f940c0;
            if (i13 == -1) {
                constraintLayout2 = constraintLayout;
            } else if (i13 != 1) {
                constraintLayout2 = constraintLayout;
            } else {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar3.f942d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str4 = bVar3.f943e0;
                    if (str4 != null) {
                        int[] d10 = d(barrier2, str4);
                        bVar3.f942d0 = d10;
                        barrier2.setReferencedIds(d10);
                    }
                }
                barrier2.setType(bVar3.f936a0);
                barrier2.setMargin(bVar3.f938b0);
                int i14 = ConstraintLayout.r;
                ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                barrier2.h();
                aVar4.a(aVar5);
                constraintLayout2 = constraintLayout;
                constraintLayout2.addView(barrier2, aVar5);
            }
            if (bVar3.f935a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                int i15 = ConstraintLayout.r;
                ConstraintLayout.a aVar6 = new ConstraintLayout.a();
                aVar4.a(aVar6);
                constraintLayout2.addView(guideline, aVar6);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i8;
        v.a aVar;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = bVar.f928c;
        hashMap.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f927b || id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new a());
                }
                a aVar3 = hashMap.get(Integer.valueOf(id));
                HashMap<String, v.a> hashMap2 = bVar.f926a;
                HashMap<String, v.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String next : hashMap2.keySet()) {
                    v.a aVar4 = hashMap2.get(next);
                    try {
                        if (next.equals("BackgroundColor")) {
                            aVar = new v.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i8 = childCount;
                        } else {
                            i8 = childCount;
                            try {
                                aVar = new v.a(aVar4, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i8;
                            }
                        }
                        hashMap3.put(next, aVar);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
                        e = e9;
                        i8 = childCount;
                        e.printStackTrace();
                        childCount = i8;
                    }
                    childCount = i8;
                }
                int i10 = childCount;
                aVar3.f933f = hashMap3;
                aVar3.b(id, aVar2);
                int visibility = childAt.getVisibility();
                d dVar = aVar3.f930b;
                dVar.f970a = visibility;
                dVar.f972c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar3.e;
                eVar.f975a = rotation;
                eVar.f976b = childAt.getRotationX();
                eVar.f977c = childAt.getRotationY();
                eVar.f978d = childAt.getScaleX();
                eVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    eVar.f979f = pivotX;
                    eVar.f980g = pivotY;
                }
                eVar.f981h = childAt.getTranslationX();
                eVar.f982i = childAt.getTranslationY();
                eVar.f983j = childAt.getTranslationZ();
                if (eVar.f984k) {
                    eVar.f985l = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean z8 = barrier.f860j.f7282p0;
                    C0011b bVar2 = aVar3.f932d;
                    bVar2.f951i0 = z8;
                    bVar2.f942d0 = barrier.getReferencedIds();
                    bVar2.f936a0 = barrier.getType();
                    bVar2.f938b0 = barrier.getMargin();
                }
                i9++;
                bVar = this;
                childCount = i10;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void c(float f9, int i8, int i9, int i10) {
        HashMap<Integer, a> hashMap = this.f928c;
        if (!hashMap.containsKey(Integer.valueOf(i8))) {
            hashMap.put(Integer.valueOf(i8), new a());
        }
        C0011b bVar = hashMap.get(Integer.valueOf(i8)).f932d;
        bVar.w = i9;
        bVar.f964x = i10;
        bVar.y = f9;
    }

    public final void f(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e4 = e(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        e4.f932d.f935a = true;
                    }
                    this.f928c.put(Integer.valueOf(e4.f929a), e4);
                }
            }
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
