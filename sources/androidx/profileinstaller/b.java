package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import z0.a;
import z0.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f1535a;

    /* renamed from: b  reason: collision with root package name */
    public final c.C0013c f1536b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f1537c;

    /* renamed from: d  reason: collision with root package name */
    public final File f1538d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1539f = false;

    /* renamed from: g  reason: collision with root package name */
    public z0.b[] f1540g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f1541h;

    public b(AssetManager assetManager, Executor executor, c.C0013c cVar, String str, File file) {
        byte[] bArr;
        this.f1535a = executor;
        this.f1536b = cVar;
        this.e = str;
        this.f1538d = file;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 33) {
            switch (i8) {
                case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
                    bArr = f.f8677b;
                    break;
                case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
                case EXERCISE_TYPE_GOLF_VALUE:
                case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                    bArr = f.f8676a;
                    break;
            }
        }
        bArr = null;
        this.f1537c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1536b.a();
            }
            return null;
        }
    }

    public final void b(int i8, Serializable serializable) {
        this.f1535a.execute(new a(i8, 0, this, serializable));
    }
}
