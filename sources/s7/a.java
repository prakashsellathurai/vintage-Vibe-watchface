package s7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import q7.k;

public final class a extends r7.a {
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.d(current, "current()");
        return current;
    }
}
