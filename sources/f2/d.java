package f2;

import a2.c;
import a2.h;
import android.graphics.Path;
import e2.a;
import g2.b;
import y1.l;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4310a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f4311b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4312c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4313d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final a f4314f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4315g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4316h;

    public d(String str, int i8, Path.FillType fillType, a aVar, a aVar2, a aVar3, a aVar4, boolean z8) {
        this.f4310a = i8;
        this.f4311b = fillType;
        this.f4312c = aVar;
        this.f4313d = aVar2;
        this.e = aVar3;
        this.f4314f = aVar4;
        this.f4315g = str;
        this.f4316h = z8;
    }

    public final c a(l lVar, b bVar) {
        return new h(lVar, bVar, this);
    }
}
