package w5;

public enum d {
    f8025g,
    f8027h((int) "MILLISECOND"),
    f8029i((int) "SECOND_MILLISECOND"),
    f8031j((int) "UTC_TIMESTAMP"),
    f8033k((int) "SECOND"),
    f8035l((int) "SECOND_Z"),
    f8037m((int) "SECONDS_IN_DAY"),
    f8039n((int) "MINUTE_SECOND"),
    f8041o((int) "MINUTE"),
    f8043p((int) "MINUTE_Z"),
    f8045q((int) "HOUR_0_11_MINUTE"),
    r((int) "HOUR_1_12_MINUTE"),
    f8048s((int) "HOUR_0_23_MINUTE"),
    f8049t((int) "HOUR_1_24_MINUTE"),
    f8051u((int) "HOUR_0_11"),
    f8052v((int) "HOUR_0_11_Z"),
    w((int) "HOUR_1_12"),
    f8055x((int) "HOUR_1_12_Z"),
    y((int) "HOUR_0_23"),
    f8057z((int) "HOUR_0_23_Z"),
    A((int) "HOUR_1_24"),
    B((int) "HOUR_1_24_Z"),
    C((int) "DAY_HOUR"),
    D((int) "DAY_0_30_HOUR"),
    E((int) "DAY"),
    F((int) "DAY_Z"),
    G((int) "DAY_0_30"),
    H((int) "DAY_OF_YEAR"),
    I((int) "MONTH_DAY"),
    J((int) "MONTH_0_11_DAY"),
    K((int) "YEAR_MONTH_DAY"),
    L((int) "DAY_OF_WEEK"),
    M((int) "DAY_OF_WEEK_F"),
    N((int) "DAY_OF_WEEK_S"),
    O((int) "DAYS_IN_MONTH"),
    P((int) "MONTH"),
    Q((int) "MONTH_Z"),
    R((int) "MONTH_F"),
    S((int) "MONTH_S"),
    T((int) "MONTH_0_11"),
    U((int) "YEAR_MONTH"),
    V((int) "YEAR"),
    W((int) "YEAR_S"),
    X((int) "WEEK_IN_YEAR"),
    Y((int) "WEEK_IN_MONTH"),
    Z((int) "IS_24_HOUR_MODE"),
    f8019a0((int) "IS_DAYLIGHT_SAVING_TIME"),
    f8020b0((int) "TIMEZONE_ABB"),
    f8021c0((int) "TIMEZONE_ID"),
    f8022d0((int) "TIMEZONE_OFFSET"),
    f8023e0((int) "TIMEZONE_OFFSET_DST"),
    f8024f0((int) "AMPM_STATE"),
    f8026g0((int) "AMPM_POSITION"),
    f8028h0((int) "AMPM_STRING"),
    f8030i0,
    f8032j0,
    f8034k0((int) "LANGUAGE_LOCALE_NAME"),
    f8036l0,
    f8038m0,
    f8040n0((int) "BATTERY_PERCENT"),
    f8042o0((int) "BATTERY_CHARGING_STATUS"),
    f8044p0((int) "BATTERY_TEMPERATURE_CELSIUS"),
    f8046q0((int) "BATTERY_TEMPERATURE_FAHRENHEIT"),
    f8047r0((int) "BATTERY_IS_LOW"),
    s0,
    f8050t0,
    u0((int) "MOON_PHASE_POSITION"),
    f8053v0((int) "MOON_PHASE_TYPE"),
    f8054w0((int) "MOON_PHASE_TYPE_STRING"),
    f8056x0,
    y0,
    f8058z0((int) "ACCELEROMETER_IS_SUPPORTED"),
    A0((int) "ACCELEROMETER_X"),
    B0((int) "ACCELEROMETER_Y"),
    C0((int) "ACCELEROMETER_Z"),
    D0((int) "ACCELEROMETER_ANGLE_X"),
    E0((int) "ACCELEROMETER_ANGLE_Y"),
    F0((int) "ACCELEROMETER_ANGLE_Z"),
    G0((int) "ACCELEROMETER_ANGLE_XY"),
    H0,
    I0,
    J0,
    K0((int) "STEP_COUNT"),
    L0((int) "STEP_PERCENT"),
    M0((int) "STEP_GOAL"),
    N0,
    O0,
    P0((int) "HEART_RATE"),
    Q0((int) "HEART_RATE_Z"),
    R0,
    S0,
    T0,
    U0((int) "UNREAD_NOTIFICATION_COUNT"),
    V0,
    W0,
    X0((int) "SUPPORTED_FORMAT_VERSION"),
    Y0;
    

    /* renamed from: f  reason: collision with root package name */
    public final String[] f8059f;

    /* access modifiers changed from: public */
    d() {
        this(r3, r2, new String[]{null});
    }

    /* access modifiers changed from: public */
    d(String str) {
        this(r4, r3, new String[]{str});
    }

    /* access modifiers changed from: public */
    d(String[] strArr) {
        this.f8059f = strArr;
    }
}
