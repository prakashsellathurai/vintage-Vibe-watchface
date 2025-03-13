package p3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a.c;
import p3.d;
import q3.i;
import q3.s;
import r3.c;

public final class a<O extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final C0106a<?, O> f6316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6317b = "ClientTelemetry.API";

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    public static abstract class C0106a<T extends e, O> extends d<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull r3.d dVar, @RecentlyNonNull O o8, @RecentlyNonNull d.a aVar, @RecentlyNonNull d.b bVar) {
            return b(context, looper, dVar, o8, aVar, bVar);
        }

        @RecentlyNonNull
        public T b(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull r3.d dVar, @RecentlyNonNull O o8, @RecentlyNonNull q3.c cVar, @RecentlyNonNull i iVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public static class b<C> {
    }

    public interface c {

        /* renamed from: p3.a$c$a  reason: collision with other inner class name */
        public interface C0107a extends c {
            @RecentlyNonNull
            Account a();
        }

        public interface b extends c {
            @RecentlyNullable
            GoogleSignInAccount b();
        }
    }

    public static abstract class d<T, O> {
    }

    public interface e {
        boolean a();

        Set<Scope> b();

        void c(@RecentlyNonNull c.C0119c cVar);

        void d(r3.i iVar, Set<Scope> set);

        void e(@RecentlyNonNull String str);

        boolean f();

        int h();

        boolean i();

        @RecentlyNonNull
        o3.c[] j();

        void k(@RecentlyNonNull s sVar);

        @RecentlyNonNull
        String l();

        @RecentlyNullable
        String m();

        void n();

        boolean o();
    }

    public static final class f<C extends e> extends b<C> {
    }

    public a(@RecentlyNonNull t3.b bVar, @RecentlyNonNull f fVar) {
        this.f6316a = bVar;
    }
}
