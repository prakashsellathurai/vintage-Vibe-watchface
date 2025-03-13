package com.google.protobuf;

public final class k1 {
    public static String a(i iVar) {
        String str;
        StringBuilder sb = new StringBuilder(iVar.size());
        for (int i8 = 0; i8 < iVar.size(); i8++) {
            int i9 = iVar.i(i8);
            if (i9 == 34) {
                str = "\\\"";
            } else if (i9 == 39) {
                str = "\\'";
            } else if (i9 != 92) {
                switch (i9) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (i9 < 32 || i9 > 126) {
                            sb.append('\\');
                            sb.append((char) (((i9 >>> 6) & 3) + 48));
                            sb.append((char) (((i9 >>> 3) & 7) + 48));
                            i9 = (i9 & 7) + 48;
                        }
                        sb.append((char) i9);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
