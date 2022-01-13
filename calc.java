import java.util.*;
import java.io.*;

class Calc {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("calc");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}