package androidx.health.services.client.impl;

import a0.a;
import android.content.Context;
import android.os.IBinder;
import androidx.health.services.client.MeasureCallback;
import androidx.health.services.client.MeasureClient;
import androidx.health.services.client.data.DeltaDataType;
import androidx.health.services.client.data.MeasureCapabilities;
import androidx.health.services.client.impl.IMeasureApiService;
import androidx.health.services.client.impl.MeasureCallbackStub;
import androidx.health.services.client.impl.internal.HsConnectionManager;
import androidx.health.services.client.impl.internal.StatusCallback;
import androidx.health.services.client.impl.ipc.Client;
import androidx.health.services.client.impl.ipc.ClientConfiguration;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.MeasureRegistrationRequest;
import androidx.health.services.client.impl.request.MeasureUnregistrationRequest;
import androidx.health.services.client.impl.response.MeasureCapabilitiesResponse;
import g5.g;
import g5.i;
import g5.j;
import java.util.concurrent.Executor;
import p7.l;
import q7.g;
import q7.k;

public final class ServiceBackedMeasureClient extends Client<IMeasureApiService> implements MeasureClient {
    public static final String CLIENT = "HealthServicesMeasureClient";
    /* access modifiers changed from: private */
    public static final ClientConfiguration CLIENT_CONFIGURATION = new ClientConfiguration(CLIENT, IpcConstants.SERVICE_PACKAGE_NAME, IpcConstants.MEASURE_API_BIND_ACTION);
    public static final Companion Companion = new Companion((g) null);
    private final Context context;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ClientConfiguration getCLIENT_CONFIGURATION$health_services_client_release() {
            return ServiceBackedMeasureClient.CLIENT_CONFIGURATION;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedMeasureClient(Context context2, ConnectionManager connectionManager) {
        super(CLIENT_CONFIGURATION, connectionManager, new d(4), new d(5));
        k.e(context2, "context");
        k.e(connectionManager, "connectionManager");
        this.context = context2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceBackedMeasureClient(Context context2, ConnectionManager connectionManager, int i8, g gVar) {
        this(context2, (i8 & 2) != 0 ? HsConnectionManager.getInstance(context2) : connectionManager);
    }

    /* access modifiers changed from: private */
    public static final IMeasureApiService _init_$lambda$0(IBinder iBinder) {
        return IMeasureApiService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: private */
    public static final Integer _init_$lambda$1(IMeasureApiService iMeasureApiService) {
        return Integer.valueOf(iMeasureApiService.getApiVersion());
    }

    /* access modifiers changed from: private */
    public static final MeasureCapabilitiesResponse getCapabilitiesAsync$lambda$4(ServiceBackedMeasureClient serviceBackedMeasureClient, IMeasureApiService iMeasureApiService) {
        k.e(serviceBackedMeasureClient, "this$0");
        String packageName = serviceBackedMeasureClient.context.getPackageName();
        k.d(packageName, "context.packageName");
        return iMeasureApiService.getCapabilities(new CapabilitiesRequest(packageName));
    }

    /* access modifiers changed from: private */
    public static final MeasureCapabilities getCapabilitiesAsync$lambda$5(l lVar, Object obj) {
        k.e(lVar, "$tmp0");
        return (MeasureCapabilities) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void registerMeasureCallback$lambda$2(MeasureRegistrationRequest measureRegistrationRequest, MeasureCallbackStub measureCallbackStub, IMeasureApiService iMeasureApiService, g5.l lVar) {
        k.e(measureRegistrationRequest, "$request");
        k.e(measureCallbackStub, "$callbackStub");
        k.e(lVar, "result");
        iMeasureApiService.registerCallback(measureRegistrationRequest, measureCallbackStub, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void unregisterMeasureCallbackAsync$lambda$3(MeasureUnregistrationRequest measureUnregistrationRequest, MeasureCallbackStub measureCallbackStub, IMeasureApiService iMeasureApiService, g5.l lVar) {
        k.e(measureUnregistrationRequest, "$request");
        k.e(measureCallbackStub, "$callbackStub");
        k.d(lVar, "resultFuture");
        iMeasureApiService.unregisterCallback(measureUnregistrationRequest, measureCallbackStub, new StatusCallback(lVar));
    }

    public j<MeasureCapabilities> getCapabilitiesAsync() {
        j execute = execute(new i(0, this));
        g gVar = new g(1, ServiceBackedMeasureClient$getCapabilitiesAsync$2.INSTANCE);
        Context context2 = this.context;
        Object obj = a.f10a;
        return g5.g.k(execute, gVar, a.d.a(context2));
    }

    public void registerMeasureCallback(DeltaDataType<?, ?> deltaDataType, MeasureCallback measureCallback) {
        k.e(deltaDataType, "dataType");
        k.e(measureCallback, "callback");
        Context context2 = this.context;
        Object obj = a.f10a;
        Executor a9 = a.d.a(context2);
        k.d(a9, "getMainExecutor(context)");
        registerMeasureCallback(deltaDataType, a9, measureCallback);
    }

    public j<Void> unregisterMeasureCallbackAsync(DeltaDataType<?, ?> deltaDataType, MeasureCallback measureCallback) {
        k.e(deltaDataType, "dataType");
        k.e(measureCallback, "callback");
        MeasureCallbackStub remove = MeasureCallbackStub.MeasureCallbackCache.INSTANCE.remove(deltaDataType, measureCallback);
        if (remove == null) {
            return new i.a(new IllegalArgumentException("Given callback was not registered."));
        }
        String packageName = this.context.getPackageName();
        k.d(packageName, "context.packageName");
        j<Void> unregisterListener = unregisterListener(remove.getListenerKey(), new c(new MeasureUnregistrationRequest(packageName, deltaDataType), 3, remove));
        k.d(unregisterListener, "unregisterListener(callb…(resultFuture))\n        }");
        return unregisterListener;
    }

    public void registerMeasureCallback(DeltaDataType<?, ?> deltaDataType, Executor executor, MeasureCallback measureCallback) {
        k.e(deltaDataType, "dataType");
        k.e(executor, "executor");
        k.e(measureCallback, "callback");
        String packageName = this.context.getPackageName();
        k.d(packageName, "context.packageName");
        MeasureRegistrationRequest measureRegistrationRequest = new MeasureRegistrationRequest(packageName, deltaDataType);
        MeasureCallbackStub orCreate = MeasureCallbackStub.MeasureCallbackCache.INSTANCE.getOrCreate(deltaDataType, executor, measureCallback);
        j registerListener = registerListener(orCreate.getListenerKey(), new c(measureRegistrationRequest, 2, orCreate));
        registerListener.a(new g.a(registerListener, new ServiceBackedMeasureClient$registerMeasureCallback$1(measureCallback)), executor);
    }
}
