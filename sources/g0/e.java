package g0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<byte[]> f4447a = new d();

    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [g0.m[], android.database.Cursor] */
    public static l a(Context context, f fVar) {
        Cursor cursor;
        boolean z8;
        f fVar2 = fVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = fVar2.f4448a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = fVar2.f4449b;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                Comparator<byte[]> comparator = f4447a;
                Collections.sort(arrayList, comparator);
                List<List<byte[]>> list = fVar2.f4451d;
                if (list == null) {
                    list = b0.a.b(resources, 0);
                }
                int i8 = 0;
                while (true) {
                    cursor = 0;
                    if (i8 >= list.size()) {
                        resolveContentProvider = cursor;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(list.get(i8));
                    Collections.sort(arrayList2, comparator);
                    if (arrayList.size() == arrayList2.size()) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                z8 = true;
                                break;
                            } else if (!Arrays.equals((byte[]) arrayList.get(i9), (byte[]) arrayList2.get(i9))) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                    z8 = false;
                    if (z8) {
                        break;
                    }
                    i8++;
                }
                if (resolveContentProvider == null) {
                    return new l(1, cursor);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fVar2.f4450c}, (String) null, (Object) null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new m(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    return new l(0, (m[]) arrayList3.toArray(new m[0]));
                } finally {
                    if (cursor != 0) {
                        cursor.close();
                    }
                }
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
            }
        } else {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
    }
}
