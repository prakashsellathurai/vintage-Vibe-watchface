package j0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f4948a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f4949b;

    /* renamed from: c  reason: collision with root package name */
    public final View f4950c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4951d;
    public int[] e;

    public l(View view) {
        this.f4950c = view;
    }

    public final boolean a(float f9, float f10, boolean z8) {
        ViewParent f11;
        if (!this.f4951d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return b0.a(f11, this.f4950c, f9, f10, z8);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public final boolean b(float f9, float f10) {
        ViewParent f11;
        if (!this.f4951d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return b0.b(f11, this.f4950c, f9, f10);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public final boolean c(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        ViewParent f9;
        int i11;
        int i12;
        int[] iArr3;
        int i13 = i8;
        int i14 = i9;
        int[] iArr4 = iArr2;
        int i15 = i10;
        if (!this.f4951d || (f9 = f(i15)) == null) {
            return false;
        }
        if (i13 != 0 || i14 != 0) {
            View view = this.f4950c;
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                int i16 = iArr4[0];
                i11 = iArr4[1];
                i12 = i16;
            } else {
                i12 = 0;
                i11 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view2 = this.f4950c;
            if (f9 instanceof m) {
                ((m) f9).c(view2, i8, i9, iArr3, i10);
            } else if (i15 == 0) {
                try {
                    b0.c(f9, view2, i8, i9, iArr3);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onNestedPreScroll", e4);
                }
            }
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i12;
                iArr4[1] = iArr4[1] - i11;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i8, int i9, int i10, int[] iArr) {
        e(0, i8, 0, i9, (int[]) null, i10, iArr);
    }

    public final boolean e(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent f9;
        int i13;
        int i14;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i15 = i12;
        if (!this.f4951d || (f9 = f(i15)) == null) {
            return false;
        }
        if (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        View view = this.f4950c;
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            i14 = iArr4[0];
            i13 = iArr4[1];
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f4950c;
        if (f9 instanceof n) {
            ((n) f9).e(view2, i8, i9, i10, i11, i12, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i10;
            iArr3[1] = iArr3[1] + i11;
            if (f9 instanceof m) {
                ((m) f9).f(view2, i8, i9, i10, i11, i12);
            } else if (i15 == 0) {
                try {
                    b0.d(f9, view2, i8, i9, i10, i11);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onNestedScroll", e4);
                }
            }
        }
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i14;
            iArr4[1] = iArr4[1] - i13;
        }
        return true;
    }

    public final ViewParent f(int i8) {
        if (i8 == 0) {
            return this.f4948a;
        }
        if (i8 != 1) {
            return null;
        }
        return this.f4949b;
    }

    public final boolean g(int i8, int i9) {
        boolean z8;
        if (f(i9) != null) {
            return true;
        }
        if (this.f4951d) {
            View view = this.f4950c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z9 = parent instanceof m;
                if (z9) {
                    z8 = ((m) parent).g(view2, view, i8, i9);
                } else {
                    if (i9 == 0) {
                        try {
                            z8 = b0.f(parent, view2, view, i8);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    z8 = false;
                }
                if (z8) {
                    if (i9 == 0) {
                        this.f4948a = parent;
                    } else if (i9 == 1) {
                        this.f4949b = parent;
                    }
                    if (z9) {
                        ((m) parent).a(view2, view, i8, i9);
                    } else if (i9 == 0) {
                        try {
                            b0.e(parent, view2, view, i8);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i8) {
        ViewParent f9 = f(i8);
        if (f9 != null) {
            boolean z8 = f9 instanceof m;
            View view = this.f4950c;
            if (z8) {
                ((m) f9).b(view, i8);
            } else if (i8 == 0) {
                try {
                    b0.g(f9, view);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i8 == 0) {
                this.f4948a = null;
            } else if (i8 == 1) {
                this.f4949b = null;
            }
        }
    }
}
