package r3;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p3.a;

public abstract class g<T extends IInterface> extends c<T> implements a.e {

    /* renamed from: x  reason: collision with root package name */
    public final Set<Scope> f6986x;
    public final Account y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, @androidx.annotation.RecentlyNonNull r3.d r13, @androidx.annotation.RecentlyNonNull q3.c r14, @androidx.annotation.RecentlyNonNull q3.i r15) {
        /*
            r9 = this;
            java.lang.Object r0 = r3.h.f6990a
            monitor-enter(r0)
            r3.v0 r1 = r3.h.f6991b     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0015
            r3.v0 r1 = new r3.v0     // Catch:{ all -> 0x0013 }
            android.content.Context r2 = r10.getApplicationContext()     // Catch:{ all -> 0x0013 }
            r1.<init>(r2)     // Catch:{ all -> 0x0013 }
            r3.h.f6991b = r1     // Catch:{ all -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            r9 = move-exception
            goto L_0x005b
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            r3.v0 r4 = r3.h.f6991b
            java.lang.Object r0 = o3.d.f6089b
            r3.b.b(r14)
            r3.b.b(r15)
            r3.v r6 = new r3.v
            r6.<init>(r14)
            r3.w r7 = new r3.w
            r7.<init>(r15)
            java.lang.String r8 = r13.e
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.f6954a
            r9.y = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.f6956c
            java.util.Iterator r11 = r10.iterator()
        L_0x003d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0058
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x0050
            goto L_0x003d
        L_0x0050:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Expanding scopes is not permitted, use implied scopes instead"
            r9.<init>(r10)
            throw r9
        L_0x0058:
            r9.f6986x = r10
            return
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.g.<init>(android.content.Context, android.os.Looper, int, r3.d, q3.c, q3.i):void");
    }

    public final Set<Scope> b() {
        return o() ? this.f6986x : Collections.emptySet();
    }

    @RecentlyNullable
    public final Account r() {
        return this.y;
    }

    @RecentlyNonNull
    public final Set<Scope> u() {
        return this.f6986x;
    }
}
