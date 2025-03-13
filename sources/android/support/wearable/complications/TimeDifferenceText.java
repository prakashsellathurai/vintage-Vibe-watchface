package android.support.wearable.complications;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.R;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator<TimeDifferenceText> CREATOR = new a();
    private static final int MINIMUM_UNIT_PARCELED_IS_NULL = -1;
    private static final int ONLY_SHOW_DAYS_THRESHOLD = 10;
    private static final int SHORT_CHARACTER_LIMIT = 7;
    private final TimeUnit mMinimumUnit;
    private final long mReferencePeriodEnd;
    private final long mReferencePeriodStart;
    private final boolean mShowNowText;
    private final int mStyle;

    public class a implements Parcelable.Creator<TimeDifferenceText> {
        public final Object createFromParcel(Parcel parcel) {
            return new TimeDifferenceText(parcel);
        }

        public final Object[] newArray(int i8) {
            return new TimeDifferenceText[i8];
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f236a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f236a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f236a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f236a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f236a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f236a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.complications.TimeDifferenceText.b.<clinit>():void");
        }
    }

    public static class c implements Serializable {
    }

    public TimeDifferenceText(long j8, long j9, int i8, boolean z8, TimeUnit timeUnit) {
        this.mReferencePeriodStart = j8;
        this.mReferencePeriodEnd = j9;
        this.mStyle = i8;
        this.mShowNowText = z8;
        this.mMinimumUnit = timeUnit;
    }

    public TimeDifferenceText(Parcel parcel) {
        this.mReferencePeriodStart = parcel.readLong();
        this.mReferencePeriodEnd = parcel.readLong();
        this.mStyle = parcel.readInt();
        this.mShowNowText = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.mMinimumUnit = readInt == -1 ? null : TimeUnit.values()[readInt];
    }

    private static String buildShortDaysHoursText(int i8, int i9, Resources resources) {
        return resources.getString(R.string.time_difference_short_days_and_hours, new Object[]{buildShortDaysText(i8, resources), buildShortHoursText(i9, resources)});
    }

    private static String buildShortDaysText(int i8, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_days, i8, new Object[]{Integer.valueOf(i8)});
    }

    private String buildShortDualUnitText(long j8, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long roundUpToUnit = roundUpToUnit(j8, timeUnit);
        TimeUnit timeUnit2 = this.mMinimumUnit;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (isGreaterOrEqual(timeUnit2, timeUnit3) || days(roundUpToUnit) >= 10) {
            return buildShortDaysText(days(roundUpToUnit(j8, timeUnit3)), resources);
        }
        long roundUpToUnit2 = roundUpToUnit(j8, TimeUnit.MINUTES);
        if (days(roundUpToUnit2) > 0) {
            int hours = hours(roundUpToUnit);
            return hours > 0 ? buildShortDaysHoursText(days(roundUpToUnit), hours, resources) : buildShortDaysText(days(roundUpToUnit), resources);
        } else if (isGreaterOrEqual(this.mMinimumUnit, timeUnit)) {
            return buildShortHoursText(hours(roundUpToUnit), resources);
        } else {
            int hours2 = hours(roundUpToUnit2);
            int minutes = minutes(roundUpToUnit2);
            return hours2 > 0 ? minutes > 0 ? buildShortHoursMinsText(hours2, minutes, resources) : buildShortHoursText(hours2, resources) : buildShortMinsText(minutes(roundUpToUnit2), resources);
        }
    }

    private static String buildShortHoursMinsText(int i8, int i9, Resources resources) {
        return resources.getString(R.string.time_difference_short_hours_and_minutes, new Object[]{buildShortHoursText(i8, resources), buildShortMinsText(i9, resources)});
    }

    private static String buildShortHoursText(int i8, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_hours, i8, new Object[]{Integer.valueOf(i8)});
    }

    private static String buildShortMinsText(int i8, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_minutes, i8, new Object[]{Integer.valueOf(i8)});
    }

    private String buildShortSingleUnitText(long j8, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long roundUpToUnit = roundUpToUnit(j8, timeUnit);
        TimeUnit timeUnit2 = this.mMinimumUnit;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (isGreaterOrEqual(timeUnit2, timeUnit3) || days(roundUpToUnit) > 0) {
            return buildShortDaysText(days(roundUpToUnit(j8, timeUnit3)), resources);
        }
        long roundUpToUnit2 = roundUpToUnit(j8, TimeUnit.MINUTES);
        return (isGreaterOrEqual(this.mMinimumUnit, timeUnit) || hours(roundUpToUnit2) > 0) ? buildShortHoursText(hours(roundUpToUnit), resources) : buildShortMinsText(minutes(roundUpToUnit2), resources);
    }

    @SuppressLint({"TimeUnitMismatch"})
    private String buildStopwatchText(long j8, Resources resources) {
        TimeUnit timeUnit = this.mMinimumUnit;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        if (isGreaterOrEqual(timeUnit, timeUnit2)) {
            return buildShortDaysText(days(roundUpToUnit(j8, timeUnit2)), resources);
        }
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long roundUpToUnit = roundUpToUnit(j8, timeUnit3);
        if (isGreaterOrEqual(this.mMinimumUnit, TimeUnit.HOURS) || days(roundUpToUnit) > 0) {
            return buildShortDualUnitText(j8, resources);
        }
        long roundUpToUnit2 = roundUpToUnit(j8, TimeUnit.SECONDS);
        if (isGreaterOrEqual(this.mMinimumUnit, timeUnit3) || hours(roundUpToUnit2) > 0) {
            return String.format(Locale.US, "%d:%02d", new Object[]{Integer.valueOf(hours(roundUpToUnit)), Integer.valueOf(minutes(roundUpToUnit))});
        }
        return String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(minutes(roundUpToUnit2)), Integer.valueOf(seconds(roundUpToUnit2))});
    }

    private String buildWordsSingleUnitText(long j8, Resources resources) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        long roundUpToUnit = roundUpToUnit(j8, timeUnit);
        TimeUnit timeUnit2 = this.mMinimumUnit;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        if (isGreaterOrEqual(timeUnit2, timeUnit3) || days(roundUpToUnit) > 0) {
            int days = days(roundUpToUnit(j8, timeUnit3));
            return resources.getQuantityString(R.plurals.time_difference_words_days, days, new Object[]{Integer.valueOf(days)});
        }
        long roundUpToUnit2 = roundUpToUnit(j8, TimeUnit.MINUTES);
        if (isGreaterOrEqual(this.mMinimumUnit, timeUnit) || hours(roundUpToUnit2) > 0) {
            int hours = hours(roundUpToUnit);
            return resources.getQuantityString(R.plurals.time_difference_words_hours, hours, new Object[]{Integer.valueOf(hours)});
        }
        int minutes = minutes(roundUpToUnit2);
        return resources.getQuantityString(R.plurals.time_difference_words_minutes, minutes, new Object[]{Integer.valueOf(minutes)});
    }

    private static int days(long j8) {
        return modToUnit(j8, TimeUnit.DAYS);
    }

    private static long divRoundingUp(long j8, long j9) {
        return (j8 / j9) + ((long) (j8 % j9 == 0 ? 0 : 1));
    }

    private long getTimeDifference(long j8) {
        long j9 = this.mReferencePeriodStart;
        if (j8 < j9) {
            return j9 - j8;
        }
        long j10 = this.mReferencePeriodEnd;
        if (j8 > j10) {
            return j8 - j10;
        }
        return 0;
    }

    private static int getUnitMaximum(TimeUnit timeUnit) {
        int i8 = b.f236a[timeUnit.ordinal()];
        if (i8 == 1) {
            return 1000;
        }
        if (i8 == 2 || i8 == 3) {
            return 60;
        }
        if (i8 == 4) {
            return 24;
        }
        if (i8 == 5) {
            return Integer.MAX_VALUE;
        }
        throw new IllegalArgumentException("Unit not supported: " + timeUnit);
    }

    private static int hours(long j8) {
        return modToUnit(j8, TimeUnit.HOURS);
    }

    private static boolean isGreaterOrEqual(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1) >= timeUnit2.toMillis(1);
    }

    private static int minutes(long j8) {
        return modToUnit(j8, TimeUnit.MINUTES);
    }

    private static int modToUnit(long j8, TimeUnit timeUnit) {
        return (int) ((j8 / timeUnit.toMillis(1)) % ((long) getUnitMaximum(timeUnit)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static long roundUpToUnit(long j8, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1);
        return divRoundingUp(j8, millis) * millis;
    }

    private static int seconds(long j8) {
        return modToUnit(j8, TimeUnit.SECONDS);
    }

    private String shortDualUnlessTooLong(long j8, Resources resources) {
        String buildShortDualUnitText = buildShortDualUnitText(j8, resources);
        return buildShortDualUnitText.length() <= 7 ? buildShortDualUnitText : buildShortSingleUnitText(j8, resources);
    }

    private String wordsSingleUnlessTooLong(long j8, Resources resources) {
        String buildWordsSingleUnitText = buildWordsSingleUnitText(j8, resources);
        return buildWordsSingleUnitText.length() <= 7 ? buildWordsSingleUnitText : buildShortSingleUnitText(j8, resources);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimeDifferenceText.class != obj.getClass()) {
            return false;
        }
        TimeDifferenceText timeDifferenceText = (TimeDifferenceText) obj;
        return this.mReferencePeriodStart == timeDifferenceText.mReferencePeriodStart && this.mReferencePeriodEnd == timeDifferenceText.mReferencePeriodEnd && this.mStyle == timeDifferenceText.mStyle && this.mShowNowText == timeDifferenceText.mShowNowText && this.mMinimumUnit == timeDifferenceText.mMinimumUnit;
    }

    public TimeUnit getMinimumUnit() {
        return this.mMinimumUnit;
    }

    public long getNextChangeTime(long j8) {
        long precision = getPrecision();
        return (divRoundingUp(j8, precision) * precision) + 1;
    }

    public long getPrecision() {
        long millis = (this.mStyle != 1 ? TimeUnit.MINUTES : TimeUnit.SECONDS).toMillis(1);
        TimeUnit timeUnit = this.mMinimumUnit;
        return timeUnit == null ? millis : Math.max(millis, timeUnit.toMillis(1));
    }

    public long getReferencePeriodEnd() {
        return this.mReferencePeriodEnd;
    }

    public long getReferencePeriodStart() {
        return this.mReferencePeriodStart;
    }

    public int getStyle() {
        return this.mStyle;
    }

    public CharSequence getTextAt(Resources resources, long j8) {
        long timeDifference = getTimeDifference(j8);
        if (timeDifference == 0 && this.mShowNowText) {
            return resources.getString(R.string.time_difference_now);
        }
        int i8 = this.mStyle;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? buildShortSingleUnitText(timeDifference, resources) : wordsSingleUnlessTooLong(timeDifference, resources) : buildWordsSingleUnitText(timeDifference, resources) : shortDualUnlessTooLong(timeDifference, resources) : buildShortSingleUnitText(timeDifference, resources) : buildStopwatchText(timeDifference, resources);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.mReferencePeriodStart), Long.valueOf(this.mReferencePeriodEnd), Integer.valueOf(this.mStyle), Boolean.valueOf(this.mShowNowText), this.mMinimumUnit});
    }

    public boolean returnsSameText(long j8, long j9) {
        long precision = getPrecision();
        return divRoundingUp(getTimeDifference(j8), precision) == divRoundingUp(getTimeDifference(j9), precision);
    }

    public boolean shouldShowNowText() {
        return this.mShowNowText;
    }

    public String toString() {
        if (ComplicationData.shouldRedact()) {
            return "TimeDifferenceText{Redacted}";
        }
        return "TimeDifferenceText{mReferencePeriodStart=" + this.mReferencePeriodStart + ", mReferencePeriodEnd=" + this.mReferencePeriodEnd + ", mStyle=" + this.mStyle + ", mShowNowText=" + this.mShowNowText + ", mMinimumUnit=" + this.mMinimumUnit + '}';
    }

    public Object writeReplace() {
        return new c();
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.mReferencePeriodStart);
        parcel.writeLong(this.mReferencePeriodEnd);
        parcel.writeInt(this.mStyle);
        parcel.writeByte(this.mShowNowText ? (byte) 1 : 0);
        TimeUnit timeUnit = this.mMinimumUnit;
        parcel.writeInt(timeUnit == null ? -1 : timeUnit.ordinal());
    }
}
