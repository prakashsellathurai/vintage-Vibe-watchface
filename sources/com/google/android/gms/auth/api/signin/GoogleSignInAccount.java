package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.a;
import s3.c;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new m3.a();

    /* renamed from: f  reason: collision with root package name */
    public final int f3003f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3004g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3005h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3006i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3007j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f3008k;

    /* renamed from: l  reason: collision with root package name */
    public String f3009l;

    /* renamed from: m  reason: collision with root package name */
    public final long f3010m;

    /* renamed from: n  reason: collision with root package name */
    public final String f3011n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Scope> f3012o;

    /* renamed from: p  reason: collision with root package name */
    public final String f3013p;

    /* renamed from: q  reason: collision with root package name */
    public final String f3014q;
    public final HashSet r = new HashSet();

    public GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3003f = i8;
        this.f3004g = str;
        this.f3005h = str2;
        this.f3006i = str3;
        this.f3007j = str4;
        this.f3008k = uri;
        this.f3009l = str5;
        this.f3010m = j8;
        this.f3011n = str6;
        this.f3012o = arrayList;
        this.f3013p = str7;
        this.f3014q = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(1, jSONArray.getString(i8)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        if (!TextUtils.isEmpty(string)) {
            GoogleSignInAccount googleSignInAccount = r3;
            GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
            googleSignInAccount.f3009l = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
            return googleSignInAccount;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet(this.f3012o);
        hashSet.addAll(this.r);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f3011n.equals(this.f3011n) && googleSignInAccount.b().equals(b());
    }

    public final int hashCode() {
        return ((this.f3011n.hashCode() + 527) * 31) + b().hashCode();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f3003f);
        c.d(parcel, 2, this.f3004g);
        c.d(parcel, 3, this.f3005h);
        c.d(parcel, 4, this.f3006i);
        c.d(parcel, 5, this.f3007j);
        c.c(parcel, 6, this.f3008k, i8);
        c.d(parcel, 7, this.f3009l);
        parcel.writeInt(524296);
        parcel.writeLong(this.f3010m);
        c.d(parcel, 9, this.f3011n);
        c.f(parcel, 10, this.f3012o);
        c.d(parcel, 11, this.f3013p);
        c.d(parcel, 12, this.f3014q);
        c.h(parcel, g9);
    }
}
