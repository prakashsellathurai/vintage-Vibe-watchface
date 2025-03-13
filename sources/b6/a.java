package b6;

import q7.k;

public final /* synthetic */ class a {
    public static /* synthetic */ int A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("Line")) {
            return 1;
        } else {
            if (str.equals("Rectangle")) {
                return 2;
            }
            if (str.equals("Arc")) {
                return 3;
            }
            if (str.equals("Ellipse")) {
                return 4;
            }
            if (str.equals("RoundRectangle")) {
                return 5;
            }
            if (str.equals("Unknown")) {
                return 6;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.controller.PartDrawFactory.DrawShapeType.".concat(str));
        }
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("DEFAULT")) {
            return 1;
        } else {
            if (str.equals("BUDDHIST")) {
                return 2;
            }
            if (str.equals("CHINESE")) {
                return 3;
            }
            if (str.equals("COPTIC")) {
                return 4;
            }
            if (str.equals("DANGI")) {
                return 5;
            }
            if (str.equals("ETHIOPIC")) {
                return 6;
            }
            if (str.equals("ETHIOPIC_AMETE_ALEM")) {
                return 7;
            }
            if (str.equals("GREGORIAN")) {
                return 8;
            }
            if (str.equals("HEBREW")) {
                return 9;
            }
            if (str.equals("INDIAN")) {
                return 10;
            }
            if (str.equals("ISLAMIC")) {
                return 11;
            }
            if (str.equals("ISLAMIC_CIVIL")) {
                return 12;
            }
            if (str.equals("ISLAMIC_UMALQURA")) {
                return 13;
            }
            if (str.equals("JAPANESE")) {
                return 14;
            }
            if (str.equals("PERSIAN")) {
                return 15;
            }
            if (str.equals("ROC")) {
                return 16;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.data.common.IcuData.LocalCalendar.".concat(str));
        }
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("DO_NOTHING")) {
            return 1;
        } else {
            if (str.equals("FIRST_FRAME")) {
                return 2;
            }
            if (str.equals("THUMBNAIL")) {
                return 3;
            }
            if (str.equals("HIDE")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.image.imageproperty.AnimationController.FrameState.".concat(str));
        }
    }

    public static /* synthetic */ int D(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("IMAGE")) {
            return 1;
        } else {
            if (str.equals("AGIF")) {
                return 2;
            }
            if (str.equals("WEBP")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.image.imageproperty.drawable.animated.AnimatedDrawableFactory.ImageFormat.".concat(str));
        }
    }

    public static /* synthetic */ String a(int i8) {
        if (i8 == 1) {
            return "";
        }
        if (i8 == 2) {
            return "buddhist";
        }
        if (i8 == 3) {
            return "chinese";
        }
        if (i8 == 4) {
            return "coptic";
        }
        if (i8 == 5) {
            return "dangi";
        }
        if (i8 == 6) {
            return "ethiopic";
        }
        if (i8 == 7) {
            return "ethiopic-amete-alem";
        }
        if (i8 == 8) {
            return "gregorian";
        }
        if (i8 == 9) {
            return "hebrew";
        }
        if (i8 == 10) {
            return "indian";
        }
        if (i8 == 11) {
            return "islamic";
        }
        if (i8 == 12) {
            return "islamic-civil";
        }
        if (i8 == 13) {
            return "islamic-umalqura";
        }
        if (i8 == 14) {
            return "japanese";
        }
        if (i8 == 15) {
            return "persian";
        }
        if (i8 == 16) {
            return "roc";
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i8) {
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return false;
        }
        if (i8 == 4 || i8 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i8) {
        if (i8 == 1) {
            return false;
        }
        if (i8 == 2 || i8 == 3) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long d(int i8) {
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 == 4) {
            return 3;
        }
        if (i8 == 5) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ int e(int i8) {
        if (i8 == 1) {
            return -1;
        }
        if (i8 == 2) {
            return 0;
        }
        if (i8 == 3) {
            return 1;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i8) {
        if (i8 == 1) {
            return "INTERRUPTION_FILTER_UNKNOWN";
        }
        if (i8 == 2) {
            return "INTERRUPTION_FILTER_NONE";
        }
        if (i8 == 3) {
            return "INTERRUPTION_FILTER_PRIORITY";
        }
        if (i8 == 4) {
            return "INTERRUPTION_FILTER_ALL";
        }
        if (i8 == 5) {
            return "INTERRUPTION_FILTER_ALARMS";
        }
        throw null;
    }

    public static /* synthetic */ int g(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int h(int i8) {
        if (i8 == 1) {
            return 100;
        }
        if (i8 == 2) {
            return 150;
        }
        if (i8 == 3) {
            return 200;
        }
        if (i8 == 4) {
            return 300;
        }
        if (i8 == 5) {
            return 400;
        }
        if (i8 == 6) {
            return 500;
        }
        if (i8 == 7) {
            return 600;
        }
        if (i8 == 8) {
            return 700;
        }
        if (i8 == 9) {
            return 750;
        }
        if (i8 == 10) {
            return 800;
        }
        if (i8 == 11) {
            return 900;
        }
        if (i8 == 12) {
            return 1000;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i8) {
        if (i8 == 1) {
            return "normal";
        }
        if (i8 == 2 || i8 == 3) {
            return "condensed-light";
        }
        if (i8 == 4) {
            return "condensed";
        }
        if (i8 == 5) {
            return "condensed-medium";
        }
        if (i8 == 6 || i8 == 7 || i8 == 8 || i8 == 9) {
            return "normal";
        }
        throw null;
    }

    public static /* synthetic */ void j(int i8, String str) {
        if (i8 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<k> cls = k.class;
            String name = cls.getName();
            int i9 = 0;
            while (!stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            while (stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            k.f(cls.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static /* synthetic */ String k(int i8) {
        if (i8 == 1) {
            return "NONE";
        }
        if (i8 == 2) {
            return "NORMAL";
        }
        if (i8 == 3) {
            return "RIPPLE";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i8) {
        if (i8 == 1) {
            return "NONE";
        }
        if (i8 == 2) {
            return "SYSTEM";
        }
        if (i8 == 3) {
            return "CUSTOM";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i8) {
        return i8 == 1 ? "BOOLEAN" : i8 == 2 ? "LIST" : i8 == 3 ? "COLOR" : "null";
    }

    public static /* synthetic */ String n(int i8) {
        return i8 == 1 ? "MERGE" : i8 == 2 ? "ADD" : i8 == 3 ? "SUBTRACT" : i8 == 4 ? "INTERSECT" : i8 == 5 ? "EXCLUDE_INTERSECTIONS" : "null";
    }

    public static /* synthetic */ String o(int i8) {
        return i8 == 1 ? "PRE_COMP" : i8 == 2 ? "SOLID" : i8 == 3 ? "IMAGE" : i8 == 4 ? "NULL" : i8 == 5 ? "SHAPE" : i8 == 6 ? "TEXT" : i8 == 7 ? "UNKNOWN" : "null";
    }

    public static /* synthetic */ String p(int i8) {
        return i8 == 1 ? "BEGIN_ARRAY" : i8 == 2 ? "END_ARRAY" : i8 == 3 ? "BEGIN_OBJECT" : i8 == 4 ? "END_OBJECT" : i8 == 5 ? "NAME" : i8 == 6 ? "STRING" : i8 == 7 ? "NUMBER" : i8 == 8 ? "BOOLEAN" : i8 == 9 ? "NULL" : i8 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String q(int i8) {
        return i8 == 1 ? "ICON" : i8 == 2 ? "PHOTO" : "null";
    }

    public static /* synthetic */ String r(int i8) {
        return i8 == 1 ? "INITIALIZE" : i8 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i8 == 3 ? "DECODE_DATA" : "null";
    }

    public static /* synthetic */ String s(int i8) {
        return i8 == 1 ? "UNKNOWN" : i8 == 2 ? "HORIZONTAL_DIMENSION" : i8 == 3 ? "VERTICAL_DIMENSION" : i8 == 4 ? "LEFT" : i8 == 5 ? "RIGHT" : i8 == 6 ? "TOP" : i8 == 7 ? "BOTTOM" : i8 == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ String t(int i8) {
        return i8 == 1 ? "INTEGER" : i8 == 2 ? "LONG" : i8 == 3 ? "FLOAT" : i8 == 4 ? "DOUBLE" : i8 == 5 ? "BOOLEAN" : i8 == 6 ? "STRING" : i8 == 7 ? "COLOR" : i8 == 8 ? "OBJECT" : "null";
    }

    public static /* synthetic */ String u(int i8) {
        return i8 == 1 ? "STOP" : i8 == 2 ? "RUNNING" : i8 == 3 ? "PAUSED" : "null";
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("NORMAL")) {
            return 1;
        } else {
            if (str.equals("OBLIQUE")) {
                return 2;
            }
            if (str.equals("ITALIC")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.text.textproperty.FontProperty.FontSlant.".concat(str));
        }
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("THIN")) {
            return 1;
        } else {
            if (str.equals("ULTRA_LIGHT")) {
                return 2;
            }
            if (str.equals("EXTRA_LIGHT")) {
                return 3;
            }
            if (str.equals("LIGHT")) {
                return 4;
            }
            if (str.equals("NORMAL")) {
                return 5;
            }
            if (str.equals("MEDIUM")) {
                return 6;
            }
            if (str.equals("SEMI_BOLD")) {
                return 7;
            }
            if (str.equals("BOLD")) {
                return 8;
            }
            if (str.equals("ULTRA_BOLD")) {
                return 9;
            }
            if (str.equals("EXTRA_BOLD")) {
                return 10;
            }
            if (str.equals("BLACK")) {
                return 11;
            }
            if (str.equals("EXTRA_BLACK")) {
                return 12;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.text.textproperty.FontProperty.FontWeight.".concat(str));
        }
    }

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("NORMAL")) {
            return 1;
        } else {
            if (str.equals("ULTRA_CONDENSED")) {
                return 2;
            }
            if (str.equals("EXTRA_CONDENSED")) {
                return 3;
            }
            if (str.equals("CONDENSED")) {
                return 4;
            }
            if (str.equals("SEMI_CONDENSED")) {
                return 5;
            }
            if (str.equals("SEMI_EXPANDED")) {
                return 6;
            }
            if (str.equals("EXPANDED")) {
                return 7;
            }
            if (str.equals("EXTRA_EXPANDED")) {
                return 8;
            }
            if (str.equals("ULTRA_EXPANDED")) {
                return 9;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.text.textproperty.FontProperty.FontWidth.".concat(str));
        }
    }

    public static /* synthetic */ int y(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("TO")) {
            return 1;
        } else {
            if (str.equals("BY")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.view.transform.Transform.Mode.".concat(str));
        }
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("NONE")) {
            return 1;
        } else {
            if (str.equals("CLOCKWISE")) {
                return 2;
            }
            if (str.equals("COUNTER_CLOCKWISE")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.samsung.watchface.utils.AngleUtil.Direction.".concat(str));
        }
    }
}
