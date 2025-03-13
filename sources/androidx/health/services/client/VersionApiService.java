package androidx.health.services.client;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.health.services.client.impl.IVersionApiService;
import androidx.health.services.client.impl.IpcConstants;
import q7.g;
import q7.k;

public final class VersionApiService extends Service {
    private static final Companion Companion = new Companion((g) null);
    @Deprecated
    private static final String TAG = "VersionApiService";
    private final VersionApiServiceStub stub = new VersionApiServiceStub();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public static final class VersionApiServiceStub extends IVersionApiService.Stub {
        public int getSdkVersion() {
            return 27;
        }

        public int getVersionApiServiceVersion() {
            return 1;
        }
    }

    public IBinder onBind(Intent intent) {
        if (k.a(intent != null ? intent.getAction() : null, IpcConstants.VERSION_API_BIND_ACTION)) {
            return this.stub;
        }
        StringBuilder sb = new StringBuilder("Bind request with invalid action [");
        sb.append(intent != null ? intent.getAction() : null);
        sb.append(']');
        Log.w(TAG, sb.toString());
        return null;
    }
}
