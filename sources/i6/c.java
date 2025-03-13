package i6;

import android.util.Log;
import org.xml.sax.Attributes;

public final class c extends b {
    public String e = "";

    public c() {
        super("element", (Attributes) null);
    }

    public final void a(e eVar) {
        Log.e("DWF:ElementTag", "Can't add child to element tag");
    }

    public final boolean d(String str) {
        return this.e.contains(str);
    }

    public final String e() {
        return this.e;
    }

    public final void f(String str) {
        this.e = str;
    }
}
