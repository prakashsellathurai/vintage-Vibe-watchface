package n2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5926a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f5927b;

    /* renamed from: c  reason: collision with root package name */
    public c f5928c;

    /* renamed from: d  reason: collision with root package name */
    public int f5929d = 0;

    public final boolean a() {
        return this.f5928c.f5917b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f5927b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f5928c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < 6; i8++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f5928c.f5917b = 1;
            } else {
                this.f5928c.f5920f = f();
                this.f5928c.f5921g = f();
                int c9 = c();
                c cVar = this.f5928c;
                cVar.f5922h = (c9 & 128) != 0;
                cVar.f5923i = (int) Math.pow(2.0d, (double) ((c9 & 7) + 1));
                this.f5928c.f5924j = c();
                c cVar2 = this.f5928c;
                c();
                cVar2.getClass();
                if (this.f5928c.f5922h && !a()) {
                    c cVar3 = this.f5928c;
                    cVar3.f5916a = e(cVar3.f5923i);
                    c cVar4 = this.f5928c;
                    cVar4.f5925k = cVar4.f5916a[cVar4.f5924j];
                }
            }
            if (!a()) {
                boolean z8 = false;
                while (!z8 && !a() && this.f5928c.f5918c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 == 33) {
                        int c11 = c();
                        if (c11 != 1) {
                            if (c11 == 249) {
                                this.f5928c.f5919d = new b();
                                c();
                                int c12 = c();
                                b bVar = this.f5928c.f5919d;
                                int i9 = (c12 & 28) >> 2;
                                bVar.f5911g = i9;
                                if (i9 == 0) {
                                    bVar.f5911g = 1;
                                }
                                bVar.f5910f = (c12 & 1) != 0;
                                int f9 = f();
                                if (f9 < 2) {
                                    f9 = 10;
                                }
                                b bVar2 = this.f5928c.f5919d;
                                bVar2.f5913i = f9 * 10;
                                bVar2.f5912h = c();
                                c();
                            } else if (c11 != 254 && c11 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                int i10 = 0;
                                while (true) {
                                    bArr = this.f5926a;
                                    if (i10 >= 11) {
                                        break;
                                    }
                                    sb2.append((char) bArr[i10]);
                                    i10++;
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        if (bArr[0] == 1) {
                                            byte b9 = bArr[1];
                                            byte b10 = bArr[2];
                                            this.f5928c.getClass();
                                        }
                                        if (this.f5929d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        h();
                    } else if (c10 == 44) {
                        c cVar5 = this.f5928c;
                        if (cVar5.f5919d == null) {
                            cVar5.f5919d = new b();
                        }
                        this.f5928c.f5919d.f5906a = f();
                        this.f5928c.f5919d.f5907b = f();
                        this.f5928c.f5919d.f5908c = f();
                        this.f5928c.f5919d.f5909d = f();
                        int c13 = c();
                        boolean z9 = (c13 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c13 & 7) + 1));
                        b bVar3 = this.f5928c.f5919d;
                        bVar3.e = (c13 & 64) != 0;
                        if (z9) {
                            bVar3.f5915k = e(pow);
                        } else {
                            bVar3.f5915k = null;
                        }
                        this.f5928c.f5919d.f5914j = this.f5927b.position();
                        c();
                        h();
                        if (!a()) {
                            c cVar6 = this.f5928c;
                            cVar6.f5918c++;
                            cVar6.e.add(cVar6.f5919d);
                        }
                    } else if (c10 != 59) {
                        this.f5928c.f5917b = 1;
                    } else {
                        z8 = true;
                    }
                }
                c cVar7 = this.f5928c;
                if (cVar7.f5918c < 0) {
                    cVar7.f5917b = 1;
                }
            }
            return this.f5928c;
        }
    }

    public final int c() {
        try {
            return this.f5927b.get() & 255;
        } catch (Exception unused) {
            this.f5928c.f5917b = 1;
            return 0;
        }
    }

    public final void d() {
        int c9 = c();
        this.f5929d = c9;
        if (c9 > 0) {
            int i8 = 0;
            while (true) {
                try {
                    int i9 = this.f5929d;
                    if (i8 < i9) {
                        int i10 = i9 - i8;
                        this.f5927b.get(this.f5926a, i8, i10);
                        i8 += i10;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.f5928c.f5917b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i8) {
        byte[] bArr = new byte[(i8 * 3)];
        int[] iArr = null;
        try {
            this.f5927b.get(bArr);
            iArr = new int[256];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                int i11 = i10 + 1;
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = i9 + 1;
                iArr[i9] = ((bArr[i10] & 255) << 16) | -16777216 | ((bArr[i11] & 255) << 8) | (bArr[i12] & 255);
                i10 = i13;
                i9 = i14;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f5928c.f5917b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f5927b.getShort();
    }

    public final void g(ByteBuffer byteBuffer) {
        this.f5927b = null;
        Arrays.fill(this.f5926a, (byte) 0);
        this.f5928c = new c();
        this.f5929d = 0;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f5927b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f5927b.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void h() {
        int c9;
        do {
            c9 = c();
            this.f5927b.position(Math.min(this.f5927b.position() + c9, this.f5927b.limit()));
        } while (c9 > 0);
    }
}
