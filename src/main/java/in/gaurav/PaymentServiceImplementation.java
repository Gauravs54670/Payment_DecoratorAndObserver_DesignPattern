package in.gaurav;

import java.util.ArrayList;
import java.util.List;

//SUbJECt for PaymentObservers
public class PaymentServiceImplementation implements PaymentService{

    List<PaymentObserver> paymentObservers = new ArrayList<>();
    @Override
    public void pay(double amount) {
        System.out.println("Rs " +amount+" payment done.");
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
