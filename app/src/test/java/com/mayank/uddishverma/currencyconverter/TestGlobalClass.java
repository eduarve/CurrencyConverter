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

    @Test
    public void TestCurrenciesFormat() throws Exception {
        Globals.getCountryCode(null);
        String value = Globals.convertCurrency("VES", "VEF", "1");
        System.out.println(value);
        assertEquals("TestCurrencies", "100000.00", value.toString());
        value = Globals.convertCurrency("VEF", "VES", "100000");
        System.out.println(value);
        assertEquals("TestCurrencies", "1.00", value.toString());
        value = Globals.convertCurrency("VES", "PTR", "1800");
        System.out.println(value);
        assertEquals("TestCurrencies", "0.50000000", value.toString());
    }
}
