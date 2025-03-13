package o0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.j0;

public final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public final a f5984a;

    public interface a {
    }

    public b(a aVar) {
        this.f5984a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return ((j0) this.f5984a).c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            o0.b$a r3 = r3.f5984a
            androidx.appcompat.widget.j0 r3 = (androidx.appcompat.widget.j0) r3
            if (r4 != 0) goto L_0x0009
            java.lang.String r4 = ""
            goto L_0x0010
        L_0x0009:
            r3.getClass()
            java.lang.String r4 = r4.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r0 = r3.f748k
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0034
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            android.app.SearchableInfo r0 = r3.f749l     // Catch:{ RuntimeException -> 0x002c }
            android.database.Cursor r3 = r3.g(r0, r4)     // Catch:{ RuntimeException -> 0x002c }
            if (r3 == 0) goto L_0x0034
            r3.getCount()     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r0, r3)
        L_0x0034:
            r3 = r2
        L_0x0035:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L_0x0045
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L_0x004a
        L_0x0045:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f5984a;
        Cursor cursor = ((a) aVar).f5978c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((j0) aVar).b((Cursor) obj);
        }
    }
}
