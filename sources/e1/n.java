package e1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4220a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f4221b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f4222c = new ArrayList<>();

    @Deprecated
    public n() {
    }

    public n(View view) {
        this.f4221b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (e1.n) r3;
        r0 = r3.f4221b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof e1.n
            if (r0 == 0) goto L_0x0018
            e1.n r3 = (e1.n) r3
            android.view.View r0 = r3.f4221b
            android.view.View r1 = r2.f4221b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r2 = r2.f4220a
            java.util.HashMap r3 = r3.f4220a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f4221b.hashCode() * 31) + this.f4220a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4221b + "\n") + "    values:";
        HashMap hashMap = this.f4220a;
        for (String str2 : hashMap.keySet()) {
            str = str + "    " + str2 + ": " + hashMap.get(str2) + "\n";
        }
        return str;
    }
}
