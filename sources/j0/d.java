package j0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f4921a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f4922a;

        public a(ClipData clipData, int i8) {
            this.f4922a = new ContentInfo.Builder(clipData, i8);
        }

        public final void a(Uri uri) {
            this.f4922a.setLinkUri(uri);
        }

        public final void b(int i8) {
            this.f4922a.setFlags(i8);
        }

        public final d build() {
            return new d(new C0067d(this.f4922a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f4922a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i8);

        d build();

        void setExtras(Bundle bundle);
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f4923a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4924b;

        /* renamed from: c  reason: collision with root package name */
        public int f4925c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f4926d;
        public Bundle e;

        public c(ClipData clipData, int i8) {
            this.f4923a = clipData;
            this.f4924b = i8;
        }

        public final void a(Uri uri) {
            this.f4926d = uri;
        }

        public final void b(int i8) {
            this.f4925c = i8;
        }

        public final d build() {
            return new d(new f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* renamed from: j0.d$d  reason: collision with other inner class name */
    public static final class C0067d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f4927a;

        public C0067d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f4927a = contentInfo;
        }

        public final ClipData a() {
            return this.f4927a.getClip();
        }

        public final int b() {
            return this.f4927a.getFlags();
        }

        public final ContentInfo c() {
            return this.f4927a;
        }

        public final int d() {
            return this.f4927a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f4927a + "}";
        }
    }

    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f4928a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4929b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4930c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f4931d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.f4923a;
            clipData.getClass();
            this.f4928a = clipData;
            int i8 = cVar.f4924b;
            if (i8 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i8 <= 5) {
                this.f4929b = i8;
                int i9 = cVar.f4925c;
                if ((i9 & 1) == i9) {
                    this.f4930c = i9;
                    this.f4931d = cVar.f4926d;
                    this.e = cVar.e;
                    return;
                }
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public final ClipData a() {
            return this.f4928a;
        }

        public final int b() {
            return this.f4930c;
        }

        public final ContentInfo c() {
            return null;
        }

        public final int d() {
            return this.f4929b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f4928a.getDescription());
            sb.append(", source=");
            int i8 = this.f4929b;
            sb.append(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? String.valueOf(i8) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i9 = this.f4930c;
            sb.append((i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i9));
            String str2 = "";
            Uri uri = this.f4931d;
            if (uri == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    public d(e eVar) {
        this.f4921a = eVar;
    }

    public final String toString() {
        return this.f4921a.toString();
    }
}
