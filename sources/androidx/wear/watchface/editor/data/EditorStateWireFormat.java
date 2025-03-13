package androidx.wear.watchface.editor.data;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public final class EditorStateWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<EditorStateWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public String f2402f;

    /* renamed from: g  reason: collision with root package name */
    public UserStyleWireFormat f2403g;

    /* renamed from: h  reason: collision with root package name */
    public List<IdAndComplicationDataWireFormat> f2404h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2405i;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f2406j;

    public class a implements Parcelable.Creator<EditorStateWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (EditorStateWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new EditorStateWireFormat[i8];
        }
    }

    public EditorStateWireFormat() {
    }

    public EditorStateWireFormat(String str, UserStyleWireFormat userStyleWireFormat, ArrayList arrayList, boolean z8, Bundle bundle) {
        this.f2402f = str;
        this.f2403g = userStyleWireFormat;
        this.f2404h = arrayList;
        this.f2405i = z8;
        this.f2406j = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
