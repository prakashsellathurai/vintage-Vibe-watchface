package r1;

import android.graphics.drawable.Icon;
import i7.i;
import java.io.DataOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;
import n1.t0;
import q7.k;
import q7.l;
import u1.l;
import u1.m;
import u1.r;
import u1.s;

public final class a extends l implements p7.l<t0.b, byte[]> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6685f = new a();

    public a() {
        super(1);
    }

    public final Object invoke(Object obj) {
        Icon icon;
        t0.b bVar = (t0.b) obj;
        k.e(bVar, "it");
        u1.l lVar = bVar.f5739b.f7605a;
        lVar.getClass();
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        DigestOutputStream digestOutputStream = new DigestOutputStream(new l.a(), instance);
        for (m next : lVar.f7637a) {
            next.getClass();
            DataOutputStream dataOutputStream = new DataOutputStream(digestOutputStream);
            dataOutputStream.writeUTF(next.f7641a.f7683a);
            next.f7642b.b(dataOutputStream);
            next.f7643c.b(dataOutputStream);
            Icon icon2 = next.f7644d;
            if (icon2 != null) {
                r.c(icon2, dataOutputStream);
            }
            m.i iVar = next.e;
            if (!(iVar == null || (icon = iVar.f7697a) == null)) {
                r.c(icon, dataOutputStream);
            }
            for (m.h f9 : next.f7645f) {
                f9.f(dataOutputStream);
            }
            dataOutputStream.writeInt(next.f7646g);
            Collection<s> collection = next.f7647h;
            k.e(collection, "<this>");
            TreeSet treeSet = new TreeSet();
            i.a0(collection, treeSet);
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                dataOutputStream.writeInt(((s) it.next()).ordinal());
            }
            dataOutputStream.close();
        }
        byte[] digest = instance.digest();
        k.d(digest, "md.digest()");
        return digest;
    }
}
