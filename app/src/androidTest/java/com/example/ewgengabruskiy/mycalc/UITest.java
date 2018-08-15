package com.example.ewgengabruskiy.mycalc;


import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)

public class UITest {


//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule =
//            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void UITest (){

        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("3")));
        onView(withId(R.id.buttonDiv)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("0")));
        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Error")));

    }
}
