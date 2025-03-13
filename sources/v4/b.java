package v4;

import android.content.Context;
import android.util.TypedValue;

public final class b {
    public static TypedValue a(Context context, int i8) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i8, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int b(Context context, int i8, String str) {
        TypedValue a9 = a(context, i8);
        if (a9 != null) {
            return a9.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i8)}));
    }
}
