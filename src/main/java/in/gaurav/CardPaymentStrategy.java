package in.gaurav;

public class CardPaymentStrategy implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Rs " +amount+" payment done via Card Payment.");
    }
}
