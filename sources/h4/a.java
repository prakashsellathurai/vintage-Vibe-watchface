package h4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.health.services.client.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import u4.i;
import u4.k;
import v4.c;
import v4.d;
import y4.f;

public final class a extends Drawable implements i.b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f4751a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4752b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final i f4753c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4754d = new Rect();
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4755f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4756g;

    /* renamed from: h  reason: collision with root package name */
    public final C0062a f4757h;

    /* renamed from: i  reason: collision with root package name */
    public float f4758i;

    /* renamed from: j  reason: collision with root package name */
    public float f4759j;

    /* renamed from: k  reason: collision with root package name */
    public int f4760k;

    /* renamed from: l  reason: collision with root package name */
    public float f4761l;

    /* renamed from: m  reason: collision with root package name */
    public float f4762m;

    /* renamed from: n  reason: collision with root package name */
    public float f4763n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f4764o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<FrameLayout> f4765p;

    /* renamed from: h4.a$a  reason: collision with other inner class name */
    public static final class C0062a implements Parcelable {
        public static final Parcelable.Creator<C0062a> CREATOR = new C0063a();

        /* renamed from: f  reason: collision with root package name */
        public int f4766f;

        /* renamed from: g  reason: collision with root package name */
        public int f4767g;

        /* renamed from: h  reason: collision with root package name */
        public int f4768h = 255;

        /* renamed from: i  reason: collision with root package name */
        public int f4769i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f4770j;

        /* renamed from: k  reason: collision with root package name */
        public final String f4771k;

        /* renamed from: l  reason: collision with root package name */
        public final int f4772l;

        /* renamed from: m  reason: collision with root package name */
        public final int f4773m;

        /* renamed from: n  reason: collision with root package name */
        public int f4774n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f4775o;

        /* renamed from: p  reason: collision with root package name */
        public int f4776p;

        /* renamed from: q  reason: collision with root package name */
        public int f4777q;

        /* renamed from: h4.a$a$a  reason: collision with other inner class name */
        public static class C0063a implements Parcelable.Creator<C0062a> {
            public final Object createFromParcel(Parcel parcel) {
                return new C0062a(parcel);
            }

            public final Object[] newArray(int i8) {
                return new C0062a[i8];
            }
        }

        public C0062a(Context context) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(-2146303600, a1.a.f25h0);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a9 = c.a(context, obtainStyledAttributes, 3);
            c.a(context, obtainStyledAttributes, 4);
            c.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i8 = !obtainStyledAttributes.hasValue(15) ? 10 : 15;
            obtainStyledAttributes.getResourceId(i8, 0);
            obtainStyledAttributes.getString(i8);
            obtainStyledAttributes.getBoolean(17, false);
            c.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(-2146303600, a1.a.Z);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f4767g = a9.getDefaultColor();
            this.f4771k = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.f4772l = R.plurals.mtrl_badge_content_description;
            this.f4773m = R.string.mtrl_exceed_max_badge_number_content_description;
            this.f4775o = true;
        }

        public C0062a(Parcel parcel) {
            this.f4766f = parcel.readInt();
            this.f4767g = parcel.readInt();
            this.f4768h = parcel.readInt();
            this.f4769i = parcel.readInt();
            this.f4770j = parcel.readInt();
            this.f4771k = parcel.readString();
            this.f4772l = parcel.readInt();
            this.f4774n = parcel.readInt();
            this.f4776p = parcel.readInt();
            this.f4777q = parcel.readInt();
            this.f4775o = parcel.readInt() != 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f4766f);
            parcel.writeInt(this.f4767g);
            parcel.writeInt(this.f4768h);
            parcel.writeInt(this.f4769i);
            parcel.writeInt(this.f4770j);
            parcel.writeString(this.f4771k.toString());
            parcel.writeInt(this.f4772l);
            parcel.writeInt(this.f4774n);
            parcel.writeInt(this.f4776p);
            parcel.writeInt(this.f4777q);
            parcel.writeInt(this.f4775o ? 1 : 0);
        }
    }

    public a(Context context) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f4751a = weakReference;
        k.c(context, k.f7781b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.e = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.f4756g = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f4755f = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        i iVar = new i(this);
        this.f4753c = iVar;
        iVar.f7774a.setTextAlign(Paint.Align.CENTER);
        this.f4757h = new C0062a(context);
        Context context3 = weakReference.get();
        if (context3 != null && iVar.f7778f != (dVar = new d(context3, -2146303600)) && (context2 = weakReference.get()) != null) {
            iVar.b(dVar, context2);
            g();
        }
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (d() <= this.f4760k) {
            return NumberFormat.getInstance().format((long) d());
        }
        Context context = this.f4751a.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f4760k), "+"});
    }

    public final FrameLayout c() {
        WeakReference<FrameLayout> weakReference = this.f4765p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int d() {
        if (!e()) {
            return 0;
        }
        return this.f4757h.f4769i;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.f4757h.f4768h != 0 && isVisible()) {
            this.f4752b.draw(canvas);
            if (e()) {
                Rect rect = new Rect();
                String b9 = b();
                i iVar = this.f4753c;
                iVar.f7774a.getTextBounds(b9, 0, b9.length(), rect);
                canvas.drawText(b9, this.f4758i, this.f4759j + ((float) (rect.height() / 2)), iVar.f7774a);
            }
        }
    }

    public final boolean e() {
        return this.f4757h.f4769i != -1;
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.f4764o = new WeakReference<>(view);
        this.f4765p = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (j0.x.d.d(r1) == 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        if (j0.x.d.d(r1) == 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r1 = ((((float) r5.right) + r10.f4762m) - ((float) r0)) - ((float) r2.f4776p);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r10 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r10.f4751a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.ref.WeakReference<android.view.View> r1 = r10.f4764o
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x0105
            if (r1 != 0) goto L_0x001b
            goto L_0x0105
        L_0x001b:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r4 = r10.f4754d
            r3.set(r4)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r1.getDrawingRect(r5)
            java.lang.ref.WeakReference<android.widget.FrameLayout> r6 = r10.f4765p
            if (r6 == 0) goto L_0x0037
            java.lang.Object r2 = r6.get()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            if (r2 != 0) goto L_0x0042
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0042:
            r2.offsetDescendantRectToMyCoords(r1, r5)
        L_0x0045:
            h4.a$a r2 = r10.f4757h
            int r6 = r2.f4774n
            r7 = 8388691(0x800053, float:1.175506E-38)
            if (r6 == r7) goto L_0x0059
            r8 = 8388693(0x800055, float:1.1755063E-38)
            if (r6 == r8) goto L_0x0059
            int r6 = r5.top
            int r8 = r2.f4777q
            int r6 = r6 + r8
            goto L_0x005e
        L_0x0059:
            int r6 = r5.bottom
            int r8 = r2.f4777q
            int r6 = r6 - r8
        L_0x005e:
            float r6 = (float) r6
            r10.f4759j = r6
            int r6 = r10.d()
            r8 = 9
            float r9 = r10.f4755f
            if (r6 > r8) goto L_0x007a
            boolean r6 = r10.e()
            if (r6 != 0) goto L_0x0073
            float r9 = r10.e
        L_0x0073:
            r10.f4761l = r9
            r10.f4763n = r9
            r10.f4762m = r9
            goto L_0x0090
        L_0x007a:
            r10.f4761l = r9
            r10.f4763n = r9
            java.lang.String r6 = r10.b()
            u4.i r8 = r10.f4753c
            float r6 = r8.a(r6)
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            float r8 = r10.f4756g
            float r6 = r6 + r8
            r10.f4762m = r6
        L_0x0090:
            android.content.res.Resources r0 = r0.getResources()
            boolean r6 = r10.e()
            if (r6 == 0) goto L_0x009e
            r6 = -2147024654(0xffffffff800700f2, float:-6.43188E-40)
            goto L_0x00a1
        L_0x009e:
            r6 = -2147024657(0xffffffff800700ef, float:-6.43183E-40)
        L_0x00a1:
            int r0 = r0.getDimensionPixelSize(r6)
            int r6 = r2.f4774n
            r8 = 8388659(0x800033, float:1.1755015E-38)
            if (r6 == r8) goto L_0x00b7
            if (r6 == r7) goto L_0x00b7
            int[] r6 = j0.x.f4957a
            int r1 = j0.x.d.d(r1)
            if (r1 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00b7:
            int[] r6 = j0.x.f4957a
            int r1 = j0.x.d.d(r1)
            if (r1 != 0) goto L_0x00cc
        L_0x00bf:
            int r1 = r5.left
            float r1 = (float) r1
            float r5 = r10.f4762m
            float r1 = r1 - r5
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = r2.f4776p
            float r0 = (float) r0
            float r1 = r1 + r0
            goto L_0x00d8
        L_0x00cc:
            int r1 = r5.right
            float r1 = (float) r1
            float r5 = r10.f4762m
            float r1 = r1 + r5
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = r2.f4776p
            float r0 = (float) r0
            float r1 = r1 - r0
        L_0x00d8:
            r10.f4758i = r1
            float r0 = r10.f4759j
            float r2 = r10.f4762m
            float r5 = r10.f4763n
            float r6 = r1 - r2
            int r6 = (int) r6
            float r7 = r0 - r5
            int r7 = (int) r7
            float r1 = r1 + r2
            int r1 = (int) r1
            float r0 = r0 + r5
            int r0 = (int) r0
            r4.set(r6, r7, r1, r0)
            float r0 = r10.f4761l
            y4.f r10 = r10.f4752b
            y4.f$b r1 = r10.f8412a
            y4.i r1 = r1.f8433a
            y4.i r0 = r1.e(r0)
            r10.setShapeAppearanceModel(r0)
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L_0x0105
            r10.setBounds(r4)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.g():void");
    }

    public final int getAlpha() {
        return this.f4757h.f4768h;
    }

    public final int getIntrinsicHeight() {
        return this.f4754d.height();
    }

    public final int getIntrinsicWidth() {
        return this.f4754d.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i8) {
        this.f4757h.f4768h = i8;
        this.f4753c.f7774a.setAlpha(i8);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
