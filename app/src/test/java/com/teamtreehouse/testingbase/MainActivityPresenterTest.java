package com.teamtreehouse.testingbase;

import android.graphics.Color;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityPresenterTest {

    MainActivityPresenter mPresenter;

    @Mock
    MainActivityView mView;

    @Before
    public void setUp() throws Exception {
        mPresenter = new MainActivityPresenter(mView);
    }

    @Test
    public void editTextUpdated() throws Exception {
        // Arrange.
        String givenString = "123text";

        // Act.
        mPresenter.editTextUpdated(givenString);

        // Assert.
        Mockito.verify(mView).changeTextViewText(givenString);
    }

    @Test
    public void colorSelected() throws Exception {
        int index = 2;
        int givenColor = Color.GREEN;

        mPresenter.colorSelected(index);

        Mockito.verify(mView).changeBackgroundColor(givenColor);
    }

    @Test
    public void launchOtherActivityButtonClicked() throws Exception {
        Class clazz = OtherActivity.class;

        mPresenter.launchOtherActivityButtonClicked(clazz);

        Mockito.verify(mView).launchOtherActivity(clazz);
    }

}