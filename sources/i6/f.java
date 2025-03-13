package i6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class f extends DefaultHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Stack<e> f4866a = new Stack<>();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f4867b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public e f4868c;

    public final void characters(char[] cArr, int i8, int i9) {
        String replaceAll = new String(cArr, i8, i9).replaceAll("[  -‏ -  　ㅤ᠋-᠎\t\r\n]", "");
        boolean z8 = false;
        if (!replaceAll.isEmpty()) {
            if (!(replaceAll.trim().length() == 0)) {
                z8 = true;
            }
        }
        if (z8) {
            Stack<e> stack = this.f4866a;
            if (!(stack.peek() instanceof c)) {
                c cVar = new c();
                stack.peek().a(cVar);
                stack.push(cVar);
            }
            c cVar2 = (c) stack.peek();
            cVar2.e = cVar2.e.concat(replaceAll);
        }
    }

    public final void endElement(String str, String str2, String str3) {
        Stack<e> stack = this.f4866a;
        if (stack.peek() instanceof c) {
            stack.pop();
        }
        stack.pop();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        e eVar;
        str2.getClass();
        char c9 = 65535;
        switch (str2.hashCode()) {
            case -1238332596:
                if (str2.equals("Transform")) {
                    c9 = 0;
                    break;
                }
                break;
            case -336538743:
                if (str2.equals("Parameter")) {
                    c9 = 1;
                    break;
                }
                break;
            case 8287778:
                if (str2.equals("InlineImage")) {
                    c9 = 2;
                    break;
                }
                break;
            case 70760763:
                if (str2.equals("Image")) {
                    c9 = 3;
                    break;
                }
                break;
            case 198012600:
                if (str2.equals("Expression")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                eVar = new d(str2, attributes, 4);
                break;
            case 1:
                eVar = new d(str2, attributes, 3);
                break;
            case 2:
                eVar = new d(str2, attributes, 2);
                break;
            case 3:
                eVar = new d(str2, attributes, 1);
                break;
            case 4:
                eVar = new d(str2, attributes, 0);
                break;
            default:
                eVar = new e(str2, attributes);
                break;
        }
        Stack<e> stack = this.f4866a;
        if (stack.empty()) {
            this.f4868c = eVar;
        } else {
            if (stack.peek() instanceof c) {
                stack.pop();
            }
            stack.peek().a(eVar);
        }
        stack.push(eVar);
        LinkedHashMap linkedHashMap = this.f4867b;
        List list = (List) linkedHashMap.get(str2);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(eVar);
        linkedHashMap.put(str2, list);
        if (eVar instanceof b) {
            List list2 = (List) linkedHashMap.get("DataSource");
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.add(eVar);
            linkedHashMap.put("DataSource", list2);
        }
    }
}
