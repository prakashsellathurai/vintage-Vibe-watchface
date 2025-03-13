package com.bumptech.glide.integration.webp;

import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import k3.j;

@Keep
public class WebpImage {
    private int mBackgroundColor;
    private int mDurationMs;
    private int mFrameCount;
    private int[] mFrameDurations;
    private int mHeigth;
    private int mLoopCount;
    @Keep
    private long mNativePtr;
    private int mWidth;

    static {
        System.loadLibrary("glide-webp");
    }

    @Keep
    public WebpImage(long j8, int i8, int i9, int i10, int i11, int[] iArr, int i12, int i13) {
        if (j8 != 0) {
            this.mWidth = i8;
            this.mHeigth = i9;
            this.mFrameCount = i10;
            this.mDurationMs = i11;
            this.mFrameDurations = iArr;
            this.mLoopCount = i12;
            fixFrameDurations(iArr);
            this.mBackgroundColor = i13;
            this.mNativePtr = j8;
            return;
        }
        throw new RuntimeException("internal error: native WebpImage is 0");
    }

    public static WebpImage create(byte[] bArr) {
        j.l(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    private void fixFrameDurations(int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (iArr[i8] < 20) {
                iArr[i8] = 100;
            }
        }
    }

    private static native WebpImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native WebpFrame nativeGetFrame(int i8);

    private native int nativeGetSizeInBytes();

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getDuration() {
        return this.mDurationMs;
    }

    public WebpFrame getFrame(int i8) {
        return nativeGetFrame(i8);
    }

    public int getFrameCount() {
        return this.mFrameCount;
    }

    public int[] getFrameDurations() {
        return this.mFrameDurations;
    }

    public a getFrameInfo(int i8) {
        WebpFrame frame = getFrame(i8);
        try {
            return new a(i8, frame);
        } finally {
            frame.dispose();
        }
    }

    public int getHeight() {
        return this.mHeigth;
    }

    public int getLoopCount() {
        return this.mLoopCount;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return this.mWidth;
    }
}
