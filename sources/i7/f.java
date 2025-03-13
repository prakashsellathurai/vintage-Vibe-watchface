package i7;

import a1.a;
import h7.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q7.k;

public class f extends a {
    public static final List L(Object[] objArr) {
        k.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        k.d(asList, "asList(this)");
        return asList;
    }

    public static final int M(Iterable iterable) {
        k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static final void N(Object[] objArr, Object[] objArr2, int i8, int i9, int i10) {
        k.e(objArr, "<this>");
        k.e(objArr2, "destination");
        System.arraycopy(objArr, i9, objArr2, i8, i10 - i9);
    }

    public static final Map O(d... dVarArr) {
        if (dVarArr.length <= 0) {
            return l.f4880f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.C(dVarArr.length));
        for (d dVar : dVarArr) {
            linkedHashMap.put(dVar.f4781f, dVar.f4782g);
        }
        return linkedHashMap;
    }

    public static final Map P(ArrayList arrayList) {
        l lVar = l.f4880f;
        int size = arrayList.size();
        if (size == 0) {
            return lVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a.C(arrayList.size()));
            Q(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        d dVar = (d) arrayList.get(0);
        k.e(dVar, "pair");
        Map singletonMap = Collections.singletonMap(dVar.f4781f, dVar.f4782g);
        k.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void Q(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            linkedHashMap.put(dVar.f4781f, dVar.f4782g);
        }
    }

    public static final Set R(Object[] objArr) {
        k.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return m.f4881f;
        }
        if (length == 1) {
            return a.F(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(a.C(objArr.length));
        for (Object add : objArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }
}
