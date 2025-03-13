package d7;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class b extends i {

    public enum a implements i.a {
        START_ANGLE("startAngle", new f(-1.0f)),
        END_ANGLE("endAngle", new f(-1.0f)),
        CENTER_X("centerX", new f(0.0f)),
        CENTER_Y("centerY", new f(0.0f)),
        RADIUS("radius", new f(-1.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f4111f;

        /* renamed from: g  reason: collision with root package name */
        public final f f4112g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f4111f = str;
            this.f4112g = fVar;
        }

        public final f e() {
            return this.f4112g;
        }

        public final String getKey() {
            return this.f4111f;
        }
    }

    public b() {
        Arrays.stream(a.values()).forEach(new r5.f(23, this));
    }
}
