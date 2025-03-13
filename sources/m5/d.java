package m5;

import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5456a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f5457b;

    /* renamed from: c  reason: collision with root package name */
    public View f5458c;

    public d(FrameLayout frameLayout, int i8, ArrayList arrayList) {
        Paint paint = new Paint(3);
        this.f5457b = paint;
        this.f5458c = null;
        paint.setColor(Color.argb(0.5f, 0.0f, 0.0f, 0.0f));
        for (int i9 = 0; i9 < i8; i9++) {
            a aVar = new a(this, frameLayout.getContext());
            aVar.setVisibility(4);
            frameLayout.addView(aVar);
            this.f5456a.add(aVar);
        }
        if (arrayList != null) {
            Paint paint2 = new Paint(3);
            b bVar = new b(this, frameLayout.getContext(), arrayList, paint2);
            bVar.setVisibility(4);
            frameLayout.addView(bVar);
            this.f5456a.add(bVar);
            c cVar = new c(this, frameLayout.getContext(), arrayList, paint2);
            this.f5458c = cVar;
            cVar.setVisibility(4);
            frameLayout.addView(this.f5458c);
        }
    }
}
