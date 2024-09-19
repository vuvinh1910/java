package levinh;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<Integer> sett = new HashSet<>();
        Collections.addAll(sett, 1, 2, 3, 4);
        Set<Integer> sett2 = new HashSet<>();
        Collections.addAll(sett2, 3, 4, 5, 6);
        sett.addAll(sett2);  // them tat ca sett2 vao sett  
        for (Integer integer : sett) {
            System.out.print(integer+" "); // 1,2,3,4,5,6
        }
    }
}
