package androidx.wear.watchface.editor;

import androidx.lifecycle.h;
import androidx.lifecycle.r;
import q7.p;
import y7.g;

public final class EditorSession$Companion$createOnWatchEditorSession$2$1 implements h {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g<h7.h> f2379f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p<EditorSession> f2380g;

    public EditorSession$Companion$createOnWatchEditorSession$2$1(y7.h hVar, p pVar) {
        this.f2379f = hVar;
        this.f2380g = pVar;
    }

    public final void a(r rVar) {
        p<EditorSession> pVar = this.f2380g;
        EditorSession editorSession = (EditorSession) pVar.f6643f;
        if (editorSession != null) {
            editorSession.close();
        }
        pVar.f6643f = null;
    }

    public final void b(r rVar) {
        this.f2379f.i(h7.h.f4787a);
    }
}
