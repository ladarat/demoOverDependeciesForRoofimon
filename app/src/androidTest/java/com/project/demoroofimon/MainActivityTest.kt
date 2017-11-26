package com.project.demoroofimon


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4
import com.project.demoroofimon.framework.AcceptanceTest
import org.hamcrest.Matchers.allOf
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest : AcceptanceTest<MainActivity>(MainActivity::class.java) {

    @Test
    fun mainActivityTest() {
        onView(withText("Hello World!")).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(allOf(withId(R.id.intentToNewActivityButton), isDisplayed())).perform(click())
        onView(withText("Page 2 Jaa")).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }
}
