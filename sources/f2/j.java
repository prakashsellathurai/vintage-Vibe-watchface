package f2;

import android.graphics.PointF;
import d2.a;
import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4349a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f4350b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4351c;

    public j() {
        this.f4349a = new ArrayList();
    }

    public j(PointF pointF, boolean z8, List<a> list) {
        this.f4350b = pointF;
        this.f4351c = z8;
        this.f4349a = new ArrayList(list);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f4349a.size() + "closed=" + this.f4351c + '}';
    }
}
