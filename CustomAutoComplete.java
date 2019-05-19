package com.csns.indiastory.adapters;

import android.content.Context;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatAutoCompleteTextView;

public class CustomAutoComplete extends AppCompatAutoCompleteTextView {
    public CustomAutoComplete(Context context) {
        super(context);
    }

    public CustomAutoComplete(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomAutoComplete(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void replaceText(CharSequence text) {

    }

    @Override
    public void dismissDropDown() {

    }
}
