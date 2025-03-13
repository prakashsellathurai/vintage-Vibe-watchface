package k6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public final class a extends b {
    public a(Resources resources, String str) {
        super(resources, str);
    }

    public final Bitmap a(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        String substring = lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
        int lastIndexOf2 = substring.lastIndexOf(46);
        if (lastIndexOf2 != -1) {
            substring = substring.substring(0, lastIndexOf2);
        }
        String str2 = this.f5182b;
        Resources resources = this.f5181a;
        int identifier = resources.getIdentifier(substring, "drawable", str2);
        if (identifier != 0) {
            return BitmapFactory.decodeResource(resources, identifier);
        }
        Log.e("DWF:BitmapImageDecoder", "Cannot decode image '" + str + "'");
        return null;
    }
}
