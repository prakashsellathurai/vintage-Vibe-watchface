package r0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class a {
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};
    public static final String[] E = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] F = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] G = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d H = new d("StripOffsets", 273, 3);
    public static final d[][] I;
    public static final d[] J = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] K = new HashMap[10];
    public static final HashMap<String, d>[] L = new HashMap[10];
    public static final HashSet<String> M = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> N = new HashMap<>();
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f6646m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final List<Integer> f6647n = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f6648o = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f6649p = {8, 8, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f6650q = {8};
    public static final byte[] r = {-1, -40, -1};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f6651s = {102, 116, 121, 112};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f6652t = {109, 105, 102, 49};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f6653u = {104, 101, 105, 99};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f6654v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f6655x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f6656z = {73, 72, 68, 82};

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f6657a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f6658b;

    /* renamed from: c  reason: collision with root package name */
    public int f6659c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f6660d;
    public final HashSet e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f6661f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6662g;

    /* renamed from: h  reason: collision with root package name */
    public int f6663h;

    /* renamed from: i  reason: collision with root package name */
    public int f6664i;

    /* renamed from: j  reason: collision with root package name */
    public int f6665j;

    /* renamed from: k  reason: collision with root package name */
    public int f6666k;

    /* renamed from: l  reason: collision with root package name */
    public int f6667l;

    /* renamed from: r0.a$a  reason: collision with other inner class name */
    public class C0114a extends MediaDataSource {

        /* renamed from: f  reason: collision with root package name */
        public long f6668f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f6669g;

        public C0114a(b bVar) {
            this.f6669g = bVar;
        }

        public final void close() {
        }

        public final long getSize() {
            return -1;
        }

        public final int readAt(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                return 0;
            }
            if (j8 < 0) {
                return -1;
            }
            try {
                long j9 = this.f6668f;
                int i10 = (j9 > j8 ? 1 : (j9 == j8 ? 0 : -1));
                b bVar = this.f6669g;
                if (i10 != 0) {
                    if (j9 >= 0) {
                        if (j8 >= j9 + ((long) bVar.available())) {
                            return -1;
                        }
                    }
                    bVar.a(j8);
                    this.f6668f = j8;
                }
                if (i9 > bVar.available()) {
                    i9 = bVar.available();
                }
                int read = bVar.read(bArr, i8, i9);
                if (read >= 0) {
                    this.f6668f += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f6668f = -1;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: j  reason: collision with root package name */
        public static final ByteOrder f6670j = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: k  reason: collision with root package name */
        public static final ByteOrder f6671k = ByteOrder.BIG_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        public final DataInputStream f6672f;

        /* renamed from: g  reason: collision with root package name */
        public ByteOrder f6673g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6674h;

        /* renamed from: i  reason: collision with root package name */
        public int f6675i;

        public b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f6673g = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f6672f = dataInputStream;
            int available = dataInputStream.available();
            this.f6674h = available;
            this.f6675i = 0;
            dataInputStream.mark(available);
            this.f6673g = byteOrder;
        }

        public b(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public final void a(long j8) {
            int i8 = this.f6675i;
            if (((long) i8) > j8) {
                this.f6675i = 0;
                DataInputStream dataInputStream = this.f6672f;
                dataInputStream.reset();
                dataInputStream.mark(this.f6674h);
            } else {
                j8 -= (long) i8;
            }
            int i9 = (int) j8;
            if (skipBytes(i9) != i9) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public final int available() {
            return this.f6672f.available();
        }

        public final int read() {
            this.f6675i++;
            return this.f6672f.read();
        }

        public final int read(byte[] bArr, int i8, int i9) {
            int read = this.f6672f.read(bArr, i8, i9);
            this.f6675i += read;
            return read;
        }

        public final boolean readBoolean() {
            this.f6675i++;
            return this.f6672f.readBoolean();
        }

        public final byte readByte() {
            int i8 = this.f6675i + 1;
            this.f6675i = i8;
            if (i8 <= this.f6674h) {
                int read = this.f6672f.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final char readChar() {
            this.f6675i += 2;
            return this.f6672f.readChar();
        }

        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr) {
            int length = this.f6675i + bArr.length;
            this.f6675i = length;
            if (length > this.f6674h) {
                throw new EOFException();
            } else if (this.f6672f.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final void readFully(byte[] bArr, int i8, int i9) {
            int i10 = this.f6675i + i9;
            this.f6675i = i10;
            if (i10 > this.f6674h) {
                throw new EOFException();
            } else if (this.f6672f.read(bArr, i8, i9) != i9) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final int readInt() {
            int i8 = this.f6675i + 4;
            this.f6675i = i8;
            if (i8 <= this.f6674h) {
                DataInputStream dataInputStream = this.f6672f;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f6673g;
                    if (byteOrder == f6670j) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f6671k) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f6673g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readLine() {
            return null;
        }

        public final long readLong() {
            int i8 = this.f6675i + 8;
            this.f6675i = i8;
            if (i8 <= this.f6674h) {
                DataInputStream dataInputStream = this.f6672f;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                int read3 = dataInputStream.read();
                int read4 = dataInputStream.read();
                int read5 = dataInputStream.read();
                int read6 = dataInputStream.read();
                int read7 = dataInputStream.read();
                int read8 = dataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f6673g;
                    if (byteOrder == f6670j) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f6671k) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f6673g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final short readShort() {
            int i8;
            int i9 = this.f6675i + 2;
            this.f6675i = i9;
            if (i9 <= this.f6674h) {
                DataInputStream dataInputStream = this.f6672f;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f6673g;
                    if (byteOrder == f6670j) {
                        i8 = (read2 << 8) + read;
                    } else if (byteOrder == f6671k) {
                        i8 = (read << 8) + read2;
                    } else {
                        throw new IOException("Invalid byte order: " + this.f6673g);
                    }
                    return (short) i8;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readUTF() {
            this.f6675i += 2;
            return this.f6672f.readUTF();
        }

        public final int readUnsignedByte() {
            this.f6675i++;
            return this.f6672f.readUnsignedByte();
        }

        public final int readUnsignedShort() {
            int i8 = this.f6675i + 2;
            this.f6675i = i8;
            if (i8 <= this.f6674h) {
                DataInputStream dataInputStream = this.f6672f;
                int read = dataInputStream.read();
                int read2 = dataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f6673g;
                    if (byteOrder == f6670j) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f6671k) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f6673g);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int skipBytes(int i8) {
            int min = Math.min(i8, this.f6674h - this.f6675i);
            int i9 = 0;
            while (i9 < min) {
                i9 += this.f6672f.skipBytes(min - i9);
            }
            this.f6675i += i9;
            return i9;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6676a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6677b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f6678c;

        public c(byte[] bArr, int i8, int i9) {
            this(bArr, i8, i9, 0);
        }

        public c(byte[] bArr, int i8, int i9, int i10) {
            this.f6676a = i8;
            this.f6677b = i9;
            this.f6678c = bArr;
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.O);
            return new c(bytes, 2, bytes.length, 0);
        }

        public static c b(long j8, ByteOrder byteOrder) {
            long[] jArr = {j8};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[4] * 1)]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new c(wrap.array(), 4, 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[5] * 1)]);
            wrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            wrap.putInt((int) eVar2.f6683a);
            wrap.putInt((int) eVar2.f6684b);
            return new c(wrap.array(), 5, 1);
        }

        public static c d(int i8, ByteOrder byteOrder) {
            int[] iArr = {i8};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[3] * 1)]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new c(wrap.array(), 3, 1);
        }

        public final double e(ByteOrder byteOrder) {
            Serializable h8 = h(byteOrder);
            if (h8 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h8 instanceof String) {
                return Double.parseDouble((String) h8);
            } else {
                if (h8 instanceof long[]) {
                    long[] jArr = (long[]) h8;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h8 instanceof int[]) {
                    int[] iArr = (int[]) h8;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h8 instanceof double[]) {
                    double[] dArr = (double[]) h8;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h8 instanceof e[]) {
                    e[] eVarArr = (e[]) h8;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.f6683a) / ((double) eVar.f6684b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public final int f(ByteOrder byteOrder) {
            Serializable h8 = h(byteOrder);
            if (h8 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h8 instanceof String) {
                return Integer.parseInt((String) h8);
            } else {
                if (h8 instanceof long[]) {
                    long[] jArr = (long[]) h8;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h8 instanceof int[]) {
                    int[] iArr = (int[]) h8;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String g(ByteOrder byteOrder) {
            Serializable h8 = h(byteOrder);
            if (h8 == null) {
                return null;
            }
            if (h8 instanceof String) {
                return (String) h8;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            if (h8 instanceof long[]) {
                long[] jArr = (long[]) h8;
                while (i8 < jArr.length) {
                    sb.append(jArr[i8]);
                    i8++;
                    if (i8 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h8 instanceof int[]) {
                int[] iArr = (int[]) h8;
                while (i8 < iArr.length) {
                    sb.append(iArr[i8]);
                    i8++;
                    if (i8 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (h8 instanceof double[]) {
                double[] dArr = (double[]) h8;
                while (i8 < dArr.length) {
                    sb.append(dArr[i8]);
                    i8++;
                    if (i8 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(h8 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h8;
                while (i8 < eVarArr.length) {
                    sb.append(eVarArr[i8].f6683a);
                    sb.append('/');
                    sb.append(eVarArr[i8].f6684b);
                    i8++;
                    if (i8 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r14v14, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v15, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v16, types: [r0.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v17, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v18, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v19, types: [r0.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v20, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r14v21, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x017f A[SYNTHETIC, Splitter:B:155:0x017f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable h(java.nio.ByteOrder r14) {
            /*
                r13 = this;
                byte[] r0 = r13.f6678c
                java.lang.String r1 = "IOException occurred while closing InputStream"
                java.lang.String r2 = "ExifInterface"
                r3 = 0
                r0.a$b r4 = new r0.a$b     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
                r4.<init>((byte[]) r0)     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
                r4.f6673g = r14     // Catch:{ IOException -> 0x00b2 }
                int r14 = r13.f6676a     // Catch:{ IOException -> 0x00b2 }
                r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r7 = 1
                r8 = 0
                int r13 = r13.f6677b
                switch(r14) {
                    case 1: goto L_0x012f;
                    case 2: goto L_0x00ec;
                    case 3: goto L_0x00d6;
                    case 4: goto L_0x00be;
                    case 5: goto L_0x0098;
                    case 6: goto L_0x012f;
                    case 7: goto L_0x00ec;
                    case 8: goto L_0x0082;
                    case 9: goto L_0x006c;
                    case 10: goto L_0x004b;
                    case 11: goto L_0x0034;
                    case 12: goto L_0x001e;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x015d
            L_0x001e:
                double[] r14 = new double[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x0020:
                if (r8 >= r13) goto L_0x002b
                double r5 = r4.readDouble()     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r5     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0020
            L_0x002b:
                r4.close()     // Catch:{ IOException -> 0x002f }
                goto L_0x0033
            L_0x002f:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x0033:
                return r14
            L_0x0034:
                double[] r14 = new double[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x0036:
                if (r8 >= r13) goto L_0x0042
                float r0 = r4.readFloat()     // Catch:{ IOException -> 0x00b2 }
                double r5 = (double) r0     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r5     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0036
            L_0x0042:
                r4.close()     // Catch:{ IOException -> 0x0046 }
                goto L_0x004a
            L_0x0046:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x004a:
                return r14
            L_0x004b:
                r0.a$e[] r14 = new r0.a.e[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x004d:
                if (r8 >= r13) goto L_0x0063
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r5 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r9 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                r0.a$e r0 = new r0.a$e     // Catch:{ IOException -> 0x00b2 }
                r0.<init>(r5, r9)     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x004d
            L_0x0063:
                r4.close()     // Catch:{ IOException -> 0x0067 }
                goto L_0x006b
            L_0x0067:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x006b:
                return r14
            L_0x006c:
                int[] r14 = new int[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x006e:
                if (r8 >= r13) goto L_0x0079
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x006e
            L_0x0079:
                r4.close()     // Catch:{ IOException -> 0x007d }
                goto L_0x0081
            L_0x007d:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x0081:
                return r14
            L_0x0082:
                int[] r14 = new int[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x0084:
                if (r8 >= r13) goto L_0x008f
                short r0 = r4.readShort()     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0084
            L_0x008f:
                r4.close()     // Catch:{ IOException -> 0x0093 }
                goto L_0x0097
            L_0x0093:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x0097:
                return r14
            L_0x0098:
                r0.a$e[] r14 = new r0.a.e[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x009a:
                if (r8 >= r13) goto L_0x00b5
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r9 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r9 = r9 & r5
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r11 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r11 = r11 & r5
                r0.a$e r0 = new r0.a$e     // Catch:{ IOException -> 0x00b2 }
                r0.<init>(r9, r11)     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x009a
            L_0x00b2:
                r13 = move-exception
                goto L_0x016d
            L_0x00b5:
                r4.close()     // Catch:{ IOException -> 0x00b9 }
                goto L_0x00bd
            L_0x00b9:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x00bd:
                return r14
            L_0x00be:
                long[] r14 = new long[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x00c0:
                if (r8 >= r13) goto L_0x00cd
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r9 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r9 = r9 & r5
                r14[r8] = r9     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x00c0
            L_0x00cd:
                r4.close()     // Catch:{ IOException -> 0x00d1 }
                goto L_0x00d5
            L_0x00d1:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x00d5:
                return r14
            L_0x00d6:
                int[] r14 = new int[r13]     // Catch:{ IOException -> 0x00b2 }
            L_0x00d8:
                if (r8 >= r13) goto L_0x00e3
                int r0 = r4.readUnsignedShort()     // Catch:{ IOException -> 0x00b2 }
                r14[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x00d8
            L_0x00e3:
                r4.close()     // Catch:{ IOException -> 0x00e7 }
                goto L_0x00eb
            L_0x00e7:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x00eb:
                return r14
            L_0x00ec:
                byte[] r14 = r0.a.G     // Catch:{ IOException -> 0x00b2 }
                int r14 = r14.length     // Catch:{ IOException -> 0x00b2 }
                if (r13 < r14) goto L_0x0105
                r14 = r8
            L_0x00f2:
                byte[] r5 = r0.a.G     // Catch:{ IOException -> 0x00b2 }
                int r6 = r5.length     // Catch:{ IOException -> 0x00b2 }
                if (r14 >= r6) goto L_0x0102
                byte r6 = r0[r14]     // Catch:{ IOException -> 0x00b2 }
                byte r9 = r5[r14]     // Catch:{ IOException -> 0x00b2 }
                if (r6 == r9) goto L_0x00ff
                r7 = r8
                goto L_0x0102
            L_0x00ff:
                int r14 = r14 + 1
                goto L_0x00f2
            L_0x0102:
                if (r7 == 0) goto L_0x0105
                int r8 = r5.length     // Catch:{ IOException -> 0x00b2 }
            L_0x0105:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b2 }
                r14.<init>()     // Catch:{ IOException -> 0x00b2 }
            L_0x010a:
                if (r8 >= r13) goto L_0x0122
                byte r5 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
                if (r5 != 0) goto L_0x0111
                goto L_0x0122
            L_0x0111:
                r6 = 32
                if (r5 < r6) goto L_0x011a
                char r5 = (char) r5     // Catch:{ IOException -> 0x00b2 }
                r14.append(r5)     // Catch:{ IOException -> 0x00b2 }
                goto L_0x011f
            L_0x011a:
                r5 = 63
                r14.append(r5)     // Catch:{ IOException -> 0x00b2 }
            L_0x011f:
                int r8 = r8 + 1
                goto L_0x010a
            L_0x0122:
                java.lang.String r13 = r14.toString()     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x012a }
                goto L_0x012e
            L_0x012a:
                r14 = move-exception
                android.util.Log.e(r2, r1, r14)
            L_0x012e:
                return r13
            L_0x012f:
                int r13 = r0.length     // Catch:{ IOException -> 0x00b2 }
                if (r13 != r7) goto L_0x014d
                byte r13 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
                if (r13 < 0) goto L_0x014d
                if (r13 > r7) goto L_0x014d
                java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
                char[] r0 = new char[r7]     // Catch:{ IOException -> 0x00b2 }
                int r13 = r13 + 48
                char r13 = (char) r13     // Catch:{ IOException -> 0x00b2 }
                r0[r8] = r13     // Catch:{ IOException -> 0x00b2 }
                r14.<init>(r0)     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x0148 }
                goto L_0x014c
            L_0x0148:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x014c:
                return r14
            L_0x014d:
                java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
                java.nio.charset.Charset r14 = r0.a.O     // Catch:{ IOException -> 0x00b2 }
                r13.<init>(r0, r14)     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x0158 }
                goto L_0x015c
            L_0x0158:
                r14 = move-exception
                android.util.Log.e(r2, r1, r14)
            L_0x015c:
                return r13
            L_0x015d:
                r4.close()     // Catch:{ IOException -> 0x0161 }
                goto L_0x0165
            L_0x0161:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x0165:
                return r3
            L_0x0166:
                r13 = move-exception
                r3 = r4
                goto L_0x017d
            L_0x0169:
                r13 = move-exception
                goto L_0x017d
            L_0x016b:
                r13 = move-exception
                r4 = r3
            L_0x016d:
                java.lang.String r14 = "IOException occurred during reading a value"
                android.util.Log.w(r2, r14, r13)     // Catch:{ all -> 0x0166 }
                if (r4 == 0) goto L_0x017c
                r4.close()     // Catch:{ IOException -> 0x0178 }
                goto L_0x017c
            L_0x0178:
                r13 = move-exception
                android.util.Log.e(r2, r1, r13)
            L_0x017c:
                return r3
            L_0x017d:
                if (r3 == 0) goto L_0x0187
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r14 = move-exception
                android.util.Log.e(r2, r1, r14)
            L_0x0187:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.a.c.h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            return "(" + a.E[this.f6676a] + ", data length:" + this.f6678c.length + ")";
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f6679a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6680b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6681c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6682d;

        public d(int i8, String str) {
            this.f6680b = str;
            this.f6679a = i8;
            this.f6681c = 3;
            this.f6682d = 4;
        }

        public d(String str, int i8, int i9) {
            this.f6680b = str;
            this.f6679a = i8;
            this.f6681c = i9;
            this.f6682d = -1;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f6683a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6684b;

        public e(long j8, long j9) {
            if (j9 == 0) {
                this.f6683a = 0;
                this.f6684b = 1;
                return;
            }
            this.f6683a = j8;
            this.f6684b = j9;
        }

        public final String toString() {
            return this.f6683a + "/" + this.f6684b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, "ImageWidth"), new d(257, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        I = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, "PixelXDimension"), new d(40963, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize")}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, "ThumbnailImageWidth"), new d(257, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, "RowsPerStrip"), new d(279, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize")}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            d[][] dVarArr2 = I;
            if (i8 < dVarArr2.length) {
                K[i8] = new HashMap<>();
                L[i8] = new HashMap<>();
                for (d dVar : dVarArr2[i8]) {
                    K[i8].put(Integer.valueOf(dVar.f6679a), dVar);
                    L[i8].put(dVar.f6680b, dVar);
                }
                i8++;
            } else {
                HashMap<Integer, Integer> hashMap = N;
                d[] dVarArr3 = J;
                hashMap.put(Integer.valueOf(dVarArr3[0].f6679a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f6679a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f6679a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f6679a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f6679a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f6679a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        boolean z8;
        d[][] dVarArr = I;
        this.f6660d = new HashMap[dVarArr.length];
        this.e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            FileDescriptor fileDescriptor = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f6658b = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z8 = true;
                    } catch (Exception unused) {
                        z8 = false;
                    }
                    if (z8) {
                        this.f6658b = null;
                        fileDescriptor = fileInputStream.getFD();
                    }
                }
                this.f6658b = null;
            }
            this.f6657a = fileDescriptor;
            boolean z9 = f6646m;
            int i8 = 0;
            while (i8 < dVarArr.length) {
                try {
                    this.f6660d[i8] = new HashMap<>();
                    i8++;
                } catch (IOException e4) {
                    if (z9) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e4);
                    }
                    a();
                    if (!z9) {
                        return;
                    }
                } catch (Throwable th) {
                    a();
                    if (z9) {
                        r();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f6659c = h(bufferedInputStream);
            b bVar = new b((InputStream) bufferedInputStream);
            switch (this.f6659c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    l(bVar);
                    break;
                case 4:
                    g(bVar, 0, 0);
                    break;
                case 7:
                    i(bVar);
                    break;
                case 9:
                    k(bVar);
                    break;
                case 10:
                    m(bVar);
                    break;
                case 12:
                    f(bVar);
                    break;
                case 13:
                    j(bVar);
                    break;
                case 14:
                    n(bVar);
                    break;
            }
            v(bVar);
            a();
            if (!z9) {
                return;
            }
            r();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i8])}));
        }
        return sb.toString();
    }

    public static long[] c(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                jArr[i8] = (long) iArr[i8];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String d9 = d("DateTimeOriginal");
        HashMap<String, c>[] hashMapArr = this.f6660d;
        if (d9 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(d9));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0, this.f6661f));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0, this.f6661f));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0, this.f6661f));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0, this.f6661f));
        }
    }

    public final String d(String str) {
        String str2;
        c e4 = e(str);
        if (e4 != null) {
            if (!M.contains(str)) {
                return e4.g(this.f6661f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i8 = e4.f6676a;
                if (i8 == 5 || i8 == 10) {
                    e[] eVarArr = (e[]) e4.h(this.f6661f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr);
                    } else {
                        e eVar = eVarArr[0];
                        e eVar2 = eVarArr[1];
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f6683a) / ((float) eVar.f6684b))), Integer.valueOf((int) (((float) eVar2.f6683a) / ((float) eVar2.f6684b))), Integer.valueOf((int) (((float) eVar3.f6683a) / ((float) eVar3.f6684b)))});
                    }
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + i8;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(e4.e(this.f6661f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i8 = 0; i8 < I.length; i8++) {
            c cVar = this.f6660d[i8].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) {
        String str;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0114a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            HashMap<String, c>[] hashMapArr = this.f6660d;
            if (str3 != null) {
                hashMapArr[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.f6661f));
            }
            if (str2 != null) {
                hashMapArr[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f6661f));
            }
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                hashMapArr[0].put("Orientation", c.d(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f6661f));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.a((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i8 = parseInt2 + 6;
                        int i9 = parseInt3 - 6;
                        if (Arrays.equals(bArr, P)) {
                            byte[] bArr2 = new byte[i9];
                            if (bVar.read(bArr2) == i9) {
                                this.f6663h = i8;
                                t(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(r0.a.b r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = f6646m
            if (r4 == 0) goto L_0x000f
            java.util.Objects.toString(r17)
        L_0x000f:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f6673g = r5
            long r5 = (long) r2
            r1.a(r5)
            byte r5 = r17.readByte()
            r6 = -1
            java.lang.String r7 = "Invalid marker: "
            if (r5 != r6) goto L_0x018f
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r17.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x0177
            int r2 = r2 + r8
        L_0x002b:
            byte r5 = r17.readByte()
            if (r5 != r6) goto L_0x015d
            int r2 = r2 + r8
            byte r5 = r17.readByte()
            if (r4 == 0) goto L_0x003d
            r7 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r7)
        L_0x003d:
            int r2 = r2 + r8
            r7 = -39
            if (r5 == r7) goto L_0x0158
            r7 = -38
            if (r5 != r7) goto L_0x0048
            goto L_0x0158
        L_0x0048:
            int r7 = r17.readUnsignedShort()
            r9 = -2
            int r7 = r7 + r9
            int r2 = r2 + 2
            if (r4 == 0) goto L_0x0057
            r10 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r10)
        L_0x0057:
            java.lang.String r10 = "Invalid length"
            if (r7 < 0) goto L_0x0152
            r11 = 0
            r12 = -31
            java.util.HashMap<java.lang.String, r0.a$c>[] r13 = r0.f6660d
            if (r5 == r12) goto L_0x00d2
            if (r5 == r9) goto L_0x00a8
            switch(r5) {
                case -64: goto L_0x0072;
                case -63: goto L_0x0072;
                case -62: goto L_0x0072;
                case -61: goto L_0x0072;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r5) {
                case -59: goto L_0x0072;
                case -58: goto L_0x0072;
                case -57: goto L_0x0072;
                default: goto L_0x006a;
            }
        L_0x006a:
            switch(r5) {
                case -55: goto L_0x0072;
                case -54: goto L_0x0072;
                case -53: goto L_0x0072;
                default: goto L_0x006d;
            }
        L_0x006d:
            switch(r5) {
                case -51: goto L_0x0072;
                case -50: goto L_0x0072;
                case -49: goto L_0x0072;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x0138
        L_0x0072:
            int r5 = r1.skipBytes(r8)
            if (r5 != r8) goto L_0x00a0
            r5 = r13[r3]
            int r9 = r17.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.f6661f
            r0.a$c r9 = r0.a.c.b(r11, r9)
            java.lang.String r11 = "ImageLength"
            r5.put(r11, r9)
            r5 = r13[r3]
            int r9 = r17.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.f6661f
            r0.a$c r9 = r0.a.c.b(r11, r9)
            java.lang.String r11 = "ImageWidth"
            r5.put(r11, r9)
            int r7 = r7 + -5
            goto L_0x0138
        L_0x00a0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid SOFx"
            r0.<init>(r1)
            throw r0
        L_0x00a8:
            byte[] r5 = new byte[r7]
            int r9 = r1.read(r5)
            if (r9 != r7) goto L_0x00ca
            java.lang.String r7 = "UserComment"
            java.lang.String r9 = r0.d(r7)
            if (r9 != 0) goto L_0x0137
            r9 = r13[r8]
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = O
            r12.<init>(r5, r13)
            r0.a$c r5 = r0.a.c.a(r12)
            r9.put(r7, r5)
            goto L_0x0137
        L_0x00ca:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid exif"
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            byte[] r5 = new byte[r7]
            r1.readFully(r5)
            int r9 = r2 + r7
            byte[] r12 = P
            if (r12 != 0) goto L_0x00df
        L_0x00dd:
            r6 = r11
            goto L_0x00f3
        L_0x00df:
            int r14 = r12.length
            if (r7 >= r14) goto L_0x00e3
            goto L_0x00dd
        L_0x00e3:
            r14 = r11
        L_0x00e4:
            int r15 = r12.length
            if (r14 >= r15) goto L_0x00f2
            byte r15 = r5[r14]
            byte r6 = r12[r14]
            if (r15 == r6) goto L_0x00ee
            goto L_0x00dd
        L_0x00ee:
            int r14 = r14 + 1
            r6 = -1
            goto L_0x00e4
        L_0x00f2:
            r6 = r8
        L_0x00f3:
            if (r6 == 0) goto L_0x0102
            int r6 = r12.length
            int r2 = r2 + r6
            int r6 = r12.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r7)
            r0.f6663h = r2
            r0.t(r5, r3)
            goto L_0x0136
        L_0x0102:
            byte[] r2 = Q
            if (r2 != 0) goto L_0x0108
        L_0x0106:
            r6 = r11
            goto L_0x011b
        L_0x0108:
            int r6 = r2.length
            if (r7 >= r6) goto L_0x010c
            goto L_0x0106
        L_0x010c:
            r6 = r11
        L_0x010d:
            int r12 = r2.length
            if (r6 >= r12) goto L_0x011a
            byte r12 = r5[r6]
            byte r14 = r2[r6]
            if (r12 == r14) goto L_0x0117
            goto L_0x0106
        L_0x0117:
            int r6 = r6 + 1
            goto L_0x010d
        L_0x011a:
            r6 = r8
        L_0x011b:
            if (r6 == 0) goto L_0x0136
            int r6 = r2.length
            int r2 = r2.length
            byte[] r2 = java.util.Arrays.copyOfRange(r5, r2, r7)
            java.lang.String r5 = "Xmp"
            java.lang.String r6 = r0.d(r5)
            if (r6 != 0) goto L_0x0136
            r6 = r13[r11]
            r0.a$c r7 = new r0.a$c
            int r12 = r2.length
            r7.<init>(r2, r8, r12, r11)
            r6.put(r5, r7)
        L_0x0136:
            r2 = r9
        L_0x0137:
            r7 = r11
        L_0x0138:
            if (r7 < 0) goto L_0x014c
            int r5 = r1.skipBytes(r7)
            if (r5 != r7) goto L_0x0144
            int r2 = r2 + r7
            r6 = -1
            goto L_0x002b
        L_0x0144:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid JPEG segment"
            r0.<init>(r1)
            throw r0
        L_0x014c:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0152:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0158:
            java.nio.ByteOrder r0 = r0.f6661f
            r1.f6673g = r0
            return
        L_0x015d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid marker:"
            r1.<init>(r2)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0177:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.g(r0.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (r6 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0105 A[SYNTHETIC, Splitter:B:98:0x0105] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r1.mark(r2)
            byte[] r3 = new byte[r2]
            r1.read(r3)
            r18.reset()
            r4 = 0
        L_0x0012:
            byte[] r5 = r
            int r6 = r5.length
            r7 = 1
            if (r4 >= r6) goto L_0x0023
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0020
            r4 = 0
            goto L_0x0024
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0023:
            r4 = r7
        L_0x0024:
            r5 = 4
            if (r4 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.lang.String r4 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r6)
            r6 = 0
        L_0x0033:
            int r8 = r4.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r4[r6]
            if (r8 == r9) goto L_0x003e
            r4 = 0
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r4 = r7
        L_0x0042:
            if (r4 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            r4 = 0
            r0.a$b r6 = new r0.a$b     // Catch:{ Exception -> 0x00c3, all -> 0x00bc }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c3, all -> 0x00bc }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            byte[] r10 = new byte[r5]     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            r6.read(r10)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            byte[] r11 = f6651s     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r10 != 0) goto L_0x0061
            goto L_0x00c6
        L_0x0061:
            r10 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 8
            if (r12 != 0) goto L_0x0074
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            r15 = 16
            int r12 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x0075
            goto L_0x00c6
        L_0x0074:
            r15 = r13
        L_0x0075:
            long r1 = (long) r2     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x007b
            r8 = r1
        L_0x007b:
            long r8 = r8 - r15
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0081
            goto L_0x00c6
        L_0x0081:
            byte[] r1 = new byte[r5]     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            r12 = 0
            r2 = 0
            r14 = 0
        L_0x0087:
            r15 = 4
            long r15 = r8 / r15
            int r15 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x00c6
            int r15 = r6.read(r1)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r15 == r5) goto L_0x0096
            goto L_0x00c6
        L_0x0096:
            int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r15 = f6652t     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r15 = java.util.Arrays.equals(r1, r15)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r15 == 0) goto L_0x00a5
            r2 = r7
            goto L_0x00ae
        L_0x00a5:
            byte[] r15 = f6653u     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            boolean r15 = java.util.Arrays.equals(r1, r15)     // Catch:{ Exception -> 0x00c4, all -> 0x00b9 }
            if (r15 == 0) goto L_0x00ae
            r14 = r7
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r14 == 0) goto L_0x00b7
            r6.close()
            r1 = r7
            goto L_0x00ca
        L_0x00b7:
            long r12 = r12 + r10
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            r4 = r6
            goto L_0x00bd
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            if (r4 == 0) goto L_0x00c2
            r4.close()
        L_0x00c2:
            throw r0
        L_0x00c3:
            r6 = r4
        L_0x00c4:
            if (r6 == 0) goto L_0x00c9
        L_0x00c6:
            r6.close()
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
            r0 = 12
            return r0
        L_0x00cf:
            r0.a$b r1 = new r0.a$b     // Catch:{ Exception -> 0x00fa, all -> 0x00f3 }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00fa, all -> 0x00f3 }
            java.nio.ByteOrder r2 = s(r1)     // Catch:{ Exception -> 0x00fb, all -> 0x00f0 }
            r0.f6661f = r2     // Catch:{ Exception -> 0x00fb, all -> 0x00f0 }
            r1.f6673g = r2     // Catch:{ Exception -> 0x00fb, all -> 0x00f0 }
            short r2 = r1.readShort()     // Catch:{ Exception -> 0x00fb, all -> 0x00f0 }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r2 == r6) goto L_0x00eb
            r6 = 21330(0x5352, float:2.989E-41)
            if (r2 != r6) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r2 = 0
            goto L_0x00ec
        L_0x00eb:
            r2 = r7
        L_0x00ec:
            r1.close()
            goto L_0x0101
        L_0x00f0:
            r0 = move-exception
            r4 = r1
            goto L_0x00f4
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            if (r4 == 0) goto L_0x00f9
            r4.close()
        L_0x00f9:
            throw r0
        L_0x00fa:
            r1 = r4
        L_0x00fb:
            if (r1 == 0) goto L_0x0100
            r1.close()
        L_0x0100:
            r2 = 0
        L_0x0101:
            if (r2 == 0) goto L_0x0105
            r0 = 7
            return r0
        L_0x0105:
            r0.a$b r1 = new r0.a$b     // Catch:{ Exception -> 0x012d, all -> 0x0126 }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x012d, all -> 0x0126 }
            java.nio.ByteOrder r2 = s(r1)     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r0.f6661f = r2     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r1.f6673g = r2     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            short r0 = r1.readShort()     // Catch:{ Exception -> 0x0124, all -> 0x0121 }
            r2 = 85
            if (r0 != r2) goto L_0x011c
            r0 = r7
            goto L_0x011d
        L_0x011c:
            r0 = 0
        L_0x011d:
            r1.close()
            goto L_0x0133
        L_0x0121:
            r0 = move-exception
            r4 = r1
            goto L_0x0127
        L_0x0124:
            r4 = r1
            goto L_0x012d
        L_0x0126:
            r0 = move-exception
        L_0x0127:
            if (r4 == 0) goto L_0x012c
            r4.close()
        L_0x012c:
            throw r0
        L_0x012d:
            if (r4 == 0) goto L_0x0132
            r4.close()
        L_0x0132:
            r0 = 0
        L_0x0133:
            if (r0 == 0) goto L_0x0138
            r0 = 10
            return r0
        L_0x0138:
            r0 = 0
        L_0x0139:
            byte[] r1 = f6655x
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0149
            byte r2 = r3[r0]
            byte r1 = r1[r0]
            if (r2 == r1) goto L_0x0146
            r0 = 0
            goto L_0x014a
        L_0x0146:
            int r0 = r0 + 1
            goto L_0x0139
        L_0x0149:
            r0 = r7
        L_0x014a:
            if (r0 == 0) goto L_0x014f
            r0 = 13
            return r0
        L_0x014f:
            r0 = 0
        L_0x0150:
            byte[] r1 = B
            int r2 = r1.length
            if (r0 >= r2) goto L_0x015f
            byte r2 = r3[r0]
            byte r1 = r1[r0]
            if (r2 == r1) goto L_0x015c
            goto L_0x016e
        L_0x015c:
            int r0 = r0 + 1
            goto L_0x0150
        L_0x015f:
            r0 = 0
        L_0x0160:
            byte[] r2 = C
            int r4 = r2.length
            if (r0 >= r4) goto L_0x0173
            int r4 = r1.length
            int r4 = r4 + r0
            int r4 = r4 + r5
            byte r4 = r3[r4]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x0170
        L_0x016e:
            r7 = 0
            goto L_0x0173
        L_0x0170:
            int r0 = r0 + 1
            goto L_0x0160
        L_0x0173:
            if (r7 == 0) goto L_0x0178
            r0 = 14
            return r0
        L_0x0178:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.h(java.io.BufferedInputStream):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(r0.a.b r7) {
        /*
            r6 = this;
            r6.l(r7)
            java.util.HashMap<java.lang.String, r0.a$c>[] r7 = r6.f6660d
            r0 = 1
            r1 = r7[r0]
            java.lang.String r2 = "MakerNote"
            java.lang.Object r1 = r1.get(r2)
            r0.a$c r1 = (r0.a.c) r1
            if (r1 == 0) goto L_0x00da
            r0.a$b r2 = new r0.a$b
            byte[] r1 = r1.f6678c
            r2.<init>((byte[]) r1)
            java.nio.ByteOrder r1 = r6.f6661f
            r2.f6673g = r1
            byte[] r1 = f6654v
            int r3 = r1.length
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            r4 = 0
            r2.a(r4)
            byte[] r4 = w
            int r5 = r4.length
            byte[] r5 = new byte[r5]
            r2.readFully(r5)
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L_0x003b
            r3 = 8
            goto L_0x0043
        L_0x003b:
            boolean r1 = java.util.Arrays.equals(r5, r4)
            if (r1 == 0) goto L_0x0046
            r3 = 12
        L_0x0043:
            r2.a(r3)
        L_0x0046:
            r1 = 6
            r6.u(r2, r1)
            r1 = 7
            r2 = r7[r1]
            java.lang.String r3 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r3)
            r0.a$c r2 = (r0.a.c) r2
            r1 = r7[r1]
            java.lang.String r3 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r3)
            r0.a$c r1 = (r0.a.c) r1
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            r3 = 5
            r4 = r7[r3]
            java.lang.String r5 = "JPEGInterchangeFormat"
            r4.put(r5, r2)
            r2 = r7[r3]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r1)
        L_0x0072:
            r1 = 8
            r1 = r7[r1]
            java.lang.String r2 = "AspectFrame"
            java.lang.Object r1 = r1.get(r2)
            r0.a$c r1 = (r0.a.c) r1
            if (r1 == 0) goto L_0x00da
            java.nio.ByteOrder r2 = r6.f6661f
            java.io.Serializable r1 = r1.h(r2)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x00c3
            int r2 = r1.length
            r3 = 4
            if (r2 == r3) goto L_0x008f
            goto L_0x00c3
        L_0x008f:
            r2 = 2
            r2 = r1[r2]
            r3 = 0
            r4 = r1[r3]
            if (r2 <= r4) goto L_0x00da
            r5 = 3
            r5 = r1[r5]
            r1 = r1[r0]
            if (r5 <= r1) goto L_0x00da
            int r2 = r2 - r4
            int r2 = r2 + r0
            int r5 = r5 - r1
            int r5 = r5 + r0
            if (r2 >= r5) goto L_0x00a8
            int r2 = r2 + r5
            int r5 = r2 - r5
            int r2 = r2 - r5
        L_0x00a8:
            java.nio.ByteOrder r0 = r6.f6661f
            r0.a$c r0 = r0.a.c.d(r2, r0)
            java.nio.ByteOrder r6 = r6.f6661f
            r0.a$c r6 = r0.a.c.d(r5, r6)
            r1 = r7[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r0)
            r7 = r7[r3]
            java.lang.String r0 = "ImageLength"
            r7.put(r0, r6)
            goto L_0x00da
        L_0x00c3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Invalid aspect frame values. frame="
            r6.<init>(r7)
            java.lang.String r7 = java.util.Arrays.toString(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "ExifInterface"
            android.util.Log.w(r7, r6)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.i(r0.a$b):void");
    }

    public final void j(b bVar) {
        if (f6646m) {
            Objects.toString(bVar);
        }
        bVar.f6673g = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f6655x;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i8 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i9 = i8 + 4;
                    if (i9 == 16) {
                        if (!Arrays.equals(bArr2, f6656z)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, A)) {
                        if (Arrays.equals(bArr2, y)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f6663h = i9;
                                    t(bArr3, 0);
                                    y();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i10 = readInt + 4;
                        bVar.skipBytes(i10);
                        length = i9 + i10;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i8, 5);
        bVar.a((long) i9);
        bVar.f6673g = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.f6679a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d9 = c.d(readShort, this.f6661f);
                c d10 = c.d(readShort2, this.f6661f);
                HashMap<String, c>[] hashMapArr = this.f6660d;
                hashMapArr[0].put("ImageLength", d9);
                hashMapArr[0].put("ImageWidth", d10);
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) {
        q(bVar, bVar.available());
        u(bVar, 0);
        x(bVar, 0);
        x(bVar, 5);
        x(bVar, 4);
        y();
        if (this.f6659c == 8) {
            HashMap<String, c>[] hashMapArr = this.f6660d;
            c cVar = hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                b bVar2 = new b(cVar.f6678c);
                bVar2.f6673g = this.f6661f;
                bVar2.a(6);
                u(bVar2, 9);
                c cVar2 = hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void m(b bVar) {
        l(bVar);
        HashMap<String, c>[] hashMapArr = this.f6660d;
        if (hashMapArr[0].get("JpgFromRaw") != null) {
            g(bVar, this.f6667l, 5);
        }
        c cVar = hashMapArr[0].get("ISO");
        c cVar2 = hashMapArr[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar);
        }
    }

    public final void n(b bVar) {
        if (f6646m) {
            Objects.toString(bVar);
        }
        bVar.f6673g = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(B.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(C.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = skipBytes + 4 + 4;
                    if (Arrays.equals(D, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f6663h = i8;
                            t(bArr2, 0);
                            this.f6663h = i8;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i9 = i8 + readInt2;
                    if (i9 != readInt) {
                        if (i9 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i8 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f9 = cVar.f(this.f6661f);
            int f10 = cVar2.f(this.f6661f);
            if (this.f6659c == 7) {
                f9 += this.f6664i;
            }
            int min = Math.min(f10, bVar.f6674h - f9);
            if (f9 > 0 && min > 0) {
                int i8 = f9 + this.f6663h;
                if (this.f6658b == null && this.f6657a == null) {
                    bVar.a((long) i8);
                    bVar.readFully(new byte[min]);
                }
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f6661f) <= 512 && cVar2.f(this.f6661f) <= 512;
    }

    public final void q(b bVar, int i8) {
        ByteOrder s8 = s(bVar);
        this.f6661f = s8;
        bVar.f6673g = s8;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i9 = this.f6659c;
        if (i9 == 7 || i9 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i8) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i10 = readInt - 8;
            if (i10 > 0 && bVar.skipBytes(i10) != i10) {
                throw new IOException("Couldn't jump to first Ifd: " + i10);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void r() {
        int i8 = 0;
        while (true) {
            HashMap<String, c>[] hashMapArr = this.f6660d;
            if (i8 < hashMapArr.length) {
                hashMapArr[i8].size();
                for (Map.Entry next : hashMapArr[i8].entrySet()) {
                    c cVar = (c) next.getValue();
                    String str = (String) next.getKey();
                    cVar.toString();
                    cVar.g(this.f6661f);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void t(byte[] bArr, int i8) {
        b bVar = new b(bArr);
        q(bVar, bArr.length);
        u(bVar, i8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(r0.a.b r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            int r3 = r1.f6675i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.e
            r4.add(r3)
            int r3 = r1.f6675i
            r5 = 2
            int r3 = r3 + r5
            int r6 = r1.f6674h
            if (r3 <= r6) goto L_0x001a
            return
        L_0x001a:
            short r3 = r30.readShort()
            int r7 = r1.f6675i
            int r8 = r3 * 12
            int r7 = r7 + r8
            if (r7 > r6) goto L_0x02cd
            if (r3 > 0) goto L_0x0029
            goto L_0x02cd
        L_0x0029:
            r7 = 0
            r8 = r7
        L_0x002b:
            boolean r13 = f6646m
            r14 = 5
            java.util.HashMap<java.lang.String, r0.a$c>[] r15 = r0.f6660d
            if (r8 >= r3) goto L_0x0280
            int r16 = r30.readUnsignedShort()
            int r9 = r30.readUnsignedShort()
            int r10 = r30.readInt()
            int r12 = r1.f6675i
            r19 = r6
            long r5 = (long) r12
            r20 = 4
            long r5 = r5 + r20
            java.util.HashMap<java.lang.Integer, r0.a$d>[] r12 = K
            r12 = r12[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            java.lang.Object r11 = r12.get(r11)
            r0.a$d r11 = (r0.a.d) r11
            r12 = 3
            if (r13 == 0) goto L_0x0085
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r31)
            r14[r7] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r16)
            r22 = 1
            r14[r22] = r23
            if (r11 == 0) goto L_0x006d
            java.lang.String r7 = r11.f6680b
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            r18 = 2
            r14[r18] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r14[r12] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r17 = 4
            r14[r17] = r7
            java.lang.String r7 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r7, r14)
        L_0x0085:
            r14 = 7
            if (r11 != 0) goto L_0x008f
        L_0x0088:
            r25 = r3
        L_0x008a:
            r12 = r4
            r26 = r8
            goto L_0x00f0
        L_0x008f:
            if (r9 <= 0) goto L_0x0088
            int[] r7 = F
            int r12 = r7.length
            if (r9 < r12) goto L_0x0097
            goto L_0x0088
        L_0x0097:
            int r12 = r11.f6681c
            if (r12 == r14) goto L_0x00c8
            if (r9 != r14) goto L_0x009e
            goto L_0x00c8
        L_0x009e:
            if (r12 == r9) goto L_0x00c8
            int r14 = r11.f6682d
            if (r14 != r9) goto L_0x00a5
            goto L_0x00c8
        L_0x00a5:
            r25 = r3
            r3 = 4
            if (r12 == r3) goto L_0x00ac
            if (r14 != r3) goto L_0x00b0
        L_0x00ac:
            r3 = 3
            if (r9 != r3) goto L_0x00b0
            goto L_0x00ca
        L_0x00b0:
            r3 = 9
            if (r12 == r3) goto L_0x00b6
            if (r14 != r3) goto L_0x00bb
        L_0x00b6:
            r3 = 8
            if (r9 != r3) goto L_0x00bb
            goto L_0x00ca
        L_0x00bb:
            r3 = 12
            if (r12 == r3) goto L_0x00c1
            if (r14 != r3) goto L_0x00c6
        L_0x00c1:
            r3 = 11
            if (r9 != r3) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            r3 = 0
            goto L_0x00cb
        L_0x00c8:
            r25 = r3
        L_0x00ca:
            r3 = 1
        L_0x00cb:
            if (r3 != 0) goto L_0x00d4
            if (r13 == 0) goto L_0x008a
            java.lang.String[] r3 = E
            r3 = r3[r9]
            goto L_0x008a
        L_0x00d4:
            r3 = 7
            if (r9 != r3) goto L_0x00d8
            r9 = r12
        L_0x00d8:
            r12 = r4
            long r3 = (long) r10
            r7 = r7[r9]
            r26 = r8
            long r7 = (long) r7
            long r3 = r3 * r7
            r7 = 0
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x00f2
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ee
            goto L_0x00f2
        L_0x00ee:
            r7 = 1
            goto L_0x00f3
        L_0x00f0:
            r3 = 0
        L_0x00f2:
            r7 = 0
        L_0x00f3:
            if (r7 != 0) goto L_0x00fd
            r1.a(r5)
            r2 = r19
        L_0x00fa:
            r8 = 2
            goto L_0x0272
        L_0x00fd:
            int r7 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            java.lang.String r8 = "Compression"
            if (r7 <= 0) goto L_0x018d
            int r7 = r30.readInt()
            int r14 = r0.f6659c
            r20 = r12
            r12 = 7
            if (r14 != r12) goto L_0x0163
            java.lang.String r12 = r11.f6680b
            java.lang.String r14 = "MakerNote"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x011b
            r0.f6664i = r7
            goto L_0x015e
        L_0x011b:
            r12 = 6
            if (r2 != r12) goto L_0x015e
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r12 = r11.f6680b
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x015e
            r0.f6665j = r7
            r0.f6666k = r10
            java.nio.ByteOrder r12 = r0.f6661f
            r14 = 6
            r0.a$c r12 = r0.a.c.d(r14, r12)
            int r14 = r0.f6665j
            r21 = r13
            long r13 = (long) r14
            java.nio.ByteOrder r2 = r0.f6661f
            r0.a$c r2 = r0.a.c.b(r13, r2)
            int r13 = r0.f6666k
            long r13 = (long) r13
            r24 = r10
            java.nio.ByteOrder r10 = r0.f6661f
            r0.a$c r10 = r0.a.c.b(r13, r10)
            r13 = 4
            r14 = r15[r13]
            r14.put(r8, r12)
            r12 = r15[r13]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r12.put(r14, r2)
            r2 = r15[r13]
            java.lang.String r12 = "JPEGInterchangeFormatLength"
            r2.put(r12, r10)
            goto L_0x0177
        L_0x015e:
            r24 = r10
            r21 = r13
            goto L_0x0177
        L_0x0163:
            r24 = r10
            r21 = r13
            r2 = 10
            if (r14 != r2) goto L_0x0177
            java.lang.String r2 = "JpgFromRaw"
            java.lang.String r10 = r11.f6680b
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0177
            r0.f6667l = r7
        L_0x0177:
            long r12 = (long) r7
            long r27 = r12 + r3
            r10 = r8
            r2 = r19
            long r7 = (long) r2
            int r7 = (r27 > r7 ? 1 : (r27 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0186
            r1.a(r12)
            goto L_0x0196
        L_0x0186:
            r1.a(r5)
            r12 = r20
            goto L_0x00fa
        L_0x018d:
            r24 = r10
            r20 = r12
            r21 = r13
            r2 = r19
            r10 = r8
        L_0x0196:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = N
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0210
            r8 = 3
            if (r9 == r8) goto L_0x01cf
            r3 = 4
            if (r9 == r3) goto L_0x01c3
            r3 = 8
            if (r9 == r3) goto L_0x01be
            r3 = 9
            if (r9 == r3) goto L_0x01b9
            r3 = 13
            if (r9 == r3) goto L_0x01b9
            r3 = -1
            goto L_0x01d4
        L_0x01b9:
            int r3 = r30.readInt()
            goto L_0x01d3
        L_0x01be:
            short r3 = r30.readShort()
            goto L_0x01d3
        L_0x01c3:
            int r3 = r30.readInt()
            long r3 = (long) r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r8
            goto L_0x01d4
        L_0x01cf:
            int r3 = r30.readUnsignedShort()
        L_0x01d3:
            long r3 = (long) r3
        L_0x01d4:
            r8 = 2
            if (r21 == 0) goto L_0x01ea
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r12 = 0
            r9[r12] = r10
            java.lang.String r10 = r11.f6680b
            r11 = 1
            r9[r11] = r10
            java.lang.String r10 = "Offset: %d, tagName: %s"
            java.lang.String.format(r10, r9)
        L_0x01ea:
            r9 = 0
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x020d
            long r9 = (long) r2
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x020d
            int r9 = (int) r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = r20
            boolean r9 = r12.contains(r9)
            if (r9 != 0) goto L_0x026f
            r1.a(r3)
            int r3 = r7.intValue()
            r0.u(r1, r3)
            goto L_0x026f
        L_0x020d:
            r12 = r20
            goto L_0x026f
        L_0x0210:
            r12 = r20
            r8 = 2
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            r0.a$c r4 = new r0.a$c
            r7 = r24
            r13 = 0
            r4.<init>(r3, r9, r7, r13)
            r3 = r15[r31]
            java.lang.String r7 = r11.f6680b
            r3.put(r7, r4)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r7 = r11.f6680b
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0235
            r3 = 3
            r0.f6659c = r3
        L_0x0235:
            java.lang.String r3 = "Make"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0245
            java.lang.String r3 = "Model"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0253
        L_0x0245:
            java.nio.ByteOrder r3 = r0.f6661f
            java.lang.String r3 = r4.g(r3)
            java.lang.String r9 = "PENTAX"
            boolean r3 = r3.contains(r9)
            if (r3 != 0) goto L_0x0264
        L_0x0253:
            boolean r3 = r10.equals(r7)
            if (r3 == 0) goto L_0x0268
            java.nio.ByteOrder r3 = r0.f6661f
            int r3 = r4.f(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x0268
        L_0x0264:
            r3 = 8
            r0.f6659c = r3
        L_0x0268:
            int r3 = r1.f6675i
            long r3 = (long) r3
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0272
        L_0x026f:
            r1.a(r5)
        L_0x0272:
            int r3 = r26 + 1
            short r3 = (short) r3
            r6 = r2
            r5 = r8
            r4 = r12
            r7 = 0
            r2 = r31
            r8 = r3
            r3 = r25
            goto L_0x002b
        L_0x0280:
            r12 = r4
            r2 = r6
            r21 = r13
            int r3 = r1.f6675i
            r4 = 4
            int r3 = r3 + r4
            if (r3 > r2) goto L_0x02cd
            int r3 = r30.readInt()
            if (r21 == 0) goto L_0x029f
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String.format(r5, r4)
        L_0x029f:
            long r4 = (long) r3
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x02cd
            if (r3 >= r2) goto L_0x02cd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r12.contains(r2)
            if (r2 != 0) goto L_0x02cd
            r1.a(r4)
            r2 = 4
            r3 = r15[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02c2
            r0.u(r1, r2)
            goto L_0x02cd
        L_0x02c2:
            r2 = r15[r14]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02cd
            r0.u(r1, r14)
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.u(r0.a$b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(r0.a.b r15) {
        /*
            r14 = this;
            java.util.HashMap<java.lang.String, r0.a$c>[] r0 = r14.f6660d
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            r0.a$c r1 = (r0.a.c) r1
            if (r1 == 0) goto L_0x00f6
            java.nio.ByteOrder r2 = r14.f6661f
            int r1 = r1.f(r2)
            r2 = 1
            r3 = 6
            if (r1 == r2) goto L_0x0020
            if (r1 == r3) goto L_0x00f6
            r4 = 7
            if (r1 == r4) goto L_0x0020
            goto L_0x00f9
        L_0x0020:
            java.lang.String r1 = "BitsPerSample"
            java.lang.Object r1 = r0.get(r1)
            r0.a$c r1 = (r0.a.c) r1
            r4 = 0
            if (r1 == 0) goto L_0x0065
            java.nio.ByteOrder r5 = r14.f6661f
            java.io.Serializable r1 = r1.h(r5)
            int[] r1 = (int[]) r1
            int[] r5 = f6649p
            boolean r6 = java.util.Arrays.equals(r5, r1)
            if (r6 == 0) goto L_0x003c
            goto L_0x0063
        L_0x003c:
            int r6 = r14.f6659c
            r7 = 3
            if (r6 != r7) goto L_0x0065
            java.lang.String r6 = "PhotometricInterpretation"
            java.lang.Object r6 = r0.get(r6)
            r0.a$c r6 = (r0.a.c) r6
            if (r6 == 0) goto L_0x0065
            java.nio.ByteOrder r7 = r14.f6661f
            int r6 = r6.f(r7)
            if (r6 != r2) goto L_0x005b
            int[] r7 = f6650q
            boolean r7 = java.util.Arrays.equals(r1, r7)
            if (r7 != 0) goto L_0x0063
        L_0x005b:
            if (r6 != r3) goto L_0x0065
            boolean r1 = java.util.Arrays.equals(r1, r5)
            if (r1 == 0) goto L_0x0065
        L_0x0063:
            r1 = r2
            goto L_0x0066
        L_0x0065:
            r1 = r4
        L_0x0066:
            if (r1 == 0) goto L_0x00f9
            java.lang.String r1 = "StripOffsets"
            java.lang.Object r1 = r0.get(r1)
            r0.a$c r1 = (r0.a.c) r1
            java.lang.String r3 = "StripByteCounts"
            java.lang.Object r0 = r0.get(r3)
            r0.a$c r0 = (r0.a.c) r0
            if (r1 == 0) goto L_0x00f9
            if (r0 == 0) goto L_0x00f9
            java.nio.ByteOrder r3 = r14.f6661f
            java.io.Serializable r1 = r1.h(r3)
            long[] r1 = c(r1)
            java.nio.ByteOrder r3 = r14.f6661f
            java.io.Serializable r0 = r0.h(r3)
            long[] r0 = c(r0)
            if (r1 == 0) goto L_0x00ee
            int r3 = r1.length
            if (r3 != 0) goto L_0x0096
            goto L_0x00ee
        L_0x0096:
            if (r0 == 0) goto L_0x00eb
            int r3 = r0.length
            if (r3 != 0) goto L_0x009c
            goto L_0x00eb
        L_0x009c:
            int r3 = r1.length
            int r5 = r0.length
            if (r3 == r5) goto L_0x00a3
            java.lang.String r14 = "stripOffsets and stripByteCounts should have same length."
            goto L_0x00f0
        L_0x00a3:
            int r3 = r0.length
            r5 = 0
            r7 = r4
        L_0x00a7:
            if (r7 >= r3) goto L_0x00af
            r8 = r0[r7]
            long r5 = r5 + r8
            int r7 = r7 + 1
            goto L_0x00a7
        L_0x00af:
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r14.f6662g = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00b7:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00e4
            r8 = r1[r5]
            int r8 = (int) r8
            r9 = r0[r5]
            int r9 = (int) r9
            int r10 = r1.length
            int r10 = r10 - r2
            if (r5 >= r10) goto L_0x00d1
            int r10 = r8 + r9
            long r10 = (long) r10
            int r12 = r5 + 1
            r12 = r1[r12]
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x00d1
            r14.f6662g = r4
        L_0x00d1:
            int r8 = r8 - r6
            long r10 = (long) r8
            r15.a(r10)
            int r6 = r6 + r8
            byte[] r8 = new byte[r9]
            r15.read(r8)
            int r6 = r6 + r9
            java.lang.System.arraycopy(r8, r4, r3, r7, r9)
            int r7 = r7 + r9
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00e4:
            boolean r14 = r14.f6662g
            if (r14 == 0) goto L_0x00f9
            r14 = r1[r4]
            goto L_0x00f9
        L_0x00eb:
            java.lang.String r14 = "stripByteCounts should not be null or have zero length."
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r14 = "stripOffsets should not be null or have zero length."
        L_0x00f0:
            java.lang.String r15 = "ExifInterface"
            android.util.Log.w(r15, r14)
            goto L_0x00f9
        L_0x00f6:
            r14.o(r15, r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.v(r0.a$b):void");
    }

    public final void w(int i8, int i9) {
        HashMap<String, c>[] hashMapArr = this.f6660d;
        if (!hashMapArr[i8].isEmpty() && !hashMapArr[i9].isEmpty()) {
            c cVar = hashMapArr[i8].get("ImageLength");
            c cVar2 = hashMapArr[i8].get("ImageWidth");
            c cVar3 = hashMapArr[i9].get("ImageLength");
            c cVar4 = hashMapArr[i9].get("ImageWidth");
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int f9 = cVar.f(this.f6661f);
                int f10 = cVar2.f(this.f6661f);
                int f11 = cVar3.f(this.f6661f);
                int f12 = cVar4.f(this.f6661f);
                if (f9 < f11 && f10 < f12) {
                    HashMap<String, c> hashMap = hashMapArr[i8];
                    hashMapArr[i8] = hashMapArr[i9];
                    hashMapArr[i9] = hashMap;
                }
            }
        }
    }

    public final void x(b bVar, int i8) {
        c cVar;
        String str;
        StringBuilder sb;
        c cVar2;
        c cVar3;
        HashMap<String, c>[] hashMapArr = this.f6660d;
        c cVar4 = hashMapArr[i8].get("DefaultCropSize");
        c cVar5 = hashMapArr[i8].get("SensorTopBorder");
        c cVar6 = hashMapArr[i8].get("SensorLeftBorder");
        c cVar7 = hashMapArr[i8].get("SensorBottomBorder");
        c cVar8 = hashMapArr[i8].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.f6676a == 5) {
                e[] eVarArr = (e[]) cVar4.h(this.f6661f);
                if (eVarArr == null || eVarArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    str = Arrays.toString(eVarArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.c(eVarArr[0], this.f6661f);
                cVar2 = c.c(eVarArr[1], this.f6661f);
            } else {
                int[] iArr = (int[]) cVar4.h(this.f6661f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                cVar3 = c.d(iArr[0], this.f6661f);
                cVar2 = c.d(iArr[1], this.f6661f);
            }
            hashMapArr[i8].put("ImageWidth", cVar3);
            hashMapArr[i8].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            c cVar9 = hashMapArr[i8].get("ImageLength");
            c cVar10 = hashMapArr[i8].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = hashMapArr[i8].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.f6661f), i8);
            }
        } else {
            int f9 = cVar5.f(this.f6661f);
            int f10 = cVar7.f(this.f6661f);
            int f11 = cVar8.f(this.f6661f);
            int f12 = cVar6.f(this.f6661f);
            if (f10 > f9 && f11 > f12) {
                c d9 = c.d(f10 - f9, this.f6661f);
                c d10 = c.d(f11 - f12, this.f6661f);
                hashMapArr[i8].put("ImageLength", d9);
                hashMapArr[i8].put("ImageWidth", d10);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap<String, c>[] hashMapArr = this.f6660d;
        c cVar = hashMapArr[1].get("PixelXDimension");
        c cVar2 = hashMapArr[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        p(hashMapArr[4]);
    }
}
