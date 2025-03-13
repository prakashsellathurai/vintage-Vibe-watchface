package f5;

import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4408a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4409b;

    /* renamed from: c  reason: collision with root package name */
    public a f4410c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f4411a;

        /* renamed from: b  reason: collision with root package name */
        public a f4412b;
    }

    public b(String str) {
        a aVar = new a();
        this.f4409b = aVar;
        this.f4410c = aVar;
        this.f4408a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f4408a);
        sb.append('{');
        a aVar = this.f4409b.f4412b;
        String str = "";
        while (aVar != null) {
            Object obj = aVar.f4411a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            aVar = aVar.f4412b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
