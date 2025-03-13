package y1;

import android.graphics.Rect;
import d2.c;
import d2.d;
import d2.h;
import g2.e;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final u f8219a = new u();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f8220b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f8221c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, n> f8222d;
    public Map<String, c> e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f8223f;

    /* renamed from: g  reason: collision with root package name */
    public g<d> f8224g;

    /* renamed from: h  reason: collision with root package name */
    public p.d<e> f8225h;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f8226i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f8227j;

    /* renamed from: k  reason: collision with root package name */
    public float f8228k;

    /* renamed from: l  reason: collision with root package name */
    public float f8229l;

    /* renamed from: m  reason: collision with root package name */
    public float f8230m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8231n;

    /* renamed from: o  reason: collision with root package name */
    public int f8232o = 0;

    public final void a(String str) {
        k2.c.b(str);
        this.f8220b.add(str);
    }

    public final float b() {
        return (float) ((long) (((this.f8229l - this.f8228k) / this.f8230m) * 1000.0f));
    }

    public final h c(String str) {
        int size = this.f8223f.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = this.f8223f.get(i8);
            String str2 = hVar.f4001a;
            boolean z8 = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z8 = false;
            }
            if (z8) {
                return hVar;
            }
        }
        return null;
    }

    public final e d(long j8) {
        return (e) this.f8225h.d(j8, (Long) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (e a9 : this.f8226i) {
            sb.append(a9.a("\t"));
        }
        return sb.toString();
    }
}
