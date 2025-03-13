package j5;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.appcompat.widget.p;
import androidx.health.services.client.HealthServices;
import androidx.health.services.client.PassiveListenerCallback;
import androidx.health.services.client.PassiveMonitoringClient;
import androidx.health.services.client.data.DataPointContainer;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.data.IntervalDataPoint;
import androidx.health.services.client.data.PassiveGoal;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import androidx.health.services.client.data.SampleDataPoint;
import androidx.health.services.client.data.UserActivityInfo;
import b0.c;
import c6.b;
import com.samsung.android.wearable.watchfacestudio.PermissionActivity;
import g5.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.g;
import t1.f;
import w5.d;

public final class e extends b {

    /* renamed from: g  reason: collision with root package name */
    public final Context f5020g;

    /* renamed from: h  reason: collision with root package name */
    public final PassiveMonitoringClient f5021h;

    /* renamed from: i  reason: collision with root package name */
    public final f f5022i;

    /* renamed from: j  reason: collision with root package name */
    public final p f5023j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5024k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5025l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5026m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5027n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5028o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5029p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f5030q = 0;
    public int r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f5031s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f5032t = 3;

    public class a implements PassiveListenerCallback {
        public a() {
        }

        public final void onGoalCompleted(PassiveGoal passiveGoal) {
            Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onGoalCompleted:");
        }

        public final void onHealthEventReceived(HealthEvent healthEvent) {
            Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onHealthEventReceived:");
        }

        public final void onNewDataPointsReceived(DataPointContainer dataPointContainer) {
            List<IntervalDataPoint<Long>> data = dataPointContainer.getData(DataType.STEPS_DAILY);
            boolean isEmpty = data.isEmpty();
            e eVar = e.this;
            if (!isEmpty) {
                Log.i("DWF:WearHealthProvider", "passiveMonitoringClient callback steps onDataReceived size:" + data.size() + ", value:" + data.get(0).getValue());
                if (data.size() > 0) {
                    eVar.u(((Long) data.get(0).getValue()).intValue());
                }
            }
            List<SampleDataPoint<Double>> data2 = dataPointContainer.getData(DataType.HEART_RATE_BPM);
            if (!data2.isEmpty()) {
                Log.i("DWF:WearHealthProvider", "passiveMonitoringClient callback heartRate onDataReceived size:" + data2.size() + ", value:" + data2.get(0).getValue());
                if (data2.size() > 0) {
                    int intValue = ((Double) data2.get(0).getValue()).intValue();
                    if (intValue <= 0) {
                        eVar.getClass();
                    } else if (eVar.f5030q != intValue) {
                        eVar.f5030q = intValue;
                        eVar.n(Arrays.asList(new b.a[]{b.a.f2710g, b.a.f2711h}));
                        return;
                    }
                    Log.w("DWF:WearHealthProvider", "heartRate:" + intValue);
                }
            }
        }

        public final void onPermissionLost() {
            Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onPermissionLost:");
        }

        public final void onRegistered() {
            StringBuilder sb = new StringBuilder("PassiveMonitoringClient onRegistered.");
            e eVar = e.this;
            sb.append(eVar.f5021h.hashCode());
            Log.i("DWF:WearHealthProvider", sb.toString());
            eVar.f5028o = true;
            eVar.f5021h.flushAsync();
        }

        public final void onRegistrationFailed(Throwable th) {
            Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onRegistrationFailed:" + th);
            e.this.f5028o = false;
        }

        public final void onUserActivityInfoReceived(UserActivityInfo userActivityInfo) {
            Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onUserActivityInfoReceived:" + userActivityInfo);
        }
    }

    public e(Context context, f fVar, p pVar) {
        super(context);
        this.f5020g = context;
        this.f5022i = fVar;
        this.f5023j = pVar;
        PassiveMonitoringClient passiveMonitoringClient = HealthServices.getClient(context).getPassiveMonitoringClient();
        this.f5021h = passiveMonitoringClient;
        j<PassiveMonitoringCapabilities> capabilitiesAsync = passiveMonitoringClient.getCapabilitiesAsync();
        capabilitiesAsync.a(new c(this, 8, capabilitiesAsync), context.getMainExecutor());
    }

    public final void c() {
        StringBuilder sb = new StringBuilder("Destroy. ");
        PassiveMonitoringClient passiveMonitoringClient = this.f5021h;
        sb.append(passiveMonitoringClient.hashCode());
        Log.i("DWF:WearHealthProvider", sb.toString());
        passiveMonitoringClient.clearPassiveListenerCallbackAsync();
        this.f5024k = true;
    }

    public final d d() {
        return d.I0;
    }

    public final void k() {
        Log.i("DWF:WearHealthProvider", "onPause");
    }

    public final void l() {
        Log.i("DWF:WearHealthProvider", "onResume");
        if (this.f2720f.size() > 0 && this.f5029p) {
            if (this.f5032t > 0 && (p(d.P0) || p(d.Q0))) {
                s(this.f5023j);
                this.f5032t--;
            }
            if (this.f5028o) {
                Log.i("DWF:WearHealthProvider", "PassiveMonitoringClient onRegistered already");
            } else {
                r();
            }
        }
    }

    public final d m() {
        return d.S0;
    }

    public final boolean p(d dVar) {
        HashMap hashMap = this.f2720f;
        return hashMap.containsKey(dVar) && ((Boolean) hashMap.get(dVar)).booleanValue();
    }

    public final int q(String str) {
        if (!g.d(str)) {
            return -1;
        }
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("DWF:WearHealthProvider", "fail to parse step count: " + str);
            return -1;
        }
    }

    public final void r() {
        if (!this.f5024k) {
            if (!(p(d.P0) || p(d.Q0))) {
                Log.i("DWF:WearHealthProvider", "No need to register PassiveMonitoringClient");
                return;
            }
            HashSet hashSet = new HashSet();
            if (this.f5026m) {
                hashSet.add(DataType.HEART_RATE_BPM);
            }
            if (hashSet.isEmpty()) {
                Log.e("DWF:WearHealthProvider", "There are no supported data types");
            } else {
                this.f5021h.setPassiveListenerCallback(PassiveListenerConfig.builder().setDataTypes(hashSet).build(), new a());
            }
        }
    }

    public final void s(p pVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f5020g.checkSelfPermission("android.permission.BODY_SENSORS") != 0) {
            arrayList.add("android.permission.BODY_SENSORS");
        } else {
            Log.i("DWF:WearHealthProvider", "permission: android.permission.BODY_SENSORS already granted.");
        }
        if (arrayList.isEmpty()) {
            Log.i("DWF:WearHealthProvider", "All permissions granted.");
            return;
        }
        d dVar = new d();
        pVar.getClass();
        int identityHashCode = System.identityHashCode(dVar);
        ((Map) pVar.f785b).put(Integer.valueOf(identityHashCode), dVar);
        Intent intent = new Intent((Context) pVar.f786c, PermissionActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("REQUEST_CODE", identityHashCode);
        intent.putExtra("PERMISSIONS", (String[]) arrayList.toArray(new String[0]));
        ((Context) pVar.f786c).startActivity(intent);
    }

    public final void t(int i8) {
        if (i8 < 0 || this.f5031s == i8) {
            Log.w("DWF:WearHealthProvider", "setStepGoal:" + i8);
            return;
        }
        this.f5031s = i8;
        n(Arrays.asList(new b.a[]{b.a.f2713j, b.a.f2714k}));
    }

    public final void u(int i8) {
        if (i8 < 0 || this.r == i8) {
            Log.w("DWF:WearHealthProvider", "updateStepCount:" + i8);
            return;
        }
        this.r = i8;
        n(Arrays.asList(new b.a[]{b.a.f2712i, b.a.f2714k}));
    }
}
