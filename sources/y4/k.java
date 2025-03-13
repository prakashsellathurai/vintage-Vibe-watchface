package y4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import x4.a;
import y4.l;

public final class k extends l.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f8488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f8489c;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f8488b = arrayList;
        this.f8489c = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i8, Canvas canvas) {
        for (l.f a9 : this.f8488b) {
            a9.a(this.f8489c, aVar, i8, canvas);
        }
    }
}
