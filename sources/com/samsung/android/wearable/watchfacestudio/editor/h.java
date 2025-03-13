package com.samsung.android.wearable.watchfacestudio.editor;

import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;
import com.samsung.android.wearable.watchfacestudio.editor.z;
import i5.j;
import java.util.Map;

public final /* synthetic */ class h implements x, z.e, TutorialView.a, androidx.lifecycle.z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f3893b;

    public /* synthetic */ h(w wVar, int i8) {
        this.f3892a = i8;
        this.f3893b = wVar;
    }

    public final void a() {
        this.f3893b.f3930b0.setVisibility(0);
    }

    public final void b(Object obj) {
        int i8 = this.f3892a;
        w wVar = this.f3893b;
        switch (i8) {
            case 4:
                wVar.f3936h0 = (Map) obj;
                wVar.o();
                return;
            default:
                wVar.f3937i0 = (Map) obj;
                wVar.f3941m0.forEach(new j(2));
                wVar.f3937i0.entrySet().stream().filter(new q(1)).forEach(new e(1, wVar));
                wVar.o();
                return;
        }
    }
}
