package androidx.health.services.client.data;

import android.os.Parcel;
import android.os.Parcelable;
import p7.l;
import q7.k;

public final class ProtoParcelable$Companion$newCreator$1 implements Parcelable.Creator<U> {
    final /* synthetic */ l<byte[], U> $parser;

    public ProtoParcelable$Companion$newCreator$1(l<? super byte[], ? extends U> lVar) {
        this.$parser = lVar;
    }

    public U createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        return (ProtoParcelable) this.$parser.invoke(createByteArray);
    }

    public U[] newArray(int i8) {
        k.g();
        throw null;
    }
}
