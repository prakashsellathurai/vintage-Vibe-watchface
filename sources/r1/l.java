package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import android.view.SurfaceControlViewHost;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import j7.d;
import k3.j;
import q7.k;
import y7.g1;

public interface l extends IInterface {

    public static abstract class a extends Binder implements l {
        public a() {
            attachInterface(this, "androidx.wear.watchface.control.IRemoteWatchFaceView");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface("androidx.wear.watchface.control.IRemoteWatchFaceView");
            }
            if (i8 == 1598968902) {
                parcel2.writeString("androidx.wear.watchface.control.IRemoteWatchFaceView");
                return true;
            }
            if (i8 == 2) {
                parcel2.writeNoException();
                parcel2.writeInt(1);
            } else if (i8 == 3) {
                WatchFaceRenderParams createFromParcel = parcel.readInt() != 0 ? WatchFaceRenderParams.CREATOR.createFromParcel(parcel) : null;
                k0 k0Var = (k0) this;
                k.e(createFromParcel, "params");
                try {
                    j.K(k0Var.f6721b, (g1) null, new j0(k0Var, createFromParcel, new v1.a("RemoteWatchFaceView.renderWatchFace"), (d<? super j0>) null), 3);
                } catch (Throwable th) {
                    Log.e("RemoteWatchFaceView", "renderWatchFace failed", th);
                    throw th;
                }
            } else if (i8 == 4) {
                try {
                    SurfaceControlViewHost.SurfacePackage surfacePackage = ((k0) this).f6720a.getSurfacePackage();
                    k.b(surfacePackage);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    surfacePackage.writeToParcel(parcel2, 1);
                } catch (Throwable th2) {
                    Log.e("RemoteWatchFaceView", "getSurfacePackage failed", th2);
                    throw th2;
                }
            } else if (i8 != 5) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                try {
                    ((k0) this).f6720a.release();
                } catch (Throwable th3) {
                    Log.e("RemoteWatchFaceView", "close failed", th3);
                    throw th3;
                }
            }
            return true;
        }
    }
}
