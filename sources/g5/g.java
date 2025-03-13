package g5;

import androidx.fragment.app.u;
import f5.b;
import g5.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class g extends u {

    public static final class a<V> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Future<V> f4658f;

        /* renamed from: g  reason: collision with root package name */
        public final f<? super V> f4659g;

        public a(Future<V> future, f<? super V> fVar) {
            this.f4658f = future;
            this.f4659g = fVar;
        }

        public final void run() {
            Throwable b9;
            Future<V> future = this.f4658f;
            boolean z8 = future instanceof h5.a;
            f<? super V> fVar = this.f4659g;
            if (!z8 || (b9 = ((h5.a) future).b()) == null) {
                try {
                    fVar.onSuccess(g.j(future));
                } catch (ExecutionException e) {
                    fVar.onFailure(e.getCause());
                } catch (Error | RuntimeException e4) {
                    fVar.onFailure(e4);
                }
            } else {
                fVar.onFailure(b9);
            }
        }

        public final String toString() {
            b bVar = new b(a.class.getSimpleName());
            b.a aVar = new b.a();
            bVar.f4410c.f4412b = aVar;
            bVar.f4410c = aVar;
            aVar.f4411a = this.f4659g;
            return bVar.toString();
        }
    }

    public static <V> V j(Future<V> future) {
        V v8;
        String str;
        int i8 = 0;
        if (!future.isDone()) {
            Object[] objArr = {future};
            try {
                str = future.toString();
            } catch (Exception e) {
                String name = future.getClass().getName();
                String hexString = Integer.toHexString(System.identityHashCode(future));
                StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                sb.append(name);
                sb.append('@');
                sb.append(hexString);
                String sb2 = sb.toString();
                Logger logger = Logger.getLogger("com.google.common.base.Strings");
                Level level = Level.WARNING;
                String valueOf = String.valueOf(sb2);
                logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e);
                String name2 = e.getClass().getName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
                sb3.append("<");
                sb3.append(sb2);
                sb3.append(" threw ");
                sb3.append(name2);
                sb3.append(">");
                str = sb3.toString();
            }
            objArr[0] = str;
            StringBuilder sb4 = new StringBuilder("Future was expected to be done: %s".length() + 16);
            int i9 = 0;
            while (i8 < 1) {
                int indexOf = "Future was expected to be done: %s".indexOf("%s", i9);
                if (indexOf == -1) {
                    break;
                }
                sb4.append("Future was expected to be done: %s", i9, indexOf);
                sb4.append(objArr[i8]);
                i9 = indexOf + 2;
                i8++;
            }
            sb4.append("Future was expected to be done: %s", i9, "Future was expected to be done: %s".length());
            if (i8 < 1) {
                sb4.append(" [");
                sb4.append(objArr[i8]);
                for (int i10 = i8 + 1; i10 < 1; i10++) {
                    sb4.append(", ");
                    sb4.append(objArr[i10]);
                }
                sb4.append(']');
            }
            throw new IllegalStateException(sb4.toString());
        }
        while (true) {
            try {
                v8 = future.get();
                break;
            } catch (InterruptedException unused) {
                i8 = 1;
            } catch (Throwable th) {
                if (i8 != 0) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (i8 != 0) {
            Thread.currentThread().interrupt();
        }
        return v8;
    }

    public static c.a k(j jVar, androidx.health.services.client.impl.g gVar, Executor executor) {
        int i8 = c.f4653o;
        c.a aVar = new c.a(jVar, gVar);
        executor.getClass();
        if (executor != d.f4656f) {
            executor = new k(executor, aVar);
        }
        jVar.a(aVar, executor);
        return aVar;
    }
}
