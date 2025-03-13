package o0;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public final int f5985h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5986i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutInflater f5987j;

    @Deprecated
    public c(Context context, int i8) {
        super(context);
        this.f5986i = i8;
        this.f5985h = i8;
        this.f5987j = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
