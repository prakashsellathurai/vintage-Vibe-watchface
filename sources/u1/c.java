package u1;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import java.io.DataOutputStream;
import java.util.Locale;
import q7.k;

public abstract class c {

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f7607a;

        public a(String str) {
            this.f7607a = str;
        }

        public final CharSequence a() {
            return this.f7607a;
        }

        public final void b(DataOutputStream dataOutputStream) {
            dataOutputStream.writeUTF(this.f7607a.toString());
        }
    }

    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f7608a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7609b;

        public b(Resources resources, int i8) {
            k.e(resources, "resources");
            this.f7608a = resources;
            this.f7609b = i8;
        }

        /* renamed from: c */
        public String a() {
            String string = this.f7608a.getString(this.f7609b);
            k.d(string, "resources.getString(id)");
            return string;
        }
    }

    /* renamed from: u1.c$c  reason: collision with other inner class name */
    public static final class C0127c extends b {

        /* renamed from: c  reason: collision with root package name */
        public String f7610c = "";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0127c(Resources resources, int i8) {
            super(resources, i8);
            k.e(resources, "resources");
        }

        /* renamed from: c */
        public final String a() {
            String string = this.f7608a.getString(this.f7609b, new Object[]{this.f7610c});
            k.d(string, "resources.getString(id, indexString)");
            return string;
        }

        public final void d(int i8) {
            String format = new MessageFormat("{0,ordinal}", Locale.getDefault()).format(new Integer[]{Integer.valueOf(i8)});
            k.d(format, "MessageFormat(\"{0,ordina…)).format(arrayOf(index))");
            this.f7610c = format;
        }
    }

    public abstract CharSequence a();

    public void b(DataOutputStream dataOutputStream) {
    }

    public final String toString() {
        return a().toString();
    }
}
