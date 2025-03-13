package u1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.wear.watchface.style.data.BooleanOptionWireFormat;
import androidx.wear.watchface.style.data.BooleanUserStyleSettingWireFormat;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import androidx.wear.watchface.style.data.ComplicationsOptionWireFormat;
import androidx.wear.watchface.style.data.ComplicationsUserStyleSettingWireFormat;
import androidx.wear.watchface.style.data.DoubleRangeOptionWireFormat;
import androidx.wear.watchface.style.data.DoubleRangeUserStyleSettingWireFormat;
import androidx.wear.watchface.style.data.ListOptionWireFormat;
import androidx.wear.watchface.style.data.ListUserStyleSettingWireFormat;
import androidx.wear.watchface.style.data.LongRangeOptionWireFormat;
import androidx.wear.watchface.style.data.LongRangeUserStyleSettingWireFormat;
import androidx.wear.watchface.style.data.OptionWireFormat;
import androidx.wear.watchface.style.data.PerComplicationTypeMargins;
import androidx.wear.watchface.style.data.UserStyleSettingWireFormat;
import i7.k;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import p7.l;
import p7.p;
import p7.q;
import p7.r;
import u1.c;

public abstract class m {

    /* renamed from: j  reason: collision with root package name */
    public static final b f7640j = new b();

    /* renamed from: a  reason: collision with root package name */
    public final e f7641a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7642b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7643c;

    /* renamed from: d  reason: collision with root package name */
    public final Icon f7644d;
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f7645f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7646g;

    /* renamed from: h  reason: collision with root package name */
    public final Collection<s> f7647h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7648i;

    public static final class a extends m {

        /* renamed from: k  reason: collision with root package name */
        public static final b f7649k = new b();

        /* renamed from: u1.m$a$a  reason: collision with other inner class name */
        public static final class C0128a extends h {

            /* renamed from: d  reason: collision with root package name */
            public static final C0128a f7650d = new C0128a(true);
            public static final C0128a e = new C0128a(false);

            /* renamed from: c  reason: collision with root package name */
            public final boolean f7651c;

            public C0128a(boolean z8) {
                super(new h.a(new byte[]{z8 ? (byte) 1 : 0}), k.f4879f);
                this.f7651c = z8;
            }

            public final Class<? extends m> d() {
                return a.class;
            }

            public final OptionWireFormat e() {
                return new BooleanOptionWireFormat(this.f7694a.f7696a);
            }

            public final void f(DataOutputStream dataOutputStream) {
                dataOutputStream.write(this.f7694a.f7696a);
                dataOutputStream.writeBoolean(this.f7651c);
            }

            public final String toString() {
                return this.f7694a.f7696a[0] == 1 ? "true" : "false";
            }
        }

        public static final class b {

            /* renamed from: u1.m$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C0129a extends q7.j implements l<String, Boolean> {

                /* renamed from: o  reason: collision with root package name */
                public static final C0129a f7652o = new C0129a();

                public C0129a() {
                    super(1, w7.c.class, "toBoolean", "toBooleanNullable(Ljava/lang/String;)Z", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Boolean.valueOf(Boolean.parseBoolean(str));
                }
            }

            /* renamed from: u1.m$a$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C0130b extends q7.j implements p<Resources, XmlResourceParser, a> {
                public C0130b(Object obj) {
                    super(2, obj, b.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;)Landroidx/wear/watchface/style/UserStyleSetting$BooleanUserStyleSetting;");
                }

                public final Object g(Object obj, Object obj2) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    return ((b) this.f6630g).a(resources, xmlResourceParser);
                }
            }

            @SuppressLint({"ResourceType"})
            public final a a(Resources resources, XmlResourceParser xmlResourceParser) {
                Boolean bool;
                q7.k.e(resources, "resources");
                q7.k.e(xmlResourceParser, "parser");
                a aVar = (a) b.e(resources, xmlResourceParser, "BooleanUserStyleSetting", new C0130b(this));
                C0129a aVar2 = C0129a.f7652o;
                if (aVar != null) {
                    h hVar = aVar.f7645f.get(aVar.f7646g);
                    q7.k.c(hVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.BooleanUserStyleSetting.BooleanOption");
                    bool = Boolean.valueOf(((C0128a) hVar).f7651c);
                } else {
                    bool = null;
                }
                boolean booleanValue = ((Boolean) r.a(xmlResourceParser, "defaultBoolean", aVar2, bool, "BooleanUserStyleSetting")).booleanValue();
                b.a a9 = m.f7640j.a(resources, xmlResourceParser, aVar, false, (h7.d<String, ? extends p<? super Resources, ? super XmlResourceParser, ? extends h>>) null);
                return new a(a9.f7653a, a9.f7654b, a9.f7655c, a9.f7656d, a9.e, (Collection<? extends s>) a9.f7659h, booleanValue);
            }
        }

        public a() {
            throw null;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(u1.m.e r13, android.content.res.Resources r14, int r15, int r16, android.graphics.drawable.Icon r17, java.util.List r18, boolean r19) {
            /*
                r12 = this;
                r0 = r14
                r1 = r19
                java.lang.String r2 = "resources"
                q7.k.e(r14, r2)
                java.lang.String r2 = "affectsWatchFaceLayers"
                r11 = r18
                q7.k.e(r11, r2)
                r8 = 0
                u1.c$c r5 = new u1.c$c
                r2 = r15
                r5.<init>(r14, r15)
                u1.c$c r6 = new u1.c$c
                r2 = r16
                r6.<init>(r14, r2)
                r0 = 2
                u1.m$a$a[] r0 = new u1.m.a.C0128a[r0]
                u1.m$a$a r2 = u1.m.a.C0128a.f7650d
                r3 = 0
                r0[r3] = r2
                u1.m$a$a r2 = u1.m.a.C0128a.e
                r4 = 1
                r0[r4] = r2
                java.util.List r9 = a1.a.B(r0)
                if (r1 != r4) goto L_0x0032
                r10 = r3
                goto L_0x0035
            L_0x0032:
                if (r1 != 0) goto L_0x003f
                r10 = r4
            L_0x0035:
                r3 = r12
                r4 = r13
                r7 = r17
                r11 = r18
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            L_0x003f:
                c1.c r0 = new c1.c
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.a.<init>(u1.m$e, android.content.res.Resources, int, int, android.graphics.drawable.Icon, java.util.List, boolean):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(u1.m.e r12, u1.c r13, u1.c r14, android.graphics.drawable.Icon r15, u1.m.i r16, java.util.Collection<? extends u1.s> r17, boolean r18) {
            /*
                r11 = this;
                r0 = r18
                java.lang.String r1 = "id"
                r3 = r12
                q7.k.e(r12, r1)
                java.lang.String r1 = "displayName"
                r4 = r13
                q7.k.e(r13, r1)
                java.lang.String r1 = "description"
                r5 = r14
                q7.k.e(r14, r1)
                java.lang.String r1 = "affectsWatchFaceLayers"
                r10 = r17
                q7.k.e(r10, r1)
                r1 = 2
                u1.m$a$a[] r1 = new u1.m.a.C0128a[r1]
                u1.m$a$a r2 = u1.m.a.C0128a.f7650d
                r6 = 0
                r1[r6] = r2
                u1.m$a$a r2 = u1.m.a.C0128a.e
                r7 = 1
                r1[r7] = r2
                java.util.List r8 = a1.a.B(r1)
                if (r0 != r7) goto L_0x0030
                r9 = r6
                goto L_0x0033
            L_0x0030:
                if (r0 != 0) goto L_0x0040
                r9 = r7
            L_0x0033:
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r10 = r17
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            L_0x0040:
                c1.c r0 = new c1.c
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.a.<init>(u1.m$e, u1.c, u1.c, android.graphics.drawable.Icon, u1.m$i, java.util.Collection, boolean):void");
        }

        public final UserStyleSettingWireFormat f() {
            String str = this.f7641a.f7683a;
            CharSequence c9 = c();
            CharSequence b9 = b();
            Icon icon = this.f7644d;
            ArrayList e = e();
            int i8 = this.f7646g;
            Collection<s> collection = this.f7647h;
            ArrayList arrayList = new ArrayList(i7.f.M(collection));
            for (s ordinal : collection) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            i iVar = this.e;
            return new BooleanUserStyleSettingWireFormat(str, c9, b9, icon, e, i8, arrayList, iVar != null ? iVar.a() : null);
        }
    }

    public static final class b {

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final e f7653a;

            /* renamed from: b  reason: collision with root package name */
            public final c f7654b;

            /* renamed from: c  reason: collision with root package name */
            public final c f7655c;

            /* renamed from: d  reason: collision with root package name */
            public final Icon f7656d;
            public final i e;

            /* renamed from: f  reason: collision with root package name */
            public final List<h> f7657f;

            /* renamed from: g  reason: collision with root package name */
            public final Integer f7658g;

            /* renamed from: h  reason: collision with root package name */
            public final Collection<s> f7659h;

            public a(e eVar, c cVar, c cVar2, Icon icon, i iVar, List<? extends h> list, Integer num, Collection<? extends s> collection) {
                q7.k.e(list, "options");
                q7.k.e(collection, "affectedWatchFaceLayers");
                this.f7653a = eVar;
                this.f7654b = cVar;
                this.f7655c = cVar2;
                this.f7656d = icon;
                this.e = iVar;
                this.f7657f = list;
                this.f7658g = num;
                this.f7659h = collection;
            }
        }

        /* renamed from: u1.m$b$b  reason: collision with other inner class name */
        public static final class C0131b extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ XmlResourceParser f7660f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ q7.p<i> f7661g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ Resources f7662h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ h7.d<String, p<Resources, XmlResourceParser, h>> f7663i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ ArrayList<h> f7664j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0131b(XmlResourceParser xmlResourceParser, q7.p<i> pVar, Resources resources, h7.d<String, ? extends p<? super Resources, ? super XmlResourceParser, ? extends h>> dVar, ArrayList<h> arrayList) {
                super(0);
                this.f7660f = xmlResourceParser;
                this.f7661g = pVar;
                this.f7662h = resources;
                this.f7663i = dVar;
                this.f7664j = arrayList;
            }

            public final Object invoke() {
                XmlResourceParser xmlResourceParser = this.f7660f;
                boolean a9 = q7.k.a(xmlResourceParser.getName(), "OnWatchEditorData");
                Resources resources = this.f7662h;
                if (a9) {
                    q7.p<i> pVar = this.f7661g;
                    if (pVar.f6643f == null) {
                        q7.k.e(resources, "resources");
                        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "icon", -1);
                        pVar.f6643f = new i(attributeResourceValue != -1 ? Icon.createWithResource(resources.getResourcePackageName(attributeResourceValue), attributeResourceValue) : null);
                    } else {
                        throw new p1.h(xmlResourceParser);
                    }
                } else {
                    h7.d<String, p<Resources, XmlResourceParser, h>> dVar = this.f7663i;
                    if (dVar == null || !q7.k.a(dVar.f4781f, xmlResourceParser.getName())) {
                        throw new p1.h(xmlResourceParser);
                    }
                    this.f7664j.add(((p) dVar.f4782g).g(resources, xmlResourceParser));
                }
                return h7.h.f4787a;
            }
        }

        public static final class c extends q7.l implements l<String, Collection<? extends s>> {

            /* renamed from: f  reason: collision with root package name */
            public static final c f7665f = new c();

            public c() {
                super(1);
            }

            public final Object invoke(Object obj) {
                String str = (String) obj;
                q7.k.e(str, "value");
                Integer decode = Integer.decode(str);
                q7.k.d(decode, "decode(value)");
                int intValue = decode.intValue();
                HashSet hashSet = new HashSet();
                if ((intValue & 1) != 0) {
                    hashSet.add(s.f7716g);
                }
                if ((intValue & 2) != 0) {
                    hashSet.add(s.f7717h);
                }
                if ((intValue & 4) != 0) {
                    hashSet.add(s.f7718i);
                }
                return hashSet;
            }
        }

        public /* synthetic */ class d extends q7.j implements l<String, Integer> {

            /* renamed from: o  reason: collision with root package name */
            public static final d f7666o = new d();

            public d() {
                super(1, w7.c.class, "toInt", "toInt(Ljava/lang/String;)I", 1);
            }

            public final Object invoke(Object obj) {
                String str = (String) obj;
                q7.k.e(str, "p0");
                return Integer.valueOf(Integer.parseInt(str));
            }
        }

        public static c b(Resources resources, XmlResourceParser xmlResourceParser, String str, c cVar, boolean z8) {
            q7.k.e(resources, "resources");
            q7.k.e(xmlResourceParser, "parser");
            int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", str, -1);
            if (attributeResourceValue != -1) {
                return z8 ? new c.C0127c(resources, attributeResourceValue) : new c.b(resources, attributeResourceValue);
            } else if (!k3.j.F(xmlResourceParser, str) && cVar != null) {
                return cVar;
            } else {
                String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
                if (attributeValue == null) {
                    attributeValue = "";
                }
                return new c.a(attributeValue);
            }
        }

        public static /* synthetic */ c c(b bVar, Resources resources, XmlResourceParser xmlResourceParser, String str, c cVar, boolean z8, int i8) {
            if ((i8 & 8) != 0) {
                cVar = null;
            }
            if ((i8 & 16) != 0) {
                z8 = false;
            }
            bVar.getClass();
            return b(resources, xmlResourceParser, str, cVar, z8);
        }

        public static Icon d(Resources resources, XmlResourceParser xmlResourceParser) {
            q7.k.e(resources, "resources");
            q7.k.e(xmlResourceParser, "parser");
            int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "icon", -1);
            if (attributeResourceValue != -1) {
                return Icon.createWithResource(resources.getResourcePackageName(attributeResourceValue), attributeResourceValue);
            }
            return null;
        }

        public static Object e(Resources resources, XmlResourceParser xmlResourceParser, String str, p pVar) {
            q7.k.e(resources, "resources");
            q7.k.e(xmlResourceParser, "parser");
            int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "parent", 0);
            if (attributeResourceValue == 0) {
                return null;
            }
            XmlResourceParser xml = resources.getXml(attributeResourceValue);
            q7.k.d(xml, "resources.getXml(parentRef)");
            k3.j.M(xml, str);
            return pVar.g(resources, xml);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
            r0 = r9.f7641a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final u1.m.b.a a(android.content.res.Resources r22, android.content.res.XmlResourceParser r23, u1.m r24, boolean r25, h7.d<java.lang.String, ? extends p7.p<? super android.content.res.Resources, ? super android.content.res.XmlResourceParser, ? extends u1.m.h>> r26) {
            /*
                r21 = this;
                r7 = r22
                r8 = r23
                r9 = r24
                java.lang.String r0 = "resources"
                q7.k.e(r7, r0)
                java.lang.String r0 = "parser"
                q7.k.e(r8, r0)
                java.lang.String r0 = "id"
                java.lang.String r0 = k3.j.B(r7, r8, r0)
                r10 = 0
                if (r0 != 0) goto L_0x002e
                if (r9 == 0) goto L_0x0022
                u1.m$e r0 = r9.f7641a
                if (r0 == 0) goto L_0x0022
                java.lang.String r0 = r0.f7683a
                goto L_0x0023
            L_0x0022:
                r0 = r10
            L_0x0023:
                if (r0 == 0) goto L_0x0026
                goto L_0x002e
            L_0x0026:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "UserStyleSetting must have id"
                r0.<init>(r1)
                throw r0
            L_0x002e:
                r11 = r0
                java.lang.String r3 = "displayName"
                if (r9 == 0) goto L_0x0037
                u1.c r0 = r9.f7642b
                r4 = r0
                goto L_0x0038
            L_0x0037:
                r4 = r10
            L_0x0038:
                r5 = 0
                r6 = 16
                r0 = r21
                r1 = r22
                r2 = r23
                u1.c r14 = c(r0, r1, r2, r3, r4, r5, r6)
                java.lang.String r3 = "description"
                if (r9 == 0) goto L_0x004d
                u1.c r0 = r9.f7643c
                r4 = r0
                goto L_0x004e
            L_0x004d:
                r4 = r10
            L_0x004e:
                r5 = 0
                r6 = 16
                r0 = r21
                r1 = r22
                r2 = r23
                u1.c r15 = c(r0, r1, r2, r3, r4, r5, r6)
                android.graphics.drawable.Icon r0 = d(r22, r23)
                if (r0 != 0) goto L_0x0069
                if (r9 == 0) goto L_0x0066
                android.graphics.drawable.Icon r0 = r9.f7644d
                goto L_0x0069
            L_0x0066:
                r16 = r10
                goto L_0x006b
            L_0x0069:
                r16 = r0
            L_0x006b:
                java.lang.String r0 = "UserStyleSetting"
                if (r25 == 0) goto L_0x0086
                u1.m$b$d r1 = u1.m.b.d.f7666o
                if (r9 == 0) goto L_0x0076
                int r2 = r9.f7646g
                goto L_0x0077
            L_0x0076:
                r2 = 0
            L_0x0077:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "defaultOptionIndex"
                java.lang.Object r1 = u1.r.a(r8, r3, r1, r2, r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                r19 = r1
                goto L_0x0088
            L_0x0086:
                r19 = r10
            L_0x0088:
                if (r9 == 0) goto L_0x008e
                java.util.Collection<u1.s> r1 = r9.f7647h
                if (r1 != 0) goto L_0x0090
            L_0x008e:
                java.util.Set<u1.s> r1 = u1.s.f7715f
            L_0x0090:
                java.lang.String r2 = "affectedWatchFaceLayers"
                u1.m$b$c r3 = u1.m.b.c.f7665f
                java.lang.Object r0 = u1.r.a(r8, r2, r3, r1, r0)
                r20 = r0
                java.util.Collection r20 = (java.util.Collection) r20
                q7.p r6 = new q7.p
                r6.<init>()
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                u1.m$b$b r13 = new u1.m$b$b
                r0 = r13
                r1 = r23
                r2 = r6
                r3 = r22
                r4 = r26
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                k3.j.J(r8, r13)
                u1.m$b$a r0 = new u1.m$b$a
                u1.m$e r13 = new u1.m$e
                r13.<init>(r11)
                T r1 = r6.f6643f
                u1.m$i r1 = (u1.m.i) r1
                if (r1 != 0) goto L_0x00cb
                if (r9 == 0) goto L_0x00c8
                u1.m$i r10 = r9.e
            L_0x00c8:
                r17 = r10
                goto L_0x00cd
            L_0x00cb:
                r17 = r1
            L_0x00cd:
                if (r9 == 0) goto L_0x00dd
                boolean r1 = r12.isEmpty()
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x00d8
                goto L_0x00dd
            L_0x00d8:
                java.util.List<u1.m$h> r1 = r9.f7645f
                r18 = r1
                goto L_0x00df
            L_0x00dd:
                r18 = r12
            L_0x00df:
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.b.a(android.content.res.Resources, android.content.res.XmlResourceParser, u1.m, boolean, h7.d):u1.m$b$a");
        }
    }

    public static final class c extends m {

        /* renamed from: k  reason: collision with root package name */
        public static final a f7667k = new a();

        public static final class a {

            /* renamed from: u1.m$c$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0132a extends q7.j implements r<Resources, XmlResourceParser, Float, Float, c> {
                public C0132a(Object obj) {
                    super(4, obj, a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;FF)Landroidx/wear/watchface/style/UserStyleSetting$ComplicationSlotsUserStyleSetting;");
                }

                public final Object j(Object obj, Object obj2, Float f9, Float f10) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    float floatValue = f9.floatValue();
                    float floatValue2 = f10.floatValue();
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    return ((a) this.f6630g).a(resources, xmlResourceParser, floatValue, floatValue2);
                }
            }

            public /* synthetic */ class b extends q7.j implements r<Resources, XmlResourceParser, Float, Float, C0133c> {
                public b(Object obj) {
                    super(4, obj, C0133c.a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;FF)Landroidx/wear/watchface/style/UserStyleSetting$ComplicationSlotsUserStyleSetting$ComplicationSlotsOption;");
                }

                public final Object j(Object obj, Object obj2, Float f9, Float f10) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    float floatValue = f9.floatValue();
                    float floatValue2 = f10.floatValue();
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    ((C0133c.a) this.f6630g).getClass();
                    String B = k3.j.B(resources, xmlResourceParser, "id");
                    if (B != null) {
                        c c9 = b.c(m.f7640j, resources, xmlResourceParser, "displayName", (c) null, true, 8);
                        c b9 = b.b(resources, xmlResourceParser, "nameForScreenReaders", c9, true);
                        Icon d9 = b.d(resources, xmlResourceParser);
                        q7.p pVar = new q7.p();
                        ArrayList arrayList = new ArrayList();
                        k3.j.J(xmlResourceParser, new o(xmlResourceParser, arrayList, resources, floatValue, floatValue2, pVar));
                        return new C0133c(new h.a(B), c9, b9, d9, (i) pVar.f6643f, arrayList);
                    }
                    throw new IllegalArgumentException("ComplicationSlotsOption must have an id".toString());
                }
            }

            @SuppressLint({"ResourceType"})
            public final c a(Resources resources, XmlResourceParser xmlResourceParser, float f9, float f10) {
                q7.k.e(resources, "resources");
                q7.k.e(xmlResourceParser, "parser");
                b.a a9 = m.f7640j.a(resources, xmlResourceParser, (m) b.e(resources, xmlResourceParser, "ComplicationSlotsUserStyleSetting", new n(new C0132a(this), f9, f10)), true, new h7.d("ComplicationSlotsOption", new n(new b(C0133c.f7673h), f9, f10)));
                e eVar = a9.f7653a;
                c cVar = a9.f7654b;
                c cVar2 = a9.f7655c;
                Icon icon = a9.f7656d;
                i iVar = a9.e;
                List<h> list = a9.f7657f;
                q7.k.c(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.wear.watchface.style.UserStyleSetting.ComplicationSlotsUserStyleSetting.ComplicationSlotsOption>");
                Collection<s> collection = a9.f7659h;
                Integer num = a9.f7658g;
                q7.k.b(num);
                return new c(eVar, cVar, cVar2, icon, iVar, list, collection, num.intValue());
            }
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final int f7668a;

            /* renamed from: b  reason: collision with root package name */
            public final Boolean f7669b;

            /* renamed from: c  reason: collision with root package name */
            public final p1.f f7670c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f7671d;
            public final Integer e;

            /* renamed from: f  reason: collision with root package name */
            public final Integer f7672f;

            public b(int i8, Boolean bool, p1.f fVar, Integer num, Integer num2, Integer num3) {
                this.f7668a = i8;
                this.f7669b = bool;
                this.f7670c = fVar;
                this.f7671d = num;
                this.e = num2;
                this.f7672f = num3;
                boolean z8 = false;
                if (num2 == null || num2.intValue() != 0) {
                    if (!((num3 == null || num3.intValue() != 0) ? true : z8)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!q7.k.a(b.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ComplicationSlotsUserStyleSetting.ComplicationSlotOverlay");
                b bVar = (b) obj;
                return this.f7668a == bVar.f7668a && q7.k.a(this.f7669b, bVar.f7669b) && q7.k.a(this.f7670c, bVar.f7670c) && q7.k.a(this.f7671d, bVar.f7671d) && q7.k.a(this.e, bVar.e) && q7.k.a(this.f7672f, bVar.f7672f);
            }

            public final int hashCode() {
                int i8 = this.f7668a * 31;
                int i9 = 0;
                Boolean bool = this.f7669b;
                int hashCode = (i8 + (bool != null ? bool.hashCode() : 0)) * 31;
                p1.f fVar = this.f7670c;
                int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
                Integer num = this.f7671d;
                int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
                Integer num2 = this.e;
                int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
                Integer num3 = this.f7672f;
                if (num3 != null) {
                    i9 = num3.intValue();
                }
                return intValue2 + i9;
            }

            public final String toString() {
                return "ComplicationSlotOverlay(complicationSlotId=" + this.f7668a + ", enabled=" + this.f7669b + ", complicationSlotBounds=" + this.f7670c + ", accessibilityTraversalIndex=" + this.f7671d + ", nameResourceId=" + this.e + ", screenReaderNameResourceId=" + this.f7672f + ')';
            }
        }

        /* renamed from: u1.m$c$c  reason: collision with other inner class name */
        public static final class C0133c extends h {

            /* renamed from: h  reason: collision with root package name */
            public static final a f7673h = new a();

            /* renamed from: c  reason: collision with root package name */
            public final Collection<b> f7674c;

            /* renamed from: d  reason: collision with root package name */
            public final c f7675d;
            public c e;

            /* renamed from: f  reason: collision with root package name */
            public final Icon f7676f;

            /* renamed from: g  reason: collision with root package name */
            public final i f7677g;

            /* renamed from: u1.m$c$c$a */
            public static final class a {
            }

            public C0133c(h.a aVar, c cVar, c cVar2, Icon icon, i iVar, ArrayList arrayList) {
                super(aVar, k.f4879f);
                this.f7674c = arrayList;
                this.f7675d = cVar;
                this.e = cVar2;
                this.f7676f = icon;
                this.f7677g = iVar;
            }

            public final int a(Context context) {
                h.a aVar = this.f7694a;
                int length = aVar.f7696a.length + this.f7675d.a().length();
                c cVar = this.e;
                CharSequence a9 = cVar != null ? cVar.a() : null;
                if (a9 != null) {
                    a9.length();
                }
                for (b bVar : this.f7674c) {
                    p1.f fVar = bVar.f7670c;
                    int i8 = 16;
                    if (fVar != null) {
                        i8 = 16 + (fVar.f6279a.size() * 20);
                    }
                    length += i8;
                }
                Icon icon = this.f7676f;
                if (icon != null) {
                    t b9 = r.b(icon, context);
                    Integer num = b9.f7720a;
                    if (num != null) {
                        length += num.intValue();
                    }
                    int i9 = b9.f7722c;
                    int i10 = b9.f7721b;
                    if (!(i10 <= 400 && i9 <= 400)) {
                        throw new IllegalArgumentException(("ComplicationSlotsOption id " + aVar + " has a " + i10 + " x " + i9 + " icon. This is too big, the maximum size is 400 x 400.").toString());
                    }
                }
                return length;
            }

            public final c b() {
                return this.f7675d;
            }

            public final c c() {
                return this.e;
            }

            public final Class<? extends m> d() {
                return c.class;
            }

            public final OptionWireFormat e() {
                Map map;
                Map<q1.d, RectF> map2;
                LinkedHashMap linkedHashMap;
                Map<q1.d, RectF> map3;
                byte[] bArr = this.f7694a.f7696a;
                CharSequence a9 = this.f7675d.a();
                Icon icon = this.f7676f;
                Collection<b> collection = this.f7674c;
                ArrayList arrayList = new ArrayList(i7.f.M(collection));
                for (b bVar : collection) {
                    p1.f fVar = bVar.f7670c;
                    if (fVar == null || (map3 = fVar.f6279a) == null) {
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = new LinkedHashMap(a1.a.C(map3.size()));
                        for (Map.Entry entry : map3.entrySet()) {
                            linkedHashMap.put(Integer.valueOf(((q1.d) entry.getKey()).f6450f), entry.getValue());
                        }
                    }
                    arrayList.add(new ComplicationOverlayWireFormat(bVar.f7668a, bVar.f7669b, linkedHashMap, bVar.f7671d));
                }
                ComplicationOverlayWireFormat[] complicationOverlayWireFormatArr = (ComplicationOverlayWireFormat[]) arrayList.toArray(new ComplicationOverlayWireFormat[0]);
                ArrayList arrayList2 = new ArrayList(i7.f.M(collection));
                for (b bVar2 : collection) {
                    p1.f fVar2 = bVar2.f7670c;
                    if (fVar2 == null || (map2 = fVar2.f6280b) == null) {
                        map = i7.l.f4880f;
                    } else {
                        map = new LinkedHashMap(a1.a.C(map2.size()));
                        for (Map.Entry entry2 : map2.entrySet()) {
                            map.put(Integer.valueOf(((q1.d) entry2.getKey()).f6450f), entry2.getValue());
                        }
                    }
                    arrayList2.add(new PerComplicationTypeMargins(map));
                }
                ArrayList arrayList3 = new ArrayList(i7.f.M(collection));
                for (b bVar3 : collection) {
                    Integer num = bVar3.e;
                    arrayList3.add(Integer.valueOf(num != null ? num.intValue() : 0));
                }
                ArrayList arrayList4 = new ArrayList(i7.f.M(collection));
                for (b bVar4 : collection) {
                    Integer num2 = bVar4.f7672f;
                    arrayList4.add(Integer.valueOf(num2 != null ? num2.intValue() : 0));
                }
                return new ComplicationsOptionWireFormat(bArr, a9, icon, complicationOverlayWireFormatArr, arrayList2, arrayList3, arrayList4);
            }

            public final void f(DataOutputStream dataOutputStream) {
                Icon icon;
                dataOutputStream.write(this.f7694a.f7696a);
                for (b next : this.f7674c) {
                    next.getClass();
                    dataOutputStream.write(next.f7668a);
                    Boolean bool = next.f7669b;
                    if (bool != null) {
                        dataOutputStream.writeBoolean(bool.booleanValue());
                    }
                    p1.f fVar = next.f7670c;
                    if (fVar != null) {
                        Map<q1.d, RectF> map = fVar.f6279a;
                        Set<q1.d> keySet = map.keySet();
                        q7.k.e(keySet, "<this>");
                        TreeSet treeSet = new TreeSet();
                        i7.i.a0(keySet, treeSet);
                        Iterator it = treeSet.iterator();
                        while (it.hasNext()) {
                            q1.d dVar = (q1.d) it.next();
                            dataOutputStream.writeInt(dVar.f6450f);
                            RectF rectF = map.get(dVar);
                            q7.k.b(rectF);
                            k3.j.k0(rectF, dataOutputStream);
                            RectF rectF2 = fVar.f6280b.get(dVar);
                            q7.k.b(rectF2);
                            k3.j.k0(rectF2, dataOutputStream);
                        }
                    }
                    Integer num = next.f7671d;
                    if (num != null) {
                        dataOutputStream.writeInt(num.intValue());
                    }
                    Integer num2 = next.e;
                    if (num2 != null) {
                        dataOutputStream.writeInt(num2.intValue());
                    }
                    Integer num3 = next.f7672f;
                    if (num3 != null) {
                        dataOutputStream.writeInt(num3.intValue());
                    }
                }
                this.f7675d.b(dataOutputStream);
                c cVar = this.e;
                if (cVar != null) {
                    cVar.b(dataOutputStream);
                }
                Icon icon2 = this.f7676f;
                if (icon2 != null) {
                    r.c(icon2, dataOutputStream);
                }
                i iVar = this.f7677g;
                if (iVar != null && (icon = iVar.f7697a) != null) {
                    r.c(icon, dataOutputStream);
                }
            }
        }

        public c() {
            throw null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, c cVar, c cVar2, Icon icon, i iVar, List<C0133c> list, Collection<? extends s> collection, int i8) {
            super(eVar, cVar, cVar2, icon, iVar, list, i8, collection);
            Collection<? extends s> collection2 = collection;
            q7.k.e(eVar, "id");
            q7.k.e(cVar, "displayName");
            q7.k.e(cVar2, "description");
            q7.k.e(collection2, "affectsWatchFaceLayers");
            if (!collection2.contains(s.f7717h)) {
                throw new IllegalArgumentException("ComplicationSlotsUserStyleSetting must affect the complications layer".toString());
            }
        }

        public final UserStyleSettingWireFormat f() {
            String str = this.f7641a.f7683a;
            CharSequence c9 = c();
            CharSequence b9 = b();
            Icon icon = this.f7644d;
            ArrayList e = e();
            int i8 = this.f7646g;
            Collection<s> collection = this.f7647h;
            ArrayList arrayList = new ArrayList(i7.f.M(collection));
            for (s ordinal : collection) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            i iVar = this.e;
            Bundle a9 = iVar != null ? iVar.a() : null;
            List<h> list = this.f7645f;
            ArrayList arrayList2 = new ArrayList(i7.f.M(list));
            for (h hVar : list) {
                q7.k.c(hVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ComplicationSlotsUserStyleSetting.ComplicationSlotsOption");
                i iVar2 = ((C0133c) hVar).f7677g;
                arrayList2.add(iVar2 != null ? iVar2.a() : new Bundle());
            }
            ArrayList arrayList3 = new ArrayList(i7.f.M(list));
            for (h hVar2 : list) {
                q7.k.c(hVar2, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ComplicationSlotsUserStyleSetting.ComplicationSlotsOption");
                C0133c cVar = (C0133c) hVar2;
                c cVar2 = cVar.e;
                CharSequence a10 = cVar2 != null ? cVar2.a() : null;
                if (a10 == null) {
                    a10 = cVar.f7675d.a();
                }
                arrayList3.add(a10);
            }
            return new ComplicationsUserStyleSettingWireFormat(str, c9, b9, icon, e, i8, arrayList, a9, arrayList2, arrayList3);
        }
    }

    public static final class d extends m {

        /* renamed from: k  reason: collision with root package name */
        public static final a f7678k = new a();

        public static final class a {

            /* renamed from: u1.m$d$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0134a extends q7.j implements l<String, Double> {

                /* renamed from: o  reason: collision with root package name */
                public static final C0134a f7679o = new C0134a();

                public C0134a() {
                    super(1, w7.c.class, "toDouble", "toDouble(Ljava/lang/String;)D", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Double.valueOf(Double.parseDouble(str));
                }
            }

            public /* synthetic */ class b extends q7.j implements l<String, Double> {

                /* renamed from: o  reason: collision with root package name */
                public static final b f7680o = new b();

                public b() {
                    super(1, w7.c.class, "toDouble", "toDouble(Ljava/lang/String;)D", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Double.valueOf(Double.parseDouble(str));
                }
            }

            public /* synthetic */ class c extends q7.j implements l<String, Double> {

                /* renamed from: o  reason: collision with root package name */
                public static final c f7681o = new c();

                public c() {
                    super(1, w7.c.class, "toDouble", "toDouble(Ljava/lang/String;)D", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Double.valueOf(Double.parseDouble(str));
                }
            }

            /* renamed from: u1.m$d$a$d  reason: collision with other inner class name */
            public /* synthetic */ class C0135d extends q7.j implements p<Resources, XmlResourceParser, d> {
                public C0135d(Object obj) {
                    super(2, obj, a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;)Landroidx/wear/watchface/style/UserStyleSetting$DoubleRangeUserStyleSetting;");
                }

                public final Object g(Object obj, Object obj2) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    return ((a) this.f6630g).a(resources, xmlResourceParser);
                }
            }

            @SuppressLint({"ResourceType"})
            public final d a(Resources resources, XmlResourceParser xmlResourceParser) {
                Double d9;
                Double d10;
                Resources resources2 = resources;
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                q7.k.e(resources2, "resources");
                q7.k.e(xmlResourceParser2, "parser");
                d dVar = (d) b.e(resources2, xmlResourceParser2, "DoubleRangeUserStyleSetting", new C0135d(this));
                b bVar = b.f7680o;
                Double d11 = null;
                if (dVar != null) {
                    Object X = i7.i.X(dVar.f7645f);
                    q7.k.c(X, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                    d9 = Double.valueOf(((b) X).f7682c);
                } else {
                    d9 = null;
                }
                double doubleValue = ((Number) r.a(xmlResourceParser2, "maxDouble", bVar, d9, "DoubleRangeUserStyleSetting")).doubleValue();
                c cVar = c.f7681o;
                if (dVar != null) {
                    Object U = i7.i.U(dVar.f7645f);
                    q7.k.c(U, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                    d10 = Double.valueOf(((b) U).f7682c);
                } else {
                    d10 = null;
                }
                double doubleValue2 = ((Number) r.a(xmlResourceParser2, "minDouble", cVar, d10, "DoubleRangeUserStyleSetting")).doubleValue();
                C0134a aVar = C0134a.f7679o;
                if (dVar != null) {
                    h hVar = dVar.f7645f.get(dVar.f7646g);
                    q7.k.c(hVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                    d11 = Double.valueOf(((b) hVar).f7682c);
                }
                double doubleValue3 = ((Number) r.a(xmlResourceParser2, "defaultDouble", aVar, d11, "DoubleRangeUserStyleSetting")).doubleValue();
                b.a a9 = m.f7640j.a(resources, xmlResourceParser, dVar, false, (h7.d<String, ? extends p<? super Resources, ? super XmlResourceParser, ? extends h>>) null);
                return new d(a9.f7653a, a9.f7654b, a9.f7655c, a9.f7656d, a9.e, doubleValue2, doubleValue, a9.f7659h, doubleValue3);
            }
        }

        public static final class b extends h {

            /* renamed from: c  reason: collision with root package name */
            public final double f7682c;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public b(double r3) {
                /*
                    r2 = this;
                    r0 = 8
                    byte[] r0 = new byte[r0]
                    java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
                    r1.putDouble(r3)
                    u1.m$h$a r1 = new u1.m$h$a
                    r1.<init>((byte[]) r0)
                    i7.k r0 = i7.k.f4879f
                    r2.<init>(r1, r0)
                    r2.f7682c = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: u1.m.d.b.<init>(double):void");
            }

            public final Class<? extends m> d() {
                return d.class;
            }

            public final OptionWireFormat e() {
                return new DoubleRangeOptionWireFormat(this.f7694a.f7696a);
            }

            public final void f(DataOutputStream dataOutputStream) {
                dataOutputStream.write(this.f7694a.f7696a);
                dataOutputStream.writeDouble(this.f7682c);
            }

            public final String toString() {
                return String.valueOf(this.f7682c);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(u1.m.e r17, u1.c r18, u1.c r19, android.graphics.drawable.Icon r20, u1.m.i r21, double r22, double r24, java.util.Collection<? extends u1.s> r26, double r27) {
            /*
                r16 = this;
                r0 = r22
                r2 = r24
                r4 = r27
                java.lang.String r6 = "id"
                r8 = r17
                q7.k.e(r8, r6)
                java.lang.String r6 = "displayName"
                r9 = r18
                q7.k.e(r9, r6)
                java.lang.String r6 = "description"
                r10 = r19
                q7.k.e(r10, r6)
                java.lang.String r6 = "affectsWatchFaceLayers"
                r15 = r26
                q7.k.e(r15, r6)
                u1.m$d$a r6 = f7678k
                r6.getClass()
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r7 = 0
                r11 = 1
                if (r6 >= 0) goto L_0x002f
                r6 = r11
                goto L_0x0030
            L_0x002f:
                r6 = r7
            L_0x0030:
                java.lang.String r12 = "Failed requirement."
                if (r6 == 0) goto L_0x00b4
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L_0x003a
                r6 = r11
                goto L_0x003b
            L_0x003a:
                r6 = r7
            L_0x003b:
                if (r6 == 0) goto L_0x00aa
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 > 0) goto L_0x0043
                r13 = r11
                goto L_0x0044
            L_0x0043:
                r13 = r7
            L_0x0044:
                if (r13 == 0) goto L_0x00a0
                int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x004c
                r13 = r11
                goto L_0x004d
            L_0x004c:
                r13 = r7
            L_0x004d:
                r14 = 2
                if (r13 != 0) goto L_0x0074
                if (r6 != 0) goto L_0x0054
                r6 = r11
                goto L_0x0055
            L_0x0054:
                r6 = r7
            L_0x0055:
                if (r6 != 0) goto L_0x0074
                r6 = 3
                u1.m$d$b[] r6 = new u1.m.d.b[r6]
                u1.m$d$b r13 = new u1.m$d$b
                r13.<init>(r0)
                r6[r7] = r13
                u1.m$d$b r0 = new u1.m$d$b
                r0.<init>(r4)
                r6[r11] = r0
                u1.m$d$b r0 = new u1.m$d$b
                r0.<init>(r2)
                r6[r14] = r0
                java.util.List r0 = a1.a.B(r6)
                goto L_0x0088
            L_0x0074:
                u1.m$d$b[] r4 = new u1.m.d.b[r14]
                u1.m$d$b r5 = new u1.m$d$b
                r5.<init>(r0)
                r4[r7] = r5
                u1.m$d$b r0 = new u1.m$d$b
                r0.<init>(r2)
                r4[r11] = r0
                java.util.List r0 = a1.a.B(r4)
            L_0x0088:
                r13 = r0
                if (r12 != 0) goto L_0x008c
                r7 = r11
            L_0x008c:
                r14 = r7 ^ 1
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                r11 = r20
                r12 = r21
                r15 = r26
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
                return
            L_0x00a0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            L_0x00aa:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            L_0x00b4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.d.<init>(u1.m$e, u1.c, u1.c, android.graphics.drawable.Icon, u1.m$i, double, double, java.util.Collection, double):void");
        }

        public final h d(h.a aVar) {
            byte[] bArr;
            T t8;
            b bVar;
            List<h> list = this.f7645f;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bArr = aVar.f7696a;
                if (!hasNext) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (Arrays.equals(((h) t8).f7694a.f7696a, bArr)) {
                    break;
                }
            }
            h hVar = (h) t8;
            if (hVar != null) {
                return hVar;
            }
            int i8 = this.f7646g;
            try {
                double d9 = ByteBuffer.wrap(bArr).getDouble();
                Object U = i7.i.U(list);
                q7.k.c(U, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                if (d9 >= ((b) U).f7682c) {
                    Object X = i7.i.X(list);
                    q7.k.c(X, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                    if (d9 <= ((b) X).f7682c) {
                        bVar = new b(d9);
                        return bVar;
                    }
                }
                h hVar2 = list.get(i8);
                q7.k.c(hVar2, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                bVar = (b) hVar2;
                return bVar;
            } catch (Exception unused) {
                h hVar3 = list.get(i8);
                q7.k.c(hVar3, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.DoubleRangeUserStyleSetting.DoubleRangeOption");
                return (b) hVar3;
            }
        }

        public final UserStyleSettingWireFormat f() {
            String str = this.f7641a.f7683a;
            CharSequence c9 = c();
            CharSequence b9 = b();
            Icon icon = this.f7644d;
            ArrayList e = e();
            int i8 = this.f7646g;
            Collection<s> collection = this.f7647h;
            ArrayList arrayList = new ArrayList(i7.f.M(collection));
            for (s ordinal : collection) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            i iVar = this.e;
            return new DoubleRangeUserStyleSettingWireFormat(str, c9, b9, icon, e, i8, arrayList, iVar != null ? iVar.a() : null);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f7683a;

        public e(String str) {
            q7.k.e(str, "value");
            this.f7683a = str;
            if (!(str.length() <= 40)) {
                throw new IllegalArgumentException(("UserStyleSetting.value.length (" + str.length() + ") must be less than MAX_LENGTH (40)").toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!q7.k.a(e.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.Id");
            return q7.k.a(this.f7683a, ((e) obj).f7683a);
        }

        public final int hashCode() {
            return this.f7683a.hashCode();
        }

        public final String toString() {
            return this.f7683a;
        }
    }

    public static final class g extends m {

        /* renamed from: k  reason: collision with root package name */
        public static final a f7689k = new a();

        public static final class a {

            /* renamed from: u1.m$g$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0137a extends q7.j implements l<String, Long> {

                /* renamed from: o  reason: collision with root package name */
                public static final C0137a f7690o = new C0137a();

                public C0137a() {
                    super(1, w7.c.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Long.valueOf(Long.parseLong(str));
                }
            }

            public /* synthetic */ class b extends q7.j implements l<String, Long> {

                /* renamed from: o  reason: collision with root package name */
                public static final b f7691o = new b();

                public b() {
                    super(1, w7.c.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Long.valueOf(Long.parseLong(str));
                }
            }

            public /* synthetic */ class c extends q7.j implements l<String, Long> {

                /* renamed from: o  reason: collision with root package name */
                public static final c f7692o = new c();

                public c() {
                    super(1, w7.c.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    q7.k.e(str, "p0");
                    return Long.valueOf(Long.parseLong(str));
                }
            }

            public /* synthetic */ class d extends q7.j implements p<Resources, XmlResourceParser, g> {
                public d(Object obj) {
                    super(2, obj, a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;)Landroidx/wear/watchface/style/UserStyleSetting$LongRangeUserStyleSetting;");
                }

                public final Object g(Object obj, Object obj2) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    return ((a) this.f6630g).a(resources, xmlResourceParser);
                }
            }

            @SuppressLint({"ResourceType"})
            public final g a(Resources resources, XmlResourceParser xmlResourceParser) {
                Long l8;
                Long l9;
                Resources resources2 = resources;
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
                q7.k.e(resources2, "resources");
                q7.k.e(xmlResourceParser2, "parser");
                g gVar = (g) b.e(resources2, xmlResourceParser2, "LongRangeUserStyleSetting", new d(this));
                b bVar = b.f7691o;
                Long l10 = null;
                if (gVar != null) {
                    Object X = i7.i.X(gVar.f7645f);
                    q7.k.c(X, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                    l8 = Long.valueOf(((b) X).f7693c);
                } else {
                    l8 = null;
                }
                long longValue = ((Number) r.a(xmlResourceParser2, "maxLong", bVar, l8, "LongRangeUserStyleSetting")).longValue();
                c cVar = c.f7692o;
                if (gVar != null) {
                    Object U = i7.i.U(gVar.f7645f);
                    q7.k.c(U, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                    l9 = Long.valueOf(((b) U).f7693c);
                } else {
                    l9 = null;
                }
                long longValue2 = ((Number) r.a(xmlResourceParser2, "minLong", cVar, l9, "LongRangeUserStyleSetting")).longValue();
                C0137a aVar = C0137a.f7690o;
                if (gVar != null) {
                    h hVar = gVar.f7645f.get(gVar.f7646g);
                    q7.k.c(hVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                    l10 = Long.valueOf(((b) hVar).f7693c);
                }
                long longValue3 = ((Number) r.a(xmlResourceParser2, "defaultLong", aVar, l10, "LongRangeUserStyleSetting")).longValue();
                b.a a9 = m.f7640j.a(resources, xmlResourceParser, gVar, false, (h7.d<String, ? extends p<? super Resources, ? super XmlResourceParser, ? extends h>>) null);
                return new g(a9.f7653a, a9.f7654b, a9.f7655c, a9.f7656d, a9.e, longValue2, longValue, a9.f7659h, longValue3);
            }
        }

        public static final class b extends h {

            /* renamed from: c  reason: collision with root package name */
            public final long f7693c;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public b(long r3) {
                /*
                    r2 = this;
                    r0 = 8
                    byte[] r0 = new byte[r0]
                    java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
                    r1.putLong(r3)
                    u1.m$h$a r1 = new u1.m$h$a
                    r1.<init>((byte[]) r0)
                    i7.k r0 = i7.k.f4879f
                    r2.<init>(r1, r0)
                    r2.f7693c = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: u1.m.g.b.<init>(long):void");
            }

            public final Class<? extends m> d() {
                return g.class;
            }

            public final OptionWireFormat e() {
                return new LongRangeOptionWireFormat(this.f7694a.f7696a);
            }

            public final void f(DataOutputStream dataOutputStream) {
                dataOutputStream.write(this.f7694a.f7696a);
                dataOutputStream.writeLong(this.f7693c);
            }

            public final String toString() {
                return String.valueOf(this.f7693c);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(u1.m.e r17, u1.c r18, u1.c r19, android.graphics.drawable.Icon r20, u1.m.i r21, long r22, long r24, java.util.Collection<? extends u1.s> r26, long r27) {
            /*
                r16 = this;
                r0 = r22
                r2 = r24
                r4 = r27
                java.lang.String r6 = "id"
                r8 = r17
                q7.k.e(r8, r6)
                java.lang.String r6 = "displayName"
                r9 = r18
                q7.k.e(r9, r6)
                java.lang.String r6 = "description"
                r10 = r19
                q7.k.e(r10, r6)
                java.lang.String r6 = "affectsWatchFaceLayers"
                r15 = r26
                q7.k.e(r15, r6)
                u1.m$g$a r6 = f7689k
                r6.getClass()
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r7 = 0
                r11 = 1
                if (r6 >= 0) goto L_0x002f
                r6 = r11
                goto L_0x0030
            L_0x002f:
                r6 = r7
            L_0x0030:
                java.lang.String r12 = "Failed requirement."
                if (r6 == 0) goto L_0x00a8
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L_0x003a
                r13 = r11
                goto L_0x003b
            L_0x003a:
                r13 = r7
            L_0x003b:
                if (r13 == 0) goto L_0x009e
                int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r13 > 0) goto L_0x0043
                r14 = r11
                goto L_0x0044
            L_0x0043:
                r14 = r7
            L_0x0044:
                if (r14 == 0) goto L_0x0094
                r12 = 2
                if (r6 == 0) goto L_0x0068
                if (r13 == 0) goto L_0x0068
                r13 = 3
                u1.m$g$b[] r13 = new u1.m.g.b[r13]
                u1.m$g$b r14 = new u1.m$g$b
                r14.<init>(r0)
                r13[r7] = r14
                u1.m$g$b r0 = new u1.m$g$b
                r0.<init>(r4)
                r13[r11] = r0
                u1.m$g$b r0 = new u1.m$g$b
                r0.<init>(r2)
                r13[r12] = r0
                java.util.List r0 = a1.a.B(r13)
                goto L_0x007c
            L_0x0068:
                u1.m$g$b[] r4 = new u1.m.g.b[r12]
                u1.m$g$b r5 = new u1.m$g$b
                r5.<init>(r0)
                r4[r7] = r5
                u1.m$g$b r0 = new u1.m$g$b
                r0.<init>(r2)
                r4[r11] = r0
                java.util.List r0 = a1.a.B(r4)
            L_0x007c:
                r13 = r0
                if (r6 != 0) goto L_0x0081
                r14 = r7
                goto L_0x0082
            L_0x0081:
                r14 = r11
            L_0x0082:
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                r11 = r20
                r12 = r21
                r15 = r26
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
                return
            L_0x0094:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            L_0x009e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            L_0x00a8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r12.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.g.<init>(u1.m$e, u1.c, u1.c, android.graphics.drawable.Icon, u1.m$i, long, long, java.util.Collection, long):void");
        }

        public final h d(h.a aVar) {
            byte[] bArr;
            T t8;
            b bVar;
            List<h> list = this.f7645f;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bArr = aVar.f7696a;
                if (!hasNext) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (Arrays.equals(((h) t8).f7694a.f7696a, bArr)) {
                    break;
                }
            }
            h hVar = (h) t8;
            if (hVar != null) {
                return hVar;
            }
            int i8 = this.f7646g;
            try {
                long j8 = ByteBuffer.wrap(bArr).getLong();
                Object U = i7.i.U(list);
                q7.k.c(U, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                if (j8 >= ((b) U).f7693c) {
                    Object X = i7.i.X(list);
                    q7.k.c(X, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                    if (j8 <= ((b) X).f7693c) {
                        bVar = new b(j8);
                        return bVar;
                    }
                }
                h hVar2 = list.get(i8);
                q7.k.c(hVar2, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                bVar = (b) hVar2;
                return bVar;
            } catch (Exception unused) {
                h hVar3 = list.get(i8);
                q7.k.c(hVar3, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.LongRangeUserStyleSetting.LongRangeOption");
                return (b) hVar3;
            }
        }

        public final UserStyleSettingWireFormat f() {
            String str = this.f7641a.f7683a;
            CharSequence c9 = c();
            CharSequence b9 = b();
            Icon icon = this.f7644d;
            ArrayList e = e();
            int i8 = this.f7646g;
            Collection<s> collection = this.f7647h;
            ArrayList arrayList = new ArrayList(i7.f.M(collection));
            for (s ordinal : collection) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            i iVar = this.e;
            return new LongRangeUserStyleSettingWireFormat(str, c9, b9, icon, e, i8, arrayList, iVar != null ? iVar.a() : null);
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public final a f7694a;

        /* renamed from: b  reason: collision with root package name */
        public final Collection<m> f7695b;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final byte[] f7696a;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public a(java.lang.String r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = "value"
                    q7.k.e(r2, r0)
                    java.nio.charset.Charset r0 = w7.a.f8081a
                    byte[] r2 = r2.getBytes(r0)
                    java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
                    q7.k.d(r2, r0)
                    r1.<init>((byte[]) r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: u1.m.h.a.<init>(java.lang.String):void");
            }

            public a(byte[] bArr) {
                this.f7696a = bArr;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!q7.k.a(a.class, obj != null ? obj.getClass() : null)) {
                    return false;
                }
                q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.Option.Id");
                return Arrays.equals(this.f7696a, ((a) obj).f7696a);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.f7696a);
            }

            public final String toString() {
                byte[] bArr = this.f7696a;
                try {
                    q7.k.e(bArr, "<this>");
                    return new String(bArr, w7.a.f8081a);
                } catch (Exception unused) {
                    return bArr.toString();
                }
            }
        }

        public h(a aVar, Collection<? extends m> collection) {
            boolean z8;
            this.f7694a = aVar;
            this.f7695b = collection;
            Iterator<? extends m> it = collection.iterator();
            while (true) {
                z8 = true;
                if (!it.hasNext()) {
                    break;
                }
                ((m) it.next()).f7648i = true;
            }
            if (!(this.f7694a.f7696a.length > 1024 ? false : z8)) {
                throw new IllegalArgumentException(("Option.Id.value.size (" + this.f7694a.f7696a.length + ") must be less than MAX_LENGTH 1024").toString());
            }
        }

        public int a(Context context) {
            return this.f7694a.f7696a.length;
        }

        public c b() {
            return null;
        }

        public c c() {
            return null;
        }

        public abstract Class<? extends m> d();

        public abstract OptionWireFormat e();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!q7.k.a(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.Option");
            return q7.k.a(this.f7694a, ((h) obj).f7694a);
        }

        public void f(DataOutputStream dataOutputStream) {
        }

        public final int hashCode() {
            return this.f7694a.hashCode();
        }

        public String toString() {
            a aVar = this.f7694a;
            try {
                byte[] bArr = aVar.f7696a;
                q7.k.e(bArr, "<this>");
                return new String(bArr, w7.a.f8081a);
            } catch (Exception unused) {
                return aVar.f7696a.toString();
            }
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final Icon f7697a;

        public i(Icon icon) {
            this.f7697a = icon;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            Icon icon = this.f7697a;
            if (icon != null) {
                bundle.putParcelable("ICON", icon);
            }
            return bundle;
        }
    }

    public static final class j extends q7.l implements l<h, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final j f7698f = new j();

        public j() {
            super(1);
        }

        public final Object invoke(Object obj) {
            h hVar = (h) obj;
            q7.k.e(hVar, "it");
            return hVar.toString();
        }
    }

    public m() {
        throw null;
    }

    public m(e eVar, c cVar, c cVar2, Icon icon, i iVar, List list, int i8, Collection collection) {
        this.f7641a = eVar;
        this.f7642b = cVar;
        this.f7643c = cVar2;
        this.f7644d = icon;
        this.e = iVar;
        this.f7645f = list;
        this.f7646g = i8;
        this.f7647h = collection;
        int i9 = 0;
        if (i8 >= 0 && i8 < list.size()) {
            q7.k.e(eVar, "setting");
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (!hashSet.add(hVar.f7694a)) {
                    throw new IllegalArgumentException(("duplicated option id: " + hVar.f7694a + " in " + eVar).toString());
                }
            }
            for (h next : this.f7645f) {
                i9++;
                c b9 = next.b();
                if (b9 != null && (b9 instanceof c.C0127c)) {
                    ((c.C0127c) b9).d(i9);
                }
                c c9 = next.c();
                if (c9 != null && (c9 instanceof c.C0127c)) {
                    ((c.C0127c) c9).d(i9);
                }
            }
            return;
        }
        throw new IllegalArgumentException("defaultOptionIndex must be within the range of the options list".toString());
    }

    public final int a(Context context) {
        e eVar = this.f7641a;
        int length = eVar.f7683a.length() + c().length() + b().length() + 4 + (this.f7647h.size() * 4);
        Icon icon = this.f7644d;
        if (icon != null) {
            t b9 = r.b(icon, context);
            Integer num = b9.f7720a;
            if (num != null) {
                length += num.intValue();
            }
            int i8 = b9.f7722c;
            int i9 = b9.f7721b;
            if (!(i9 <= 400 && i8 <= 400)) {
                throw new IllegalArgumentException(("UserStyleSetting id " + eVar + " has a " + i9 + " x " + i8 + " icon. This is too big, the maximum size is 400 x 400.").toString());
            }
        }
        for (h a9 : this.f7645f) {
            length += a9.a(context);
        }
        return length;
    }

    public final CharSequence b() {
        return this.f7643c.a();
    }

    public final CharSequence c() {
        return this.f7642b.a();
    }

    public h d(h.a aVar) {
        T t8;
        List<h> list = this.f7645f;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t8 = null;
                break;
            }
            t8 = it.next();
            if (Arrays.equals(((h) t8).f7694a.f7696a, aVar.f7696a)) {
                break;
            }
        }
        h hVar = (h) t8;
        return hVar == null ? list.get(this.f7646g) : hVar;
    }

    public final ArrayList e() {
        List<h> list = this.f7645f;
        ArrayList arrayList = new ArrayList(i7.f.M(list));
        for (h e4 : list) {
            arrayList.add(e4.e());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q7.k.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        q7.k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting");
        return q7.k.a(this.f7641a, ((m) obj).f7641a);
    }

    public abstract UserStyleSettingWireFormat f();

    public final int hashCode() {
        return this.f7641a.hashCode();
    }

    public final String toString() {
        return "{" + this.f7641a.f7683a + " : " + i7.i.W(this.f7645f, (String) null, j.f7698f, 31) + '}';
    }

    public static class f extends m {

        /* renamed from: k  reason: collision with root package name */
        public static final a f7684k = new a();

        public static final class a {

            /* renamed from: u1.m$f$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0136a extends q7.j implements q<Resources, XmlResourceParser, Map<String, ? extends m>, f> {
                public C0136a(Object obj) {
                    super(3, obj, a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Ljava/util/Map;)Landroidx/wear/watchface/style/UserStyleSetting$ListUserStyleSetting;");
                }

                public final Object d(Object obj, Object obj2, Object obj3) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    Map map = (Map) obj3;
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    q7.k.e(map, "p2");
                    return ((a) this.f6630g).a(resources, xmlResourceParser, map);
                }
            }

            public /* synthetic */ class b extends q7.j implements q<Resources, XmlResourceParser, Map<String, ? extends m>, b> {
                public b(Object obj) {
                    super(3, obj, b.a.class, "inflate(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Ljava/util/Map;)Landroidx/wear/watchface/style/UserStyleSetting$ListUserStyleSetting$ListOption;");
                }

                public final Object d(Object obj, Object obj2, Object obj3) {
                    Resources resources = (Resources) obj;
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
                    Map map = (Map) obj3;
                    q7.k.e(resources, "p0");
                    q7.k.e(xmlResourceParser, "p1");
                    q7.k.e(map, "p2");
                    ((b.a) this.f6630g).getClass();
                    String B = k3.j.B(resources, xmlResourceParser, "id");
                    if (B != null) {
                        c c9 = b.c(m.f7640j, resources, xmlResourceParser, "displayName", (c) null, true, 8);
                        c b9 = b.b(resources, xmlResourceParser, "nameForScreenReaders", c9, true);
                        Icon d9 = b.d(resources, xmlResourceParser);
                        q7.p pVar = new q7.p();
                        ArrayList arrayList = new ArrayList();
                        k3.j.J(xmlResourceParser, new q(xmlResourceParser, resources, map, arrayList, pVar));
                        return new b(new h.a(B), c9, b9, d9, (i) pVar.f6643f, arrayList);
                    }
                    throw new IllegalArgumentException("ListOption must have an id".toString());
                }
            }

            @SuppressLint({"ResourceType"})
            public final f a(Resources resources, XmlResourceParser xmlResourceParser, Map<String, ? extends m> map) {
                q7.k.e(resources, "resources");
                q7.k.e(xmlResourceParser, "parser");
                q7.k.e(map, "idToSetting");
                b.a a9 = m.f7640j.a(resources, xmlResourceParser, (m) b.e(resources, xmlResourceParser, "ListUserStyleSetting", new p(new C0136a(this), map)), true, new h7.d("ListOption", new p(new b(b.f7685g), map)));
                e eVar = a9.f7653a;
                c cVar = a9.f7654b;
                c cVar2 = a9.f7655c;
                Icon icon = a9.f7656d;
                i iVar = a9.e;
                List<h> list = a9.f7657f;
                q7.k.c(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.wear.watchface.style.UserStyleSetting.ListUserStyleSetting.ListOption>");
                Collection<s> collection = a9.f7659h;
                Integer num = a9.f7658g;
                q7.k.b(num);
                return new f(eVar, cVar, cVar2, icon, iVar, (List<b>) list, (Collection<? extends s>) collection, num.intValue());
            }
        }

        public f() {
            throw null;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(u1.m.e r13, android.content.res.Resources r14, int r15, int r16, android.graphics.drawable.Icon r17, java.util.ArrayList r18, java.util.List r19, u1.m.f.b r20) {
            /*
                r12 = this;
                r0 = r14
                r1 = r20
                java.lang.String r2 = "resources"
                q7.k.e(r14, r2)
                java.lang.String r2 = "affectsWatchFaceLayers"
                r11 = r19
                q7.k.e(r11, r2)
                java.lang.String r2 = "defaultOption"
                q7.k.e(r1, r2)
                r8 = 0
                u1.c$c r5 = new u1.c$c
                r2 = r15
                r5.<init>(r14, r15)
                u1.c$c r6 = new u1.c$c
                r2 = r16
                r6.<init>(r14, r2)
                r0 = r18
                int r10 = r0.indexOf(r1)
                r3 = r12
                r4 = r13
                r7 = r17
                r9 = r18
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.f.<init>(u1.m$e, android.content.res.Resources, int, int, android.graphics.drawable.Icon, java.util.ArrayList, java.util.List, u1.m$f$b):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(u1.m.e r11, u1.c r12, u1.c r13, android.graphics.drawable.Icon r14, u1.m.i r15, java.util.List<u1.m.f.b> r16, java.util.Collection<? extends u1.s> r17, int r18) {
            /*
                r10 = this;
                java.lang.String r0 = "id"
                r2 = r11
                q7.k.e(r11, r0)
                java.lang.String r0 = "displayName"
                r3 = r12
                q7.k.e(r12, r0)
                java.lang.String r0 = "description"
                r4 = r13
                q7.k.e(r13, r0)
                java.lang.String r0 = "affectsWatchFaceLayers"
                r9 = r17
                q7.k.e(r9, r0)
                r1 = r10
                r5 = r14
                r6 = r15
                r7 = r16
                r8 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.m.f.<init>(u1.m$e, u1.c, u1.c, android.graphics.drawable.Icon, u1.m$i, java.util.List, java.util.Collection, int):void");
        }

        public final UserStyleSettingWireFormat f() {
            String str = this.f7641a.f7683a;
            CharSequence c9 = c();
            CharSequence b9 = b();
            Icon icon = this.f7644d;
            ArrayList e = e();
            int i8 = this.f7646g;
            Collection<s> collection = this.f7647h;
            ArrayList arrayList = new ArrayList(i7.f.M(collection));
            for (s ordinal : collection) {
                arrayList.add(Integer.valueOf(ordinal.ordinal()));
            }
            i iVar = this.e;
            Bundle a9 = iVar != null ? iVar.a() : null;
            List<h> list = this.f7645f;
            ArrayList arrayList2 = new ArrayList(i7.f.M(list));
            for (h hVar : list) {
                q7.k.c(hVar, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ListUserStyleSetting.ListOption");
                i iVar2 = ((b) hVar).f7688f;
                arrayList2.add(iVar2 != null ? iVar2.a() : new Bundle());
            }
            ArrayList arrayList3 = new ArrayList(i7.f.M(list));
            for (h hVar2 : list) {
                q7.k.c(hVar2, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleSetting.ListUserStyleSetting.ListOption");
                b bVar = (b) hVar2;
                c cVar = bVar.f7687d;
                CharSequence a10 = cVar != null ? cVar.a() : null;
                if (a10 == null) {
                    a10 = bVar.f7686c.a();
                }
                arrayList3.add(a10);
            }
            return new ListUserStyleSettingWireFormat(str, c9, b9, icon, e, i8, arrayList, a9, arrayList2, arrayList3);
        }

        public static final class b extends h {

            /* renamed from: g  reason: collision with root package name */
            public static final a f7685g = new a();

            /* renamed from: c  reason: collision with root package name */
            public final c f7686c;

            /* renamed from: d  reason: collision with root package name */
            public c f7687d;
            public final Icon e;

            /* renamed from: f  reason: collision with root package name */
            public final i f7688f;

            public static final class a {
            }

            public b() {
                throw null;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(h.a aVar, Resources resources, int i8, int i9, Icon icon) {
                super(aVar, k.f4879f);
                q7.k.e(resources, "resources");
                this.f7686c = new c.C0127c(resources, i8);
                this.f7687d = new c.C0127c(resources, i9);
                this.e = icon;
                this.f7688f = null;
            }

            public final int a(Context context) {
                h.a aVar = this.f7694a;
                int length = aVar.f7696a.length + this.f7686c.a().length();
                c cVar = this.f7687d;
                CharSequence a9 = cVar != null ? cVar.a() : null;
                if (a9 != null) {
                    a9.length();
                }
                Icon icon = this.e;
                if (icon != null) {
                    t b9 = r.b(icon, context);
                    Integer num = b9.f7720a;
                    if (num != null) {
                        length += num.intValue();
                    }
                    int i8 = b9.f7722c;
                    int i9 = b9.f7721b;
                    if (!(i9 <= 400 && i8 <= 400)) {
                        throw new IllegalArgumentException(("ListOption id " + aVar + " has a " + i9 + " x " + i8 + " icon. This is too big, the maximum size is 400 x 400.").toString());
                    }
                }
                return length;
            }

            public final c b() {
                return this.f7686c;
            }

            public final c c() {
                return this.f7687d;
            }

            public final Class<? extends m> d() {
                return f.class;
            }

            public final OptionWireFormat e() {
                return new ListOptionWireFormat(this.f7694a.f7696a, this.f7686c.a(), this.e);
            }

            public final void f(DataOutputStream dataOutputStream) {
                Icon icon;
                dataOutputStream.write(this.f7694a.f7696a);
                this.f7686c.b(dataOutputStream);
                c cVar = this.f7687d;
                if (cVar != null) {
                    cVar.b(dataOutputStream);
                }
                Icon icon2 = this.e;
                if (icon2 != null) {
                    r.c(icon2, dataOutputStream);
                }
                i iVar = this.f7688f;
                if (iVar != null && (icon = iVar.f7697a) != null) {
                    r.c(icon, dataOutputStream);
                }
            }

            public b(h.a aVar, c cVar, c cVar2, Icon icon, i iVar, ArrayList arrayList) {
                super(aVar, arrayList);
                this.f7686c = cVar;
                this.f7687d = cVar2;
                this.e = icon;
                this.f7688f = iVar;
            }
        }
    }
}
