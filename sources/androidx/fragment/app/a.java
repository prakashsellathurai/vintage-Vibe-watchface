package androidx.fragment.app;

import androidx.fragment.app.b0;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.lifecycle.m;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

public final class a extends j0 implements b0.n {

    /* renamed from: q  reason: collision with root package name */
    public final b0 f1082q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public int f1083s;

    public a(b0 b0Var) {
        b0Var.F();
        y<?> yVar = b0Var.f1114o;
        if (yVar != null) {
            yVar.f1360b.getClassLoader();
        }
        this.f1083s = -1;
        this.f1082q = b0Var;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (b0.H(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1197g) {
            return true;
        }
        b0 b0Var = this.f1082q;
        if (b0Var.f1104d == null) {
            b0Var.f1104d = new ArrayList<>();
        }
        b0Var.f1104d.add(this);
        return true;
    }

    public final void c(int i8) {
        if (this.f1197g) {
            if (b0.H(2)) {
                toString();
            }
            ArrayList<j0.a> arrayList = this.f1192a;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                j0.a aVar = arrayList.get(i9);
                n nVar = aVar.f1208b;
                if (nVar != null) {
                    nVar.r += i8;
                    if (b0.H(2)) {
                        Objects.toString(aVar.f1208b);
                        int i10 = aVar.f1208b.r;
                    }
                }
            }
        }
    }

    public final int d(boolean z8) {
        if (!this.r) {
            if (b0.H(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new r0());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z9 = this.f1197g;
            b0 b0Var = this.f1082q;
            this.f1083s = z9 ? b0Var.f1108i.getAndIncrement() : -1;
            b0Var.v(this, z8);
            return this.f1083s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e() {
        if (!this.f1197g) {
            this.f1198h = false;
            this.f1082q.y(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void f(int i8, n nVar, String str, int i9) {
        Class<?> cls = nVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = nVar.y;
            if (str2 == null || str.equals(str2)) {
                nVar.y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + nVar + ": was " + nVar.y + " now " + str);
            }
        }
        if (i8 != 0) {
            if (i8 != -1) {
                int i10 = nVar.w;
                if (i10 == 0 || i10 == i8) {
                    nVar.w = i8;
                    nVar.f1274x = i8;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + nVar + ": was " + nVar.w + " now " + i8);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + nVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new j0.a(nVar, i9));
        nVar.f1270s = this.f1082q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1199i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1083s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f1196f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1196f));
            }
            if (!(this.f1193b == 0 && this.f1194c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1193b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1194c));
            }
            if (!(this.f1195d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1195d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f1200j == 0 && this.f1201k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1200j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1201k);
            }
            if (!(this.f1202l == 0 && this.f1203m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1202l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1203m);
            }
        }
        ArrayList<j0.a> arrayList = this.f1192a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                j0.a aVar = arrayList.get(i8);
                switch (aVar.f1207a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1207a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1208b);
                if (z8) {
                    if (!(aVar.f1209c == 0 && aVar.f1210d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1209c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1210d));
                    }
                    if (aVar.e != 0 || aVar.f1211f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1211f));
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList<j0.a> arrayList = this.f1192a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            j0.a aVar = arrayList.get(i8);
            n nVar = aVar.f1208b;
            if (nVar != null) {
                if (nVar.K != null) {
                    nVar.d().f1282a = false;
                }
                int i9 = this.f1196f;
                if (!(nVar.K == null && i9 == 0)) {
                    nVar.d();
                    nVar.K.f1286f = i9;
                }
                ArrayList<String> arrayList2 = this.f1204n;
                ArrayList<String> arrayList3 = this.f1205o;
                nVar.d();
                n.g gVar = nVar.K;
                gVar.f1287g = arrayList2;
                gVar.f1288h = arrayList3;
            }
            int i10 = aVar.f1207a;
            b0 b0Var = this.f1082q;
            switch (i10) {
                case 1:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, false);
                    b0Var.a(nVar);
                    break;
                case 3:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.Q(nVar);
                    break;
                case 4:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.getClass();
                    if (b0.H(2)) {
                        Objects.toString(nVar);
                    }
                    if (nVar.f1275z) {
                        break;
                    } else {
                        nVar.f1275z = true;
                        nVar.M = !nVar.M;
                        b0Var.Y(nVar);
                        break;
                    }
                case 5:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, false);
                    if (b0.H(2)) {
                        Objects.toString(nVar);
                    }
                    if (!nVar.f1275z) {
                        break;
                    } else {
                        nVar.f1275z = false;
                        nVar.M = !nVar.M;
                        break;
                    }
                case 6:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.h(nVar);
                    break;
                case 7:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, false);
                    b0Var.d(nVar);
                    break;
                case 8:
                    b0Var.X(nVar);
                    break;
                case 9:
                    b0Var.X((n) null);
                    break;
                case 10:
                    b0Var.W(nVar, aVar.f1213h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1207a);
            }
        }
    }

    public final void i() {
        ArrayList<j0.a> arrayList = this.f1192a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0.a aVar = arrayList.get(size);
            n nVar = aVar.f1208b;
            if (nVar != null) {
                if (nVar.K != null) {
                    nVar.d().f1282a = true;
                }
                int i8 = this.f1196f;
                int i9 = 8194;
                if (i8 != 4097) {
                    i9 = i8 != 4099 ? i8 != 8194 ? 0 : 4097 : 4099;
                }
                if (!(nVar.K == null && i9 == 0)) {
                    nVar.d();
                    nVar.K.f1286f = i9;
                }
                ArrayList<String> arrayList2 = this.f1205o;
                ArrayList<String> arrayList3 = this.f1204n;
                nVar.d();
                n.g gVar = nVar.K;
                gVar.f1287g = arrayList2;
                gVar.f1288h = arrayList3;
            }
            int i10 = aVar.f1207a;
            b0 b0Var = this.f1082q;
            switch (i10) {
                case 1:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, true);
                    b0Var.Q(nVar);
                    break;
                case 3:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.a(nVar);
                    break;
                case 4:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.getClass();
                    if (b0.H(2)) {
                        Objects.toString(nVar);
                    }
                    if (!nVar.f1275z) {
                        break;
                    } else {
                        nVar.f1275z = false;
                        nVar.M = !nVar.M;
                        break;
                    }
                case 5:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, true);
                    if (b0.H(2)) {
                        Objects.toString(nVar);
                    }
                    if (nVar.f1275z) {
                        break;
                    } else {
                        nVar.f1275z = true;
                        nVar.M = !nVar.M;
                        b0Var.Y(nVar);
                        break;
                    }
                case 6:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.d(nVar);
                    break;
                case 7:
                    nVar.m(aVar.f1209c, aVar.f1210d, aVar.e, aVar.f1211f);
                    b0Var.V(nVar, true);
                    b0Var.h(nVar);
                    break;
                case 8:
                    b0Var.X((n) null);
                    break;
                case 9:
                    b0Var.X(nVar);
                    break;
                case 10:
                    b0Var.W(nVar, aVar.f1212g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1207a);
            }
        }
    }

    public final a j(n nVar) {
        b0 b0Var = nVar.f1270s;
        if (b0Var == null || b0Var == this.f1082q) {
            b(new j0.a(nVar, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + nVar.toString() + " is already attached to a FragmentManager.");
    }

    public final a k(n nVar, m.b bVar) {
        b0 b0Var = nVar.f1270s;
        b0 b0Var2 = this.f1082q;
        if (b0Var != b0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + b0Var2);
        } else if (bVar == m.b.f1492g && nVar.f1254a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != m.b.f1491f) {
            b(new j0.a(nVar, bVar));
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1083s >= 0) {
            sb.append(" #");
            sb.append(this.f1083s);
        }
        if (this.f1199i != null) {
            sb.append(" ");
            sb.append(this.f1199i);
        }
        sb.append("}");
        return sb.toString();
    }
}
