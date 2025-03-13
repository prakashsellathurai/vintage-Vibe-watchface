package android.support.wearable.complications;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class TimeFormatText implements TimeDependentText {
    public static final Parcelable.Creator<TimeFormatText> CREATOR = new a();
    private static final b[] DATE_TIME_FORMATS;
    private static final Date sDate = new Date();
    private final SimpleDateFormat mDateFormat;
    private final int mStyle;
    private long mTimePrecision;
    private final TimeZone mTimeZone;

    public class a implements Parcelable.Creator<TimeFormatText> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeFormatText(parcel);
        }

        public final Object[] newArray(int i8) {
            return new TimeFormatText[i8];
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f237a;

        /* renamed from: b  reason: collision with root package name */
        public final long f238b;

        public b(String[] strArr, long j8) {
            this.f237a = strArr;
            this.f238b = j8;
        }
    }

    public static class c implements Serializable {
    }

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        DATE_TIME_FORMATS = new b[]{new b(new String[]{"S", "s"}, TimeUnit.SECONDS.toMillis(1)), new b(new String[]{"m"}, TimeUnit.MINUTES.toMillis(1)), new b(new String[]{"H", "K", "h", "k", "j", "J", "C"}, timeUnit.toMillis(1)), new b(new String[]{"a", "b", "B"}, timeUnit.toMillis(12))};
    }

    public TimeFormatText(Parcel parcel) {
        this.mDateFormat = (SimpleDateFormat) parcel.readSerializable();
        this.mStyle = parcel.readInt();
        this.mTimeZone = (TimeZone) parcel.readSerializable();
        this.mTimePrecision = -1;
    }

    public TimeFormatText(String str, int i8, TimeZone timeZone) {
        if (str != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            this.mDateFormat = simpleDateFormat;
            this.mStyle = i8;
            this.mTimePrecision = -1;
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
                this.mTimeZone = timeZone;
                return;
            }
            this.mTimeZone = simpleDateFormat.getTimeZone();
            return;
        }
        throw new IllegalArgumentException("Format must be specified.");
    }

    public TimeFormatText(SimpleDateFormat simpleDateFormat, int i8, TimeZone timeZone, long j8) {
        this.mDateFormat = simpleDateFormat;
        this.mStyle = i8;
        this.mTimeZone = timeZone;
        this.mTimePrecision = j8;
    }

    private String getDateFormatWithoutText(String str) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        boolean z8 = false;
        while (i8 < str.length()) {
            if (str.charAt(i8) == '\'') {
                int i9 = i8 + 1;
                if (i9 >= str.length() || str.charAt(i9) != '\'') {
                    z8 = !z8;
                    i8 = i9;
                } else {
                    i8 += 2;
                }
            } else {
                if (!z8) {
                    sb.append(str.charAt(i8));
                }
                i8++;
            }
        }
        return sb.toString();
    }

    private long getOffset(long j8) {
        Date date = sDate;
        date.setTime(j8);
        return this.mTimeZone.inDaylightTime(date) ? ((long) this.mTimeZone.getRawOffset()) + ((long) this.mTimeZone.getDSTSavings()) : (long) this.mTimeZone.getRawOffset();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimeFormatText.class != obj.getClass()) {
            return false;
        }
        TimeFormatText timeFormatText = (TimeFormatText) obj;
        return this.mStyle == timeFormatText.mStyle && this.mTimePrecision == timeFormatText.mTimePrecision && Objects.equals(this.mDateFormat, timeFormatText.mDateFormat) && Objects.equals(this.mTimeZone, timeFormatText.mTimeZone);
    }

    public String getFormatString() {
        return this.mDateFormat.toPattern();
    }

    public long getNextChangeTime(long j8) {
        long precision = getPrecision();
        long offset = getOffset(j8);
        return ((((j8 + offset) / precision) + 1) * precision) - offset;
    }

    public long getPrecision() {
        if (this.mTimePrecision == -1) {
            String dateFormatWithoutText = getDateFormatWithoutText(this.mDateFormat.toPattern());
            for (int i8 = 0; i8 < DATE_TIME_FORMATS.length && this.mTimePrecision == -1; i8++) {
                int i9 = 0;
                while (true) {
                    b[] bVarArr = DATE_TIME_FORMATS;
                    String[] strArr = bVarArr[i8].f237a;
                    if (i9 >= strArr.length) {
                        break;
                    } else if (dateFormatWithoutText.contains(strArr[i9])) {
                        this.mTimePrecision = bVarArr[i8].f238b;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            if (this.mTimePrecision == -1) {
                this.mTimePrecision = TimeUnit.DAYS.toMillis(1);
            }
        }
        return this.mTimePrecision;
    }

    public int getStyle() {
        return this.mStyle;
    }

    public CharSequence getTextAt(Resources resources, long j8) {
        String format = this.mDateFormat.format(new Date(j8));
        int i8 = this.mStyle;
        return i8 != 2 ? i8 != 3 ? format : format.toLowerCase() : format.toUpperCase();
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mDateFormat, Integer.valueOf(this.mStyle), this.mTimeZone, Long.valueOf(this.mTimePrecision)});
    }

    public boolean returnsSameText(long j8, long j9) {
        long precision = getPrecision();
        return (j8 + getOffset(j8)) / precision == (j9 + getOffset(j9)) / precision;
    }

    public String toString() {
        if (ComplicationData.shouldRedact()) {
            return "TimeFormatText{Redacted}";
        }
        return "TimeFormatText{mDateFormat=" + this.mDateFormat + ", mStyle=" + this.mStyle + ", mTimeZone=" + this.mTimeZone + ", mTimePrecision=" + this.mTimePrecision + '}';
    }

    public Object writeReplace() {
        return new c();
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeSerializable(this.mDateFormat);
        parcel.writeInt(this.mStyle);
        parcel.writeSerializable(this.mTimeZone);
    }
}
