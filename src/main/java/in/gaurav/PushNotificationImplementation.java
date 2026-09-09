package in.gaurav;

public class PushNotificationImplementation implements PaymentObserver{
    @Override
    public void paymentDone(double amount) {
        System.out.println(
                "PUSH: Payment of ₹" + amount + " completed"
        );
    }
}
