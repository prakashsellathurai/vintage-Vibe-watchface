package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
public class WebpFrame {
    static final int FRAME_DURATION_MS_FOR_MIN = 100;
    static final int MIN_FRAME_DURATION_MS = 20;
    boolean blendPreviousFrame;
    int delay;
    boolean disposeBackgroundColor;
    int ih;
    int iw;
    int ix;
    int iy;
    @Keep
    private long mNativePtr;

    public WebpFrame(long j8, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9) {
        this.mNativePtr = j8;
        this.ix = i8;
        this.iy = i9;
        this.iw = i10;
        this.ih = i11;
        this.delay = i12;
        this.blendPreviousFrame = z8;
        this.disposeBackgroundColor = z9;
        fixFrameDuration();
    }

    private void fixFrameDuration() {
        if (this.delay < 20) {
            this.delay = FRAME_DURATION_MS_FOR_MIN;
        }
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native void nativeRenderFrame(int i8, int i9, Bitmap bitmap);

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDurationMs() {
        return this.delay;
    }

    public int getHeight() {
        return this.ih;
    }

    public int getWidth() {
        return this.iw;
    }

    public int getXOffest() {
        return this.ix;
    }

    public int getYOffest() {
        return this.iy;
    }

    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }

    public void renderFrame(int i8, int i9, Bitmap bitmap) {
        nativeRenderFrame(i8, i9, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
