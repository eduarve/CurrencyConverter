package com.mayank.uddishverma.currencyconverter;

import com.mayank.uddishverma.currencyconverter.utils.NumberToLetterConverter;
import com.mayank.uddishverma.currencyconverter.utils.Numero;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by AndroidDeveloper on 10/8/2018.
 */

public class TestConvertirNumerosALetras {
    @Test
    public void testLetrasANumeros () throws  Exception {
        String valor = Numero.enLetras(BigDecimal.valueOf(Double.parseDouble("12501350000.50")));
        System.out.println(valor);
    }
}
