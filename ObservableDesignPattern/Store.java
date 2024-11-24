package ObservableDesignPattern;

import ObservableDesignPattern.Observable.IphoneObservableImpl;
import ObservableDesignPattern.Observable.StocksObservable;
import ObservableDesignPattern.Observer.EmailAlertObserverImpl;
import ObservableDesignPattern.Observer.MobileAlertObserverImpl;
import ObservableDesignPattern.Observer.NotificationAlertObserver;

// asked in wallmart
public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
        System.out.println(iphoneStocksObservable.getStockCount());

    }
}
