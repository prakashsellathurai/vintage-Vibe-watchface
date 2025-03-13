package i7;

import java.util.AbstractCollection;
import java.util.Collection;
import q7.k;

public class h extends g {
    public static final void S(Iterable iterable, AbstractCollection abstractCollection) {
        k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }
}
