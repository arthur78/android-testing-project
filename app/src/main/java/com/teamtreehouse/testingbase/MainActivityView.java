package com.teamtreehouse.testingbase;

public interface MainActivityView {
    // Define all the actions we can take that affect the UI.
    public void changeTextViewText(String text);
    public void changeBackgroundColor(int color);
    public void launchOtherActivity(Class activity);
}
