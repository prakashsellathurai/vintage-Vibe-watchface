package g8;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4703a;

    /* renamed from: b  reason: collision with root package name */
    public int f4704b;

    /* renamed from: c  reason: collision with root package name */
    public int f4705c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4706d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public j f4707f;

    /* renamed from: g  reason: collision with root package name */
    public j f4708g;

    public j() {
        this.f4703a = new byte[8192];
        this.e = true;
        this.f4706d = false;
    }

    public j(byte[] bArr, int i8, int i9) {
        this.f4703a = bArr;
        this.f4704b = i8;
        this.f4705c = i9;
        this.f4706d = true;
        this.e = false;
    }

    public final j a() {
        j jVar = this.f4707f;
        j jVar2 = jVar != this ? jVar : null;
        j jVar3 = this.f4708g;
        jVar3.f4707f = jVar;
        this.f4707f.f4708g = jVar3;
        this.f4707f = null;
        this.f4708g = null;
        return jVar2;
    }

    public final void b(j jVar) {
        jVar.f4708g = this;
        jVar.f4707f = this.f4707f;
        this.f4707f.f4708g = jVar;
        this.f4707f = jVar;
    }

    public final j c() {
        this.f4706d = true;
        return new j(this.f4703a, this.f4704b, this.f4705c);
    }

    public final void d(j jVar, int i8) {
        if (jVar.e) {
            int i9 = jVar.f4705c;
            int i10 = i9 + i8;
            byte[] bArr = jVar.f4703a;
            if (i10 > 8192) {
                if (!jVar.f4706d) {
                    int i11 = jVar.f4704b;
                    if ((i9 + i8) - i11 <= 8192) {
                        System.arraycopy(bArr, i11, bArr, 0, i9 - i11);
                        jVar.f4705c -= jVar.f4704b;
                        jVar.f4704b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f4703a, this.f4704b, bArr, jVar.f4705c, i8);
            jVar.f4705c += i8;
            this.f4704b += i8;
            return;
        }
        throw new IllegalArgumentException();
    }
}
