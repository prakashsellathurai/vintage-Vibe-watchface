package s5;

import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7218a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final j6.b f7219b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7220a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7221b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7222c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7223d;

        public a(String str, String str2, int i8, int i9) {
            this.f7220a = str;
            this.f7221b = str2;
            this.f7222c = i8;
            this.f7223d = i9;
        }

        public final String toString() {
            return this.f7220a + " [" + this.f7222c + "x" + this.f7223d + "] " + this.f7221b;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f7224a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f7225b = new LinkedHashMap();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f7226c = new HashMap();

        public b(String str) {
            this.f7224a = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7224a);
            HashMap hashMap = this.f7226c;
            if (!hashMap.isEmpty()) {
                sb.append(", " + hashMap.size() + " chars: " + hashMap.keySet().toString());
            }
            LinkedHashMap linkedHashMap = this.f7225b;
            if (!linkedHashMap.isEmpty()) {
                sb.append(", " + linkedHashMap.size() + " words: " + linkedHashMap.keySet().toString());
            }
            return sb.toString();
        }
    }

    public e(ArrayList arrayList, j6.b bVar) {
        HashMap hashMap;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = this.f7218a;
                if (!hasNext) {
                    break;
                }
                Iterator it2 = ((i6.e) it.next()).f4863b.iterator();
                while (it2.hasNext()) {
                    i6.e eVar = (i6.e) it2.next();
                    if (eVar.f4862a.equals("BitmapFont")) {
                        String d9 = eVar.b("name").d();
                        Iterator it3 = eVar.f4863b.iterator();
                        while (it3.hasNext()) {
                            i6.e eVar2 = (i6.e) it3.next();
                            if (eVar2.f4862a.equals("Word")) {
                                String d10 = eVar2.b("name").d();
                                String d11 = eVar2.b("resource").d();
                                int c9 = eVar2.b("width").c(0);
                                int c10 = eVar2.b("height").c(0);
                                b bVar2 = (b) hashMap.get(d9);
                                if (bVar2 == null) {
                                    bVar2 = new b(d9);
                                    hashMap.put(d9, bVar2);
                                }
                                bVar2.f7225b.put(d10, new a(d10, d11, c9, c10));
                            } else {
                                String str = eVar2.f4862a;
                                if (str.equals("Character")) {
                                    String d12 = eVar2.b("name").d();
                                    String d13 = eVar2.b("resource").d();
                                    int c11 = eVar2.b("width").c(0);
                                    int c12 = eVar2.b("height").c(0);
                                    b bVar3 = (b) hashMap.get(d9);
                                    if (bVar3 == null) {
                                        bVar3 = new b(d9);
                                        hashMap.put(d9, bVar3);
                                    }
                                    bVar3.f7226c.put(d12, new a(d12, d13, c11, c12));
                                } else {
                                    Log.e("DWF:BitmapFontManager", "Wrong child of bitmap-font : ".concat(str));
                                }
                            }
                        }
                    } else {
                        Log.e("DWF:BitmapFontManager", "Wrong child of bitmap-fonts : " + eVar.f4862a);
                    }
                }
            }
            Log.i("DWF:BitmapFontManager", "BitmapFont built: ");
            for (b bVar4 : hashMap.values()) {
                Log.i("DWF:BitmapFontManager", bVar4.toString());
            }
        }
        this.f7219b = bVar;
    }

    public final BitmapDrawable a(String str, int i8, a aVar) {
        j6.b bVar = this.f7219b;
        String str2 = aVar.f7221b;
        BitmapDrawable k8 = bVar.k(str2, (int) (((float) aVar.f7222c) / (((float) aVar.f7223d) / ((float) i8))), i8);
        if (k8 == null) {
            Log.e("DWF:BitmapFontManager", "Failed to load bitmap font : " + str2 + " from " + str);
            ((b) this.f7218a.get(str)).toString();
        }
        return k8;
    }

    public final ArrayList b(int i8, String str, String str2) {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = this.f7218a;
        if (hashMap2.get(str) == null) {
            Log.e("DWF:BitmapFontManager", "No font " + str + " in the BitmapFontManager");
        } else {
            b bVar = (b) hashMap2.get(str);
            while (str2.length() > 0) {
                Iterator it = bVar.f7225b.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = bVar.f7225b;
                    hashMap = bVar.f7226c;
                    if (!hasNext) {
                        z8 = false;
                        break;
                    }
                    String str3 = (String) it.next();
                    if (str2.startsWith(str3)) {
                        if (!(str3.length() > 1 ? linkedHashMap.containsKey(str3) : hashMap.containsKey(str3))) {
                            continue;
                        } else {
                            BitmapDrawable a9 = a(str, i8, (a) (str3.length() > 1 ? linkedHashMap.get(str3) : hashMap.get(str3)));
                            if (a9 != null) {
                                arrayList.add(a9);
                                str2 = str2.substring(str3.length());
                                z8 = true;
                                break;
                            }
                        }
                    }
                }
                if (!z8) {
                    Iterator it2 = hashMap.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str4 = (String) it2.next();
                        if (str2.startsWith(str4)) {
                            if (!(str4.length() > 1 ? linkedHashMap.containsKey(str4) : hashMap.containsKey(str4))) {
                                continue;
                            } else {
                                BitmapDrawable a10 = a(str, i8, (a) (str4.length() > 1 ? linkedHashMap.get(str4) : hashMap.get(str4)));
                                if (a10 != null) {
                                    arrayList.add(a10);
                                    break;
                                }
                            }
                        }
                    }
                    str2 = str2.substring(1);
                }
            }
        }
        return arrayList;
    }
}
