package android.support.wearable.complications;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationTextTemplate implements Parcelable, TimeDependentText {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Parcelable.Creator<ComplicationTextTemplate> CREATOR = new a();
    private static final String KEY_SURROUNDING_STRING = "KEY_SURROUNDING_STRING";
    private static final String KEY_TIME_DEPENDENT_TEXTS = "KEY_TIME_DEPENDENT_TEXTS";
    private final ComplicationText[] mComplicationTexts;
    private final CharSequence mSurroundingText;

    public class a implements Parcelable.Creator<ComplicationTextTemplate> {
        public final Object createFromParcel(Parcel parcel) {
            return new ComplicationTextTemplate(parcel, (a) null);
        }

        public final Object[] newArray(int i8) {
            return new ComplicationTextTemplate[i8];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f235a = new ArrayList(2);
    }

    public static class c implements Serializable {
    }

    private ComplicationTextTemplate(Bundle bundle) {
        this.mSurroundingText = bundle.getCharSequence(KEY_SURROUNDING_STRING);
        Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_TIME_DEPENDENT_TEXTS);
        this.mComplicationTexts = new ComplicationText[parcelableArray.length];
        for (int i8 = 0; i8 < parcelableArray.length; i8++) {
            this.mComplicationTexts[i8] = (ComplicationText) parcelableArray[i8];
        }
        checkFields();
    }

    private ComplicationTextTemplate(Parcel parcel) {
        this(parcel.readBundle(ComplicationTextTemplate.class.getClassLoader()));
    }

    public /* synthetic */ ComplicationTextTemplate(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ComplicationTextTemplate(CharSequence charSequence, ComplicationText[] complicationTextArr) {
        this.mSurroundingText = charSequence;
        this.mComplicationTexts = complicationTextArr;
        checkFields();
    }

    private void checkFields() {
        if (this.mSurroundingText == null && this.mComplicationTexts.length == 0) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public int describeContents() {
        return 0;
    }

    public long getNextChangeTime(long j8) {
        long j9 = Long.MAX_VALUE;
        for (ComplicationText nextChangeTime : this.mComplicationTexts) {
            j9 = Math.min(j9, nextChangeTime.getNextChangeTime(j8));
        }
        return j9;
    }

    public CharSequence getTextAt(Resources resources, long j8) {
        int length = this.mComplicationTexts.length;
        if (length == 0) {
            return this.mSurroundingText;
        }
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i8 = 0; i8 < length; i8++) {
            charSequenceArr[i8] = this.mComplicationTexts[i8].getTextAt(resources, j8);
        }
        CharSequence charSequence = this.mSurroundingText;
        return charSequence == null ? TextUtils.join(" ", charSequenceArr) : TextUtils.expandTemplate(charSequence, charSequenceArr);
    }

    public boolean returnsSameText(long j8, long j9) {
        for (ComplicationText returnsSameText : this.mComplicationTexts) {
            if (!returnsSameText.returnsSameText(j8, j9)) {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    public String toString() {
        return "ComplicationTextTemplate{surroundingText=" + this.mSurroundingText + ", complicationTexts=" + Arrays.toString(this.mComplicationTexts) + "}";
    }

    public Object writeReplace() {
        return new c();
    }

    public void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(KEY_SURROUNDING_STRING, this.mSurroundingText);
        bundle.putParcelableArray(KEY_TIME_DEPENDENT_TEXTS, this.mComplicationTexts);
        parcel.writeBundle(bundle);
    }
}
