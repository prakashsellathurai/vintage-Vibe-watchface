package androidx.wear.watchface.style.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.util.ArrayList;
import java.util.List;
import k3.j;

@SuppressLint({"BanParcelableUsage"})
public class UserStyleSettingWireFormat implements d, Parcelable {
    public static final Parcelable.Creator<UserStyleSettingWireFormat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public String f2424f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2425g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f2426h;

    /* renamed from: i  reason: collision with root package name */
    public Icon f2427i;

    /* renamed from: j  reason: collision with root package name */
    public int f2428j;

    /* renamed from: k  reason: collision with root package name */
    public List<Integer> f2429k;

    /* renamed from: l  reason: collision with root package name */
    public List<OptionWireFormat> f2430l;

    /* renamed from: m  reason: collision with root package name */
    public List<Integer> f2431m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f2432n;

    /* renamed from: o  reason: collision with root package name */
    public List<Bundle> f2433o;

    public class a implements Parcelable.Creator<UserStyleSettingWireFormat> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserStyleSettingWireFormat) j.v(parcel.readParcelable(a.class.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new UserStyleSettingWireFormat[i8];
        }
    }

    public UserStyleSettingWireFormat() {
        this.f2424f = "";
        this.f2425g = "";
        this.f2426h = "";
        this.f2427i = null;
        this.f2430l = new ArrayList();
        this.f2431m = null;
        this.f2432n = null;
        this.f2433o = new ArrayList();
    }

    public UserStyleSettingWireFormat(String str, CharSequence charSequence, CharSequence charSequence2, Icon icon, ArrayList arrayList, int i8, ArrayList arrayList2, Bundle bundle, ArrayList arrayList3) {
        this.f2424f = "";
        this.f2425g = "";
        this.f2426h = "";
        this.f2427i = null;
        this.f2430l = new ArrayList();
        this.f2431m = null;
        this.f2432n = null;
        new ArrayList();
        this.f2424f = str;
        this.f2425g = charSequence;
        this.f2426h = charSequence2;
        this.f2427i = icon;
        this.f2430l = arrayList;
        this.f2428j = i8;
        this.f2429k = arrayList2;
        this.f2432n = bundle;
        this.f2433o = arrayList3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(new ParcelImpl((d) this), i8);
    }
}
