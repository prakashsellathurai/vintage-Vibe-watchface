package v2;

import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p2.g;
import v2.n;

public final class c implements n<File, ByteBuffer> {

    public static final class a implements d<ByteBuffer> {

        /* renamed from: f  reason: collision with root package name */
        public final File f7851f;

        public a(File file) {
            this.f7851f = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(k3.a.a(this.f7851f));
            } catch (IOException e) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        public final n<File, ByteBuffer> b(r rVar) {
            return new c();
        }
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        File file = (File) obj;
        return new n.a(new j3.b(file), new a(file));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
