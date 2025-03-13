package r3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.a;
import s3.c;

public final class z extends a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: f  reason: collision with root package name */
    public final int f7056f;

    /* renamed from: g  reason: collision with root package name */
    public final Account f7057g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7058h;

    /* renamed from: i  reason: collision with root package name */
    public final GoogleSignInAccount f7059i;

    public z(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f7056f = i8;
        this.f7057g = account;
        this.f7058h = i9;
        this.f7059i = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f7056f);
        c.c(parcel, 2, this.f7057g, i8);
        c.b(parcel, 3, this.f7058h);
        c.c(parcel, 4, this.f7059i, i8);
        c.h(parcel, g9);
    }
}
