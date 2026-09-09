package in.gaurav;

public class LoggingDecorator extends PaymentDecorator{
    public LoggingDecorator(PaymentService paymentService) {
        super(paymentService);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount +" started.");
        paymentService.pay(amount);
        System.out.println("Payment of " + amount +" completed.");
    }
}
