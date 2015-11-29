package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Intent;
import android.test.AndroidTestCase;
import android.test.ApplicationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}
