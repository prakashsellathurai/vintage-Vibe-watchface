package u6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class c extends i {

    public enum a implements i.a {
        ;
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7808f;

        /* renamed from: g  reason: collision with root package name */
        public final f f7809g;

        /* access modifiers changed from: public */
        a(f fVar) {
            this.f7808f = "thickness";
            this.f7809g = fVar;
        }

        public final f e() {
            return this.f7809g;
        }

        public final String getKey() {
            return this.f7808f;
        }
    }

    public c() {
        Arrays.stream(a.values()).forEach(new r5.f(18, this));
    }
}
