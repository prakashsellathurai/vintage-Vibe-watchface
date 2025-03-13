package androidx.appcompat.widget;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public int f729a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f730b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f731c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f732d = Integer.MIN_VALUE;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f733f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f734g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f735h = false;

    public final void a(int i8, int i9) {
        this.f731c = i8;
        this.f732d = i9;
        this.f735h = true;
        if (this.f734g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f729a = i9;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f730b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f729a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f730b = i9;
        }
    }
}
