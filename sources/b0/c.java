package b0;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2505f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f2506g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f2507h;

    public /* synthetic */ c(Object obj, int i8, Object obj2) {
        this.f2505f = i8;
        this.f2506g = obj;
        this.f2507h = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0103, code lost:
        k3.j.n(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0106, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f2505f
            r1 = 0
            java.lang.String r2 = "$task"
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r6.f2507h
            java.lang.Object r6 = r6.f2506g
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x015b;
                case 2: goto L_0x0153;
                case 3: goto L_0x014b;
                case 4: goto L_0x0143;
                case 5: goto L_0x0119;
                case 6: goto L_0x0107;
                case 7: goto L_0x00e0;
                case 8: goto L_0x008a;
                case 9: goto L_0x006a;
                case 10: goto L_0x0060;
                case 11: goto L_0x0056;
                case 12: goto L_0x004c;
                case 13: goto L_0x0044;
                case 14: goto L_0x0031;
                case 15: goto L_0x0027;
                case 16: goto L_0x001d;
                case 17: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x016b
        L_0x0010:
            e7.b r6 = (e7.b) r6
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r6.getClass()
            r5.run()
            r6.f4282j = r3
            return
        L_0x001d:
            o6.q r6 = (o6.q) r6
            o6.j r5 = (o6.j) r5
            java.util.HashSet r6 = r6.f6178g
            r6.remove(r5)
            return
        L_0x0027:
            o6.p r6 = (o6.p) r6
            o6.g r5 = (o6.g) r5
            java.util.ArrayList<o6.g> r6 = r6.f6173d
            r6.remove(r5)
            return
        L_0x0031:
            n6.h r6 = (n6.h) r6
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            java.util.HashMap r0 = n6.h.e
            r6.getClass()
            r5.run()
            int r0 = r6.f5968d
            int r0 = r0 + -1
            r6.f5968d = r0
            return
        L_0x0044:
            android.content.Context r6 = (android.content.Context) r6
            x6.c r5 = (x6.c) r5
            r6.unregisterReceiver(r5)
            return
        L_0x004c:
            s5.b r6 = (s5.b) r6
            o6.g r5 = (o6.g) r5
            java.util.HashMap r6 = r6.f7210a
            r6.remove(r5)
            return
        L_0x0056:
            r5.e r6 = (r5.e) r6
            s5.q r5 = (s5.q) r5
            java.util.HashSet r6 = r6.e
            r6.remove(r5)
            return
        L_0x0060:
            r5.e r6 = (r5.e) r6
            s5.r r5 = (s5.r) r5
            java.util.HashSet r6 = r6.f7075f
            r6.remove(r5)
            return
        L_0x006a:
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r6 = (com.samsung.android.wearable.watchfacestudio.editor.EditorActivity) r6
            g5.j r5 = (g5.j) r5
            int r0 = com.samsung.android.wearable.watchfacestudio.editor.EditorActivity.C
            r6.getClass()
            java.lang.Object r0 = r5.get()     // Catch:{ InterruptedException | ExecutionException -> 0x007f }
            t1.r r0 = (t1.r) r0     // Catch:{ InterruptedException | ExecutionException -> 0x007f }
            r6.f3864z = r0     // Catch:{ InterruptedException | ExecutionException -> 0x007f }
            r6.k()     // Catch:{ InterruptedException | ExecutionException -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r6 = move-exception
            java.lang.String r0 = "DWF:EditorActivity"
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r0, r6)
        L_0x0089:
            return
        L_0x008a:
            j5.e r6 = (j5.e) r6
            g5.j r5 = (g5.j) r5
            r6.getClass()
            java.lang.String r0 = "DWF:WearHealthProvider"
            java.lang.Object r1 = r5.get()     // Catch:{ InterruptedException | ExecutionException -> 0x00d4 }
            androidx.health.services.client.data.PassiveMonitoringCapabilities r1 = (androidx.health.services.client.data.PassiveMonitoringCapabilities) r1     // Catch:{ InterruptedException | ExecutionException -> 0x00d4 }
            java.util.Set r2 = r1.getSupportedDataTypesPassiveMonitoring()
            androidx.health.services.client.data.DeltaDataType<java.lang.Double, androidx.health.services.client.data.SampleDataPoint<java.lang.Double>> r3 = androidx.health.services.client.data.DataType.HEART_RATE_BPM
            boolean r2 = r2.contains(r3)
            r6.f5026m = r2
            java.util.Set r1 = r1.getSupportedDataTypesPassiveMonitoring()
            androidx.health.services.client.data.DeltaDataType<java.lang.Long, androidx.health.services.client.data.IntervalDataPoint<java.lang.Long>> r2 = androidx.health.services.client.data.DataType.STEPS_DAILY
            boolean r1 = r1.contains(r2)
            r6.f5025l = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "STEPS check:"
            r1.<init>(r2)
            boolean r2 = r6.f5025l
            r1.append(r2)
            java.lang.String r2 = ", HEART_RATE_BPM check:"
            r1.append(r2)
            boolean r2 = r6.f5026m
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            r6.r()
            r6.f5029p = r4
            goto L_0x00df
        L_0x00d4:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r0, r6)
        L_0x00df:
            return
        L_0x00e0:
            java.lang.String r6 = (java.lang.String) r6
            p7.a r5 = (p7.a) r5
            java.lang.String r0 = "$traceEventName"
            q7.k.e(r6, r0)
            q7.k.e(r5, r2)
            v1.c r0 = new v1.c
            java.lang.String r2 = " invokeTask"
            java.lang.String r6 = r6.concat(r2)
            r0.<init>(r6)
            r5.invoke()     // Catch:{ all -> 0x0100 }
            h7.h r6 = h7.h.f4787a     // Catch:{ all -> 0x0100 }
            k3.j.n(r0, r1)
            return
        L_0x0100:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            k3.j.n(r0, r6)
            throw r1
        L_0x0107:
            p7.a r6 = (p7.a) r6
            androidx.appcompat.widget.p r5 = (androidx.appcompat.widget.p) r5
            q7.k.e(r6, r2)
            java.lang.String r0 = "this$0"
            q7.k.e(r5, r0)
            r6.invoke()
            r5.f786c = r1
            return
        L_0x0119:
            androidx.profileinstaller.ProfileInstallerInitializer r6 = (androidx.profileinstaller.ProfileInstallerInitializer) r6
            android.content.Context r5 = (android.content.Context) r5
            r6.getClass()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            android.os.Handler r6 = androidx.profileinstaller.ProfileInstallerInitializer.b.a(r6)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.max(r1, r4)
            int r0 = r0.nextInt(r1)
            z0.c r1 = new z0.c
            r1.<init>(r5, r3)
            int r0 = r0 + 5000
            long r2 = (long) r0
            r6.postDelayed(r1, r2)
            return
        L_0x0143:
            androidx.health.services.client.impl.ipc.internal.DefaultExecutionTracker r6 = (androidx.health.services.client.impl.ipc.internal.DefaultExecutionTracker) r6
            g5.l r5 = (g5.l) r5
            r6.lambda$track$0(r5)
            return
        L_0x014b:
            androidx.health.services.client.impl.PassiveListenerCallbackStub r6 = (androidx.health.services.client.impl.PassiveListenerCallbackStub) r6
            androidx.health.services.client.impl.event.PassiveListenerEvent r5 = (androidx.health.services.client.impl.event.PassiveListenerEvent) r5
            androidx.health.services.client.impl.PassiveListenerCallbackStub.onPassiveListenerEvent$lambda$0(r6, r5)
            return
        L_0x0153:
            androidx.health.services.client.impl.MeasureCallbackStub r6 = (androidx.health.services.client.impl.MeasureCallbackStub) r6
            androidx.health.services.client.impl.event.MeasureCallbackEvent r5 = (androidx.health.services.client.impl.event.MeasureCallbackEvent) r5
            androidx.health.services.client.impl.MeasureCallbackStub.onMeasureCallbackEvent$lambda$0(r6, r5)
            return
        L_0x015b:
            androidx.health.services.client.impl.ExerciseUpdateListenerStub r6 = (androidx.health.services.client.impl.ExerciseUpdateListenerStub) r6
            androidx.health.services.client.impl.event.ExerciseUpdateListenerEvent r5 = (androidx.health.services.client.impl.event.ExerciseUpdateListenerEvent) r5
            androidx.health.services.client.impl.ExerciseUpdateListenerStub.onExerciseUpdateListenerEvent$lambda$0(r6, r5)
            return
        L_0x0163:
            b0.b$b r6 = (b0.b.C0027b) r6
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            r6.d(r5)
            return
        L_0x016b:
            e7.k r6 = (e7.k) r6
            e7.b r5 = (e7.b) r5
            e7.k$a r6 = r6.f4295g
            r5.f4279g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c.run():void");
    }
}
