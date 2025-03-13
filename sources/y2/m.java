package y2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.List;

public interface m {

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final j f8374a;

        /* renamed from: b  reason: collision with root package name */
        public final s2.b f8375b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f8376c;

        public a(s2.b bVar, InputStream inputStream, List list) {
            k3.j.l(bVar);
            this.f8375b = bVar;
            k3.j.l(list);
            this.f8376c = list;
            this.f8374a = new j(inputStream, bVar);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            o oVar = this.f8374a.f2997a;
            oVar.reset();
            return BitmapFactory.decodeStream(oVar, (Rect) null, options);
        }

        public final void b() {
            o oVar = this.f8374a.f2997a;
            synchronized (oVar) {
                oVar.f8383h = oVar.f8381f.length;
            }
        }

        public final int c() {
            o oVar = this.f8374a.f2997a;
            oVar.reset();
            return com.bumptech.glide.load.a.a(this.f8375b, oVar, this.f8376c);
        }

        public final ImageHeaderParser.ImageType d() {
            o oVar = this.f8374a.f2997a;
            oVar.reset();
            return com.bumptech.glide.load.a.b(this.f8375b, oVar, this.f8376c);
        }
    }

    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public final s2.b f8377a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f8378b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f8379c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, s2.b bVar) {
            k3.j.l(bVar);
            this.f8377a = bVar;
            k3.j.l(list);
            this.f8378b = list;
            this.f8379c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f8379c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c() {
            /*
                r9 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r9.f8379c
                s2.b r1 = r9.f8377a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r9 = r9.f8378b
                int r2 = r9.size()
                r3 = 0
            L_0x000b:
                r4 = -1
                if (r3 >= r2) goto L_0x0044
                java.lang.Object r5 = r9.get(r3)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                y2.o r6 = new y2.o     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r1)     // Catch:{ all -> 0x0039 }
                int r5 = r5.b(r6, r1)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r0.a()
                if (r5 == r4) goto L_0x0034
                r4 = r5
                goto L_0x0044
            L_0x0034:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x0037:
                r9 = move-exception
                goto L_0x003b
            L_0x0039:
                r9 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r9
            L_0x0044:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.m.b.c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType d() {
            /*
                r8 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r8.f8379c
                s2.b r1 = r8.f8377a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r8 = r8.f8378b
                int r2 = r8.size()
                r3 = 0
            L_0x000b:
                if (r3 >= r2) goto L_0x0044
                java.lang.Object r4 = r8.get(r3)
                com.bumptech.glide.load.ImageHeaderParser r4 = (com.bumptech.glide.load.ImageHeaderParser) r4
                y2.o r5 = new y2.o     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r7 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r7 = r7.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r6.<init>(r7)     // Catch:{ all -> 0x0039 }
                r5.<init>(r6, r1)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = r4.c(r5)     // Catch:{ all -> 0x0037 }
                r5.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r0.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r4 == r5) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x0037:
                r8 = move-exception
                goto L_0x003b
            L_0x0039:
                r8 = move-exception
                r5 = 0
            L_0x003b:
                if (r5 == 0) goto L_0x0040
                r5.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r8
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.m.b.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
