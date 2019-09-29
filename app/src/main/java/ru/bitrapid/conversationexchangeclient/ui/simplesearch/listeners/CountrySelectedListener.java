package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.view.View;
import android.widget.AdapterView;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;

public class CountrySelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        SimpleSearchState.getInstance().setCountryIndex(i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
