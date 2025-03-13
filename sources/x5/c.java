package x5;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y5.b;
import y5.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f8147a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8148b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8149c;

    /* renamed from: d  reason: collision with root package name */
    public d f8150d = new d();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final a f8151f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8152g;

    /* renamed from: h  reason: collision with root package name */
    public String f8153h;

    /* renamed from: i  reason: collision with root package name */
    public a f8154i;

    /* renamed from: j  reason: collision with root package name */
    public String f8155j;

    /* renamed from: k  reason: collision with root package name */
    public a f8156k;

    /* renamed from: l  reason: collision with root package name */
    public e f8157l;

    public c(int i8, String str, List<String> list, String str2, String str3, boolean z8, int i9, int i10, int i11, int i12) {
        this.f8147a = i8;
        this.f8148b = str;
        this.f8149c = new ArrayList();
        Iterator<String> it = list.iterator();
        while (true) {
            Class cls = a.class;
            if (it.hasNext()) {
                this.f8149c.add((a) Enum.valueOf(cls, it.next()));
            } else {
                this.e = str2;
                this.f8151f = (a) Enum.valueOf(cls, str3);
                this.f8152g = z8;
                this.f8157l = new b(new RectF((float) i9, (float) i10, (float) (i9 + i11), (float) (i10 + i12)), new RectF(0.0f, 0.0f, (float) i11, (float) i12), 0.0f, new Matrix());
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = n6.c.f5960a;
        sb.append(str);
        sb.append(str);
        sb.append("##################### Complication ############################");
        sb.append(str);
        sb.append(String.format(Locale.getDefault(), "  id : %s [%d]", new Object[]{this.f8148b, Integer.valueOf(this.f8147a)}));
        sb.append(this.f8152g ? " (Customizable)" : " (Fixed)");
        sb.append(str);
        sb.append("  supported types : ");
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f8149c;
            if (i8 < arrayList.size()) {
                if (i8 != 0) {
                    sb.append(" / ");
                }
                sb.append(((a) arrayList.get(i8)).toString());
                i8++;
            } else {
                sb.append(String.format(" (%s)", new Object[]{this.f8151f}));
                String str2 = n6.c.f5960a;
                sb.append(str2);
                sb.append(this.f8150d.toString());
                sb.append(str2);
                sb.append(String.format(Locale.getDefault(), "  bounds : x[%f] y[%f] w[%f] h[%f]", new Object[]{Float.valueOf(this.f8157l.a().left), Float.valueOf(this.f8157l.a().top), Float.valueOf(this.f8157l.a().width()), Float.valueOf(this.f8157l.a().height())}));
                return sb.toString();
            }
        }
    }
}
