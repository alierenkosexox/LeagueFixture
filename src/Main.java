
// Ali Eren KÖSE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // takım sayısı çift ise
        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();

        list.add("FENERHABÇE");
        list.add("GALATASARAY");
        list.add("BURSASPOR");


        list2.add("BEŞİKTAŞ");
        list2.add("BAŞAKŞEHİR");
        list2.add("TRABZONSPOR");

        int totalRound = 10;

        for (int i = 1; i <= totalRound; i++) {
            System.out.println("\n" + "Hafta " + i + "\n" + "<><><><><>");

            Collections.shuffle(list);
            Collections.shuffle(list2);

            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j) + " - " + list2.get(j));
            }

        }

        // takım sayısı tek olursa bay geçmeli durum

        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        list3.add("FENERBAHÇE");
        list3.add("GALATASARAY");
        list3.add("BURSASPOR");
        list3.add("RİZESPOR");

        list4.add("BEŞİKTAŞ");
        list4.add("BAŞAKŞEHİR");
        list4.add("TRABZONSPOR");
        list4.add("BAY");

        int totalRound2 = 14;
        System.out.println("\n" + "TEKİL SİSTEM" + "\n" + "<><><><><>");

        for (int i = 1; i <= totalRound2; i++) {
            System.out.println("\n" + "Hafta" + i + "\n" + "<><><><><>");

            // takım listesini karıştır
            Collections.shuffle(list3);
            Collections.shuffle(list4);

            for (int j = 0; j < list3.size(); j++) {
                System.out.println(list3.get(j) + " - " + list4.get(j));
            }
        }
    }
}
