package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.Map;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class ComplicationOverlayWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<ComplicationOverlayWireFormat> CREATOR = new a();
    public static final int ENABLED_NO = 0;
    public static final int ENABLED_UNKNOWN = -1;
    public static final int ENABLED_YES = 1;
    public static final long NULL_ACCESSIBILITY_TRAVERSAL_INDEX = 4294967296L;
    long mAccessibilityTraversalIndex;
    public int mComplicationSlotId;
    public int mEnabled;
    public Map<Integer, RectF> mPerComplicationTypeBounds;

    public class a implements Parcelable.Creator<ComplicationOverlayWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (ComplicationOverlayWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new ComplicationOverlayWireFormat[i8];
        }
    }

    public ComplicationOverlayWireFormat() {
    }

    public ComplicationOverlayWireFormat(int i8, Boolean bool, Map<Integer, RectF> map, Integer num) {
        this.mComplicationSlotId = i8;
        this.mEnabled = bool != null ? bool.booleanValue() : -1;
        this.mPerComplicationTypeBounds = map;
        this.mAccessibilityTraversalIndex = num == null ? NULL_ACCESSIBILITY_TRAVERSAL_INDEX : (long) num.intValue();
    }

    public int describeContents() {
        return 0;
    }

    public Integer getAccessibilityTraversalIndex() {
        long j8 = this.mAccessibilityTraversalIndex;
        if (j8 == NULL_ACCESSIBILITY_TRAVERSAL_INDEX) {
            return null;
        }
        return Integer.valueOf((int) j8);
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
