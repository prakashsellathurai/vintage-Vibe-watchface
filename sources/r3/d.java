package r3;

import android.accounts.Account;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Account f6954a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f6955b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f6956c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6957d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final b4.a f6958f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f6959g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f6960a;

        /* renamed from: b  reason: collision with root package name */
        public b<Scope> f6961b;

        /* renamed from: c  reason: collision with root package name */
        public String f6962c;

        /* renamed from: d  reason: collision with root package name */
        public String f6963d;
    }

    public d(Account account, @RecentlyNonNull Set set, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        b4.a aVar = b4.a.f2601a;
        this.f6954a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f6955b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f6957d = str;
        this.e = str2;
        this.f6958f = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (r rVar : emptyMap.values()) {
            rVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f6956c = Collections.unmodifiableSet(hashSet);
    }
}
