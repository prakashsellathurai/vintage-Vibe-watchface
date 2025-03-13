package o0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import o0.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5976a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5977b = true;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f5978c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f5979d = -1;
    public C0097a e = new C0097a();

    /* renamed from: f  reason: collision with root package name */
    public DataSetObserver f5980f = new b();

    /* renamed from: g  reason: collision with root package name */
    public b f5981g;

    /* renamed from: o0.a$a  reason: collision with other inner class name */
    public class C0097a extends ContentObserver {
        public C0097a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z8) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f5977b && (cursor = aVar.f5978c) != null && !cursor.isClosed()) {
                aVar.f5976a = aVar.f5978c.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f5976a = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f5976a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f5978c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0097a aVar = this.e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f5980f;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f5978c = cursor;
            if (cursor != null) {
                C0097a aVar2 = this.e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f5980f;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f5979d = cursor.getColumnIndexOrThrow("_id");
                this.f5976a = true;
                notifyDataSetChanged();
            } else {
                this.f5979d = -1;
                this.f5976a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f5976a || (cursor = this.f5978c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f5976a) {
            return null;
        }
        this.f5978c.moveToPosition(i8);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f5987j.inflate(cVar.f5986i, viewGroup, false);
        }
        a(view, this.f5978c);
        return view;
    }

    public final Filter getFilter() {
        if (this.f5981g == null) {
            this.f5981g = new b(this);
        }
        return this.f5981g;
    }

    public final Object getItem(int i8) {
        Cursor cursor;
        if (!this.f5976a || (cursor = this.f5978c) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f5978c;
    }

    public final long getItemId(int i8) {
        Cursor cursor;
        if (!this.f5976a || (cursor = this.f5978c) == null || !cursor.moveToPosition(i8)) {
            return 0;
        }
        return this.f5978c.getLong(this.f5979d);
    }

    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f5976a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f5978c.moveToPosition(i8)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.f5978c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i8);
        }
    }
}
