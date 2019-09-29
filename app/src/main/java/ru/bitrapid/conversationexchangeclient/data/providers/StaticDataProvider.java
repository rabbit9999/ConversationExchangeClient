package ru.bitrapid.conversationexchangeclient.data.providers;

import java.util.LinkedHashMap;


public class StaticDataProvider {

    private static StaticDataProvider instance;

    private LinkedHashMap<String, String> languageMap;
    private LinkedHashMap<String, String> counrtyMap;

    public static StaticDataProvider getInstance(){
        if(instance == null){
            instance = new StaticDataProvider();
        }
        return instance;
    }

    private StaticDataProvider(){
        languageMap = new LinkedHashMap<>();
        languageMap.put("", "- All -");
        languageMap.put("6", "Afrikaans");
        languageMap.put("7", "Akan");
        languageMap.put("8", "Albanian");
        languageMap.put("122", "Amharic");
        languageMap.put("13", "Arabic");
        languageMap.put("118", "Arabic (Egyptian)");
        languageMap.put("119", "Arabic (Middle Eastern)");
        languageMap.put("120", "Arabic (Moroccan)");
        languageMap.put("14", "Aramaic");
        languageMap.put("15", "Armenian");
        languageMap.put("16", "Assamese");
        languageMap.put("17", "Assyrian");
        languageMap.put("75", "Aymara");
        languageMap.put("18", "Azerbaijani");
        languageMap.put("19", "Bahasa (Indonesia)");
        languageMap.put("20", "Bahasa (Malaysia)");
        languageMap.put("135", "Bambara");
        languageMap.put("141", "Bashkir");
        languageMap.put("21", "Basque");
        languageMap.put("22", "Belarusian");
        languageMap.put("23", "Bengali");
        languageMap.put("24", "Berber");
        languageMap.put("25", "Bosnian");
        languageMap.put("26", "Breton");
        languageMap.put("27", "Bulgarian");
        languageMap.put("28", "Burmese");
        languageMap.put("29", "Cambodian (Khmer)");
        languageMap.put("30", "Catalan");
        languageMap.put("131", "Cebuano");
        languageMap.put("31", "Chichewa (Nyanja)");
        languageMap.put("32", "Chinese (Cantonese)");
        languageMap.put("33", "Chinese (Mandarin)");
        languageMap.put("34", "Chinese, other");
        languageMap.put("35", "Creole");
        languageMap.put("36", "Croatian");
        languageMap.put("37", "Czech");
        languageMap.put("38", "Danish");
        languageMap.put("127", "Dhivehi (Maldivian)");
        languageMap.put("39", "Dutch");
        languageMap.put("2", "English");
        languageMap.put("40", "Esperanto");
        languageMap.put("41", "Estonian");
        languageMap.put("148", "Faroese");
        languageMap.put("42", "Fijian");
        languageMap.put("43", "Filipino (Tagalog)");
        languageMap.put("44", "Finnish");
        languageMap.put("4", "French");
        languageMap.put("45", "Gaelic (Irish)");
        languageMap.put("46", "Gaelic (Scottish)");
        languageMap.put("47", "Galician");
        languageMap.put("48", "Georgian");
        languageMap.put("5", "German");
        languageMap.put("156", "Gomeran whistle");
        languageMap.put("49", "Greek");
        languageMap.put("129", "Greek (Ancient)");
        languageMap.put("123", "Greenlandic");
        languageMap.put("126", "Guaraní");
        languageMap.put("157", "Guernsey");
        languageMap.put("50", "Gujarati");
        languageMap.put("152", "Hausa");
        languageMap.put("51", "Hawaiian");
        languageMap.put("52", "Hebrew");
        languageMap.put("53", "Hindi");
        languageMap.put("54", "Hmong");
        languageMap.put("55", "Hungarian");
        languageMap.put("56", "Icelandic");
        languageMap.put("57", "Ido");
        languageMap.put("58", "Interlingua");
        languageMap.put("1", "Italian");
        languageMap.put("155", "Jamaican Patois");
        languageMap.put("59", "Japanese");
        languageMap.put("68", "Kamilaroi");
        languageMap.put("115", "Kannada");
        languageMap.put("134", "Kashmiri");
        languageMap.put("61", "Kazakh");
        languageMap.put("140", "Kikuyu");
        languageMap.put("150", "Kinyarwanda");
        languageMap.put("136", "Klingon");
        languageMap.put("116", "Konkani");
        languageMap.put("62", "Korean");
        languageMap.put("63", "Kurdish");
        languageMap.put("139", "Kurmanji");
        languageMap.put("128", "Kyrgyz");
        languageMap.put("64", "Lao");
        languageMap.put("65", "Latin");
        languageMap.put("66", "Latvian");
        languageMap.put("154", "Lingala");
        languageMap.put("67", "Lithuanian");
        languageMap.put("117", "Luxembourgian");
        languageMap.put("69", "Macedonian");
        languageMap.put("70", "Malagasy");
        languageMap.put("146", "Malay");
        languageMap.put("71", "Malayalam");
        languageMap.put("72", "Maltese");
        languageMap.put("60", "Maori");
        languageMap.put("73", "Marathi");
        languageMap.put("151", "Mayan");
        languageMap.put("74", "Mongolian");
        languageMap.put("149", "Mossi");
        languageMap.put("76", "Nepali");
        languageMap.put("77", "Newari");
        languageMap.put("78", "Norwegian");
        languageMap.put("137", "Occitan");
        languageMap.put("79", "Oriya");
        languageMap.put("132", "Oromo");
        languageMap.put("133", "Papiamento");
        languageMap.put("80", "Persian");
        languageMap.put("81", "Polish");
        languageMap.put("82", "Portuguese");
        languageMap.put("83", "Punjabi");
        languageMap.put("84", "Pushto (Pashto)");
        languageMap.put("85", "Quechua");
        languageMap.put("86", "Romanian");
        languageMap.put("87", "Romansh");
        languageMap.put("88", "Russian");
        languageMap.put("89", "Sanskrit");
        languageMap.put("90", "Serbian");
        languageMap.put("91", "Shona");
        languageMap.put("125", "Sign Language - American");
        languageMap.put("143", "Sign Language - British");
        languageMap.put("147", "Sign Language - French");
        languageMap.put("153", "Sign Language - German");
        languageMap.put("92", "Sign Language - International");
        languageMap.put("138", "Sign Language - Japanese");
        languageMap.put("142", "Sign Language - South African");
        languageMap.put("93", "Sindhi");
        languageMap.put("94", "Sinhalese");
        languageMap.put("95", "Slovak");
        languageMap.put("96", "Slovenian");
        languageMap.put("97", "Somali");
        languageMap.put("3", "Spanish");
        languageMap.put("98", "Swahili");
        languageMap.put("99", "Swedish");
        languageMap.put("121", "Tajik");
        languageMap.put("100", "Tamil");
        languageMap.put("101", "Telugu");
        languageMap.put("102", "Tetum");
        languageMap.put("103", "Thai");
        languageMap.put("104", "Tibetan");
        languageMap.put("105", "Tongan");
        languageMap.put("106", "Tswana");
        languageMap.put("107", "Turkish");
        languageMap.put("124", "Turkmen");
        languageMap.put("108", "Ukrainian");
        languageMap.put("109", "Urdu");
        languageMap.put("130", "Uyghur");
        languageMap.put("110", "Uzbek");
        languageMap.put("112", "Vietnamese");
        languageMap.put("113", "Welsh");
        languageMap.put("144", "Xhosa");
        languageMap.put("114", "Yiddish");
        languageMap.put("111", "Zulu");

        counrtyMap = new LinkedHashMap<>();
        counrtyMap.put("", "- All -");
        counrtyMap.put("9", "Afghanistan");
        counrtyMap.put("138", "Albania");
        counrtyMap.put("10", "Algeria");
        counrtyMap.put("141", "Andorra");
        counrtyMap.put("142", "Angola");
        counrtyMap.put("182", "Antigua and Barbuda");
        counrtyMap.put("11", "Argentina");
        counrtyMap.put("12", "Armenia");
        counrtyMap.put("143", "Aruba");
        counrtyMap.put("6", "Australia");
        counrtyMap.put("13", "Austria");
        counrtyMap.put("14", "Azerbaijan");
        counrtyMap.put("15", "Bahamas");
        counrtyMap.put("16", "Bahrain");
        counrtyMap.put("17", "Bangladesh");
        counrtyMap.put("18", "Barbados");
        counrtyMap.put("19", "Belarus");
        counrtyMap.put("20", "Belgium");
        counrtyMap.put("21", "Belize");
        counrtyMap.put("178", "Benin");
        counrtyMap.put("186", "Bermuda");
        counrtyMap.put("187", "Bhutan");
        counrtyMap.put("22", "Bolivia");
        counrtyMap.put("23", "Bosnia and Herzegovina");
        counrtyMap.put("144", "Botswana");
        counrtyMap.put("24", "Brazil");
        counrtyMap.put("180", "Brunei");
        counrtyMap.put("25", "Bulgaria");
        counrtyMap.put("145", "Burkina Faso");
        counrtyMap.put("26", "Burma (Myanmar)");
        counrtyMap.put("146", "Burundi");
        counrtyMap.put("27", "Cambodia");
        counrtyMap.put("28", "Cameroon");
        counrtyMap.put("29", "Canada");
        counrtyMap.put("188", "Cape Verde");
        counrtyMap.put("30", "Cayman Islands");
        counrtyMap.put("31", "Central African Republic");
        counrtyMap.put("32", "Chile");
        counrtyMap.put("33", "China");
        counrtyMap.put("34", "Colombia");
        counrtyMap.put("35", "Congo");
        counrtyMap.put("36", "Costa Rica");
        counrtyMap.put("37", "Croatia");
        counrtyMap.put("38", "Cuba");
        counrtyMap.put("147", "Cyprus");
        counrtyMap.put("39", "Czech Republic");
        counrtyMap.put("40", "Denmark");
        counrtyMap.put("41", "Dominican Republic");
        counrtyMap.put("42", "Ecuador");
        counrtyMap.put("43", "Egypt");
        counrtyMap.put("44", "El Salvador");
        counrtyMap.put("148", "Equatorial Guinea");
        counrtyMap.put("45", "Estonia");
        counrtyMap.put("46", "Ethiopia");
        counrtyMap.put("183", "Fiji");
        counrtyMap.put("47", "Finland");
        counrtyMap.put("4", "France");
        counrtyMap.put("149", "French Guiana");
        counrtyMap.put("150", "Gabon");
        counrtyMap.put("151", "Gambia");
        counrtyMap.put("48", "Georgia");
        counrtyMap.put("5", "Germany");
        counrtyMap.put("49", "Ghana");
        counrtyMap.put("152", "Gibraltar");
        counrtyMap.put("51", "Greece");
        counrtyMap.put("177", "Grenada");
        counrtyMap.put("52", "Guatemala");
        counrtyMap.put("153", "Guinea");
        counrtyMap.put("154", "Guinea-Bissau");
        counrtyMap.put("155", "Guyana");
        counrtyMap.put("53", "Haiti");
        counrtyMap.put("54", "Honduras");
        counrtyMap.put("55", "Hong Kong");
        counrtyMap.put("56", "Hungary");
        counrtyMap.put("57", "Iceland");
        counrtyMap.put("58", "India");
        counrtyMap.put("59", "Indonesia");
        counrtyMap.put("60", "Iran");
        counrtyMap.put("61", "Iraq");
        counrtyMap.put("62", "Ireland");
        counrtyMap.put("63", "Israel");
        counrtyMap.put("1", "Italy");
        counrtyMap.put("156", "Ivory Coast");
        counrtyMap.put("64", "Jamaica");
        counrtyMap.put("65", "Japan");
        counrtyMap.put("66", "Jordan");
        counrtyMap.put("67", "Kazakhstan");
        counrtyMap.put("68", "Kenya");
        counrtyMap.put("69", "Kuwait");
        counrtyMap.put("157", "Kyrgyzstan");
        counrtyMap.put("71", "Laos");
        counrtyMap.put("72", "Latvia");
        counrtyMap.put("73", "Lebanon");
        counrtyMap.put("158", "Lesotho");
        counrtyMap.put("74", "Liberia");
        counrtyMap.put("75", "Libya");
        counrtyMap.put("159", "Liechtenstein");
        counrtyMap.put("76", "Lithuania");
        counrtyMap.put("77", "Luxembourg");
        counrtyMap.put("78", "Macedonia");
        counrtyMap.put("79", "Madagascar");
        counrtyMap.put("80", "Malawi");
        counrtyMap.put("81", "Malaysia");
        counrtyMap.put("82", "Maldives");
        counrtyMap.put("160", "Mali");
        counrtyMap.put("83", "Malta");
        counrtyMap.put("161", "Mauritania");
        counrtyMap.put("84", "Mauritius");
        counrtyMap.put("85", "Mexico");
        counrtyMap.put("86", "Moldova");
        counrtyMap.put("87", "Monaco");
        counrtyMap.put("162", "Mongolia");
        counrtyMap.put("181", "Montenegro");
        counrtyMap.put("88", "Morocco");
        counrtyMap.put("89", "Mozambique");
        counrtyMap.put("163", "Namibia");
        counrtyMap.put("140", "Nepal");
        counrtyMap.put("90", "Netherlands");
        counrtyMap.put("185", "Netherlands Antilles");
        counrtyMap.put("164", "New Caledonia");
        counrtyMap.put("91", "New Zealand");
        counrtyMap.put("93", "Nicaragua");
        counrtyMap.put("94", "Niger");
        counrtyMap.put("95", "Nigeria");
        counrtyMap.put("96", "North Korea");
        counrtyMap.put("97", "Norway");
        counrtyMap.put("98", "Oman");
        counrtyMap.put("99", "Pakistan");
        counrtyMap.put("184", "Palestine");
        counrtyMap.put("100", "Panama");
        counrtyMap.put("165", "Papua New Guinea");
        counrtyMap.put("101", "Paraguay");
        counrtyMap.put("102", "Peru");
        counrtyMap.put("103", "Philippines");
        counrtyMap.put("104", "Poland");
        counrtyMap.put("105", "Portugal");
        counrtyMap.put("106", "Puerto Rico");
        counrtyMap.put("107", "Qatar");
        counrtyMap.put("166", "Reunion");
        counrtyMap.put("108", "Romania");
        counrtyMap.put("109", "Russia");
        counrtyMap.put("167", "Rwanda");
        counrtyMap.put("189", "Saint Lucia");
        counrtyMap.put("110", "Saudi Arabia");
        counrtyMap.put("139", "Senegal");
        counrtyMap.put("179", "Serbia");
        counrtyMap.put("168", "Sierra Leone");
        counrtyMap.put("112", "Singapore");
        counrtyMap.put("113", "Slovakia");
        counrtyMap.put("114", "Slovenia");
        counrtyMap.put("115", "Somalia");
        counrtyMap.put("116", "South Africa");
        counrtyMap.put("117", "South Korea");
        counrtyMap.put("3", "Spain");
        counrtyMap.put("118", "Sri Lanka");
        counrtyMap.put("119", "Sudan");
        counrtyMap.put("169", "Suriname");
        counrtyMap.put("170", "Swaziland");
        counrtyMap.put("120", "Sweden");
        counrtyMap.put("121", "Switzerland");
        counrtyMap.put("122", "Syria");
        counrtyMap.put("123", "Taiwan");
        counrtyMap.put("171", "Tajikistan");
        counrtyMap.put("124", "Tanzania");
        counrtyMap.put("125", "Thailand");
        counrtyMap.put("172", "Togo");
        counrtyMap.put("126", "Trinidad and Tobago");
        counrtyMap.put("127", "Tunisia");
        counrtyMap.put("128", "Turkey");
        counrtyMap.put("173", "Turkmenistan");
        counrtyMap.put("174", "Uganda");
        counrtyMap.put("129", "Ukraine");
        counrtyMap.put("130", "United Arab Emirates");
        counrtyMap.put("2", "United Kingdom");
        counrtyMap.put("131", "United States");
        counrtyMap.put("132", "Uruguay");
        counrtyMap.put("133", "Uzbekistan");
        counrtyMap.put("134", "Venezuela");
        counrtyMap.put("135", "Vietnam");
        counrtyMap.put("175", "Yemen");
        counrtyMap.put("136", "Yugoslavia");
        counrtyMap.put("176", "Zambia");
        counrtyMap.put("137", "Zimbabwe");
    }


    public String[] getLanguageLis(){
        return languageMap.values().toArray(new String[0]);
    }

    public String getLangIdByIndex(int index){
        return languageMap.keySet().toArray(new String[0])[index];
    }

    public String[] getCountryList(){
        return counrtyMap.values().toArray(new String[0]);
    }

    public String getCountryIdByIndex(int index){
        return counrtyMap.keySet().toArray(new String[0])[0];
    }

}
