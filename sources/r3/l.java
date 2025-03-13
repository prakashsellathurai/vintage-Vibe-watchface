package r3;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public final class l {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f7007a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f7008b;

        public /* synthetic */ a(Object obj) {
            b.b(obj);
            this.f7008b = obj;
        }

        @RecentlyNonNull
        public final void a(Object obj, @RecentlyNonNull String str) {
            ArrayList arrayList = this.f7007a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }

        @RecentlyNonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f7008b.getClass().getSimpleName());
            sb.append('{');
            ArrayList arrayList = this.f7007a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) arrayList.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }
}
