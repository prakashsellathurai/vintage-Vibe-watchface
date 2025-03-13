package h0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class b implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f4725a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f4726b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4727c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4728d;

        public a(PrecomputedText.Params params) {
            this.f4725a = params.getTextPaint();
            this.f4726b = params.getTextDirection();
            this.f4727c = params.getBreakStrategy();
            this.f4728d = params.getHyphenationFrequency();
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r7 != r6) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r7 instanceof h0.b.a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                h0.b$a r7 = (h0.b.a) r7
                int r1 = r7.f4727c
                int r3 = r6.f4727c
                if (r3 == r1) goto L_0x0015
            L_0x0012:
                r1 = r2
                goto L_0x009b
            L_0x0015:
                int r1 = r6.f4728d
                int r3 = r7.f4728d
                if (r1 == r3) goto L_0x001c
                goto L_0x0012
            L_0x001c:
                android.text.TextPaint r1 = r6.f4725a
                float r3 = r1.getTextSize()
                android.text.TextPaint r4 = r7.f4725a
                float r5 = r4.getTextSize()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x002d
                goto L_0x0012
            L_0x002d:
                float r3 = r1.getTextScaleX()
                float r5 = r4.getTextScaleX()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x003a
                goto L_0x0012
            L_0x003a:
                float r3 = r1.getTextSkewX()
                float r5 = r4.getTextSkewX()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x0047
                goto L_0x0012
            L_0x0047:
                float r3 = r1.getLetterSpacing()
                float r5 = r4.getLetterSpacing()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x0054
                goto L_0x0012
            L_0x0054:
                java.lang.String r3 = r1.getFontFeatureSettings()
                java.lang.String r5 = r4.getFontFeatureSettings()
                boolean r3 = android.text.TextUtils.equals(r3, r5)
                if (r3 != 0) goto L_0x0063
                goto L_0x0012
            L_0x0063:
                int r3 = r1.getFlags()
                int r5 = r4.getFlags()
                if (r3 == r5) goto L_0x006e
                goto L_0x0012
            L_0x006e:
                android.os.LocaleList r3 = r1.getTextLocales()
                android.os.LocaleList r5 = r4.getTextLocales()
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x007d
                goto L_0x0012
            L_0x007d:
                android.graphics.Typeface r3 = r1.getTypeface()
                if (r3 != 0) goto L_0x008a
                android.graphics.Typeface r1 = r4.getTypeface()
                if (r1 == 0) goto L_0x009a
                goto L_0x0012
            L_0x008a:
                android.graphics.Typeface r1 = r1.getTypeface()
                android.graphics.Typeface r3 = r4.getTypeface()
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L_0x009a
                goto L_0x0012
            L_0x009a:
                r1 = r0
            L_0x009b:
                if (r1 != 0) goto L_0x009e
                return r2
            L_0x009e:
                android.text.TextDirectionHeuristic r6 = r6.f4726b
                android.text.TextDirectionHeuristic r7 = r7.f4726b
                if (r6 == r7) goto L_0x00a5
                return r2
            L_0x00a5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.b.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            TextPaint textPaint = this.f4725a;
            return i0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4726b, Integer.valueOf(this.f4727c), Integer.valueOf(this.f4728d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f4725a;
            sb2.append(textPaint.getTextSize());
            sb.append(sb2.toString());
            sb.append(", textScaleX=" + textPaint.getTextScaleX());
            sb.append(", textSkewX=" + textPaint.getTextSkewX());
            sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb.append(", textLocale=" + textPaint.getTextLocales());
            sb.append(", typeface=" + textPaint.getTypeface());
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb.append(", textDir=" + this.f4726b);
            sb.append(", breakStrategy=" + this.f4727c);
            sb.append(", hyphenationFrequency=" + this.f4728d);
            sb.append("}");
            return sb.toString();
        }
    }

    public final char charAt(int i8) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i8, int i9, Class<T> cls) {
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i8, int i9, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public final void setSpan(Object obj, int i8, int i9, int i10) {
        if (!(obj instanceof MetricAffectingSpan)) {
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public final CharSequence subSequence(int i8, int i9) {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
