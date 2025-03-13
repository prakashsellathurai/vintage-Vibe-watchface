package y2;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final e f8350a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final f f8351b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final d f8352c;

    /* renamed from: d  reason: collision with root package name */
    public static final p2.f<g> f8353d;
    public static final boolean e = true;

    public static class a extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            return 2;
        }

        public final float b(int i8, int i9, int i10, int i11) {
            int min = Math.min(i9 / i11, i8 / i10);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    public static class b extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            return 1;
        }

        public final float b(int i8, int i9, int i10, int i11) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i9) / ((float) i11), ((float) i8) / ((float) i10)));
            int i12 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i12 = 0;
            }
            return 1.0f / ((float) (max << i12));
        }
    }

    public static class c extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            if (b(i8, i9, i10, i11) == 1.0f) {
                return 2;
            }
            return g.f8350a.a(i8, i9, i10, i11);
        }

        public final float b(int i8, int i9, int i10, int i11) {
            return Math.min(1.0f, g.f8350a.b(i8, i9, i10, i11));
        }
    }

    public static class d extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            return 2;
        }

        public final float b(int i8, int i9, int i10, int i11) {
            return Math.max(((float) i10) / ((float) i8), ((float) i11) / ((float) i9));
        }
    }

    public static class e extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            return g.e ? 2 : 1;
        }

        public final float b(int i8, int i9, int i10, int i11) {
            if (g.e) {
                return Math.min(((float) i10) / ((float) i8), ((float) i11) / ((float) i9));
            }
            int max = Math.max(i9 / i11, i8 / i10);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class f extends g {
        public final int a(int i8, int i9, int i10, int i11) {
            return 2;
        }

        public final float b(int i8, int i9, int i10, int i11) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        new c();
        d dVar = new d();
        f8352c = dVar;
        f8353d = p2.f.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public abstract int a(int i8, int i9, int i10, int i11);

    public abstract float b(int i8, int i9, int i10, int i11);
}
