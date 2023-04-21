package dev.thesemicolon.classadapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class YoutubePremium {
    private PaymentMethod paymentMethod;

    public void purchase() {
        this.paymentMethod.pay();
    }
}
