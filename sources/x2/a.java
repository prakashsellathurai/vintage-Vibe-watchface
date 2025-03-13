package x2;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import p2.b;
import p2.h;
import y2.g;
import y2.l;

public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8114c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f8115d;
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f8116f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f8117g;

    /* renamed from: x2.a$a  reason: collision with other inner class name */
    public class C0154a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(b bVar, int i8, int i9, boolean z8, b bVar2, g gVar, h hVar) {
        this.f8117g = bVar;
        this.f8112a = i8;
        this.f8113b = i9;
        this.f8114c = z8;
        this.f8115d = bVar2;
        this.e = gVar;
        this.f8116f = hVar;
    }

    @SuppressLint({"Override"})
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        l lVar = this.f8117g.f8118a;
        int i8 = this.f8112a;
        int i9 = this.f8113b;
        boolean z8 = false;
        if (lVar.a(i8, i9, this.f8114c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f8115d == b.f6301g) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0154a());
        Size size = imageInfo.getSize();
        if (i8 == Integer.MIN_VALUE) {
            i8 = size.getWidth();
        }
        if (i9 == Integer.MIN_VALUE) {
            i9 = size.getHeight();
        }
        float b9 = this.e.b(size.getWidth(), size.getHeight(), i8, i9);
        int round = Math.round(((float) size.getWidth()) * b9);
        int round2 = Math.round(b9 * ((float) size.getHeight()));
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        if (this.f8116f == h.f6314g && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
            z8 = true;
        }
        imageDecoder.setTargetColorSpace(ColorSpace.get(z8 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
    }
}
