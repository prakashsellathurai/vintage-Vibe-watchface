package q3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d4.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p3.b;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f6568a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map<d<?>, Boolean> f6569b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z8, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6568a) {
            hashMap = new HashMap(this.f6568a);
        }
        synchronized (this.f6569b) {
            hashMap2 = new HashMap(this.f6569b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                BasePendingResult basePendingResult = (BasePendingResult) entry.getKey();
                synchronized (basePendingResult.f3026a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a());
                        basePendingResult.e = true;
                    }
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((d) entry2.getKey()).a(new b(status));
            }
        }
    }
}
