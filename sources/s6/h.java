package s6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class h extends i {

    public enum a implements i.a {
        CENTER_X("centerX", new f(0.0f)),
        CENTER_Y("centerY", new f(0.0f)),
        START_ANGLE("startAngle", new f(0.0f)),
        END_ANGLE("endAngle", new f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7279f;

        /* renamed from: g  reason: collision with root package name */
        public final f f7280g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f7279f = str;
            this.f7280g = fVar;
        }

        public final f e() {
            return this.f7280g;
        }

        public final String getKey() {
            return this.f7279f;
        }
    }

    public h() {
        Arrays.stream(a.values()).forEach(new r5.f(13, this));
    }
}
