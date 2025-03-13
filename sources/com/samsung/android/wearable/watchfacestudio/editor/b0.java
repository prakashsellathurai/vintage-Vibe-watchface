package com.samsung.android.wearable.watchfacestudio.editor;

import android.content.Context;
import b6.b;
import d6.a;
import java.util.Map;
import u1.m;
import w5.c;
import w5.f;

public final class b0 extends a {

    /* renamed from: k  reason: collision with root package name */
    public final Map<m, m.h> f3877k;

    public b0(Context context, Map<String, b> map, Map<m, m.h> map2) {
        super(context, map);
        this.f3877k = map2;
    }

    public final f c(c cVar) {
        String substring = cVar.f8018a.substring(14);
        int lastIndexOf = substring.lastIndexOf(".");
        int i8 = 0;
        if (lastIndexOf >= 0) {
            int parseInt = Integer.parseInt(substring.substring(lastIndexOf + 1));
            substring = substring.substring(0, lastIndexOf);
            i8 = parseInt;
        }
        Map<m, m.h> map = this.f3877k;
        for (Map.Entry<m, m.h> key : map.entrySet()) {
            m mVar = (m) key.getKey();
            if (mVar.f7641a.f7683a.equals(substring)) {
                return (f) g7.a.a(this.f4047j.get(mVar.f7641a.f7683a), map.get(mVar)).get(i8);
            }
        }
        return new f();
    }
}
