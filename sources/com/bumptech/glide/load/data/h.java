package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class h extends b {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2990i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AssetManager assetManager, String str, int i8) {
        super(assetManager, str);
        this.f2990i = i8;
    }

    public final Class a() {
        switch (this.f2990i) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }
}
