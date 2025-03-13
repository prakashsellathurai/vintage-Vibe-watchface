package u1;

import android.os.Build;
import androidx.wear.watchface.style.data.UserStyleSchemaWireFormat;
import androidx.wear.watchface.style.data.UserStyleSettingWireFormat;
import h7.f;
import i7.i;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q7.k;
import u1.c;
import u1.m;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f7637a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7638b;

    public static final class a extends OutputStream {
        public final void write(int i8) {
        }
    }

    public static final class b extends q7.l implements p7.a<List<? extends m>> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List<m> f7639f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<? extends m> list) {
            super(0);
            this.f7639f = list;
        }

        public final Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (T next : this.f7639f) {
                if (!((m) next).f7648i) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public l(List<? extends m> list) {
        this.f7637a = list;
        this.f7638b = a1.a.z(new b(list));
        boolean z8 = false;
        int i8 = 0;
        int i9 = 1;
        for (m mVar : list) {
            int i10 = i9 + 1;
            c cVar = mVar.f7642b;
            if (cVar instanceof c.C0127c) {
                ((c.C0127c) cVar).d(i9);
            }
            c cVar2 = mVar.f7643c;
            if (cVar2 instanceof c.C0127c) {
                ((c.C0127c) cVar2).d(i9);
            }
            i8 = mVar instanceof m.c ? i8 + 1 : i8;
            for (m.h hVar : mVar.f7645f) {
                Iterator<m> it = hVar.f7695b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!list.contains(it.next())) {
                            throw new IllegalArgumentException("childSettings must be in the list of settings the UserStyleSchema is constructed with".toString());
                        }
                    }
                }
            }
            i9 = i10;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            f(d(), (m.c) null);
            return;
        }
        if (!(i8 <= 1 ? true : z8)) {
            throw new IllegalArgumentException("Prior to Android T, at most only one ComplicationSlotsUserStyleSetting is allowed".toString());
        }
    }

    public static m.c a(Collection collection, e eVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar instanceof m.c) {
                return (m.c) mVar;
            }
            Object obj = eVar.get(mVar);
            k.b(obj);
            m.c a9 = a(((m.h) obj).f7695b, eVar);
            if (a9 != null) {
                return a9;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, u1.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.util.Collection r4, u1.m.c r5) {
        /*
            java.util.Iterator r0 = r4.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            u1.m r1 = (u1.m) r1
            boolean r3 = r1 instanceof u1.m.c
            if (r3 == 0) goto L_0x0004
            if (r5 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 == 0) goto L_0x001d
            r5 = r1
            goto L_0x0004
        L_0x001d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "From Android T multiple ComplicationSlotsUserStyleSettings are allowed, but at most one can be active for any permutation of UserStyle. Note: "
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = " and "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x003d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0041:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r4.next()
            u1.m r0 = (u1.m) r0
            java.util.List<u1.m$h> r0 = r0.f7645f
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()
            u1.m$h r1 = (u1.m.h) r1
            java.util.Collection<u1.m> r3 = r1.f7695b
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0053
            r3 = r5
            u1.m$c r3 = (u1.m.c) r3
            java.util.Collection<u1.m> r1 = r1.f7695b
            f(r1, r3)
            goto L_0x0053
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.l.f(java.util.Collection, u1.m$c):void");
    }

    public final m.c.C0133c b(e eVar) {
        k.e(eVar, "userStyle");
        m.c a9 = a(d(), eVar);
        if (a9 == null) {
            return null;
        }
        Object obj = eVar.get(a9);
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ComplicationSlotsUserStyleSetting.ComplicationSlotsOption");
        return (m.c.C0133c) obj;
    }

    public final e c() {
        HashMap hashMap = new HashMap();
        for (m next : this.f7637a) {
            hashMap.put(next, next.f7645f.get(next.f7646g));
        }
        return new e(hashMap);
    }

    public final List<m> d() {
        return (List) this.f7638b.getValue();
    }

    public final UserStyleSchemaWireFormat e() {
        List<m> list = this.f7637a;
        ArrayList arrayList = new ArrayList(i7.f.M(list));
        for (m mVar : list) {
            UserStyleSettingWireFormat f9 = mVar.f();
            ArrayList arrayList2 = new ArrayList();
            for (m.h hVar : mVar.f7645f) {
                Iterator<m> it = hVar.f7695b.iterator();
                while (true) {
                    int i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    m next = it.next();
                    Iterator<m> it2 = list.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (k.a(it2.next(), next)) {
                            i8 = i9;
                            break;
                        } else {
                            i9++;
                        }
                    }
                    arrayList2.add(Integer.valueOf(i8));
                }
                arrayList2.add(-1);
            }
            f9.f2431m = arrayList2;
            arrayList.add(f9);
        }
        return new UserStyleSchemaWireFormat(arrayList);
    }

    public final String toString() {
        return "[" + i.W(this.f7637a, (String) null, (p7.l) null, 63) + ']';
    }
}
