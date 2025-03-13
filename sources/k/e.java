package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import e0.a;
import e0.b;
import e0.c;
import p.f;

public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f5081d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f5081d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i8) {
        return c(this.f5081d.add(i8));
    }

    public final MenuItem add(int i8, int i9, int i10, int i11) {
        return c(this.f5081d.add(i8, i9, i10, i11));
    }

    public final MenuItem add(int i8, int i9, int i10, CharSequence charSequence) {
        return c(this.f5081d.add(i8, i9, i10, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return c(this.f5081d.add(charSequence));
    }

    public final int addIntentOptions(int i8, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f5081d.addIntentOptions(i8, i9, i10, componentName, intentArr, intent, i11, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr2[i12] = c(menuItemArr3[i12]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i8) {
        return d(this.f5081d.addSubMenu(i8));
    }

    public final SubMenu addSubMenu(int i8, int i9, int i10, int i11) {
        return d(this.f5081d.addSubMenu(i8, i9, i10, i11));
    }

    public final SubMenu addSubMenu(int i8, int i9, int i10, CharSequence charSequence) {
        return d(this.f5081d.addSubMenu(i8, i9, i10, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f5081d.addSubMenu(charSequence));
    }

    public final void clear() {
        f<b, MenuItem> fVar = this.f5069b;
        if (fVar != null) {
            fVar.clear();
        }
        f<c, SubMenu> fVar2 = this.f5070c;
        if (fVar2 != null) {
            fVar2.clear();
        }
        this.f5081d.clear();
    }

    public final void close() {
        this.f5081d.close();
    }

    public final MenuItem findItem(int i8) {
        return c(this.f5081d.findItem(i8));
    }

    public final MenuItem getItem(int i8) {
        return c(this.f5081d.getItem(i8));
    }

    public final boolean hasVisibleItems() {
        return this.f5081d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return this.f5081d.isShortcutKey(i8, keyEvent);
    }

    public final boolean performIdentifierAction(int i8, int i9) {
        return this.f5081d.performIdentifierAction(i8, i9);
    }

    public final boolean performShortcut(int i8, KeyEvent keyEvent, int i9) {
        return this.f5081d.performShortcut(i8, keyEvent, i9);
    }

    public final void removeGroup(int i8) {
        if (this.f5069b != null) {
            int i9 = 0;
            while (true) {
                f<b, MenuItem> fVar = this.f5069b;
                if (i9 >= fVar.f6235h) {
                    break;
                }
                if (fVar.h(i9).getGroupId() == i8) {
                    this.f5069b.j(i9);
                    i9--;
                }
                i9++;
            }
        }
        this.f5081d.removeGroup(i8);
    }

    public final void removeItem(int i8) {
        if (this.f5069b != null) {
            int i9 = 0;
            while (true) {
                f<b, MenuItem> fVar = this.f5069b;
                if (i9 >= fVar.f6235h) {
                    break;
                } else if (fVar.h(i9).getItemId() == i8) {
                    this.f5069b.j(i9);
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f5081d.removeItem(i8);
    }

    public final void setGroupCheckable(int i8, boolean z8, boolean z9) {
        this.f5081d.setGroupCheckable(i8, z8, z9);
    }

    public final void setGroupEnabled(int i8, boolean z8) {
        this.f5081d.setGroupEnabled(i8, z8);
    }

    public final void setGroupVisible(int i8, boolean z8) {
        this.f5081d.setGroupVisible(i8, z8);
    }

    public final void setQwertyMode(boolean z8) {
        this.f5081d.setQwertyMode(z8);
    }

    public final int size() {
        return this.f5081d.size();
    }
}
