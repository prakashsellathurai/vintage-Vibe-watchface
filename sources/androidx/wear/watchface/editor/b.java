package androidx.wear.watchface.editor;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.wear.watchface.editor.EditorSession;
import j7.d;
import l7.c;
import l7.e;

@e(c = "androidx.wear.watchface.editor.EditorSession$Companion", f = "EditorSession.kt", l = {316}, m = "createOnWatchEditorSessionImpl$watchface_editor_release")
public final class b extends c {

    /* renamed from: i  reason: collision with root package name */
    public Object f2385i;

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f2386j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ EditorSession.Companion f2387k;

    /* renamed from: l  reason: collision with root package name */
    public int f2388l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(EditorSession.Companion companion, d<? super b> dVar) {
        super(dVar);
        this.f2387k = companion;
    }

    public final Object h(Object obj) {
        this.f2386j = obj;
        this.f2388l |= Integer.MIN_VALUE;
        return this.f2387k.b((ComponentActivity) null, (Intent) null, (EditorSession.Companion.b) null, this);
    }
}
