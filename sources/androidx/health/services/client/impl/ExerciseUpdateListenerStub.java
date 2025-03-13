package androidx.health.services.client.impl;

import android.util.Log;
import androidx.health.services.client.ExerciseUpdateCallback;
import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.ExerciseLapSummary;
import androidx.health.services.client.data.ExerciseUpdate;
import androidx.health.services.client.impl.IExerciseUpdateListener;
import androidx.health.services.client.impl.event.ExerciseUpdateListenerEvent;
import androidx.health.services.client.impl.ipc.internal.ListenerKey;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.EventsProto;
import b0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p7.a;
import q7.g;
import q7.k;

public final class ExerciseUpdateListenerStub extends IExerciseUpdateListener.Stub {
    private static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final String TAG = "ExerciseUpdateListener";
    private final Executor executor;
    private final ExerciseUpdateCallback listener;
    private final ListenerKey listenerKey;
    private final a<Set<DataType<?, ?>>> requestedDataTypesProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getTAG() {
            return ExerciseUpdateListenerStub.TAG;
        }
    }

    public static final class ExerciseUpdateListenerCache {
        public static final Companion Companion = new Companion((g) null);
        public static final ExerciseUpdateListenerCache INSTANCE = new ExerciseUpdateListenerCache();
        private final Object listenerLock = new Object();
        private final Map<ExerciseUpdateCallback, ExerciseUpdateListenerStub> listeners = new HashMap();

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        private ExerciseUpdateListenerCache() {
        }

        public final ExerciseUpdateListenerStub getOrCreate(ExerciseUpdateCallback exerciseUpdateCallback, Executor executor, a<? extends Set<? extends DataType<?, ?>>> aVar) {
            ExerciseUpdateListenerStub exerciseUpdateListenerStub;
            k.e(exerciseUpdateCallback, "listener");
            k.e(executor, "executor");
            k.e(aVar, "requestedDataTypesProvider");
            synchronized (this.listenerLock) {
                Map<ExerciseUpdateCallback, ExerciseUpdateListenerStub> map = this.listeners;
                ExerciseUpdateListenerStub exerciseUpdateListenerStub2 = map.get(exerciseUpdateCallback);
                if (exerciseUpdateListenerStub2 == null) {
                    exerciseUpdateListenerStub2 = new ExerciseUpdateListenerStub(exerciseUpdateCallback, executor, aVar);
                    map.put(exerciseUpdateCallback, exerciseUpdateListenerStub2);
                }
                exerciseUpdateListenerStub = exerciseUpdateListenerStub2;
            }
            return exerciseUpdateListenerStub;
        }

        public final ExerciseUpdateListenerStub remove(ExerciseUpdateCallback exerciseUpdateCallback) {
            ExerciseUpdateListenerStub remove;
            k.e(exerciseUpdateCallback, "exerciseUpdateCallback");
            synchronized (this.listenerLock) {
                remove = this.listeners.remove(exerciseUpdateCallback);
            }
            return remove;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.health.services.client.proto.EventsProto$ExerciseUpdateListenerEvent$EventCase[] r0 = androidx.health.services.client.proto.EventsProto.ExerciseUpdateListenerEvent.EventCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.health.services.client.proto.EventsProto$ExerciseUpdateListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.ExerciseUpdateListenerEvent.EventCase.EXERCISE_UPDATE_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.health.services.client.proto.EventsProto$ExerciseUpdateListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.ExerciseUpdateListenerEvent.EventCase.LAP_SUMMARY_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.health.services.client.proto.EventsProto$ExerciseUpdateListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.ExerciseUpdateListenerEvent.EventCase.AVAILABILITY_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.health.services.client.proto.EventsProto$ExerciseUpdateListenerEvent$EventCase r1 = androidx.health.services.client.proto.EventsProto.ExerciseUpdateListenerEvent.EventCase.EVENT_NOT_SET     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.ExerciseUpdateListenerStub.WhenMappings.<clinit>():void");
        }
    }

    public ExerciseUpdateListenerStub(ExerciseUpdateCallback exerciseUpdateCallback, Executor executor2, a<? extends Set<? extends DataType<?, ?>>> aVar) {
        k.e(exerciseUpdateCallback, "listener");
        k.e(executor2, "executor");
        k.e(aVar, "requestedDataTypesProvider");
        this.listener = exerciseUpdateCallback;
        this.executor = executor2;
        this.requestedDataTypesProvider = aVar;
        this.listenerKey = new ListenerKey(exerciseUpdateCallback);
    }

    /* access modifiers changed from: private */
    public static final void onExerciseUpdateListenerEvent$lambda$0(ExerciseUpdateListenerStub exerciseUpdateListenerStub, ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
        k.e(exerciseUpdateListenerStub, "this$0");
        k.e(exerciseUpdateListenerEvent, "$event");
        exerciseUpdateListenerStub.triggerListener(exerciseUpdateListenerEvent.getProto());
    }

    private final void triggerListener(EventsProto.ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
        EventsProto.ExerciseUpdateListenerEvent.EventCase eventCase = exerciseUpdateListenerEvent.getEventCase();
        int i8 = eventCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventCase.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                ExerciseUpdateCallback exerciseUpdateCallback = this.listener;
                DataProto.ExerciseUpdate exerciseUpdate = exerciseUpdateListenerEvent.getExerciseUpdateResponse().getExerciseUpdate();
                k.d(exerciseUpdate, "proto.exerciseUpdateResponse.exerciseUpdate");
                exerciseUpdateCallback.onExerciseUpdateReceived(new ExerciseUpdate(exerciseUpdate));
                return;
            } else if (i8 == 2) {
                ExerciseUpdateCallback exerciseUpdateCallback2 = this.listener;
                DataProto.ExerciseLapSummary lapSummary = exerciseUpdateListenerEvent.getLapSummaryResponse().getLapSummary();
                k.d(lapSummary, "proto.lapSummaryResponse.lapSummary");
                exerciseUpdateCallback2.onLapSummaryReceived(new ExerciseLapSummary(lapSummary));
                return;
            } else if (i8 == 3) {
                Set invoke = this.requestedDataTypesProvider.invoke();
                if (invoke.isEmpty()) {
                    Log.w(TAG, "Availability received without any requested DataTypes");
                    return;
                }
                ArrayList<DataType> arrayList = new ArrayList<>();
                for (Object next : invoke) {
                    if (k.a(((DataType) next).getName(), exerciseUpdateListenerEvent.getAvailabilityResponse().getDataType().getName())) {
                        arrayList.add(next);
                    }
                }
                Availability.Companion companion = Availability.Companion;
                DataProto.Availability availability = exerciseUpdateListenerEvent.getAvailabilityResponse().getAvailability();
                k.d(availability, "proto.availabilityResponse.availability");
                Availability fromProto = companion.fromProto(availability);
                for (DataType onAvailabilityChanged : arrayList) {
                    this.listener.onAvailabilityChanged(onAvailabilityChanged, fromProto);
                }
                return;
            } else if (i8 != 4) {
                return;
            }
        }
        String str = TAG;
        Log.w(str, "Received unknown event " + exerciseUpdateListenerEvent.getEventCase());
    }

    public final ListenerKey getListenerKey() {
        return this.listenerKey;
    }

    public void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
        k.e(exerciseUpdateListenerEvent, "event");
        this.executor.execute(new c(this, 1, exerciseUpdateListenerEvent));
    }
}
