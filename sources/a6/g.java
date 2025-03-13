package a6;

import a1.a;
import android.util.Log;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public final class g extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f180c = Arrays.asList(new String[]{"round", "floor", "ceil", "fract", "sin", "cos", "tan", "asin", "acos", "atan", "abs", "clamp", "rand", "log", "log2", "log10", "sqrt", "cbrt", "exp", "expm1", "deg", "rad", "pow", "numberFormat", "subText", "textLength"});

    /* renamed from: b  reason: collision with root package name */
    public final String f181b;

    public g(String str) {
        super(11);
        this.f181b = str;
    }

    public final void c(Stack<a> stack, List<a> list) {
        stack.add(this);
    }

    public final a j(Stack<a> stack) {
        String str = this.f181b;
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1868540019:
                if (str.equals("subText")) {
                    c9 = 0;
                    break;
                }
                break;
            case 96370:
                if (str.equals("abs")) {
                    c9 = 1;
                    break;
                }
                break;
            case 98695:
                if (str.equals("cos")) {
                    c9 = 2;
                    break;
                }
                break;
            case 99334:
                if (str.equals("deg")) {
                    c9 = 3;
                    break;
                }
                break;
            case 100893:
                if (str.equals("exp")) {
                    c9 = 4;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c9 = 5;
                    break;
                }
                break;
            case 111192:
                if (str.equals("pow")) {
                    c9 = 6;
                    break;
                }
                break;
            case 112661:
                if (str.equals("rad")) {
                    c9 = 7;
                    break;
                }
                break;
            case 113880:
                if (str.equals("sin")) {
                    c9 = 8;
                    break;
                }
                break;
            case 114593:
                if (str.equals("tan")) {
                    c9 = 9;
                    break;
                }
                break;
            case 2988422:
                if (str.equals("acos")) {
                    c9 = 10;
                    break;
                }
                break;
            case 3003607:
                if (str.equals("asin")) {
                    c9 = 11;
                    break;
                }
                break;
            case 3004320:
                if (str.equals("atan")) {
                    c9 = 12;
                    break;
                }
                break;
            case 3047137:
                if (str.equals("cbrt")) {
                    c9 = 13;
                    break;
                }
                break;
            case 3049733:
                if (str.equals("ceil")) {
                    c9 = 14;
                    break;
                }
                break;
            case 3327342:
                if (str.equals("log2")) {
                    c9 = 15;
                    break;
                }
                break;
            case 3492901:
                if (str.equals("rand")) {
                    c9 = 16;
                    break;
                }
                break;
            case 3538208:
                if (str.equals("sqrt")) {
                    c9 = 17;
                    break;
                }
                break;
            case 94742715:
                if (str.equals("clamp")) {
                    c9 = 18;
                    break;
                }
                break;
            case 96961601:
                if (str.equals("expm1")) {
                    c9 = 19;
                    break;
                }
                break;
            case 97526796:
                if (str.equals("floor")) {
                    c9 = 20;
                    break;
                }
                break;
            case 97691718:
                if (str.equals("fract")) {
                    c9 = 21;
                    break;
                }
                break;
            case 103147619:
                if (str.equals("log10")) {
                    c9 = 22;
                    break;
                }
                break;
            case 108704142:
                if (str.equals("round")) {
                    c9 = 23;
                    break;
                }
                break;
            case 678716576:
                if (str.equals("numberFormat")) {
                    c9 = 24;
                    break;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    c9 = 25;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                try {
                    String k8 = stack.pop().k();
                    return new m(k8.substring(a.l(stack.pop().f(), 0, k8.length()), a.l(stack.pop().f(), 0, k8.length())));
                } catch (EmptyStackException unused) {
                    Log.e("DWF:TokenFunction", str.concat(" got wrong parameters"));
                    return new m("parse error");
                }
            case 1:
                return new e(Double.valueOf(Math.abs(stack.pop().d())));
            case 2:
                return new e(Double.valueOf(Math.cos(stack.pop().d())));
            case 3:
                return new e(Double.valueOf(Math.toDegrees(stack.pop().d())));
            case 4:
                return new e(Double.valueOf(Math.exp(stack.pop().d())));
            case 5:
                return new e(Double.valueOf(Math.log(stack.pop().d())));
            case 6:
                return new e(Double.valueOf(Math.pow(stack.pop().d(), stack.pop().d())));
            case 7:
                return new e(Double.valueOf(Math.toRadians(stack.pop().d())));
            case 8:
                return new e(Double.valueOf(Math.sin(stack.pop().d())));
            case 9:
                return new e(Double.valueOf(Math.tan(stack.pop().d())));
            case 10:
                return new e(Double.valueOf(Math.acos(stack.pop().d())));
            case 11:
                return new e(Double.valueOf(Math.asin(stack.pop().d())));
            case 12:
                return new e(Double.valueOf(Math.atan(stack.pop().d())));
            case 13:
                return new e(Double.valueOf(Math.cbrt(stack.pop().d())));
            case 14:
                return new e(Double.valueOf(Math.ceil(stack.pop().d())));
            case 15:
                return new e(Double.valueOf(Math.log10(stack.pop().d()) / Math.log10(2.0d)));
            case 16:
                a pop = stack.pop();
                return new e(Double.valueOf((Math.random() * (stack.pop().d() - pop.d())) + pop.d()));
            case 17:
                return new e(Double.valueOf(Math.sqrt(stack.pop().d())));
            case 18:
                double d9 = stack.pop().d();
                double d10 = stack.pop().d();
                double d11 = stack.pop().d();
                if (d9 < d10) {
                    d9 = d10;
                } else if (d9 > d11) {
                    d9 = d11;
                }
                return new e(Double.valueOf(d9));
            case 19:
                return new e(Double.valueOf(Math.expm1(stack.pop().d())));
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                return new e(Double.valueOf(Math.floor(stack.pop().d())));
            case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                BigDecimal bigDecimal = new BigDecimal(stack.pop().k());
                return new e(Double.valueOf(bigDecimal.subtract(new BigDecimal(bigDecimal.intValue())).doubleValue()));
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                return new e(Double.valueOf(Math.log10(stack.pop().d())));
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                return new j(Long.valueOf(Math.round(stack.pop().d())));
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                return new m(new DecimalFormat(stack.pop().k()).format(stack.pop().d()));
            case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                return new i(Integer.valueOf(stack.pop().k().length()));
            default:
                return this;
        }
    }
}
