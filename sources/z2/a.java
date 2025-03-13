package z2;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f8685a;

    /* renamed from: z2.a$a  reason: collision with other inner class name */
    public static class C0159a implements e.a<ByteBuffer> {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f8685a = byteBuffer;
    }

    public final Object a() {
        ByteBuffer byteBuffer = this.f8685a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final void b() {
    }
}
