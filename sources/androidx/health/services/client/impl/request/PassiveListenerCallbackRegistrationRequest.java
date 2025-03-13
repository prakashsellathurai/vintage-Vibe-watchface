package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveListenerCallbackRegistrationRequest extends ProtoParcelable<RequestsProto.PassiveListenerCallbackRegistrationRequest> {
    public static final Parcelable.Creator<PassiveListenerCallbackRegistrationRequest> CREATOR = new PassiveListenerCallbackRegistrationRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final String packageName;
    private final PassiveListenerConfig passiveListenerConfig;
    private final RequestsProto.PassiveListenerCallbackRegistrationRequest proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PassiveListenerCallbackRegistrationRequest(String str, PassiveListenerConfig passiveListenerConfig2) {
        k.e(str, "packageName");
        k.e(passiveListenerConfig2, "passiveListenerConfig");
        this.packageName = str;
        this.passiveListenerConfig = passiveListenerConfig2;
        y build = RequestsProto.PassiveListenerCallbackRegistrationRequest.newBuilder().setPackageName(str).setConfig(passiveListenerConfig2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (RequestsProto.PassiveListenerCallbackRegistrationRequest) build;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PassiveListenerConfig getPassiveListenerConfig() {
        return this.passiveListenerConfig;
    }

    public RequestsProto.PassiveListenerCallbackRegistrationRequest getProto() {
        return this.proto;
    }
}
