package ObservableDesignPattern.Observer;

import ObservableDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock hurry upd!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to:" + userName);
    }

}
