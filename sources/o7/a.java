package o7;

import r7.b;
import r7.c;

public class a extends n7.a {

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    public static final class C0100a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f6194a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0018 }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x0018 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0018 }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0018
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0018 }
                goto L_0x0019
            L_0x0018:
                r1 = r0
            L_0x0019:
                if (r1 == 0) goto L_0x0027
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x0023
                r2 = 1
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                if (r2 == 0) goto L_0x0027
                r0 = r1
            L_0x0027:
                f6194a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.a.C0100a.<clinit>():void");
        }
    }

    public final c b() {
        Integer num = C0100a.f6194a;
        return num == null || num.intValue() >= 34 ? new s7.a() : new b();
    }
}
