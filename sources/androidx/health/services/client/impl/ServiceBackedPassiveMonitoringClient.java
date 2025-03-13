package androidx.health.services.client.impl;

import a0.a;
import android.content.Context;
import android.os.IBinder;
import androidx.health.services.client.PassiveListenerCallback;
import androidx.health.services.client.PassiveListenerService;
import androidx.health.services.client.PassiveMonitoringClient;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import androidx.health.services.client.impl.IPassiveMonitoringApiService;
import androidx.health.services.client.impl.PassiveListenerCallbackStub;
import androidx.health.services.client.impl.internal.HsConnectionManager;
import androidx.health.services.client.impl.internal.StatusCallback;
import androidx.health.services.client.impl.ipc.Client;
import androidx.health.services.client.impl.ipc.ClientConfiguration;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.FlushRequest;
import androidx.health.services.client.impl.request.PassiveListenerCallbackRegistrationRequest;
import androidx.health.services.client.impl.request.PassiveListenerServiceRegistrationRequest;
import androidx.health.services.client.impl.response.PassiveMonitoringCapabilitiesResponse;
import g5.g;
import g5.j;
import g5.l;
import java.util.concurrent.Executor;
import q7.g;
import q7.k;

public final class ServiceBackedPassiveMonitoringClient extends Client<IPassiveMonitoringApiService> implements PassiveMonitoringClient {
    public static final String CLIENT = "HealthServicesPassiveMonitoringClient";
    /* access modifiers changed from: private */
    public static final ClientConfiguration CLIENT_CONFIGURATION = new ClientConfiguration(CLIENT, IpcConstants.SERVICE_PACKAGE_NAME, IpcConstants.PASSIVE_API_BIND_ACTION);
    public static final Companion Companion = new Companion((g) null);
    private final Context applicationContext;
    private final ConnectionManager connectionManager;
    private final String packageName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ClientConfiguration getCLIENT_CONFIGURATION$health_services_client_release() {
            return ServiceBackedPassiveMonitoringClient.CLIENT_CONFIGURATION;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedPassiveMonitoringClient(Context context, ConnectionManager connectionManager2) {
        super(CLIENT_CONFIGURATION, connectionManager2, new d(6), new d(7));
        k.e(context, "applicationContext");
        k.e(connectionManager2, "connectionManager");
        this.applicationContext = context;
        this.connectionManager = connectionManager2;
        this.packageName = context.getPackageName();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceBackedPassiveMonitoringClient(Context context, ConnectionManager connectionManager2, int i8, g gVar) {
        this(context, (i8 & 2) != 0 ? HsConnectionManager.getInstance(context) : connectionManager2);
    }

    /* access modifiers changed from: private */
    public static final IPassiveMonitoringApiService _init_$lambda$0(IBinder iBinder) {
        return IPassiveMonitoringApiService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: private */
    public static final Integer _init_$lambda$1(IPassiveMonitoringApiService iPassiveMonitoringApiService) {
        return Integer.valueOf(iPassiveMonitoringApiService.getApiVersion());
    }

    /* access modifiers changed from: private */
    public static final void clearPassiveListenerCallbackAsync$lambda$5(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(lVar, "resultFuture");
        iPassiveMonitoringApiService.unregisterPassiveListenerCallback(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void clearPassiveListenerCallbackAsync$lambda$6(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(lVar, "resultFuture");
        iPassiveMonitoringApiService.unregisterPassiveListenerCallback(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void clearPassiveListenerServiceAsync$lambda$4(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(lVar, "resultFuture");
        iPassiveMonitoringApiService.unregisterPassiveListenerService(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void flushAsync$lambda$7(FlushRequest flushRequest, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(flushRequest, "$request");
        k.d(lVar, "resultFuture");
        iPassiveMonitoringApiService.flush(flushRequest, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final PassiveMonitoringCapabilitiesResponse getCapabilitiesAsync$lambda$8(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, IPassiveMonitoringApiService iPassiveMonitoringApiService) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(str, "packageName");
        return iPassiveMonitoringApiService.getCapabilities(new CapabilitiesRequest(str));
    }

    /* access modifiers changed from: private */
    public static final PassiveMonitoringCapabilities getCapabilitiesAsync$lambda$9(p7.l lVar, Object obj) {
        k.e(lVar, "$tmp0");
        return (PassiveMonitoringCapabilities) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void setPassiveListenerCallback$lambda$3(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, PassiveListenerConfig passiveListenerConfig, PassiveListenerCallbackStub passiveListenerCallbackStub, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        k.e(passiveListenerConfig, "$config");
        k.e(passiveListenerCallbackStub, "$callbackStub");
        k.e(lVar, "result");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(str, "packageName");
        iPassiveMonitoringApiService.registerPassiveListenerCallback(new PassiveListenerCallbackRegistrationRequest(str, passiveListenerConfig), passiveListenerCallbackStub, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void setPassiveListenerServiceAsync$lambda$2(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, Class cls, PassiveListenerConfig passiveListenerConfig, IPassiveMonitoringApiService iPassiveMonitoringApiService, l lVar) {
        k.e(serviceBackedPassiveMonitoringClient, "this$0");
        k.e(cls, "$service");
        k.e(passiveListenerConfig, "$config");
        String str = serviceBackedPassiveMonitoringClient.packageName;
        k.d(str, "packageName");
        PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest = new PassiveListenerServiceRegistrationRequest(str, cls.getName(), passiveListenerConfig);
        k.d(lVar, "resultFuture");
        iPassiveMonitoringApiService.registerPassiveListenerService(passiveListenerServiceRegistrationRequest, new StatusCallback(lVar));
    }

    public j<Void> clearPassiveListenerCallbackAsync() {
        j<Void> executeWithVersionCheck;
        String str;
        PassiveListenerCallbackStub.PassiveListenerCallbackCache passiveListenerCallbackCache = PassiveListenerCallbackStub.PassiveListenerCallbackCache.INSTANCE;
        String str2 = this.packageName;
        k.d(str2, "packageName");
        PassiveListenerCallbackStub remove = passiveListenerCallbackCache.remove(str2);
        if (remove != null) {
            executeWithVersionCheck = unregisterListener(remove.getListenerKey(), new j(this, 0));
            str = "unregisterListener(callb…ultFuture))\n            }";
        } else {
            executeWithVersionCheck = executeWithVersionCheck(new j(this, 1), 4);
            str = "executeWithVersionCheck(…piVersion= */ 4\n        )";
        }
        k.d(executeWithVersionCheck, str);
        return executeWithVersionCheck;
    }

    public j<Void> clearPassiveListenerServiceAsync() {
        j<Void> executeWithVersionCheck = executeWithVersionCheck(new j(this, 2), 4);
        k.d(executeWithVersionCheck, "executeWithVersionCheck(…piVersion= */ 4\n        )");
        return executeWithVersionCheck;
    }

    public j<Void> flushAsync() {
        String str = this.packageName;
        k.d(str, "packageName");
        j<Void> execute = execute(new a(new FlushRequest(str), 1));
        k.d(execute, "execute { service, resul…(resultFuture))\n        }");
        return execute;
    }

    public j<PassiveMonitoringCapabilities> getCapabilitiesAsync() {
        j execute = execute(new j(this, 3));
        g gVar = new g(2, ServiceBackedPassiveMonitoringClient$getCapabilitiesAsync$2.INSTANCE);
        Context context = this.applicationContext;
        Object obj = a.f10a;
        return g5.g.k(execute, gVar, a.d.a(context));
    }

    public void setPassiveListenerCallback(PassiveListenerConfig passiveListenerConfig, PassiveListenerCallback passiveListenerCallback) {
        k.e(passiveListenerConfig, "config");
        k.e(passiveListenerCallback, "callback");
        Context context = this.applicationContext;
        Object obj = a.f10a;
        Executor a9 = a.d.a(context);
        k.d(a9, "getMainExecutor(applicationContext)");
        setPassiveListenerCallback(passiveListenerConfig, a9, passiveListenerCallback);
    }

    public j<Void> setPassiveListenerServiceAsync(Class<? extends PassiveListenerService> cls, PassiveListenerConfig passiveListenerConfig) {
        k.e(cls, "service");
        k.e(passiveListenerConfig, "config");
        j<Void> executeWithVersionCheck = executeWithVersionCheck(new k(this, cls, passiveListenerConfig, 0), 4);
        k.d(executeWithVersionCheck, "executeWithVersionCheck(…piVersion= */ 4\n        )");
        return executeWithVersionCheck;
    }

    public void setPassiveListenerCallback(PassiveListenerConfig passiveListenerConfig, Executor executor, PassiveListenerCallback passiveListenerCallback) {
        k.e(passiveListenerConfig, "config");
        k.e(executor, "executor");
        k.e(passiveListenerCallback, "callback");
        PassiveListenerCallbackStub.PassiveListenerCallbackCache passiveListenerCallbackCache = PassiveListenerCallbackStub.PassiveListenerCallbackCache.INSTANCE;
        String str = this.packageName;
        k.d(str, "packageName");
        PassiveListenerCallbackStub orCreate = passiveListenerCallbackCache.getOrCreate(str, executor, passiveListenerCallback);
        j registerListener = registerListener(orCreate.getListenerKey(), new k(this, passiveListenerConfig, orCreate));
        registerListener.a(new g.a(registerListener, new ServiceBackedPassiveMonitoringClient$setPassiveListenerCallback$1(passiveListenerCallback)), executor);
    }
}
