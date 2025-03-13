package androidx.health.services.client;

import androidx.health.services.client.data.DataPointContainer;
import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.data.PassiveGoal;
import androidx.health.services.client.data.UserActivityInfo;
import q7.k;

public interface PassiveListenerCallback {

    public static final class DefaultImpls {
        public static void onGoalCompleted(PassiveListenerCallback passiveListenerCallback, PassiveGoal passiveGoal) {
            k.e(passiveGoal, "goal");
        }

        public static void onHealthEventReceived(PassiveListenerCallback passiveListenerCallback, HealthEvent healthEvent) {
            k.e(healthEvent, "event");
        }

        public static void onNewDataPointsReceived(PassiveListenerCallback passiveListenerCallback, DataPointContainer dataPointContainer) {
            k.e(dataPointContainer, "dataPoints");
        }

        public static void onPermissionLost(PassiveListenerCallback passiveListenerCallback) {
        }

        public static void onRegistered(PassiveListenerCallback passiveListenerCallback) {
        }

        public static void onRegistrationFailed(PassiveListenerCallback passiveListenerCallback, Throwable th) {
            k.e(th, "throwable");
        }

        public static void onUserActivityInfoReceived(PassiveListenerCallback passiveListenerCallback, UserActivityInfo userActivityInfo) {
            k.e(userActivityInfo, "info");
        }
    }

    void onGoalCompleted(PassiveGoal passiveGoal);

    void onHealthEventReceived(HealthEvent healthEvent);

    void onNewDataPointsReceived(DataPointContainer dataPointContainer);

    void onPermissionLost();

    void onRegistered();

    void onRegistrationFailed(Throwable th);

    void onUserActivityInfoReceived(UserActivityInfo userActivityInfo);
}
