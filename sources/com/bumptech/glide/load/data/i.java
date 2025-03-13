package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import k3.c;
import v2.f;

public final class i implements d<InputStream> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f2991k = new a();

    /* renamed from: f  reason: collision with root package name */
    public final f f2992f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2993g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f2994h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f2995i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f2996j;

    public static class a {
    }

    public i(f fVar, int i8) {
        this.f2992f = fVar;
        this.f2993g = i8;
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f2995i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2994h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2994h = null;
    }

    public final InputStream c(URL url, int i8, URL url2, Map<String, String> map) {
        int i9;
        InputStream inputStream;
        int i10 = -1;
        if (i8 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new j2.a("In re-direct loop", -1, (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z8 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                int i11 = this.f2993g;
                httpURLConnection.setConnectTimeout(i11);
                httpURLConnection.setReadTimeout(i11);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f2994h = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f2995i = this.f2994h.getInputStream();
                    if (this.f2996j) {
                        return null;
                    }
                    try {
                        i9 = this.f2994h.getResponseCode();
                    } catch (IOException unused2) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i9 = -1;
                    }
                    int i12 = i9 / 100;
                    if (i12 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f2994h;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f2995i = inputStream;
                            return inputStream;
                        } catch (IOException e) {
                            try {
                                i10 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                Log.isLoggable("HttpUrlFetcher", 3);
                            }
                            throw new j2.a("Failed to obtain InputStream", i10, e);
                        }
                    } else {
                        if (i12 == 3) {
                            z8 = true;
                        }
                        if (z8) {
                            String headerField = this.f2994h.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return c(url3, i8 + 1, url, map);
                                } catch (MalformedURLException e4) {
                                    throw new j2.a("Bad redirect url: " + headerField, i9, e4);
                                }
                            } else {
                                throw new j2.a("Received empty or null redirect url", i9, (IOException) null);
                            }
                        } else if (i9 == -1) {
                            throw new j2.a("Http request failed", i9, (IOException) null);
                        } else {
                            try {
                                throw new j2.a(this.f2994h.getResponseMessage(), i9, (IOException) null);
                            } catch (IOException e9) {
                                throw new j2.a("Failed to get a response message", i9, e9);
                            }
                        }
                    }
                } catch (IOException e10) {
                    try {
                        i10 = this.f2994h.getResponseCode();
                    } catch (IOException unused4) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                    }
                    throw new j2.a("Failed to connect or obtain data", i10, e10);
                }
            } catch (IOException e11) {
                throw new j2.a("URL.openConnection threw", 0, e11);
            }
        } else {
            throw new j2.a("Too many (> 5) redirects!", -1, (IOException) null);
        }
    }

    public final void cancel() {
        this.f2996j = true;
    }

    public final p2.a e() {
        return p2.a.f6295g;
    }

    /* JADX INFO: finally extract failed */
    public final void f(h hVar, d.a<? super InputStream> aVar) {
        f fVar = this.f2992f;
        int i8 = k3.f.f5137a;
        SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(c(fVar.d(), 0, (URL) null, fVar.f7862b.a()));
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (IOException e) {
            Log.isLoggable("HttpUrlFetcher", 3);
            aVar.c(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                return;
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
        SystemClock.elapsedRealtimeNanos();
    }
}
