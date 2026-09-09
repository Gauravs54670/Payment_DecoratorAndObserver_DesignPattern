package in.gaurav;


public class Main {
    public static void main(String[] args) {
        /*PaymentService paymentService = new PaymentServiceImplementation();
        paymentService.pay(5000);*/
        // Actual payment service
        PaymentServiceImplementation actualPayment =
                new PaymentServiceImplementation();

        // Register observers
        for (int i = 0; i<5; i++) {
            actualPayment.addObserver(
                    new EmailNotificationImplementation()
            );

            actualPayment.addObserver(
                    new PushNotificationImplementation()
            );
        }

        PaymentService payment = new FraudCheckDecorator(
                new LoggingDecorator(
                        actualPayment
                )
        );
        payment.pay(1000);
    }
}