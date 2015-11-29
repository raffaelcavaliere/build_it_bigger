package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


/**
 * Created by raffaelcavaliere on 2015-11-28.
 */

public class EndpointAsyncTaskTest extends AndroidTestCase {
    public void testEndpointAsyncTask() {
        final CountDownLatch signal = new CountDownLatch(1);
        new EndpointAsyncTask(this.getContext()) {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                assertTrue(result.length() > 0);
                signal.countDown();
            }
        }.execute();
        try {
            boolean done = signal.await(5, TimeUnit.SECONDS);
            if (!done) {
                fail("Took more than 5 seconds to retrieve information from backend service.");
            }
        } catch (InterruptedException e) {
            fail(e.getMessage());
        }
    }
}