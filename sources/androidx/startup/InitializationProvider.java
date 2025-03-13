package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import c1.a;
import c1.c;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new c("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            if (a.f2640d == null) {
                synchronized (a.e) {
                    if (a.f2640d == null) {
                        a.f2640d = new a(context);
                    }
                }
            }
            a aVar = a.f2640d;
            Context context2 = aVar.f2643c;
            try {
                Trace.beginSection("Startup");
                aVar.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new c((Throwable) e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
