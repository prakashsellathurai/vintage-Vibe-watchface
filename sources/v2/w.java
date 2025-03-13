package v2;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p2.g;
import v2.n;

public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f7923b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f7924a;

    public static class a implements o<Uri, InputStream> {
        public final n<Uri, InputStream> b(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f7924a = nVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        return this.f7924a.a(new f(((Uri) obj).toString()), i8, i9, gVar);
    }

    public final boolean b(Object obj) {
        return f7923b.contains(((Uri) obj).getScheme());
    }
}
