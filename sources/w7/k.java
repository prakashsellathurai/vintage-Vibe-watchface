package w7;

import q7.l;
import t7.c;

public final class k extends l implements p7.l<c, String> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CharSequence f8095f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(1);
        this.f8095f = str;
    }

    public final Object invoke(Object obj) {
        c cVar = (c) obj;
        q7.k.e(cVar, "it");
        CharSequence charSequence = this.f8095f;
        q7.k.e(charSequence, "<this>");
        return charSequence.subSequence(Integer.valueOf(cVar.f7534f).intValue(), Integer.valueOf(cVar.f7535g).intValue() + 1).toString();
    }
}
