package i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f4790a;

    public a(Context context) {
        this.f4790a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f4790a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z8, int i8, Rect rect) {
    }
}
