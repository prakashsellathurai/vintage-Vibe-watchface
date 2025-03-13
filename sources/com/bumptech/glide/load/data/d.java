package com.bumptech.glide.load.data;

import com.bumptech.glide.h;

public interface d<T> {

    public interface a<T> {
        void c(Exception exc);

        void d(T t8);
    }

    Class<T> a();

    void b();

    void cancel();

    p2.a e();

    void f(h hVar, a<? super T> aVar);
}
