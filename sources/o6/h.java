package o6;

import e7.i;
import java.util.Arrays;
import w5.f;

public final class h extends i {

    public enum a implements i.a {
        X("x", new f(0.0f)),
        Y("y", new f(0.0f)),
        WIDTH("width", new f(0.0f)),
        HEIGHT("height", new f(0.0f)),
        PIVOT_X("pivotX", new f(0.5f)),
        PIVOT_Y("pivotY", new f(0.5f)),
        ANGLE("angle", new f(0.0f)),
        ALPHA("alpha", new f(255)),
        SCALE_X("scaleX", new f(1.0f)),
        SCALE_Y("scaleY", new f(1.0f)),
        GYRO_X("gyroX", new f(0.0f)),
        GYRO_Y("gyroY", new f(0.0f)),
        GYRO_SCALE_X("gyroScaleX", new f(1.0f)),
        GYRO_SCALE_Y("gyroScaleY", new f(1.0f)),
        GYRO_ANGLE("gyroAngle", new f(0.0f)),
        GYRO_ALPHA("gyroAlpha", new f(255));
        

        /* renamed from: f  reason: collision with root package name */
        public final String f6168f;

        /* renamed from: g  reason: collision with root package name */
        public final f f6169g;

        /* access modifiers changed from: public */
        a(String str, f fVar) {
            this.f6168f = str;
            this.f6169g = fVar;
        }

        public static i.a f(String str) {
            return i.a(values(), str);
        }

        public final f e() {
            return this.f6169g;
        }

        public final String getKey() {
            return this.f6168f;
        }
    }

    public h() {
        Arrays.stream(a.values()).forEach(new r5.f(10, this));
    }

    public final void e(float f9, float f10, float f11, float f12) {
        d(a.X, new f(f9));
        d(a.Y, new f(f10));
        d(a.WIDTH, new f(f11));
        d(a.HEIGHT, new f(f12));
    }
}
