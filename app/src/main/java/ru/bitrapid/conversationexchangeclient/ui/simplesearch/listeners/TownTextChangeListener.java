package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.text.Editable;
import android.text.TextWatcher;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;

public class TownTextChangeListener implements TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        SimpleSearchState.getInstance().setTown(charSequence.toString());

    }

    @Override
    public void afterTextChanged(Editable editable) {
    }
}
