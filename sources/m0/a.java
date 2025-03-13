package m0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.o;
import j0.d;
import j0.x;
import m0.c;

public final class a extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5352a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, o oVar) {
        super(inputConnection, false);
        this.f5352a = oVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        Bundle bundle2;
        c cVar = inputContentInfo == null ? null : new c(new c.a(inputContentInfo));
        o oVar = (o) this.f5352a;
        oVar.getClass();
        boolean z8 = false;
        if ((i8 & 1) != 0) {
            try {
                ((c.a) cVar.f5353a).b();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((c.a) cVar.f5353a).a();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((c.a) cVar.f5353a).f5354a.getDescription();
        c.a aVar = (c.a) cVar.f5353a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar.f5354a.getContentUri()));
        d.b aVar2 = Build.VERSION.SDK_INT >= 31 ? new d.a(clipData, 2) : new d.c(clipData, 2);
        aVar2.a(aVar.f5354a.getLinkUri());
        aVar2.setExtras(bundle2);
        if (x.f(oVar.f780a, aVar2.build()) == null) {
            z8 = true;
        }
        if (z8) {
            return true;
        }
        return super.commitContent(inputContentInfo, i8, bundle);
    }
}
