package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p3.e;
import p3.f;
import p3.h;
import p3.i;
import q3.l0;
import q3.m0;
import r3.b;

@KeepName
public abstract class BasePendingResult<R extends h> extends e<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3026a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f3027b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e.a> f3028c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public R f3029d;
    public boolean e;
    @KeepName
    private m0 mResultGuardian;

    public static class a<R extends h> extends y3.e {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public final void handleMessage(@RecentlyNonNull Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a();
                } catch (RuntimeException e) {
                    BasePendingResult.e(hVar);
                    throw e;
                }
            } else if (i8 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i8);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                BasePendingResult basePendingResult = (BasePendingResult) message.obj;
                Status status = Status.f3019k;
                synchronized (basePendingResult.f3026a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a());
                        basePendingResult.e = true;
                    }
                }
            }
        }
    }

    static {
        new l0();
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        new a(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public static void e(h hVar) {
        if (hVar instanceof f) {
            try {
                ((f) hVar).a();
            } catch (RuntimeException e4) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e4);
            }
        }
    }

    public abstract h a();

    public final boolean b() {
        return this.f3027b.getCount() == 0;
    }

    public final void c(@RecentlyNonNull R r) {
        synchronized (this.f3026a) {
            if (!this.e) {
                b();
                b.d(!b(), "Results have already been set");
                b.d(!false, "Result has already been consumed");
                d(r);
                return;
            }
            e(r);
        }
    }

    public final void d(R r) {
        this.f3029d = r;
        r.a();
        this.f3027b.countDown();
        if (this.f3029d instanceof f) {
            this.mResultGuardian = new m0(this);
        }
        ArrayList<e.a> arrayList = this.f3028c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).a();
        }
        this.f3028c.clear();
    }
}
