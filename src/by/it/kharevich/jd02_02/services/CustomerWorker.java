package by.it.kharevich.jd02_02.services;

import by.it.kharevich.jd02_02.entity.Customer;
import by.it.kharevich.jd02_02.entity.Good;
import by.it.kharevich.jd02_02.utils.RandomData;
import by.it.kharevich.jd02_02.utils.Sleeper;

public class CustomerWorker extends Thread implements CustomerAction, ShoppingCardAction {

    private final Customer customer;
    private final Store store;


    public CustomerWorker(Store store, Customer customer) {
        this.customer = customer;
        this.store = store;


        this.setName("Worker for" + customer.toString() + " ");
    }

    @Override
    public void run() {
        enteredStore();
        takeCart();
        Good good = chooseGood();
        System.out.println(customer + " choose " + good);
        goOut();
    }

    @Override
    public void enteredStore() {
        System.out.println(customer + " entered to store");

    }

    @Override
    public void takeCart() {
        System.out.println(customer + " take cart");

    }

    @Override
    public Good chooseGood() {
        System.out.println(customer + " started to choose goods");
        int timeout = RandomData.get(500, 2000);
        Sleeper.sleep(timeout);
        System.out.println(customer + " finished to choose goods");
        return new Good();
    }

    @Override
    public int putToCart(Good good) {
        System.out.println(customer + " to put " + " goods in cart");
        return 0;
    }

    @Override
    public void goOut() {
        System.out.println(customer + " go out");
    }

}
