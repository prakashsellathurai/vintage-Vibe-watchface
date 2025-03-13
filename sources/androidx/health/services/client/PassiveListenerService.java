package androidx.health.services.client;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.health.services.client.data.DataPointContainer;
import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.data.PassiveGoal;
import androidx.health.services.client.data.UserActivityInfo;
import androidx.health.services.client.impl.IPassiveListenerService;
import androidx.health.services.client.impl.event.PassiveListenerEvent;
import androidx.health.services.client.impl.response.HealthEventResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringGoalResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringUpdateResponse;
import androidx.health.services.client.proto.EventsProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.g;
import q7.k;

public abstract class PassiveListenerService extends Service {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    private static final String TAG = "PassiveListenerService";
    private IPassiveListenerServiceWrapper wrapper;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final class IPassiveListenerServiceWrapper extends IPassiveListenerService.Stub {

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
                throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.PassiveListenerService.IPassiveListenerServiceWrapper.WhenMappings.<clinit>():void");
            }
        }

        public IPassiveListenerServiceWrapper() {
        }

        public int getApiVersion() {
            return 1;
        }

        public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
            k.e(passiveListenerEvent, "event");
            EventsProto.PassiveListenerEvent proto = passiveListenerEvent.getProto();
            EventsProto.PassiveListenerEvent.EventCase eventCase = proto.getEventCase();
            int i8 = eventCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventCase.ordinal()];
            if (i8 != -1) {
                if (i8 == 1) {
                    ResponsesProto.PassiveMonitoringUpdateResponse passiveUpdateResponse = proto.getPassiveUpdateResponse();
                    k.d(passiveUpdateResponse, "proto.passiveUpdateResponse");
                    PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse = new PassiveMonitoringUpdateResponse(passiveUpdateResponse);
                    if (!passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getDataPoints().getDataPoints$health_services_client_release().isEmpty()) {
                        PassiveListenerService.this.onNewDataPointsReceived(passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getDataPoints());
                    }
                    for (UserActivityInfo onUserActivityInfoReceived : passiveMonitoringUpdateResponse.getPassiveMonitoringUpdate().getUserActivityInfoUpdates()) {
                        PassiveListenerService.this.onUserActivityInfoReceived(onUserActivityInfoReceived);
                    }
                    return;
                } else if (i8 == 2) {
                    ResponsesProto.PassiveMonitoringGoalResponse passiveGoalResponse = proto.getPassiveGoalResponse();
                    k.d(passiveGoalResponse, "proto.passiveGoalResponse");
                    PassiveListenerService.this.onGoalCompleted(new PassiveMonitoringGoalResponse(passiveGoalResponse).getPassiveGoal());
                    return;
                } else if (i8 == 3) {
                    ResponsesProto.HealthEventResponse healthEventResponse = proto.getHealthEventResponse();
                    k.d(healthEventResponse, "proto.healthEventResponse");
                    PassiveListenerService.this.onHealthEventReceived(new HealthEventResponse(healthEventResponse).getHealthEvent());
                    return;
                } else if (i8 == 4) {
                    PassiveListenerService.this.onPermissionLost();
                    return;
                } else if (i8 != 5) {
                    return;
                }
            }
            Log.w(PassiveListenerService.TAG, "Received unknown event " + proto.getEventCase());
        }
    }

    public final IBinder onBind(Intent intent) {
        k.e(intent, "intent");
        IPassiveListenerServiceWrapper iPassiveListenerServiceWrapper = new IPassiveListenerServiceWrapper();
        this.wrapper = iPassiveListenerServiceWrapper;
        return iPassiveListenerServiceWrapper;
    }

    public void onGoalCompleted(PassiveGoal passiveGoal) {
        k.e(passiveGoal, "goal");
    }

    public void onHealthEventReceived(HealthEvent healthEvent) {
        k.e(healthEvent, "event");
    }

    public void onNewDataPointsReceived(DataPointContainer dataPointContainer) {
        k.e(dataPointContainer, "dataPoints");
    }

    public void onPermissionLost() {
    }

    public void onUserActivityInfoReceived(UserActivityInfo userActivityInfo) {
        k.e(userActivityInfo, "info");
    }
}
