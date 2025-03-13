package com.google.protobuf;

import com.google.protobuf.s1;

public final class k0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f3705a;

    /* renamed from: b  reason: collision with root package name */
    public final K f3706b = "";

    /* renamed from: c  reason: collision with root package name */
    public final V f3707c;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final s1 f3708a;

        /* renamed from: b  reason: collision with root package name */
        public final K f3709b = "";

        /* renamed from: c  reason: collision with root package name */
        public final s1 f3710c;

        /* renamed from: d  reason: collision with root package name */
        public final V f3711d;

        public a(s1.a aVar, s1 s1Var, Object obj) {
            this.f3708a = aVar;
            this.f3710c = s1Var;
            this.f3711d = obj;
        }
    }

    public k0(s1.a aVar, s1 s1Var, Object obj) {
        this.f3705a = new a<>(aVar, s1Var, obj);
        this.f3707c = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k8, V v8) {
        return u.d(aVar.f3708a, 1, k8) + u.d(aVar.f3710c, 2, v8);
    }
}
