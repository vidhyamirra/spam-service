package com.vidhya.integration.test;

import org.junit.Test;

import com.vidhya.spamdetection.services.SpamDetector;
import com.vidhya.spamdetection.services.SpamDetectorImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SpamDetectorServiceTest {

    @Test
    public void testIsSpamTrue() throws Exception {
        SpamDetector spamDetector = new SpamDetectorImpl("src/test/resources/words.spam");
       // assertTrue(spamDetector.isSpam("Blocked commment"));
    }

    @Test
    public void testIsSpamFalse() throws Exception {
        SpamDetector spamDetector = new SpamDetectorImpl("src/test/resources/words.spam");
        assertFalse(spamDetector.isSpam("Amazing Art"));
     }
}