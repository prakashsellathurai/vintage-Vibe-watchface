package v2;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f7869b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f7870c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f7871b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<h>> f7872a = f7871b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = property.charAt(i8);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f7871b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f7873a;

        public b(String str) {
            this.f7873a = str;
        }

        public final String a() {
            return this.f7873a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f7873a.equals(((b) obj).f7873a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f7873a.hashCode();
        }

        public final String toString() {
            return "StringHeaderFactory{value='" + this.f7873a + "'}";
        }
    }

    public i(Map<String, List<h>> map) {
        this.f7869b = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.f7870c == null) {
            synchronized (this) {
                if (this.f7870c == null) {
                    this.f7870c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f7870c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f7869b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                String a9 = ((h) list.get(i8)).a();
                if (!TextUtils.isEmpty(a9)) {
                    sb.append(a9);
                    if (i8 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f7869b.equals(((i) obj).f7869b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7869b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f7869b + '}';
    }
}
