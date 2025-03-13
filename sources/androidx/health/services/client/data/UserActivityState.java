package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class UserActivityState {
    public static final Companion Companion = new Companion((g) null);
    public static final UserActivityState USER_ACTIVITY_ASLEEP;
    public static final UserActivityState USER_ACTIVITY_EXERCISE;
    public static final UserActivityState USER_ACTIVITY_PASSIVE;
    public static final UserActivityState USER_ACTIVITY_UNKNOWN;
    public static final List<UserActivityState> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final UserActivityState fromProto(DataProto.UserActivityState userActivityState) {
            T t8;
            boolean z8;
            k.e(userActivityState, "proto");
            Iterator<T> it = UserActivityState.VALUES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (((UserActivityState) t8).getId() == userActivityState.getNumber()) {
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
            UserActivityState userActivityState2 = (UserActivityState) t8;
            return userActivityState2 == null ? UserActivityState.USER_ACTIVITY_UNKNOWN : userActivityState2;
        }
    }

    static {
        UserActivityState userActivityState = new UserActivityState(0, "USER_ACTIVITY_UNKNOWN");
        USER_ACTIVITY_UNKNOWN = userActivityState;
        UserActivityState userActivityState2 = new UserActivityState(1, "USER_ACTIVITY_EXERCISE");
        USER_ACTIVITY_EXERCISE = userActivityState2;
        UserActivityState userActivityState3 = new UserActivityState(2, "USER_ACTIVITY_PASSIVE");
        USER_ACTIVITY_PASSIVE = userActivityState3;
        UserActivityState userActivityState4 = new UserActivityState(3, "USER_ACTIVITY_ASLEEP");
        USER_ACTIVITY_ASLEEP = userActivityState4;
        VALUES = a.B(userActivityState, userActivityState2, userActivityState3, userActivityState4);
    }

    public UserActivityState(int i8, String str) {
        k.e(str, "name");
        this.id = i8;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserActivityState) && this.id == ((UserActivityState) obj).id;
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

    public final DataProto.UserActivityState toProto$health_services_client_release() {
        DataProto.UserActivityState forNumber = DataProto.UserActivityState.forNumber(this.id);
        return forNumber == null ? DataProto.UserActivityState.USER_ACTIVITY_STATE_UNKNOWN : forNumber;
    }

    public String toString() {
        return this.name;
    }
}
