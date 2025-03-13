package t6;

import e7.i;
import java.util.Arrays;
import w5.f;

public class k extends i {

    public enum a implements i.a {
        X("x", new f(0.0f)),
        Y("y", new f(0.0f)),
        WIDTH("width", new f(0.0f)),
        HEIGHT("height", new f(0.0f));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f7532f;

        /* renamed from: g  reason: collision with root package name */
        public final f f7533g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f7532f = str;
            this.f7533g = fVar;
        }

        public final f e() {
            return this.f7533g;
        }

        public final String getKey() {
            return this.f7532f;
        }
    }

    public k() {
        Arrays.stream(a.values()).forEach(new r5.f(17, this));
    }
}
