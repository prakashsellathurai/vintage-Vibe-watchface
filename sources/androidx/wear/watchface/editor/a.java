package androidx.wear.watchface.editor;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import androidx.wear.watchface.data.DeviceConfig;
import androidx.wear.watchface.data.RenderParametersWireFormat;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import n1.z;
import o1.b;
import o1.c;
import q7.k;
import t1.y;
import u1.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f2381a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2382b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2383c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2384d;
    public final y e;

    /* renamed from: androidx.wear.watchface.editor.a$a  reason: collision with other inner class name */
    public static final class C0024a {
        @SuppressLint({"NewApi"})
        public static a a(Intent intent) {
            f fVar;
            k.e(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("COMPONENT_NAME_KEY");
            k.b(parcelableExtra);
            ComponentName componentName = (ComponentName) parcelableExtra;
            String str = intent.getPackage();
            String str2 = "";
            String str3 = str == null ? str2 : str;
            String[] stringArrayExtra = intent.getStringArrayExtra("USER_STYLE_KEY");
            y yVar = null;
            if (stringArrayExtra != null) {
                HashMap hashMap = new HashMap();
                int length = stringArrayExtra.length;
                for (int i8 = 0; i8 < length; i8++) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("USER_STYLE_VALUES" + i8);
                    k.b(byteArrayExtra);
                    hashMap.put(stringArrayExtra[i8], byteArrayExtra);
                }
                fVar = new f((Map<String, byte[]>) hashMap);
            } else {
                fVar = null;
            }
            String stringExtra = intent.getStringExtra("INSTANCE_ID_KEY");
            if (stringExtra != null) {
                str2 = stringExtra;
            }
            c cVar = new c(str2);
            DeviceConfig deviceConfig = (DeviceConfig) intent.getParcelableExtra("HEADLESS_DEVICE_CONFIG_KEY");
            b bVar = deviceConfig != null ? new b(deviceConfig.f2337f, deviceConfig.f2338g, deviceConfig.f2339h, deviceConfig.f2340i) : null;
            RenderParametersWireFormat renderParametersWireFormat = (RenderParametersWireFormat) intent.getParcelableExtra("RENDER_PARAMETERS_KEY");
            if (renderParametersWireFormat != null) {
                z zVar = new z(renderParametersWireFormat);
                Instant ofEpochMilli = Instant.ofEpochMilli(intent.getLongExtra("RENDER_TIME_MILLIS_KEY", 0));
                k.d(ofEpochMilli, "ofEpochMilli(intent.getL…NDER_TIME_MILLIS_KEY, 0))");
                yVar = new y(zVar, ofEpochMilli);
            }
            return new a(componentName, str3, fVar, cVar, bVar, yVar);
        }
    }

    public a(ComponentName componentName, String str, f fVar, c cVar, b bVar, y yVar) {
        this.f2381a = componentName;
        this.f2382b = fVar;
        this.f2383c = cVar;
        this.f2384d = bVar;
        this.e = yVar;
    }
}
