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
import java.util.Arrays;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l1.e;

@SuppressLint({"BanParcelableUsage"})
public final class ComplicationText implements Parcelable, TimeDependentText, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Parcelable.Creator<ComplicationText> CREATOR = new a();
    public static final int DIFFERENCE_STYLE_SHORT_DUAL_UNIT = 3;
    public static final int DIFFERENCE_STYLE_SHORT_SINGLE_UNIT = 2;
    public static final int DIFFERENCE_STYLE_SHORT_WORDS_SINGLE_UNIT = 5;
    public static final int DIFFERENCE_STYLE_STOPWATCH = 1;
    public static final int DIFFERENCE_STYLE_WORDS_SINGLE_UNIT = 4;
    public static final int FORMAT_STYLE_DEFAULT = 1;
    public static final int FORMAT_STYLE_LOWER_CASE = 3;
    public static final int FORMAT_STYLE_UPPER_CASE = 2;
    private static final String KEY_DIFFERENCE_MINIMUM_UNIT = "minimum_unit";
    private static final String KEY_DIFFERENCE_PERIOD_END = "difference_period_end";
    private static final String KEY_DIFFERENCE_PERIOD_START = "difference_period_start";
    private static final String KEY_DIFFERENCE_SHOW_NOW_TEXT = "show_now_text";
    private static final String KEY_DIFFERENCE_STYLE = "difference_style";
    private static final String KEY_DYNAMIC_STRING = "dynamic_string";
    private static final String KEY_FORMAT_FORMAT_STRING = "format_format_string";
    private static final String KEY_FORMAT_STYLE = "format_style";
    private static final String KEY_FORMAT_TIME_ZONE = "format_time_zone";
    private static final String KEY_SURROUNDING_STRING = "surrounding_string";
    private CharSequence mDependentTextCache;
    private long mDependentTextCacheTime;
    private final e.u mDynamicText;
    private final CharSequence mSurroundingText;
    private final CharSequence[] mTemplateValues;
    private final TimeDependentText mTimeDependentText;

    public class a implements Parcelable.Creator<ComplicationText> {
        public final Object createFromParcel(Parcel parcel) {
            return new ComplicationText(parcel, (a) null);
        }

        public final Object[] newArray(int i8) {
            return new ComplicationText[i8];
        }
    }

    public static class b implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final TimeDependentText f234f;

        public b(TimeDependentText timeDependentText) {
            this.f234f = timeDependentText;
        }
    }

    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [android.support.wearable.complications.TimeDependentText] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.TimeZone] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.support.wearable.complications.TimeDifferenceText] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ComplicationText(android.os.Parcel r15) {
        /*
            r14 = this;
            r14.<init>()
            r0 = 9
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r1 = 0
            java.lang.String r2 = ""
            r0[r1] = r2
            r2 = 1
            java.lang.String r3 = "^2"
            r0[r2] = r3
            r3 = 2
            java.lang.String r4 = "^3"
            r0[r3] = r4
            r3 = 3
            java.lang.String r4 = "^4"
            r0[r3] = r4
            r3 = 4
            java.lang.String r4 = "^5"
            r0[r3] = r4
            r3 = 5
            java.lang.String r4 = "^6"
            r0[r3] = r4
            r3 = 6
            java.lang.String r4 = "^7"
            r0[r3] = r4
            r3 = 7
            java.lang.String r4 = "^8"
            r0[r3] = r4
            r3 = 8
            java.lang.String r4 = "^9"
            r0[r3] = r4
            r14.mTemplateValues = r0
            java.lang.Class<android.support.wearable.complications.ComplicationText> r0 = android.support.wearable.complications.ComplicationText.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r15 = r15.readBundle(r0)
            java.lang.String r0 = "surrounding_string"
            java.lang.CharSequence r0 = r15.getCharSequence(r0)
            r14.mSurroundingText = r0
            java.lang.String r0 = "dynamic_string"
            boolean r3 = r15.containsKey(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0073
            byte[] r0 = r15.getByteArray(r0)
            int r3 = r0.length
            androidx.wear.protolayout.protobuf.h$a r0 = androidx.wear.protolayout.protobuf.h.d(r0, r1, r3, r1)     // Catch:{ IOException -> 0x006a }
            androidx.wear.protolayout.protobuf.n r1 = androidx.wear.protolayout.protobuf.n.a()     // Catch:{ IOException -> 0x006a }
            m1.d0 r0 = m1.d0.N(r0, r1)     // Catch:{ IOException -> 0x006a }
            l1.e$u r0 = l1.e.f(r0)     // Catch:{ IOException -> 0x006a }
            r14.mDynamicText = r0
            goto L_0x0075
        L_0x006a:
            r14 = move-exception
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Byte array could not be parsed into DynamicString"
            r15.<init>(r0, r14)
            throw r15
        L_0x0073:
            r14.mDynamicText = r4
        L_0x0075:
            java.lang.String r0 = "difference_style"
            boolean r1 = r15.containsKey(r0)
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = "difference_period_start"
            boolean r3 = r15.containsKey(r1)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = "difference_period_end"
            boolean r5 = r15.containsKey(r3)
            if (r5 == 0) goto L_0x00b0
            android.support.wearable.complications.TimeDifferenceText r4 = new android.support.wearable.complications.TimeDifferenceText
            long r7 = r15.getLong(r1)
            long r9 = r15.getLong(r3)
            int r11 = r15.getInt(r0)
            java.lang.String r0 = "show_now_text"
            boolean r12 = r15.getBoolean(r0, r2)
            java.lang.String r0 = "minimum_unit"
            java.lang.String r15 = r15.getString(r0)
            java.util.concurrent.TimeUnit r13 = timeUnitFromName(r15)
            r6 = r4
            r6.<init>(r7, r9, r11, r12, r13)
            goto L_0x00e0
        L_0x00b0:
            java.lang.String r0 = "format_format_string"
            boolean r1 = r15.containsKey(r0)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = "format_style"
            boolean r2 = r15.containsKey(r1)
            if (r2 == 0) goto L_0x00e0
            java.lang.String r2 = "format_time_zone"
            boolean r3 = r15.containsKey(r2)
            if (r3 == 0) goto L_0x00d0
            java.lang.String r2 = r15.getString(r2)
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r2)
        L_0x00d0:
            android.support.wearable.complications.TimeFormatText r2 = new android.support.wearable.complications.TimeFormatText
            java.lang.String r0 = r15.getString(r0)
            int r15 = r15.getInt(r1)
            r2.<init>(r0, r15, r4)
            r14.mTimeDependentText = r2
            goto L_0x00e2
        L_0x00e0:
            r14.mTimeDependentText = r4
        L_0x00e2:
            r14.checkFields()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.ComplicationText.<init>(android.os.Parcel):void");
    }

    public /* synthetic */ ComplicationText(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ComplicationText(CharSequence charSequence) {
        this(charSequence, (TimeDependentText) null, (e.u) null);
    }

    public ComplicationText(CharSequence charSequence, TimeDependentText timeDependentText) {
        this(charSequence, timeDependentText, (e.u) null);
    }

    private ComplicationText(CharSequence charSequence, TimeDependentText timeDependentText, e.u uVar) {
        this.mTemplateValues = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        this.mSurroundingText = charSequence;
        this.mTimeDependentText = timeDependentText;
        this.mDynamicText = uVar;
        checkFields();
    }

    public /* synthetic */ ComplicationText(CharSequence charSequence, TimeDependentText timeDependentText, e.u uVar, a aVar) {
        this(charSequence, timeDependentText, uVar);
    }

    public ComplicationText(CharSequence charSequence, e.u uVar) {
        this(charSequence, (TimeDependentText) null, uVar);
    }

    public ComplicationText(e.u uVar) {
        this((CharSequence) null, (TimeDependentText) null, uVar);
    }

    private void checkFields() {
        if (this.mSurroundingText == null && this.mTimeDependentText == null && this.mDynamicText == null) {
            throw new IllegalStateException("One of mSurroundingText, mTimeDependentText and mDynamicText must be non-null");
        }
    }

    public static ComplicationText plainText(CharSequence charSequence) {
        return new ComplicationText(charSequence);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static TimeUnit timeUnitFromName(String str) {
        if (str == null) {
            return null;
        }
        try {
            return TimeUnit.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComplicationText.class != obj.getClass()) {
            return $assertionsDisabled;
        }
        ComplicationText complicationText = (ComplicationText) obj;
        e.u uVar = this.mDynamicText;
        if (uVar == null) {
            if (complicationText.mDynamicText != null) {
                return $assertionsDisabled;
            }
        } else if (complicationText.mDynamicText == null || !Arrays.equals(uVar.a(), complicationText.mDynamicText.a())) {
            return $assertionsDisabled;
        }
        if (!Objects.equals(this.mTimeDependentText, complicationText.mTimeDependentText)) {
            return $assertionsDisabled;
        }
        CharSequence charSequence = this.mSurroundingText;
        if (charSequence == null) {
            if (complicationText.mSurroundingText != null) {
                return $assertionsDisabled;
            }
        } else if (complicationText.mSurroundingText != null && charSequence.toString().contentEquals(complicationText.mSurroundingText)) {
            return true;
        } else {
            return $assertionsDisabled;
        }
        return true;
    }

    public e.u getDynamicValue() {
        return this.mDynamicText;
    }

    public long getNextChangeTime(long j8) {
        TimeDependentText timeDependentText = this.mTimeDependentText;
        if (timeDependentText == null) {
            return Long.MAX_VALUE;
        }
        return timeDependentText.getNextChangeTime(j8);
    }

    public CharSequence getSurroundingText() {
        return this.mSurroundingText;
    }

    public CharSequence getTextAt(Resources resources, long j8) {
        CharSequence charSequence;
        if (this.mDynamicText != null && this.mTimeDependentText == null && this.mSurroundingText == null) {
            throw new UnsupportedOperationException("getTextAt not supported for DynamicText");
        }
        TimeDependentText timeDependentText = this.mTimeDependentText;
        if (timeDependentText == null) {
            return this.mSurroundingText;
        }
        if (this.mDependentTextCache == null || !timeDependentText.returnsSameText(this.mDependentTextCacheTime, j8)) {
            charSequence = this.mTimeDependentText.getTextAt(resources, j8);
            this.mDependentTextCacheTime = j8;
            this.mDependentTextCache = charSequence;
        } else {
            charSequence = this.mDependentTextCache;
        }
        CharSequence charSequence2 = this.mSurroundingText;
        if (charSequence2 == null) {
            return charSequence;
        }
        CharSequence[] charSequenceArr = this.mTemplateValues;
        charSequenceArr[0] = charSequence;
        return TextUtils.expandTemplate(charSequence2, charSequenceArr);
    }

    public TimeDependentText getTimeDependentText() {
        if (this.mDynamicText == null) {
            return this.mTimeDependentText;
        }
        throw new UnsupportedOperationException("getTimeDependentText not supported for DynamicText");
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mSurroundingText;
        objArr[1] = this.mTimeDependentText;
        e.u uVar = this.mDynamicText;
        objArr[2] = uVar == null ? null : Integer.valueOf(Arrays.hashCode(uVar.a()));
        return Objects.hash(objArr);
    }

    public boolean isAlwaysEmpty() {
        if (this.mTimeDependentText != null || !TextUtils.isEmpty(this.mSurroundingText)) {
            return $assertionsDisabled;
        }
        return true;
    }

    public boolean isPlaceholder() {
        CharSequence charSequence = this.mSurroundingText;
        return charSequence == null ? $assertionsDisabled : charSequence.toString().equals(ComplicationData.PLACEHOLDER_STRING);
    }

    public boolean isTimeDependent() {
        if (this.mTimeDependentText != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean returnsSameText(long j8, long j9) {
        TimeDependentText timeDependentText = this.mTimeDependentText;
        if (timeDependentText == null) {
            return true;
        }
        return timeDependentText.returnsSameText(j8, j9);
    }

    public String toString() {
        return "ComplicationText{mSurroundingText=" + ComplicationData.maybeRedact(this.mSurroundingText) + ", mTimeDependentText=" + this.mTimeDependentText + ", mDynamicText=" + this.mDynamicText + "}";
    }

    public Object writeReplace() {
        return new b(this.mTimeDependentText);
    }

    public void writeToParcel(Parcel parcel, int i8) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        bundle.putCharSequence(KEY_SURROUNDING_STRING, this.mSurroundingText);
        e.u uVar = this.mDynamicText;
        if (uVar != null) {
            bundle.putByteArray(KEY_DYNAMIC_STRING, uVar.a());
        }
        TimeDependentText timeDependentText = this.mTimeDependentText;
        if (timeDependentText != null) {
            if (timeDependentText instanceof TimeDifferenceText) {
                TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
                bundle.putLong(KEY_DIFFERENCE_PERIOD_START, timeDifferenceText.getReferencePeriodStart());
                bundle.putLong(KEY_DIFFERENCE_PERIOD_END, timeDifferenceText.getReferencePeriodEnd());
                bundle.putInt(KEY_DIFFERENCE_STYLE, timeDifferenceText.getStyle());
                bundle.putBoolean(KEY_DIFFERENCE_SHOW_NOW_TEXT, timeDifferenceText.shouldShowNowText());
                if (timeDifferenceText.getMinimumUnit() != null) {
                    str = timeDifferenceText.getMinimumUnit().name();
                    str2 = KEY_DIFFERENCE_MINIMUM_UNIT;
                }
            } else if (timeDependentText instanceof TimeFormatText) {
                TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
                bundle.putString(KEY_FORMAT_FORMAT_STRING, timeFormatText.getFormatString());
                bundle.putInt(KEY_FORMAT_STYLE, timeFormatText.getStyle());
                TimeZone timeZone = timeFormatText.getTimeZone();
                if (timeZone != null) {
                    str2 = KEY_FORMAT_TIME_ZONE;
                    str = timeZone.getID();
                }
            }
            bundle.putString(str2, str);
        }
        parcel.writeBundle(bundle);
    }
}
