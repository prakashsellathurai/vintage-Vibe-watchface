package k6;

import android.graphics.ImageDecoder;

public final /* synthetic */ class i implements ImageDecoder.OnHeaderDecodedListener {
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setAllocator(1);
    }
}
