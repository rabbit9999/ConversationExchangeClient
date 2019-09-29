package ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners;

import android.widget.CompoundButton;

import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;

public class FaceToFaceChangeListener implements CompoundButton.OnCheckedChangeListener {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        SimpleSearchState.getInstance().setFaceToFace(b);
    }
}
