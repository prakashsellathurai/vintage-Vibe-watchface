package p1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import h7.f;
import l1.e;
import q1.b;
import q1.c;
import q1.d;
import q1.m;
import q1.n;
import q1.q;
import q1.r;
import q1.s;
import q1.t;
import q1.u;
import q1.v;
import q1.z;
import q7.k;
import q7.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f6242a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6243b;

    /* renamed from: c  reason: collision with root package name */
    public final Icon f6244c;

    /* renamed from: d  reason: collision with root package name */
    public final d f6245d;
    public final ComponentName e;

    /* renamed from: f  reason: collision with root package name */
    public final f f6246f = a1.a.z(new C0103a(this));

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    public static final class C0103a extends l implements p7.a<b> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f6247f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0103a(a aVar) {
            super(0);
            this.f6247f = aVar;
        }

        public final Object invoke() {
            a aVar = this.f6247f;
            String str = aVar.f6243b;
            k.e(str, "text");
            ComplicationText plainText = ComplicationText.plainText(str);
            k.d(plainText, "plainText(text)");
            r rVar = new r(plainText);
            int ordinal = aVar.f6245d.ordinal();
            String str2 = aVar.f6243b;
            Icon icon = aVar.f6244c;
            switch (ordinal) {
                case 3:
                    k.e(str2, "<this>");
                    int length = str2.length();
                    if (7 <= length) {
                        length = 7;
                    }
                    String substring = str2.substring(0, length);
                    k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    ComplicationText plainText2 = ComplicationText.plainText(substring);
                    k.d(plainText2, "plainText(text)");
                    r rVar2 = new r(plainText2);
                    k.e(icon, "image");
                    return new t(rVar2, (c) null, new q1.l(icon, (Icon) null), (u) null, rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, 0, 0, (t) null);
                case 4:
                    k.e(str2, "text");
                    ComplicationText plainText3 = ComplicationText.plainText(str2);
                    k.d(plainText3, "plainText(text)");
                    r rVar3 = new r(plainText3);
                    k.e(icon, "image");
                    return new q1.k(rVar3, (c) null, new q1.l(icon, (Icon) null), (u) null, rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, 0, 0, (q1.k) null);
                case 5:
                    k.e(icon, "image");
                    q1.l lVar = r1;
                    q1.l lVar2 = new q1.l(icon, (Icon) null);
                    k.e(str2, "text");
                    r rVar4 = r0;
                    ComplicationText plainText4 = ComplicationText.plainText(str2);
                    k.d(plainText4, "plainText(text)");
                    r rVar5 = new r(plainText4);
                    return new s(42.0f, (e.r) null, 0.0f, 100.0f, lVar, (u) null, (c) null, rVar4, rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, (q1.a) null, 0, 0, 0, (s) null);
                case 6:
                    k.e(icon, "image");
                    return new m(new q1.l(icon, (Icon) null), rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, 0, 0, (m) null);
                case 7:
                    k.e(icon, "image");
                    return new v(new u(icon, 1, (Icon) null), rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, 0, 0, (v) null);
                case 8:
                    k.e(icon, "photoImage");
                    return new q(icon, rVar, (PendingIntent) null, (z) null, (ComplicationData) null, (ComponentName) null, 0, 0, (q) null);
                default:
                    return new n();
            }
        }
    }

    public a(String str, String str2, Icon icon, d dVar, ComponentName componentName) {
        this.f6242a = str;
        this.f6243b = str2;
        this.f6244c = icon;
        this.f6245d = dVar;
        this.e = componentName;
        if (!(componentName != null)) {
            throw new IllegalArgumentException("ComponentName is required on Android R and above".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.ComplicationDataSourceInfo");
        a aVar = (a) obj;
        return k.a(this.f6242a, aVar.f6242a) && k.a(this.f6243b, aVar.f6243b) && this.f6245d == aVar.f6245d && v1.b.a(this.f6244c, aVar.f6244c) && k.a(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = ((((((this.f6242a.hashCode() * 31) + this.f6243b.hashCode()) * 31) + this.f6245d.hashCode()) * 31) + v1.b.b(this.f6244c)) * 31;
        ComponentName componentName = this.e;
        return hashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "ComplicationDataSourceInfo(appName=" + this.f6242a + ", name=" + this.f6243b + ", type=" + this.f6245d + ", icon=" + this.f6244c + ", componentName=" + this.e + ')';
    }
}
