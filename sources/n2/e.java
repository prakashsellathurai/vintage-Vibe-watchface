package n2;

import android.graphics.Bitmap;
import android.util.Log;
import b3.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import n2.a;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5930a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5931b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0094a f5932c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f5933d;
    public byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f5934f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5935g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5936h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f5937i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f5938j;

    /* renamed from: k  reason: collision with root package name */
    public int f5939k;

    /* renamed from: l  reason: collision with root package name */
    public c f5940l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f5941m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5942n;

    /* renamed from: o  reason: collision with root package name */
    public int f5943o;

    /* renamed from: p  reason: collision with root package name */
    public int f5944p;

    /* renamed from: q  reason: collision with root package name */
    public int f5945q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f5946s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f5947t = Bitmap.Config.ARGB_8888;

    public e(b bVar) {
        this.f5932c = bVar;
        this.f5940l = new c();
    }

    public final ByteBuffer a() {
        return this.f5933d;
    }

    public final int b() {
        return this.f5939k;
    }

    public final synchronized Bitmap c() {
        if (this.f5940l.f5918c <= 0 || this.f5939k < 0) {
            if (Log.isLoggable("e", 3)) {
                int i8 = this.f5940l.f5918c;
            }
            this.f5943o = 1;
        }
        int i9 = this.f5943o;
        if (i9 != 1) {
            if (i9 != 2) {
                this.f5943o = 0;
                if (this.e == null) {
                    s2.b bVar = ((b) this.f5932c).f2564b;
                    this.e = bVar == null ? new byte[255] : (byte[]) bVar.d(255, byte[].class);
                }
                b bVar2 = (b) this.f5940l.e.get(this.f5939k);
                int i10 = this.f5939k - 1;
                b bVar3 = i10 >= 0 ? (b) this.f5940l.e.get(i10) : null;
                int[] iArr = bVar2.f5915k;
                if (iArr == null) {
                    iArr = this.f5940l.f5916a;
                }
                this.f5930a = iArr;
                if (iArr == null) {
                    Log.isLoggable("e", 3);
                    this.f5943o = 1;
                    return null;
                }
                if (bVar2.f5910f) {
                    System.arraycopy(iArr, 0, this.f5931b, 0, iArr.length);
                    int[] iArr2 = this.f5931b;
                    this.f5930a = iArr2;
                    iArr2[bVar2.f5912h] = 0;
                    if (bVar2.f5911g == 2 && this.f5939k == 0) {
                        this.f5946s = Boolean.TRUE;
                    }
                }
                return o(bVar2, bVar3);
            }
        }
        Log.isLoggable("e", 3);
        return null;
    }

    public final void clear() {
        s2.b bVar;
        s2.b bVar2;
        s2.b bVar3;
        this.f5940l = null;
        byte[] bArr = this.f5937i;
        a.C0094a aVar = this.f5932c;
        if (!(bArr == null || (bVar3 = ((b) aVar).f2564b) == null)) {
            bVar3.c(bArr);
        }
        int[] iArr = this.f5938j;
        if (!(iArr == null || (bVar2 = ((b) aVar).f2564b) == null)) {
            bVar2.c(iArr);
        }
        Bitmap bitmap = this.f5941m;
        if (bitmap != null) {
            ((b) aVar).f2563a.e(bitmap);
        }
        this.f5941m = null;
        this.f5933d = null;
        this.f5946s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null && (bVar = ((b) aVar).f2564b) != null) {
            bVar.c(bArr2);
        }
    }

    public final void d() {
        this.f5939k = (this.f5939k + 1) % this.f5940l.f5918c;
    }

    public final int e() {
        return this.f5940l.f5921g;
    }

    public final int f() {
        return this.f5940l.f5918c;
    }

    public final int g() {
        int i8;
        if (this.f5940l.f5918c <= 0 || (i8 = this.f5939k) < 0) {
            return 0;
        }
        return i(i8);
    }

    public final int h() {
        return this.f5933d.limit() + this.f5937i.length + (this.f5938j.length * 4);
    }

    public final int i(int i8) {
        if (i8 >= 0) {
            c cVar = this.f5940l;
            if (i8 < cVar.f5918c) {
                return ((b) cVar.e.get(i8)).f5913i;
            }
        }
        return -1;
    }

    public final int j() {
        return this.f5940l.f5920f;
    }

    public final void k() {
        this.f5939k = -1;
    }

    public final Bitmap l() {
        Boolean bool = this.f5946s;
        Bitmap c9 = ((b) this.f5932c).f2563a.c(this.r, this.f5945q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f5947t);
        c9.setHasAlpha(true);
        return c9;
    }

    public final synchronized void m(c cVar, ByteBuffer byteBuffer, int i8) {
        if (i8 > 0) {
            try {
                int highestOneBit = Integer.highestOneBit(i8);
                this.f5943o = 0;
                this.f5940l = cVar;
                this.f5939k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f5933d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f5933d.order(ByteOrder.LITTLE_ENDIAN);
                this.f5942n = false;
                Iterator it = cVar.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f5911g == 3) {
                            this.f5942n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f5944p = highestOneBit;
                int i9 = cVar.f5920f;
                this.r = i9 / highestOneBit;
                int i10 = cVar.f5921g;
                this.f5945q = i10 / highestOneBit;
                int i11 = i9 * i10;
                s2.b bVar = ((b) this.f5932c).f2564b;
                this.f5937i = bVar == null ? new byte[i11] : (byte[]) bVar.d(i11, byte[].class);
                a.C0094a aVar = this.f5932c;
                int i12 = this.r * this.f5945q;
                s2.b bVar2 = ((b) aVar).f2564b;
                this.f5938j = bVar2 == null ? new int[i12] : (int[]) bVar2.d(i12, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i8);
        }
    }

    public final void n(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f5947t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r3.f5924j == r1.f5912h) goto L_0x0048;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap o(n2.b r36, n2.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f5938j
            n2.a$a r11 = r0.f5932c
            r12 = 0
            if (r2 != 0) goto L_0x001f
            android.graphics.Bitmap r3 = r0.f5941m
            if (r3 == 0) goto L_0x0019
            r4 = r11
            b3.b r4 = (b3.b) r4
            s2.c r4 = r4.f2563a
            r4.e(r3)
        L_0x0019:
            r3 = 0
            r0.f5941m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001f:
            r13 = 3
            if (r2 == 0) goto L_0x002d
            int r3 = r2.f5911g
            if (r3 != r13) goto L_0x002d
            android.graphics.Bitmap r3 = r0.f5941m
            if (r3 != 0) goto L_0x002d
            java.util.Arrays.fill(r10, r12)
        L_0x002d:
            r14 = 2
            if (r2 == 0) goto L_0x007f
            int r3 = r2.f5911g
            if (r3 <= 0) goto L_0x007f
            if (r3 != r14) goto L_0x006d
            boolean r3 = r1.f5910f
            if (r3 != 0) goto L_0x0048
            n2.c r3 = r0.f5940l
            int r4 = r3.f5925k
            int[] r5 = r1.f5915k
            if (r5 == 0) goto L_0x0049
            int r3 = r3.f5924j
            int r5 = r1.f5912h
            if (r3 != r5) goto L_0x0049
        L_0x0048:
            r4 = r12
        L_0x0049:
            int r3 = r2.f5909d
            int r5 = r0.f5944p
            int r3 = r3 / r5
            int r6 = r2.f5907b
            int r6 = r6 / r5
            int r7 = r2.f5908c
            int r7 = r7 / r5
            int r2 = r2.f5906a
            int r2 = r2 / r5
            int r5 = r0.r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005d:
            if (r6 >= r3) goto L_0x007f
            int r2 = r6 + r7
            r5 = r6
        L_0x0062:
            if (r5 >= r2) goto L_0x0069
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0069:
            int r2 = r0.r
            int r6 = r6 + r2
            goto L_0x005d
        L_0x006d:
            if (r3 != r13) goto L_0x007f
            android.graphics.Bitmap r2 = r0.f5941m
            if (r2 == 0) goto L_0x007f
            r4 = 0
            int r8 = r0.r
            r6 = 0
            r7 = 0
            int r9 = r0.f5945q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007f:
            java.nio.ByteBuffer r2 = r0.f5933d
            int r3 = r1.f5914j
            r2.position(r3)
            int r2 = r1.f5908c
            int r3 = r1.f5909d
            int r2 = r2 * r3
            byte[] r3 = r0.f5937i
            if (r3 == 0) goto L_0x0092
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a5
        L_0x0092:
            b3.b r11 = (b3.b) r11
            s2.b r3 = r11.f2564b
            if (r3 != 0) goto L_0x009b
            byte[] r3 = new byte[r2]
            goto L_0x00a3
        L_0x009b:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.d(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a3:
            r0.f5937i = r3
        L_0x00a5:
            byte[] r3 = r0.f5937i
            short[] r4 = r0.f5934f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b1
            short[] r4 = new short[r5]
            r0.f5934f = r4
        L_0x00b1:
            short[] r4 = r0.f5934f
            byte[] r6 = r0.f5935g
            if (r6 != 0) goto L_0x00bb
            byte[] r6 = new byte[r5]
            r0.f5935g = r6
        L_0x00bb:
            byte[] r6 = r0.f5935g
            byte[] r7 = r0.f5936h
            if (r7 != 0) goto L_0x00c7
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f5936h = r7
        L_0x00c7:
            byte[] r7 = r0.f5936h
            java.nio.ByteBuffer r8 = r0.f5933d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r14 = -1
            int r17 = r17 + -1
            r5 = r12
        L_0x00df:
            if (r5 >= r11) goto L_0x00ea
            r4[r5] = r12
            byte r14 = (byte) r5
            r6[r5] = r14
            int r5 = r5 + 1
            r14 = -1
            goto L_0x00df
        L_0x00ea:
            byte[] r5 = r0.e
            r13 = r0
            r26 = r8
            r9 = r12
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r14 = -1
        L_0x0103:
            r30 = 8
            if (r9 >= r2) goto L_0x01fe
            if (r21 != 0) goto L_0x0141
            java.nio.ByteBuffer r12 = r0.f5933d
            byte r12 = r12.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            r31 = r8
            if (r12 > 0) goto L_0x011c
            r32 = r9
            r34 = r10
            r33 = r14
            goto L_0x0132
        L_0x011c:
            java.nio.ByteBuffer r8 = r13.f5933d
            r32 = r9
            byte[] r9 = r13.e
            r33 = r14
            int r14 = r8.remaining()
            int r14 = java.lang.Math.min(r12, r14)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r14)
        L_0x0132:
            if (r12 > 0) goto L_0x013c
            r8 = 3
            r13.f5943o = r8
            r12 = r20
            r10 = 0
            goto L_0x0203
        L_0x013c:
            r21 = r12
            r22 = 0
            goto L_0x0149
        L_0x0141:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r14
        L_0x0149:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r12 = r25
            r8 = r26
            r9 = r32
            r14 = r33
            r23 = r5
            r5 = r27
        L_0x0167:
            if (r10 < r8) goto L_0x01ea
            r25 = r13
            r13 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r13 != r11) goto L_0x0183
            r26 = r10
            r12 = r16
            r28 = r17
            r13 = r25
            r8 = r31
            r14 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e4
        L_0x0183:
            if (r13 != r15) goto L_0x018d
            r27 = r5
            r13 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01ef
        L_0x018d:
            r26 = r10
            r10 = -1
            if (r14 != r10) goto L_0x01a0
            byte r5 = r6[r13]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r13
            r14 = r5
            r10 = r26
            r13 = r0
            goto L_0x0167
        L_0x01a0:
            if (r13 < r12) goto L_0x01a9
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r14
            goto L_0x01aa
        L_0x01a9:
            r5 = r13
        L_0x01aa:
            if (r5 < r11) goto L_0x01b5
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01aa
        L_0x01b5:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01bc:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01cb
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01bc
        L_0x01cb:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r12 >= r5) goto L_0x01e2
            short r14 = (short) r14
            r4[r12] = r14
            r6[r12] = r10
            int r12 = r12 + 1
            r10 = r12 & r28
            if (r10 != 0) goto L_0x01e2
            if (r12 >= r5) goto L_0x01e2
            int r8 = r8 + 1
            int r28 = r28 + r12
        L_0x01e2:
            r14 = r13
            r13 = r0
        L_0x01e4:
            r5 = r25
            r10 = r26
            goto L_0x0167
        L_0x01ea:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r13 = r0
        L_0x01ef:
            r26 = r8
            r25 = r12
            r5 = r23
            r8 = r31
            r12 = 0
            r23 = r10
            r10 = r34
            goto L_0x0103
        L_0x01fe:
            r34 = r10
            r10 = r12
            r12 = r20
        L_0x0203:
            java.util.Arrays.fill(r3, r12, r2, r10)
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x027b
            int r2 = r0.f5944p
            r3 = 1
            if (r2 == r3) goto L_0x0211
            goto L_0x027b
        L_0x0211:
            int[] r2 = r0.f5938j
            int r3 = r1.f5909d
            int r4 = r1.f5907b
            int r5 = r1.f5908c
            int r6 = r1.f5906a
            int r7 = r0.f5939k
            if (r7 != 0) goto L_0x0221
            r7 = 1
            goto L_0x0222
        L_0x0221:
            r7 = r10
        L_0x0222:
            int r8 = r0.r
            byte[] r9 = r0.f5937i
            int[] r11 = r0.f5930a
            r13 = r10
            r12 = -1
        L_0x022a:
            if (r13 >= r3) goto L_0x025d
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0237
            r10 = r14
        L_0x0237:
            int r14 = r1.f5908c
            int r14 = r14 * r13
        L_0x023a:
            r16 = r3
            if (r15 >= r10) goto L_0x0257
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x024e
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024d
            r2[r15] = r4
            goto L_0x024e
        L_0x024d:
            r12 = r3
        L_0x024e:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023a
        L_0x0257:
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x022a
        L_0x025d:
            java.lang.Boolean r2 = r0.f5946s
            if (r2 == 0) goto L_0x0267
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0270
        L_0x0267:
            java.lang.Boolean r2 = r0.f5946s
            if (r2 != 0) goto L_0x0272
            if (r7 == 0) goto L_0x0272
            r2 = -1
            if (r12 == r2) goto L_0x0272
        L_0x0270:
            r12 = 1
            goto L_0x0273
        L_0x0272:
            r12 = 0
        L_0x0273:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f5946s = r2
            goto L_0x0404
        L_0x027b:
            int[] r2 = r0.f5938j
            int r3 = r1.f5909d
            int r4 = r0.f5944p
            int r3 = r3 / r4
            int r5 = r1.f5907b
            int r5 = r5 / r4
            int r6 = r1.f5908c
            int r6 = r6 / r4
            int r7 = r1.f5906a
            int r7 = r7 / r4
            int r8 = r0.f5939k
            if (r8 != 0) goto L_0x0291
            r10 = 1
            goto L_0x0292
        L_0x0291:
            r10 = 0
        L_0x0292:
            int r8 = r0.r
            int r9 = r0.f5945q
            byte[] r11 = r0.f5937i
            int[] r12 = r0.f5930a
            java.lang.Boolean r13 = r0.f5946s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a3:
            r37 = r14
            if (r13 >= r3) goto L_0x03f2
            boolean r14 = r1.e
            if (r14 == 0) goto L_0x02d2
            if (r15 < r3) goto L_0x02cd
            int r14 = r16 + 1
            r18 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c8
            r3 = 3
            if (r14 == r3) goto L_0x02c1
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02bd
            goto L_0x02cf
        L_0x02bd:
            r15 = 1
            r17 = 2
            goto L_0x02cf
        L_0x02c1:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02cf
        L_0x02c8:
            r3 = 4
            r15 = r3
            r16 = r14
            goto L_0x02cf
        L_0x02cd:
            r18 = r3
        L_0x02cf:
            int r3 = r15 + r17
            goto L_0x02d6
        L_0x02d2:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02d6:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02dc
            r14 = 1
            goto L_0x02dd
        L_0x02dc:
            r14 = 0
        L_0x02dd:
            if (r15 >= r9) goto L_0x03d2
            int r15 = r15 * r8
            int r20 = r15 + r7
            r21 = r3
            int r3 = r20 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02ea
            r3 = r15
        L_0x02ea:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f5908c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0313
            r14 = r37
            r5 = r20
        L_0x02f7:
            r23 = r6
            if (r5 >= r3) goto L_0x03cb
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0306
            r2[r5] = r6
            goto L_0x030d
        L_0x0306:
            if (r10 == 0) goto L_0x030d
            if (r14 != 0) goto L_0x030d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030d:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f7
        L_0x0313:
            r23 = r6
            int r5 = r3 - r20
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r20
        L_0x031d:
            if (r6 >= r3) goto L_0x03cb
            r20 = r3
            int r3 = r1.f5908c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0332:
            int r8 = r0.f5944p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0367
            byte[] r8 = r0.f5937i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0369
            if (r7 >= r5) goto L_0x0369
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f5930a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0362
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0362:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0332
        L_0x0367:
            r32 = r9
        L_0x0369:
            int r3 = r3 + r15
            r7 = r3
        L_0x036b:
            int r8 = r0.f5944p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039c
            byte[] r8 = r0.f5937i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039c
            if (r7 >= r5) goto L_0x039c
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f5930a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0399
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0399:
            int r7 = r7 + 1
            goto L_0x036b
        L_0x039c:
            if (r28 != 0) goto L_0x03a0
            r3 = 0
            goto L_0x03b2
        L_0x03a0:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b2:
            if (r3 == 0) goto L_0x03b7
            r2[r6] = r3
            goto L_0x03be
        L_0x03b7:
            if (r10 == 0) goto L_0x03be
            if (r14 != 0) goto L_0x03be
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03be:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r20
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x031d
        L_0x03cb:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e0
        L_0x03d2:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e0:
            int r13 = r13 + 1
            r3 = r18
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a3
        L_0x03f2:
            java.lang.Boolean r2 = r0.f5946s
            if (r2 != 0) goto L_0x0404
            if (r37 != 0) goto L_0x03fa
            r12 = 0
            goto L_0x03fe
        L_0x03fa:
            boolean r12 = r37.booleanValue()
        L_0x03fe:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f5946s = r2
        L_0x0404:
            boolean r2 = r0.f5942n
            if (r2 == 0) goto L_0x0428
            int r1 = r1.f5911g
            if (r1 == 0) goto L_0x040f
            r2 = 1
            if (r1 != r2) goto L_0x0428
        L_0x040f:
            android.graphics.Bitmap r1 = r0.f5941m
            if (r1 != 0) goto L_0x0419
            android.graphics.Bitmap r1 = r35.l()
            r0.f5941m = r1
        L_0x0419:
            android.graphics.Bitmap r1 = r0.f5941m
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.f5945q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0428:
            android.graphics.Bitmap r8 = r35.l()
            r2 = 0
            int r6 = r0.r
            r4 = 0
            r5 = 0
            int r7 = r0.f5945q
            r0 = r8
            r1 = r34
            r3 = r6
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.e.o(n2.b, n2.b):android.graphics.Bitmap");
    }
}
