package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

public final class e {
    public static int a(Context context, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId != 0 ? i8 : i9;
    }

    public static String b(TypedArray typedArray, int i8, int i9) {
        String string = typedArray.getString(i8);
        return string == null ? typedArray.getString(i9) : string;
    }
}
