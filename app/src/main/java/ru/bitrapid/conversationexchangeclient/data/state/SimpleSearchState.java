package ru.bitrapid.conversationexchangeclient.data.state;

public class SimpleSearchState extends PermanentState {
    private static SimpleSearchState instance;

    public static SimpleSearchState getInstance(){
        if(instance == null){
            instance = new SimpleSearchState();
        }
        return instance;
    }

    private SimpleSearchState(){
        super(SimpleSearchState.class);
        loadData();
    }

    @Permanent
    private int speaksIndex;
    @Permanent
    private int countryIndex;
    @Permanent
    private int learningIndex;
    @Permanent
    private String town = "";
    @Permanent
    private boolean faceToFace;
    @Permanent
    private boolean correspondence;
    @Permanent
    private boolean chatSoftware;

    public void reset(){
        speaksIndex = 0;
        countryIndex = 0;
        learningIndex = 0;
        town = "";
        faceToFace = false;
        correspondence = false;
        chatSoftware = false;

        syncStorage();
    }


    public int getSpeaksIndex() {
        return speaksIndex;
    }

    public void setSpeaksIndex(int speaksIndex) {
        this.speaksIndex = speaksIndex;
        syncStorage();
    }

    public int getCountryIndex() {
        return countryIndex;
    }

    public void setCountryIndex(int countryIndex) {
        this.countryIndex = countryIndex;
        syncStorage();
    }

    public int getLearningIndex() {
        return learningIndex;
    }

    public void setLearningIndex(int learningIndex) {
        this.learningIndex = learningIndex;
        syncStorage();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        syncStorage();
    }

    public boolean isFaceToFace() {
        return faceToFace;
    }

    public void setFaceToFace(boolean faceToFace) {
        this.faceToFace = faceToFace;
        syncStorage();
    }

    public boolean isCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(boolean correspondence) {
        this.correspondence = correspondence;
        syncStorage();
    }

    public boolean isChatSoftware() {
        return chatSoftware;
    }

    public void setChatSoftware(boolean chatSoftware) {
        this.chatSoftware = chatSoftware;
        syncStorage();
    }
}
