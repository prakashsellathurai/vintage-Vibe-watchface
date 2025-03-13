package v2;

import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p2.g;
import v2.n;

public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0146b<Data> f7848a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: v2.b$a$a  reason: collision with other inner class name */
        public class C0145a implements C0146b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0145a());
        }
    }

    /* renamed from: v2.b$b  reason: collision with other inner class name */
    public interface C0146b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f7849f;

        /* renamed from: g  reason: collision with root package name */
        public final C0146b<Data> f7850g;

        public c(byte[] bArr, C0146b<Data> bVar) {
            this.f7849f = bArr;
            this.f7850g = bVar;
        }

        public final Class<Data> a() {
            return this.f7850g.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super Data> aVar) {
            aVar.d(this.f7850g.b(this.f7849f));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0146b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(C0146b<Data> bVar) {
        this.f7848a = bVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new j3.b(bArr), new c(bArr, this.f7848a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
