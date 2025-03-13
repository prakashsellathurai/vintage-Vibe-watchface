package v2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p2.g;
import v2.n;

public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f7857a;

    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f7858a;

        public a(d<Data> dVar) {
            this.f7858a = dVar;
        }

        public final n<File, Data> b(r rVar) {
            return new e(this.f7858a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public final Object b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final void c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final File f7859f;

        /* renamed from: g  reason: collision with root package name */
        public final d<Data> f7860g;

        /* renamed from: h  reason: collision with root package name */
        public Data f7861h;

        public c(File file, d<Data> dVar) {
            this.f7859f = file;
            this.f7860g = dVar;
        }

        public final Class<Data> a() {
            return this.f7860g.a();
        }

        public final void b() {
            Data data = this.f7861h;
            if (data != null) {
                try {
                    this.f7860g.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super Data> aVar) {
            try {
                Data b9 = this.f7860g.b(this.f7859f);
                this.f7861h = b9;
                aVar.d(b9);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                aVar.c(e);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: v2.e$e  reason: collision with other inner class name */
    public static class C0147e extends a<InputStream> {

        /* renamed from: v2.e$e$a */
        public class a implements d<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(File file) {
                return new FileInputStream(file);
            }

            public final void c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C0147e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f7857a = dVar;
    }

    public final n.a a(Object obj, int i8, int i9, g gVar) {
        File file = (File) obj;
        return new n.a(new j3.b(file), new c(file, this.f7857a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
