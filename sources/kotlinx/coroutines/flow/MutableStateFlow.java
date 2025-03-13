package kotlinx.coroutines.flow;

import a8.b;
import a8.c;
import a8.f;
import h7.h;
import j7.d;
import java.util.List;

public interface MutableStateFlow<T> extends f<T>, c, b {
    /* synthetic */ Object collect(b<? super T> bVar, d<?> dVar);

    boolean compareAndSet(T t8, T t9);

    /* synthetic */ Object emit(T t8, d<? super h> dVar);

    /* synthetic */ List<T> getReplayCache();

    /* synthetic */ f<Integer> getSubscriptionCount();

    T getValue();

    /* synthetic */ void resetReplayCache();

    void setValue(T t8);

    /* synthetic */ boolean tryEmit(T t8);
}
