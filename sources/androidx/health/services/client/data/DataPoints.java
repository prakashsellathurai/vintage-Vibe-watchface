package androidx.health.services.client.data;

import android.os.Bundle;
import android.util.Log;
import java.time.Duration;
import java.time.Instant;
import q7.g;
import q7.k;

public final class DataPoints {
    public static final DataPoints INSTANCE = new DataPoints();
    private static final String TAG = "DataPoints";

    private DataPoints() {
    }

    public static final SampleDataPoint<Double> absoluteElevation(double d9, Duration duration) {
        k.e(duration, "timeDurationFromBoot");
        boolean z8 = false;
        if (-1000000.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "absoluteElevation value " + d9 + " is out of range");
        }
        return new SampleDataPoint(DataType.ABSOLUTE_ELEVATION, Double.valueOf(d9), duration, (Bundle) null, (DataPointAccuracy) null, 24, (g) null);
    }

    public static final StatisticalDataPoint<Double> absoluteElevationStats(double d9, double d10, double d11, Instant instant, Instant instant2) {
        double d12 = d9;
        double d13 = d10;
        double d14 = d11;
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        if (!(-1000000.0d <= d12 && d12 <= 1000000.0d)) {
            Log.w(TAG, "absoluteElevationStats: minAbsoluteElevationMeters value " + d12 + " is out of range");
        }
        if (!(-1000000.0d <= d13 && d13 <= 1000000.0d)) {
            Log.w(TAG, "absoluteElevationStats: maxAbsoluteElevationMeters value " + d13 + " is out of range");
        }
        if (!(-1000000.0d <= d14 && d14 <= 1000000.0d)) {
            Log.w(TAG, "absoluteElevationStats: averageAbsoluteElevationMeters value " + d14 + " is out of range");
        }
        return new StatisticalDataPoint(DataType.ABSOLUTE_ELEVATION_STATS, Double.valueOf(d9), Double.valueOf(d10), Double.valueOf(d11), instant, instant2);
    }

    public static final IntervalDataPoint<Double> calories(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "calories value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.CALORIES, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final CumulativeDataPoint<Double> caloriesTotal(double d9, Instant instant, Instant instant2) {
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "caloriesTotal value " + d9 + " is out of range");
        }
        return new CumulativeDataPoint<>(DataType.CALORIES_TOTAL, Double.valueOf(d9), instant, instant2);
    }

    public static final IntervalDataPoint<Double> dailyCalories(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (z8) {
            Log.w(TAG, "dailyCalories value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.CALORIES_DAILY, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Double> dailyDistance(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "dailyDistance value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.DISTANCE_DAILY, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Double> dailyFloors(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "dailyFloors value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.FLOORS_DAILY, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Long> dailySteps(long j8, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0 <= j8 && j8 < 1000001) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "dailySteps value " + j8 + " is out of range");
        }
        return new IntervalDataPoint(DataType.STEPS_DAILY, Long.valueOf(j8), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Double> distance(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "distance value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.DISTANCE, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final CumulativeDataPoint<Double> distanceTotal(double d9, Instant instant, Instant instant2) {
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "distanceTotal value " + d9 + " is out of range");
        }
        return new CumulativeDataPoint<>(DataType.DISTANCE_TOTAL, Double.valueOf(d9), instant, instant2);
    }

    public static final IntervalDataPoint<Double> elevationGain(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "elevationGain value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.ELEVATION_GAIN, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Double> elevationLoss(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "elevationLoss value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.ELEVATION_LOSS, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Double> floors(double d9, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "floors value " + d9 + " is out of range");
        }
        return new IntervalDataPoint(DataType.FLOORS, Double.valueOf(d9), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final IntervalDataPoint<Long> golfShotCount(long j8, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0 <= j8 && j8 < 1000001) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "golfShotCount value " + j8 + " is out of range");
        }
        return new IntervalDataPoint(DataType.GOLF_SHOT_COUNT, Long.valueOf(j8), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final SampleDataPoint<Double> heartRate(double d9, Duration duration) {
        k.e(duration, "timeDurationFromBoot");
        return heartRate$default(d9, duration, (HeartRateAccuracy) null, 4, (Object) null);
    }

    public static final SampleDataPoint<Double> heartRate(double d9, Duration duration, HeartRateAccuracy heartRateAccuracy) {
        k.e(duration, "timeDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 300.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "heartRate value " + d9 + " is out of range");
        }
        return new SampleDataPoint(DataType.HEART_RATE_BPM, Double.valueOf(d9), duration, (Bundle) null, heartRateAccuracy, 8, (g) null);
    }

    public static /* synthetic */ SampleDataPoint heartRate$default(double d9, Duration duration, HeartRateAccuracy heartRateAccuracy, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            heartRateAccuracy = null;
        }
        return heartRate(d9, duration, heartRateAccuracy);
    }

    public static final StatisticalDataPoint<Double> heartRateStats(double d9, double d10, double d11, Instant instant, Instant instant2) {
        double d12 = d9;
        double d13 = d10;
        double d14 = d11;
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        if (!(0.0d <= d12 && d12 <= 300.0d)) {
            Log.w(TAG, "heartRateStats: minBpm value " + d12 + " is out of range");
        }
        if (!(0.0d <= d13 && d13 <= 300.0d)) {
            Log.w(TAG, "heartRateStats: maxBpm value " + d13 + " is out of range");
        }
        if (!(0.0d <= d14 && d14 <= 300.0d)) {
            Log.w(TAG, "heartRateStats: averageBpm value " + d14 + " is out of range");
        }
        return new StatisticalDataPoint(DataType.HEART_RATE_BPM_STATS, Double.valueOf(d9), Double.valueOf(d10), Double.valueOf(d11), instant, instant2);
    }

    public static final SampleDataPoint<LocationData> location(double d9, double d10, Duration duration) {
        Duration duration2 = duration;
        k.e(duration2, "timeDurationFromBoot");
        return location$default(d9, d10, duration2, 0.0d, 0.0d, (LocationAccuracy) null, 56, (Object) null);
    }

    public static final SampleDataPoint<LocationData> location(double d9, double d10, Duration duration, double d11) {
        Duration duration2 = duration;
        k.e(duration2, "timeDurationFromBoot");
        return location$default(d9, d10, duration2, d11, 0.0d, (LocationAccuracy) null, 48, (Object) null);
    }

    public static final SampleDataPoint<LocationData> location(double d9, double d10, Duration duration, double d11, double d12) {
        Duration duration2 = duration;
        k.e(duration2, "timeDurationFromBoot");
        return location$default(d9, d10, duration2, d11, d12, (LocationAccuracy) null, 32, (Object) null);
    }

    public static final SampleDataPoint<LocationData> location(double d9, double d10, Duration duration, double d11, double d12, LocationAccuracy locationAccuracy) {
        double d13 = d9;
        double d14 = d10;
        double d15 = d12;
        k.e(duration, "timeDurationFromBoot");
        boolean z8 = true;
        if (!(-90.0d <= d13 && d13 <= 90.0d)) {
            Log.w(TAG, "location: latitude value " + d9 + " is out of range");
        }
        if (-180.0d > d14 || d14 > 180.0d) {
            z8 = false;
        }
        if (!z8) {
            Log.w(TAG, "location: longitude value " + d14 + " is out of range");
        }
        if (d15 < -1.0d && d15 >= 360.0d) {
            Log.w(TAG, "location: bearing value " + d15 + " is out of range");
        }
        return new SampleDataPoint(DataType.LOCATION, new LocationData(d9, d10, d11, d12), duration, (Bundle) null, locationAccuracy, 8, (g) null);
    }

    public static /* synthetic */ SampleDataPoint location$default(double d9, double d10, Duration duration, double d11, double d12, LocationAccuracy locationAccuracy, int i8, Object obj) {
        return location(d9, d10, duration, (i8 & 8) != 0 ? Double.NaN : d11, (i8 & 16) != 0 ? Double.NaN : d12, (i8 & 32) != 0 ? null : locationAccuracy);
    }

    public static final SampleDataPoint<Double> pace(Duration duration, Duration duration2) {
        k.e(duration, "durationPerKilometer");
        k.e(duration2, "timeDurationFromBoot");
        return new SampleDataPoint(DataType.PACE, Double.valueOf((double) duration.toMillis()), duration2, (Bundle) null, (DataPointAccuracy) null, 24, (g) null);
    }

    public static final SampleDataPoint<Double> speed(double d9, Duration duration) {
        k.e(duration, "timeDurationFromBoot");
        boolean z8 = false;
        if (0.0d <= d9 && d9 <= 1000000.0d) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "speed value " + d9 + " is out of range");
        }
        return new SampleDataPoint(DataType.SPEED, Double.valueOf(d9), duration, (Bundle) null, (DataPointAccuracy) null, 24, (g) null);
    }

    public static final IntervalDataPoint<Long> steps(long j8, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0 <= j8 && j8 < 1000001) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "steps value " + j8 + " is out of range");
        }
        return new IntervalDataPoint(DataType.STEPS, Long.valueOf(j8), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }

    public static final SampleDataPoint<Long> stepsPerMinute(long j8, Duration duration) {
        k.e(duration, "timeDurationFromBoot");
        boolean z8 = false;
        if (0 <= j8 && j8 < 1000001) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "stepsPerMinute value " + j8 + " is out of range");
        }
        return new SampleDataPoint(DataType.STEPS_PER_MINUTE, Long.valueOf(j8), duration, (Bundle) null, (DataPointAccuracy) null, 24, (g) null);
    }

    public static final IntervalDataPoint<Long> swimmingStrokes(long j8, Duration duration, Duration duration2) {
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        boolean z8 = false;
        if (0 <= j8 && j8 < 1000001) {
            z8 = true;
        }
        if (!z8) {
            Log.w(TAG, "swimmingStrokes value " + j8 + " is out of range");
        }
        return new IntervalDataPoint(DataType.SWIMMING_STROKES, Long.valueOf(j8), duration, duration2, (Bundle) null, (DataPointAccuracy) null, 48, (g) null);
    }
}
