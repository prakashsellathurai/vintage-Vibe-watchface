package androidx.health.services.client.data;

import q7.g;
import q7.k;

public final class ExerciseStateInfo {
    public static final Companion Companion = new Companion((g) null);
    private final int endReason;
    private final ExerciseState state;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final int getEndReasonFromState$health_services_client_release(ExerciseState exerciseState) {
            k.e(exerciseState, "exerciseState");
            if (k.a(exerciseState, ExerciseState.USER_ENDING)) {
                return 4;
            }
            if (!k.a(exerciseState, ExerciseState.AUTO_ENDING)) {
                if (!k.a(exerciseState, ExerciseState.AUTO_ENDING_PERMISSION_LOST)) {
                    if (!k.a(exerciseState, ExerciseState.TERMINATING)) {
                        if (!k.a(exerciseState, ExerciseState.ENDING)) {
                            if (k.a(exerciseState, ExerciseState.USER_ENDED)) {
                                return 4;
                            }
                            if (!k.a(exerciseState, ExerciseState.AUTO_ENDED)) {
                                if (!k.a(exerciseState, ExerciseState.AUTO_ENDED_PERMISSION_LOST)) {
                                    if (!k.a(exerciseState, ExerciseState.TERMINATED)) {
                                        if (!k.a(exerciseState, ExerciseState.ENDED)) {
                                            return 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 5;
                }
                return 1;
            }
            return 3;
        }
    }

    public ExerciseStateInfo(ExerciseState exerciseState, int i8) {
        k.e(exerciseState, "exerciseState");
        if (i8 != 0) {
            this.endReason = i8;
        } else {
            int endReasonFromState$health_services_client_release = Companion.getEndReasonFromState$health_services_client_release(exerciseState);
            this.endReason = endReasonFromState$health_services_client_release;
            if (endReasonFromState$health_services_client_release != 0) {
                exerciseState = exerciseState.isEnded() ? ExerciseState.ENDED : ExerciseState.ENDING;
            }
        }
        this.state = exerciseState;
    }

    public static /* synthetic */ void getEndReason$annotations() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExerciseStateInfo)) {
            return false;
        }
        ExerciseStateInfo exerciseStateInfo = (ExerciseStateInfo) obj;
        return this.endReason == exerciseStateInfo.endReason && k.a(this.state, exerciseStateInfo.state);
    }

    public final int getEndReason() {
        return this.endReason;
    }

    public final ExerciseState getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.endReason * 31) + this.state.hashCode();
    }

    public String toString() {
        return "ExerciseStateInfo(state=" + this.state + ", endReason=" + this.endReason + ')';
    }
}
