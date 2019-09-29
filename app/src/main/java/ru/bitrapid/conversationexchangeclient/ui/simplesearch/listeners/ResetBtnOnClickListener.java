package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.view.View;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.SimpleSearchFragment;

public class ResetBtnOnClickListener implements View.OnClickListener {

    private SimpleSearchFragment parentFragment;

    public ResetBtnOnClickListener(SimpleSearchFragment parentFragment){
        this.parentFragment = parentFragment;
    }

    @Override
    public void onClick(View view) {
        SimpleSearchState.getInstance().reset();
        parentFragment.updateViewData();
    }
}
