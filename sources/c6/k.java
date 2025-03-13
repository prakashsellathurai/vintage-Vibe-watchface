package c6;

import android.content.Context;
import android.util.Log;
import d6.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.g;
import w5.d;
import w5.f;
import w5.h;

public final class k extends d {

    /* renamed from: g  reason: collision with root package name */
    public int f2751g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final h f2752h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2753i = false;

    public k(Context context, boolean z8, h hVar, c cVar) {
        super(context, z8, cVar);
        this.f2752h = hVar;
    }

    public static int n(String str) {
        if (g.e(str)) {
            return -1;
        }
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("DWF:ModelNotification", "fail to parse unread notification count: " + str);
            return -1;
        }
    }

    public final void b(d dVar, f fVar) {
        if (dVar == d.U0) {
            o(Integer.parseInt(fVar.h()));
        }
    }

    public final d d() {
        return d.T0;
    }

    public final f e(d dVar) {
        return dVar == d.U0 ? new f(this.f2751g) : f.f8063k;
    }

    public final boolean f(d dVar) {
        HashMap hashMap = this.f2720f;
        return hashMap.containsKey(dVar) && ((Boolean) hashMap.get(dVar)).booleanValue();
    }

    public final void i(d dVar) {
        if (d.U0.ordinal() <= dVar.ordinal() && dVar.ordinal() <= d.V0.ordinal() && !this.f2753i) {
            w5.c cVar = new w5.c("COMPLICATION.internal_notification_complication.TEXT");
            h hVar = this.f2752h;
            f b9 = hVar.b(cVar);
            if (!b9.equals(f.f8063k) && !b9.i()) {
                o(n(b9.h()));
            }
            hVar.a(cVar, new j5.c(this, 2));
            this.f2753i = true;
        }
    }

    public final void j(d dVar) {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final d m() {
        return d.V0;
    }

    public final void o(int i8) {
        if (this.f2751g != i8) {
            this.f2751g = i8;
            this.f2717b.a(new ArrayList(Collections.singletonList(d.U0)));
        }
    }
}
