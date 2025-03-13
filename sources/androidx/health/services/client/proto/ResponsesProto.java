package androidx.health.services.client.proto;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.a;
import com.google.protobuf.a0;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.q;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ResponsesProto {

    /* renamed from: androidx.health.services.client.proto.ResponsesProto$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.proto.ResponsesProto.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class AvailabilityResponse extends y<AvailabilityResponse, Builder> implements AvailabilityResponseOrBuilder {
        public static final int AVAILABILITY_FIELD_NUMBER = 2;
        public static final int DATA_TYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AvailabilityResponse DEFAULT_INSTANCE;
        private static volatile z0<AvailabilityResponse> PARSER;
        private DataProto.Availability availability_;
        private int bitField0_;
        private DataProto.DataType dataType_;

        public static final class Builder extends y.a<AvailabilityResponse, Builder> implements AvailabilityResponseOrBuilder {
            private Builder() {
                super(AvailabilityResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAvailability() {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).clearAvailability();
                return this;
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).clearDataType();
                return this;
            }

            public DataProto.Availability getAvailability() {
                return ((AvailabilityResponse) this.instance).getAvailability();
            }

            public DataProto.DataType getDataType() {
                return ((AvailabilityResponse) this.instance).getDataType();
            }

            public boolean hasAvailability() {
                return ((AvailabilityResponse) this.instance).hasAvailability();
            }

            public boolean hasDataType() {
                return ((AvailabilityResponse) this.instance).hasDataType();
            }

            public Builder mergeAvailability(DataProto.Availability availability) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).mergeAvailability(availability);
                return this;
            }

            public Builder mergeDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).mergeDataType(dataType);
                return this;
            }

            public Builder setAvailability(DataProto.Availability.Builder builder) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).setAvailability((DataProto.Availability) builder.build());
                return this;
            }

            public Builder setAvailability(DataProto.Availability availability) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).setAvailability(availability);
                return this;
            }

            public Builder setDataType(DataProto.DataType.Builder builder) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).setDataType((DataProto.DataType) builder.build());
                return this;
            }

            public Builder setDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((AvailabilityResponse) this.instance).setDataType(dataType);
                return this;
            }
        }

        static {
            AvailabilityResponse availabilityResponse = new AvailabilityResponse();
            DEFAULT_INSTANCE = availabilityResponse;
            y.registerDefaultInstance(AvailabilityResponse.class, availabilityResponse);
        }

        private AvailabilityResponse() {
        }

        /* access modifiers changed from: private */
        public void clearAvailability() {
            this.availability_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -2;
        }

        public static AvailabilityResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAvailability(DataProto.Availability availability) {
            availability.getClass();
            DataProto.Availability availability2 = this.availability_;
            if (!(availability2 == null || availability2 == DataProto.Availability.getDefaultInstance())) {
                availability = (DataProto.Availability) ((DataProto.Availability.Builder) DataProto.Availability.newBuilder(this.availability_).mergeFrom(availability)).buildPartial();
            }
            this.availability_ = availability;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeDataType(DataProto.DataType dataType) {
            dataType.getClass();
            DataProto.DataType dataType2 = this.dataType_;
            if (!(dataType2 == null || dataType2 == DataProto.DataType.getDefaultInstance())) {
                dataType = (DataProto.DataType) ((DataProto.DataType.Builder) DataProto.DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
            }
            this.dataType_ = dataType;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AvailabilityResponse availabilityResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(availabilityResponse);
        }

        public static AvailabilityResponse parseDelimitedFrom(InputStream inputStream) {
            return (AvailabilityResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvailabilityResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (AvailabilityResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AvailabilityResponse parseFrom(i iVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static AvailabilityResponse parseFrom(i iVar, q qVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static AvailabilityResponse parseFrom(j jVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AvailabilityResponse parseFrom(j jVar, q qVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static AvailabilityResponse parseFrom(InputStream inputStream) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AvailabilityResponse parseFrom(InputStream inputStream, q qVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AvailabilityResponse parseFrom(ByteBuffer byteBuffer) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AvailabilityResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static AvailabilityResponse parseFrom(byte[] bArr) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AvailabilityResponse parseFrom(byte[] bArr, q qVar) {
            return (AvailabilityResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<AvailabilityResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAvailability(DataProto.Availability availability) {
            availability.getClass();
            this.availability_ = availability;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setDataType(DataProto.DataType dataType) {
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
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "dataType_", "availability_"});
                case 3:
                    return new AvailabilityResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<AvailabilityResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (AvailabilityResponse.class) {
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

        public DataProto.Availability getAvailability() {
            DataProto.Availability availability = this.availability_;
            return availability == null ? DataProto.Availability.getDefaultInstance() : availability;
        }

        public DataProto.DataType getDataType() {
            DataProto.DataType dataType = this.dataType_;
            return dataType == null ? DataProto.DataType.getDefaultInstance() : dataType;
        }

        public boolean hasAvailability() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface AvailabilityResponseOrBuilder extends s0 {
        DataProto.Availability getAvailability();

        DataProto.DataType getDataType();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean hasAvailability();

        boolean hasDataType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DataPointsResponse extends y<DataPointsResponse, Builder> implements DataPointsResponseOrBuilder {
        public static final int DATA_POINTS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DataPointsResponse DEFAULT_INSTANCE;
        private static volatile z0<DataPointsResponse> PARSER;
        private a0.j<DataProto.DataPoint> dataPoints_ = y.emptyProtobufList();

        public static final class Builder extends y.a<DataPointsResponse, Builder> implements DataPointsResponseOrBuilder {
            private Builder() {
                super(DataPointsResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllDataPoints(Iterable<? extends DataProto.DataPoint> iterable) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).addAllDataPoints(iterable);
                return this;
            }

            public Builder addDataPoints(int i8, DataProto.DataPoint.Builder builder) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).addDataPoints(i8, (DataProto.DataPoint) builder.build());
                return this;
            }

            public Builder addDataPoints(int i8, DataProto.DataPoint dataPoint) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).addDataPoints(i8, dataPoint);
                return this;
            }

            public Builder addDataPoints(DataProto.DataPoint.Builder builder) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).addDataPoints((DataProto.DataPoint) builder.build());
                return this;
            }

            public Builder addDataPoints(DataProto.DataPoint dataPoint) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).addDataPoints(dataPoint);
                return this;
            }

            public Builder clearDataPoints() {
                copyOnWrite();
                ((DataPointsResponse) this.instance).clearDataPoints();
                return this;
            }

            public DataProto.DataPoint getDataPoints(int i8) {
                return ((DataPointsResponse) this.instance).getDataPoints(i8);
            }

            public int getDataPointsCount() {
                return ((DataPointsResponse) this.instance).getDataPointsCount();
            }

            public List<DataProto.DataPoint> getDataPointsList() {
                return Collections.unmodifiableList(((DataPointsResponse) this.instance).getDataPointsList());
            }

            public Builder removeDataPoints(int i8) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).removeDataPoints(i8);
                return this;
            }

            public Builder setDataPoints(int i8, DataProto.DataPoint.Builder builder) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).setDataPoints(i8, (DataProto.DataPoint) builder.build());
                return this;
            }

            public Builder setDataPoints(int i8, DataProto.DataPoint dataPoint) {
                copyOnWrite();
                ((DataPointsResponse) this.instance).setDataPoints(i8, dataPoint);
                return this;
            }
        }

        static {
            DataPointsResponse dataPointsResponse = new DataPointsResponse();
            DEFAULT_INSTANCE = dataPointsResponse;
            y.registerDefaultInstance(DataPointsResponse.class, dataPointsResponse);
        }

        private DataPointsResponse() {
        }

        /* access modifiers changed from: private */
        public void addAllDataPoints(Iterable<? extends DataProto.DataPoint> iterable) {
            ensureDataPointsIsMutable();
            a.addAll(iterable, this.dataPoints_);
        }

        /* access modifiers changed from: private */
        public void addDataPoints(int i8, DataProto.DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(i8, dataPoint);
        }

        /* access modifiers changed from: private */
        public void addDataPoints(DataProto.DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(dataPoint);
        }

        /* access modifiers changed from: private */
        public void clearDataPoints() {
            this.dataPoints_ = y.emptyProtobufList();
        }

        private void ensureDataPointsIsMutable() {
            a0.j<DataProto.DataPoint> jVar = this.dataPoints_;
            if (!jVar.f()) {
                this.dataPoints_ = y.mutableCopy(jVar);
            }
        }

        public static DataPointsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataPointsResponse dataPointsResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dataPointsResponse);
        }

        public static DataPointsResponse parseDelimitedFrom(InputStream inputStream) {
            return (DataPointsResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPointsResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (DataPointsResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPointsResponse parseFrom(i iVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static DataPointsResponse parseFrom(i iVar, q qVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static DataPointsResponse parseFrom(j jVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static DataPointsResponse parseFrom(j jVar, q qVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static DataPointsResponse parseFrom(InputStream inputStream) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DataPointsResponse parseFrom(InputStream inputStream, q qVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static DataPointsResponse parseFrom(ByteBuffer byteBuffer) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DataPointsResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static DataPointsResponse parseFrom(byte[] bArr) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DataPointsResponse parseFrom(byte[] bArr, q qVar) {
            return (DataPointsResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<DataPointsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeDataPoints(int i8) {
            ensureDataPointsIsMutable();
            this.dataPoints_.remove(i8);
        }

        /* access modifiers changed from: private */
        public void setDataPoints(int i8, DataProto.DataPoint dataPoint) {
            dataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.set(i8, dataPoint);
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dataPoints_", DataProto.DataPoint.class});
                case 3:
                    return new DataPointsResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<DataPointsResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (DataPointsResponse.class) {
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

        public DataProto.DataPoint getDataPoints(int i8) {
            return this.dataPoints_.get(i8);
        }

        public int getDataPointsCount() {
            return this.dataPoints_.size();
        }

        public List<DataProto.DataPoint> getDataPointsList() {
            return this.dataPoints_;
        }

        public DataProto.DataPointOrBuilder getDataPointsOrBuilder(int i8) {
            return this.dataPoints_.get(i8);
        }

        public List<? extends DataProto.DataPointOrBuilder> getDataPointsOrBuilderList() {
            return this.dataPoints_;
        }
    }

    public interface DataPointsResponseOrBuilder extends s0 {
        DataProto.DataPoint getDataPoints(int i8);

        int getDataPointsCount();

        List<DataProto.DataPoint> getDataPointsList();

        /* synthetic */ r0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseCapabilitiesResponse extends y<ExerciseCapabilitiesResponse, Builder> implements ExerciseCapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final ExerciseCapabilitiesResponse DEFAULT_INSTANCE;
        private static volatile z0<ExerciseCapabilitiesResponse> PARSER;
        private int bitField0_;
        private DataProto.ExerciseCapabilities capabilities_;

        public static final class Builder extends y.a<ExerciseCapabilitiesResponse, Builder> implements ExerciseCapabilitiesResponseOrBuilder {
            private Builder() {
                super(ExerciseCapabilitiesResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearCapabilities() {
                copyOnWrite();
                ((ExerciseCapabilitiesResponse) this.instance).clearCapabilities();
                return this;
            }

            public DataProto.ExerciseCapabilities getCapabilities() {
                return ((ExerciseCapabilitiesResponse) this.instance).getCapabilities();
            }

            public boolean hasCapabilities() {
                return ((ExerciseCapabilitiesResponse) this.instance).hasCapabilities();
            }

            public Builder mergeCapabilities(DataProto.ExerciseCapabilities exerciseCapabilities) {
                copyOnWrite();
                ((ExerciseCapabilitiesResponse) this.instance).mergeCapabilities(exerciseCapabilities);
                return this;
            }

            public Builder setCapabilities(DataProto.ExerciseCapabilities.Builder builder) {
                copyOnWrite();
                ((ExerciseCapabilitiesResponse) this.instance).setCapabilities((DataProto.ExerciseCapabilities) builder.build());
                return this;
            }

            public Builder setCapabilities(DataProto.ExerciseCapabilities exerciseCapabilities) {
                copyOnWrite();
                ((ExerciseCapabilitiesResponse) this.instance).setCapabilities(exerciseCapabilities);
                return this;
            }
        }

        static {
            ExerciseCapabilitiesResponse exerciseCapabilitiesResponse = new ExerciseCapabilitiesResponse();
            DEFAULT_INSTANCE = exerciseCapabilitiesResponse;
            y.registerDefaultInstance(ExerciseCapabilitiesResponse.class, exerciseCapabilitiesResponse);
        }

        private ExerciseCapabilitiesResponse() {
        }

        /* access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -2;
        }

        public static ExerciseCapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCapabilities(DataProto.ExerciseCapabilities exerciseCapabilities) {
            exerciseCapabilities.getClass();
            DataProto.ExerciseCapabilities exerciseCapabilities2 = this.capabilities_;
            if (!(exerciseCapabilities2 == null || exerciseCapabilities2 == DataProto.ExerciseCapabilities.getDefaultInstance())) {
                exerciseCapabilities = (DataProto.ExerciseCapabilities) ((DataProto.ExerciseCapabilities.Builder) DataProto.ExerciseCapabilities.newBuilder(this.capabilities_).mergeFrom(exerciseCapabilities)).buildPartial();
            }
            this.capabilities_ = exerciseCapabilities;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseCapabilitiesResponse exerciseCapabilitiesResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseCapabilitiesResponse);
        }

        public static ExerciseCapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseCapabilitiesResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(i iVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(i iVar, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(j jVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(j jVar, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(InputStream inputStream) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseCapabilitiesResponse parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseCapabilitiesResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseCapabilitiesResponse parseFrom(byte[] bArr) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseCapabilitiesResponse parseFrom(byte[] bArr, q qVar) {
            return (ExerciseCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseCapabilitiesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCapabilities(DataProto.ExerciseCapabilities exerciseCapabilities) {
            exerciseCapabilities.getClass();
            this.capabilities_ = exerciseCapabilities;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "capabilities_"});
                case 3:
                    return new ExerciseCapabilitiesResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseCapabilitiesResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseCapabilitiesResponse.class) {
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

        public DataProto.ExerciseCapabilities getCapabilities() {
            DataProto.ExerciseCapabilities exerciseCapabilities = this.capabilities_;
            return exerciseCapabilities == null ? DataProto.ExerciseCapabilities.getDefaultInstance() : exerciseCapabilities;
        }

        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface ExerciseCapabilitiesResponseOrBuilder extends s0 {
        DataProto.ExerciseCapabilities getCapabilities();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean hasCapabilities();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseInfoResponse extends y<ExerciseInfoResponse, Builder> implements ExerciseInfoResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseInfoResponse DEFAULT_INSTANCE;
        public static final int EXERCISE_INFO_FIELD_NUMBER = 1;
        private static volatile z0<ExerciseInfoResponse> PARSER;
        private int bitField0_;
        private DataProto.ExerciseInfo exerciseInfo_;

        public static final class Builder extends y.a<ExerciseInfoResponse, Builder> implements ExerciseInfoResponseOrBuilder {
            private Builder() {
                super(ExerciseInfoResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearExerciseInfo() {
                copyOnWrite();
                ((ExerciseInfoResponse) this.instance).clearExerciseInfo();
                return this;
            }

            public DataProto.ExerciseInfo getExerciseInfo() {
                return ((ExerciseInfoResponse) this.instance).getExerciseInfo();
            }

            public boolean hasExerciseInfo() {
                return ((ExerciseInfoResponse) this.instance).hasExerciseInfo();
            }

            public Builder mergeExerciseInfo(DataProto.ExerciseInfo exerciseInfo) {
                copyOnWrite();
                ((ExerciseInfoResponse) this.instance).mergeExerciseInfo(exerciseInfo);
                return this;
            }

            public Builder setExerciseInfo(DataProto.ExerciseInfo.Builder builder) {
                copyOnWrite();
                ((ExerciseInfoResponse) this.instance).setExerciseInfo((DataProto.ExerciseInfo) builder.build());
                return this;
            }

            public Builder setExerciseInfo(DataProto.ExerciseInfo exerciseInfo) {
                copyOnWrite();
                ((ExerciseInfoResponse) this.instance).setExerciseInfo(exerciseInfo);
                return this;
            }
        }

        static {
            ExerciseInfoResponse exerciseInfoResponse = new ExerciseInfoResponse();
            DEFAULT_INSTANCE = exerciseInfoResponse;
            y.registerDefaultInstance(ExerciseInfoResponse.class, exerciseInfoResponse);
        }

        private ExerciseInfoResponse() {
        }

        /* access modifiers changed from: private */
        public void clearExerciseInfo() {
            this.exerciseInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static ExerciseInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseInfo(DataProto.ExerciseInfo exerciseInfo) {
            exerciseInfo.getClass();
            DataProto.ExerciseInfo exerciseInfo2 = this.exerciseInfo_;
            if (!(exerciseInfo2 == null || exerciseInfo2 == DataProto.ExerciseInfo.getDefaultInstance())) {
                exerciseInfo = (DataProto.ExerciseInfo) ((DataProto.ExerciseInfo.Builder) DataProto.ExerciseInfo.newBuilder(this.exerciseInfo_).mergeFrom(exerciseInfo)).buildPartial();
            }
            this.exerciseInfo_ = exerciseInfo;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseInfoResponse exerciseInfoResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseInfoResponse);
        }

        public static ExerciseInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseInfoResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseInfoResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseInfoResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseInfoResponse parseFrom(i iVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseInfoResponse parseFrom(i iVar, q qVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseInfoResponse parseFrom(j jVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseInfoResponse parseFrom(j jVar, q qVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseInfoResponse parseFrom(InputStream inputStream) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseInfoResponse parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseInfoResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseInfoResponse parseFrom(byte[] bArr) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseInfoResponse parseFrom(byte[] bArr, q qVar) {
            return (ExerciseInfoResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseInfoResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExerciseInfo(DataProto.ExerciseInfo exerciseInfo) {
            exerciseInfo.getClass();
            this.exerciseInfo_ = exerciseInfo;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "exerciseInfo_"});
                case 3:
                    return new ExerciseInfoResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseInfoResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseInfoResponse.class) {
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

        public DataProto.ExerciseInfo getExerciseInfo() {
            DataProto.ExerciseInfo exerciseInfo = this.exerciseInfo_;
            return exerciseInfo == null ? DataProto.ExerciseInfo.getDefaultInstance() : exerciseInfo;
        }

        public boolean hasExerciseInfo() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface ExerciseInfoResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.ExerciseInfo getExerciseInfo();

        boolean hasExerciseInfo();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseLapSummaryResponse extends y<ExerciseLapSummaryResponse, Builder> implements ExerciseLapSummaryResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseLapSummaryResponse DEFAULT_INSTANCE;
        public static final int LAP_SUMMARY_FIELD_NUMBER = 1;
        private static volatile z0<ExerciseLapSummaryResponse> PARSER;
        private int bitField0_;
        private DataProto.ExerciseLapSummary lapSummary_;

        public static final class Builder extends y.a<ExerciseLapSummaryResponse, Builder> implements ExerciseLapSummaryResponseOrBuilder {
            private Builder() {
                super(ExerciseLapSummaryResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearLapSummary() {
                copyOnWrite();
                ((ExerciseLapSummaryResponse) this.instance).clearLapSummary();
                return this;
            }

            public DataProto.ExerciseLapSummary getLapSummary() {
                return ((ExerciseLapSummaryResponse) this.instance).getLapSummary();
            }

            public boolean hasLapSummary() {
                return ((ExerciseLapSummaryResponse) this.instance).hasLapSummary();
            }

            public Builder mergeLapSummary(DataProto.ExerciseLapSummary exerciseLapSummary) {
                copyOnWrite();
                ((ExerciseLapSummaryResponse) this.instance).mergeLapSummary(exerciseLapSummary);
                return this;
            }

            public Builder setLapSummary(DataProto.ExerciseLapSummary.Builder builder) {
                copyOnWrite();
                ((ExerciseLapSummaryResponse) this.instance).setLapSummary((DataProto.ExerciseLapSummary) builder.build());
                return this;
            }

            public Builder setLapSummary(DataProto.ExerciseLapSummary exerciseLapSummary) {
                copyOnWrite();
                ((ExerciseLapSummaryResponse) this.instance).setLapSummary(exerciseLapSummary);
                return this;
            }
        }

        static {
            ExerciseLapSummaryResponse exerciseLapSummaryResponse = new ExerciseLapSummaryResponse();
            DEFAULT_INSTANCE = exerciseLapSummaryResponse;
            y.registerDefaultInstance(ExerciseLapSummaryResponse.class, exerciseLapSummaryResponse);
        }

        private ExerciseLapSummaryResponse() {
        }

        /* access modifiers changed from: private */
        public void clearLapSummary() {
            this.lapSummary_ = null;
            this.bitField0_ &= -2;
        }

        public static ExerciseLapSummaryResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeLapSummary(DataProto.ExerciseLapSummary exerciseLapSummary) {
            exerciseLapSummary.getClass();
            DataProto.ExerciseLapSummary exerciseLapSummary2 = this.lapSummary_;
            if (!(exerciseLapSummary2 == null || exerciseLapSummary2 == DataProto.ExerciseLapSummary.getDefaultInstance())) {
                exerciseLapSummary = (DataProto.ExerciseLapSummary) ((DataProto.ExerciseLapSummary.Builder) DataProto.ExerciseLapSummary.newBuilder(this.lapSummary_).mergeFrom(exerciseLapSummary)).buildPartial();
            }
            this.lapSummary_ = exerciseLapSummary;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseLapSummaryResponse);
        }

        public static ExerciseLapSummaryResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseLapSummaryResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseLapSummaryResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(i iVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(i iVar, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(j jVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(j jVar, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(InputStream inputStream) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseLapSummaryResponse parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseLapSummaryResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseLapSummaryResponse parseFrom(byte[] bArr) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseLapSummaryResponse parseFrom(byte[] bArr, q qVar) {
            return (ExerciseLapSummaryResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseLapSummaryResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLapSummary(DataProto.ExerciseLapSummary exerciseLapSummary) {
            exerciseLapSummary.getClass();
            this.lapSummary_ = exerciseLapSummary;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "lapSummary_"});
                case 3:
                    return new ExerciseLapSummaryResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseLapSummaryResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseLapSummaryResponse.class) {
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

        public DataProto.ExerciseLapSummary getLapSummary() {
            DataProto.ExerciseLapSummary exerciseLapSummary = this.lapSummary_;
            return exerciseLapSummary == null ? DataProto.ExerciseLapSummary.getDefaultInstance() : exerciseLapSummary;
        }

        public boolean hasLapSummary() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface ExerciseLapSummaryResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.ExerciseLapSummary getLapSummary();

        boolean hasLapSummary();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ExerciseUpdateResponse extends y<ExerciseUpdateResponse, Builder> implements ExerciseUpdateResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final ExerciseUpdateResponse DEFAULT_INSTANCE;
        public static final int EXERCISE_UPDATE_FIELD_NUMBER = 1;
        private static volatile z0<ExerciseUpdateResponse> PARSER;
        private int bitField0_;
        private DataProto.ExerciseUpdate exerciseUpdate_;

        public static final class Builder extends y.a<ExerciseUpdateResponse, Builder> implements ExerciseUpdateResponseOrBuilder {
            private Builder() {
                super(ExerciseUpdateResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearExerciseUpdate() {
                copyOnWrite();
                ((ExerciseUpdateResponse) this.instance).clearExerciseUpdate();
                return this;
            }

            public DataProto.ExerciseUpdate getExerciseUpdate() {
                return ((ExerciseUpdateResponse) this.instance).getExerciseUpdate();
            }

            public boolean hasExerciseUpdate() {
                return ((ExerciseUpdateResponse) this.instance).hasExerciseUpdate();
            }

            public Builder mergeExerciseUpdate(DataProto.ExerciseUpdate exerciseUpdate) {
                copyOnWrite();
                ((ExerciseUpdateResponse) this.instance).mergeExerciseUpdate(exerciseUpdate);
                return this;
            }

            public Builder setExerciseUpdate(DataProto.ExerciseUpdate.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdateResponse) this.instance).setExerciseUpdate((DataProto.ExerciseUpdate) builder.build());
                return this;
            }

            public Builder setExerciseUpdate(DataProto.ExerciseUpdate exerciseUpdate) {
                copyOnWrite();
                ((ExerciseUpdateResponse) this.instance).setExerciseUpdate(exerciseUpdate);
                return this;
            }
        }

        static {
            ExerciseUpdateResponse exerciseUpdateResponse = new ExerciseUpdateResponse();
            DEFAULT_INSTANCE = exerciseUpdateResponse;
            y.registerDefaultInstance(ExerciseUpdateResponse.class, exerciseUpdateResponse);
        }

        private ExerciseUpdateResponse() {
        }

        /* access modifiers changed from: private */
        public void clearExerciseUpdate() {
            this.exerciseUpdate_ = null;
            this.bitField0_ &= -2;
        }

        public static ExerciseUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseUpdate(DataProto.ExerciseUpdate exerciseUpdate) {
            exerciseUpdate.getClass();
            DataProto.ExerciseUpdate exerciseUpdate2 = this.exerciseUpdate_;
            if (!(exerciseUpdate2 == null || exerciseUpdate2 == DataProto.ExerciseUpdate.getDefaultInstance())) {
                exerciseUpdate = (DataProto.ExerciseUpdate) ((DataProto.ExerciseUpdate.Builder) DataProto.ExerciseUpdate.newBuilder(this.exerciseUpdate_).mergeFrom(exerciseUpdate)).buildPartial();
            }
            this.exerciseUpdate_ = exerciseUpdate;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseUpdateResponse exerciseUpdateResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseUpdateResponse);
        }

        public static ExerciseUpdateResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseUpdateResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdateResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdateResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdateResponse parseFrom(i iVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseUpdateResponse parseFrom(i iVar, q qVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseUpdateResponse parseFrom(j jVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseUpdateResponse parseFrom(j jVar, q qVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseUpdateResponse parseFrom(InputStream inputStream) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdateResponse parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdateResponse parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseUpdateResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseUpdateResponse parseFrom(byte[] bArr) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseUpdateResponse parseFrom(byte[] bArr, q qVar) {
            return (ExerciseUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseUpdateResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExerciseUpdate(DataProto.ExerciseUpdate exerciseUpdate) {
            exerciseUpdate.getClass();
            this.exerciseUpdate_ = exerciseUpdate;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "exerciseUpdate_"});
                case 3:
                    return new ExerciseUpdateResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseUpdateResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseUpdateResponse.class) {
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

        public DataProto.ExerciseUpdate getExerciseUpdate() {
            DataProto.ExerciseUpdate exerciseUpdate = this.exerciseUpdate_;
            return exerciseUpdate == null ? DataProto.ExerciseUpdate.getDefaultInstance() : exerciseUpdate;
        }

        public boolean hasExerciseUpdate() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface ExerciseUpdateResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.ExerciseUpdate getExerciseUpdate();

        boolean hasExerciseUpdate();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HealthEventResponse extends y<HealthEventResponse, Builder> implements HealthEventResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final HealthEventResponse DEFAULT_INSTANCE;
        public static final int HEALTH_EVENT_FIELD_NUMBER = 1;
        private static volatile z0<HealthEventResponse> PARSER;
        private int bitField0_;
        private DataProto.HealthEvent healthEvent_;

        public static final class Builder extends y.a<HealthEventResponse, Builder> implements HealthEventResponseOrBuilder {
            private Builder() {
                super(HealthEventResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearHealthEvent() {
                copyOnWrite();
                ((HealthEventResponse) this.instance).clearHealthEvent();
                return this;
            }

            public DataProto.HealthEvent getHealthEvent() {
                return ((HealthEventResponse) this.instance).getHealthEvent();
            }

            public boolean hasHealthEvent() {
                return ((HealthEventResponse) this.instance).hasHealthEvent();
            }

            public Builder mergeHealthEvent(DataProto.HealthEvent healthEvent) {
                copyOnWrite();
                ((HealthEventResponse) this.instance).mergeHealthEvent(healthEvent);
                return this;
            }

            public Builder setHealthEvent(DataProto.HealthEvent.Builder builder) {
                copyOnWrite();
                ((HealthEventResponse) this.instance).setHealthEvent((DataProto.HealthEvent) builder.build());
                return this;
            }

            public Builder setHealthEvent(DataProto.HealthEvent healthEvent) {
                copyOnWrite();
                ((HealthEventResponse) this.instance).setHealthEvent(healthEvent);
                return this;
            }
        }

        static {
            HealthEventResponse healthEventResponse = new HealthEventResponse();
            DEFAULT_INSTANCE = healthEventResponse;
            y.registerDefaultInstance(HealthEventResponse.class, healthEventResponse);
        }

        private HealthEventResponse() {
        }

        /* access modifiers changed from: private */
        public void clearHealthEvent() {
            this.healthEvent_ = null;
            this.bitField0_ &= -2;
        }

        public static HealthEventResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeHealthEvent(DataProto.HealthEvent healthEvent) {
            healthEvent.getClass();
            DataProto.HealthEvent healthEvent2 = this.healthEvent_;
            if (!(healthEvent2 == null || healthEvent2 == DataProto.HealthEvent.getDefaultInstance())) {
                healthEvent = (DataProto.HealthEvent) ((DataProto.HealthEvent.Builder) DataProto.HealthEvent.newBuilder(this.healthEvent_).mergeFrom(healthEvent)).buildPartial();
            }
            this.healthEvent_ = healthEvent;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HealthEventResponse healthEventResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(healthEventResponse);
        }

        public static HealthEventResponse parseDelimitedFrom(InputStream inputStream) {
            return (HealthEventResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HealthEventResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventResponse parseFrom(i iVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HealthEventResponse parseFrom(i iVar, q qVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HealthEventResponse parseFrom(j jVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HealthEventResponse parseFrom(j jVar, q qVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HealthEventResponse parseFrom(InputStream inputStream) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventResponse parseFrom(InputStream inputStream, q qVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventResponse parseFrom(ByteBuffer byteBuffer) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HealthEventResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HealthEventResponse parseFrom(byte[] bArr) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthEventResponse parseFrom(byte[] bArr, q qVar) {
            return (HealthEventResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HealthEventResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHealthEvent(DataProto.HealthEvent healthEvent) {
            healthEvent.getClass();
            this.healthEvent_ = healthEvent;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "healthEvent_"});
                case 3:
                    return new HealthEventResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HealthEventResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HealthEventResponse.class) {
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

        public DataProto.HealthEvent getHealthEvent() {
            DataProto.HealthEvent healthEvent = this.healthEvent_;
            return healthEvent == null ? DataProto.HealthEvent.getDefaultInstance() : healthEvent;
        }

        public boolean hasHealthEvent() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HealthEventResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.HealthEvent getHealthEvent();

        boolean hasHealthEvent();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HeartRateAlertParamsResponse extends y<HeartRateAlertParamsResponse, Builder> implements HeartRateAlertParamsResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final HeartRateAlertParamsResponse DEFAULT_INSTANCE;
        public static final int PARAMS_FIELD_NUMBER = 1;
        private static volatile z0<HeartRateAlertParamsResponse> PARSER;
        private int bitField0_;
        private DataProto.HeartRateAlertParams params_;

        public static final class Builder extends y.a<HeartRateAlertParamsResponse, Builder> implements HeartRateAlertParamsResponseOrBuilder {
            private Builder() {
                super(HeartRateAlertParamsResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearParams() {
                copyOnWrite();
                ((HeartRateAlertParamsResponse) this.instance).clearParams();
                return this;
            }

            public DataProto.HeartRateAlertParams getParams() {
                return ((HeartRateAlertParamsResponse) this.instance).getParams();
            }

            public boolean hasParams() {
                return ((HeartRateAlertParamsResponse) this.instance).hasParams();
            }

            public Builder mergeParams(DataProto.HeartRateAlertParams heartRateAlertParams) {
                copyOnWrite();
                ((HeartRateAlertParamsResponse) this.instance).mergeParams(heartRateAlertParams);
                return this;
            }

            public Builder setParams(DataProto.HeartRateAlertParams.Builder builder) {
                copyOnWrite();
                ((HeartRateAlertParamsResponse) this.instance).setParams((DataProto.HeartRateAlertParams) builder.build());
                return this;
            }

            public Builder setParams(DataProto.HeartRateAlertParams heartRateAlertParams) {
                copyOnWrite();
                ((HeartRateAlertParamsResponse) this.instance).setParams(heartRateAlertParams);
                return this;
            }
        }

        static {
            HeartRateAlertParamsResponse heartRateAlertParamsResponse = new HeartRateAlertParamsResponse();
            DEFAULT_INSTANCE = heartRateAlertParamsResponse;
            y.registerDefaultInstance(HeartRateAlertParamsResponse.class, heartRateAlertParamsResponse);
        }

        private HeartRateAlertParamsResponse() {
        }

        /* access modifiers changed from: private */
        public void clearParams() {
            this.params_ = null;
            this.bitField0_ &= -2;
        }

        public static HeartRateAlertParamsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeParams(DataProto.HeartRateAlertParams heartRateAlertParams) {
            heartRateAlertParams.getClass();
            DataProto.HeartRateAlertParams heartRateAlertParams2 = this.params_;
            if (!(heartRateAlertParams2 == null || heartRateAlertParams2 == DataProto.HeartRateAlertParams.getDefaultInstance())) {
                heartRateAlertParams = (DataProto.HeartRateAlertParams) ((DataProto.HeartRateAlertParams.Builder) DataProto.HeartRateAlertParams.newBuilder(this.params_).mergeFrom(heartRateAlertParams)).buildPartial();
            }
            this.params_ = heartRateAlertParams;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeartRateAlertParamsResponse heartRateAlertParamsResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heartRateAlertParamsResponse);
        }

        public static HeartRateAlertParamsResponse parseDelimitedFrom(InputStream inputStream) {
            return (HeartRateAlertParamsResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParamsResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(i iVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(i iVar, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(j jVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(j jVar, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(InputStream inputStream) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParamsResponse parseFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(ByteBuffer byteBuffer) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HeartRateAlertParamsResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HeartRateAlertParamsResponse parseFrom(byte[] bArr) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateAlertParamsResponse parseFrom(byte[] bArr, q qVar) {
            return (HeartRateAlertParamsResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HeartRateAlertParamsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setParams(DataProto.HeartRateAlertParams heartRateAlertParams) {
            heartRateAlertParams.getClass();
            this.params_ = heartRateAlertParams;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
                case 3:
                    return new HeartRateAlertParamsResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HeartRateAlertParamsResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HeartRateAlertParamsResponse.class) {
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

        public DataProto.HeartRateAlertParams getParams() {
            DataProto.HeartRateAlertParams heartRateAlertParams = this.params_;
            return heartRateAlertParams == null ? DataProto.HeartRateAlertParams.getDefaultInstance() : heartRateAlertParams;
        }

        public boolean hasParams() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HeartRateAlertParamsResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.HeartRateAlertParams getParams();

        boolean hasParams();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MeasureCapabilitiesResponse extends y<MeasureCapabilitiesResponse, Builder> implements MeasureCapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final MeasureCapabilitiesResponse DEFAULT_INSTANCE;
        private static volatile z0<MeasureCapabilitiesResponse> PARSER;
        private int bitField0_;
        private DataProto.MeasureCapabilities capabilities_;

        public static final class Builder extends y.a<MeasureCapabilitiesResponse, Builder> implements MeasureCapabilitiesResponseOrBuilder {
            private Builder() {
                super(MeasureCapabilitiesResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearCapabilities() {
                copyOnWrite();
                ((MeasureCapabilitiesResponse) this.instance).clearCapabilities();
                return this;
            }

            public DataProto.MeasureCapabilities getCapabilities() {
                return ((MeasureCapabilitiesResponse) this.instance).getCapabilities();
            }

            public boolean hasCapabilities() {
                return ((MeasureCapabilitiesResponse) this.instance).hasCapabilities();
            }

            public Builder mergeCapabilities(DataProto.MeasureCapabilities measureCapabilities) {
                copyOnWrite();
                ((MeasureCapabilitiesResponse) this.instance).mergeCapabilities(measureCapabilities);
                return this;
            }

            public Builder setCapabilities(DataProto.MeasureCapabilities.Builder builder) {
                copyOnWrite();
                ((MeasureCapabilitiesResponse) this.instance).setCapabilities((DataProto.MeasureCapabilities) builder.build());
                return this;
            }

            public Builder setCapabilities(DataProto.MeasureCapabilities measureCapabilities) {
                copyOnWrite();
                ((MeasureCapabilitiesResponse) this.instance).setCapabilities(measureCapabilities);
                return this;
            }
        }

        static {
            MeasureCapabilitiesResponse measureCapabilitiesResponse = new MeasureCapabilitiesResponse();
            DEFAULT_INSTANCE = measureCapabilitiesResponse;
            y.registerDefaultInstance(MeasureCapabilitiesResponse.class, measureCapabilitiesResponse);
        }

        private MeasureCapabilitiesResponse() {
        }

        /* access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -2;
        }

        public static MeasureCapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCapabilities(DataProto.MeasureCapabilities measureCapabilities) {
            measureCapabilities.getClass();
            DataProto.MeasureCapabilities measureCapabilities2 = this.capabilities_;
            if (!(measureCapabilities2 == null || measureCapabilities2 == DataProto.MeasureCapabilities.getDefaultInstance())) {
                measureCapabilities = (DataProto.MeasureCapabilities) ((DataProto.MeasureCapabilities.Builder) DataProto.MeasureCapabilities.newBuilder(this.capabilities_).mergeFrom(measureCapabilities)).buildPartial();
            }
            this.capabilities_ = measureCapabilities;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MeasureCapabilitiesResponse measureCapabilitiesResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(measureCapabilitiesResponse);
        }

        public static MeasureCapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (MeasureCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCapabilitiesResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(i iVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(i iVar, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(j jVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(j jVar, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(InputStream inputStream) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCapabilitiesResponse parseFrom(InputStream inputStream, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MeasureCapabilitiesResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MeasureCapabilitiesResponse parseFrom(byte[] bArr) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MeasureCapabilitiesResponse parseFrom(byte[] bArr, q qVar) {
            return (MeasureCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MeasureCapabilitiesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCapabilities(DataProto.MeasureCapabilities measureCapabilities) {
            measureCapabilities.getClass();
            this.capabilities_ = measureCapabilities;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "capabilities_"});
                case 3:
                    return new MeasureCapabilitiesResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MeasureCapabilitiesResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MeasureCapabilitiesResponse.class) {
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

        public DataProto.MeasureCapabilities getCapabilities() {
            DataProto.MeasureCapabilities measureCapabilities = this.capabilities_;
            return measureCapabilities == null ? DataProto.MeasureCapabilities.getDefaultInstance() : measureCapabilities;
        }

        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface MeasureCapabilitiesResponseOrBuilder extends s0 {
        DataProto.MeasureCapabilities getCapabilities();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean hasCapabilities();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringCapabilitiesResponse extends y<PassiveMonitoringCapabilitiesResponse, Builder> implements PassiveMonitoringCapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final PassiveMonitoringCapabilitiesResponse DEFAULT_INSTANCE;
        private static volatile z0<PassiveMonitoringCapabilitiesResponse> PARSER;
        private int bitField0_;
        private DataProto.PassiveMonitoringCapabilities capabilities_;

        public static final class Builder extends y.a<PassiveMonitoringCapabilitiesResponse, Builder> implements PassiveMonitoringCapabilitiesResponseOrBuilder {
            private Builder() {
                super(PassiveMonitoringCapabilitiesResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearCapabilities() {
                copyOnWrite();
                ((PassiveMonitoringCapabilitiesResponse) this.instance).clearCapabilities();
                return this;
            }

            public DataProto.PassiveMonitoringCapabilities getCapabilities() {
                return ((PassiveMonitoringCapabilitiesResponse) this.instance).getCapabilities();
            }

            public boolean hasCapabilities() {
                return ((PassiveMonitoringCapabilitiesResponse) this.instance).hasCapabilities();
            }

            public Builder mergeCapabilities(DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities) {
                copyOnWrite();
                ((PassiveMonitoringCapabilitiesResponse) this.instance).mergeCapabilities(passiveMonitoringCapabilities);
                return this;
            }

            public Builder setCapabilities(DataProto.PassiveMonitoringCapabilities.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringCapabilitiesResponse) this.instance).setCapabilities((DataProto.PassiveMonitoringCapabilities) builder.build());
                return this;
            }

            public Builder setCapabilities(DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities) {
                copyOnWrite();
                ((PassiveMonitoringCapabilitiesResponse) this.instance).setCapabilities(passiveMonitoringCapabilities);
                return this;
            }
        }

        static {
            PassiveMonitoringCapabilitiesResponse passiveMonitoringCapabilitiesResponse = new PassiveMonitoringCapabilitiesResponse();
            DEFAULT_INSTANCE = passiveMonitoringCapabilitiesResponse;
            y.registerDefaultInstance(PassiveMonitoringCapabilitiesResponse.class, passiveMonitoringCapabilitiesResponse);
        }

        private PassiveMonitoringCapabilitiesResponse() {
        }

        /* access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -2;
        }

        public static PassiveMonitoringCapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCapabilities(DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities) {
            passiveMonitoringCapabilities.getClass();
            DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities2 = this.capabilities_;
            if (!(passiveMonitoringCapabilities2 == null || passiveMonitoringCapabilities2 == DataProto.PassiveMonitoringCapabilities.getDefaultInstance())) {
                passiveMonitoringCapabilities = (DataProto.PassiveMonitoringCapabilities) ((DataProto.PassiveMonitoringCapabilities.Builder) DataProto.PassiveMonitoringCapabilities.newBuilder(this.capabilities_).mergeFrom(passiveMonitoringCapabilities)).buildPartial();
            }
            this.capabilities_ = passiveMonitoringCapabilities;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringCapabilitiesResponse passiveMonitoringCapabilitiesResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringCapabilitiesResponse);
        }

        public static PassiveMonitoringCapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringCapabilitiesResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(i iVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(j jVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(InputStream inputStream) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(byte[] bArr) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringCapabilitiesResponse parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringCapabilitiesResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringCapabilitiesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCapabilities(DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities) {
            passiveMonitoringCapabilities.getClass();
            this.capabilities_ = passiveMonitoringCapabilities;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "capabilities_"});
                case 3:
                    return new PassiveMonitoringCapabilitiesResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringCapabilitiesResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringCapabilitiesResponse.class) {
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

        public DataProto.PassiveMonitoringCapabilities getCapabilities() {
            DataProto.PassiveMonitoringCapabilities passiveMonitoringCapabilities = this.capabilities_;
            return passiveMonitoringCapabilities == null ? DataProto.PassiveMonitoringCapabilities.getDefaultInstance() : passiveMonitoringCapabilities;
        }

        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveMonitoringCapabilitiesResponseOrBuilder extends s0 {
        DataProto.PassiveMonitoringCapabilities getCapabilities();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean hasCapabilities();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringGoalResponse extends y<PassiveMonitoringGoalResponse, Builder> implements PassiveMonitoringGoalResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveMonitoringGoalResponse DEFAULT_INSTANCE;
        public static final int GOAL_FIELD_NUMBER = 1;
        private static volatile z0<PassiveMonitoringGoalResponse> PARSER;
        private int bitField0_;
        private DataProto.PassiveGoal goal_;

        public static final class Builder extends y.a<PassiveMonitoringGoalResponse, Builder> implements PassiveMonitoringGoalResponseOrBuilder {
            private Builder() {
                super(PassiveMonitoringGoalResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearGoal() {
                copyOnWrite();
                ((PassiveMonitoringGoalResponse) this.instance).clearGoal();
                return this;
            }

            public DataProto.PassiveGoal getGoal() {
                return ((PassiveMonitoringGoalResponse) this.instance).getGoal();
            }

            public boolean hasGoal() {
                return ((PassiveMonitoringGoalResponse) this.instance).hasGoal();
            }

            public Builder mergeGoal(DataProto.PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveMonitoringGoalResponse) this.instance).mergeGoal(passiveGoal);
                return this;
            }

            public Builder setGoal(DataProto.PassiveGoal.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringGoalResponse) this.instance).setGoal((DataProto.PassiveGoal) builder.build());
                return this;
            }

            public Builder setGoal(DataProto.PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveMonitoringGoalResponse) this.instance).setGoal(passiveGoal);
                return this;
            }
        }

        static {
            PassiveMonitoringGoalResponse passiveMonitoringGoalResponse = new PassiveMonitoringGoalResponse();
            DEFAULT_INSTANCE = passiveMonitoringGoalResponse;
            y.registerDefaultInstance(PassiveMonitoringGoalResponse.class, passiveMonitoringGoalResponse);
        }

        private PassiveMonitoringGoalResponse() {
        }

        /* access modifiers changed from: private */
        public void clearGoal() {
            this.goal_ = null;
            this.bitField0_ &= -2;
        }

        public static PassiveMonitoringGoalResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeGoal(DataProto.PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            DataProto.PassiveGoal passiveGoal2 = this.goal_;
            if (!(passiveGoal2 == null || passiveGoal2 == DataProto.PassiveGoal.getDefaultInstance())) {
                passiveGoal = (DataProto.PassiveGoal) ((DataProto.PassiveGoal.Builder) DataProto.PassiveGoal.newBuilder(this.goal_).mergeFrom(passiveGoal)).buildPartial();
            }
            this.goal_ = passiveGoal;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringGoalResponse);
        }

        public static PassiveMonitoringGoalResponse parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringGoalResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringGoalResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(i iVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(j jVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(InputStream inputStream) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringGoalResponse parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringGoalResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringGoalResponse parseFrom(byte[] bArr) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringGoalResponse parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringGoalResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringGoalResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setGoal(DataProto.PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            this.goal_ = passiveGoal;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "goal_"});
                case 3:
                    return new PassiveMonitoringGoalResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringGoalResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringGoalResponse.class) {
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

        public DataProto.PassiveGoal getGoal() {
            DataProto.PassiveGoal passiveGoal = this.goal_;
            return passiveGoal == null ? DataProto.PassiveGoal.getDefaultInstance() : passiveGoal;
        }

        public boolean hasGoal() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveMonitoringGoalResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.PassiveGoal getGoal();

        boolean hasGoal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveMonitoringUpdateResponse extends y<PassiveMonitoringUpdateResponse, Builder> implements PassiveMonitoringUpdateResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveMonitoringUpdateResponse DEFAULT_INSTANCE;
        private static volatile z0<PassiveMonitoringUpdateResponse> PARSER = null;
        public static final int UPDATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private DataProto.PassiveMonitoringUpdate update_;

        public static final class Builder extends y.a<PassiveMonitoringUpdateResponse, Builder> implements PassiveMonitoringUpdateResponseOrBuilder {
            private Builder() {
                super(PassiveMonitoringUpdateResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearUpdate() {
                copyOnWrite();
                ((PassiveMonitoringUpdateResponse) this.instance).clearUpdate();
                return this;
            }

            public DataProto.PassiveMonitoringUpdate getUpdate() {
                return ((PassiveMonitoringUpdateResponse) this.instance).getUpdate();
            }

            public boolean hasUpdate() {
                return ((PassiveMonitoringUpdateResponse) this.instance).hasUpdate();
            }

            public Builder mergeUpdate(DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate) {
                copyOnWrite();
                ((PassiveMonitoringUpdateResponse) this.instance).mergeUpdate(passiveMonitoringUpdate);
                return this;
            }

            public Builder setUpdate(DataProto.PassiveMonitoringUpdate.Builder builder) {
                copyOnWrite();
                ((PassiveMonitoringUpdateResponse) this.instance).setUpdate((DataProto.PassiveMonitoringUpdate) builder.build());
                return this;
            }

            public Builder setUpdate(DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate) {
                copyOnWrite();
                ((PassiveMonitoringUpdateResponse) this.instance).setUpdate(passiveMonitoringUpdate);
                return this;
            }
        }

        static {
            PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse = new PassiveMonitoringUpdateResponse();
            DEFAULT_INSTANCE = passiveMonitoringUpdateResponse;
            y.registerDefaultInstance(PassiveMonitoringUpdateResponse.class, passiveMonitoringUpdateResponse);
        }

        private PassiveMonitoringUpdateResponse() {
        }

        /* access modifiers changed from: private */
        public void clearUpdate() {
            this.update_ = null;
            this.bitField0_ &= -2;
        }

        public static PassiveMonitoringUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeUpdate(DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate) {
            passiveMonitoringUpdate.getClass();
            DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate2 = this.update_;
            if (!(passiveMonitoringUpdate2 == null || passiveMonitoringUpdate2 == DataProto.PassiveMonitoringUpdate.getDefaultInstance())) {
                passiveMonitoringUpdate = (DataProto.PassiveMonitoringUpdate) ((DataProto.PassiveMonitoringUpdate.Builder) DataProto.PassiveMonitoringUpdate.newBuilder(this.update_).mergeFrom(passiveMonitoringUpdate)).buildPartial();
            }
            this.update_ = passiveMonitoringUpdate;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveMonitoringUpdateResponse);
        }

        public static PassiveMonitoringUpdateResponse parseDelimitedFrom(InputStream inputStream) {
            return (PassiveMonitoringUpdateResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringUpdateResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(i iVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(i iVar, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(j jVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(j jVar, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(InputStream inputStream) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(InputStream inputStream, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(ByteBuffer byteBuffer) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(byte[] bArr) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveMonitoringUpdateResponse parseFrom(byte[] bArr, q qVar) {
            return (PassiveMonitoringUpdateResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveMonitoringUpdateResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUpdate(DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate) {
            passiveMonitoringUpdate.getClass();
            this.update_ = passiveMonitoringUpdate;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "update_"});
                case 3:
                    return new PassiveMonitoringUpdateResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveMonitoringUpdateResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveMonitoringUpdateResponse.class) {
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

        public DataProto.PassiveMonitoringUpdate getUpdate() {
            DataProto.PassiveMonitoringUpdate passiveMonitoringUpdate = this.update_;
            return passiveMonitoringUpdate == null ? DataProto.PassiveMonitoringUpdate.getDefaultInstance() : passiveMonitoringUpdate;
        }

        public boolean hasUpdate() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveMonitoringUpdateResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.PassiveMonitoringUpdate getUpdate();

        boolean hasUpdate();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PermissionLostResponse extends y<PermissionLostResponse, Builder> implements PermissionLostResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final PermissionLostResponse DEFAULT_INSTANCE;
        private static volatile z0<PermissionLostResponse> PARSER;

        public static final class Builder extends y.a<PermissionLostResponse, Builder> implements PermissionLostResponseOrBuilder {
            private Builder() {
                super(PermissionLostResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }
        }

        static {
            PermissionLostResponse permissionLostResponse = new PermissionLostResponse();
            DEFAULT_INSTANCE = permissionLostResponse;
            y.registerDefaultInstance(PermissionLostResponse.class, permissionLostResponse);
        }

        private PermissionLostResponse() {
        }

        public static PermissionLostResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PermissionLostResponse permissionLostResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(permissionLostResponse);
        }

        public static PermissionLostResponse parseDelimitedFrom(InputStream inputStream) {
            return (PermissionLostResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PermissionLostResponse parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PermissionLostResponse) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PermissionLostResponse parseFrom(i iVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PermissionLostResponse parseFrom(i iVar, q qVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PermissionLostResponse parseFrom(j jVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PermissionLostResponse parseFrom(j jVar, q qVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PermissionLostResponse parseFrom(InputStream inputStream) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PermissionLostResponse parseFrom(InputStream inputStream, q qVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PermissionLostResponse parseFrom(ByteBuffer byteBuffer) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PermissionLostResponse parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PermissionLostResponse parseFrom(byte[] bArr) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PermissionLostResponse parseFrom(byte[] bArr, q qVar) {
            return (PermissionLostResponse) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PermissionLostResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case 3:
                    return new PermissionLostResponse();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PermissionLostResponse> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PermissionLostResponse.class) {
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
    }

    public interface PermissionLostResponseOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private ResponsesProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
