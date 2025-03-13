package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.b;

public final class a0 implements Parcelable.Creator<z> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                account = (Account) b.a(parcel, readInt, Account.CREATOR);
            } else if (c9 == 3) {
                i10 = b.f(parcel, readInt);
            } else if (c9 != 4) {
                b.h(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.d(parcel, i8);
        return new z(i9, account, i10, googleSignInAccount);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new z[i8];
    }
}
