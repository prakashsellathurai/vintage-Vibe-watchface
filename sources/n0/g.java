package n0;

import android.widget.ListView;

public final class g {
    public static boolean a(ListView listView, int i8) {
        return listView.canScrollList(i8);
    }

    public static void b(ListView listView, int i8) {
        listView.scrollListBy(i8);
    }
}
