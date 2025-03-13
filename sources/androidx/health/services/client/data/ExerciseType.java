package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import h7.d;
import i7.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q7.g;
import q7.k;

public final class ExerciseType {
    public static final ExerciseType ALPINE_SKIING;
    public static final ExerciseType BACKPACKING;
    public static final ExerciseType BACK_EXTENSION;
    public static final ExerciseType BADMINTON;
    public static final ExerciseType BARBELL_SHOULDER_PRESS;
    public static final ExerciseType BASEBALL;
    public static final ExerciseType BASKETBALL;
    public static final ExerciseType BENCH_PRESS;
    public static final ExerciseType BENCH_SIT_UP;
    public static final ExerciseType BIKING;
    public static final ExerciseType BIKING_STATIONARY;
    public static final ExerciseType BOOT_CAMP;
    public static final ExerciseType BOXING;
    public static final ExerciseType BURPEE;
    public static final ExerciseType CALISTHENICS;
    public static final ExerciseType CRICKET;
    public static final ExerciseType CROSS_COUNTRY_SKIING;
    public static final ExerciseType CRUNCH;
    public static final Companion Companion = new Companion((g) null);
    public static final ExerciseType DANCING;
    public static final ExerciseType DEADLIFT;
    public static final ExerciseType DUMBBELL_CURL_LEFT_ARM;
    public static final ExerciseType DUMBBELL_CURL_RIGHT_ARM;
    public static final ExerciseType DUMBBELL_FRONT_RAISE;
    public static final ExerciseType DUMBBELL_LATERAL_RAISE;
    public static final ExerciseType DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM;
    public static final ExerciseType DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM;
    public static final ExerciseType DUMBBELL_TRICEPS_EXTENSION_TWO_ARM;
    public static final ExerciseType ELLIPTICAL;
    public static final ExerciseType EXERCISE_CLASS;
    public static final ExerciseType FENCING;
    public static final ExerciseType FOOTBALL_AMERICAN;
    public static final ExerciseType FOOTBALL_AUSTRALIAN;
    public static final ExerciseType FORWARD_TWIST;
    public static final ExerciseType FRISBEE_DISC;
    public static final ExerciseType GOLF;
    public static final ExerciseType GUIDED_BREATHING;
    public static final ExerciseType GYMNASTICS;
    public static final ExerciseType HANDBALL;
    public static final ExerciseType HIGH_INTENSITY_INTERVAL_TRAINING;
    public static final ExerciseType HIKING;
    public static final ExerciseType HORSE_RIDING;
    public static final ExerciseType ICE_HOCKEY;
    public static final ExerciseType ICE_SKATING;
    /* access modifiers changed from: private */
    public static final Map<Integer, ExerciseType> IDS;
    public static final ExerciseType INLINE_SKATING;
    public static final ExerciseType JUMPING_JACK;
    public static final ExerciseType JUMP_ROPE;
    public static final ExerciseType LAT_PULL_DOWN;
    public static final ExerciseType LUNGE;
    public static final ExerciseType MARTIAL_ARTS;
    public static final ExerciseType MEDITATION;
    public static final ExerciseType MOUNTAIN_BIKING;
    public static final ExerciseType ORIENTEERING;
    public static final ExerciseType PADDLING;
    public static final ExerciseType PARA_GLIDING;
    public static final ExerciseType PILATES;
    public static final ExerciseType PLANK;
    public static final ExerciseType RACQUETBALL;
    public static final ExerciseType ROCK_CLIMBING;
    public static final ExerciseType ROLLER_HOCKEY;
    public static final ExerciseType ROLLER_SKATING;
    public static final ExerciseType ROWING;
    public static final ExerciseType ROWING_MACHINE;
    public static final ExerciseType RUGBY;
    public static final ExerciseType RUNNING;
    public static final ExerciseType RUNNING_TREADMILL;
    public static final ExerciseType SAILING;
    public static final ExerciseType SCUBA_DIVING;
    public static final ExerciseType SKATING;
    public static final ExerciseType SKIING;
    public static final ExerciseType SNOWBOARDING;
    public static final ExerciseType SNOWSHOEING;
    public static final ExerciseType SOCCER;
    public static final ExerciseType SOFTBALL;
    public static final ExerciseType SQUASH;
    public static final ExerciseType SQUAT;
    public static final ExerciseType STAIR_CLIMBING;
    public static final ExerciseType STAIR_CLIMBING_MACHINE;
    public static final ExerciseType STRENGTH_TRAINING;
    public static final ExerciseType STRETCHING;
    public static final ExerciseType SURFING;
    public static final ExerciseType SWIMMING_OPEN_WATER;
    public static final ExerciseType SWIMMING_POOL;
    public static final ExerciseType TABLE_TENNIS;
    public static final ExerciseType TENNIS;
    public static final ExerciseType UNKNOWN;
    public static final ExerciseType UPPER_TWIST;
    public static final List<ExerciseType> VALUES;
    public static final ExerciseType VOLLEYBALL;
    public static final ExerciseType WALKING;
    public static final ExerciseType WATER_POLO;
    public static final ExerciseType WEIGHTLIFTING;
    public static final ExerciseType WORKOUT;
    public static final ExerciseType YACHTING;
    public static final ExerciseType YOGA;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExerciseType fromId(int i8) {
            ExerciseType exerciseType = (ExerciseType) ExerciseType.IDS.get(Integer.valueOf(i8));
            return exerciseType == null ? ExerciseType.UNKNOWN : exerciseType;
        }

        public final ExerciseType fromProto(DataProto.ExerciseType exerciseType) {
            k.e(exerciseType, "proto");
            return fromId(exerciseType.getNumber());
        }
    }

    static {
        ExerciseType exerciseType = new ExerciseType(0, "UNKNOWN");
        UNKNOWN = exerciseType;
        ExerciseType exerciseType2 = new ExerciseType(92, "ALPINE_SKIING");
        ALPINE_SKIING = exerciseType2;
        ExerciseType exerciseType3 = new ExerciseType(84, "BACKPACKING");
        BACKPACKING = exerciseType3;
        ExerciseType exerciseType4 = new ExerciseType(1, "BACK_EXTENSION");
        BACK_EXTENSION = exerciseType4;
        ExerciseType exerciseType5 = new ExerciseType(2, "BADMINTON");
        BADMINTON = exerciseType5;
        ExerciseType exerciseType6 = new ExerciseType(3, "BARBELL_SHOULDER_PRESS");
        BARBELL_SHOULDER_PRESS = exerciseType6;
        ExerciseType exerciseType7 = new ExerciseType(4, "BASEBALL");
        BASEBALL = exerciseType7;
        ExerciseType exerciseType8 = new ExerciseType(5, "BASKETBALL");
        BASKETBALL = exerciseType8;
        ExerciseType exerciseType9 = new ExerciseType(6, "BENCH_PRESS");
        BENCH_PRESS = exerciseType9;
        ExerciseType exerciseType10 = new ExerciseType(7, "BENCH_SIT_UP");
        BENCH_SIT_UP = exerciseType10;
        ExerciseType exerciseType11 = new ExerciseType(8, "BIKING");
        BIKING = exerciseType11;
        ExerciseType exerciseType12 = new ExerciseType(9, "BIKING_STATIONARY");
        BIKING_STATIONARY = exerciseType12;
        ExerciseType exerciseType13 = new ExerciseType(10, "BOOT_CAMP");
        BOOT_CAMP = exerciseType13;
        ExerciseType exerciseType14 = new ExerciseType(11, "BOXING");
        BOXING = exerciseType14;
        ExerciseType exerciseType15 = exerciseType14;
        ExerciseType exerciseType16 = new ExerciseType(12, "BURPEE");
        BURPEE = exerciseType16;
        ExerciseType exerciseType17 = exerciseType16;
        ExerciseType exerciseType18 = new ExerciseType(13, "CALISTHENICS");
        CALISTHENICS = exerciseType18;
        ExerciseType exerciseType19 = exerciseType18;
        ExerciseType exerciseType20 = new ExerciseType(14, "CRICKET");
        CRICKET = exerciseType20;
        ExerciseType exerciseType21 = exerciseType20;
        ExerciseType exerciseType22 = new ExerciseType(91, "CROSS_COUNTRY_SKIING");
        CROSS_COUNTRY_SKIING = exerciseType22;
        ExerciseType exerciseType23 = exerciseType22;
        ExerciseType exerciseType24 = new ExerciseType(15, "CRUNCH");
        CRUNCH = exerciseType24;
        ExerciseType exerciseType25 = exerciseType24;
        ExerciseType exerciseType26 = new ExerciseType(16, "DANCING");
        DANCING = exerciseType26;
        ExerciseType exerciseType27 = exerciseType26;
        ExerciseType exerciseType28 = new ExerciseType(17, "DEADLIFT");
        DEADLIFT = exerciseType28;
        ExerciseType exerciseType29 = exerciseType28;
        ExerciseType exerciseType30 = new ExerciseType(18, "DUMBBELL_CURL_RIGHT_ARM");
        DUMBBELL_CURL_RIGHT_ARM = exerciseType30;
        ExerciseType exerciseType31 = new ExerciseType(19, "DUMBBELL_CURL_LEFT_ARM");
        DUMBBELL_CURL_LEFT_ARM = exerciseType31;
        ExerciseType exerciseType32 = new ExerciseType(20, "DUMBBELL_FRONT_RAISE");
        DUMBBELL_FRONT_RAISE = exerciseType32;
        ExerciseType exerciseType33 = new ExerciseType(21, "DUMBBELL_LATERAL_RAISE");
        DUMBBELL_LATERAL_RAISE = exerciseType33;
        ExerciseType exerciseType34 = new ExerciseType(22, "DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM");
        DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM = exerciseType34;
        ExerciseType exerciseType35 = new ExerciseType(23, "DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM");
        DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM = exerciseType35;
        ExerciseType exerciseType36 = new ExerciseType(24, "DUMBBELL_TRICEPS_EXTENSION_TWO_ARM");
        DUMBBELL_TRICEPS_EXTENSION_TWO_ARM = exerciseType36;
        ExerciseType exerciseType37 = new ExerciseType(25, "ELLIPTICAL");
        ELLIPTICAL = exerciseType37;
        ExerciseType exerciseType38 = new ExerciseType(26, "EXERCISE_CLASS");
        EXERCISE_CLASS = exerciseType38;
        ExerciseType exerciseType39 = new ExerciseType(27, "FENCING");
        FENCING = exerciseType39;
        ExerciseType exerciseType40 = new ExerciseType(28, "FRISBEE_DISC");
        FRISBEE_DISC = exerciseType40;
        ExerciseType exerciseType41 = new ExerciseType(29, "FOOTBALL_AMERICAN");
        FOOTBALL_AMERICAN = exerciseType41;
        ExerciseType exerciseType42 = new ExerciseType(30, "FOOTBALL_AUSTRALIAN");
        FOOTBALL_AUSTRALIAN = exerciseType42;
        ExerciseType exerciseType43 = new ExerciseType(31, "FORWARD_TWIST");
        FORWARD_TWIST = exerciseType43;
        ExerciseType exerciseType44 = new ExerciseType(32, "GOLF");
        GOLF = exerciseType44;
        ExerciseType exerciseType45 = new ExerciseType(33, "GUIDED_BREATHING");
        GUIDED_BREATHING = exerciseType45;
        ExerciseType exerciseType46 = new ExerciseType(88, "HORSE_RIDING");
        HORSE_RIDING = exerciseType46;
        ExerciseType exerciseType47 = new ExerciseType(34, "GYMNASTICS");
        GYMNASTICS = exerciseType47;
        ExerciseType exerciseType48 = new ExerciseType(35, "HANDBALL");
        HANDBALL = exerciseType48;
        ExerciseType exerciseType49 = new ExerciseType(36, "HIGH_INTENSITY_INTERVAL_TRAINING");
        HIGH_INTENSITY_INTERVAL_TRAINING = exerciseType49;
        ExerciseType exerciseType50 = new ExerciseType(37, "HIKING");
        HIKING = exerciseType50;
        ExerciseType exerciseType51 = new ExerciseType(38, "ICE_HOCKEY");
        ICE_HOCKEY = exerciseType51;
        ExerciseType exerciseType52 = new ExerciseType(39, "ICE_SKATING");
        ICE_SKATING = exerciseType52;
        ExerciseType exerciseType53 = new ExerciseType(87, "INLINE_SKATING");
        INLINE_SKATING = exerciseType53;
        ExerciseType exerciseType54 = new ExerciseType(40, "JUMP_ROPE");
        JUMP_ROPE = exerciseType54;
        ExerciseType exerciseType55 = new ExerciseType(41, "JUMPING_JACK");
        JUMPING_JACK = exerciseType55;
        ExerciseType exerciseType56 = new ExerciseType(42, "LAT_PULL_DOWN");
        LAT_PULL_DOWN = exerciseType56;
        ExerciseType exerciseType57 = new ExerciseType(43, "LUNGE");
        LUNGE = exerciseType57;
        ExerciseType exerciseType58 = new ExerciseType(44, "MARTIAL_ARTS");
        MARTIAL_ARTS = exerciseType58;
        ExerciseType exerciseType59 = new ExerciseType(45, "MEDITATION");
        MEDITATION = exerciseType59;
        ExerciseType exerciseType60 = new ExerciseType(85, "MOUNTAIN_BIKING");
        MOUNTAIN_BIKING = exerciseType60;
        ExerciseType exerciseType61 = new ExerciseType(86, "ORIENTEERING");
        ORIENTEERING = exerciseType61;
        ExerciseType exerciseType62 = new ExerciseType(46, "PADDLING");
        PADDLING = exerciseType62;
        ExerciseType exerciseType63 = new ExerciseType(47, "PARA_GLIDING");
        PARA_GLIDING = exerciseType63;
        ExerciseType exerciseType64 = new ExerciseType(48, "PILATES");
        PILATES = exerciseType64;
        ExerciseType exerciseType65 = new ExerciseType(49, "PLANK");
        PLANK = exerciseType65;
        ExerciseType exerciseType66 = new ExerciseType(50, "RACQUETBALL");
        RACQUETBALL = exerciseType66;
        ExerciseType exerciseType67 = new ExerciseType(51, "ROCK_CLIMBING");
        ROCK_CLIMBING = exerciseType67;
        ExerciseType exerciseType68 = new ExerciseType(52, "ROLLER_HOCKEY");
        ROLLER_HOCKEY = exerciseType68;
        ExerciseType exerciseType69 = new ExerciseType(89, "ROLLER_SKATING");
        ROLLER_SKATING = exerciseType69;
        ExerciseType exerciseType70 = new ExerciseType(53, "ROWING");
        ROWING = exerciseType70;
        ExerciseType exerciseType71 = new ExerciseType(54, "ROWING_MACHINE");
        ROWING_MACHINE = exerciseType71;
        ExerciseType exerciseType72 = new ExerciseType(55, "RUNNING");
        RUNNING = exerciseType72;
        ExerciseType exerciseType73 = new ExerciseType(56, "RUNNING_TREADMILL");
        RUNNING_TREADMILL = exerciseType73;
        ExerciseType exerciseType74 = new ExerciseType(57, "RUGBY");
        RUGBY = exerciseType74;
        ExerciseType exerciseType75 = new ExerciseType(58, "SAILING");
        SAILING = exerciseType75;
        ExerciseType exerciseType76 = new ExerciseType(59, "SCUBA_DIVING");
        SCUBA_DIVING = exerciseType76;
        ExerciseType exerciseType77 = new ExerciseType(60, "SKATING");
        SKATING = exerciseType77;
        ExerciseType exerciseType78 = new ExerciseType(61, "SKIING");
        SKIING = exerciseType78;
        ExerciseType exerciseType79 = new ExerciseType(62, "SNOWBOARDING");
        SNOWBOARDING = exerciseType79;
        ExerciseType exerciseType80 = new ExerciseType(63, "SNOWSHOEING");
        SNOWSHOEING = exerciseType80;
        ExerciseType exerciseType81 = new ExerciseType(64, "SOCCER");
        SOCCER = exerciseType81;
        ExerciseType exerciseType82 = new ExerciseType(65, "SOFTBALL");
        SOFTBALL = exerciseType82;
        ExerciseType exerciseType83 = new ExerciseType(66, "SQUASH");
        SQUASH = exerciseType83;
        ExerciseType exerciseType84 = new ExerciseType(67, "SQUAT");
        SQUAT = exerciseType84;
        ExerciseType exerciseType85 = new ExerciseType(68, "STAIR_CLIMBING");
        STAIR_CLIMBING = exerciseType85;
        ExerciseType exerciseType86 = new ExerciseType(69, "STAIR_CLIMBING_MACHINE");
        STAIR_CLIMBING_MACHINE = exerciseType86;
        ExerciseType exerciseType87 = new ExerciseType(70, "STRENGTH_TRAINING");
        STRENGTH_TRAINING = exerciseType87;
        ExerciseType exerciseType88 = new ExerciseType(71, "STRETCHING");
        STRETCHING = exerciseType88;
        ExerciseType exerciseType89 = new ExerciseType(72, "SURFING");
        SURFING = exerciseType89;
        ExerciseType exerciseType90 = new ExerciseType(73, "SWIMMING_OPEN_WATER");
        SWIMMING_OPEN_WATER = exerciseType90;
        ExerciseType exerciseType91 = new ExerciseType(74, "SWIMMING_POOL");
        SWIMMING_POOL = exerciseType91;
        ExerciseType exerciseType92 = new ExerciseType(75, "TABLE_TENNIS");
        TABLE_TENNIS = exerciseType92;
        ExerciseType exerciseType93 = new ExerciseType(76, "TENNIS");
        TENNIS = exerciseType93;
        ExerciseType exerciseType94 = new ExerciseType(77, "UPPER_TWIST");
        UPPER_TWIST = exerciseType94;
        ExerciseType exerciseType95 = new ExerciseType(78, "VOLLEYBALL");
        VOLLEYBALL = exerciseType95;
        ExerciseType exerciseType96 = new ExerciseType(79, "WALKING");
        WALKING = exerciseType96;
        ExerciseType exerciseType97 = new ExerciseType(80, "WATER_POLO");
        WATER_POLO = exerciseType97;
        ExerciseType exerciseType98 = new ExerciseType(81, "WEIGHTLIFTING");
        WEIGHTLIFTING = exerciseType98;
        ExerciseType exerciseType99 = new ExerciseType(82, "WORKOUT");
        WORKOUT = exerciseType99;
        ExerciseType exerciseType100 = new ExerciseType(90, "YACHTING");
        YACHTING = exerciseType100;
        ExerciseType exerciseType101 = new ExerciseType(83, "YOGA");
        YOGA = exerciseType101;
        List<ExerciseType> B = a.B(exerciseType, exerciseType2, exerciseType3, exerciseType4, exerciseType5, exerciseType6, exerciseType7, exerciseType8, exerciseType9, exerciseType10, exerciseType11, exerciseType12, exerciseType13, exerciseType15, exerciseType17, exerciseType19, exerciseType21, exerciseType23, exerciseType25, exerciseType27, exerciseType29, exerciseType30, exerciseType31, exerciseType32, exerciseType33, exerciseType34, exerciseType35, exerciseType36, exerciseType37, exerciseType38, exerciseType39, exerciseType40, exerciseType41, exerciseType42, exerciseType43, exerciseType44, exerciseType45, exerciseType46, exerciseType47, exerciseType48, exerciseType49, exerciseType50, exerciseType51, exerciseType52, exerciseType53, exerciseType54, exerciseType55, exerciseType56, exerciseType57, exerciseType58, exerciseType59, exerciseType60, exerciseType61, exerciseType62, exerciseType63, exerciseType64, exerciseType65, exerciseType66, exerciseType67, exerciseType68, exerciseType69, exerciseType70, exerciseType71, exerciseType72, exerciseType73, exerciseType74, exerciseType75, exerciseType76, exerciseType77, exerciseType78, exerciseType79, exerciseType80, exerciseType81, exerciseType82, exerciseType83, exerciseType84, exerciseType85, exerciseType86, exerciseType87, exerciseType88, exerciseType89, exerciseType90, exerciseType91, exerciseType92, exerciseType93, exerciseType94, exerciseType95, exerciseType96, exerciseType97, exerciseType98, exerciseType99, exerciseType100, exerciseType101);
        VALUES = B;
        ArrayList arrayList = new ArrayList(f.M(B));
        for (ExerciseType exerciseType102 : B) {
            arrayList.add(new d(Integer.valueOf(exerciseType102.id), exerciseType102));
        }
        IDS = f.P(arrayList);
    }

    public ExerciseType(int i8, String str) {
        k.e(str, "name");
        this.id = i8;
        this.name = str;
    }

    public static final ExerciseType fromId(int i8) {
        return Companion.fromId(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExerciseType) && this.id == ((ExerciseType) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id;
    }

    public final DataProto.ExerciseType toProto() {
        DataProto.ExerciseType forNumber = DataProto.ExerciseType.forNumber(this.id);
        return forNumber == null ? DataProto.ExerciseType.EXERCISE_TYPE_UNKNOWN : forNumber;
    }

    public String toString() {
        return this.name;
    }
}
