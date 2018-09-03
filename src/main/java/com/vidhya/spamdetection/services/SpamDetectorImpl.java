package com.vidhya.spamdetection.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * This class is to detect the unauthorized comment messages matched with the given spam words list
 */

public class SpamDetectorImpl implements SpamDetector {
    private List<String> wordsList = new ArrayList<String>();

    public SpamDetectorImpl(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filename));
        this.wordsList = IOUtils.readLines(fis);
    }

    @Override
    public boolean isSpam(String value) {
        for (String spam : wordsList) {
            if (value.toLowerCase().contains(spam)) {
                return true;
            }
        }
        return false;
    }

}
