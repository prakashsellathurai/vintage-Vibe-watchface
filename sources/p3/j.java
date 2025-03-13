package p3;

import androidx.annotation.RecentlyNonNull;
import o3.c;

public final class j extends UnsupportedOperationException {

    /* renamed from: f  reason: collision with root package name */
    public final c f6327f;

    public j(@RecentlyNonNull c cVar) {
        this.f6327f = cVar;
    }

    @RecentlyNonNull
    public final String getMessage() {
        String valueOf = String.valueOf(this.f6327f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
