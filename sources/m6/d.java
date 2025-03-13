package m6;

import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import g6.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f5463a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5464b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5465c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5466d;

    public d(a aVar, int i8, int i9, int i10) {
        this.f5463a = aVar;
        this.f5464b = i8;
        this.f5465c = i9;
        this.f5466d = i10;
    }

    public static ArrayList a(XmlResourceParser xmlResourceParser) {
        ArrayList arrayList = new ArrayList();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2 && Objects.equals(xmlResourceParser.getName(), "WatchFace")) {
                    arrayList.add(new d(a.valueOf(xmlResourceParser.getAttributeValue((String) null, "shape")), Integer.parseInt(xmlResourceParser.getAttributeValue((String) null, "width")), Integer.parseInt(xmlResourceParser.getAttributeValue((String) null, "height")), asAttributeSet.getAttributeResourceValue((String) null, "file", 0)));
                }
                eventType = xmlResourceParser.next();
            }
            return arrayList;
        } catch (IOException | IllegalArgumentException | XmlPullParserException e) {
            Log.e("DWF:WatchFaceShapeDefinition", "Failed to parse watch face shape definition. Error: " + e.getMessage());
            return new ArrayList();
        }
    }
}
