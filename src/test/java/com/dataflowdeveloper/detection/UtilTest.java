package com.dataflowdeveloper.detection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tspann on 7/8/16.
 */
public class UtilTest {
    @Test
    public void detect() throws Exception {
        assertNotNull(Util.detect("my string has.com URL http://stuff.com/##?#?$?#?$#$  mailto:tim@stuff"));
    }

}