package o5;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f6117d = Uri.parse("content://com.samsung.android.watch.watchface.companionhelper.stylizertutorial.provider/settings");

    /* renamed from: a  reason: collision with root package name */
    public final Context f6118a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f6119b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6120c = false;

    public a(Context context) {
        this.f6118a = context;
        this.f6119b = context.getSharedPreferences("pref_tutorial_local_storage", 0);
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f6119b.edit();
        edit.putBoolean("pref_key_tutorial_key", true);
        edit.apply();
        ContentValues contentValues = new ContentValues();
        contentValues.put("settingVal", Boolean.TRUE);
        int update = this.f6118a.getContentResolver().update(f6117d, contentValues, (String) null, (String[]) null);
        Log.i("DWF:TutorialStatusCheck", "setting value updated to : true result = " + update);
    }
}
