package com.pingwit.part_22.homework.task_2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class WebSiteExample {
    public static void main(String[] args) {
        List<WebsiteInformation> wsi = new ArrayList<>();

        wsi.add(new WebsiteInformation("Gora", "info.org", LocalDate.of(2024, 8, 1)));
        wsi.add(new WebsiteInformation("Anna", "gazeta.com", LocalDate.of(2024, 8, 3)));
        wsi.add(new WebsiteInformation("John", "java.org", LocalDate.of(2024, 7, 21)));
        wsi.add(new WebsiteInformation("Maria", "foggi.net", LocalDate.of(2024, 8, 14)));
        wsi.add(new WebsiteInformation("Alex", "bigus.com", LocalDate.of(2024, 7, 19)));
        wsi.add(new WebsiteInformation("Vadimus", "alis.net", LocalDate.of(2024, 8, 5)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, enter a month");
        int month = scanner.nextInt();

        Map<String, Long> siteVisitsCount = wsi.stream()
                .filter(visit -> visit.getLocalDate().getMonthValue() == month)
                .collect(Collectors.groupingBy(WebsiteInformation::getWebSiteName, Collectors.counting()));

        System.out.println("Visit per month " + month + ":");
        for (Map.Entry<String, Long> entry : siteVisitsCount.entrySet()) {
            String site = entry.getKey();
            Long count = entry.getValue();
            System.out.println("Site: " + site + ", amount: " + count);

        }
    }
}
