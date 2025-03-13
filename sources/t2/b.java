package t2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import k3.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7464a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0124b f7465b = new C0124b();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f7466a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f7467b;
    }

    /* renamed from: t2.b$b  reason: collision with other inner class name */
    public static class C0124b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f7468a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f7464a.get(str);
            j.l(obj);
            aVar = (a) obj;
            int i8 = aVar.f7467b;
            if (i8 >= 1) {
                int i9 = i8 - 1;
                aVar.f7467b = i9;
                if (i9 == 0) {
                    a aVar2 = (a) this.f7464a.remove(str);
                    if (aVar2.equals(aVar)) {
                        C0124b bVar = this.f7465b;
                        synchronized (bVar.f7468a) {
                            if (bVar.f7468a.size() < 10) {
                                bVar.f7468a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f7467b);
            }
        }
        aVar.f7466a.unlock();
    }
}
