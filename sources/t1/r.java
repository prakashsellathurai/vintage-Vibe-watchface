package t1;

import a8.f;
import android.content.ComponentName;
import androidx.wear.watchface.editor.EditorSession;
import j7.d;
import java.time.Instant;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import o1.c;
import p1.a;
import q1.b;
import q7.k;
import u1.e;
import u1.l;

public final class r implements EditorSession {

    /* renamed from: f  reason: collision with root package name */
    public final EditorSession f7450f;

    /* renamed from: g  reason: collision with root package name */
    public final ComponentName f7451g;

    /* renamed from: h  reason: collision with root package name */
    public final c f7452h;

    /* renamed from: i  reason: collision with root package name */
    public final Instant f7453i;

    public r(EditorSession editorSession) {
        k.e(editorSession, "wrappedEditorSession");
        this.f7450f = editorSession;
        this.f7451g = editorSession.J();
        this.f7452h = editorSession.k();
        this.f7453i = editorSession.f();
    }

    public final Object E(int i8, d<? super f> dVar) {
        return this.f7450f.E(i8, dVar);
    }

    public final ComponentName J() {
        return this.f7451g;
    }

    public final f<Map<Integer, a>> K() {
        return this.f7450f.K();
    }

    public final MutableStateFlow<e> b() {
        return this.f7450f.b();
    }

    public final void close() {
        this.f7450f.close();
    }

    public final l e() {
        return this.f7450f.e();
    }

    public final Instant f() {
        return this.f7453i;
    }

    public final c k() {
        return this.f7452h;
    }

    public final void l(boolean z8) {
        this.f7450f.l(z8);
    }

    public final f<Map<Integer, o1.a>> p() {
        return this.f7450f.p();
    }

    public final f<Map<Integer, b>> r() {
        return this.f7450f.r();
    }
}
