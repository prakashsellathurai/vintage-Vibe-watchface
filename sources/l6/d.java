package l6;

import android.graphics.Bitmap;
import java.util.Locale;
import java.util.Objects;
import l6.b;

public class d implements Comparable<d> {

    /* renamed from: f  reason: collision with root package name */
    public final a f5325f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5326g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5327h;

    public static abstract class a {
        public final String toString() {
            Bitmap bitmap = ((b.a) this).f5321a;
            return bitmap != null ? bitmap.toString() : "";
        }
    }

    public d(String str, b.a aVar, float f9) {
        this.f5326g = str;
        this.f5325f = aVar;
        this.f5327h = f9;
    }

    public final int compareTo(Object obj) {
        return this.f5327h > ((d) obj).f5327h ? 1 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(dVar.f5327h, this.f5327h) == 0 && Objects.equals(this.f5325f, dVar.f5325f) && Objects.equals(this.f5326g, dVar.f5326g);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f5325f, this.f5326g, Float.valueOf(this.f5327h)});
    }

    public final String toString() {
        return String.format(Locale.US, "[%s, %f, %s]", new Object[]{this.f5326g, Float.valueOf(this.f5327h), this.f5325f.toString()});
    }
}
