package r3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import y3.a;

public final class y0 extends a implements i {
    public y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
    }

    public final Account o() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8403b);
        obtain = Parcel.obtain();
        try {
            this.f8402a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) z3.a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
