package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class MeasureUnregistrationRequest extends ProtoParcelable<RequestsProto.MeasureUnregistrationRequest> {
    public static final Parcelable.Creator<MeasureUnregistrationRequest> CREATOR = new MeasureUnregistrationRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final DataType<?, ?> dataType;
    private final String packageName;
    private final RequestsProto.MeasureUnregistrationRequest proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public MeasureUnregistrationRequest(String str, DataType<?, ?> dataType2) {
        k.e(str, "packageName");
        k.e(dataType2, "dataType");
        this.packageName = str;
        this.dataType = dataType2;
        y build = RequestsProto.MeasureUnregistrationRequest.newBuilder().setPackageName(str).setDataType(dataType2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (RequestsProto.MeasureUnregistrationRequest) build;
    }

    public final DataType<?, ?> getDataType() {
        return this.dataType;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public RequestsProto.MeasureUnregistrationRequest getProto() {
        return this.proto;
    }
}
