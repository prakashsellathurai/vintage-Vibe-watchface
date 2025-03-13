package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.health.services.client.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import u4.j;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f3536a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f3537b;

    public class a extends j {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f3536a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            } else {
                chipTextInputComboView.f3536a.setText(ChipTextInputComboView.a(chipTextInputComboView, editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f3536a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3537b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final boolean isChecked() {
        return this.f3536a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3537b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z8) {
        Chip chip = this.f3536a;
        chip.setChecked(z8);
        int i8 = 0;
        int i9 = z8 ? 0 : 4;
        EditText editText = this.f3537b;
        editText.setVisibility(i9);
        if (z8) {
            i8 = 8;
        }
        chip.setVisibility(i8);
        if (isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3536a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i8, Object obj) {
        this.f3536a.setTag(i8, obj);
    }

    public final void toggle() {
        this.f3536a.toggle();
    }
}
