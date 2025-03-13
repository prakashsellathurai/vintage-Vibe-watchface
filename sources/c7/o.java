package c7;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public final class o extends Paint {

    /* renamed from: a  reason: collision with root package name */
    public j f2822a;

    /* renamed from: b  reason: collision with root package name */
    public String f2823b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2824c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2825d;
    public boolean e;

    public o(Paint paint) {
        super(paint);
        this.f2825d = false;
        this.e = false;
    }

    public o(o oVar) {
        this((Paint) oVar);
        this.f2822a = oVar.f2822a;
        this.f2823b = oVar.f2823b;
        this.f2824c = oVar.f2824c;
        this.f2825d = oVar.f2825d;
        this.e = oVar.e;
    }

    public final ArrayList<Drawable> a(String str) {
        if (!this.f2824c) {
            return null;
        }
        return this.f2822a.a((int) getTextSize(), this.f2823b, str);
    }

    public final float ascent() {
        return super.ascent();
    }

    public final int breakText(String str, boolean z8, float f9, float[] fArr) {
        return super.breakText(str, z8, f9, fArr);
    }

    public final float descent() {
        return super.descent();
    }

    public final Paint.FontMetrics getFontMetrics() {
        return super.getFontMetrics();
    }

    public final float measureText(String str) {
        return super.measureText(str);
    }

    public final void setColor(int i8) {
        super.setColor(i8);
        this.f2825d = true;
    }
}
