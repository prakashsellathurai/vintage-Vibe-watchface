package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f825a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f826b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f827c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f828d = -1.0f;
    public float e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f829f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f830g = false;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f831h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f832i;

    public static class a extends c {
    }

    public static class b extends a {
    }

    public static class c {
    }

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public t(TextView textView) {
        this.f831h = textView;
        this.f832i = textView.getContext();
        new b();
    }

    public static int[] a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (!d() || this.f825a != 1) {
            this.f826b = false;
        } else {
            if (!this.f830g || this.f829f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.f828d) / this.f827c))) + 1;
                int[] iArr = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr[i8] = Math.round(this.f828d + (((float) i8) * this.f827c));
                }
                this.f829f = a(iArr);
            }
            this.f826b = true;
        }
        return this.f826b;
    }

    public final boolean c() {
        int[] iArr = this.f829f;
        int length = iArr.length;
        boolean z8 = length > 0;
        this.f830g = z8;
        if (z8) {
            this.f825a = 1;
            this.f828d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.f827c = -1.0f;
        }
        return z8;
    }

    public final boolean d() {
        return !(this.f831h instanceof j);
    }

    public final void e(float f9, float f10, float f11) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
        } else if (f10 <= f9) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        } else if (f11 > 0.0f) {
            this.f825a = 1;
            this.f828d = f9;
            this.e = f10;
            this.f827c = f11;
            this.f830g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
    }
}
