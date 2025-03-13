package t6;

import e7.i;
import java.util.Arrays;

public final class f extends i {

    public enum a implements i.a {
        START_X("startX", new w5.f(0.0f)),
        START_Y("startY", new w5.f(0.0f)),
        END_X("endX", new w5.f(0.0f)),
        END_Y("endY", new w5.f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7515f;

        /* renamed from: g  reason: collision with root package name */
        public final w5.f f7516g;

        /* access modifiers changed from: public */
        a(String str, w5.f fVar) {
            this.f7515f = str;
            this.f7516g = fVar;
        }

        public final w5.f e() {
            return this.f7516g;
        }

        public final String getKey() {
            return this.f7515f;
        }
    }

    public f() {
        Arrays.stream(a.values()).forEach(new r5.f(15, this));
    }
}
