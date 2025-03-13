package y2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class t extends MediaDataSource {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f8401f;

    public t(ByteBuffer byteBuffer) {
        this.f8401f = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f8401f.limit();
    }

    public final int readAt(long j8, byte[] bArr, int i8, int i9) {
        ByteBuffer byteBuffer = this.f8401f;
        if (j8 >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j8);
        int min = Math.min(i9, byteBuffer.remaining());
        byteBuffer.get(bArr, i8, min);
        return min;
    }
}
