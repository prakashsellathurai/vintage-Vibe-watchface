package a6;

import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import b6.a;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import v5.b;
import w5.i;

public final class h extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f182f = Arrays.asList(new String[]{"icuText", "icuBestText"});

    /* renamed from: b  reason: collision with root package name */
    public String f183b;

    /* renamed from: c  reason: collision with root package name */
    public final b f184c;

    /* renamed from: d  reason: collision with root package name */
    public final i f185d;
    public final boolean e;

    public h(String str, b bVar, i iVar) {
        super(12);
        this.f184c = bVar;
        this.f185d = iVar;
        this.e = str.equals("icuBestText");
    }

    public final void c(Stack<a> stack, List<a> list) {
        stack.add(this);
    }

    public final a j(Stack<a> stack) {
        this.f183b = stack.pop().k();
        try {
            ULocale uLocale = ULocale.getDefault();
            i iVar = this.f185d;
            if (iVar != null) {
                int i8 = iVar.f8079f;
                uLocale = n6.i.a(i8 != 0 ? a.a(i8) : null, iVar.f8077c);
            }
            b bVar = this.f184c;
            Date from = bVar != null ? Date.from(bVar.f7955d.toInstant()) : Calendar.getInstance().getTime();
            if (this.e) {
                this.f183b = DateTimePatternGenerator.getInstance(uLocale).getBestPattern(this.f183b);
            }
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(this.f183b, uLocale);
            if (iVar != null) {
                instanceForSkeleton.setTimeZone(iVar.f8076b);
            }
            return new m(instanceForSkeleton.format(from));
        } catch (Exception unused) {
            return new m("icu_err");
        }
    }
}
