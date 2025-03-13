package c7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j6.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class h extends n {

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<Drawable> f2801j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f2802k = null;

    public h(Drawable drawable, Rect rect) {
        ArrayList<Drawable> arrayList = new ArrayList<>();
        this.f2801j = arrayList;
        arrayList.add(drawable);
        this.f2819g = new Rect(rect);
    }

    public h(String str, ArrayList arrayList) {
        super(str);
        ArrayList<Drawable> arrayList2 = new ArrayList<>();
        this.f2801j = arrayList2;
        arrayList2.addAll(arrayList);
        if (arrayList2.size() > 0) {
            Iterator<Drawable> it = arrayList2.iterator();
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                Rect c9 = b.c(it.next());
                i8 += c9.width();
                i9 = c9.height();
            }
            this.f2819g = new Rect(0, 0, i8, i9);
        }
    }

    public final void a(o oVar) {
    }

    public final void c(o oVar) {
        super.c(oVar);
        PorterDuffColorFilter porterDuffColorFilter = this.f2802k != null ? new PorterDuffColorFilter(this.f2802k.intValue(), PorterDuff.Mode.MULTIPLY) : oVar.f2825d ? new PorterDuffColorFilter(this.f2820h.getColor(), PorterDuff.Mode.MULTIPLY) : null;
        if (porterDuffColorFilter != null) {
            this.f2820h.setColorFilter(porterDuffColorFilter);
            Iterator<Drawable> it = this.f2801j.iterator();
            while (it.hasNext()) {
                it.next().setColorFilter(porterDuffColorFilter);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Drawable> arrayList = this.f2801j;
        if (arrayList != null && arrayList.size() > 0) {
            sb.append("[" + arrayList.size() + " bitmaps]");
        }
        return super.toString() + sb.toString();
    }
}
