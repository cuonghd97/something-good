package dev.thesemicolon;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MomoPaymentProcess extends PaymentProcess{
    private int cardNumber;

    @Override
    public void payment(int amount) {
        System.out.println("pay by momo with amount " + amount);
    }
}
