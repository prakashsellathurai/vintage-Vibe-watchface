package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

public final class c extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final d f393a;

    /* renamed from: b  reason: collision with root package name */
    public int f394b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f395c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f396d;
    public final LayoutInflater e;

    /* renamed from: f  reason: collision with root package name */
    public final int f397f;

    public c(d dVar, LayoutInflater layoutInflater, boolean z8, int i8) {
        this.f396d = z8;
        this.e = layoutInflater;
        this.f393a = dVar;
        this.f397f = i8;
        a();
    }

    public final void a() {
        d dVar = this.f393a;
        e eVar = dVar.f416t;
        if (eVar != null) {
            dVar.i();
            ArrayList<e> arrayList = dVar.f407j;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (arrayList.get(i8) == eVar) {
                    this.f394b = i8;
                    return;
                }
            }
        }
        this.f394b = -1;
    }

    /* renamed from: b */
    public final e getItem(int i8) {
        ArrayList<e> arrayList;
        boolean z8 = this.f396d;
        d dVar = this.f393a;
        if (z8) {
            dVar.i();
            arrayList = dVar.f407j;
        } else {
            arrayList = dVar.k();
        }
        int i9 = this.f394b;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return arrayList.get(i8);
    }

    public final int getCount() {
        ArrayList<e> arrayList;
        boolean z8 = this.f396d;
        d dVar = this.f393a;
        if (z8) {
            dVar.i();
            arrayList = dVar.f407j;
        } else {
            arrayList = dVar.k();
        }
        return this.f394b < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public final long getItemId(int i8) {
        return (long) i8;
    }

    public final View getView(int i8, View view, ViewGroup viewGroup) {
        boolean z8 = false;
        if (view == null) {
            view = this.e.inflate(this.f397f, viewGroup, false);
        }
        int i9 = getItem(i8).f419b;
        int i10 = i8 - 1;
        int i11 = i10 >= 0 ? getItem(i10).f419b : i9;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f393a.l() && i9 != i11) {
            z8 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z8);
        h.a aVar = (h.a) view;
        if (this.f395c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.b(getItem(i8));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
