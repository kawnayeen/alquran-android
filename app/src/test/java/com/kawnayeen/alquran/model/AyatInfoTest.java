package com.kawnayeen.alquran.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawnayeen on 6/18/17.
 */
public class AyatInfoTest {
    @Test
    public void testUniqueIdGeneration() {
        AyatInfo ayatInfo = new AyatInfo("001", "003");
        Assert.assertEquals("001003", ayatInfo.getUniqueId());
    }
}