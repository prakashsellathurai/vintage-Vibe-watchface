package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p2.a;

public abstract class b<T> implements d<T> {

    /* renamed from: f  reason: collision with root package name */
    public final String f2976f;

    /* renamed from: g  reason: collision with root package name */
    public final AssetManager f2977g;

    /* renamed from: h  reason: collision with root package name */
    public Closeable f2978h;

    public b(AssetManager assetManager, String str) {
        this.f2977g = assetManager;
        this.f2976f = str;
    }

    public final void b() {
        Closeable closeable = this.f2978h;
        if (closeable != null) {
            try {
                switch (((h) this).f2990i) {
                    case 0:
                        ((ParcelFileDescriptor) closeable).close();
                        return;
                    default:
                        ((InputStream) closeable).close();
                        return;
                }
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    public final a e() {
        return a.f6294f;
    }

    public final void f(h hVar, d.a<? super T> aVar) {
        Closeable closeable;
        try {
            AssetManager assetManager = this.f2977g;
            String str = this.f2976f;
            switch (((h) this).f2990i) {
                case 0:
                    closeable = assetManager.openFd(str).getParcelFileDescriptor();
                    break;
                default:
                    closeable = assetManager.open(str);
                    break;
            }
            this.f2978h = closeable;
            aVar.d(closeable);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e);
        }
    }
}
