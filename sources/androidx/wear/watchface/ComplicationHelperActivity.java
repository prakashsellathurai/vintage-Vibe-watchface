package androidx.wear.watchface;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Objects;

public final class ComplicationHelperActivity extends ComponentActivity {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f2236z = 0;

    /* renamed from: u  reason: collision with root package name */
    public ComponentName f2237u;

    /* renamed from: v  reason: collision with root package name */
    public int f2238v;
    public Bundle w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f2239x;
    public final a y = new a(this);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ComplicationHelperActivity f2240a;

        public a(ComplicationHelperActivity complicationHelperActivity) {
            this.f2240a = complicationHelperActivity;
        }

        public final void a() {
            ComplicationHelperActivity complicationHelperActivity = this.f2240a;
            ComponentName componentName = complicationHelperActivity.f2237u;
            int i8 = complicationHelperActivity.f2238v;
            int[] iArr = complicationHelperActivity.f2239x;
            Intent intent = new Intent("com.google.android.clockwork.home.complications.ACTION_CHOOSE_PROVIDER");
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
            intent.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", i8);
            intent.putExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES", iArr);
            Bundle bundle = new Bundle(complicationHelperActivity.w);
            bundle.putAll(intent.getExtras());
            intent.replaceExtras(bundle);
            int i9 = ComplicationHelperActivity.f2236z;
            complicationHelperActivity.startActivityForResult(intent, 6);
        }
    }

    public static Intent h(Context context, ComponentName componentName, Intent intent, Intent intent2) {
        Intent intent3 = new Intent(context, ComplicationHelperActivity.class);
        intent3.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
        intent3.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
        if (intent != null) {
            intent3.putExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_DENIED", intent);
        }
        if (intent2 != null) {
            intent3.putExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_RATIONALE", intent2);
        }
        return intent3;
    }

    public final void i(boolean z8) {
        boolean z9;
        int i8 = 1;
        boolean z10 = false;
        a aVar = this.y;
        if (z8 && aVar.f2240a.shouldShowRequestPermissionRationale("com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA")) {
            ComplicationHelperActivity complicationHelperActivity = aVar.f2240a;
            Intent intent = (Intent) complicationHelperActivity.getIntent().getParcelableExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_RATIONALE");
            if (intent != null) {
                complicationHelperActivity.startActivityForResult(intent, 5);
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return;
            }
        }
        Intent intent2 = getIntent();
        String action = intent2.getAction();
        Objects.requireNonNull(action);
        if (action.equals("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY")) {
            this.f2237u = (ComponentName) intent2.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
            ComplicationHelperActivity complicationHelperActivity2 = aVar.f2240a;
            if (!(a0.a.a(complicationHelperActivity2, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA_PRIVILEGED") == 0 || a0.a.a(complicationHelperActivity2, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA") == 0)) {
                i8 = 0;
            }
            if (i8 != 0) {
                finish();
                return;
            }
            z.a.b(aVar.f2240a, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, z8 ? 3 : 4);
        } else if (action.equals("android.support.wearable.complications.ACTION_START_PROVIDER_CHOOSER")) {
            this.f2237u = (ComponentName) intent2.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
            this.f2238v = intent2.getIntExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", 0);
            this.f2239x = intent2.getIntArrayExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES");
            Bundle extras = intent2.getExtras();
            extras.remove("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
            extras.remove("android.support.wearable.complications.EXTRA_COMPLICATION_ID");
            extras.remove("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES");
            this.w = extras;
            ComplicationHelperActivity complicationHelperActivity3 = aVar.f2240a;
            if (a0.a.a(complicationHelperActivity3, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA_PRIVILEGED") == 0 || a0.a.a(complicationHelperActivity3, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA") == 0) {
                z10 = true;
            }
            if (z10) {
                aVar.a();
                return;
            }
            if (!z8) {
                i8 = 2;
            }
            z.a.b(aVar.f2240a, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, i8);
        } else {
            throw new IllegalStateException("Unrecognised intent action.");
        }
    }

    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 5) {
            i(false);
        } else if (i8 == 6) {
            setResult(i9, intent);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i(true);
    }

    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        if (iArr.length == 0) {
            finish();
            return;
        }
        int i9 = iArr[0];
        a aVar = this.y;
        if (i9 == 0) {
            if (i8 == 1 || i8 == 2) {
                aVar.a();
            } else {
                finish();
            }
            aVar.getClass();
            Intent intent = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE_ALL_ACTIVE");
            intent.setPackage("com.google.android.wearable.app");
            ComplicationHelperActivity complicationHelperActivity = aVar.f2240a;
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT", complicationHelperActivity.f2237u);
            intent.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", PendingIntent.getActivity(complicationHelperActivity, 0, new Intent(""), 67108864));
            complicationHelperActivity.sendBroadcast(intent);
            return;
        }
        if (i8 == 1 || i8 == 3) {
            ComplicationHelperActivity complicationHelperActivity2 = aVar.f2240a;
            Intent intent2 = (Intent) complicationHelperActivity2.getIntent().getParcelableExtra("androidx.wear.watchface.complications.EXTRA_COMPLICATION_DENIED");
            if (intent2 != null) {
                complicationHelperActivity2.startActivity(intent2);
            }
        }
        finish();
    }
}
