package i6;

import android.util.Log;
import n6.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4861a;

    public a() {
    }

    public a(String str) {
        this.f4861a = str;
    }

    public final boolean a(boolean z8) {
        String str = this.f4861a;
        if (str == null) {
            return z8;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1) {
                return true;
            }
            if (parseInt == 0) {
                return false;
            }
            throw new NumberFormatException();
        } catch (NumberFormatException unused) {
            return Boolean.parseBoolean(str);
        }
    }

    public final float b(float f9) {
        String str = this.f4861a;
        if (str == null) {
            return f9;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:Attribute", "fail to parseFloat: " + str);
            return f9;
        }
    }

    public final int c(int i8) {
        String str = this.f4861a;
        if (str == null) {
            return i8;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:Attribute", "fail to parseInt: " + str);
            return i8;
        }
    }

    public final String d() {
        return e("");
    }

    public final String e(String str) {
        String str2 = this.f4861a;
        return g.e(str2) ? str : str2;
    }
}
