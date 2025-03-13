package g8;

import java.io.IOException;
import java.io.InputStream;

public final class h extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f4699f;

    public h(i iVar) {
        this.f4699f = iVar;
    }

    public final int available() {
        i iVar = this.f4699f;
        if (!iVar.f4702h) {
            return (int) Math.min(iVar.f4700f.f4683g, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f4699f.close();
    }

    public final int read() {
        i iVar = this.f4699f;
        if (!iVar.f4702h) {
            a aVar = iVar.f4700f;
            if (aVar.f4683g == 0 && iVar.f4701g.y(aVar, 8192) == -1) {
                return -1;
            }
            return iVar.f4700f.d() & 255;
        }
        throw new IOException("closed");
    }

    public final int read(byte[] bArr, int i8, int i9) {
        i iVar = this.f4699f;
        if (!iVar.f4702h) {
            n.a((long) bArr.length, (long) i8, (long) i9);
            a aVar = iVar.f4700f;
            if (aVar.f4683g == 0 && iVar.f4701g.y(aVar, 8192) == -1) {
                return -1;
            }
            return iVar.f4700f.read(bArr, i8, i9);
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f4699f + ".inputStream()";
    }
}
