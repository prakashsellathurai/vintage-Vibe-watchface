package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class b extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f4882a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f4883b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f4884c;

    /* renamed from: d  reason: collision with root package name */
    public Resources f4885d;

    public b() {
        super((Context) null);
    }

    public b(Context context, int i8) {
        super(context);
        this.f4882a = i8;
    }

    public b(Context context, Resources.Theme theme) {
        super(context);
        this.f4883b = theme;
    }

    public final void a() {
        if (this.f4883b == null) {
            this.f4883b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4883b.setTo(theme);
            }
        }
        this.f4883b.applyStyle(this.f4882a, true);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.f4885d == null) {
            this.f4885d = super.getResources();
        }
        return this.f4885d;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4884c == null) {
            this.f4884c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4884c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4883b;
        if (theme != null) {
            return theme;
        }
        if (this.f4882a == 0) {
            this.f4882a = -2146303566;
        }
        a();
        return this.f4883b;
    }

    public final void setTheme(int i8) {
        if (this.f4882a != i8) {
            this.f4882a = i8;
            a();
        }
    }
}
