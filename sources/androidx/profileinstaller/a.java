package androidx.profileinstaller;

import java.io.File;

public final class a {
    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z8 = true;
            for (int i8 = 0; i8 < length; i8++) {
                z8 = a(listFiles[i8]) && z8;
            }
            return z8;
        }
        file.delete();
        return true;
    }
}
