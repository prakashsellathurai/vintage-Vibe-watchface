package t6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class i extends k {

    public enum a implements i.a {
        CORNER_RADIUS_X("cornerRadiusX", new f(0.0f)),
        CORNER_RADIUS_Y("cornerRadiusY", new f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7520f;

        /* renamed from: g  reason: collision with root package name */
        public final f f7521g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f7520f = str;
            this.f7521g = fVar;
        }

        public final f e() {
            return this.f7521g;
        }

        public final String getKey() {
            return this.f7520f;
        }
    }

    public i() {
        Arrays.stream(a.values()).forEach(new r5.f(16, this));
    }
}
