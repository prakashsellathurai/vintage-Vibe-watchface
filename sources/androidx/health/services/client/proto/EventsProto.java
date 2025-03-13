package androidx.health.services.client.proto;

import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.a;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.q;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EventsProto {

    /* renamed from: androidx.health.services.client.proto.EventsProto$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.proto.EventsProto.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class ExerciseUpdateListenerEvent extends y<ExerciseUpdateListenerEvent, Builder> implements ExerciseUpdateListenerEventOrBuilder {
        public static final int AVAILABILITY_RESPONSE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final ExerciseUpdateListenerEvent DEFAULT_INSTANCE;
        public static final int EXERCISE_UPDATE_RESPONSE_FIELD_NUMBER = 1;
        public static final int LAP_SUMMARY_RESPONSE_FIELD_NUMBER = 2;
        private static volatile z0<ExerciseUpdateListenerEvent> PARSER;
        private int bitField0_;
        private int eventCase_ = 0;
        private Object event_;

        public static final class Builder extends y.a<ExerciseUpdateListenerEvent, Builder> implements ExerciseUpdateListenerEventOrBuilder {
            private Builder() {
                super(ExerciseUpdateListenerEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAvailabilityResponse() {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).clearAvailabilityResponse();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).clearEvent();
                return this;
            }

            public Builder clearExerciseUpdateResponse() {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).clearExerciseUpdateResponse();
                return this;
            }

            public Builder clearLapSummaryResponse() {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).clearLapSummaryResponse();
                return this;
            }

            public ResponsesProto.AvailabilityResponse getAvailabilityResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).getAvailabilityResponse();
            }

            public EventCase getEventCase() {
                return ((ExerciseUpdateListenerEvent) this.instance).getEventCase();
            }

            public ResponsesProto.ExerciseUpdateResponse getExerciseUpdateResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).getExerciseUpdateResponse();
            }

            public ResponsesProto.ExerciseLapSummaryResponse getLapSummaryResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).getLapSummaryResponse();
            }

            public boolean hasAvailabilityResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).hasAvailabilityResponse();
            }

            public boolean hasExerciseUpdateResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).hasExerciseUpdateResponse();
            }

            public boolean hasLapSummaryResponse() {
                return ((ExerciseUpdateListenerEvent) this.instance).hasLapSummaryResponse();
            }

            public Builder mergeAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).mergeAvailabilityResponse(availabilityResponse);
                return this;
            }

            public Builder mergeExerciseUpdateResponse(ResponsesProto.ExerciseUpdateResponse exerciseUpdateResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).mergeExerciseUpdateResponse(exerciseUpdateResponse);
                return this;
            }

            public Builder mergeLapSummaryResponse(ResponsesProto.ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).mergeLapSummaryResponse(exerciseLapSummaryResponse);
                return this;
            }

            public Builder setAvailabilityResponse(ResponsesProto.AvailabilityResponse.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setAvailabilityResponse((ResponsesProto.AvailabilityResponse) builder.build());
                return this;
            }

            public Builder setAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setAvailabilityResponse(availabilityResponse);
                return this;
            }

            public Builder setExerciseUpdateResponse(ResponsesProto.ExerciseUpdateResponse.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setExerciseUpdateResponse((ResponsesProto.ExerciseUpdateResponse) builder.build());
                return this;
            }

            public Builder setExerciseUpdateResponse(ResponsesProto.ExerciseUpdateResponse exerciseUpdateResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setExerciseUpdateResponse(exerciseUpdateResponse);
                return this;
            }

            public Builder setLapSummaryResponse(ResponsesProto.ExerciseLapSummaryResponse.Builder builder) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setLapSummaryResponse((ResponsesProto.ExerciseLapSummaryResponse) builder.build());
                return this;
            }

            public Builder setLapSummaryResponse(ResponsesProto.ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
                copyOnWrite();
                ((ExerciseUpdateListenerEvent) this.instance).setLapSummaryResponse(exerciseLapSummaryResponse);
                return this;
            }
        }

        public enum EventCase {
            EXERCISE_UPDATE_RESPONSE(1),
            LAP_SUMMARY_RESPONSE(2),
            AVAILABILITY_RESPONSE(3),
            EVENT_NOT_SET(0);
            
            private final int value;

            private EventCase(int i8) {
                this.value = i8;
            }

            public static EventCase forNumber(int i8) {
                if (i8 == 0) {
                    return EVENT_NOT_SET;
                }
                if (i8 == 1) {
                    return EXERCISE_UPDATE_RESPONSE;
                }
                if (i8 == 2) {
                    return LAP_SUMMARY_RESPONSE;
                }
                if (i8 != 3) {
                    return null;
                }
                return AVAILABILITY_RESPONSE;
            }

            @Deprecated
            public static EventCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            ExerciseUpdateListenerEvent exerciseUpdateListenerEvent = new ExerciseUpdateListenerEvent();
            DEFAULT_INSTANCE = exerciseUpdateListenerEvent;
            y.registerDefaultInstance(ExerciseUpdateListenerEvent.class, exerciseUpdateListenerEvent);
        }

        private ExerciseUpdateListenerEvent() {
        }

        /* access modifiers changed from: private */
        public void clearAvailabilityResponse() {
            if (this.eventCase_ == 3) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearEvent() {
            this.eventCase_ = 0;
            this.event_ = null;
        }

        /* access modifiers changed from: private */
        public void clearExerciseUpdateResponse() {
            if (this.eventCase_ == 1) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLapSummaryResponse() {
            if (this.eventCase_ == 2) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        public static ExerciseUpdateListenerEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
            availabilityResponse.getClass();
            a aVar = availabilityResponse;
            if (this.eventCase_ == 3) {
                aVar = availabilityResponse;
                if (this.event_ != ResponsesProto.AvailabilityResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.AvailabilityResponse.Builder) ResponsesProto.AvailabilityResponse.newBuilder((ResponsesProto.AvailabilityResponse) this.event_).mergeFrom(availabilityResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeExerciseUpdateResponse(ResponsesProto.ExerciseUpdateResponse exerciseUpdateResponse) {
            exerciseUpdateResponse.getClass();
            a aVar = exerciseUpdateResponse;
            if (this.eventCase_ == 1) {
                aVar = exerciseUpdateResponse;
                if (this.event_ != ResponsesProto.ExerciseUpdateResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.ExerciseUpdateResponse.Builder) ResponsesProto.ExerciseUpdateResponse.newBuilder((ResponsesProto.ExerciseUpdateResponse) this.event_).mergeFrom(exerciseUpdateResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeLapSummaryResponse(ResponsesProto.ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
            exerciseLapSummaryResponse.getClass();
            a aVar = exerciseLapSummaryResponse;
            if (this.eventCase_ == 2) {
                aVar = exerciseLapSummaryResponse;
                if (this.event_ != ResponsesProto.ExerciseLapSummaryResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.ExerciseLapSummaryResponse.Builder) ResponsesProto.ExerciseLapSummaryResponse.newBuilder((ResponsesProto.ExerciseLapSummaryResponse) this.event_).mergeFrom(exerciseLapSummaryResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exerciseUpdateListenerEvent);
        }

        public static ExerciseUpdateListenerEvent parseDelimitedFrom(InputStream inputStream) {
            return (ExerciseUpdateListenerEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdateListenerEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(i iVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(i iVar, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(j jVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(j jVar, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(InputStream inputStream) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExerciseUpdateListenerEvent parseFrom(InputStream inputStream, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(ByteBuffer byteBuffer) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExerciseUpdateListenerEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ExerciseUpdateListenerEvent parseFrom(byte[] bArr) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExerciseUpdateListenerEvent parseFrom(byte[] bArr, q qVar) {
            return (ExerciseUpdateListenerEvent) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ExerciseUpdateListenerEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
            availabilityResponse.getClass();
            this.event_ = availabilityResponse;
            this.eventCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setExerciseUpdateResponse(ResponsesProto.ExerciseUpdateResponse exerciseUpdateResponse) {
            exerciseUpdateResponse.getClass();
            this.event_ = exerciseUpdateResponse;
            this.eventCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setLapSummaryResponse(ResponsesProto.ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
            exerciseLapSummaryResponse.getClass();
            this.event_ = exerciseLapSummaryResponse;
            this.eventCase_ = 2;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", ResponsesProto.ExerciseUpdateResponse.class, ResponsesProto.ExerciseLapSummaryResponse.class, ResponsesProto.AvailabilityResponse.class});
                case 3:
                    return new ExerciseUpdateListenerEvent();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ExerciseUpdateListenerEvent> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ExerciseUpdateListenerEvent.class) {
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

        public ResponsesProto.AvailabilityResponse getAvailabilityResponse() {
            return this.eventCase_ == 3 ? (ResponsesProto.AvailabilityResponse) this.event_ : ResponsesProto.AvailabilityResponse.getDefaultInstance();
        }

        public EventCase getEventCase() {
            return EventCase.forNumber(this.eventCase_);
        }

        public ResponsesProto.ExerciseUpdateResponse getExerciseUpdateResponse() {
            return this.eventCase_ == 1 ? (ResponsesProto.ExerciseUpdateResponse) this.event_ : ResponsesProto.ExerciseUpdateResponse.getDefaultInstance();
        }

        public ResponsesProto.ExerciseLapSummaryResponse getLapSummaryResponse() {
            return this.eventCase_ == 2 ? (ResponsesProto.ExerciseLapSummaryResponse) this.event_ : ResponsesProto.ExerciseLapSummaryResponse.getDefaultInstance();
        }

        public boolean hasAvailabilityResponse() {
            return this.eventCase_ == 3;
        }

        public boolean hasExerciseUpdateResponse() {
            return this.eventCase_ == 1;
        }

        public boolean hasLapSummaryResponse() {
            return this.eventCase_ == 2;
        }
    }

    public interface ExerciseUpdateListenerEventOrBuilder extends s0 {
        ResponsesProto.AvailabilityResponse getAvailabilityResponse();

        /* synthetic */ r0 getDefaultInstanceForType();

        ExerciseUpdateListenerEvent.EventCase getEventCase();

        ResponsesProto.ExerciseUpdateResponse getExerciseUpdateResponse();

        ResponsesProto.ExerciseLapSummaryResponse getLapSummaryResponse();

        boolean hasAvailabilityResponse();

        boolean hasExerciseUpdateResponse();

        boolean hasLapSummaryResponse();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MeasureCallbackEvent extends y<MeasureCallbackEvent, Builder> implements MeasureCallbackEventOrBuilder {
        public static final int AVAILABILITY_RESPONSE_FIELD_NUMBER = 2;
        public static final int DATA_POINT_RESPONSE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final MeasureCallbackEvent DEFAULT_INSTANCE;
        private static volatile z0<MeasureCallbackEvent> PARSER;
        private int bitField0_;
        private int eventCase_ = 0;
        private Object event_;

        public static final class Builder extends y.a<MeasureCallbackEvent, Builder> implements MeasureCallbackEventOrBuilder {
            private Builder() {
                super(MeasureCallbackEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAvailabilityResponse() {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).clearAvailabilityResponse();
                return this;
            }

            public Builder clearDataPointResponse() {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).clearDataPointResponse();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).clearEvent();
                return this;
            }

            public ResponsesProto.AvailabilityResponse getAvailabilityResponse() {
                return ((MeasureCallbackEvent) this.instance).getAvailabilityResponse();
            }

            public ResponsesProto.DataPointsResponse getDataPointResponse() {
                return ((MeasureCallbackEvent) this.instance).getDataPointResponse();
            }

            public EventCase getEventCase() {
                return ((MeasureCallbackEvent) this.instance).getEventCase();
            }

            public boolean hasAvailabilityResponse() {
                return ((MeasureCallbackEvent) this.instance).hasAvailabilityResponse();
            }

            public boolean hasDataPointResponse() {
                return ((MeasureCallbackEvent) this.instance).hasDataPointResponse();
            }

            public Builder mergeAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).mergeAvailabilityResponse(availabilityResponse);
                return this;
            }

            public Builder mergeDataPointResponse(ResponsesProto.DataPointsResponse dataPointsResponse) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).mergeDataPointResponse(dataPointsResponse);
                return this;
            }

            public Builder setAvailabilityResponse(ResponsesProto.AvailabilityResponse.Builder builder) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).setAvailabilityResponse((ResponsesProto.AvailabilityResponse) builder.build());
                return this;
            }

            public Builder setAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).setAvailabilityResponse(availabilityResponse);
                return this;
            }

            public Builder setDataPointResponse(ResponsesProto.DataPointsResponse.Builder builder) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).setDataPointResponse((ResponsesProto.DataPointsResponse) builder.build());
                return this;
            }

            public Builder setDataPointResponse(ResponsesProto.DataPointsResponse dataPointsResponse) {
                copyOnWrite();
                ((MeasureCallbackEvent) this.instance).setDataPointResponse(dataPointsResponse);
                return this;
            }
        }

        public enum EventCase {
            DATA_POINT_RESPONSE(1),
            AVAILABILITY_RESPONSE(2),
            EVENT_NOT_SET(0);
            
            private final int value;

            private EventCase(int i8) {
                this.value = i8;
            }

            public static EventCase forNumber(int i8) {
                if (i8 == 0) {
                    return EVENT_NOT_SET;
                }
                if (i8 == 1) {
                    return DATA_POINT_RESPONSE;
                }
                if (i8 != 2) {
                    return null;
                }
                return AVAILABILITY_RESPONSE;
            }

            @Deprecated
            public static EventCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            MeasureCallbackEvent measureCallbackEvent = new MeasureCallbackEvent();
            DEFAULT_INSTANCE = measureCallbackEvent;
            y.registerDefaultInstance(MeasureCallbackEvent.class, measureCallbackEvent);
        }

        private MeasureCallbackEvent() {
        }

        /* access modifiers changed from: private */
        public void clearAvailabilityResponse() {
            if (this.eventCase_ == 2) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDataPointResponse() {
            if (this.eventCase_ == 1) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearEvent() {
            this.eventCase_ = 0;
            this.event_ = null;
        }

        public static MeasureCallbackEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
            availabilityResponse.getClass();
            a aVar = availabilityResponse;
            if (this.eventCase_ == 2) {
                aVar = availabilityResponse;
                if (this.event_ != ResponsesProto.AvailabilityResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.AvailabilityResponse.Builder) ResponsesProto.AvailabilityResponse.newBuilder((ResponsesProto.AvailabilityResponse) this.event_).mergeFrom(availabilityResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeDataPointResponse(ResponsesProto.DataPointsResponse dataPointsResponse) {
            dataPointsResponse.getClass();
            a aVar = dataPointsResponse;
            if (this.eventCase_ == 1) {
                aVar = dataPointsResponse;
                if (this.event_ != ResponsesProto.DataPointsResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.DataPointsResponse.Builder) ResponsesProto.DataPointsResponse.newBuilder((ResponsesProto.DataPointsResponse) this.event_).mergeFrom(dataPointsResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MeasureCallbackEvent measureCallbackEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(measureCallbackEvent);
        }

        public static MeasureCallbackEvent parseDelimitedFrom(InputStream inputStream) {
            return (MeasureCallbackEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCallbackEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MeasureCallbackEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCallbackEvent parseFrom(i iVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MeasureCallbackEvent parseFrom(i iVar, q qVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MeasureCallbackEvent parseFrom(j jVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MeasureCallbackEvent parseFrom(j jVar, q qVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MeasureCallbackEvent parseFrom(InputStream inputStream) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureCallbackEvent parseFrom(InputStream inputStream, q qVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureCallbackEvent parseFrom(ByteBuffer byteBuffer) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MeasureCallbackEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MeasureCallbackEvent parseFrom(byte[] bArr) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MeasureCallbackEvent parseFrom(byte[] bArr, q qVar) {
            return (MeasureCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MeasureCallbackEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAvailabilityResponse(ResponsesProto.AvailabilityResponse availabilityResponse) {
            availabilityResponse.getClass();
            this.event_ = availabilityResponse;
            this.eventCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setDataPointResponse(ResponsesProto.DataPointsResponse dataPointsResponse) {
            dataPointsResponse.getClass();
            this.event_ = dataPointsResponse;
            this.eventCase_ = 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", ResponsesProto.DataPointsResponse.class, ResponsesProto.AvailabilityResponse.class});
                case 3:
                    return new MeasureCallbackEvent();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MeasureCallbackEvent> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MeasureCallbackEvent.class) {
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

        public ResponsesProto.AvailabilityResponse getAvailabilityResponse() {
            return this.eventCase_ == 2 ? (ResponsesProto.AvailabilityResponse) this.event_ : ResponsesProto.AvailabilityResponse.getDefaultInstance();
        }

        public ResponsesProto.DataPointsResponse getDataPointResponse() {
            return this.eventCase_ == 1 ? (ResponsesProto.DataPointsResponse) this.event_ : ResponsesProto.DataPointsResponse.getDefaultInstance();
        }

        public EventCase getEventCase() {
            return EventCase.forNumber(this.eventCase_);
        }

        public boolean hasAvailabilityResponse() {
            return this.eventCase_ == 2;
        }

        public boolean hasDataPointResponse() {
            return this.eventCase_ == 1;
        }
    }

    public interface MeasureCallbackEventOrBuilder extends s0 {
        ResponsesProto.AvailabilityResponse getAvailabilityResponse();

        ResponsesProto.DataPointsResponse getDataPointResponse();

        /* synthetic */ r0 getDefaultInstanceForType();

        MeasureCallbackEvent.EventCase getEventCase();

        boolean hasAvailabilityResponse();

        boolean hasDataPointResponse();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveCallbackEvent extends y<PassiveCallbackEvent, Builder> implements PassiveCallbackEventOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveCallbackEvent DEFAULT_INSTANCE;
        private static volatile z0<PassiveCallbackEvent> PARSER = null;
        public static final int PASSIVE_UPDATE_RESPONSE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int eventCase_ = 0;
        private Object event_;

        public static final class Builder extends y.a<PassiveCallbackEvent, Builder> implements PassiveCallbackEventOrBuilder {
            private Builder() {
                super(PassiveCallbackEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((PassiveCallbackEvent) this.instance).clearEvent();
                return this;
            }

            public Builder clearPassiveUpdateResponse() {
                copyOnWrite();
                ((PassiveCallbackEvent) this.instance).clearPassiveUpdateResponse();
                return this;
            }

            public EventCase getEventCase() {
                return ((PassiveCallbackEvent) this.instance).getEventCase();
            }

            public ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse() {
                return ((PassiveCallbackEvent) this.instance).getPassiveUpdateResponse();
            }

            public boolean hasPassiveUpdateResponse() {
                return ((PassiveCallbackEvent) this.instance).hasPassiveUpdateResponse();
            }

            public Builder mergePassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
                copyOnWrite();
                ((PassiveCallbackEvent) this.instance).mergePassiveUpdateResponse(passiveMonitoringUpdateResponse);
                return this;
            }

            public Builder setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse.Builder builder) {
                copyOnWrite();
                ((PassiveCallbackEvent) this.instance).setPassiveUpdateResponse((ResponsesProto.PassiveMonitoringUpdateResponse) builder.build());
                return this;
            }

            public Builder setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
                copyOnWrite();
                ((PassiveCallbackEvent) this.instance).setPassiveUpdateResponse(passiveMonitoringUpdateResponse);
                return this;
            }
        }

        public enum EventCase {
            PASSIVE_UPDATE_RESPONSE(1),
            EVENT_NOT_SET(0);
            
            private final int value;

            private EventCase(int i8) {
                this.value = i8;
            }

            public static EventCase forNumber(int i8) {
                if (i8 == 0) {
                    return EVENT_NOT_SET;
                }
                if (i8 != 1) {
                    return null;
                }
                return PASSIVE_UPDATE_RESPONSE;
            }

            @Deprecated
            public static EventCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            PassiveCallbackEvent passiveCallbackEvent = new PassiveCallbackEvent();
            DEFAULT_INSTANCE = passiveCallbackEvent;
            y.registerDefaultInstance(PassiveCallbackEvent.class, passiveCallbackEvent);
        }

        private PassiveCallbackEvent() {
        }

        /* access modifiers changed from: private */
        public void clearEvent() {
            this.eventCase_ = 0;
            this.event_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPassiveUpdateResponse() {
            if (this.eventCase_ == 1) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        public static PassiveCallbackEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            passiveMonitoringUpdateResponse.getClass();
            a aVar = passiveMonitoringUpdateResponse;
            if (this.eventCase_ == 1) {
                aVar = passiveMonitoringUpdateResponse;
                if (this.event_ != ResponsesProto.PassiveMonitoringUpdateResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.PassiveMonitoringUpdateResponse.Builder) ResponsesProto.PassiveMonitoringUpdateResponse.newBuilder((ResponsesProto.PassiveMonitoringUpdateResponse) this.event_).mergeFrom(passiveMonitoringUpdateResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveCallbackEvent passiveCallbackEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveCallbackEvent);
        }

        public static PassiveCallbackEvent parseDelimitedFrom(InputStream inputStream) {
            return (PassiveCallbackEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveCallbackEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveCallbackEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveCallbackEvent parseFrom(i iVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveCallbackEvent parseFrom(i iVar, q qVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveCallbackEvent parseFrom(j jVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveCallbackEvent parseFrom(j jVar, q qVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveCallbackEvent parseFrom(InputStream inputStream) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveCallbackEvent parseFrom(InputStream inputStream, q qVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveCallbackEvent parseFrom(ByteBuffer byteBuffer) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveCallbackEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveCallbackEvent parseFrom(byte[] bArr) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveCallbackEvent parseFrom(byte[] bArr, q qVar) {
            return (PassiveCallbackEvent) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveCallbackEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            passiveMonitoringUpdateResponse.getClass();
            this.event_ = passiveMonitoringUpdateResponse;
            this.eventCase_ = 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", ResponsesProto.PassiveMonitoringUpdateResponse.class});
                case 3:
                    return new PassiveCallbackEvent();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveCallbackEvent> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveCallbackEvent.class) {
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

        public EventCase getEventCase() {
            return EventCase.forNumber(this.eventCase_);
        }

        public ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse() {
            return this.eventCase_ == 1 ? (ResponsesProto.PassiveMonitoringUpdateResponse) this.event_ : ResponsesProto.PassiveMonitoringUpdateResponse.getDefaultInstance();
        }

        public boolean hasPassiveUpdateResponse() {
            return this.eventCase_ == 1;
        }
    }

    public interface PassiveCallbackEventOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        PassiveCallbackEvent.EventCase getEventCase();

        ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse();

        boolean hasPassiveUpdateResponse();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveListenerEvent extends y<PassiveListenerEvent, Builder> implements PassiveListenerEventOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveListenerEvent DEFAULT_INSTANCE;
        public static final int HEALTH_EVENT_RESPONSE_FIELD_NUMBER = 3;
        private static volatile z0<PassiveListenerEvent> PARSER = null;
        public static final int PASSIVE_GOAL_RESPONSE_FIELD_NUMBER = 2;
        public static final int PASSIVE_UPDATE_RESPONSE_FIELD_NUMBER = 1;
        public static final int PERMISSION_LOST_RESPONSE_FIELD_NUMBER = 4;
        private int bitField0_;
        private int eventCase_ = 0;
        private Object event_;

        public static final class Builder extends y.a<PassiveListenerEvent, Builder> implements PassiveListenerEventOrBuilder {
            private Builder() {
                super(PassiveListenerEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).clearEvent();
                return this;
            }

            public Builder clearHealthEventResponse() {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).clearHealthEventResponse();
                return this;
            }

            public Builder clearPassiveGoalResponse() {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).clearPassiveGoalResponse();
                return this;
            }

            public Builder clearPassiveUpdateResponse() {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).clearPassiveUpdateResponse();
                return this;
            }

            public Builder clearPermissionLostResponse() {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).clearPermissionLostResponse();
                return this;
            }

            public EventCase getEventCase() {
                return ((PassiveListenerEvent) this.instance).getEventCase();
            }

            public ResponsesProto.HealthEventResponse getHealthEventResponse() {
                return ((PassiveListenerEvent) this.instance).getHealthEventResponse();
            }

            public ResponsesProto.PassiveMonitoringGoalResponse getPassiveGoalResponse() {
                return ((PassiveListenerEvent) this.instance).getPassiveGoalResponse();
            }

            public ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse() {
                return ((PassiveListenerEvent) this.instance).getPassiveUpdateResponse();
            }

            public ResponsesProto.PermissionLostResponse getPermissionLostResponse() {
                return ((PassiveListenerEvent) this.instance).getPermissionLostResponse();
            }

            public boolean hasHealthEventResponse() {
                return ((PassiveListenerEvent) this.instance).hasHealthEventResponse();
            }

            public boolean hasPassiveGoalResponse() {
                return ((PassiveListenerEvent) this.instance).hasPassiveGoalResponse();
            }

            public boolean hasPassiveUpdateResponse() {
                return ((PassiveListenerEvent) this.instance).hasPassiveUpdateResponse();
            }

            public boolean hasPermissionLostResponse() {
                return ((PassiveListenerEvent) this.instance).hasPermissionLostResponse();
            }

            public Builder mergeHealthEventResponse(ResponsesProto.HealthEventResponse healthEventResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).mergeHealthEventResponse(healthEventResponse);
                return this;
            }

            public Builder mergePassiveGoalResponse(ResponsesProto.PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).mergePassiveGoalResponse(passiveMonitoringGoalResponse);
                return this;
            }

            public Builder mergePassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).mergePassiveUpdateResponse(passiveMonitoringUpdateResponse);
                return this;
            }

            public Builder mergePermissionLostResponse(ResponsesProto.PermissionLostResponse permissionLostResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).mergePermissionLostResponse(permissionLostResponse);
                return this;
            }

            public Builder setHealthEventResponse(ResponsesProto.HealthEventResponse.Builder builder) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setHealthEventResponse((ResponsesProto.HealthEventResponse) builder.build());
                return this;
            }

            public Builder setHealthEventResponse(ResponsesProto.HealthEventResponse healthEventResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setHealthEventResponse(healthEventResponse);
                return this;
            }

            public Builder setPassiveGoalResponse(ResponsesProto.PassiveMonitoringGoalResponse.Builder builder) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPassiveGoalResponse((ResponsesProto.PassiveMonitoringGoalResponse) builder.build());
                return this;
            }

            public Builder setPassiveGoalResponse(ResponsesProto.PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPassiveGoalResponse(passiveMonitoringGoalResponse);
                return this;
            }

            public Builder setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse.Builder builder) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPassiveUpdateResponse((ResponsesProto.PassiveMonitoringUpdateResponse) builder.build());
                return this;
            }

            public Builder setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPassiveUpdateResponse(passiveMonitoringUpdateResponse);
                return this;
            }

            public Builder setPermissionLostResponse(ResponsesProto.PermissionLostResponse.Builder builder) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPermissionLostResponse((ResponsesProto.PermissionLostResponse) builder.build());
                return this;
            }

            public Builder setPermissionLostResponse(ResponsesProto.PermissionLostResponse permissionLostResponse) {
                copyOnWrite();
                ((PassiveListenerEvent) this.instance).setPermissionLostResponse(permissionLostResponse);
                return this;
            }
        }

        public enum EventCase {
            PASSIVE_UPDATE_RESPONSE(1),
            PASSIVE_GOAL_RESPONSE(2),
            HEALTH_EVENT_RESPONSE(3),
            PERMISSION_LOST_RESPONSE(4),
            EVENT_NOT_SET(0);
            
            private final int value;

            private EventCase(int i8) {
                this.value = i8;
            }

            public static EventCase forNumber(int i8) {
                if (i8 == 0) {
                    return EVENT_NOT_SET;
                }
                if (i8 == 1) {
                    return PASSIVE_UPDATE_RESPONSE;
                }
                if (i8 == 2) {
                    return PASSIVE_GOAL_RESPONSE;
                }
                if (i8 == 3) {
                    return HEALTH_EVENT_RESPONSE;
                }
                if (i8 != 4) {
                    return null;
                }
                return PERMISSION_LOST_RESPONSE;
            }

            @Deprecated
            public static EventCase valueOf(int i8) {
                return forNumber(i8);
            }

            public int getNumber() {
                return this.value;
            }
        }

        static {
            PassiveListenerEvent passiveListenerEvent = new PassiveListenerEvent();
            DEFAULT_INSTANCE = passiveListenerEvent;
            y.registerDefaultInstance(PassiveListenerEvent.class, passiveListenerEvent);
        }

        private PassiveListenerEvent() {
        }

        /* access modifiers changed from: private */
        public void clearEvent() {
            this.eventCase_ = 0;
            this.event_ = null;
        }

        /* access modifiers changed from: private */
        public void clearHealthEventResponse() {
            if (this.eventCase_ == 3) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPassiveGoalResponse() {
            if (this.eventCase_ == 2) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPassiveUpdateResponse() {
            if (this.eventCase_ == 1) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPermissionLostResponse() {
            if (this.eventCase_ == 4) {
                this.eventCase_ = 0;
                this.event_ = null;
            }
        }

        public static PassiveListenerEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeHealthEventResponse(ResponsesProto.HealthEventResponse healthEventResponse) {
            healthEventResponse.getClass();
            a aVar = healthEventResponse;
            if (this.eventCase_ == 3) {
                aVar = healthEventResponse;
                if (this.event_ != ResponsesProto.HealthEventResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.HealthEventResponse.Builder) ResponsesProto.HealthEventResponse.newBuilder((ResponsesProto.HealthEventResponse) this.event_).mergeFrom(healthEventResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergePassiveGoalResponse(ResponsesProto.PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
            passiveMonitoringGoalResponse.getClass();
            a aVar = passiveMonitoringGoalResponse;
            if (this.eventCase_ == 2) {
                aVar = passiveMonitoringGoalResponse;
                if (this.event_ != ResponsesProto.PassiveMonitoringGoalResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.PassiveMonitoringGoalResponse.Builder) ResponsesProto.PassiveMonitoringGoalResponse.newBuilder((ResponsesProto.PassiveMonitoringGoalResponse) this.event_).mergeFrom(passiveMonitoringGoalResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergePassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            passiveMonitoringUpdateResponse.getClass();
            a aVar = passiveMonitoringUpdateResponse;
            if (this.eventCase_ == 1) {
                aVar = passiveMonitoringUpdateResponse;
                if (this.event_ != ResponsesProto.PassiveMonitoringUpdateResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.PassiveMonitoringUpdateResponse.Builder) ResponsesProto.PassiveMonitoringUpdateResponse.newBuilder((ResponsesProto.PassiveMonitoringUpdateResponse) this.event_).mergeFrom(passiveMonitoringUpdateResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergePermissionLostResponse(ResponsesProto.PermissionLostResponse permissionLostResponse) {
            permissionLostResponse.getClass();
            a aVar = permissionLostResponse;
            if (this.eventCase_ == 4) {
                aVar = permissionLostResponse;
                if (this.event_ != ResponsesProto.PermissionLostResponse.getDefaultInstance()) {
                    aVar = ((ResponsesProto.PermissionLostResponse.Builder) ResponsesProto.PermissionLostResponse.newBuilder((ResponsesProto.PermissionLostResponse) this.event_).mergeFrom(permissionLostResponse)).buildPartial();
                }
            }
            this.event_ = aVar;
            this.eventCase_ = 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveListenerEvent passiveListenerEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveListenerEvent);
        }

        public static PassiveListenerEvent parseDelimitedFrom(InputStream inputStream) {
            return (PassiveListenerEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerEvent parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerEvent) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerEvent parseFrom(i iVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveListenerEvent parseFrom(i iVar, q qVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveListenerEvent parseFrom(j jVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveListenerEvent parseFrom(j jVar, q qVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveListenerEvent parseFrom(InputStream inputStream) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerEvent parseFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerEvent parseFrom(ByteBuffer byteBuffer) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveListenerEvent parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveListenerEvent parseFrom(byte[] bArr) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveListenerEvent parseFrom(byte[] bArr, q qVar) {
            return (PassiveListenerEvent) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveListenerEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHealthEventResponse(ResponsesProto.HealthEventResponse healthEventResponse) {
            healthEventResponse.getClass();
            this.event_ = healthEventResponse;
            this.eventCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setPassiveGoalResponse(ResponsesProto.PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
            passiveMonitoringGoalResponse.getClass();
            this.event_ = passiveMonitoringGoalResponse;
            this.eventCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setPassiveUpdateResponse(ResponsesProto.PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            passiveMonitoringUpdateResponse.getClass();
            this.event_ = passiveMonitoringUpdateResponse;
            this.eventCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setPermissionLostResponse(ResponsesProto.PermissionLostResponse permissionLostResponse) {
            permissionLostResponse.getClass();
            this.event_ = permissionLostResponse;
            this.eventCase_ = 4;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", ResponsesProto.PassiveMonitoringUpdateResponse.class, ResponsesProto.PassiveMonitoringGoalResponse.class, ResponsesProto.HealthEventResponse.class, ResponsesProto.PermissionLostResponse.class});
                case 3:
                    return new PassiveListenerEvent();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveListenerEvent> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveListenerEvent.class) {
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

        public EventCase getEventCase() {
            return EventCase.forNumber(this.eventCase_);
        }

        public ResponsesProto.HealthEventResponse getHealthEventResponse() {
            return this.eventCase_ == 3 ? (ResponsesProto.HealthEventResponse) this.event_ : ResponsesProto.HealthEventResponse.getDefaultInstance();
        }

        public ResponsesProto.PassiveMonitoringGoalResponse getPassiveGoalResponse() {
            return this.eventCase_ == 2 ? (ResponsesProto.PassiveMonitoringGoalResponse) this.event_ : ResponsesProto.PassiveMonitoringGoalResponse.getDefaultInstance();
        }

        public ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse() {
            return this.eventCase_ == 1 ? (ResponsesProto.PassiveMonitoringUpdateResponse) this.event_ : ResponsesProto.PassiveMonitoringUpdateResponse.getDefaultInstance();
        }

        public ResponsesProto.PermissionLostResponse getPermissionLostResponse() {
            return this.eventCase_ == 4 ? (ResponsesProto.PermissionLostResponse) this.event_ : ResponsesProto.PermissionLostResponse.getDefaultInstance();
        }

        public boolean hasHealthEventResponse() {
            return this.eventCase_ == 3;
        }

        public boolean hasPassiveGoalResponse() {
            return this.eventCase_ == 2;
        }

        public boolean hasPassiveUpdateResponse() {
            return this.eventCase_ == 1;
        }

        public boolean hasPermissionLostResponse() {
            return this.eventCase_ == 4;
        }
    }

    public interface PassiveListenerEventOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        PassiveListenerEvent.EventCase getEventCase();

        ResponsesProto.HealthEventResponse getHealthEventResponse();

        ResponsesProto.PassiveMonitoringGoalResponse getPassiveGoalResponse();

        ResponsesProto.PassiveMonitoringUpdateResponse getPassiveUpdateResponse();

        ResponsesProto.PermissionLostResponse getPermissionLostResponse();

        boolean hasHealthEventResponse();

        boolean hasPassiveGoalResponse();

        boolean hasPassiveUpdateResponse();

        boolean hasPermissionLostResponse();

        /* synthetic */ boolean isInitialized();
    }

    private EventsProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
