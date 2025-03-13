package p1;

import android.content.res.XmlResourceParser;
import q7.k;

public final class h extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(XmlResourceParser xmlResourceParser) {
        super("Unexpected node " + xmlResourceParser.getName() + " at line " + xmlResourceParser.getLineNumber());
        k.e(xmlResourceParser, "parser");
    }
}
