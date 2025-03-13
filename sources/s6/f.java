package s6;

import e7.i;
import java.util.Arrays;

public final class f extends i {

    public enum a implements i.a {
        CENTER_X("centerX", new w5.f(0.0f)),
        CENTER_Y("centerY", new w5.f(0.0f)),
        RADIUS("radius", new w5.f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7271f;

        /* renamed from: g  reason: collision with root package name */
        public final w5.f f7272g;

        /* access modifiers changed from: public */
        a(String str, w5.f fVar) {
            this.f7271f = str;
            this.f7272g = fVar;
        }

        public final w5.f e() {
            return this.f7272g;
        }

        public final String getKey() {
            return this.f7271f;
        }
    }

    public f() {
        Arrays.stream(a.values()).forEach(new r5.f(12, this));
    }
}
