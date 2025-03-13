package g6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import androidx.health.services.client.R;
import i6.e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4670a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4671b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4672c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4673d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4674f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4675g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4676h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4677i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4678j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4679k = null;

    /* renamed from: l  reason: collision with root package name */
    public final String f4680l = "0";

    /* renamed from: m  reason: collision with root package name */
    public final HashMap f4681m = new HashMap();

    public c(Context context, Context context2, e eVar, String str, LinkedHashMap linkedHashMap) {
        PackageInfo packageInfo;
        long j8;
        a aVar;
        String packageName = context2.getPackageName();
        this.f4670a = packageName;
        try {
            packageInfo = context2.getPackageManager().getPackageInfo(packageName, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f4671b = packageInfo.versionName;
            j8 = packageInfo.getLongVersionCode();
        } else {
            this.f4671b = null;
            j8 = -1;
        }
        this.f4672c = j8;
        int identifier = context2.getResources().getIdentifier("watchface_title", "string", this.f4670a);
        this.f4673d = identifier != 0 ? context2.getResources().getString(identifier) : "no_name";
        this.e = eVar.b("width").c(450);
        this.f4674f = eVar.b("height").c(450);
        String lowerCase = eVar.b("clipShape").e("CIRCLE").toLowerCase(Locale.getDefault());
        lowerCase.getClass();
        char c9 = 65535;
        switch (lowerCase.hashCode()) {
            case -894674659:
                if (lowerCase.equals("square")) {
                    c9 = 0;
                    break;
                }
                break;
            case 3387192:
                if (lowerCase.equals("none")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3496420:
                if (lowerCase.equals("rect")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1121299823:
                if (lowerCase.equals("rectangle")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 2:
            case 3:
                aVar = a.f4667h;
                break;
            case 1:
                aVar = a.f4665f;
                break;
            default:
                aVar = a.f4666g;
                break;
        }
        this.f4675g = aVar;
        this.f4676h = eVar.b("cornerRadiusX").b(0.0f);
        this.f4677i = eVar.b("cornerRadiusY").b(0.0f);
        this.f4678j = str;
        try {
            this.f4679k = context.getResources().getString(R.string.viewerVersion);
            this.f4680l = Integer.toString(context.getResources().getInteger(R.integer.viewerVersionCode));
        } catch (Resources.NotFoundException unused2) {
            Log.w("DWF:WatchFaceInfo", "No renderer version resource");
        }
        if (linkedHashMap != null) {
            this.f4681m.putAll(linkedHashMap);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = n6.c.f5960a;
        sb.append(str2);
        sb.append(str2);
        sb.append("########### DWF renderer " + this.f4679k + " (" + this.f4680l + ") ###########");
        sb.append(str2);
        sb.append("## " + this.f4673d + " / " + this.f4670a + " " + this.f4671b + " (" + this.f4672c + ")");
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder("## clipShape : ");
        a aVar = this.f4675g;
        sb2.append(aVar);
        if (aVar == a.f4667h) {
            str = " (" + this.f4676h + "," + this.f4677i + ")";
        } else {
            str = "";
        }
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append(str2);
        sb.append("## resolution : " + this.e + "x" + this.f4674f);
        sb.append(str2);
        StringBuilder sb3 = new StringBuilder("## clock type : ");
        sb3.append(this.f4678j);
        sb.append(sb3.toString());
        sb.append(str2);
        HashMap hashMap = this.f4681m;
        if (hashMap != null) {
            hashMap.forEach(new b(sb));
        }
        sb.append("############################################################");
        return sb.toString();
    }
}
