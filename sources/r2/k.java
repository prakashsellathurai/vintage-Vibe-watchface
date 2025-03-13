package r2;

import android.util.Log;
import c3.b;
import com.bumptech.glide.load.data.e;
import i0.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l3.a;
import p2.g;
import p2.i;

public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f6819a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends i<DataType, ResourceType>> f6820b;

    /* renamed from: c  reason: collision with root package name */
    public final b<ResourceType, Transcode> f6821c;

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f6822d;
    public final String e;

    public k(Class cls, Class cls2, Class cls3, List list, b bVar, a.c cVar) {
        this.f6819a = cls;
        this.f6820b = list;
        this.f6821c = bVar;
        this.f6822d = cVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: r2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: r2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: r2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: r2.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: r2.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: r2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: r2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: r2.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: r2.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: r2.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r2.v a(int r17, int r18, p2.g r19, com.bumptech.glide.load.data.e r20, r2.j.b r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r21
            i0.d<java.util.List<java.lang.Throwable>> r8 = r0.f6822d
            java.lang.Object r1 = r8.b()
            k3.j.l(r1)
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r16
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r9
            r2.v r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x012a }
            r8.a(r9)
            r2.j r2 = r2.j.this
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r11 = r3.getClass()
            p2.a r3 = p2.a.f6297i
            p2.a r4 = r7.f6804a
            r2.i<R> r5 = r2.f6786f
            r6 = 0
            if (r4 == r3) goto L_0x0049
            p2.k r3 = r5.e(r11)
            com.bumptech.glide.f r7 = r2.f6793m
            int r8 = r2.f6797q
            int r9 = r2.r
            r2.v r7 = r3.b(r7, r1, r8, r9)
            r10 = r3
            r3 = r7
            goto L_0x004b
        L_0x0049:
            r3 = r1
            r10 = r6
        L_0x004b:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L_0x0054
            r1.d()
        L_0x0054:
            com.bumptech.glide.f r1 = r5.f6772c
            com.bumptech.glide.i r1 = r1.f2922b
            f3.d r1 = r1.f2939d
            java.lang.Class r7 = r3.c()
            p2.j r1 = r1.a(r7)
            r13 = 0
            r14 = 1
            if (r1 == 0) goto L_0x0068
            r1 = r14
            goto L_0x0069
        L_0x0068:
            r1 = r13
        L_0x0069:
            if (r1 == 0) goto L_0x008f
            com.bumptech.glide.f r1 = r5.f6772c
            com.bumptech.glide.i r1 = r1.f2922b
            r1.getClass()
            java.lang.Class r6 = r3.c()
            f3.d r1 = r1.f2939d
            p2.j r6 = r1.a(r6)
            if (r6 == 0) goto L_0x0085
            p2.g r1 = r2.f6799t
            p2.c r1 = r6.h(r1)
            goto L_0x0091
        L_0x0085:
            com.bumptech.glide.i$d r0 = new com.bumptech.glide.i$d
            java.lang.Class r1 = r3.c()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            p2.c r1 = p2.c.f6305h
        L_0x0091:
            r15 = r6
            p2.e r6 = r2.B
            java.util.ArrayList r7 = r5.b()
            int r8 = r7.size()
            r9 = r13
        L_0x009d:
            if (r9 >= r8) goto L_0x00b2
            java.lang.Object r12 = r7.get(r9)
            v2.n$a r12 = (v2.n.a) r12
            p2.e r12 = r12.f7884a
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x00af
            r6 = r14
            goto L_0x00b3
        L_0x00af:
            int r9 = r9 + 1
            goto L_0x009d
        L_0x00b2:
            r6 = r13
        L_0x00b3:
            r6 = r6 ^ r14
            r2.l r7 = r2.f6798s
            boolean r4 = r7.d(r6, r4, r1)
            if (r4 == 0) goto L_0x0121
            if (r15 == 0) goto L_0x0113
            int r4 = r1.ordinal()
            if (r4 == 0) goto L_0x00ef
            if (r4 != r14) goto L_0x00db
            r2.x r1 = new r2.x
            com.bumptech.glide.f r4 = r5.f6772c
            s2.b r5 = r4.f2921a
            p2.e r6 = r2.B
            p2.e r7 = r2.f6794n
            int r8 = r2.f6797q
            int r9 = r2.r
            p2.g r12 = r2.f6799t
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00f8
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown strategy: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            r2.f r1 = new r2.f
            p2.e r4 = r2.B
            p2.e r5 = r2.f6794n
            r1.<init>(r4, r5)
        L_0x00f8:
            l3.a$c r4 = r2.u.f6900j
            java.lang.Object r4 = r4.b()
            r2.u r4 = (r2.u) r4
            k3.j.l(r4)
            r4.f6904i = r13
            r4.f6903h = r14
            r4.f6902g = r3
            r2.j$c<?> r2 = r2.f6791k
            r2.f6806a = r1
            r2.f6807b = r15
            r2.f6808c = r4
            r3 = r4
            goto L_0x0121
        L_0x0113:
            com.bumptech.glide.i$d r0 = new com.bumptech.glide.i$d
            java.lang.Object r1 = r3.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            c3.b<ResourceType, Transcode> r0 = r0.f6821c
            r1 = r19
            r2.v r0 = r0.e(r3, r1)
            return r0
        L_0x012a:
            r0 = move-exception
            r1 = r0
            r8.a(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.k.a(int, int, p2.g, com.bumptech.glide.load.data.e, r2.j$b):r2.v");
    }

    public final v<ResourceType> b(e<DataType> eVar, int i8, int i9, g gVar, List<Throwable> list) {
        List<? extends i<DataType, ResourceType>> list2 = this.f6820b;
        int size = list2.size();
        v<ResourceType> vVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) list2.get(i10);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    vVar = iVar.b(eVar.a(), i8, i9, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(iVar);
                }
                list.add(e4);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new r(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f6819a + ", decoders=" + this.f6820b + ", transcoder=" + this.f6821c + '}';
    }
}
