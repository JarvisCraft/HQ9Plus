package ru.progrm_jarvis.hq9plus.compiler;

import ru.progrm_jarvis.hq9plus.HQ9PlusPlugin;

/**
 * HQ9+ Compiler
 */
public final class HQ9PlusCompiler {
    private static final String unexpectedCharacterException = "--- EXCEPTION:\n" +
            "unexpected characters found in source code.";
    private static final String h = "hello, world";
    private static final String nine = "99 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "98 bottles of beer on the wall.\n" +
            "\n" +
            "98 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "97 bottles of beer on the wall.\n" +
            "\n" +
            "97 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "96 bottles of beer on the wall.\n" +
            "\n" +
            "96 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "95 bottles of beer on the wall.\n" +
            "\n" +
            "95 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "94 bottles of beer on the wall.\n" +
            "\n" +
            "94 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "93 bottles of beer on the wall.\n" +
            "\n" +
            "93 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "92 bottles of beer on the wall.\n" +
            "\n" +
            "92 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "91 bottles of beer on the wall.\n" +
            "\n" +
            "91 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "90 bottles of beer on the wall.\n" +
            "\n" +
            "90 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "89 bottles of beer on the wall.\n" +
            "\n" +
            "89 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "88 bottles of beer on the wall.\n" +
            "\n" +
            "88 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "87 bottles of beer on the wall.\n" +
            "\n" +
            "87 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "86 bottles of beer on the wall.\n" +
            "\n" +
            "86 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "85 bottles of beer on the wall.\n" +
            "\n" +
            "85 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "84 bottles of beer on the wall.\n" +
            "\n" +
            "84 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "83 bottles of beer on the wall.\n" +
            "\n" +
            "83 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "82 bottles of beer on the wall.\n" +
            "\n" +
            "82 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "81 bottles of beer on the wall.\n" +
            "\n" +
            "81 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "80 bottles of beer on the wall.\n" +
            "\n" +
            "80 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "79 bottles of beer on the wall.\n" +
            "\n" +
            "79 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "78 bottles of beer on the wall.\n" +
            "\n" +
            "78 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "77 bottles of beer on the wall.\n" +
            "\n" +
            "77 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "76 bottles of beer on the wall.\n" +
            "\n" +
            "76 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "75 bottles of beer on the wall.\n" +
            "\n" +
            "75 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "74 bottles of beer on the wall.\n" +
            "\n" +
            "74 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "73 bottles of beer on the wall.\n" +
            "\n" +
            "73 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "72 bottles of beer on the wall.\n" +
            "\n" +
            "72 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "71 bottles of beer on the wall.\n" +
            "\n" +
            "71 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "70 bottles of beer on the wall.\n" +
            "\n" +
            "70 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "69 bottles of beer on the wall.\n" +
            "\n" +
            "69 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "68 bottles of beer on the wall.\n" +
            "\n" +
            "68 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "67 bottles of beer on the wall.\n" +
            "\n" +
            "67 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "66 bottles of beer on the wall.\n" +
            "\n" +
            "66 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "65 bottles of beer on the wall.\n" +
            "\n" +
            "65 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "64 bottles of beer on the wall.\n" +
            "\n" +
            "64 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "63 bottles of beer on the wall.\n" +
            "\n" +
            "63 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "62 bottles of beer on the wall.\n" +
            "\n" +
            "62 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "61 bottles of beer on the wall.\n" +
            "\n" +
            "61 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "60 bottles of beer on the wall.\n" +
            "\n" +
            "60 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "59 bottles of beer on the wall.\n" +
            "\n" +
            "59 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "58 bottles of beer on the wall.\n" +
            "\n" +
            "58 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "57 bottles of beer on the wall.\n" +
            "\n" +
            "57 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "56 bottles of beer on the wall.\n" +
            "\n" +
            "56 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "55 bottles of beer on the wall.\n" +
            "\n" +
            "55 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "54 bottles of beer on the wall.\n" +
            "\n" +
            "54 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "53 bottles of beer on the wall.\n" +
            "\n" +
            "53 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "52 bottles of beer on the wall.\n" +
            "\n" +
            "52 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "51 bottles of beer on the wall.\n" +
            "\n" +
            "51 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "50 bottles of beer on the wall.\n" +
            "\n" +
            "50 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "49 bottles of beer on the wall.\n" +
            "\n" +
            "49 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "48 bottles of beer on the wall.\n" +
            "\n" +
            "48 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "47 bottles of beer on the wall.\n" +
            "\n" +
            "47 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "46 bottles of beer on the wall.\n" +
            "\n" +
            "46 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "45 bottles of beer on the wall.\n" +
            "\n" +
            "45 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "44 bottles of beer on the wall.\n" +
            "\n" +
            "44 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "43 bottles of beer on the wall.\n" +
            "\n" +
            "43 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "42 bottles of beer on the wall.\n" +
            "\n" +
            "42 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "41 bottles of beer on the wall.\n" +
            "\n" +
            "41 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "40 bottles of beer on the wall.\n" +
            "\n" +
            "40 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "39 bottles of beer on the wall.\n" +
            "\n" +
            "39 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "38 bottles of beer on the wall.\n" +
            "\n" +
            "38 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "37 bottles of beer on the wall.\n" +
            "\n" +
            "37 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "36 bottles of beer on the wall.\n" +
            "\n" +
            "36 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "35 bottles of beer on the wall.\n" +
            "\n" +
            "35 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "34 bottles of beer on the wall.\n" +
            "\n" +
            "34 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "33 bottles of beer on the wall.\n" +
            "\n" +
            "33 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "32 bottles of beer on the wall.\n" +
            "\n" +
            "32 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "31 bottles of beer on the wall.\n" +
            "\n" +
            "31 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "30 bottles of beer on the wall.\n" +
            "\n" +
            "30 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "29 bottles of beer on the wall.\n" +
            "\n" +
            "29 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "28 bottles of beer on the wall.\n" +
            "\n" +
            "28 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "27 bottles of beer on the wall.\n" +
            "\n" +
            "27 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "26 bottles of beer on the wall.\n" +
            "\n" +
            "26 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "25 bottles of beer on the wall.\n" +
            "\n" +
            "25 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "24 bottles of beer on the wall.\n" +
            "\n" +
            "24 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "23 bottles of beer on the wall.\n" +
            "\n" +
            "23 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "22 bottles of beer on the wall.\n" +
            "\n" +
            "22 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "21 bottles of beer on the wall.\n" +
            "\n" +
            "21 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "20 bottles of beer on the wall.\n" +
            "\n" +
            "20 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "19 bottles of beer on the wall.\n" +
            "\n" +
            "19 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "18 bottles of beer on the wall.\n" +
            "\n" +
            "18 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "17 bottles of beer on the wall.\n" +
            "\n" +
            "17 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "16 bottles of beer on the wall.\n" +
            "\n" +
            "16 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "15 bottles of beer on the wall.\n" +
            "\n" +
            "15 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "14 bottles of beer on the wall.\n" +
            "\n" +
            "14 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "13 bottles of beer on the wall.\n" +
            "\n" +
            "13 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "12 bottles of beer on the wall.\n" +
            "\n" +
            "12 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "11 bottles of beer on the wall.\n" +
            "\n" +
            "11 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "10 bottles of beer on the wall.\n" +
            "\n" +
            "10 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "9 bottles of beer on the wall.\n" +
            "\n" +
            "9 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "8 bottles of beer on the wall.\n" +
            "\n" +
            "8 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "7 bottles of beer on the wall.\n" +
            "\n" +
            "7 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "6 bottles of beer on the wall.\n" +
            "\n" +
            "6 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "5 bottles of beer on the wall.\n" +
            "\n" +
            "5 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "4 bottles of beer on the wall.\n" +
            "\n" +
            "4 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "3 bottles of beer on the wall.\n" +
            "\n" +
            "3 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "2 bottles of beer on the wall.\n" +
            "\n" +
            "2 bottles of beer\n" +
            "you take one down, pass it around,\n" +
            "1 bottles of beer on the wall.\n" +
            "\n" +
            "1 bottle of beer\n" +
            "you take it down, pass it around,\n" +
            "no more bottles of beer on the wall.";
    private static final String onSuccessfulPlus = "";
    public static String compile (String stringCode) {
        String stringLowerCode = stringCode.toLowerCase();
        String[] code = stringLowerCode.split("");
        StringBuilder result = new StringBuilder();
        for (String command : code) {
            switch (command) {
                case ("h"):
                    result.append(h);
                    break;
                case ("q"):
                    result.append(stringCode);
                    break;
                case ("9"):
                    result.append(nine);
                    break;
                case ("+"):
                    if (HQ9PlusPlugin.getInstance().plusAccumulator()) {
                        result.append(onSuccessfulPlus);
                    }
                    break;
                default:
                    return unexpectedCharacterException;
            }
        }
        return result.toString();
    }
    public static String getUnexpectedCharacterException() {
        return unexpectedCharacterException;
    }
}
