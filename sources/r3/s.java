package r3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.health.services.client.R;
import java.util.Locale;
import p.f;
import v3.a;
import w3.b;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String, String> f7028a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f7029b;

    public static String a(Context context, int i8) {
        String str;
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i8);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String b(Context context, int i8) {
        Resources resources = context.getResources();
        String c9 = c(context);
        if (i8 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{c9});
        } else if (i8 == 2) {
            a.a(context);
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{c9});
        } else if (i8 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{c9});
        } else if (i8 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", c9);
        } else {
            if (i8 == 7) {
                return d(context, "common_google_play_services_network_error_text", c9);
            }
            if (i8 == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{c9});
            } else if (i8 == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", c9);
            } else {
                switch (i8) {
                    case 16:
                        return d(context, "common_google_play_services_api_unavailable_text", c9);
                    case 17:
                        return d(context, "common_google_play_services_sign_in_failed_text", c9);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{c9});
                    default:
                        return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{c9});
                }
            }
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = b.a(context).f8008a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        Resources resources;
        f<String, String> fVar = f7028a;
        synchronized (fVar) {
            Locale locale = f0.b.a(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f7029b)) {
                fVar.clear();
                f7029b = locale;
            }
            String orDefault = fVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i8 = o3.f.f6092c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            f7028a.put(str, string);
            return string;
        }
    }
}
