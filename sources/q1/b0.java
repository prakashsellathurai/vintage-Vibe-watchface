package q1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.ComplicationTextTemplate;
import android.support.wearable.complications.TimeDependentText;
import i7.f;
import i7.i;
import i7.k;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.l;

public final class b0 extends b {
    public static final List<a> r = k.f4879f;

    /* renamed from: j  reason: collision with root package name */
    public final List<a> f6426j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6427k;

    /* renamed from: l  reason: collision with root package name */
    public final l f6428l;

    /* renamed from: m  reason: collision with root package name */
    public final u f6429m;

    /* renamed from: n  reason: collision with root package name */
    public final c f6430n;

    /* renamed from: o  reason: collision with root package name */
    public final c f6431o;

    /* renamed from: p  reason: collision with root package name */
    public final c f6432p;

    /* renamed from: q  reason: collision with root package name */
    public final c f6433q;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f6434a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6435b;

        public a(int i8, float f9) {
            this.f6434a = f9;
            this.f6435b = i8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!q7.k.a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.WeightedElementsComplicationData.Element");
            a aVar = (a) obj;
            if (this.f6435b != aVar.f6435b) {
                return false;
            }
            return (this.f6434a > aVar.f6434a ? 1 : (this.f6434a == aVar.f6434a ? 0 : -1)) == 0;
        }

        public final int hashCode() {
            return (this.f6435b * 31) + Float.hashCode(this.f6434a);
        }

        public final String toString() {
            return "Element(color=" + this.f6435b + ", weight=" + this.f6434a + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(List<a> list, int i8, l lVar, u uVar, c cVar, c cVar2, c cVar3, PendingIntent pendingIntent, z zVar, ComplicationData complicationData, ComponentName componentName, int i9, int i10, b0 b0Var) {
        super(d.WEIGHTED_ELEMENTS, pendingIntent, complicationData, zVar == null ? z.f6510c : zVar, componentName, i9, i10, b0Var);
        r rVar = cVar3;
        this.f6426j = list;
        this.f6427k = i8;
        this.f6428l = lVar;
        this.f6429m = uVar;
        this.f6430n = cVar;
        this.f6431o = cVar2;
        this.f6432p = rVar;
        this.f6433q = rVar == null ? c.f6436a : rVar;
    }

    public final void b(ComplicationData.a aVar) {
        c c9;
        super.b(aVar);
        List<a> list = this.f6426j;
        ArrayList arrayList = new ArrayList(f.M(list));
        for (a aVar2 : list) {
            arrayList.add(Float.valueOf(aVar2.f6434a));
        }
        float[] fArr = new float[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr[i8] = ((Number) it.next()).floatValue();
            i8++;
        }
        aVar.b(fArr, "ELEMENT_WEIGHTS");
        ArrayList arrayList2 = new ArrayList(f.M(list));
        for (a aVar3 : list) {
            arrayList2.add(Integer.valueOf(aVar3.f6435b));
        }
        aVar.b(i.b0(arrayList2), "ELEMENT_COLORS");
        aVar.b(Integer.valueOf(this.f6427k), "ELEMENT_BACKGROUND_COLOR");
        l lVar = this.f6428l;
        if (lVar != null) {
            lVar.a(aVar);
        }
        u uVar = this.f6429m;
        if (uVar != null) {
            uVar.a(aVar);
        }
        ComplicationText complicationText = null;
        c cVar = this.f6431o;
        aVar.b(cVar != null ? cVar.a() : null, "SHORT_TEXT");
        c cVar2 = this.f6430n;
        aVar.b(cVar2 != null ? cVar2.a() : null, "SHORT_TITLE");
        aVar.e(this.f6419b);
        c cVar3 = this.f6432p;
        if (!(cVar3 == null || (c9 = e.c(cVar3)) == null)) {
            complicationText = c9.a();
        }
        aVar.c(complicationText);
        e.g(this.f6421d, aVar);
        aVar.f(this.f6425i);
    }

    public final TimeDependentText c(Context context) {
        c c9;
        ComplicationText a9;
        q7.k.e(context, "context");
        c cVar = this.f6432p;
        if (cVar != null && (c9 = e.c(cVar)) != null && (a9 = c9.a()) != null) {
            return a9;
        }
        ComplicationTextTemplate.b bVar = new ComplicationTextTemplate.b();
        e.a(bVar, this.f6431o, this.f6430n);
        return e.b(bVar);
    }

    public final Instant d(Instant instant) {
        Instant instant2;
        Instant instant3;
        c cVar = this.f6430n;
        if (cVar == null || (instant2 = cVar.d(instant)) == null) {
            instant2 = Instant.MAX;
        }
        c cVar2 = this.f6431o;
        if (cVar2 == null || (instant3 = cVar2.d(instant)) == null) {
            instant3 = Instant.MAX;
        }
        if (instant3.isBefore(instant2)) {
            return instant3;
        }
        q7.k.d(instant2, "{\n            titleChangeInstant\n        }");
        return instant2;
    }

    public final String toString() {
        ComplicationData.Companion.getClass();
        String W = ComplicationData.c.d() ? "REDACTED" : i.W(this.f6426j, (String) null, (l) null, 63);
        return "WeightedElementsComplicationData(elements=" + W + ", elementBackgroundColor=" + this.f6427k + ", monochromaticImage=" + this.f6428l + ", smallImage=" + this.f6429m + ", title=" + this.f6430n + ", text=" + this.f6431o + ", contentDescription=" + this.f6432p + "), tapActionLostDueToSerialization=" + this.f6425i + ", tapAction=" + this.f6419b + ", validTimeRange=" + this.f6421d + ", dataSource=" + this.e + ", persistencePolicy=" + this.f6422f + ", displayPolicy=" + this.f6423g + ", dynamicValueInvalidationFallback=" + this.f6424h + ')';
    }
}
