package androidx.health.services.client.proto;

import com.google.protobuf.a;
import com.google.protobuf.a0;
import com.google.protobuf.c;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.n;
import com.google.protobuf.q;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DataProto {

    /* renamed from: androidx.health.services.client.proto.DataProto$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0026 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
        static {
            /*
                com.google.protobuf.y$f[] r0 = com.google.protobuf.y.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.proto.DataProto.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class AchievedExerciseGoal extends y<AchievedExerciseGoal, Builder> implements AchievedExerciseGoalOrBuilder {
        /* access modifiers changed from: private */
        public static final AchievedExerciseGoal DEFAULT_INSTANCE;
        public static final int EXERCISE_GOAL_FIELD_NUMBER = 1;
        private static volatile z0<AchievedExerciseGoal> PARSER;
        private int bitField0_;
        private ExerciseGoal exerciseGoal_;

        public static final class Builder extends y.a<AchievedExerciseGoal, Builder> implements AchievedExerciseGoalOrBuilder {
            private Builder() {
                super(AchievedExerciseGoal.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearExerciseGoal() {
                copyOnWrite();
                ((AchievedExerciseGoal) this.instance).clearExerciseGoal();
                return this;
            }

            public ExerciseGoal getExerciseGoal() {
                return ((AchievedExerciseGoal) this.instance).getExerciseGoal();
            }

            public boolean hasExerciseGoal() {
                return ((AchievedExerciseGoal) this.instance).hasExerciseGoal();
            }

            public Builder mergeExerciseGoal(ExerciseGoal exerciseGoal) {
                copyOnWrite();
                ((AchievedExerciseGoal) this.instance).mergeExerciseGoal(exerciseGoal);
                return this;
            }

            public Builder setExerciseGoal(ExerciseGoal.Builder builder) {
                copyOnWrite();
                ((AchievedExerciseGoal) this.instance).setExerciseGoal((ExerciseGoal) builder.build());
                return this;
            }

            public Builder setExerciseGoal(ExerciseGoal exerciseGoal) {
                copyOnWrite();
                ((AchievedExerciseGoal) this.instance).setExerciseGoal(exerciseGoal);
                return this;
            }
        }

        static {
            AchievedExerciseGoal achievedExerciseGoal = new AchievedExerciseGoal();
            DEFAULT_INSTANCE = achievedExerciseGoal;
            y.registerDefaultInstance(AchievedExerciseGoal.class, achievedExerciseGoal);
        }

        private AchievedExerciseGoal() {
        }

        /* access modifiers changed from: private */
        public void clearExerciseGoal() {
            this.exerciseGoal_ = null;
            this.bitField0_ &= -2;
        }

        public static AchievedExerciseGoal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseGoal(ExerciseGoal exerciseGoal) {
            exerciseGoal.getClass();
            ExerciseGoal exerciseGoal2 = this.exerciseGoal_;
            if (!(exerciseGoal2 == null || exerciseGoal2 == ExerciseGoal.getDefaultInstance())) {
                exerciseGoal = (ExerciseGoal) ((ExerciseGoal.Builder) ExerciseGoal.newBuilder(this.exerciseGoal_).mergeFrom(exerciseGoal)).buildPartial();
            }
            this.exerciseGoal_ = exerciseGoal;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AchievedExerciseGoal achievedExerciseGoal) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(achievedExerciseGoal);
        }

        public static AchievedExerciseGoal parseDelimitedFrom(InputStream inputStream) {
            return (AchievedExerciseGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AchievedExerciseGoal parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (AchievedExerciseGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AchievedExerciseGoal parseFrom(i iVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static AchievedExerciseGoal parseFrom(i iVar, q qVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static AchievedExerciseGoal parseFrom(j jVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AchievedExerciseGoal parseFrom(j jVar, q qVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static AchievedExerciseGoal parseFrom(InputStream inputStream) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AchievedExerciseGoal parseFrom(InputStream inputStream, q qVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AchievedExerciseGoal parseFrom(ByteBuffer byteBuffer) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AchievedExerciseGoal parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static AchievedExerciseGoal parseFrom(byte[] bArr) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AchievedExerciseGoal parseFrom(byte[] bArr, q qVar) {
            return (AchievedExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<AchievedExerciseGoal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExerciseGoal(ExerciseGoal exerciseGoal) {
            exerciseGoal.getClass();
            this.exerciseGoal_ = exerciseGoal;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "exerciseGoal_"});
                case 3:
                    return new AchievedExerciseGoal();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<AchievedExerciseGoal> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (AchievedExerciseGoal.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ExerciseGoal getExerciseGoal() {
            ExerciseGoal exerciseGoal = this.exerciseGoal_;
            return exerciseGoal == null ? ExerciseGoal.getDefaultInstance() : exerciseGoal;
        }

        public boolean hasExerciseGoal() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface AchievedExerciseGoalOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseGoal getExerciseGoal();

        boolean hasExerciseGoal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class AggregateDataPoint extends y<AggregateDataPoint, Builder> implements AggregateDataPointOrBuilder {
        public static final int CUMULATIVE_DATA_POINT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AggregateDataPoint DEFAULT_INSTANCE;
        private static volatile z0<AggregateDataPoint> PARSER = null;
        public static final int STATISTICAL_DATA_POINT_FIELD_NUMBER = 2;
        private int aggregateCase_ = 0;
        private Object aggregate_;
        private int bitField0_;

        public enum AggregateCase {
            CUMULATIVE_DATA_POINT(1),
            STATISTICAL_DATA_POINT(2),
            AGGREGATE_NOT_SET(0);
            
            private final int value;

            private AggregateCase(int i8) {
                this.value = i8;
            }

            public static AggregateCase forNumber(int i8) {
                if (i8 == 0) {
                    return AGGREGATE_NOT_SET;
                }
                if (i8 == 1) {
                    return CUMULATIVE_DATA_POINT;
                }
                if (i8 != 2) {
                    return null;
                }
                return STATISTICAL_DATA_POINT;
            }

            @Deprecated
            public static AggregateCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class Builder extends y.a<AggregateDataPoint, Builder> implements AggregateDataPointOrBuilder {
            private Builder() {
                super(AggregateDataPoint.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAggregate() {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).clearAggregate();
                return this;
            }

            public Builder clearCumulativeDataPoint() {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).clearCumulativeDataPoint();
                return this;
            }

            public Builder clearStatisticalDataPoint() {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).clearStatisticalDataPoint();
                return this;
            }

            public AggregateCase getAggregateCase() {
                return ((AggregateDataPoint) this.instance).getAggregateCase();
            }

            public CumulativeDataPoint getCumulativeDataPoint() {
                return ((AggregateDataPoint) this.instance).getCumulativeDataPoint();
            }

            public StatisticalDataPoint getStatisticalDataPoint() {
                return ((AggregateDataPoint) this.instance).getStatisticalDataPoint();
            }

            public boolean hasCumulativeDataPoint() {
                return ((AggregateDataPoint) this.instance).hasCumulativeDataPoint();
            }

            public boolean hasStatisticalDataPoint() {
                return ((AggregateDataPoint) this.instance).hasStatisticalDataPoint();
            }

            public Builder mergeCumulativeDataPoint(CumulativeDataPoint cumulativeDataPoint) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).mergeCumulativeDataPoint(cumulativeDataPoint);
                return this;
            }

            public Builder mergeStatisticalDataPoint(StatisticalDataPoint statisticalDataPoint) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).mergeStatisticalDataPoint(statisticalDataPoint);
                return this;
            }

            public Builder setCumulativeDataPoint(CumulativeDataPoint.Builder builder) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).setCumulativeDataPoint((CumulativeDataPoint) builder.build());
                return this;
            }

            public Builder setCumulativeDataPoint(CumulativeDataPoint cumulativeDataPoint) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).setCumulativeDataPoint(cumulativeDataPoint);
                return this;
            }

            public Builder setStatisticalDataPoint(StatisticalDataPoint.Builder builder) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).setStatisticalDataPoint((StatisticalDataPoint) builder.build());
                return this;
            }

            public Builder setStatisticalDataPoint(StatisticalDataPoint statisticalDataPoint) {
                copyOnWrite();
                ((AggregateDataPoint) this.instance).setStatisticalDataPoint(statisticalDataPoint);
                return this;
            }
        }

        public static final class CumulativeDataPoint extends y<CumulativeDataPoint, Builder> implements CumulativeDataPointOrBuilder {
            public static final int DATA_TYPE_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final CumulativeDataPoint DEFAULT_INSTANCE;
            public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
            private static volatile z0<CumulativeDataPoint> PARSER = null;
            public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
            public static final int TOTAL_FIELD_NUMBER = 4;
            private int bitField0_;
            private DataType dataType_;
            private long endTimeEpochMs_;
            private long startTimeEpochMs_;
            private Value total_;

            public static final class Builder extends y.a<CumulativeDataPoint, Builder> implements CumulativeDataPointOrBuilder {
                private Builder() {
                    super(CumulativeDataPoint.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).clearDataType();
                    return this;
                }

                public Builder clearEndTimeEpochMs() {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).clearEndTimeEpochMs();
                    return this;
                }

                public Builder clearStartTimeEpochMs() {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).clearStartTimeEpochMs();
                    return this;
                }

                public Builder clearTotal() {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).clearTotal();
                    return this;
                }

                public DataType getDataType() {
                    return ((CumulativeDataPoint) this.instance).getDataType();
                }

                public long getEndTimeEpochMs() {
                    return ((CumulativeDataPoint) this.instance).getEndTimeEpochMs();
                }

                public long getStartTimeEpochMs() {
                    return ((CumulativeDataPoint) this.instance).getStartTimeEpochMs();
                }

                public Value getTotal() {
                    return ((CumulativeDataPoint) this.instance).getTotal();
                }

                public boolean hasDataType() {
                    return ((CumulativeDataPoint) this.instance).hasDataType();
                }

                public boolean hasEndTimeEpochMs() {
                    return ((CumulativeDataPoint) this.instance).hasEndTimeEpochMs();
                }

                public boolean hasStartTimeEpochMs() {
                    return ((CumulativeDataPoint) this.instance).hasStartTimeEpochMs();
                }

                public boolean hasTotal() {
                    return ((CumulativeDataPoint) this.instance).hasTotal();
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder mergeTotal(Value value) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).mergeTotal(value);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setDataType(dataType);
                    return this;
                }

                public Builder setEndTimeEpochMs(long j8) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setEndTimeEpochMs(j8);
                    return this;
                }

                public Builder setStartTimeEpochMs(long j8) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setStartTimeEpochMs(j8);
                    return this;
                }

                public Builder setTotal(Value.Builder builder) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setTotal((Value) builder.build());
                    return this;
                }

                public Builder setTotal(Value value) {
                    copyOnWrite();
                    ((CumulativeDataPoint) this.instance).setTotal(value);
                    return this;
                }
            }

            static {
                CumulativeDataPoint cumulativeDataPoint = new CumulativeDataPoint();
                DEFAULT_INSTANCE = cumulativeDataPoint;
                y.registerDefaultInstance(CumulativeDataPoint.class, cumulativeDataPoint);
            }

            private CumulativeDataPoint() {
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -5;
            }

            /* access modifiers changed from: private */
            public void clearEndTimeEpochMs() {
                this.bitField0_ &= -3;
                this.endTimeEpochMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearStartTimeEpochMs() {
                this.bitField0_ &= -2;
                this.startTimeEpochMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearTotal() {
                this.total_ = null;
                this.bitField0_ &= -9;
            }

            public static CumulativeDataPoint getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void mergeTotal(Value value) {
                value.getClass();
                Value value2 = this.total_;
                if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                    value = (Value) ((Value.Builder) Value.newBuilder(this.total_).mergeFrom(value)).buildPartial();
                }
                this.total_ = value;
                this.bitField0_ |= 8;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(CumulativeDataPoint cumulativeDataPoint) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(cumulativeDataPoint);
            }

            public static CumulativeDataPoint parseDelimitedFrom(InputStream inputStream) {
                return (CumulativeDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CumulativeDataPoint parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (CumulativeDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static CumulativeDataPoint parseFrom(i iVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static CumulativeDataPoint parseFrom(i iVar, q qVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static CumulativeDataPoint parseFrom(j jVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static CumulativeDataPoint parseFrom(j jVar, q qVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static CumulativeDataPoint parseFrom(InputStream inputStream) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CumulativeDataPoint parseFrom(InputStream inputStream, q qVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static CumulativeDataPoint parseFrom(ByteBuffer byteBuffer) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static CumulativeDataPoint parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static CumulativeDataPoint parseFrom(byte[] bArr) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CumulativeDataPoint parseFrom(byte[] bArr, q qVar) {
                return (CumulativeDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<CumulativeDataPoint> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void setEndTimeEpochMs(long j8) {
                this.bitField0_ |= 2;
                this.endTimeEpochMs_ = j8;
            }

            /* access modifiers changed from: private */
            public void setStartTimeEpochMs(long j8) {
                this.bitField0_ |= 1;
                this.startTimeEpochMs_ = j8;
            }

            /* access modifiers changed from: private */
            public void setTotal(Value value) {
                value.getClass();
                this.total_ = value;
                this.bitField0_ |= 8;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "dataType_", "total_"});
                    case 3:
                        return new CumulativeDataPoint();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<CumulativeDataPoint> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (CumulativeDataPoint.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public long getEndTimeEpochMs() {
                return this.endTimeEpochMs_;
            }

            public long getStartTimeEpochMs() {
                return this.startTimeEpochMs_;
            }

            public Value getTotal() {
                Value value = this.total_;
                return value == null ? Value.getDefaultInstance() : value;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasEndTimeEpochMs() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStartTimeEpochMs() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTotal() {
                return (this.bitField0_ & 8) != 0;
            }
        }

        public interface CumulativeDataPointOrBuilder extends s0 {
            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            long getEndTimeEpochMs();

            long getStartTimeEpochMs();

            Value getTotal();

            boolean hasDataType();

            boolean hasEndTimeEpochMs();

            boolean hasStartTimeEpochMs();

            boolean hasTotal();

            /* synthetic */ boolean isInitialized();
        }

        public static final class StatisticalDataPoint extends y<StatisticalDataPoint, Builder> implements StatisticalDataPointOrBuilder {
            public static final int AVG_VALUE_FIELD_NUMBER = 7;
            public static final int DATA_TYPE_FIELD_NUMBER = 4;
            /* access modifiers changed from: private */
            public static final StatisticalDataPoint DEFAULT_INSTANCE;
            public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
            public static final int MAX_VALUE_FIELD_NUMBER = 6;
            public static final int MIN_VALUE_FIELD_NUMBER = 5;
            private static volatile z0<StatisticalDataPoint> PARSER = null;
            public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
            private Value avgValue_;
            private int bitField0_;
            private DataType dataType_;
            private long endTimeEpochMs_;
            private Value maxValue_;
            private Value minValue_;
            private long startTimeEpochMs_;

            public static final class Builder extends y.a<StatisticalDataPoint, Builder> implements StatisticalDataPointOrBuilder {
                private Builder() {
                    super(StatisticalDataPoint.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearAvgValue() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearAvgValue();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearDataType();
                    return this;
                }

                public Builder clearEndTimeEpochMs() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearEndTimeEpochMs();
                    return this;
                }

                public Builder clearMaxValue() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearMaxValue();
                    return this;
                }

                public Builder clearMinValue() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearMinValue();
                    return this;
                }

                public Builder clearStartTimeEpochMs() {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).clearStartTimeEpochMs();
                    return this;
                }

                public Value getAvgValue() {
                    return ((StatisticalDataPoint) this.instance).getAvgValue();
                }

                public DataType getDataType() {
                    return ((StatisticalDataPoint) this.instance).getDataType();
                }

                public long getEndTimeEpochMs() {
                    return ((StatisticalDataPoint) this.instance).getEndTimeEpochMs();
                }

                public Value getMaxValue() {
                    return ((StatisticalDataPoint) this.instance).getMaxValue();
                }

                public Value getMinValue() {
                    return ((StatisticalDataPoint) this.instance).getMinValue();
                }

                public long getStartTimeEpochMs() {
                    return ((StatisticalDataPoint) this.instance).getStartTimeEpochMs();
                }

                public boolean hasAvgValue() {
                    return ((StatisticalDataPoint) this.instance).hasAvgValue();
                }

                public boolean hasDataType() {
                    return ((StatisticalDataPoint) this.instance).hasDataType();
                }

                public boolean hasEndTimeEpochMs() {
                    return ((StatisticalDataPoint) this.instance).hasEndTimeEpochMs();
                }

                public boolean hasMaxValue() {
                    return ((StatisticalDataPoint) this.instance).hasMaxValue();
                }

                public boolean hasMinValue() {
                    return ((StatisticalDataPoint) this.instance).hasMinValue();
                }

                public boolean hasStartTimeEpochMs() {
                    return ((StatisticalDataPoint) this.instance).hasStartTimeEpochMs();
                }

                public Builder mergeAvgValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).mergeAvgValue(value);
                    return this;
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder mergeMaxValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).mergeMaxValue(value);
                    return this;
                }

                public Builder mergeMinValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).mergeMinValue(value);
                    return this;
                }

                public Builder setAvgValue(Value.Builder builder) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setAvgValue((Value) builder.build());
                    return this;
                }

                public Builder setAvgValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setAvgValue(value);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setDataType(dataType);
                    return this;
                }

                public Builder setEndTimeEpochMs(long j8) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setEndTimeEpochMs(j8);
                    return this;
                }

                public Builder setMaxValue(Value.Builder builder) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setMaxValue((Value) builder.build());
                    return this;
                }

                public Builder setMaxValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setMaxValue(value);
                    return this;
                }

                public Builder setMinValue(Value.Builder builder) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setMinValue((Value) builder.build());
                    return this;
                }

                public Builder setMinValue(Value value) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setMinValue(value);
                    return this;
                }

                public Builder setStartTimeEpochMs(long j8) {
                    copyOnWrite();
                    ((StatisticalDataPoint) this.instance).setStartTimeEpochMs(j8);
                    return this;
                }
            }

            static {
                StatisticalDataPoint statisticalDataPoint = new StatisticalDataPoint();
                DEFAULT_INSTANCE = statisticalDataPoint;
                y.registerDefaultInstance(StatisticalDataPoint.class, statisticalDataPoint);
            }

            private StatisticalDataPoint() {
            }

            /* access modifiers changed from: private */
            public void clearAvgValue() {
                this.avgValue_ = null;
                this.bitField0_ &= -33;
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -5;
            }

            /* access modifiers changed from: private */
            public void clearEndTimeEpochMs() {
                this.bitField0_ &= -3;
                this.endTimeEpochMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearMaxValue() {
                this.maxValue_ = null;
                this.bitField0_ &= -17;
            }

            /* access modifiers changed from: private */
            public void clearMinValue() {
                this.minValue_ = null;
                this.bitField0_ &= -9;
            }

            /* access modifiers changed from: private */
            public void clearStartTimeEpochMs() {
                this.bitField0_ &= -2;
                this.startTimeEpochMs_ = 0;
            }

            public static StatisticalDataPoint getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAvgValue(Value value) {
                value.getClass();
                Value value2 = this.avgValue_;
                if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                    value = (Value) ((Value.Builder) Value.newBuilder(this.avgValue_).mergeFrom(value)).buildPartial();
                }
                this.avgValue_ = value;
                this.bitField0_ |= 32;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void mergeMaxValue(Value value) {
                value.getClass();
                Value value2 = this.maxValue_;
                if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                    value = (Value) ((Value.Builder) Value.newBuilder(this.maxValue_).mergeFrom(value)).buildPartial();
                }
                this.maxValue_ = value;
                this.bitField0_ |= 16;
            }

            /* access modifiers changed from: private */
            public void mergeMinValue(Value value) {
                value.getClass();
                Value value2 = this.minValue_;
                if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                    value = (Value) ((Value.Builder) Value.newBuilder(this.minValue_).mergeFrom(value)).buildPartial();
                }
                this.minValue_ = value;
                this.bitField0_ |= 8;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(StatisticalDataPoint statisticalDataPoint) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(statisticalDataPoint);
            }

            public static StatisticalDataPoint parseDelimitedFrom(InputStream inputStream) {
                return (StatisticalDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StatisticalDataPoint parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (StatisticalDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static StatisticalDataPoint parseFrom(i iVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static StatisticalDataPoint parseFrom(i iVar, q qVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static StatisticalDataPoint parseFrom(j jVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static StatisticalDataPoint parseFrom(j jVar, q qVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static StatisticalDataPoint parseFrom(InputStream inputStream) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static StatisticalDataPoint parseFrom(InputStream inputStream, q qVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static StatisticalDataPoint parseFrom(ByteBuffer byteBuffer) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static StatisticalDataPoint parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static StatisticalDataPoint parseFrom(byte[] bArr) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static StatisticalDataPoint parseFrom(byte[] bArr, q qVar) {
                return (StatisticalDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<StatisticalDataPoint> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAvgValue(Value value) {
                value.getClass();
                this.avgValue_ = value;
                this.bitField0_ |= 32;
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void setEndTimeEpochMs(long j8) {
                this.bitField0_ |= 2;
                this.endTimeEpochMs_ = j8;
            }

            /* access modifiers changed from: private */
            public void setMaxValue(Value value) {
                value.getClass();
                this.maxValue_ = value;
                this.bitField0_ |= 16;
            }

            /* access modifiers changed from: private */
            public void setMinValue(Value value) {
                value.getClass();
                this.minValue_ = value;
                this.bitField0_ |= 8;
            }

            /* access modifiers changed from: private */
            public void setStartTimeEpochMs(long j8) {
                this.bitField0_ |= 1;
                this.startTimeEpochMs_ = j8;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "dataType_", "minValue_", "maxValue_", "avgValue_"});
                    case 3:
                        return new StatisticalDataPoint();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<StatisticalDataPoint> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (StatisticalDataPoint.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public Value getAvgValue() {
                Value value = this.avgValue_;
                return value == null ? Value.getDefaultInstance() : value;
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public long getEndTimeEpochMs() {
                return this.endTimeEpochMs_;
            }

            public Value getMaxValue() {
                Value value = this.maxValue_;
                return value == null ? Value.getDefaultInstance() : value;
            }

            public Value getMinValue() {
                Value value = this.minValue_;
                return value == null ? Value.getDefaultInstance() : value;
            }

            public long getStartTimeEpochMs() {
                return this.startTimeEpochMs_;
            }

            public boolean hasAvgValue() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasEndTimeEpochMs() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMaxValue() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasMinValue() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasStartTimeEpochMs() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface StatisticalDataPointOrBuilder extends s0 {
            Value getAvgValue();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            long getEndTimeEpochMs();

            Value getMaxValue();

            Value getMinValue();

            long getStartTimeEpochMs();

            boolean hasAvgValue();

            boolean hasDataType();

            boolean hasEndTimeEpochMs();

            boolean hasMaxValue();

            boolean hasMinValue();

            boolean hasStartTimeEpochMs();

            /* synthetic */ boolean isInitialized();
        }

        static {
            AggregateDataPoint aggregateDataPoint = new AggregateDataPoint();
            DEFAULT_INSTANCE = aggregateDataPoint;
            y.registerDefaultInstance(AggregateDataPoint.class, aggregateDataPoint);
        }

        private AggregateDataPoint() {
        }

        /* access modifiers changed from: private */
        public void clearAggregate() {
            this.aggregateCase_ = 0;
            this.aggregate_ = null;
        }

        /* access modifiers changed from: private */
        public void clearCumulativeDataPoint() {
            if (this.aggregateCase_ == 1) {
                this.aggregateCase_ = 0;
                this.aggregate_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStatisticalDataPoint() {
            if (this.aggregateCase_ == 2) {
                this.aggregateCase_ = 0;
                this.aggregate_ = null;
            }
        }

        public static AggregateDataPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCumulativeDataPoint(CumulativeDataPoint cumulativeDataPoint) {
            cumulativeDataPoint.getClass();
            a aVar = cumulativeDataPoint;
            if (this.aggregateCase_ == 1) {
                aVar = cumulativeDataPoint;
                if (this.aggregate_ != CumulativeDataPoint.getDefaultInstance()) {
                    aVar = ((CumulativeDataPoint.Builder) CumulativeDataPoint.newBuilder((CumulativeDataPoint) this.aggregate_).mergeFrom(cumulativeDataPoint)).buildPartial();
                }
            }
            this.aggregate_ = aVar;
            this.aggregateCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeStatisticalDataPoint(StatisticalDataPoint statisticalDataPoint) {
            statisticalDataPoint.getClass();
            a aVar = statisticalDataPoint;
            if (this.aggregateCase_ == 2) {
                aVar = statisticalDataPoint;
                if (this.aggregate_ != StatisticalDataPoint.getDefaultInstance()) {
                    aVar = ((StatisticalDataPoint.Builder) StatisticalDataPoint.newBuilder((StatisticalDataPoint) this.aggregate_).mergeFrom(statisticalDataPoint)).buildPartial();
                }
            }
            this.aggregate_ = aVar;
            this.aggregateCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AggregateDataPoint aggregateDataPoint) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(aggregateDataPoint);
        }

        public static AggregateDataPoint parseDelimitedFrom(InputStream inputStream) {
            return (AggregateDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AggregateDataPoint parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (AggregateDataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AggregateDataPoint parseFrom(i iVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static AggregateDataPoint parseFrom(i iVar, q qVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static AggregateDataPoint parseFrom(j jVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AggregateDataPoint parseFrom(j jVar, q qVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static AggregateDataPoint parseFrom(InputStream inputStream) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AggregateDataPoint parseFrom(InputStream inputStream, q qVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AggregateDataPoint parseFrom(ByteBuffer byteBuffer) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AggregateDataPoint parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static AggregateDataPoint parseFrom(byte[] bArr) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AggregateDataPoint parseFrom(byte[] bArr, q qVar) {
            return (AggregateDataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<AggregateDataPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCumulativeDataPoint(CumulativeDataPoint cumulativeDataPoint) {
            cumulativeDataPoint.getClass();
            this.aggregate_ = cumulativeDataPoint;
            this.aggregateCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setStatisticalDataPoint(StatisticalDataPoint statisticalDataPoint) {
            statisticalDataPoint.getClass();
            this.aggregate_ = statisticalDataPoint;
            this.aggregateCase_ = 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"aggregate_", "aggregateCase_", "bitField0_", CumulativeDataPoint.class, StatisticalDataPoint.class});
                case 3:
                    return new AggregateDataPoint();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<AggregateDataPoint> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (AggregateDataPoint.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AggregateCase getAggregateCase() {
            return AggregateCase.forNumber(this.aggregateCase_);
        }

        public CumulativeDataPoint getCumulativeDataPoint() {
            return this.aggregateCase_ == 1 ? (CumulativeDataPoint) this.aggregate_ : CumulativeDataPoint.getDefaultInstance();
        }

        public StatisticalDataPoint getStatisticalDataPoint() {
            return this.aggregateCase_ == 2 ? (StatisticalDataPoint) this.aggregate_ : StatisticalDataPoint.getDefaultInstance();
        }

        public boolean hasCumulativeDataPoint() {
            return this.aggregateCase_ == 1;
        }

        public boolean hasStatisticalDataPoint() {
            return this.aggregateCase_ == 2;
        }
    }

    public interface AggregateDataPointOrBuilder extends s0 {
        AggregateDataPoint.AggregateCase getAggregateCase();

        AggregateDataPoint.CumulativeDataPoint getCumulativeDataPoint();

        /* synthetic */ r0 getDefaultInstanceForType();

        AggregateDataPoint.StatisticalDataPoint getStatisticalDataPoint();

        boolean hasCumulativeDataPoint();

        boolean hasStatisticalDataPoint();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Availability extends y<Availability, Builder> implements AvailabilityOrBuilder {
        public static final int DATA_TYPE_AVAILABILITY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Availability DEFAULT_INSTANCE;
        public static final int LOCATION_AVAILABILITY_FIELD_NUMBER = 2;
        private static volatile z0<Availability> PARSER;
        private int availabilityCase_ = 0;
        private Object availability_;
        private int bitField0_;

        public enum AvailabilityCase {
            DATA_TYPE_AVAILABILITY(1),
            LOCATION_AVAILABILITY(2),
            AVAILABILITY_NOT_SET(0);
            
            private final int value;

            private AvailabilityCase(int i8) {
                this.value = i8;
            }

            public static AvailabilityCase forNumber(int i8) {
                if (i8 == 0) {
                    return AVAILABILITY_NOT_SET;
                }
                if (i8 == 1) {
                    return DATA_TYPE_AVAILABILITY;
                }
                if (i8 != 2) {
                    return null;
                }
                return LOCATION_AVAILABILITY;
            }

            @Deprecated
            public static AvailabilityCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class Builder extends y.a<Availability, Builder> implements AvailabilityOrBuilder {
            private Builder() {
                super(Availability.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAvailability() {
                copyOnWrite();
                ((Availability) this.instance).clearAvailability();
                return this;
            }

            public Builder clearDataTypeAvailability() {
                copyOnWrite();
                ((Availability) this.instance).clearDataTypeAvailability();
                return this;
            }

            public Builder clearLocationAvailability() {
                copyOnWrite();
                ((Availability) this.instance).clearLocationAvailability();
                return this;
            }

            public AvailabilityCase getAvailabilityCase() {
                return ((Availability) this.instance).getAvailabilityCase();
            }

            public DataTypeAvailability getDataTypeAvailability() {
                return ((Availability) this.instance).getDataTypeAvailability();
            }

            public LocationAvailability getLocationAvailability() {
                return ((Availability) this.instance).getLocationAvailability();
            }

            public boolean hasDataTypeAvailability() {
                return ((Availability) this.instance).hasDataTypeAvailability();
            }

            public boolean hasLocationAvailability() {
                return ((Availability) this.instance).hasLocationAvailability();
            }

            public Builder setDataTypeAvailability(DataTypeAvailability dataTypeAvailability) {
                copyOnWrite();
                ((Availability) this.instance).setDataTypeAvailability(dataTypeAvailability);
                return this;
            }

            public Builder setLocationAvailability(LocationAvailability locationAvailability) {
                copyOnWrite();
                ((Availability) this.instance).setLocationAvailability(locationAvailability);
                return this;
            }
        }

        public enum DataTypeAvailability implements a0.c {
            DATA_TYPE_AVAILABILITY_UNKNOWN(0),
            DATA_TYPE_AVAILABILITY_AVAILABLE(1),
            DATA_TYPE_AVAILABILITY_ACQUIRING(2),
            DATA_TYPE_AVAILABILITY_UNAVAILABLE(3),
            DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY(4);
            
            public static final int DATA_TYPE_AVAILABILITY_ACQUIRING_VALUE = 2;
            public static final int DATA_TYPE_AVAILABILITY_AVAILABLE_VALUE = 1;
            public static final int DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY_VALUE = 4;
            public static final int DATA_TYPE_AVAILABILITY_UNAVAILABLE_VALUE = 3;
            public static final int DATA_TYPE_AVAILABILITY_UNKNOWN_VALUE = 0;
            private static final a0.d<DataTypeAvailability> internalValueMap = null;
            private final int value;

            public static final class DataTypeAvailabilityVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new DataTypeAvailabilityVerifier();
                }

                private DataTypeAvailabilityVerifier() {
                }

                public boolean isInRange(int i8) {
                    return DataTypeAvailability.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<DataTypeAvailability>() {
                    public DataTypeAvailability findValueByNumber(int i8) {
                        return DataTypeAvailability.forNumber(i8);
                    }
                };
            }

            private DataTypeAvailability(int i8) {
                this.value = i8;
            }

            public static DataTypeAvailability forNumber(int i8) {
                if (i8 == 0) {
                    return DATA_TYPE_AVAILABILITY_UNKNOWN;
                }
                if (i8 == 1) {
                    return DATA_TYPE_AVAILABILITY_AVAILABLE;
                }
                if (i8 == 2) {
                    return DATA_TYPE_AVAILABILITY_ACQUIRING;
                }
                if (i8 == 3) {
                    return DATA_TYPE_AVAILABILITY_UNAVAILABLE;
                }
                if (i8 != 4) {
                    return null;
                }
                return DATA_TYPE_AVAILABILITY_UNAVAILABLE_DEVICE_OFF_BODY;
            }

            public static a0.d<DataTypeAvailability> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return DataTypeAvailabilityVerifier.INSTANCE;
            }

            @Deprecated
            public static DataTypeAvailability valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        public enum LocationAvailability implements a0.c {
            LOCATION_AVAILABILITY_UNKNOWN(0),
            LOCATION_AVAILABILITY_UNAVAILABLE(1),
            LOCATION_AVAILABILITY_NO_GNSS(2),
            LOCATION_AVAILABILITY_ACQUIRING(3),
            LOCATION_AVAILABILITY_ACQUIRED_TETHERED(4),
            LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED(5);
            
            public static final int LOCATION_AVAILABILITY_ACQUIRED_TETHERED_VALUE = 4;
            public static final int LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED_VALUE = 5;
            public static final int LOCATION_AVAILABILITY_ACQUIRING_VALUE = 3;
            public static final int LOCATION_AVAILABILITY_NO_GNSS_VALUE = 2;
            public static final int LOCATION_AVAILABILITY_UNAVAILABLE_VALUE = 1;
            public static final int LOCATION_AVAILABILITY_UNKNOWN_VALUE = 0;
            private static final a0.d<LocationAvailability> internalValueMap = null;
            private final int value;

            public static final class LocationAvailabilityVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new LocationAvailabilityVerifier();
                }

                private LocationAvailabilityVerifier() {
                }

                public boolean isInRange(int i8) {
                    return LocationAvailability.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<LocationAvailability>() {
                    public LocationAvailability findValueByNumber(int i8) {
                        return LocationAvailability.forNumber(i8);
                    }
                };
            }

            private LocationAvailability(int i8) {
                this.value = i8;
            }

            public static LocationAvailability forNumber(int i8) {
                if (i8 == 0) {
                    return LOCATION_AVAILABILITY_UNKNOWN;
                }
                if (i8 == 1) {
                    return LOCATION_AVAILABILITY_UNAVAILABLE;
                }
                if (i8 == 2) {
                    return LOCATION_AVAILABILITY_NO_GNSS;
                }
                if (i8 == 3) {
                    return LOCATION_AVAILABILITY_ACQUIRING;
                }
                if (i8 == 4) {
                    return LOCATION_AVAILABILITY_ACQUIRED_TETHERED;
                }
                if (i8 != 5) {
                    return null;
                }
                return LOCATION_AVAILABILITY_ACQUIRED_UNTETHERED;
            }

            public static a0.d<LocationAvailability> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return LocationAvailabilityVerifier.INSTANCE;
            }

            @Deprecated
            public static LocationAvailability valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Availability availability = new Availability();
            DEFAULT_INSTANCE = availability;
            y.registerDefaultInstance(Availability.class, availability);
        }

        private Availability() {
        }

        /* access modifiers changed from: private */
        public void clearAvailability() {
            this.availabilityCase_ = 0;
            this.availability_ = null;
        }

        /* access modifiers changed from: private */
        public void clearDataTypeAvailability() {
            if (this.availabilityCase_ == 1) {
                this.availabilityCase_ = 0;
                this.availability_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLocationAvailability() {
            if (this.availabilityCase_ == 2) {
                this.availabilityCase_ = 0;
                this.availability_ = null;
            }
        }

        public static Availability getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Availability availability) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(availability);
        }

        public static Availability parseDelimitedFrom(InputStream inputStream) {
            return (Availability) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Availability parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Availability) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Availability parseFrom(i iVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Availability parseFrom(i iVar, q qVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Availability parseFrom(j jVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Availability parseFrom(j jVar, q qVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Availability parseFrom(InputStream inputStream) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Availability parseFrom(InputStream inputStream, q qVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Availability parseFrom(ByteBuffer byteBuffer) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Availability parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Availability parseFrom(byte[] bArr) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Availability parseFrom(byte[] bArr, q qVar) {
            return (Availability) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<Availability> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDataTypeAvailability(DataTypeAvailability dataTypeAvailability) {
            this.availability_ = Integer.valueOf(dataTypeAvailability.getNumber());
            this.availabilityCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setLocationAvailability(LocationAvailability locationAvailability) {
            this.availability_ = Integer.valueOf(locationAvailability.getNumber());
            this.availabilityCase_ = 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"availability_", "availabilityCase_", "bitField0_", DataTypeAvailability.internalGetVerifier(), LocationAvailability.internalGetVerifier()});
                case 3:
                    return new Availability();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<Availability> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (Availability.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AvailabilityCase getAvailabilityCase() {
            return AvailabilityCase.forNumber(this.availabilityCase_);
        }

        public DataTypeAvailability getDataTypeAvailability() {
            if (this.availabilityCase_ != 1) {
                return DataTypeAvailability.DATA_TYPE_AVAILABILITY_UNKNOWN;
            }
            DataTypeAvailability forNumber = DataTypeAvailability.forNumber(((Integer) this.availability_).intValue());
            return forNumber == null ? DataTypeAvailability.DATA_TYPE_AVAILABILITY_UNKNOWN : forNumber;
        }

        public LocationAvailability getLocationAvailability() {
            if (this.availabilityCase_ != 2) {
                return LocationAvailability.LOCATION_AVAILABILITY_UNKNOWN;
            }
            LocationAvailability forNumber = LocationAvailability.forNumber(((Integer) this.availability_).intValue());
            return forNumber == null ? LocationAvailability.LOCATION_AVAILABILITY_UNKNOWN : forNumber;
        }

        public boolean hasDataTypeAvailability() {
            return this.availabilityCase_ == 1;
        }

        public boolean hasLocationAvailability() {
            return this.availabilityCase_ == 2;
        }
    }

    public interface AvailabilityOrBuilder extends s0 {
        Availability.AvailabilityCase getAvailabilityCase();

        Availability.DataTypeAvailability getDataTypeAvailability();

        /* synthetic */ r0 getDefaultInstanceForType();

        Availability.LocationAvailability getLocationAvailability();

        boolean hasDataTypeAvailability();

        boolean hasLocationAvailability();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Bundle extends y<Bundle, Builder> implements BundleOrBuilder {
        public static final int BOOLS_FIELD_NUMBER = 1;
        public static final int BUNDLES_FIELD_NUMBER = 9;
        public static final int BYTES_FIELD_NUMBER = 7;
        public static final int BYTE_ARRAYS_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final Bundle DEFAULT_INSTANCE;
        public static final int DOUBLES_FIELD_NUMBER = 6;
        public static final int FLOATS_FIELD_NUMBER = 5;
        public static final int INTS_FIELD_NUMBER = 3;
        public static final int LONGS_FIELD_NUMBER = 4;
        private static volatile z0<Bundle> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 2;
        private l0<String, Boolean> bools_;
        private l0<String, Bundle> bundles_;
        private l0<String, i> byteArrays_;
        private l0<String, Integer> bytes_;
        private l0<String, Double> doubles_;
        private l0<String, Float> floats_;
        private l0<String, Integer> ints_;
        private l0<String, Long> longs_;
        private l0<String, String> strings_;

        public static final class BoolsDefaultEntryHolder {
            static final k0<String, Boolean> defaultEntry = new k0<>(s1.f3756m, s1.f3755l, Boolean.FALSE);

            private BoolsDefaultEntryHolder() {
            }
        }

        public static final class Builder extends y.a<Bundle, Builder> implements BundleOrBuilder {
            private Builder() {
                super(Bundle.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearBools() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBoolsMap().clear();
                return this;
            }

            public Builder clearBundles() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBundlesMap().clear();
                return this;
            }

            public Builder clearByteArrays() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableByteArraysMap().clear();
                return this;
            }

            public Builder clearBytes() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBytesMap().clear();
                return this;
            }

            public Builder clearDoubles() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableDoublesMap().clear();
                return this;
            }

            public Builder clearFloats() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableFloatsMap().clear();
                return this;
            }

            public Builder clearInts() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableIntsMap().clear();
                return this;
            }

            public Builder clearLongs() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableLongsMap().clear();
                return this;
            }

            public Builder clearStrings() {
                copyOnWrite();
                ((Bundle) this.instance).getMutableStringsMap().clear();
                return this;
            }

            public boolean containsBools(String str) {
                str.getClass();
                return ((Bundle) this.instance).getBoolsMap().containsKey(str);
            }

            public boolean containsBundles(String str) {
                str.getClass();
                return ((Bundle) this.instance).getBundlesMap().containsKey(str);
            }

            public boolean containsByteArrays(String str) {
                str.getClass();
                return ((Bundle) this.instance).getByteArraysMap().containsKey(str);
            }

            public boolean containsBytes(String str) {
                str.getClass();
                return ((Bundle) this.instance).getBytesMap().containsKey(str);
            }

            public boolean containsDoubles(String str) {
                str.getClass();
                return ((Bundle) this.instance).getDoublesMap().containsKey(str);
            }

            public boolean containsFloats(String str) {
                str.getClass();
                return ((Bundle) this.instance).getFloatsMap().containsKey(str);
            }

            public boolean containsInts(String str) {
                str.getClass();
                return ((Bundle) this.instance).getIntsMap().containsKey(str);
            }

            public boolean containsLongs(String str) {
                str.getClass();
                return ((Bundle) this.instance).getLongsMap().containsKey(str);
            }

            public boolean containsStrings(String str) {
                str.getClass();
                return ((Bundle) this.instance).getStringsMap().containsKey(str);
            }

            @Deprecated
            public Map<String, Boolean> getBools() {
                return getBoolsMap();
            }

            public int getBoolsCount() {
                return ((Bundle) this.instance).getBoolsMap().size();
            }

            public Map<String, Boolean> getBoolsMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getBoolsMap());
            }

            public boolean getBoolsOrDefault(String str, boolean z8) {
                str.getClass();
                Map<String, Boolean> boolsMap = ((Bundle) this.instance).getBoolsMap();
                return boolsMap.containsKey(str) ? boolsMap.get(str).booleanValue() : z8;
            }

            public boolean getBoolsOrThrow(String str) {
                str.getClass();
                Map<String, Boolean> boolsMap = ((Bundle) this.instance).getBoolsMap();
                if (boolsMap.containsKey(str)) {
                    return boolsMap.get(str).booleanValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Bundle> getBundles() {
                return getBundlesMap();
            }

            public int getBundlesCount() {
                return ((Bundle) this.instance).getBundlesMap().size();
            }

            public Map<String, Bundle> getBundlesMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getBundlesMap());
            }

            public Bundle getBundlesOrDefault(String str, Bundle bundle) {
                str.getClass();
                Map<String, Bundle> bundlesMap = ((Bundle) this.instance).getBundlesMap();
                return bundlesMap.containsKey(str) ? bundlesMap.get(str) : bundle;
            }

            public Bundle getBundlesOrThrow(String str) {
                str.getClass();
                Map<String, Bundle> bundlesMap = ((Bundle) this.instance).getBundlesMap();
                if (bundlesMap.containsKey(str)) {
                    return bundlesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, i> getByteArrays() {
                return getByteArraysMap();
            }

            public int getByteArraysCount() {
                return ((Bundle) this.instance).getByteArraysMap().size();
            }

            public Map<String, i> getByteArraysMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getByteArraysMap());
            }

            public i getByteArraysOrDefault(String str, i iVar) {
                str.getClass();
                Map<String, i> byteArraysMap = ((Bundle) this.instance).getByteArraysMap();
                return byteArraysMap.containsKey(str) ? byteArraysMap.get(str) : iVar;
            }

            public i getByteArraysOrThrow(String str) {
                str.getClass();
                Map<String, i> byteArraysMap = ((Bundle) this.instance).getByteArraysMap();
                if (byteArraysMap.containsKey(str)) {
                    return byteArraysMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Integer> getBytes() {
                return getBytesMap();
            }

            public int getBytesCount() {
                return ((Bundle) this.instance).getBytesMap().size();
            }

            public Map<String, Integer> getBytesMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getBytesMap());
            }

            public int getBytesOrDefault(String str, int i8) {
                str.getClass();
                Map<String, Integer> bytesMap = ((Bundle) this.instance).getBytesMap();
                return bytesMap.containsKey(str) ? bytesMap.get(str).intValue() : i8;
            }

            public int getBytesOrThrow(String str) {
                str.getClass();
                Map<String, Integer> bytesMap = ((Bundle) this.instance).getBytesMap();
                if (bytesMap.containsKey(str)) {
                    return bytesMap.get(str).intValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Double> getDoubles() {
                return getDoublesMap();
            }

            public int getDoublesCount() {
                return ((Bundle) this.instance).getDoublesMap().size();
            }

            public Map<String, Double> getDoublesMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getDoublesMap());
            }

            public double getDoublesOrDefault(String str, double d9) {
                str.getClass();
                Map<String, Double> doublesMap = ((Bundle) this.instance).getDoublesMap();
                return doublesMap.containsKey(str) ? doublesMap.get(str).doubleValue() : d9;
            }

            public double getDoublesOrThrow(String str) {
                str.getClass();
                Map<String, Double> doublesMap = ((Bundle) this.instance).getDoublesMap();
                if (doublesMap.containsKey(str)) {
                    return doublesMap.get(str).doubleValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Float> getFloats() {
                return getFloatsMap();
            }

            public int getFloatsCount() {
                return ((Bundle) this.instance).getFloatsMap().size();
            }

            public Map<String, Float> getFloatsMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getFloatsMap());
            }

            public float getFloatsOrDefault(String str, float f9) {
                str.getClass();
                Map<String, Float> floatsMap = ((Bundle) this.instance).getFloatsMap();
                return floatsMap.containsKey(str) ? floatsMap.get(str).floatValue() : f9;
            }

            public float getFloatsOrThrow(String str) {
                str.getClass();
                Map<String, Float> floatsMap = ((Bundle) this.instance).getFloatsMap();
                if (floatsMap.containsKey(str)) {
                    return floatsMap.get(str).floatValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Integer> getInts() {
                return getIntsMap();
            }

            public int getIntsCount() {
                return ((Bundle) this.instance).getIntsMap().size();
            }

            public Map<String, Integer> getIntsMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getIntsMap());
            }

            public int getIntsOrDefault(String str, int i8) {
                str.getClass();
                Map<String, Integer> intsMap = ((Bundle) this.instance).getIntsMap();
                return intsMap.containsKey(str) ? intsMap.get(str).intValue() : i8;
            }

            public int getIntsOrThrow(String str) {
                str.getClass();
                Map<String, Integer> intsMap = ((Bundle) this.instance).getIntsMap();
                if (intsMap.containsKey(str)) {
                    return intsMap.get(str).intValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, Long> getLongs() {
                return getLongsMap();
            }

            public int getLongsCount() {
                return ((Bundle) this.instance).getLongsMap().size();
            }

            public Map<String, Long> getLongsMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getLongsMap());
            }

            public long getLongsOrDefault(String str, long j8) {
                str.getClass();
                Map<String, Long> longsMap = ((Bundle) this.instance).getLongsMap();
                return longsMap.containsKey(str) ? longsMap.get(str).longValue() : j8;
            }

            public long getLongsOrThrow(String str) {
                str.getClass();
                Map<String, Long> longsMap = ((Bundle) this.instance).getLongsMap();
                if (longsMap.containsKey(str)) {
                    return longsMap.get(str).longValue();
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<String, String> getStrings() {
                return getStringsMap();
            }

            public int getStringsCount() {
                return ((Bundle) this.instance).getStringsMap().size();
            }

            public Map<String, String> getStringsMap() {
                return Collections.unmodifiableMap(((Bundle) this.instance).getStringsMap());
            }

            public String getStringsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> stringsMap = ((Bundle) this.instance).getStringsMap();
                return stringsMap.containsKey(str) ? stringsMap.get(str) : str2;
            }

            public String getStringsOrThrow(String str) {
                str.getClass();
                Map<String, String> stringsMap = ((Bundle) this.instance).getStringsMap();
                if (stringsMap.containsKey(str)) {
                    return stringsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllBools(Map<String, Boolean> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBoolsMap().putAll(map);
                return this;
            }

            public Builder putAllBundles(Map<String, Bundle> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBundlesMap().putAll(map);
                return this;
            }

            public Builder putAllByteArrays(Map<String, i> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableByteArraysMap().putAll(map);
                return this;
            }

            public Builder putAllBytes(Map<String, Integer> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableBytesMap().putAll(map);
                return this;
            }

            public Builder putAllDoubles(Map<String, Double> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableDoublesMap().putAll(map);
                return this;
            }

            public Builder putAllFloats(Map<String, Float> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableFloatsMap().putAll(map);
                return this;
            }

            public Builder putAllInts(Map<String, Integer> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableIntsMap().putAll(map);
                return this;
            }

            public Builder putAllLongs(Map<String, Long> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableLongsMap().putAll(map);
                return this;
            }

            public Builder putAllStrings(Map<String, String> map) {
                copyOnWrite();
                ((Bundle) this.instance).getMutableStringsMap().putAll(map);
                return this;
            }

            public Builder putBools(String str, boolean z8) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBoolsMap().put(str, Boolean.valueOf(z8));
                return this;
            }

            public Builder putBundles(String str, Bundle bundle) {
                str.getClass();
                bundle.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBundlesMap().put(str, bundle);
                return this;
            }

            public Builder putByteArrays(String str, i iVar) {
                str.getClass();
                iVar.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableByteArraysMap().put(str, iVar);
                return this;
            }

            public Builder putBytes(String str, int i8) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBytesMap().put(str, Integer.valueOf(i8));
                return this;
            }

            public Builder putDoubles(String str, double d9) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableDoublesMap().put(str, Double.valueOf(d9));
                return this;
            }

            public Builder putFloats(String str, float f9) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableFloatsMap().put(str, Float.valueOf(f9));
                return this;
            }

            public Builder putInts(String str, int i8) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableIntsMap().put(str, Integer.valueOf(i8));
                return this;
            }

            public Builder putLongs(String str, long j8) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableLongsMap().put(str, Long.valueOf(j8));
                return this;
            }

            public Builder putStrings(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableStringsMap().put(str, str2);
                return this;
            }

            public Builder removeBools(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBoolsMap().remove(str);
                return this;
            }

            public Builder removeBundles(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBundlesMap().remove(str);
                return this;
            }

            public Builder removeByteArrays(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableByteArraysMap().remove(str);
                return this;
            }

            public Builder removeBytes(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableBytesMap().remove(str);
                return this;
            }

            public Builder removeDoubles(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableDoublesMap().remove(str);
                return this;
            }

            public Builder removeFloats(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableFloatsMap().remove(str);
                return this;
            }

            public Builder removeInts(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableIntsMap().remove(str);
                return this;
            }

            public Builder removeLongs(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableLongsMap().remove(str);
                return this;
            }

            public Builder removeStrings(String str) {
                str.getClass();
                copyOnWrite();
                ((Bundle) this.instance).getMutableStringsMap().remove(str);
                return this;
            }
        }

        public static final class BundlesDefaultEntryHolder {
            static final k0<String, Bundle> defaultEntry = new k0<>(s1.f3756m, s1.f3758o, Bundle.getDefaultInstance());

            private BundlesDefaultEntryHolder() {
            }
        }

        public static final class ByteArraysDefaultEntryHolder {
            static final k0<String, i> defaultEntry = new k0<>(s1.f3756m, s1.f3759p, i.f3648g);

            private ByteArraysDefaultEntryHolder() {
            }
        }

        public static final class BytesDefaultEntryHolder {
            static final k0<String, Integer> defaultEntry = new k0<>(s1.f3756m, s1.f3754k, 0);

            private BytesDefaultEntryHolder() {
            }
        }

        public static final class DoublesDefaultEntryHolder {
            static final k0<String, Double> defaultEntry = new k0<>(s1.f3756m, s1.f3751h, Double.valueOf(0.0d));

            private DoublesDefaultEntryHolder() {
            }
        }

        public static final class FloatsDefaultEntryHolder {
            static final k0<String, Float> defaultEntry = new k0<>(s1.f3756m, s1.f3752i, Float.valueOf(0.0f));

            private FloatsDefaultEntryHolder() {
            }
        }

        public static final class IntsDefaultEntryHolder {
            static final k0<String, Integer> defaultEntry = new k0<>(s1.f3756m, s1.f3754k, 0);

            private IntsDefaultEntryHolder() {
            }
        }

        public static final class LongsDefaultEntryHolder {
            static final k0<String, Long> defaultEntry = new k0<>(s1.f3756m, s1.f3753j, 0L);

            private LongsDefaultEntryHolder() {
            }
        }

        public static final class StringsDefaultEntryHolder {
            static final k0<String, String> defaultEntry;

            static {
                s1.a aVar = s1.f3756m;
                defaultEntry = new k0<>(aVar, aVar, "");
            }

            private StringsDefaultEntryHolder() {
            }
        }

        static {
            Bundle bundle = new Bundle();
            DEFAULT_INSTANCE = bundle;
            y.registerDefaultInstance(Bundle.class, bundle);
        }

        private Bundle() {
            l0<String, Boolean> l0Var = l0.f3720g;
            this.bools_ = l0Var;
            this.strings_ = l0Var;
            this.ints_ = l0Var;
            this.longs_ = l0Var;
            this.floats_ = l0Var;
            this.doubles_ = l0Var;
            this.bytes_ = l0Var;
            this.byteArrays_ = l0Var;
            this.bundles_ = l0Var;
        }

        public static Bundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, Boolean> getMutableBoolsMap() {
            return internalGetMutableBools();
        }

        /* access modifiers changed from: private */
        public Map<String, Bundle> getMutableBundlesMap() {
            return internalGetMutableBundles();
        }

        /* access modifiers changed from: private */
        public Map<String, i> getMutableByteArraysMap() {
            return internalGetMutableByteArrays();
        }

        /* access modifiers changed from: private */
        public Map<String, Integer> getMutableBytesMap() {
            return internalGetMutableBytes();
        }

        /* access modifiers changed from: private */
        public Map<String, Double> getMutableDoublesMap() {
            return internalGetMutableDoubles();
        }

        /* access modifiers changed from: private */
        public Map<String, Float> getMutableFloatsMap() {
            return internalGetMutableFloats();
        }

        /* access modifiers changed from: private */
        public Map<String, Integer> getMutableIntsMap() {
            return internalGetMutableInts();
        }

        /* access modifiers changed from: private */
        public Map<String, Long> getMutableLongsMap() {
            return internalGetMutableLongs();
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableStringsMap() {
            return internalGetMutableStrings();
        }

        private l0<String, Boolean> internalGetBools() {
            return this.bools_;
        }

        private l0<String, Bundle> internalGetBundles() {
            return this.bundles_;
        }

        private l0<String, i> internalGetByteArrays() {
            return this.byteArrays_;
        }

        private l0<String, Integer> internalGetBytes() {
            return this.bytes_;
        }

        private l0<String, Double> internalGetDoubles() {
            return this.doubles_;
        }

        private l0<String, Float> internalGetFloats() {
            return this.floats_;
        }

        private l0<String, Integer> internalGetInts() {
            return this.ints_;
        }

        private l0<String, Long> internalGetLongs() {
            return this.longs_;
        }

        private l0<String, Boolean> internalGetMutableBools() {
            l0<String, Boolean> l0Var = this.bools_;
            if (!l0Var.f3721f) {
                this.bools_ = l0Var.c();
            }
            return this.bools_;
        }

        private l0<String, Bundle> internalGetMutableBundles() {
            l0<String, Bundle> l0Var = this.bundles_;
            if (!l0Var.f3721f) {
                this.bundles_ = l0Var.c();
            }
            return this.bundles_;
        }

        private l0<String, i> internalGetMutableByteArrays() {
            l0<String, i> l0Var = this.byteArrays_;
            if (!l0Var.f3721f) {
                this.byteArrays_ = l0Var.c();
            }
            return this.byteArrays_;
        }

        private l0<String, Integer> internalGetMutableBytes() {
            l0<String, Integer> l0Var = this.bytes_;
            if (!l0Var.f3721f) {
                this.bytes_ = l0Var.c();
            }
            return this.bytes_;
        }

        private l0<String, Double> internalGetMutableDoubles() {
            l0<String, Double> l0Var = this.doubles_;
            if (!l0Var.f3721f) {
                this.doubles_ = l0Var.c();
            }
            return this.doubles_;
        }

        private l0<String, Float> internalGetMutableFloats() {
            l0<String, Float> l0Var = this.floats_;
            if (!l0Var.f3721f) {
                this.floats_ = l0Var.c();
            }
            return this.floats_;
        }

        private l0<String, Integer> internalGetMutableInts() {
            l0<String, Integer> l0Var = this.ints_;
            if (!l0Var.f3721f) {
                this.ints_ = l0Var.c();
            }
            return this.ints_;
        }

        private l0<String, Long> internalGetMutableLongs() {
            l0<String, Long> l0Var = this.longs_;
            if (!l0Var.f3721f) {
                this.longs_ = l0Var.c();
            }
            return this.longs_;
        }

        private l0<String, String> internalGetMutableStrings() {
            l0<String, String> l0Var = this.strings_;
            if (!l0Var.f3721f) {
                this.strings_ = l0Var.c();
            }
            return this.strings_;
        }

        private l0<String, String> internalGetStrings() {
            return this.strings_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Bundle bundle) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bundle);
        }

        public static Bundle parseDelimitedFrom(InputStream inputStream) {
            return (Bundle) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Bundle parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Bundle) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Bundle parseFrom(i iVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Bundle parseFrom(i iVar, q qVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Bundle parseFrom(j jVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Bundle parseFrom(j jVar, q qVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Bundle parseFrom(InputStream inputStream) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Bundle parseFrom(InputStream inputStream, q qVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Bundle parseFrom(ByteBuffer byteBuffer) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Bundle parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Bundle parseFrom(byte[] bArr) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Bundle parseFrom(byte[] bArr, q qVar) {
            return (Bundle) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<Bundle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public boolean containsBools(String str) {
            str.getClass();
            return internalGetBools().containsKey(str);
        }

        public boolean containsBundles(String str) {
            str.getClass();
            return internalGetBundles().containsKey(str);
        }

        public boolean containsByteArrays(String str) {
            str.getClass();
            return internalGetByteArrays().containsKey(str);
        }

        public boolean containsBytes(String str) {
            str.getClass();
            return internalGetBytes().containsKey(str);
        }

        public boolean containsDoubles(String str) {
            str.getClass();
            return internalGetDoubles().containsKey(str);
        }

        public boolean containsFloats(String str) {
            str.getClass();
            return internalGetFloats().containsKey(str);
        }

        public boolean containsInts(String str) {
            str.getClass();
            return internalGetInts().containsKey(str);
        }

        public boolean containsLongs(String str) {
            str.getClass();
            return internalGetLongs().containsKey(str);
        }

        public boolean containsStrings(String str) {
            str.getClass();
            return internalGetStrings().containsKey(str);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0000\u0001\t\t\t\u0000\u0000\u00012\u00022\u00032\u00042\u00052\u00062\u00072\b2\t2", new Object[]{"bools_", BoolsDefaultEntryHolder.defaultEntry, "strings_", StringsDefaultEntryHolder.defaultEntry, "ints_", IntsDefaultEntryHolder.defaultEntry, "longs_", LongsDefaultEntryHolder.defaultEntry, "floats_", FloatsDefaultEntryHolder.defaultEntry, "doubles_", DoublesDefaultEntryHolder.defaultEntry, "bytes_", BytesDefaultEntryHolder.defaultEntry, "byteArrays_", ByteArraysDefaultEntryHolder.defaultEntry, "bundles_", BundlesDefaultEntryHolder.defaultEntry});
                case 3:
                    return new Bundle();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<Bundle> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (Bundle.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Deprecated
        public Map<String, Boolean> getBools() {
            return getBoolsMap();
        }

        public int getBoolsCount() {
            return internalGetBools().size();
        }

        public Map<String, Boolean> getBoolsMap() {
            return Collections.unmodifiableMap(internalGetBools());
        }

        public boolean getBoolsOrDefault(String str, boolean z8) {
            str.getClass();
            l0<String, Boolean> internalGetBools = internalGetBools();
            return internalGetBools.containsKey(str) ? internalGetBools.get(str).booleanValue() : z8;
        }

        public boolean getBoolsOrThrow(String str) {
            str.getClass();
            l0<String, Boolean> internalGetBools = internalGetBools();
            if (internalGetBools.containsKey(str)) {
                return internalGetBools.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Bundle> getBundles() {
            return getBundlesMap();
        }

        public int getBundlesCount() {
            return internalGetBundles().size();
        }

        public Map<String, Bundle> getBundlesMap() {
            return Collections.unmodifiableMap(internalGetBundles());
        }

        public Bundle getBundlesOrDefault(String str, Bundle bundle) {
            str.getClass();
            l0<String, Bundle> internalGetBundles = internalGetBundles();
            return internalGetBundles.containsKey(str) ? internalGetBundles.get(str) : bundle;
        }

        public Bundle getBundlesOrThrow(String str) {
            str.getClass();
            l0<String, Bundle> internalGetBundles = internalGetBundles();
            if (internalGetBundles.containsKey(str)) {
                return internalGetBundles.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, i> getByteArrays() {
            return getByteArraysMap();
        }

        public int getByteArraysCount() {
            return internalGetByteArrays().size();
        }

        public Map<String, i> getByteArraysMap() {
            return Collections.unmodifiableMap(internalGetByteArrays());
        }

        public i getByteArraysOrDefault(String str, i iVar) {
            str.getClass();
            l0<String, i> internalGetByteArrays = internalGetByteArrays();
            return internalGetByteArrays.containsKey(str) ? internalGetByteArrays.get(str) : iVar;
        }

        public i getByteArraysOrThrow(String str) {
            str.getClass();
            l0<String, i> internalGetByteArrays = internalGetByteArrays();
            if (internalGetByteArrays.containsKey(str)) {
                return internalGetByteArrays.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Integer> getBytes() {
            return getBytesMap();
        }

        public int getBytesCount() {
            return internalGetBytes().size();
        }

        public Map<String, Integer> getBytesMap() {
            return Collections.unmodifiableMap(internalGetBytes());
        }

        public int getBytesOrDefault(String str, int i8) {
            str.getClass();
            l0<String, Integer> internalGetBytes = internalGetBytes();
            return internalGetBytes.containsKey(str) ? internalGetBytes.get(str).intValue() : i8;
        }

        public int getBytesOrThrow(String str) {
            str.getClass();
            l0<String, Integer> internalGetBytes = internalGetBytes();
            if (internalGetBytes.containsKey(str)) {
                return internalGetBytes.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Double> getDoubles() {
            return getDoublesMap();
        }

        public int getDoublesCount() {
            return internalGetDoubles().size();
        }

        public Map<String, Double> getDoublesMap() {
            return Collections.unmodifiableMap(internalGetDoubles());
        }

        public double getDoublesOrDefault(String str, double d9) {
            str.getClass();
            l0<String, Double> internalGetDoubles = internalGetDoubles();
            return internalGetDoubles.containsKey(str) ? internalGetDoubles.get(str).doubleValue() : d9;
        }

        public double getDoublesOrThrow(String str) {
            str.getClass();
            l0<String, Double> internalGetDoubles = internalGetDoubles();
            if (internalGetDoubles.containsKey(str)) {
                return internalGetDoubles.get(str).doubleValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Float> getFloats() {
            return getFloatsMap();
        }

        public int getFloatsCount() {
            return internalGetFloats().size();
        }

        public Map<String, Float> getFloatsMap() {
            return Collections.unmodifiableMap(internalGetFloats());
        }

        public float getFloatsOrDefault(String str, float f9) {
            str.getClass();
            l0<String, Float> internalGetFloats = internalGetFloats();
            return internalGetFloats.containsKey(str) ? internalGetFloats.get(str).floatValue() : f9;
        }

        public float getFloatsOrThrow(String str) {
            str.getClass();
            l0<String, Float> internalGetFloats = internalGetFloats();
            if (internalGetFloats.containsKey(str)) {
                return internalGetFloats.get(str).floatValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Integer> getInts() {
            return getIntsMap();
        }

        public int getIntsCount() {
            return internalGetInts().size();
        }

        public Map<String, Integer> getIntsMap() {
            return Collections.unmodifiableMap(internalGetInts());
        }

        public int getIntsOrDefault(String str, int i8) {
            str.getClass();
            l0<String, Integer> internalGetInts = internalGetInts();
            return internalGetInts.containsKey(str) ? internalGetInts.get(str).intValue() : i8;
        }

        public int getIntsOrThrow(String str) {
            str.getClass();
            l0<String, Integer> internalGetInts = internalGetInts();
            if (internalGetInts.containsKey(str)) {
                return internalGetInts.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Long> getLongs() {
            return getLongsMap();
        }

        public int getLongsCount() {
            return internalGetLongs().size();
        }

        public Map<String, Long> getLongsMap() {
            return Collections.unmodifiableMap(internalGetLongs());
        }

        public long getLongsOrDefault(String str, long j8) {
            str.getClass();
            l0<String, Long> internalGetLongs = internalGetLongs();
            return internalGetLongs.containsKey(str) ? internalGetLongs.get(str).longValue() : j8;
        }

        public long getLongsOrThrow(String str) {
            str.getClass();
            l0<String, Long> internalGetLongs = internalGetLongs();
            if (internalGetLongs.containsKey(str)) {
                return internalGetLongs.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, String> getStrings() {
            return getStringsMap();
        }

        public int getStringsCount() {
            return internalGetStrings().size();
        }

        public Map<String, String> getStringsMap() {
            return Collections.unmodifiableMap(internalGetStrings());
        }

        public String getStringsOrDefault(String str, String str2) {
            str.getClass();
            l0<String, String> internalGetStrings = internalGetStrings();
            return internalGetStrings.containsKey(str) ? internalGetStrings.get(str) : str2;
        }

        public String getStringsOrThrow(String str) {
            str.getClass();
            l0<String, String> internalGetStrings = internalGetStrings();
            if (internalGetStrings.containsKey(str)) {
                return internalGetStrings.get(str);
            }
            throw new IllegalArgumentException();
        }
    }

    public interface BundleOrBuilder extends s0 {
        boolean containsBools(String str);

        boolean containsBundles(String str);

        boolean containsByteArrays(String str);

        boolean containsBytes(String str);

        boolean containsDoubles(String str);

        boolean containsFloats(String str);

        boolean containsInts(String str);

        boolean containsLongs(String str);

        boolean containsStrings(String str);

        @Deprecated
        Map<String, Boolean> getBools();

        int getBoolsCount();

        Map<String, Boolean> getBoolsMap();

        boolean getBoolsOrDefault(String str, boolean z8);

        boolean getBoolsOrThrow(String str);

        @Deprecated
        Map<String, Bundle> getBundles();

        int getBundlesCount();

        Map<String, Bundle> getBundlesMap();

        Bundle getBundlesOrDefault(String str, Bundle bundle);

        Bundle getBundlesOrThrow(String str);

        @Deprecated
        Map<String, i> getByteArrays();

        int getByteArraysCount();

        Map<String, i> getByteArraysMap();

        i getByteArraysOrDefault(String str, i iVar);

        i getByteArraysOrThrow(String str);

        @Deprecated
        Map<String, Integer> getBytes();

        int getBytesCount();

        Map<String, Integer> getBytesMap();

        int getBytesOrDefault(String str, int i8);

        int getBytesOrThrow(String str);

        /* synthetic */ r0 getDefaultInstanceForType();

        @Deprecated
        Map<String, Double> getDoubles();

        int getDoublesCount();

        Map<String, Double> getDoublesMap();

        double getDoublesOrDefault(String str, double d9);

        double getDoublesOrThrow(String str);

        @Deprecated
        Map<String, Float> getFloats();

        int getFloatsCount();

        Map<String, Float> getFloatsMap();

        float getFloatsOrDefault(String str, float f9);

        float getFloatsOrThrow(String str);

        @Deprecated
        Map<String, Integer> getInts();

        int getIntsCount();

        Map<String, Integer> getIntsMap();

        int getIntsOrDefault(String str, int i8);

        int getIntsOrThrow(String str);

        @Deprecated
        Map<String, Long> getLongs();

        int getLongsCount();

        Map<String, Long> getLongsMap();

        long getLongsOrDefault(String str, long j8);

        long getLongsOrThrow(String str);

        @Deprecated
        Map<String, String> getStrings();

        int getStringsCount();

        Map<String, String> getStringsMap();

        String getStringsOrDefault(String str, String str2);

        String getStringsOrThrow(String str);

        /* synthetic */ boolean isInitialized();
    }

    public enum ComparisonType implements a0.c {
        COMPARISON_TYPE_UNKNOWN(0),
        COMPARISON_TYPE_GREATER_THAN(1),
        COMPARISON_TYPE_GREATER_THAN_OR_EQUAL(2),
        COMPARISON_TYPE_LESS_THAN(3),
        COMPARISON_TYPE_LESS_THAN_OR_EQUAL(4);
        
        public static final int COMPARISON_TYPE_GREATER_THAN_OR_EQUAL_VALUE = 2;
        public static final int COMPARISON_TYPE_GREATER_THAN_VALUE = 1;
        public static final int COMPARISON_TYPE_LESS_THAN_OR_EQUAL_VALUE = 4;
        public static final int COMPARISON_TYPE_LESS_THAN_VALUE = 3;
        public static final int COMPARISON_TYPE_UNKNOWN_VALUE = 0;
        private static final a0.d<ComparisonType> internalValueMap = null;
        private final int value;

        public static final class ComparisonTypeVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ComparisonTypeVerifier();
            }

            private ComparisonTypeVerifier() {
            }

            public boolean isInRange(int i8) {
                return ComparisonType.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ComparisonType>() {
                public ComparisonType findValueByNumber(int i8) {
                    return ComparisonType.forNumber(i8);
                }
            };
        }

        private ComparisonType(int i8) {
            this.value = i8;
        }

        public static ComparisonType forNumber(int i8) {
            if (i8 == 0) {
                return COMPARISON_TYPE_UNKNOWN;
            }
            if (i8 == 1) {
                return COMPARISON_TYPE_GREATER_THAN;
            }
            if (i8 == 2) {
                return COMPARISON_TYPE_GREATER_THAN_OR_EQUAL;
            }
            if (i8 == 3) {
                return COMPARISON_TYPE_LESS_THAN;
            }
            if (i8 != 4) {
                return null;
            }
            return COMPARISON_TYPE_LESS_THAN_OR_EQUAL;
        }

        public static a0.d<ComparisonType> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ComparisonTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static ComparisonType valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public static final class DataPoint extends y<DataPoint, Builder> implements DataPointOrBuilder {
        public static final int ACCURACY_FIELD_NUMBER = 6;
        public static final int DATA_TYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DataPoint DEFAULT_INSTANCE;
        public static final int END_DURATION_FROM_BOOT_MS_FIELD_NUMBER = 4;
        public static final int META_DATA_FIELD_NUMBER = 5;
        private static volatile z0<DataPoint> PARSER = null;
        public static final int START_DURATION_FROM_BOOT_MS_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 2;
        private DataPointAccuracy accuracy_;
        private int bitField0_;
        private DataType dataType_;
        private long endDurationFromBootMs_;
        private Bundle metaData_;
        private long startDurationFromBootMs_;
        private Value value_;

        public static final class Builder extends y.a<DataPoint, Builder> implements DataPointOrBuilder {
            private Builder() {
                super(DataPoint.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAccuracy() {
                copyOnWrite();
                ((DataPoint) this.instance).clearAccuracy();
                return this;
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((DataPoint) this.instance).clearDataType();
                return this;
            }

            public Builder clearEndDurationFromBootMs() {
                copyOnWrite();
                ((DataPoint) this.instance).clearEndDurationFromBootMs();
                return this;
            }

            public Builder clearMetaData() {
                copyOnWrite();
                ((DataPoint) this.instance).clearMetaData();
                return this;
            }

            public Builder clearStartDurationFromBootMs() {
                copyOnWrite();
                ((DataPoint) this.instance).clearStartDurationFromBootMs();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((DataPoint) this.instance).clearValue();
                return this;
            }

            public DataPointAccuracy getAccuracy() {
                return ((DataPoint) this.instance).getAccuracy();
            }

            public DataType getDataType() {
                return ((DataPoint) this.instance).getDataType();
            }

            public long getEndDurationFromBootMs() {
                return ((DataPoint) this.instance).getEndDurationFromBootMs();
            }

            public Bundle getMetaData() {
                return ((DataPoint) this.instance).getMetaData();
            }

            public long getStartDurationFromBootMs() {
                return ((DataPoint) this.instance).getStartDurationFromBootMs();
            }

            public Value getValue() {
                return ((DataPoint) this.instance).getValue();
            }

            public boolean hasAccuracy() {
                return ((DataPoint) this.instance).hasAccuracy();
            }

            public boolean hasDataType() {
                return ((DataPoint) this.instance).hasDataType();
            }

            public boolean hasEndDurationFromBootMs() {
                return ((DataPoint) this.instance).hasEndDurationFromBootMs();
            }

            public boolean hasMetaData() {
                return ((DataPoint) this.instance).hasMetaData();
            }

            public boolean hasStartDurationFromBootMs() {
                return ((DataPoint) this.instance).hasStartDurationFromBootMs();
            }

            public boolean hasValue() {
                return ((DataPoint) this.instance).hasValue();
            }

            public Builder mergeAccuracy(DataPointAccuracy dataPointAccuracy) {
                copyOnWrite();
                ((DataPoint) this.instance).mergeAccuracy(dataPointAccuracy);
                return this;
            }

            public Builder mergeDataType(DataType dataType) {
                copyOnWrite();
                ((DataPoint) this.instance).mergeDataType(dataType);
                return this;
            }

            public Builder mergeMetaData(Bundle bundle) {
                copyOnWrite();
                ((DataPoint) this.instance).mergeMetaData(bundle);
                return this;
            }

            public Builder mergeValue(Value value) {
                copyOnWrite();
                ((DataPoint) this.instance).mergeValue(value);
                return this;
            }

            public Builder setAccuracy(DataPointAccuracy.Builder builder) {
                copyOnWrite();
                ((DataPoint) this.instance).setAccuracy((DataPointAccuracy) builder.build());
                return this;
            }

            public Builder setAccuracy(DataPointAccuracy dataPointAccuracy) {
                copyOnWrite();
                ((DataPoint) this.instance).setAccuracy(dataPointAccuracy);
                return this;
            }

            public Builder setDataType(DataType.Builder builder) {
                copyOnWrite();
                ((DataPoint) this.instance).setDataType((DataType) builder.build());
                return this;
            }

            public Builder setDataType(DataType dataType) {
                copyOnWrite();
                ((DataPoint) this.instance).setDataType(dataType);
                return this;
            }

            public Builder setEndDurationFromBootMs(long j8) {
                copyOnWrite();
                ((DataPoint) this.instance).setEndDurationFromBootMs(j8);
                return this;
            }

            public Builder setMetaData(Bundle.Builder builder) {
                copyOnWrite();
                ((DataPoint) this.instance).setMetaData((Bundle) builder.build());
                return this;
            }

            public Builder setMetaData(Bundle bundle) {
                copyOnWrite();
                ((DataPoint) this.instance).setMetaData(bundle);
                return this;
            }

            public Builder setStartDurationFromBootMs(long j8) {
                copyOnWrite();
                ((DataPoint) this.instance).setStartDurationFromBootMs(j8);
                return this;
            }

            public Builder setValue(Value.Builder builder) {
                copyOnWrite();
                ((DataPoint) this.instance).setValue((Value) builder.build());
                return this;
            }

            public Builder setValue(Value value) {
                copyOnWrite();
                ((DataPoint) this.instance).setValue(value);
                return this;
            }
        }

        static {
            DataPoint dataPoint = new DataPoint();
            DEFAULT_INSTANCE = dataPoint;
            y.registerDefaultInstance(DataPoint.class, dataPoint);
        }

        private DataPoint() {
        }

        /* access modifiers changed from: private */
        public void clearAccuracy() {
            this.accuracy_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearEndDurationFromBootMs() {
            this.bitField0_ &= -9;
            this.endDurationFromBootMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMetaData() {
            this.metaData_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearStartDurationFromBootMs() {
            this.bitField0_ &= -5;
            this.startDurationFromBootMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = null;
            this.bitField0_ &= -3;
        }

        public static DataPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccuracy(DataPointAccuracy dataPointAccuracy) {
            dataPointAccuracy.getClass();
            DataPointAccuracy dataPointAccuracy2 = this.accuracy_;
            if (!(dataPointAccuracy2 == null || dataPointAccuracy2 == DataPointAccuracy.getDefaultInstance())) {
                dataPointAccuracy = (DataPointAccuracy) ((DataPointAccuracy.Builder) DataPointAccuracy.newBuilder(this.accuracy_).mergeFrom(dataPointAccuracy)).buildPartial();
            }
            this.accuracy_ = dataPointAccuracy;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeDataType(DataType dataType) {
            dataType.getClass();
            DataType dataType2 = this.dataType_;
            if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
            }
            this.dataType_ = dataType;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeMetaData(Bundle bundle) {
            bundle.getClass();
            Bundle bundle2 = this.metaData_;
            if (!(bundle2 == null || bundle2 == Bundle.getDefaultInstance())) {
                bundle = (Bundle) ((Bundle.Builder) Bundle.newBuilder(this.metaData_).mergeFrom(bundle)).buildPartial();
            }
            this.metaData_ = bundle;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeValue(Value value) {
            value.getClass();
            Value value2 = this.value_;
            if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                value = (Value) ((Value.Builder) Value.newBuilder(this.value_).mergeFrom(value)).buildPartial();
            }
            this.value_ = value;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataPoint dataPoint) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dataPoint);
        }

        public static DataPoint parseDelimitedFrom(InputStream inputStream) {
            return (DataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPoint parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DataPoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPoint parseFrom(i iVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static DataPoint parseFrom(i iVar, q qVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static DataPoint parseFrom(j jVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DataPoint parseFrom(j jVar, q qVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DataPoint parseFrom(InputStream inputStream) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPoint parseFrom(InputStream inputStream, q qVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPoint parseFrom(ByteBuffer byteBuffer) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataPoint parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DataPoint parseFrom(byte[] bArr) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataPoint parseFrom(byte[] bArr, q qVar) {
            return (DataPoint) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<DataPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccuracy(DataPointAccuracy dataPointAccuracy) {
            dataPointAccuracy.getClass();
            this.accuracy_ = dataPointAccuracy;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setDataType(DataType dataType) {
            dataType.getClass();
            this.dataType_ = dataType;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setEndDurationFromBootMs(long j8) {
            this.bitField0_ |= 8;
            this.endDurationFromBootMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setMetaData(Bundle bundle) {
            bundle.getClass();
            this.metaData_ = bundle;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setStartDurationFromBootMs(long j8) {
            this.bitField0_ |= 4;
            this.startDurationFromBootMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setValue(Value value) {
            value.getClass();
            this.value_ = value;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "dataType_", "value_", "startDurationFromBootMs_", "endDurationFromBootMs_", "metaData_", "accuracy_"});
                case 3:
                    return new DataPoint();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<DataPoint> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (DataPoint.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataPointAccuracy getAccuracy() {
            DataPointAccuracy dataPointAccuracy = this.accuracy_;
            return dataPointAccuracy == null ? DataPointAccuracy.getDefaultInstance() : dataPointAccuracy;
        }

        public DataType getDataType() {
            DataType dataType = this.dataType_;
            return dataType == null ? DataType.getDefaultInstance() : dataType;
        }

        public long getEndDurationFromBootMs() {
            return this.endDurationFromBootMs_;
        }

        public Bundle getMetaData() {
            Bundle bundle = this.metaData_;
            return bundle == null ? Bundle.getDefaultInstance() : bundle;
        }

        public long getStartDurationFromBootMs() {
            return this.startDurationFromBootMs_;
        }

        public Value getValue() {
            Value value = this.value_;
            return value == null ? Value.getDefaultInstance() : value;
        }

        public boolean hasAccuracy() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasEndDurationFromBootMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMetaData() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasStartDurationFromBootMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class DataPointAccuracy extends y<DataPointAccuracy, Builder> implements DataPointAccuracyOrBuilder {
        /* access modifiers changed from: private */
        public static final DataPointAccuracy DEFAULT_INSTANCE;
        public static final int HR_ACCURACY_FIELD_NUMBER = 1;
        public static final int LOCATION_ACCURACY_FIELD_NUMBER = 2;
        private static volatile z0<DataPointAccuracy> PARSER;
        private int accuracyCase_ = 0;
        private Object accuracy_;
        private int bitField0_;

        public enum AccuracyCase {
            HR_ACCURACY(1),
            LOCATION_ACCURACY(2),
            ACCURACY_NOT_SET(0);
            
            private final int value;

            private AccuracyCase(int i8) {
                this.value = i8;
            }

            public static AccuracyCase forNumber(int i8) {
                if (i8 == 0) {
                    return ACCURACY_NOT_SET;
                }
                if (i8 == 1) {
                    return HR_ACCURACY;
                }
                if (i8 != 2) {
                    return null;
                }
                return LOCATION_ACCURACY;
            }

            @Deprecated
            public static AccuracyCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class Builder extends y.a<DataPointAccuracy, Builder> implements DataPointAccuracyOrBuilder {
            private Builder() {
                super(DataPointAccuracy.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAccuracy() {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).clearAccuracy();
                return this;
            }

            public Builder clearHrAccuracy() {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).clearHrAccuracy();
                return this;
            }

            public Builder clearLocationAccuracy() {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).clearLocationAccuracy();
                return this;
            }

            public AccuracyCase getAccuracyCase() {
                return ((DataPointAccuracy) this.instance).getAccuracyCase();
            }

            public HrAccuracy getHrAccuracy() {
                return ((DataPointAccuracy) this.instance).getHrAccuracy();
            }

            public LocationAccuracy getLocationAccuracy() {
                return ((DataPointAccuracy) this.instance).getLocationAccuracy();
            }

            public boolean hasHrAccuracy() {
                return ((DataPointAccuracy) this.instance).hasHrAccuracy();
            }

            public boolean hasLocationAccuracy() {
                return ((DataPointAccuracy) this.instance).hasLocationAccuracy();
            }

            public Builder mergeHrAccuracy(HrAccuracy hrAccuracy) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).mergeHrAccuracy(hrAccuracy);
                return this;
            }

            public Builder mergeLocationAccuracy(LocationAccuracy locationAccuracy) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).mergeLocationAccuracy(locationAccuracy);
                return this;
            }

            public Builder setHrAccuracy(HrAccuracy.Builder builder) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).setHrAccuracy((HrAccuracy) builder.build());
                return this;
            }

            public Builder setHrAccuracy(HrAccuracy hrAccuracy) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).setHrAccuracy(hrAccuracy);
                return this;
            }

            public Builder setLocationAccuracy(LocationAccuracy.Builder builder) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).setLocationAccuracy((LocationAccuracy) builder.build());
                return this;
            }

            public Builder setLocationAccuracy(LocationAccuracy locationAccuracy) {
                copyOnWrite();
                ((DataPointAccuracy) this.instance).setLocationAccuracy(locationAccuracy);
                return this;
            }
        }

        public static final class HrAccuracy extends y<HrAccuracy, Builder> implements HrAccuracyOrBuilder {
            /* access modifiers changed from: private */
            public static final HrAccuracy DEFAULT_INSTANCE;
            private static volatile z0<HrAccuracy> PARSER = null;
            public static final int SENSOR_STATUS_FIELD_NUMBER = 1;
            private int bitField0_;
            private int sensorStatus_;

            public static final class Builder extends y.a<HrAccuracy, Builder> implements HrAccuracyOrBuilder {
                private Builder() {
                    super(HrAccuracy.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearSensorStatus() {
                    copyOnWrite();
                    ((HrAccuracy) this.instance).clearSensorStatus();
                    return this;
                }

                public SensorStatus getSensorStatus() {
                    return ((HrAccuracy) this.instance).getSensorStatus();
                }

                public boolean hasSensorStatus() {
                    return ((HrAccuracy) this.instance).hasSensorStatus();
                }

                public Builder setSensorStatus(SensorStatus sensorStatus) {
                    copyOnWrite();
                    ((HrAccuracy) this.instance).setSensorStatus(sensorStatus);
                    return this;
                }
            }

            public enum SensorStatus implements a0.c {
                HR_ACCURACY_SENSOR_STATUS_UNKNOWN(0),
                HR_ACCURACY_SENSOR_STATUS_NO_CONTACT(1),
                HR_ACCURACY_SENSOR_STATUS_UNRELIABLE(2),
                HR_ACCURACY_SENSOR_STATUS_ACCURACY_LOW(3),
                HR_ACCURACY_SENSOR_STATUS_ACCURACY_MEDIUM(4),
                HR_ACCURACY_SENSOR_STATUS_ACCURACY_HIGH(5);
                
                public static final int HR_ACCURACY_SENSOR_STATUS_ACCURACY_HIGH_VALUE = 5;
                public static final int HR_ACCURACY_SENSOR_STATUS_ACCURACY_LOW_VALUE = 3;
                public static final int HR_ACCURACY_SENSOR_STATUS_ACCURACY_MEDIUM_VALUE = 4;
                public static final int HR_ACCURACY_SENSOR_STATUS_NO_CONTACT_VALUE = 1;
                public static final int HR_ACCURACY_SENSOR_STATUS_UNKNOWN_VALUE = 0;
                public static final int HR_ACCURACY_SENSOR_STATUS_UNRELIABLE_VALUE = 2;
                private static final a0.d<SensorStatus> internalValueMap = null;
                private final int value;

                public static final class SensorStatusVerifier implements a0.e {
                    static final a0.e INSTANCE = null;

                    static {
                        INSTANCE = new SensorStatusVerifier();
                    }

                    private SensorStatusVerifier() {
                    }

                    public boolean isInRange(int i8) {
                        return SensorStatus.forNumber(i8) != null;
                    }
                }

                /* access modifiers changed from: public */
                static {
                    internalValueMap = new a0.d<SensorStatus>() {
                        public SensorStatus findValueByNumber(int i8) {
                            return SensorStatus.forNumber(i8);
                        }
                    };
                }

                private SensorStatus(int i8) {
                    this.value = i8;
                }

                public static SensorStatus forNumber(int i8) {
                    if (i8 == 0) {
                        return HR_ACCURACY_SENSOR_STATUS_UNKNOWN;
                    }
                    if (i8 == 1) {
                        return HR_ACCURACY_SENSOR_STATUS_NO_CONTACT;
                    }
                    if (i8 == 2) {
                        return HR_ACCURACY_SENSOR_STATUS_UNRELIABLE;
                    }
                    if (i8 == 3) {
                        return HR_ACCURACY_SENSOR_STATUS_ACCURACY_LOW;
                    }
                    if (i8 == 4) {
                        return HR_ACCURACY_SENSOR_STATUS_ACCURACY_MEDIUM;
                    }
                    if (i8 != 5) {
                        return null;
                    }
                    return HR_ACCURACY_SENSOR_STATUS_ACCURACY_HIGH;
                }

                public static a0.d<SensorStatus> internalGetValueMap() {
                    return internalValueMap;
                }

                public static a0.e internalGetVerifier() {
                    return SensorStatusVerifier.INSTANCE;
                }

                @Deprecated
                public static SensorStatus valueOf(int i8) {
                    return forNumber(i8);
                }

                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                HrAccuracy hrAccuracy = new HrAccuracy();
                DEFAULT_INSTANCE = hrAccuracy;
                y.registerDefaultInstance(HrAccuracy.class, hrAccuracy);
            }

            private HrAccuracy() {
            }

            /* access modifiers changed from: private */
            public void clearSensorStatus() {
                this.bitField0_ &= -2;
                this.sensorStatus_ = 0;
            }

            public static HrAccuracy getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(HrAccuracy hrAccuracy) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(hrAccuracy);
            }

            public static HrAccuracy parseDelimitedFrom(InputStream inputStream) {
                return (HrAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HrAccuracy parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (HrAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static HrAccuracy parseFrom(i iVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static HrAccuracy parseFrom(i iVar, q qVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static HrAccuracy parseFrom(j jVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static HrAccuracy parseFrom(j jVar, q qVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static HrAccuracy parseFrom(InputStream inputStream) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static HrAccuracy parseFrom(InputStream inputStream, q qVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static HrAccuracy parseFrom(ByteBuffer byteBuffer) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static HrAccuracy parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static HrAccuracy parseFrom(byte[] bArr) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static HrAccuracy parseFrom(byte[] bArr, q qVar) {
                return (HrAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<HrAccuracy> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setSensorStatus(SensorStatus sensorStatus) {
                this.sensorStatus_ = sensorStatus.getNumber();
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "sensorStatus_", SensorStatus.internalGetVerifier()});
                    case 3:
                        return new HrAccuracy();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<HrAccuracy> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (HrAccuracy.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public SensorStatus getSensorStatus() {
                SensorStatus forNumber = SensorStatus.forNumber(this.sensorStatus_);
                return forNumber == null ? SensorStatus.HR_ACCURACY_SENSOR_STATUS_UNKNOWN : forNumber;
            }

            public boolean hasSensorStatus() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface HrAccuracyOrBuilder extends s0 {
            /* synthetic */ r0 getDefaultInstanceForType();

            HrAccuracy.SensorStatus getSensorStatus();

            boolean hasSensorStatus();

            /* synthetic */ boolean isInitialized();
        }

        public static final class LocationAccuracy extends y<LocationAccuracy, Builder> implements LocationAccuracyOrBuilder {
            /* access modifiers changed from: private */
            public static final LocationAccuracy DEFAULT_INSTANCE;
            public static final int HORIZONTAL_POSITION_ERROR_FIELD_NUMBER = 1;
            private static volatile z0<LocationAccuracy> PARSER = null;
            public static final int VERTICAL_POSITION_ERROR_FIELD_NUMBER = 2;
            private int bitField0_;
            private double horizontalPositionError_;
            private double verticalPositionError_;

            public static final class Builder extends y.a<LocationAccuracy, Builder> implements LocationAccuracyOrBuilder {
                private Builder() {
                    super(LocationAccuracy.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearHorizontalPositionError() {
                    copyOnWrite();
                    ((LocationAccuracy) this.instance).clearHorizontalPositionError();
                    return this;
                }

                public Builder clearVerticalPositionError() {
                    copyOnWrite();
                    ((LocationAccuracy) this.instance).clearVerticalPositionError();
                    return this;
                }

                public double getHorizontalPositionError() {
                    return ((LocationAccuracy) this.instance).getHorizontalPositionError();
                }

                public double getVerticalPositionError() {
                    return ((LocationAccuracy) this.instance).getVerticalPositionError();
                }

                public boolean hasHorizontalPositionError() {
                    return ((LocationAccuracy) this.instance).hasHorizontalPositionError();
                }

                public boolean hasVerticalPositionError() {
                    return ((LocationAccuracy) this.instance).hasVerticalPositionError();
                }

                public Builder setHorizontalPositionError(double d9) {
                    copyOnWrite();
                    ((LocationAccuracy) this.instance).setHorizontalPositionError(d9);
                    return this;
                }

                public Builder setVerticalPositionError(double d9) {
                    copyOnWrite();
                    ((LocationAccuracy) this.instance).setVerticalPositionError(d9);
                    return this;
                }
            }

            static {
                LocationAccuracy locationAccuracy = new LocationAccuracy();
                DEFAULT_INSTANCE = locationAccuracy;
                y.registerDefaultInstance(LocationAccuracy.class, locationAccuracy);
            }

            private LocationAccuracy() {
            }

            /* access modifiers changed from: private */
            public void clearHorizontalPositionError() {
                this.bitField0_ &= -2;
                this.horizontalPositionError_ = 0.0d;
            }

            /* access modifiers changed from: private */
            public void clearVerticalPositionError() {
                this.bitField0_ &= -3;
                this.verticalPositionError_ = 0.0d;
            }

            public static LocationAccuracy getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(LocationAccuracy locationAccuracy) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(locationAccuracy);
            }

            public static LocationAccuracy parseDelimitedFrom(InputStream inputStream) {
                return (LocationAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LocationAccuracy parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (LocationAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LocationAccuracy parseFrom(i iVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static LocationAccuracy parseFrom(i iVar, q qVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static LocationAccuracy parseFrom(j jVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static LocationAccuracy parseFrom(j jVar, q qVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static LocationAccuracy parseFrom(InputStream inputStream) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LocationAccuracy parseFrom(InputStream inputStream, q qVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LocationAccuracy parseFrom(ByteBuffer byteBuffer) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static LocationAccuracy parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static LocationAccuracy parseFrom(byte[] bArr) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LocationAccuracy parseFrom(byte[] bArr, q qVar) {
                return (LocationAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<LocationAccuracy> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setHorizontalPositionError(double d9) {
                this.bitField0_ |= 1;
                this.horizontalPositionError_ = d9;
            }

            /* access modifiers changed from: private */
            public void setVerticalPositionError(double d9) {
                this.bitField0_ |= 2;
                this.verticalPositionError_ = d9;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "horizontalPositionError_", "verticalPositionError_"});
                    case 3:
                        return new LocationAccuracy();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<LocationAccuracy> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (LocationAccuracy.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public double getHorizontalPositionError() {
                return this.horizontalPositionError_;
            }

            public double getVerticalPositionError() {
                return this.verticalPositionError_;
            }

            public boolean hasHorizontalPositionError() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasVerticalPositionError() {
                return (this.bitField0_ & 2) != 0;
            }
        }

        public interface LocationAccuracyOrBuilder extends s0 {
            /* synthetic */ r0 getDefaultInstanceForType();

            double getHorizontalPositionError();

            double getVerticalPositionError();

            boolean hasHorizontalPositionError();

            boolean hasVerticalPositionError();

            /* synthetic */ boolean isInitialized();
        }

        static {
            DataPointAccuracy dataPointAccuracy = new DataPointAccuracy();
            DEFAULT_INSTANCE = dataPointAccuracy;
            y.registerDefaultInstance(DataPointAccuracy.class, dataPointAccuracy);
        }

        private DataPointAccuracy() {
        }

        /* access modifiers changed from: private */
        public void clearAccuracy() {
            this.accuracyCase_ = 0;
            this.accuracy_ = null;
        }

        /* access modifiers changed from: private */
        public void clearHrAccuracy() {
            if (this.accuracyCase_ == 1) {
                this.accuracyCase_ = 0;
                this.accuracy_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLocationAccuracy() {
            if (this.accuracyCase_ == 2) {
                this.accuracyCase_ = 0;
                this.accuracy_ = null;
            }
        }

        public static DataPointAccuracy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeHrAccuracy(HrAccuracy hrAccuracy) {
            hrAccuracy.getClass();
            a aVar = hrAccuracy;
            if (this.accuracyCase_ == 1) {
                aVar = hrAccuracy;
                if (this.accuracy_ != HrAccuracy.getDefaultInstance()) {
                    aVar = ((HrAccuracy.Builder) HrAccuracy.newBuilder((HrAccuracy) this.accuracy_).mergeFrom(hrAccuracy)).buildPartial();
                }
            }
            this.accuracy_ = aVar;
            this.accuracyCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeLocationAccuracy(LocationAccuracy locationAccuracy) {
            locationAccuracy.getClass();
            a aVar = locationAccuracy;
            if (this.accuracyCase_ == 2) {
                aVar = locationAccuracy;
                if (this.accuracy_ != LocationAccuracy.getDefaultInstance()) {
                    aVar = ((LocationAccuracy.Builder) LocationAccuracy.newBuilder((LocationAccuracy) this.accuracy_).mergeFrom(locationAccuracy)).buildPartial();
                }
            }
            this.accuracy_ = aVar;
            this.accuracyCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataPointAccuracy dataPointAccuracy) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dataPointAccuracy);
        }

        public static DataPointAccuracy parseDelimitedFrom(InputStream inputStream) {
            return (DataPointAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPointAccuracy parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DataPointAccuracy) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPointAccuracy parseFrom(i iVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static DataPointAccuracy parseFrom(i iVar, q qVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static DataPointAccuracy parseFrom(j jVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DataPointAccuracy parseFrom(j jVar, q qVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DataPointAccuracy parseFrom(InputStream inputStream) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPointAccuracy parseFrom(InputStream inputStream, q qVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPointAccuracy parseFrom(ByteBuffer byteBuffer) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataPointAccuracy parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DataPointAccuracy parseFrom(byte[] bArr) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataPointAccuracy parseFrom(byte[] bArr, q qVar) {
            return (DataPointAccuracy) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<DataPointAccuracy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHrAccuracy(HrAccuracy hrAccuracy) {
            hrAccuracy.getClass();
            this.accuracy_ = hrAccuracy;
            this.accuracyCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setLocationAccuracy(LocationAccuracy locationAccuracy) {
            locationAccuracy.getClass();
            this.accuracy_ = locationAccuracy;
            this.accuracyCase_ = 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"accuracy_", "accuracyCase_", "bitField0_", HrAccuracy.class, LocationAccuracy.class});
                case 3:
                    return new DataPointAccuracy();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<DataPointAccuracy> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (DataPointAccuracy.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AccuracyCase getAccuracyCase() {
            return AccuracyCase.forNumber(this.accuracyCase_);
        }

        public HrAccuracy getHrAccuracy() {
            return this.accuracyCase_ == 1 ? (HrAccuracy) this.accuracy_ : HrAccuracy.getDefaultInstance();
        }

        public LocationAccuracy getLocationAccuracy() {
            return this.accuracyCase_ == 2 ? (LocationAccuracy) this.accuracy_ : LocationAccuracy.getDefaultInstance();
        }

        public boolean hasHrAccuracy() {
            return this.accuracyCase_ == 1;
        }

        public boolean hasLocationAccuracy() {
            return this.accuracyCase_ == 2;
        }
    }

    public interface DataPointAccuracyOrBuilder extends s0 {
        DataPointAccuracy.AccuracyCase getAccuracyCase();

        /* synthetic */ r0 getDefaultInstanceForType();

        DataPointAccuracy.HrAccuracy getHrAccuracy();

        DataPointAccuracy.LocationAccuracy getLocationAccuracy();

        boolean hasHrAccuracy();

        boolean hasLocationAccuracy();

        /* synthetic */ boolean isInitialized();
    }

    public interface DataPointOrBuilder extends s0 {
        DataPointAccuracy getAccuracy();

        DataType getDataType();

        /* synthetic */ r0 getDefaultInstanceForType();

        long getEndDurationFromBootMs();

        Bundle getMetaData();

        long getStartDurationFromBootMs();

        Value getValue();

        boolean hasAccuracy();

        boolean hasDataType();

        boolean hasEndDurationFromBootMs();

        boolean hasMetaData();

        boolean hasStartDurationFromBootMs();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DataType extends y<DataType, Builder> implements DataTypeOrBuilder {
        /* access modifiers changed from: private */
        public static final DataType DEFAULT_INSTANCE;
        public static final int FORMAT_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile z0<DataType> PARSER = null;
        public static final int TIME_TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int format_;
        private String name_ = "";
        private int timeType_;

        public static final class Builder extends y.a<DataType, Builder> implements DataTypeOrBuilder {
            private Builder() {
                super(DataType.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearFormat() {
                copyOnWrite();
                ((DataType) this.instance).clearFormat();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((DataType) this.instance).clearName();
                return this;
            }

            public Builder clearTimeType() {
                copyOnWrite();
                ((DataType) this.instance).clearTimeType();
                return this;
            }

            public int getFormat() {
                return ((DataType) this.instance).getFormat();
            }

            public String getName() {
                return ((DataType) this.instance).getName();
            }

            public i getNameBytes() {
                return ((DataType) this.instance).getNameBytes();
            }

            public TimeType getTimeType() {
                return ((DataType) this.instance).getTimeType();
            }

            public boolean hasFormat() {
                return ((DataType) this.instance).hasFormat();
            }

            public boolean hasName() {
                return ((DataType) this.instance).hasName();
            }

            public boolean hasTimeType() {
                return ((DataType) this.instance).hasTimeType();
            }

            public Builder setFormat(int i8) {
                copyOnWrite();
                ((DataType) this.instance).setFormat(i8);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((DataType) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(i iVar) {
                copyOnWrite();
                ((DataType) this.instance).setNameBytes(iVar);
                return this;
            }

            public Builder setTimeType(TimeType timeType) {
                copyOnWrite();
                ((DataType) this.instance).setTimeType(timeType);
                return this;
            }
        }

        public enum TimeType implements a0.c {
            TIME_TYPE_UNKNOWN(0),
            TIME_TYPE_INTERVAL(1),
            TIME_TYPE_SAMPLE(2);
            
            public static final int TIME_TYPE_INTERVAL_VALUE = 1;
            public static final int TIME_TYPE_SAMPLE_VALUE = 2;
            public static final int TIME_TYPE_UNKNOWN_VALUE = 0;
            private static final a0.d<TimeType> internalValueMap = null;
            private final int value;

            public static final class TimeTypeVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new TimeTypeVerifier();
                }

                private TimeTypeVerifier() {
                }

                public boolean isInRange(int i8) {
                    return TimeType.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<TimeType>() {
                    public TimeType findValueByNumber(int i8) {
                        return TimeType.forNumber(i8);
                    }
                };
            }

            private TimeType(int i8) {
                this.value = i8;
            }

            public static TimeType forNumber(int i8) {
                if (i8 == 0) {
                    return TIME_TYPE_UNKNOWN;
                }
                if (i8 == 1) {
                    return TIME_TYPE_INTERVAL;
                }
                if (i8 != 2) {
                    return null;
                }
                return TIME_TYPE_SAMPLE;
            }

            public static a0.d<TimeType> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return TimeTypeVerifier.INSTANCE;
            }

            @Deprecated
            public static TimeType valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        static {
            DataType dataType = new DataType();
            DEFAULT_INSTANCE = dataType;
            y.registerDefaultInstance(DataType.class, dataType);
        }

        private DataType() {
        }

        /* access modifiers changed from: private */
        public void clearFormat() {
            this.bitField0_ &= -5;
            this.format_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearTimeType() {
            this.bitField0_ &= -3;
            this.timeType_ = 0;
        }

        public static DataType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataType dataType) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dataType);
        }

        public static DataType parseDelimitedFrom(InputStream inputStream) {
            return (DataType) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataType parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DataType) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataType parseFrom(i iVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static DataType parseFrom(i iVar, q qVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static DataType parseFrom(j jVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DataType parseFrom(j jVar, q qVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DataType parseFrom(InputStream inputStream) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataType parseFrom(InputStream inputStream, q qVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataType parseFrom(ByteBuffer byteBuffer) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataType parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DataType parseFrom(byte[] bArr) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataType parseFrom(byte[] bArr, q qVar) {
            return (DataType) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<DataType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFormat(int i8) {
            this.bitField0_ |= 4;
            this.format_ = i8;
        }

        /* access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* access modifiers changed from: private */
        public void setNameBytes(i iVar) {
            this.name_ = iVar.u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTimeType(TimeType timeType) {
            this.timeType_ = timeType.getNumber();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"bitField0_", "name_", "timeType_", TimeType.internalGetVerifier(), "format_"});
                case 3:
                    return new DataType();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<DataType> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (DataType.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getFormat() {
            return this.format_;
        }

        public String getName() {
            return this.name_;
        }

        public i getNameBytes() {
            return i.l(this.name_);
        }

        public TimeType getTimeType() {
            TimeType forNumber = TimeType.forNumber(this.timeType_);
            return forNumber == null ? TimeType.TIME_TYPE_UNKNOWN : forNumber;
        }

        public boolean hasFormat() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTimeType() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public static final class DataTypeCondition extends y<DataTypeCondition, Builder> implements DataTypeConditionOrBuilder {
        public static final int COMPARISON_TYPE_FIELD_NUMBER = 3;
        public static final int DATA_TYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DataTypeCondition DEFAULT_INSTANCE;
        private static volatile z0<DataTypeCondition> PARSER = null;
        public static final int THRESHOLD_FIELD_NUMBER = 2;
        private int bitField0_;
        private int comparisonType_;
        private DataType dataType_;
        private Value threshold_;

        public static final class Builder extends y.a<DataTypeCondition, Builder> implements DataTypeConditionOrBuilder {
            private Builder() {
                super(DataTypeCondition.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearComparisonType() {
                copyOnWrite();
                ((DataTypeCondition) this.instance).clearComparisonType();
                return this;
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((DataTypeCondition) this.instance).clearDataType();
                return this;
            }

            public Builder clearThreshold() {
                copyOnWrite();
                ((DataTypeCondition) this.instance).clearThreshold();
                return this;
            }

            public ComparisonType getComparisonType() {
                return ((DataTypeCondition) this.instance).getComparisonType();
            }

            public DataType getDataType() {
                return ((DataTypeCondition) this.instance).getDataType();
            }

            public Value getThreshold() {
                return ((DataTypeCondition) this.instance).getThreshold();
            }

            public boolean hasComparisonType() {
                return ((DataTypeCondition) this.instance).hasComparisonType();
            }

            public boolean hasDataType() {
                return ((DataTypeCondition) this.instance).hasDataType();
            }

            public boolean hasThreshold() {
                return ((DataTypeCondition) this.instance).hasThreshold();
            }

            public Builder mergeDataType(DataType dataType) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).mergeDataType(dataType);
                return this;
            }

            public Builder mergeThreshold(Value value) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).mergeThreshold(value);
                return this;
            }

            public Builder setComparisonType(ComparisonType comparisonType) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).setComparisonType(comparisonType);
                return this;
            }

            public Builder setDataType(DataType.Builder builder) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).setDataType((DataType) builder.build());
                return this;
            }

            public Builder setDataType(DataType dataType) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).setDataType(dataType);
                return this;
            }

            public Builder setThreshold(Value.Builder builder) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).setThreshold((Value) builder.build());
                return this;
            }

            public Builder setThreshold(Value value) {
                copyOnWrite();
                ((DataTypeCondition) this.instance).setThreshold(value);
                return this;
            }
        }

        static {
            DataTypeCondition dataTypeCondition = new DataTypeCondition();
            DEFAULT_INSTANCE = dataTypeCondition;
            y.registerDefaultInstance(DataTypeCondition.class, dataTypeCondition);
        }

        private DataTypeCondition() {
        }

        /* access modifiers changed from: private */
        public void clearComparisonType() {
            this.bitField0_ &= -5;
            this.comparisonType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearThreshold() {
            this.threshold_ = null;
            this.bitField0_ &= -3;
        }

        public static DataTypeCondition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDataType(DataType dataType) {
            dataType.getClass();
            DataType dataType2 = this.dataType_;
            if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
            }
            this.dataType_ = dataType;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeThreshold(Value value) {
            value.getClass();
            Value value2 = this.threshold_;
            if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                value = (Value) ((Value.Builder) Value.newBuilder(this.threshold_).mergeFrom(value)).buildPartial();
            }
            this.threshold_ = value;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataTypeCondition dataTypeCondition) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dataTypeCondition);
        }

        public static DataTypeCondition parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeCondition) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataTypeCondition parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DataTypeCondition) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataTypeCondition parseFrom(i iVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static DataTypeCondition parseFrom(i iVar, q qVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static DataTypeCondition parseFrom(j jVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DataTypeCondition parseFrom(j jVar, q qVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DataTypeCondition parseFrom(InputStream inputStream) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataTypeCondition parseFrom(InputStream inputStream, q qVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataTypeCondition parseFrom(ByteBuffer byteBuffer) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataTypeCondition parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DataTypeCondition parseFrom(byte[] bArr) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataTypeCondition parseFrom(byte[] bArr, q qVar) {
            return (DataTypeCondition) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<DataTypeCondition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setComparisonType(ComparisonType comparisonType) {
            this.comparisonType_ = comparisonType.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setDataType(DataType dataType) {
            dataType.getClass();
            this.dataType_ = dataType;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setThreshold(Value value) {
            value.getClass();
            this.threshold_ = value;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "dataType_", "threshold_", "comparisonType_", ComparisonType.internalGetVerifier()});
                case 3:
                    return new DataTypeCondition();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<DataTypeCondition> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (DataTypeCondition.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ComparisonType getComparisonType() {
            ComparisonType forNumber = ComparisonType.forNumber(this.comparisonType_);
            return forNumber == null ? ComparisonType.COMPARISON_TYPE_UNKNOWN : forNumber;
        }

        public DataType getDataType() {
            DataType dataType = this.dataType_;
            return dataType == null ? DataType.getDefaultInstance() : dataType;
        }

        public Value getThreshold() {
            Value value = this.threshold_;
            return value == null ? Value.getDefaultInstance() : value;
        }

        public boolean hasComparisonType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasThreshold() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface DataTypeConditionOrBuilder extends s0 {
        ComparisonType getComparisonType();

        DataType getDataType();

        /* synthetic */ r0 getDefaultInstanceForType();

        Value getThreshold();

        boolean hasComparisonType();

        boolean hasDataType();

        boolean hasThreshold();

        /* synthetic */ boolean isInitialized();
    }

    public interface DataTypeOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        int getFormat();

        String getName();

        i getNameBytes();

        DataType.TimeType getTimeType();

        boolean hasFormat();

        boolean hasName();

        boolean hasTimeType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseCapabilities extends y<ExerciseCapabilities, Builder> implements ExerciseCapabilitiesOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseCapabilities DEFAULT_INSTANCE;
        private static volatile z0<ExerciseCapabilities> PARSER = null;
        public static final int TYPE_TO_CAPABILITIES_FIELD_NUMBER = 1;
        private a0.j<TypeToCapabilitiesEntry> typeToCapabilities_ = y.emptyProtobufList();

        public static final class Builder extends y.a<ExerciseCapabilities, Builder> implements ExerciseCapabilitiesOrBuilder {
            private Builder() {
                super(ExerciseCapabilities.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllTypeToCapabilities(Iterable<? extends TypeToCapabilitiesEntry> iterable) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).addAllTypeToCapabilities(iterable);
                return this;
            }

            public Builder addTypeToCapabilities(int i8, TypeToCapabilitiesEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).addTypeToCapabilities(i8, (TypeToCapabilitiesEntry) builder.build());
                return this;
            }

            public Builder addTypeToCapabilities(int i8, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).addTypeToCapabilities(i8, typeToCapabilitiesEntry);
                return this;
            }

            public Builder addTypeToCapabilities(TypeToCapabilitiesEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).addTypeToCapabilities((TypeToCapabilitiesEntry) builder.build());
                return this;
            }

            public Builder addTypeToCapabilities(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).addTypeToCapabilities(typeToCapabilitiesEntry);
                return this;
            }

            public Builder clearTypeToCapabilities() {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).clearTypeToCapabilities();
                return this;
            }

            public TypeToCapabilitiesEntry getTypeToCapabilities(int i8) {
                return ((ExerciseCapabilities) this.instance).getTypeToCapabilities(i8);
            }

            public int getTypeToCapabilitiesCount() {
                return ((ExerciseCapabilities) this.instance).getTypeToCapabilitiesCount();
            }

            public List<TypeToCapabilitiesEntry> getTypeToCapabilitiesList() {
                return Collections.unmodifiableList(((ExerciseCapabilities) this.instance).getTypeToCapabilitiesList());
            }

            public Builder removeTypeToCapabilities(int i8) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).removeTypeToCapabilities(i8);
                return this;
            }

            public Builder setTypeToCapabilities(int i8, TypeToCapabilitiesEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).setTypeToCapabilities(i8, (TypeToCapabilitiesEntry) builder.build());
                return this;
            }

            public Builder setTypeToCapabilities(int i8, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
                copyOnWrite();
                ((ExerciseCapabilities) this.instance).setTypeToCapabilities(i8, typeToCapabilitiesEntry);
                return this;
            }
        }

        public static final class TypeToCapabilitiesEntry extends y<TypeToCapabilitiesEntry, Builder> implements TypeToCapabilitiesEntryOrBuilder {
            public static final int CAPABILITIES_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final TypeToCapabilitiesEntry DEFAULT_INSTANCE;
            private static volatile z0<TypeToCapabilitiesEntry> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int bitField0_;
            private ExerciseTypeCapabilities capabilities_;
            private int type_;

            public static final class Builder extends y.a<TypeToCapabilitiesEntry, Builder> implements TypeToCapabilitiesEntryOrBuilder {
                private Builder() {
                    super(TypeToCapabilitiesEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearCapabilities() {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).clearCapabilities();
                    return this;
                }

                public Builder clearType() {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).clearType();
                    return this;
                }

                public ExerciseTypeCapabilities getCapabilities() {
                    return ((TypeToCapabilitiesEntry) this.instance).getCapabilities();
                }

                public ExerciseType getType() {
                    return ((TypeToCapabilitiesEntry) this.instance).getType();
                }

                public boolean hasCapabilities() {
                    return ((TypeToCapabilitiesEntry) this.instance).hasCapabilities();
                }

                public boolean hasType() {
                    return ((TypeToCapabilitiesEntry) this.instance).hasType();
                }

                public Builder mergeCapabilities(ExerciseTypeCapabilities exerciseTypeCapabilities) {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).mergeCapabilities(exerciseTypeCapabilities);
                    return this;
                }

                public Builder setCapabilities(ExerciseTypeCapabilities.Builder builder) {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).setCapabilities((ExerciseTypeCapabilities) builder.build());
                    return this;
                }

                public Builder setCapabilities(ExerciseTypeCapabilities exerciseTypeCapabilities) {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).setCapabilities(exerciseTypeCapabilities);
                    return this;
                }

                public Builder setType(ExerciseType exerciseType) {
                    copyOnWrite();
                    ((TypeToCapabilitiesEntry) this.instance).setType(exerciseType);
                    return this;
                }
            }

            static {
                TypeToCapabilitiesEntry typeToCapabilitiesEntry = new TypeToCapabilitiesEntry();
                DEFAULT_INSTANCE = typeToCapabilitiesEntry;
                y.registerDefaultInstance(TypeToCapabilitiesEntry.class, typeToCapabilitiesEntry);
            }

            private TypeToCapabilitiesEntry() {
            }

            /* access modifiers changed from: private */
            public void clearCapabilities() {
                this.capabilities_ = null;
                this.bitField0_ &= -3;
            }

            /* access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
            }

            public static TypeToCapabilitiesEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeCapabilities(ExerciseTypeCapabilities exerciseTypeCapabilities) {
                exerciseTypeCapabilities.getClass();
                ExerciseTypeCapabilities exerciseTypeCapabilities2 = this.capabilities_;
                if (!(exerciseTypeCapabilities2 == null || exerciseTypeCapabilities2 == ExerciseTypeCapabilities.getDefaultInstance())) {
                    exerciseTypeCapabilities = (ExerciseTypeCapabilities) ((ExerciseTypeCapabilities.Builder) ExerciseTypeCapabilities.newBuilder(this.capabilities_).mergeFrom(exerciseTypeCapabilities)).buildPartial();
                }
                this.capabilities_ = exerciseTypeCapabilities;
                this.bitField0_ |= 2;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(typeToCapabilitiesEntry);
            }

            public static TypeToCapabilitiesEntry parseDelimitedFrom(InputStream inputStream) {
                return (TypeToCapabilitiesEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TypeToCapabilitiesEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(i iVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(i iVar, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(j jVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(j jVar, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(InputStream inputStream) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TypeToCapabilitiesEntry parseFrom(InputStream inputStream, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(ByteBuffer byteBuffer) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static TypeToCapabilitiesEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static TypeToCapabilitiesEntry parseFrom(byte[] bArr) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TypeToCapabilitiesEntry parseFrom(byte[] bArr, q qVar) {
                return (TypeToCapabilitiesEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<TypeToCapabilitiesEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setCapabilities(ExerciseTypeCapabilities exerciseTypeCapabilities) {
                exerciseTypeCapabilities.getClass();
                this.capabilities_ = exerciseTypeCapabilities;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setType(ExerciseType exerciseType) {
                this.type_ = exerciseType.getNumber();
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "type_", ExerciseType.internalGetVerifier(), "capabilities_"});
                    case 3:
                        return new TypeToCapabilitiesEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<TypeToCapabilitiesEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (TypeToCapabilitiesEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public ExerciseTypeCapabilities getCapabilities() {
                ExerciseTypeCapabilities exerciseTypeCapabilities = this.capabilities_;
                return exerciseTypeCapabilities == null ? ExerciseTypeCapabilities.getDefaultInstance() : exerciseTypeCapabilities;
            }

            public ExerciseType getType() {
                ExerciseType forNumber = ExerciseType.forNumber(this.type_);
                return forNumber == null ? ExerciseType.EXERCISE_TYPE_UNKNOWN : forNumber;
            }

            public boolean hasCapabilities() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface TypeToCapabilitiesEntryOrBuilder extends s0 {
            ExerciseTypeCapabilities getCapabilities();

            /* synthetic */ r0 getDefaultInstanceForType();

            ExerciseType getType();

            boolean hasCapabilities();

            boolean hasType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            ExerciseCapabilities exerciseCapabilities = new ExerciseCapabilities();
            DEFAULT_INSTANCE = exerciseCapabilities;
            y.registerDefaultInstance(ExerciseCapabilities.class, exerciseCapabilities);
        }

        private ExerciseCapabilities() {
        }

        /* access modifiers changed from: private */
        public void addAllTypeToCapabilities(Iterable<? extends TypeToCapabilitiesEntry> iterable) {
            ensureTypeToCapabilitiesIsMutable();
            a.addAll(iterable, this.typeToCapabilities_);
        }

        /* access modifiers changed from: private */
        public void addTypeToCapabilities(int i8, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            typeToCapabilitiesEntry.getClass();
            ensureTypeToCapabilitiesIsMutable();
            this.typeToCapabilities_.add(i8, typeToCapabilitiesEntry);
        }

        /* access modifiers changed from: private */
        public void addTypeToCapabilities(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            typeToCapabilitiesEntry.getClass();
            ensureTypeToCapabilitiesIsMutable();
            this.typeToCapabilities_.add(typeToCapabilitiesEntry);
        }

        /* access modifiers changed from: private */
        public void clearTypeToCapabilities() {
            this.typeToCapabilities_ = y.emptyProtobufList();
        }

        private void ensureTypeToCapabilitiesIsMutable() {
            a0.j<TypeToCapabilitiesEntry> jVar = this.typeToCapabilities_;
            if (!jVar.f()) {
                this.typeToCapabilities_ = y.mutableCopy(jVar);
            }
        }

        public static ExerciseCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseCapabilities exerciseCapabilities) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseCapabilities);
        }

        public static ExerciseCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseCapabilities parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseCapabilities parseFrom(i iVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseCapabilities parseFrom(i iVar, q qVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseCapabilities parseFrom(j jVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseCapabilities parseFrom(j jVar, q qVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseCapabilities parseFrom(InputStream inputStream) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseCapabilities parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseCapabilities parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseCapabilities parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseCapabilities parseFrom(byte[] bArr) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseCapabilities parseFrom(byte[] bArr, q qVar) {
            return (ExerciseCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseCapabilities> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeTypeToCapabilities(int i8) {
            ensureTypeToCapabilitiesIsMutable();
            this.typeToCapabilities_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setTypeToCapabilities(int i8, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            typeToCapabilitiesEntry.getClass();
            ensureTypeToCapabilitiesIsMutable();
            this.typeToCapabilities_.set(i8, typeToCapabilitiesEntry);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"typeToCapabilities_", TypeToCapabilitiesEntry.class});
                case 3:
                    return new ExerciseCapabilities();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseCapabilities> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseCapabilities.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public TypeToCapabilitiesEntry getTypeToCapabilities(int i8) {
            return this.typeToCapabilities_.get(i8);
        }

        public int getTypeToCapabilitiesCount() {
            return this.typeToCapabilities_.size();
        }

        public List<TypeToCapabilitiesEntry> getTypeToCapabilitiesList() {
            return this.typeToCapabilities_;
        }

        public TypeToCapabilitiesEntryOrBuilder getTypeToCapabilitiesOrBuilder(int i8) {
            return this.typeToCapabilities_.get(i8);
        }

        public List<? extends TypeToCapabilitiesEntryOrBuilder> getTypeToCapabilitiesOrBuilderList() {
            return this.typeToCapabilities_;
        }
    }

    public interface ExerciseCapabilitiesOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseCapabilities.TypeToCapabilitiesEntry getTypeToCapabilities(int i8);

        int getTypeToCapabilitiesCount();

        List<ExerciseCapabilities.TypeToCapabilitiesEntry> getTypeToCapabilitiesList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseConfig extends y<ExerciseConfig, Builder> implements ExerciseConfigOrBuilder {
        public static final int AGGREGATE_DATA_TYPES_FIELD_NUMBER = 3;
        public static final int DATA_TYPES_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final ExerciseConfig DEFAULT_INSTANCE;
        public static final int EXERCISE_GOALS_FIELD_NUMBER = 6;
        public static final int EXERCISE_PARAMS_FIELD_NUMBER = 7;
        public static final int EXERCISE_TYPE_FIELD_NUMBER = 1;
        public static final int IS_AUTO_PAUSE_AND_RESUME_ENABLED_FIELD_NUMBER = 4;
        public static final int IS_GPS_USAGE_ENABLED_FIELD_NUMBER = 5;
        private static volatile z0<ExerciseConfig> PARSER = null;
        public static final int SWIMMING_POOL_LENGTH_FIELD_NUMBER = 8;
        private a0.j<DataType> aggregateDataTypes_ = y.emptyProtobufList();
        private int bitField0_;
        private a0.j<DataType> dataTypes_ = y.emptyProtobufList();
        private a0.j<ExerciseGoal> exerciseGoals_ = y.emptyProtobufList();
        private Bundle exerciseParams_;
        private int exerciseType_;
        private boolean isAutoPauseAndResumeEnabled_;
        private boolean isGpsUsageEnabled_;
        private float swimmingPoolLength_;

        public static final class Builder extends y.a<ExerciseConfig, Builder> implements ExerciseConfigOrBuilder {
            private Builder() {
                super(ExerciseConfig.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAggregateDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAggregateDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addAggregateDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAggregateDataTypes(i8, dataType);
                return this;
            }

            public Builder addAggregateDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAggregateDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addAggregateDataTypes(DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAggregateDataTypes(dataType);
                return this;
            }

            public Builder addAllAggregateDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAllAggregateDataTypes(iterable);
                return this;
            }

            public Builder addAllDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAllDataTypes(iterable);
                return this;
            }

            public Builder addAllExerciseGoals(Iterable<? extends ExerciseGoal> iterable) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addAllExerciseGoals(iterable);
                return this;
            }

            public Builder addDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addDataTypes(i8, dataType);
                return this;
            }

            public Builder addDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addDataTypes(dataType);
                return this;
            }

            public Builder addExerciseGoals(int i8, ExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addExerciseGoals(i8, (ExerciseGoal) builder.build());
                return this;
            }

            public Builder addExerciseGoals(int i8, ExerciseGoal exerciseGoal) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addExerciseGoals(i8, exerciseGoal);
                return this;
            }

            public Builder addExerciseGoals(ExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addExerciseGoals((ExerciseGoal) builder.build());
                return this;
            }

            public Builder addExerciseGoals(ExerciseGoal exerciseGoal) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).addExerciseGoals(exerciseGoal);
                return this;
            }

            public Builder clearAggregateDataTypes() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearAggregateDataTypes();
                return this;
            }

            public Builder clearDataTypes() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearDataTypes();
                return this;
            }

            public Builder clearExerciseGoals() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearExerciseGoals();
                return this;
            }

            public Builder clearExerciseParams() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearExerciseParams();
                return this;
            }

            public Builder clearExerciseType() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearExerciseType();
                return this;
            }

            public Builder clearIsAutoPauseAndResumeEnabled() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearIsAutoPauseAndResumeEnabled();
                return this;
            }

            public Builder clearIsGpsUsageEnabled() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearIsGpsUsageEnabled();
                return this;
            }

            public Builder clearSwimmingPoolLength() {
                copyOnWrite();
                ((ExerciseConfig) this.instance).clearSwimmingPoolLength();
                return this;
            }

            public DataType getAggregateDataTypes(int i8) {
                return ((ExerciseConfig) this.instance).getAggregateDataTypes(i8);
            }

            public int getAggregateDataTypesCount() {
                return ((ExerciseConfig) this.instance).getAggregateDataTypesCount();
            }

            public List<DataType> getAggregateDataTypesList() {
                return Collections.unmodifiableList(((ExerciseConfig) this.instance).getAggregateDataTypesList());
            }

            public DataType getDataTypes(int i8) {
                return ((ExerciseConfig) this.instance).getDataTypes(i8);
            }

            public int getDataTypesCount() {
                return ((ExerciseConfig) this.instance).getDataTypesCount();
            }

            public List<DataType> getDataTypesList() {
                return Collections.unmodifiableList(((ExerciseConfig) this.instance).getDataTypesList());
            }

            public ExerciseGoal getExerciseGoals(int i8) {
                return ((ExerciseConfig) this.instance).getExerciseGoals(i8);
            }

            public int getExerciseGoalsCount() {
                return ((ExerciseConfig) this.instance).getExerciseGoalsCount();
            }

            public List<ExerciseGoal> getExerciseGoalsList() {
                return Collections.unmodifiableList(((ExerciseConfig) this.instance).getExerciseGoalsList());
            }

            public Bundle getExerciseParams() {
                return ((ExerciseConfig) this.instance).getExerciseParams();
            }

            public ExerciseType getExerciseType() {
                return ((ExerciseConfig) this.instance).getExerciseType();
            }

            public boolean getIsAutoPauseAndResumeEnabled() {
                return ((ExerciseConfig) this.instance).getIsAutoPauseAndResumeEnabled();
            }

            public boolean getIsGpsUsageEnabled() {
                return ((ExerciseConfig) this.instance).getIsGpsUsageEnabled();
            }

            public float getSwimmingPoolLength() {
                return ((ExerciseConfig) this.instance).getSwimmingPoolLength();
            }

            public boolean hasExerciseParams() {
                return ((ExerciseConfig) this.instance).hasExerciseParams();
            }

            public boolean hasExerciseType() {
                return ((ExerciseConfig) this.instance).hasExerciseType();
            }

            public boolean hasIsAutoPauseAndResumeEnabled() {
                return ((ExerciseConfig) this.instance).hasIsAutoPauseAndResumeEnabled();
            }

            public boolean hasIsGpsUsageEnabled() {
                return ((ExerciseConfig) this.instance).hasIsGpsUsageEnabled();
            }

            public boolean hasSwimmingPoolLength() {
                return ((ExerciseConfig) this.instance).hasSwimmingPoolLength();
            }

            public Builder mergeExerciseParams(Bundle bundle) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).mergeExerciseParams(bundle);
                return this;
            }

            public Builder removeAggregateDataTypes(int i8) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).removeAggregateDataTypes(i8);
                return this;
            }

            public Builder removeDataTypes(int i8) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).removeDataTypes(i8);
                return this;
            }

            public Builder removeExerciseGoals(int i8) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).removeExerciseGoals(i8);
                return this;
            }

            public Builder setAggregateDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setAggregateDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setAggregateDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setAggregateDataTypes(i8, dataType);
                return this;
            }

            public Builder setDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setDataTypes(i8, dataType);
                return this;
            }

            public Builder setExerciseGoals(int i8, ExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setExerciseGoals(i8, (ExerciseGoal) builder.build());
                return this;
            }

            public Builder setExerciseGoals(int i8, ExerciseGoal exerciseGoal) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setExerciseGoals(i8, exerciseGoal);
                return this;
            }

            public Builder setExerciseParams(Bundle.Builder builder) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setExerciseParams((Bundle) builder.build());
                return this;
            }

            public Builder setExerciseParams(Bundle bundle) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setExerciseParams(bundle);
                return this;
            }

            public Builder setExerciseType(ExerciseType exerciseType) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setExerciseType(exerciseType);
                return this;
            }

            public Builder setIsAutoPauseAndResumeEnabled(boolean z8) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setIsAutoPauseAndResumeEnabled(z8);
                return this;
            }

            public Builder setIsGpsUsageEnabled(boolean z8) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setIsGpsUsageEnabled(z8);
                return this;
            }

            public Builder setSwimmingPoolLength(float f9) {
                copyOnWrite();
                ((ExerciseConfig) this.instance).setSwimmingPoolLength(f9);
                return this;
            }
        }

        static {
            ExerciseConfig exerciseConfig = new ExerciseConfig();
            DEFAULT_INSTANCE = exerciseConfig;
            y.registerDefaultInstance(ExerciseConfig.class, exerciseConfig);
        }

        private ExerciseConfig() {
        }

        /* access modifiers changed from: private */
        public void addAggregateDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureAggregateDataTypesIsMutable();
            this.aggregateDataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addAggregateDataTypes(DataType dataType) {
            dataType.getClass();
            ensureAggregateDataTypesIsMutable();
            this.aggregateDataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addAllAggregateDataTypes(Iterable<? extends DataType> iterable) {
            ensureAggregateDataTypesIsMutable();
            a.addAll(iterable, this.aggregateDataTypes_);
        }

        /* access modifiers changed from: private */
        public void addAllDataTypes(Iterable<? extends DataType> iterable) {
            ensureDataTypesIsMutable();
            a.addAll(iterable, this.dataTypes_);
        }

        /* access modifiers changed from: private */
        public void addAllExerciseGoals(Iterable<? extends ExerciseGoal> iterable) {
            ensureExerciseGoalsIsMutable();
            a.addAll(iterable, this.exerciseGoals_);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addExerciseGoals(int i8, ExerciseGoal exerciseGoal) {
            exerciseGoal.getClass();
            ensureExerciseGoalsIsMutable();
            this.exerciseGoals_.add(i8, exerciseGoal);
        }

        /* access modifiers changed from: private */
        public void addExerciseGoals(ExerciseGoal exerciseGoal) {
            exerciseGoal.getClass();
            ensureExerciseGoalsIsMutable();
            this.exerciseGoals_.add(exerciseGoal);
        }

        /* access modifiers changed from: private */
        public void clearAggregateDataTypes() {
            this.aggregateDataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDataTypes() {
            this.dataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExerciseGoals() {
            this.exerciseGoals_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExerciseParams() {
            this.exerciseParams_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearExerciseType() {
            this.bitField0_ &= -2;
            this.exerciseType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIsAutoPauseAndResumeEnabled() {
            this.bitField0_ &= -3;
            this.isAutoPauseAndResumeEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsGpsUsageEnabled() {
            this.bitField0_ &= -5;
            this.isGpsUsageEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearSwimmingPoolLength() {
            this.bitField0_ &= -17;
            this.swimmingPoolLength_ = 0.0f;
        }

        private void ensureAggregateDataTypesIsMutable() {
            a0.j<DataType> jVar = this.aggregateDataTypes_;
            if (!jVar.f()) {
                this.aggregateDataTypes_ = y.mutableCopy(jVar);
            }
        }

        private void ensureDataTypesIsMutable() {
            a0.j<DataType> jVar = this.dataTypes_;
            if (!jVar.f()) {
                this.dataTypes_ = y.mutableCopy(jVar);
            }
        }

        private void ensureExerciseGoalsIsMutable() {
            a0.j<ExerciseGoal> jVar = this.exerciseGoals_;
            if (!jVar.f()) {
                this.exerciseGoals_ = y.mutableCopy(jVar);
            }
        }

        public static ExerciseConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseParams(Bundle bundle) {
            bundle.getClass();
            Bundle bundle2 = this.exerciseParams_;
            if (!(bundle2 == null || bundle2 == Bundle.getDefaultInstance())) {
                bundle = (Bundle) ((Bundle.Builder) Bundle.newBuilder(this.exerciseParams_).mergeFrom(bundle)).buildPartial();
            }
            this.exerciseParams_ = bundle;
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseConfig exerciseConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseConfig);
        }

        public static ExerciseConfig parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseConfig parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseConfig parseFrom(i iVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseConfig parseFrom(i iVar, q qVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseConfig parseFrom(j jVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseConfig parseFrom(j jVar, q qVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseConfig parseFrom(InputStream inputStream) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseConfig parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseConfig parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseConfig parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseConfig parseFrom(byte[] bArr) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseConfig parseFrom(byte[] bArr, q qVar) {
            return (ExerciseConfig) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAggregateDataTypes(int i8) {
            ensureAggregateDataTypesIsMutable();
            this.aggregateDataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeDataTypes(int i8) {
            ensureDataTypesIsMutable();
            this.dataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeExerciseGoals(int i8) {
            ensureExerciseGoalsIsMutable();
            this.exerciseGoals_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setAggregateDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureAggregateDataTypesIsMutable();
            this.aggregateDataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setExerciseGoals(int i8, ExerciseGoal exerciseGoal) {
            exerciseGoal.getClass();
            ensureExerciseGoalsIsMutable();
            this.exerciseGoals_.set(i8, exerciseGoal);
        }

        /* access modifiers changed from: private */
        public void setExerciseParams(Bundle bundle) {
            bundle.getClass();
            this.exerciseParams_ = bundle;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setExerciseType(ExerciseType exerciseType) {
            this.exerciseType_ = exerciseType.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setIsAutoPauseAndResumeEnabled(boolean z8) {
            this.bitField0_ |= 2;
            this.isAutoPauseAndResumeEnabled_ = z8;
        }

        /* access modifiers changed from: private */
        public void setIsGpsUsageEnabled(boolean z8) {
            this.bitField0_ |= 4;
            this.isGpsUsageEnabled_ = z8;
        }

        /* access modifiers changed from: private */
        public void setSwimmingPoolLength(float f9) {
            this.bitField0_ |= 16;
            this.swimmingPoolLength_ = f9;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002\u0006\u001b\u0007ဉ\u0003\bခ\u0004", new Object[]{"bitField0_", "exerciseType_", ExerciseType.internalGetVerifier(), "dataTypes_", DataType.class, "aggregateDataTypes_", DataType.class, "isAutoPauseAndResumeEnabled_", "isGpsUsageEnabled_", "exerciseGoals_", ExerciseGoal.class, "exerciseParams_", "swimmingPoolLength_"});
                case 3:
                    return new ExerciseConfig();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseConfig> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseConfig.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getAggregateDataTypes(int i8) {
            return this.aggregateDataTypes_.get(i8);
        }

        public int getAggregateDataTypesCount() {
            return this.aggregateDataTypes_.size();
        }

        public List<DataType> getAggregateDataTypesList() {
            return this.aggregateDataTypes_;
        }

        public DataTypeOrBuilder getAggregateDataTypesOrBuilder(int i8) {
            return this.aggregateDataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getAggregateDataTypesOrBuilderList() {
            return this.aggregateDataTypes_;
        }

        public DataType getDataTypes(int i8) {
            return this.dataTypes_.get(i8);
        }

        public int getDataTypesCount() {
            return this.dataTypes_.size();
        }

        public List<DataType> getDataTypesList() {
            return this.dataTypes_;
        }

        public DataTypeOrBuilder getDataTypesOrBuilder(int i8) {
            return this.dataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getDataTypesOrBuilderList() {
            return this.dataTypes_;
        }

        public ExerciseGoal getExerciseGoals(int i8) {
            return this.exerciseGoals_.get(i8);
        }

        public int getExerciseGoalsCount() {
            return this.exerciseGoals_.size();
        }

        public List<ExerciseGoal> getExerciseGoalsList() {
            return this.exerciseGoals_;
        }

        public ExerciseGoalOrBuilder getExerciseGoalsOrBuilder(int i8) {
            return this.exerciseGoals_.get(i8);
        }

        public List<? extends ExerciseGoalOrBuilder> getExerciseGoalsOrBuilderList() {
            return this.exerciseGoals_;
        }

        public Bundle getExerciseParams() {
            Bundle bundle = this.exerciseParams_;
            return bundle == null ? Bundle.getDefaultInstance() : bundle;
        }

        public ExerciseType getExerciseType() {
            ExerciseType forNumber = ExerciseType.forNumber(this.exerciseType_);
            return forNumber == null ? ExerciseType.EXERCISE_TYPE_UNKNOWN : forNumber;
        }

        public boolean getIsAutoPauseAndResumeEnabled() {
            return this.isAutoPauseAndResumeEnabled_;
        }

        public boolean getIsGpsUsageEnabled() {
            return this.isGpsUsageEnabled_;
        }

        public float getSwimmingPoolLength() {
            return this.swimmingPoolLength_;
        }

        public boolean hasExerciseParams() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasExerciseType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIsAutoPauseAndResumeEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIsGpsUsageEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSwimmingPoolLength() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    public interface ExerciseConfigOrBuilder extends s0 {
        DataType getAggregateDataTypes(int i8);

        int getAggregateDataTypesCount();

        List<DataType> getAggregateDataTypesList();

        DataType getDataTypes(int i8);

        int getDataTypesCount();

        List<DataType> getDataTypesList();

        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseGoal getExerciseGoals(int i8);

        int getExerciseGoalsCount();

        List<ExerciseGoal> getExerciseGoalsList();

        Bundle getExerciseParams();

        ExerciseType getExerciseType();

        boolean getIsAutoPauseAndResumeEnabled();

        boolean getIsGpsUsageEnabled();

        float getSwimmingPoolLength();

        boolean hasExerciseParams();

        boolean hasExerciseType();

        boolean hasIsAutoPauseAndResumeEnabled();

        boolean hasIsGpsUsageEnabled();

        boolean hasSwimmingPoolLength();

        /* synthetic */ boolean isInitialized();
    }

    public enum ExerciseEndReason implements a0.c {
        EXERCISE_END_REASON_UNKNOWN(0),
        EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST(1),
        EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED(2),
        EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER(3),
        EXERCISE_END_REASON_USER_END(4),
        EXERCISE_END_REASON_AUTO_END_SUPERSEDED(5),
        EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED(6);
        
        public static final int EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER_VALUE = 3;
        public static final int EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED_VALUE = 2;
        public static final int EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST_VALUE = 1;
        public static final int EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED_VALUE = 6;
        public static final int EXERCISE_END_REASON_AUTO_END_SUPERSEDED_VALUE = 5;
        public static final int EXERCISE_END_REASON_UNKNOWN_VALUE = 0;
        public static final int EXERCISE_END_REASON_USER_END_VALUE = 4;
        private static final a0.d<ExerciseEndReason> internalValueMap = null;
        private final int value;

        public static final class ExerciseEndReasonVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ExerciseEndReasonVerifier();
            }

            private ExerciseEndReasonVerifier() {
            }

            public boolean isInRange(int i8) {
                return ExerciseEndReason.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ExerciseEndReason>() {
                public ExerciseEndReason findValueByNumber(int i8) {
                    return ExerciseEndReason.forNumber(i8);
                }
            };
        }

        private ExerciseEndReason(int i8) {
            this.value = i8;
        }

        public static ExerciseEndReason forNumber(int i8) {
            switch (i8) {
                case 0:
                    return EXERCISE_END_REASON_UNKNOWN;
                case 1:
                    return EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST;
                case 2:
                    return EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED;
                case 3:
                    return EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER;
                case 4:
                    return EXERCISE_END_REASON_USER_END;
                case 5:
                    return EXERCISE_END_REASON_AUTO_END_SUPERSEDED;
                case 6:
                    return EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED;
                default:
                    return null;
            }
        }

        public static a0.d<ExerciseEndReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ExerciseEndReasonVerifier.INSTANCE;
        }

        @Deprecated
        public static ExerciseEndReason valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public static final class ExerciseGoal extends y<ExerciseGoal, Builder> implements ExerciseGoalOrBuilder {
        public static final int DATA_TYPE_CONDITION_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final ExerciseGoal DEFAULT_INSTANCE;
        public static final int EXERCISE_GOAL_TYPE_FIELD_NUMBER = 1;
        private static volatile z0<ExerciseGoal> PARSER = null;
        public static final int PERIOD_FIELD_NUMBER = 3;
        private int bitField0_;
        private DataTypeCondition dataTypeCondition_;
        private int exerciseGoalType_;
        private Value period_;

        public static final class Builder extends y.a<ExerciseGoal, Builder> implements ExerciseGoalOrBuilder {
            private Builder() {
                super(ExerciseGoal.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearDataTypeCondition() {
                copyOnWrite();
                ((ExerciseGoal) this.instance).clearDataTypeCondition();
                return this;
            }

            public Builder clearExerciseGoalType() {
                copyOnWrite();
                ((ExerciseGoal) this.instance).clearExerciseGoalType();
                return this;
            }

            public Builder clearPeriod() {
                copyOnWrite();
                ((ExerciseGoal) this.instance).clearPeriod();
                return this;
            }

            public DataTypeCondition getDataTypeCondition() {
                return ((ExerciseGoal) this.instance).getDataTypeCondition();
            }

            public ExerciseGoalType getExerciseGoalType() {
                return ((ExerciseGoal) this.instance).getExerciseGoalType();
            }

            public Value getPeriod() {
                return ((ExerciseGoal) this.instance).getPeriod();
            }

            public boolean hasDataTypeCondition() {
                return ((ExerciseGoal) this.instance).hasDataTypeCondition();
            }

            public boolean hasExerciseGoalType() {
                return ((ExerciseGoal) this.instance).hasExerciseGoalType();
            }

            public boolean hasPeriod() {
                return ((ExerciseGoal) this.instance).hasPeriod();
            }

            public Builder mergeDataTypeCondition(DataTypeCondition dataTypeCondition) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).mergeDataTypeCondition(dataTypeCondition);
                return this;
            }

            public Builder mergePeriod(Value value) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).mergePeriod(value);
                return this;
            }

            public Builder setDataTypeCondition(DataTypeCondition.Builder builder) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).setDataTypeCondition((DataTypeCondition) builder.build());
                return this;
            }

            public Builder setDataTypeCondition(DataTypeCondition dataTypeCondition) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).setDataTypeCondition(dataTypeCondition);
                return this;
            }

            public Builder setExerciseGoalType(ExerciseGoalType exerciseGoalType) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).setExerciseGoalType(exerciseGoalType);
                return this;
            }

            public Builder setPeriod(Value.Builder builder) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).setPeriod((Value) builder.build());
                return this;
            }

            public Builder setPeriod(Value value) {
                copyOnWrite();
                ((ExerciseGoal) this.instance).setPeriod(value);
                return this;
            }
        }

        static {
            ExerciseGoal exerciseGoal = new ExerciseGoal();
            DEFAULT_INSTANCE = exerciseGoal;
            y.registerDefaultInstance(ExerciseGoal.class, exerciseGoal);
        }

        private ExerciseGoal() {
        }

        /* access modifiers changed from: private */
        public void clearDataTypeCondition() {
            this.dataTypeCondition_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearExerciseGoalType() {
            this.bitField0_ &= -2;
            this.exerciseGoalType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPeriod() {
            this.period_ = null;
            this.bitField0_ &= -5;
        }

        public static ExerciseGoal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDataTypeCondition(DataTypeCondition dataTypeCondition) {
            dataTypeCondition.getClass();
            DataTypeCondition dataTypeCondition2 = this.dataTypeCondition_;
            if (!(dataTypeCondition2 == null || dataTypeCondition2 == DataTypeCondition.getDefaultInstance())) {
                dataTypeCondition = (DataTypeCondition) ((DataTypeCondition.Builder) DataTypeCondition.newBuilder(this.dataTypeCondition_).mergeFrom(dataTypeCondition)).buildPartial();
            }
            this.dataTypeCondition_ = dataTypeCondition;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergePeriod(Value value) {
            value.getClass();
            Value value2 = this.period_;
            if (!(value2 == null || value2 == Value.getDefaultInstance())) {
                value = (Value) ((Value.Builder) Value.newBuilder(this.period_).mergeFrom(value)).buildPartial();
            }
            this.period_ = value;
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseGoal exerciseGoal) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseGoal);
        }

        public static ExerciseGoal parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseGoal parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseGoal parseFrom(i iVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseGoal parseFrom(i iVar, q qVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseGoal parseFrom(j jVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseGoal parseFrom(j jVar, q qVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseGoal parseFrom(InputStream inputStream) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseGoal parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseGoal parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseGoal parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseGoal parseFrom(byte[] bArr) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseGoal parseFrom(byte[] bArr, q qVar) {
            return (ExerciseGoal) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseGoal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDataTypeCondition(DataTypeCondition dataTypeCondition) {
            dataTypeCondition.getClass();
            this.dataTypeCondition_ = dataTypeCondition;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setExerciseGoalType(ExerciseGoalType exerciseGoalType) {
            this.exerciseGoalType_ = exerciseGoalType.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setPeriod(Value value) {
            value.getClass();
            this.period_ = value;
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "exerciseGoalType_", ExerciseGoalType.internalGetVerifier(), "dataTypeCondition_", "period_"});
                case 3:
                    return new ExerciseGoal();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseGoal> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseGoal.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataTypeCondition getDataTypeCondition() {
            DataTypeCondition dataTypeCondition = this.dataTypeCondition_;
            return dataTypeCondition == null ? DataTypeCondition.getDefaultInstance() : dataTypeCondition;
        }

        public ExerciseGoalType getExerciseGoalType() {
            ExerciseGoalType forNumber = ExerciseGoalType.forNumber(this.exerciseGoalType_);
            return forNumber == null ? ExerciseGoalType.EXERCISE_GOAL_TYPE_UNKNOWN : forNumber;
        }

        public Value getPeriod() {
            Value value = this.period_;
            return value == null ? Value.getDefaultInstance() : value;
        }

        public boolean hasDataTypeCondition() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasExerciseGoalType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPeriod() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public interface ExerciseGoalOrBuilder extends s0 {
        DataTypeCondition getDataTypeCondition();

        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseGoalType getExerciseGoalType();

        Value getPeriod();

        boolean hasDataTypeCondition();

        boolean hasExerciseGoalType();

        boolean hasPeriod();

        /* synthetic */ boolean isInitialized();
    }

    public enum ExerciseGoalType implements a0.c {
        EXERCISE_GOAL_TYPE_UNKNOWN(0),
        EXERCISE_GOAL_TYPE_ONE_TIME(1),
        EXERCISE_GOAL_TYPE_MILESTONE(2);
        
        public static final int EXERCISE_GOAL_TYPE_MILESTONE_VALUE = 2;
        public static final int EXERCISE_GOAL_TYPE_ONE_TIME_VALUE = 1;
        public static final int EXERCISE_GOAL_TYPE_UNKNOWN_VALUE = 0;
        private static final a0.d<ExerciseGoalType> internalValueMap = null;
        private final int value;

        public static final class ExerciseGoalTypeVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ExerciseGoalTypeVerifier();
            }

            private ExerciseGoalTypeVerifier() {
            }

            public boolean isInRange(int i8) {
                return ExerciseGoalType.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ExerciseGoalType>() {
                public ExerciseGoalType findValueByNumber(int i8) {
                    return ExerciseGoalType.forNumber(i8);
                }
            };
        }

        private ExerciseGoalType(int i8) {
            this.value = i8;
        }

        public static ExerciseGoalType forNumber(int i8) {
            if (i8 == 0) {
                return EXERCISE_GOAL_TYPE_UNKNOWN;
            }
            if (i8 == 1) {
                return EXERCISE_GOAL_TYPE_ONE_TIME;
            }
            if (i8 != 2) {
                return null;
            }
            return EXERCISE_GOAL_TYPE_MILESTONE;
        }

        public static a0.d<ExerciseGoalType> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ExerciseGoalTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static ExerciseGoalType valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public static final class ExerciseInfo extends y<ExerciseInfo, Builder> implements ExerciseInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseInfo DEFAULT_INSTANCE;
        public static final int EXERCISE_TRACKED_STATUS_FIELD_NUMBER = 1;
        public static final int EXERCISE_TYPE_FIELD_NUMBER = 2;
        private static volatile z0<ExerciseInfo> PARSER;
        private int bitField0_;
        private int exerciseTrackedStatus_;
        private int exerciseType_;

        public static final class Builder extends y.a<ExerciseInfo, Builder> implements ExerciseInfoOrBuilder {
            private Builder() {
                super(ExerciseInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearExerciseTrackedStatus() {
                copyOnWrite();
                ((ExerciseInfo) this.instance).clearExerciseTrackedStatus();
                return this;
            }

            public Builder clearExerciseType() {
                copyOnWrite();
                ((ExerciseInfo) this.instance).clearExerciseType();
                return this;
            }

            public ExerciseTrackedStatus getExerciseTrackedStatus() {
                return ((ExerciseInfo) this.instance).getExerciseTrackedStatus();
            }

            public ExerciseType getExerciseType() {
                return ((ExerciseInfo) this.instance).getExerciseType();
            }

            public boolean hasExerciseTrackedStatus() {
                return ((ExerciseInfo) this.instance).hasExerciseTrackedStatus();
            }

            public boolean hasExerciseType() {
                return ((ExerciseInfo) this.instance).hasExerciseType();
            }

            public Builder setExerciseTrackedStatus(ExerciseTrackedStatus exerciseTrackedStatus) {
                copyOnWrite();
                ((ExerciseInfo) this.instance).setExerciseTrackedStatus(exerciseTrackedStatus);
                return this;
            }

            public Builder setExerciseType(ExerciseType exerciseType) {
                copyOnWrite();
                ((ExerciseInfo) this.instance).setExerciseType(exerciseType);
                return this;
            }
        }

        static {
            ExerciseInfo exerciseInfo = new ExerciseInfo();
            DEFAULT_INSTANCE = exerciseInfo;
            y.registerDefaultInstance(ExerciseInfo.class, exerciseInfo);
        }

        private ExerciseInfo() {
        }

        /* access modifiers changed from: private */
        public void clearExerciseTrackedStatus() {
            this.bitField0_ &= -2;
            this.exerciseTrackedStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExerciseType() {
            this.bitField0_ &= -3;
            this.exerciseType_ = 0;
        }

        public static ExerciseInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseInfo exerciseInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseInfo);
        }

        public static ExerciseInfo parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseInfo) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseInfo parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseInfo) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseInfo parseFrom(i iVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseInfo parseFrom(i iVar, q qVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseInfo parseFrom(j jVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseInfo parseFrom(j jVar, q qVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseInfo parseFrom(InputStream inputStream) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseInfo parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseInfo parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseInfo parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseInfo parseFrom(byte[] bArr) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseInfo parseFrom(byte[] bArr, q qVar) {
            return (ExerciseInfo) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExerciseTrackedStatus(ExerciseTrackedStatus exerciseTrackedStatus) {
            this.exerciseTrackedStatus_ = exerciseTrackedStatus.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setExerciseType(ExerciseType exerciseType) {
            this.exerciseType_ = exerciseType.getNumber();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "exerciseTrackedStatus_", ExerciseTrackedStatus.internalGetVerifier(), "exerciseType_", ExerciseType.internalGetVerifier()});
                case 3:
                    return new ExerciseInfo();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseInfo> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseInfo.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ExerciseTrackedStatus getExerciseTrackedStatus() {
            ExerciseTrackedStatus forNumber = ExerciseTrackedStatus.forNumber(this.exerciseTrackedStatus_);
            return forNumber == null ? ExerciseTrackedStatus.EXERCISE_TRACKED_STATUS_UNKNOWN : forNumber;
        }

        public ExerciseType getExerciseType() {
            ExerciseType forNumber = ExerciseType.forNumber(this.exerciseType_);
            return forNumber == null ? ExerciseType.EXERCISE_TYPE_UNKNOWN : forNumber;
        }

        public boolean hasExerciseTrackedStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasExerciseType() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface ExerciseInfoOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseTrackedStatus getExerciseTrackedStatus();

        ExerciseType getExerciseType();

        boolean hasExerciseTrackedStatus();

        boolean hasExerciseType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseLapSummary extends y<ExerciseLapSummary, Builder> implements ExerciseLapSummaryOrBuilder {
        public static final int ACTIVE_DURATION_MS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final ExerciseLapSummary DEFAULT_INSTANCE;
        public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 3;
        public static final int LAP_COUNT_FIELD_NUMBER = 1;
        public static final int LAP_METRICS_FIELD_NUMBER = 5;
        private static volatile z0<ExerciseLapSummary> PARSER = null;
        public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 2;
        private long activeDurationMs_;
        private int bitField0_;
        private long endTimeEpochMs_;
        private int lapCount_;
        private a0.j<LapMetricsEntry> lapMetrics_ = y.emptyProtobufList();
        private long startTimeEpochMs_;

        public static final class Builder extends y.a<ExerciseLapSummary, Builder> implements ExerciseLapSummaryOrBuilder {
            private Builder() {
                super(ExerciseLapSummary.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllLapMetrics(Iterable<? extends LapMetricsEntry> iterable) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).addAllLapMetrics(iterable);
                return this;
            }

            public Builder addLapMetrics(int i8, LapMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).addLapMetrics(i8, (LapMetricsEntry) builder.build());
                return this;
            }

            public Builder addLapMetrics(int i8, LapMetricsEntry lapMetricsEntry) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).addLapMetrics(i8, lapMetricsEntry);
                return this;
            }

            public Builder addLapMetrics(LapMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).addLapMetrics((LapMetricsEntry) builder.build());
                return this;
            }

            public Builder addLapMetrics(LapMetricsEntry lapMetricsEntry) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).addLapMetrics(lapMetricsEntry);
                return this;
            }

            public Builder clearActiveDurationMs() {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).clearActiveDurationMs();
                return this;
            }

            public Builder clearEndTimeEpochMs() {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).clearEndTimeEpochMs();
                return this;
            }

            public Builder clearLapCount() {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).clearLapCount();
                return this;
            }

            public Builder clearLapMetrics() {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).clearLapMetrics();
                return this;
            }

            public Builder clearStartTimeEpochMs() {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).clearStartTimeEpochMs();
                return this;
            }

            public long getActiveDurationMs() {
                return ((ExerciseLapSummary) this.instance).getActiveDurationMs();
            }

            public long getEndTimeEpochMs() {
                return ((ExerciseLapSummary) this.instance).getEndTimeEpochMs();
            }

            public int getLapCount() {
                return ((ExerciseLapSummary) this.instance).getLapCount();
            }

            public LapMetricsEntry getLapMetrics(int i8) {
                return ((ExerciseLapSummary) this.instance).getLapMetrics(i8);
            }

            public int getLapMetricsCount() {
                return ((ExerciseLapSummary) this.instance).getLapMetricsCount();
            }

            public List<LapMetricsEntry> getLapMetricsList() {
                return Collections.unmodifiableList(((ExerciseLapSummary) this.instance).getLapMetricsList());
            }

            public long getStartTimeEpochMs() {
                return ((ExerciseLapSummary) this.instance).getStartTimeEpochMs();
            }

            public boolean hasActiveDurationMs() {
                return ((ExerciseLapSummary) this.instance).hasActiveDurationMs();
            }

            public boolean hasEndTimeEpochMs() {
                return ((ExerciseLapSummary) this.instance).hasEndTimeEpochMs();
            }

            public boolean hasLapCount() {
                return ((ExerciseLapSummary) this.instance).hasLapCount();
            }

            public boolean hasStartTimeEpochMs() {
                return ((ExerciseLapSummary) this.instance).hasStartTimeEpochMs();
            }

            public Builder removeLapMetrics(int i8) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).removeLapMetrics(i8);
                return this;
            }

            public Builder setActiveDurationMs(long j8) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setActiveDurationMs(j8);
                return this;
            }

            public Builder setEndTimeEpochMs(long j8) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setEndTimeEpochMs(j8);
                return this;
            }

            public Builder setLapCount(int i8) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setLapCount(i8);
                return this;
            }

            public Builder setLapMetrics(int i8, LapMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setLapMetrics(i8, (LapMetricsEntry) builder.build());
                return this;
            }

            public Builder setLapMetrics(int i8, LapMetricsEntry lapMetricsEntry) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setLapMetrics(i8, lapMetricsEntry);
                return this;
            }

            public Builder setStartTimeEpochMs(long j8) {
                copyOnWrite();
                ((ExerciseLapSummary) this.instance).setStartTimeEpochMs(j8);
                return this;
            }
        }

        public static final class LapMetricsEntry extends y<LapMetricsEntry, Builder> implements LapMetricsEntryOrBuilder {
            public static final int AGGREGATE_DATA_POINT_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final LapMetricsEntry DEFAULT_INSTANCE;
            private static volatile z0<LapMetricsEntry> PARSER;
            private AggregateDataPoint aggregateDataPoint_;
            private int bitField0_;
            private DataType dataType_;

            public static final class Builder extends y.a<LapMetricsEntry, Builder> implements LapMetricsEntryOrBuilder {
                private Builder() {
                    super(LapMetricsEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearAggregateDataPoint() {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).clearAggregateDataPoint();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).clearDataType();
                    return this;
                }

                public AggregateDataPoint getAggregateDataPoint() {
                    return ((LapMetricsEntry) this.instance).getAggregateDataPoint();
                }

                public DataType getDataType() {
                    return ((LapMetricsEntry) this.instance).getDataType();
                }

                public boolean hasAggregateDataPoint() {
                    return ((LapMetricsEntry) this.instance).hasAggregateDataPoint();
                }

                public boolean hasDataType() {
                    return ((LapMetricsEntry) this.instance).hasDataType();
                }

                public Builder mergeAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).mergeAggregateDataPoint(aggregateDataPoint);
                    return this;
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder setAggregateDataPoint(AggregateDataPoint.Builder builder) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).setAggregateDataPoint((AggregateDataPoint) builder.build());
                    return this;
                }

                public Builder setAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).setAggregateDataPoint(aggregateDataPoint);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((LapMetricsEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                LapMetricsEntry lapMetricsEntry = new LapMetricsEntry();
                DEFAULT_INSTANCE = lapMetricsEntry;
                y.registerDefaultInstance(LapMetricsEntry.class, lapMetricsEntry);
            }

            private LapMetricsEntry() {
            }

            /* access modifiers changed from: private */
            public void clearAggregateDataPoint() {
                this.aggregateDataPoint_ = null;
                this.bitField0_ &= -3;
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            public static LapMetricsEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                aggregateDataPoint.getClass();
                AggregateDataPoint aggregateDataPoint2 = this.aggregateDataPoint_;
                if (!(aggregateDataPoint2 == null || aggregateDataPoint2 == AggregateDataPoint.getDefaultInstance())) {
                    aggregateDataPoint = (AggregateDataPoint) ((AggregateDataPoint.Builder) AggregateDataPoint.newBuilder(this.aggregateDataPoint_).mergeFrom(aggregateDataPoint)).buildPartial();
                }
                this.aggregateDataPoint_ = aggregateDataPoint;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(LapMetricsEntry lapMetricsEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(lapMetricsEntry);
            }

            public static LapMetricsEntry parseDelimitedFrom(InputStream inputStream) {
                return (LapMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LapMetricsEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (LapMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LapMetricsEntry parseFrom(i iVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static LapMetricsEntry parseFrom(i iVar, q qVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static LapMetricsEntry parseFrom(j jVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static LapMetricsEntry parseFrom(j jVar, q qVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static LapMetricsEntry parseFrom(InputStream inputStream) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LapMetricsEntry parseFrom(InputStream inputStream, q qVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LapMetricsEntry parseFrom(ByteBuffer byteBuffer) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static LapMetricsEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static LapMetricsEntry parseFrom(byte[] bArr) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LapMetricsEntry parseFrom(byte[] bArr, q qVar) {
                return (LapMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<LapMetricsEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                aggregateDataPoint.getClass();
                this.aggregateDataPoint_ = aggregateDataPoint;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "dataType_", "aggregateDataPoint_"});
                    case 3:
                        return new LapMetricsEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<LapMetricsEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (LapMetricsEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public AggregateDataPoint getAggregateDataPoint() {
                AggregateDataPoint aggregateDataPoint = this.aggregateDataPoint_;
                return aggregateDataPoint == null ? AggregateDataPoint.getDefaultInstance() : aggregateDataPoint;
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasAggregateDataPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface LapMetricsEntryOrBuilder extends s0 {
            AggregateDataPoint getAggregateDataPoint();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasAggregateDataPoint();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            ExerciseLapSummary exerciseLapSummary = new ExerciseLapSummary();
            DEFAULT_INSTANCE = exerciseLapSummary;
            y.registerDefaultInstance(ExerciseLapSummary.class, exerciseLapSummary);
        }

        private ExerciseLapSummary() {
        }

        /* access modifiers changed from: private */
        public void addAllLapMetrics(Iterable<? extends LapMetricsEntry> iterable) {
            ensureLapMetricsIsMutable();
            a.addAll(iterable, this.lapMetrics_);
        }

        /* access modifiers changed from: private */
        public void addLapMetrics(int i8, LapMetricsEntry lapMetricsEntry) {
            lapMetricsEntry.getClass();
            ensureLapMetricsIsMutable();
            this.lapMetrics_.add(i8, lapMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void addLapMetrics(LapMetricsEntry lapMetricsEntry) {
            lapMetricsEntry.getClass();
            ensureLapMetricsIsMutable();
            this.lapMetrics_.add(lapMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void clearActiveDurationMs() {
            this.bitField0_ &= -9;
            this.activeDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEndTimeEpochMs() {
            this.bitField0_ &= -5;
            this.endTimeEpochMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLapCount() {
            this.bitField0_ &= -2;
            this.lapCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLapMetrics() {
            this.lapMetrics_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearStartTimeEpochMs() {
            this.bitField0_ &= -3;
            this.startTimeEpochMs_ = 0;
        }

        private void ensureLapMetricsIsMutable() {
            a0.j<LapMetricsEntry> jVar = this.lapMetrics_;
            if (!jVar.f()) {
                this.lapMetrics_ = y.mutableCopy(jVar);
            }
        }

        public static ExerciseLapSummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseLapSummary exerciseLapSummary) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseLapSummary);
        }

        public static ExerciseLapSummary parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseLapSummary) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseLapSummary parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseLapSummary) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseLapSummary parseFrom(i iVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseLapSummary parseFrom(i iVar, q qVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseLapSummary parseFrom(j jVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseLapSummary parseFrom(j jVar, q qVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseLapSummary parseFrom(InputStream inputStream) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseLapSummary parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseLapSummary parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseLapSummary parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseLapSummary parseFrom(byte[] bArr) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseLapSummary parseFrom(byte[] bArr, q qVar) {
            return (ExerciseLapSummary) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseLapSummary> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeLapMetrics(int i8) {
            ensureLapMetricsIsMutable();
            this.lapMetrics_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setActiveDurationMs(long j8) {
            this.bitField0_ |= 8;
            this.activeDurationMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setEndTimeEpochMs(long j8) {
            this.bitField0_ |= 4;
            this.endTimeEpochMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setLapCount(int i8) {
            this.bitField0_ |= 1;
            this.lapCount_ = i8;
        }

        /* access modifiers changed from: private */
        public void setLapMetrics(int i8, LapMetricsEntry lapMetricsEntry) {
            lapMetricsEntry.getClass();
            ensureLapMetricsIsMutable();
            this.lapMetrics_.set(i8, lapMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void setStartTimeEpochMs(long j8) {
            this.bitField0_ |= 2;
            this.startTimeEpochMs_ = j8;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"bitField0_", "lapCount_", "startTimeEpochMs_", "endTimeEpochMs_", "activeDurationMs_", "lapMetrics_", LapMetricsEntry.class});
                case 3:
                    return new ExerciseLapSummary();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseLapSummary> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseLapSummary.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getActiveDurationMs() {
            return this.activeDurationMs_;
        }

        public long getEndTimeEpochMs() {
            return this.endTimeEpochMs_;
        }

        public int getLapCount() {
            return this.lapCount_;
        }

        public LapMetricsEntry getLapMetrics(int i8) {
            return this.lapMetrics_.get(i8);
        }

        public int getLapMetricsCount() {
            return this.lapMetrics_.size();
        }

        public List<LapMetricsEntry> getLapMetricsList() {
            return this.lapMetrics_;
        }

        public LapMetricsEntryOrBuilder getLapMetricsOrBuilder(int i8) {
            return this.lapMetrics_.get(i8);
        }

        public List<? extends LapMetricsEntryOrBuilder> getLapMetricsOrBuilderList() {
            return this.lapMetrics_;
        }

        public long getStartTimeEpochMs() {
            return this.startTimeEpochMs_;
        }

        public boolean hasActiveDurationMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEndTimeEpochMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLapCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStartTimeEpochMs() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface ExerciseLapSummaryOrBuilder extends s0 {
        long getActiveDurationMs();

        /* synthetic */ r0 getDefaultInstanceForType();

        long getEndTimeEpochMs();

        int getLapCount();

        ExerciseLapSummary.LapMetricsEntry getLapMetrics(int i8);

        int getLapMetricsCount();

        List<ExerciseLapSummary.LapMetricsEntry> getLapMetricsList();

        long getStartTimeEpochMs();

        boolean hasActiveDurationMs();

        boolean hasEndTimeEpochMs();

        boolean hasLapCount();

        boolean hasStartTimeEpochMs();

        /* synthetic */ boolean isInitialized();
    }

    public enum ExerciseState implements a0.c {
        EXERCISE_STATE_UNKNOWN(0),
        EXERCISE_STATE_PREPARING(15),
        EXERCISE_STATE_USER_STARTING(1),
        EXERCISE_STATE_ACTIVE(2),
        EXERCISE_STATE_USER_PAUSING(3),
        EXERCISE_STATE_USER_PAUSED(4),
        EXERCISE_STATE_AUTO_PAUSING(5),
        EXERCISE_STATE_AUTO_PAUSED(6),
        EXERCISE_STATE_USER_RESUMING(7),
        EXERCISE_STATE_AUTO_RESUMING(8),
        EXERCISE_STATE_USER_ENDING(9),
        EXERCISE_STATE_USER_ENDED(10),
        EXERCISE_STATE_AUTO_ENDING(11),
        EXERCISE_STATE_AUTO_ENDED(12),
        EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST(16),
        EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST(17),
        EXERCISE_STATE_TERMINATING(13),
        EXERCISE_STATE_TERMINATED(14),
        EXERCISE_STATE_ENDED(18),
        EXERCISE_STATE_ENDING(19);
        
        public static final int EXERCISE_STATE_ACTIVE_VALUE = 2;
        public static final int EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST_VALUE = 17;
        public static final int EXERCISE_STATE_AUTO_ENDED_VALUE = 12;
        public static final int EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST_VALUE = 16;
        public static final int EXERCISE_STATE_AUTO_ENDING_VALUE = 11;
        public static final int EXERCISE_STATE_AUTO_PAUSED_VALUE = 6;
        public static final int EXERCISE_STATE_AUTO_PAUSING_VALUE = 5;
        public static final int EXERCISE_STATE_AUTO_RESUMING_VALUE = 8;
        public static final int EXERCISE_STATE_ENDED_VALUE = 18;
        public static final int EXERCISE_STATE_ENDING_VALUE = 19;
        public static final int EXERCISE_STATE_PREPARING_VALUE = 15;
        public static final int EXERCISE_STATE_TERMINATED_VALUE = 14;
        public static final int EXERCISE_STATE_TERMINATING_VALUE = 13;
        public static final int EXERCISE_STATE_UNKNOWN_VALUE = 0;
        public static final int EXERCISE_STATE_USER_ENDED_VALUE = 10;
        public static final int EXERCISE_STATE_USER_ENDING_VALUE = 9;
        public static final int EXERCISE_STATE_USER_PAUSED_VALUE = 4;
        public static final int EXERCISE_STATE_USER_PAUSING_VALUE = 3;
        public static final int EXERCISE_STATE_USER_RESUMING_VALUE = 7;
        public static final int EXERCISE_STATE_USER_STARTING_VALUE = 1;
        private static final a0.d<ExerciseState> internalValueMap = null;
        private final int value;

        public static final class ExerciseStateVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ExerciseStateVerifier();
            }

            private ExerciseStateVerifier() {
            }

            public boolean isInRange(int i8) {
                return ExerciseState.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ExerciseState>() {
                public ExerciseState findValueByNumber(int i8) {
                    return ExerciseState.forNumber(i8);
                }
            };
        }

        private ExerciseState(int i8) {
            this.value = i8;
        }

        public static ExerciseState forNumber(int i8) {
            switch (i8) {
                case 0:
                    return EXERCISE_STATE_UNKNOWN;
                case 1:
                    return EXERCISE_STATE_USER_STARTING;
                case 2:
                    return EXERCISE_STATE_ACTIVE;
                case 3:
                    return EXERCISE_STATE_USER_PAUSING;
                case 4:
                    return EXERCISE_STATE_USER_PAUSED;
                case 5:
                    return EXERCISE_STATE_AUTO_PAUSING;
                case 6:
                    return EXERCISE_STATE_AUTO_PAUSED;
                case 7:
                    return EXERCISE_STATE_USER_RESUMING;
                case 8:
                    return EXERCISE_STATE_AUTO_RESUMING;
                case 9:
                    return EXERCISE_STATE_USER_ENDING;
                case 10:
                    return EXERCISE_STATE_USER_ENDED;
                case 11:
                    return EXERCISE_STATE_AUTO_ENDING;
                case 12:
                    return EXERCISE_STATE_AUTO_ENDED;
                case 13:
                    return EXERCISE_STATE_TERMINATING;
                case 14:
                    return EXERCISE_STATE_TERMINATED;
                case 15:
                    return EXERCISE_STATE_PREPARING;
                case 16:
                    return EXERCISE_STATE_AUTO_ENDING_PERMISSION_LOST;
                case 17:
                    return EXERCISE_STATE_AUTO_ENDED_PERMISSION_LOST;
                case 18:
                    return EXERCISE_STATE_ENDED;
                case 19:
                    return EXERCISE_STATE_ENDING;
                default:
                    return null;
            }
        }

        public static a0.d<ExerciseState> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ExerciseStateVerifier.INSTANCE;
        }

        @Deprecated
        public static ExerciseState valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public enum ExerciseTrackedStatus implements a0.c {
        EXERCISE_TRACKED_STATUS_UNKNOWN(0),
        EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS(1),
        EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS(2),
        EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS(3);
        
        public static final int EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS_VALUE = 3;
        public static final int EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS_VALUE = 1;
        public static final int EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS_VALUE = 2;
        public static final int EXERCISE_TRACKED_STATUS_UNKNOWN_VALUE = 0;
        private static final a0.d<ExerciseTrackedStatus> internalValueMap = null;
        private final int value;

        public static final class ExerciseTrackedStatusVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ExerciseTrackedStatusVerifier();
            }

            private ExerciseTrackedStatusVerifier() {
            }

            public boolean isInRange(int i8) {
                return ExerciseTrackedStatus.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ExerciseTrackedStatus>() {
                public ExerciseTrackedStatus findValueByNumber(int i8) {
                    return ExerciseTrackedStatus.forNumber(i8);
                }
            };
        }

        private ExerciseTrackedStatus(int i8) {
            this.value = i8;
        }

        public static ExerciseTrackedStatus forNumber(int i8) {
            if (i8 == 0) {
                return EXERCISE_TRACKED_STATUS_UNKNOWN;
            }
            if (i8 == 1) {
                return EXERCISE_TRACKED_STATUS_OTHER_APP_IN_PROGRESS;
            }
            if (i8 == 2) {
                return EXERCISE_TRACKED_STATUS_OWNED_EXERCISE_IN_PROGRESS;
            }
            if (i8 != 3) {
                return null;
            }
            return EXERCISE_TRACKED_STATUS_NO_EXERCISE_IN_PROGRESS;
        }

        public static a0.d<ExerciseTrackedStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ExerciseTrackedStatusVerifier.INSTANCE;
        }

        @Deprecated
        public static ExerciseTrackedStatus valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public enum ExerciseType implements a0.c {
        EXERCISE_TYPE_UNKNOWN(0),
        EXERCISE_TYPE_ALPINE_SKIING(92),
        EXERCISE_TYPE_BACKPACKING(84),
        EXERCISE_TYPE_BACK_EXTENSION(1),
        EXERCISE_TYPE_BADMINTON(2),
        EXERCISE_TYPE_BARBELL_SHOULDER_PRESS(3),
        EXERCISE_TYPE_BASEBALL(4),
        EXERCISE_TYPE_BASKETBALL(5),
        EXERCISE_TYPE_BENCH_PRESS(6),
        EXERCISE_TYPE_BENCH_SIT_UP(7),
        EXERCISE_TYPE_BIKING(8),
        EXERCISE_TYPE_BIKING_STATIONARY(9),
        EXERCISE_TYPE_BOOT_CAMP(10),
        EXERCISE_TYPE_BOXING(11),
        EXERCISE_TYPE_BURPEE(12),
        EXERCISE_TYPE_CALISTHENICS(13),
        EXERCISE_TYPE_CRICKET(14),
        EXERCISE_TYPE_CROSS_COUNTRY_SKIING(91),
        EXERCISE_TYPE_CRUNCH(15),
        EXERCISE_TYPE_DANCING(16),
        EXERCISE_TYPE_DEADLIFT(17),
        EXERCISE_TYPE_DUMBBELL_CURL_RIGHT_ARM(18),
        EXERCISE_TYPE_DUMBBELL_CURL_LEFT_ARM(19),
        EXERCISE_TYPE_DUMBBELL_FRONT_RAISE(20),
        EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE(21),
        EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM(22),
        EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM(23),
        EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM(24),
        EXERCISE_TYPE_ELLIPTICAL(25),
        EXERCISE_TYPE_EXERCISE_CLASS(26),
        EXERCISE_TYPE_FENCING(27),
        EXERCISE_TYPE_FRISBEE_DISC(28),
        EXERCISE_TYPE_FOOTBALL_AMERICAN(29),
        EXERCISE_TYPE_FOOTBALL_AUSTRALIAN(30),
        EXERCISE_TYPE_FORWARD_TWIST(31),
        EXERCISE_TYPE_GOLF(32),
        EXERCISE_TYPE_GUIDED_BREATHING(33),
        EXERCISE_TYPE_GYMNASTICS(34),
        EXERCISE_TYPE_HANDBALL(35),
        EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING(36),
        EXERCISE_TYPE_HIKING(37),
        EXERCISE_TYPE_HORSE_RIDING(88),
        EXERCISE_TYPE_ICE_HOCKEY(38),
        EXERCISE_TYPE_ICE_SKATING(39),
        EXERCISE_TYPE_INLINE_SKATING(87),
        EXERCISE_TYPE_JUMP_ROPE(40),
        EXERCISE_TYPE_JUMPING_JACK(41),
        EXERCISE_TYPE_LAT_PULL_DOWN(42),
        EXERCISE_TYPE_LUNGE(43),
        EXERCISE_TYPE_MARTIAL_ARTS(44),
        EXERCISE_TYPE_MOUNTAIN_BIKING(85),
        EXERCISE_TYPE_ORIENTEERING(86),
        EXERCISE_TYPE_MEDITATION(45),
        EXERCISE_TYPE_PADDLING(46),
        EXERCISE_TYPE_PARA_GLIDING(47),
        EXERCISE_TYPE_PILATES(48),
        EXERCISE_TYPE_PLANK(49),
        EXERCISE_TYPE_RACQUETBALL(50),
        EXERCISE_TYPE_ROCK_CLIMBING(51),
        EXERCISE_TYPE_ROLLER_HOCKEY(52),
        EXERCISE_TYPE_ROLLER_SKATING(89),
        EXERCISE_TYPE_ROWING(53),
        EXERCISE_TYPE_ROWING_MACHINE(54),
        EXERCISE_TYPE_RUNNING(55),
        EXERCISE_TYPE_RUNNING_TREADMILL(56),
        EXERCISE_TYPE_RUGBY(57),
        EXERCISE_TYPE_SAILING(58),
        EXERCISE_TYPE_SCUBA_DIVING(59),
        EXERCISE_TYPE_SKATING(60),
        EXERCISE_TYPE_SKIING(61),
        EXERCISE_TYPE_SNOWBOARDING(62),
        EXERCISE_TYPE_SNOWSHOEING(63),
        EXERCISE_TYPE_SOCCER(64),
        EXERCISE_TYPE_SOFTBALL(65),
        EXERCISE_TYPE_SQUASH(66),
        EXERCISE_TYPE_SQUAT(67),
        EXERCISE_TYPE_STAIR_CLIMBING(68),
        EXERCISE_TYPE_STAIR_CLIMBING_MACHINE(69),
        EXERCISE_TYPE_STRENGTH_TRAINING(70),
        EXERCISE_TYPE_STRETCHING(71),
        EXERCISE_TYPE_SURFING(72),
        EXERCISE_TYPE_SWIMMING_OPEN_WATER(73),
        EXERCISE_TYPE_SWIMMING_POOL(74),
        EXERCISE_TYPE_TABLE_TENNIS(75),
        EXERCISE_TYPE_TENNIS(76),
        EXERCISE_TYPE_UPPER_TWIST(77),
        EXERCISE_TYPE_VOLLEYBALL(78),
        EXERCISE_TYPE_WALKING(79),
        EXERCISE_TYPE_WATER_POLO(80),
        EXERCISE_TYPE_WEIGHTLIFTING(81),
        EXERCISE_TYPE_WORKOUT(82),
        EXERCISE_TYPE_YACHTING(90),
        EXERCISE_TYPE_YOGA(83);
        
        public static final int EXERCISE_TYPE_ALPINE_SKIING_VALUE = 92;
        public static final int EXERCISE_TYPE_BACKPACKING_VALUE = 84;
        public static final int EXERCISE_TYPE_BACK_EXTENSION_VALUE = 1;
        public static final int EXERCISE_TYPE_BADMINTON_VALUE = 2;
        public static final int EXERCISE_TYPE_BARBELL_SHOULDER_PRESS_VALUE = 3;
        public static final int EXERCISE_TYPE_BASEBALL_VALUE = 4;
        public static final int EXERCISE_TYPE_BASKETBALL_VALUE = 5;
        public static final int EXERCISE_TYPE_BENCH_PRESS_VALUE = 6;
        public static final int EXERCISE_TYPE_BENCH_SIT_UP_VALUE = 7;
        public static final int EXERCISE_TYPE_BIKING_STATIONARY_VALUE = 9;
        public static final int EXERCISE_TYPE_BIKING_VALUE = 8;
        public static final int EXERCISE_TYPE_BOOT_CAMP_VALUE = 10;
        public static final int EXERCISE_TYPE_BOXING_VALUE = 11;
        public static final int EXERCISE_TYPE_BURPEE_VALUE = 12;
        public static final int EXERCISE_TYPE_CALISTHENICS_VALUE = 13;
        public static final int EXERCISE_TYPE_CRICKET_VALUE = 14;
        public static final int EXERCISE_TYPE_CROSS_COUNTRY_SKIING_VALUE = 91;
        public static final int EXERCISE_TYPE_CRUNCH_VALUE = 15;
        public static final int EXERCISE_TYPE_DANCING_VALUE = 16;
        public static final int EXERCISE_TYPE_DEADLIFT_VALUE = 17;
        public static final int EXERCISE_TYPE_DUMBBELL_CURL_LEFT_ARM_VALUE = 19;
        public static final int EXERCISE_TYPE_DUMBBELL_CURL_RIGHT_ARM_VALUE = 18;
        public static final int EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE = 20;
        public static final int EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE = 21;
        public static final int EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE = 22;
        public static final int EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE = 23;
        public static final int EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE = 24;
        public static final int EXERCISE_TYPE_ELLIPTICAL_VALUE = 25;
        public static final int EXERCISE_TYPE_EXERCISE_CLASS_VALUE = 26;
        public static final int EXERCISE_TYPE_FENCING_VALUE = 27;
        public static final int EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE = 29;
        public static final int EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE = 30;
        public static final int EXERCISE_TYPE_FORWARD_TWIST_VALUE = 31;
        public static final int EXERCISE_TYPE_FRISBEE_DISC_VALUE = 28;
        public static final int EXERCISE_TYPE_GOLF_VALUE = 32;
        public static final int EXERCISE_TYPE_GUIDED_BREATHING_VALUE = 33;
        public static final int EXERCISE_TYPE_GYMNASTICS_VALUE = 34;
        public static final int EXERCISE_TYPE_HANDBALL_VALUE = 35;
        public static final int EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE = 36;
        public static final int EXERCISE_TYPE_HIKING_VALUE = 37;
        public static final int EXERCISE_TYPE_HORSE_RIDING_VALUE = 88;
        public static final int EXERCISE_TYPE_ICE_HOCKEY_VALUE = 38;
        public static final int EXERCISE_TYPE_ICE_SKATING_VALUE = 39;
        public static final int EXERCISE_TYPE_INLINE_SKATING_VALUE = 87;
        public static final int EXERCISE_TYPE_JUMPING_JACK_VALUE = 41;
        public static final int EXERCISE_TYPE_JUMP_ROPE_VALUE = 40;
        public static final int EXERCISE_TYPE_LAT_PULL_DOWN_VALUE = 42;
        public static final int EXERCISE_TYPE_LUNGE_VALUE = 43;
        public static final int EXERCISE_TYPE_MARTIAL_ARTS_VALUE = 44;
        public static final int EXERCISE_TYPE_MEDITATION_VALUE = 45;
        public static final int EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE = 85;
        public static final int EXERCISE_TYPE_ORIENTEERING_VALUE = 86;
        public static final int EXERCISE_TYPE_PADDLING_VALUE = 46;
        public static final int EXERCISE_TYPE_PARA_GLIDING_VALUE = 47;
        public static final int EXERCISE_TYPE_PILATES_VALUE = 48;
        public static final int EXERCISE_TYPE_PLANK_VALUE = 49;
        public static final int EXERCISE_TYPE_RACQUETBALL_VALUE = 50;
        public static final int EXERCISE_TYPE_ROCK_CLIMBING_VALUE = 51;
        public static final int EXERCISE_TYPE_ROLLER_HOCKEY_VALUE = 52;
        public static final int EXERCISE_TYPE_ROLLER_SKATING_VALUE = 89;
        public static final int EXERCISE_TYPE_ROWING_MACHINE_VALUE = 54;
        public static final int EXERCISE_TYPE_ROWING_VALUE = 53;
        public static final int EXERCISE_TYPE_RUGBY_VALUE = 57;
        public static final int EXERCISE_TYPE_RUNNING_TREADMILL_VALUE = 56;
        public static final int EXERCISE_TYPE_RUNNING_VALUE = 55;
        public static final int EXERCISE_TYPE_SAILING_VALUE = 58;
        public static final int EXERCISE_TYPE_SCUBA_DIVING_VALUE = 59;
        public static final int EXERCISE_TYPE_SKATING_VALUE = 60;
        public static final int EXERCISE_TYPE_SKIING_VALUE = 61;
        public static final int EXERCISE_TYPE_SNOWBOARDING_VALUE = 62;
        public static final int EXERCISE_TYPE_SNOWSHOEING_VALUE = 63;
        public static final int EXERCISE_TYPE_SOCCER_VALUE = 64;
        public static final int EXERCISE_TYPE_SOFTBALL_VALUE = 65;
        public static final int EXERCISE_TYPE_SQUASH_VALUE = 66;
        public static final int EXERCISE_TYPE_SQUAT_VALUE = 67;
        public static final int EXERCISE_TYPE_STAIR_CLIMBING_MACHINE_VALUE = 69;
        public static final int EXERCISE_TYPE_STAIR_CLIMBING_VALUE = 68;
        public static final int EXERCISE_TYPE_STRENGTH_TRAINING_VALUE = 70;
        public static final int EXERCISE_TYPE_STRETCHING_VALUE = 71;
        public static final int EXERCISE_TYPE_SURFING_VALUE = 72;
        public static final int EXERCISE_TYPE_SWIMMING_OPEN_WATER_VALUE = 73;
        public static final int EXERCISE_TYPE_SWIMMING_POOL_VALUE = 74;
        public static final int EXERCISE_TYPE_TABLE_TENNIS_VALUE = 75;
        public static final int EXERCISE_TYPE_TENNIS_VALUE = 76;
        public static final int EXERCISE_TYPE_UNKNOWN_VALUE = 0;
        public static final int EXERCISE_TYPE_UPPER_TWIST_VALUE = 77;
        public static final int EXERCISE_TYPE_VOLLEYBALL_VALUE = 78;
        public static final int EXERCISE_TYPE_WALKING_VALUE = 79;
        public static final int EXERCISE_TYPE_WATER_POLO_VALUE = 80;
        public static final int EXERCISE_TYPE_WEIGHTLIFTING_VALUE = 81;
        public static final int EXERCISE_TYPE_WORKOUT_VALUE = 82;
        public static final int EXERCISE_TYPE_YACHTING_VALUE = 90;
        public static final int EXERCISE_TYPE_YOGA_VALUE = 83;
        private static final a0.d<ExerciseType> internalValueMap = null;
        private final int value;

        public static final class ExerciseTypeVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new ExerciseTypeVerifier();
            }

            private ExerciseTypeVerifier() {
            }

            public boolean isInRange(int i8) {
                return ExerciseType.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<ExerciseType>() {
                public ExerciseType findValueByNumber(int i8) {
                    return ExerciseType.forNumber(i8);
                }
            };
        }

        private ExerciseType(int i8) {
            this.value = i8;
        }

        public static ExerciseType forNumber(int i8) {
            switch (i8) {
                case 0:
                    return EXERCISE_TYPE_UNKNOWN;
                case 1:
                    return EXERCISE_TYPE_BACK_EXTENSION;
                case 2:
                    return EXERCISE_TYPE_BADMINTON;
                case 3:
                    return EXERCISE_TYPE_BARBELL_SHOULDER_PRESS;
                case 4:
                    return EXERCISE_TYPE_BASEBALL;
                case 5:
                    return EXERCISE_TYPE_BASKETBALL;
                case 6:
                    return EXERCISE_TYPE_BENCH_PRESS;
                case 7:
                    return EXERCISE_TYPE_BENCH_SIT_UP;
                case 8:
                    return EXERCISE_TYPE_BIKING;
                case 9:
                    return EXERCISE_TYPE_BIKING_STATIONARY;
                case 10:
                    return EXERCISE_TYPE_BOOT_CAMP;
                case 11:
                    return EXERCISE_TYPE_BOXING;
                case 12:
                    return EXERCISE_TYPE_BURPEE;
                case 13:
                    return EXERCISE_TYPE_CALISTHENICS;
                case 14:
                    return EXERCISE_TYPE_CRICKET;
                case 15:
                    return EXERCISE_TYPE_CRUNCH;
                case 16:
                    return EXERCISE_TYPE_DANCING;
                case 17:
                    return EXERCISE_TYPE_DEADLIFT;
                case 18:
                    return EXERCISE_TYPE_DUMBBELL_CURL_RIGHT_ARM;
                case 19:
                    return EXERCISE_TYPE_DUMBBELL_CURL_LEFT_ARM;
                case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                    return EXERCISE_TYPE_DUMBBELL_FRONT_RAISE;
                case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                    return EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                    return EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                    return EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM;
                case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                    return EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM;
                case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                    return EXERCISE_TYPE_ELLIPTICAL;
                case EXERCISE_TYPE_EXERCISE_CLASS_VALUE:
                    return EXERCISE_TYPE_EXERCISE_CLASS;
                case 27:
                    return EXERCISE_TYPE_FENCING;
                case EXERCISE_TYPE_FRISBEE_DISC_VALUE:
                    return EXERCISE_TYPE_FRISBEE_DISC;
                case EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE:
                    return EXERCISE_TYPE_FOOTBALL_AMERICAN;
                case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
                    return EXERCISE_TYPE_FOOTBALL_AUSTRALIAN;
                case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
                    return EXERCISE_TYPE_FORWARD_TWIST;
                case EXERCISE_TYPE_GOLF_VALUE:
                    return EXERCISE_TYPE_GOLF;
                case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                    return EXERCISE_TYPE_GUIDED_BREATHING;
                case EXERCISE_TYPE_GYMNASTICS_VALUE:
                    return EXERCISE_TYPE_GYMNASTICS;
                case EXERCISE_TYPE_HANDBALL_VALUE:
                    return EXERCISE_TYPE_HANDBALL;
                case EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE:
                    return EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING;
                case EXERCISE_TYPE_HIKING_VALUE:
                    return EXERCISE_TYPE_HIKING;
                case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                    return EXERCISE_TYPE_ICE_HOCKEY;
                case EXERCISE_TYPE_ICE_SKATING_VALUE:
                    return EXERCISE_TYPE_ICE_SKATING;
                case EXERCISE_TYPE_JUMP_ROPE_VALUE:
                    return EXERCISE_TYPE_JUMP_ROPE;
                case EXERCISE_TYPE_JUMPING_JACK_VALUE:
                    return EXERCISE_TYPE_JUMPING_JACK;
                case EXERCISE_TYPE_LAT_PULL_DOWN_VALUE:
                    return EXERCISE_TYPE_LAT_PULL_DOWN;
                case EXERCISE_TYPE_LUNGE_VALUE:
                    return EXERCISE_TYPE_LUNGE;
                case EXERCISE_TYPE_MARTIAL_ARTS_VALUE:
                    return EXERCISE_TYPE_MARTIAL_ARTS;
                case EXERCISE_TYPE_MEDITATION_VALUE:
                    return EXERCISE_TYPE_MEDITATION;
                case EXERCISE_TYPE_PADDLING_VALUE:
                    return EXERCISE_TYPE_PADDLING;
                case EXERCISE_TYPE_PARA_GLIDING_VALUE:
                    return EXERCISE_TYPE_PARA_GLIDING;
                case EXERCISE_TYPE_PILATES_VALUE:
                    return EXERCISE_TYPE_PILATES;
                case EXERCISE_TYPE_PLANK_VALUE:
                    return EXERCISE_TYPE_PLANK;
                case EXERCISE_TYPE_RACQUETBALL_VALUE:
                    return EXERCISE_TYPE_RACQUETBALL;
                case EXERCISE_TYPE_ROCK_CLIMBING_VALUE:
                    return EXERCISE_TYPE_ROCK_CLIMBING;
                case EXERCISE_TYPE_ROLLER_HOCKEY_VALUE:
                    return EXERCISE_TYPE_ROLLER_HOCKEY;
                case EXERCISE_TYPE_ROWING_VALUE:
                    return EXERCISE_TYPE_ROWING;
                case EXERCISE_TYPE_ROWING_MACHINE_VALUE:
                    return EXERCISE_TYPE_ROWING_MACHINE;
                case EXERCISE_TYPE_RUNNING_VALUE:
                    return EXERCISE_TYPE_RUNNING;
                case EXERCISE_TYPE_RUNNING_TREADMILL_VALUE:
                    return EXERCISE_TYPE_RUNNING_TREADMILL;
                case EXERCISE_TYPE_RUGBY_VALUE:
                    return EXERCISE_TYPE_RUGBY;
                case EXERCISE_TYPE_SAILING_VALUE:
                    return EXERCISE_TYPE_SAILING;
                case EXERCISE_TYPE_SCUBA_DIVING_VALUE:
                    return EXERCISE_TYPE_SCUBA_DIVING;
                case EXERCISE_TYPE_SKATING_VALUE:
                    return EXERCISE_TYPE_SKATING;
                case EXERCISE_TYPE_SKIING_VALUE:
                    return EXERCISE_TYPE_SKIING;
                case EXERCISE_TYPE_SNOWBOARDING_VALUE:
                    return EXERCISE_TYPE_SNOWBOARDING;
                case EXERCISE_TYPE_SNOWSHOEING_VALUE:
                    return EXERCISE_TYPE_SNOWSHOEING;
                case EXERCISE_TYPE_SOCCER_VALUE:
                    return EXERCISE_TYPE_SOCCER;
                case EXERCISE_TYPE_SOFTBALL_VALUE:
                    return EXERCISE_TYPE_SOFTBALL;
                case EXERCISE_TYPE_SQUASH_VALUE:
                    return EXERCISE_TYPE_SQUASH;
                case EXERCISE_TYPE_SQUAT_VALUE:
                    return EXERCISE_TYPE_SQUAT;
                case EXERCISE_TYPE_STAIR_CLIMBING_VALUE:
                    return EXERCISE_TYPE_STAIR_CLIMBING;
                case EXERCISE_TYPE_STAIR_CLIMBING_MACHINE_VALUE:
                    return EXERCISE_TYPE_STAIR_CLIMBING_MACHINE;
                case EXERCISE_TYPE_STRENGTH_TRAINING_VALUE:
                    return EXERCISE_TYPE_STRENGTH_TRAINING;
                case EXERCISE_TYPE_STRETCHING_VALUE:
                    return EXERCISE_TYPE_STRETCHING;
                case EXERCISE_TYPE_SURFING_VALUE:
                    return EXERCISE_TYPE_SURFING;
                case EXERCISE_TYPE_SWIMMING_OPEN_WATER_VALUE:
                    return EXERCISE_TYPE_SWIMMING_OPEN_WATER;
                case EXERCISE_TYPE_SWIMMING_POOL_VALUE:
                    return EXERCISE_TYPE_SWIMMING_POOL;
                case EXERCISE_TYPE_TABLE_TENNIS_VALUE:
                    return EXERCISE_TYPE_TABLE_TENNIS;
                case EXERCISE_TYPE_TENNIS_VALUE:
                    return EXERCISE_TYPE_TENNIS;
                case EXERCISE_TYPE_UPPER_TWIST_VALUE:
                    return EXERCISE_TYPE_UPPER_TWIST;
                case EXERCISE_TYPE_VOLLEYBALL_VALUE:
                    return EXERCISE_TYPE_VOLLEYBALL;
                case EXERCISE_TYPE_WALKING_VALUE:
                    return EXERCISE_TYPE_WALKING;
                case EXERCISE_TYPE_WATER_POLO_VALUE:
                    return EXERCISE_TYPE_WATER_POLO;
                case EXERCISE_TYPE_WEIGHTLIFTING_VALUE:
                    return EXERCISE_TYPE_WEIGHTLIFTING;
                case EXERCISE_TYPE_WORKOUT_VALUE:
                    return EXERCISE_TYPE_WORKOUT;
                case EXERCISE_TYPE_YOGA_VALUE:
                    return EXERCISE_TYPE_YOGA;
                case EXERCISE_TYPE_BACKPACKING_VALUE:
                    return EXERCISE_TYPE_BACKPACKING;
                case EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE:
                    return EXERCISE_TYPE_MOUNTAIN_BIKING;
                case EXERCISE_TYPE_ORIENTEERING_VALUE:
                    return EXERCISE_TYPE_ORIENTEERING;
                case EXERCISE_TYPE_INLINE_SKATING_VALUE:
                    return EXERCISE_TYPE_INLINE_SKATING;
                case EXERCISE_TYPE_HORSE_RIDING_VALUE:
                    return EXERCISE_TYPE_HORSE_RIDING;
                case EXERCISE_TYPE_ROLLER_SKATING_VALUE:
                    return EXERCISE_TYPE_ROLLER_SKATING;
                case EXERCISE_TYPE_YACHTING_VALUE:
                    return EXERCISE_TYPE_YACHTING;
                case EXERCISE_TYPE_CROSS_COUNTRY_SKIING_VALUE:
                    return EXERCISE_TYPE_CROSS_COUNTRY_SKIING;
                case EXERCISE_TYPE_ALPINE_SKIING_VALUE:
                    return EXERCISE_TYPE_ALPINE_SKIING;
                default:
                    return null;
            }
        }

        public static a0.d<ExerciseType> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return ExerciseTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static ExerciseType valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public static final class ExerciseTypeCapabilities extends y<ExerciseTypeCapabilities, Builder> implements ExerciseTypeCapabilitiesOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseTypeCapabilities DEFAULT_INSTANCE;
        public static final int IS_AUTO_PAUSE_AND_RESUME_SUPPORTED_FIELD_NUMBER = 4;
        public static final int IS_LAPS_SUPPORTED_FIELD_NUMBER = 5;
        private static volatile z0<ExerciseTypeCapabilities> PARSER = null;
        public static final int SUPPORTED_DATA_TYPES_FIELD_NUMBER = 1;
        public static final int SUPPORTED_GOALS_FIELD_NUMBER = 2;
        public static final int SUPPORTED_MILESTONES_FIELD_NUMBER = 3;
        private int bitField0_;
        private boolean isAutoPauseAndResumeSupported_;
        private boolean isLapsSupported_;
        private a0.j<DataType> supportedDataTypes_ = y.emptyProtobufList();
        private a0.j<SupportedGoalEntry> supportedGoals_ = y.emptyProtobufList();
        private a0.j<SupportedMilestoneEntry> supportedMilestones_ = y.emptyProtobufList();

        public static final class Builder extends y.a<ExerciseTypeCapabilities, Builder> implements ExerciseTypeCapabilitiesOrBuilder {
            private Builder() {
                super(ExerciseTypeCapabilities.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllSupportedDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addAllSupportedDataTypes(iterable);
                return this;
            }

            public Builder addAllSupportedGoals(Iterable<? extends SupportedGoalEntry> iterable) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addAllSupportedGoals(iterable);
                return this;
            }

            public Builder addAllSupportedMilestones(Iterable<? extends SupportedMilestoneEntry> iterable) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addAllSupportedMilestones(iterable);
                return this;
            }

            public Builder addSupportedDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedDataTypes(i8, dataType);
                return this;
            }

            public Builder addSupportedDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypes(DataType dataType) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedDataTypes(dataType);
                return this;
            }

            public Builder addSupportedGoals(int i8, SupportedGoalEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedGoals(i8, (SupportedGoalEntry) builder.build());
                return this;
            }

            public Builder addSupportedGoals(int i8, SupportedGoalEntry supportedGoalEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedGoals(i8, supportedGoalEntry);
                return this;
            }

            public Builder addSupportedGoals(SupportedGoalEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedGoals((SupportedGoalEntry) builder.build());
                return this;
            }

            public Builder addSupportedGoals(SupportedGoalEntry supportedGoalEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedGoals(supportedGoalEntry);
                return this;
            }

            public Builder addSupportedMilestones(int i8, SupportedMilestoneEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedMilestones(i8, (SupportedMilestoneEntry) builder.build());
                return this;
            }

            public Builder addSupportedMilestones(int i8, SupportedMilestoneEntry supportedMilestoneEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedMilestones(i8, supportedMilestoneEntry);
                return this;
            }

            public Builder addSupportedMilestones(SupportedMilestoneEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedMilestones((SupportedMilestoneEntry) builder.build());
                return this;
            }

            public Builder addSupportedMilestones(SupportedMilestoneEntry supportedMilestoneEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).addSupportedMilestones(supportedMilestoneEntry);
                return this;
            }

            public Builder clearIsAutoPauseAndResumeSupported() {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).clearIsAutoPauseAndResumeSupported();
                return this;
            }

            public Builder clearIsLapsSupported() {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).clearIsLapsSupported();
                return this;
            }

            public Builder clearSupportedDataTypes() {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).clearSupportedDataTypes();
                return this;
            }

            public Builder clearSupportedGoals() {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).clearSupportedGoals();
                return this;
            }

            public Builder clearSupportedMilestones() {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).clearSupportedMilestones();
                return this;
            }

            public boolean getIsAutoPauseAndResumeSupported() {
                return ((ExerciseTypeCapabilities) this.instance).getIsAutoPauseAndResumeSupported();
            }

            public boolean getIsLapsSupported() {
                return ((ExerciseTypeCapabilities) this.instance).getIsLapsSupported();
            }

            public DataType getSupportedDataTypes(int i8) {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedDataTypes(i8);
            }

            public int getSupportedDataTypesCount() {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedDataTypesCount();
            }

            public List<DataType> getSupportedDataTypesList() {
                return Collections.unmodifiableList(((ExerciseTypeCapabilities) this.instance).getSupportedDataTypesList());
            }

            public SupportedGoalEntry getSupportedGoals(int i8) {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedGoals(i8);
            }

            public int getSupportedGoalsCount() {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedGoalsCount();
            }

            public List<SupportedGoalEntry> getSupportedGoalsList() {
                return Collections.unmodifiableList(((ExerciseTypeCapabilities) this.instance).getSupportedGoalsList());
            }

            public SupportedMilestoneEntry getSupportedMilestones(int i8) {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedMilestones(i8);
            }

            public int getSupportedMilestonesCount() {
                return ((ExerciseTypeCapabilities) this.instance).getSupportedMilestonesCount();
            }

            public List<SupportedMilestoneEntry> getSupportedMilestonesList() {
                return Collections.unmodifiableList(((ExerciseTypeCapabilities) this.instance).getSupportedMilestonesList());
            }

            public boolean hasIsAutoPauseAndResumeSupported() {
                return ((ExerciseTypeCapabilities) this.instance).hasIsAutoPauseAndResumeSupported();
            }

            public boolean hasIsLapsSupported() {
                return ((ExerciseTypeCapabilities) this.instance).hasIsLapsSupported();
            }

            public Builder removeSupportedDataTypes(int i8) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).removeSupportedDataTypes(i8);
                return this;
            }

            public Builder removeSupportedGoals(int i8) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).removeSupportedGoals(i8);
                return this;
            }

            public Builder removeSupportedMilestones(int i8) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).removeSupportedMilestones(i8);
                return this;
            }

            public Builder setIsAutoPauseAndResumeSupported(boolean z8) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setIsAutoPauseAndResumeSupported(z8);
                return this;
            }

            public Builder setIsLapsSupported(boolean z8) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setIsLapsSupported(z8);
                return this;
            }

            public Builder setSupportedDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setSupportedDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedDataTypes(i8, dataType);
                return this;
            }

            public Builder setSupportedGoals(int i8, SupportedGoalEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedGoals(i8, (SupportedGoalEntry) builder.build());
                return this;
            }

            public Builder setSupportedGoals(int i8, SupportedGoalEntry supportedGoalEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedGoals(i8, supportedGoalEntry);
                return this;
            }

            public Builder setSupportedMilestones(int i8, SupportedMilestoneEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedMilestones(i8, (SupportedMilestoneEntry) builder.build());
                return this;
            }

            public Builder setSupportedMilestones(int i8, SupportedMilestoneEntry supportedMilestoneEntry) {
                copyOnWrite();
                ((ExerciseTypeCapabilities) this.instance).setSupportedMilestones(i8, supportedMilestoneEntry);
                return this;
            }
        }

        public static final class SupportedGoalEntry extends y<SupportedGoalEntry, Builder> implements SupportedGoalEntryOrBuilder {
            public static final int COMPARISON_TYPES_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final SupportedGoalEntry DEFAULT_INSTANCE;
            private static volatile z0<SupportedGoalEntry> PARSER;
            private static final a0.h.a<Integer, ComparisonType> comparisonTypes_converter_ = new a0.h.a<Integer, ComparisonType>() {
                public ComparisonType convert(Integer num) {
                    ComparisonType forNumber = ComparisonType.forNumber(num.intValue());
                    return forNumber == null ? ComparisonType.COMPARISON_TYPE_UNKNOWN : forNumber;
                }
            };
            private int bitField0_;
            private a0.g comparisonTypes_ = y.emptyIntList();
            private DataType dataType_;

            public static final class Builder extends y.a<SupportedGoalEntry, Builder> implements SupportedGoalEntryOrBuilder {
                private Builder() {
                    super(SupportedGoalEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder addAllComparisonTypes(Iterable<? extends ComparisonType> iterable) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).addAllComparisonTypes(iterable);
                    return this;
                }

                public Builder addComparisonTypes(ComparisonType comparisonType) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).addComparisonTypes(comparisonType);
                    return this;
                }

                public Builder clearComparisonTypes() {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).clearComparisonTypes();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).clearDataType();
                    return this;
                }

                public ComparisonType getComparisonTypes(int i8) {
                    return ((SupportedGoalEntry) this.instance).getComparisonTypes(i8);
                }

                public int getComparisonTypesCount() {
                    return ((SupportedGoalEntry) this.instance).getComparisonTypesCount();
                }

                public List<ComparisonType> getComparisonTypesList() {
                    return ((SupportedGoalEntry) this.instance).getComparisonTypesList();
                }

                public DataType getDataType() {
                    return ((SupportedGoalEntry) this.instance).getDataType();
                }

                public boolean hasDataType() {
                    return ((SupportedGoalEntry) this.instance).hasDataType();
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder setComparisonTypes(int i8, ComparisonType comparisonType) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).setComparisonTypes(i8, comparisonType);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((SupportedGoalEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                SupportedGoalEntry supportedGoalEntry = new SupportedGoalEntry();
                DEFAULT_INSTANCE = supportedGoalEntry;
                y.registerDefaultInstance(SupportedGoalEntry.class, supportedGoalEntry);
            }

            private SupportedGoalEntry() {
            }

            /* access modifiers changed from: private */
            public void addAllComparisonTypes(Iterable<? extends ComparisonType> iterable) {
                ensureComparisonTypesIsMutable();
                for (ComparisonType number : iterable) {
                    ((z) this.comparisonTypes_).j(number.getNumber());
                }
            }

            /* access modifiers changed from: private */
            public void addComparisonTypes(ComparisonType comparisonType) {
                comparisonType.getClass();
                ensureComparisonTypesIsMutable();
                ((z) this.comparisonTypes_).j(comparisonType.getNumber());
            }

            /* access modifiers changed from: private */
            public void clearComparisonTypes() {
                this.comparisonTypes_ = y.emptyIntList();
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            private void ensureComparisonTypesIsMutable() {
                a0.g gVar = this.comparisonTypes_;
                if (!((c) gVar).f3599f) {
                    this.comparisonTypes_ = y.mutableCopy(gVar);
                }
            }

            public static SupportedGoalEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(SupportedGoalEntry supportedGoalEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(supportedGoalEntry);
            }

            public static SupportedGoalEntry parseDelimitedFrom(InputStream inputStream) {
                return (SupportedGoalEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SupportedGoalEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (SupportedGoalEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SupportedGoalEntry parseFrom(i iVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static SupportedGoalEntry parseFrom(i iVar, q qVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static SupportedGoalEntry parseFrom(j jVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static SupportedGoalEntry parseFrom(j jVar, q qVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static SupportedGoalEntry parseFrom(InputStream inputStream) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SupportedGoalEntry parseFrom(InputStream inputStream, q qVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SupportedGoalEntry parseFrom(ByteBuffer byteBuffer) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static SupportedGoalEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static SupportedGoalEntry parseFrom(byte[] bArr) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SupportedGoalEntry parseFrom(byte[] bArr, q qVar) {
                return (SupportedGoalEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<SupportedGoalEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setComparisonTypes(int i8, ComparisonType comparisonType) {
                comparisonType.getClass();
                ensureComparisonTypesIsMutable();
                ((z) this.comparisonTypes_).m(i8, comparisonType.getNumber());
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"bitField0_", "dataType_", "comparisonTypes_", ComparisonType.internalGetVerifier()});
                    case 3:
                        return new SupportedGoalEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<SupportedGoalEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (SupportedGoalEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public ComparisonType getComparisonTypes(int i8) {
                ComparisonType forNumber = ComparisonType.forNumber(((z) this.comparisonTypes_).l(i8));
                return forNumber == null ? ComparisonType.COMPARISON_TYPE_UNKNOWN : forNumber;
            }

            public int getComparisonTypesCount() {
                return ((z) this.comparisonTypes_).f3832h;
            }

            public List<ComparisonType> getComparisonTypesList() {
                return new a0.h(this.comparisonTypes_, comparisonTypes_converter_);
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface SupportedGoalEntryOrBuilder extends s0 {
            ComparisonType getComparisonTypes(int i8);

            int getComparisonTypesCount();

            List<ComparisonType> getComparisonTypesList();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        public static final class SupportedMilestoneEntry extends y<SupportedMilestoneEntry, Builder> implements SupportedMilestoneEntryOrBuilder {
            public static final int COMPARISON_TYPES_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final SupportedMilestoneEntry DEFAULT_INSTANCE;
            private static volatile z0<SupportedMilestoneEntry> PARSER;
            private static final a0.h.a<Integer, ComparisonType> comparisonTypes_converter_ = new a0.h.a<Integer, ComparisonType>() {
                public ComparisonType convert(Integer num) {
                    ComparisonType forNumber = ComparisonType.forNumber(num.intValue());
                    return forNumber == null ? ComparisonType.COMPARISON_TYPE_UNKNOWN : forNumber;
                }
            };
            private int bitField0_;
            private a0.g comparisonTypes_ = y.emptyIntList();
            private DataType dataType_;

            public static final class Builder extends y.a<SupportedMilestoneEntry, Builder> implements SupportedMilestoneEntryOrBuilder {
                private Builder() {
                    super(SupportedMilestoneEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder addAllComparisonTypes(Iterable<? extends ComparisonType> iterable) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).addAllComparisonTypes(iterable);
                    return this;
                }

                public Builder addComparisonTypes(ComparisonType comparisonType) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).addComparisonTypes(comparisonType);
                    return this;
                }

                public Builder clearComparisonTypes() {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).clearComparisonTypes();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).clearDataType();
                    return this;
                }

                public ComparisonType getComparisonTypes(int i8) {
                    return ((SupportedMilestoneEntry) this.instance).getComparisonTypes(i8);
                }

                public int getComparisonTypesCount() {
                    return ((SupportedMilestoneEntry) this.instance).getComparisonTypesCount();
                }

                public List<ComparisonType> getComparisonTypesList() {
                    return ((SupportedMilestoneEntry) this.instance).getComparisonTypesList();
                }

                public DataType getDataType() {
                    return ((SupportedMilestoneEntry) this.instance).getDataType();
                }

                public boolean hasDataType() {
                    return ((SupportedMilestoneEntry) this.instance).hasDataType();
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder setComparisonTypes(int i8, ComparisonType comparisonType) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).setComparisonTypes(i8, comparisonType);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((SupportedMilestoneEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                SupportedMilestoneEntry supportedMilestoneEntry = new SupportedMilestoneEntry();
                DEFAULT_INSTANCE = supportedMilestoneEntry;
                y.registerDefaultInstance(SupportedMilestoneEntry.class, supportedMilestoneEntry);
            }

            private SupportedMilestoneEntry() {
            }

            /* access modifiers changed from: private */
            public void addAllComparisonTypes(Iterable<? extends ComparisonType> iterable) {
                ensureComparisonTypesIsMutable();
                for (ComparisonType number : iterable) {
                    ((z) this.comparisonTypes_).j(number.getNumber());
                }
            }

            /* access modifiers changed from: private */
            public void addComparisonTypes(ComparisonType comparisonType) {
                comparisonType.getClass();
                ensureComparisonTypesIsMutable();
                ((z) this.comparisonTypes_).j(comparisonType.getNumber());
            }

            /* access modifiers changed from: private */
            public void clearComparisonTypes() {
                this.comparisonTypes_ = y.emptyIntList();
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            private void ensureComparisonTypesIsMutable() {
                a0.g gVar = this.comparisonTypes_;
                if (!((c) gVar).f3599f) {
                    this.comparisonTypes_ = y.mutableCopy(gVar);
                }
            }

            public static SupportedMilestoneEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(SupportedMilestoneEntry supportedMilestoneEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(supportedMilestoneEntry);
            }

            public static SupportedMilestoneEntry parseDelimitedFrom(InputStream inputStream) {
                return (SupportedMilestoneEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SupportedMilestoneEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (SupportedMilestoneEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SupportedMilestoneEntry parseFrom(i iVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static SupportedMilestoneEntry parseFrom(i iVar, q qVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static SupportedMilestoneEntry parseFrom(j jVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static SupportedMilestoneEntry parseFrom(j jVar, q qVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static SupportedMilestoneEntry parseFrom(InputStream inputStream) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SupportedMilestoneEntry parseFrom(InputStream inputStream, q qVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SupportedMilestoneEntry parseFrom(ByteBuffer byteBuffer) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static SupportedMilestoneEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static SupportedMilestoneEntry parseFrom(byte[] bArr) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SupportedMilestoneEntry parseFrom(byte[] bArr, q qVar) {
                return (SupportedMilestoneEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<SupportedMilestoneEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setComparisonTypes(int i8, ComparisonType comparisonType) {
                comparisonType.getClass();
                ensureComparisonTypesIsMutable();
                ((z) this.comparisonTypes_).m(i8, comparisonType.getNumber());
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"bitField0_", "dataType_", "comparisonTypes_", ComparisonType.internalGetVerifier()});
                    case 3:
                        return new SupportedMilestoneEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<SupportedMilestoneEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (SupportedMilestoneEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public ComparisonType getComparisonTypes(int i8) {
                ComparisonType forNumber = ComparisonType.forNumber(((z) this.comparisonTypes_).l(i8));
                return forNumber == null ? ComparisonType.COMPARISON_TYPE_UNKNOWN : forNumber;
            }

            public int getComparisonTypesCount() {
                return ((z) this.comparisonTypes_).f3832h;
            }

            public List<ComparisonType> getComparisonTypesList() {
                return new a0.h(this.comparisonTypes_, comparisonTypes_converter_);
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface SupportedMilestoneEntryOrBuilder extends s0 {
            ComparisonType getComparisonTypes(int i8);

            int getComparisonTypesCount();

            List<ComparisonType> getComparisonTypesList();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            ExerciseTypeCapabilities exerciseTypeCapabilities = new ExerciseTypeCapabilities();
            DEFAULT_INSTANCE = exerciseTypeCapabilities;
            y.registerDefaultInstance(ExerciseTypeCapabilities.class, exerciseTypeCapabilities);
        }

        private ExerciseTypeCapabilities() {
        }

        /* access modifiers changed from: private */
        public void addAllSupportedDataTypes(Iterable<? extends DataType> iterable) {
            ensureSupportedDataTypesIsMutable();
            a.addAll(iterable, this.supportedDataTypes_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedGoals(Iterable<? extends SupportedGoalEntry> iterable) {
            ensureSupportedGoalsIsMutable();
            a.addAll(iterable, this.supportedGoals_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedMilestones(Iterable<? extends SupportedMilestoneEntry> iterable) {
            ensureSupportedMilestonesIsMutable();
            a.addAll(iterable, this.supportedMilestones_);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypes(DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedGoals(int i8, SupportedGoalEntry supportedGoalEntry) {
            supportedGoalEntry.getClass();
            ensureSupportedGoalsIsMutable();
            this.supportedGoals_.add(i8, supportedGoalEntry);
        }

        /* access modifiers changed from: private */
        public void addSupportedGoals(SupportedGoalEntry supportedGoalEntry) {
            supportedGoalEntry.getClass();
            ensureSupportedGoalsIsMutable();
            this.supportedGoals_.add(supportedGoalEntry);
        }

        /* access modifiers changed from: private */
        public void addSupportedMilestones(int i8, SupportedMilestoneEntry supportedMilestoneEntry) {
            supportedMilestoneEntry.getClass();
            ensureSupportedMilestonesIsMutable();
            this.supportedMilestones_.add(i8, supportedMilestoneEntry);
        }

        /* access modifiers changed from: private */
        public void addSupportedMilestones(SupportedMilestoneEntry supportedMilestoneEntry) {
            supportedMilestoneEntry.getClass();
            ensureSupportedMilestonesIsMutable();
            this.supportedMilestones_.add(supportedMilestoneEntry);
        }

        /* access modifiers changed from: private */
        public void clearIsAutoPauseAndResumeSupported() {
            this.bitField0_ &= -2;
            this.isAutoPauseAndResumeSupported_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsLapsSupported() {
            this.bitField0_ &= -3;
            this.isLapsSupported_ = false;
        }

        /* access modifiers changed from: private */
        public void clearSupportedDataTypes() {
            this.supportedDataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedGoals() {
            this.supportedGoals_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedMilestones() {
            this.supportedMilestones_ = y.emptyProtobufList();
        }

        private void ensureSupportedDataTypesIsMutable() {
            a0.j<DataType> jVar = this.supportedDataTypes_;
            if (!jVar.f()) {
                this.supportedDataTypes_ = y.mutableCopy(jVar);
            }
        }

        private void ensureSupportedGoalsIsMutable() {
            a0.j<SupportedGoalEntry> jVar = this.supportedGoals_;
            if (!jVar.f()) {
                this.supportedGoals_ = y.mutableCopy(jVar);
            }
        }

        private void ensureSupportedMilestonesIsMutable() {
            a0.j<SupportedMilestoneEntry> jVar = this.supportedMilestones_;
            if (!jVar.f()) {
                this.supportedMilestones_ = y.mutableCopy(jVar);
            }
        }

        public static ExerciseTypeCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseTypeCapabilities exerciseTypeCapabilities) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseTypeCapabilities);
        }

        public static ExerciseTypeCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseTypeCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseTypeCapabilities parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseTypeCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseTypeCapabilities parseFrom(i iVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseTypeCapabilities parseFrom(i iVar, q qVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseTypeCapabilities parseFrom(j jVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseTypeCapabilities parseFrom(j jVar, q qVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseTypeCapabilities parseFrom(InputStream inputStream) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseTypeCapabilities parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseTypeCapabilities parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseTypeCapabilities parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseTypeCapabilities parseFrom(byte[] bArr) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseTypeCapabilities parseFrom(byte[] bArr, q qVar) {
            return (ExerciseTypeCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseTypeCapabilities> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSupportedDataTypes(int i8) {
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeSupportedGoals(int i8) {
            ensureSupportedGoalsIsMutable();
            this.supportedGoals_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeSupportedMilestones(int i8) {
            ensureSupportedMilestonesIsMutable();
            this.supportedMilestones_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setIsAutoPauseAndResumeSupported(boolean z8) {
            this.bitField0_ |= 1;
            this.isAutoPauseAndResumeSupported_ = z8;
        }

        /* access modifiers changed from: private */
        public void setIsLapsSupported(boolean z8) {
            this.bitField0_ |= 2;
            this.isLapsSupported_ = z8;
        }

        /* access modifiers changed from: private */
        public void setSupportedDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setSupportedGoals(int i8, SupportedGoalEntry supportedGoalEntry) {
            supportedGoalEntry.getClass();
            ensureSupportedGoalsIsMutable();
            this.supportedGoals_.set(i8, supportedGoalEntry);
        }

        /* access modifiers changed from: private */
        public void setSupportedMilestones(int i8, SupportedMilestoneEntry supportedMilestoneEntry) {
            supportedMilestoneEntry.getClass();
            ensureSupportedMilestonesIsMutable();
            this.supportedMilestones_.set(i8, supportedMilestoneEntry);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005ဇ\u0001", new Object[]{"bitField0_", "supportedDataTypes_", DataType.class, "supportedGoals_", SupportedGoalEntry.class, "supportedMilestones_", SupportedMilestoneEntry.class, "isAutoPauseAndResumeSupported_", "isLapsSupported_"});
                case 3:
                    return new ExerciseTypeCapabilities();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseTypeCapabilities> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseTypeCapabilities.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getIsAutoPauseAndResumeSupported() {
            return this.isAutoPauseAndResumeSupported_;
        }

        public boolean getIsLapsSupported() {
            return this.isLapsSupported_;
        }

        public DataType getSupportedDataTypes(int i8) {
            return this.supportedDataTypes_.get(i8);
        }

        public int getSupportedDataTypesCount() {
            return this.supportedDataTypes_.size();
        }

        public List<DataType> getSupportedDataTypesList() {
            return this.supportedDataTypes_;
        }

        public DataTypeOrBuilder getSupportedDataTypesOrBuilder(int i8) {
            return this.supportedDataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getSupportedDataTypesOrBuilderList() {
            return this.supportedDataTypes_;
        }

        public SupportedGoalEntry getSupportedGoals(int i8) {
            return this.supportedGoals_.get(i8);
        }

        public int getSupportedGoalsCount() {
            return this.supportedGoals_.size();
        }

        public List<SupportedGoalEntry> getSupportedGoalsList() {
            return this.supportedGoals_;
        }

        public SupportedGoalEntryOrBuilder getSupportedGoalsOrBuilder(int i8) {
            return this.supportedGoals_.get(i8);
        }

        public List<? extends SupportedGoalEntryOrBuilder> getSupportedGoalsOrBuilderList() {
            return this.supportedGoals_;
        }

        public SupportedMilestoneEntry getSupportedMilestones(int i8) {
            return this.supportedMilestones_.get(i8);
        }

        public int getSupportedMilestonesCount() {
            return this.supportedMilestones_.size();
        }

        public List<SupportedMilestoneEntry> getSupportedMilestonesList() {
            return this.supportedMilestones_;
        }

        public SupportedMilestoneEntryOrBuilder getSupportedMilestonesOrBuilder(int i8) {
            return this.supportedMilestones_.get(i8);
        }

        public List<? extends SupportedMilestoneEntryOrBuilder> getSupportedMilestonesOrBuilderList() {
            return this.supportedMilestones_;
        }

        public boolean hasIsAutoPauseAndResumeSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIsLapsSupported() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface ExerciseTypeCapabilitiesOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        boolean getIsAutoPauseAndResumeSupported();

        boolean getIsLapsSupported();

        DataType getSupportedDataTypes(int i8);

        int getSupportedDataTypesCount();

        List<DataType> getSupportedDataTypesList();

        ExerciseTypeCapabilities.SupportedGoalEntry getSupportedGoals(int i8);

        int getSupportedGoalsCount();

        List<ExerciseTypeCapabilities.SupportedGoalEntry> getSupportedGoalsList();

        ExerciseTypeCapabilities.SupportedMilestoneEntry getSupportedMilestones(int i8);

        int getSupportedMilestonesCount();

        List<ExerciseTypeCapabilities.SupportedMilestoneEntry> getSupportedMilestonesList();

        boolean hasIsAutoPauseAndResumeSupported();

        boolean hasIsLapsSupported();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseUpdate extends y<ExerciseUpdate, Builder> implements ExerciseUpdateOrBuilder {
        public static final int ACTIVE_DURATION_CHECKPOINT_FIELD_NUMBER = 10;
        public static final int ACTIVE_DURATION_MS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final ExerciseUpdate DEFAULT_INSTANCE;
        public static final int EXERCISE_CONFIG_FIELD_NUMBER = 7;
        public static final int EXERCISE_END_REASON_FIELD_NUMBER = 11;
        public static final int LATEST_ACHIEVED_GOALS_FIELD_NUMBER = 5;
        public static final int LATEST_AGGREGATE_METRICS_FIELD_NUMBER = 8;
        public static final int LATEST_METRICS_FIELD_NUMBER = 4;
        public static final int MILE_STONE_MARKER_SUMMARIES_FIELD_NUMBER = 6;
        private static volatile z0<ExerciseUpdate> PARSER = null;
        public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int UPDATE_DURATION_FROM_BOOT_MS_FIELD_NUMBER = 9;
        private ActiveDurationCheckpoint activeDurationCheckpoint_;
        private long activeDurationMs_;
        private int bitField0_;
        private ExerciseConfig exerciseConfig_;
        private int exerciseEndReason_;
        private a0.j<AchievedExerciseGoal> latestAchievedGoals_ = y.emptyProtobufList();
        private a0.j<AggregateDataPoint> latestAggregateMetrics_ = y.emptyProtobufList();
        private a0.j<LatestMetricsEntry> latestMetrics_ = y.emptyProtobufList();
        private a0.j<MilestoneMarkerSummary> mileStoneMarkerSummaries_ = y.emptyProtobufList();
        private long startTimeEpochMs_;
        private int state_;
        private long updateDurationFromBootMs_;

        public static final class ActiveDurationCheckpoint extends y<ActiveDurationCheckpoint, Builder> implements ActiveDurationCheckpointOrBuilder {
            public static final int ACTIVE_DURATION_MS_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final ActiveDurationCheckpoint DEFAULT_INSTANCE;
            private static volatile z0<ActiveDurationCheckpoint> PARSER = null;
            public static final int TIME_EPOCH_MS_FIELD_NUMBER = 1;
            private long activeDurationMs_;
            private int bitField0_;
            private long timeEpochMs_;

            public static final class Builder extends y.a<ActiveDurationCheckpoint, Builder> implements ActiveDurationCheckpointOrBuilder {
                private Builder() {
                    super(ActiveDurationCheckpoint.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearActiveDurationMs() {
                    copyOnWrite();
                    ((ActiveDurationCheckpoint) this.instance).clearActiveDurationMs();
                    return this;
                }

                public Builder clearTimeEpochMs() {
                    copyOnWrite();
                    ((ActiveDurationCheckpoint) this.instance).clearTimeEpochMs();
                    return this;
                }

                public long getActiveDurationMs() {
                    return ((ActiveDurationCheckpoint) this.instance).getActiveDurationMs();
                }

                public long getTimeEpochMs() {
                    return ((ActiveDurationCheckpoint) this.instance).getTimeEpochMs();
                }

                public boolean hasActiveDurationMs() {
                    return ((ActiveDurationCheckpoint) this.instance).hasActiveDurationMs();
                }

                public boolean hasTimeEpochMs() {
                    return ((ActiveDurationCheckpoint) this.instance).hasTimeEpochMs();
                }

                public Builder setActiveDurationMs(long j8) {
                    copyOnWrite();
                    ((ActiveDurationCheckpoint) this.instance).setActiveDurationMs(j8);
                    return this;
                }

                public Builder setTimeEpochMs(long j8) {
                    copyOnWrite();
                    ((ActiveDurationCheckpoint) this.instance).setTimeEpochMs(j8);
                    return this;
                }
            }

            static {
                ActiveDurationCheckpoint activeDurationCheckpoint = new ActiveDurationCheckpoint();
                DEFAULT_INSTANCE = activeDurationCheckpoint;
                y.registerDefaultInstance(ActiveDurationCheckpoint.class, activeDurationCheckpoint);
            }

            private ActiveDurationCheckpoint() {
            }

            /* access modifiers changed from: private */
            public void clearActiveDurationMs() {
                this.bitField0_ &= -3;
                this.activeDurationMs_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearTimeEpochMs() {
                this.bitField0_ &= -2;
                this.timeEpochMs_ = 0;
            }

            public static ActiveDurationCheckpoint getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(ActiveDurationCheckpoint activeDurationCheckpoint) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(activeDurationCheckpoint);
            }

            public static ActiveDurationCheckpoint parseDelimitedFrom(InputStream inputStream) {
                return (ActiveDurationCheckpoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ActiveDurationCheckpoint parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (ActiveDurationCheckpoint) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static ActiveDurationCheckpoint parseFrom(i iVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static ActiveDurationCheckpoint parseFrom(i iVar, q qVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static ActiveDurationCheckpoint parseFrom(j jVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static ActiveDurationCheckpoint parseFrom(j jVar, q qVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static ActiveDurationCheckpoint parseFrom(InputStream inputStream) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ActiveDurationCheckpoint parseFrom(InputStream inputStream, q qVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static ActiveDurationCheckpoint parseFrom(ByteBuffer byteBuffer) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static ActiveDurationCheckpoint parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static ActiveDurationCheckpoint parseFrom(byte[] bArr) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ActiveDurationCheckpoint parseFrom(byte[] bArr, q qVar) {
                return (ActiveDurationCheckpoint) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<ActiveDurationCheckpoint> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setActiveDurationMs(long j8) {
                this.bitField0_ |= 2;
                this.activeDurationMs_ = j8;
            }

            /* access modifiers changed from: private */
            public void setTimeEpochMs(long j8) {
                this.bitField0_ |= 1;
                this.timeEpochMs_ = j8;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "timeEpochMs_", "activeDurationMs_"});
                    case 3:
                        return new ActiveDurationCheckpoint();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<ActiveDurationCheckpoint> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (ActiveDurationCheckpoint.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public long getActiveDurationMs() {
                return this.activeDurationMs_;
            }

            public long getTimeEpochMs() {
                return this.timeEpochMs_;
            }

            public boolean hasActiveDurationMs() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasTimeEpochMs() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface ActiveDurationCheckpointOrBuilder extends s0 {
            long getActiveDurationMs();

            /* synthetic */ r0 getDefaultInstanceForType();

            long getTimeEpochMs();

            boolean hasActiveDurationMs();

            boolean hasTimeEpochMs();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends y.a<ExerciseUpdate, Builder> implements ExerciseUpdateOrBuilder {
            private Builder() {
                super(ExerciseUpdate.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllLatestAchievedGoals(Iterable<? extends AchievedExerciseGoal> iterable) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addAllLatestAchievedGoals(iterable);
                return this;
            }

            public Builder addAllLatestAggregateMetrics(Iterable<? extends AggregateDataPoint> iterable) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addAllLatestAggregateMetrics(iterable);
                return this;
            }

            public Builder addAllLatestMetrics(Iterable<? extends LatestMetricsEntry> iterable) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addAllLatestMetrics(iterable);
                return this;
            }

            public Builder addAllMileStoneMarkerSummaries(Iterable<? extends MilestoneMarkerSummary> iterable) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addAllMileStoneMarkerSummaries(iterable);
                return this;
            }

            public Builder addLatestAchievedGoals(int i8, AchievedExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAchievedGoals(i8, (AchievedExerciseGoal) builder.build());
                return this;
            }

            public Builder addLatestAchievedGoals(int i8, AchievedExerciseGoal achievedExerciseGoal) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAchievedGoals(i8, achievedExerciseGoal);
                return this;
            }

            public Builder addLatestAchievedGoals(AchievedExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAchievedGoals((AchievedExerciseGoal) builder.build());
                return this;
            }

            public Builder addLatestAchievedGoals(AchievedExerciseGoal achievedExerciseGoal) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAchievedGoals(achievedExerciseGoal);
                return this;
            }

            public Builder addLatestAggregateMetrics(int i8, AggregateDataPoint.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAggregateMetrics(i8, (AggregateDataPoint) builder.build());
                return this;
            }

            public Builder addLatestAggregateMetrics(int i8, AggregateDataPoint aggregateDataPoint) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAggregateMetrics(i8, aggregateDataPoint);
                return this;
            }

            public Builder addLatestAggregateMetrics(AggregateDataPoint.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAggregateMetrics((AggregateDataPoint) builder.build());
                return this;
            }

            public Builder addLatestAggregateMetrics(AggregateDataPoint aggregateDataPoint) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestAggregateMetrics(aggregateDataPoint);
                return this;
            }

            public Builder addLatestMetrics(int i8, LatestMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestMetrics(i8, (LatestMetricsEntry) builder.build());
                return this;
            }

            public Builder addLatestMetrics(int i8, LatestMetricsEntry latestMetricsEntry) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestMetrics(i8, latestMetricsEntry);
                return this;
            }

            public Builder addLatestMetrics(LatestMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestMetrics((LatestMetricsEntry) builder.build());
                return this;
            }

            public Builder addLatestMetrics(LatestMetricsEntry latestMetricsEntry) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addLatestMetrics(latestMetricsEntry);
                return this;
            }

            public Builder addMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addMileStoneMarkerSummaries(i8, (MilestoneMarkerSummary) builder.build());
                return this;
            }

            public Builder addMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary milestoneMarkerSummary) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addMileStoneMarkerSummaries(i8, milestoneMarkerSummary);
                return this;
            }

            public Builder addMileStoneMarkerSummaries(MilestoneMarkerSummary.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addMileStoneMarkerSummaries((MilestoneMarkerSummary) builder.build());
                return this;
            }

            public Builder addMileStoneMarkerSummaries(MilestoneMarkerSummary milestoneMarkerSummary) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).addMileStoneMarkerSummaries(milestoneMarkerSummary);
                return this;
            }

            public Builder clearActiveDurationCheckpoint() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearActiveDurationCheckpoint();
                return this;
            }

            public Builder clearActiveDurationMs() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearActiveDurationMs();
                return this;
            }

            public Builder clearExerciseConfig() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearExerciseConfig();
                return this;
            }

            public Builder clearExerciseEndReason() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearExerciseEndReason();
                return this;
            }

            public Builder clearLatestAchievedGoals() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearLatestAchievedGoals();
                return this;
            }

            public Builder clearLatestAggregateMetrics() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearLatestAggregateMetrics();
                return this;
            }

            public Builder clearLatestMetrics() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearLatestMetrics();
                return this;
            }

            public Builder clearMileStoneMarkerSummaries() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearMileStoneMarkerSummaries();
                return this;
            }

            public Builder clearStartTimeEpochMs() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearStartTimeEpochMs();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearState();
                return this;
            }

            public Builder clearUpdateDurationFromBootMs() {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).clearUpdateDurationFromBootMs();
                return this;
            }

            public ActiveDurationCheckpoint getActiveDurationCheckpoint() {
                return ((ExerciseUpdate) this.instance).getActiveDurationCheckpoint();
            }

            public long getActiveDurationMs() {
                return ((ExerciseUpdate) this.instance).getActiveDurationMs();
            }

            public ExerciseConfig getExerciseConfig() {
                return ((ExerciseUpdate) this.instance).getExerciseConfig();
            }

            public ExerciseEndReason getExerciseEndReason() {
                return ((ExerciseUpdate) this.instance).getExerciseEndReason();
            }

            public AchievedExerciseGoal getLatestAchievedGoals(int i8) {
                return ((ExerciseUpdate) this.instance).getLatestAchievedGoals(i8);
            }

            public int getLatestAchievedGoalsCount() {
                return ((ExerciseUpdate) this.instance).getLatestAchievedGoalsCount();
            }

            public List<AchievedExerciseGoal> getLatestAchievedGoalsList() {
                return Collections.unmodifiableList(((ExerciseUpdate) this.instance).getLatestAchievedGoalsList());
            }

            public AggregateDataPoint getLatestAggregateMetrics(int i8) {
                return ((ExerciseUpdate) this.instance).getLatestAggregateMetrics(i8);
            }

            public int getLatestAggregateMetricsCount() {
                return ((ExerciseUpdate) this.instance).getLatestAggregateMetricsCount();
            }

            public List<AggregateDataPoint> getLatestAggregateMetricsList() {
                return Collections.unmodifiableList(((ExerciseUpdate) this.instance).getLatestAggregateMetricsList());
            }

            public LatestMetricsEntry getLatestMetrics(int i8) {
                return ((ExerciseUpdate) this.instance).getLatestMetrics(i8);
            }

            public int getLatestMetricsCount() {
                return ((ExerciseUpdate) this.instance).getLatestMetricsCount();
            }

            public List<LatestMetricsEntry> getLatestMetricsList() {
                return Collections.unmodifiableList(((ExerciseUpdate) this.instance).getLatestMetricsList());
            }

            public MilestoneMarkerSummary getMileStoneMarkerSummaries(int i8) {
                return ((ExerciseUpdate) this.instance).getMileStoneMarkerSummaries(i8);
            }

            public int getMileStoneMarkerSummariesCount() {
                return ((ExerciseUpdate) this.instance).getMileStoneMarkerSummariesCount();
            }

            public List<MilestoneMarkerSummary> getMileStoneMarkerSummariesList() {
                return Collections.unmodifiableList(((ExerciseUpdate) this.instance).getMileStoneMarkerSummariesList());
            }

            public long getStartTimeEpochMs() {
                return ((ExerciseUpdate) this.instance).getStartTimeEpochMs();
            }

            public ExerciseState getState() {
                return ((ExerciseUpdate) this.instance).getState();
            }

            public long getUpdateDurationFromBootMs() {
                return ((ExerciseUpdate) this.instance).getUpdateDurationFromBootMs();
            }

            public boolean hasActiveDurationCheckpoint() {
                return ((ExerciseUpdate) this.instance).hasActiveDurationCheckpoint();
            }

            public boolean hasActiveDurationMs() {
                return ((ExerciseUpdate) this.instance).hasActiveDurationMs();
            }

            public boolean hasExerciseConfig() {
                return ((ExerciseUpdate) this.instance).hasExerciseConfig();
            }

            public boolean hasExerciseEndReason() {
                return ((ExerciseUpdate) this.instance).hasExerciseEndReason();
            }

            public boolean hasStartTimeEpochMs() {
                return ((ExerciseUpdate) this.instance).hasStartTimeEpochMs();
            }

            public boolean hasState() {
                return ((ExerciseUpdate) this.instance).hasState();
            }

            public boolean hasUpdateDurationFromBootMs() {
                return ((ExerciseUpdate) this.instance).hasUpdateDurationFromBootMs();
            }

            public Builder mergeActiveDurationCheckpoint(ActiveDurationCheckpoint activeDurationCheckpoint) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).mergeActiveDurationCheckpoint(activeDurationCheckpoint);
                return this;
            }

            public Builder mergeExerciseConfig(ExerciseConfig exerciseConfig) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).mergeExerciseConfig(exerciseConfig);
                return this;
            }

            public Builder removeLatestAchievedGoals(int i8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).removeLatestAchievedGoals(i8);
                return this;
            }

            public Builder removeLatestAggregateMetrics(int i8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).removeLatestAggregateMetrics(i8);
                return this;
            }

            public Builder removeLatestMetrics(int i8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).removeLatestMetrics(i8);
                return this;
            }

            public Builder removeMileStoneMarkerSummaries(int i8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).removeMileStoneMarkerSummaries(i8);
                return this;
            }

            public Builder setActiveDurationCheckpoint(ActiveDurationCheckpoint.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setActiveDurationCheckpoint((ActiveDurationCheckpoint) builder.build());
                return this;
            }

            public Builder setActiveDurationCheckpoint(ActiveDurationCheckpoint activeDurationCheckpoint) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setActiveDurationCheckpoint(activeDurationCheckpoint);
                return this;
            }

            public Builder setActiveDurationMs(long j8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setActiveDurationMs(j8);
                return this;
            }

            public Builder setExerciseConfig(ExerciseConfig.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setExerciseConfig((ExerciseConfig) builder.build());
                return this;
            }

            public Builder setExerciseConfig(ExerciseConfig exerciseConfig) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setExerciseConfig(exerciseConfig);
                return this;
            }

            public Builder setExerciseEndReason(ExerciseEndReason exerciseEndReason) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setExerciseEndReason(exerciseEndReason);
                return this;
            }

            public Builder setLatestAchievedGoals(int i8, AchievedExerciseGoal.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestAchievedGoals(i8, (AchievedExerciseGoal) builder.build());
                return this;
            }

            public Builder setLatestAchievedGoals(int i8, AchievedExerciseGoal achievedExerciseGoal) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestAchievedGoals(i8, achievedExerciseGoal);
                return this;
            }

            public Builder setLatestAggregateMetrics(int i8, AggregateDataPoint.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestAggregateMetrics(i8, (AggregateDataPoint) builder.build());
                return this;
            }

            public Builder setLatestAggregateMetrics(int i8, AggregateDataPoint aggregateDataPoint) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestAggregateMetrics(i8, aggregateDataPoint);
                return this;
            }

            public Builder setLatestMetrics(int i8, LatestMetricsEntry.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestMetrics(i8, (LatestMetricsEntry) builder.build());
                return this;
            }

            public Builder setLatestMetrics(int i8, LatestMetricsEntry latestMetricsEntry) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setLatestMetrics(i8, latestMetricsEntry);
                return this;
            }

            public Builder setMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setMileStoneMarkerSummaries(i8, (MilestoneMarkerSummary) builder.build());
                return this;
            }

            public Builder setMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary milestoneMarkerSummary) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setMileStoneMarkerSummaries(i8, milestoneMarkerSummary);
                return this;
            }

            public Builder setStartTimeEpochMs(long j8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setStartTimeEpochMs(j8);
                return this;
            }

            public Builder setState(ExerciseState exerciseState) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setState(exerciseState);
                return this;
            }

            public Builder setUpdateDurationFromBootMs(long j8) {
                copyOnWrite();
                ((ExerciseUpdate) this.instance).setUpdateDurationFromBootMs(j8);
                return this;
            }
        }

        public static final class LatestMetricsEntry extends y<LatestMetricsEntry, Builder> implements LatestMetricsEntryOrBuilder {
            public static final int DATA_POINTS_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final LatestMetricsEntry DEFAULT_INSTANCE;
            private static volatile z0<LatestMetricsEntry> PARSER;
            private int bitField0_;
            private a0.j<DataPoint> dataPoints_ = y.emptyProtobufList();
            private DataType dataType_;

            public static final class Builder extends y.a<LatestMetricsEntry, Builder> implements LatestMetricsEntryOrBuilder {
                private Builder() {
                    super(LatestMetricsEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder addAllDataPoints(Iterable<? extends DataPoint> iterable) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).addAllDataPoints(iterable);
                    return this;
                }

                public Builder addDataPoints(int i8, DataPoint.Builder builder) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).addDataPoints(i8, (DataPoint) builder.build());
                    return this;
                }

                public Builder addDataPoints(int i8, DataPoint dataPoint) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).addDataPoints(i8, dataPoint);
                    return this;
                }

                public Builder addDataPoints(DataPoint.Builder builder) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).addDataPoints((DataPoint) builder.build());
                    return this;
                }

                public Builder addDataPoints(DataPoint dataPoint) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).addDataPoints(dataPoint);
                    return this;
                }

                public Builder clearDataPoints() {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).clearDataPoints();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).clearDataType();
                    return this;
                }

                public DataPoint getDataPoints(int i8) {
                    return ((LatestMetricsEntry) this.instance).getDataPoints(i8);
                }

                public int getDataPointsCount() {
                    return ((LatestMetricsEntry) this.instance).getDataPointsCount();
                }

                public List<DataPoint> getDataPointsList() {
                    return Collections.unmodifiableList(((LatestMetricsEntry) this.instance).getDataPointsList());
                }

                public DataType getDataType() {
                    return ((LatestMetricsEntry) this.instance).getDataType();
                }

                public boolean hasDataType() {
                    return ((LatestMetricsEntry) this.instance).hasDataType();
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder removeDataPoints(int i8) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).removeDataPoints(i8);
                    return this;
                }

                public Builder setDataPoints(int i8, DataPoint.Builder builder) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).setDataPoints(i8, (DataPoint) builder.build());
                    return this;
                }

                public Builder setDataPoints(int i8, DataPoint dataPoint) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).setDataPoints(i8, dataPoint);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((LatestMetricsEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                LatestMetricsEntry latestMetricsEntry = new LatestMetricsEntry();
                DEFAULT_INSTANCE = latestMetricsEntry;
                y.registerDefaultInstance(LatestMetricsEntry.class, latestMetricsEntry);
            }

            private LatestMetricsEntry() {
            }

            /* access modifiers changed from: private */
            public void addAllDataPoints(Iterable<? extends DataPoint> iterable) {
                ensureDataPointsIsMutable();
                a.addAll(iterable, this.dataPoints_);
            }

            /* access modifiers changed from: private */
            public void addDataPoints(int i8, DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.add(i8, dataPoint);
            }

            /* access modifiers changed from: private */
            public void addDataPoints(DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.add(dataPoint);
            }

            /* access modifiers changed from: private */
            public void clearDataPoints() {
                this.dataPoints_ = y.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            private void ensureDataPointsIsMutable() {
                a0.j<DataPoint> jVar = this.dataPoints_;
                if (!jVar.f()) {
                    this.dataPoints_ = y.mutableCopy(jVar);
                }
            }

            public static LatestMetricsEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(LatestMetricsEntry latestMetricsEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(latestMetricsEntry);
            }

            public static LatestMetricsEntry parseDelimitedFrom(InputStream inputStream) {
                return (LatestMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LatestMetricsEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (LatestMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LatestMetricsEntry parseFrom(i iVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static LatestMetricsEntry parseFrom(i iVar, q qVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static LatestMetricsEntry parseFrom(j jVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static LatestMetricsEntry parseFrom(j jVar, q qVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static LatestMetricsEntry parseFrom(InputStream inputStream) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LatestMetricsEntry parseFrom(InputStream inputStream, q qVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static LatestMetricsEntry parseFrom(ByteBuffer byteBuffer) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static LatestMetricsEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static LatestMetricsEntry parseFrom(byte[] bArr) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LatestMetricsEntry parseFrom(byte[] bArr, q qVar) {
                return (LatestMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<LatestMetricsEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeDataPoints(int i8) {
                ensureDataPointsIsMutable();
                this.dataPoints_.remove(i8);
            }

            /* access modifiers changed from: private */
            public void setDataPoints(int i8, DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.set(i8, dataPoint);
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "dataType_", "dataPoints_", DataPoint.class});
                    case 3:
                        return new LatestMetricsEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<LatestMetricsEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (LatestMetricsEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public DataPoint getDataPoints(int i8) {
                return this.dataPoints_.get(i8);
            }

            public int getDataPointsCount() {
                return this.dataPoints_.size();
            }

            public List<DataPoint> getDataPointsList() {
                return this.dataPoints_;
            }

            public DataPointOrBuilder getDataPointsOrBuilder(int i8) {
                return this.dataPoints_.get(i8);
            }

            public List<? extends DataPointOrBuilder> getDataPointsOrBuilderList() {
                return this.dataPoints_;
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface LatestMetricsEntryOrBuilder extends s0 {
            DataPoint getDataPoints(int i8);

            int getDataPointsCount();

            List<DataPoint> getDataPointsList();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            ExerciseUpdate exerciseUpdate = new ExerciseUpdate();
            DEFAULT_INSTANCE = exerciseUpdate;
            y.registerDefaultInstance(ExerciseUpdate.class, exerciseUpdate);
        }

        private ExerciseUpdate() {
        }

        /* access modifiers changed from: private */
        public void addAllLatestAchievedGoals(Iterable<? extends AchievedExerciseGoal> iterable) {
            ensureLatestAchievedGoalsIsMutable();
            a.addAll(iterable, this.latestAchievedGoals_);
        }

        /* access modifiers changed from: private */
        public void addAllLatestAggregateMetrics(Iterable<? extends AggregateDataPoint> iterable) {
            ensureLatestAggregateMetricsIsMutable();
            a.addAll(iterable, this.latestAggregateMetrics_);
        }

        /* access modifiers changed from: private */
        public void addAllLatestMetrics(Iterable<? extends LatestMetricsEntry> iterable) {
            ensureLatestMetricsIsMutable();
            a.addAll(iterable, this.latestMetrics_);
        }

        /* access modifiers changed from: private */
        public void addAllMileStoneMarkerSummaries(Iterable<? extends MilestoneMarkerSummary> iterable) {
            ensureMileStoneMarkerSummariesIsMutable();
            a.addAll(iterable, this.mileStoneMarkerSummaries_);
        }

        /* access modifiers changed from: private */
        public void addLatestAchievedGoals(int i8, AchievedExerciseGoal achievedExerciseGoal) {
            achievedExerciseGoal.getClass();
            ensureLatestAchievedGoalsIsMutable();
            this.latestAchievedGoals_.add(i8, achievedExerciseGoal);
        }

        /* access modifiers changed from: private */
        public void addLatestAchievedGoals(AchievedExerciseGoal achievedExerciseGoal) {
            achievedExerciseGoal.getClass();
            ensureLatestAchievedGoalsIsMutable();
            this.latestAchievedGoals_.add(achievedExerciseGoal);
        }

        /* access modifiers changed from: private */
        public void addLatestAggregateMetrics(int i8, AggregateDataPoint aggregateDataPoint) {
            aggregateDataPoint.getClass();
            ensureLatestAggregateMetricsIsMutable();
            this.latestAggregateMetrics_.add(i8, aggregateDataPoint);
        }

        /* access modifiers changed from: private */
        public void addLatestAggregateMetrics(AggregateDataPoint aggregateDataPoint) {
            aggregateDataPoint.getClass();
            ensureLatestAggregateMetricsIsMutable();
            this.latestAggregateMetrics_.add(aggregateDataPoint);
        }

        /* access modifiers changed from: private */
        public void addLatestMetrics(int i8, LatestMetricsEntry latestMetricsEntry) {
            latestMetricsEntry.getClass();
            ensureLatestMetricsIsMutable();
            this.latestMetrics_.add(i8, latestMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void addLatestMetrics(LatestMetricsEntry latestMetricsEntry) {
            latestMetricsEntry.getClass();
            ensureLatestMetricsIsMutable();
            this.latestMetrics_.add(latestMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void addMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary milestoneMarkerSummary) {
            milestoneMarkerSummary.getClass();
            ensureMileStoneMarkerSummariesIsMutable();
            this.mileStoneMarkerSummaries_.add(i8, milestoneMarkerSummary);
        }

        /* access modifiers changed from: private */
        public void addMileStoneMarkerSummaries(MilestoneMarkerSummary milestoneMarkerSummary) {
            milestoneMarkerSummary.getClass();
            ensureMileStoneMarkerSummariesIsMutable();
            this.mileStoneMarkerSummaries_.add(milestoneMarkerSummary);
        }

        /* access modifiers changed from: private */
        public void clearActiveDurationCheckpoint() {
            this.activeDurationCheckpoint_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearActiveDurationMs() {
            this.bitField0_ &= -5;
            this.activeDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExerciseConfig() {
            this.exerciseConfig_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearExerciseEndReason() {
            this.bitField0_ &= -65;
            this.exerciseEndReason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLatestAchievedGoals() {
            this.latestAchievedGoals_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLatestAggregateMetrics() {
            this.latestAggregateMetrics_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLatestMetrics() {
            this.latestMetrics_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMileStoneMarkerSummaries() {
            this.mileStoneMarkerSummaries_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearStartTimeEpochMs() {
            this.bitField0_ &= -3;
            this.startTimeEpochMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUpdateDurationFromBootMs() {
            this.bitField0_ &= -9;
            this.updateDurationFromBootMs_ = 0;
        }

        private void ensureLatestAchievedGoalsIsMutable() {
            a0.j<AchievedExerciseGoal> jVar = this.latestAchievedGoals_;
            if (!jVar.f()) {
                this.latestAchievedGoals_ = y.mutableCopy(jVar);
            }
        }

        private void ensureLatestAggregateMetricsIsMutable() {
            a0.j<AggregateDataPoint> jVar = this.latestAggregateMetrics_;
            if (!jVar.f()) {
                this.latestAggregateMetrics_ = y.mutableCopy(jVar);
            }
        }

        private void ensureLatestMetricsIsMutable() {
            a0.j<LatestMetricsEntry> jVar = this.latestMetrics_;
            if (!jVar.f()) {
                this.latestMetrics_ = y.mutableCopy(jVar);
            }
        }

        private void ensureMileStoneMarkerSummariesIsMutable() {
            a0.j<MilestoneMarkerSummary> jVar = this.mileStoneMarkerSummaries_;
            if (!jVar.f()) {
                this.mileStoneMarkerSummaries_ = y.mutableCopy(jVar);
            }
        }

        public static ExerciseUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeActiveDurationCheckpoint(ActiveDurationCheckpoint activeDurationCheckpoint) {
            activeDurationCheckpoint.getClass();
            ActiveDurationCheckpoint activeDurationCheckpoint2 = this.activeDurationCheckpoint_;
            if (!(activeDurationCheckpoint2 == null || activeDurationCheckpoint2 == ActiveDurationCheckpoint.getDefaultInstance())) {
                activeDurationCheckpoint = (ActiveDurationCheckpoint) ((ActiveDurationCheckpoint.Builder) ActiveDurationCheckpoint.newBuilder(this.activeDurationCheckpoint_).mergeFrom(activeDurationCheckpoint)).buildPartial();
            }
            this.activeDurationCheckpoint_ = activeDurationCheckpoint;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseConfig(ExerciseConfig exerciseConfig) {
            exerciseConfig.getClass();
            ExerciseConfig exerciseConfig2 = this.exerciseConfig_;
            if (!(exerciseConfig2 == null || exerciseConfig2 == ExerciseConfig.getDefaultInstance())) {
                exerciseConfig = (ExerciseConfig) ((ExerciseConfig.Builder) ExerciseConfig.newBuilder(this.exerciseConfig_).mergeFrom(exerciseConfig)).buildPartial();
            }
            this.exerciseConfig_ = exerciseConfig;
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseUpdate exerciseUpdate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseUpdate);
        }

        public static ExerciseUpdate parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseUpdate) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdate parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdate) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdate parseFrom(i iVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseUpdate parseFrom(i iVar, q qVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseUpdate parseFrom(j jVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseUpdate parseFrom(j jVar, q qVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseUpdate parseFrom(InputStream inputStream) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdate parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdate parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseUpdate parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseUpdate parseFrom(byte[] bArr) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseUpdate parseFrom(byte[] bArr, q qVar) {
            return (ExerciseUpdate) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeLatestAchievedGoals(int i8) {
            ensureLatestAchievedGoalsIsMutable();
            this.latestAchievedGoals_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeLatestAggregateMetrics(int i8) {
            ensureLatestAggregateMetricsIsMutable();
            this.latestAggregateMetrics_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeLatestMetrics(int i8) {
            ensureLatestMetricsIsMutable();
            this.latestMetrics_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeMileStoneMarkerSummaries(int i8) {
            ensureMileStoneMarkerSummariesIsMutable();
            this.mileStoneMarkerSummaries_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setActiveDurationCheckpoint(ActiveDurationCheckpoint activeDurationCheckpoint) {
            activeDurationCheckpoint.getClass();
            this.activeDurationCheckpoint_ = activeDurationCheckpoint;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setActiveDurationMs(long j8) {
            this.bitField0_ |= 4;
            this.activeDurationMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setExerciseConfig(ExerciseConfig exerciseConfig) {
            exerciseConfig.getClass();
            this.exerciseConfig_ = exerciseConfig;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setExerciseEndReason(ExerciseEndReason exerciseEndReason) {
            this.exerciseEndReason_ = exerciseEndReason.getNumber();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setLatestAchievedGoals(int i8, AchievedExerciseGoal achievedExerciseGoal) {
            achievedExerciseGoal.getClass();
            ensureLatestAchievedGoalsIsMutable();
            this.latestAchievedGoals_.set(i8, achievedExerciseGoal);
        }

        /* access modifiers changed from: private */
        public void setLatestAggregateMetrics(int i8, AggregateDataPoint aggregateDataPoint) {
            aggregateDataPoint.getClass();
            ensureLatestAggregateMetricsIsMutable();
            this.latestAggregateMetrics_.set(i8, aggregateDataPoint);
        }

        /* access modifiers changed from: private */
        public void setLatestMetrics(int i8, LatestMetricsEntry latestMetricsEntry) {
            latestMetricsEntry.getClass();
            ensureLatestMetricsIsMutable();
            this.latestMetrics_.set(i8, latestMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void setMileStoneMarkerSummaries(int i8, MilestoneMarkerSummary milestoneMarkerSummary) {
            milestoneMarkerSummary.getClass();
            ensureMileStoneMarkerSummariesIsMutable();
            this.mileStoneMarkerSummaries_.set(i8, milestoneMarkerSummary);
        }

        /* access modifiers changed from: private */
        public void setStartTimeEpochMs(long j8) {
            this.bitField0_ |= 2;
            this.startTimeEpochMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setState(ExerciseState exerciseState) {
            this.state_ = exerciseState.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setUpdateDurationFromBootMs(long j8) {
            this.bitField0_ |= 8;
            this.updateDurationFromBootMs_ = j8;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0004\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0004\b\u001b\tဂ\u0003\nဉ\u0005\u000bဌ\u0006", new Object[]{"bitField0_", "state_", ExerciseState.internalGetVerifier(), "startTimeEpochMs_", "activeDurationMs_", "latestMetrics_", LatestMetricsEntry.class, "latestAchievedGoals_", AchievedExerciseGoal.class, "mileStoneMarkerSummaries_", MilestoneMarkerSummary.class, "exerciseConfig_", "latestAggregateMetrics_", AggregateDataPoint.class, "updateDurationFromBootMs_", "activeDurationCheckpoint_", "exerciseEndReason_", ExerciseEndReason.internalGetVerifier()});
                case 3:
                    return new ExerciseUpdate();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseUpdate> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseUpdate.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ActiveDurationCheckpoint getActiveDurationCheckpoint() {
            ActiveDurationCheckpoint activeDurationCheckpoint = this.activeDurationCheckpoint_;
            return activeDurationCheckpoint == null ? ActiveDurationCheckpoint.getDefaultInstance() : activeDurationCheckpoint;
        }

        public long getActiveDurationMs() {
            return this.activeDurationMs_;
        }

        public ExerciseConfig getExerciseConfig() {
            ExerciseConfig exerciseConfig = this.exerciseConfig_;
            return exerciseConfig == null ? ExerciseConfig.getDefaultInstance() : exerciseConfig;
        }

        public ExerciseEndReason getExerciseEndReason() {
            ExerciseEndReason forNumber = ExerciseEndReason.forNumber(this.exerciseEndReason_);
            return forNumber == null ? ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN : forNumber;
        }

        public AchievedExerciseGoal getLatestAchievedGoals(int i8) {
            return this.latestAchievedGoals_.get(i8);
        }

        public int getLatestAchievedGoalsCount() {
            return this.latestAchievedGoals_.size();
        }

        public List<AchievedExerciseGoal> getLatestAchievedGoalsList() {
            return this.latestAchievedGoals_;
        }

        public AchievedExerciseGoalOrBuilder getLatestAchievedGoalsOrBuilder(int i8) {
            return this.latestAchievedGoals_.get(i8);
        }

        public List<? extends AchievedExerciseGoalOrBuilder> getLatestAchievedGoalsOrBuilderList() {
            return this.latestAchievedGoals_;
        }

        public AggregateDataPoint getLatestAggregateMetrics(int i8) {
            return this.latestAggregateMetrics_.get(i8);
        }

        public int getLatestAggregateMetricsCount() {
            return this.latestAggregateMetrics_.size();
        }

        public List<AggregateDataPoint> getLatestAggregateMetricsList() {
            return this.latestAggregateMetrics_;
        }

        public AggregateDataPointOrBuilder getLatestAggregateMetricsOrBuilder(int i8) {
            return this.latestAggregateMetrics_.get(i8);
        }

        public List<? extends AggregateDataPointOrBuilder> getLatestAggregateMetricsOrBuilderList() {
            return this.latestAggregateMetrics_;
        }

        public LatestMetricsEntry getLatestMetrics(int i8) {
            return this.latestMetrics_.get(i8);
        }

        public int getLatestMetricsCount() {
            return this.latestMetrics_.size();
        }

        public List<LatestMetricsEntry> getLatestMetricsList() {
            return this.latestMetrics_;
        }

        public LatestMetricsEntryOrBuilder getLatestMetricsOrBuilder(int i8) {
            return this.latestMetrics_.get(i8);
        }

        public List<? extends LatestMetricsEntryOrBuilder> getLatestMetricsOrBuilderList() {
            return this.latestMetrics_;
        }

        public MilestoneMarkerSummary getMileStoneMarkerSummaries(int i8) {
            return this.mileStoneMarkerSummaries_.get(i8);
        }

        public int getMileStoneMarkerSummariesCount() {
            return this.mileStoneMarkerSummaries_.size();
        }

        public List<MilestoneMarkerSummary> getMileStoneMarkerSummariesList() {
            return this.mileStoneMarkerSummaries_;
        }

        public MilestoneMarkerSummaryOrBuilder getMileStoneMarkerSummariesOrBuilder(int i8) {
            return this.mileStoneMarkerSummaries_.get(i8);
        }

        public List<? extends MilestoneMarkerSummaryOrBuilder> getMileStoneMarkerSummariesOrBuilderList() {
            return this.mileStoneMarkerSummaries_;
        }

        public long getStartTimeEpochMs() {
            return this.startTimeEpochMs_;
        }

        public ExerciseState getState() {
            ExerciseState forNumber = ExerciseState.forNumber(this.state_);
            return forNumber == null ? ExerciseState.EXERCISE_STATE_UNKNOWN : forNumber;
        }

        public long getUpdateDurationFromBootMs() {
            return this.updateDurationFromBootMs_;
        }

        public boolean hasActiveDurationCheckpoint() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasActiveDurationMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasExerciseConfig() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasExerciseEndReason() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasStartTimeEpochMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUpdateDurationFromBootMs() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    public interface ExerciseUpdateOrBuilder extends s0 {
        ExerciseUpdate.ActiveDurationCheckpoint getActiveDurationCheckpoint();

        long getActiveDurationMs();

        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseConfig getExerciseConfig();

        ExerciseEndReason getExerciseEndReason();

        AchievedExerciseGoal getLatestAchievedGoals(int i8);

        int getLatestAchievedGoalsCount();

        List<AchievedExerciseGoal> getLatestAchievedGoalsList();

        AggregateDataPoint getLatestAggregateMetrics(int i8);

        int getLatestAggregateMetricsCount();

        List<AggregateDataPoint> getLatestAggregateMetricsList();

        ExerciseUpdate.LatestMetricsEntry getLatestMetrics(int i8);

        int getLatestMetricsCount();

        List<ExerciseUpdate.LatestMetricsEntry> getLatestMetricsList();

        MilestoneMarkerSummary getMileStoneMarkerSummaries(int i8);

        int getMileStoneMarkerSummariesCount();

        List<MilestoneMarkerSummary> getMileStoneMarkerSummariesList();

        long getStartTimeEpochMs();

        ExerciseState getState();

        long getUpdateDurationFromBootMs();

        boolean hasActiveDurationCheckpoint();

        boolean hasActiveDurationMs();

        boolean hasExerciseConfig();

        boolean hasExerciseEndReason();

        boolean hasStartTimeEpochMs();

        boolean hasState();

        boolean hasUpdateDurationFromBootMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HealthEvent extends y<HealthEvent, Builder> implements HealthEventOrBuilder {
        /* access modifiers changed from: private */
        public static final HealthEvent DEFAULT_INSTANCE;
        public static final int EVENT_TIME_EPOCH_MS_FIELD_NUMBER = 2;
        public static final int METRICS_FIELD_NUMBER = 3;
        private static volatile z0<HealthEvent> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long eventTimeEpochMs_;
        private a0.j<MetricsEntry> metrics_ = y.emptyProtobufList();
        private int type_;

        public static final class Builder extends y.a<HealthEvent, Builder> implements HealthEventOrBuilder {
            private Builder() {
                super(HealthEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllMetrics(Iterable<? extends MetricsEntry> iterable) {
                copyOnWrite();
                ((HealthEvent) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder addMetrics(int i8, MetricsEntry.Builder builder) {
                copyOnWrite();
                ((HealthEvent) this.instance).addMetrics(i8, (MetricsEntry) builder.build());
                return this;
            }

            public Builder addMetrics(int i8, MetricsEntry metricsEntry) {
                copyOnWrite();
                ((HealthEvent) this.instance).addMetrics(i8, metricsEntry);
                return this;
            }

            public Builder addMetrics(MetricsEntry.Builder builder) {
                copyOnWrite();
                ((HealthEvent) this.instance).addMetrics((MetricsEntry) builder.build());
                return this;
            }

            public Builder addMetrics(MetricsEntry metricsEntry) {
                copyOnWrite();
                ((HealthEvent) this.instance).addMetrics(metricsEntry);
                return this;
            }

            public Builder clearEventTimeEpochMs() {
                copyOnWrite();
                ((HealthEvent) this.instance).clearEventTimeEpochMs();
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((HealthEvent) this.instance).clearMetrics();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((HealthEvent) this.instance).clearType();
                return this;
            }

            public long getEventTimeEpochMs() {
                return ((HealthEvent) this.instance).getEventTimeEpochMs();
            }

            public MetricsEntry getMetrics(int i8) {
                return ((HealthEvent) this.instance).getMetrics(i8);
            }

            public int getMetricsCount() {
                return ((HealthEvent) this.instance).getMetricsCount();
            }

            public List<MetricsEntry> getMetricsList() {
                return Collections.unmodifiableList(((HealthEvent) this.instance).getMetricsList());
            }

            public HealthEventType getType() {
                return ((HealthEvent) this.instance).getType();
            }

            public boolean hasEventTimeEpochMs() {
                return ((HealthEvent) this.instance).hasEventTimeEpochMs();
            }

            public boolean hasType() {
                return ((HealthEvent) this.instance).hasType();
            }

            public Builder removeMetrics(int i8) {
                copyOnWrite();
                ((HealthEvent) this.instance).removeMetrics(i8);
                return this;
            }

            public Builder setEventTimeEpochMs(long j8) {
                copyOnWrite();
                ((HealthEvent) this.instance).setEventTimeEpochMs(j8);
                return this;
            }

            public Builder setMetrics(int i8, MetricsEntry.Builder builder) {
                copyOnWrite();
                ((HealthEvent) this.instance).setMetrics(i8, (MetricsEntry) builder.build());
                return this;
            }

            public Builder setMetrics(int i8, MetricsEntry metricsEntry) {
                copyOnWrite();
                ((HealthEvent) this.instance).setMetrics(i8, metricsEntry);
                return this;
            }

            public Builder setType(HealthEventType healthEventType) {
                copyOnWrite();
                ((HealthEvent) this.instance).setType(healthEventType);
                return this;
            }
        }

        public enum HealthEventType implements a0.c {
            HEALTH_EVENT_TYPE_UNKNOWN(0),
            HEALTH_EVENT_TYPE_LOW_HR_DETECTED(1),
            HEALTH_EVENT_TYPE_ELEVATED_HR_DETECTED(2),
            HEALTH_EVENT_TYPE_FALL_DETECTED(3);
            
            public static final int HEALTH_EVENT_TYPE_ELEVATED_HR_DETECTED_VALUE = 2;
            public static final int HEALTH_EVENT_TYPE_FALL_DETECTED_VALUE = 3;
            public static final int HEALTH_EVENT_TYPE_LOW_HR_DETECTED_VALUE = 1;
            public static final int HEALTH_EVENT_TYPE_UNKNOWN_VALUE = 0;
            private static final a0.d<HealthEventType> internalValueMap = null;
            private final int value;

            public static final class HealthEventTypeVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new HealthEventTypeVerifier();
                }

                private HealthEventTypeVerifier() {
                }

                public boolean isInRange(int i8) {
                    return HealthEventType.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<HealthEventType>() {
                    public HealthEventType findValueByNumber(int i8) {
                        return HealthEventType.forNumber(i8);
                    }
                };
            }

            private HealthEventType(int i8) {
                this.value = i8;
            }

            public static HealthEventType forNumber(int i8) {
                if (i8 == 0) {
                    return HEALTH_EVENT_TYPE_UNKNOWN;
                }
                if (i8 == 1) {
                    return HEALTH_EVENT_TYPE_LOW_HR_DETECTED;
                }
                if (i8 == 2) {
                    return HEALTH_EVENT_TYPE_ELEVATED_HR_DETECTED;
                }
                if (i8 != 3) {
                    return null;
                }
                return HEALTH_EVENT_TYPE_FALL_DETECTED;
            }

            public static a0.d<HealthEventType> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return HealthEventTypeVerifier.INSTANCE;
            }

            @Deprecated
            public static HealthEventType valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        public static final class MetricsEntry extends y<MetricsEntry, Builder> implements MetricsEntryOrBuilder {
            public static final int DATA_POINTS_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final MetricsEntry DEFAULT_INSTANCE;
            private static volatile z0<MetricsEntry> PARSER;
            private int bitField0_;
            private a0.j<DataPoint> dataPoints_ = y.emptyProtobufList();
            private DataType dataType_;

            public static final class Builder extends y.a<MetricsEntry, Builder> implements MetricsEntryOrBuilder {
                private Builder() {
                    super(MetricsEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder addAllDataPoints(Iterable<? extends DataPoint> iterable) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).addAllDataPoints(iterable);
                    return this;
                }

                public Builder addDataPoints(int i8, DataPoint.Builder builder) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).addDataPoints(i8, (DataPoint) builder.build());
                    return this;
                }

                public Builder addDataPoints(int i8, DataPoint dataPoint) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).addDataPoints(i8, dataPoint);
                    return this;
                }

                public Builder addDataPoints(DataPoint.Builder builder) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).addDataPoints((DataPoint) builder.build());
                    return this;
                }

                public Builder addDataPoints(DataPoint dataPoint) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).addDataPoints(dataPoint);
                    return this;
                }

                public Builder clearDataPoints() {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).clearDataPoints();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).clearDataType();
                    return this;
                }

                public DataPoint getDataPoints(int i8) {
                    return ((MetricsEntry) this.instance).getDataPoints(i8);
                }

                public int getDataPointsCount() {
                    return ((MetricsEntry) this.instance).getDataPointsCount();
                }

                public List<DataPoint> getDataPointsList() {
                    return Collections.unmodifiableList(((MetricsEntry) this.instance).getDataPointsList());
                }

                public DataType getDataType() {
                    return ((MetricsEntry) this.instance).getDataType();
                }

                public boolean hasDataType() {
                    return ((MetricsEntry) this.instance).hasDataType();
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder removeDataPoints(int i8) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).removeDataPoints(i8);
                    return this;
                }

                public Builder setDataPoints(int i8, DataPoint.Builder builder) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).setDataPoints(i8, (DataPoint) builder.build());
                    return this;
                }

                public Builder setDataPoints(int i8, DataPoint dataPoint) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).setDataPoints(i8, dataPoint);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((MetricsEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                MetricsEntry metricsEntry = new MetricsEntry();
                DEFAULT_INSTANCE = metricsEntry;
                y.registerDefaultInstance(MetricsEntry.class, metricsEntry);
            }

            private MetricsEntry() {
            }

            /* access modifiers changed from: private */
            public void addAllDataPoints(Iterable<? extends DataPoint> iterable) {
                ensureDataPointsIsMutable();
                a.addAll(iterable, this.dataPoints_);
            }

            /* access modifiers changed from: private */
            public void addDataPoints(int i8, DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.add(i8, dataPoint);
            }

            /* access modifiers changed from: private */
            public void addDataPoints(DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.add(dataPoint);
            }

            /* access modifiers changed from: private */
            public void clearDataPoints() {
                this.dataPoints_ = y.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            private void ensureDataPointsIsMutable() {
                a0.j<DataPoint> jVar = this.dataPoints_;
                if (!jVar.f()) {
                    this.dataPoints_ = y.mutableCopy(jVar);
                }
            }

            public static MetricsEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(MetricsEntry metricsEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(metricsEntry);
            }

            public static MetricsEntry parseDelimitedFrom(InputStream inputStream) {
                return (MetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MetricsEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (MetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static MetricsEntry parseFrom(i iVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static MetricsEntry parseFrom(i iVar, q qVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static MetricsEntry parseFrom(j jVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static MetricsEntry parseFrom(j jVar, q qVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static MetricsEntry parseFrom(InputStream inputStream) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MetricsEntry parseFrom(InputStream inputStream, q qVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static MetricsEntry parseFrom(ByteBuffer byteBuffer) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static MetricsEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static MetricsEntry parseFrom(byte[] bArr) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MetricsEntry parseFrom(byte[] bArr, q qVar) {
                return (MetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<MetricsEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeDataPoints(int i8) {
                ensureDataPointsIsMutable();
                this.dataPoints_.remove(i8);
            }

            /* access modifiers changed from: private */
            public void setDataPoints(int i8, DataPoint dataPoint) {
                dataPoint.getClass();
                ensureDataPointsIsMutable();
                this.dataPoints_.set(i8, dataPoint);
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "dataType_", "dataPoints_", DataPoint.class});
                    case 3:
                        return new MetricsEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<MetricsEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (MetricsEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public DataPoint getDataPoints(int i8) {
                return this.dataPoints_.get(i8);
            }

            public int getDataPointsCount() {
                return this.dataPoints_.size();
            }

            public List<DataPoint> getDataPointsList() {
                return this.dataPoints_;
            }

            public DataPointOrBuilder getDataPointsOrBuilder(int i8) {
                return this.dataPoints_.get(i8);
            }

            public List<? extends DataPointOrBuilder> getDataPointsOrBuilderList() {
                return this.dataPoints_;
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface MetricsEntryOrBuilder extends s0 {
            DataPoint getDataPoints(int i8);

            int getDataPointsCount();

            List<DataPoint> getDataPointsList();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            HealthEvent healthEvent = new HealthEvent();
            DEFAULT_INSTANCE = healthEvent;
            y.registerDefaultInstance(HealthEvent.class, healthEvent);
        }

        private HealthEvent() {
        }

        /* access modifiers changed from: private */
        public void addAllMetrics(Iterable<? extends MetricsEntry> iterable) {
            ensureMetricsIsMutable();
            a.addAll(iterable, this.metrics_);
        }

        /* access modifiers changed from: private */
        public void addMetrics(int i8, MetricsEntry metricsEntry) {
            metricsEntry.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(i8, metricsEntry);
        }

        /* access modifiers changed from: private */
        public void addMetrics(MetricsEntry metricsEntry) {
            metricsEntry.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(metricsEntry);
        }

        /* access modifiers changed from: private */
        public void clearEventTimeEpochMs() {
            this.bitField0_ &= -3;
            this.eventTimeEpochMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureMetricsIsMutable() {
            a0.j<MetricsEntry> jVar = this.metrics_;
            if (!jVar.f()) {
                this.metrics_ = y.mutableCopy(jVar);
            }
        }

        public static HealthEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HealthEvent healthEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(healthEvent);
        }

        public static HealthEvent parseDelimitedFrom(InputStream inputStream) {
            return (HealthEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HealthEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEvent parseFrom(i iVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HealthEvent parseFrom(i iVar, q qVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HealthEvent parseFrom(j jVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HealthEvent parseFrom(j jVar, q qVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HealthEvent parseFrom(InputStream inputStream) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEvent parseFrom(InputStream inputStream, q qVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEvent parseFrom(ByteBuffer byteBuffer) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HealthEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HealthEvent parseFrom(byte[] bArr) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthEvent parseFrom(byte[] bArr, q qVar) {
            return (HealthEvent) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HealthEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMetrics(int i8) {
            ensureMetricsIsMutable();
            this.metrics_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setEventTimeEpochMs(long j8) {
            this.bitField0_ |= 2;
            this.eventTimeEpochMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setMetrics(int i8, MetricsEntry metricsEntry) {
            metricsEntry.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i8, metricsEntry);
        }

        /* access modifiers changed from: private */
        public void setType(HealthEventType healthEventType) {
            this.type_ = healthEventType.getNumber();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", HealthEventType.internalGetVerifier(), "eventTimeEpochMs_", "metrics_", MetricsEntry.class});
                case 3:
                    return new HealthEvent();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HealthEvent> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HealthEvent.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getEventTimeEpochMs() {
            return this.eventTimeEpochMs_;
        }

        public MetricsEntry getMetrics(int i8) {
            return this.metrics_.get(i8);
        }

        public int getMetricsCount() {
            return this.metrics_.size();
        }

        public List<MetricsEntry> getMetricsList() {
            return this.metrics_;
        }

        public MetricsEntryOrBuilder getMetricsOrBuilder(int i8) {
            return this.metrics_.get(i8);
        }

        public List<? extends MetricsEntryOrBuilder> getMetricsOrBuilderList() {
            return this.metrics_;
        }

        public HealthEventType getType() {
            HealthEventType forNumber = HealthEventType.forNumber(this.type_);
            return forNumber == null ? HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
        }

        public boolean hasEventTimeEpochMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HealthEventOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        long getEventTimeEpochMs();

        HealthEvent.MetricsEntry getMetrics(int i8);

        int getMetricsCount();

        List<HealthEvent.MetricsEntry> getMetricsList();

        HealthEvent.HealthEventType getType();

        boolean hasEventTimeEpochMs();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HeartRateAlertParams extends y<HeartRateAlertParams, Builder> implements HeartRateAlertParamsOrBuilder {
        /* access modifiers changed from: private */
        public static final HeartRateAlertParams DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 2;
        private static volatile z0<HeartRateAlertParams> PARSER = null;
        public static final int THRESHOLD_BPM_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long durationMs_;
        private int thresholdBpm_;
        private int type_;

        public static final class Builder extends y.a<HeartRateAlertParams, Builder> implements HeartRateAlertParamsOrBuilder {
            private Builder() {
                super(HeartRateAlertParams.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearDurationMs() {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).clearDurationMs();
                return this;
            }

            public Builder clearThresholdBpm() {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).clearThresholdBpm();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).clearType();
                return this;
            }

            public long getDurationMs() {
                return ((HeartRateAlertParams) this.instance).getDurationMs();
            }

            public int getThresholdBpm() {
                return ((HeartRateAlertParams) this.instance).getThresholdBpm();
            }

            public HeartRateAlertType getType() {
                return ((HeartRateAlertParams) this.instance).getType();
            }

            public boolean hasDurationMs() {
                return ((HeartRateAlertParams) this.instance).hasDurationMs();
            }

            public boolean hasThresholdBpm() {
                return ((HeartRateAlertParams) this.instance).hasThresholdBpm();
            }

            public boolean hasType() {
                return ((HeartRateAlertParams) this.instance).hasType();
            }

            public Builder setDurationMs(long j8) {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).setDurationMs(j8);
                return this;
            }

            public Builder setThresholdBpm(int i8) {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).setThresholdBpm(i8);
                return this;
            }

            public Builder setType(HeartRateAlertType heartRateAlertType) {
                copyOnWrite();
                ((HeartRateAlertParams) this.instance).setType(heartRateAlertType);
                return this;
            }
        }

        public enum HeartRateAlertType implements a0.c {
            HEART_RATE_ALERT_TYPE_UNKNOWN(0),
            HEART_RATE_ALERT_TYPE_LOW(1),
            HEART_RATE_ALERT_TYPE_ELEVATED(2);
            
            public static final int HEART_RATE_ALERT_TYPE_ELEVATED_VALUE = 2;
            public static final int HEART_RATE_ALERT_TYPE_LOW_VALUE = 1;
            public static final int HEART_RATE_ALERT_TYPE_UNKNOWN_VALUE = 0;
            private static final a0.d<HeartRateAlertType> internalValueMap = null;
            private final int value;

            public static final class HeartRateAlertTypeVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new HeartRateAlertTypeVerifier();
                }

                private HeartRateAlertTypeVerifier() {
                }

                public boolean isInRange(int i8) {
                    return HeartRateAlertType.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<HeartRateAlertType>() {
                    public HeartRateAlertType findValueByNumber(int i8) {
                        return HeartRateAlertType.forNumber(i8);
                    }
                };
            }

            private HeartRateAlertType(int i8) {
                this.value = i8;
            }

            public static HeartRateAlertType forNumber(int i8) {
                if (i8 == 0) {
                    return HEART_RATE_ALERT_TYPE_UNKNOWN;
                }
                if (i8 == 1) {
                    return HEART_RATE_ALERT_TYPE_LOW;
                }
                if (i8 != 2) {
                    return null;
                }
                return HEART_RATE_ALERT_TYPE_ELEVATED;
            }

            public static a0.d<HeartRateAlertType> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return HeartRateAlertTypeVerifier.INSTANCE;
            }

            @Deprecated
            public static HeartRateAlertType valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        static {
            HeartRateAlertParams heartRateAlertParams = new HeartRateAlertParams();
            DEFAULT_INSTANCE = heartRateAlertParams;
            y.registerDefaultInstance(HeartRateAlertParams.class, heartRateAlertParams);
        }

        private HeartRateAlertParams() {
        }

        /* access modifiers changed from: private */
        public void clearDurationMs() {
            this.bitField0_ &= -3;
            this.durationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearThresholdBpm() {
            this.bitField0_ &= -5;
            this.thresholdBpm_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static HeartRateAlertParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeartRateAlertParams heartRateAlertParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heartRateAlertParams);
        }

        public static HeartRateAlertParams parseDelimitedFrom(InputStream inputStream) {
            return (HeartRateAlertParams) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParams parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParams) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParams parseFrom(i iVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HeartRateAlertParams parseFrom(i iVar, q qVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HeartRateAlertParams parseFrom(j jVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HeartRateAlertParams parseFrom(j jVar, q qVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HeartRateAlertParams parseFrom(InputStream inputStream) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParams parseFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParams parseFrom(ByteBuffer byteBuffer) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HeartRateAlertParams parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HeartRateAlertParams parseFrom(byte[] bArr) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateAlertParams parseFrom(byte[] bArr, q qVar) {
            return (HeartRateAlertParams) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HeartRateAlertParams> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDurationMs(long j8) {
            this.bitField0_ |= 2;
            this.durationMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setThresholdBpm(int i8) {
            this.bitField0_ |= 4;
            this.thresholdBpm_ = i8;
        }

        /* access modifiers changed from: private */
        public void setType(HeartRateAlertType heartRateAlertType) {
            this.type_ = heartRateAlertType.getNumber();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"bitField0_", "type_", HeartRateAlertType.internalGetVerifier(), "durationMs_", "thresholdBpm_"});
                case 3:
                    return new HeartRateAlertParams();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HeartRateAlertParams> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HeartRateAlertParams.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getDurationMs() {
            return this.durationMs_;
        }

        public int getThresholdBpm() {
            return this.thresholdBpm_;
        }

        public HeartRateAlertType getType() {
            HeartRateAlertType forNumber = HeartRateAlertType.forNumber(this.type_);
            return forNumber == null ? HeartRateAlertType.HEART_RATE_ALERT_TYPE_UNKNOWN : forNumber;
        }

        public boolean hasDurationMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasThresholdBpm() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HeartRateAlertParamsOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        long getDurationMs();

        int getThresholdBpm();

        HeartRateAlertParams.HeartRateAlertType getType();

        boolean hasDurationMs();

        boolean hasThresholdBpm();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MeasureCapabilities extends y<MeasureCapabilities, Builder> implements MeasureCapabilitiesOrBuilder {
        /* access modifiers changed from: private */
        public static final MeasureCapabilities DEFAULT_INSTANCE;
        private static volatile z0<MeasureCapabilities> PARSER = null;
        public static final int SUPPORTED_DATA_TYPES_FIELD_NUMBER = 1;
        private a0.j<DataType> supportedDataTypes_ = y.emptyProtobufList();

        public static final class Builder extends y.a<MeasureCapabilities, Builder> implements MeasureCapabilitiesOrBuilder {
            private Builder() {
                super(MeasureCapabilities.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllSupportedDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).addAllSupportedDataTypes(iterable);
                return this;
            }

            public Builder addSupportedDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).addSupportedDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).addSupportedDataTypes(i8, dataType);
                return this;
            }

            public Builder addSupportedDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).addSupportedDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypes(DataType dataType) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).addSupportedDataTypes(dataType);
                return this;
            }

            public Builder clearSupportedDataTypes() {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).clearSupportedDataTypes();
                return this;
            }

            public DataType getSupportedDataTypes(int i8) {
                return ((MeasureCapabilities) this.instance).getSupportedDataTypes(i8);
            }

            public int getSupportedDataTypesCount() {
                return ((MeasureCapabilities) this.instance).getSupportedDataTypesCount();
            }

            public List<DataType> getSupportedDataTypesList() {
                return Collections.unmodifiableList(((MeasureCapabilities) this.instance).getSupportedDataTypesList());
            }

            public Builder removeSupportedDataTypes(int i8) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).removeSupportedDataTypes(i8);
                return this;
            }

            public Builder setSupportedDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).setSupportedDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setSupportedDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((MeasureCapabilities) this.instance).setSupportedDataTypes(i8, dataType);
                return this;
            }
        }

        static {
            MeasureCapabilities measureCapabilities = new MeasureCapabilities();
            DEFAULT_INSTANCE = measureCapabilities;
            y.registerDefaultInstance(MeasureCapabilities.class, measureCapabilities);
        }

        private MeasureCapabilities() {
        }

        /* access modifiers changed from: private */
        public void addAllSupportedDataTypes(Iterable<? extends DataType> iterable) {
            ensureSupportedDataTypesIsMutable();
            a.addAll(iterable, this.supportedDataTypes_);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypes(DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void clearSupportedDataTypes() {
            this.supportedDataTypes_ = y.emptyProtobufList();
        }

        private void ensureSupportedDataTypesIsMutable() {
            a0.j<DataType> jVar = this.supportedDataTypes_;
            if (!jVar.f()) {
                this.supportedDataTypes_ = y.mutableCopy(jVar);
            }
        }

        public static MeasureCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MeasureCapabilities measureCapabilities) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(measureCapabilities);
        }

        public static MeasureCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (MeasureCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCapabilities parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MeasureCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCapabilities parseFrom(i iVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MeasureCapabilities parseFrom(i iVar, q qVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MeasureCapabilities parseFrom(j jVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MeasureCapabilities parseFrom(j jVar, q qVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MeasureCapabilities parseFrom(InputStream inputStream) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCapabilities parseFrom(InputStream inputStream, q qVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCapabilities parseFrom(ByteBuffer byteBuffer) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MeasureCapabilities parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MeasureCapabilities parseFrom(byte[] bArr) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MeasureCapabilities parseFrom(byte[] bArr, q qVar) {
            return (MeasureCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MeasureCapabilities> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSupportedDataTypes(int i8) {
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setSupportedDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesIsMutable();
            this.supportedDataTypes_.set(i8, dataType);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"supportedDataTypes_", DataType.class});
                case 3:
                    return new MeasureCapabilities();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MeasureCapabilities> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MeasureCapabilities.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getSupportedDataTypes(int i8) {
            return this.supportedDataTypes_.get(i8);
        }

        public int getSupportedDataTypesCount() {
            return this.supportedDataTypes_.size();
        }

        public List<DataType> getSupportedDataTypesList() {
            return this.supportedDataTypes_;
        }

        public DataTypeOrBuilder getSupportedDataTypesOrBuilder(int i8) {
            return this.supportedDataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getSupportedDataTypesOrBuilderList() {
            return this.supportedDataTypes_;
        }
    }

    public interface MeasureCapabilitiesOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataType getSupportedDataTypes(int i8);

        int getSupportedDataTypesCount();

        List<DataType> getSupportedDataTypesList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MilestoneMarkerSummary extends y<MilestoneMarkerSummary, Builder> implements MilestoneMarkerSummaryOrBuilder {
        public static final int ACHIEVED_GOAL_FIELD_NUMBER = 4;
        public static final int ACTIVE_DURATION_MS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final MilestoneMarkerSummary DEFAULT_INSTANCE;
        public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
        private static volatile z0<MilestoneMarkerSummary> PARSER = null;
        public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
        public static final int SUMMARY_METRICS_FIELD_NUMBER = 5;
        private AchievedExerciseGoal achievedGoal_;
        private long activeDurationMs_;
        private int bitField0_;
        private long endTimeEpochMs_;
        private long startTimeEpochMs_;
        private a0.j<SummaryMetricsEntry> summaryMetrics_ = y.emptyProtobufList();

        public static final class Builder extends y.a<MilestoneMarkerSummary, Builder> implements MilestoneMarkerSummaryOrBuilder {
            private Builder() {
                super(MilestoneMarkerSummary.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllSummaryMetrics(Iterable<? extends SummaryMetricsEntry> iterable) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).addAllSummaryMetrics(iterable);
                return this;
            }

            public Builder addSummaryMetrics(int i8, SummaryMetricsEntry.Builder builder) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).addSummaryMetrics(i8, (SummaryMetricsEntry) builder.build());
                return this;
            }

            public Builder addSummaryMetrics(int i8, SummaryMetricsEntry summaryMetricsEntry) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).addSummaryMetrics(i8, summaryMetricsEntry);
                return this;
            }

            public Builder addSummaryMetrics(SummaryMetricsEntry.Builder builder) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).addSummaryMetrics((SummaryMetricsEntry) builder.build());
                return this;
            }

            public Builder addSummaryMetrics(SummaryMetricsEntry summaryMetricsEntry) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).addSummaryMetrics(summaryMetricsEntry);
                return this;
            }

            public Builder clearAchievedGoal() {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).clearAchievedGoal();
                return this;
            }

            public Builder clearActiveDurationMs() {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).clearActiveDurationMs();
                return this;
            }

            public Builder clearEndTimeEpochMs() {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).clearEndTimeEpochMs();
                return this;
            }

            public Builder clearStartTimeEpochMs() {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).clearStartTimeEpochMs();
                return this;
            }

            public Builder clearSummaryMetrics() {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).clearSummaryMetrics();
                return this;
            }

            public AchievedExerciseGoal getAchievedGoal() {
                return ((MilestoneMarkerSummary) this.instance).getAchievedGoal();
            }

            public long getActiveDurationMs() {
                return ((MilestoneMarkerSummary) this.instance).getActiveDurationMs();
            }

            public long getEndTimeEpochMs() {
                return ((MilestoneMarkerSummary) this.instance).getEndTimeEpochMs();
            }

            public long getStartTimeEpochMs() {
                return ((MilestoneMarkerSummary) this.instance).getStartTimeEpochMs();
            }

            public SummaryMetricsEntry getSummaryMetrics(int i8) {
                return ((MilestoneMarkerSummary) this.instance).getSummaryMetrics(i8);
            }

            public int getSummaryMetricsCount() {
                return ((MilestoneMarkerSummary) this.instance).getSummaryMetricsCount();
            }

            public List<SummaryMetricsEntry> getSummaryMetricsList() {
                return Collections.unmodifiableList(((MilestoneMarkerSummary) this.instance).getSummaryMetricsList());
            }

            public boolean hasAchievedGoal() {
                return ((MilestoneMarkerSummary) this.instance).hasAchievedGoal();
            }

            public boolean hasActiveDurationMs() {
                return ((MilestoneMarkerSummary) this.instance).hasActiveDurationMs();
            }

            public boolean hasEndTimeEpochMs() {
                return ((MilestoneMarkerSummary) this.instance).hasEndTimeEpochMs();
            }

            public boolean hasStartTimeEpochMs() {
                return ((MilestoneMarkerSummary) this.instance).hasStartTimeEpochMs();
            }

            public Builder mergeAchievedGoal(AchievedExerciseGoal achievedExerciseGoal) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).mergeAchievedGoal(achievedExerciseGoal);
                return this;
            }

            public Builder removeSummaryMetrics(int i8) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).removeSummaryMetrics(i8);
                return this;
            }

            public Builder setAchievedGoal(AchievedExerciseGoal.Builder builder) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setAchievedGoal((AchievedExerciseGoal) builder.build());
                return this;
            }

            public Builder setAchievedGoal(AchievedExerciseGoal achievedExerciseGoal) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setAchievedGoal(achievedExerciseGoal);
                return this;
            }

            public Builder setActiveDurationMs(long j8) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setActiveDurationMs(j8);
                return this;
            }

            public Builder setEndTimeEpochMs(long j8) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setEndTimeEpochMs(j8);
                return this;
            }

            public Builder setStartTimeEpochMs(long j8) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setStartTimeEpochMs(j8);
                return this;
            }

            public Builder setSummaryMetrics(int i8, SummaryMetricsEntry.Builder builder) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setSummaryMetrics(i8, (SummaryMetricsEntry) builder.build());
                return this;
            }

            public Builder setSummaryMetrics(int i8, SummaryMetricsEntry summaryMetricsEntry) {
                copyOnWrite();
                ((MilestoneMarkerSummary) this.instance).setSummaryMetrics(i8, summaryMetricsEntry);
                return this;
            }
        }

        public static final class SummaryMetricsEntry extends y<SummaryMetricsEntry, Builder> implements SummaryMetricsEntryOrBuilder {
            public static final int AGGREGATE_DATA_POINT_FIELD_NUMBER = 2;
            public static final int DATA_TYPE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final SummaryMetricsEntry DEFAULT_INSTANCE;
            private static volatile z0<SummaryMetricsEntry> PARSER;
            private AggregateDataPoint aggregateDataPoint_;
            private int bitField0_;
            private DataType dataType_;

            public static final class Builder extends y.a<SummaryMetricsEntry, Builder> implements SummaryMetricsEntryOrBuilder {
                private Builder() {
                    super(SummaryMetricsEntry.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder clearAggregateDataPoint() {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).clearAggregateDataPoint();
                    return this;
                }

                public Builder clearDataType() {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).clearDataType();
                    return this;
                }

                public AggregateDataPoint getAggregateDataPoint() {
                    return ((SummaryMetricsEntry) this.instance).getAggregateDataPoint();
                }

                public DataType getDataType() {
                    return ((SummaryMetricsEntry) this.instance).getDataType();
                }

                public boolean hasAggregateDataPoint() {
                    return ((SummaryMetricsEntry) this.instance).hasAggregateDataPoint();
                }

                public boolean hasDataType() {
                    return ((SummaryMetricsEntry) this.instance).hasDataType();
                }

                public Builder mergeAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).mergeAggregateDataPoint(aggregateDataPoint);
                    return this;
                }

                public Builder mergeDataType(DataType dataType) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).mergeDataType(dataType);
                    return this;
                }

                public Builder setAggregateDataPoint(AggregateDataPoint.Builder builder) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).setAggregateDataPoint((AggregateDataPoint) builder.build());
                    return this;
                }

                public Builder setAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).setAggregateDataPoint(aggregateDataPoint);
                    return this;
                }

                public Builder setDataType(DataType.Builder builder) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).setDataType((DataType) builder.build());
                    return this;
                }

                public Builder setDataType(DataType dataType) {
                    copyOnWrite();
                    ((SummaryMetricsEntry) this.instance).setDataType(dataType);
                    return this;
                }
            }

            static {
                SummaryMetricsEntry summaryMetricsEntry = new SummaryMetricsEntry();
                DEFAULT_INSTANCE = summaryMetricsEntry;
                y.registerDefaultInstance(SummaryMetricsEntry.class, summaryMetricsEntry);
            }

            private SummaryMetricsEntry() {
            }

            /* access modifiers changed from: private */
            public void clearAggregateDataPoint() {
                this.aggregateDataPoint_ = null;
                this.bitField0_ &= -3;
            }

            /* access modifiers changed from: private */
            public void clearDataType() {
                this.dataType_ = null;
                this.bitField0_ &= -2;
            }

            public static SummaryMetricsEntry getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                aggregateDataPoint.getClass();
                AggregateDataPoint aggregateDataPoint2 = this.aggregateDataPoint_;
                if (!(aggregateDataPoint2 == null || aggregateDataPoint2 == AggregateDataPoint.getDefaultInstance())) {
                    aggregateDataPoint = (AggregateDataPoint) ((AggregateDataPoint.Builder) AggregateDataPoint.newBuilder(this.aggregateDataPoint_).mergeFrom(aggregateDataPoint)).buildPartial();
                }
                this.aggregateDataPoint_ = aggregateDataPoint;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void mergeDataType(DataType dataType) {
                dataType.getClass();
                DataType dataType2 = this.dataType_;
                if (!(dataType2 == null || dataType2 == DataType.getDefaultInstance())) {
                    dataType = (DataType) ((DataType.Builder) DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
                }
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(SummaryMetricsEntry summaryMetricsEntry) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(summaryMetricsEntry);
            }

            public static SummaryMetricsEntry parseDelimitedFrom(InputStream inputStream) {
                return (SummaryMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SummaryMetricsEntry parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (SummaryMetricsEntry) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SummaryMetricsEntry parseFrom(i iVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static SummaryMetricsEntry parseFrom(i iVar, q qVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static SummaryMetricsEntry parseFrom(j jVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static SummaryMetricsEntry parseFrom(j jVar, q qVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static SummaryMetricsEntry parseFrom(InputStream inputStream) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SummaryMetricsEntry parseFrom(InputStream inputStream, q qVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static SummaryMetricsEntry parseFrom(ByteBuffer byteBuffer) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static SummaryMetricsEntry parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static SummaryMetricsEntry parseFrom(byte[] bArr) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SummaryMetricsEntry parseFrom(byte[] bArr, q qVar) {
                return (SummaryMetricsEntry) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<SummaryMetricsEntry> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAggregateDataPoint(AggregateDataPoint aggregateDataPoint) {
                aggregateDataPoint.getClass();
                this.aggregateDataPoint_ = aggregateDataPoint;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setDataType(DataType dataType) {
                dataType.getClass();
                this.dataType_ = dataType;
                this.bitField0_ |= 1;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "dataType_", "aggregateDataPoint_"});
                    case 3:
                        return new SummaryMetricsEntry();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<SummaryMetricsEntry> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (SummaryMetricsEntry.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public AggregateDataPoint getAggregateDataPoint() {
                AggregateDataPoint aggregateDataPoint = this.aggregateDataPoint_;
                return aggregateDataPoint == null ? AggregateDataPoint.getDefaultInstance() : aggregateDataPoint;
            }

            public DataType getDataType() {
                DataType dataType = this.dataType_;
                return dataType == null ? DataType.getDefaultInstance() : dataType;
            }

            public boolean hasAggregateDataPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasDataType() {
                return (this.bitField0_ & 1) != 0;
            }
        }

        public interface SummaryMetricsEntryOrBuilder extends s0 {
            AggregateDataPoint getAggregateDataPoint();

            DataType getDataType();

            /* synthetic */ r0 getDefaultInstanceForType();

            boolean hasAggregateDataPoint();

            boolean hasDataType();

            /* synthetic */ boolean isInitialized();
        }

        static {
            MilestoneMarkerSummary milestoneMarkerSummary = new MilestoneMarkerSummary();
            DEFAULT_INSTANCE = milestoneMarkerSummary;
            y.registerDefaultInstance(MilestoneMarkerSummary.class, milestoneMarkerSummary);
        }

        private MilestoneMarkerSummary() {
        }

        /* access modifiers changed from: private */
        public void addAllSummaryMetrics(Iterable<? extends SummaryMetricsEntry> iterable) {
            ensureSummaryMetricsIsMutable();
            a.addAll(iterable, this.summaryMetrics_);
        }

        /* access modifiers changed from: private */
        public void addSummaryMetrics(int i8, SummaryMetricsEntry summaryMetricsEntry) {
            summaryMetricsEntry.getClass();
            ensureSummaryMetricsIsMutable();
            this.summaryMetrics_.add(i8, summaryMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void addSummaryMetrics(SummaryMetricsEntry summaryMetricsEntry) {
            summaryMetricsEntry.getClass();
            ensureSummaryMetricsIsMutable();
            this.summaryMetrics_.add(summaryMetricsEntry);
        }

        /* access modifiers changed from: private */
        public void clearAchievedGoal() {
            this.achievedGoal_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearActiveDurationMs() {
            this.bitField0_ &= -5;
            this.activeDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEndTimeEpochMs() {
            this.bitField0_ &= -3;
            this.endTimeEpochMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartTimeEpochMs() {
            this.bitField0_ &= -2;
            this.startTimeEpochMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSummaryMetrics() {
            this.summaryMetrics_ = y.emptyProtobufList();
        }

        private void ensureSummaryMetricsIsMutable() {
            a0.j<SummaryMetricsEntry> jVar = this.summaryMetrics_;
            if (!jVar.f()) {
                this.summaryMetrics_ = y.mutableCopy(jVar);
            }
        }

        public static MilestoneMarkerSummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAchievedGoal(AchievedExerciseGoal achievedExerciseGoal) {
            achievedExerciseGoal.getClass();
            AchievedExerciseGoal achievedExerciseGoal2 = this.achievedGoal_;
            if (!(achievedExerciseGoal2 == null || achievedExerciseGoal2 == AchievedExerciseGoal.getDefaultInstance())) {
                achievedExerciseGoal = (AchievedExerciseGoal) ((AchievedExerciseGoal.Builder) AchievedExerciseGoal.newBuilder(this.achievedGoal_).mergeFrom(achievedExerciseGoal)).buildPartial();
            }
            this.achievedGoal_ = achievedExerciseGoal;
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MilestoneMarkerSummary milestoneMarkerSummary) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(milestoneMarkerSummary);
        }

        public static MilestoneMarkerSummary parseDelimitedFrom(InputStream inputStream) {
            return (MilestoneMarkerSummary) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MilestoneMarkerSummary parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MilestoneMarkerSummary) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MilestoneMarkerSummary parseFrom(i iVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MilestoneMarkerSummary parseFrom(i iVar, q qVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MilestoneMarkerSummary parseFrom(j jVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MilestoneMarkerSummary parseFrom(j jVar, q qVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MilestoneMarkerSummary parseFrom(InputStream inputStream) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MilestoneMarkerSummary parseFrom(InputStream inputStream, q qVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MilestoneMarkerSummary parseFrom(ByteBuffer byteBuffer) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MilestoneMarkerSummary parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MilestoneMarkerSummary parseFrom(byte[] bArr) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MilestoneMarkerSummary parseFrom(byte[] bArr, q qVar) {
            return (MilestoneMarkerSummary) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MilestoneMarkerSummary> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSummaryMetrics(int i8) {
            ensureSummaryMetricsIsMutable();
            this.summaryMetrics_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setAchievedGoal(AchievedExerciseGoal achievedExerciseGoal) {
            achievedExerciseGoal.getClass();
            this.achievedGoal_ = achievedExerciseGoal;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setActiveDurationMs(long j8) {
            this.bitField0_ |= 4;
            this.activeDurationMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setEndTimeEpochMs(long j8) {
            this.bitField0_ |= 2;
            this.endTimeEpochMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setStartTimeEpochMs(long j8) {
            this.bitField0_ |= 1;
            this.startTimeEpochMs_ = j8;
        }

        /* access modifiers changed from: private */
        public void setSummaryMetrics(int i8, SummaryMetricsEntry summaryMetricsEntry) {
            summaryMetricsEntry.getClass();
            ensureSummaryMetricsIsMutable();
            this.summaryMetrics_.set(i8, summaryMetricsEntry);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "activeDurationMs_", "achievedGoal_", "summaryMetrics_", SummaryMetricsEntry.class});
                case 3:
                    return new MilestoneMarkerSummary();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MilestoneMarkerSummary> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MilestoneMarkerSummary.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AchievedExerciseGoal getAchievedGoal() {
            AchievedExerciseGoal achievedExerciseGoal = this.achievedGoal_;
            return achievedExerciseGoal == null ? AchievedExerciseGoal.getDefaultInstance() : achievedExerciseGoal;
        }

        public long getActiveDurationMs() {
            return this.activeDurationMs_;
        }

        public long getEndTimeEpochMs() {
            return this.endTimeEpochMs_;
        }

        public long getStartTimeEpochMs() {
            return this.startTimeEpochMs_;
        }

        public SummaryMetricsEntry getSummaryMetrics(int i8) {
            return this.summaryMetrics_.get(i8);
        }

        public int getSummaryMetricsCount() {
            return this.summaryMetrics_.size();
        }

        public List<SummaryMetricsEntry> getSummaryMetricsList() {
            return this.summaryMetrics_;
        }

        public SummaryMetricsEntryOrBuilder getSummaryMetricsOrBuilder(int i8) {
            return this.summaryMetrics_.get(i8);
        }

        public List<? extends SummaryMetricsEntryOrBuilder> getSummaryMetricsOrBuilderList() {
            return this.summaryMetrics_;
        }

        public boolean hasAchievedGoal() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasActiveDurationMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasEndTimeEpochMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStartTimeEpochMs() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface MilestoneMarkerSummaryOrBuilder extends s0 {
        AchievedExerciseGoal getAchievedGoal();

        long getActiveDurationMs();

        /* synthetic */ r0 getDefaultInstanceForType();

        long getEndTimeEpochMs();

        long getStartTimeEpochMs();

        MilestoneMarkerSummary.SummaryMetricsEntry getSummaryMetrics(int i8);

        int getSummaryMetricsCount();

        List<MilestoneMarkerSummary.SummaryMetricsEntry> getSummaryMetricsList();

        boolean hasAchievedGoal();

        boolean hasActiveDurationMs();

        boolean hasEndTimeEpochMs();

        boolean hasStartTimeEpochMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveGoal extends y<PassiveGoal, Builder> implements PassiveGoalOrBuilder {
        public static final int CONDITION_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PassiveGoal DEFAULT_INSTANCE;
        private static volatile z0<PassiveGoal> PARSER = null;
        public static final int TRIGGER_FREQUENCY_FIELD_NUMBER = 2;
        private int bitField0_;
        private DataTypeCondition condition_;
        private int triggerFrequency_;

        public static final class Builder extends y.a<PassiveGoal, Builder> implements PassiveGoalOrBuilder {
            private Builder() {
                super(PassiveGoal.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearCondition() {
                copyOnWrite();
                ((PassiveGoal) this.instance).clearCondition();
                return this;
            }

            public Builder clearTriggerFrequency() {
                copyOnWrite();
                ((PassiveGoal) this.instance).clearTriggerFrequency();
                return this;
            }

            public DataTypeCondition getCondition() {
                return ((PassiveGoal) this.instance).getCondition();
            }

            public TriggerFrequency getTriggerFrequency() {
                return ((PassiveGoal) this.instance).getTriggerFrequency();
            }

            public boolean hasCondition() {
                return ((PassiveGoal) this.instance).hasCondition();
            }

            public boolean hasTriggerFrequency() {
                return ((PassiveGoal) this.instance).hasTriggerFrequency();
            }

            public Builder mergeCondition(DataTypeCondition dataTypeCondition) {
                copyOnWrite();
                ((PassiveGoal) this.instance).mergeCondition(dataTypeCondition);
                return this;
            }

            public Builder setCondition(DataTypeCondition.Builder builder) {
                copyOnWrite();
                ((PassiveGoal) this.instance).setCondition((DataTypeCondition) builder.build());
                return this;
            }

            public Builder setCondition(DataTypeCondition dataTypeCondition) {
                copyOnWrite();
                ((PassiveGoal) this.instance).setCondition(dataTypeCondition);
                return this;
            }

            public Builder setTriggerFrequency(TriggerFrequency triggerFrequency) {
                copyOnWrite();
                ((PassiveGoal) this.instance).setTriggerFrequency(triggerFrequency);
                return this;
            }
        }

        public enum TriggerFrequency implements a0.c {
            TRIGGER_FREQUENCY_UNKNOWN(0),
            TRIGGER_FREQUENCY_ONCE(1),
            TRIGGER_FREQUENCY_REPEATED(2);
            
            public static final int TRIGGER_FREQUENCY_ONCE_VALUE = 1;
            public static final int TRIGGER_FREQUENCY_REPEATED_VALUE = 2;
            public static final int TRIGGER_FREQUENCY_UNKNOWN_VALUE = 0;
            private static final a0.d<TriggerFrequency> internalValueMap = null;
            private final int value;

            public static final class TriggerFrequencyVerifier implements a0.e {
                static final a0.e INSTANCE = null;

                static {
                    INSTANCE = new TriggerFrequencyVerifier();
                }

                private TriggerFrequencyVerifier() {
                }

                public boolean isInRange(int i8) {
                    return TriggerFrequency.forNumber(i8) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a0.d<TriggerFrequency>() {
                    public TriggerFrequency findValueByNumber(int i8) {
                        return TriggerFrequency.forNumber(i8);
                    }
                };
            }

            private TriggerFrequency(int i8) {
                this.value = i8;
            }

            public static TriggerFrequency forNumber(int i8) {
                if (i8 == 0) {
                    return TRIGGER_FREQUENCY_UNKNOWN;
                }
                if (i8 == 1) {
                    return TRIGGER_FREQUENCY_ONCE;
                }
                if (i8 != 2) {
                    return null;
                }
                return TRIGGER_FREQUENCY_REPEATED;
            }

            public static a0.d<TriggerFrequency> internalGetValueMap() {
                return internalValueMap;
            }

            public static a0.e internalGetVerifier() {
                return TriggerFrequencyVerifier.INSTANCE;
            }

            @Deprecated
            public static TriggerFrequency valueOf(int i8) {
                return forNumber(i8);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        static {
            PassiveGoal passiveGoal = new PassiveGoal();
            DEFAULT_INSTANCE = passiveGoal;
            y.registerDefaultInstance(PassiveGoal.class, passiveGoal);
        }

        private PassiveGoal() {
        }

        /* access modifiers changed from: private */
        public void clearCondition() {
            this.condition_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearTriggerFrequency() {
            this.bitField0_ &= -3;
            this.triggerFrequency_ = 0;
        }

        public static PassiveGoal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCondition(DataTypeCondition dataTypeCondition) {
            dataTypeCondition.getClass();
            DataTypeCondition dataTypeCondition2 = this.condition_;
            if (!(dataTypeCondition2 == null || dataTypeCondition2 == DataTypeCondition.getDefaultInstance())) {
                dataTypeCondition = (DataTypeCondition) ((DataTypeCondition.Builder) DataTypeCondition.newBuilder(this.condition_).mergeFrom(dataTypeCondition)).buildPartial();
            }
            this.condition_ = dataTypeCondition;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveGoal passiveGoal) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveGoal);
        }

        public static PassiveGoal parseDelimitedFrom(InputStream inputStream) {
            return (PassiveGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveGoal parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveGoal) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveGoal parseFrom(i iVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveGoal parseFrom(i iVar, q qVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveGoal parseFrom(j jVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveGoal parseFrom(j jVar, q qVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveGoal parseFrom(InputStream inputStream) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveGoal parseFrom(InputStream inputStream, q qVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveGoal parseFrom(ByteBuffer byteBuffer) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveGoal parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveGoal parseFrom(byte[] bArr) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveGoal parseFrom(byte[] bArr, q qVar) {
            return (PassiveGoal) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveGoal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCondition(DataTypeCondition dataTypeCondition) {
            dataTypeCondition.getClass();
            this.condition_ = dataTypeCondition;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTriggerFrequency(TriggerFrequency triggerFrequency) {
            this.triggerFrequency_ = triggerFrequency.getNumber();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "condition_", "triggerFrequency_", TriggerFrequency.internalGetVerifier()});
                case 3:
                    return new PassiveGoal();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveGoal> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveGoal.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataTypeCondition getCondition() {
            DataTypeCondition dataTypeCondition = this.condition_;
            return dataTypeCondition == null ? DataTypeCondition.getDefaultInstance() : dataTypeCondition;
        }

        public TriggerFrequency getTriggerFrequency() {
            TriggerFrequency forNumber = TriggerFrequency.forNumber(this.triggerFrequency_);
            return forNumber == null ? TriggerFrequency.TRIGGER_FREQUENCY_UNKNOWN : forNumber;
        }

        public boolean hasCondition() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTriggerFrequency() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface PassiveGoalOrBuilder extends s0 {
        DataTypeCondition getCondition();

        /* synthetic */ r0 getDefaultInstanceForType();

        PassiveGoal.TriggerFrequency getTriggerFrequency();

        boolean hasCondition();

        boolean hasTriggerFrequency();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveListenerConfig extends y<PassiveListenerConfig, Builder> implements PassiveListenerConfigOrBuilder {
        public static final int DATA_TYPES_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PassiveListenerConfig DEFAULT_INSTANCE;
        public static final int HEALTH_EVENT_TYPES_FIELD_NUMBER = 4;
        public static final int INCLUDE_USER_ACTIVITY_STATE_FIELD_NUMBER = 2;
        private static volatile z0<PassiveListenerConfig> PARSER = null;
        public static final int PASSIVE_GOALS_FIELD_NUMBER = 3;
        private static final a0.h.a<Integer, HealthEvent.HealthEventType> healthEventTypes_converter_ = new a0.h.a<Integer, HealthEvent.HealthEventType>() {
            public HealthEvent.HealthEventType convert(Integer num) {
                HealthEvent.HealthEventType forNumber = HealthEvent.HealthEventType.forNumber(num.intValue());
                return forNumber == null ? HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
            }
        };
        private int bitField0_;
        private a0.j<DataType> dataTypes_ = y.emptyProtobufList();
        private a0.g healthEventTypes_ = y.emptyIntList();
        private boolean includeUserActivityState_;
        private a0.j<PassiveGoal> passiveGoals_ = y.emptyProtobufList();

        public static final class Builder extends y.a<PassiveListenerConfig, Builder> implements PassiveListenerConfigOrBuilder {
            private Builder() {
                super(PassiveListenerConfig.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addAllDataTypes(iterable);
                return this;
            }

            public Builder addAllHealthEventTypes(Iterable<? extends HealthEvent.HealthEventType> iterable) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addAllHealthEventTypes(iterable);
                return this;
            }

            public Builder addAllPassiveGoals(Iterable<? extends PassiveGoal> iterable) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addAllPassiveGoals(iterable);
                return this;
            }

            public Builder addDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addDataTypes(i8, dataType);
                return this;
            }

            public Builder addDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(DataType dataType) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addDataTypes(dataType);
                return this;
            }

            public Builder addHealthEventTypes(HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addHealthEventTypes(healthEventType);
                return this;
            }

            public Builder addPassiveGoals(int i8, PassiveGoal.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addPassiveGoals(i8, (PassiveGoal) builder.build());
                return this;
            }

            public Builder addPassiveGoals(int i8, PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addPassiveGoals(i8, passiveGoal);
                return this;
            }

            public Builder addPassiveGoals(PassiveGoal.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addPassiveGoals((PassiveGoal) builder.build());
                return this;
            }

            public Builder addPassiveGoals(PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).addPassiveGoals(passiveGoal);
                return this;
            }

            public Builder clearDataTypes() {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).clearDataTypes();
                return this;
            }

            public Builder clearHealthEventTypes() {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).clearHealthEventTypes();
                return this;
            }

            public Builder clearIncludeUserActivityState() {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).clearIncludeUserActivityState();
                return this;
            }

            public Builder clearPassiveGoals() {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).clearPassiveGoals();
                return this;
            }

            public DataType getDataTypes(int i8) {
                return ((PassiveListenerConfig) this.instance).getDataTypes(i8);
            }

            public int getDataTypesCount() {
                return ((PassiveListenerConfig) this.instance).getDataTypesCount();
            }

            public List<DataType> getDataTypesList() {
                return Collections.unmodifiableList(((PassiveListenerConfig) this.instance).getDataTypesList());
            }

            public HealthEvent.HealthEventType getHealthEventTypes(int i8) {
                return ((PassiveListenerConfig) this.instance).getHealthEventTypes(i8);
            }

            public int getHealthEventTypesCount() {
                return ((PassiveListenerConfig) this.instance).getHealthEventTypesCount();
            }

            public List<HealthEvent.HealthEventType> getHealthEventTypesList() {
                return ((PassiveListenerConfig) this.instance).getHealthEventTypesList();
            }

            public boolean getIncludeUserActivityState() {
                return ((PassiveListenerConfig) this.instance).getIncludeUserActivityState();
            }

            public PassiveGoal getPassiveGoals(int i8) {
                return ((PassiveListenerConfig) this.instance).getPassiveGoals(i8);
            }

            public int getPassiveGoalsCount() {
                return ((PassiveListenerConfig) this.instance).getPassiveGoalsCount();
            }

            public List<PassiveGoal> getPassiveGoalsList() {
                return Collections.unmodifiableList(((PassiveListenerConfig) this.instance).getPassiveGoalsList());
            }

            public boolean hasIncludeUserActivityState() {
                return ((PassiveListenerConfig) this.instance).hasIncludeUserActivityState();
            }

            public Builder removeDataTypes(int i8) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).removeDataTypes(i8);
                return this;
            }

            public Builder removePassiveGoals(int i8) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).removePassiveGoals(i8);
                return this;
            }

            public Builder setDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setDataTypes(i8, dataType);
                return this;
            }

            public Builder setHealthEventTypes(int i8, HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setHealthEventTypes(i8, healthEventType);
                return this;
            }

            public Builder setIncludeUserActivityState(boolean z8) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setIncludeUserActivityState(z8);
                return this;
            }

            public Builder setPassiveGoals(int i8, PassiveGoal.Builder builder) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setPassiveGoals(i8, (PassiveGoal) builder.build());
                return this;
            }

            public Builder setPassiveGoals(int i8, PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveListenerConfig) this.instance).setPassiveGoals(i8, passiveGoal);
                return this;
            }
        }

        static {
            PassiveListenerConfig passiveListenerConfig = new PassiveListenerConfig();
            DEFAULT_INSTANCE = passiveListenerConfig;
            y.registerDefaultInstance(PassiveListenerConfig.class, passiveListenerConfig);
        }

        private PassiveListenerConfig() {
        }

        /* access modifiers changed from: private */
        public void addAllDataTypes(Iterable<? extends DataType> iterable) {
            ensureDataTypesIsMutable();
            a.addAll(iterable, this.dataTypes_);
        }

        /* access modifiers changed from: private */
        public void addAllHealthEventTypes(Iterable<? extends HealthEvent.HealthEventType> iterable) {
            ensureHealthEventTypesIsMutable();
            for (HealthEvent.HealthEventType number : iterable) {
                ((z) this.healthEventTypes_).j(number.getNumber());
            }
        }

        /* access modifiers changed from: private */
        public void addAllPassiveGoals(Iterable<? extends PassiveGoal> iterable) {
            ensurePassiveGoalsIsMutable();
            a.addAll(iterable, this.passiveGoals_);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addHealthEventTypes(HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureHealthEventTypesIsMutable();
            ((z) this.healthEventTypes_).j(healthEventType.getNumber());
        }

        /* access modifiers changed from: private */
        public void addPassiveGoals(int i8, PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            ensurePassiveGoalsIsMutable();
            this.passiveGoals_.add(i8, passiveGoal);
        }

        /* access modifiers changed from: private */
        public void addPassiveGoals(PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            ensurePassiveGoalsIsMutable();
            this.passiveGoals_.add(passiveGoal);
        }

        /* access modifiers changed from: private */
        public void clearDataTypes() {
            this.dataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearHealthEventTypes() {
            this.healthEventTypes_ = y.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearIncludeUserActivityState() {
            this.bitField0_ &= -2;
            this.includeUserActivityState_ = false;
        }

        /* access modifiers changed from: private */
        public void clearPassiveGoals() {
            this.passiveGoals_ = y.emptyProtobufList();
        }

        private void ensureDataTypesIsMutable() {
            a0.j<DataType> jVar = this.dataTypes_;
            if (!jVar.f()) {
                this.dataTypes_ = y.mutableCopy(jVar);
            }
        }

        private void ensureHealthEventTypesIsMutable() {
            a0.g gVar = this.healthEventTypes_;
            if (!((c) gVar).f3599f) {
                this.healthEventTypes_ = y.mutableCopy(gVar);
            }
        }

        private void ensurePassiveGoalsIsMutable() {
            a0.j<PassiveGoal> jVar = this.passiveGoals_;
            if (!jVar.f()) {
                this.passiveGoals_ = y.mutableCopy(jVar);
            }
        }

        public static PassiveListenerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveListenerConfig passiveListenerConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveListenerConfig);
        }

        public static PassiveListenerConfig parseDelimitedFrom(InputStream inputStream) {
            return (PassiveListenerConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerConfig parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerConfig parseFrom(i iVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveListenerConfig parseFrom(i iVar, q qVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveListenerConfig parseFrom(j jVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveListenerConfig parseFrom(j jVar, q qVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveListenerConfig parseFrom(InputStream inputStream) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerConfig parseFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerConfig parseFrom(ByteBuffer byteBuffer) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveListenerConfig parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveListenerConfig parseFrom(byte[] bArr) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveListenerConfig parseFrom(byte[] bArr, q qVar) {
            return (PassiveListenerConfig) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveListenerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeDataTypes(int i8) {
            ensureDataTypesIsMutable();
            this.dataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removePassiveGoals(int i8) {
            ensurePassiveGoalsIsMutable();
            this.passiveGoals_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setHealthEventTypes(int i8, HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureHealthEventTypesIsMutable();
            ((z) this.healthEventTypes_).m(i8, healthEventType.getNumber());
        }

        /* access modifiers changed from: private */
        public void setIncludeUserActivityState(boolean z8) {
            this.bitField0_ |= 1;
            this.includeUserActivityState_ = z8;
        }

        /* access modifiers changed from: private */
        public void setPassiveGoals(int i8, PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            ensurePassiveGoalsIsMutable();
            this.passiveGoals_.set(i8, passiveGoal);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဇ\u0000\u0003\u001b\u0004\u001e", new Object[]{"bitField0_", "dataTypes_", DataType.class, "includeUserActivityState_", "passiveGoals_", PassiveGoal.class, "healthEventTypes_", HealthEvent.HealthEventType.internalGetVerifier()});
                case 3:
                    return new PassiveListenerConfig();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveListenerConfig> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveListenerConfig.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getDataTypes(int i8) {
            return this.dataTypes_.get(i8);
        }

        public int getDataTypesCount() {
            return this.dataTypes_.size();
        }

        public List<DataType> getDataTypesList() {
            return this.dataTypes_;
        }

        public DataTypeOrBuilder getDataTypesOrBuilder(int i8) {
            return this.dataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getDataTypesOrBuilderList() {
            return this.dataTypes_;
        }

        public HealthEvent.HealthEventType getHealthEventTypes(int i8) {
            HealthEvent.HealthEventType forNumber = HealthEvent.HealthEventType.forNumber(((z) this.healthEventTypes_).l(i8));
            return forNumber == null ? HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
        }

        public int getHealthEventTypesCount() {
            return ((z) this.healthEventTypes_).f3832h;
        }

        public List<HealthEvent.HealthEventType> getHealthEventTypesList() {
            return new a0.h(this.healthEventTypes_, healthEventTypes_converter_);
        }

        public boolean getIncludeUserActivityState() {
            return this.includeUserActivityState_;
        }

        public PassiveGoal getPassiveGoals(int i8) {
            return this.passiveGoals_.get(i8);
        }

        public int getPassiveGoalsCount() {
            return this.passiveGoals_.size();
        }

        public List<PassiveGoal> getPassiveGoalsList() {
            return this.passiveGoals_;
        }

        public PassiveGoalOrBuilder getPassiveGoalsOrBuilder(int i8) {
            return this.passiveGoals_.get(i8);
        }

        public List<? extends PassiveGoalOrBuilder> getPassiveGoalsOrBuilderList() {
            return this.passiveGoals_;
        }

        public boolean hasIncludeUserActivityState() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveListenerConfigOrBuilder extends s0 {
        DataType getDataTypes(int i8);

        int getDataTypesCount();

        List<DataType> getDataTypesList();

        /* synthetic */ r0 getDefaultInstanceForType();

        HealthEvent.HealthEventType getHealthEventTypes(int i8);

        int getHealthEventTypesCount();

        List<HealthEvent.HealthEventType> getHealthEventTypesList();

        boolean getIncludeUserActivityState();

        PassiveGoal getPassiveGoals(int i8);

        int getPassiveGoalsCount();

        List<PassiveGoal> getPassiveGoalsList();

        boolean hasIncludeUserActivityState();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringCapabilities extends y<PassiveMonitoringCapabilities, Builder> implements PassiveMonitoringCapabilitiesOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveMonitoringCapabilities DEFAULT_INSTANCE;
        private static volatile z0<PassiveMonitoringCapabilities> PARSER = null;
        public static final int SUPPORTED_DATA_TYPES_PASSIVE_GOALS_FIELD_NUMBER = 2;
        public static final int SUPPORTED_DATA_TYPES_PASSIVE_MONITORING_FIELD_NUMBER = 1;
        public static final int SUPPORTED_HEALTH_EVENT_TYPES_FIELD_NUMBER = 4;
        public static final int SUPPORTED_HR_SAMPLING_INTERVALS_SECONDS_FIELD_NUMBER = 3;
        public static final int SUPPORTED_USER_ACTIVITY_STATES_FIELD_NUMBER = 5;
        private static final a0.h.a<Integer, HealthEvent.HealthEventType> supportedHealthEventTypes_converter_ = new a0.h.a<Integer, HealthEvent.HealthEventType>() {
            public HealthEvent.HealthEventType convert(Integer num) {
                HealthEvent.HealthEventType forNumber = HealthEvent.HealthEventType.forNumber(num.intValue());
                return forNumber == null ? HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
            }
        };
        private static final a0.h.a<Integer, UserActivityState> supportedUserActivityStates_converter_ = new a0.h.a<Integer, UserActivityState>() {
            public UserActivityState convert(Integer num) {
                UserActivityState forNumber = UserActivityState.forNumber(num.intValue());
                return forNumber == null ? UserActivityState.USER_ACTIVITY_STATE_UNKNOWN : forNumber;
            }
        };
        private a0.j<DataType> supportedDataTypesPassiveGoals_ = y.emptyProtobufList();
        private a0.j<DataType> supportedDataTypesPassiveMonitoring_ = y.emptyProtobufList();
        private int supportedHealthEventTypesMemoizedSerializedSize;
        private a0.g supportedHealthEventTypes_ = y.emptyIntList();
        private int supportedHrSamplingIntervalsSecondsMemoizedSerializedSize = -1;
        private a0.g supportedHrSamplingIntervalsSeconds_ = y.emptyIntList();
        private int supportedUserActivityStatesMemoizedSerializedSize;
        private a0.g supportedUserActivityStates_ = y.emptyIntList();

        public static final class Builder extends y.a<PassiveMonitoringCapabilities, Builder> implements PassiveMonitoringCapabilitiesOrBuilder {
            private Builder() {
                super(PassiveMonitoringCapabilities.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllSupportedDataTypesPassiveGoals(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addAllSupportedDataTypesPassiveGoals(iterable);
                return this;
            }

            public Builder addAllSupportedDataTypesPassiveMonitoring(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addAllSupportedDataTypesPassiveMonitoring(iterable);
                return this;
            }

            public Builder addAllSupportedHealthEventTypes(Iterable<? extends HealthEvent.HealthEventType> iterable) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addAllSupportedHealthEventTypes(iterable);
                return this;
            }

            public Builder addAllSupportedHrSamplingIntervalsSeconds(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addAllSupportedHrSamplingIntervalsSeconds(iterable);
                return this;
            }

            public Builder addAllSupportedUserActivityStates(Iterable<? extends UserActivityState> iterable) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addAllSupportedUserActivityStates(iterable);
                return this;
            }

            public Builder addSupportedDataTypesPassiveGoals(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveGoals(i8, (DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypesPassiveGoals(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveGoals(i8, dataType);
                return this;
            }

            public Builder addSupportedDataTypesPassiveGoals(DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveGoals((DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypesPassiveGoals(DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveGoals(dataType);
                return this;
            }

            public Builder addSupportedDataTypesPassiveMonitoring(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveMonitoring(i8, (DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypesPassiveMonitoring(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveMonitoring(i8, dataType);
                return this;
            }

            public Builder addSupportedDataTypesPassiveMonitoring(DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveMonitoring((DataType) builder.build());
                return this;
            }

            public Builder addSupportedDataTypesPassiveMonitoring(DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedDataTypesPassiveMonitoring(dataType);
                return this;
            }

            public Builder addSupportedHealthEventTypes(HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedHealthEventTypes(healthEventType);
                return this;
            }

            public Builder addSupportedHrSamplingIntervalsSeconds(int i8) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedHrSamplingIntervalsSeconds(i8);
                return this;
            }

            public Builder addSupportedUserActivityStates(UserActivityState userActivityState) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).addSupportedUserActivityStates(userActivityState);
                return this;
            }

            public Builder clearSupportedDataTypesPassiveGoals() {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).clearSupportedDataTypesPassiveGoals();
                return this;
            }

            public Builder clearSupportedDataTypesPassiveMonitoring() {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).clearSupportedDataTypesPassiveMonitoring();
                return this;
            }

            public Builder clearSupportedHealthEventTypes() {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).clearSupportedHealthEventTypes();
                return this;
            }

            public Builder clearSupportedHrSamplingIntervalsSeconds() {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).clearSupportedHrSamplingIntervalsSeconds();
                return this;
            }

            public Builder clearSupportedUserActivityStates() {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).clearSupportedUserActivityStates();
                return this;
            }

            public DataType getSupportedDataTypesPassiveGoals(int i8) {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveGoals(i8);
            }

            public int getSupportedDataTypesPassiveGoalsCount() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveGoalsCount();
            }

            public List<DataType> getSupportedDataTypesPassiveGoalsList() {
                return Collections.unmodifiableList(((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveGoalsList());
            }

            public DataType getSupportedDataTypesPassiveMonitoring(int i8) {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveMonitoring(i8);
            }

            public int getSupportedDataTypesPassiveMonitoringCount() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveMonitoringCount();
            }

            public List<DataType> getSupportedDataTypesPassiveMonitoringList() {
                return Collections.unmodifiableList(((PassiveMonitoringCapabilities) this.instance).getSupportedDataTypesPassiveMonitoringList());
            }

            public HealthEvent.HealthEventType getSupportedHealthEventTypes(int i8) {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedHealthEventTypes(i8);
            }

            public int getSupportedHealthEventTypesCount() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedHealthEventTypesCount();
            }

            public List<HealthEvent.HealthEventType> getSupportedHealthEventTypesList() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedHealthEventTypesList();
            }

            public int getSupportedHrSamplingIntervalsSeconds(int i8) {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedHrSamplingIntervalsSeconds(i8);
            }

            public int getSupportedHrSamplingIntervalsSecondsCount() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedHrSamplingIntervalsSecondsCount();
            }

            public List<Integer> getSupportedHrSamplingIntervalsSecondsList() {
                return Collections.unmodifiableList(((PassiveMonitoringCapabilities) this.instance).getSupportedHrSamplingIntervalsSecondsList());
            }

            public UserActivityState getSupportedUserActivityStates(int i8) {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedUserActivityStates(i8);
            }

            public int getSupportedUserActivityStatesCount() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedUserActivityStatesCount();
            }

            public List<UserActivityState> getSupportedUserActivityStatesList() {
                return ((PassiveMonitoringCapabilities) this.instance).getSupportedUserActivityStatesList();
            }

            public Builder removeSupportedDataTypesPassiveGoals(int i8) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).removeSupportedDataTypesPassiveGoals(i8);
                return this;
            }

            public Builder removeSupportedDataTypesPassiveMonitoring(int i8) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).removeSupportedDataTypesPassiveMonitoring(i8);
                return this;
            }

            public Builder setSupportedDataTypesPassiveGoals(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedDataTypesPassiveGoals(i8, (DataType) builder.build());
                return this;
            }

            public Builder setSupportedDataTypesPassiveGoals(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedDataTypesPassiveGoals(i8, dataType);
                return this;
            }

            public Builder setSupportedDataTypesPassiveMonitoring(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedDataTypesPassiveMonitoring(i8, (DataType) builder.build());
                return this;
            }

            public Builder setSupportedDataTypesPassiveMonitoring(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedDataTypesPassiveMonitoring(i8, dataType);
                return this;
            }

            public Builder setSupportedHealthEventTypes(int i8, HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedHealthEventTypes(i8, healthEventType);
                return this;
            }

            public Builder setSupportedHrSamplingIntervalsSeconds(int i8, int i9) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedHrSamplingIntervalsSeconds(i8, i9);
                return this;
            }

            public Builder setSupportedUserActivityStates(int i8, UserActivityState userActivityState) {
                copyOnWrite();
                ((PassiveMonitoringCapabilities) this.instance).setSupportedUserActivityStates(i8, userActivityState);
                return this;
            }
        }

        static {
            PassiveMonitoringCapabilities passiveMonitoringCapabilities = new PassiveMonitoringCapabilities();
            DEFAULT_INSTANCE = passiveMonitoringCapabilities;
            y.registerDefaultInstance(PassiveMonitoringCapabilities.class, passiveMonitoringCapabilities);
        }

        private PassiveMonitoringCapabilities() {
        }

        /* access modifiers changed from: private */
        public void addAllSupportedDataTypesPassiveGoals(Iterable<? extends DataType> iterable) {
            ensureSupportedDataTypesPassiveGoalsIsMutable();
            a.addAll(iterable, this.supportedDataTypesPassiveGoals_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedDataTypesPassiveMonitoring(Iterable<? extends DataType> iterable) {
            ensureSupportedDataTypesPassiveMonitoringIsMutable();
            a.addAll(iterable, this.supportedDataTypesPassiveMonitoring_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedHealthEventTypes(Iterable<? extends HealthEvent.HealthEventType> iterable) {
            ensureSupportedHealthEventTypesIsMutable();
            for (HealthEvent.HealthEventType number : iterable) {
                ((z) this.supportedHealthEventTypes_).j(number.getNumber());
            }
        }

        /* access modifiers changed from: private */
        public void addAllSupportedHrSamplingIntervalsSeconds(Iterable<? extends Integer> iterable) {
            ensureSupportedHrSamplingIntervalsSecondsIsMutable();
            a.addAll(iterable, this.supportedHrSamplingIntervalsSeconds_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedUserActivityStates(Iterable<? extends UserActivityState> iterable) {
            ensureSupportedUserActivityStatesIsMutable();
            for (UserActivityState number : iterable) {
                ((z) this.supportedUserActivityStates_).j(number.getNumber());
            }
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypesPassiveGoals(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveGoalsIsMutable();
            this.supportedDataTypesPassiveGoals_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypesPassiveGoals(DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveGoalsIsMutable();
            this.supportedDataTypesPassiveGoals_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypesPassiveMonitoring(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveMonitoringIsMutable();
            this.supportedDataTypesPassiveMonitoring_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedDataTypesPassiveMonitoring(DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveMonitoringIsMutable();
            this.supportedDataTypesPassiveMonitoring_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void addSupportedHealthEventTypes(HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureSupportedHealthEventTypesIsMutable();
            ((z) this.supportedHealthEventTypes_).j(healthEventType.getNumber());
        }

        /* access modifiers changed from: private */
        public void addSupportedHrSamplingIntervalsSeconds(int i8) {
            ensureSupportedHrSamplingIntervalsSecondsIsMutable();
            ((z) this.supportedHrSamplingIntervalsSeconds_).j(i8);
        }

        /* access modifiers changed from: private */
        public void addSupportedUserActivityStates(UserActivityState userActivityState) {
            userActivityState.getClass();
            ensureSupportedUserActivityStatesIsMutable();
            ((z) this.supportedUserActivityStates_).j(userActivityState.getNumber());
        }

        /* access modifiers changed from: private */
        public void clearSupportedDataTypesPassiveGoals() {
            this.supportedDataTypesPassiveGoals_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedDataTypesPassiveMonitoring() {
            this.supportedDataTypesPassiveMonitoring_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedHealthEventTypes() {
            this.supportedHealthEventTypes_ = y.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedHrSamplingIntervalsSeconds() {
            this.supportedHrSamplingIntervalsSeconds_ = y.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedUserActivityStates() {
            this.supportedUserActivityStates_ = y.emptyIntList();
        }

        private void ensureSupportedDataTypesPassiveGoalsIsMutable() {
            a0.j<DataType> jVar = this.supportedDataTypesPassiveGoals_;
            if (!jVar.f()) {
                this.supportedDataTypesPassiveGoals_ = y.mutableCopy(jVar);
            }
        }

        private void ensureSupportedDataTypesPassiveMonitoringIsMutable() {
            a0.j<DataType> jVar = this.supportedDataTypesPassiveMonitoring_;
            if (!jVar.f()) {
                this.supportedDataTypesPassiveMonitoring_ = y.mutableCopy(jVar);
            }
        }

        private void ensureSupportedHealthEventTypesIsMutable() {
            a0.g gVar = this.supportedHealthEventTypes_;
            if (!((c) gVar).f3599f) {
                this.supportedHealthEventTypes_ = y.mutableCopy(gVar);
            }
        }

        private void ensureSupportedHrSamplingIntervalsSecondsIsMutable() {
            a0.g gVar = this.supportedHrSamplingIntervalsSeconds_;
            if (!((c) gVar).f3599f) {
                this.supportedHrSamplingIntervalsSeconds_ = y.mutableCopy(gVar);
            }
        }

        private void ensureSupportedUserActivityStatesIsMutable() {
            a0.g gVar = this.supportedUserActivityStates_;
            if (!((c) gVar).f3599f) {
                this.supportedUserActivityStates_ = y.mutableCopy(gVar);
            }
        }

        public static PassiveMonitoringCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringCapabilities passiveMonitoringCapabilities) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringCapabilities);
        }

        public static PassiveMonitoringCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringCapabilities parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(i iVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(j jVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(InputStream inputStream) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringCapabilities parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringCapabilities parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringCapabilities parseFrom(byte[] bArr) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringCapabilities parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringCapabilities) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringCapabilities> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSupportedDataTypesPassiveGoals(int i8) {
            ensureSupportedDataTypesPassiveGoalsIsMutable();
            this.supportedDataTypesPassiveGoals_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeSupportedDataTypesPassiveMonitoring(int i8) {
            ensureSupportedDataTypesPassiveMonitoringIsMutable();
            this.supportedDataTypesPassiveMonitoring_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setSupportedDataTypesPassiveGoals(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveGoalsIsMutable();
            this.supportedDataTypesPassiveGoals_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setSupportedDataTypesPassiveMonitoring(int i8, DataType dataType) {
            dataType.getClass();
            ensureSupportedDataTypesPassiveMonitoringIsMutable();
            this.supportedDataTypesPassiveMonitoring_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setSupportedHealthEventTypes(int i8, HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureSupportedHealthEventTypesIsMutable();
            ((z) this.supportedHealthEventTypes_).m(i8, healthEventType.getNumber());
        }

        /* access modifiers changed from: private */
        public void setSupportedHrSamplingIntervalsSeconds(int i8, int i9) {
            ensureSupportedHrSamplingIntervalsSecondsIsMutable();
            ((z) this.supportedHrSamplingIntervalsSeconds_).m(i8, i9);
        }

        /* access modifiers changed from: private */
        public void setSupportedUserActivityStates(int i8, UserActivityState userActivityState) {
            userActivityState.getClass();
            ensureSupportedUserActivityStatesIsMutable();
            ((z) this.supportedUserActivityStates_).m(i8, userActivityState.getNumber());
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003'\u0004,\u0005,", new Object[]{"supportedDataTypesPassiveMonitoring_", DataType.class, "supportedDataTypesPassiveGoals_", DataType.class, "supportedHrSamplingIntervalsSeconds_", "supportedHealthEventTypes_", HealthEvent.HealthEventType.internalGetVerifier(), "supportedUserActivityStates_", UserActivityState.internalGetVerifier()});
                case 3:
                    return new PassiveMonitoringCapabilities();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringCapabilities> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringCapabilities.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getSupportedDataTypesPassiveGoals(int i8) {
            return this.supportedDataTypesPassiveGoals_.get(i8);
        }

        public int getSupportedDataTypesPassiveGoalsCount() {
            return this.supportedDataTypesPassiveGoals_.size();
        }

        public List<DataType> getSupportedDataTypesPassiveGoalsList() {
            return this.supportedDataTypesPassiveGoals_;
        }

        public DataTypeOrBuilder getSupportedDataTypesPassiveGoalsOrBuilder(int i8) {
            return this.supportedDataTypesPassiveGoals_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getSupportedDataTypesPassiveGoalsOrBuilderList() {
            return this.supportedDataTypesPassiveGoals_;
        }

        public DataType getSupportedDataTypesPassiveMonitoring(int i8) {
            return this.supportedDataTypesPassiveMonitoring_.get(i8);
        }

        public int getSupportedDataTypesPassiveMonitoringCount() {
            return this.supportedDataTypesPassiveMonitoring_.size();
        }

        public List<DataType> getSupportedDataTypesPassiveMonitoringList() {
            return this.supportedDataTypesPassiveMonitoring_;
        }

        public DataTypeOrBuilder getSupportedDataTypesPassiveMonitoringOrBuilder(int i8) {
            return this.supportedDataTypesPassiveMonitoring_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getSupportedDataTypesPassiveMonitoringOrBuilderList() {
            return this.supportedDataTypesPassiveMonitoring_;
        }

        public HealthEvent.HealthEventType getSupportedHealthEventTypes(int i8) {
            HealthEvent.HealthEventType forNumber = HealthEvent.HealthEventType.forNumber(((z) this.supportedHealthEventTypes_).l(i8));
            return forNumber == null ? HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
        }

        public int getSupportedHealthEventTypesCount() {
            return ((z) this.supportedHealthEventTypes_).f3832h;
        }

        public List<HealthEvent.HealthEventType> getSupportedHealthEventTypesList() {
            return new a0.h(this.supportedHealthEventTypes_, supportedHealthEventTypes_converter_);
        }

        public int getSupportedHrSamplingIntervalsSeconds(int i8) {
            return ((z) this.supportedHrSamplingIntervalsSeconds_).l(i8);
        }

        public int getSupportedHrSamplingIntervalsSecondsCount() {
            return ((z) this.supportedHrSamplingIntervalsSeconds_).f3832h;
        }

        public List<Integer> getSupportedHrSamplingIntervalsSecondsList() {
            return this.supportedHrSamplingIntervalsSeconds_;
        }

        public UserActivityState getSupportedUserActivityStates(int i8) {
            UserActivityState forNumber = UserActivityState.forNumber(((z) this.supportedUserActivityStates_).l(i8));
            return forNumber == null ? UserActivityState.USER_ACTIVITY_STATE_UNKNOWN : forNumber;
        }

        public int getSupportedUserActivityStatesCount() {
            return ((z) this.supportedUserActivityStates_).f3832h;
        }

        public List<UserActivityState> getSupportedUserActivityStatesList() {
            return new a0.h(this.supportedUserActivityStates_, supportedUserActivityStates_converter_);
        }
    }

    public interface PassiveMonitoringCapabilitiesOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataType getSupportedDataTypesPassiveGoals(int i8);

        int getSupportedDataTypesPassiveGoalsCount();

        List<DataType> getSupportedDataTypesPassiveGoalsList();

        DataType getSupportedDataTypesPassiveMonitoring(int i8);

        int getSupportedDataTypesPassiveMonitoringCount();

        List<DataType> getSupportedDataTypesPassiveMonitoringList();

        HealthEvent.HealthEventType getSupportedHealthEventTypes(int i8);

        int getSupportedHealthEventTypesCount();

        List<HealthEvent.HealthEventType> getSupportedHealthEventTypesList();

        int getSupportedHrSamplingIntervalsSeconds(int i8);

        int getSupportedHrSamplingIntervalsSecondsCount();

        List<Integer> getSupportedHrSamplingIntervalsSecondsList();

        UserActivityState getSupportedUserActivityStates(int i8);

        int getSupportedUserActivityStatesCount();

        List<UserActivityState> getSupportedUserActivityStatesList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringConfig extends y<PassiveMonitoringConfig, Builder> implements PassiveMonitoringConfigOrBuilder {
        public static final int DATA_TYPES_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PassiveMonitoringConfig DEFAULT_INSTANCE;
        public static final int INCLUDE_USER_ACTIVITY_STATE_FIELD_NUMBER = 4;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
        private static volatile z0<PassiveMonitoringConfig> PARSER = null;
        public static final int RECEIVER_CLASS_NAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private a0.j<DataType> dataTypes_ = y.emptyProtobufList();
        private boolean includeUserActivityState_;
        private String packageName_ = "";
        private String receiverClassName_ = "";

        public static final class Builder extends y.a<PassiveMonitoringConfig, Builder> implements PassiveMonitoringConfigOrBuilder {
            private Builder() {
                super(PassiveMonitoringConfig.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).addAllDataTypes(iterable);
                return this;
            }

            public Builder addDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).addDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).addDataTypes(i8, dataType);
                return this;
            }

            public Builder addDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).addDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).addDataTypes(dataType);
                return this;
            }

            public Builder clearDataTypes() {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).clearDataTypes();
                return this;
            }

            public Builder clearIncludeUserActivityState() {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).clearIncludeUserActivityState();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).clearPackageName();
                return this;
            }

            public Builder clearReceiverClassName() {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).clearReceiverClassName();
                return this;
            }

            public DataType getDataTypes(int i8) {
                return ((PassiveMonitoringConfig) this.instance).getDataTypes(i8);
            }

            public int getDataTypesCount() {
                return ((PassiveMonitoringConfig) this.instance).getDataTypesCount();
            }

            public List<DataType> getDataTypesList() {
                return Collections.unmodifiableList(((PassiveMonitoringConfig) this.instance).getDataTypesList());
            }

            public boolean getIncludeUserActivityState() {
                return ((PassiveMonitoringConfig) this.instance).getIncludeUserActivityState();
            }

            public String getPackageName() {
                return ((PassiveMonitoringConfig) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((PassiveMonitoringConfig) this.instance).getPackageNameBytes();
            }

            public String getReceiverClassName() {
                return ((PassiveMonitoringConfig) this.instance).getReceiverClassName();
            }

            public i getReceiverClassNameBytes() {
                return ((PassiveMonitoringConfig) this.instance).getReceiverClassNameBytes();
            }

            public boolean hasIncludeUserActivityState() {
                return ((PassiveMonitoringConfig) this.instance).hasIncludeUserActivityState();
            }

            public boolean hasPackageName() {
                return ((PassiveMonitoringConfig) this.instance).hasPackageName();
            }

            public boolean hasReceiverClassName() {
                return ((PassiveMonitoringConfig) this.instance).hasReceiverClassName();
            }

            public Builder removeDataTypes(int i8) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).removeDataTypes(i8);
                return this;
            }

            public Builder setDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setDataTypes(i8, dataType);
                return this;
            }

            public Builder setIncludeUserActivityState(boolean z8) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setIncludeUserActivityState(z8);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setPackageNameBytes(iVar);
                return this;
            }

            public Builder setReceiverClassName(String str) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setReceiverClassName(str);
                return this;
            }

            public Builder setReceiverClassNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveMonitoringConfig) this.instance).setReceiverClassNameBytes(iVar);
                return this;
            }
        }

        static {
            PassiveMonitoringConfig passiveMonitoringConfig = new PassiveMonitoringConfig();
            DEFAULT_INSTANCE = passiveMonitoringConfig;
            y.registerDefaultInstance(PassiveMonitoringConfig.class, passiveMonitoringConfig);
        }

        private PassiveMonitoringConfig() {
        }

        /* access modifiers changed from: private */
        public void addAllDataTypes(Iterable<? extends DataType> iterable) {
            ensureDataTypesIsMutable();
            a.addAll(iterable, this.dataTypes_);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void clearDataTypes() {
            this.dataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearIncludeUserActivityState() {
            this.bitField0_ &= -5;
            this.includeUserActivityState_ = false;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        /* access modifiers changed from: private */
        public void clearReceiverClassName() {
            this.bitField0_ &= -3;
            this.receiverClassName_ = getDefaultInstance().getReceiverClassName();
        }

        private void ensureDataTypesIsMutable() {
            a0.j<DataType> jVar = this.dataTypes_;
            if (!jVar.f()) {
                this.dataTypes_ = y.mutableCopy(jVar);
            }
        }

        public static PassiveMonitoringConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringConfig passiveMonitoringConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringConfig);
        }

        public static PassiveMonitoringConfig parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringConfig parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringConfig parseFrom(i iVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringConfig parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringConfig parseFrom(j jVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringConfig parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringConfig parseFrom(InputStream inputStream) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringConfig parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringConfig parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringConfig parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringConfig parseFrom(byte[] bArr) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringConfig parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringConfig) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeDataTypes(int i8) {
            ensureDataTypesIsMutable();
            this.dataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setIncludeUserActivityState(boolean z8) {
            this.bitField0_ |= 4;
            this.includeUserActivityState_ = z8;
        }

        /* access modifiers changed from: private */
        public void setPackageName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.packageName_ = str;
        }

        /* access modifiers changed from: private */
        public void setPackageNameBytes(i iVar) {
            this.packageName_ = iVar.u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setReceiverClassName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.receiverClassName_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverClassNameBytes(i iVar) {
            this.receiverClassName_ = iVar.u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "dataTypes_", DataType.class, "packageName_", "receiverClassName_", "includeUserActivityState_"});
                case 3:
                    return new PassiveMonitoringConfig();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringConfig> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringConfig.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getDataTypes(int i8) {
            return this.dataTypes_.get(i8);
        }

        public int getDataTypesCount() {
            return this.dataTypes_.size();
        }

        public List<DataType> getDataTypesList() {
            return this.dataTypes_;
        }

        public DataTypeOrBuilder getDataTypesOrBuilder(int i8) {
            return this.dataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getDataTypesOrBuilderList() {
            return this.dataTypes_;
        }

        public boolean getIncludeUserActivityState() {
            return this.includeUserActivityState_;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public String getReceiverClassName() {
            return this.receiverClassName_;
        }

        public i getReceiverClassNameBytes() {
            return i.l(this.receiverClassName_);
        }

        public boolean hasIncludeUserActivityState() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReceiverClassName() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface PassiveMonitoringConfigOrBuilder extends s0 {
        DataType getDataTypes(int i8);

        int getDataTypesCount();

        List<DataType> getDataTypesList();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean getIncludeUserActivityState();

        String getPackageName();

        i getPackageNameBytes();

        String getReceiverClassName();

        i getReceiverClassNameBytes();

        boolean hasIncludeUserActivityState();

        boolean hasPackageName();

        boolean hasReceiverClassName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringUpdate extends y<PassiveMonitoringUpdate, Builder> implements PassiveMonitoringUpdateOrBuilder {
        public static final int DATA_POINTS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PassiveMonitoringUpdate DEFAULT_INSTANCE;
        private static volatile z0<PassiveMonitoringUpdate> PARSER = null;
        public static final int USER_ACTIVITY_INFO_UPDATES_FIELD_NUMBER = 2;
        private a0.j<DataPoint> dataPoints_ = y.emptyProtobufList();
        private a0.j<UserActivityInfo> userActivityInfoUpdates_ = y.emptyProtobufList();

        public static final class Builder extends y.a<PassiveMonitoringUpdate, Builder> implements PassiveMonitoringUpdateOrBuilder {
            private Builder() {
                super(PassiveMonitoringUpdate.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllDataPoints(Iterable<? extends DataPoint> iterable) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addAllDataPoints(iterable);
                return this;
            }

            public Builder addAllUserActivityInfoUpdates(Iterable<? extends UserActivityInfo> iterable) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addAllUserActivityInfoUpdates(iterable);
                return this;
            }

            public Builder addDataPoints(int i8, DataPoint.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addDataPoints(i8, (DataPoint) builder.build());
                return this;
            }

            public Builder addDataPoints(int i8, DataPoint dataPoint) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addDataPoints(i8, dataPoint);
                return this;
            }

            public Builder addDataPoints(DataPoint.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addDataPoints((DataPoint) builder.build());
                return this;
            }

            public Builder addDataPoints(DataPoint dataPoint) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addDataPoints(dataPoint);
                return this;
            }

            public Builder addUserActivityInfoUpdates(int i8, UserActivityInfo.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addUserActivityInfoUpdates(i8, (UserActivityInfo) builder.build());
                return this;
            }

            public Builder addUserActivityInfoUpdates(int i8, UserActivityInfo userActivityInfo) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addUserActivityInfoUpdates(i8, userActivityInfo);
                return this;
            }

            public Builder addUserActivityInfoUpdates(UserActivityInfo.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addUserActivityInfoUpdates((UserActivityInfo) builder.build());
                return this;
            }

            public Builder addUserActivityInfoUpdates(UserActivityInfo userActivityInfo) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).addUserActivityInfoUpdates(userActivityInfo);
                return this;
            }

            public Builder clearDataPoints() {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).clearDataPoints();
                return this;
            }

            public Builder clearUserActivityInfoUpdates() {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).clearUserActivityInfoUpdates();
                return this;
            }

            public DataPoint getDataPoints(int i8) {
                return ((PassiveMonitoringUpdate) this.instance).getDataPoints(i8);
            }

            public int getDataPointsCount() {
                return ((PassiveMonitoringUpdate) this.instance).getDataPointsCount();
            }

            public List<DataPoint> getDataPointsList() {
                return Collections.unmodifiableList(((PassiveMonitoringUpdate) this.instance).getDataPointsList());
            }

            public UserActivityInfo getUserActivityInfoUpdates(int i8) {
                return ((PassiveMonitoringUpdate) this.instance).getUserActivityInfoUpdates(i8);
            }

            public int getUserActivityInfoUpdatesCount() {
                return ((PassiveMonitoringUpdate) this.instance).getUserActivityInfoUpdatesCount();
            }

            public List<UserActivityInfo> getUserActivityInfoUpdatesList() {
                return Collections.unmodifiableList(((PassiveMonitoringUpdate) this.instance).getUserActivityInfoUpdatesList());
            }

            public Builder removeDataPoints(int i8) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).removeDataPoints(i8);
                return this;
            }

            public Builder removeUserActivityInfoUpdates(int i8) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).removeUserActivityInfoUpdates(i8);
                return this;
            }

            public Builder setDataPoints(int i8, DataPoint.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).setDataPoints(i8, (DataPoint) builder.build());
                return this;
            }

            public Builder setDataPoints(int i8, DataPoint dataPoint) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).setDataPoints(i8, dataPoint);
                return this;
            }

            public Builder setUserActivityInfoUpdates(int i8, UserActivityInfo.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).setUserActivityInfoUpdates(i8, (UserActivityInfo) builder.build());
                return this;
            }

            public Builder setUserActivityInfoUpdates(int i8, UserActivityInfo userActivityInfo) {
                copyOnWrite();
                ((PassiveMonitoringUpdate) this.instance).setUserActivityInfoUpdates(i8, userActivityInfo);
                return this;
            }
        }

        static {
            PassiveMonitoringUpdate passiveMonitoringUpdate = new PassiveMonitoringUpdate();
            DEFAULT_INSTANCE = passiveMonitoringUpdate;
            y.registerDefaultInstance(PassiveMonitoringUpdate.class, passiveMonitoringUpdate);
        }

        private PassiveMonitoringUpdate() {
        }

        /* access modifiers changed from: private */
        public void addAllDataPoints(Iterable<? extends DataPoint> iterable) {
            ensureDataPointsIsMutable();
            a.addAll(iterable, this.dataPoints_);
        }

        /* access modifiers changed from: private */
        public void addAllUserActivityInfoUpdates(Iterable<? extends UserActivityInfo> iterable) {
            ensureUserActivityInfoUpdatesIsMutable();
            a.addAll(iterable, this.userActivityInfoUpdates_);
        }

        /* access modifiers changed from: private */
        public void addDataPoints(int i8, DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(i8, dataPoint);
        }

        /* access modifiers changed from: private */
        public void addDataPoints(DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(dataPoint);
        }

        /* access modifiers changed from: private */
        public void addUserActivityInfoUpdates(int i8, UserActivityInfo userActivityInfo) {
            userActivityInfo.getClass();
            ensureUserActivityInfoUpdatesIsMutable();
            this.userActivityInfoUpdates_.add(i8, userActivityInfo);
        }

        /* access modifiers changed from: private */
        public void addUserActivityInfoUpdates(UserActivityInfo userActivityInfo) {
            userActivityInfo.getClass();
            ensureUserActivityInfoUpdatesIsMutable();
            this.userActivityInfoUpdates_.add(userActivityInfo);
        }

        /* access modifiers changed from: private */
        public void clearDataPoints() {
            this.dataPoints_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearUserActivityInfoUpdates() {
            this.userActivityInfoUpdates_ = y.emptyProtobufList();
        }

        private void ensureDataPointsIsMutable() {
            a0.j<DataPoint> jVar = this.dataPoints_;
            if (!jVar.f()) {
                this.dataPoints_ = y.mutableCopy(jVar);
            }
        }

        private void ensureUserActivityInfoUpdatesIsMutable() {
            a0.j<UserActivityInfo> jVar = this.userActivityInfoUpdates_;
            if (!jVar.f()) {
                this.userActivityInfoUpdates_ = y.mutableCopy(jVar);
            }
        }

        public static PassiveMonitoringUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringUpdate passiveMonitoringUpdate) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringUpdate);
        }

        public static PassiveMonitoringUpdate parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringUpdate) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringUpdate parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringUpdate) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringUpdate parseFrom(i iVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringUpdate parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringUpdate parseFrom(j jVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringUpdate parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringUpdate parseFrom(InputStream inputStream) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringUpdate parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringUpdate parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringUpdate parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringUpdate parseFrom(byte[] bArr) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringUpdate parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringUpdate) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringUpdate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeDataPoints(int i8) {
            ensureDataPointsIsMutable();
            this.dataPoints_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void removeUserActivityInfoUpdates(int i8) {
            ensureUserActivityInfoUpdatesIsMutable();
            this.userActivityInfoUpdates_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setDataPoints(int i8, DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.set(i8, dataPoint);
        }

        /* access modifiers changed from: private */
        public void setUserActivityInfoUpdates(int i8, UserActivityInfo userActivityInfo) {
            userActivityInfo.getClass();
            ensureUserActivityInfoUpdatesIsMutable();
            this.userActivityInfoUpdates_.set(i8, userActivityInfo);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"dataPoints_", DataPoint.class, "userActivityInfoUpdates_", UserActivityInfo.class});
                case 3:
                    return new PassiveMonitoringUpdate();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringUpdate> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringUpdate.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataPoint getDataPoints(int i8) {
            return this.dataPoints_.get(i8);
        }

        public int getDataPointsCount() {
            return this.dataPoints_.size();
        }

        public List<DataPoint> getDataPointsList() {
            return this.dataPoints_;
        }

        public DataPointOrBuilder getDataPointsOrBuilder(int i8) {
            return this.dataPoints_.get(i8);
        }

        public List<? extends DataPointOrBuilder> getDataPointsOrBuilderList() {
            return this.dataPoints_;
        }

        public UserActivityInfo getUserActivityInfoUpdates(int i8) {
            return this.userActivityInfoUpdates_.get(i8);
        }

        public int getUserActivityInfoUpdatesCount() {
            return this.userActivityInfoUpdates_.size();
        }

        public List<UserActivityInfo> getUserActivityInfoUpdatesList() {
            return this.userActivityInfoUpdates_;
        }

        public UserActivityInfoOrBuilder getUserActivityInfoUpdatesOrBuilder(int i8) {
            return this.userActivityInfoUpdates_.get(i8);
        }

        public List<? extends UserActivityInfoOrBuilder> getUserActivityInfoUpdatesOrBuilderList() {
            return this.userActivityInfoUpdates_;
        }
    }

    public interface PassiveMonitoringUpdateOrBuilder extends s0 {
        DataPoint getDataPoints(int i8);

        int getDataPointsCount();

        List<DataPoint> getDataPointsList();

        /* synthetic */ r0 getDefaultInstanceForType();

        UserActivityInfo getUserActivityInfoUpdates(int i8);

        int getUserActivityInfoUpdatesCount();

        List<UserActivityInfo> getUserActivityInfoUpdatesList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class UserActivityInfo extends y<UserActivityInfo, Builder> implements UserActivityInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final UserActivityInfo DEFAULT_INSTANCE;
        public static final int EXERCISE_INFO_FIELD_NUMBER = 2;
        private static volatile z0<UserActivityInfo> PARSER = null;
        public static final int STATE_CHANGE_TIME_EPOCH_MS_FIELD_NUMBER = 3;
        public static final int STATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private ExerciseInfo exerciseInfo_;
        private long stateChangeTimeEpochMs_;
        private int state_;

        public static final class Builder extends y.a<UserActivityInfo, Builder> implements UserActivityInfoOrBuilder {
            private Builder() {
                super(UserActivityInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearExerciseInfo() {
                copyOnWrite();
                ((UserActivityInfo) this.instance).clearExerciseInfo();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((UserActivityInfo) this.instance).clearState();
                return this;
            }

            public Builder clearStateChangeTimeEpochMs() {
                copyOnWrite();
                ((UserActivityInfo) this.instance).clearStateChangeTimeEpochMs();
                return this;
            }

            public ExerciseInfo getExerciseInfo() {
                return ((UserActivityInfo) this.instance).getExerciseInfo();
            }

            public UserActivityState getState() {
                return ((UserActivityInfo) this.instance).getState();
            }

            public long getStateChangeTimeEpochMs() {
                return ((UserActivityInfo) this.instance).getStateChangeTimeEpochMs();
            }

            public boolean hasExerciseInfo() {
                return ((UserActivityInfo) this.instance).hasExerciseInfo();
            }

            public boolean hasState() {
                return ((UserActivityInfo) this.instance).hasState();
            }

            public boolean hasStateChangeTimeEpochMs() {
                return ((UserActivityInfo) this.instance).hasStateChangeTimeEpochMs();
            }

            public Builder mergeExerciseInfo(ExerciseInfo exerciseInfo) {
                copyOnWrite();
                ((UserActivityInfo) this.instance).mergeExerciseInfo(exerciseInfo);
                return this;
            }

            public Builder setExerciseInfo(ExerciseInfo.Builder builder) {
                copyOnWrite();
                ((UserActivityInfo) this.instance).setExerciseInfo((ExerciseInfo) builder.build());
                return this;
            }

            public Builder setExerciseInfo(ExerciseInfo exerciseInfo) {
                copyOnWrite();
                ((UserActivityInfo) this.instance).setExerciseInfo(exerciseInfo);
                return this;
            }

            public Builder setState(UserActivityState userActivityState) {
                copyOnWrite();
                ((UserActivityInfo) this.instance).setState(userActivityState);
                return this;
            }

            public Builder setStateChangeTimeEpochMs(long j8) {
                copyOnWrite();
                ((UserActivityInfo) this.instance).setStateChangeTimeEpochMs(j8);
                return this;
            }
        }

        static {
            UserActivityInfo userActivityInfo = new UserActivityInfo();
            DEFAULT_INSTANCE = userActivityInfo;
            y.registerDefaultInstance(UserActivityInfo.class, userActivityInfo);
        }

        private UserActivityInfo() {
        }

        /* access modifiers changed from: private */
        public void clearExerciseInfo() {
            this.exerciseInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStateChangeTimeEpochMs() {
            this.bitField0_ &= -5;
            this.stateChangeTimeEpochMs_ = 0;
        }

        public static UserActivityInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseInfo(ExerciseInfo exerciseInfo) {
            exerciseInfo.getClass();
            ExerciseInfo exerciseInfo2 = this.exerciseInfo_;
            if (!(exerciseInfo2 == null || exerciseInfo2 == ExerciseInfo.getDefaultInstance())) {
                exerciseInfo = (ExerciseInfo) ((ExerciseInfo.Builder) ExerciseInfo.newBuilder(this.exerciseInfo_).mergeFrom(exerciseInfo)).buildPartial();
            }
            this.exerciseInfo_ = exerciseInfo;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UserActivityInfo userActivityInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(userActivityInfo);
        }

        public static UserActivityInfo parseDelimitedFrom(InputStream inputStream) {
            return (UserActivityInfo) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserActivityInfo parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (UserActivityInfo) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserActivityInfo parseFrom(i iVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static UserActivityInfo parseFrom(i iVar, q qVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static UserActivityInfo parseFrom(j jVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static UserActivityInfo parseFrom(j jVar, q qVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static UserActivityInfo parseFrom(InputStream inputStream) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserActivityInfo parseFrom(InputStream inputStream, q qVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static UserActivityInfo parseFrom(ByteBuffer byteBuffer) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static UserActivityInfo parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static UserActivityInfo parseFrom(byte[] bArr) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserActivityInfo parseFrom(byte[] bArr, q qVar) {
            return (UserActivityInfo) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<UserActivityInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExerciseInfo(ExerciseInfo exerciseInfo) {
            exerciseInfo.getClass();
            this.exerciseInfo_ = exerciseInfo;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setState(UserActivityState userActivityState) {
            this.state_ = userActivityState.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setStateChangeTimeEpochMs(long j8) {
            this.bitField0_ |= 4;
            this.stateChangeTimeEpochMs_ = j8;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "state_", UserActivityState.internalGetVerifier(), "exerciseInfo_", "stateChangeTimeEpochMs_"});
                case 3:
                    return new UserActivityInfo();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<UserActivityInfo> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (UserActivityInfo.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ExerciseInfo getExerciseInfo() {
            ExerciseInfo exerciseInfo = this.exerciseInfo_;
            return exerciseInfo == null ? ExerciseInfo.getDefaultInstance() : exerciseInfo;
        }

        public UserActivityState getState() {
            UserActivityState forNumber = UserActivityState.forNumber(this.state_);
            return forNumber == null ? UserActivityState.USER_ACTIVITY_STATE_UNKNOWN : forNumber;
        }

        public long getStateChangeTimeEpochMs() {
            return this.stateChangeTimeEpochMs_;
        }

        public boolean hasExerciseInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStateChangeTimeEpochMs() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    public interface UserActivityInfoOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseInfo getExerciseInfo();

        UserActivityState getState();

        long getStateChangeTimeEpochMs();

        boolean hasExerciseInfo();

        boolean hasState();

        boolean hasStateChangeTimeEpochMs();

        /* synthetic */ boolean isInitialized();
    }

    public enum UserActivityState implements a0.c {
        USER_ACTIVITY_STATE_UNKNOWN(0),
        USER_ACTIVITY_STATE_EXERCISE(1),
        USER_ACTIVITY_STATE_PASSIVE(2),
        USER_ACTIVITY_STATE_ASLEEP(3);
        
        public static final int USER_ACTIVITY_STATE_ASLEEP_VALUE = 3;
        public static final int USER_ACTIVITY_STATE_EXERCISE_VALUE = 1;
        public static final int USER_ACTIVITY_STATE_PASSIVE_VALUE = 2;
        public static final int USER_ACTIVITY_STATE_UNKNOWN_VALUE = 0;
        private static final a0.d<UserActivityState> internalValueMap = null;
        private final int value;

        public static final class UserActivityStateVerifier implements a0.e {
            static final a0.e INSTANCE = null;

            static {
                INSTANCE = new UserActivityStateVerifier();
            }

            private UserActivityStateVerifier() {
            }

            public boolean isInRange(int i8) {
                return UserActivityState.forNumber(i8) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a0.d<UserActivityState>() {
                public UserActivityState findValueByNumber(int i8) {
                    return UserActivityState.forNumber(i8);
                }
            };
        }

        private UserActivityState(int i8) {
            this.value = i8;
        }

        public static UserActivityState forNumber(int i8) {
            if (i8 == 0) {
                return USER_ACTIVITY_STATE_UNKNOWN;
            }
            if (i8 == 1) {
                return USER_ACTIVITY_STATE_EXERCISE;
            }
            if (i8 == 2) {
                return USER_ACTIVITY_STATE_PASSIVE;
            }
            if (i8 != 3) {
                return null;
            }
            return USER_ACTIVITY_STATE_ASLEEP;
        }

        public static a0.d<UserActivityState> internalGetValueMap() {
            return internalValueMap;
        }

        public static a0.e internalGetVerifier() {
            return UserActivityStateVerifier.INSTANCE;
        }

        @Deprecated
        public static UserActivityState valueOf(int i8) {
            return forNumber(i8);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    public static final class Value extends y<Value, Builder> implements ValueOrBuilder {
        public static final int BOOL_VAL_FIELD_NUMBER = 1;
        public static final int BYTE_ARRAY_VAL_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_ARRAY_VAL_FIELD_NUMBER = 4;
        public static final int DOUBLE_VAL_FIELD_NUMBER = 3;
        public static final int LONG_VAL_FIELD_NUMBER = 2;
        private static volatile z0<Value> PARSER;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends y.a<Value, Builder> implements ValueOrBuilder {
            private Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearBoolVal() {
                copyOnWrite();
                ((Value) this.instance).clearBoolVal();
                return this;
            }

            public Builder clearByteArrayVal() {
                copyOnWrite();
                ((Value) this.instance).clearByteArrayVal();
                return this;
            }

            public Builder clearDoubleArrayVal() {
                copyOnWrite();
                ((Value) this.instance).clearDoubleArrayVal();
                return this;
            }

            public Builder clearDoubleVal() {
                copyOnWrite();
                ((Value) this.instance).clearDoubleVal();
                return this;
            }

            public Builder clearLongVal() {
                copyOnWrite();
                ((Value) this.instance).clearLongVal();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Value) this.instance).clearValue();
                return this;
            }

            public boolean getBoolVal() {
                return ((Value) this.instance).getBoolVal();
            }

            public i getByteArrayVal() {
                return ((Value) this.instance).getByteArrayVal();
            }

            public DoubleArray getDoubleArrayVal() {
                return ((Value) this.instance).getDoubleArrayVal();
            }

            public double getDoubleVal() {
                return ((Value) this.instance).getDoubleVal();
            }

            public long getLongVal() {
                return ((Value) this.instance).getLongVal();
            }

            public ValueCase getValueCase() {
                return ((Value) this.instance).getValueCase();
            }

            public boolean hasBoolVal() {
                return ((Value) this.instance).hasBoolVal();
            }

            public boolean hasByteArrayVal() {
                return ((Value) this.instance).hasByteArrayVal();
            }

            public boolean hasDoubleArrayVal() {
                return ((Value) this.instance).hasDoubleArrayVal();
            }

            public boolean hasDoubleVal() {
                return ((Value) this.instance).hasDoubleVal();
            }

            public boolean hasLongVal() {
                return ((Value) this.instance).hasLongVal();
            }

            public Builder mergeDoubleArrayVal(DoubleArray doubleArray) {
                copyOnWrite();
                ((Value) this.instance).mergeDoubleArrayVal(doubleArray);
                return this;
            }

            public Builder setBoolVal(boolean z8) {
                copyOnWrite();
                ((Value) this.instance).setBoolVal(z8);
                return this;
            }

            public Builder setByteArrayVal(i iVar) {
                copyOnWrite();
                ((Value) this.instance).setByteArrayVal(iVar);
                return this;
            }

            public Builder setDoubleArrayVal(DoubleArray.Builder builder) {
                copyOnWrite();
                ((Value) this.instance).setDoubleArrayVal((DoubleArray) builder.build());
                return this;
            }

            public Builder setDoubleArrayVal(DoubleArray doubleArray) {
                copyOnWrite();
                ((Value) this.instance).setDoubleArrayVal(doubleArray);
                return this;
            }

            public Builder setDoubleVal(double d9) {
                copyOnWrite();
                ((Value) this.instance).setDoubleVal(d9);
                return this;
            }

            public Builder setLongVal(long j8) {
                copyOnWrite();
                ((Value) this.instance).setLongVal(j8);
                return this;
            }
        }

        public static final class DoubleArray extends y<DoubleArray, Builder> implements DoubleArrayOrBuilder {
            /* access modifiers changed from: private */
            public static final DoubleArray DEFAULT_INSTANCE;
            public static final int DOUBLE_ARRAY_FIELD_NUMBER = 1;
            private static volatile z0<DoubleArray> PARSER;
            private a0.b doubleArray_ = y.emptyDoubleList();

            public static final class Builder extends y.a<DoubleArray, Builder> implements DoubleArrayOrBuilder {
                private Builder() {
                    super(DoubleArray.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 r12) {
                    this();
                }

                public Builder addAllDoubleArray(Iterable<? extends Double> iterable) {
                    copyOnWrite();
                    ((DoubleArray) this.instance).addAllDoubleArray(iterable);
                    return this;
                }

                public Builder addDoubleArray(double d9) {
                    copyOnWrite();
                    ((DoubleArray) this.instance).addDoubleArray(d9);
                    return this;
                }

                public Builder clearDoubleArray() {
                    copyOnWrite();
                    ((DoubleArray) this.instance).clearDoubleArray();
                    return this;
                }

                public double getDoubleArray(int i8) {
                    return ((DoubleArray) this.instance).getDoubleArray(i8);
                }

                public int getDoubleArrayCount() {
                    return ((DoubleArray) this.instance).getDoubleArrayCount();
                }

                public List<Double> getDoubleArrayList() {
                    return Collections.unmodifiableList(((DoubleArray) this.instance).getDoubleArrayList());
                }

                public Builder setDoubleArray(int i8, double d9) {
                    copyOnWrite();
                    ((DoubleArray) this.instance).setDoubleArray(i8, d9);
                    return this;
                }
            }

            static {
                DoubleArray doubleArray = new DoubleArray();
                DEFAULT_INSTANCE = doubleArray;
                y.registerDefaultInstance(DoubleArray.class, doubleArray);
            }

            private DoubleArray() {
            }

            /* access modifiers changed from: private */
            public void addAllDoubleArray(Iterable<? extends Double> iterable) {
                ensureDoubleArrayIsMutable();
                a.addAll(iterable, this.doubleArray_);
            }

            /* access modifiers changed from: private */
            public void addDoubleArray(double d9) {
                ensureDoubleArrayIsMutable();
                ((n) this.doubleArray_).j(d9);
            }

            /* access modifiers changed from: private */
            public void clearDoubleArray() {
                this.doubleArray_ = y.emptyDoubleList();
            }

            private void ensureDoubleArrayIsMutable() {
                a0.b bVar = this.doubleArray_;
                if (!((c) bVar).f3599f) {
                    this.doubleArray_ = y.mutableCopy(bVar);
                }
            }

            public static DoubleArray getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(DoubleArray doubleArray) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(doubleArray);
            }

            public static DoubleArray parseDelimitedFrom(InputStream inputStream) {
                return (DoubleArray) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DoubleArray parseDelimitedFrom(InputStream inputStream, q qVar) {
                return (DoubleArray) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static DoubleArray parseFrom(i iVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, iVar);
            }

            public static DoubleArray parseFrom(i iVar, q qVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
            }

            public static DoubleArray parseFrom(j jVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, jVar);
            }

            public static DoubleArray parseFrom(j jVar, q qVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
            }

            public static DoubleArray parseFrom(InputStream inputStream) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DoubleArray parseFrom(InputStream inputStream, q qVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
            }

            public static DoubleArray parseFrom(ByteBuffer byteBuffer) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static DoubleArray parseFrom(ByteBuffer byteBuffer, q qVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
            }

            public static DoubleArray parseFrom(byte[] bArr) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DoubleArray parseFrom(byte[] bArr, q qVar) {
                return (DoubleArray) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
            }

            public static z0<DoubleArray> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setDoubleArray(int i8, double d9) {
                ensureDoubleArrayIsMutable();
                n nVar = (n) this.doubleArray_;
                nVar.i();
                nVar.k(i8);
                double[] dArr = nVar.f3724g;
                double d10 = dArr[i8];
                dArr[i8] = d9;
            }

            public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0012", new Object[]{"doubleArray_"});
                    case 3:
                        return new DoubleArray();
                    case 4:
                        return new Builder((AnonymousClass1) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        z0<DoubleArray> z0Var = PARSER;
                        if (z0Var == null) {
                            synchronized (DoubleArray.class) {
                                z0Var = PARSER;
                                if (z0Var == null) {
                                    z0Var = new y.b<>(DEFAULT_INSTANCE);
                                    PARSER = z0Var;
                                }
                            }
                        }
                        return z0Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public double getDoubleArray(int i8) {
                n nVar = (n) this.doubleArray_;
                nVar.k(i8);
                return nVar.f3724g[i8];
            }

            public int getDoubleArrayCount() {
                return ((n) this.doubleArray_).f3725h;
            }

            public List<Double> getDoubleArrayList() {
                return this.doubleArray_;
            }
        }

        public interface DoubleArrayOrBuilder extends s0 {
            /* synthetic */ r0 getDefaultInstanceForType();

            double getDoubleArray(int i8);

            int getDoubleArrayCount();

            List<Double> getDoubleArrayList();

            /* synthetic */ boolean isInitialized();
        }

        public enum ValueCase {
            BOOL_VAL(1),
            LONG_VAL(2),
            DOUBLE_VAL(3),
            DOUBLE_ARRAY_VAL(4),
            BYTE_ARRAY_VAL(5),
            VALUE_NOT_SET(0);
            
            private final int value;

            private ValueCase(int i8) {
                this.value = i8;
            }

            public static ValueCase forNumber(int i8) {
                if (i8 == 0) {
                    return VALUE_NOT_SET;
                }
                if (i8 == 1) {
                    return BOOL_VAL;
                }
                if (i8 == 2) {
                    return LONG_VAL;
                }
                if (i8 == 3) {
                    return DOUBLE_VAL;
                }
                if (i8 == 4) {
                    return DOUBLE_ARRAY_VAL;
                }
                if (i8 != 5) {
                    return null;
                }
                return BYTE_ARRAY_VAL;
            }

            @Deprecated
            public static ValueCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            y.registerDefaultInstance(Value.class, value);
        }

        private Value() {
        }

        /* access modifiers changed from: private */
        public void clearBoolVal() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearByteArrayVal() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDoubleArrayVal() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDoubleVal() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLongVal() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDoubleArrayVal(DoubleArray doubleArray) {
            doubleArray.getClass();
            a aVar = doubleArray;
            if (this.valueCase_ == 4) {
                aVar = doubleArray;
                if (this.value_ != DoubleArray.getDefaultInstance()) {
                    aVar = ((DoubleArray.Builder) DoubleArray.newBuilder((DoubleArray) this.value_).mergeFrom(doubleArray)).buildPartial();
                }
            }
            this.value_ = aVar;
            this.valueCase_ = 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Value value) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(value);
        }

        public static Value parseDelimitedFrom(InputStream inputStream) {
            return (Value) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (Value) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Value parseFrom(i iVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static Value parseFrom(i iVar, q qVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static Value parseFrom(j jVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static Value parseFrom(j jVar, q qVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static Value parseFrom(InputStream inputStream) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseFrom(InputStream inputStream, q qVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static Value parseFrom(ByteBuffer byteBuffer) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Value parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static Value parseFrom(byte[] bArr) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Value parseFrom(byte[] bArr, q qVar) {
            return (Value) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<Value> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBoolVal(boolean z8) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z8);
        }

        /* access modifiers changed from: private */
        public void setByteArrayVal(i iVar) {
            iVar.getClass();
            this.valueCase_ = 5;
            this.value_ = iVar;
        }

        /* access modifiers changed from: private */
        public void setDoubleArrayVal(DoubleArray doubleArray) {
            doubleArray.getClass();
            this.value_ = doubleArray;
            this.valueCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setDoubleVal(double d9) {
            this.valueCase_ = 3;
            this.value_ = Double.valueOf(d9);
        }

        /* access modifiers changed from: private */
        public void setLongVal(long j8) {
            this.valueCase_ = 2;
            this.value_ = Long.valueOf(j8);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001်\u0000\u0002ဵ\u0000\u0003ဳ\u0000\u0004ြ\u0000\u0005ွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", DoubleArray.class});
                case 3:
                    return new Value();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<Value> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (Value.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getBoolVal() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        public i getByteArrayVal() {
            return this.valueCase_ == 5 ? (i) this.value_ : i.f3648g;
        }

        public DoubleArray getDoubleArrayVal() {
            return this.valueCase_ == 4 ? (DoubleArray) this.value_ : DoubleArray.getDefaultInstance();
        }

        public double getDoubleVal() {
            if (this.valueCase_ == 3) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        public long getLongVal() {
            if (this.valueCase_ == 2) {
                return ((Long) this.value_).longValue();
            }
            return 0;
        }

        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasBoolVal() {
            return this.valueCase_ == 1;
        }

        public boolean hasByteArrayVal() {
            return this.valueCase_ == 5;
        }

        public boolean hasDoubleArrayVal() {
            return this.valueCase_ == 4;
        }

        public boolean hasDoubleVal() {
            return this.valueCase_ == 3;
        }

        public boolean hasLongVal() {
            return this.valueCase_ == 2;
        }
    }

    public interface ValueOrBuilder extends s0 {
        boolean getBoolVal();

        i getByteArrayVal();

        /* synthetic */ r0 getDefaultInstanceForType();

        Value.DoubleArray getDoubleArrayVal();

        double getDoubleVal();

        long getLongVal();

        Value.ValueCase getValueCase();

        boolean hasBoolVal();

        boolean hasByteArrayVal();

        boolean hasDoubleArrayVal();

        boolean hasDoubleVal();

        boolean hasLongVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class WarmUpConfig extends y<WarmUpConfig, Builder> implements WarmUpConfigOrBuilder {
        public static final int DATA_TYPES_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final WarmUpConfig DEFAULT_INSTANCE;
        public static final int EXERCISE_TYPE_FIELD_NUMBER = 1;
        private static volatile z0<WarmUpConfig> PARSER;
        private int bitField0_;
        private a0.j<DataType> dataTypes_ = y.emptyProtobufList();
        private int exerciseType_;

        public static final class Builder extends y.a<WarmUpConfig, Builder> implements WarmUpConfigOrBuilder {
            private Builder() {
                super(WarmUpConfig.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllDataTypes(Iterable<? extends DataType> iterable) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).addAllDataTypes(iterable);
                return this;
            }

            public Builder addDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).addDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).addDataTypes(i8, dataType);
                return this;
            }

            public Builder addDataTypes(DataType.Builder builder) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).addDataTypes((DataType) builder.build());
                return this;
            }

            public Builder addDataTypes(DataType dataType) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).addDataTypes(dataType);
                return this;
            }

            public Builder clearDataTypes() {
                copyOnWrite();
                ((WarmUpConfig) this.instance).clearDataTypes();
                return this;
            }

            public Builder clearExerciseType() {
                copyOnWrite();
                ((WarmUpConfig) this.instance).clearExerciseType();
                return this;
            }

            public DataType getDataTypes(int i8) {
                return ((WarmUpConfig) this.instance).getDataTypes(i8);
            }

            public int getDataTypesCount() {
                return ((WarmUpConfig) this.instance).getDataTypesCount();
            }

            public List<DataType> getDataTypesList() {
                return Collections.unmodifiableList(((WarmUpConfig) this.instance).getDataTypesList());
            }

            public ExerciseType getExerciseType() {
                return ((WarmUpConfig) this.instance).getExerciseType();
            }

            public boolean hasExerciseType() {
                return ((WarmUpConfig) this.instance).hasExerciseType();
            }

            public Builder removeDataTypes(int i8) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).removeDataTypes(i8);
                return this;
            }

            public Builder setDataTypes(int i8, DataType.Builder builder) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).setDataTypes(i8, (DataType) builder.build());
                return this;
            }

            public Builder setDataTypes(int i8, DataType dataType) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).setDataTypes(i8, dataType);
                return this;
            }

            public Builder setExerciseType(ExerciseType exerciseType) {
                copyOnWrite();
                ((WarmUpConfig) this.instance).setExerciseType(exerciseType);
                return this;
            }
        }

        static {
            WarmUpConfig warmUpConfig = new WarmUpConfig();
            DEFAULT_INSTANCE = warmUpConfig;
            y.registerDefaultInstance(WarmUpConfig.class, warmUpConfig);
        }

        private WarmUpConfig() {
        }

        /* access modifiers changed from: private */
        public void addAllDataTypes(Iterable<? extends DataType> iterable) {
            ensureDataTypesIsMutable();
            a.addAll(iterable, this.dataTypes_);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void addDataTypes(DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.add(dataType);
        }

        /* access modifiers changed from: private */
        public void clearDataTypes() {
            this.dataTypes_ = y.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearExerciseType() {
            this.bitField0_ &= -2;
            this.exerciseType_ = 0;
        }

        private void ensureDataTypesIsMutable() {
            a0.j<DataType> jVar = this.dataTypes_;
            if (!jVar.f()) {
                this.dataTypes_ = y.mutableCopy(jVar);
            }
        }

        public static WarmUpConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WarmUpConfig warmUpConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(warmUpConfig);
        }

        public static WarmUpConfig parseDelimitedFrom(InputStream inputStream) {
            return (WarmUpConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WarmUpConfig parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (WarmUpConfig) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static WarmUpConfig parseFrom(i iVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static WarmUpConfig parseFrom(i iVar, q qVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static WarmUpConfig parseFrom(j jVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static WarmUpConfig parseFrom(j jVar, q qVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static WarmUpConfig parseFrom(InputStream inputStream) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WarmUpConfig parseFrom(InputStream inputStream, q qVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static WarmUpConfig parseFrom(ByteBuffer byteBuffer) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static WarmUpConfig parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static WarmUpConfig parseFrom(byte[] bArr) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WarmUpConfig parseFrom(byte[] bArr, q qVar) {
            return (WarmUpConfig) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<WarmUpConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeDataTypes(int i8) {
            ensureDataTypesIsMutable();
            this.dataTypes_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setDataTypes(int i8, DataType dataType) {
            dataType.getClass();
            ensureDataTypesIsMutable();
            this.dataTypes_.set(i8, dataType);
        }

        /* access modifiers changed from: private */
        public void setExerciseType(ExerciseType exerciseType) {
            this.exerciseType_ = exerciseType.getNumber();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"bitField0_", "exerciseType_", ExerciseType.internalGetVerifier(), "dataTypes_", DataType.class});
                case 3:
                    return new WarmUpConfig();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<WarmUpConfig> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (WarmUpConfig.class) {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new y.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        }
                    }
                    return z0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DataType getDataTypes(int i8) {
            return this.dataTypes_.get(i8);
        }

        public int getDataTypesCount() {
            return this.dataTypes_.size();
        }

        public List<DataType> getDataTypesList() {
            return this.dataTypes_;
        }

        public DataTypeOrBuilder getDataTypesOrBuilder(int i8) {
            return this.dataTypes_.get(i8);
        }

        public List<? extends DataTypeOrBuilder> getDataTypesOrBuilderList() {
            return this.dataTypes_;
        }

        public ExerciseType getExerciseType() {
            ExerciseType forNumber = ExerciseType.forNumber(this.exerciseType_);
            return forNumber == null ? ExerciseType.EXERCISE_TYPE_UNKNOWN : forNumber;
        }

        public boolean hasExerciseType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface WarmUpConfigOrBuilder extends s0 {
        DataType getDataTypes(int i8);

        int getDataTypesCount();

        List<DataType> getDataTypesList();

        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseType getExerciseType();

        boolean hasExerciseType();

        /* synthetic */ boolean isInitialized();
    }

    private DataProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
