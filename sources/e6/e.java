package e6;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f4260b = new e((String) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f4261a;

    public e(String str) {
        this.f4261a = str;
    }

    public final boolean equals(Object obj) {
        String str = this.f4261a;
        if (str == null) {
            return obj == null;
        }
        if (obj instanceof e) {
            return ((e) obj).f4261a.equals(str);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4261a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
