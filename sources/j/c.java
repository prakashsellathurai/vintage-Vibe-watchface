package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.w;
import j0.i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class c extends MenuInflater {
    public static final Class<?>[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f4886f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f4887a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4888b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4889c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4890d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f4891c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f4892a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f4893b;

        public a(Object obj, String str) {
            this.f4892a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4893b = cls.getMethod(str, f4891c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f4893b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f4892a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                }
                method.invoke(obj, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f4894a;

        /* renamed from: b  reason: collision with root package name */
        public int f4895b;

        /* renamed from: c  reason: collision with root package name */
        public int f4896c;

        /* renamed from: d  reason: collision with root package name */
        public int f4897d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4898f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4899g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4900h;

        /* renamed from: i  reason: collision with root package name */
        public int f4901i;

        /* renamed from: j  reason: collision with root package name */
        public int f4902j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f4903k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f4904l;

        /* renamed from: m  reason: collision with root package name */
        public int f4905m;

        /* renamed from: n  reason: collision with root package name */
        public char f4906n;

        /* renamed from: o  reason: collision with root package name */
        public int f4907o;

        /* renamed from: p  reason: collision with root package name */
        public char f4908p;

        /* renamed from: q  reason: collision with root package name */
        public int f4909q;
        public int r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f4910s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f4911t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f4912u;

        /* renamed from: v  reason: collision with root package name */
        public int f4913v;
        public int w;

        /* renamed from: x  reason: collision with root package name */
        public String f4914x;
        public String y;

        /* renamed from: z  reason: collision with root package name */
        public j0.b f4915z;

        public b(Menu menu) {
            this.f4894a = menu;
            this.f4895b = 0;
            this.f4896c = 0;
            this.f4897d = 0;
            this.e = 0;
            this.f4898f = true;
            this.f4899g = true;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, c.this.f4889c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z8 = false;
            menuItem.setChecked(this.f4910s).setVisible(this.f4911t).setEnabled(this.f4912u).setCheckable(this.r >= 1).setTitleCondensed(this.f4904l).setIcon(this.f4905m);
            int i8 = this.f4913v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            String str = this.y;
            c cVar = c.this;
            if (str != null) {
                if (!cVar.f4889c.isRestricted()) {
                    if (cVar.f4890d == null) {
                        cVar.f4890d = c.a(cVar.f4889c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(cVar.f4890d, this.y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof e) {
                    e eVar = (e) menuItem;
                    eVar.f438x = (eVar.f438x & -5) | 4;
                } else if (menuItem instanceof k.c) {
                    k.c cVar2 = (k.c) menuItem;
                    try {
                        Method method = cVar2.e;
                        e0.b bVar = cVar2.f5071d;
                        if (method == null) {
                            cVar2.e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar2.e.invoke(bVar, new Object[]{Boolean.TRUE});
                    } catch (Exception e4) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                    }
                }
            }
            String str2 = this.f4914x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, c.e, cVar.f4887a));
                z8 = true;
            }
            int i9 = this.w;
            if (i9 > 0) {
                if (!z8) {
                    menuItem.setActionView(i9);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            j0.b bVar2 = this.f4915z;
            if (bVar2 != null) {
                if (menuItem instanceof e0.b) {
                    ((e0.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z9 = menuItem instanceof e0.b;
            if (z9) {
                ((e0.b) menuItem).setContentDescription(charSequence);
            } else {
                i.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z9) {
                ((e0.b) menuItem).setTooltipText(charSequence2);
            } else {
                i.m(menuItem, charSequence2);
            }
            char c9 = this.f4906n;
            int i10 = this.f4907o;
            if (z9) {
                ((e0.b) menuItem).setAlphabeticShortcut(c9, i10);
            } else {
                i.g(menuItem, c9, i10);
            }
            char c10 = this.f4908p;
            int i11 = this.f4909q;
            if (z9) {
                ((e0.b) menuItem).setNumericShortcut(c10, i11);
            } else {
                i.k(menuItem, c10, i11);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z9) {
                    ((e0.b) menuItem).setIconTintMode(mode);
                } else {
                    i.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z9) {
                ((e0.b) menuItem).setIconTintList(colorStateList);
            } else {
                i.i(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            e = r0
            f4886f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.<clinit>():void");
    }

    public c(Context context) {
        super(context);
        this.f4889c = context;
        Object[] objArr = {context};
        this.f4887a = objArr;
        this.f4888b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i8;
        j0.b bVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i8 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        while (!z8) {
            if (eventType != 1) {
                Menu menu2 = bVar2.f4894a;
                if (eventType != i8) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z9 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z9 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            i8 = 2;
                        } else if (name2.equals("group")) {
                            bVar2.f4895b = 0;
                            bVar2.f4896c = 0;
                            bVar2.f4897d = 0;
                            bVar2.e = 0;
                            bVar2.f4898f = true;
                            bVar2.f4899g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f4900h) {
                                j0.b bVar3 = bVar2.f4915z;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f4900h = true;
                                    bVar2.b(menu2.add(bVar2.f4895b, bVar2.f4901i, bVar2.f4902j, bVar2.f4903k));
                                } else {
                                    bVar2.f4900h = true;
                                    bVar2.b(menu2.addSubMenu(bVar2.f4895b, bVar2.f4901i, bVar2.f4902j, bVar2.f4903k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z8 = true;
                        }
                    }
                } else if (!z9) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    c cVar = c.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = cVar.f4889c.obtainStyledAttributes(attributeSet2, a1.a.y);
                        bVar2.f4895b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f4896c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f4897d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f4898f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f4899g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = cVar.f4889c;
                            o0 o0Var = new o0(context, context.obtainStyledAttributes(attributeSet2, a1.a.f50z));
                            bVar2.f4901i = o0Var.h(2, 0);
                            bVar2.f4902j = (o0Var.g(5, bVar2.f4896c) & -65536) | (o0Var.g(6, bVar2.f4897d) & 65535);
                            bVar2.f4903k = o0Var.j(7);
                            bVar2.f4904l = o0Var.j(8);
                            bVar2.f4905m = o0Var.h(0, 0);
                            String i9 = o0Var.i(9);
                            bVar2.f4906n = i9 == null ? 0 : i9.charAt(0);
                            bVar2.f4907o = o0Var.g(16, 4096);
                            String i10 = o0Var.i(10);
                            bVar2.f4908p = i10 == null ? 0 : i10.charAt(0);
                            bVar2.f4909q = o0Var.g(20, 4096);
                            bVar2.r = o0Var.k(11) ? o0Var.a(11, false) : bVar2.e;
                            bVar2.f4910s = o0Var.a(3, false);
                            bVar2.f4911t = o0Var.a(4, bVar2.f4898f);
                            bVar2.f4912u = o0Var.a(1, bVar2.f4899g);
                            bVar2.f4913v = o0Var.g(21, -1);
                            bVar2.y = o0Var.i(12);
                            bVar2.w = o0Var.h(13, 0);
                            bVar2.f4914x = o0Var.i(15);
                            String i11 = o0Var.i(14);
                            boolean z10 = i11 != null;
                            if (z10 && bVar2.w == 0 && bVar2.f4914x == null) {
                                bVar = (j0.b) bVar2.a(i11, f4886f, cVar.f4888b);
                            } else {
                                if (z10) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                bVar = null;
                            }
                            bVar2.f4915z = bVar;
                            bVar2.A = o0Var.j(17);
                            bVar2.B = o0Var.j(22);
                            if (o0Var.k(19)) {
                                bVar2.D = w.c(o0Var.g(19, -1), bVar2.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                bVar2.D = null;
                            }
                            if (o0Var.k(18)) {
                                bVar2.C = o0Var.b(18);
                            } else {
                                bVar2.C = colorStateList;
                            }
                            o0Var.m();
                            bVar2.f4900h = false;
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                        } else if (name3.equals("menu")) {
                            bVar2.f4900h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(bVar2.f4895b, bVar2.f4901i, bVar2.f4902j, bVar2.f4903k);
                            bVar2.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            str = name3;
                            z9 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i8 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                eventType = xmlResourceParser.next();
                i8 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i8, Menu menu) {
        if (!(menu instanceof e0.a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f4889c.getResources().getLayout(i8);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e4) {
            throw new InflateException("Error inflating menu XML", e4);
        } catch (IOException e9) {
            throw new InflateException("Error inflating menu XML", e9);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
