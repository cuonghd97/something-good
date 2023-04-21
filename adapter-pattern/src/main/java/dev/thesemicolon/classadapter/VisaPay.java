package dev.thesemicolon.classadapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VisaPay implements PaymentMethod{
    private double amount;

    @Override
    public void pay() {
        System.out.println("Pay with visa, amount " + this.amount);
    }
}
