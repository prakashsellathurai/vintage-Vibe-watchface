package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import g1.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

public final class c extends a {

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f4492m = Charset.forName("UTF-16");

    /* renamed from: d  reason: collision with root package name */
    public final DataInputStream f4493d;
    public final DataOutputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final DataInputStream f4494f;

    /* renamed from: g  reason: collision with root package name */
    public DataOutputStream f4495g;

    /* renamed from: h  reason: collision with root package name */
    public b f4496h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4497i;

    /* renamed from: j  reason: collision with root package name */
    public int f4498j;

    /* renamed from: k  reason: collision with root package name */
    public int f4499k;

    /* renamed from: l  reason: collision with root package name */
    public int f4500l;

    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int read() {
            c cVar = c.this;
            int i8 = cVar.f4500l;
            if (i8 == -1 || cVar.f4498j < i8) {
                int read = super.read();
                cVar.f4498j++;
                return read;
            }
            throw new IOException();
        }

        public final int read(byte[] bArr, int i8, int i9) {
            c cVar = c.this;
            int i10 = cVar.f4500l;
            if (i10 == -1 || cVar.f4498j < i10) {
                int read = super.read(bArr, i8, i9);
                if (read > 0) {
                    cVar.f4498j += read;
                }
                return read;
            }
            throw new IOException();
        }

        public final long skip(long j8) {
            c cVar = c.this;
            int i8 = cVar.f4500l;
            if (i8 == -1 || cVar.f4498j < i8) {
                long skip = super.skip(j8);
                if (skip > 0) {
                    cVar.f4498j += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteArrayOutputStream f4502a;

        /* renamed from: b  reason: collision with root package name */
        public final DataOutputStream f4503b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4504c;

        /* renamed from: d  reason: collision with root package name */
        public final DataOutputStream f4505d;

        public b(int i8, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f4502a = byteArrayOutputStream;
            this.f4503b = new DataOutputStream(byteArrayOutputStream);
            this.f4504c = i8;
            this.f4505d = dataOutputStream;
        }
    }

    public c(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        this(fileInputStream, fileOutputStream, new p.a(), new p.a(), new p.a());
    }

    public c(InputStream inputStream, OutputStream outputStream, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4498j = 0;
        this.f4499k = -1;
        this.f4500l = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f4493d = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.e = dataOutputStream;
        this.f4494f = dataInputStream;
        this.f4495g = dataOutputStream;
    }

    public final String B() {
        DataInputStream dataInputStream = this.f4494f;
        try {
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            return new String(bArr, f4492m);
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final IBinder D() {
        return null;
    }

    public final void G(int i8) {
        a();
        b bVar = new b(i8, this.e);
        this.f4496h = bVar;
        this.f4495g = bVar.f4503b;
    }

    public final void H(boolean z8, boolean z9) {
        if (z8) {
            this.f4497i = z9;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public final void K(boolean z8) {
        try {
            this.f4495g.writeBoolean(z8);
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final void M(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f4495g.writeInt(keySet.size());
                for (String next : keySet) {
                    d0(next);
                    h0(bundle.get(next));
                }
            } catch (IOException e4) {
                throw new a.b(e4);
            }
        } else {
            this.f4495g.writeInt(-1);
        }
    }

    public final void N(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f4495g.writeInt(bArr.length);
                this.f4495g.write(bArr);
            } catch (IOException e4) {
                throw new a.b(e4);
            }
        } else {
            this.f4495g.writeInt(-1);
        }
    }

    public final void Q(CharSequence charSequence) {
        if (!this.f4497i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public final void S(float f9) {
        try {
            this.f4495g.writeFloat(f9);
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final void T(int i8) {
        try {
            this.f4495g.writeInt(i8);
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final void X(long j8) {
        try {
            this.f4495g.writeLong(j8);
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final void Z(Parcelable parcelable) {
        if (!this.f4497i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    public final void a() {
        b bVar = this.f4496h;
        if (bVar != null) {
            try {
                if (bVar.f4502a.size() != 0) {
                    b bVar2 = this.f4496h;
                    bVar2.f4503b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = bVar2.f4502a;
                    int size = byteArrayOutputStream.size();
                    int i8 = bVar2.f4504c << 16;
                    int i9 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = bVar2.f4505d;
                    dataOutputStream.writeInt(i8 | i9);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f4496h = null;
            } catch (IOException e4) {
                throw new a.b(e4);
            }
        }
    }

    public final a b() {
        return new c(this.f4494f, this.f4495g, this.f4482a, this.f4483b, this.f4484c);
    }

    public final void d0(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f4492m);
                this.f4495g.writeInt(bytes.length);
                this.f4495g.write(bytes);
            } catch (IOException e4) {
                throw new a.b(e4);
            }
        } else {
            this.f4495g.writeInt(-1);
        }
    }

    public final void e0(IBinder iBinder) {
        if (!this.f4497i) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public final boolean h() {
        try {
            return this.f4494f.readBoolean();
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final void h0(Object obj) {
        int i8 = 0;
        if (obj == null) {
            T(0);
        } else if (obj instanceof Bundle) {
            T(1);
            M((Bundle) obj);
        } else if (obj instanceof String) {
            T(3);
            d0((String) obj);
        } else if (obj instanceof String[]) {
            T(4);
            I((String[]) obj);
        } else if (obj instanceof Boolean) {
            T(5);
            K(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            T(6);
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            T(length);
            while (i8 < length) {
                T(zArr[i8] ? 1 : 0);
                i8++;
            }
        } else if (obj instanceof Double) {
            T(7);
            try {
                this.f4495g.writeDouble(((Double) obj).doubleValue());
            } catch (IOException e4) {
                throw new a.b(e4);
            }
        } else if (obj instanceof double[]) {
            T(8);
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            T(length2);
            while (i8 < length2) {
                try {
                    this.f4495g.writeDouble(dArr[i8]);
                    i8++;
                } catch (IOException e9) {
                    throw new a.b(e9);
                }
            }
        } else if (obj instanceof Integer) {
            T(9);
            T(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            T(10);
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            T(length3);
            while (i8 < length3) {
                T(iArr[i8]);
                i8++;
            }
        } else if (obj instanceof Long) {
            T(11);
            X(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            T(12);
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            T(length4);
            while (i8 < length4) {
                X(jArr[i8]);
                i8++;
            }
        } else if (obj instanceof Float) {
            T(13);
            S(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            T(14);
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            T(length5);
            while (i8 < length5) {
                S(fArr[i8]);
                i8++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    public final Bundle j() {
        boolean[] zArr;
        double[] dArr;
        int[] iArr;
        long[] jArr;
        float[] fArr;
        int s8 = s();
        if (s8 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i8 = 0; i8 < s8; i8++) {
            String B = B();
            int s9 = s();
            DataInputStream dataInputStream = this.f4494f;
            switch (s9) {
                case 0:
                    bundle.putParcelable(B, (Parcelable) null);
                    break;
                case 1:
                case 2:
                    bundle.putBundle(B, j());
                    break;
                case 3:
                    bundle.putString(B, B());
                    break;
                case 4:
                    bundle.putStringArray(B, (String[]) g(new String[0]));
                    break;
                case 5:
                    bundle.putBoolean(B, h());
                    break;
                case 6:
                    int s10 = s();
                    if (s10 < 0) {
                        zArr = null;
                    } else {
                        zArr = new boolean[s10];
                        for (int i9 = 0; i9 < s10; i9++) {
                            zArr[i9] = s() != 0;
                        }
                    }
                    bundle.putBooleanArray(B, zArr);
                    break;
                case 7:
                    try {
                        bundle.putDouble(B, dataInputStream.readDouble());
                        break;
                    } catch (IOException e4) {
                        throw new a.b(e4);
                    }
                case 8:
                    int s11 = s();
                    if (s11 < 0) {
                        dArr = null;
                    } else {
                        dArr = new double[s11];
                        int i10 = 0;
                        while (i10 < s11) {
                            try {
                                dArr[i10] = dataInputStream.readDouble();
                                i10++;
                            } catch (IOException e9) {
                                throw new a.b(e9);
                            }
                        }
                    }
                    bundle.putDoubleArray(B, dArr);
                    break;
                case 9:
                    bundle.putInt(B, s());
                    break;
                case 10:
                    int s12 = s();
                    if (s12 < 0) {
                        iArr = null;
                    } else {
                        iArr = new int[s12];
                        for (int i11 = 0; i11 < s12; i11++) {
                            iArr[i11] = s();
                        }
                    }
                    bundle.putIntArray(B, iArr);
                    break;
                case 11:
                    bundle.putLong(B, v());
                    break;
                case 12:
                    int s13 = s();
                    if (s13 < 0) {
                        jArr = null;
                    } else {
                        jArr = new long[s13];
                        for (int i12 = 0; i12 < s13; i12++) {
                            jArr[i12] = v();
                        }
                    }
                    bundle.putLongArray(B, jArr);
                    break;
                case 13:
                    bundle.putFloat(B, r());
                    break;
                case 14:
                    int s14 = s();
                    if (s14 < 0) {
                        fArr = null;
                    } else {
                        fArr = new float[s14];
                        for (int i13 = 0; i13 < s14; i13++) {
                            fArr[i13] = r();
                        }
                    }
                    bundle.putFloatArray(B, fArr);
                    break;
                default:
                    throw new RuntimeException("Unknown type " + s9);
            }
        }
        return bundle;
    }

    public final byte[] l() {
        DataInputStream dataInputStream = this.f4494f;
        try {
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final CharSequence n() {
        return null;
    }

    public final boolean q(int i8) {
        while (true) {
            try {
                int i9 = this.f4499k;
                if (i9 == i8) {
                    return true;
                }
                if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                    return false;
                }
                int i10 = this.f4498j;
                int i11 = this.f4500l;
                DataInputStream dataInputStream = this.f4493d;
                if (i10 < i11) {
                    dataInputStream.skip((long) (i11 - i10));
                }
                this.f4500l = -1;
                int readInt = dataInputStream.readInt();
                this.f4498j = 0;
                int i12 = readInt & 65535;
                if (i12 == 65535) {
                    i12 = dataInputStream.readInt();
                }
                this.f4499k = (readInt >> 16) & 65535;
                this.f4500l = i12;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public final float r() {
        try {
            return this.f4494f.readFloat();
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final int s() {
        try {
            return this.f4494f.readInt();
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final long v() {
        try {
            return this.f4494f.readLong();
        } catch (IOException e4) {
            throw new a.b(e4);
        }
    }

    public final <T extends Parcelable> T y() {
        return null;
    }
}
