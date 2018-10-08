package com.mayank.uddishverma.currencyconverter;

/**
 * Created by AndroidDeveloper on 10/8/2018.
 */

import com.mayank.uddishverma.currencyconverter.utils.Globals;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestGlobalClass {
    @Test
    public void TestGetCurrencyName() throws Exception {
        String name = Globals.getCountryCurrencyName("VES");
        System.out.println(name);
        assertEquals("Test", "Bolivar Soberano", name.toString());
    }
}
