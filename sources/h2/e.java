package h2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import k2.c;
import y1.f;
import y1.g;
import y1.r;
import y7.b0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f4746a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f4747b;

    public e(d dVar, b0 b0Var) {
        this.f4746a = dVar;
        this.f4747b = b0Var;
    }

    public final r<f> a(String str, InputStream inputStream, String str2, String str3) {
        b bVar;
        r<f> rVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        d dVar = this.f4746a;
        if (contains || str.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            bVar = b.f4741h;
            rVar = str3 == null ? g.f(new ZipInputStream(inputStream), (String) null) : g.f(new ZipInputStream(new FileInputStream(dVar.j(str, inputStream, bVar))), str);
        } else {
            c.a();
            bVar = b.f4740g;
            rVar = str3 == null ? g.c(inputStream, (String) null) : g.c(new FileInputStream(new File(dVar.j(str, inputStream, bVar).getAbsolutePath())), str);
        }
        if (!(str3 == null || rVar.f8321a == null)) {
            dVar.getClass();
            File file = new File(dVar.d(), d.c(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return rVar;
    }
}
