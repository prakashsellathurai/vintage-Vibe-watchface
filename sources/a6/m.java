package a6;

import android.graphics.Color;
import android.util.Log;
import s.g;

public final class m extends a {

    /* renamed from: b  reason: collision with root package name */
    public final String f190b;

    public m(String str) {
        super(7);
        int indexOf = str.indexOf("\"");
        int lastIndexOf = str.lastIndexOf("\"");
        this.f190b = indexOf < lastIndexOf ? str.substring(indexOf + 1, lastIndexOf) : str;
    }

    public final boolean a() {
        return Boolean.parseBoolean(this.f190b);
    }

    public final Color b() {
        try {
            return Color.valueOf(Color.parseColor(this.f190b));
        } catch (IllegalArgumentException unused) {
            return super.b();
        }
    }

    public final double d() {
        String str = this.f190b;
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:TokenString", "fail to parseDouble: " + str);
            return 0.0d;
        }
    }

    public final float e() {
        String str = this.f190b;
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:TokenString", "fail to parseFloat: " + str);
            return 0.0f;
        }
    }

    public final int f() {
        String str = this.f190b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:TokenString", "fail to parseInt: " + str);
            return 0;
        }
    }

    public final long g() {
        String str = this.f190b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            Log.w("DWF:TokenString", "fail to parseLong: " + str);
            return 0;
        }
    }

    public final a i(l lVar, a aVar) {
        int b9 = g.b(lVar.f189c);
        String str = this.f190b;
        return b9 != 14 ? b9 != 15 ? new k() : new b(Boolean.valueOf(!str.equals(aVar.k()))) : new b(Boolean.valueOf(str.equals(aVar.k())));
    }

    public final String k() {
        return this.f190b;
    }
}
