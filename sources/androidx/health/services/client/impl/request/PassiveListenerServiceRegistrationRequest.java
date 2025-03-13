package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveListenerServiceRegistrationRequest extends ProtoParcelable<RequestsProto.PassiveListenerServiceRegistrationRequest> {
    public static final Parcelable.Creator<PassiveListenerServiceRegistrationRequest> CREATOR = new PassiveListenerServiceRegistrationRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final String packageName;
    private final PassiveListenerConfig passiveListenerConfig;
    private final String passiveListenerServiceClassName;
    private final RequestsProto.PassiveListenerServiceRegistrationRequest proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PassiveListenerServiceRegistrationRequest(String str, String str2, PassiveListenerConfig passiveListenerConfig2) {
        k.e(str, "packageName");
        k.e(str2, "passiveListenerServiceClassName");
        k.e(passiveListenerConfig2, "passiveListenerConfig");
        this.packageName = str;
        this.passiveListenerServiceClassName = str2;
        this.passiveListenerConfig = passiveListenerConfig2;
        y build = RequestsProto.PassiveListenerServiceRegistrationRequest.newBuilder().setPackageName(str).setListenerServiceClass(str2).setConfig(passiveListenerConfig2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (RequestsProto.PassiveListenerServiceRegistrationRequest) build;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PassiveListenerConfig getPassiveListenerConfig() {
        return this.passiveListenerConfig;
    }

    public final String getPassiveListenerServiceClassName() {
        return this.passiveListenerServiceClassName;
    }

    public RequestsProto.PassiveListenerServiceRegistrationRequest getProto() {
        return this.proto;
    }
}
