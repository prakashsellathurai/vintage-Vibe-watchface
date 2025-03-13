package y2;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p2.f;
import p2.i;
import r2.v;

public final class s<T> implements i<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final p2.f<Long> f8394d = new p2.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final p2.f<Integer> e = new p2.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f8395f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f8396a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.c f8397b;

    /* renamed from: c  reason: collision with root package name */
    public final e f8398c = f8395f;

    public class a implements f.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8399a = ByteBuffer.allocate(8);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l8 = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f8399a) {
                this.f8399a.position(0);
                messageDigest.update(this.f8399a.putLong(l8.longValue()).array());
            }
        }
    }

    public class b implements f.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8400a = ByteBuffer.allocate(4);

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f8400a) {
                    this.f8400a.position(0);
                    messageDigest.update(this.f8400a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    public static final class d implements f<ByteBuffer> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new t((ByteBuffer) obj));
        }
    }

    public static class e {
    }

    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t8);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public s(s2.c cVar, f<T> fVar) {
        this.f8397b = cVar;
        this.f8396a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, y2.g r15) {
        /*
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0051
            if (r14 == r0) goto L_0x0051
            y2.g$f r0 = y2.g.f8351b
            if (r15 == r0) goto L_0x0051
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x004b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x004b }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x004b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x004b }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x004b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x004b }
            r3 = 90
            if (r2 == r3) goto L_0x0030
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0033
        L_0x0030:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0033:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch:{ all -> 0x004b }
            float r14 = (float) r0     // Catch:{ all -> 0x004b }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x004b }
            float r14 = (float) r1     // Catch:{ all -> 0x004b }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x004b }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x004b }
            goto L_0x0052
        L_0x004b:
            java.lang.String r13 = "VideoDecoder"
            r14 = 3
            android.util.Log.isLoggable(r13, r14)
        L_0x0051:
            r13 = 0
        L_0x0052:
            if (r13 != 0) goto L_0x0058
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0058:
            if (r13 == 0) goto L_0x005b
            return r13
        L_0x005b:
            y2.s$h r9 = new y2.s$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.s.c(android.media.MediaMetadataRetriever, long, int, int, int, y2.g):android.graphics.Bitmap");
    }

    public final boolean a(T t8, p2.g gVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final v<Bitmap> b(T t8, int i8, int i9, p2.g gVar) {
        long longValue = ((Long) gVar.c(f8394d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.c(e);
            if (num == null) {
                num = 2;
            }
            g gVar2 = (g) gVar.c(g.f8353d);
            if (gVar2 == null) {
                gVar2 = g.f8352c;
            }
            g gVar3 = gVar2;
            this.f8398c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f8396a.a(mediaMetadataRetriever, t8);
                Bitmap c9 = c(mediaMetadataRetriever, longValue, num.intValue(), i8, i9, gVar3);
                mediaMetadataRetriever.release();
                return c.e(c9, this.f8397b);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }
}
