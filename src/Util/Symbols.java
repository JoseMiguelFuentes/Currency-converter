
package Util;

import java.util.Arrays;

/**
 *
 * @author jomif
 */
public class Symbols {
    

    private String  symbolsE[] = {
        "AED", "United Arab Emirates Dirham",
        "AFN", "Afghan Afghani",
        "ALL", "Albanian Lek",
        "AMD", "Armenian Dram",
        "ANG", "Netherlands Antillean Guilder",
        "AOA", "Angolan Kwanza",
        "ARS", "Argentine Peso",
        "AUD", "Australian Dollar",
        "AWG", "Aruban Florin",
        "AZN", "Azerbaijani Manat",
        "BAM", "Bosnia-Herzegovina Convertible Mark",
        "BBD", "Barbadian Dollar",
        "BDT", "Bangladeshi Taka",
        "BGN", "Bulgarian Lev",
        "BHD", "Bahraini Dinar",
        "BIF", "Burundian Franc",
        "BMD", "Bermudan Dollar",
        "BND", "Brunei Dollar",
        "BOB", "Bolivian Boliviano",
        "BRL", "Brazilian Real",
        "BSD", "Bahamian Dollar",
        "BTC", "Bitcoin",
        "BTN", "Bhutanese Ngultrum",
        "BWP", "Botswanan Pula",
        "BYN", "New Belarusian Ruble",
        "BYR", "Belarusian Ruble",
        "BZD", "Belize Dollar",
        "CAD", "Canadian Dollar",
        "CDF", "Congolese Franc",
        "CHF", "Swiss Franc",
        "CLF", "Chilean Unit of Account (UF)",
        "CLP", "Chilean Peso",
        "CNY", "Chinese Yuan",
        "COP", "Colombian Peso",
        "CRC", "Costa Rican Col\u00f3n",
        "CUC", "Cuban Convertible Peso",
        "CUP", "Cuban Peso",
        "CVE", "Cape Verdean Escudo",
        "CZK", "Czech Republic Koruna",
        "DJF", "Djiboutian Franc",
        "DKK", "Danish Krone",
        "DOP", "Dominican Peso",
        "DZD", "Algerian Dinar",
        "EGP", "Egyptian Pound",
        "ERN", "Eritrean Nakfa",
        "ETB", "Ethiopian Birr",
        "EUR", "Euro",
        "FJD", "Fijian Dollar",
        "FKP", "Falkland Islands Pound",
        "GBP", "British Pound Sterling",
        "GEL", "Georgian Lari",
        "GGP", "Guernsey Pound",
        "GHS", "Ghanaian Cedi",
        "GIP", "Gibraltar Pound",
        "GMD", "Gambian Dalasi",
        "GNF", "Guinean Franc",
        "GTQ", "Guatemalan Quetzal",
        "GYD", "Guyanaese Dollar",
        "HKD", "Hong Kong Dollar",
        "HNL", "Honduran Lempira",
        "HRK", "Croatian Kuna",
        "HTG", "Haitian Gourde",
        "HUF", "Hungarian Forint",
        "IDR", "Indonesian Rupiah",
        "ILS", "Israeli New Sheqel",
        "IMP", "Manx pound",
        "INR", "Indian Rupee",
        "IQD", "Iraqi Dinar",
        "IRR", "Iranian Rial",
        "ISK", "Icelandic Kr\u00f3na",
        "JEP", "Jersey Pound",
        "JMD", "Jamaican Dollar",
        "JOD", "Jordanian Dinar",
        "JPY", "Japanese Yen",
        "KES", "Kenyan Shilling",
        "KGS", "Kyrgystani Som",
        "KHR", "Cambodian Riel",
        "KMF", "Comorian Franc",
        "KPW", "North Korean Won",
        "KRW", "South Korean Won",
        "KWD", "Kuwaiti Dinar",
        "KYD", "Cayman Islands Dollar",
        "KZT", "Kazakhstani Tenge",
        "LAK", "Laotian Kip",
        "LBP", "Lebanese Pound",
        "LKR", "Sri Lankan Rupee",
        "LRD", "Liberian Dollar",
        "LSL", "Lesotho Loti",
        "LTL", "Lithuanian Litas",
        "LVL", "Latvian Lats",
        "LYD", "Libyan Dinar",
        "MAD", "Moroccan Dirham",
        "MDL", "Moldovan Leu",
        "MGA", "Malagasy Ariary",
        "MKD", "Macedonian Denar",
        "MMK", "Myanma Kyat",
        "MNT", "Mongolian Tugrik",
        "MOP", "Macanese Pataca",
        "MRO", "Mauritanian Ouguiya",
        "MUR", "Mauritian Rupee",
        "MVR", "Maldivian Rufiyaa",
        "MWK", "Malawian Kwacha",
        "MXN", "Mexican Peso",
        "MYR", "Malaysian Ringgit",
        "MZN", "Mozambican Metical",
        "NAD", "Namibian Dollar",
        "NGN", "Nigerian Naira",
        "NIO", "Nicaraguan C\u00f3rdoba",
        "NOK", "Norwegian Krone",
        "NPR", "Nepalese Rupee",
        "NZD", "New Zealand Dollar",
        "OMR", "Omani Rial",
        "PAB", "Panamanian Balboa",
        "PEN", "Peruvian Nuevo Sol",
        "PGK", "Papua New Guinean Kina",
        "PHP", "Philippine Peso",
        "PKR", "Pakistani Rupee",
        "PLN", "Polish Zloty",
        "PYG", "Paraguayan Guarani",
        "QAR", "Qatari Rial",
        "RON", "Romanian Leu",
        "RSD", "Serbian Dinar",
        "RUB", "Russian Ruble",
        "RWF", "Rwandan Franc",
        "SAR", "Saudi Riyal",
        "SBD", "Solomon Islands Dollar",
        "SCR", "Seychellois Rupee",
        "SDG", "Sudanese Pound",
        "SEK", "Swedish Krona",
        "SGD", "Singapore Dollar",
        "SHP", "Saint Helena Pound",
        "SLE", "Sierra Leonean Leone",
        "SOS", "Somali Shilling",
        "SRD", "Surinamese Dollar",
        "STD", "S\u00e3o Tom\u00e9 and Pr\u00edncipe Dobra",
        "SVC", "Salvadoran Col\u00f3n",
        "SYP", "Syrian Pound",
        "SZL", "Swazi Lilangeni",
        "THB", "Thai Baht",
        "TJS", "Tajikistani Somoni",
        "TMT", "Turkmenistani Manat",
        "TND", "Tunisian Dinar",
        "TOP", "Tongan Pa\u02bbanga",
        "TRY", "Turkish Lira",
        "TTD", "Trinidad and Tobago Dollar",
        "TWD", "New Taiwan Dollar",
        "TZS", "Tanzanian Shilling",
        "UAH", "Ukrainian Hryvnia",
        "UGX", "Ugandan Shilling",
        "USD", "United States Dollar",
        "UYU", "Uruguayan Peso",
        "UZS", "Uzbekistan Som",
        "VEF", "Venezuelan Bol\u00edvar Fuerte",
        "VES", "Sovereign Bolivar",
        "VND", "Vietnamese Dong",
        "VUV", "Vanuatu Vatu",
        "WST", "Samoan Tala",
        "XAF", "CFA Franc BEAC",
        "XAG", "Silver (troy ounce)",
        "XAU", "Gold (troy ounce)",
        "XCD", "East Caribbean Dollar",
        "XDR", "Special Drawing Rights",
        "XOF", "CFA Franc BCEAO",
        "XPF", "CFP Franc",
        "YER", "Yemeni Rial",
        "ZAR", "South African Rand",
        "ZMK", "Zambian Kwacha (pre-2013)",
        "ZMW", "Zambian Kwacha",
        "ZWL", "Zimbabwean Dollar"//170
};

    
    private String  symbolsS[] = {
        "AED", "Dírham de los Emiratos Árabes Unidos",
        "AFN", "Afgani",
        "ALL", "Lek",
        "AMD", "Dram armenio",
        "ANG", "Florín antillano neerlandés",
        "AOA", "Kwanza",
        "ARS", "Peso argentino",
        "AUD", "Dólar australiano",
        "AWG", "Florín arubeño",
        "AZN", "Manat azerbaiyano",
        "BAM", "Marco convertible",
        "BBD", "Dólar barbadense",
        "BDT", "Taka",
        "BGN", "Lev búlgaro",
        "BHD", "Dinar bareiní",
        "BIF", "Franco de Burundi",
        "BMD", "Dólar bermudeño",
        "BND", "Dólar de Brunéi",
        "BOB", "Boliviano",
        "BRL", "Real brasileño",
        "BSD", "Dólar bahameño",
        "BTC", "Bitcoin",
        "BTN", "Ngultrum",
        "BWP", "Pula",
        "BYN", "Rublo bielorruso",
        "BYR", "Belarusian Ruble",
        "BZD", "Dólar beliceño",
        "CAD", "Dólar canadiense",
        "CDF", "Franco congoleño",
        "CHF", "Franco suizo",
        "CLF", "Unidad de fomento (Chile)",
        "CLP", "Peso Chileno",
        "CNY", "Yuan chino",
        "COP", "Peso Colombiano",
        "CRC", "Colón costarricense",
        "CUC", "Cuban Convertible Peso",
        "CUP", "Peso Cubano",
        "CVE", "Escudo caboverdiano",
        "CZK", "Corona checa",
        "DJF", "Franco yibutiano",
        "DKK", "Corona danesa",
        "DOP", "Peso dominicano",
        "DZD", "Dinar argelino",
        "EGP", "Libra egipcia",
        "ERN", "Nakfa",
        "ETB", "Birr etíope",
        "EUR", "Euro",
        "FJD", "Dólar fiyiano",
        "FKP", "Libra malvinense",
        "GBP", "Libra esterlina",
        "GEL", "Lari",
        "GGP", "Libra de Guernsey",
        "GHS", "Cedi ghanés",
        "GIP", "Libra de Gibraltar",
        "GMD", "Dalasi",
        "GNF", "Franco guineano",
        "GTQ", "Quetzal",
        "GYD", "Dólar guyanés",
        "HKD", "Dólar de Hong Kong",
        "HNL", "Lempira",
        "HRK", "Kuna",
        "HTG", "Gourde",
        "HUF", "Forinto",
        "IDR", "Rupia indonesia",
        "ILS", "Nuevo séquel israelí",
        "IMP", "Libra manesa",
        "INR", "Rupia india",
        "IQD", "Dinar iraquí",
        "IRR", "Rial iraní",
        "ISK", "Corona islandesa",
        "JEP", "Jersey Pound",
        "JMD", "Dólar jamaiquino",
        "JOD", "Dinar jordano",
        "JPY", "Yen Japonés",
        "KES", "Chelín keniano",
        "KGS", "Som kirguís",
        "KHR", "Riel camboyano",
        "KMF", "Franco comorano",
        "KPW", "Won norcoreano",
        "KRW", "Won surcoreano",
        "KWD", "Dinar kuwaití",
        "KYD", "Dólar de las Islas Caimán",
        "KZT", "Tenge kazajo",
        "LAK", "Kip laosiano",
        "LBP", "Libra libanesa",
        "LKR", "Rupia de Sri Lanka",
        "LRD", "Dólar liberiano",
        "LSL", "Lesoto loti",
        "LTL", "Litas lituana",
        "LVL", "Lat letón",
        "LYD", "Dinar libio",
        "MAD", "Dírham marroquí",
        "MDL", "Leu moldavo",
        "MGA", "Ariary malgache",
        "MKD", "Denar macedonio",
        "MMK", "Kyat de Myanmar",
        "MNT", "Tugrik mongol",
        "MOP", "Pataca de Macao",
        "MRO", "Uguiya mauritana",
        "MUR", "Rupia de Mauricio",
        "MVR", "Rufiyaa de Maldivas",
        "MWK", "Kwacha de Malawi",
        "MXN", "Peso mexicano",
        "MYR", "Ringgit malayo",
        "MZN", "Metical mozambiqueño",
        "NAD", "Dólar namibio",
        "NGN", "Naira nigeriano",
        "NIO", "Córdoba nicaragüense",
        "NOK", "Corona noruega",
        "NPR", "Rupia nepalí",
        "NZD", "Dolar de Nueva Zelanda",
        "OMR", "Rial omaní",
        "PAB", "Balboa panameño",
        "PEN", "Nuevo sol peruano",
        "PGK", "Kina de Papua Nueva Guinea",
        "PHP", "Peso filipino",
        "PKR", "Rupia pakistaní",
        "PLN", "Zloty polaco",
        "PYG", "Guaraní paraguayo",
        "QAR", "Rial qatarí",
        "RON", "Leu rumano",
        "RSD", "Dinar serbio",
        "RUB", "Rublo ruso",
        "RWF", "Franco ruandés",
        "SAR", "Rial saudita",
        "SBD", "Dólar de las Islas Salomón",
        "SCR", "Rupia de Seychelles",
        "SDG", "Libra sudanesa",
        "SEK", "Corona sueca",
        "SGD", "Dolar de Singapur",
        "SHP", "Libra de Santa Elena",
        "SLE", "Leones de Sierra Leona",
        "SOS", "Chelín somalí",
        "SRD", "Dólar surinamés",
        "STD", "Dobra",
        "SVC", "Colón Salvadoreño",
        "SYP", "Libra siria",
        "SZL", "Lilangeni suazi",
        "THB", "Baht tailandés",
        "TJS", "Somoni de Tayikistán",
        "TMT", "Manat turkmenistán",
        "TND", "Dinar tunecino",
        "TOP", "Paʻanga",
        "TRY", "Lira turca",
        "TTD", "Dólar de Trinidad y Tobago",
        "TWD", "Nuevo dólar taiwanés",
        "TZS", "Chelín tanzano",
        "UAH", "Hryvnia ucraniano",
        "UGX", "Chelín ugandés",
        "USD", "Dólar de los Estados Unidos",
        "UYU", "Peso uruguayo",
        "UZS", "Som uzbeko",
        "VEF", "Bolivar Venezuelano ",
        "VES", "Soberano bolivar",
        "VND", "Dong vietnamita",
        "VUV", "Vanuatu Vatu",
        "WST", "Tala de Samoa",
        "XAF", "Franco CFA BEAC",
        "XAG", "Plata (onza troy)",
        "XAU", "Oro (onza troy)",
        "XCD", "Dólar del Caribe Oriental",
        "XDR", "Derechos especiales de dibujo",
        "XOF", "Franco CFA BCEAO",
        "XPF", "Franco CFP",
        "YER", "Rial yemení",
        "ZAR", "Rand sudafricano",
        "ZMK", "Kwacha zambiano (anterior a 2013)",
        "ZMW", "Kwacha zambiano",
        "ZWL", "Dólar zimbabuense"
    };
    
    
    
    public String[] getSymbolsE() {
        Arrays.sort(symbolsE);
        return symbolsE;
    }
    
    public String[] getSymbolsS() {
        return  symbolsS;
    }
    
    
}
