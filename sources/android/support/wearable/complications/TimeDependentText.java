package android.support.wearable.complications;

import android.content.res.Resources;
import android.os.Parcelable;
import java.io.Serializable;

public interface TimeDependentText extends Parcelable, Serializable {
    long getNextChangeTime(long j8);

    CharSequence getTextAt(Resources resources, long j8);

    boolean returnsSameText(long j8, long j9);
}
