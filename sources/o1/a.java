package o1;

import android.graphics.Rect;
import android.os.Bundle;
import java.util.List;
import p1.g;
import q1.d;
import q7.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f5988a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5989b;

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f5990c;

    /* renamed from: d  reason: collision with root package name */
    public final g f5991d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5992f;

    /* renamed from: g  reason: collision with root package name */
    public final d f5993g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5994h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f5995i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f5996j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f5997k;

    /* renamed from: l  reason: collision with root package name */
    public final n1.a f5998l;

    public a(Rect rect, int i8, List<? extends d> list, g gVar, boolean z8, boolean z9, d dVar, boolean z10, Bundle bundle, Integer num, Integer num2, n1.a aVar) {
        k.e(list, "supportedTypes");
        k.e(gVar, "defaultDataSourcePolicy");
        k.e(dVar, "currentType");
        k.e(bundle, "complicationConfigExtras");
        this.f5988a = rect;
        this.f5989b = i8;
        this.f5990c = list;
        this.f5991d = gVar;
        this.e = z8;
        this.f5992f = z9;
        this.f5993g = dVar;
        this.f5994h = z10;
        this.f5995i = bundle;
        this.f5996j = num;
        this.f5997k = num2;
        this.f5998l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.client.ComplicationSlotState");
        a aVar = (a) obj;
        if (!k.a(this.f5988a, aVar.f5988a) || this.f5989b != aVar.f5989b || !k.a(this.f5990c, aVar.f5990c)) {
            return false;
        }
        g gVar = this.f5991d;
        g gVar2 = aVar.f5991d;
        return k.a(gVar, gVar2) && gVar.f6293f == gVar2.f6293f && this.e == aVar.e && this.f5992f == aVar.f5992f && this.f5993g == aVar.f5993g && this.f5994h == aVar.f5994h && k.a(this.f5995i, aVar.f5995i) && k.a(this.f5996j, aVar.f5996j) && k.a(this.f5997k, aVar.f5997k) && k.a(this.f5998l, aVar.f5998l);
    }

    public final int hashCode() {
        g gVar = this.f5991d;
        int hashCode = ((((((((((((((((((this.f5988a.hashCode() * 31) + this.f5989b) * 31) + this.f5990c.hashCode()) * 31) + gVar.hashCode()) * 31) + gVar.f6293f.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f5992f)) * 31) + this.f5993g.hashCode()) * 31) + Boolean.hashCode(this.f5994h)) * 31) + this.f5995i.hashCode()) * 31;
        int i8 = 0;
        Integer num = this.f5996j;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f5997k;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        n1.a aVar = this.f5998l;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return intValue2 + i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplicationSlotState(bounds=");
        sb.append(this.f5988a);
        sb.append(", boundsType=");
        sb.append(this.f5989b);
        sb.append(", supportedTypes=");
        sb.append(this.f5990c);
        sb.append(", defaultDataSourcePolicy=");
        g gVar = this.f5991d;
        sb.append(gVar);
        sb.append(", defaultDataSourceType=");
        sb.append(gVar.f6293f);
        sb.append(", isEnabled=");
        sb.append(this.e);
        sb.append(", isInitiallyEnabled=");
        sb.append(this.f5992f);
        sb.append(", currentType=");
        sb.append(this.f5993g);
        sb.append(", fixedComplicationDataSource=");
        sb.append(this.f5994h);
        sb.append(", complicationConfigExtras=");
        sb.append(this.f5995i);
        sb.append(", nameResourceId=");
        sb.append(this.f5996j);
        sb.append(", screenReaderNameResourceId=");
        sb.append(this.f5997k);
        sb.append("), edgeComplicationBoundingArc=");
        sb.append(this.f5998l);
        sb.append(")\n");
        return sb.toString();
    }
}
