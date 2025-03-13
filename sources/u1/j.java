package u1;

import a1.a;
import android.content.ComponentName;
import androidx.wear.watchface.complications.data.DefaultComplicationDataSourcePolicyWireFormat;
import androidx.wear.watchface.style.data.UserStyleFlavorWireFormat;
import androidx.wear.watchface.style.data.UserStyleFlavorsWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import i7.f;
import i7.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1.g;
import q1.d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f7630a;

    public j() {
        this(k.f4879f);
    }

    public j(List<h> list) {
        this.f7630a = list;
    }

    public final UserStyleFlavorsWireFormat a() {
        List<h> list = this.f7630a;
        ArrayList arrayList = new ArrayList(f.M(list));
        for (h hVar : list) {
            UserStyleWireFormat userStyleWireFormat = new UserStyleWireFormat(hVar.f7624b.f7616a);
            Map<Integer, g> map = hVar.f7625c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(a.C(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                g gVar = (g) entry.getValue();
                int i8 = gVar.f6293f.f6450f;
                ArrayList<ComponentName> a9 = gVar.a();
                int i9 = gVar.e;
                d dVar = gVar.f6290b;
                int i10 = dVar != null ? dVar.f6450f : i8;
                d dVar2 = gVar.f6292d;
                linkedHashMap.put(key, new DefaultComplicationDataSourcePolicyWireFormat(a9, i9, i8, i10, dVar2 != null ? dVar2.f6450f : i8));
            }
            arrayList.add(new UserStyleFlavorWireFormat(hVar.f7623a, userStyleWireFormat, linkedHashMap));
        }
        return new UserStyleFlavorsWireFormat(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q7.k.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleFlavors");
        return q7.k.a(this.f7630a, ((j) obj).f7630a);
    }

    public final int hashCode() {
        return this.f7630a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f7630a);
    }
}
