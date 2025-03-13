package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

public final class l extends k<InputStream> {

    /* renamed from: i  reason: collision with root package name */
    public static final UriMatcher f3002i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3002i = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public l(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void c(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            android.content.UriMatcher r2 = f3002i
            int r2 = r2.match(r4)
            r0 = 1
            if (r2 == r0) goto L_0x0019
            r1 = 3
            if (r2 == r1) goto L_0x0014
            r1 = 5
            if (r2 == r1) goto L_0x0019
            java.io.InputStream r2 = r3.openInputStream(r4)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3, r4, r0)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.lookupContact(r3, r4)
            if (r2 == 0) goto L_0x003a
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r3, r2, r0)
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            return r2
        L_0x0026:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "InputStream is null for "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x003a:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "Contact cannot be found"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.l.d(android.content.ContentResolver, android.net.Uri):java.lang.Object");
    }
}
