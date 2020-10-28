package Array.LAB1;

import java.util.ArrayList;
import java.util.List;

public class VD3 {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        System.out.println("Is the topCompanies is empty ? : "+ topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("FaceBook");

        System.out.println("Here are top "+ topCompanies.size() +"companies in the World");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top companies list : "+ topCompanies);

    }
}
