package com.example.norman_lee.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.norman_lee.myapplication", appContext.getPackageName());

    }

    //TODO 5.5 check that the layout of MainActivity has the required widgets
    @Test
    public void mainLayoutCorrect() {
        onView(withId(R.id.editTextValue)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonSetExchangeRate)).check(matches(isDisplayed()));
        onView(withId(R.id.buttonSetExchangeRate)).check(matches(withText(R.string.set_exchange_rate)));
    }

    //TODO we are going to enter a value in editTextValue and click the converter
    @Test
    public void enterValueAndConvert() {
        onView(withId(R.id.editTextValue)).perform(replaceText("100"));
        onView(withId(R.id.buttonConvert)).perform(click());
        onView(withId(R.id.textViewResult)).check(matches(withText("295.0")));

    }
    /* TODO 5.6 For 5 units of A buys 1 unit of B, enter these values in SubActivity and
       TODO 5.6 check that the result 0.2 is displayed in Main activity */

    @Test
    public void checkConversion() {
        onView(withId(R.id.buttonSetExchangeRate)).perform(click());
        onView(withId(R.id.editTextSubValueA)).perform(replaceText("5"));
        onView(withId(R.id.editTextSubValueB)).perform(replaceText("1"));
        onView(withId(R.id.buttonBackToCalculator)).perform(click());
        onView(withId(R.id.editTextValue)).perform(replaceText("100"));
        onView(withId(R.id.buttonConvert)).perform(click());
        onView(withId(R.id.textViewResult)).check(matches(withText("20.0")));

    }

    /* TODO 5.7 If 0 is entered in the editTextSubValueA in SubActivity
       TODO 5.7 check that textViewExchangeRate is not displayed when button is clicked
       TODO 5.7 this is a proxy for checking that the explicit intent is not carried out
     */


    //TODO 5.8 Write a class called CheckEditText to check that an editText widget is numberInput
    //TODO 5.8 Check that the EditText Widgets in this app accept numerical inputs only


    /* TODO 5.9 [On your own] check that if the EditText widgets in SubActivity are blank
       TODO 5.9 and button is clicked, MainActivity is not displayed (See TODO 5.6)
     */



}

