package g5;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class a<V> extends h5.a implements j<V> {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f4622i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f4623j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0057a f4624k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4625l = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f4626f;

    /* renamed from: g  reason: collision with root package name */
    public volatile d f4627g;

    /* renamed from: h  reason: collision with root package name */
    public volatile k f4628h;

    /* renamed from: g5.a$a  reason: collision with other inner class name */
    public static abstract class C0057a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, k kVar, k kVar2);

        public abstract d d(a<?> aVar, d dVar);

        public abstract k e(a aVar);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f4629c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f4630d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4631a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f4632b;

        static {
            if (a.f4622i) {
                f4630d = null;
                f4629c = null;
                return;
            }
            f4630d = new b((Throwable) null, false);
            f4629c = new b((Throwable) null, true);
        }

        public b(Throwable th, boolean z8) {
            this.f4631a = z8;
            this.f4632b = th;
        }
    }

    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f4633b = new c(new C0058a());

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f4634a;

        /* renamed from: g5.a$c$a  reason: collision with other inner class name */
        public class C0058a extends Throwable {
            public C0058a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.f4634a = th;
        }
    }

    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f4635d = new d();

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f4636a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f4637b;

        /* renamed from: c  reason: collision with root package name */
        public d f4638c;

        public d() {
            this.f4636a = null;
            this.f4637b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.f4636a = runnable;
            this.f4637b = executor;
        }
    }

    public static final class e extends C0057a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f4639a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f4640b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, k> f4641c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f4642d;
        public final AtomicReferenceFieldUpdater<a, Object> e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f4639a = atomicReferenceFieldUpdater;
            this.f4640b = atomicReferenceFieldUpdater2;
            this.f4641c = atomicReferenceFieldUpdater3;
            this.f4642d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4642d;
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

        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4641c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == kVar);
            return false;
        }

        public final d d(a<?> aVar, d dVar) {
            return this.f4642d.getAndSet(aVar, dVar);
        }

        public final k e(a aVar) {
            return this.f4641c.getAndSet(aVar, k.f4650c);
        }

        public final void f(k kVar, k kVar2) {
            this.f4640b.lazySet(kVar, kVar2);
        }

        public final void g(k kVar, Thread thread) {
            this.f4639a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final a<V> f4643f;

        /* renamed from: g  reason: collision with root package name */
        public final j<? extends V> f4644g;

        public f(a<V> aVar, j<? extends V> jVar) {
            this.f4643f = aVar;
            this.f4644g = jVar;
        }

        public final void run() {
            if (this.f4643f.f4626f == this) {
                if (a.f4624k.b(this.f4643f, this, a.i(this.f4644g))) {
                    a.f(this.f4643f);
                }
            }
        }
    }

    public static final class g extends C0057a {
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f4627g != dVar) {
                    return false;
                }
                aVar.f4627g = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4626f != obj) {
                    return false;
                }
                aVar.f4626f = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                if (aVar.f4628h != kVar) {
                    return false;
                }
                aVar.f4628h = kVar2;
                return true;
            }
        }

        public final d d(a<?> aVar, d dVar) {
            d dVar2;
            synchronized (aVar) {
                dVar2 = aVar.f4627g;
                if (dVar2 != dVar) {
                    aVar.f4627g = dVar;
                }
            }
            return dVar2;
        }

        public final k e(a aVar) {
            k kVar;
            k kVar2 = k.f4650c;
            synchronized (aVar) {
                kVar = aVar.f4628h;
                if (kVar != kVar2) {
                    aVar.f4628h = kVar2;
                }
            }
            return kVar;
        }

        public final void f(k kVar, k kVar2) {
            kVar.f4652b = kVar2;
        }

        public final void g(k kVar, Thread thread) {
            kVar.f4651a = thread;
        }
    }

    public interface h<V> extends j<V> {
    }

    public static abstract class i<V> extends a<V> implements h<V> {
        public final void a(Runnable runnable, Executor executor) {
            a.super.a(runnable, executor);
        }

        public final boolean cancel(boolean z8) {
            return a.super.cancel(z8);
        }

        public final V get() {
            return a.super.get();
        }

        public final V get(long j8, TimeUnit timeUnit) {
            return a.super.get(j8, timeUnit);
        }

        public final boolean isCancelled() {
            return this.f4626f instanceof b;
        }

        public final boolean isDone() {
            return a.super.isDone();
        }
    }

    public static final class j extends C0057a {

        /* renamed from: a  reason: collision with root package name */
        public static final Unsafe f4645a;

        /* renamed from: b  reason: collision with root package name */
        public static final long f4646b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f4647c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f4648d;
        public static final long e;

        /* renamed from: f  reason: collision with root package name */
        public static final long f4649f;

        /* renamed from: g5.a$j$a  reason: collision with other inner class name */
        public class C0059a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            public final /* bridge */ /* synthetic */ Object run() {
                return a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new g5.a.j.C0059a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<g5.a$k> r0 = g5.a.k.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                g5.a$j$a r1 = new g5.a$j$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<g5.a> r2 = g5.a.class
                java.lang.String r3 = "h"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f4647c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "g"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f4646b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "f"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f4648d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f4649f = r2     // Catch:{ Exception -> 0x0053 }
                f4645a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                f5.d.a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g5.a.j.<clinit>():void");
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            return b.a(f4645a, aVar, f4646b, dVar, dVar2);
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            return b.a(f4645a, aVar, f4648d, obj, obj2);
        }

        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            return b.a(f4645a, aVar, f4647c, kVar, kVar2);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final g5.a.d d(g5.a<?> r3, g5.a.d r4) {
            /*
                r2 = this;
            L_0x0000:
                g5.a$d r0 = r3.f4627g
                if (r4 != r0) goto L_0x0005
                return r0
            L_0x0005:
                boolean r1 = r2.a(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g5.a.j.d(g5.a, g5.a$d):g5.a$d");
        }

        public final k e(a aVar) {
            k kVar;
            k kVar2 = k.f4650c;
            do {
                kVar = aVar.f4628h;
                if (kVar2 == kVar || c(aVar, kVar, kVar2)) {
                    return kVar;
                }
                kVar = aVar.f4628h;
                return kVar;
            } while (c(aVar, kVar, kVar2));
            return kVar;
        }

        public final void f(k kVar, k kVar2) {
            f4645a.putObject(kVar, f4649f, kVar2);
        }

        public final void g(k kVar, Thread thread) {
            f4645a.putObject(kVar, e, thread);
        }
    }

    public static final class k {

        /* renamed from: c  reason: collision with root package name */
        public static final k f4650c = new k(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f4651a;

        /* renamed from: b  reason: collision with root package name */
        public volatile k f4652b;

        public k() {
            a.f4624k.g(this, Thread.currentThread());
        }

        public k(int i8) {
        }
    }

    static {
        boolean z8;
        C0057a aVar;
        Class<k> cls = k.class;
        try {
            z8 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z8 = false;
        }
        f4622i = z8;
        Class<a> cls2 = a.class;
        f4623j = Logger.getLogger(cls2.getName());
        Throwable th = null;
        try {
            aVar = new j();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new g();
        }
        f4624k = aVar;
        if (th != null) {
            Logger logger = f4623j;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    private void c(StringBuilder sb) {
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
        e(obj, sb);
        sb.append("]");
    }

    public static void f(a<?> aVar) {
        d dVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.getClass();
            for (k e4 = f4624k.e(aVar2); e4 != null; e4 = e4.f4652b) {
                Thread thread = e4.f4651a;
                if (thread != null) {
                    e4.f4651a = null;
                    LockSupport.unpark(thread);
                }
            }
            aVar2.d();
            d dVar2 = dVar;
            d d9 = f4624k.d(aVar2, d.f4635d);
            d dVar3 = dVar2;
            while (d9 != null) {
                d dVar4 = d9.f4638c;
                d9.f4638c = dVar3;
                dVar3 = d9;
                d9 = dVar4;
            }
            while (true) {
                if (dVar3 != null) {
                    dVar = dVar3.f4638c;
                    Runnable runnable = dVar3.f4636a;
                    Objects.requireNonNull(runnable);
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        a<V> aVar3 = fVar.f4643f;
                        if (aVar3.f4626f == fVar) {
                            if (f4624k.b(aVar3, fVar, i(fVar.f4644g))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = dVar3.f4637b;
                        Objects.requireNonNull(executor);
                        g(runnable, executor);
                    }
                    dVar3 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            f4623j.log(level, sb.toString(), e4);
        }
    }

    private static Object h(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f4632b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4634a);
        } else if (obj == f4625l) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object i(g5.j<?> r8) {
        /*
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r8 instanceof g5.a.h
            r2 = 0
            if (r1 == 0) goto L_0x0028
            g5.a r8 = (g5.a) r8
            java.lang.Object r8 = r8.f4626f
            boolean r0 = r8 instanceof g5.a.b
            if (r0 == 0) goto L_0x0024
            r0 = r8
            g5.a$b r0 = (g5.a.b) r0
            boolean r1 = r0.f4631a
            if (r1 == 0) goto L_0x0024
            java.lang.Throwable r8 = r0.f4632b
            if (r8 == 0) goto L_0x0022
            g5.a$b r8 = new g5.a$b
            java.lang.Throwable r0 = r0.f4632b
            r8.<init>(r0, r2)
            goto L_0x0024
        L_0x0022:
            g5.a$b r8 = g5.a.b.f4630d
        L_0x0024:
            java.util.Objects.requireNonNull(r8)
            return r8
        L_0x0028:
            boolean r1 = r8 instanceof h5.a
            if (r1 == 0) goto L_0x003b
            r1 = r8
            h5.a r1 = (h5.a) r1
            java.lang.Throwable r1 = r1.b()
            if (r1 == 0) goto L_0x003b
            g5.a$c r8 = new g5.a$c
            r8.<init>(r1)
            return r8
        L_0x003b:
            boolean r1 = r8.isCancelled()
            boolean r3 = f4622i
            r4 = 1
            r3 = r3 ^ r4
            r3 = r3 & r1
            if (r3 == 0) goto L_0x004c
            g5.a$b r8 = g5.a.b.f4630d
            java.util.Objects.requireNonNull(r8)
            return r8
        L_0x004c:
            r3 = r2
        L_0x004d:
            java.lang.Object r4 = r8.get()     // Catch:{ InterruptedException -> 0x00fa, all -> 0x008b }
            if (r3 == 0) goto L_0x005a
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r3.interrupt()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
        L_0x005a:
            if (r1 == 0) goto L_0x0086
            g5.a$b r3 = new g5.a$b     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            int r6 = r5.length()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            int r6 = r6 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r7.<init>(r6)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r7.append(r0)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r7.append(r5)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            java.lang.String r5 = r7.toString()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r4.<init>(r5)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r3.<init>(r4, r2)     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            return r3
        L_0x0080:
            r8 = move-exception
            goto L_0x0096
        L_0x0082:
            r0 = move-exception
            goto L_0x009c
        L_0x0084:
            r3 = move-exception
            goto L_0x00ca
        L_0x0086:
            if (r4 != 0) goto L_0x008a
            java.lang.Object r4 = f4625l     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
        L_0x008a:
            return r4
        L_0x008b:
            r4 = move-exception
            if (r3 == 0) goto L_0x0095
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
            r3.interrupt()     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
        L_0x0095:
            throw r4     // Catch:{ ExecutionException -> 0x0084, CancellationException -> 0x0082, all -> 0x0080 }
        L_0x0096:
            g5.a$c r0 = new g5.a$c
            r0.<init>(r8)
            return r0
        L_0x009c:
            if (r1 != 0) goto L_0x00c4
            g5.a$c r1 = new g5.a$c
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r3 = r8.length()
            int r3 = r3 + 77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r4.append(r3)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            r2.<init>(r8, r0)
            r1.<init>(r2)
            return r1
        L_0x00c4:
            g5.a$b r8 = new g5.a$b
            r8.<init>(r0, r2)
            return r8
        L_0x00ca:
            if (r1 == 0) goto L_0x00f0
            g5.a$b r1 = new g5.a$b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r5 = r8.length()
            int r5 = r5 + 84
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r4.<init>(r8, r3)
            r1.<init>(r4, r2)
            return r1
        L_0x00f0:
            g5.a$c r8 = new g5.a$c
            java.lang.Throwable r0 = r3.getCause()
            r8.<init>(r0)
            return r8
        L_0x00fa:
            r3 = r4
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.i(g5.j):java.lang.Object");
    }

    public void a(Runnable runnable, Executor executor) {
        d dVar;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        } else if (isDone() || (dVar = this.f4627g) == d.f4635d) {
            g(runnable, executor);
        } else {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f4638c = dVar;
                if (!f4624k.a(this, dVar, dVar2)) {
                    dVar = this.f4627g;
                } else {
                    return;
                }
            } while (dVar != d.f4635d);
            g(runnable, executor);
        }
    }

    public final Throwable b() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f4626f;
        if (obj instanceof c) {
            return ((c) obj).f4634a;
        }
        return null;
    }

    public boolean cancel(boolean z8) {
        b bVar;
        Object obj = this.f4626f;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f4622i) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z8);
        } else {
            bVar = z8 ? b.f4629c : b.f4630d;
            Objects.requireNonNull(bVar);
        }
        boolean z9 = false;
        while (true) {
            if (f4624k.b(this, obj, bVar)) {
                f(this);
                if (!(obj instanceof f)) {
                    return true;
                }
                j<? extends V> jVar = ((f) obj).f4644g;
                if (jVar instanceof h) {
                    this = (a) jVar;
                    obj = this.f4626f;
                    if (!(obj == null) && !(obj instanceof f)) {
                        return true;
                    }
                    z9 = true;
                } else {
                    jVar.cancel(z8);
                    return true;
                }
            } else {
                obj = this.f4626f;
                if (!(obj instanceof f)) {
                    return z9;
                }
            }
        }
    }

    public void d() {
    }

    public final void e(Object obj, StringBuilder sb) {
        String str;
        if (obj == null) {
            str = "null";
        } else if (obj == this) {
            str = "this future";
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            str = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(str);
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4626f;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return h(obj2);
            }
            k kVar = this.f4628h;
            k kVar2 = k.f4650c;
            if (kVar != kVar2) {
                k kVar3 = new k();
                do {
                    C0057a aVar = f4624k;
                    aVar.f(kVar3, kVar);
                    if (aVar.c(this, kVar, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4626f;
                            } else {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return h(obj);
                    }
                    kVar = this.f4628h;
                } while (kVar != kVar2);
            }
            Object obj3 = this.f4626f;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f4626f instanceof b;
    }

    public boolean isDone() {
        Object obj = this.f4626f;
        return (!(obj instanceof f)) & (obj != null);
    }

    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void k(k kVar) {
        kVar.f4651a = null;
        while (true) {
            k kVar2 = this.f4628h;
            if (kVar2 != k.f4650c) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.f4652b;
                    if (kVar2.f4651a != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.f4652b = kVar4;
                        if (kVar3.f4651a == null) {
                        }
                    } else if (!f4624k.c(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f4624k.b(this, (Object) null, new c(th))) {
            return false;
        }
        f(this);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x001e
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L_0x0026
        L_0x001e:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
        L_0x0026:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L_0x004d
            java.lang.String r7 = "CANCELLED"
            r0.append(r7)
            goto L_0x00db
        L_0x004d:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L_0x0058
            r7.c(r0)
            goto L_0x00db
        L_0x0058:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r7.f4626f
            boolean r4 = r3 instanceof g5.a.f
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L_0x008a
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            g5.a$f r3 = (g5.a.f) r3
            g5.j<? extends V> r3 = r3.f4644g
            if (r3 != r7) goto L_0x007a
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x007e }
            goto L_0x00c8
        L_0x007a:
            r0.append(r3)     // Catch:{ RuntimeException | StackOverflowError -> 0x007e }
            goto L_0x00c8
        L_0x007e:
            r3 = move-exception
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto L_0x00c8
        L_0x008a:
            java.lang.String r3 = r7.j()     // Catch:{ RuntimeException | StackOverflowError -> 0x00a0 }
            int r4 = f5.c.f4413a     // Catch:{ RuntimeException | StackOverflowError -> 0x00a0 }
            if (r3 == 0) goto L_0x009b
            boolean r4 = r3.isEmpty()     // Catch:{ RuntimeException | StackOverflowError -> 0x00a0 }
            if (r4 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r4 = 0
            goto L_0x009c
        L_0x009b:
            r4 = 1
        L_0x009c:
            if (r4 == 0) goto L_0x00be
            r3 = 0
            goto L_0x00be
        L_0x00a0:
            r3 = move-exception
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L_0x00be:
            if (r3 == 0) goto L_0x00cb
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
        L_0x00c8:
            r0.append(r2)
        L_0x00cb:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto L_0x00db
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.c(r0)
        L_0x00db:
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x01dc
            java.lang.Object r6 = r0.f4626f
            r7 = 1
            if (r6 == 0) goto L_0x0017
            r9 = r7
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            boolean r10 = r6 instanceof g5.a.f
            r10 = r10 ^ r7
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0023
            java.lang.Object r0 = h(r6)
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
            if (r6 < 0) goto L_0x009e
            g5.a$k r6 = r0.f4628h
            g5.a$k r15 = g5.a.k.f4650c
            if (r6 == r15) goto L_0x0094
            g5.a$k r8 = new g5.a$k
            r8.<init>()
        L_0x0041:
            g5.a$a r9 = f4624k
            r9.f(r8, r6)
            boolean r6 = r9.c(r0, r6, r8)
            if (r6 == 0) goto L_0x008c
        L_0x004c:
            r9 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r4 = java.lang.Math.min(r4, r9)
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0083
            java.lang.Object r4 = r0.f4626f
            if (r4 == 0) goto L_0x0064
            r5 = r7
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            boolean r6 = r4 instanceof g5.a.f
            r6 = r6 ^ r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0070
            java.lang.Object r0 = h(r4)
            return r0
        L_0x0070:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.k(r8)
            r8 = r4
            r4 = r3
            r5 = r4
            r2 = r1
            r1 = r0
            goto L_0x00c7
        L_0x0083:
            r0.k(r8)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008c:
            g5.a$k r6 = r0.f4628h
            if (r6 != r15) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r9 = 0
            goto L_0x0041
        L_0x0094:
            java.lang.Object r0 = r0.f4626f
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = h(r0)
            return r0
        L_0x009e:
            r16 = r9
            r8 = r4
            r4 = r3
            r5 = r4
            r2 = r1
            r1 = r0
        L_0x00a5:
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            java.lang.Object r6 = r1.f4626f
            if (r6 == 0) goto L_0x00af
            r8 = r7
            goto L_0x00b0
        L_0x00af:
            r8 = 0
        L_0x00b0:
            boolean r9 = r6 instanceof g5.a.f
            r9 = r9 ^ r7
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00bb
            java.lang.Object r0 = h(r6)
            return r0
        L_0x00bb:
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x00ca
            long r8 = java.lang.System.nanoTime()
            long r8 = r11 - r8
        L_0x00c7:
            r16 = 0
            goto L_0x00a5
        L_0x00ca:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00d0:
            java.lang.String r1 = r0.toString()
            java.lang.String r6 = r4.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toLowerCase(r10)
            java.lang.String r10 = java.lang.String.valueOf(r4)
            int r10 = r10.length()
            int r10 = r10 + 28
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Waited "
            r11.append(r10)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
            r11.append(r4)
            java.lang.String r3 = r11.toString()
            long r10 = r8 + r13
            r16 = 0
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x0199
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = " (plus "
            java.lang.String r3 = r3.concat(r4)
            long r8 = -r8
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = r5.convert(r8, r4)
            long r4 = r5.toNanos(r10)
            long r8 = r8 - r4
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0131
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r7 = 0
        L_0x0131:
            if (r4 <= 0) goto L_0x016f
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 21
            java.lang.String r5 = java.lang.String.valueOf(r6)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r3)
            r5.append(r10)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            if (r7 == 0) goto L_0x0167
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ","
            java.lang.String r3 = r3.concat(r4)
        L_0x0167:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r2)
        L_0x016f:
            if (r7 == 0) goto L_0x018f
            java.lang.String r2 = java.lang.String.valueOf(r3)
            int r3 = r2.length()
            int r3 = r3 + 33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            r4.append(r8)
            java.lang.String r2 = " nanoseconds "
            r4.append(r2)
            java.lang.String r3 = r4.toString()
        L_0x018f:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "delay)"
            java.lang.String r3 = r2.concat(r3)
        L_0x0199:
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L_0x01af
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " but future completed as timeout expired"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x01af:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = java.lang.String.valueOf(r3)
            int r2 = r2.length()
            int r2 = r2 + 5
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x01dc:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
