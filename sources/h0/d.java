package h0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0061d f4729a = new C0061d((a) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final C0061d f4730b = new C0061d((a) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final C0061d f4731c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0061d f4732d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4733a = new a();

        public final int a(CharSequence charSequence, int i8) {
            int i9 = i8 + 0;
            int i10 = 2;
            for (int i11 = 0; i11 < i9 && i10 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                C0061d dVar = d.f4729a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i10 = 2;
                                break;
                        }
                    }
                    i10 = 0;
                }
                i10 = 1;
            }
            return i10;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i8);
    }

    public static abstract class c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final b f4734a;

        public c(a aVar) {
            this.f4734a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i8) {
            if (charSequence == null || i8 < 0 || charSequence.length() - i8 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f4734a;
            if (bVar == null) {
                return a();
            }
            int a9 = bVar.a(charSequence, i8);
            if (a9 == 0) {
                return true;
            }
            if (a9 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: h0.d$d  reason: collision with other inner class name */
    public static class C0061d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4735b;

        public C0061d(a aVar, boolean z8) {
            super(aVar);
            this.f4735b = z8;
        }

        public final boolean a() {
            return this.f4735b;
        }
    }

    static {
        a aVar = a.f4733a;
        f4731c = new C0061d(aVar, false);
        f4732d = new C0061d(aVar, true);
    }
}
