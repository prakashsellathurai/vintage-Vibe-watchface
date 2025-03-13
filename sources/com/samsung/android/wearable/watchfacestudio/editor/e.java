package com.samsung.android.wearable.watchfacestudio.editor;

import android.widget.FrameLayout;
import java.util.Map;
import java.util.function.Consumer;
import l5.a;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3884a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3885b;

    public /* synthetic */ e(int i8, Object obj) {
        this.f3884a = i8;
        this.f3885b = obj;
    }

    public final void accept(Object obj) {
        int i8 = this.f3884a;
        Object obj2 = this.f3885b;
        switch (i8) {
            case 0:
                ((FrameLayout) obj2).addView((a) obj);
                return;
            case 1:
                w wVar = (w) obj2;
                Map.Entry entry = (Map.Entry) obj;
                int i9 = w.A0;
                wVar.getClass();
                Integer num = (Integer) entry.getKey();
                String str = ((p1.a) entry.getValue()).f6243b;
                if (str == null || str.isEmpty()) {
                    str = "complication";
                }
                wVar.f3941m0.stream().filter(new o(2, num)).findFirst().ifPresent(new e(2, str));
                return;
            default:
                int i10 = w.A0;
                ((a) obj).setContentDescription((String) obj2);
                return;
        }
    }
}
