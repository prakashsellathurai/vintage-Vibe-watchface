package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0006a();

    /* renamed from: f  reason: collision with root package name */
    public final int f305f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f306g;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    public class C0006a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(Intent intent, int i8) {
        this.f305f = i8;
        this.f306g = intent;
    }

    public a(Parcel parcel) {
        this.f305f = parcel.readInt();
        this.f306g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i8 = this.f305f;
        sb.append(i8 != -1 ? i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f306g);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f305f);
        Intent intent = this.f306g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i8);
        }
    }
}
