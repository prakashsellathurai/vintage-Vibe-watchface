package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import b0.e;

public class Preference implements Comparable<Preference> {

    /* renamed from: f  reason: collision with root package name */
    public final Context f1523f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1524g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f1525h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f1526i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1527j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1528k;

    /* renamed from: l  reason: collision with root package name */
    public a f1529l;

    public interface a<T extends Preference> {
        CharSequence a(T t8);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, R.attr.preferenceStyle, 16842894));
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i8 = preference.f1524g;
        int i9 = this.f1524g;
        if (i9 != i8) {
            return i9 - i8;
        }
        CharSequence charSequence = preference.f1525h;
        CharSequence charSequence2 = this.f1525h;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public CharSequence e() {
        a aVar = this.f1529l;
        return aVar != null ? aVar.a(this) : this.f1526i;
    }

    public void f() {
    }

    public Object g(TypedArray typedArray, int i8) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1525h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence e = e();
        if (!TextUtils.isEmpty(e)) {
            sb.append(e);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b5, code lost:
        if (r5.hasValue(11) != false) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.f1524g = r0
            r1 = 1
            r4.f1523f = r5
            int[] r2 = k3.j.C
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r7, r3)
            int r6 = r5.getResourceId(r3, r3)
            r7 = 23
            r5.getResourceId(r7, r6)
            r6 = 26
            r7 = 6
            java.lang.String r6 = b0.e.b(r5, r6, r7)
            r4.f1527j = r6
            r6 = 34
            java.lang.CharSequence r6 = r5.getText(r6)
            if (r6 != 0) goto L_0x0031
            r6 = 4
            java.lang.CharSequence r6 = r5.getText(r6)
        L_0x0031:
            r4.f1525h = r6
            r6 = 33
            java.lang.CharSequence r6 = r5.getText(r6)
            if (r6 != 0) goto L_0x0040
            r6 = 7
            java.lang.CharSequence r6 = r5.getText(r6)
        L_0x0040:
            r4.f1526i = r6
            r6 = 8
            int r6 = r5.getInt(r6, r0)
            r7 = 28
            int r6 = r5.getInt(r7, r6)
            r4.f1524g = r6
            r6 = 22
            r7 = 13
            b0.e.b(r5, r6, r7)
            r6 = 3
            r7 = -2146566046(0xffffffff800e0062, float:-1.285834E-39)
            int r6 = r5.getResourceId(r6, r7)
            r7 = 27
            r5.getResourceId(r7, r6)
            r6 = 9
            int r6 = r5.getResourceId(r6, r3)
            r7 = 35
            r5.getResourceId(r7, r6)
            r6 = 2
            boolean r6 = r5.getBoolean(r6, r1)
            r7 = 21
            r5.getBoolean(r7, r6)
            r6 = 5
            boolean r6 = r5.getBoolean(r6, r1)
            r7 = 30
            boolean r6 = r5.getBoolean(r7, r6)
            boolean r7 = r5.getBoolean(r1, r1)
            r0 = 29
            r5.getBoolean(r0, r7)
            r7 = 19
            r0 = 10
            b0.e.b(r5, r7, r0)
            r7 = 16
            boolean r0 = r5.getBoolean(r7, r6)
            r5.getBoolean(r7, r0)
            r7 = 17
            boolean r6 = r5.getBoolean(r7, r6)
            r5.getBoolean(r7, r6)
            r6 = 18
            boolean r7 = r5.hasValue(r6)
            if (r7 == 0) goto L_0x00af
            goto L_0x00b7
        L_0x00af:
            r6 = 11
            boolean r7 = r5.hasValue(r6)
            if (r7 == 0) goto L_0x00bd
        L_0x00b7:
            java.lang.Object r6 = r4.g(r5, r6)
            r4.f1528k = r6
        L_0x00bd:
            r4 = 12
            boolean r4 = r5.getBoolean(r4, r1)
            r6 = 31
            r5.getBoolean(r6, r4)
            r4 = 32
            boolean r6 = r5.hasValue(r4)
            if (r6 == 0) goto L_0x00d9
            r6 = 14
            boolean r6 = r5.getBoolean(r6, r1)
            r5.getBoolean(r4, r6)
        L_0x00d9:
            r4 = 15
            boolean r4 = r5.getBoolean(r4, r3)
            r6 = 24
            r5.getBoolean(r6, r4)
            r4 = 25
            boolean r6 = r5.getBoolean(r4, r1)
            r5.getBoolean(r4, r6)
            r4 = 20
            boolean r6 = r5.getBoolean(r4, r3)
            r5.getBoolean(r4, r6)
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
