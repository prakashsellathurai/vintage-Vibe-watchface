package c2;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.p;
import java.util.HashMap;
import k2.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final p f2644a = new p(2);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2645b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2646c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f2647d;
    public final String e = ".ttf";

    public a(Drawable.Callback callback) {
        AssetManager assetManager;
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            assetManager = null;
        } else {
            assetManager = ((View) callback).getContext().getAssets();
        }
        this.f2647d = assetManager;
    }
}
