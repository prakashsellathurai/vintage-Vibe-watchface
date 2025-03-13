package androidx.wear.watchface.control.data;

import android.content.ComponentName;
import g1.a;

public final class GetUserStyleSchemaParamsParcelizer {
    public static GetUserStyleSchemaParams read(a aVar) {
        GetUserStyleSchemaParams getUserStyleSchemaParams = new GetUserStyleSchemaParams();
        getUserStyleSchemaParams.f2268f = (ComponentName) aVar.z(getUserStyleSchemaParams.f2268f, 1);
        return getUserStyleSchemaParams;
    }

    public static void write(GetUserStyleSchemaParams getUserStyleSchemaParams, a aVar) {
        aVar.H(false, false);
        aVar.a0(getUserStyleSchemaParams.f2268f, 1);
    }
}
