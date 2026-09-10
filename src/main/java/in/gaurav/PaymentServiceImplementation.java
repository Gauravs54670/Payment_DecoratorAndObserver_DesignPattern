package in.gaurav;

import java.util.ArrayList;
import java.util.List;

//SUbJECt for PaymentObservers
public class PaymentServiceImplementation implements PaymentService{

    private final PaymentService paymentService;
    public PaymentServiceImplementation(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    List<PaymentObserver> paymentObservers = new ArrayList<>();
    @Override
    public void pay(double amount) {
        paymentService.pay(amount);
        notifyObservers(amount);
    }
    public void addObserver(PaymentObserver observer) {
        paymentObservers.add(observer);
    }
    public void notifyObservers(double amount) {
        for (PaymentObserver observer: paymentObservers)
            observer.paymentDone(amount);
    }
}
