package dev.thesemicolon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PaymentProcess momoPaymentProcess = new MomoPaymentProcess();
        PaymentProcess visaPaymentProcess = new VisaPaymentProcess();

        MemberRegistration momoMemberRegistration = new MemberRegistration(momoPaymentProcess);
        momoMemberRegistration.register();

        MemberRegistration visaMemberRegistration = new MemberRegistration(visaPaymentProcess);
        visaMemberRegistration.register();
    }
}
