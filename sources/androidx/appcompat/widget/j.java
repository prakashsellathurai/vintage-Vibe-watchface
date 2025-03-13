package androidx.appcompat.widget;

import a1.a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.health.services.client.R;
import j0.d;
import j0.r;
import j0.x;
import n0.n;

public class j extends EditText implements r {

    /* renamed from: a  reason: collision with root package name */
    public final e f744a;

    /* renamed from: b  reason: collision with root package name */
    public final q f745b;

    /* renamed from: c  reason: collision with root package name */
    public final n f746c;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.editTextStyle);
        l0.a(context);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f744a = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        q qVar = new q(this);
        this.f745b = qVar;
        qVar.d(attributeSet, R.attr.editTextStyle);
        qVar.b();
        this.f746c = new n();
    }

    public final d a(d dVar) {
        return this.f746c.a(this, dVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f744a;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f745b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f744a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f744a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public Editable getText() {
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f745b.getClass();
        a.D(onCreateInputConnection, editorInfo, this);
        String[] c9 = x.c(this);
        if (onCreateInputConnection == null || c9 == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = c9;
        return new m0.a(onCreateInputConnection, new o(this));
    }

    /* JADX INFO: finally extract failed */
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z8 = false;
        if (dragEvent.getLocalState() == null && x.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    x.f(this, (Build.VERSION.SDK_INT >= 31 ? new d.a(clipData, 3) : new d.c(clipData, 3)).build());
                    endBatchEdit();
                    z8 = true;
                } catch (Throwable th) {
                    endBatchEdit();
                    throw th;
                }
            }
        }
        if (z8) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i8) {
        int i9 = 0;
        if ((i8 == 16908322 || i8 == 16908337) && x.c(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                d.b aVar = Build.VERSION.SDK_INT >= 31 ? new d.a(primaryClip, 1) : new d.c(primaryClip, 1);
                if (i8 != 16908322) {
                    i9 = 1;
                }
                aVar.b(i9);
                x.f(this, aVar.build());
            }
            i9 = 1;
        }
        if (i9 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f744a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f744a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f744a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f744a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        q qVar = this.f745b;
        if (qVar != null) {
            qVar.e(context, i8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }
}
