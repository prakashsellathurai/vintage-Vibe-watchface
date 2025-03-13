package r3;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import o3.c;
import o3.e;
import r3.i;
import s3.a;

public final class f extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new r0();

    /* renamed from: f  reason: collision with root package name */
    public final int f6972f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6973g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6974h;

    /* renamed from: i  reason: collision with root package name */
    public String f6975i;

    /* renamed from: j  reason: collision with root package name */
    public IBinder f6976j;

    /* renamed from: k  reason: collision with root package name */
    public Scope[] f6977k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f6978l;

    /* renamed from: m  reason: collision with root package name */
    public Account f6979m;

    /* renamed from: n  reason: collision with root package name */
    public c[] f6980n;

    /* renamed from: o  reason: collision with root package name */
    public c[] f6981o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6982p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6983q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public final String f6984s;

    public f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z8, int i11, boolean z9, String str2) {
        this.f6972f = i8;
        this.f6973g = i9;
        this.f6974h = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f6975i = "com.google.android.gms";
        } else {
            this.f6975i = str;
        }
        if (i8 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i12 = i.a.f6992b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i y0Var = queryLocalInterface instanceof i ? (i) queryLocalInterface : new y0(iBinder);
                int i13 = a.f6927c;
                if (y0Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = y0Var.o();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f6979m = account2;
        } else {
            this.f6976j = iBinder;
            this.f6979m = account;
        }
        this.f6977k = scopeArr;
        this.f6978l = bundle;
        this.f6980n = cVarArr;
        this.f6981o = cVarArr2;
        this.f6982p = z8;
        this.f6983q = i11;
        this.r = z9;
        this.f6984s = str2;
    }

    public f(int i8, String str) {
        this.f6972f = 6;
        this.f6974h = e.f6091a;
        this.f6973g = i8;
        this.f6982p = true;
        this.f6984s = str;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        r0.a(this, parcel, i8);
    }
}
