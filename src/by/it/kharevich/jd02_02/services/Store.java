package by.it.kharevich.jd02_02.services;

import by.it.kharevich.jd02_02.entity.Customer;
import by.it.kharevich.jd02_02.exceptions.StoreException;
import by.it.kharevich.jd02_02.utils.RandomData;
import by.it.kharevich.jd02_02.utils.Sleeper;

import java.util.ArrayList;
import java.util.List;

public class Store extends Thread {

    @Override
    public void run() {
        System.out.println("Store opened");
        int number = 0;
        List<Thread> threads = new ArrayList<>();
        for (int time = 0; time < 120; time++) {
            int countCustomer = RandomData.get(2);

            for (int i = 0; i < countCustomer; i++) {
                Customer customer = new Customer(++number);

                CustomerWorker customerWorker = new CustomerWorker(this, customer);
                threads.add(customerWorker);
                customerWorker.start();
            }

            Sleeper.sleep(1000);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new StoreException();
            }
        }
        System.out.println("Store closed");
    }
}
