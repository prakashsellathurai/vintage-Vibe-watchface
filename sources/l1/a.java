package l1;

import m1.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m1.a f5231a;

    public a(m1.a aVar) {
        this.f5231a = aVar;
    }

    public final String toString() {
        c cVar;
        StringBuilder sb = new StringBuilder("AnimationParameters{durationMillis=");
        m1.a aVar = this.f5231a;
        sb.append(aVar.v());
        sb.append(", easing=");
        if (aVar.x()) {
            d w = aVar.w();
            if (w.v()) {
                cVar = new c(w.t());
            } else {
                throw new IllegalStateException("Proto was not a recognised instance of Easing");
            }
        } else {
            cVar = null;
        }
        sb.append(cVar);
        sb.append(", delayMillis=");
        sb.append(aVar.u());
        sb.append("}");
        return sb.toString();
    }
}
