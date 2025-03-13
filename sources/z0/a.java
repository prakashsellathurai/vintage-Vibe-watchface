package z0;

import androidx.profileinstaller.b;
import androidx.profileinstaller.c;
import java.io.Serializable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8659f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f8660g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f8661h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f8662i;

    public /* synthetic */ a(int i8, int i9, Object obj, Serializable serializable) {
        this.f8659f = i9;
        this.f8662i = obj;
        this.f8660g = i8;
        this.f8661h = serializable;
    }

    public final void run() {
        int i8 = this.f8659f;
        Object obj = this.f8661h;
        int i9 = this.f8660g;
        Object obj2 = this.f8662i;
        switch (i8) {
            case 0:
                ((b) obj2).f1536b.b(i9, obj);
                return;
            default:
                ((c.C0013c) obj2).b(i9, obj);
                return;
        }
    }
}
