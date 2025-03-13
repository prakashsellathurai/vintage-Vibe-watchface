package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

public abstract class y<E> extends u {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1359a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1360b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1361c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f1362d = new c0();

    public y(s sVar) {
        Handler handler = new Handler();
        this.f1359a = sVar;
        if (sVar != null) {
            this.f1360b = sVar;
            this.f1361c = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void j(PrintWriter printWriter, String[] strArr);

    public abstract E k();

    public abstract LayoutInflater l();

    public abstract boolean m(String str);

    public abstract void n();
}
