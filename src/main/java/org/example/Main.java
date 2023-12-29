package org.example;

import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> prefixes = Set.of("Registration No. ", "Tax Identification No. ");

        String s3 = "河南乾坤路桥工程有限公司, Company Registration No. Company Registration No. 914107277474029059";
        String s =
            "Bangladesh VAT Registration No. 15141013910-150001 and Bangladesh Income Tax Identification No. 557288317255";

        prefixes.stream().map(x -> extractedUni(s, x)).filter(Objects::nonNull).forEach(System.out::println);

    }

    private static String extractedUni(String currentName, String prefixUni) {
        int lastIndex = -1;
        int startIndex = 0;

        while (true) {
            int index = currentName.indexOf(prefixUni, startIndex);
            if (index == -1) {
                break;
            }
            lastIndex = index;
            startIndex = index + 1;
        }

        if (lastIndex != -1) {
            startIndex = lastIndex + prefixUni.length();
            int endIndex = currentName.indexOf(' ', startIndex);
            if (startIndex < endIndex) {
                return currentName.substring(startIndex, endIndex);
            } else {
                return currentName.substring(startIndex);
            }
        }
        return null;
    }
}