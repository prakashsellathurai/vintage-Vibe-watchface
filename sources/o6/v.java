package o6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class v extends i {

    public enum a implements i.a {
        ;
        

        /* renamed from: f  reason: collision with root package name */
        public final String f6187f;

        /* renamed from: g  reason: collision with root package name */
        public final f f6188g;

        /* access modifiers changed from: public */
        a(f fVar) {
            this.f6187f = "backgroundColor";
            this.f6188g = fVar;
        }

        public final f e() {
            return this.f6188g;
        }

        public final String getKey() {
            return this.f6187f;
        }
    }

    public v() {
        Arrays.stream(a.values()).forEach(new r5.f(11, this));
    }
}
