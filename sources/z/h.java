package z;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f8649a;

    /* renamed from: b  reason: collision with root package name */
    public final IconCompat f8650b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8651c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8652d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8653f;

    public static class a {
        public static h a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f8654a = person.getName();
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1047p;
                icon.getClass();
                int c9 = IconCompat.c.c(icon);
                if (c9 == 2) {
                    iconCompat = IconCompat.a(IconCompat.c.a(icon), IconCompat.c.b(icon));
                } else if (c9 == 4) {
                    Uri a9 = IconCompat.a.a(icon);
                    a9.getClass();
                    String uri = a9.toString();
                    uri.getClass();
                    iconCompat = new IconCompat(4);
                    iconCompat.f1049g = uri;
                } else if (c9 != 6) {
                    iconCompat = new IconCompat(-1);
                    iconCompat.f1049g = icon;
                } else {
                    Uri a10 = IconCompat.a.a(icon);
                    a10.getClass();
                    String uri2 = a10.toString();
                    uri2.getClass();
                    iconCompat = new IconCompat(6);
                    iconCompat.f1049g = uri2;
                }
            } else {
                iconCompat = null;
            }
            bVar.f8655b = iconCompat;
            bVar.f8656c = person.getUri();
            bVar.f8657d = person.getKey();
            bVar.e = person.isBot();
            bVar.f8658f = person.isImportant();
            return new h(bVar);
        }

        public static Person b(h hVar) {
            Person.Builder name = new Person.Builder().setName(hVar.f8649a);
            Icon icon = null;
            IconCompat iconCompat = hVar.f8650b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.c(iconCompat, (Context) null);
            }
            return name.setIcon(icon).setUri(hVar.f8651c).setKey(hVar.f8652d).setBot(hVar.e).setImportant(hVar.f8653f).build();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f8654a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f8655b;

        /* renamed from: c  reason: collision with root package name */
        public String f8656c;

        /* renamed from: d  reason: collision with root package name */
        public String f8657d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8658f;
    }

    public h(b bVar) {
        this.f8649a = bVar.f8654a;
        this.f8650b = bVar.f8655b;
        this.f8651c = bVar.f8656c;
        this.f8652d = bVar.f8657d;
        this.e = bVar.e;
        this.f8653f = bVar.f8658f;
    }
}
