package c6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public final /* synthetic */ class m implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f2766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ZonedDateTime f2767b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Set f2768c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f2769d;

    public /* synthetic */ m(n nVar, ZonedDateTime zonedDateTime, HashSet hashSet, HashMap hashMap) {
        this.f2766a = nVar;
        this.f2767b = zonedDateTime;
        this.f2768c = hashSet;
        this.f2769d = hashMap;
    }

    public final void accept(Object obj, Object obj2) {
        ZoneId zoneId = (ZoneId) obj2;
        n nVar = this.f2766a;
        nVar.getClass();
        o oVar = new o(nVar.f2716a, ZonedDateTime.ofInstant(this.f2767b.toInstant(), zoneId));
        this.f2768c.addAll(((o) obj).a(oVar));
        this.f2769d.put(oVar, zoneId);
    }
}
