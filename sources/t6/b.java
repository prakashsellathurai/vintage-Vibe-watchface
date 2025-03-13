package t6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class b extends k {

    public enum a implements i.a {
        CENTER_X("centerX", new f(0.0f)),
        CENTER_Y("centerY", new f(0.0f)),
        START_ANGLE("startAngle", new f(0.0f)),
        END_ANGLE("endAngle", new f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7508f;

        /* renamed from: g  reason: collision with root package name */
        public final f f7509g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f7508f = str;
            this.f7509g = fVar;
        }

        public final f e() {
            return this.f7509g;
        }

        public final String getKey() {
            return this.f7508f;
        }
    }

    public b() {
        Arrays.stream(a.values()).forEach(new r5.f(14, this));
    }
}
