package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.view.View;
import android.widget.AdapterView;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;

public class LearningSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        SimpleSearchState.getInstance().setLearningIndex(i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
