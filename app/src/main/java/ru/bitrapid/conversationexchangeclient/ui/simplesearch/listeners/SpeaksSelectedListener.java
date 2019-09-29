package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.view.View;
import android.widget.AdapterView;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;

public class SpeaksSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        SimpleSearchState.getInstance().setSpeaksIndex(i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
