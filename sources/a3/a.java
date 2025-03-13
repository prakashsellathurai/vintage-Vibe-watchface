package a3;

import a0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b0.b;
import j.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f166a = true;

    public static Drawable a(Context context, Context context2, int i8, Resources.Theme theme) {
        try {
            if (f166a) {
                return g.a.a(theme != null ? new b(context2, theme) : context2, i8);
            }
        } catch (NoClassDefFoundError unused) {
            f166a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = a0.a.f10a;
                return a.b.b(context2, i8);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        Object obj2 = b0.b.f2504a;
        return b.a.a(resources, i8, theme);
    }
}
