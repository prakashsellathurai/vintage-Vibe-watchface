package androidx.wear.watchface.complications.data;

import g1.a;

public final class DefaultComplicationDataSourcePolicyWireFormatParcelizer {
    public static DefaultComplicationDataSourcePolicyWireFormat read(a aVar) {
        DefaultComplicationDataSourcePolicyWireFormat defaultComplicationDataSourcePolicyWireFormat = new DefaultComplicationDataSourcePolicyWireFormat();
        defaultComplicationDataSourcePolicyWireFormat.mDefaultDataSourcesToTry = aVar.u(1, defaultComplicationDataSourcePolicyWireFormat.mDefaultDataSourcesToTry);
        defaultComplicationDataSourcePolicyWireFormat.mFallbackSystemDataSource = aVar.t(defaultComplicationDataSourcePolicyWireFormat.mFallbackSystemDataSource, 2);
        defaultComplicationDataSourcePolicyWireFormat.mDefaultType = aVar.t(defaultComplicationDataSourcePolicyWireFormat.mDefaultType, 3);
        defaultComplicationDataSourcePolicyWireFormat.mPrimaryDataSourceDefaultType = aVar.t(defaultComplicationDataSourcePolicyWireFormat.mPrimaryDataSourceDefaultType, 4);
        defaultComplicationDataSourcePolicyWireFormat.mSecondaryDataSourceDefaultType = aVar.t(defaultComplicationDataSourcePolicyWireFormat.mSecondaryDataSourceDefaultType, 5);
        return defaultComplicationDataSourcePolicyWireFormat;
    }

    public static void write(DefaultComplicationDataSourcePolicyWireFormat defaultComplicationDataSourcePolicyWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.V(1, defaultComplicationDataSourcePolicyWireFormat.mDefaultDataSourcesToTry);
        aVar.U(defaultComplicationDataSourcePolicyWireFormat.mFallbackSystemDataSource, 2);
        aVar.U(defaultComplicationDataSourcePolicyWireFormat.mDefaultType, 3);
        aVar.U(defaultComplicationDataSourcePolicyWireFormat.mPrimaryDataSourceDefaultType, 4);
        aVar.U(defaultComplicationDataSourcePolicyWireFormat.mSecondaryDataSourceDefaultType, 5);
    }
}
