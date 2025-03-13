package k6;

import android.graphics.ImageDecoder;

public final /* synthetic */ class h implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5205b;

    public /* synthetic */ h(int i8, int i9) {
        this.f5204a = i8;
        this.f5205b = i9;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetSize(this.f5204a, this.f5205b);
        imageDecoder.setAllocator(1);
    }
}
