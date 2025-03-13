package l4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.health.services.client.R;
import com.google.android.material.button.MaterialButton;
import d0.b;
import j0.x;
import k3.j;
import y4.f;
import y4.i;
import y4.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f5292a;

    /* renamed from: b  reason: collision with root package name */
    public i f5293b;

    /* renamed from: c  reason: collision with root package name */
    public int f5294c;

    /* renamed from: d  reason: collision with root package name */
    public int f5295d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f5296f;

    /* renamed from: g  reason: collision with root package name */
    public int f5297g;

    /* renamed from: h  reason: collision with root package name */
    public int f5298h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f5299i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5300j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5301k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5302l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f5303m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5304n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5305o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5306p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5307q;
    public RippleDrawable r;

    /* renamed from: s  reason: collision with root package name */
    public int f5308s;

    public a(MaterialButton materialButton, i iVar) {
        this.f5292a = materialButton;
        this.f5293b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.r.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.r;
        return (m) (numberOfLayers > 2 ? rippleDrawable2.getDrawable(2) : rippleDrawable2.getDrawable(1));
    }

    public final f b(boolean z8) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(z8 ^ true ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f5293b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i8, int i9) {
        int[] iArr = x.f4957a;
        MaterialButton materialButton = this.f5292a;
        int f9 = x.d.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e4 = x.d.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.e;
        int i11 = this.f5296f;
        this.f5296f = i9;
        this.e = i8;
        if (!this.f5305o) {
            e();
        }
        x.d.k(materialButton, f9, (paddingTop + i8) - i10, e4, (paddingBottom + i9) - i11);
    }

    public final void e() {
        f fVar = new f(this.f5293b);
        MaterialButton materialButton = this.f5292a;
        fVar.h(materialButton.getContext());
        b.h(fVar, this.f5300j);
        PorterDuff.Mode mode = this.f5299i;
        if (mode != null) {
            b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.f5301k;
        fVar.f8412a.f8442k = (float) this.f5298h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f8412a;
        if (bVar.f8436d != colorStateList) {
            bVar.f8436d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f5293b);
        fVar2.setTint(0);
        float f9 = (float) this.f5298h;
        int x8 = this.f5304n ? j.x(materialButton, R.attr.colorSurface) : 0;
        fVar2.f8412a.f8442k = f9;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(x8);
        f.b bVar2 = fVar2.f8412a;
        if (bVar2.f8436d != valueOf) {
            bVar2.f8436d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f5293b);
        this.f5303m = fVar3;
        b.g(fVar3, -1);
        ColorStateList colorStateList2 = this.f5302l;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f5294c, this.e, this.f5295d, this.f5296f), this.f5303m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b9 = b(false);
        if (b9 != null) {
            b9.i((float) this.f5308s);
        }
    }

    public final void f() {
        int i8 = 0;
        f b9 = b(false);
        f b10 = b(true);
        if (b9 != null) {
            ColorStateList colorStateList = this.f5301k;
            b9.f8412a.f8442k = (float) this.f5298h;
            b9.invalidateSelf();
            f.b bVar = b9.f8412a;
            if (bVar.f8436d != colorStateList) {
                bVar.f8436d = colorStateList;
                b9.onStateChange(b9.getState());
            }
            if (b10 != null) {
                float f9 = (float) this.f5298h;
                if (this.f5304n) {
                    i8 = j.x(this.f5292a, R.attr.colorSurface);
                }
                b10.f8412a.f8442k = f9;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i8);
                f.b bVar2 = b10.f8412a;
                if (bVar2.f8436d != valueOf) {
                    bVar2.f8436d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
