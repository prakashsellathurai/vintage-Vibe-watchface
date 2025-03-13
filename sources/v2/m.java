package v2;

import java.util.ArrayDeque;
import k3.k;

public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f7879a = new l();

    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f7880d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f7881a;

        /* renamed from: b  reason: collision with root package name */
        public int f7882b;

        /* renamed from: c  reason: collision with root package name */
        public A f7883c;

        static {
            char[] cArr = k.f5169a;
        }

        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f7880d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f7883c = obj;
            aVar.f7882b = 0;
            aVar.f7881a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7882b == aVar.f7882b && this.f7881a == aVar.f7881a && this.f7883c.equals(aVar.f7883c);
        }

        public final int hashCode() {
            return (((this.f7881a * 31) + this.f7882b) * 31) + this.f7883c.hashCode();
        }
    }
}
