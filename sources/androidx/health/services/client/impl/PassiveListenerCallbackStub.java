package androidx.health.services.client.impl;

import android.util.Log;
import androidx.health.services.client.PassiveListenerCallback;
import androidx.health.services.client.data.UserActivityInfo;
import androidx.health.services.client.impl.IPassiveListenerCallback;
import androidx.health.services.client.impl.event.PassiveListenerEvent;
import androidx.health.services.client.impl.ipc.internal.ListenerKey;
import androidx.health.services.client.impl.response.HealthEventResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringGoalResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringUpdateResponse;
import androidx.health.services.client.proto.EventsProto;
import androidx.health.services.client.proto.ResponsesProto;
import b0.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import q7.g;
import q7.k;

public final class PassiveListenerCallbackStub extends IPassiveListenerCallback.Stub {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    public static final String TAG = "PassiveListenerCallbackStub";
    private final PassiveListenerCallback callback;
    private final Executor executor;
    private final ListenerKey listenerKey;
    private final String packageName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public static final class PassiveListenerCallbackCache {
        public static final Companion Companion = new Companion((g) null);
        public static final PassiveListenerCallbackCache INSTANCE = new PassiveListenerCallbackCache();
        private final Object listenerLock = new Object();
        private final Map<String, PassiveListenerCallbackStub> listeners = new HashMap();

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        private PassiveListenerCallbackCache() {
        }

        public final PassiveListenerCallbackStub getOrCreate(String str, Executor executor, PassiveListenerCallback passiveListenerCallback) {
            PassiveListenerCallbackStub passiveListenerCallbackStub;
            k.e(str, "packageName");
            k.e(executor, "executor");
            k.e(passiveListenerCallback, "callback");
            synchronized (this.listenerLock) {
                Map<String, PassiveListenerCallbackStub> map = this.listeners;
                PassiveListenerCallbackStub passiveListenerCallbackStub2 = map.get(str);
                if (passiveListenerCallbackStub2 == null) {
                    passiveListenerCallbackStub2 = new PassiveListenerCallbackStub(str, executor, passiveListenerCallback);
                    map.put(str, passiveListenerCallbackStub2);
                }
                passiveListenerCallbackStub = passiveListenerCallbackStub2;
            }
            return passiveListenerCallbackStub;
        }

        public final PassiveListenerCallbackStub remove(String str) {
            PassiveListenerCallbackStub remove;
            k.e(str, "packageName");
            synchronized (this.listenerLock) {
                remove = this.listeners.remove(str);
            }
            return remove;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase[] r0 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.PASSIVE_UPDATE_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.PASSIVE_GOAL_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.HEALTH_EVENT_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.PERMISSION_LOST_RESPONSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.health.services.client.proto.EventsProto$PassiveListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.PassiveListenerEvent.EventCase.EVENT_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.PassiveListenerCallbackStub.WhenMappings.<clinit>():void");
        }
    }

    public PassiveListenerCallbackStub(String str, Executor executor2, PassiveListenerCallback passiveListenerCallback) {
        k.e(str, "packageName");
        k.e(executor2, "executor");
        k.e(passiveListenerCallback, "callback");
        this.packageName = str;
        this.executor = executor2;
        this.callback = passiveListenerCallback;
        this.listenerKey = new ListenerKey(str);
    }

    /* access modifiers changed from: private */
    public static final void onPassiveListenerEvent$lambda$0(PassiveListenerCallbackStub passiveListenerCallbackStub, PassiveListenerEvent passiveListenerEvent) {
        k.e(passiveListenerCallbackStub, "this$0");
        k.e(passiveListenerEvent, "$event");
        passiveListenerCallbackStub.triggerListener(passiveListenerEvent.getProto());
    }

    private final void triggerListener(EventsProto.PassiveListenerEvent passiveListenerEvent) {
        EventsProto.PassiveListenerEvent.EventCase eventCase = passiveListenerEvent.getEventCase();
        int i8 = eventCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventCase.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                ResponsesProto.PassiveMonitoringUpdateResponse passiveUpdateResponse = passiveListenerEvent.getPassiveUpdateResponse();
                k.d(passiveUpdateResponse, "proto.passiveUpdateResponse");
                PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse = new PassiveMonitoringUpdateResponse(passiveUpdateResponse);
                if (!passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getDataPoints().getDataPoints$health_services_client_release().isEmpty()) {
                    this.callback.onNewDataPointsReceived(passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getDataPoints());
                }
                for (UserActivityInfo onUserActivityInfoReceived : passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getUserActivityInfoUpdates()) {
                    this.callback.onUserActivityInfoReceived(onUserActivityInfoReceived);
                }
                return;
            } else if (i8 == 2) {
                ResponsesProto.PassiveMonitoringGoalResponse passiveGoalResponse = passiveListenerEvent.getPassiveGoalResponse();
                k.d(passiveGoalResponse, "proto.passiveGoalResponse");
                this.callback.onGoalCompleted(new PassiveMonitoringGoalResponse(passiveGoalResponse).getPassiveGoal());
                return;
            } else if (i8 == 3) {
                ResponsesProto.HealthEventResponse healthEventResponse = passiveListenerEvent.getHealthEventResponse();
                k.d(healthEventResponse, "proto.healthEventResponse");
                this.callback.onHealthEventReceived(new HealthEventResponse(healthEventResponse).getHealthEvent());
                return;
            } else if (i8 == 4) {
                this.callback.onPermissionLost();
                return;
            } else if (i8 != 5) {
                return;
            }
        }
        Log.w(TAG, "Received unknown event " + passiveListenerEvent.getEventCase());
    }

    public final ListenerKey getListenerKey() {
        return this.listenerKey;
    }

    public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
        k.e(passiveListenerEvent, "event");
        this.executor.execute(new c(this, 3, passiveListenerEvent));
    }
}
