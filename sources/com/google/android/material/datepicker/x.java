package com.google.android.material.datepicker;

import androidx.fragment.app.n;
import com.google.android.material.datepicker.o;
import java.util.LinkedHashSet;

public abstract class x<S> extends n {
    public final LinkedHashSet<w<S>> Z = new LinkedHashSet<>();

    public boolean n(o.c cVar) {
        return this.Z.add(cVar);
    }
}
