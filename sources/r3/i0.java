package r3;

import android.os.Looper;
import z3.b;

public final class i0 extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f6993a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(c cVar, Looper looper) {
        super(looper);
        this.f6993a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == 5) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            r3.c r0 = r10.f6993a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f6952v
            int r0 = r0.get()
            int r1 = r11.arg1
            r2 = 0
            r3 = 7
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x003c
            int r10 = r11.what
            if (r10 == r4) goto L_0x0019
            if (r10 == r5) goto L_0x0019
            if (r10 != r3) goto L_0x001a
        L_0x0019:
            r2 = r5
        L_0x001a:
            if (r2 == 0) goto L_0x003b
            java.lang.Object r10 = r11.obj
            r3.j0 r10 = (r3.j0) r10
            r10.a()
            monitor-enter(r10)
            r10.f6994a = r6     // Catch:{ all -> 0x0038 }
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            r3.c r11 = r10.f6996c
            java.util.ArrayList<r3.j0<?>> r11 = r11.f6942k
            monitor-enter(r11)
            r3.c r0 = r10.f6996c     // Catch:{ all -> 0x0035 }
            java.util.ArrayList<r3.j0<?>> r0 = r0.f6942k     // Catch:{ all -> 0x0035 }
            r0.remove(r10)     // Catch:{ all -> 0x0035 }
            monitor-exit(r11)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0035 }
            throw r10
        L_0x0038:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0038 }
            throw r11
        L_0x003b:
            return
        L_0x003c:
            int r0 = r11.what
            r1 = 4
            r7 = 5
            if (r0 == r5) goto L_0x004e
            if (r0 == r3) goto L_0x004e
            if (r0 != r1) goto L_0x004c
            r3.c r0 = r10.f6993a
            r0.getClass()
            goto L_0x004e
        L_0x004c:
            if (r0 != r7) goto L_0x0056
        L_0x004e:
            r3.c r0 = r10.f6993a
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x01c6
        L_0x0056:
            int r0 = r11.what
            r8 = 8
            r9 = 3
            if (r0 != r1) goto L_0x00b2
            r3.c r0 = r10.f6993a
            o3.a r1 = new o3.a
            int r11 = r11.arg2
            r1.<init>(r11)
            r0.f6949s = r1
            r3.c r11 = r10.f6993a
            boolean r0 = r11.f6950t
            if (r0 == 0) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            java.lang.String r0 = r11.w()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.String r11 = r11.w()     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class.forName(r11)     // Catch:{ ClassNotFoundException -> 0x0089 }
            r2 = r5
        L_0x0089:
            if (r2 == 0) goto L_0x0096
            r3.c r11 = r10.f6993a
            boolean r0 = r11.f6950t
            if (r0 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            r11.z(r9, r6)
            return
        L_0x0096:
            r3.c r11 = r10.f6993a
            o3.a r11 = r11.f6949s
            if (r11 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            o3.a r11 = new o3.a
            r11.<init>(r8)
        L_0x00a2:
            r3.c r0 = r10.f6993a
            r3.c$c r0 = r0.f6940i
            r0.a(r11)
            r3.c r10 = r10.f6993a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00b2:
            if (r0 != r7) goto L_0x00d0
            r3.c r11 = r10.f6993a
            o3.a r11 = r11.f6949s
            if (r11 == 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            o3.a r11 = new o3.a
            r11.<init>(r8)
        L_0x00c0:
            r3.c r0 = r10.f6993a
            r3.c$c r0 = r0.f6940i
            r0.a(r11)
            r3.c r10 = r10.f6993a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00d0:
            if (r0 != r9) goto L_0x00f2
            java.lang.Object r0 = r11.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00db
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00db:
            o3.a r0 = new o3.a
            int r11 = r11.arg2
            r0.<init>(r11, r6)
            r3.c r11 = r10.f6993a
            r3.c$c r11 = r11.f6940i
            r11.a(r0)
            r3.c r10 = r10.f6993a
            r10.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00f2:
            r1 = 6
            if (r0 != r1) goto L_0x0117
            r3.c r0 = r10.f6993a
            r0.z(r7, r6)
            r3.c r0 = r10.f6993a
            r3.c$a r0 = r0.f6945n
            if (r0 == 0) goto L_0x0109
            int r11 = r11.arg2
            r3.v r0 = (r3.v) r0
            q3.c r0 = r0.f7044a
            r0.h(r11)
        L_0x0109:
            r3.c r11 = r10.f6993a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            r3.c r10 = r10.f6993a
            r3.c.y(r10, r7, r5, r6)
            return
        L_0x0117:
            if (r0 != r4) goto L_0x0141
            r3.c r10 = r10.f6993a
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x0122
            goto L_0x0141
        L_0x0122:
            java.lang.Object r10 = r11.obj
            r3.j0 r10 = (r3.j0) r10
            r10.a()
            monitor-enter(r10)
            r10.f6994a = r6     // Catch:{ all -> 0x013e }
            monitor-exit(r10)     // Catch:{ all -> 0x013e }
            r3.c r11 = r10.f6996c
            java.util.ArrayList<r3.j0<?>> r11 = r11.f6942k
            monitor-enter(r11)
            r3.c r0 = r10.f6996c     // Catch:{ all -> 0x013b }
            java.util.ArrayList<r3.j0<?>> r0 = r0.f6942k     // Catch:{ all -> 0x013b }
            r0.remove(r10)     // Catch:{ all -> 0x013b }
            monitor-exit(r11)     // Catch:{ all -> 0x013b }
            return
        L_0x013b:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x013b }
            throw r10
        L_0x013e:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x013e }
            throw r11
        L_0x0141:
            int r10 = r11.what
            if (r10 == r4) goto L_0x0149
            if (r10 == r5) goto L_0x0149
            if (r10 != r3) goto L_0x014a
        L_0x0149:
            r2 = r5
        L_0x014a:
            if (r2 == 0) goto L_0x01a8
            java.lang.Object r10 = r11.obj
            r11 = r10
            r3.j0 r11 = (r3.j0) r11
            monitor-enter(r11)
            TListener r10 = r11.f6994a     // Catch:{ all -> 0x01a5 }
            boolean r0 = r11.f6995b     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "GmsClient"
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01a5 }
            int r2 = r1.length()     // Catch:{ all -> 0x01a5 }
            int r2 = r2 + 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a5 }
            r3.<init>(r2)     // Catch:{ all -> 0x01a5 }
            java.lang.String r2 = "Callback proxy "
            r3.append(r2)     // Catch:{ all -> 0x01a5 }
            r3.append(r1)     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = " being reused. This is not safe."
            r3.append(r1)     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01a5 }
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x01a5 }
        L_0x017d:
            monitor-exit(r11)     // Catch:{ all -> 0x01a5 }
            if (r10 == 0) goto L_0x0186
            r11.b()     // Catch:{ RuntimeException -> 0x0184 }
            goto L_0x0186
        L_0x0184:
            r10 = move-exception
            throw r10
        L_0x0186:
            monitor-enter(r11)
            r11.f6995b = r5     // Catch:{ all -> 0x01a2 }
            monitor-exit(r11)     // Catch:{ all -> 0x01a2 }
            monitor-enter(r11)
            r11.f6994a = r6     // Catch:{ all -> 0x019f }
            monitor-exit(r11)     // Catch:{ all -> 0x019f }
            r3.c r10 = r11.f6996c
            java.util.ArrayList<r3.j0<?>> r10 = r10.f6942k
            monitor-enter(r10)
            r3.c r0 = r11.f6996c     // Catch:{ all -> 0x019c }
            java.util.ArrayList<r3.j0<?>> r0 = r0.f6942k     // Catch:{ all -> 0x019c }
            r0.remove(r11)     // Catch:{ all -> 0x019c }
            monitor-exit(r10)     // Catch:{ all -> 0x019c }
            return
        L_0x019c:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x019c }
            throw r11
        L_0x019f:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x019f }
            throw r10
        L_0x01a2:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01a2 }
            throw r10
        L_0x01a5:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01a5 }
            throw r10
        L_0x01a8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r0 = 45
            r11.<init>(r0)
            java.lang.String r0 = "Don't know how to handle message: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r10, r11)
            return
        L_0x01c6:
            java.lang.Object r10 = r11.obj
            r3.j0 r10 = (r3.j0) r10
            r10.a()
            monitor-enter(r10)
            r10.f6994a = r6     // Catch:{ all -> 0x01e2 }
            monitor-exit(r10)     // Catch:{ all -> 0x01e2 }
            r3.c r11 = r10.f6996c
            java.util.ArrayList<r3.j0<?>> r11 = r11.f6942k
            monitor-enter(r11)
            r3.c r0 = r10.f6996c     // Catch:{ all -> 0x01df }
            java.util.ArrayList<r3.j0<?>> r0 = r0.f6942k     // Catch:{ all -> 0x01df }
            r0.remove(r10)     // Catch:{ all -> 0x01df }
            monitor-exit(r11)     // Catch:{ all -> 0x01df }
            return
        L_0x01df:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01df }
            throw r10
        L_0x01e2:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01e2 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.i0.handleMessage(android.os.Message):void");
    }
}
