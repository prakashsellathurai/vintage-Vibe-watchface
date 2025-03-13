package com.samsung.android.wearable.watchfacestudio.editor;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.transition.Transition;
import android.util.Log;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.health.services.client.R;
import r5.k;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public a f3965a;

    /* renamed from: b  reason: collision with root package name */
    public final EditorActivity f3966b;

    /* renamed from: c  reason: collision with root package name */
    public e f3967c = new androidx.health.services.client.impl.d(9);

    /* renamed from: d  reason: collision with root package name */
    public boolean f3968d;
    public ImageView e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3969f;

    public abstract class a {
        public a() {
            z.this.f3969f = false;
        }

        public final boolean a(ImageView imageView, String str) {
            String str2;
            byte[] byteArrayExtra;
            if (imageView == null) {
                str2 = "ImageView is null. prepare preview failed ";
            } else {
                Intent intent = z.this.f3966b.getIntent();
                if (intent == null || (byteArrayExtra = intent.getByteArrayExtra(str)) == null) {
                    imageView.setVisibility(8);
                    str2 = "prepare preview failed ".concat(str);
                } else {
                    imageView.setImageBitmap(BitmapFactory.decodeByteArray(byteArrayExtra, 0, byteArrayExtra.length));
                    return true;
                }
            }
            Log.e("DWF:LaunchingTransition", str2);
            return false;
        }

        public abstract void b(k kVar);
    }

    public class b extends a {
        public b() {
            super();
            z.this.f3968d = true;
            z.this.f3966b.setTheme(R.style.TransparentBack);
            Log.i("DWF:LaunchingTransition", "EmptyTransition created");
        }

        public final void b(k kVar) {
            z.this.f3967c.a();
        }
    }

    public class c extends a {
        public c() {
            super();
            z.this.f3968d = false;
            EditorActivity editorActivity = z.this.f3966b;
            editorActivity.postponeEnterTransition();
            editorActivity.setContentView((int) R.layout.config_activity_main);
            Log.i("DWF:LaunchingTransition", "SeamlessTransition created");
        }

        public final void b(k kVar) {
            String str;
            z zVar = z.this;
            boolean a9 = a((ImageView) zVar.f3966b.findViewById(R.id.leftPreview), "watchface_preview_left") ? a((ImageView) zVar.f3966b.findViewById(R.id.rightPreview), "watchface_preview_right") : false;
            z zVar2 = z.this;
            if (a9) {
                z.a(zVar2);
                EditorActivity editorActivity = zVar2.f3966b;
                ImageView imageView = (ImageView) editorActivity.findViewById(R.id.watchfaceView);
                zVar2.e = imageView;
                if (a(imageView, "watchface_preview_center")) {
                    editorActivity.startPostponedEnterTransition();
                    return;
                } else {
                    zVar2.f3965a = new d();
                    str = "prepareCenterPreview() failed. use fallback.";
                }
            } else {
                Log.i("DWF:LaunchingTransition", " Side Preview is not ready.");
                if (zVar2.f3966b.isActivityTransitionRunning()) {
                    z.a(zVar2);
                    zVar2.f3966b.startPostponedEnterTransition();
                    str = "wait to finish transition because activity transition is running.";
                } else {
                    zVar2.c();
                    str = "finish transition immediately";
                }
            }
            Log.i("DWF:LaunchingTransition", str);
        }
    }

    public class d extends a {
        public d() {
            super();
            Log.i("DWF:LaunchingTransition", "SeamlessTransitionFallback created");
        }

        public final void b(k kVar) {
            z zVar = z.this;
            Bitmap createBitmap = Bitmap.createBitmap(zVar.e.getWidth(), zVar.e.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float min = ((float) Math.min(zVar.e.getWidth(), zVar.e.getHeight())) / 2.0f;
            Path path = new Path();
            path.addCircle(min, min, min, Path.Direction.CCW);
            canvas.clipPath(path);
            kVar.b(canvas);
            zVar.e.setVisibility(0);
            zVar.e.setImageBitmap(createBitmap);
            zVar.f3966b.startPostponedEnterTransition();
        }
    }

    public interface e {
        void a();
    }

    public z(EditorActivity editorActivity, boolean z8) {
        this.f3966b = editorActivity;
        this.f3965a = z8 ? new c() : new b();
    }

    public static void a(z zVar) {
        Transition sharedElementEnterTransition = zVar.f3966b.getWindow().getSharedElementEnterTransition();
        if (sharedElementEnterTransition != null) {
            sharedElementEnterTransition.setDuration(500).setInterpolator(new PathInterpolator(0.4f, 0.2f, 0.0f, 1.0f)).addListener(new y(zVar));
        } else {
            zVar.c();
        }
    }

    public final void b(k kVar) {
        if (this.f3969f) {
            Log.i("DWF:LaunchingTransition", "LaunchingTransition already started");
            return;
        }
        this.f3969f = true;
        Log.i("DWF:LaunchingTransition", "LaunchingTransition start");
        this.f3965a.b(kVar);
    }

    public final void c() {
        Log.i("DWF:LaunchingTransition", "transitionEnd called. previous status : " + this.f3968d);
        if (!this.f3968d) {
            this.f3968d = true;
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.e.setImageBitmap((Bitmap) null);
            }
            Intent intent = new Intent("com.samsung.android.wearable.sysui.action.UPDATE_WATCH_FACE_PICKER_LIST");
            intent.setComponent(ComponentName.unflattenFromString("com.samsung.android.wearable.sysui/com.google.android.clockwork.sysui.secwatchfaceservice.SecWatchFacePreviewUpdateBroadCastReceiver"));
            this.f3966b.sendBroadcast(intent);
            this.f3967c.a();
        }
    }
}
