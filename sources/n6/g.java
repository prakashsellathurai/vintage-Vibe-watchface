package n6;

import android.graphics.Paint;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class g {
    public static Paint.Align a(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 68795:
                if (str.equals("END")) {
                    c9 = 0;
                    break;
                }
                break;
            case 2332679:
                if (str.equals("LEFT")) {
                    c9 = 1;
                    break;
                }
                break;
            case 77974012:
                if (str.equals("RIGHT")) {
                    c9 = 2;
                    break;
                }
                break;
            case 79219778:
                if (str.equals("START")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 2:
                return Paint.Align.RIGHT;
            case 1:
            case 3:
                return Paint.Align.LEFT;
            default:
                return Paint.Align.CENTER;
        }
    }

    public static Object[] b(List list, ArrayList arrayList) {
        int i8;
        float f9;
        int i9;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            char charValue = ((Character) arrayList.get(i10)).charValue();
            String str = (String) list.get(i10);
            if (str == null) {
                Log.e("DWF:StringUtil", "no value of parameter");
                str = "";
            }
            if (charValue != 'A') {
                if (charValue != 'B') {
                    if (!(charValue == 'E' || charValue == 'G')) {
                        if (charValue != 'S') {
                            if (!(charValue == 'X' || charValue == 'o')) {
                                if (charValue != 's') {
                                    if (charValue != 'x') {
                                        if (charValue != 'a') {
                                            if (charValue != 'b') {
                                                switch (charValue) {
                                                    case 'd':
                                                        break;
                                                    case 'e':
                                                    case 'f':
                                                    case 'g':
                                                        break;
                                                    default:
                                                        Log.w("DWF:StringUtil", "parse: not supported: " + charValue);
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (str.matches("-?\\d+(\\.\\d+)?")) {
                                i9 = (int) Float.parseFloat(str);
                            } else {
                                if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                                    i9 = Boolean.parseBoolean(str);
                                } else {
                                    Log.w("DWF:StringUtil", "int: element isn't number");
                                    i8 = 0;
                                    arrayList2.add(i8);
                                }
                            }
                            i8 = Integer.valueOf(i9);
                            arrayList2.add(i8);
                        }
                        arrayList2.add(str);
                    }
                }
                i8 = Boolean.valueOf(Boolean.parseBoolean(str));
                arrayList2.add(i8);
            }
            if (str.matches("-?\\d+(\\.\\d+)?")) {
                f9 = Float.parseFloat(str);
            } else {
                Log.w("DWF:StringUtil", "float: element isn't number");
                f9 = 0.0f;
            }
            i8 = Float.valueOf(f9);
            arrayList2.add(i8);
        }
        return arrayList2.toArray();
    }

    public static String c(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("%");
        int i8 = 1;
        while (true) {
            boolean z8 = false;
            if (i8 >= split.length) {
                break;
            }
            String str2 = split[i8];
            if (!(str2.length() <= 0 || str2.charAt(0) == 'n' || str2.charAt(0) == ' ')) {
                z8 = true;
            }
            if (z8) {
                str2.chars().filter(new e()).findFirst().ifPresent(new f(arrayList));
            }
            i8++;
        }
        if (list.size() != arrayList.size()) {
            Log.w("DWF:StringUtil", String.format("elements(%d) and specifiers(%d) have different size", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(arrayList.size())}));
            return "Error";
        }
        try {
            return String.format(str, b(list, arrayList));
        } catch (Exception e) {
            Log.e("DWF:StringUtil", "String format error : " + e.getMessage());
            return "Error";
        }
    }

    public static boolean d(String str) {
        return !e(str);
    }

    public static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    public static String[] f(String str) {
        return d(str) ? str.split("\\s+") : new String[0];
    }

    public static List<String> g(String str) {
        return d(str) ? Arrays.asList(f(str)) : new ArrayList();
    }
}
