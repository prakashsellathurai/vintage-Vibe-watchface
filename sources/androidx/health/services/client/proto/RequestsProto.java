package androidx.health.services.client.proto;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.a0;
import com.google.protobuf.c;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.q;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.google.protobuf.y;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class RequestsProto {

    /* renamed from: androidx.health.services.client.proto.RequestsProto$1  reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.proto.RequestsProto.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class AutoPauseAndResumeConfigRequest extends y<AutoPauseAndResumeConfigRequest, Builder> implements AutoPauseAndResumeConfigRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final AutoPauseAndResumeConfigRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<AutoPauseAndResumeConfigRequest> PARSER = null;
        public static final int SHOULD_ENABLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String packageName_ = "";
        private boolean shouldEnable_;

        public static final class Builder extends y.a<AutoPauseAndResumeConfigRequest, Builder> implements AutoPauseAndResumeConfigRequestOrBuilder {
            private Builder() {
                super(AutoPauseAndResumeConfigRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((AutoPauseAndResumeConfigRequest) this.instance).clearPackageName();
                return this;
            }

            public Builder clearShouldEnable() {
                copyOnWrite();
                ((AutoPauseAndResumeConfigRequest) this.instance).clearShouldEnable();
                return this;
            }

            public String getPackageName() {
                return ((AutoPauseAndResumeConfigRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((AutoPauseAndResumeConfigRequest) this.instance).getPackageNameBytes();
            }

            public boolean getShouldEnable() {
                return ((AutoPauseAndResumeConfigRequest) this.instance).getShouldEnable();
            }

            public boolean hasPackageName() {
                return ((AutoPauseAndResumeConfigRequest) this.instance).hasPackageName();
            }

            public boolean hasShouldEnable() {
                return ((AutoPauseAndResumeConfigRequest) this.instance).hasShouldEnable();
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((AutoPauseAndResumeConfigRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((AutoPauseAndResumeConfigRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }

            public Builder setShouldEnable(boolean z8) {
                copyOnWrite();
                ((AutoPauseAndResumeConfigRequest) this.instance).setShouldEnable(z8);
                return this;
            }
        }

        static {
            AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest = new AutoPauseAndResumeConfigRequest();
            DEFAULT_INSTANCE = autoPauseAndResumeConfigRequest;
            y.registerDefaultInstance(AutoPauseAndResumeConfigRequest.class, autoPauseAndResumeConfigRequest);
        }

        private AutoPauseAndResumeConfigRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        /* access modifiers changed from: private */
        public void clearShouldEnable() {
            this.bitField0_ &= -3;
            this.shouldEnable_ = false;
        }

        public static AutoPauseAndResumeConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(autoPauseAndResumeConfigRequest);
        }

        public static AutoPauseAndResumeConfigRequest parseDelimitedFrom(InputStream inputStream) {
            return (AutoPauseAndResumeConfigRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoPauseAndResumeConfigRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(i iVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(i iVar, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(j jVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(j jVar, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(InputStream inputStream) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(InputStream inputStream, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(ByteBuffer byteBuffer) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(byte[] bArr) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AutoPauseAndResumeConfigRequest parseFrom(byte[] bArr, q qVar) {
            return (AutoPauseAndResumeConfigRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<AutoPauseAndResumeConfigRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setShouldEnable(boolean z8) {
            this.bitField0_ |= 2;
            this.shouldEnable_ = z8;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "packageName_", "shouldEnable_"});
                case 3:
                    return new AutoPauseAndResumeConfigRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<AutoPauseAndResumeConfigRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (AutoPauseAndResumeConfigRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean getShouldEnable() {
            return this.shouldEnable_;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasShouldEnable() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface AutoPauseAndResumeConfigRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean getShouldEnable();

        boolean hasPackageName();

        boolean hasShouldEnable();

        /* synthetic */ boolean isInitialized();
    }

    public static final class BackgroundRegistrationRequest extends y<BackgroundRegistrationRequest, Builder> implements BackgroundRegistrationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BackgroundRegistrationRequest DEFAULT_INSTANCE;
        private static volatile z0<BackgroundRegistrationRequest> PARSER;
        private int bitField0_;
        private DataProto.PassiveMonitoringConfig config_;

        public static final class Builder extends y.a<BackgroundRegistrationRequest, Builder> implements BackgroundRegistrationRequestOrBuilder {
            private Builder() {
                super(BackgroundRegistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((BackgroundRegistrationRequest) this.instance).clearConfig();
                return this;
            }

            public DataProto.PassiveMonitoringConfig getConfig() {
                return ((BackgroundRegistrationRequest) this.instance).getConfig();
            }

            public boolean hasConfig() {
                return ((BackgroundRegistrationRequest) this.instance).hasConfig();
            }

            public Builder mergeConfig(DataProto.PassiveMonitoringConfig passiveMonitoringConfig) {
                copyOnWrite();
                ((BackgroundRegistrationRequest) this.instance).mergeConfig(passiveMonitoringConfig);
                return this;
            }

            public Builder setConfig(DataProto.PassiveMonitoringConfig.Builder builder) {
                copyOnWrite();
                ((BackgroundRegistrationRequest) this.instance).setConfig((DataProto.PassiveMonitoringConfig) builder.build());
                return this;
            }

            public Builder setConfig(DataProto.PassiveMonitoringConfig passiveMonitoringConfig) {
                copyOnWrite();
                ((BackgroundRegistrationRequest) this.instance).setConfig(passiveMonitoringConfig);
                return this;
            }
        }

        static {
            BackgroundRegistrationRequest backgroundRegistrationRequest = new BackgroundRegistrationRequest();
            DEFAULT_INSTANCE = backgroundRegistrationRequest;
            y.registerDefaultInstance(BackgroundRegistrationRequest.class, backgroundRegistrationRequest);
        }

        private BackgroundRegistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -2;
        }

        public static BackgroundRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(DataProto.PassiveMonitoringConfig passiveMonitoringConfig) {
            passiveMonitoringConfig.getClass();
            DataProto.PassiveMonitoringConfig passiveMonitoringConfig2 = this.config_;
            if (!(passiveMonitoringConfig2 == null || passiveMonitoringConfig2 == DataProto.PassiveMonitoringConfig.getDefaultInstance())) {
                passiveMonitoringConfig = (DataProto.PassiveMonitoringConfig) ((DataProto.PassiveMonitoringConfig.Builder) DataProto.PassiveMonitoringConfig.newBuilder(this.config_).mergeFrom(passiveMonitoringConfig)).buildPartial();
            }
            this.config_ = passiveMonitoringConfig;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BackgroundRegistrationRequest backgroundRegistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(backgroundRegistrationRequest);
        }

        public static BackgroundRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (BackgroundRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackgroundRegistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (BackgroundRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static BackgroundRegistrationRequest parseFrom(i iVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static BackgroundRegistrationRequest parseFrom(i iVar, q qVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static BackgroundRegistrationRequest parseFrom(j jVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BackgroundRegistrationRequest parseFrom(j jVar, q qVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static BackgroundRegistrationRequest parseFrom(InputStream inputStream) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackgroundRegistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static BackgroundRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static BackgroundRegistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static BackgroundRegistrationRequest parseFrom(byte[] bArr) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BackgroundRegistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (BackgroundRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<BackgroundRegistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfig(DataProto.PassiveMonitoringConfig passiveMonitoringConfig) {
            passiveMonitoringConfig.getClass();
            this.config_ = passiveMonitoringConfig;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "config_"});
                case 3:
                    return new BackgroundRegistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<BackgroundRegistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (BackgroundRegistrationRequest.class) {
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

        public DataProto.PassiveMonitoringConfig getConfig() {
            DataProto.PassiveMonitoringConfig passiveMonitoringConfig = this.config_;
            return passiveMonitoringConfig == null ? DataProto.PassiveMonitoringConfig.getDefaultInstance() : passiveMonitoringConfig;
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface BackgroundRegistrationRequestOrBuilder extends s0 {
        DataProto.PassiveMonitoringConfig getConfig();

        /* synthetic */ r0 getDefaultInstanceForType();

        boolean hasConfig();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CapabilitiesRequest extends y<CapabilitiesRequest, Builder> implements CapabilitiesRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final CapabilitiesRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<CapabilitiesRequest> PARSER;
        private int bitField0_;
        private String packageName_ = "";

        public static final class Builder extends y.a<CapabilitiesRequest, Builder> implements CapabilitiesRequestOrBuilder {
            private Builder() {
                super(CapabilitiesRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((CapabilitiesRequest) this.instance).clearPackageName();
                return this;
            }

            public String getPackageName() {
                return ((CapabilitiesRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((CapabilitiesRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasPackageName() {
                return ((CapabilitiesRequest) this.instance).hasPackageName();
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((CapabilitiesRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((CapabilitiesRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest();
            DEFAULT_INSTANCE = capabilitiesRequest;
            y.registerDefaultInstance(CapabilitiesRequest.class, capabilitiesRequest);
        }

        private CapabilitiesRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (CapabilitiesRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CapabilitiesRequest parseFrom(i iVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static CapabilitiesRequest parseFrom(i iVar, q qVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static CapabilitiesRequest parseFrom(j jVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CapabilitiesRequest parseFrom(j jVar, q qVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, q qVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, q qVar) {
            return (CapabilitiesRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<CapabilitiesRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "packageName_"});
                case 3:
                    return new CapabilitiesRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<CapabilitiesRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (CapabilitiesRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface CapabilitiesRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ContinuousHeartRateMonitoringRequest extends y<ContinuousHeartRateMonitoringRequest, Builder> implements ContinuousHeartRateMonitoringRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final ContinuousHeartRateMonitoringRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<ContinuousHeartRateMonitoringRequest> PARSER = null;
        public static final int SHOULD_ENABLE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String packageName_ = "";
        private boolean shouldEnable_;

        public static final class Builder extends y.a<ContinuousHeartRateMonitoringRequest, Builder> implements ContinuousHeartRateMonitoringRequestOrBuilder {
            private Builder() {
                super(ContinuousHeartRateMonitoringRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((ContinuousHeartRateMonitoringRequest) this.instance).clearPackageName();
                return this;
            }

            public Builder clearShouldEnable() {
                copyOnWrite();
                ((ContinuousHeartRateMonitoringRequest) this.instance).clearShouldEnable();
                return this;
            }

            public String getPackageName() {
                return ((ContinuousHeartRateMonitoringRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((ContinuousHeartRateMonitoringRequest) this.instance).getPackageNameBytes();
            }

            public boolean getShouldEnable() {
                return ((ContinuousHeartRateMonitoringRequest) this.instance).getShouldEnable();
            }

            public boolean hasPackageName() {
                return ((ContinuousHeartRateMonitoringRequest) this.instance).hasPackageName();
            }

            public boolean hasShouldEnable() {
                return ((ContinuousHeartRateMonitoringRequest) this.instance).hasShouldEnable();
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((ContinuousHeartRateMonitoringRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((ContinuousHeartRateMonitoringRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }

            public Builder setShouldEnable(boolean z8) {
                copyOnWrite();
                ((ContinuousHeartRateMonitoringRequest) this.instance).setShouldEnable(z8);
                return this;
            }
        }

        static {
            ContinuousHeartRateMonitoringRequest continuousHeartRateMonitoringRequest = new ContinuousHeartRateMonitoringRequest();
            DEFAULT_INSTANCE = continuousHeartRateMonitoringRequest;
            y.registerDefaultInstance(ContinuousHeartRateMonitoringRequest.class, continuousHeartRateMonitoringRequest);
        }

        private ContinuousHeartRateMonitoringRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        /* access modifiers changed from: private */
        public void clearShouldEnable() {
            this.bitField0_ &= -3;
            this.shouldEnable_ = false;
        }

        public static ContinuousHeartRateMonitoringRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ContinuousHeartRateMonitoringRequest continuousHeartRateMonitoringRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(continuousHeartRateMonitoringRequest);
        }

        public static ContinuousHeartRateMonitoringRequest parseDelimitedFrom(InputStream inputStream) {
            return (ContinuousHeartRateMonitoringRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinuousHeartRateMonitoringRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(i iVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(i iVar, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(j jVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(j jVar, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(InputStream inputStream) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(InputStream inputStream, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(ByteBuffer byteBuffer) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(byte[] bArr) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContinuousHeartRateMonitoringRequest parseFrom(byte[] bArr, q qVar) {
            return (ContinuousHeartRateMonitoringRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<ContinuousHeartRateMonitoringRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setShouldEnable(boolean z8) {
            this.bitField0_ |= 2;
            this.shouldEnable_ = z8;
        }

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "packageName_", "shouldEnable_"});
                case 3:
                    return new ContinuousHeartRateMonitoringRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<ContinuousHeartRateMonitoringRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (ContinuousHeartRateMonitoringRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean getShouldEnable() {
            return this.shouldEnable_;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasShouldEnable() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface ContinuousHeartRateMonitoringRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean getShouldEnable();

        boolean hasPackageName();

        boolean hasShouldEnable();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FlushRequest extends y<FlushRequest, Builder> implements FlushRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final FlushRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<FlushRequest> PARSER;
        private int bitField0_;
        private String packageName_ = "";

        public static final class Builder extends y.a<FlushRequest, Builder> implements FlushRequestOrBuilder {
            private Builder() {
                super(FlushRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((FlushRequest) this.instance).clearPackageName();
                return this;
            }

            public String getPackageName() {
                return ((FlushRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((FlushRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasPackageName() {
                return ((FlushRequest) this.instance).hasPackageName();
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((FlushRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((FlushRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            FlushRequest flushRequest = new FlushRequest();
            DEFAULT_INSTANCE = flushRequest;
            y.registerDefaultInstance(FlushRequest.class, flushRequest);
        }

        private FlushRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static FlushRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FlushRequest flushRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(flushRequest);
        }

        public static FlushRequest parseDelimitedFrom(InputStream inputStream) {
            return (FlushRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FlushRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (FlushRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static FlushRequest parseFrom(i iVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static FlushRequest parseFrom(i iVar, q qVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static FlushRequest parseFrom(j jVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static FlushRequest parseFrom(j jVar, q qVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static FlushRequest parseFrom(InputStream inputStream) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FlushRequest parseFrom(InputStream inputStream, q qVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static FlushRequest parseFrom(ByteBuffer byteBuffer) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FlushRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static FlushRequest parseFrom(byte[] bArr) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FlushRequest parseFrom(byte[] bArr, q qVar) {
            return (FlushRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<FlushRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "packageName_"});
                case 3:
                    return new FlushRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<FlushRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (FlushRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface FlushRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HealthEventsRegistrationRequest extends y<HealthEventsRegistrationRequest, Builder> implements HealthEventsRegistrationRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final HealthEventsRegistrationRequest DEFAULT_INSTANCE;
        public static final int EVENT_TYPES_FIELD_NUMBER = 3;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<HealthEventsRegistrationRequest> PARSER = null;
        public static final int RECEIVER_CLASS_NAME_FIELD_NUMBER = 2;
        private static final a0.h.a<Integer, DataProto.HealthEvent.HealthEventType> eventTypes_converter_ = new a0.h.a<Integer, DataProto.HealthEvent.HealthEventType>() {
            public DataProto.HealthEvent.HealthEventType convert(Integer num) {
                DataProto.HealthEvent.HealthEventType forNumber = DataProto.HealthEvent.HealthEventType.forNumber(num.intValue());
                return forNumber == null ? DataProto.HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
            }
        };
        private int bitField0_;
        private a0.g eventTypes_ = y.emptyIntList();
        private String packageName_ = "";
        private String receiverClassName_ = "";

        public static final class Builder extends y.a<HealthEventsRegistrationRequest, Builder> implements HealthEventsRegistrationRequestOrBuilder {
            private Builder() {
                super(HealthEventsRegistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder addAllEventTypes(Iterable<? extends DataProto.HealthEvent.HealthEventType> iterable) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).addAllEventTypes(iterable);
                return this;
            }

            public Builder addEventTypes(DataProto.HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).addEventTypes(healthEventType);
                return this;
            }

            public Builder clearEventTypes() {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).clearEventTypes();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public Builder clearReceiverClassName() {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).clearReceiverClassName();
                return this;
            }

            public DataProto.HealthEvent.HealthEventType getEventTypes(int i8) {
                return ((HealthEventsRegistrationRequest) this.instance).getEventTypes(i8);
            }

            public int getEventTypesCount() {
                return ((HealthEventsRegistrationRequest) this.instance).getEventTypesCount();
            }

            public List<DataProto.HealthEvent.HealthEventType> getEventTypesList() {
                return ((HealthEventsRegistrationRequest) this.instance).getEventTypesList();
            }

            public String getPackageName() {
                return ((HealthEventsRegistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((HealthEventsRegistrationRequest) this.instance).getPackageNameBytes();
            }

            public String getReceiverClassName() {
                return ((HealthEventsRegistrationRequest) this.instance).getReceiverClassName();
            }

            public i getReceiverClassNameBytes() {
                return ((HealthEventsRegistrationRequest) this.instance).getReceiverClassNameBytes();
            }

            public boolean hasPackageName() {
                return ((HealthEventsRegistrationRequest) this.instance).hasPackageName();
            }

            public boolean hasReceiverClassName() {
                return ((HealthEventsRegistrationRequest) this.instance).hasReceiverClassName();
            }

            public Builder setEventTypes(int i8, DataProto.HealthEvent.HealthEventType healthEventType) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).setEventTypes(i8, healthEventType);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }

            public Builder setReceiverClassName(String str) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).setReceiverClassName(str);
                return this;
            }

            public Builder setReceiverClassNameBytes(i iVar) {
                copyOnWrite();
                ((HealthEventsRegistrationRequest) this.instance).setReceiverClassNameBytes(iVar);
                return this;
            }
        }

        static {
            HealthEventsRegistrationRequest healthEventsRegistrationRequest = new HealthEventsRegistrationRequest();
            DEFAULT_INSTANCE = healthEventsRegistrationRequest;
            y.registerDefaultInstance(HealthEventsRegistrationRequest.class, healthEventsRegistrationRequest);
        }

        private HealthEventsRegistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllEventTypes(Iterable<? extends DataProto.HealthEvent.HealthEventType> iterable) {
            ensureEventTypesIsMutable();
            for (DataProto.HealthEvent.HealthEventType number : iterable) {
                ((z) this.eventTypes_).j(number.getNumber());
            }
        }

        /* access modifiers changed from: private */
        public void addEventTypes(DataProto.HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureEventTypesIsMutable();
            ((z) this.eventTypes_).j(healthEventType.getNumber());
        }

        /* access modifiers changed from: private */
        public void clearEventTypes() {
            this.eventTypes_ = y.emptyIntList();
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

        private void ensureEventTypesIsMutable() {
            a0.g gVar = this.eventTypes_;
            if (!((c) gVar).f3599f) {
                this.eventTypes_ = y.mutableCopy(gVar);
            }
        }

        public static HealthEventsRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HealthEventsRegistrationRequest healthEventsRegistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(healthEventsRegistrationRequest);
        }

        public static HealthEventsRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (HealthEventsRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventsRegistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(i iVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(i iVar, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(j jVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(j jVar, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(InputStream inputStream) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventsRegistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HealthEventsRegistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HealthEventsRegistrationRequest parseFrom(byte[] bArr) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthEventsRegistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (HealthEventsRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HealthEventsRegistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEventTypes(int i8, DataProto.HealthEvent.HealthEventType healthEventType) {
            healthEventType.getClass();
            ensureEventTypesIsMutable();
            ((z) this.eventTypes_).m(i8, healthEventType.getNumber());
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
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001e", new Object[]{"bitField0_", "packageName_", "receiverClassName_", "eventTypes_", DataProto.HealthEvent.HealthEventType.internalGetVerifier()});
                case 3:
                    return new HealthEventsRegistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HealthEventsRegistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HealthEventsRegistrationRequest.class) {
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

        public DataProto.HealthEvent.HealthEventType getEventTypes(int i8) {
            DataProto.HealthEvent.HealthEventType forNumber = DataProto.HealthEvent.HealthEventType.forNumber(((z) this.eventTypes_).l(i8));
            return forNumber == null ? DataProto.HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
        }

        public int getEventTypesCount() {
            return ((z) this.eventTypes_).f3832h;
        }

        public List<DataProto.HealthEvent.HealthEventType> getEventTypesList() {
            return new a0.h(this.eventTypes_, eventTypes_converter_);
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

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReceiverClassName() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface HealthEventsRegistrationRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        DataProto.HealthEvent.HealthEventType getEventTypes(int i8);

        int getEventTypesCount();

        List<DataProto.HealthEvent.HealthEventType> getEventTypesList();

        String getPackageName();

        i getPackageNameBytes();

        String getReceiverClassName();

        i getReceiverClassNameBytes();

        boolean hasPackageName();

        boolean hasReceiverClassName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HealthEventsUnregistrationRequest extends y<HealthEventsUnregistrationRequest, Builder> implements HealthEventsUnregistrationRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final HealthEventsUnregistrationRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<HealthEventsUnregistrationRequest> PARSER;
        private int bitField0_;
        private String packageName_ = "";

        public static final class Builder extends y.a<HealthEventsUnregistrationRequest, Builder> implements HealthEventsUnregistrationRequestOrBuilder {
            private Builder() {
                super(HealthEventsUnregistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((HealthEventsUnregistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public String getPackageName() {
                return ((HealthEventsUnregistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((HealthEventsUnregistrationRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasPackageName() {
                return ((HealthEventsUnregistrationRequest) this.instance).hasPackageName();
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((HealthEventsUnregistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((HealthEventsUnregistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            HealthEventsUnregistrationRequest healthEventsUnregistrationRequest = new HealthEventsUnregistrationRequest();
            DEFAULT_INSTANCE = healthEventsUnregistrationRequest;
            y.registerDefaultInstance(HealthEventsUnregistrationRequest.class, healthEventsUnregistrationRequest);
        }

        private HealthEventsUnregistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static HealthEventsUnregistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HealthEventsUnregistrationRequest healthEventsUnregistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(healthEventsUnregistrationRequest);
        }

        public static HealthEventsUnregistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (HealthEventsUnregistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventsUnregistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(i iVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(i iVar, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(j jVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(j jVar, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(InputStream inputStream) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HealthEventsUnregistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HealthEventsUnregistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HealthEventsUnregistrationRequest parseFrom(byte[] bArr) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HealthEventsUnregistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (HealthEventsUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HealthEventsUnregistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "packageName_"});
                case 3:
                    return new HealthEventsUnregistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HealthEventsUnregistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HealthEventsUnregistrationRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HealthEventsUnregistrationRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class HeartRateAlertParamsRequest extends y<HeartRateAlertParamsRequest, Builder> implements HeartRateAlertParamsRequestOrBuilder {
        public static final int ALERT_TYPE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final HeartRateAlertParamsRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<HeartRateAlertParamsRequest> PARSER;
        private int alertType_;
        private int bitField0_;
        private String packageName_ = "";

        public static final class Builder extends y.a<HeartRateAlertParamsRequest, Builder> implements HeartRateAlertParamsRequestOrBuilder {
            private Builder() {
                super(HeartRateAlertParamsRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearAlertType() {
                copyOnWrite();
                ((HeartRateAlertParamsRequest) this.instance).clearAlertType();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((HeartRateAlertParamsRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.HeartRateAlertParams.HeartRateAlertType getAlertType() {
                return ((HeartRateAlertParamsRequest) this.instance).getAlertType();
            }

            public String getPackageName() {
                return ((HeartRateAlertParamsRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((HeartRateAlertParamsRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasAlertType() {
                return ((HeartRateAlertParamsRequest) this.instance).hasAlertType();
            }

            public boolean hasPackageName() {
                return ((HeartRateAlertParamsRequest) this.instance).hasPackageName();
            }

            public Builder setAlertType(DataProto.HeartRateAlertParams.HeartRateAlertType heartRateAlertType) {
                copyOnWrite();
                ((HeartRateAlertParamsRequest) this.instance).setAlertType(heartRateAlertType);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((HeartRateAlertParamsRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((HeartRateAlertParamsRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            HeartRateAlertParamsRequest heartRateAlertParamsRequest = new HeartRateAlertParamsRequest();
            DEFAULT_INSTANCE = heartRateAlertParamsRequest;
            y.registerDefaultInstance(HeartRateAlertParamsRequest.class, heartRateAlertParamsRequest);
        }

        private HeartRateAlertParamsRequest() {
        }

        /* access modifiers changed from: private */
        public void clearAlertType() {
            this.bitField0_ &= -3;
            this.alertType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static HeartRateAlertParamsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeartRateAlertParamsRequest heartRateAlertParamsRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(heartRateAlertParamsRequest);
        }

        public static HeartRateAlertParamsRequest parseDelimitedFrom(InputStream inputStream) {
            return (HeartRateAlertParamsRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParamsRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(i iVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(i iVar, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(j jVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(j jVar, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(InputStream inputStream) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartRateAlertParamsRequest parseFrom(InputStream inputStream, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(ByteBuffer byteBuffer) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static HeartRateAlertParamsRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static HeartRateAlertParamsRequest parseFrom(byte[] bArr) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartRateAlertParamsRequest parseFrom(byte[] bArr, q qVar) {
            return (HeartRateAlertParamsRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<HeartRateAlertParamsRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAlertType(DataProto.HeartRateAlertParams.HeartRateAlertType heartRateAlertType) {
            this.alertType_ = heartRateAlertType.getNumber();
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "packageName_", "alertType_", DataProto.HeartRateAlertParams.HeartRateAlertType.internalGetVerifier()});
                case 3:
                    return new HeartRateAlertParamsRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<HeartRateAlertParamsRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (HeartRateAlertParamsRequest.class) {
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

        public DataProto.HeartRateAlertParams.HeartRateAlertType getAlertType() {
            DataProto.HeartRateAlertParams.HeartRateAlertType forNumber = DataProto.HeartRateAlertParams.HeartRateAlertType.forNumber(this.alertType_);
            return forNumber == null ? DataProto.HeartRateAlertParams.HeartRateAlertType.HEART_RATE_ALERT_TYPE_UNKNOWN : forNumber;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasAlertType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface HeartRateAlertParamsRequestOrBuilder extends s0 {
        DataProto.HeartRateAlertParams.HeartRateAlertType getAlertType();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasAlertType();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MeasureRegistrationRequest extends y<MeasureRegistrationRequest, Builder> implements MeasureRegistrationRequestOrBuilder {
        public static final int DATA_TYPE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final MeasureRegistrationRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<MeasureRegistrationRequest> PARSER;
        private int bitField0_;
        private DataProto.DataType dataType_;
        private String packageName_ = "";

        public static final class Builder extends y.a<MeasureRegistrationRequest, Builder> implements MeasureRegistrationRequestOrBuilder {
            private Builder() {
                super(MeasureRegistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).clearDataType();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.DataType getDataType() {
                return ((MeasureRegistrationRequest) this.instance).getDataType();
            }

            public String getPackageName() {
                return ((MeasureRegistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((MeasureRegistrationRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasDataType() {
                return ((MeasureRegistrationRequest) this.instance).hasDataType();
            }

            public boolean hasPackageName() {
                return ((MeasureRegistrationRequest) this.instance).hasPackageName();
            }

            public Builder mergeDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).mergeDataType(dataType);
                return this;
            }

            public Builder setDataType(DataProto.DataType.Builder builder) {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).setDataType((DataProto.DataType) builder.build());
                return this;
            }

            public Builder setDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).setDataType(dataType);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((MeasureRegistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            MeasureRegistrationRequest measureRegistrationRequest = new MeasureRegistrationRequest();
            DEFAULT_INSTANCE = measureRegistrationRequest;
            y.registerDefaultInstance(MeasureRegistrationRequest.class, measureRegistrationRequest);
        }

        private MeasureRegistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static MeasureRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDataType(DataProto.DataType dataType) {
            dataType.getClass();
            DataProto.DataType dataType2 = this.dataType_;
            if (!(dataType2 == null || dataType2 == DataProto.DataType.getDefaultInstance())) {
                dataType = (DataProto.DataType) ((DataProto.DataType.Builder) DataProto.DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
            }
            this.dataType_ = dataType;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MeasureRegistrationRequest measureRegistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(measureRegistrationRequest);
        }

        public static MeasureRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (MeasureRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureRegistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MeasureRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureRegistrationRequest parseFrom(i iVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MeasureRegistrationRequest parseFrom(i iVar, q qVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MeasureRegistrationRequest parseFrom(j jVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MeasureRegistrationRequest parseFrom(j jVar, q qVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MeasureRegistrationRequest parseFrom(InputStream inputStream) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureRegistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MeasureRegistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MeasureRegistrationRequest parseFrom(byte[] bArr) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MeasureRegistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (MeasureRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MeasureRegistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDataType(DataProto.DataType dataType) {
            dataType.getClass();
            this.dataType_ = dataType;
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "packageName_", "dataType_"});
                case 3:
                    return new MeasureRegistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MeasureRegistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MeasureRegistrationRequest.class) {
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

        public DataProto.DataType getDataType() {
            DataProto.DataType dataType = this.dataType_;
            return dataType == null ? DataProto.DataType.getDefaultInstance() : dataType;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface MeasureRegistrationRequestOrBuilder extends s0 {
        DataProto.DataType getDataType();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasDataType();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MeasureUnregistrationRequest extends y<MeasureUnregistrationRequest, Builder> implements MeasureUnregistrationRequestOrBuilder {
        public static final int DATA_TYPE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final MeasureUnregistrationRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<MeasureUnregistrationRequest> PARSER;
        private int bitField0_;
        private DataProto.DataType dataType_;
        private String packageName_ = "";

        public static final class Builder extends y.a<MeasureUnregistrationRequest, Builder> implements MeasureUnregistrationRequestOrBuilder {
            private Builder() {
                super(MeasureUnregistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).clearDataType();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.DataType getDataType() {
                return ((MeasureUnregistrationRequest) this.instance).getDataType();
            }

            public String getPackageName() {
                return ((MeasureUnregistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((MeasureUnregistrationRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasDataType() {
                return ((MeasureUnregistrationRequest) this.instance).hasDataType();
            }

            public boolean hasPackageName() {
                return ((MeasureUnregistrationRequest) this.instance).hasPackageName();
            }

            public Builder mergeDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).mergeDataType(dataType);
                return this;
            }

            public Builder setDataType(DataProto.DataType.Builder builder) {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).setDataType((DataProto.DataType) builder.build());
                return this;
            }

            public Builder setDataType(DataProto.DataType dataType) {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).setDataType(dataType);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((MeasureUnregistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            MeasureUnregistrationRequest measureUnregistrationRequest = new MeasureUnregistrationRequest();
            DEFAULT_INSTANCE = measureUnregistrationRequest;
            y.registerDefaultInstance(MeasureUnregistrationRequest.class, measureUnregistrationRequest);
        }

        private MeasureUnregistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static MeasureUnregistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDataType(DataProto.DataType dataType) {
            dataType.getClass();
            DataProto.DataType dataType2 = this.dataType_;
            if (!(dataType2 == null || dataType2 == DataProto.DataType.getDefaultInstance())) {
                dataType = (DataProto.DataType) ((DataProto.DataType.Builder) DataProto.DataType.newBuilder(this.dataType_).mergeFrom(dataType)).buildPartial();
            }
            this.dataType_ = dataType;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MeasureUnregistrationRequest measureUnregistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(measureUnregistrationRequest);
        }

        public static MeasureUnregistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (MeasureUnregistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureUnregistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (MeasureUnregistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureUnregistrationRequest parseFrom(i iVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static MeasureUnregistrationRequest parseFrom(i iVar, q qVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static MeasureUnregistrationRequest parseFrom(j jVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static MeasureUnregistrationRequest parseFrom(j jVar, q qVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static MeasureUnregistrationRequest parseFrom(InputStream inputStream) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MeasureUnregistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static MeasureUnregistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MeasureUnregistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static MeasureUnregistrationRequest parseFrom(byte[] bArr) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MeasureUnregistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (MeasureUnregistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<MeasureUnregistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDataType(DataProto.DataType dataType) {
            dataType.getClass();
            this.dataType_ = dataType;
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "packageName_", "dataType_"});
                case 3:
                    return new MeasureUnregistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<MeasureUnregistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (MeasureUnregistrationRequest.class) {
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

        public DataProto.DataType getDataType() {
            DataProto.DataType dataType = this.dataType_;
            return dataType == null ? DataProto.DataType.getDefaultInstance() : dataType;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface MeasureUnregistrationRequestOrBuilder extends s0 {
        DataProto.DataType getDataType();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasDataType();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveGoalRequest extends y<PassiveGoalRequest, Builder> implements PassiveGoalRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final PassiveGoalRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<PassiveGoalRequest> PARSER = null;
        public static final int PASSIVE_GOAL_FIELD_NUMBER = 3;
        public static final int RECEIVER_CLASS_NAME_FIELD_NUMBER = 2;
        private int bitField0_;
        private String packageName_ = "";
        private DataProto.PassiveGoal passiveGoal_;
        private String receiverClassName_ = "";

        public static final class Builder extends y.a<PassiveGoalRequest, Builder> implements PassiveGoalRequestOrBuilder {
            private Builder() {
                super(PassiveGoalRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).clearPackageName();
                return this;
            }

            public Builder clearPassiveGoal() {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).clearPassiveGoal();
                return this;
            }

            public Builder clearReceiverClassName() {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).clearReceiverClassName();
                return this;
            }

            public String getPackageName() {
                return ((PassiveGoalRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((PassiveGoalRequest) this.instance).getPackageNameBytes();
            }

            public DataProto.PassiveGoal getPassiveGoal() {
                return ((PassiveGoalRequest) this.instance).getPassiveGoal();
            }

            public String getReceiverClassName() {
                return ((PassiveGoalRequest) this.instance).getReceiverClassName();
            }

            public i getReceiverClassNameBytes() {
                return ((PassiveGoalRequest) this.instance).getReceiverClassNameBytes();
            }

            public boolean hasPackageName() {
                return ((PassiveGoalRequest) this.instance).hasPackageName();
            }

            public boolean hasPassiveGoal() {
                return ((PassiveGoalRequest) this.instance).hasPassiveGoal();
            }

            public boolean hasReceiverClassName() {
                return ((PassiveGoalRequest) this.instance).hasReceiverClassName();
            }

            public Builder mergePassiveGoal(DataProto.PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).mergePassiveGoal(passiveGoal);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }

            public Builder setPassiveGoal(DataProto.PassiveGoal.Builder builder) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setPassiveGoal((DataProto.PassiveGoal) builder.build());
                return this;
            }

            public Builder setPassiveGoal(DataProto.PassiveGoal passiveGoal) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setPassiveGoal(passiveGoal);
                return this;
            }

            public Builder setReceiverClassName(String str) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setReceiverClassName(str);
                return this;
            }

            public Builder setReceiverClassNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveGoalRequest) this.instance).setReceiverClassNameBytes(iVar);
                return this;
            }
        }

        static {
            PassiveGoalRequest passiveGoalRequest = new PassiveGoalRequest();
            DEFAULT_INSTANCE = passiveGoalRequest;
            y.registerDefaultInstance(PassiveGoalRequest.class, passiveGoalRequest);
        }

        private PassiveGoalRequest() {
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        /* access modifiers changed from: private */
        public void clearPassiveGoal() {
            this.passiveGoal_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearReceiverClassName() {
            this.bitField0_ &= -3;
            this.receiverClassName_ = getDefaultInstance().getReceiverClassName();
        }

        public static PassiveGoalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePassiveGoal(DataProto.PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            DataProto.PassiveGoal passiveGoal2 = this.passiveGoal_;
            if (!(passiveGoal2 == null || passiveGoal2 == DataProto.PassiveGoal.getDefaultInstance())) {
                passiveGoal = (DataProto.PassiveGoal) ((DataProto.PassiveGoal.Builder) DataProto.PassiveGoal.newBuilder(this.passiveGoal_).mergeFrom(passiveGoal)).buildPartial();
            }
            this.passiveGoal_ = passiveGoal;
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveGoalRequest passiveGoalRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveGoalRequest);
        }

        public static PassiveGoalRequest parseDelimitedFrom(InputStream inputStream) {
            return (PassiveGoalRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveGoalRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveGoalRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveGoalRequest parseFrom(i iVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveGoalRequest parseFrom(i iVar, q qVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveGoalRequest parseFrom(j jVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveGoalRequest parseFrom(j jVar, q qVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveGoalRequest parseFrom(InputStream inputStream) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveGoalRequest parseFrom(InputStream inputStream, q qVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveGoalRequest parseFrom(ByteBuffer byteBuffer) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveGoalRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveGoalRequest parseFrom(byte[] bArr) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveGoalRequest parseFrom(byte[] bArr, q qVar) {
            return (PassiveGoalRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveGoalRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setPassiveGoal(DataProto.PassiveGoal passiveGoal) {
            passiveGoal.getClass();
            this.passiveGoal_ = passiveGoal;
            this.bitField0_ |= 4;
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
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "packageName_", "receiverClassName_", "passiveGoal_"});
                case 3:
                    return new PassiveGoalRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveGoalRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveGoalRequest.class) {
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

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public DataProto.PassiveGoal getPassiveGoal() {
            DataProto.PassiveGoal passiveGoal = this.passiveGoal_;
            return passiveGoal == null ? DataProto.PassiveGoal.getDefaultInstance() : passiveGoal;
        }

        public String getReceiverClassName() {
            return this.receiverClassName_;
        }

        public i getReceiverClassNameBytes() {
            return i.l(this.receiverClassName_);
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPassiveGoal() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasReceiverClassName() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    public interface PassiveGoalRequestOrBuilder extends s0 {
        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        DataProto.PassiveGoal getPassiveGoal();

        String getReceiverClassName();

        i getReceiverClassNameBytes();

        boolean hasPackageName();

        boolean hasPassiveGoal();

        boolean hasReceiverClassName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveListenerCallbackRegistrationRequest extends y<PassiveListenerCallbackRegistrationRequest, Builder> implements PassiveListenerCallbackRegistrationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final PassiveListenerCallbackRegistrationRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<PassiveListenerCallbackRegistrationRequest> PARSER;
        private int bitField0_;
        private DataProto.PassiveListenerConfig config_;
        private String packageName_ = "";

        public static final class Builder extends y.a<PassiveListenerCallbackRegistrationRequest, Builder> implements PassiveListenerCallbackRegistrationRequestOrBuilder {
            private Builder() {
                super(PassiveListenerCallbackRegistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).clearConfig();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.PassiveListenerConfig getConfig() {
                return ((PassiveListenerCallbackRegistrationRequest) this.instance).getConfig();
            }

            public String getPackageName() {
                return ((PassiveListenerCallbackRegistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((PassiveListenerCallbackRegistrationRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasConfig() {
                return ((PassiveListenerCallbackRegistrationRequest) this.instance).hasConfig();
            }

            public boolean hasPackageName() {
                return ((PassiveListenerCallbackRegistrationRequest) this.instance).hasPackageName();
            }

            public Builder mergeConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).mergeConfig(passiveListenerConfig);
                return this;
            }

            public Builder setConfig(DataProto.PassiveListenerConfig.Builder builder) {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).setConfig((DataProto.PassiveListenerConfig) builder.build());
                return this;
            }

            public Builder setConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).setConfig(passiveListenerConfig);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveListenerCallbackRegistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            PassiveListenerCallbackRegistrationRequest passiveListenerCallbackRegistrationRequest = new PassiveListenerCallbackRegistrationRequest();
            DEFAULT_INSTANCE = passiveListenerCallbackRegistrationRequest;
            y.registerDefaultInstance(PassiveListenerCallbackRegistrationRequest.class, passiveListenerCallbackRegistrationRequest);
        }

        private PassiveListenerCallbackRegistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static PassiveListenerCallbackRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
            passiveListenerConfig.getClass();
            DataProto.PassiveListenerConfig passiveListenerConfig2 = this.config_;
            if (!(passiveListenerConfig2 == null || passiveListenerConfig2 == DataProto.PassiveListenerConfig.getDefaultInstance())) {
                passiveListenerConfig = (DataProto.PassiveListenerConfig) ((DataProto.PassiveListenerConfig.Builder) DataProto.PassiveListenerConfig.newBuilder(this.config_).mergeFrom(passiveListenerConfig)).buildPartial();
            }
            this.config_ = passiveListenerConfig;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveListenerCallbackRegistrationRequest passiveListenerCallbackRegistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveListenerCallbackRegistrationRequest);
        }

        public static PassiveListenerCallbackRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerCallbackRegistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(i iVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(i iVar, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(j jVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(j jVar, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(InputStream inputStream) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(byte[] bArr) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveListenerCallbackRegistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (PassiveListenerCallbackRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveListenerCallbackRegistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
            passiveListenerConfig.getClass();
            this.config_ = passiveListenerConfig;
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "packageName_", "config_"});
                case 3:
                    return new PassiveListenerCallbackRegistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveListenerCallbackRegistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveListenerCallbackRegistrationRequest.class) {
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

        public DataProto.PassiveListenerConfig getConfig() {
            DataProto.PassiveListenerConfig passiveListenerConfig = this.config_;
            return passiveListenerConfig == null ? DataProto.PassiveListenerConfig.getDefaultInstance() : passiveListenerConfig;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveListenerCallbackRegistrationRequestOrBuilder extends s0 {
        DataProto.PassiveListenerConfig getConfig();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasConfig();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PassiveListenerServiceRegistrationRequest extends y<PassiveListenerServiceRegistrationRequest, Builder> implements PassiveListenerServiceRegistrationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final PassiveListenerServiceRegistrationRequest DEFAULT_INSTANCE;
        public static final int LISTENER_SERVICE_CLASS_FIELD_NUMBER = 2;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<PassiveListenerServiceRegistrationRequest> PARSER;
        private int bitField0_;
        private DataProto.PassiveListenerConfig config_;
        private String listenerServiceClass_ = "";
        private String packageName_ = "";

        public static final class Builder extends y.a<PassiveListenerServiceRegistrationRequest, Builder> implements PassiveListenerServiceRegistrationRequestOrBuilder {
            private Builder() {
                super(PassiveListenerServiceRegistrationRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).clearConfig();
                return this;
            }

            public Builder clearListenerServiceClass() {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).clearListenerServiceClass();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.PassiveListenerConfig getConfig() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).getConfig();
            }

            public String getListenerServiceClass() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).getListenerServiceClass();
            }

            public i getListenerServiceClassBytes() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).getListenerServiceClassBytes();
            }

            public String getPackageName() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasConfig() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).hasConfig();
            }

            public boolean hasListenerServiceClass() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).hasListenerServiceClass();
            }

            public boolean hasPackageName() {
                return ((PassiveListenerServiceRegistrationRequest) this.instance).hasPackageName();
            }

            public Builder mergeConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).mergeConfig(passiveListenerConfig);
                return this;
            }

            public Builder setConfig(DataProto.PassiveListenerConfig.Builder builder) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setConfig((DataProto.PassiveListenerConfig) builder.build());
                return this;
            }

            public Builder setConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setConfig(passiveListenerConfig);
                return this;
            }

            public Builder setListenerServiceClass(String str) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setListenerServiceClass(str);
                return this;
            }

            public Builder setListenerServiceClassBytes(i iVar) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setListenerServiceClassBytes(iVar);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((PassiveListenerServiceRegistrationRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest = new PassiveListenerServiceRegistrationRequest();
            DEFAULT_INSTANCE = passiveListenerServiceRegistrationRequest;
            y.registerDefaultInstance(PassiveListenerServiceRegistrationRequest.class, passiveListenerServiceRegistrationRequest);
        }

        private PassiveListenerServiceRegistrationRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearListenerServiceClass() {
            this.bitField0_ &= -3;
            this.listenerServiceClass_ = getDefaultInstance().getListenerServiceClass();
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static PassiveListenerServiceRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
            passiveListenerConfig.getClass();
            DataProto.PassiveListenerConfig passiveListenerConfig2 = this.config_;
            if (!(passiveListenerConfig2 == null || passiveListenerConfig2 == DataProto.PassiveListenerConfig.getDefaultInstance())) {
                passiveListenerConfig = (DataProto.PassiveListenerConfig) ((DataProto.PassiveListenerConfig.Builder) DataProto.PassiveListenerConfig.newBuilder(this.config_).mergeFrom(passiveListenerConfig)).buildPartial();
            }
            this.config_ = passiveListenerConfig;
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(passiveListenerServiceRegistrationRequest);
        }

        public static PassiveListenerServiceRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (PassiveListenerServiceRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerServiceRegistrationRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(i iVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(i iVar, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(j jVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(j jVar, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(InputStream inputStream) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(InputStream inputStream, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(byte[] bArr) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PassiveListenerServiceRegistrationRequest parseFrom(byte[] bArr, q qVar) {
            return (PassiveListenerServiceRegistrationRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PassiveListenerServiceRegistrationRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfig(DataProto.PassiveListenerConfig passiveListenerConfig) {
            passiveListenerConfig.getClass();
            this.config_ = passiveListenerConfig;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setListenerServiceClass(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.listenerServiceClass_ = str;
        }

        /* access modifiers changed from: private */
        public void setListenerServiceClassBytes(i iVar) {
            this.listenerServiceClass_ = iVar.u();
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "packageName_", "listenerServiceClass_", "config_"});
                case 3:
                    return new PassiveListenerServiceRegistrationRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PassiveListenerServiceRegistrationRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PassiveListenerServiceRegistrationRequest.class) {
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

        public DataProto.PassiveListenerConfig getConfig() {
            DataProto.PassiveListenerConfig passiveListenerConfig = this.config_;
            return passiveListenerConfig == null ? DataProto.PassiveListenerConfig.getDefaultInstance() : passiveListenerConfig;
        }

        public String getListenerServiceClass() {
            return this.listenerServiceClass_;
        }

        public i getListenerServiceClassBytes() {
            return i.l(this.listenerServiceClass_);
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasListenerServiceClass() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PassiveListenerServiceRegistrationRequestOrBuilder extends s0 {
        DataProto.PassiveListenerConfig getConfig();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getListenerServiceClass();

        i getListenerServiceClassBytes();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasConfig();

        boolean hasListenerServiceClass();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PrepareExerciseRequest extends y<PrepareExerciseRequest, Builder> implements PrepareExerciseRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final PrepareExerciseRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<PrepareExerciseRequest> PARSER;
        private int bitField0_;
        private DataProto.WarmUpConfig config_;
        private String packageName_ = "";

        public static final class Builder extends y.a<PrepareExerciseRequest, Builder> implements PrepareExerciseRequestOrBuilder {
            private Builder() {
                super(PrepareExerciseRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).clearConfig();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.WarmUpConfig getConfig() {
                return ((PrepareExerciseRequest) this.instance).getConfig();
            }

            public String getPackageName() {
                return ((PrepareExerciseRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((PrepareExerciseRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasConfig() {
                return ((PrepareExerciseRequest) this.instance).hasConfig();
            }

            public boolean hasPackageName() {
                return ((PrepareExerciseRequest) this.instance).hasPackageName();
            }

            public Builder mergeConfig(DataProto.WarmUpConfig warmUpConfig) {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).mergeConfig(warmUpConfig);
                return this;
            }

            public Builder setConfig(DataProto.WarmUpConfig.Builder builder) {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).setConfig((DataProto.WarmUpConfig) builder.build());
                return this;
            }

            public Builder setConfig(DataProto.WarmUpConfig warmUpConfig) {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).setConfig(warmUpConfig);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((PrepareExerciseRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            PrepareExerciseRequest prepareExerciseRequest = new PrepareExerciseRequest();
            DEFAULT_INSTANCE = prepareExerciseRequest;
            y.registerDefaultInstance(PrepareExerciseRequest.class, prepareExerciseRequest);
        }

        private PrepareExerciseRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static PrepareExerciseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(DataProto.WarmUpConfig warmUpConfig) {
            warmUpConfig.getClass();
            DataProto.WarmUpConfig warmUpConfig2 = this.config_;
            if (!(warmUpConfig2 == null || warmUpConfig2 == DataProto.WarmUpConfig.getDefaultInstance())) {
                warmUpConfig = (DataProto.WarmUpConfig) ((DataProto.WarmUpConfig.Builder) DataProto.WarmUpConfig.newBuilder(this.config_).mergeFrom(warmUpConfig)).buildPartial();
            }
            this.config_ = warmUpConfig;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PrepareExerciseRequest prepareExerciseRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prepareExerciseRequest);
        }

        public static PrepareExerciseRequest parseDelimitedFrom(InputStream inputStream) {
            return (PrepareExerciseRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrepareExerciseRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (PrepareExerciseRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PrepareExerciseRequest parseFrom(i iVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static PrepareExerciseRequest parseFrom(i iVar, q qVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static PrepareExerciseRequest parseFrom(j jVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static PrepareExerciseRequest parseFrom(j jVar, q qVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static PrepareExerciseRequest parseFrom(InputStream inputStream) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrepareExerciseRequest parseFrom(InputStream inputStream, q qVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static PrepareExerciseRequest parseFrom(ByteBuffer byteBuffer) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PrepareExerciseRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static PrepareExerciseRequest parseFrom(byte[] bArr) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrepareExerciseRequest parseFrom(byte[] bArr, q qVar) {
            return (PrepareExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<PrepareExerciseRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfig(DataProto.WarmUpConfig warmUpConfig) {
            warmUpConfig.getClass();
            this.config_ = warmUpConfig;
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "packageName_", "config_"});
                case 3:
                    return new PrepareExerciseRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<PrepareExerciseRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (PrepareExerciseRequest.class) {
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

        public DataProto.WarmUpConfig getConfig() {
            DataProto.WarmUpConfig warmUpConfig = this.config_;
            return warmUpConfig == null ? DataProto.WarmUpConfig.getDefaultInstance() : warmUpConfig;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface PrepareExerciseRequestOrBuilder extends s0 {
        DataProto.WarmUpConfig getConfig();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasConfig();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StartExerciseRequest extends y<StartExerciseRequest, Builder> implements StartExerciseRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final StartExerciseRequest DEFAULT_INSTANCE;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static volatile z0<StartExerciseRequest> PARSER;
        private int bitField0_;
        private DataProto.ExerciseConfig config_;
        private String packageName_ = "";

        public static final class Builder extends y.a<StartExerciseRequest, Builder> implements StartExerciseRequestOrBuilder {
            private Builder() {
                super(StartExerciseRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 r12) {
                this();
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).clearConfig();
                return this;
            }

            public Builder clearPackageName() {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).clearPackageName();
                return this;
            }

            public DataProto.ExerciseConfig getConfig() {
                return ((StartExerciseRequest) this.instance).getConfig();
            }

            public String getPackageName() {
                return ((StartExerciseRequest) this.instance).getPackageName();
            }

            public i getPackageNameBytes() {
                return ((StartExerciseRequest) this.instance).getPackageNameBytes();
            }

            public boolean hasConfig() {
                return ((StartExerciseRequest) this.instance).hasConfig();
            }

            public boolean hasPackageName() {
                return ((StartExerciseRequest) this.instance).hasPackageName();
            }

            public Builder mergeConfig(DataProto.ExerciseConfig exerciseConfig) {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).mergeConfig(exerciseConfig);
                return this;
            }

            public Builder setConfig(DataProto.ExerciseConfig.Builder builder) {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).setConfig((DataProto.ExerciseConfig) builder.build());
                return this;
            }

            public Builder setConfig(DataProto.ExerciseConfig exerciseConfig) {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).setConfig(exerciseConfig);
                return this;
            }

            public Builder setPackageName(String str) {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).setPackageName(str);
                return this;
            }

            public Builder setPackageNameBytes(i iVar) {
                copyOnWrite();
                ((StartExerciseRequest) this.instance).setPackageNameBytes(iVar);
                return this;
            }
        }

        static {
            StartExerciseRequest startExerciseRequest = new StartExerciseRequest();
            DEFAULT_INSTANCE = startExerciseRequest;
            y.registerDefaultInstance(StartExerciseRequest.class, startExerciseRequest);
        }

        private StartExerciseRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPackageName() {
            this.bitField0_ &= -2;
            this.packageName_ = getDefaultInstance().getPackageName();
        }

        public static StartExerciseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(DataProto.ExerciseConfig exerciseConfig) {
            exerciseConfig.getClass();
            DataProto.ExerciseConfig exerciseConfig2 = this.config_;
            if (!(exerciseConfig2 == null || exerciseConfig2 == DataProto.ExerciseConfig.getDefaultInstance())) {
                exerciseConfig = (DataProto.ExerciseConfig) ((DataProto.ExerciseConfig.Builder) DataProto.ExerciseConfig.newBuilder(this.config_).mergeFrom(exerciseConfig)).buildPartial();
            }
            this.config_ = exerciseConfig;
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StartExerciseRequest startExerciseRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(startExerciseRequest);
        }

        public static StartExerciseRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartExerciseRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartExerciseRequest parseDelimitedFrom(InputStream inputStream, q qVar) {
            return (StartExerciseRequest) y.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static StartExerciseRequest parseFrom(i iVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, iVar);
        }

        public static StartExerciseRequest parseFrom(i iVar, q qVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
        }

        public static StartExerciseRequest parseFrom(j jVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static StartExerciseRequest parseFrom(j jVar, q qVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
        }

        public static StartExerciseRequest parseFrom(InputStream inputStream) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartExerciseRequest parseFrom(InputStream inputStream, q qVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
        }

        public static StartExerciseRequest parseFrom(ByteBuffer byteBuffer) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StartExerciseRequest parseFrom(ByteBuffer byteBuffer, q qVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
        }

        public static StartExerciseRequest parseFrom(byte[] bArr) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartExerciseRequest parseFrom(byte[] bArr, q qVar) {
            return (StartExerciseRequest) y.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
        }

        public static z0<StartExerciseRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfig(DataProto.ExerciseConfig exerciseConfig) {
            exerciseConfig.getClass();
            this.config_ = exerciseConfig;
            this.bitField0_ |= 2;
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

        public final Object dynamicMethod(y.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return y.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "packageName_", "config_"});
                case 3:
                    return new StartExerciseRequest();
                case 4:
                    return new Builder((AnonymousClass1) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    z0<StartExerciseRequest> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (StartExerciseRequest.class) {
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

        public DataProto.ExerciseConfig getConfig() {
            DataProto.ExerciseConfig exerciseConfig = this.config_;
            return exerciseConfig == null ? DataProto.ExerciseConfig.getDefaultInstance() : exerciseConfig;
        }

        public String getPackageName() {
            return this.packageName_;
        }

        public i getPackageNameBytes() {
            return i.l(this.packageName_);
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPackageName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    public interface StartExerciseRequestOrBuilder extends s0 {
        DataProto.ExerciseConfig getConfig();

        /* synthetic */ r0 getDefaultInstanceForType();

        String getPackageName();

        i getPackageNameBytes();

        boolean hasConfig();

        boolean hasPackageName();

        /* synthetic */ boolean isInitialized();
    }

    private RequestsProto() {
    }

    public static void registerAllExtensions(q qVar) {
    }
}
