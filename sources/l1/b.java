package l1;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final m1.b f5232a;

    public b(m1.b bVar) {
        this.f5232a = bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationSpec{animationParameters=");
        m1.b bVar = this.f5232a;
        d dVar = null;
        sb.append(bVar.w() ? new a(bVar.t()) : null);
        sb.append(", repeatable=");
        if (bVar.x()) {
            dVar = new d(bVar.v());
        }
        sb.append(dVar);
        sb.append("}");
        return sb.toString();
    }
}
