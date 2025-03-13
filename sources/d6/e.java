package d6;

import android.icu.text.DateFormatSymbols;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import java.util.HashMap;
import java.util.List;
import w5.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4066a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public i f4067b = new i(System.identityHashCode(this), (String) null, (List<String>) null, (String) null);

    /* renamed from: c  reason: collision with root package name */
    public ULocale f4068c = ULocale.getDefault();

    /* renamed from: d  reason: collision with root package name */
    public TimeZone f4069d = TimeZone.getDefault();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ULocale f4070a;

        /* renamed from: b  reason: collision with root package name */
        public final Calendar f4071b;

        /* renamed from: c  reason: collision with root package name */
        public final DateFormatSymbols f4072c;

        public a(ULocale uLocale, Calendar calendar) {
            this.f4070a = uLocale;
            this.f4071b = calendar;
            this.f4072c = new DateFormatSymbols(uLocale);
        }
    }
}
