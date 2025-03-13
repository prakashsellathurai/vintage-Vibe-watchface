package c4;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import o3.a;
import q3.e0;
import q3.z;
import y3.b;
import y3.c;

public abstract class e extends b implements f {
    public e() {
        super(0, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean v(int i8, Parcel parcel, Parcel parcel2) {
        switch (i8) {
            case 3:
                a aVar = (a) c.a(parcel, a.CREATOR);
                b bVar = (b) c.a(parcel, b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                e0 e0Var = (e0) this;
                e0Var.f6553c.post(new z(e0Var, 1, (l) c.a(parcel, l.CREATOR)));
                break;
            case 9:
                h hVar = (h) c.a(parcel, h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
