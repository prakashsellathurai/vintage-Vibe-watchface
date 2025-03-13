package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.a;
import q7.k;

public final class c extends a<Intent, a> {
    public final Intent a(Context context, Object obj) {
        Intent intent = (Intent) obj;
        k.e(context, "context");
        k.e(intent, "input");
        return intent;
    }

    public final Object c(Intent intent, int i8) {
        return new a(intent, i8);
    }
}
