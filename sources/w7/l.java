package w7;

import k3.j;
import q7.k;
import t7.a;
import t7.c;

public class l extends i {
    public static final int p(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int q(int i8, CharSequence charSequence, String str, boolean z8) {
        k.e(charSequence, "<this>");
        k.e(str, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i8);
        }
        return r(charSequence, str, i8, charSequence.length(), z8, false);
    }

    public static final int r(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9) {
        a aVar;
        if (!z9) {
            if (i8 < 0) {
                i8 = 0;
            }
            int length = charSequence.length();
            if (i9 > length) {
                i9 = length;
            }
            aVar = new c(i8, i9);
        } else {
            int p8 = p(charSequence);
            if (i8 > p8) {
                i8 = p8;
            }
            if (i9 < 0) {
                i9 = 0;
            }
            aVar = new a(i8, i9, -1);
        }
        boolean z10 = charSequence instanceof String;
        int i10 = aVar.f7534f;
        int i11 = aVar.f7536h;
        int i12 = aVar.f7535g;
        if (!z10 || !(charSequence2 instanceof String)) {
            if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
                while (!s(charSequence2, charSequence, i10, charSequence2.length(), z8)) {
                    if (i10 != i12) {
                        i10 += i11;
                    }
                }
                return i10;
            }
        } else if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
            while (true) {
                if (!i.o(0, i10, charSequence2.length(), (String) charSequence2, (String) charSequence, z8)) {
                    if (i10 == i12) {
                        break;
                    }
                    i10 += i11;
                } else {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static final boolean s(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "other");
        if (i8 < 0 || charSequence.length() - i9 < 0 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!j.t(charSequence.charAt(0 + i10), charSequence2.charAt(i8 + i10), z8)) {
                return false;
            }
        }
        return true;
    }

    public static final void t(int i8) {
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
        }
    }

    public static String u(String str) {
        k.e(str, "<this>");
        k.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, p(str));
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
