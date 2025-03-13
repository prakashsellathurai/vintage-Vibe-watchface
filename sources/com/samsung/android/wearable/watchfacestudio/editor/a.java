package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import t1.r;
import u1.d;
import u1.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f3866a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3867b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f3868c;

    /* renamed from: d  reason: collision with root package name */
    public final C0046a f3869d;

    /* renamed from: com.samsung.android.wearable.watchfacestudio.editor.a$a  reason: collision with other inner class name */
    public abstract class C0046a {
        public C0046a() {
        }

        public void a() {
            a aVar = a.this;
            aVar.f3866a.b().setValue(new e(aVar.f3867b.f7611f));
        }

        public abstract void b(boolean z8);

        public abstract void c(TranslateAnimation translateAnimation);
    }

    public class b extends C0046a {
        public b(View.OnClickListener onClickListener) {
            super();
            a.this.f3866a.l(false);
            a.this.f3868c.setOnClickListener(new b(this, onClickListener));
        }

        public static /* synthetic */ void d(b bVar, View.OnClickListener onClickListener, View view) {
            a.this.f3866a.l(true);
            super.a();
            onClickListener.onClick(view);
        }

        public final void a() {
        }

        public final void b(boolean z8) {
            a.this.f3868c.setVisibility(z8 ? 0 : 8);
        }

        public final void c(TranslateAnimation translateAnimation) {
            a.this.f3868c.startAnimation(translateAnimation);
        }
    }

    public class c extends C0046a {
        public c(a aVar) {
            super();
            aVar.f3868c.setVisibility(8);
            aVar.f3866a.l(true);
        }

        public final void b(boolean z8) {
        }

        public final void c(TranslateAnimation translateAnimation) {
        }
    }

    public a(Button button, r rVar, d dVar, View.OnClickListener onClickListener, boolean z8) {
        this.f3866a = rVar;
        this.f3867b = dVar;
        this.f3868c = button;
        this.f3869d = z8 ? new c(this) : new b(onClickListener);
    }
}
