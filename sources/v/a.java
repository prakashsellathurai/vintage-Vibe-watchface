package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import k3.j;
import s.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f7815a;

    /* renamed from: b  reason: collision with root package name */
    public int f7816b;

    /* renamed from: c  reason: collision with root package name */
    public float f7817c;

    /* renamed from: d  reason: collision with root package name */
    public String f7818d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f7819f;

    public a(String str, int i8, Object obj) {
        this.f7815a = i8;
        b(obj);
    }

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f7815a = aVar.f7815a;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int i8;
        float f9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j.f5157l);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i9 = 0;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i9 = 6;
            } else {
                int i12 = 3;
                if (index != 3) {
                    i12 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            f9 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            f9 = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i9 = 2;
                        } else if (index == 6) {
                            i8 = obtainStyledAttributes.getInteger(index, -1);
                            obj = Integer.valueOf(i8);
                            i9 = i11;
                        } else if (index == 8) {
                            obj = obtainStyledAttributes.getString(index);
                            i9 = 5;
                        }
                        obj = Float.valueOf(f9);
                        i9 = 7;
                    }
                }
                i11 = i12;
                i8 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i8);
                i9 = i11;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i9, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (g.b(this.f7815a)) {
            case 0:
                this.f7816b = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f7817c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f7819f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f7818d = (String) obj;
                return;
            case 5:
                this.e = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
