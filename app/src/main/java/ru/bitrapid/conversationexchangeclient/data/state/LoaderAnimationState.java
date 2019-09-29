package ru.bitrapid.conversationexchangeclient.data.state;

public class LoaderAnimationState {
    private static LoaderAnimationState instance;

    public static LoaderAnimationState getInstance(){
        if(instance == null){
            instance = new LoaderAnimationState();
        }
        return instance;
    }

    private LoaderAnimationState(){

    }

    private boolean enabled = false;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
