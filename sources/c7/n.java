package c7;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;

public class n implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public String f2818f = null;

    /* renamed from: g  reason: collision with root package name */
    public Rect f2819g = null;

    /* renamed from: h  reason: collision with root package name */
    public o f2820h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2821i = true;

    public n() {
    }

    public n(String str) {
        b(str);
    }

    public void a(o oVar) {
        if (this.f2818f != null && this.f2819g == null) {
            Paint.FontMetrics fontMetrics = oVar.getFontMetrics();
            Rect rect = new Rect();
            this.f2819g = rect;
            rect.left = 0;
            rect.right = (int) oVar.measureText(this.f2818f);
            Rect rect2 = this.f2819g;
            rect2.top = (int) fontMetrics.ascent;
            rect2.bottom = (int) fontMetrics.descent;
        }
    }

    public final void b(String str) {
        if (!str.equals(this.f2818f)) {
            this.f2818f = str;
            this.f2819g = null;
            o oVar = this.f2820h;
            if (oVar != null) {
                a(oVar);
            }
            this.f2821i = true;
        }
    }

    public void c(o oVar) {
        o oVar2 = new o(oVar);
        this.f2820h = oVar2;
        a(oVar2);
        this.f2821i = true;
    }

    public final Object clone() {
        n nVar = null;
        try {
            n nVar2 = (n) super.clone();
            try {
                if (this.f2819g != null) {
                    nVar2.f2819g = new Rect(this.f2819g);
                }
                if (this.f2820h == null) {
                    return nVar2;
                }
                nVar2.f2820h = new o(this.f2820h);
                return nVar2;
            } catch (CloneNotSupportedException e) {
                e = e;
                nVar = nVar2;
                Log.e("DWF:TextElement", e.getMessage());
                return nVar;
            }
        } catch (CloneNotSupportedException e4) {
            e = e4;
            Log.e("DWF:TextElement", e.getMessage());
            return nVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName().concat("@"));
        sb.append(Integer.toHexString(System.identityHashCode(this)) + "_");
        sb.append("\"" + this.f2818f + "\"");
        return sb.toString();
    }
}
