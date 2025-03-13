package a6;

import v5.b;
import w5.c;
import w5.i;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public final c f175b;

    /* renamed from: c  reason: collision with root package name */
    public final b f176c;

    /* renamed from: d  reason: collision with root package name */
    public final i f177d;

    public d(String str, b bVar, i iVar) {
        super(9);
        int indexOf = str.indexOf("[");
        int lastIndexOf = str.lastIndexOf("]");
        this.f175b = new c(indexOf < lastIndexOf ? str.substring(indexOf + 1, lastIndexOf) : str);
        this.f176c = bVar;
        this.f177d = iVar;
    }
}
