package o;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import k3.j;

public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5974a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5975b;

    static {
        new j
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:k3.j) =  call: k3.j.<init>():void type: CONSTRUCTOR in method: o.a.<clinit>():void, dex: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            k3.j r0 = new k3.j
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a.<clinit>():void");
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f5975b;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f5974a;
    }

    public void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    public void setCardBackgroundColor(int i8) {
        ColorStateList.valueOf(i8);
        throw null;
    }

    public void setCardElevation(float f9) {
        throw null;
    }

    public void setMaxCardElevation(float f9) {
        throw null;
    }

    public void setMinimumHeight(int i8) {
        super.setMinimumHeight(i8);
    }

    public void setMinimumWidth(int i8) {
        super.setMinimumWidth(i8);
    }

    public final void setPadding(int i8, int i9, int i10, int i11) {
    }

    public final void setPaddingRelative(int i8, int i9, int i10, int i11) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f5975b) {
            this.f5975b = z8;
            throw null;
        }
    }

    public void setRadius(float f9) {
        throw null;
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f5974a != z8) {
            this.f5974a = z8;
            throw null;
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }
}
