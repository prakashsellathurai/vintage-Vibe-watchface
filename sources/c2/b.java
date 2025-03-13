package c2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import k2.c;
import y1.n;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f2648d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2649a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2650b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, n> f2651c;

    public b(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str.concat("/");
        }
        this.f2650b = str;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f2651c = new HashMap();
            this.f2649a = null;
            return;
        }
        this.f2649a = ((View) callback).getContext();
        this.f2651c = map;
    }
}
