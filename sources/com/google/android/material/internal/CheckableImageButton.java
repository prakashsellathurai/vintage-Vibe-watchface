package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.k;
import androidx.health.services.client.R;
import j0.x;

public class CheckableImageButton extends k implements Checkable {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f3358f = {16842912};

    /* renamed from: c  reason: collision with root package name */
    public boolean f3359c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3360d = true;
    public boolean e = true;

    public static class a extends p0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0036a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f3361h;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public static class C0036a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3361h = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f3361h ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        x.i(this, new u4.a(this));
    }

    public final boolean isChecked() {
        return this.f3359c;
    }

    public final int[] onCreateDrawableState(int i8) {
        return this.f3359c ? View.mergeDrawableStates(super.onCreateDrawableState(i8 + 1), f3358f) : super.onCreateDrawableState(i8);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f6241f);
        setChecked(aVar.f3361h);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3361h = this.f3359c;
        return aVar;
    }

    public void setCheckable(boolean z8) {
        if (this.f3360d != z8) {
            this.f3360d = z8;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z8) {
        if (this.f3360d && this.f3359c != z8) {
            this.f3359c = z8;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z8) {
        this.e = z8;
    }

    public void setPressed(boolean z8) {
        if (this.e) {
            super.setPressed(z8);
        }
    }

    public final void toggle() {
        setChecked(!this.f3359c);
    }
}
