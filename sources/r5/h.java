package r5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.util.Log;
import b6.b;
import com.samsung.android.wearable.watchfacestudio.editor.q;
import g6.c;
import i6.e;
import i6.g;
import j6.a;
import j6.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.xml.parsers.SAXParserFactory;
import t1.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final i6.h f7088a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7089b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7090c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7091d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public c f7092f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f7093g = null;

    /* renamed from: h  reason: collision with root package name */
    public LinkedHashMap f7094h = null;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f7095i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public f f7096j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f7097k = null;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f7098l = null;

    /* renamed from: m  reason: collision with root package name */
    public e f7099m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7100n = false;

    public h(Context context) {
        e eVar;
        this.f7089b = context;
        this.f7090c = context;
        this.f7091d = "res://";
        i6.h hVar = new i6.h();
        this.f7088a = hVar;
        a aVar = new a(context, context);
        this.e = aVar;
        InputStream n8 = aVar.n();
        i6.f fVar = hVar.f4869a;
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(n8, fVar);
            eVar = fVar.f4868c;
        } catch (Exception e4) {
            Log.e("DWF:WatchFaceParser", e4.getMessage());
            eVar = null;
        }
        this.f7099m = eVar;
        InputStream inputStream = aVar.f5040g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e9) {
                Log.w("DWF:ResourceManager", "fail to close xml input stream: " + e9.getMessage());
            }
            aVar.f5040g = null;
        }
        e eVar2 = this.f7099m;
        if (eVar2 == null) {
            Log.e("DWF:WatchFaceDocument", "fail to parse xml. ResourceManager : " + aVar);
            return;
        }
        this.f7096j = new f(g.b(eVar2, "Metadata"));
        this.f7100n = true;
        this.f7093g = d(this.f7099m);
        this.f7094h = f(this.f7099m, aVar);
    }

    public static b6.b e(e eVar, b bVar, int i8) {
        Icon icon;
        e eVar2 = eVar;
        String e4 = eVar2.b("id").e("");
        String e9 = eVar2.b("displayName").e("");
        String e10 = eVar2.b("defaultValue").e("");
        String e11 = eVar2.b("screenReaderText").e("");
        Bitmap i9 = bVar.i(eVar2.b("icon").e(""));
        if (i9 != null) {
            int width = i9.getWidth();
            int height = i9.getHeight();
            if (width > 360 || height > 360) {
                Log.w("DWF:WatchFaceDocument", String.format("icons for configuration cannot be bigger than %dx%d pixels. it will be resized.", new Object[]{360, 360}));
                Matrix matrix = new Matrix();
                matrix.postScale(360.0f / ((float) width), 360.0f / ((float) height));
                i9 = Bitmap.createBitmap(i9, 0, 0, i9.getWidth(), i9.getHeight(), matrix, true);
            }
            icon = Icon.createWithBitmap(i9);
        } else {
            icon = null;
        }
        EnumSet.allOf(b.a.class);
        return new b6.b(i8, e4, e9, e10, e11, icon);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap f(i6.e r9, j6.b r10) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "UserConfigurations"
            java.util.ArrayList r9 = i6.g.b(r9, r1)
            int r1 = r9.size()
            if (r1 != 0) goto L_0x0012
            return r0
        L_0x0012:
            r1 = 0
            java.lang.Object r9 = r9.get(r1)
            i6.e r9 = (i6.e) r9
            java.util.ArrayList r9 = r9.f4863b
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
        L_0x0020:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00d2
            java.lang.Object r3 = r9.next()
            i6.e r3 = (i6.e) r3
            java.lang.String r4 = r3.f4862a
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1021801869(0xffffffffc3188a73, float:-152.54082)
            r7 = 2
            r8 = 1
            if (r5 == r6) goto L_0x005d
            r6 = -802904872(0xffffffffd024a4d8, float:-1.10490665E10)
            if (r5 == r6) goto L_0x0052
            r6 = -497848882(0xffffffffe2536dce, float:-9.750438E20)
            if (r5 == r6) goto L_0x0047
            goto L_0x0065
        L_0x0047:
            java.lang.String r5 = "BooleanConfiguration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0050
            goto L_0x0065
        L_0x0050:
            r4 = r7
            goto L_0x0068
        L_0x0052:
            java.lang.String r5 = "ListConfiguration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x005b
            goto L_0x0065
        L_0x005b:
            r4 = r8
            goto L_0x0068
        L_0x005d:
            java.lang.String r5 = "ColorConfiguration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0067
        L_0x0065:
            r4 = -1
            goto L_0x0068
        L_0x0067:
            r4 = r1
        L_0x0068:
            java.util.ArrayList r5 = r3.f4863b
            if (r4 == 0) goto L_0x009f
            if (r4 == r8) goto L_0x0076
            if (r4 == r7) goto L_0x0071
            goto L_0x00c9
        L_0x0071:
            b6.b r2 = e(r3, r10, r8)
            goto L_0x00c9
        L_0x0076:
            b6.b r2 = e(r3, r10, r7)
            java.util.Iterator r3 = r5.iterator()
            r4 = r1
        L_0x007f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r3.next()
            i6.e r5 = (i6.e) r5
            java.lang.String r6 = r5.f4862a
            java.lang.String r7 = "ListOption"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x007f
            int r4 = r4 + 1
            b6.c r5 = g(r5, r4, r10)
            r2.a(r5)
            goto L_0x007f
        L_0x009f:
            r2 = 3
            b6.b r2 = e(r3, r10, r2)
            java.util.Iterator r3 = r5.iterator()
            r4 = r1
        L_0x00a9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r3.next()
            i6.e r5 = (i6.e) r5
            java.lang.String r6 = r5.f4862a
            java.lang.String r7 = "ColorOption"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00a9
            int r4 = r4 + 1
            b6.c r5 = g(r5, r4, r10)
            r2.a(r5)
            goto L_0x00a9
        L_0x00c9:
            if (r2 == 0) goto L_0x0020
            java.lang.String r3 = r2.f2604b
            r0.put(r3, r2)
            goto L_0x0020
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.h.f(i6.e, j6.b):java.util.LinkedHashMap");
    }

    public static b6.c g(e eVar, int i8, j6.b bVar) {
        Bitmap i9;
        e eVar2 = eVar;
        String e4 = eVar2.b("id").e("");
        String e9 = eVar2.b("displayName").e("");
        String str = e9.isEmpty() ? e4 : e9;
        String e10 = eVar2.b("screenReaderText").e("");
        String e11 = eVar2.b("icon").e("");
        ArrayList arrayList = new ArrayList();
        try {
            if (eVar2.c("colors")) {
                for (String parseColor : n6.g.g(eVar2.b("colors").e("#FFFFFF"))) {
                    arrayList.add(Color.valueOf(Color.parseColor(parseColor)));
                }
            }
        } catch (IllegalArgumentException e12) {
            Log.e("DWF:WatchFaceDocument", e12.getMessage());
            arrayList.add(Color.valueOf(-1));
        }
        Icon createWithBitmap = (e11.isEmpty() || (i9 = bVar.i(e11)) == null) ? null : Icon.createWithBitmap(i9);
        if (createWithBitmap == null) {
            if (arrayList.isEmpty()) {
                arrayList.add(Color.valueOf(0));
            }
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (arrayList.size() > 0) {
                Path path = new Path();
                float f9 = (float) 100;
                float f10 = f9 / 2.0f;
                path.addCircle(f10, f10, ((float) Math.min(100, 100)) / 2.0f, Path.Direction.CCW);
                canvas.clipPath(path);
                List list = (List) arrayList.stream().distinct().collect(Collectors.toList());
                canvas.drawColor(((Color) list.get(0)).toArgb());
                int i10 = 1;
                if (list.size() > 1) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(-45.0f, f10, f10);
                    while (i10 < list.size()) {
                        Path path2 = new Path();
                        float size = (((float) i10) * f9) / ((float) list.size());
                        float f11 = f9;
                        float f12 = f9;
                        float f13 = f9;
                        Path path3 = path2;
                        path2.addRect(0.0f, size, f11, f12, Path.Direction.CW);
                        path3.transform(matrix);
                        canvas.clipPath(path3);
                        canvas.drawColor(((Color) list.get(i10)).toArgb(), PorterDuff.Mode.SRC);
                        i10++;
                        f9 = f13;
                    }
                }
            }
            createWithBitmap = Icon.createWithBitmap(createBitmap);
        }
        return new b6.c(e4, str, e10, createWithBitmap, arrayList);
    }

    public final List<x5.c> a() {
        if (this.f7093g == null) {
            this.f7093g = d(this.f7099m);
        }
        return this.f7093g;
    }

    public final Map<String, b6.b> b() {
        if (this.f7094h == null) {
            this.f7094h = f(this.f7099m, this.e);
        }
        return this.f7094h;
    }

    public final c c() {
        if (this.f7092f == null) {
            c cVar = new c(this.f7089b, this.f7090c, this.f7099m, (String) this.f7096j.f7428c, this.f7095i);
            this.f7092f = cVar;
            Log.i("DWF:WatchFaceDocument", cVar.toString());
        }
        return this.f7092f;
    }

    public final ArrayList d(e eVar) {
        e eVar2;
        int i8;
        Matrix matrix;
        float f9;
        x5.c cVar;
        ArrayList arrayList = new ArrayList();
        i6.h hVar = this.f7088a;
        int i9 = 0;
        if (hVar.a().stream().anyMatch(new g(0, "[UNREAD_NOTIFICATION_"))) {
            arrayList.add(w5.a.f8014a);
        }
        ((List) hVar.a().stream().filter(new q(2)).collect(Collectors.toList())).forEach(new f(0, this));
        e c9 = g.c(eVar, "Scene");
        String str = "DWF:WatchFaceDocument";
        if (c9 == null) {
            Log.e(str, "this watchface does not have scene");
            return arrayList;
        }
        ArrayList<e> b9 = g.b(c9, "ComplicationSlot");
        if (b9.isEmpty()) {
            Log.i(str, "this watchface does not have any complication");
            return arrayList;
        }
        Iterator<e> it = b9.iterator();
        int i10 = 11;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e next = it.next();
            if (i10 > 19) {
                Log.w(str, "Complication slot overflow");
                break;
            }
            String e4 = next.b("slotId").e("");
            if (e4.isEmpty()) {
                Log.e(str, "parseComplication: id doesn't exist");
            } else {
                if (!e4.startsWith("COMPLICATION.")) {
                    e4 = "COMPLICATION.".concat(e4);
                }
                String str2 = e4;
                List<String> g9 = n6.g.g(next.b("supportedTypes").e("SHORT_TEXT"));
                boolean a9 = next.b("isCustomizable").a(true);
                int c10 = next.b("x").c(i9);
                int c11 = next.b("y").c(i9);
                int c12 = next.b("width").c(i9);
                int c13 = next.b("height").c(i9);
                float b10 = next.b("angle").b(0.0f);
                float b11 = next.b("scaleX").b(1.0f);
                Iterator<e> it2 = it;
                float b12 = next.b("scaleY").b(1.0f);
                String str3 = "";
                float b13 = next.b("pivotX").b(0.5f);
                String str4 = str;
                float b14 = next.b("pivotY").b(0.5f);
                Matrix matrix2 = new Matrix();
                ArrayList arrayList2 = arrayList;
                float f10 = (float) c10;
                int i11 = c10;
                float f11 = (float) c11;
                matrix2.setTranslate(f10, f11);
                float f12 = f10;
                float f13 = (float) c12;
                float f14 = b13 * f13;
                float f15 = f13;
                float f16 = (float) c13;
                float f17 = b14 * f16;
                matrix2.preRotate(b10, f14, f17);
                matrix2.preScale(b11, b12, f14, f17);
                e c14 = g.c(next, "DefaultProviderPolicy");
                if (c14 == null) {
                    f9 = f11;
                    cVar = new x5.c(i10, str2, g9, "EMPTY", "EMPTY", a9, i11, c11, c12, c13);
                    i10++;
                    matrix = matrix2;
                    eVar2 = next;
                    i8 = 0;
                } else {
                    f9 = f11;
                    int i12 = i10 + 1;
                    matrix = matrix2;
                    x5.c cVar2 = r6;
                    i8 = 0;
                    e eVar3 = next;
                    String str5 = str3;
                    eVar2 = eVar3;
                    x5.c cVar3 = new x5.c(i10, str2, g9, c14.b("defaultSystemProvider").d(), c14.b("defaultSystemProviderType").e(g9.get(0)), a9, i11, c11, c12, c13);
                    if (c14.c("primaryProvider")) {
                        String e9 = c14.b("primaryProvider").e(str5);
                        String e10 = c14.b("primaryProviderType").e("EMPTY");
                        cVar2.f8153h = e9;
                        cVar2.f8154i = x5.a.valueOf(e10);
                    }
                    if (c14.c("secondaryProvider")) {
                        String e11 = c14.b("secondaryProvider").e(str5);
                        String e12 = c14.b("secondaryProviderType").e("EMPTY");
                        cVar2.f8155j = e11;
                        cVar2.f8156k = x5.a.valueOf(e12);
                    }
                    cVar = cVar2;
                    i10 = i12;
                }
                y5.e b15 = s5.h.b(eVar2, new RectF(f12, f9, f15, f16), matrix);
                if (b15 != null) {
                    cVar.f8157l = b15;
                }
                arrayList = arrayList2;
                arrayList.add(cVar);
                str = str4;
                Log.i(str, cVar.toString());
                it = it2;
                i9 = i8;
            }
        }
        return arrayList;
    }
}
