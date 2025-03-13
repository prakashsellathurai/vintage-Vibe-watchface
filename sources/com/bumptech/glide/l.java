package com.bumptech.glide;

import com.bumptech.glide.l;
import i3.a;

public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public final a.C0065a f2971f = a.f4839a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
