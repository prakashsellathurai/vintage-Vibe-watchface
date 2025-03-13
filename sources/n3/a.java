package n3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.locks.ReentrantLock;
import r3.b;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f5948c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static a f5949d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f5950a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f5951b;

    public a(Context context) {
        this.f5951b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        b.b(context);
        ReentrantLock reentrantLock = f5948c;
        reentrantLock.lock();
        try {
            if (f5949d == null) {
                f5949d = new a(context.getApplicationContext());
            }
            return f5949d;
        } finally {
            reentrantLock.unlock();
        }
    }
}
