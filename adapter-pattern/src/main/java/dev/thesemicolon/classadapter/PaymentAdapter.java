package dev.thesemicolon.classadapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentAdapter implements PaymentMethod{
    private MomoPay adaptee;
    @Override
    public void pay() {
        double compatibleAmount = (double) this.adaptee.getAmount() / 23000.0;
        System.out.println("Pay with momo, amount " + compatibleAmount);
    }
}
