package in.gaurav;

public class FraudCheckDecorator extends PaymentDecorator {

    public FraudCheckDecorator(PaymentService paymentService) {
        super(paymentService);
    }

    @Override
    public void pay(double amount) {
        if(amount > 100000) {
            System.out.println("Suspicious payment");
            return;
        }
        System.out.println("Fraud check pass");
        paymentService.pay(amount);
    }
}
