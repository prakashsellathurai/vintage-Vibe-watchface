package x0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f8098f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f8099g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8100a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f8101b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f8102c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f8103d = new ArrayList<>();
    public final Handler e;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public class C0153a extends Handler {
        public C0153a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r2 >= r0) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r3 = r1[r2];
            r4 = r3.f8106b.size();
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r5 >= r4) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r6 = r3.f8106b.get(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r6.f8110d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r6.f8108b.onReceive(r9.f8100a, r3.f8105a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r2 = r2 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r10)
                goto L_0x0017
            L_0x0009:
                x0.a r9 = x0.a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<x0.a$c>> r10 = r9.f8101b
                monitor-enter(r10)
                java.util.ArrayList<x0.a$b> r0 = r9.f8103d     // Catch:{ all -> 0x004f }
                int r0 = r0.size()     // Catch:{ all -> 0x004f }
                if (r0 > 0) goto L_0x0018
                monitor-exit(r10)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                x0.a$b[] r1 = new x0.a.b[r0]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<x0.a$b> r2 = r9.f8103d     // Catch:{ all -> 0x004f }
                r2.toArray(r1)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<x0.a$b> r2 = r9.f8103d     // Catch:{ all -> 0x004f }
                r2.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r10)     // Catch:{ all -> 0x004f }
                r10 = 0
                r2 = r10
            L_0x0027:
                if (r2 >= r0) goto L_0x000b
                r3 = r1[r2]
                java.util.ArrayList<x0.a$c> r4 = r3.f8106b
                int r4 = r4.size()
                r5 = r10
            L_0x0032:
                if (r5 >= r4) goto L_0x004c
                java.util.ArrayList<x0.a$c> r6 = r3.f8106b
                java.lang.Object r6 = r6.get(r5)
                x0.a$c r6 = (x0.a.c) r6
                boolean r7 = r6.f8110d
                if (r7 != 0) goto L_0x0049
                android.content.BroadcastReceiver r6 = r6.f8108b
                android.content.Context r7 = r9.f8100a
                android.content.Intent r8 = r3.f8105a
                r6.onReceive(r7, r8)
            L_0x0049:
                int r5 = r5 + 1
                goto L_0x0032
            L_0x004c:
                int r2 = r2 + 1
                goto L_0x0027
            L_0x004f:
                r9 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004f }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.a.C0153a.handleMessage(android.os.Message):void");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f8105a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f8106b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f8105a = intent;
            this.f8106b = arrayList;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f8107a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f8108b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8109c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8110d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f8107a = intentFilter;
            this.f8108b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f8108b);
            sb.append(" filter=");
            sb.append(this.f8107a);
            if (this.f8110d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f8100a = context;
        this.e = new C0153a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f8098f) {
            if (f8099g == null) {
                f8099g = new a(context.getApplicationContext());
            }
            aVar = f8099g;
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<x0.a$c>> r2 = r0.f8101b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00dc }
            android.content.Context r3 = r0.f8100a     // Catch:{ all -> 0x00dc }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00dc }
            java.lang.String r11 = r1.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00dc }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00dc }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00dc }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00dc }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00dc }
            r3 = r3 & 8
            r9 = 0
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = r9
        L_0x002f:
            if (r16 == 0) goto L_0x0034
            r23.toString()     // Catch:{ all -> 0x00dc }
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.ArrayList<x0.a$c>> r3 = r0.f8102c     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00dc }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00dc }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00da
            if (r16 == 0) goto L_0x0048
            r8.toString()     // Catch:{ all -> 0x00dc }
        L_0x0048:
            r3 = 0
            r7 = r3
            r6 = r9
        L_0x004b:
            int r3 = r8.size()     // Catch:{ all -> 0x00dc }
            if (r6 >= r3) goto L_0x00aa
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00dc }
            r5 = r3
            x0.a$c r5 = (x0.a.c) r5     // Catch:{ all -> 0x00dc }
            if (r16 == 0) goto L_0x005f
            android.content.IntentFilter r3 = r5.f8107a     // Catch:{ all -> 0x00dc }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x00dc }
        L_0x005f:
            boolean r3 = r5.f8109c     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x006e
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x009f
        L_0x006e:
            android.content.IntentFilter r3 = r5.f8107a     // Catch:{ all -> 0x00dc }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dc }
            if (r3 < 0) goto L_0x009f
            if (r16 == 0) goto L_0x008f
            java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00dc }
        L_0x008f:
            if (r10 != 0) goto L_0x0097
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r7.<init>()     // Catch:{ all -> 0x00dc }
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            r7.add(r15)     // Catch:{ all -> 0x00dc }
            r3 = 1
            r15.f8109c = r3     // Catch:{ all -> 0x00dc }
            goto L_0x00a0
        L_0x009f:
            r7 = r10
        L_0x00a0:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x004b
        L_0x00aa:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x00da
            r9 = r11
        L_0x00af:
            int r3 = r10.size()     // Catch:{ all -> 0x00dc }
            if (r9 >= r3) goto L_0x00c0
            java.lang.Object r3 = r10.get(r9)     // Catch:{ all -> 0x00dc }
            x0.a$c r3 = (x0.a.c) r3     // Catch:{ all -> 0x00dc }
            r3.f8109c = r11     // Catch:{ all -> 0x00dc }
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00c0:
            java.util.ArrayList<x0.a$b> r3 = r0.f8103d     // Catch:{ all -> 0x00dc }
            x0.a$b r4 = new x0.a$b     // Catch:{ all -> 0x00dc }
            r4.<init>(r1, r10)     // Catch:{ all -> 0x00dc }
            r3.add(r4)     // Catch:{ all -> 0x00dc }
            android.os.Handler r1 = r0.e     // Catch:{ all -> 0x00dc }
            r3 = 1
            boolean r1 = r1.hasMessages(r3)     // Catch:{ all -> 0x00dc }
            if (r1 != 0) goto L_0x00d8
            android.os.Handler r0 = r0.e     // Catch:{ all -> 0x00dc }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00dc }
        L_0x00d8:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return
        L_0x00da:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.b(android.content.Intent):void");
    }
}
