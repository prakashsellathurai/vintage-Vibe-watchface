package com.bumptech.glide.integration.webp;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f2945a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2946b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2947c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2948d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2949f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2950g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2951h;

    public a(int i8, WebpFrame webpFrame) {
        this.f2945a = i8;
        this.f2946b = webpFrame.getXOffest();
        this.f2947c = webpFrame.getYOffest();
        this.f2948d = webpFrame.getWidth();
        this.e = webpFrame.getHeight();
        this.f2949f = webpFrame.getDurationMs();
        this.f2950g = webpFrame.isBlendWithPreviousFrame();
        this.f2951h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public final String toString() {
        return "frameNumber=" + this.f2945a + ", xOffset=" + this.f2946b + ", yOffset=" + this.f2947c + ", width=" + this.f2948d + ", height=" + this.e + ", duration=" + this.f2949f + ", blendPreviousFrame=" + this.f2950g + ", disposeBackgroundColor=" + this.f2951h;
    }
}
