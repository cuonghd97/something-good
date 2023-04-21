package dev.thesemicolon.classadapter;

public class ClassAdapter {
    public static void main(String[] args) {
        PaymentMethod visaPay = new VisaPay(1.1);
        MomoPay momoPay = new MomoPay(10000);
        PaymentAdapter paymentAdapter = new PaymentAdapter(momoPay);
        YoutubePremium youtubePremium = new YoutubePremium(paymentAdapter);
        youtubePremium.purchase();
    }
}
