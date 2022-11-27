package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(100000,"VA",true,true,true,"SDET", true);
        offer2.setOfferInfo(90000,"PA",true,false,true,"SDET", true);
        offer3.setOfferInfo(75000,"NY",false,true,false,"SDET", true);
        offer4.setOfferInfo(110000,"VA",false,true,true,"SDET", true);
        offer5.setOfferInfo(105000,"VA",false,true,true,"QA", false);
        offer6.setOfferInfo(95000,"WA",true,false,true,"SDET", false);
        offer7.setOfferInfo(100000,"FL",true,true,true,"SDET", false);

        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        for(Offer each: jobOffers){
            each.getOfferInfo();
        }

        //jobOffers.removeIf(p->p.salary<100000);
        //System.out.println("Number of offers  "+jobOffers.size());

        //jobOffers.removeIf(p->p.salary<100000||!p.state.equals("VA"));
        //System.out.println("Number of offers  "+jobOffers.size());
        jobOffers.removeIf(p->p.hasPTO==false||p.hasBenefit==false||p.isFulltime==false);
        System.out.println("Number of offers  "+jobOffers.size());


    }
}
