package androidx.wear.watchface.editor;

import android.content.ComponentName;
import androidx.activity.ComponentActivity;
import j7.d;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.c;
import l7.e;
import p1.a;
import q1.b;
import q7.k;
import t1.f;
import t1.j;
import u1.l;

public interface EditorSession extends AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f2368a = Companion.f2371a;

    /* renamed from: b  reason: collision with root package name */
    public static final Instant f2369b;

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f2370c;

    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f2371a = new Companion();

        @e(c = "androidx.wear.watchface.editor.EditorSession$Companion", f = "EditorSession.kt", l = {1209, 272}, m = "createOnWatchEditorSession")
        public static final class a extends c {

            /* renamed from: i  reason: collision with root package name */
            public Object f2372i;

            /* renamed from: j  reason: collision with root package name */
            public Object f2373j;

            /* renamed from: k  reason: collision with root package name */
            public Object f2374k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f2375l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Companion f2376m;

            /* renamed from: n  reason: collision with root package name */
            public int f2377n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Companion companion, d<? super a> dVar) {
                super(dVar);
                this.f2376m = companion;
            }

            public final Object h(Object obj) {
                this.f2375l = obj;
                this.f2377n |= Integer.MIN_VALUE;
                return this.f2376m.a((ComponentActivity) null, this);
            }
        }

        public static final class b implements j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f2378a;

            public b(ComponentActivity componentActivity) {
                this.f2378a = componentActivity;
            }

            public final p1.c a() {
                return new p1.c(this.f2378a);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(androidx.activity.ComponentActivity r7, j7.d<? super androidx.wear.watchface.editor.EditorSession> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.wear.watchface.editor.EditorSession.Companion.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.wear.watchface.editor.EditorSession$Companion$a r0 = (androidx.wear.watchface.editor.EditorSession.Companion.a) r0
                int r1 = r0.f2377n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f2377n = r1
                goto L_0x0018
            L_0x0013:
                androidx.wear.watchface.editor.EditorSession$Companion$a r0 = new androidx.wear.watchface.editor.EditorSession$Companion$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f2375l
                k7.a r1 = k7.a.f5217f
                int r2 = r0.f2377n
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x004a
                if (r2 == r4) goto L_0x003a
                if (r2 != r3) goto L_0x0032
                java.lang.Object r6 = r0.f2373j
                q7.p r6 = (q7.p) r6
                java.lang.Object r7 = r0.f2372i
                q7.p r7 = (q7.p) r7
                a1.a.I(r8)
                goto L_0x0098
            L_0x0032:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003a:
                java.lang.Object r6 = r0.f2374k
                q7.p r6 = (q7.p) r6
                java.lang.Object r7 = r0.f2373j
                androidx.activity.ComponentActivity r7 = (androidx.activity.ComponentActivity) r7
                java.lang.Object r2 = r0.f2372i
                androidx.wear.watchface.editor.EditorSession$Companion r2 = (androidx.wear.watchface.editor.EditorSession.Companion) r2
                a1.a.I(r8)
                goto L_0x0079
            L_0x004a:
                a1.a.I(r8)
                q7.p r8 = new q7.p
                r8.<init>()
                r0.f2372i = r6
                r0.f2373j = r7
                r0.f2374k = r8
                r0.f2377n = r4
                y7.h r2 = new y7.h
                j7.d r5 = a1.a.x(r0)
                r2.<init>(r4, r5)
                r2.v()
                androidx.lifecycle.s r4 = r7.f244d
                androidx.wear.watchface.editor.EditorSession$Companion$createOnWatchEditorSession$2$1 r5 = new androidx.wear.watchface.editor.EditorSession$Companion$createOnWatchEditorSession$2$1
                r5.<init>(r2, r8)
                r4.a(r5)
                java.lang.Object r2 = r2.u()
                if (r2 != r1) goto L_0x0077
                return r1
            L_0x0077:
                r2 = r6
                r6 = r8
            L_0x0079:
                android.content.Intent r8 = r7.getIntent()
                java.lang.String r4 = "activity.intent"
                q7.k.d(r8, r4)
                androidx.wear.watchface.editor.EditorSession$Companion$b r4 = new androidx.wear.watchface.editor.EditorSession$Companion$b
                r4.<init>(r7)
                r0.f2372i = r6
                r0.f2373j = r6
                r5 = 0
                r0.f2374k = r5
                r0.f2377n = r3
                java.lang.Object r8 = r2.b(r7, r8, r4, r0)
                if (r8 != r1) goto L_0x0097
                return r1
            L_0x0097:
                r7 = r6
            L_0x0098:
                r6.f6643f = r8
                T r6 = r7.f6643f
                q7.k.b(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.editor.EditorSession.Companion.a(androidx.activity.ComponentActivity, j7.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(androidx.activity.ComponentActivity r16, android.content.Intent r17, androidx.wear.watchface.editor.EditorSession.Companion.b r18, j7.d r19) {
            /*
                r15 = this;
                r0 = r19
                boolean r1 = r0 instanceof androidx.wear.watchface.editor.b
                if (r1 == 0) goto L_0x0015
                r1 = r0
                androidx.wear.watchface.editor.b r1 = (androidx.wear.watchface.editor.b) r1
                int r2 = r1.f2388l
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f2388l = r2
                goto L_0x001b
            L_0x0015:
                androidx.wear.watchface.editor.b r1 = new androidx.wear.watchface.editor.b
                r2 = r15
                r1.<init>(r15, r0)
            L_0x001b:
                java.lang.Object r0 = r1.f2386j
                k7.a r2 = k7.a.f5217f
                int r3 = r1.f2388l
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x003b
                if (r3 != r5) goto L_0x0033
                java.lang.Object r1 = r1.f2385i
                java.io.Closeable r1 = (java.io.Closeable) r1
                a1.a.I(r0)     // Catch:{ all -> 0x0030 }
                goto L_0x00a2
            L_0x0030:
                r0 = move-exception
                goto L_0x00a8
            L_0x0033:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x003b:
                a1.a.I(r0)
                v1.c r3 = new v1.c
                java.lang.String r0 = "EditorSession.createOnWatchEditorSessionAsyncImpl"
                r3.<init>(r0)
                java.lang.String r0 = "android.support.wearable.watchface.extra.WATCH_FACE_COMPONENT"
                r6 = r17
                android.os.Parcelable r0 = r6.getParcelableExtra(r0)     // Catch:{ all -> 0x00aa }
                r7 = r0
                android.content.ComponentName r7 = (android.content.ComponentName) r7     // Catch:{ all -> 0x00aa }
                if (r7 == 0) goto L_0x0065
                androidx.wear.watchface.editor.a r0 = new androidx.wear.watchface.editor.a     // Catch:{ all -> 0x00aa }
                java.lang.String r8 = ""
                r9 = 0
                o1.c r10 = new o1.c     // Catch:{ all -> 0x00aa }
                java.lang.String r6 = ""
                r10.<init>(r6)     // Catch:{ all -> 0x00aa }
                r11 = 0
                r12 = 0
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00aa }
                goto L_0x0069
            L_0x0065:
                androidx.wear.watchface.editor.a r0 = androidx.wear.watchface.editor.a.C0024a.a(r17)     // Catch:{ all -> 0x00aa }
            L_0x0069:
                android.content.ComponentName r6 = r0.f2381a     // Catch:{ all -> 0x00aa }
                java.util.Objects.toString(r6)     // Catch:{ all -> 0x00aa }
                o1.c r6 = r0.f2383c     // Catch:{ all -> 0x00aa }
                java.util.Objects.toString(r6)     // Catch:{ all -> 0x00aa }
                t1.u r6 = new t1.u     // Catch:{ all -> 0x00aa }
                android.content.ComponentName r9 = r0.f2381a     // Catch:{ all -> 0x00aa }
                o1.c r10 = r0.f2383c     // Catch:{ all -> 0x00aa }
                u1.f r11 = r0.f2382b     // Catch:{ all -> 0x00aa }
                androidx.lifecycle.LifecycleCoroutineScopeImpl r13 = a1.a.v(r16)     // Catch:{ all -> 0x00aa }
                t1.y r14 = r0.e     // Catch:{ all -> 0x00aa }
                r7 = r6
                r8 = r16
                r12 = r18
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00aa }
                androidx.lifecycle.LifecycleCoroutineScopeImpl r7 = a1.a.v(r16)     // Catch:{ all -> 0x00aa }
                j7.f r7 = r7.f1403g     // Catch:{ all -> 0x00aa }
                androidx.wear.watchface.editor.c r8 = new androidx.wear.watchface.editor.c     // Catch:{ all -> 0x00aa }
                r9 = r16
                r8.<init>(r6, r0, r9, r4)     // Catch:{ all -> 0x00aa }
                r1.f2385i = r3     // Catch:{ all -> 0x00aa }
                r1.f2388l = r5     // Catch:{ all -> 0x00aa }
                java.lang.Object r0 = k3.j.i0(r7, r8, r1)     // Catch:{ all -> 0x00aa }
                if (r0 != r2) goto L_0x00a1
                return r2
            L_0x00a1:
                r1 = r3
            L_0x00a2:
                t1.u r0 = (t1.u) r0     // Catch:{ all -> 0x0030 }
                k3.j.n(r1, r4)
                return r0
            L_0x00a8:
                r3 = r1
                goto L_0x00ab
            L_0x00aa:
                r0 = move-exception
            L_0x00ab:
                r1 = r0
                throw r1     // Catch:{ all -> 0x00ad }
            L_0x00ad:
                r0 = move-exception
                r2 = r0
                k3.j.n(r3, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.editor.EditorSession.Companion.b(androidx.activity.ComponentActivity, android.content.Intent, androidx.wear.watchface.editor.EditorSession$Companion$b, j7.d):java.lang.Object");
        }
    }

    static {
        Instant ofEpochMilli = Instant.ofEpochMilli(-1);
        k.d(ofEpochMilli, "ofEpochMilli(-1L)");
        f2369b = ofEpochMilli;
        Duration ofSeconds = Duration.ofSeconds(4);
        k.d(ofSeconds, "ofSeconds(4)");
        f2370c = ofSeconds;
    }

    Object E(int i8, d<? super f> dVar);

    ComponentName J();

    a8.f<Map<Integer, a>> K();

    MutableStateFlow<u1.e> b();

    l e();

    Instant f();

    o1.c k();

    void l(boolean z8);

    a8.f<Map<Integer, o1.a>> p();

    a8.f<Map<Integer, b>> r();
}
