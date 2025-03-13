package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.C0013c {
        public a() {
        }

        public final void a() {
        }

        public final void b(int i8, Object obj) {
            c.f1543b.b(i8, obj);
            ProfileInstallReceiver.this.setResultCode(i8);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                c.b(context, new l.a(2), new a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        a aVar = new a();
                        try {
                            c.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            new z0.a(10, 1, aVar, (Serializable) null).run();
                        } catch (PackageManager.NameNotFoundException e) {
                            new z0.a(7, 1, aVar, e).run();
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        a aVar2 = new a();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new z0.a(11, 1, aVar2, (Serializable) null).run();
                    }
                }
            } else {
                boolean equals = "androidx.profileinstaller.action.SAVE_PROFILE".equals(action);
                c.b bVar = c.f1543b;
                if (equals) {
                    Process.sendSignal(Process.myPid(), 10);
                    bVar.b(12, (Object) null);
                    setResultCode(12);
                } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                    if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                        int i8 = a.a(context.createDeviceProtectedStorageContext().getCodeCacheDir()) ? 14 : 15;
                        bVar.b(i8, (Object) null);
                        setResultCode(i8);
                        return;
                    }
                    bVar.b(16, (Object) null);
                    setResultCode(16);
                }
            }
        }
    }
}
