package d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f3996c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3997a;

    /* renamed from: b  reason: collision with root package name */
    public f f3998b;

    public e(e eVar) {
        this.f3997a = new ArrayList(eVar.f3997a);
        this.f3998b = eVar.f3998b;
    }

    public e(String... strArr) {
        this.f3997a = Arrays.asList(strArr);
    }

    public final boolean a(int i8, String str) {
        List<String> list = this.f3997a;
        if (i8 >= list.size()) {
            return false;
        }
        boolean z8 = i8 == list.size() - 1;
        String str2 = list.get(i8);
        if (!str2.equals("**")) {
            return (z8 || (i8 == list.size() + -2 && list.get(list.size() + -1).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z8 && list.get(i8 + 1).equals(str)) {
            return i8 == list.size() + -2 || (i8 == list.size() + -3 && list.get(list.size() + -1).equals("**"));
        }
        if (z8) {
            return true;
        }
        int i9 = i8 + 1;
        if (i9 < list.size() - 1) {
            return false;
        }
        return list.get(i9).equals(str);
    }

    public final int b(int i8, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f3997a;
        if (!list.get(i8).equals("**")) {
            return 1;
        }
        return (i8 != list.size() - 1 && list.get(i8 + 1).equals(str)) ? 2 : 0;
    }

    public final boolean c(int i8, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f3997a;
        if (i8 >= list.size()) {
            return false;
        }
        return list.get(i8).equals(str) || list.get(i8).equals("**") || list.get(i8).equals("*");
    }

    public final boolean d(int i8, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f3997a;
        return i8 < list.size() - 1 || list.get(i8).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f3997a);
        sb.append(",resolved=");
        sb.append(this.f3998b != null);
        sb.append('}');
        return sb.toString();
    }
}
