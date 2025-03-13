package x6;

import e7.h;
import java.util.function.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8203b;

    public /* synthetic */ i(int i8, boolean z8) {
        this.f8202a = i8;
        this.f8203b = z8;
    }

    public final void accept(Object obj) {
        int i8 = this.f8202a;
        boolean z8 = this.f8203b;
        switch (i8) {
            case 0:
                ((f) obj).b(z8);
                return;
            default:
                ((h) obj).p(!z8);
                return;
        }
    }
}
