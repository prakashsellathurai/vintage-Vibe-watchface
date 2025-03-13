package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.health.services.client.R;
import androidx.lifecycle.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public ArrayList<a> D;
    public ArrayList<Boolean> E;
    public ArrayList<n> F;
    public e0 G;
    public final Runnable H;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n> f1101a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1102b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f1103c = new i0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f1104d;
    public ArrayList<n> e;

    /* renamed from: f  reason: collision with root package name */
    public final z f1105f = new z(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1106g;

    /* renamed from: h  reason: collision with root package name */
    public final c f1107h = new c();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1108i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f1109j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<m> f1110k;

    /* renamed from: l  reason: collision with root package name */
    public final a0 f1111l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<f0> f1112m;

    /* renamed from: n  reason: collision with root package name */
    public int f1113n;

    /* renamed from: o  reason: collision with root package name */
    public y<?> f1114o;

    /* renamed from: p  reason: collision with root package name */
    public u f1115p;

    /* renamed from: q  reason: collision with root package name */
    public n f1116q;
    public n r;

    /* renamed from: s  reason: collision with root package name */
    public final e f1117s;

    /* renamed from: t  reason: collision with root package name */
    public final f f1118t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.activity.result.e f1119u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.activity.result.e f1120v;
    public androidx.activity.result.e w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayDeque<l> f1121x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1122z;

    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        public a() {
        }

        public final void a(Object obj) {
            String str;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            b0 b0Var = b0.this;
            l pollFirst = b0Var.f1121x.pollFirst();
            if (pollFirst == null) {
                str = "No IntentSenders were started for " + this;
            } else {
                i0 i0Var = b0Var.f1103c;
                String str2 = pollFirst.f1130f;
                n d9 = i0Var.d(str2);
                if (d9 == null) {
                    str = "Intent Sender result delivered for unknown Fragment " + str2;
                } else {
                    d9.onActivityResult(pollFirst.f1131g, aVar.f305f, aVar.f306g);
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void a(Object obj) {
            String str;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Boolean) arrayList.get(i8)).booleanValue() ? 0 : -1;
            }
            b0 b0Var = b0.this;
            l pollFirst = b0Var.f1121x.pollFirst();
            if (pollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                i0 i0Var = b0Var.f1103c;
                String str2 = pollFirst.f1130f;
                n d9 = i0Var.d(str2);
                if (d9 == null) {
                    str = "Permission request result delivered for unknown Fragment " + str2;
                } else {
                    d9.onRequestPermissionsResult(pollFirst.f1131g, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public class c extends androidx.activity.h {
        public c() {
        }

        public final void a() {
            b0 b0Var = b0.this;
            b0Var.x(true);
            if (b0Var.f1107h.f297a) {
                b0Var.O();
            } else {
                b0Var.f1106g.b();
            }
        }
    }

    public class d {
        public d(b0 b0Var) {
        }
    }

    public class e extends x {
        public e() {
        }
    }

    public class f implements t0 {
    }

    public class g implements Runnable {
        public g() {
        }

        public final void run() {
            b0.this.x(true);
        }
    }

    public class h implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1128a;

        public h(n nVar) {
            this.f1128a = nVar;
        }

        public final void b(n nVar) {
            this.f1128a.onAttachFragment(nVar);
        }
    }

    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        public final void a(Object obj) {
            String str;
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            b0 b0Var = b0.this;
            l pollFirst = b0Var.f1121x.pollFirst();
            if (pollFirst == null) {
                str = "No Activities were started for result for " + this;
            } else {
                i0 i0Var = b0Var.f1103c;
                String str2 = pollFirst.f1130f;
                n d9 = i0Var.d(str2);
                if (d9 == null) {
                    str = "Activity result delivered for unknown Fragment " + str2;
                } else {
                    d9.onActivityResult(pollFirst.f1131g, aVar.f305f, aVar.f306g);
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public static class j extends d.a<androidx.activity.result.h, androidx.activity.result.a> {
        public final Intent a(Context context, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar.f325g;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = hVar.f324f;
                    q7.k.e(intentSender, "intentSender");
                    hVar = new androidx.activity.result.h(intentSender, (Intent) null, hVar.f326h, hVar.f327i);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (b0.H(2)) {
                intent.toString();
            }
            return intent;
        }

        public final Object c(Intent intent, int i8) {
            return new androidx.activity.result.a(intent, i8);
        }
    }

    public static abstract class k {
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public final String f1130f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1131g;

        public class a implements Parcelable.Creator<l> {
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            public final Object[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(int i8, String str) {
            this.f1130f = str;
            this.f1131g = i8;
        }

        public l(Parcel parcel) {
            this.f1130f = parcel.readString();
            this.f1131g = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f1130f);
            parcel.writeInt(this.f1131g);
        }
    }

    public interface m {
        void onBackStackChanged();
    }

    public interface n {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class o implements n {

        /* renamed from: a  reason: collision with root package name */
        public final int f1132a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1133b = 1;

        public o(int i8) {
            this.f1132a = i8;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            b0 b0Var = b0.this;
            n nVar = b0Var.r;
            int i8 = this.f1132a;
            if (nVar == null || i8 >= 0 || !nVar.getChildFragmentManager().O()) {
                return b0Var.P(arrayList, arrayList2, i8, this.f1133b);
            }
            return false;
        }
    }

    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public int f1135a;
    }

    public b0() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new d(this);
        this.f1111l = new a0(this);
        this.f1112m = new CopyOnWriteArrayList<>();
        this.f1113n = -1;
        this.f1117s = new e();
        this.f1118t = new f();
        this.f1121x = new ArrayDeque<>();
        this.H = new g();
    }

    public static boolean H(int i8) {
        return Log.isLoggable("FragmentManager", i8);
    }

    public static boolean I(n nVar) {
        boolean z8;
        if (nVar.D && nVar.E) {
            return true;
        }
        Iterator it = nVar.f1272u.f1103c.g().iterator();
        boolean z9 = false;
        while (true) {
            if (!it.hasNext()) {
                z8 = false;
                break;
            }
            n nVar2 = (n) it.next();
            if (nVar2 != null) {
                z9 = I(nVar2);
                continue;
            }
            if (z9) {
                z8 = true;
                break;
            }
        }
        return z8;
    }

    public static boolean J(n nVar) {
        if (nVar == null) {
            return true;
        }
        return nVar.isMenuVisible();
    }

    public static boolean K(n nVar) {
        if (nVar == null) {
            return true;
        }
        b0 b0Var = nVar.f1270s;
        return nVar.equals(b0Var.r) && K(b0Var.f1116q);
    }

    public final void A(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public final n B(String str) {
        return this.f1103c.c(str);
    }

    public final n C(int i8) {
        i0 i0Var = this.f1103c;
        ArrayList arrayList = (ArrayList) i0Var.f1188a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                n nVar = (n) arrayList.get(size);
                if (nVar != null && nVar.w == i8) {
                    return nVar;
                }
            } else {
                for (h0 h0Var : ((HashMap) i0Var.f1189b).values()) {
                    if (h0Var != null) {
                        n nVar2 = h0Var.f1182c;
                        if (nVar2.w == i8) {
                            return nVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final n D(String str) {
        i0 i0Var = this.f1103c;
        ArrayList arrayList = (ArrayList) i0Var.f1188a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                n nVar = (n) arrayList.get(size);
                if (nVar != null && str.equals(nVar.y)) {
                    return nVar;
                }
            } else {
                for (h0 h0Var : ((HashMap) i0Var.f1189b).values()) {
                    if (h0Var != null) {
                        n nVar2 = h0Var.f1182c;
                        if (str.equals(nVar2.y)) {
                            return nVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ViewGroup E(n nVar) {
        ViewGroup viewGroup = nVar.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (nVar.f1274x > 0 && this.f1115p.h()) {
            View e4 = this.f1115p.e(nVar.f1274x);
            if (e4 instanceof ViewGroup) {
                return (ViewGroup) e4;
            }
        }
        return null;
    }

    public final x F() {
        n nVar = this.f1116q;
        return nVar != null ? nVar.f1270s.F() : this.f1117s;
    }

    public final t0 G() {
        n nVar = this.f1116q;
        return nVar != null ? nVar.f1270s.G() : this.f1118t;
    }

    public final boolean L() {
        return this.f1122z || this.A;
    }

    public final void M(int i8, boolean z8) {
        y<?> yVar;
        if (this.f1114o == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z8 || i8 != this.f1113n) {
            this.f1113n = i8;
            i0 i0Var = this.f1103c;
            Iterator it = ((ArrayList) i0Var.f1188a).iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) ((HashMap) i0Var.f1189b).get(((n) it.next()).f1258f);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            Iterator it2 = ((HashMap) i0Var.f1189b).values().iterator();
            while (true) {
                boolean z9 = false;
                if (!it2.hasNext()) {
                    break;
                }
                h0 h0Var2 = (h0) it2.next();
                if (h0Var2 != null) {
                    h0Var2.k();
                    n nVar = h0Var2.f1182c;
                    if (nVar.f1265m) {
                        if (!(nVar.r > 0)) {
                            z9 = true;
                        }
                    }
                    if (z9) {
                        i0Var.l(h0Var2);
                    }
                }
            }
            Z();
            if (this.y && (yVar = this.f1114o) != null && this.f1113n == 7) {
                yVar.n();
                this.y = false;
            }
        }
    }

    public final void N() {
        if (this.f1114o != null) {
            this.f1122z = false;
            this.A = false;
            this.G.f1157i = false;
            for (n nVar : this.f1103c.i()) {
                if (nVar != null) {
                    nVar.f1272u.N();
                }
            }
        }
    }

    public final boolean O() {
        x(false);
        w(true);
        n nVar = this.r;
        if (nVar != null && nVar.getChildFragmentManager().O()) {
            return true;
        }
        boolean P = P(this.D, this.E, -1, 0);
        if (P) {
            this.f1102b = true;
            try {
                R(this.D, this.E);
            } finally {
                e();
            }
        }
        b0();
        if (this.C) {
            this.C = false;
            Z();
        }
        this.f1103c.b();
        return P;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        a aVar;
        ArrayList<a> arrayList3 = this.f1104d;
        if (arrayList3 == null) {
            return false;
        }
        if (i8 >= 0 || (i9 & 1) != 0) {
            int i10 = -1;
            if (i8 >= 0) {
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    a aVar2 = this.f1104d.get(size);
                    if (i8 >= 0 && i8 == aVar2.f1083s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i9 & 1) != 0) {
                    do {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        aVar = this.f1104d.get(size);
                        if (i8 < 0) {
                            break;
                        }
                    } while (i8 != aVar.f1083s);
                }
                i10 = size;
            }
            if (i10 == this.f1104d.size() - 1) {
                return false;
            }
            for (int size2 = this.f1104d.size() - 1; size2 > i10; size2--) {
                arrayList.add(this.f1104d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return false;
            }
            arrayList.add(this.f1104d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(n nVar) {
        if (H(2)) {
            Objects.toString(nVar);
        }
        boolean z8 = !(nVar.r > 0);
        if (!nVar.A || z8) {
            i0 i0Var = this.f1103c;
            synchronized (((ArrayList) i0Var.f1188a)) {
                ((ArrayList) i0Var.f1188a).remove(nVar);
            }
            nVar.f1264l = false;
            if (I(nVar)) {
                this.y = true;
            }
            nVar.f1265m = true;
            Y(nVar);
        }
    }

    public final void R(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                A(arrayList, arrayList2);
                int size = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i8 < size) {
                    if (!arrayList.get(i8).f1206p) {
                        if (i9 != i8) {
                            z(arrayList, arrayList2, i9, i8);
                        }
                        i9 = i8 + 1;
                        if (arrayList2.get(i8).booleanValue()) {
                            while (i9 < size && arrayList2.get(i9).booleanValue() && !arrayList.get(i9).f1206p) {
                                i9++;
                            }
                        }
                        z(arrayList, arrayList2, i8, i9);
                        i8 = i9 - 1;
                    }
                    i8++;
                }
                if (i9 != size) {
                    z(arrayList, arrayList2, i9, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void S(Parcelable parcelable) {
        a0 a0Var;
        int i8;
        h0 h0Var;
        if (parcelable != null) {
            d0 d0Var = (d0) parcelable;
            if (d0Var.f1143f != null) {
                i0 i0Var = this.f1103c;
                ((HashMap) i0Var.f1189b).clear();
                Iterator<g0> it = d0Var.f1143f.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    a0Var = this.f1111l;
                    if (!hasNext) {
                        break;
                    }
                    g0 next = it.next();
                    if (next != null) {
                        n nVar = this.G.f1153d.get(next.f1166g);
                        if (nVar != null) {
                            if (H(2)) {
                                nVar.toString();
                            }
                            h0Var = new h0(a0Var, i0Var, nVar, next);
                        } else {
                            h0Var = new h0(this.f1111l, this.f1103c, this.f1114o.f1360b.getClassLoader(), F(), next);
                        }
                        n nVar2 = h0Var.f1182c;
                        nVar2.f1270s = this;
                        if (H(2)) {
                            nVar2.toString();
                        }
                        h0Var.m(this.f1114o.f1360b.getClassLoader());
                        i0Var.k(h0Var);
                        h0Var.e = this.f1113n;
                    }
                }
                e0 e0Var = this.G;
                e0Var.getClass();
                Iterator it2 = new ArrayList(e0Var.f1153d.values()).iterator();
                while (true) {
                    i8 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    n nVar3 = (n) it2.next();
                    if (((HashMap) i0Var.f1189b).get(nVar3.f1258f) != null) {
                        i8 = 1;
                    }
                    if (i8 == 0) {
                        if (H(2)) {
                            nVar3.toString();
                            Objects.toString(d0Var.f1143f);
                        }
                        this.G.d(nVar3);
                        nVar3.f1270s = this;
                        h0 h0Var2 = new h0(a0Var, i0Var, nVar3);
                        h0Var2.e = 1;
                        h0Var2.k();
                        nVar3.f1265m = true;
                        h0Var2.k();
                    }
                }
                ArrayList<String> arrayList = d0Var.f1144g;
                ((ArrayList) i0Var.f1188a).clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        n c9 = i0Var.c(next2);
                        if (c9 != null) {
                            if (H(2)) {
                                c9.toString();
                            }
                            i0Var.a(c9);
                        } else {
                            throw new IllegalStateException("No instantiated fragment for (" + next2 + ")");
                        }
                    }
                }
                if (d0Var.f1145h != null) {
                    this.f1104d = new ArrayList<>(d0Var.f1145h.length);
                    int i9 = 0;
                    while (true) {
                        b[] bVarArr = d0Var.f1145h;
                        if (i9 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i9];
                        bVar.getClass();
                        a aVar = new a(this);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            int[] iArr = bVar.f1088f;
                            if (i10 >= iArr.length) {
                                break;
                            }
                            j0.a aVar2 = new j0.a();
                            int i12 = i10 + 1;
                            aVar2.f1207a = iArr[i10];
                            if (H(2)) {
                                aVar.toString();
                                int i13 = iArr[i12];
                            }
                            String str = bVar.f1089g.get(i11);
                            aVar2.f1208b = str != null ? B(str) : null;
                            aVar2.f1212g = m.b.values()[bVar.f1090h[i11]];
                            aVar2.f1213h = m.b.values()[bVar.f1091i[i11]];
                            int i14 = i12 + 1;
                            int i15 = iArr[i12];
                            aVar2.f1209c = i15;
                            int i16 = i14 + 1;
                            int i17 = iArr[i14];
                            aVar2.f1210d = i17;
                            int i18 = i16 + 1;
                            int i19 = iArr[i16];
                            aVar2.e = i19;
                            int i20 = iArr[i18];
                            aVar2.f1211f = i20;
                            aVar.f1193b = i15;
                            aVar.f1194c = i17;
                            aVar.f1195d = i19;
                            aVar.e = i20;
                            aVar.b(aVar2);
                            i11++;
                            i10 = i18 + 1;
                        }
                        aVar.f1196f = bVar.f1092j;
                        aVar.f1199i = bVar.f1093k;
                        aVar.f1083s = bVar.f1094l;
                        aVar.f1197g = true;
                        aVar.f1200j = bVar.f1095m;
                        aVar.f1201k = bVar.f1096n;
                        aVar.f1202l = bVar.f1097o;
                        aVar.f1203m = bVar.f1098p;
                        aVar.f1204n = bVar.f1099q;
                        aVar.f1205o = bVar.r;
                        aVar.f1206p = bVar.f1100s;
                        aVar.c(1);
                        if (H(2)) {
                            aVar.toString();
                            PrintWriter printWriter = new PrintWriter(new r0());
                            aVar.g("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1104d.add(aVar);
                        i9++;
                    }
                } else {
                    this.f1104d = null;
                }
                this.f1108i.set(d0Var.f1146i);
                String str2 = d0Var.f1147j;
                if (str2 != null) {
                    n B2 = B(str2);
                    this.r = B2;
                    q(B2);
                }
                ArrayList<String> arrayList2 = d0Var.f1148k;
                if (arrayList2 != null) {
                    while (i8 < arrayList2.size()) {
                        Bundle bundle = d0Var.f1149l.get(i8);
                        bundle.setClassLoader(this.f1114o.f1360b.getClassLoader());
                        this.f1109j.put(arrayList2.get(i8), bundle);
                        i8++;
                    }
                }
                this.f1121x = new ArrayDeque<>(d0Var.f1150m);
            }
        }
    }

    public final Parcelable T() {
        int i8;
        ArrayList<String> arrayList;
        int size;
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var = (s0) it.next();
            if (s0Var.e) {
                s0Var.e = false;
                s0Var.c();
            }
        }
        Iterator it2 = f().iterator();
        while (it2.hasNext()) {
            ((s0) it2.next()).e();
        }
        x(true);
        this.f1122z = true;
        this.G.f1157i = true;
        i0 i0Var = this.f1103c;
        i0Var.getClass();
        ArrayList<g0> arrayList2 = new ArrayList<>(((HashMap) i0Var.f1189b).size());
        for (h0 h0Var : ((HashMap) i0Var.f1189b).values()) {
            if (h0Var != null) {
                n nVar = h0Var.f1182c;
                g0 g0Var = new g0(nVar);
                if (nVar.f1254a <= -1 || g0Var.r != null) {
                    g0Var.r = nVar.f1255b;
                } else {
                    Bundle o8 = h0Var.o();
                    g0Var.r = o8;
                    if (nVar.f1261i != null) {
                        if (o8 == null) {
                            g0Var.r = new Bundle();
                        }
                        g0Var.r.putString("android:target_state", nVar.f1261i);
                        int i9 = nVar.f1262j;
                        if (i9 != 0) {
                            g0Var.r.putInt("android:target_req_state", i9);
                        }
                    }
                }
                arrayList2.add(g0Var);
                if (H(2)) {
                    Objects.toString(nVar);
                    Objects.toString(g0Var.r);
                }
            }
        }
        b[] bVarArr = null;
        if (arrayList2.isEmpty()) {
            H(2);
            return null;
        }
        i0 i0Var2 = this.f1103c;
        synchronized (((ArrayList) i0Var2.f1188a)) {
            if (((ArrayList) i0Var2.f1188a).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) i0Var2.f1188a).size());
                Iterator it3 = ((ArrayList) i0Var2.f1188a).iterator();
                while (it3.hasNext()) {
                    n nVar2 = (n) it3.next();
                    arrayList.add(nVar2.f1258f);
                    if (H(2)) {
                        nVar2.toString();
                    }
                }
            }
        }
        ArrayList<a> arrayList3 = this.f1104d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (i8 = 0; i8 < size; i8++) {
                bVarArr[i8] = new b(this.f1104d.get(i8));
                if (H(2)) {
                    Objects.toString(this.f1104d.get(i8));
                }
            }
        }
        d0 d0Var = new d0();
        d0Var.f1143f = arrayList2;
        d0Var.f1144g = arrayList;
        d0Var.f1145h = bVarArr;
        d0Var.f1146i = this.f1108i.get();
        n nVar3 = this.r;
        if (nVar3 != null) {
            d0Var.f1147j = nVar3.f1258f;
        }
        d0Var.f1148k.addAll(this.f1109j.keySet());
        d0Var.f1149l.addAll(this.f1109j.values());
        d0Var.f1150m = new ArrayList<>(this.f1121x);
        return d0Var;
    }

    public final void U() {
        synchronized (this.f1101a) {
            boolean z8 = true;
            if (this.f1101a.size() != 1) {
                z8 = false;
            }
            if (z8) {
                this.f1114o.f1361c.removeCallbacks(this.H);
                this.f1114o.f1361c.post(this.H);
                b0();
            }
        }
    }

    public final void V(n nVar, boolean z8) {
        ViewGroup E2 = E(nVar);
        if (E2 != null && (E2 instanceof v)) {
            ((v) E2).setDrawDisappearingViewsLast(!z8);
        }
    }

    public final void W(n nVar, m.b bVar) {
        if (!nVar.equals(B(nVar.f1258f)) || !(nVar.f1271t == null || nVar.f1270s == this)) {
            throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
        }
        nVar.P = bVar;
    }

    public final void X(n nVar) {
        if (nVar == null || (nVar.equals(B(nVar.f1258f)) && (nVar.f1271t == null || nVar.f1270s == this))) {
            n nVar2 = this.r;
            this.r = nVar;
            q(nVar2);
            q(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void Y(n nVar) {
        ViewGroup E2 = E(nVar);
        if (E2 != null) {
            n.g gVar = nVar.K;
            boolean z8 = false;
            if ((gVar == null ? 0 : gVar.f1283b) + (gVar == null ? 0 : gVar.f1284c) + (gVar == null ? 0 : gVar.f1285d) + (gVar == null ? 0 : gVar.e) > 0) {
                if (E2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    E2.setTag(R.id.visible_removing_fragment_view_tag, nVar);
                }
                n nVar2 = (n) E2.getTag(R.id.visible_removing_fragment_view_tag);
                n.g gVar2 = nVar.K;
                if (gVar2 != null) {
                    z8 = gVar2.f1282a;
                }
                if (nVar2.K != null) {
                    nVar2.d().f1282a = z8;
                }
            }
        }
    }

    public final void Z() {
        Iterator it = this.f1103c.f().iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            n nVar = h0Var.f1182c;
            if (nVar.I) {
                if (this.f1102b) {
                    this.C = true;
                } else {
                    nVar.I = false;
                    h0Var.k();
                }
            }
        }
    }

    public final h0 a(n nVar) {
        if (H(2)) {
            Objects.toString(nVar);
        }
        h0 g9 = g(nVar);
        nVar.f1270s = this;
        i0 i0Var = this.f1103c;
        i0Var.k(g9);
        if (!nVar.A) {
            i0Var.a(nVar);
            nVar.f1265m = false;
            if (nVar.H == null) {
                nVar.M = false;
            }
            if (I(nVar)) {
                this.y = true;
            }
        }
        return g9;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new r0());
        y<?> yVar = this.f1114o;
        if (yVar != null) {
            try {
                yVar.j(printWriter, new String[0]);
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
            }
        } else {
            u("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw illegalStateException;
    }

    public final void b(f0 f0Var) {
        this.f1112m.add(f0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = r4.f1107h;
        r1 = r4.f1104d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r1 <= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (K(r4.f1116q) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.f297a = r2;
        r4 = r0.f299c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r4.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.b0$n> r0 = r4.f1101a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.b0$n> r1 = r4.f1101a     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            r2 = 1
            if (r1 != 0) goto L_0x001c
            androidx.fragment.app.b0$c r4 = r4.f1107h     // Catch:{ all -> 0x0018 }
            r4.f297a = r2     // Catch:{ all -> 0x0018 }
            p7.a<h7.h> r4 = r4.f299c     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x001a
            r4.invoke()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r4 = move-exception
            goto L_0x0040
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            androidx.fragment.app.b0$c r0 = r4.f1107h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1104d
            r3 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r1.size()
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            if (r1 <= 0) goto L_0x0035
            androidx.fragment.app.n r4 = r4.f1116q
            boolean r4 = K(r4)
            if (r4 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r0.f297a = r2
            p7.a<h7.h> r4 = r0.f299c
            if (r4 == 0) goto L_0x003f
            r4.invoke()
        L_0x003f:
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.b0():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.activity.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.fragment.app.y<?> r3, androidx.fragment.app.u r4, androidx.fragment.app.n r5) {
        /*
            r2 = this;
            androidx.fragment.app.y<?> r0 = r2.f1114o
            if (r0 != 0) goto L_0x011f
            r2.f1114o = r3
            r2.f1115p = r4
            r2.f1116q = r5
            if (r5 == 0) goto L_0x0012
            androidx.fragment.app.b0$h r4 = new androidx.fragment.app.b0$h
            r4.<init>(r5)
            goto L_0x0019
        L_0x0012:
            boolean r4 = r3 instanceof androidx.fragment.app.f0
            if (r4 == 0) goto L_0x001c
            r4 = r3
            androidx.fragment.app.f0 r4 = (androidx.fragment.app.f0) r4
        L_0x0019:
            r2.b(r4)
        L_0x001c:
            androidx.fragment.app.n r4 = r2.f1116q
            if (r4 == 0) goto L_0x0023
            r2.b0()
        L_0x0023:
            boolean r4 = r3 instanceof androidx.activity.j
            if (r4 == 0) goto L_0x0038
            r4 = r3
            androidx.activity.j r4 = (androidx.activity.j) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.a()
            r2.f1106g = r0
            if (r5 == 0) goto L_0x0033
            r4 = r5
        L_0x0033:
            androidx.fragment.app.b0$c r1 = r2.f1107h
            r0.a(r4, r1)
        L_0x0038:
            if (r5 == 0) goto L_0x0059
            androidx.fragment.app.b0 r3 = r5.f1270s
            androidx.fragment.app.e0 r3 = r3.G
            java.util.HashMap<java.lang.String, androidx.fragment.app.e0> r4 = r3.e
            java.lang.String r0 = r5.f1258f
            java.lang.Object r0 = r4.get(r0)
            androidx.fragment.app.e0 r0 = (androidx.fragment.app.e0) r0
            if (r0 != 0) goto L_0x0056
            androidx.fragment.app.e0 r0 = new androidx.fragment.app.e0
            boolean r3 = r3.f1155g
            r0.<init>(r3)
            java.lang.String r3 = r5.f1258f
            r4.put(r3, r0)
        L_0x0056:
            r2.G = r0
            goto L_0x007b
        L_0x0059:
            boolean r4 = r3 instanceof androidx.lifecycle.o0
            if (r4 == 0) goto L_0x0073
            androidx.lifecycle.o0 r3 = (androidx.lifecycle.o0) r3
            androidx.lifecycle.n0 r3 = r3.getViewModelStore()
            androidx.lifecycle.l0 r4 = new androidx.lifecycle.l0
            androidx.fragment.app.e0$a r0 = androidx.fragment.app.e0.f1152j
            r4.<init>(r3, r0)
            java.lang.Class<androidx.fragment.app.e0> r3 = androidx.fragment.app.e0.class
            androidx.lifecycle.j0 r3 = r4.a(r3)
            androidx.fragment.app.e0 r3 = (androidx.fragment.app.e0) r3
            goto L_0x0079
        L_0x0073:
            androidx.fragment.app.e0 r3 = new androidx.fragment.app.e0
            r4 = 0
            r3.<init>(r4)
        L_0x0079:
            r2.G = r3
        L_0x007b:
            androidx.fragment.app.e0 r3 = r2.G
            boolean r4 = r2.L()
            r3.f1157i = r4
            androidx.fragment.app.e0 r3 = r2.G
            androidx.fragment.app.i0 r4 = r2.f1103c
            r4.f1190c = r3
            androidx.fragment.app.y<?> r3 = r2.f1114o
            boolean r4 = r3 instanceof androidx.activity.result.g
            if (r4 == 0) goto L_0x011e
            androidx.activity.result.g r3 = (androidx.activity.result.g) r3
            androidx.activity.result.f r3 = r3.c()
            if (r5 == 0) goto L_0x00ab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f1258f
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r4 = ""
        L_0x00ad:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentManager:"
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            d.c r0 = new d.c
            r0.<init>()
            androidx.fragment.app.b0$i r1 = new androidx.fragment.app.b0$i
            r1.<init>()
            androidx.activity.result.e r5 = r3.d(r5, r0, r1)
            r2.f1119u = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.b0$j r0 = new androidx.fragment.app.b0$j
            r0.<init>()
            androidx.fragment.app.b0$a r1 = new androidx.fragment.app.b0$a
            r1.<init>()
            androidx.activity.result.e r5 = r3.d(r5, r0, r1)
            r2.f1120v = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            d.b r5 = new d.b
            r5.<init>()
            androidx.fragment.app.b0$b r0 = new androidx.fragment.app.b0$b
            r0.<init>()
            androidx.activity.result.e r3 = r3.d(r4, r5, r0)
            r2.w = r3
        L_0x011e:
            return
        L_0x011f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Already attached"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.c(androidx.fragment.app.y, androidx.fragment.app.u, androidx.fragment.app.n):void");
    }

    public final void d(n nVar) {
        if (H(2)) {
            Objects.toString(nVar);
        }
        if (nVar.A) {
            nVar.A = false;
            if (!nVar.f1264l) {
                this.f1103c.a(nVar);
                if (H(2)) {
                    nVar.toString();
                }
                if (I(nVar)) {
                    this.y = true;
                }
            }
        }
    }

    public final void e() {
        this.f1102b = false;
        this.E.clear();
        this.D.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1103c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f1182c.G;
            if (viewGroup != null) {
                hashSet.add(s0.g(viewGroup, G()));
            }
        }
        return hashSet;
    }

    public final h0 g(n nVar) {
        String str = nVar.f1258f;
        i0 i0Var = this.f1103c;
        h0 h8 = i0Var.h(str);
        if (h8 != null) {
            return h8;
        }
        h0 h0Var = new h0(this.f1111l, i0Var, nVar);
        h0Var.m(this.f1114o.f1360b.getClassLoader());
        h0Var.e = this.f1113n;
        return h0Var;
    }

    public final void h(n nVar) {
        if (H(2)) {
            Objects.toString(nVar);
        }
        if (!nVar.A) {
            nVar.A = true;
            if (nVar.f1264l) {
                if (H(2)) {
                    nVar.toString();
                }
                i0 i0Var = this.f1103c;
                synchronized (((ArrayList) i0Var.f1188a)) {
                    ((ArrayList) i0Var.f1188a).remove(nVar);
                }
                nVar.f1264l = false;
                if (I(nVar)) {
                    this.y = true;
                }
                Y(nVar);
            }
        }
    }

    public final void i(Configuration configuration) {
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                nVar.onConfigurationChanged(configuration);
                nVar.f1272u.i(configuration);
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f1113n < 1) {
            return false;
        }
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                if (!nVar.f1275z ? nVar.onContextItemSelected(menuItem) ? true : nVar.f1272u.j(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean z8;
        boolean z9;
        if (this.f1113n < 1) {
            return false;
        }
        ArrayList<n> arrayList = null;
        boolean z10 = false;
        for (n nVar : this.f1103c.i()) {
            if (nVar != null && J(nVar)) {
                if (!nVar.f1275z) {
                    if (!nVar.D || !nVar.E) {
                        z9 = false;
                    } else {
                        nVar.onCreateOptionsMenu(menu, menuInflater);
                        z9 = true;
                    }
                    z8 = z9 | nVar.f1272u.k(menu, menuInflater);
                } else {
                    z8 = false;
                }
                if (z8) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(nVar);
                    z10 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i8 = 0; i8 < this.e.size(); i8++) {
                n nVar2 = this.e.get(i8);
                if (arrayList == null || !arrayList.contains(nVar2)) {
                    nVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z10;
    }

    public final void l() {
        this.B = true;
        x(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((s0) it.next()).e();
        }
        t(-1);
        this.f1114o = null;
        this.f1115p = null;
        this.f1116q = null;
        if (this.f1106g != null) {
            Iterator<androidx.activity.a> it2 = this.f1107h.f298b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1106g = null;
        }
        androidx.activity.result.e eVar = this.f1119u;
        if (eVar != null) {
            eVar.b();
            this.f1120v.b();
            this.w.b();
        }
    }

    public final void m() {
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                nVar.h();
            }
        }
    }

    public final void n(boolean z8) {
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                nVar.i(z8);
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f1113n < 1) {
            return false;
        }
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                if (!nVar.f1275z ? (!nVar.D || !nVar.E || !nVar.onOptionsItemSelected(menuItem)) ? nVar.f1272u.o(menuItem) : true : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f1113n >= 1) {
            for (n nVar : this.f1103c.i()) {
                if (nVar != null && !nVar.f1275z) {
                    if (nVar.D && nVar.E) {
                        nVar.onOptionsMenuClosed(menu);
                    }
                    nVar.f1272u.p(menu);
                }
            }
        }
    }

    public final void q(n nVar) {
        if (nVar != null && nVar.equals(B(nVar.f1258f))) {
            nVar.f1270s.getClass();
            boolean K = K(nVar);
            Boolean bool = nVar.f1263k;
            if (bool == null || bool.booleanValue() != K) {
                nVar.f1263k = Boolean.valueOf(K);
                nVar.onPrimaryNavigationFragmentChanged(K);
                c0 c0Var = nVar.f1272u;
                c0Var.b0();
                c0Var.q(c0Var.r);
            }
        }
    }

    public final void r(boolean z8) {
        for (n nVar : this.f1103c.i()) {
            if (nVar != null) {
                nVar.j(z8);
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z8 = false;
        if (this.f1113n < 1) {
            return false;
        }
        for (n nVar : this.f1103c.i()) {
            if (nVar != null && J(nVar) && nVar.k(menu)) {
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i8) {
        try {
            this.f1102b = true;
            for (h0 h0Var : ((HashMap) this.f1103c.f1189b).values()) {
                if (h0Var != null) {
                    h0Var.e = i8;
                }
            }
            M(i8, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((s0) it.next()).e();
            }
            this.f1102b = false;
            x(true);
        } catch (Throwable th) {
            this.f1102b = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        n nVar = this.f1116q;
        if (nVar != null) {
            sb.append(nVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1116q;
        } else {
            y<?> yVar = this.f1114o;
            if (yVar != null) {
                sb.append(yVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1114o;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        i0 i0Var = this.f1103c;
        i0Var.getClass();
        String str3 = str + "    ";
        if (!((HashMap) i0Var.f1189b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : ((HashMap) i0Var.f1189b).values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    n nVar = h0Var.f1182c;
                    printWriter.println(nVar);
                    nVar.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) i0Var.f1188a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size3; i8++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(((n) arrayList.get(i8)).toString());
            }
        }
        ArrayList<n> arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i9 = 0; i9 < size2; i9++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(this.e.get(i9).toString());
            }
        }
        ArrayList<a> arrayList3 = this.f1104d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = this.f1104d.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1108i.get());
        synchronized (this.f1101a) {
            int size4 = this.f1101a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i11 = 0; i11 < size4; i11++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i11);
                    printWriter.print(": ");
                    printWriter.println(this.f1101a.get(i11));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1114o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1115p);
        if (this.f1116q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1116q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1113n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1122z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.B);
        if (this.y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.y);
        }
    }

    public final void v(n nVar, boolean z8) {
        if (!z8) {
            if (this.f1114o == null) {
                if (this.B) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1101a) {
            if (this.f1114o != null) {
                this.f1101a.add(nVar);
                U();
            } else if (!z8) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void w(boolean z8) {
        if (this.f1102b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1114o == null) {
            if (this.B) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1114o.f1361c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z8 || !L()) {
            if (this.D == null) {
                this.D = new ArrayList<>();
                this.E = new ArrayList<>();
            }
            this.f1102b = false;
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean x(boolean z8) {
        boolean z9;
        w(z8);
        boolean z10 = false;
        while (true) {
            ArrayList<a> arrayList = this.D;
            ArrayList<Boolean> arrayList2 = this.E;
            synchronized (this.f1101a) {
                if (this.f1101a.isEmpty()) {
                    z9 = false;
                } else {
                    int size = this.f1101a.size();
                    z9 = false;
                    for (int i8 = 0; i8 < size; i8++) {
                        z9 |= this.f1101a.get(i8).a(arrayList, arrayList2);
                    }
                    this.f1101a.clear();
                    this.f1114o.f1361c.removeCallbacks(this.H);
                }
            }
            if (z9) {
                z10 = true;
                this.f1102b = true;
                try {
                    R(this.D, this.E);
                } finally {
                    e();
                }
            } else {
                b0();
                if (this.C) {
                    this.C = false;
                    Z();
                }
                this.f1103c.b();
                return z10;
            }
        }
        while (true) {
        }
    }

    public final void y(n nVar, boolean z8) {
        if (!z8 || (this.f1114o != null && !this.B)) {
            w(z8);
            if (nVar.a(this.D, this.E)) {
                this.f1102b = true;
                try {
                    R(this.D, this.E);
                } finally {
                    e();
                }
            }
            b0();
            if (this.C) {
                this.C = false;
                Z();
            }
            this.f1103c.b();
        }
    }

    public final void z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9) {
        ViewGroup viewGroup;
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        int i10;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i11 = i8;
        int i12 = i9;
        boolean z8 = arrayList3.get(i11).f1206p;
        ArrayList<n> arrayList5 = this.F;
        if (arrayList5 == null) {
            this.F = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<n> arrayList6 = this.F;
        i0 i0Var4 = this.f1103c;
        arrayList6.addAll(i0Var4.i());
        n nVar = this.r;
        int i13 = i11;
        boolean z9 = false;
        while (true) {
            int i14 = 1;
            if (i13 < i12) {
                a aVar = arrayList3.get(i13);
                if (!arrayList4.get(i13).booleanValue()) {
                    ArrayList<n> arrayList7 = this.F;
                    int i15 = 0;
                    while (true) {
                        ArrayList<j0.a> arrayList8 = aVar.f1192a;
                        if (i15 < arrayList8.size()) {
                            j0.a aVar2 = arrayList8.get(i15);
                            int i16 = aVar2.f1207a;
                            if (i16 != i14) {
                                if (i16 != 2) {
                                    if (i16 == 3 || i16 == 6) {
                                        arrayList7.remove(aVar2.f1208b);
                                        n nVar2 = aVar2.f1208b;
                                        if (nVar2 == nVar) {
                                            arrayList8.add(i15, new j0.a(nVar2, 9));
                                            i15++;
                                            i0Var3 = i0Var4;
                                            i10 = 1;
                                            nVar = null;
                                        }
                                    } else if (i16 == 7) {
                                        i0Var3 = i0Var4;
                                        i10 = 1;
                                    } else if (i16 == 8) {
                                        arrayList8.add(i15, new j0.a(nVar, 9));
                                        i15++;
                                        nVar = aVar2.f1208b;
                                    }
                                    i0Var3 = i0Var4;
                                    i10 = 1;
                                } else {
                                    n nVar3 = aVar2.f1208b;
                                    int i17 = nVar3.f1274x;
                                    int size = arrayList7.size() - 1;
                                    boolean z10 = false;
                                    while (size >= 0) {
                                        i0 i0Var5 = i0Var4;
                                        n nVar4 = arrayList7.get(size);
                                        if (nVar4.f1274x == i17) {
                                            if (nVar4 == nVar3) {
                                                z10 = true;
                                            } else {
                                                if (nVar4 == nVar) {
                                                    arrayList8.add(i15, new j0.a(nVar4, 9));
                                                    i15++;
                                                    nVar = null;
                                                }
                                                j0.a aVar3 = new j0.a(nVar4, 3);
                                                aVar3.f1209c = aVar2.f1209c;
                                                aVar3.e = aVar2.e;
                                                aVar3.f1210d = aVar2.f1210d;
                                                aVar3.f1211f = aVar2.f1211f;
                                                arrayList8.add(i15, aVar3);
                                                arrayList7.remove(nVar4);
                                                i15++;
                                                nVar = nVar;
                                            }
                                        }
                                        size--;
                                        ArrayList<a> arrayList9 = arrayList;
                                        i0Var4 = i0Var5;
                                    }
                                    i0Var3 = i0Var4;
                                    i10 = 1;
                                    if (z10) {
                                        arrayList8.remove(i15);
                                        i15--;
                                    } else {
                                        aVar2.f1207a = 1;
                                        arrayList7.add(nVar3);
                                    }
                                }
                                i15 += i10;
                                ArrayList<Boolean> arrayList10 = arrayList2;
                                int i18 = i8;
                                i14 = i10;
                                i0Var4 = i0Var3;
                                ArrayList<a> arrayList11 = arrayList;
                            } else {
                                i0Var3 = i0Var4;
                                i10 = i14;
                            }
                            arrayList7.add(aVar2.f1208b);
                            i15 += i10;
                            ArrayList<Boolean> arrayList102 = arrayList2;
                            int i182 = i8;
                            i14 = i10;
                            i0Var4 = i0Var3;
                            ArrayList<a> arrayList112 = arrayList;
                        } else {
                            i0Var2 = i0Var4;
                        }
                    }
                } else {
                    i0Var2 = i0Var4;
                    int i19 = 1;
                    ArrayList<n> arrayList12 = this.F;
                    ArrayList<j0.a> arrayList13 = aVar.f1192a;
                    int size2 = arrayList13.size() - 1;
                    while (size2 >= 0) {
                        j0.a aVar4 = arrayList13.get(size2);
                        int i20 = aVar4.f1207a;
                        if (i20 != i19) {
                            if (i20 != 3) {
                                switch (i20) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        nVar = null;
                                        break;
                                    case 9:
                                        nVar = aVar4.f1208b;
                                        break;
                                    case 10:
                                        aVar4.f1213h = aVar4.f1212g;
                                        break;
                                }
                            }
                            arrayList12.add(aVar4.f1208b);
                            size2--;
                            i19 = 1;
                        }
                        arrayList12.remove(aVar4.f1208b);
                        size2--;
                        i19 = 1;
                    }
                }
                z9 = z9 || aVar.f1197g;
                i13++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                int i21 = i8;
                i0Var4 = i0Var2;
            } else {
                i0 i0Var6 = i0Var4;
                this.F.clear();
                if (!z8 && this.f1113n >= 1) {
                    for (int i22 = i8; i22 < i12; i22++) {
                        Iterator<j0.a> it = arrayList.get(i22).f1192a.iterator();
                        while (it.hasNext()) {
                            n nVar5 = it.next().f1208b;
                            if (nVar5 == null || nVar5.f1270s == null) {
                                i0Var = i0Var6;
                            } else {
                                i0Var = i0Var6;
                                i0Var.k(g(nVar5));
                            }
                            i0Var6 = i0Var;
                        }
                        i0 i0Var7 = i0Var6;
                    }
                }
                ArrayList<a> arrayList14 = arrayList;
                for (int i23 = i8; i23 < i12; i23++) {
                    a aVar5 = arrayList14.get(i23);
                    if (arrayList2.get(i23).booleanValue()) {
                        aVar5.c(-1);
                        aVar5.i();
                    } else {
                        aVar5.c(1);
                        aVar5.h();
                    }
                }
                ArrayList<Boolean> arrayList15 = arrayList2;
                boolean booleanValue = arrayList15.get(i12 - 1).booleanValue();
                for (int i24 = i8; i24 < i12; i24++) {
                    a aVar6 = arrayList14.get(i24);
                    if (booleanValue) {
                        for (int size3 = aVar6.f1192a.size() - 1; size3 >= 0; size3--) {
                            n nVar6 = aVar6.f1192a.get(size3).f1208b;
                            if (nVar6 != null) {
                                g(nVar6).k();
                            }
                        }
                    } else {
                        Iterator<j0.a> it2 = aVar6.f1192a.iterator();
                        while (it2.hasNext()) {
                            n nVar7 = it2.next().f1208b;
                            if (nVar7 != null) {
                                g(nVar7).k();
                            }
                        }
                    }
                }
                M(this.f1113n, true);
                HashSet hashSet = new HashSet();
                for (int i25 = i8; i25 < i12; i25++) {
                    Iterator<j0.a> it3 = arrayList14.get(i25).f1192a.iterator();
                    while (it3.hasNext()) {
                        n nVar8 = it3.next().f1208b;
                        if (!(nVar8 == null || (viewGroup = nVar8.G) == null)) {
                            hashSet.add(s0.g(viewGroup, G()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    s0 s0Var = (s0) it4.next();
                    s0Var.f1324d = booleanValue;
                    s0Var.h();
                    s0Var.c();
                }
                for (int i26 = i8; i26 < i12; i26++) {
                    a aVar7 = arrayList14.get(i26);
                    if (arrayList15.get(i26).booleanValue() && aVar7.f1083s >= 0) {
                        aVar7.f1083s = -1;
                    }
                    aVar7.getClass();
                }
                if (z9 && this.f1110k != null) {
                    for (int i27 = 0; i27 < this.f1110k.size(); i27++) {
                        this.f1110k.get(i27).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }
}
