package androidx.fragment.app;

import androidx.lifecycle.m;
import java.util.ArrayList;

public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f1192a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1193b;

    /* renamed from: c  reason: collision with root package name */
    public int f1194c;

    /* renamed from: d  reason: collision with root package name */
    public int f1195d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1196f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1197g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1198h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f1199i;

    /* renamed from: j  reason: collision with root package name */
    public int f1200j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1201k;

    /* renamed from: l  reason: collision with root package name */
    public int f1202l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1203m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1204n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f1205o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1206p = false;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1207a;

        /* renamed from: b  reason: collision with root package name */
        public n f1208b;

        /* renamed from: c  reason: collision with root package name */
        public int f1209c;

        /* renamed from: d  reason: collision with root package name */
        public int f1210d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1211f;

        /* renamed from: g  reason: collision with root package name */
        public m.b f1212g;

        /* renamed from: h  reason: collision with root package name */
        public m.b f1213h;

        public a() {
        }

        public a(n nVar, int i8) {
            this.f1207a = i8;
            this.f1208b = nVar;
            m.b bVar = m.b.f1495j;
            this.f1212g = bVar;
            this.f1213h = bVar;
        }

        public a(n nVar, m.b bVar) {
            this.f1207a = 10;
            this.f1208b = nVar;
            this.f1212g = nVar.P;
            this.f1213h = bVar;
        }
    }

    public final void b(a aVar) {
        this.f1192a.add(aVar);
        aVar.f1209c = this.f1193b;
        aVar.f1210d = this.f1194c;
        aVar.e = this.f1195d;
        aVar.f1211f = this.e;
    }
}
