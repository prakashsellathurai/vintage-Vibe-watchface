package o2;

import android.graphics.Bitmap;
import android.util.LruCache;
import b3.b;

public final class g extends LruCache<Integer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f6022a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i8) {
        super(i8);
        this.f6022a = hVar;
    }

    public final void entryRemoved(boolean z8, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (bitmap != null) {
            ((b) this.f6022a.f6025c).f2563a.e(bitmap);
        }
    }
}
