package androidx.appcompat.view.menu;

import a0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import j0.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class d implements e0.a {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f398v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f399a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f400b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f401c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f402d;
    public a e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<e> f403f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<e> f404g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f405h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<e> f406i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<e> f407j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f408k;

    /* renamed from: l  reason: collision with root package name */
    public int f409l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f410m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f411n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f412o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f413p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f414q = false;
    public final ArrayList<e> r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<g>> f415s = new CopyOnWriteArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public e f416t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f417u = false;

    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    public interface b {
        boolean a(e eVar);
    }

    public d(Context context) {
        boolean z8 = false;
        this.f399a = context;
        Resources resources = context.getResources();
        this.f400b = resources;
        this.f403f = new ArrayList<>();
        this.f404g = new ArrayList<>();
        this.f405h = true;
        this.f406i = new ArrayList<>();
        this.f407j = new ArrayList<>();
        this.f408k = true;
        if (resources.getConfiguration().keyboard != 1 && a0.b(ViewConfiguration.get(context))) {
            z8 = true;
        }
        this.f402d = z8;
    }

    public final MenuItem a(int i8, int i9, int i10, CharSequence charSequence) {
        int i11;
        int i12 = (-65536 & i10) >> 16;
        if (i12 < 0 || i12 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i13 = (f398v[i12] << 16) | (65535 & i10);
        e eVar = new e(this, i8, i9, i10, i13, charSequence, this.f409l);
        ArrayList<e> arrayList = this.f403f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size).f421d <= i13) {
                    i11 = size + 1;
                    break;
                }
            } else {
                i11 = 0;
                break;
            }
        }
        arrayList.add(i11, eVar);
        o(true);
        return eVar;
    }

    public final MenuItem add(int i8) {
        return a(0, 0, 0, this.f400b.getString(i8));
    }

    public final MenuItem add(int i8, int i9, int i10, int i11) {
        return a(i8, i9, i10, this.f400b.getString(i11));
    }

    public final MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return a(i8, i9, i10, charSequence);
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f399a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(int i8) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f400b.getString(i8));
    }

    public final SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return addSubMenu(i8, i9, i10, (CharSequence) this.f400b.getString(i11));
    }

    public final SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        e eVar = (e) a(i8, i9, i10, charSequence);
        j jVar = new j(this.f399a, this, eVar);
        eVar.f431o = jVar;
        jVar.setHeaderTitle(eVar.e);
        return jVar;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(g gVar, Context context) {
        this.f415s.add(new WeakReference(gVar));
        gVar.d(context, this);
        this.f408k = true;
    }

    public final void c(boolean z8) {
        if (!this.f414q) {
            this.f414q = true;
            CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
            Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                g gVar = (g) next.get();
                if (gVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    gVar.a(this, z8);
                }
            }
            this.f414q = false;
        }
    }

    public final void clear() {
        e eVar = this.f416t;
        if (eVar != null) {
            d(eVar);
        }
        this.f403f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f410m = null;
        o(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(e eVar) {
        CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
        boolean z8 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f416t == eVar) {
            t();
            Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                g gVar = (g) next.get();
                if (gVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z8 = gVar.b(eVar);
                    if (z8) {
                        break;
                    }
                }
            }
            s();
            if (z8) {
                this.f416t = null;
            }
        }
        return z8;
    }

    public boolean e(d dVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    public boolean f(e eVar) {
        CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
        boolean z8 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        t();
        Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            g gVar = (g) next.get();
            if (gVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z8 = gVar.k(eVar);
                if (z8) {
                    break;
                }
            }
        }
        s();
        if (z8) {
            this.f416t = eVar;
        }
        return z8;
    }

    public final MenuItem findItem(int i8) {
        MenuItem findItem;
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = this.f403f.get(i9);
            if (eVar.f418a == i8) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (findItem = eVar.f431o.findItem(i8)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final e g(int i8, KeyEvent keyEvent) {
        ArrayList<e> arrayList = this.r;
        arrayList.clear();
        h(arrayList, i8, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean m8 = m();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = arrayList.get(i9);
            char c9 = m8 ? eVar.f426j : eVar.f424h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (m8 && c9 == 8 && i8 == 67))) {
                return eVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i8) {
        return this.f403f.get(i8);
    }

    public final void h(ArrayList arrayList, int i8, KeyEvent keyEvent) {
        boolean m8 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i8 == 67) {
            ArrayList<e> arrayList2 = this.f403f;
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                e eVar = arrayList2.get(i9);
                if (eVar.hasSubMenu()) {
                    eVar.f431o.h(arrayList, i8, keyEvent);
                }
                char c9 = m8 ? eVar.f426j : eVar.f424h;
                if (((modifiers & 69647) == ((m8 ? eVar.f427k : eVar.f425i) & 69647)) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (m8 && c9 == 8 && i8 == 67)) && eVar.isEnabled()) {
                        arrayList.add(eVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f403f.get(i8).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<e> k8 = k();
        if (this.f408k) {
            CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
            Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                g gVar = (g) next.get();
                if (gVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z8 |= gVar.h();
                }
            }
            ArrayList<e> arrayList = this.f406i;
            ArrayList<e> arrayList2 = this.f407j;
            arrayList.clear();
            arrayList2.clear();
            if (z8) {
                int size = k8.size();
                for (int i8 = 0; i8 < size; i8++) {
                    e eVar = k8.get(i8);
                    if ((eVar.f438x & 32) == 32) {
                        arrayList.add(eVar);
                    } else {
                        arrayList2.add(eVar);
                    }
                }
            } else {
                arrayList2.addAll(k());
            }
            this.f408k = false;
        }
    }

    public final boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return g(i8, keyEvent) != null;
    }

    public d j() {
        return this;
    }

    public final ArrayList<e> k() {
        boolean z8 = this.f405h;
        ArrayList<e> arrayList = this.f404g;
        if (!z8) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<e> arrayList2 = this.f403f;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = arrayList2.get(i8);
            if (eVar.isVisible()) {
                arrayList.add(eVar);
            }
        }
        this.f405h = false;
        this.f408k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f417u;
    }

    public boolean m() {
        return this.f401c;
    }

    public boolean n() {
        return this.f402d;
    }

    public final void o(boolean z8) {
        if (!this.f411n) {
            if (z8) {
                this.f405h = true;
                this.f408k = true;
            }
            CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
            if (!copyOnWriteArrayList.isEmpty()) {
                t();
                Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    g gVar = (g) next.get();
                    if (gVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        gVar.e();
                    }
                }
                s();
                return;
            }
            return;
        }
        this.f412o = true;
        if (z8) {
            this.f413p = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r1 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if ((r9 & 1) == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r1 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.MenuItem r7, androidx.appcompat.view.menu.g r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.e r7 = (androidx.appcompat.view.menu.e) r7
            r0 = 0
            if (r7 == 0) goto L_0x00c5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00c5
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f432p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x003e
        L_0x0019:
            androidx.appcompat.view.menu.d r1 = r7.f430n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            android.content.Intent r3 = r7.f423g
            if (r3 == 0) goto L_0x0034
            android.content.Context r1 = r1.f399a     // Catch:{ ActivityNotFoundException -> 0x002c }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002c }
            goto L_0x003e
        L_0x002c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0034:
            j0.b r1 = r7.A
            if (r1 == 0) goto L_0x0040
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0040
        L_0x003e:
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            j0.b r3 = r7.A
            if (r3 == 0) goto L_0x004d
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004d
            r4 = r2
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x005c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c1
        L_0x005c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006a
            if (r4 == 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00c4
            goto L_0x00c1
        L_0x006a:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0071
            r6.c(r0)
        L_0x0071:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0085
            androidx.appcompat.view.menu.j r9 = new androidx.appcompat.view.menu.j
            android.content.Context r5 = r6.f399a
            r9.<init>(r5, r6, r7)
            r7.f431o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0085:
            androidx.appcompat.view.menu.j r7 = r7.f431o
            if (r4 == 0) goto L_0x008c
            r3.f(r7)
        L_0x008c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.g>> r9 = r6.f415s
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0095
            goto L_0x00be
        L_0x0095:
            if (r8 == 0) goto L_0x009b
            boolean r0 = r8.g(r7)
        L_0x009b:
            java.util.Iterator r8 = r9.iterator()
        L_0x009f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            if (r4 != 0) goto L_0x00b7
            r9.remove(r3)
            goto L_0x009f
        L_0x00b7:
            if (r0 != 0) goto L_0x009f
            boolean r0 = r4.g(r7)
            goto L_0x009f
        L_0x00be:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00c4
        L_0x00c1:
            r6.c(r2)
        L_0x00c4:
            return r1
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.p(android.view.MenuItem, androidx.appcompat.view.menu.g, int):boolean");
    }

    public final boolean performIdentifierAction(int i8, int i9) {
        return p(findItem(i8), (g) null, i9);
    }

    public final boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        e g9 = g(i8, keyEvent);
        boolean p8 = g9 != null ? p(g9, (g) null, i9) : false;
        if ((i9 & 2) != 0) {
            c(true);
        }
        return p8;
    }

    public final void q(g gVar) {
        CopyOnWriteArrayList<WeakReference<g>> copyOnWriteArrayList = this.f415s;
        Iterator<WeakReference<g>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            g gVar2 = (g) next.get();
            if (gVar2 == null || gVar2 == gVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final void r(int i8, CharSequence charSequence, int i9, Drawable drawable, View view) {
        if (view != null) {
            this.f410m = null;
        } else {
            if (i8 > 0) {
                this.f410m = this.f400b.getText(i8);
            } else if (charSequence != null) {
                this.f410m = charSequence;
            }
            if (i9 > 0) {
                Object obj = a0.a.f10a;
                a.b.b(this.f399a, i9);
            }
        }
        o(false);
    }

    public final void removeGroup(int i8) {
        ArrayList<e> arrayList;
        int size = size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f403f;
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10).f419b == i8) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= size2 || arrayList.get(i10).f419b != i8) {
                    o(true);
                } else {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        arrayList.remove(i10);
                    }
                    i9 = i11;
                }
            }
            o(true);
        }
    }

    public final void removeItem(int i8) {
        ArrayList<e> arrayList;
        int size = size();
        int i9 = 0;
        while (true) {
            arrayList = this.f403f;
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (arrayList.get(i9).f418a == i8) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            arrayList.remove(i9);
            o(true);
        }
    }

    public final void s() {
        this.f411n = false;
        if (this.f412o) {
            this.f412o = false;
            o(this.f413p);
        }
    }

    public final void setGroupCheckable(int i8, boolean z8, boolean z9) {
        ArrayList<e> arrayList = this.f403f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = arrayList.get(i9);
            if (eVar.f419b == i8) {
                eVar.f438x = (eVar.f438x & -5) | (z9 ? 4 : 0);
                eVar.setCheckable(z8);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z8) {
        this.f417u = z8;
    }

    public final void setGroupEnabled(int i8, boolean z8) {
        ArrayList<e> arrayList = this.f403f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = arrayList.get(i9);
            if (eVar.f419b == i8) {
                eVar.setEnabled(z8);
            }
        }
    }

    public final void setGroupVisible(int i8, boolean z8) {
        ArrayList<e> arrayList = this.f403f;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = arrayList.get(i9);
            if (eVar.f419b == i8) {
                int i10 = eVar.f438x;
                int i11 = (i10 & -9) | (z8 ? 0 : 8);
                eVar.f438x = i11;
                if (i10 != i11) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            o(true);
        }
    }

    public void setQwertyMode(boolean z8) {
        this.f401c = z8;
        o(false);
    }

    public final int size() {
        return this.f403f.size();
    }

    public final void t() {
        if (!this.f411n) {
            this.f411n = true;
            this.f412o = false;
            this.f413p = false;
        }
    }
}
