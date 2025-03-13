package n0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import j0.d;
import j0.q;
import java.util.Objects;

public final class n implements q {
    public final d a(View view, d dVar) {
        CharSequence charSequence;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(dVar);
        }
        if (dVar.f4921a.d() == 2) {
            return dVar;
        }
        d.e eVar = dVar.f4921a;
        ClipData a9 = eVar.a();
        int b9 = eVar.b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z8 = false;
        for (int i8 = 0; i8 < a9.getItemCount(); i8++) {
            ClipData.Item itemAt = a9.getItemAt(i8);
            if ((b9 & 1) != 0) {
                charSequence = itemAt.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            } else {
                charSequence = itemAt.coerceToStyledText(context);
            }
            if (charSequence != null) {
                if (!z8) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, charSequence);
                    z8 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
            }
        }
        return null;
    }
}
