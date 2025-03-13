package l1;

import m1.a0;
import m1.d0;
import m1.i0;
import m1.j0;
import m1.k0;
import m1.m0;
import m1.n0;
import m1.q0;
import m1.r0;
import m1.s0;
import m1.t0;

public final class e {

    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final m1.g f5235a;

        public a(m1.g gVar) {
            this.f5235a = gVar;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.z((m1.a0) P.f2202g, this.f5235a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimatableDynamicFloat{input=");
            m1.g gVar = this.f5235a;
            b bVar = null;
            sb.append(gVar.x() ? e.c(gVar.v()) : null);
            sb.append(", animationSpec=");
            if (gVar.w()) {
                bVar = new b(gVar.t());
            }
            sb.append(bVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class a0 implements p {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f5236a;

        public a0(k0 k0Var) {
            this.f5236a = k0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LogicalBoolOp{inputLhs=");
            k0 k0Var = this.f5236a;
            p pVar = null;
            sb.append(k0Var.x() ? e.a(k0Var.u()) : null);
            sb.append(", inputRhs=");
            if (k0Var.y()) {
                pVar = e.a(k0Var.v());
            }
            sb.append(pVar);
            sb.append(", operationType=");
            sb.append(k0Var.w().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class b implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.h f5237a;

        public b(m1.h hVar) {
            this.f5237a = hVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimatableDynamicInt32{input=");
            m1.h hVar = this.f5237a;
            b bVar = null;
            sb.append(hVar.x() ? e.e(hVar.v()) : null);
            sb.append(", animationSpec=");
            if (hVar.w()) {
                bVar = new b(hVar.t());
            }
            sb.append(bVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class b0 implements p {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f5238a;

        public b0(m0 m0Var) {
            this.f5238a = m0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotBoolOp{input=");
            m0 m0Var = this.f5238a;
            sb.append(m0Var.v() ? e.a(m0Var.u()) : null);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        public final m1.i f5239a;

        public c(m1.i iVar) {
            this.f5239a = iVar;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.y((m1.a0) P.f2202g, this.f5239a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimatableFixedFloat{fromValue=");
            m1.i iVar = this.f5239a;
            sb.append(iVar.v());
            sb.append(", toValue=");
            sb.append(iVar.w());
            sb.append(", animationSpec=");
            sb.append(iVar.x() ? new b(iVar.t()) : null);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class c0 implements t {

        /* renamed from: a  reason: collision with root package name */
        public final n0 f5240a;

        public c0(n0 n0Var) {
            this.f5240a = n0Var;
        }

        public final String toString() {
            return "PlatformInt32Source{sourceType=" + this.f5240a.u().getNumber() + "}";
        }
    }

    public static final class d implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.j f5241a;

        public d(m1.j jVar) {
            this.f5241a = jVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimatableFixedInt32{fromValue=");
            m1.j jVar = this.f5241a;
            sb.append(jVar.v());
            sb.append(", toValue=");
            sb.append(jVar.w());
            sb.append(", animationSpec=");
            sb.append(jVar.x() ? new b(jVar.t()) : null);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class d0 implements s {
        public final String toString() {
            return "PlatformTimeSource";
        }
    }

    /* renamed from: l1.e$e  reason: collision with other inner class name */
    public static final class C0075e implements r {

        /* renamed from: a  reason: collision with root package name */
        public final m1.k f5242a;

        public C0075e(m1.k kVar) {
            this.f5242a = kVar;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.u((m1.a0) P.f2202g, this.f5242a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArithmeticFloatOp{inputLhs=");
            m1.k kVar = this.f5242a;
            r rVar = null;
            sb.append(kVar.x() ? e.c(kVar.u()) : null);
            sb.append(", inputRhs=");
            if (kVar.y()) {
                rVar = e.c(kVar.v());
            }
            sb.append(rVar);
            sb.append(", operationType=");
            sb.append(kVar.w().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class e0 implements p {

        /* renamed from: a  reason: collision with root package name */
        public final q0 f5243a;

        public e0(q0 q0Var) {
            this.f5243a = q0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateBoolSource{sourceKey=");
            q0 q0Var = this.f5243a;
            sb.append(q0Var.u());
            sb.append(", sourceNamespace=");
            sb.append(q0Var.v());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class f implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.l f5244a;

        public f(m1.l lVar) {
            this.f5244a = lVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArithmeticInt32Op{inputLhs=");
            m1.l lVar = this.f5244a;
            t tVar = null;
            sb.append(lVar.x() ? e.e(lVar.u()) : null);
            sb.append(", inputRhs=");
            if (lVar.y()) {
                tVar = e.e(lVar.v());
            }
            sb.append(tVar);
            sb.append(", operationType=");
            sb.append(lVar.w().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class f0 implements r {

        /* renamed from: a  reason: collision with root package name */
        public final r0 f5245a;

        public f0(r0 r0Var) {
            this.f5245a = r0Var;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.w((m1.a0) P.f2202g, this.f5245a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateFloatSource{sourceKey=");
            r0 r0Var = this.f5245a;
            sb.append(r0Var.u());
            sb.append(", sourceNamespace=");
            sb.append(r0Var.v());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class g implements q {

        /* renamed from: a  reason: collision with root package name */
        public final m1.n f5246a;

        public g(m1.n nVar) {
            this.f5246a = nVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetweenDuration{startInclusive=");
            m1.n nVar = this.f5246a;
            s sVar = null;
            sb.append(nVar.x() ? e.d(nVar.v()) : null);
            sb.append(", endExclusive=");
            if (nVar.w()) {
                sVar = e.d(nVar.u());
            }
            sb.append(sVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class g0 implements t {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f5247a;

        public g0(s0 s0Var) {
            this.f5247a = s0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateInt32Source{sourceKey=");
            s0 s0Var = this.f5247a;
            sb.append(s0Var.u());
            sb.append(", sourceNamespace=");
            sb.append(s0Var.v());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class h implements p {

        /* renamed from: a  reason: collision with root package name */
        public final m1.o f5248a;

        public h(m1.o oVar) {
            this.f5248a = oVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ComparisonFloatOp{inputLhs=");
            m1.o oVar = this.f5248a;
            r rVar = null;
            sb.append(oVar.x() ? e.c(oVar.u()) : null);
            sb.append(", inputRhs=");
            if (oVar.y()) {
                rVar = e.c(oVar.v());
            }
            sb.append(rVar);
            sb.append(", operationType=");
            sb.append(oVar.w().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class h0 implements u {

        /* renamed from: a  reason: collision with root package name */
        public final t0 f5249a;

        public h0(t0 t0Var) {
            this.f5249a = t0Var;
        }

        public final m1.d0 b() {
            d0.a M = m1.d0.M();
            M.e();
            m1.d0.v((m1.d0) M.f2202g, this.f5249a);
            return (m1.d0) M.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateStringSource{sourceKey=");
            t0 t0Var = this.f5249a;
            sb.append(t0Var.u());
            sb.append(", sourceNamespace=");
            sb.append(t0Var.v());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class i implements p {

        /* renamed from: a  reason: collision with root package name */
        public final m1.p f5250a;

        public i(m1.p pVar) {
            this.f5250a = pVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ComparisonInt32Op{inputLhs=");
            m1.p pVar = this.f5250a;
            t tVar = null;
            sb.append(pVar.x() ? e.e(pVar.u()) : null);
            sb.append(", inputRhs=");
            if (pVar.y()) {
                tVar = e.e(pVar.v());
            }
            sb.append(tVar);
            sb.append(", operationType=");
            sb.append(pVar.w().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class j implements u {

        /* renamed from: a  reason: collision with root package name */
        public final m1.r f5251a;

        public j(m1.r rVar) {
            this.f5251a = rVar;
        }

        public final m1.d0 b() {
            d0.a M = m1.d0.M();
            M.e();
            m1.d0.x((m1.d0) M.f2202g, this.f5251a);
            return (m1.d0) M.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConcatStringOp{inputLhs=");
            m1.r rVar = this.f5251a;
            u uVar = null;
            sb.append(rVar.w() ? e.f(rVar.u()) : null);
            sb.append(", inputRhs=");
            if (rVar.x()) {
                uVar = e.f(rVar.v());
            }
            sb.append(uVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class k implements q {

        /* renamed from: a  reason: collision with root package name */
        public final m1.s f5252a;

        public k(m1.s sVar) {
            this.f5252a = sVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionalDurationOp{condition=");
            m1.s sVar = this.f5252a;
            q qVar = null;
            sb.append(sVar.x() ? e.a(sVar.t()) : null);
            sb.append(", valueIfTrue=");
            sb.append(sVar.z() ? e.b(sVar.w()) : null);
            sb.append(", valueIfFalse=");
            if (sVar.y()) {
                qVar = e.b(sVar.v());
            }
            sb.append(qVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class l implements r {

        /* renamed from: a  reason: collision with root package name */
        public final m1.t f5253a;

        public l(m1.t tVar) {
            this.f5253a = tVar;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.x((m1.a0) P.f2202g, this.f5253a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionalFloatOp{condition=");
            m1.t tVar = this.f5253a;
            r rVar = null;
            sb.append(tVar.x() ? e.a(tVar.t()) : null);
            sb.append(", valueIfTrue=");
            sb.append(tVar.z() ? e.c(tVar.w()) : null);
            sb.append(", valueIfFalse=");
            if (tVar.y()) {
                rVar = e.c(tVar.v());
            }
            sb.append(rVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class m implements s {

        /* renamed from: a  reason: collision with root package name */
        public final m1.u f5254a;

        public m(m1.u uVar) {
            this.f5254a = uVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionalInstantOp{condition=");
            m1.u uVar = this.f5254a;
            s sVar = null;
            sb.append(uVar.x() ? e.a(uVar.t()) : null);
            sb.append(", valueIfTrue=");
            sb.append(uVar.z() ? e.d(uVar.w()) : null);
            sb.append(", valueIfFalse=");
            if (uVar.y()) {
                sVar = e.d(uVar.v());
            }
            sb.append(sVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class n implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.v f5255a;

        public n(m1.v vVar) {
            this.f5255a = vVar;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionalInt32Op{condition=");
            m1.v vVar = this.f5255a;
            t tVar = null;
            sb.append(vVar.x() ? e.a(vVar.t()) : null);
            sb.append(", valueIfTrue=");
            sb.append(vVar.z() ? e.e(vVar.w()) : null);
            sb.append(", valueIfFalse=");
            if (vVar.y()) {
                tVar = e.e(vVar.v());
            }
            sb.append(tVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class o implements u {

        /* renamed from: a  reason: collision with root package name */
        public final m1.w f5256a;

        public o(m1.w wVar) {
            this.f5256a = wVar;
        }

        public final m1.d0 b() {
            d0.a M = m1.d0.M();
            M.e();
            m1.d0.w((m1.d0) M.f2202g, this.f5256a);
            return (m1.d0) M.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConditionalStringOp{condition=");
            m1.w wVar = this.f5256a;
            u uVar = null;
            sb.append(wVar.x() ? e.a(wVar.t()) : null);
            sb.append(", valueIfTrue=");
            sb.append(wVar.z() ? e.f(wVar.w()) : null);
            sb.append(", valueIfFalse=");
            if (wVar.y()) {
                uVar = e.f(wVar.v());
            }
            sb.append(uVar);
            sb.append("}");
            return sb.toString();
        }
    }

    public interface p {
    }

    public interface q {
    }

    public interface r {
        byte[] a() {
            return b().g();
        }

        m1.a0 b();
    }

    public interface s {
    }

    public interface t {
    }

    public interface u {
        byte[] a() {
            return b().g();
        }

        m1.d0 b();
    }

    public static final class v implements u {

        /* renamed from: a  reason: collision with root package name */
        public final m1.e0 f5257a;

        public v(m1.e0 e0Var) {
            this.f5257a = e0Var;
        }

        public final m1.d0 b() {
            d0.a M = m1.d0.M();
            M.e();
            m1.d0.y((m1.d0) M.f2202g, this.f5257a);
            return (m1.d0) M.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FloatFormatOp{input=");
            m1.e0 e0Var = this.f5257a;
            sb.append(e0Var.z() ? e.c(e0Var.v()) : null);
            sb.append(", maxFractionDigits=");
            sb.append(e0Var.w());
            sb.append(", minFractionDigits=");
            sb.append(e0Var.x());
            sb.append(", minIntegerDigits=");
            sb.append(e0Var.y());
            sb.append(", groupingUsed=");
            sb.append(e0Var.u());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class w implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.f0 f5258a;

        public w(m1.f0 f0Var) {
            this.f5258a = f0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FloatToInt32Op{input=");
            m1.f0 f0Var = this.f5258a;
            sb.append(f0Var.w() ? e.c(f0Var.u()) : null);
            sb.append(", roundMode=");
            sb.append(f0Var.v().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class x implements t {

        /* renamed from: a  reason: collision with root package name */
        public final m1.h0 f5259a;

        public x(m1.h0 h0Var) {
            this.f5259a = h0Var;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GetDurationPartOp{input=");
            m1.h0 h0Var = this.f5259a;
            sb.append(h0Var.w() ? e.b(h0Var.v()) : null);
            sb.append(", durationPart=");
            sb.append(h0Var.u().getNumber());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class y implements u {

        /* renamed from: a  reason: collision with root package name */
        public final i0 f5260a;

        public y(i0 i0Var) {
            this.f5260a = i0Var;
        }

        public final m1.d0 b() {
            d0.a M = m1.d0.M();
            M.e();
            m1.d0.u((m1.d0) M.f2202g, this.f5260a);
            return (m1.d0) M.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Int32FormatOp{input=");
            i0 i0Var = this.f5260a;
            sb.append(i0Var.x() ? e.e(i0Var.v()) : null);
            sb.append(", minIntegerDigits=");
            sb.append(i0Var.w());
            sb.append(", groupingUsed=");
            sb.append(i0Var.u());
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class z implements r {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f5261a;

        public z(j0 j0Var) {
            this.f5261a = j0Var;
        }

        public final m1.a0 b() {
            a0.a P = m1.a0.P();
            P.e();
            m1.a0.v((m1.a0) P.f2202g, this.f5261a);
            return (m1.a0) P.c();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Int32ToFloatOp{input=");
            j0 j0Var = this.f5261a;
            sb.append(j0Var.v() ? e.e(j0Var.u()) : null);
            sb.append("}");
            return sb.toString();
        }
    }

    public static p a(m1.y yVar) {
        if (yVar.A()) {
            return new f(yVar.u());
        }
        if (yVar.F()) {
            return new e0(yVar.z());
        }
        if (yVar.C()) {
            return new i(yVar.w());
        }
        if (yVar.E()) {
            return new b0(yVar.y());
        }
        if (yVar.D()) {
            return new a0(yVar.x());
        }
        if (yVar.B()) {
            return new h(yVar.v());
        }
        throw new IllegalStateException("Proto was not a recognised instance of DynamicBool");
    }

    public static q b(m1.z zVar) {
        if (zVar.x()) {
            return new g(zVar.t());
        }
        if (zVar.z()) {
            return new g(zVar.w());
        }
        if (zVar.y()) {
            return new k(zVar.u());
        }
        throw new IllegalStateException("Proto was not a recognised instance of DynamicDuration");
    }

    public static r c(m1.a0 a0Var) {
        if (a0Var.M()) {
            return new h(a0Var.F());
        }
        if (a0Var.K()) {
            return new C0075e(a0Var.C());
        }
        if (a0Var.N()) {
            return new z(a0Var.G());
        }
        if (a0Var.O()) {
            return new f0(a0Var.H());
        }
        if (a0Var.L()) {
            return new l(a0Var.D());
        }
        if (a0Var.J()) {
            return new c(a0Var.B());
        }
        if (a0Var.I()) {
            return new a(a0Var.A());
        }
        throw new IllegalStateException("Proto was not a recognised instance of DynamicFloat");
    }

    public static s d(m1.b0 b0Var) {
        if (b0Var.y()) {
            return new i(b0Var.v());
        }
        if (b0Var.z()) {
            b0Var.w();
            return new d0();
        } else if (b0Var.x()) {
            return new m(b0Var.t());
        } else {
            throw new IllegalStateException("Proto was not a recognised instance of DynamicInstant");
        }
    }

    public static t e(m1.c0 c0Var) {
        if (c0Var.I()) {
            return new j(c0Var.z());
        }
        if (c0Var.K()) {
            return new c0(c0Var.B());
        }
        if (c0Var.F()) {
            return new f(c0Var.v());
        }
        if (c0Var.L()) {
            return new g0(c0Var.C());
        }
        if (c0Var.G()) {
            return new n(c0Var.w());
        }
        if (c0Var.J()) {
            return new w(c0Var.A());
        }
        if (c0Var.H()) {
            return new x(c0Var.y());
        }
        if (c0Var.E()) {
            return new d(c0Var.u());
        }
        if (c0Var.D()) {
            return new b(c0Var.t());
        }
        throw new IllegalStateException("Proto was not a recognised instance of DynamicInt32");
    }

    public static u f(m1.d0 d0Var) {
        if (d0Var.I()) {
            return new k(d0Var.C());
        }
        if (d0Var.K()) {
            return new y(d0Var.E());
        }
        if (d0Var.L()) {
            return new h0(d0Var.F());
        }
        if (d0Var.H()) {
            return new o(d0Var.A());
        }
        if (d0Var.G()) {
            return new j(d0Var.z());
        }
        if (d0Var.J()) {
            return new v(d0Var.D());
        }
        throw new IllegalStateException("Proto was not a recognised instance of DynamicString");
    }
}
