package s6;

import e7.i;
import w5.f;

public enum d implements i.a {
    START_X("startX", new f(0.0f)),
    START_Y("startY", new f(0.0f)),
    END_X("endX", new f(0.0f)),
    END_Y("endY", new f(0.0f));
    

    /* renamed from: f  reason: collision with root package name */
    public final String f7265f;

    /* renamed from: g  reason: collision with root package name */
    public final f f7266g;

    /* access modifiers changed from: public */
    d(String str, f fVar) {
        this.f7265f = str;
        this.f7266g = fVar;
    }

    public final f e() {
        return this.f7266g;
    }

    public final String getKey() {
        return this.f7265f;
    }
}
