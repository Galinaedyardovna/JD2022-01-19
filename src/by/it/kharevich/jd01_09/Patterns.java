package by.it.kharevich.jd01_09;

public class Patterns {

    private Patterns() {
    }

    public static final String SPACES = "\\s+";
    public static final String OPERATION = "[-+*/]";
    public static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    public static final String VECTOR = "\\{"+SCALAR+"(,"+SCALAR+")*}";
    public static final String MATRIX = "\\{"+VECTOR+"(,"+VECTOR+")*}";


    // {{1,2,3&2,3,4}}

    //2.1+2 {-2,-3.8,4}+{3,4,5} {{1,2,3},{2,3,4}}*8
}
