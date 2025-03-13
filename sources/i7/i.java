package i7;

import a1.a;
import h7.d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p7.l;
import q7.k;

public class i extends h {
    public static final ArrayList T(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (cls.isInstance(next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final <T> T U(List<? extends T> list) {
        k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void V(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar) {
        CharSequence charSequence5;
        k.e(iterable, "<this>");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i9 = 0;
        for (Object next : iterable) {
            i9++;
            boolean z8 = true;
            if (i9 > 1) {
                sb.append(charSequence);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            if (lVar != null) {
                next = lVar.invoke(next);
            } else {
                if (next != null) {
                    z8 = next instanceof CharSequence;
                }
                if (!z8) {
                    if (next instanceof Character) {
                        sb.append(((Character) next).charValue());
                    } else {
                        charSequence5 = String.valueOf(next);
                        sb.append(charSequence5);
                    }
                }
            }
            charSequence5 = (CharSequence) next;
            sb.append(charSequence5);
        }
        if (i8 >= 0 && i9 > i8) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String W(Iterable iterable, String str, l lVar, int i8) {
        if ((i8 & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        String str3 = (i8 & 2) != 0 ? "" : null;
        String str4 = (i8 & 4) != 0 ? "" : null;
        int i9 = (i8 & 8) != 0 ? -1 : 0;
        String str5 = (i8 & 16) != 0 ? "..." : null;
        l lVar2 = (i8 & 32) != 0 ? null : lVar;
        k.e(iterable, "<this>");
        k.e(str2, "separator");
        k.e(str3, "prefix");
        k.e(str4, "postfix");
        k.e(str5, "truncated");
        StringBuilder sb = new StringBuilder();
        V(iterable, sb, str2, str3, str4, i9, str5, lVar2);
        String sb2 = sb.toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> T X(List<? extends T> list) {
        k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(a.u(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final List Y(List list, Comparator comparator) {
        if (list.size() <= 1) {
            return c0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        k.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return f.L(array);
    }

    public static final Set Z(ArrayList arrayList, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        linkedHashSet.removeAll(set);
        return linkedHashSet;
    }

    public static final void a0(Iterable iterable, AbstractCollection abstractCollection) {
        k.e(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final int[] b0(Collection<Integer> collection) {
        k.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i8 = 0;
        for (Integer intValue : collection) {
            iArr[i8] = intValue.intValue();
            i8++;
        }
        return iArr;
    }

    public static final <T> List<T> c0(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        k.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        k kVar = k.f4879f;
        if (z8) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return kVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return a.A(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z8) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            a0(iterable, arrayList);
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : a.A(arrayList.get(0)) : kVar;
    }

    public static final <T> Set<T> d0(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        m mVar = m.f4881f;
        if (z8) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return mVar;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(a.C(collection.size()));
                a0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return a.F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        a0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        return size2 != 0 ? size2 != 1 ? linkedHashSet2 : a.F(linkedHashSet2.iterator().next()) : mVar;
    }

    public static final ArrayList e0(Iterable iterable, Iterable iterable2) {
        k.e(iterable, "<this>");
        k.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(f.M(iterable), f.M(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new d(it.next(), it2.next()));
        }
        return arrayList;
    }
}
