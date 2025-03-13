package androidx.health.services.client.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.r0;
import java.util.Arrays;
import p7.l;
import q7.g;
import q7.k;

public abstract class ProtoParcelable<T extends r0> implements Parcelable {
    public static final Companion Companion = new Companion((g) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final <U extends ProtoParcelable<?>> Parcelable.Creator<U> newCreator(l<? super byte[], ? extends U> lVar) {
            k.e(lVar, "parser");
            k.g();
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.a(getClass(), obj.getClass())) {
            return false;
        }
        return Arrays.equals(getBytes(), ((ProtoParcelable) obj).getBytes());
    }

    public final byte[] getBytes() {
        byte[] byteArray = getProto().toByteArray();
        k.d(byteArray, "proto.toByteArray()");
        return byteArray;
    }

    public abstract T getProto();

    public int hashCode() {
        return Arrays.hashCode(getBytes());
    }

    public void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        parcel.writeByteArray(getBytes());
    }
}
