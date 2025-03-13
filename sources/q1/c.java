package q1;

import android.content.res.Resources;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import java.time.Instant;
import q7.k;

public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final r f6436a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f6437b;

    static {
        ComplicationText plainText = ComplicationText.plainText("");
        k.d(plainText, "plainText(text)");
        f6436a = new r(plainText);
        ComplicationText plainText2 = ComplicationText.plainText(ComplicationData.PLACEHOLDER_STRING);
        k.d(plainText2, "plainText(text)");
        f6437b = new r(plainText2);
    }

    ComplicationText a();

    CharSequence b(Resources resources, Instant instant);

    boolean c();

    Instant d(Instant instant);

    boolean e() {
        return false;
    }
}
