package z;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import j0.x;
import p.f;

public class b extends Activity implements r {

    /* renamed from: a  reason: collision with root package name */
    public final s f8630a = new s(this);

    public b() {
        new f();
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = x.f4957a;
        }
        return d(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = x.f4957a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public m getLifecycle() {
        return this.f8630a;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b0.a(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        s sVar = this.f8630a;
        sVar.getClass();
        sVar.d("markState");
        sVar.g();
        super.onSaveInstanceState(bundle);
    }
}
