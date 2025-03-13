package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3589a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f3590b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3591c;

    public interface a extends j<Boolean> {
    }

    public interface b extends j<Double> {
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T findValueByNumber(int i8);
    }

    public interface e {
        boolean isInRange(int i8);
    }

    public interface f extends j<Float> {
    }

    public interface g extends j<Integer> {
    }

    public static class h<F, T> extends AbstractList<T> {

        /* renamed from: f  reason: collision with root package name */
        public final List<F> f3592f;

        /* renamed from: g  reason: collision with root package name */
        public final a<F, T> f3593g;

        public interface a<F, T> {
            T convert(F f9);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f3592f = list;
            this.f3593g = aVar;
        }

        public final T get(int i8) {
            return this.f3593g.convert(this.f3592f.get(i8));
        }

        public final int size() {
            return this.f3592f.size();
        }
    }

    public interface i extends j<Long> {
    }

    public interface j<E> extends List<E>, RandomAccess {
        void a();

        j<E> b(int i8);

        boolean f();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3591c = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr, 0, 0, false);
    }

    public static int a(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        return ((r0) obj).toBuilder().mergeFrom((r0) obj2).buildPartial();
    }
}
