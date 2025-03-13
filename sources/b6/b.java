package b6;

import android.graphics.Color;
import android.graphics.drawable.Icon;
import java.util.ArrayList;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2603a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2604b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2605c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2606d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final Icon f2607f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2608g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public int f2609h = 0;

    public enum a {
        ;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public b(int i8, String str, String str2, String str3, String str4, Icon icon) {
        this.f2603a = i8;
        this.f2604b = str;
        this.f2605c = str2;
        this.f2606d = str3;
        this.e = str4;
        this.f2607f = icon;
    }

    public final void a(c cVar) {
        ArrayList<Color> arrayList = cVar.e;
        int size = arrayList.size();
        int i8 = this.f2609h;
        ArrayList arrayList2 = this.f2608g;
        if (size > i8) {
            this.f2609h = arrayList.size();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int i9 = this.f2609h;
                ArrayList<Color> arrayList3 = ((c) it.next()).e;
                int size2 = i9 - arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList3.add(arrayList3.get(0));
                }
            }
        } else {
            int size3 = arrayList.size();
            int i11 = this.f2609h;
            if (size3 < i11) {
                int size4 = i11 - arrayList.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    arrayList.add(arrayList.get(0));
                }
            }
        }
        arrayList2.add(cVar);
    }
}
