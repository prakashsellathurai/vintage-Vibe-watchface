package j5;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.health.services.client.impl.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadPoolExecutor;

public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final Uri f5000i = Uri.parse("content://com.samsung.android.watch.watchface.hideinformation.setting.provider/settings");

    /* renamed from: j  reason: collision with root package name */
    public static final Handler f5001j = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final Context f5002a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5003b;

    /* renamed from: c  reason: collision with root package name */
    public C0069b f5004c = C0069b.f5010f;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5005d = false;
    public ThreadPoolExecutor e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentObserver f5006f = new a(f5001j);

    /* renamed from: g  reason: collision with root package name */
    public final d f5007g = new d(this);

    /* renamed from: h  reason: collision with root package name */
    public c f5008h = null;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public final void onChange(boolean z8) {
            super.onChange(z8);
            b bVar = b.this;
            if (bVar.f5008h == null) {
                Log.i("DWF:HideInformationMonitor", "request to get hide information setting!!");
                c cVar = new c(bVar.f5002a, bVar.f5007g);
                bVar.f5008h = cVar;
                bVar.e.execute(cVar);
            }
        }
    }

    /* renamed from: j5.b$b  reason: collision with other inner class name */
    public enum C0069b {
        f5010f,
        f5011g,
        f5012h;

        /* access modifiers changed from: public */
        C0069b() {
        }
    }

    public static class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final Context f5014f;

        /* renamed from: g  reason: collision with root package name */
        public final d f5015g;

        public c(Context context, d dVar) {
            this.f5014f = context;
            this.f5015g = dVar;
        }

        public final void run() {
            Log.i("DWF:HideInformationMonitor", "Begin fetching hide information setting!!");
            C0069b bVar = C0069b.f5010f;
            Cursor query = this.f5014f.getContentResolver().query(b.f5000i, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null) {
                Log.i("DWF:HideInformationMonitor", "cursor is null!!");
            } else {
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex("settings");
                    query.getString(columnIndex);
                    bVar = query.getString(columnIndex).equals("true") ? C0069b.f5011g : C0069b.f5012h;
                }
                query.close();
            }
            d dVar = this.f5015g;
            dVar.sendMessage(dVar.obtainMessage(1, bVar));
            Log.i("DWF:HideInformationMonitor", "Send hide information setting to main thread!!");
        }
    }

    public static class d extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f5016a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5017b = false;

        public d(b bVar) {
            super(Looper.getMainLooper());
            this.f5016a = new WeakReference<>(bVar);
        }

        public final void handleMessage(Message message) {
            b bVar;
            super.handleMessage(message);
            if (!this.f5017b && (bVar = this.f5016a.get()) != null && message.what == 1) {
                C0069b bVar2 = (C0069b) message.obj;
                bVar.f5008h = null;
                if (bVar.f5004c != bVar2) {
                    Log.i("DWF:HideInformationMonitor", "HideInformationState changed State[" + bVar.f5004c + "] -> [" + bVar2 + "]");
                    bVar.f5004c = bVar2;
                    e eVar = bVar.f5003b;
                    if (eVar != null) {
                        ((a) ((i) eVar).f1385b).t();
                    }
                }
            }
        }
    }

    public interface e {
    }

    public b(Context context, i iVar) {
        this.f5002a = context;
        this.f5003b = iVar;
    }
}
