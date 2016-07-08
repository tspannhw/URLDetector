package com.dataflowdeveloper.detection;

import com.linkedin.urls.detection.UrlDetector;
import com.linkedin.urls.detection.UrlDetectorOptions;
import com.linkedin.urls.Url;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * utility
 *
 * @author tspann
 *         <p>
 *         detect URL using linkedin library
 */
public final class Util {

    private static final Logger LOG = Logger.getLogger(Util.class);

    /**
     * detect URLs
     *
     * @param stringToParse
     * @return String
     */
    public static String detect(String stringToParse) {

        StringBuilder out = new StringBuilder(256);

        UrlDetector parser = null;

        try {
            parser = new UrlDetector(stringToParse, UrlDetectorOptions.Default);
            List<Url> found = parser.detect();
            for (Url url : found) {
                System.out.println("Scheme: " + url.getScheme());
                System.out.println("Host: " + url.getHost());
                System.out.println("Path: " + url.getPath());

                out.append(url.getHost()).append(",");
            }
        } catch (Exception e) {
            LOG.error("URLDetector failed", e);
        }

        return out.toString();
    }
}
