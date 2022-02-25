package by.it.kuzma.calculator;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Var var) {
            System.out.println(var);

    }

    @Override
    public void print(Exception e) {
        System.out.println(e.getMessage());

    }
}
