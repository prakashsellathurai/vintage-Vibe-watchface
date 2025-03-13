package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.C0042a;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.l;
import com.google.protobuf.r0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0042a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C0042a.addAll(iterable, (List) collection);
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C0042a.addAll(iterable, list);
    }

    public static void checkByteStringIsUtf8(i iVar) {
        if (!iVar.o()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(f1 f1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int e = f1Var.e(this);
        setMemoizedSerializedSize(e);
        return e;
    }

    public l1 newUninitializedMessageException() {
        return new l1();
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i8) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = l.f3712b;
            l.b bVar = new l.b(bArr, serializedSize);
            writeTo(bVar);
            if (bVar.d0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public i toByteString() {
        try {
            int serializedSize = getSerializedSize();
            i.f fVar = i.f3648g;
            byte[] bArr = new byte[serializedSize];
            Logger logger = l.f3712b;
            l.b bVar = new l.b(bArr, serializedSize);
            writeTo(bVar);
            if (bVar.d0() == 0) {
                return new i.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int D = l.D(serializedSize) + serializedSize;
        if (D > 4096) {
            D = 4096;
        }
        l.d dVar = new l.d(outputStream, D);
        dVar.a0(serializedSize);
        writeTo(dVar);
        if (dVar.f3716f > 0) {
            dVar.i0();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = l.f3712b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        l.d dVar = new l.d(outputStream, serializedSize);
        writeTo(dVar);
        if (dVar.f3716f > 0) {
            dVar.i0();
        }
    }

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0042a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0042a<MessageType, BuilderType>> implements r0.a {

        /* renamed from: com.google.protobuf.a$a$a  reason: collision with other inner class name */
        public static final class C0043a extends FilterInputStream {

            /* renamed from: f  reason: collision with root package name */
            public int f3588f;

            public C0043a(int i8, InputStream inputStream) {
                super(inputStream);
                this.f3588f = i8;
            }

            public final int available() {
                return Math.min(super.available(), this.f3588f);
            }

            public final int read() {
                if (this.f3588f <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f3588f--;
                }
                return read;
            }

            public final int read(byte[] bArr, int i8, int i9) {
                int i10 = this.f3588f;
                if (i10 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i8, Math.min(i9, i10));
                if (read >= 0) {
                    this.f3588f -= read;
                }
                return read;
            }

            public final long skip(long j8) {
                long skip = super.skip(Math.min(j8, (long) this.f3588f));
                if (skip >= 0) {
                    this.f3588f = (int) (((long) this.f3588f) - skip);
                }
                return skip;
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll(iterable, (List) collection);
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = a0.f3589a;
            iterable.getClass();
            if (iterable instanceof g0) {
                List<?> e = ((g0) iterable).e();
                g0 g0Var = (g0) list;
                int size = list.size();
                for (Object next : e) {
                    if (next == null) {
                        String str = "Element at index " + (g0Var.size() - size) + " is null.";
                        for (int size2 = g0Var.size() - 1; size2 >= size; size2--) {
                            g0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof i) {
                        g0Var.h((i) next);
                    } else {
                        g0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof a1) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static l1 newUninitializedMessageException(r0 r0Var) {
            return new l1();
        }

        public abstract BuilderType clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, q.a());
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, q qVar) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0043a(j.t(read, inputStream), inputStream), qVar);
            return true;
        }

        public BuilderType mergeFrom(i iVar) {
            try {
                j p8 = iVar.p();
                mergeFrom(p8);
                p8.a(0);
                return this;
            } catch (b0 e) {
                throw e;
            } catch (IOException e4) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e4);
            }
        }

        public BuilderType mergeFrom(i iVar, q qVar) {
            try {
                j p8 = iVar.p();
                mergeFrom(p8, qVar);
                p8.a(0);
                return this;
            } catch (b0 e) {
                throw e;
            } catch (IOException e4) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e4);
            }
        }

        public BuilderType mergeFrom(j jVar) {
            return mergeFrom(jVar, q.a());
        }

        public abstract BuilderType mergeFrom(j jVar, q qVar);

        public BuilderType mergeFrom(r0 r0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(r0Var)) {
                return internalMergeFrom((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public BuilderType mergeFrom(InputStream inputStream) {
            j g9 = j.g(inputStream);
            mergeFrom(g9);
            g9.a(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, q qVar) {
            j g9 = j.g(inputStream);
            mergeFrom(g9, qVar);
            g9.a(0);
            return this;
        }

        public BuilderType mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public BuilderType mergeFrom(byte[] bArr, int i8, int i9) {
            try {
                j.a f9 = j.f(bArr, i8, i9, false);
                mergeFrom((j) f9);
                f9.a(0);
                return this;
            } catch (b0 e) {
                throw e;
            } catch (IOException e4) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e4);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, q qVar) {
            return mergeFrom(bArr, 0, bArr.length, qVar);
        }

        public BuilderType mergeFrom(byte[] bArr, int i8, int i9, q qVar) {
            try {
                j.a f9 = j.f(bArr, i8, i9, false);
                mergeFrom((j) f9, qVar);
                f9.a(0);
                return this;
            } catch (b0 e) {
                throw e;
            } catch (IOException e4) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e4);
            }
        }
    }
}
