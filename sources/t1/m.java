package t1;

import android.os.IBinder;
import android.os.Parcel;
import androidx.wear.watchface.editor.data.EditorStateWireFormat;

public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f7444a;

    public m(IBinder iBinder) {
        this.f7444a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f7444a;
    }

    public final void k(EditorStateWireFormat editorStateWireFormat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.editor.IEditorObserver");
            obtain.writeInt(1);
            editorStateWireFormat.writeToParcel(obtain, 0);
            this.f7444a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
