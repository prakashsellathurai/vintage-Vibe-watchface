package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import q7.g;
import q7.k;

public final class ExerciseState {
    public static final ExerciseState ACTIVE;
    public static final ExerciseState AUTO_ENDED;
    public static final ExerciseState AUTO_ENDED_PERMISSION_LOST;
    public static final ExerciseState AUTO_ENDING;
    public static final ExerciseState AUTO_ENDING_PERMISSION_LOST;
    public static final ExerciseState AUTO_PAUSED;
    public static final ExerciseState AUTO_PAUSING;
    public static final ExerciseState AUTO_RESUMING;
    public static final Companion Companion = new Companion((g) null);
    public static final ExerciseState ENDED;
    private static final Set<ExerciseState> ENDED_STATES;
    public static final ExerciseState ENDING;
    private static final Set<ExerciseState> ENDING_STATES;
    private static final Set<ExerciseState> OTHER_STATES;
    private static final Set<ExerciseState> PAUSED_STATES;
    public static final ExerciseState PREPARING;
    private static final Set<ExerciseState> RESUMING_STATES;
    public static final ExerciseState TERMINATED;
    public static final ExerciseState TERMINATING;
    public static final ExerciseState USER_ENDED;
    public static final ExerciseState USER_ENDING;
    public static final ExerciseState USER_PAUSED;
    public static final ExerciseState USER_PAUSING;
    public static final ExerciseState USER_RESUMING;
    public static final ExerciseState USER_STARTING;
    /* access modifiers changed from: private */
    public static final Set<ExerciseState> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExerciseState fromId(int i8) {
            Object obj;
            boolean z8;
            Iterator it = ExerciseState.VALUES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ExerciseState) obj).getId() == i8) {
                    z8 = true;
                    continue;
                } else {
                    z8 = false;
                    continue;
                }
                if (z8) {
                    break;
                }
            }
            return (ExerciseState) obj;
        }

        public final ExerciseState fromProto(DataProto.ExerciseState exerciseState) {
            k.e(exerciseState, "proto");
            return fromId(exerciseState.getNumber());
        }
    }

    static {
        ExerciseState exerciseState = new ExerciseState(15, "PREPARING");
        PREPARING = exerciseState;
        ExerciseState exerciseState2 = new ExerciseState(1, "USER_STARTING");
        USER_STARTING = exerciseState2;
        ExerciseState exerciseState3 = new ExerciseState(2, "ACTIVE");
        ACTIVE = exerciseState3;
        ExerciseState exerciseState4 = new ExerciseState(3, "USER_PAUSING");
        USER_PAUSING = exerciseState4;
        ExerciseState exerciseState5 = new ExerciseState(4, "USER_PAUSED");
        USER_PAUSED = exerciseState5;
        ExerciseState exerciseState6 = new ExerciseState(5, "AUTO_PAUSING");
        AUTO_PAUSING = exerciseState6;
        ExerciseState exerciseState7 = new ExerciseState(6, "AUTO_PAUSED");
        AUTO_PAUSED = exerciseState7;
        ExerciseState exerciseState8 = new ExerciseState(7, "USER_RESUMING");
        USER_RESUMING = exerciseState8;
        ExerciseState exerciseState9 = new ExerciseState(8, "AUTO_RESUMING");
        AUTO_RESUMING = exerciseState9;
        ExerciseState exerciseState10 = new ExerciseState(9, "USER_ENDING");
        USER_ENDING = exerciseState10;
        ExerciseState exerciseState11 = new ExerciseState(10, "USER_ENDED");
        USER_ENDED = exerciseState11;
        ExerciseState exerciseState12 = new ExerciseState(11, "AUTO_ENDING");
        AUTO_ENDING = exerciseState12;
        ExerciseState exerciseState13 = new ExerciseState(12, "AUTO_ENDED");
        AUTO_ENDED = exerciseState13;
        ExerciseState exerciseState14 = new ExerciseState(16, "AUTO_ENDING_PERMISSION_LOST");
        AUTO_ENDING_PERMISSION_LOST = exerciseState14;
        ExerciseState exerciseState15 = exerciseState3;
        ExerciseState exerciseState16 = new ExerciseState(17, "AUTO_ENDED_PERMISSION_LOST");
        AUTO_ENDED_PERMISSION_LOST = exerciseState16;
        ExerciseState exerciseState17 = exerciseState6;
        ExerciseState exerciseState18 = new ExerciseState(13, "TERMINATING");
        TERMINATING = exerciseState18;
        ExerciseState exerciseState19 = exerciseState4;
        ExerciseState exerciseState20 = new ExerciseState(14, "TERMINATED");
        TERMINATED = exerciseState20;
        ExerciseState exerciseState21 = exerciseState2;
        ExerciseState exerciseState22 = new ExerciseState(18, "ENDED");
        ENDED = exerciseState22;
        ExerciseState exerciseState23 = new ExerciseState(19, "ENDING");
        ENDING = exerciseState23;
        Set<ExerciseState> G = a.G(exerciseState8, exerciseState9);
        RESUMING_STATES = G;
        Set<ExerciseState> G2 = a.G(exerciseState5, exerciseState7);
        PAUSED_STATES = G2;
        Set<ExerciseState> G3 = a.G(exerciseState11, exerciseState13, exerciseState16, exerciseState20, exerciseState22);
        ENDED_STATES = G3;
        Set<ExerciseState> G4 = a.G(exerciseState10, exerciseState12, exerciseState14, exerciseState18, exerciseState23);
        ENDING_STATES = G4;
        Set<ExerciseState> G5 = a.G(exerciseState, exerciseState21, exerciseState19, exerciseState17, exerciseState15);
        OTHER_STATES = G5;
        HashSet hashSet = new HashSet();
        hashSet.addAll(G5);
        hashSet.addAll(G);
        hashSet.addAll(G2);
        hashSet.addAll(G3);
        hashSet.addAll(G4);
        VALUES = hashSet;
    }

    private ExerciseState(int i8, String str) {
        this.id = i8;
        this.name = str;
    }

    public static final ExerciseState fromId(int i8) {
        return Companion.fromId(i8);
    }

    public static final ExerciseState fromProto(DataProto.ExerciseState exerciseState) {
        return Companion.fromProto(exerciseState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExerciseState) && this.id == ((ExerciseState) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id;
    }

    public final boolean isEnded() {
        return ENDED_STATES.contains(this);
    }

    public final boolean isEnding() {
        return ENDING_STATES.contains(this);
    }

    public final boolean isPaused() {
        return PAUSED_STATES.contains(this);
    }

    public final boolean isResuming() {
        return RESUMING_STATES.contains(this);
    }

    public final DataProto.ExerciseState toProto$health_services_client_release() {
        DataProto.ExerciseState forNumber = DataProto.ExerciseState.forNumber(this.id);
        return forNumber == null ? DataProto.ExerciseState.EXERCISE_STATE_UNKNOWN : forNumber;
    }

    public String toString() {
        return this.name;
    }
}
