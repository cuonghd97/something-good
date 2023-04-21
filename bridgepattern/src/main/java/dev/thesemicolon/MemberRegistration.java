package dev.thesemicolon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistration {
    private PaymentProcess paymentProcess;

    public void register() {
        int amount = 100;
        this.paymentProcess.payment(amount);
        System.out.println("Registered for a member");
    }
}
