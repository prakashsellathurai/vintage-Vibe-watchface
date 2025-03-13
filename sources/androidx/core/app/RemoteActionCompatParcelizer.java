package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import g1.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1041f = (IconCompat) aVar.F(remoteActionCompat.f1041f, 1);
        remoteActionCompat.f1042g = aVar.o(2, remoteActionCompat.f1042g);
        remoteActionCompat.f1043h = aVar.o(3, remoteActionCompat.f1043h);
        remoteActionCompat.f1044i = (PendingIntent) aVar.z(remoteActionCompat.f1044i, 4);
        remoteActionCompat.f1045j = aVar.i(5, remoteActionCompat.f1045j);
        remoteActionCompat.f1046k = aVar.i(6, remoteActionCompat.f1046k);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.H(false, false);
        aVar.g0(remoteActionCompat.f1041f, 1);
        aVar.P(2, remoteActionCompat.f1042g);
        aVar.P(3, remoteActionCompat.f1043h);
        aVar.a0(remoteActionCompat.f1044i, 4);
        aVar.J(5, remoteActionCompat.f1045j);
        aVar.J(6, remoteActionCompat.f1046k);
    }
}
