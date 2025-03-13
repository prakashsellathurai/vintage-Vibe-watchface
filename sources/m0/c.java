package m0;

import android.view.inputmethod.InputContentInfo;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f5353a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f5354a;

        public a(Object obj) {
            this.f5354a = (InputContentInfo) obj;
        }

        public final Object a() {
            return this.f5354a;
        }

        public final void b() {
            this.f5354a.requestPermission();
        }
    }

    public interface b {
    }

    public c(a aVar) {
        this.f5353a = aVar;
    }
}
