package androidx.wear.watchface.complications.data;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class DefaultComplicationDataSourcePolicyWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<DefaultComplicationDataSourcePolicyWireFormat> CREATOR = new a();
    public List<ComponentName> mDefaultDataSourcesToTry;
    public int mDefaultType;
    public int mFallbackSystemDataSource;
    public int mPrimaryDataSourceDefaultType;
    public int mSecondaryDataSourceDefaultType;

    public class a implements Parcelable.Creator<DefaultComplicationDataSourcePolicyWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (DefaultComplicationDataSourcePolicyWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new DefaultComplicationDataSourcePolicyWireFormat[i8];
        }
    }

    public DefaultComplicationDataSourcePolicyWireFormat() {
    }

    public DefaultComplicationDataSourcePolicyWireFormat(List<ComponentName> list, int i8, int i9, int i10, int i11) {
        this.mDefaultDataSourcesToTry = list;
        this.mPrimaryDataSourceDefaultType = i10;
        this.mSecondaryDataSourceDefaultType = i11;
        this.mFallbackSystemDataSource = i8;
        this.mDefaultType = i9;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
