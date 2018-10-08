package com.mayank.uddishverma.currencyconverter.utils;

import android.content.Context;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by mayankaggarwal on 11/06/17.
 */

public class Globals {

    public static String errorRes = "";

    public static String initalCurrnecyJson = "{\n" +
            "    \"status\": true,\n" +
            "    \"currency\": {\n" +
            "        \"success\": true,\n" +
            "        \"terms\": \"https://currencylayer.com/terms\",\n" +
            "        \"privacy\": \"https://currencylayer.com/privacy\",\n" +
            "        \"timestamp\": 1497186671,\n" +
            "        \"source\": \"VES\",\n" +
            "        \"quotes\": {\n" +
    //        "            \"USDCOP\": 2913,\n" +
    //        "            \"USDEUR\": 0.893104,\n" +
    //        "            \"USDPLN\": 3.737604,\n" +
            "            \"VESVES\": 1,\n" +
            "            \"VESVEF\": 100000,\n" +
            "            \"VESPTR\": 0.000277777777777\n" +
    //        "            \"VESUSD\": 0.0097910\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public static String allThingsJson() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\n" +
                "    \"results\": {\n" +
                "        \"PTR\": {\n" +
                "            \"alpha3\": \"PTR\",\n" +
                "            \"currencyId\": \"PTR\",\n" +
                "            \"currencyName\": \"Criptomoneda Petro\",\n" +
                "            \"currencySymbol\": \"P\",\n" +
                "            \"id\": \"PT\",\n" +
                "            \"name\": \"Petro\"\n" +
                "        },\n" +
                "        \"VEF\": {\n" +
                "            \"alpha3\": \"VEF\",\n" +
                "            \"currencyId\": \"VEF\",\n" +
                "            \"currencyName\": \"Bolivar Fuerte\",\n" +
                "            \"currencySymbol\": \"Bs\",\n" +
                "            \"id\": \"VE\",\n" +
                "            \"name\": \"BOLIVAR FUERTE\"\n" +
                "        },\n" +
                "        \"AF\": {\n" +
                "            \"alpha3\": \"AFG\",\n" +
                "            \"currencyId\": \"AFN\",\n" +
                "            \"currencyName\": \"Afghan afghani\",\n" +
                "            \"currencySymbol\": \"؋\",\n" +
                "            \"id\": \"AF\",\n" +
                "            \"name\": \"Afghanistan\"\n" +
                "        },\n" +
                "        \"AI\": {\n" +
                "            \"alpha3\": \"AIA\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"AI\",\n" +
                "            \"name\": \"Anguilla\"\n" +
                "        },\n" +
                "        \"AU\": {\n" +
                "            \"alpha3\": \"AUS\",\n" +
                "            \"currencyId\": \"AUD\",\n" +
                "            \"currencyName\": \"Australian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"AU\",\n" +
                "            \"name\": \"Australia\"\n" +
                "        },\n" +
                "        \"BD\": {\n" +
                "            \"currencyId\": \"BDT\",\n" +
                "            \"currencyName\": \"Bangladeshi taka\",\n" +
                "            \"name\": \"Bangladesh\",\n" +
                "            \"alpha3\": \"BGD\",\n" +
                "            \"id\": \"BD\"\n" +
                "        },\n" +
                "        \"BJ\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Benin\",\n" +
                "            \"alpha3\": \"BEN\",\n" +
                "            \"id\": \"BJ\"\n" +
                "        },\n" +
                "        \"BR\": {\n" +
                "            \"alpha3\": \"BRA\",\n" +
                "            \"currencyId\": \"BRL\",\n" +
                "            \"currencyName\": \"Brazilian real\",\n" +
                "            \"currencySymbol\": \"R$\",\n" +
                "            \"id\": \"BR\",\n" +
                "            \"name\": \"Brazil\"\n" +
                "        },\n" +
                "        \"KH\": {\n" +
                "            \"alpha3\": \"KHM\",\n" +
                "            \"currencyId\": \"KHR\",\n" +
                "            \"currencyName\": \"Cambodian riel\",\n" +
                "            \"currencySymbol\": \"៛\",\n" +
                "            \"id\": \"KH\",\n" +
                "            \"name\": \"Cambodia\"\n" +
                "        },\n" +
                "        \"TD\": {\n" +
                "            \"currencyId\": \"XAF\",\n" +
                "            \"currencyName\": \"Central African CFA franc\",\n" +
                "            \"name\": \"Chad\",\n" +
                "            \"alpha3\": \"TCD\",\n" +
                "            \"id\": \"TD\"\n" +
                "        },\n" +
                "        \"CG\": {\n" +
                "            \"currencyId\": \"XAF\",\n" +
                "            \"currencyName\": \"Central African CFA franc\",\n" +
                "            \"name\": \"Congo\",\n" +
                "            \"alpha3\": \"COG\",\n" +
                "            \"id\": \"CG\"\n" +
                "        },\n" +
                "        \"CU\": {\n" +
                "            \"currencyId\": \"CUP\",\n" +
                "            \"currencyName\": \"Cuban peso\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"name\": \"Cuba\",\n" +
                "            \"alpha3\": \"CUB\",\n" +
                "            \"id\": \"CU\"\n" +
                "        },\n" +
                "        \"DM\": {\n" +
                "            \"alpha3\": \"DMA\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"DM\",\n" +
                "            \"name\": \"Dominica\"\n" +
                "        },\n" +
                "        \"GE\": {\n" +
                "            \"currencyId\": \"GEL\",\n" +
                "            \"currencyName\": \"Georgian lari\",\n" +
                "            \"name\": \"Georgia\",\n" +
                "            \"alpha3\": \"GEO\",\n" +
                "            \"id\": \"GE\"\n" +
                "        },\n" +
                "        \"GD\": {\n" +
                "            \"alpha3\": \"GRD\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"GD\",\n" +
                "            \"name\": \"Grenada\"\n" +
                "        },\n" +
                "        \"HT\": {\n" +
                "            \"currencyId\": \"HTG\",\n" +
                "            \"currencyName\": \"Haitian gourde\",\n" +
                "            \"name\": \"Haiti\",\n" +
                "            \"alpha3\": \"HTI\",\n" +
                "            \"id\": \"HT\"\n" +
                "        },\n" +
                "        \"IN\": {\n" +
                "            \"alpha3\": \"IND\",\n" +
                "            \"currencyId\": \"INR\",\n" +
                "            \"currencyName\": \"Indian rupee\",\n" +
                "            \"currencySymbol\": \"₹\",\n" +
                "            \"id\": \"IN\",\n" +
                "            \"name\": \"India\"\n" +
                "        },\n" +
                "        \"IL\": {\n" +
                "            \"alpha3\": \"ISR\",\n" +
                "            \"currencyId\": \"ILS\",\n" +
                "            \"currencyName\": \"Israeli new sheqel\",\n" +
                "            \"currencySymbol\": \"₪\",\n" +
                "            \"id\": \"IL\",\n" +
                "            \"name\": \"Israel\"\n" +
                "        },\n" +
                "        \"KZ\": {\n" +
                "            \"alpha3\": \"KAZ\",\n" +
                "            \"currencyId\": \"KZT\",\n" +
                "            \"currencyName\": \"Kazakhstani tenge\",\n" +
                "            \"currencySymbol\": \"лв\",\n" +
                "            \"id\": \"KZ\",\n" +
                "            \"name\": \"Kazakhstan\"\n" +
                "        },\n" +
                "        \"KW\": {\n" +
                "            \"currencyId\": \"KWD\",\n" +
                "            \"currencyName\": \"Kuwaiti dinar\",\n" +
                "            \"name\": \"Kuwait\",\n" +
                "            \"alpha3\": \"KWT\",\n" +
                "            \"id\": \"KW\"\n" +
                "        },\n" +
                "        \"LS\": {\n" +
                "            \"currencyId\": \"LSL\",\n" +
                "            \"currencyName\": \"Lesotho loti\",\n" +
                "            \"name\": \"Lesotho\",\n" +
                "            \"alpha3\": \"LSO\",\n" +
                "            \"id\": \"LS\"\n" +
                "        },\n" +
                "        \"MY\": {\n" +
                "            \"alpha3\": \"MYS\",\n" +
                "            \"currencyId\": \"MYR\",\n" +
                "            \"currencyName\": \"Malaysian ringgit\",\n" +
                "            \"currencySymbol\": \"RM\",\n" +
                "            \"id\": \"MY\",\n" +
                "            \"name\": \"Malaysia\"\n" +
                "        },\n" +
                "        \"MU\": {\n" +
                "            \"alpha3\": \"MUS\",\n" +
                "            \"currencyId\": \"MUR\",\n" +
                "            \"currencyName\": \"Mauritian rupee\",\n" +
                "            \"currencySymbol\": \"₨\",\n" +
                "            \"id\": \"MU\",\n" +
                "            \"name\": \"Mauritius\"\n" +
                "        },\n" +
                "        \"MN\": {\n" +
                "            \"alpha3\": \"MNG\",\n" +
                "            \"currencyId\": \"MNT\",\n" +
                "            \"currencyName\": \"Mongolian tugrik\",\n" +
                "            \"currencySymbol\": \"₮\",\n" +
                "            \"id\": \"MN\",\n" +
                "            \"name\": \"Mongolia\"\n" +
                "        },\n" +
                "        \"MM\": {\n" +
                "            \"currencyId\": \"MMK\",\n" +
                "            \"currencyName\": \"Myanma kyat\",\n" +
                "            \"name\": \"Myanmar\",\n" +
                "            \"alpha3\": \"MMR\",\n" +
                "            \"id\": \"MM\"\n" +
                "        },\n" +
                "        \"NC\": {\n" +
                "            \"currencyId\": \"XPF\",\n" +
                "            \"currencyName\": \"CFP franc\",\n" +
                "            \"name\": \"New Caledonia\",\n" +
                "            \"alpha3\": \"NCL\",\n" +
                "            \"id\": \"NC\"\n" +
                "        },\n" +
                "        \"NO\": {\n" +
                "            \"alpha3\": \"NOR\",\n" +
                "            \"currencyId\": \"NOK\",\n" +
                "            \"currencyName\": \"Norwegian krone\",\n" +
                "            \"currencySymbol\": \"kr\",\n" +
                "            \"id\": \"NO\",\n" +
                "            \"name\": \"Norway\"\n" +
                "        },\n" +
                "        \"PG\": {\n" +
                "            \"currencyId\": \"PGK\",\n" +
                "            \"currencyName\": \"Papua New Guinean kina\",\n" +
                "            \"name\": \"Papua New Guinea\",\n" +
                "            \"alpha3\": \"PNG\",\n" +
                "            \"id\": \"PG\"\n" +
                "        },\n" +
                "        \"RW\": {\n" +
                "            \"currencyId\": \"RWF\",\n" +
                "            \"currencyName\": \"Rwandan franc\",\n" +
                "            \"name\": \"Rwanda\",\n" +
                "            \"alpha3\": \"RWA\",\n" +
                "            \"id\": \"RW\"\n" +
                "        },\n" +
                "        \"WS\": {\n" +
                "            \"currencyId\": \"WST\",\n" +
                "            \"currencyName\": \"Samoan tala\",\n" +
                "            \"name\": \"Samoa (Western)\",\n" +
                "            \"alpha3\": \"WSM\",\n" +
                "            \"id\": \"WS\"\n" +
                "        },\n" +
                "        \"RS\": {\n" +
                "            \"alpha3\": \"SRB\",\n" +
                "            \"currencyId\": \"RSD\",\n" +
                "            \"currencyName\": \"Serbian dinar\",\n" +
                "            \"currencySymbol\": \"Дин.\",\n" +
                "            \"id\": \"RS\",\n" +
                "            \"name\": \"Serbia\"\n" +
                "        },\n" +
                "        \"SE\": {\n" +
                "            \"alpha3\": \"SWE\",\n" +
                "            \"currencyId\": \"SEK\",\n" +
                "            \"currencyName\": \"Swedish krona\",\n" +
                "            \"currencySymbol\": \"kr\",\n" +
                "            \"id\": \"SE\",\n" +
                "            \"name\": \"Sweden\"\n" +
                "        },\n" +
                "        \"TZ\": {\n" +
                "            \"alpha3\": \"TZA\",\n" +
                "            \"currencyId\": \"TZS\",\n" +
                "            \"currencyName\": \"Tanzanian shilling\",\n" +
                "            \"currencySymbol\": \"TSh\",\n" +
                "            \"id\": \"TZ\",\n" +
                "            \"name\": \"Tanzania\"\n" +
                "        },\n" +
                "        \"TN\": {\n" +
                "            \"currencyId\": \"TND\",\n" +
                "            \"currencyName\": \"Tunisian dinar\",\n" +
                "            \"name\": \"Tunisia\",\n" +
                "            \"alpha3\": \"TUN\",\n" +
                "            \"id\": \"TN\"\n" +
                "        },\n" +
                "        \"UA\": {\n" +
                "            \"alpha3\": \"UKR\",\n" +
                "            \"currencyId\": \"UAH\",\n" +
                "            \"currencyName\": \"Ukrainian hryvnia\",\n" +
                "            \"currencySymbol\": \"₴\",\n" +
                "            \"id\": \"UA\",\n" +
                "            \"name\": \"Ukraine\"\n" +
                "        },\n" +
                "        \"UZ\": {\n" +
                "            \"alpha3\": \"UZB\",\n" +
                "            \"currencyId\": \"UZS\",\n" +
                "            \"currencyName\": \"Uzbekistani som\",\n" +
                "            \"currencySymbol\": \"лв\",\n" +
                "            \"id\": \"UZ\",\n" +
                "            \"name\": \"Uzbekistan\"\n" +
                "        },\n" +
                "        \"YE\": {\n" +
                "            \"alpha3\": \"YEM\",\n" +
                "            \"currencyId\": \"YER\",\n" +
                "            \"currencyName\": \"Yemeni rial\",\n" +
                "            \"currencySymbol\": \"﷼\",\n" +
                "            \"id\": \"YE\",\n" +
                "            \"name\": \"Yemen\"\n" +
                "        },\n" +
                "        \"DZ\": {\n" +
                "            \"currencyId\": \"DZD\",\n" +
                "            \"currencyName\": \"Algerian dinar\",\n" +
                "            \"name\": \"Algeria\",\n" +
                "            \"alpha3\": \"DZA\",\n" +
                "            \"id\": \"DZ\"\n" +
                "        },\n" +
                "        \"AR\": {\n" +
                "            \"alpha3\": \"ARG\",\n" +
                "            \"currencyId\": \"ARS\",\n" +
                "            \"currencyName\": \"Argentine peso\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"AR\",\n" +
                "            \"name\": \"Argentina\"\n" +
                "        },\n" +
                "        \"AZ\": {\n" +
                "            \"alpha3\": \"AZE\",\n" +
                "            \"currencyId\": \"AZN\",\n" +
                "            \"currencyName\": \"Azerbaijani manat\",\n" +
                "            \"currencySymbol\": \"ман\",\n" +
                "            \"id\": \"AZ\",\n" +
                "            \"name\": \"Azerbaijan\"\n" +
                "        },\n" +
                "        \"BY\": {\n" +
                "            \"alpha3\": \"BLR\",\n" +
                "            \"currencyId\": \"BYR\",\n" +
                "            \"currencyName\": \"Belarusian ruble\",\n" +
                "            \"currencySymbol\": \"p.\",\n" +
                "            \"id\": \"BY\",\n" +
                "            \"name\": \"Belarus\"\n" +
                "        },\n" +
                "        \"BO\": {\n" +
                "            \"alpha3\": \"BOL\",\n" +
                "            \"currencyId\": \"BOB\",\n" +
                "            \"currencyName\": \"Bolivian boliviano\",\n" +
                "            \"currencySymbol\": \"$b\",\n" +
                "            \"id\": \"BO\",\n" +
                "            \"name\": \"Bolivia\"\n" +
                "        },\n" +
                "        \"BG\": {\n" +
                "            \"alpha3\": \"BGR\",\n" +
                "            \"currencyId\": \"BGN\",\n" +
                "            \"currencyName\": \"Bulgarian lev\",\n" +
                "            \"currencySymbol\": \"лв\",\n" +
                "            \"id\": \"BG\",\n" +
                "            \"name\": \"Bulgaria\"\n" +
                "        },\n" +
                "        \"CA\": {\n" +
                "            \"alpha3\": \"CAN\",\n" +
                "            \"currencyId\": \"CAD\",\n" +
                "            \"currencyName\": \"Canadian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"CA\",\n" +
                "            \"name\": \"Canada\"\n" +
                "        },\n" +
                "        \"CN\": {\n" +
                "            \"alpha3\": \"CHN\",\n" +
                "            \"currencyId\": \"CNY\",\n" +
                "            \"currencyName\": \"Chinese renminbi\",\n" +
                "            \"currencySymbol\": \"¥\",\n" +
                "            \"id\": \"CN\",\n" +
                "            \"name\": \"China\"\n" +
                "        },\n" +
                "        \"CR\": {\n" +
                "            \"alpha3\": \"CRI\",\n" +
                "            \"currencyId\": \"CRC\",\n" +
                "            \"currencyName\": \"Costa Rican colon\",\n" +
                "            \"currencySymbol\": \"₡\",\n" +
                "            \"id\": \"CR\",\n" +
                "            \"name\": \"Costa Rica\"\n" +
                "        },\n" +
                "        \"CZ\": {\n" +
                "            \"alpha3\": \"CZE\",\n" +
                "            \"currencyId\": \"CZK\",\n" +
                "            \"currencyName\": \"Czech koruna\",\n" +
                "            \"currencySymbol\": \"Kč\",\n" +
                "            \"id\": \"CZ\",\n" +
                "            \"name\": \"Czech Republic\"\n" +
                "        },\n" +
                "        \"PF\": {\n" +
                "            \"currencyId\": \"XPF\",\n" +
                "            \"currencyName\": \"CFP franc\",\n" +
                "            \"name\": \"French Polynesia\",\n" +
                "            \"alpha3\": \"PYF\",\n" +
                "            \"id\": \"PF\"\n" +
                "        },\n" +
                "        \"GH\": {\n" +
                "            \"currencyId\": \"GHS\",\n" +
                "            \"currencyName\": \"Ghanaian cedi\",\n" +
                "            \"name\": \"Ghana\",\n" +
                "            \"alpha3\": \"GHA\",\n" +
                "            \"id\": \"GH\"\n" +
                "        },\n" +
                "        \"GN\": {\n" +
                "            \"currencyId\": \"GNF\",\n" +
                "            \"currencyName\": \"Guinean franc\",\n" +
                "            \"name\": \"Guinea\",\n" +
                "            \"alpha3\": \"GIN\",\n" +
                "            \"id\": \"GN\"\n" +
                "        },\n" +
                "        \"HK\": {\n" +
                "            \"alpha3\": \"HKG\",\n" +
                "            \"currencyId\": \"HKD\",\n" +
                "            \"currencyName\": \"Hong Kong dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"HK\",\n" +
                "            \"name\": \"Hong Kong\"\n" +
                "        },\n" +
                "        \"IR\": {\n" +
                "            \"alpha3\": \"IRN\",\n" +
                "            \"currencyId\": \"IRR\",\n" +
                "            \"currencyName\": \"Iranian rial\",\n" +
                "            \"currencySymbol\": \"﷼\",\n" +
                "            \"id\": \"IR\",\n" +
                "            \"name\": \"Iran, Islamic Republic of\"\n" +
                "        },\n" +
                "        \"JM\": {\n" +
                "            \"alpha3\": \"JAM\",\n" +
                "            \"currencyId\": \"JMD\",\n" +
                "            \"currencyName\": \"Jamaican dollar\",\n" +
                "            \"currencySymbol\": \"J$\",\n" +
                "            \"id\": \"JM\",\n" +
                "            \"name\": \"Jamaica\"\n" +
                "        },\n" +
                "        \"KI\": {\n" +
                "            \"alpha3\": \"KIR\",\n" +
                "            \"currencyId\": \"AUD\",\n" +
                "            \"currencyName\": \"Australian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"KI\",\n" +
                "            \"name\": \"Kiribati\"\n" +
                "        },\n" +
                "        \"LA\": {\n" +
                "            \"alpha3\": \"LAO\",\n" +
                "            \"currencyId\": \"LAK\",\n" +
                "            \"currencyName\": \"Lao kip\",\n" +
                "            \"currencySymbol\": \"₭\",\n" +
                "            \"id\": \"LA\",\n" +
                "            \"name\": \"Laos\"\n" +
                "        },\n" +
                "        \"LY\": {\n" +
                "            \"currencyId\": \"LYD\",\n" +
                "            \"currencyName\": \"Libyan dinar\",\n" +
                "            \"name\": \"Libya\",\n" +
                "            \"alpha3\": \"LBY\",\n" +
                "            \"id\": \"LY\"\n" +
                "        },\n" +
                "        \"MK\": {\n" +
                "            \"alpha3\": \"MKD\",\n" +
                "            \"currencyId\": \"MKD\",\n" +
                "            \"currencyName\": \"Macedonian denar\",\n" +
                "            \"currencySymbol\": \"ден\",\n" +
                "            \"id\": \"MK\",\n" +
                "            \"name\": \"Macedonia (Former Yug. Rep.)\"\n" +
                "        },\n" +
                "        \"ML\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Mali\",\n" +
                "            \"alpha3\": \"MLI\",\n" +
                "            \"id\": \"ML\"\n" +
                "        },\n" +
                "        \"MS\": {\n" +
                "            \"alpha3\": \"MSR\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"MS\",\n" +
                "            \"name\": \"Montserrat\"\n" +
                "        },\n" +
                "        \"NR\": {\n" +
                "            \"alpha3\": \"NRU\",\n" +
                "            \"currencyId\": \"AUD\",\n" +
                "            \"currencyName\": \"Australian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"NR\",\n" +
                "            \"name\": \"Nauru\"\n" +
                "        },\n" +
                "        \"NI\": {\n" +
                "            \"alpha3\": \"NIC\",\n" +
                "            \"currencyId\": \"NIO\",\n" +
                "            \"currencyName\": \"Nicaraguan cordoba\",\n" +
                "            \"currencySymbol\": \"C$\",\n" +
                "            \"id\": \"NI\",\n" +
                "            \"name\": \"Nicaragua\"\n" +
                "        },\n" +
                "        \"PK\": {\n" +
                "            \"alpha3\": \"PAK\",\n" +
                "            \"currencyId\": \"PKR\",\n" +
                "            \"currencyName\": \"Pakistani rupee\",\n" +
                "            \"currencySymbol\": \"₨\",\n" +
                "            \"id\": \"PK\",\n" +
                "            \"name\": \"Pakistan\"\n" +
                "        },\n" +
                "        \"PE\": {\n" +
                "            \"alpha3\": \"PER\",\n" +
                "            \"currencyId\": \"PEN\",\n" +
                "            \"currencyName\": \"Peruvian nuevo sol\",\n" +
                "            \"currencySymbol\": \"S/.\",\n" +
                "            \"id\": \"PE\",\n" +
                "            \"name\": \"Peru\"\n" +
                "        },\n" +
                "        \"QA\": {\n" +
                "            \"alpha3\": \"QAT\",\n" +
                "            \"currencyId\": \"QAR\",\n" +
                "            \"currencyName\": \"Qatari riyal\",\n" +
                "            \"currencySymbol\": \"﷼\",\n" +
                "            \"id\": \"QA\",\n" +
                "            \"name\": \"Qatar\"\n" +
                "        },\n" +
                "        \"KN\": {\n" +
                "            \"alpha3\": \"KNA\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"KN\",\n" +
                "            \"name\": \"Saint Kitts and Nevis\"\n" +
                "        },\n" +
                "        \"ST\": {\n" +
                "            \"currencyId\": \"STD\",\n" +
                "            \"currencyName\": \"Sao Tome and Principe dobra\",\n" +
                "            \"name\": \"Sao Tome and Principe\",\n" +
                "            \"alpha3\": \"STP\",\n" +
                "            \"id\": \"ST\"\n" +
                "        },\n" +
                "        \"SL\": {\n" +
                "            \"currencyId\": \"SLL\",\n" +
                "            \"currencyName\": \"Sierra Leonean leone\",\n" +
                "            \"name\": \"Sierra Leone\",\n" +
                "            \"alpha3\": \"SLE\",\n" +
                "            \"id\": \"SL\"\n" +
                "        },\n" +
                "        \"SO\": {\n" +
                "            \"alpha3\": \"SOM\",\n" +
                "            \"currencyId\": \"SOS\",\n" +
                "            \"currencyName\": \"Somali shilling\",\n" +
                "            \"currencySymbol\": \"S\",\n" +
                "            \"id\": \"SO\",\n" +
                "            \"name\": \"Somalia\"\n" +
                "        },\n" +
                "        \"SD\": {\n" +
                "            \"currencyId\": \"SDG\",\n" +
                "            \"currencyName\": \"Sudanese pound\",\n" +
                "            \"name\": \"Sudan\",\n" +
                "            \"alpha3\": \"SDN\",\n" +
                "            \"id\": \"SD\"\n" +
                "        },\n" +
                "        \"SY\": {\n" +
                "            \"alpha3\": \"SYR\",\n" +
                "            \"currencyId\": \"SYP\",\n" +
                "            \"currencyName\": \"Syrian pound\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"SY\",\n" +
                "            \"name\": \"Syria\"\n" +
                "        },\n" +
                "        \"TG\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Togo\",\n" +
                "            \"alpha3\": \"TGO\",\n" +
                "            \"id\": \"TG\"\n" +
                "        },\n" +
                "        \"TM\": {\n" +
                "            \"currencyId\": \"TMT\",\n" +
                "            \"currencyName\": \"Turkmenistan manat\",\n" +
                "            \"name\": \"Turkmenistan\",\n" +
                "            \"alpha3\": \"TKM\",\n" +
                "            \"id\": \"TM\"\n" +
                "        },\n" +
                "        \"GB\": {\n" +
                "            \"alpha3\": \"GBR\",\n" +
                "            \"currencyId\": \"GBP\",\n" +
                "            \"currencyName\": \"British pound\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"GB\",\n" +
                "            \"name\": \"United Kingdom\"\n" +
                "        },\n" +
                "        \"VES\": {\n" +
                "            \"currencyId\": \"VES\",\n" +
                "            \"currencyName\": \"Bolivar Soberano\",\n" +
                "            \"name\": \"Venezuela\",\n" +
                "            \"alpha3\": \"VES\",\n" +
                "            \"id\": \"VE\"\n" +
                "        },\n" +
                "        \"AM\": {\n" +
                "            \"currencyId\": \"AMD\",\n" +
                "            \"currencyName\": \"Armenian dram\",\n" +
                "            \"name\": \"Armenia\",\n" +
                "            \"alpha3\": \"ARM\",\n" +
                "            \"id\": \"AM\"\n" +
                "        },\n" +
                "        \"BS\": {\n" +
                "            \"alpha3\": \"BHS\",\n" +
                "            \"currencyId\": \"BSD\",\n" +
                "            \"currencyName\": \"Bahamian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"BS\",\n" +
                "            \"name\": \"Bahamas\"\n" +
                "        },\n" +
                "        \"BA\": {\n" +
                "            \"alpha3\": \"BIH\",\n" +
                "            \"currencyId\": \"BAM\",\n" +
                "            \"currencyName\": \"Bosnia and Herzegovina konvertibilna marka\",\n" +
                "            \"currencySymbol\": \"KM\",\n" +
                "            \"id\": \"BA\",\n" +
                "            \"name\": \"Bosnia-Herzegovina\"\n" +
                "        },\n" +
                "        \"BF\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Burkina Faso\",\n" +
                "            \"alpha3\": \"BFA\",\n" +
                "            \"id\": \"BF\"\n" +
                "        },\n" +
                "        \"KY\": {\n" +
                "            \"alpha3\": \"CYM\",\n" +
                "            \"currencyId\": \"KYD\",\n" +
                "            \"currencyName\": \"Cayman Islands dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"KY\",\n" +
                "            \"name\": \"Cayman Islands\"\n" +
                "        },\n" +
                "        \"CO\": {\n" +
                "            \"alpha3\": \"COL\",\n" +
                "            \"currencyId\": \"COP\",\n" +
                "            \"currencyName\": \"Colombian peso\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"CO\",\n" +
                "            \"name\": \"Colombia\"\n" +
                "        },\n" +
                "        \"CI\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Côte d'Ivoire\",\n" +
                "            \"alpha3\": \"CIV\",\n" +
                "            \"id\": \"CI\"\n" +
                "        },\n" +
                "        \"DK\": {\n" +
                "            \"alpha3\": \"DNK\",\n" +
                "            \"currencyId\": \"DKK\",\n" +
                "            \"currencyName\": \"Danish krone\",\n" +
                "            \"currencySymbol\": \"kr\",\n" +
                "            \"id\": \"DK\",\n" +
                "            \"name\": \"Denmark\"\n" +
                "        },\n" +
                "        \"EG\": {\n" +
                "            \"alpha3\": \"EGY\",\n" +
                "            \"currencyId\": \"EGP\",\n" +
                "            \"currencyName\": \"Egyptian pound\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"EG\",\n" +
                "            \"name\": \"Egypt\"\n" +
                "        },\n" +
                "        \"ET\": {\n" +
                "            \"currencyId\": \"ETB\",\n" +
                "            \"currencyName\": \"Ethiopian birr\",\n" +
                "            \"name\": \"Ethiopia\",\n" +
                "            \"alpha3\": \"ETH\",\n" +
                "            \"id\": \"ET\"\n" +
                "        },\n" +
                "        \"GA\": {\n" +
                "            \"currencyId\": \"XAF\",\n" +
                "            \"currencyName\": \"Central African CFA franc\",\n" +
                "            \"name\": \"Gabon\",\n" +
                "            \"alpha3\": \"GAB\",\n" +
                "            \"id\": \"GA\"\n" +
                "        },\n" +
                "        \"GI\": {\n" +
                "            \"alpha3\": \"GIB\",\n" +
                "            \"currencyId\": \"GIP\",\n" +
                "            \"currencyName\": \"Gibraltar pound\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"GI\",\n" +
                "            \"name\": \"Gibraltar\"\n" +
                "        },\n" +
                "        \"GW\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Guinea-Bissau\",\n" +
                "            \"alpha3\": \"GNB\",\n" +
                "            \"id\": \"GW\"\n" +
                "        },\n" +
                "        \"HU\": {\n" +
                "            \"alpha3\": \"HUN\",\n" +
                "            \"currencyId\": \"HUF\",\n" +
                "            \"currencyName\": \"Hungarian forint\",\n" +
                "            \"currencySymbol\": \"Ft\",\n" +
                "            \"id\": \"HU\",\n" +
                "            \"name\": \"Hungary\"\n" +
                "        },\n" +
                "        \"IQ\": {\n" +
                "            \"currencyId\": \"IQD\",\n" +
                "            \"currencyName\": \"Iraqi dinar\",\n" +
                "            \"name\": \"Iraq\",\n" +
                "            \"alpha3\": \"IRQ\",\n" +
                "            \"id\": \"IQ\"\n" +
                "        },\n" +
                "        \"JP\": {\n" +
                "            \"alpha3\": \"JPN\",\n" +
                "            \"currencyId\": \"JPY\",\n" +
                "            \"currencyName\": \"Japanese yen\",\n" +
                "            \"currencySymbol\": \"¥\",\n" +
                "            \"id\": \"JP\",\n" +
                "            \"name\": \"Japan\"\n" +
                "        },\n" +
                "        \"KP\": {\n" +
                "            \"alpha3\": \"PRK\",\n" +
                "            \"currencyId\": \"KPW\",\n" +
                "            \"currencyName\": \"North Korean won\",\n" +
                "            \"currencySymbol\": \"₩\",\n" +
                "            \"id\": \"KP\",\n" +
                "            \"name\": \"Korea North\"\n" +
                "        },\n" +
                "        \"LV\": {\n" +
                "            \"alpha3\": \"LVA\",\n" +
                "            \"currencyId\": \"LVL\",\n" +
                "            \"currencyName\": \"Latvian lats\",\n" +
                "            \"currencySymbol\": \"Ls\",\n" +
                "            \"id\": \"LV\",\n" +
                "            \"name\": \"Latvia\"\n" +
                "        },\n" +
                "        \"LI\": {\n" +
                "            \"alpha3\": \"LIE\",\n" +
                "            \"currencyId\": \"CHF\",\n" +
                "            \"currencyName\": \"Swiss Franc\",\n" +
                "            \"currencySymbol\": \"Fr.\",\n" +
                "            \"id\": \"LI\",\n" +
                "            \"name\": \"Liechtenstein\"\n" +
                "        },\n" +
                "        \"MG\": {\n" +
                "            \"currencyId\": \"MGA\",\n" +
                "            \"currencyName\": \"Malagasy ariary\",\n" +
                "            \"name\": \"Madagascar\",\n" +
                "            \"alpha3\": \"MDG\",\n" +
                "            \"id\": \"MG\"\n" +
                "        },\n" +
                "        \"MD\": {\n" +
                "            \"currencyId\": \"MDL\",\n" +
                "            \"currencyName\": \"Moldovan leu\",\n" +
                "            \"name\": \"Moldova\",\n" +
                "            \"alpha3\": \"MDA\",\n" +
                "            \"id\": \"MD\"\n" +
                "        },\n" +
                "        \"MA\": {\n" +
                "            \"currencyId\": \"MAD\",\n" +
                "            \"currencyName\": \"Moroccan dirham\",\n" +
                "            \"name\": \"Morocco\",\n" +
                "            \"alpha3\": \"MAR\",\n" +
                "            \"id\": \"MA\"\n" +
                "        },\n" +
                "        \"NP\": {\n" +
                "            \"alpha3\": \"NPL\",\n" +
                "            \"currencyId\": \"NPR\",\n" +
                "            \"currencyName\": \"Nepalese rupee\",\n" +
                "            \"currencySymbol\": \"₨\",\n" +
                "            \"id\": \"NP\",\n" +
                "            \"name\": \"Nepal\"\n" +
                "        },\n" +
                "        \"NE\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Niger\",\n" +
                "            \"alpha3\": \"NER\",\n" +
                "            \"id\": \"NE\"\n" +
                "        },\n" +
                "        \"PH\": {\n" +
                "            \"alpha3\": \"PHL\",\n" +
                "            \"currencyId\": \"PHP\",\n" +
                "            \"currencyName\": \"Philippine peso\",\n" +
                "            \"currencySymbol\": \"₱\",\n" +
                "            \"id\": \"PH\",\n" +
                "            \"name\": \"Philippines\"\n" +
                "        },\n" +
                "        \"RO\": {\n" +
                "            \"alpha3\": \"ROU\",\n" +
                "            \"currencyId\": \"RON\",\n" +
                "            \"currencyName\": \"Romanian leu\",\n" +
                "            \"currencySymbol\": \"lei\",\n" +
                "            \"id\": \"RO\",\n" +
                "            \"name\": \"Romania\"\n" +
                "        },\n" +
                "        \"LC\": {\n" +
                "            \"alpha3\": \"LCA\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"LC\",\n" +
                "            \"name\": \"Saint Lucia\"\n" +
                "        },\n" +
                "        \"SA\": {\n" +
                "            \"alpha3\": \"SAU\",\n" +
                "            \"currencyId\": \"SAR\",\n" +
                "            \"currencyName\": \"Saudi riyal\",\n" +
                "            \"currencySymbol\": \"﷼\",\n" +
                "            \"id\": \"SA\",\n" +
                "            \"name\": \"Saudi Arabia\"\n" +
                "        },\n" +
                "        \"SG\": {\n" +
                "            \"alpha3\": \"SGP\",\n" +
                "            \"currencyId\": \"SGD\",\n" +
                "            \"currencyName\": \"Singapore dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"SG\",\n" +
                "            \"name\": \"Singapore\"\n" +
                "        },\n" +
                "        \"ZA\": {\n" +
                "            \"alpha3\": \"ZAF\",\n" +
                "            \"currencyId\": \"ZAR\",\n" +
                "            \"currencyName\": \"South African rand\",\n" +
                "            \"currencySymbol\": \"R\",\n" +
                "            \"id\": \"ZA\",\n" +
                "            \"name\": \"South Africa\"\n" +
                "        },\n" +
                "        \"SR\": {\n" +
                "            \"alpha3\": \"SUR\",\n" +
                "            \"currencyId\": \"SRD\",\n" +
                "            \"currencyName\": \"Surinamese dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"SR\",\n" +
                "            \"name\": \"Suriname\"\n" +
                "        },\n" +
                "        \"TW\": {\n" +
                "            \"alpha3\": \"TWN\",\n" +
                "            \"currencyId\": \"TWD\",\n" +
                "            \"currencyName\": \"New Taiwan dollar\",\n" +
                "            \"currencySymbol\": \"NT$\",\n" +
                "            \"id\": \"TW\",\n" +
                "            \"name\": \"Taiwan\"\n" +
                "        },\n" +
                "        \"TO\": {\n" +
                "            \"currencyId\": \"TOP\",\n" +
                "            \"currencyName\": \"Paanga\",\n" +
                "            \"name\": \"Tonga\",\n" +
                "            \"alpha3\": \"TON\",\n" +
                "            \"id\": \"TO\"\n" +
                "        },\n" +
                "        \"TV\": {\n" +
                "            \"alpha3\": \"TUV\",\n" +
                "            \"currencyId\": \"AUD\",\n" +
                "            \"currencyName\": \"Australian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"TV\",\n" +
                "            \"name\": \"Tuvalu\"\n" +
                "        },\n" +
                "        \"US\": {\n" +
                "            \"alpha3\": \"USA\",\n" +
                "            \"currencyId\": \"USD\",\n" +
                "            \"currencyName\": \"United States dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"US\",\n" +
                "            \"name\": \"United States of America\"\n" +
                "        },\n" +
                "        \"VN\": {\n" +
                "            \"alpha3\": \"VNM\",\n" +
                "            \"currencyId\": \"VND\",\n" +
                "            \"currencyName\": \"Vietnamese dong\",\n" +
                "            \"currencySymbol\": \"₫\",\n" +
                "            \"id\": \"VN\",\n" +
                "            \"name\": \"Vietnam\"\n" +
                "        },\n" +
                "        \"AL\": {\n" +
                "            \"alpha3\": \"ALB\",\n" +
                "            \"currencyId\": \"ALL\",\n" +
                "            \"currencyName\": \"Albanian lek\",\n" +
                "            \"currencySymbol\": \"Lek\",\n" +
                "            \"id\": \"AL\",\n" +
                "            \"name\": \"Albania\"\n" +
                "        },\n" +
                "        \"AG\": {\n" +
                "            \"alpha3\": \"ATG\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"AG\",\n" +
                "            \"name\": \"Antigua and Barbuda\"\n" +
                "        },\n" +
                "        \"BB\": {\n" +
                "            \"alpha3\": \"BRB\",\n" +
                "            \"currencyId\": \"BBD\",\n" +
                "            \"currencyName\": \"Barbadian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"BB\",\n" +
                "            \"name\": \"Barbados\"\n" +
                "        },\n" +
                "        \"BT\": {\n" +
                "            \"currencyId\": \"BTN\",\n" +
                "            \"currencyName\": \"Bhutanese ngultrum\",\n" +
                "            \"name\": \"Bhutan\",\n" +
                "            \"alpha3\": \"BTN\",\n" +
                "            \"id\": \"BT\"\n" +
                "        },\n" +
                "        \"BN\": {\n" +
                "            \"alpha3\": \"BRN\",\n" +
                "            \"currencyId\": \"BND\",\n" +
                "            \"currencyName\": \"Brunei dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"BN\",\n" +
                "            \"name\": \"Brunei\"\n" +
                "        },\n" +
                "        \"CM\": {\n" +
                "            \"currencyId\": \"XAF\",\n" +
                "            \"currencyName\": \"Central African CFA franc\",\n" +
                "            \"name\": \"Cameroon\",\n" +
                "            \"alpha3\": \"CMR\",\n" +
                "            \"id\": \"CM\"\n" +
                "        },\n" +
                "        \"CL\": {\n" +
                "            \"alpha3\": \"CHL\",\n" +
                "            \"currencyId\": \"CLP\",\n" +
                "            \"currencyName\": \"Chilean peso\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"CL\",\n" +
                "            \"name\": \"Chile\"\n" +
                "        },\n" +
                "        \"CD\": {\n" +
                "            \"currencyId\": \"CDF\",\n" +
                "            \"currencyName\": \"Congolese franc\",\n" +
                "            \"name\": \"Congo, Democratic Republic\",\n" +
                "            \"alpha3\": \"COD\",\n" +
                "            \"id\": \"CD\"\n" +
                "        },\n" +
                "        \"DO\": {\n" +
                "            \"alpha3\": \"DOM\",\n" +
                "            \"currencyId\": \"DOP\",\n" +
                "            \"currencyName\": \"Dominican peso\",\n" +
                "            \"currencySymbol\": \"RD$\",\n" +
                "            \"id\": \"DO\",\n" +
                "            \"name\": \"Dominican Republic\"\n" +
                "        },\n" +
                "        \"ER\": {\n" +
                "            \"currencyId\": \"ERN\",\n" +
                "            \"currencyName\": \"Eritrean nakfa\",\n" +
                "            \"name\": \"Eritrea\",\n" +
                "            \"alpha3\": \"ERI\",\n" +
                "            \"id\": \"ER\"\n" +
                "        },\n" +
                "        \"GT\": {\n" +
                "            \"alpha3\": \"GTM\",\n" +
                "            \"currencyId\": \"GTQ\",\n" +
                "            \"currencyName\": \"Guatemalan quetzal\",\n" +
                "            \"currencySymbol\": \"Q\",\n" +
                "            \"id\": \"GT\",\n" +
                "            \"name\": \"Guatemala\"\n" +
                "        },\n" +
                "        \"HN\": {\n" +
                "            \"alpha3\": \"HND\",\n" +
                "            \"currencyId\": \"HNL\",\n" +
                "            \"currencyName\": \"Honduran lempira\",\n" +
                "            \"currencySymbol\": \"L\",\n" +
                "            \"id\": \"HN\",\n" +
                "            \"name\": \"Honduras\"\n" +
                "        },\n" +
                "        \"ID\": {\n" +
                "            \"alpha3\": \"IDN\",\n" +
                "            \"currencyId\": \"IDR\",\n" +
                "            \"currencyName\": \"Indonesian rupiah\",\n" +
                "            \"currencySymbol\": \"Rp\",\n" +
                "            \"id\": \"ID\",\n" +
                "            \"name\": \"Indonesia\"\n" +
                "        },\n" +
                "        \"KE\": {\n" +
                "            \"alpha3\": \"KEN\",\n" +
                "            \"currencyId\": \"KES\",\n" +
                "            \"currencyName\": \"Kenyan shilling\",\n" +
                "            \"currencySymbol\": \"KSh\",\n" +
                "            \"id\": \"KE\",\n" +
                "            \"name\": \"Kenya\"\n" +
                "        },\n" +
                "        \"KG\": {\n" +
                "            \"alpha3\": \"KGZ\",\n" +
                "            \"currencyId\": \"KGS\",\n" +
                "            \"currencyName\": \"Kyrgyzstani som\",\n" +
                "            \"currencySymbol\": \"лв\",\n" +
                "            \"id\": \"KG\",\n" +
                "            \"name\": \"Kyrgyzstan\"\n" +
                "        },\n" +
                "        \"LR\": {\n" +
                "            \"alpha3\": \"LBR\",\n" +
                "            \"currencyId\": \"LRD\",\n" +
                "            \"currencyName\": \"Liberian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"LR\",\n" +
                "            \"name\": \"Liberia\"\n" +
                "        },\n" +
                "        \"MO\": {\n" +
                "            \"currencyId\": \"MOP\",\n" +
                "            \"currencyName\": \"Macanese pataca\",\n" +
                "            \"name\": \"Macau\",\n" +
                "            \"alpha3\": \"MAC\",\n" +
                "            \"id\": \"MO\"\n" +
                "        },\n" +
                "        \"MV\": {\n" +
                "            \"currencyId\": \"MVR\",\n" +
                "            \"currencyName\": \"Maldivian rufiyaa\",\n" +
                "            \"name\": \"Maldives\",\n" +
                "            \"alpha3\": \"MDV\",\n" +
                "            \"id\": \"MV\"\n" +
                "        },\n" +
                "        \"MX\": {\n" +
                "            \"alpha3\": \"MEX\",\n" +
                "            \"currencyId\": \"MXN\",\n" +
                "            \"currencyName\": \"Mexican peso\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"MX\",\n" +
                "            \"name\": \"Mexico\"\n" +
                "        },\n" +
                "        \"NA\": {\n" +
                "            \"alpha3\": \"NAM\",\n" +
                "            \"currencyId\": \"NAD\",\n" +
                "            \"currencyName\": \"Namibian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"NA\",\n" +
                "            \"name\": \"Namibia\"\n" +
                "        },\n" +
                "        \"NZ\": {\n" +
                "            \"alpha3\": \"NZL\",\n" +
                "            \"currencyId\": \"NZD\",\n" +
                "            \"currencyName\": \"New Zealand dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"NZ\",\n" +
                "            \"name\": \"New Zealand\"\n" +
                "        },\n" +
                "        \"OM\": {\n" +
                "            \"alpha3\": \"OMN\",\n" +
                "            \"currencyId\": \"OMR\",\n" +
                "            \"currencyName\": \"Omani rial\",\n" +
                "            \"currencySymbol\": \"﷼\",\n" +
                "            \"id\": \"OM\",\n" +
                "            \"name\": \"Oman\"\n" +
                "        },\n" +
                "        \"PY\": {\n" +
                "            \"alpha3\": \"PRY\",\n" +
                "            \"currencyId\": \"PYG\",\n" +
                "            \"currencyName\": \"Paraguayan guarani\",\n" +
                "            \"currencySymbol\": \"Gs\",\n" +
                "            \"id\": \"PY\",\n" +
                "            \"name\": \"Paraguay\"\n" +
                "        },\n" +
                "        \"SH\": {\n" +
                "            \"alpha3\": \"SHN\",\n" +
                "            \"currencyId\": \"SHP\",\n" +
                "            \"currencyName\": \"Saint Helena pound\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"SH\",\n" +
                "            \"name\": \"Saint Helena\"\n" +
                "        },\n" +
                "        \"SC\": {\n" +
                "            \"alpha3\": \"SYC\",\n" +
                "            \"currencyId\": \"SCR\",\n" +
                "            \"currencyName\": \"Seychellois rupee\",\n" +
                "            \"currencySymbol\": \"₨\",\n" +
                "            \"id\": \"SC\",\n" +
                "            \"name\": \"Seychelles\"\n" +
                "        },\n" +
                "        \"SB\": {\n" +
                "            \"alpha3\": \"SLB\",\n" +
                "            \"currencyId\": \"SBD\",\n" +
                "            \"currencyName\": \"Solomon Islands dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"SB\",\n" +
                "            \"name\": \"Solomon Islands\"\n" +
                "        },\n" +
                "        \"LK\": {\n" +
                "            \"alpha3\": \"LKA\",\n" +
                "            \"currencyId\": \"LKR\",\n" +
                "            \"currencyName\": \"Sri Lankan rupee\",\n" +
                "            \"currencySymbol\": \"₨\",\n" +
                "            \"id\": \"LK\",\n" +
                "            \"name\": \"Sri Lanka\"\n" +
                "        },\n" +
                "        \"CH\": {\n" +
                "            \"alpha3\": \"CHE\",\n" +
                "            \"currencyId\": \"CHF\",\n" +
                "            \"currencyName\": \"Swiss franc\",\n" +
                "            \"currencySymbol\": \"Fr.\",\n" +
                "            \"id\": \"CH\",\n" +
                "            \"name\": \"Switzerland\"\n" +
                "        },\n" +
                "        \"TH\": {\n" +
                "            \"alpha3\": \"THA\",\n" +
                "            \"currencyId\": \"THB\",\n" +
                "            \"currencyName\": \"Thai baht\",\n" +
                "            \"currencySymbol\": \"฿\",\n" +
                "            \"id\": \"TH\",\n" +
                "            \"name\": \"Thailand\"\n" +
                "        },\n" +
                "        \"TR\": {\n" +
                "            \"currencyId\": \"TRY\",\n" +
                "            \"currencyName\": \"Turkish new lira\",\n" +
                "            \"name\": \"Turkey\",\n" +
                "            \"alpha3\": \"TUR\",\n" +
                "            \"id\": \"TR\"\n" +
                "        },\n" +
                "        \"AE\": {\n" +
                "            \"currencyId\": \"AED\",\n" +
                "            \"currencyName\": \"UAE dirham\",\n" +
                "            \"name\": \"United Arab Emirates\",\n" +
                "            \"alpha3\": \"ARE\",\n" +
                "            \"id\": \"AE\"\n" +
                "        },\n" +
                "        \"VU\": {\n" +
                "            \"currencyId\": \"VUV\",\n" +
                "            \"currencyName\": \"Vanuatu vatu\",\n" +
                "            \"name\": \"Vanuatu\",\n" +
                "            \"alpha3\": \"VUT\",\n" +
                "            \"id\": \"VU\"\n" +
                "        },\n" +
                "        \"ZM\": {\n" +
                "            \"currencyId\": \"ZMW\",\n" +
                "            \"currencyName\": \"Zambian kwacha\",\n" +
                "            \"name\": \"Zambia\",\n" +
                "            \"alpha3\": \"ZMB\",\n" +
                "            \"id\": \"ZM\"\n" +
                "        },\n" +
                "        \"AO\": {\n" +
                "            \"currencyId\": \"AOA\",\n" +
                "            \"currencyName\": \"Angolan kwanza\",\n" +
                "            \"name\": \"Angola\",\n" +
                "            \"alpha3\": \"AGO\",\n" +
                "            \"id\": \"AO\"\n" +
                "        },\n" +
                "        \"AW\": {\n" +
                "            \"alpha3\": \"ABW\",\n" +
                "            \"currencyId\": \"AWG\",\n" +
                "            \"currencyName\": \"Aruban florin\",\n" +
                "            \"currencySymbol\": \"ƒ\",\n" +
                "            \"id\": \"AW\",\n" +
                "            \"name\": \"Aruba\"\n" +
                "        },\n" +
                "        \"BH\": {\n" +
                "            \"currencyId\": \"BHD\",\n" +
                "            \"currencyName\": \"Bahraini dinar\",\n" +
                "            \"name\": \"Bahrain\",\n" +
                "            \"alpha3\": \"BHR\",\n" +
                "            \"id\": \"BH\"\n" +
                "        },\n" +
                "        \"BZ\": {\n" +
                "            \"alpha3\": \"BLZ\",\n" +
                "            \"currencyId\": \"BZD\",\n" +
                "            \"currencyName\": \"Belize dollar\",\n" +
                "            \"currencySymbol\": \"BZ$\",\n" +
                "            \"id\": \"BZ\",\n" +
                "            \"name\": \"Belize\"\n" +
                "        },\n" +
                "        \"BW\": {\n" +
                "            \"alpha3\": \"BWA\",\n" +
                "            \"currencyId\": \"BWP\",\n" +
                "            \"currencyName\": \"Botswana pula\",\n" +
                "            \"currencySymbol\": \"P\",\n" +
                "            \"id\": \"BW\",\n" +
                "            \"name\": \"Botswana\"\n" +
                "        },\n" +
                "        \"BI\": {\n" +
                "            \"currencyId\": \"BIF\",\n" +
                "            \"currencyName\": \"Burundi franc\",\n" +
                "            \"name\": \"Burundi\",\n" +
                "            \"alpha3\": \"BDI\",\n" +
                "            \"id\": \"BI\"\n" +
                "        },\n" +
                "        \"CF\": {\n" +
                "            \"currencyId\": \"XAF\",\n" +
                "            \"currencyName\": \"Central African CFA franc\",\n" +
                "            \"name\": \"Central African Republic\",\n" +
                "            \"alpha3\": \"CAF\",\n" +
                "            \"id\": \"CF\"\n" +
                "        },\n" +
                "        \"KM\": {\n" +
                "            \"currencyId\": \"KMF\",\n" +
                "            \"currencyName\": \"Comorian franc\",\n" +
                "            \"name\": \"Comoros\",\n" +
                "            \"alpha3\": \"COM\",\n" +
                "            \"id\": \"KM\"\n" +
                "        },\n" +
                "        \"HR\": {\n" +
                "            \"alpha3\": \"HRV\",\n" +
                "            \"currencyId\": \"HRK\",\n" +
                "            \"currencyName\": \"Croatian kuna\",\n" +
                "            \"currencySymbol\": \"kn\",\n" +
                "            \"id\": \"HR\",\n" +
                "            \"name\": \"Croatia\"\n" +
                "        },\n" +
                "        \"DJ\": {\n" +
                "            \"currencyId\": \"DJF\",\n" +
                "            \"currencyName\": \"Djiboutian franc\",\n" +
                "            \"name\": \"Djibouti\",\n" +
                "            \"alpha3\": \"DJI\",\n" +
                "            \"id\": \"DJ\"\n" +
                "        },\n" +
                "        \"FJ\": {\n" +
                "            \"alpha3\": \"FJI\",\n" +
                "            \"currencyId\": \"FJD\",\n" +
                "            \"currencyName\": \"Fijian dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"FJ\",\n" +
                "            \"name\": \"Fiji\"\n" +
                "        },\n" +
                "        \"GM\": {\n" +
                "            \"currencyId\": \"GMD\",\n" +
                "            \"currencyName\": \"Gambian dalasi\",\n" +
                "            \"name\": \"Gambia\",\n" +
                "            \"alpha3\": \"GMB\",\n" +
                "            \"id\": \"GM\"\n" +
                "        },\n" +
                "        \"GY\": {\n" +
                "            \"alpha3\": \"GUY\",\n" +
                "            \"currencyId\": \"GYD\",\n" +
                "            \"currencyName\": \"Guyanese dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"GY\",\n" +
                "            \"name\": \"Guyana\"\n" +
                "        },\n" +
                "        \"IS\": {\n" +
                "            \"alpha3\": \"ISL\",\n" +
                "            \"currencyId\": \"ISK\",\n" +
                "            \"currencyName\": \"Icelandic króna\",\n" +
                "            \"currencySymbol\": \"kr\",\n" +
                "            \"id\": \"IS\",\n" +
                "            \"name\": \"Iceland\"\n" +
                "        },\n" +
                "        \"JO\": {\n" +
                "            \"currencyId\": \"JOD\",\n" +
                "            \"currencyName\": \"Jordanian dinar\",\n" +
                "            \"name\": \"Jordan\",\n" +
                "            \"alpha3\": \"JOR\",\n" +
                "            \"id\": \"JO\"\n" +
                "        },\n" +
                "        \"KR\": {\n" +
                "            \"alpha3\": \"KOR\",\n" +
                "            \"currencyId\": \"KRW\",\n" +
                "            \"currencyName\": \"South Korean won\",\n" +
                "            \"currencySymbol\": \"₩\",\n" +
                "            \"id\": \"KR\",\n" +
                "            \"name\": \"Korea South\"\n" +
                "        },\n" +
                "        \"LB\": {\n" +
                "            \"alpha3\": \"LBN\",\n" +
                "            \"currencyId\": \"LBP\",\n" +
                "            \"currencyName\": \"Lebanese lira\",\n" +
                "            \"currencySymbol\": \"£\",\n" +
                "            \"id\": \"LB\",\n" +
                "            \"name\": \"Lebanon\"\n" +
                "        },\n" +
                "        \"MW\": {\n" +
                "            \"currencyId\": \"MWK\",\n" +
                "            \"currencyName\": \"Malawian kwacha\",\n" +
                "            \"name\": \"Malawi\",\n" +
                "            \"alpha3\": \"MWI\",\n" +
                "            \"id\": \"MW\"\n" +
                "        },\n" +
                "        \"MR\": {\n" +
                "            \"currencyId\": \"MRO\",\n" +
                "            \"currencyName\": \"Mauritanian ouguiya\",\n" +
                "            \"name\": \"Mauritania\",\n" +
                "            \"alpha3\": \"MRT\",\n" +
                "            \"id\": \"MR\"\n" +
                "        },\n" +
                "        \"MZ\": {\n" +
                "            \"currencyId\": \"MZN\",\n" +
                "            \"currencyName\": \"Mozambican metical\",\n" +
                "            \"name\": \"Mozambique\",\n" +
                "            \"alpha3\": \"MOZ\",\n" +
                "            \"id\": \"MZ\"\n" +
                "        },\n" +
                "        \"NG\": {\n" +
                "            \"alpha3\": \"NGA\",\n" +
                "            \"currencyId\": \"NGN\",\n" +
                "            \"currencyName\": \"Nigerian naira\",\n" +
                "            \"currencySymbol\": \"₦\",\n" +
                "            \"id\": \"NG\",\n" +
                "            \"name\": \"Nigeria\"\n" +
                "        },\n" +
                "        \"PA\": {\n" +
                "            \"alpha3\": \"PAN\",\n" +
                "            \"currencyId\": \"PAB\",\n" +
                "            \"currencyName\": \"Panamanian balboa\",\n" +
                "            \"currencySymbol\": \"B/.\",\n" +
                "            \"id\": \"PA\",\n" +
                "            \"name\": \"Panama\"\n" +
                "        },\n" +
                "        \"PL\": {\n" +
                "            \"alpha3\": \"POL\",\n" +
                "            \"currencyId\": \"PLN\",\n" +
                "            \"currencyName\": \"Polish zloty\",\n" +
                "            \"currencySymbol\": \"zł\",\n" +
                "            \"id\": \"PL\",\n" +
                "            \"name\": \"Poland\"\n" +
                "        },\n" +
                "        \"RU\": {\n" +
                "            \"alpha3\": \"RUS\",\n" +
                "            \"currencyId\": \"RUB\",\n" +
                "            \"currencyName\": \"Russian ruble\",\n" +
                "            \"currencySymbol\": \"руб\",\n" +
                "            \"id\": \"RU\",\n" +
                "            \"name\": \"Russia\"\n" +
                "        },\n" +
                "        \"VC\": {\n" +
                "            \"alpha3\": \"VCT\",\n" +
                "            \"currencyId\": \"XCD\",\n" +
                "            \"currencyName\": \"East Caribbean dollar\",\n" +
                "            \"currencySymbol\": \"$\",\n" +
                "            \"id\": \"VC\",\n" +
                "            \"name\": \"Saint Vincent and the Grenadines\"\n" +
                "        },\n" +
                "        \"SN\": {\n" +
                "            \"currencyId\": \"XOF\",\n" +
                "            \"currencyName\": \"West African CFA franc\",\n" +
                "            \"name\": \"Senegal\",\n" +
                "            \"alpha3\": \"SEN\",\n" +
                "            \"id\": \"SN\"\n" +
                "        },\n" +
                "        \"SS\": {\n" +
                "            \"currencyId\": \"SDG\",\n" +
                "            \"currencyName\": \"Sudanese pound\",\n" +
                "            \"name\": \"South Sudan\",\n" +
                "            \"alpha3\": \"SSD\",\n" +
                "            \"id\": \"SS\"\n" +
                "        },\n" +
                "        \"SZ\": {\n" +
                "            \"currencyId\": \"SZL\",\n" +
                "            \"currencyName\": \"Swazi lilangeni\",\n" +
                "            \"name\": \"Swaziland\",\n" +
                "            \"alpha3\": \"SWZ\",\n" +
                "            \"id\": \"SZ\"\n" +
                "        },\n" +
                "        \"TJ\": {\n" +
                "            \"currencyId\": \"TJS\",\n" +
                "            \"currencyName\": \"Tajikistani somoni\",\n" +
                "            \"name\": \"Tajikistan\",\n" +
                "            \"alpha3\": \"TJK\",\n" +
                "            \"id\": \"TJ\"\n" +
                "        },\n" +
                "        \"TT\": {\n" +
                "            \"alpha3\": \"TTO\",\n" +
                "            \"currencyId\": \"TTD\",\n" +
                "            \"currencyName\": \"Trinidad and Tobago dollar\",\n" +
                "            \"currencySymbol\": \"TT$\",\n" +
                "            \"id\": \"TT\",\n" +
                "            \"name\": \"Trinidad and Tobago\"\n" +
                "        },\n" +
                "        \"UG\": {\n" +
                "            \"alpha3\": \"UGA\",\n" +
                "            \"currencyId\": \"UGX\",\n" +
                "            \"currencyName\": \"Ugandan shilling\",\n" +
                "            \"currencySymbol\": \"USh\",\n" +
                "            \"id\": \"UG\",\n" +
                "            \"name\": \"Uganda\"\n" +
                "        },\n" +
                "        \"UY\": {\n" +
                "            \"alpha3\": \"URY\",\n" +
                "            \"currencyId\": \"UYU\",\n" +
                "            \"currencyName\": \"Uruguayan peso\",\n" +
                "            \"currencySymbol\": \"$U\",\n" +
                "            \"id\": \"UY\",\n" +
                "            \"name\": \"Uruguay\"\n" +
                "        },\n" +
                "        \"WF\": {\n" +
                "            \"currencyId\": \"XPF\",\n" +
                "            \"currencyName\": \"CFP franc\",\n" +
                "            \"name\": \"Wallis and Futuna Islands\",\n" +
                "            \"alpha3\": \"WLF\",\n" +
                "            \"id\": \"WF\"\n" +
                "        },\n" +
                "        \"EU\": {\n" +
                "            \"alpha3\": \"LTU\",\n" +
                "            \"currencyId\": \"EUR\",\n" +
                "            \"currencyName\": \"European euro\",\n" +
                "            \"currencySymbol\": \"€\",\n" +
                "            \"id\": \"EU\",\n" +
                "            \"name\": \"Euro\"\n" +
                "        }\n" +
                "    }\n" +
                "}");

        String s = stringBuffer.toString();
        return s;
    }

    public static String getCountryFlag(String countryCode) {
        try {
            int flagOffset = 0x1F1E6;
            int asciiOffset = 0x41;

            String country = countryCode;
            int firstChar = Character.codePointAt(country, 0) - asciiOffset + flagOffset;
            int secondChar = Character.codePointAt(country, 1) - asciiOffset + flagOffset;

            String flag = new String(Character.toChars(firstChar))
                    + new String(Character.toChars(secondChar));
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<String> countriesCurrencies = new ArrayList<>();
//    public static List<List<String>> countryCode = new ArrayList<>();
    public static List<String> countryCost = new ArrayList<>();

    public static List<String> NEWcountriesCurrencies = new ArrayList<>();
    public static List<String> NEWcountryCode = new ArrayList<>();
    public static List<String> NEWcountryCost = new ArrayList<>();

    public static void getCountryCode(Context context) {

        try {
            JsonParser parser = new JsonParser();
            JsonObject currencyObject;
            if ((Prefs.getPrefs("currencyJson", context).equals("notfound"))) {
                currencyObject = parser.parse(Globals.initalCurrnecyJson).getAsJsonObject();
                Prefs.setPrefs("currencyJson", Globals.initalCurrnecyJson, context);
            } else {
                currencyObject = parser.parse(Prefs.getPrefs("currencyJson", context)).getAsJsonObject();
            }

            JsonObject allThingsObject = parser.parse(Globals.allThingsJson()).getAsJsonObject();

            JsonObject quotes = currencyObject.get("currency").getAsJsonObject().get("quotes").getAsJsonObject();

            for (Map.Entry<String, JsonElement> entry : quotes.entrySet()) {
                String newkey = entry.getKey().substring(3);
                String cost = entry.getValue().getAsString();
                if (newkey.length() > 1) {
                    countriesCurrencies.add(newkey);
                    countryCost.add(cost);
                }
            }

            JsonObject allThings = allThingsObject.get("results").getAsJsonObject();
            for (String s : countriesCurrencies) {
                int i=0;
                int flag = 0;
                List<String> ids=new ArrayList<>();
                for (Map.Entry<String, JsonElement> entry : allThings.entrySet()) {
                    if (entry.getValue().getAsJsonObject().get("currencyId").getAsString().equals(s)) {
                        String id = entry.getValue().getAsJsonObject().get("id").getAsString();
                        ids.add(id);
                        NEWcountryCode.add(id);
                        NEWcountriesCurrencies.add(s);
                        NEWcountryCost.add(countryCost.get(i));
                        flag = 1;
                    }
                }
                if(flag==0){
//                    countryCode.add(ids);
                    NEWcountryCode.add("");
                    NEWcountriesCurrencies.add("");
                    NEWcountryCost.add("");
                }
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String convertCurrency(String from, String to, String fromValue) {
        String fromusd = null;
        String tousd = null;
//        Log.d("tagg", countryCode.toString());
//        Log.d("tagg", countriesCurrencies.toString());
//        Log.d("tagg", countryCost.toString());
        for (int i = 0; i < countriesCurrencies.size(); i++) {
            if (countriesCurrencies.get(i).equals(from)) {
                fromusd = countryCost.get(i);
            } else if (countriesCurrencies.get(i).equals(to)) {
                tousd = countryCost.get(i);
            }
        }
        if (fromusd != null && tousd != null) {
            Float toCost = Float.parseFloat(fromValue) * (((float) 1.0) / (Float.parseFloat(fromusd))) * (Float.parseFloat(tousd));
            Double dToCost = toCost.doubleValue();
            if (to.equals("PTR")) {
                return String.format("%10.8f", dToCost).trim();
            }else {
                return String.format("%15.2f", dToCost).trim();
            }
        } else {
            return "0";
        }
    }


    public static String getCountryCurrencyName(String currencyCode) {
        String currencyName = "" ;
        try {

            JsonParser parser = new JsonParser();

            JsonObject allThingsObject = parser.parse(Globals.allThingsJson()).getAsJsonObject();

            JsonObject allThings = allThingsObject.get("results").getAsJsonObject();

                for (Map.Entry<String, JsonElement> entry : allThings.entrySet()) {
                    if (entry.getValue().getAsJsonObject().get("currencyId").getAsString().equals(currencyCode)) {
                        currencyName = entry.getValue().getAsJsonObject().get("currencyName").getAsString();
                        break;
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currencyName;
    }

}
