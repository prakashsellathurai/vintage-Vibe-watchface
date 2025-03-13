package l;

import java.util.concurrent.Executor;

public final /* synthetic */ class a implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5225f;

    public /* synthetic */ a(int i8) {
        this.f5225f = i8;
    }

    public final void execute(Runnable runnable) {
        switch (this.f5225f) {
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            case 4:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
