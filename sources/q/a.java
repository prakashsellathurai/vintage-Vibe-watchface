package q;

import g5.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements j<V> {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f6356i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f6357j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0108a f6358k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f6359l = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f6360f;

    /* renamed from: g  reason: collision with root package name */
    public volatile d f6361g;

    /* renamed from: h  reason: collision with root package name */
    public volatile h f6362h;

    /* renamed from: q.a$a  reason: collision with other inner class name */
    public static abstract class C0108a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6363b;

        /* renamed from: c  reason: collision with root package name */
        public static final b f6364c;

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6365a;

        static {
            if (a.f6356i) {
                f6364c = null;
                f6363b = null;
                return;
            }
            f6364c = new b((Throwable) null, false);
            f6363b = new b((Throwable) null, true);
        }

        public b(Throwable th, boolean z8) {
            this.f6365a = th;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6366a;

        /* renamed from: q.a$c$a  reason: collision with other inner class name */
        public class C0109a extends Throwable {
            public C0109a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0109a());
        }

        public c(Throwable th) {
            boolean z8 = a.f6356i;
            th.getClass();
            this.f6366a = th;
        }
    }

    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f6367d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f6368a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6369b;

        /* renamed from: c  reason: collision with root package name */
        public d f6370c;

        public d(Runnable runnable, Executor executor) {
            this.f6368a = runnable;
            this.f6369b = executor;
        }
    }

    public static final class e extends C0108a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f6371a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f6372b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f6373c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f6374d;
        public final AtomicReferenceFieldUpdater<a, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f6371a = atomicReferenceFieldUpdater;
            this.f6372b = atomicReferenceFieldUpdater2;
            this.f6373c = atomicReferenceFieldUpdater3;
            this.f6374d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f6374d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f6373c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        public final void d(h hVar, h hVar2) {
            this.f6372b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f6371a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    public static final class g extends C0108a {
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f6361g != dVar) {
                    return false;
                }
                aVar.f6361g = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f6360f != obj) {
                    return false;
                }
                aVar.f6360f = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f6362h != hVar) {
                    return false;
                }
                aVar.f6362h = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f6377b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f6376a = thread;
        }
    }

    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f6375c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f6376a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f6377b;

        public h() {
            a.f6358k.e(this, Thread.currentThread());
        }

        public h(int i8) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: q.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: q.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: q.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: q.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<q.a$h> r0 = q.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f6356i = r1
            java.lang.Class<q.a> r1 = q.a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f6357j = r2
            q.a$e r2 = new q.a$e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<q.a$d> r0 = q.a.d.class
            java.lang.String r3 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            q.a$g r2 = new q.a$g
            r2.<init>()
        L_0x004e:
            f6358k = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f6357j
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f6359l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.<clinit>():void");
    }

    public static void c(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f6362h;
        } while (!f6358k.c(aVar, hVar, h.f6375c));
        while (hVar != null) {
            Thread thread = hVar.f6376a;
            if (thread != null) {
                hVar.f6376a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f6377b;
        }
        do {
            dVar = aVar.f6361g;
        } while (!f6358k.a(aVar, dVar, d.f6367d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f6370c;
            dVar.f6370c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f6370c;
            Runnable runnable = dVar2.f6368a;
            if (!(runnable instanceof f)) {
                d(runnable, dVar2.f6369b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Level level = Level.SEVERE;
            f6357j.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e4);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f6365a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f6366a);
        } else if (obj == f6359l) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f6361g;
        d dVar2 = d.f6367d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f6370c = dVar;
                if (!f6358k.a(this, dVar, dVar3)) {
                    dVar = this.f6361g;
                } else {
                    return;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String str;
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (ExecutionException e4) {
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e9) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e9.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final boolean cancel(boolean z8) {
        Object obj = this.f6360f;
        if ((obj == null) || (obj instanceof f)) {
            b bVar = f6356i ? new b(new CancellationException("Future.cancel() was called."), z8) : z8 ? b.f6363b : b.f6364c;
            while (!f6358k.b(this, obj, bVar)) {
                obj = this.f6360f;
                if (!(obj instanceof f)) {
                }
            }
            c(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    public final String f() {
        Object obj = this.f6360f;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void g(h hVar) {
        hVar.f6376a = null;
        while (true) {
            h hVar2 = this.f6362h;
            if (hVar2 != h.f6375c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f6377b;
                    if (hVar2.f6376a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f6377b = hVar4;
                        if (hVar3.f6376a == null) {
                        }
                    } else if (!f6358k.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6360f;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f6362h;
            h hVar2 = h.f6375c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    C0108a aVar = f6358k;
                    aVar.d(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6360f;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f6362h;
                } while (hVar != hVar2);
            }
            return e(this.f6360f);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f6360f instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.f6360f;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f6360f instanceof b) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = f();
                } catch (RuntimeException e4) {
                    str = "Exception thrown from implementation: " + e4.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            b(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x01b8
            java.lang.Object r6 = r0.f6360f
            r7 = 1
            if (r6 == 0) goto L_0x0017
            r9 = r7
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            boolean r10 = r6 instanceof q.a.f
            r10 = r10 ^ r7
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0023
            java.lang.Object r0 = e(r6)
            return r0
        L_0x0023:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L_0x0030
        L_0x002f:
            r11 = r9
        L_0x0030:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0092
            q.a$h r6 = r0.f6362h
            q.a$h r15 = q.a.h.f6375c
            if (r6 == r15) goto L_0x008b
            q.a$h r8 = new q.a$h
            r8.<init>()
        L_0x0041:
            q.a$a r9 = f6358k
            r9.d(r8, r6)
            boolean r6 = r9.c(r0, r6, r8)
            if (r6 == 0) goto L_0x0083
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x007a
            java.lang.Object r4 = r0.f6360f
            if (r4 == 0) goto L_0x005b
            r5 = r7
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            boolean r6 = r4 instanceof q.a.f
            r6 = r6 ^ r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0067
            java.lang.Object r0 = e(r4)
            return r0
        L_0x0067:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.g(r8)
            r8 = r4
            r4 = r3
            r5 = r4
            r2 = r1
            r1 = r0
            goto L_0x00bb
        L_0x007a:
            r0.g(r8)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0083:
            q.a$h r6 = r0.f6362h
            if (r6 != r15) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r9 = 0
            goto L_0x0041
        L_0x008b:
            java.lang.Object r0 = r0.f6360f
            java.lang.Object r0 = e(r0)
            return r0
        L_0x0092:
            r16 = r9
            r8 = r4
            r4 = r3
            r5 = r4
            r2 = r1
            r1 = r0
        L_0x0099:
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c4
            java.lang.Object r6 = r1.f6360f
            if (r6 == 0) goto L_0x00a3
            r8 = r7
            goto L_0x00a4
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            boolean r9 = r6 instanceof q.a.f
            r9 = r9 ^ r7
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00af
            java.lang.Object r0 = e(r6)
            return r0
        L_0x00af:
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x00be
            long r8 = java.lang.System.nanoTime()
            long r8 = r11 - r8
        L_0x00bb:
            r16 = 0
            goto L_0x0099
        L_0x00be:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00c4:
            java.lang.String r1 = r0.toString()
            java.lang.String r6 = r4.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Waited "
            r11.<init>(r12)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
            java.lang.String r3 = r4.toString()
            java.lang.String r3 = r3.toLowerCase(r10)
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            long r10 = r8 + r13
            r16 = 0
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x0181
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " (plus "
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            long r8 = -r8
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = r5.convert(r8, r4)
            long r4 = r5.toNanos(r10)
            long r8 = r8 - r4
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0121
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r7 = 0
        L_0x0121:
            if (r4 <= 0) goto L_0x015a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r10)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            if (r7 == 0) goto L_0x014b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ","
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x014b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
        L_0x015a:
            if (r7 == 0) goto L_0x0170
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " nanoseconds "
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L_0x0170:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "delay)"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L_0x0181:
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x019e
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " but future completed as timeout expired"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019e:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = " for "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b8:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
