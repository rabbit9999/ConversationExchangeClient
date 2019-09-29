package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.view.View;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.SimpleSearchFragment;

public class SerchBtnOnClickListener implements View.OnClickListener {

    private SimpleSearchFragment parentFragment;

    public SerchBtnOnClickListener(SimpleSearchFragment parentFragment){
        this.parentFragment = parentFragment;
    }

    @Override
    public void onClick(View view) {
        parentFragment.doSearch();
    }
}
