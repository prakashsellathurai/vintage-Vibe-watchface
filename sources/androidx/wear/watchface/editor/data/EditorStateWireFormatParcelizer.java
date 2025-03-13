package androidx.wear.watchface.editor.data;

import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.a;

public final class EditorStateWireFormatParcelizer {
    public static EditorStateWireFormat read(a aVar) {
        EditorStateWireFormat editorStateWireFormat = new EditorStateWireFormat();
        editorStateWireFormat.f2402f = aVar.C(1, editorStateWireFormat.f2402f);
        editorStateWireFormat.f2403g = (UserStyleWireFormat) aVar.F(editorStateWireFormat.f2403g, 2);
        editorStateWireFormat.f2404h = aVar.u(3, editorStateWireFormat.f2404h);
        editorStateWireFormat.f2405i = aVar.i(4, editorStateWireFormat.f2405i);
        editorStateWireFormat.f2406j = aVar.k(5, editorStateWireFormat.f2406j);
        return editorStateWireFormat;
    }

    public static void write(EditorStateWireFormat editorStateWireFormat, a aVar) {
        aVar.H(true, false);
        aVar.c0(1, editorStateWireFormat.f2402f);
        aVar.g0(editorStateWireFormat.f2403g, 2);
        aVar.V(3, editorStateWireFormat.f2404h);
        aVar.J(4, editorStateWireFormat.f2405i);
        aVar.L(5, editorStateWireFormat.f2406j);
    }
}
