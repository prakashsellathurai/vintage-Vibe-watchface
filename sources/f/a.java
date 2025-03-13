package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: f.a$a  reason: collision with other inner class name */
    public static class C0053a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4297a = 8388627;

        public C0053a() {
            super(-2, -2);
        }

        public C0053a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f36n);
            this.f4297a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0053a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0053a(C0053a aVar) {
            super(aVar);
            this.f4297a = aVar.f4297a;
        }
    }
}
