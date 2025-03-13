package androidx.health.services.client.impl;

public final class IpcConstants {
    public static final String EXERCISE_API_BIND_ACTION = "hs.exerciseclient.BIND";
    public static final String HEALTH_SERVICES_BIND_ACTION = "hs.healthservicesclient.BIND";
    public static final IpcConstants INSTANCE = new IpcConstants();
    public static final String MEASURE_API_BIND_ACTION = "hs.measureclient.BIND";
    public static final String PASSIVE_API_BIND_ACTION = "hs.passiveclient.BIND";
    public static final String SERVICE_PACKAGE_NAME = "com.google.android.wearable.healthservices";
    public static final String VERSION_API_BIND_ACTION = "hs.versionclient.BIND";

    private IpcConstants() {
    }
}
