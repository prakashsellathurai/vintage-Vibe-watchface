package androidx.wear.watchface.data;

import g1.a;

public final class DeviceConfigParcelizer {
    public static DeviceConfig read(a aVar) {
        DeviceConfig deviceConfig = new DeviceConfig();
        deviceConfig.f2337f = aVar.i(1, deviceConfig.f2337f);
        deviceConfig.f2338g = aVar.i(2, deviceConfig.f2338g);
        deviceConfig.f2339h = aVar.w(4, deviceConfig.f2339h);
        deviceConfig.f2340i = aVar.w(5, deviceConfig.f2340i);
        return deviceConfig;
    }

    public static void write(DeviceConfig deviceConfig, a aVar) {
        aVar.H(true, false);
        aVar.J(1, deviceConfig.f2337f);
        aVar.J(2, deviceConfig.f2338g);
        aVar.W(4, deviceConfig.f2339h);
        aVar.W(5, deviceConfig.f2340i);
    }
}
