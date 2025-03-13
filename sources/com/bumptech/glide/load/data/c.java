package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import s2.b;

public final class c extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public final OutputStream f2979f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f2980g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2981h;

    /* renamed from: i  reason: collision with root package name */
    public int f2982i;

    public c(FileOutputStream fileOutputStream, b bVar) {
        this.f2979f = fileOutputStream;
        this.f2981h = bVar;
        this.f2980g = (byte[]) bVar.d(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        OutputStream outputStream = this.f2979f;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f2980g;
            if (bArr != null) {
                this.f2981h.c(bArr);
                this.f2980g = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i8 = this.f2982i;
        OutputStream outputStream = this.f2979f;
        if (i8 > 0) {
            outputStream.write(this.f2980g, 0, i8);
            this.f2982i = 0;
        }
        outputStream.flush();
    }

    public final void write(int i8) {
        byte[] bArr = this.f2980g;
        int i9 = this.f2982i;
        int i10 = i9 + 1;
        this.f2982i = i10;
        bArr[i9] = (byte) i8;
        if (i10 == bArr.length && i10 > 0) {
            this.f2979f.write(bArr, 0, i10);
            this.f2982i = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        do {
            int i11 = i9 - i10;
            int i12 = i8 + i10;
            int i13 = this.f2982i;
            OutputStream outputStream = this.f2979f;
            if (i13 != 0 || i11 < this.f2980g.length) {
                int min = Math.min(i11, this.f2980g.length - i13);
                System.arraycopy(bArr, i12, this.f2980g, this.f2982i, min);
                int i14 = this.f2982i + min;
                this.f2982i = i14;
                i10 += min;
                byte[] bArr2 = this.f2980g;
                if (i14 == bArr2.length && i14 > 0) {
                    outputStream.write(bArr2, 0, i14);
                    this.f2982i = 0;
                    continue;
                }
            } else {
                outputStream.write(bArr, i12, i11);
                return;
            }
        } while (i10 < i9);
    }
}
