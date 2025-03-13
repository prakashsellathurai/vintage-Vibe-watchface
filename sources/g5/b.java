package g5;

import sun.misc.Unsafe;

public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j8, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j8, obj2, obj3)) {
            if (unsafe.getObject(obj, j8) != obj2) {
                return false;
            }
        }
        return true;
    }
}
