package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.g;
import androidx.health.services.client.R;

public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f356a;

    /* renamed from: b  reason: collision with root package name */
    public Context f357b;

    /* renamed from: c  reason: collision with root package name */
    public d f358c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f359d;
    public g.a e;

    /* renamed from: f  reason: collision with root package name */
    public final int f360f = R.layout.abc_action_menu_item_layout;

    /* renamed from: g  reason: collision with root package name */
    public h f361g;

    public a(Context context) {
        this.f356a = context;
        this.f359d = LayoutInflater.from(context);
    }

    public final boolean b(e eVar) {
        return false;
    }

    public final void j(g.a aVar) {
        this.e = aVar;
    }

    public final boolean k(e eVar) {
        return false;
    }
}
