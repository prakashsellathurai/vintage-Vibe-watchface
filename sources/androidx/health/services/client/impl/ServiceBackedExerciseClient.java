package androidx.health.services.client.impl;

import a0.a;
import android.content.Context;
import android.os.IBinder;
import androidx.health.services.client.ExerciseClient;
import androidx.health.services.client.ExerciseUpdateCallback;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.ExerciseCapabilities;
import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.data.ExerciseGoal;
import androidx.health.services.client.data.ExerciseInfo;
import androidx.health.services.client.data.WarmUpConfig;
import androidx.health.services.client.impl.ExerciseUpdateListenerStub;
import androidx.health.services.client.impl.IExerciseApiService;
import androidx.health.services.client.impl.internal.ExerciseInfoCallback;
import androidx.health.services.client.impl.internal.HsConnectionManager;
import androidx.health.services.client.impl.internal.StatusCallback;
import androidx.health.services.client.impl.ipc.Client;
import androidx.health.services.client.impl.ipc.ClientConfiguration;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import androidx.health.services.client.impl.request.AutoPauseAndResumeConfigRequest;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.ExerciseGoalRequest;
import androidx.health.services.client.impl.request.FlushRequest;
import androidx.health.services.client.impl.request.PrepareExerciseRequest;
import androidx.health.services.client.impl.request.StartExerciseRequest;
import androidx.health.services.client.impl.response.ExerciseCapabilitiesResponse;
import g5.g;
import g5.i;
import g5.j;
import g5.l;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import q7.g;
import q7.k;

public final class ServiceBackedExerciseClient extends Client<IExerciseApiService> implements ExerciseClient {
    public static final String CLIENT = "HealthServicesExerciseClient";
    /* access modifiers changed from: private */
    public static final ClientConfiguration CLIENT_CONFIGURATION = new ClientConfiguration(CLIENT, IpcConstants.SERVICE_PACKAGE_NAME, IpcConstants.EXERCISE_API_BIND_ACTION);
    public static final Companion Companion = new Companion((g) null);
    private final Context context;
    private final String packageName;
    /* access modifiers changed from: private */
    public final Set<DataType<?, ?>> requestedDataTypes;
    /* access modifiers changed from: private */
    public final Object requestedDataTypesLock;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ClientConfiguration getCLIENT_CONFIGURATION$health_services_client_release() {
            return ServiceBackedExerciseClient.CLIENT_CONFIGURATION;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedExerciseClient(Context context2, ConnectionManager connectionManager) {
        super(CLIENT_CONFIGURATION, connectionManager, new d(0), new d(1));
        k.e(context2, "context");
        k.e(connectionManager, "connectionManager");
        this.context = context2;
        this.requestedDataTypesLock = new Object();
        this.requestedDataTypes = new LinkedHashSet();
        this.packageName = context2.getPackageName();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceBackedExerciseClient(Context context2, ConnectionManager connectionManager, int i8, g gVar) {
        this(context2, (i8 & 2) != 0 ? HsConnectionManager.getInstance(context2) : connectionManager);
    }

    /* access modifiers changed from: private */
    public static final IExerciseApiService _init_$lambda$0(IBinder iBinder) {
        return IExerciseApiService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: private */
    public static final Integer _init_$lambda$1(IExerciseApiService iExerciseApiService) {
        return Integer.valueOf(iExerciseApiService.getApiVersion());
    }

    /* access modifiers changed from: private */
    public static final void addGoalToActiveExerciseAsync$lambda$12(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseGoal exerciseGoal, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(exerciseGoal, "$exerciseGoal");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        ExerciseGoalRequest exerciseGoalRequest = new ExerciseGoalRequest(str, exerciseGoal);
        k.d(lVar, "resultFuture");
        iExerciseApiService.addGoalToActiveExercise(exerciseGoalRequest, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void clearUpdateCallbackAsync$lambda$11(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseUpdateListenerStub exerciseUpdateListenerStub, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(exerciseUpdateListenerStub, "$listenerStub");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.clearUpdateListener(str, exerciseUpdateListenerStub, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void endExerciseAsync$lambda$6(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.endExercise(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void flushAsync$lambda$7(FlushRequest flushRequest, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(flushRequest, "$request");
        k.d(lVar, "resultFuture");
        iExerciseApiService.flushExercise(flushRequest, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final ExerciseCapabilitiesResponse getCapabilitiesAsync$lambda$15(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        return iExerciseApiService.getCapabilities(new CapabilitiesRequest(str));
    }

    /* access modifiers changed from: private */
    public static final ExerciseCapabilities getCapabilitiesAsync$lambda$16(p7.l lVar, Object obj) {
        k.e(lVar, "$tmp0");
        return (ExerciseCapabilities) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void getCurrentExerciseInfoAsync$lambda$9(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.getCurrentExerciseInfo(str, new ExerciseInfoCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void markLapAsync$lambda$8(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.markLap(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void overrideAutoPauseAndResumeForActiveExerciseAsync$lambda$14(ServiceBackedExerciseClient serviceBackedExerciseClient, boolean z8, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest = new AutoPauseAndResumeConfigRequest(str, z8);
        k.d(lVar, "resultFuture");
        iExerciseApiService.overrideAutoPauseAndResumeForActiveExercise(autoPauseAndResumeConfigRequest, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void pauseExerciseAsync$lambda$4(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.pauseExercise(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void prepareExerciseAsync$lambda$2(ServiceBackedExerciseClient serviceBackedExerciseClient, WarmUpConfig warmUpConfig, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(warmUpConfig, "$configuration");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        iExerciseApiService.prepareExercise(new PrepareExerciseRequest(str, warmUpConfig), new ServiceBackedExerciseClient$prepareExerciseAsync$1$1(lVar, serviceBackedExerciseClient, warmUpConfig));
    }

    /* access modifiers changed from: private */
    public static final void removeGoalFromActiveExerciseAsync$lambda$13(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseGoal exerciseGoal, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(exerciseGoal, "$exerciseGoal");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        ExerciseGoalRequest exerciseGoalRequest = new ExerciseGoalRequest(str, exerciseGoal);
        k.d(lVar, "resultFuture");
        iExerciseApiService.removeGoalFromActiveExercise(exerciseGoalRequest, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void resumeExerciseAsync$lambda$5(ServiceBackedExerciseClient serviceBackedExerciseClient, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        String str = serviceBackedExerciseClient.packageName;
        k.d(lVar, "resultFuture");
        iExerciseApiService.resumeExercise(str, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void setUpdateCallback$lambda$10(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseUpdateListenerStub exerciseUpdateListenerStub, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(exerciseUpdateListenerStub, "$listenerStub");
        k.e(lVar, "result");
        iExerciseApiService.setUpdateListener(serviceBackedExerciseClient.packageName, exerciseUpdateListenerStub, new StatusCallback(lVar));
    }

    /* access modifiers changed from: private */
    public static final void startExerciseAsync$lambda$3(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseConfig exerciseConfig, IExerciseApiService iExerciseApiService, l lVar) {
        k.e(serviceBackedExerciseClient, "this$0");
        k.e(exerciseConfig, "$configuration");
        String str = serviceBackedExerciseClient.packageName;
        k.d(str, "packageName");
        iExerciseApiService.startExercise(new StartExerciseRequest(str, exerciseConfig), new ServiceBackedExerciseClient$startExerciseAsync$1$1(lVar, serviceBackedExerciseClient, exerciseConfig));
    }

    public j<Void> addGoalToActiveExerciseAsync(ExerciseGoal<?> exerciseGoal) {
        k.e(exerciseGoal, "exerciseGoal");
        j<Void> execute = execute(new f(this, exerciseGoal, 0));
        k.d(execute, "execute { service, resul…)\n            )\n        }");
        return execute;
    }

    public j<Void> clearUpdateCallbackAsync(ExerciseUpdateCallback exerciseUpdateCallback) {
        k.e(exerciseUpdateCallback, "callback");
        ExerciseUpdateListenerStub remove = ExerciseUpdateListenerStub.ExerciseUpdateListenerCache.INSTANCE.remove(exerciseUpdateCallback);
        if (remove == null) {
            return new i.a(new IllegalArgumentException("Given listener was not added."));
        }
        j<Void> unregisterListener = unregisterListener(remove.getListenerKey(), new e(this, remove, 1));
        k.d(unregisterListener, "unregisterListener(liste…(resultFuture))\n        }");
        return unregisterListener;
    }

    public j<Void> endExerciseAsync() {
        j<Void> execute = execute(new b(this, 0));
        k.d(execute, "execute { service, resul…back(resultFuture))\n    }");
        return execute;
    }

    public j<Void> flushAsync() {
        String str = this.packageName;
        k.d(str, "packageName");
        j<Void> execute = execute(new a(new FlushRequest(str), 0));
        k.d(execute, "execute { service, resul…(resultFuture))\n        }");
        return execute;
    }

    public j<ExerciseCapabilities> getCapabilitiesAsync() {
        j execute = execute(new b(this, 4));
        g gVar = new g(0, ServiceBackedExerciseClient$getCapabilitiesAsync$2.INSTANCE);
        Context context2 = this.context;
        Object obj = a.f10a;
        return g5.g.k(execute, gVar, a.d.a(context2));
    }

    public j<ExerciseInfo> getCurrentExerciseInfoAsync() {
        j<ExerciseInfo> execute = execute(new b(this, 1));
        k.d(execute, "execute { service, resul…(resultFuture))\n        }");
        return execute;
    }

    public j<Void> markLapAsync() {
        j<Void> execute = execute(new b(this, 2));
        k.d(execute, "execute { service, resul…back(resultFuture))\n    }");
        return execute;
    }

    public j<Void> overrideAutoPauseAndResumeForActiveExerciseAsync(boolean z8) {
        j<Void> execute = execute(new h(this, z8));
        k.d(execute, "execute { service, resul…ltFuture)\n        )\n    }");
        return execute;
    }

    public j<Void> pauseExerciseAsync() {
        j<Void> execute = execute(new b(this, 3));
        k.d(execute, "execute { service, resul…back(resultFuture))\n    }");
        return execute;
    }

    public j<Void> prepareExerciseAsync(WarmUpConfig warmUpConfig) {
        k.e(warmUpConfig, "configuration");
        j<Void> execute = execute(new c(this, 0, warmUpConfig));
        k.d(execute, "execute { service, resul…}\n            )\n        }");
        return execute;
    }

    public j<Void> removeGoalFromActiveExerciseAsync(ExerciseGoal<?> exerciseGoal) {
        k.e(exerciseGoal, "exerciseGoal");
        j<Void> execute = execute(new f(this, exerciseGoal, 1));
        k.d(execute, "execute { service, resul…ltFuture)\n        )\n    }");
        return execute;
    }

    public j<Void> resumeExerciseAsync() {
        j<Void> execute = execute(new b(this, 5));
        k.d(execute, "execute { service, resul…back(resultFuture))\n    }");
        return execute;
    }

    public void setUpdateCallback(ExerciseUpdateCallback exerciseUpdateCallback) {
        k.e(exerciseUpdateCallback, "callback");
        Context context2 = this.context;
        Object obj = a.f10a;
        Executor a9 = a.d.a(context2);
        k.d(a9, "getMainExecutor(context)");
        setUpdateCallback(a9, exerciseUpdateCallback);
    }

    public j<Void> startExerciseAsync(ExerciseConfig exerciseConfig) {
        k.e(exerciseConfig, "configuration");
        j<Void> execute = execute(new c(this, 1, exerciseConfig));
        k.d(execute, "execute { service, resul…}\n            )\n        }");
        return execute;
    }

    public void setUpdateCallback(Executor executor, ExerciseUpdateCallback exerciseUpdateCallback) {
        k.e(executor, "executor");
        k.e(exerciseUpdateCallback, "callback");
        ExerciseUpdateListenerStub orCreate = ExerciseUpdateListenerStub.ExerciseUpdateListenerCache.INSTANCE.getOrCreate(exerciseUpdateCallback, executor, new ServiceBackedExerciseClient$setUpdateCallback$listenerStub$1(this));
        j registerListener = registerListener(orCreate.getListenerKey(), new e(this, orCreate, 0));
        registerListener.a(new g.a(registerListener, new ServiceBackedExerciseClient$setUpdateCallback$1(exerciseUpdateCallback)), executor);
    }
}
