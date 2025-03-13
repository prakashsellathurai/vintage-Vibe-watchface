package f2;

import a2.c;
import a2.s;
import e2.b;
import y1.l;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4373a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4374b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4375c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4376d;
    public final boolean e;

    public o(String str, int i8, b bVar, b bVar2, b bVar3, boolean z8) {
        this.f4373a = i8;
        this.f4374b = bVar;
        this.f4375c = bVar2;
        this.f4376d = bVar3;
        this.e = z8;
    }

    public final c a(l lVar, g2.b bVar) {
        return new s(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f4374b + ", end: " + this.f4375c + ", offset: " + this.f4376d + "}";
    }
}
