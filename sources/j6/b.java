package j6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.health.services.client.impl.i;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.HashMap;
import k6.a;
import k6.j;
import k6.k;
import k6.m;
import n6.g;

public abstract class b {

    /* renamed from: j  reason: collision with root package name */
    public static final Rect f5034j = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public final Resources f5035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5036b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5037c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5038d;
    public final Resources e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5039f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f5040g = null;

    /* renamed from: h  reason: collision with root package name */
    public final j f5041h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f5042i = new HashMap();

    static {
        Paths.get("res", new String[]{"watchface.xml"}).toString();
    }

    public b(Context context, Context context2) {
        this.f5037c = context;
        this.f5035a = context.getResources();
        this.f5036b = context.getPackageName();
        this.f5038d = context2;
        this.e = context2.getResources();
        this.f5039f = context2.getPackageName();
        i iVar = new i(6, this);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        this.f5041h = new j(iVar, (long) (((float) memoryInfo.totalMem) * 0.1f));
    }

    public static String a(String str, String... strArr) {
        return Paths.get(str, strArr).toString();
    }

    public static Rect c(Drawable drawable) {
        Rect bounds = drawable.getBounds();
        if (bounds == f5034j) {
            bounds.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return bounds;
    }

    public abstract Typeface b(String str);

    public final k d(Object obj, String str) {
        HashMap hashMap = this.f5042i;
        k kVar = (k) hashMap.get(obj);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.e, this.f5039f, l(str), this.f5037c);
        hashMap.put(obj, kVar2);
        return kVar2;
    }

    public abstract ImageDecoder.Source e(String str);

    public final int f(String str) {
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            return 0;
        }
        int identifier = this.e.getIdentifier(str, "string", this.f5039f);
        return identifier == 0 ? this.f5035a.getIdentifier(str, "string", this.f5036b) : identifier;
    }

    public final m g(Object obj, String str) {
        HashMap hashMap = this.f5042i;
        m mVar = (m) hashMap.get(obj);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.e, this.f5039f, l(str), this.f5037c);
        hashMap.put(obj, mVar2);
        return mVar2;
    }

    public abstract boolean h(String str);

    public final Bitmap i(String str) {
        BitmapFactory.Options options;
        Resources resources = this.e;
        String str2 = this.f5039f;
        a aVar = new a(resources, str2);
        try {
            InputStream l8 = l(str);
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(l8, new Rect(), options);
        } catch (Exception e4) {
            Log.e("DWF:ResourceManager", e4.getMessage());
            options = null;
        }
        j jVar = this.f5041h;
        if (options != null) {
            int i8 = (int) (((float) (Resources.getSystem().getDisplayMetrics().widthPixels * Resources.getSystem().getDisplayMetrics().heightPixels)) * 4.0f);
            int i9 = options.outWidth;
            int i10 = options.outHeight;
            double d9 = ((double) i9) / ((double) i10);
            if (i9 * i10 > i8) {
                int sqrt = (int) Math.sqrt(((double) i8) * d9);
                int i11 = (int) (((double) sqrt) / d9);
                Log.i("DWF:ResourceManager", "Bitmap " + str + " resized to " + sqrt + "x" + i11);
                jVar.f5207b = new a(resources, str2);
                return jVar.e(str, sqrt, i11);
            }
        }
        jVar.f5207b = aVar;
        return jVar.c(str);
    }

    public final BitmapDrawable j(int i8, int i9, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.e, bitmap);
        bitmapDrawable.setBounds(0, 0, i8, i9);
        return bitmapDrawable;
    }

    public final BitmapDrawable k(String str, int i8, int i9) {
        a aVar = new a(this.e, this.f5039f);
        j jVar = this.f5041h;
        jVar.f5207b = aVar;
        return j(i8, i9, jVar.e(str, i8, i9));
    }

    public final InputStream l(String str) {
        if (!g.e(str)) {
            return m(str);
        }
        throw new FileNotFoundException("Path is empty or null : " + str);
    }

    public abstract InputStream m(String str);

    public abstract InputStream n();

    public final String o(String str) {
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            return str;
        }
        String str2 = this.f5039f;
        Resources resources = this.e;
        try {
            return resources.getString(resources.getIdentifier(str, "string", str2));
        } catch (Resources.NotFoundException unused) {
            String str3 = this.f5036b;
            Resources resources2 = this.f5035a;
            int identifier = resources2.getIdentifier(str, "string", str3);
            try {
                return resources2.getString(identifier);
            } catch (Resources.NotFoundException e4) {
                if (identifier != 0) {
                    Log.w("DWF:ResourceManager", "StringId[" + identifier + "] Text[" + str + "] is not found :" + e4.getMessage());
                }
                return str;
            }
        }
    }
}
