package s1;

import android.annotation.SuppressLint;
import android.app.ApplicationErrorReport;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.StringBuilderPrinter;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0120a();

    /* renamed from: f  reason: collision with root package name */
    public final ApplicationErrorReport.CrashInfo f7174f;

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    public class C0120a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(Parcel parcel) {
        this.f7174f = new ApplicationErrorReport.CrashInfo(parcel);
    }

    public a(Exception exc) {
        this.f7174f = new ApplicationErrorReport.CrashInfo(exc);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.f7174f.dump(new StringBuilderPrinter(sb), "");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        this.f7174f.writeToParcel(parcel, i8);
    }
}
