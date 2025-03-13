package q1;

import android.annotation.SuppressLint;
import android.support.wearable.complications.ComplicationText;
import l1.e;
import q7.k;

public final class w {
    @SuppressLint({"NewApi"})
    public static final c a(ComplicationText complicationText, boolean z8) {
        c cVar;
        if (z8 && complicationText.isPlaceholder()) {
            return c.f6437b;
        }
        if (complicationText.getDynamicValue() != null) {
            e.u dynamicValue = complicationText.getDynamicValue();
            k.b(dynamicValue);
            CharSequence surroundingText = complicationText.getSurroundingText();
            if (surroundingText == null) {
                surroundingText = "";
            }
            cVar = new g(surroundingText, dynamicValue);
        } else {
            cVar = new f(complicationText);
        }
        return cVar;
    }
}
