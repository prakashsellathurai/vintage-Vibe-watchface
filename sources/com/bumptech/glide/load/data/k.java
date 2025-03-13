package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import p2.a;

public abstract class k<T> implements d<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Uri f2999f;

    /* renamed from: g  reason: collision with root package name */
    public final ContentResolver f3000g;

    /* renamed from: h  reason: collision with root package name */
    public T f3001h;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f3000g = contentResolver;
        this.f2999f = uri;
    }

    public final void b() {
        T t8 = this.f3001h;
        if (t8 != null) {
            try {
                c(t8);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t8);

    public final void cancel() {
    }

    public abstract Object d(ContentResolver contentResolver, Uri uri);

    public final a e() {
        return a.f6294f;
    }

    public final void f(h hVar, d.a<? super T> aVar) {
        try {
            T d9 = d(this.f3000g, this.f2999f);
            this.f3001h = d9;
            aVar.d(d9);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e);
        }
    }
}
