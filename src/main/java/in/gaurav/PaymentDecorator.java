package in.gaurav;

public abstract class PaymentDecorator implements PaymentService{
    protected PaymentService paymentService;
    public PaymentDecorator(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
