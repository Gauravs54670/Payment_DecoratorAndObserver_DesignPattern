package in.gaurav;

public class EmailNotificationImplementation implements PaymentObserver{
    @Override
    public void paymentDone(double amount) {
        System.out.println(
                "EMAIL: Payment of ₹" + amount + " completed"
        );
    }
}
