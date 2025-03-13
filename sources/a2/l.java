package a2;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import f2.g;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public final class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f117a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f118b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f119c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f120d = new ArrayList();
    public final g e;

    public l(g gVar) {
        gVar.getClass();
        this.e = gVar;
    }

    @TargetApi(19)
    public final void b(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f118b;
        path.reset();
        Path path2 = this.f117a;
        path2.reset();
        ArrayList arrayList = this.f120d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path g9 = ((m) arrayList2.get(size2)).g();
                    b2.l lVar = dVar.f76k;
                    if (lVar != null) {
                        matrix2 = lVar.d();
                    } else {
                        matrix2 = dVar.f69c;
                        matrix2.reset();
                    }
                    g9.transform(matrix2);
                    path.addPath(g9);
                }
            } else {
                path.addPath(mVar.g());
            }
        }
        int i8 = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> e4 = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) e4;
                if (i8 >= arrayList3.size()) {
                    break;
                }
                Path g10 = ((m) arrayList3.get(i8)).g();
                b2.l lVar2 = dVar2.f76k;
                if (lVar2 != null) {
                    matrix = lVar2.d();
                } else {
                    matrix = dVar2.f69c;
                    matrix.reset();
                }
                g10.transform(matrix);
                path2.addPath(g10);
                i8++;
            }
        } else {
            path2.set(mVar2.g());
        }
        this.f119c.op(path2, path, op);
    }

    public final void d(List<c> list, List<c> list2) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f120d;
            if (i8 < arrayList.size()) {
                ((m) arrayList.get(i8)).d(list, list2);
                i8++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.ListIterator<a2.c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            a2.c r0 = (a2.c) r0
            boolean r1 = r0 instanceof a2.m
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = r2.f120d
            a2.m r0 = (a2.m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.l.e(java.util.ListIterator):void");
    }

    public final Path g() {
        Path.Op op;
        Path path = this.f119c;
        path.reset();
        g gVar = this.e;
        if (gVar.f4334b) {
            return path;
        }
        int b9 = s.g.b(gVar.f4333a);
        if (b9 == 0) {
            int i8 = 0;
            while (true) {
                ArrayList arrayList = this.f120d;
                if (i8 >= arrayList.size()) {
                    break;
                }
                path.addPath(((m) arrayList.get(i8)).g());
                i8++;
            }
        } else {
            if (b9 == 1) {
                op = Path.Op.UNION;
            } else if (b9 == 2) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (b9 == 3) {
                op = Path.Op.INTERSECT;
            } else if (b9 == 4) {
                op = Path.Op.XOR;
            }
            b(op);
        }
        return path;
    }
}
