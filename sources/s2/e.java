package s2;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7175a;

    public /* synthetic */ e(int i8) {
        this.f7175a = i8;
    }

    public final String a() {
        switch (this.f7175a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    public final int b(Object obj) {
        switch (this.f7175a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int c() {
        switch (this.f7175a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final Object newArray(int i8) {
        switch (this.f7175a) {
            case 0:
                return new byte[i8];
            default:
                return new int[i8];
        }
    }
}
