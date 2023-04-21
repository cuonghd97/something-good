package dev.thesemicolon;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class VisaPaymentProcess extends PaymentProcess {
    private int cardNumber;
    @Override
    public void payment(int amount) {
        System.out.println("pay by visa with amount " + amount);
    }
}
