package dev.thesemicolon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberRegistrationTightCoupling {
    private MomoPaymentProcess momoPaymentProcess;

    public void register() {
        int amount = 100;
        this.momoPaymentProcess.payment(amount);
        System.out.println("Registered for a member");
    }
}
