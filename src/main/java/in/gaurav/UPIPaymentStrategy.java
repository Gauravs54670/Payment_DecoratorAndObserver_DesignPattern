package in.gaurav;

public class UPIPaymentStrategy implements PaymentService{

    @Override
    public void pay(double amount) {
        System.out.println("Rs " +amount+" payment done via UPI.");
    }
}
