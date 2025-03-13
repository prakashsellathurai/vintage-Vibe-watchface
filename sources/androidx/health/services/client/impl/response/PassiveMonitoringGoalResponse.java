package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.PassiveGoal;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveMonitoringGoalResponse extends ProtoParcelable<ResponsesProto.PassiveMonitoringGoalResponse> {
    public static final Parcelable.Creator<PassiveMonitoringGoalResponse> CREATOR = new PassiveMonitoringGoalResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final PassiveGoal passiveGoal;
    private final ResponsesProto.PassiveMonitoringGoalResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PassiveMonitoringGoalResponse(PassiveGoal passiveGoal2) {
        k.e(passiveGoal2, "passiveGoal");
        this.passiveGoal = passiveGoal2;
        y build = ResponsesProto.PassiveMonitoringGoalResponse.newBuilder().setGoal(passiveGoal2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder().setGoal(passiveGoal.proto).build()");
        this.proto = (ResponsesProto.PassiveMonitoringGoalResponse) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveMonitoringGoalResponse(androidx.health.services.client.proto.ResponsesProto.PassiveMonitoringGoalResponse r3) {
        /*
            r2 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r3, r0)
            androidx.health.services.client.data.PassiveGoal r0 = new androidx.health.services.client.data.PassiveGoal
            androidx.health.services.client.proto.DataProto$PassiveGoal r3 = r3.getGoal()
            java.lang.String r1 = "proto.goal"
            q7.k.d(r3, r1)
            r0.<init>((androidx.health.services.client.proto.DataProto.PassiveGoal) r3)
            r2.<init>((androidx.health.services.client.data.PassiveGoal) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.response.PassiveMonitoringGoalResponse.<init>(androidx.health.services.client.proto.ResponsesProto$PassiveMonitoringGoalResponse):void");
    }

    public final PassiveGoal getPassiveGoal() {
        return this.passiveGoal;
    }

    public ResponsesProto.PassiveMonitoringGoalResponse getProto() {
        return this.proto;
    }
}
