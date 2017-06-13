package com.teamtreehouse.testingbase;

import android.graphics.Color;

public class MainActivityPresenter {
    // This class is responsible for "presenting" the view, and it's the only class allowed to call
    // the methods defined on the MainActivityView interface.

    // We should unit-test the methods of this presenter class, not the MainActivity.

    MainActivityView mView;

    public MainActivityPresenter(MainActivityView view) {
        mView = view;
    }

    public void editTextUpdated(String text) {
        mView.changeTextViewText(text);
    }

    public void colorSelected(int index) {
        switch (index) {
            case 0:
                mView.changeBackgroundColor(Color.WHITE);
                break;
            case 1:
                mView.changeBackgroundColor(Color.MAGENTA);
                break;
            case 2:
                mView.changeBackgroundColor(Color.GREEN);
                break;
            case 3:
                mView.changeBackgroundColor(Color.CYAN);
                break;
        }
    }

    public void launchOtherActivityButtonClicked(Class activity) {
        mView.launchOtherActivity(activity);
    }
}
