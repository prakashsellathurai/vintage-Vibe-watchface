package c4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import b4.f;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p3.d;
import q3.e0;
import r3.b;
import r3.b0;
import r3.c;
import r3.d;
import r3.g;
import r3.z;

public final class a extends g<g> implements f {
    public final d A;
    public final Bundle B;
    public final Integer C;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f2658z = true;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull d dVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull d.a aVar, @RecentlyNonNull d.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.A = dVar;
        this.B = bundle;
        this.C = dVar.f6959g;
    }

    public final void g() {
        c(new c.d());
    }

    public final int h() {
        return 12451000;
    }

    public final boolean o() {
        return this.f2658z;
    }

    public final void p(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        if (fVar != null) {
            try {
                Account account = this.A.f6954a;
                if (account == null) {
                    account = new Account("<<default account>>", "com.google");
                }
                if ("<<default account>>".equals(account.name)) {
                    n3.a a9 = n3.a.a(this.f6935c);
                    reentrantLock = a9.f5950a;
                    reentrantLock.lock();
                    String string = a9.f5951b.getString("defaultGoogleSignInAccount", (String) null);
                    reentrantLock.unlock();
                    if (!TextUtils.isEmpty(string)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(string);
                        String sb2 = sb.toString();
                        reentrantLock2 = a9.f5950a;
                        reentrantLock2.lock();
                        String string2 = a9.f5951b.getString(sb2, (String) null);
                        reentrantLock2.unlock();
                        if (string2 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.c(string2);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.C;
                            b.b(num);
                            z zVar = new z(2, account, num.intValue(), googleSignInAccount);
                            g gVar = (g) v();
                            j jVar = new j(1, zVar);
                            obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(gVar.f8403b);
                            int i8 = y3.c.f8405a;
                            obtain.writeInt(1);
                            jVar.writeToParcel(obtain, 0);
                            obtain.writeStrongBinder((y3.b) fVar);
                            obtain2 = Parcel.obtain();
                            gVar.f8402a.transact(12, obtain, obtain2, 0);
                            obtain2.readException();
                            obtain.recycle();
                            obtain2.recycle();
                        }
                    }
                }
                googleSignInAccount = null;
                Integer num2 = this.C;
                b.b(num2);
                z zVar2 = new z(2, account, num2.intValue(), googleSignInAccount);
                g gVar2 = (g) v();
                j jVar2 = new j(1, zVar2);
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(gVar2.f8403b);
                int i82 = y3.c.f8405a;
                obtain.writeInt(1);
                jVar2.writeToParcel(obtain, 0);
                obtain.writeStrongBinder((y3.b) fVar);
                obtain2 = Parcel.obtain();
                gVar2.f8402a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
            } catch (RemoteException e) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    e0 e0Var = (e0) fVar;
                    e0Var.f6553c.post(new q3.z(e0Var, 1, new l(1, new o3.a(8, (PendingIntent) null), (b0) null)));
                } catch (RemoteException unused2) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } else {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
    }

    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ IInterface q(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @RecentlyNonNull
    public final Bundle t() {
        r3.d dVar = this.A;
        boolean equals = this.f6935c.getPackageName().equals(dVar.f6957d);
        Bundle bundle = this.B;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", dVar.f6957d);
        }
        return bundle;
    }

    @RecentlyNonNull
    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @RecentlyNonNull
    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
