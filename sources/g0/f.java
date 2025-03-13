package g0;

import android.util.Base64;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f4448a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4449b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4450c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f4451d;
    public final String e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f4448a = str;
        this.f4449b = str2;
        this.f4450c = str3;
        list.getClass();
        this.f4451d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4448a + ", mProviderPackage: " + this.f4449b + ", mQuery: " + this.f4450c + ", mCertificates:");
        int i8 = 0;
        while (true) {
            List<List<byte[]>> list = this.f4451d;
            if (i8 < list.size()) {
                sb.append(" [");
                List list2 = list.get(i8);
                for (int i9 = 0; i9 < list2.size(); i9++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i9), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i8++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
