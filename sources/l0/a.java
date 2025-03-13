package l0;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

public final class a {
    public static PathInterpolator a(float f9, float f10) {
        return new PathInterpolator(f9, f10);
    }

    public static PathInterpolator b(float f9, float f10, float f11, float f12) {
        return new PathInterpolator(f9, f10, f11, f12);
    }

    public static PathInterpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
