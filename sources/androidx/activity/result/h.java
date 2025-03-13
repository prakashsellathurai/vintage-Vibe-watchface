package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import q7.k;

@SuppressLint({"BanParcelableUsage"})
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final IntentSender f324f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f325g;

    /* renamed from: h  reason: collision with root package name */
    public final int f326h;

    /* renamed from: i  reason: collision with root package name */
    public final int f327i;

    public static final class a implements Parcelable.Creator<h> {
        public final Object createFromParcel(Parcel parcel) {
            k.e(parcel, "inParcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            k.b(readParcelable);
            return new h((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new h[i8];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i8, int i9) {
        k.e(intentSender, "intentSender");
        this.f324f = intentSender;
        this.f325g = intent;
        this.f326h = i8;
        this.f327i = i9;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        parcel.writeParcelable(this.f324f, i8);
        parcel.writeParcelable(this.f325g, i8);
        parcel.writeInt(this.f326h);
        parcel.writeInt(this.f327i);
    }
}
