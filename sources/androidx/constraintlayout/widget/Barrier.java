package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import k3.j;
import t.a;

public class Barrier extends a {

    /* renamed from: h  reason: collision with root package name */
    public int f858h;

    /* renamed from: i  reason: collision with root package name */
    public int f859i;

    /* renamed from: j  reason: collision with root package name */
    public a f860j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public final void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        this.f860j = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f5155j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f860j.f7282p0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f860j.f7283q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f922d = this.f860j;
        h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 == 6) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(t.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f858h
            r3.f859i = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            if (r0 != r1) goto L_0x0017
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0012
        L_0x0010:
            r5 = 0
            goto L_0x0015
        L_0x0012:
            if (r0 != r1) goto L_0x0017
        L_0x0014:
            r5 = 1
        L_0x0015:
            r3.f859i = r5
        L_0x0017:
            boolean r5 = r4 instanceof t.a
            if (r5 == 0) goto L_0x0021
            t.a r4 = (t.a) r4
            int r3 = r3.f859i
            r4.f7281o0 = r3
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.g(t.d, boolean):void");
    }

    public int getMargin() {
        return this.f860j.f7283q0;
    }

    public int getType() {
        return this.f858h;
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f860j.f7282p0 = z8;
    }

    public void setDpMargin(int i8) {
        this.f860j.f7283q0 = (int) ((((float) i8) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i8) {
        this.f860j.f7283q0 = i8;
    }

    public void setType(int i8) {
        this.f858h = i8;
    }
}
