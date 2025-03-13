package r2;

import com.bumptech.glide.load.data.e;
import i0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.a;
import p2.g;
import r2.j;

public final class t<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final d<List<Throwable>> f6897a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f6898b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6899c;

    public t(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f6897a = cVar;
        if (!list.isEmpty()) {
            this.f6898b = list;
            this.f6899c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final v a(int i8, int i9, g gVar, e eVar, j.b bVar) {
        v vVar;
        d<List<Throwable>> dVar = this.f6897a;
        List<Throwable> b9 = dVar.b();
        k3.j.l(b9);
        List list = b9;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.f6898b;
            int size = list2.size();
            vVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                vVar = ((k) list2.get(i10)).a(i8, i9, gVar, eVar, bVar);
                if (vVar != null) {
                    break;
                }
            }
        } catch (r e) {
            list.add(e);
        } catch (Throwable th) {
            dVar.a(list);
            throw th;
        }
        if (vVar != null) {
            dVar.a(list);
            return vVar;
        }
        throw new r(this.f6899c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6898b.toArray()) + '}';
    }
}
