import java.util.*;
import java.io.*;
import java.math.*;
public class Quiz1{
    public static void main(String args[]){
        File file = new File("DATA.IN");
        Map<Integer,Integer> masp = new TreeMap<>();
        try (DataInputStream data = new DataInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    int temp = data.readInt();
                    masp.put(temp, masp.getOrDefault(temp, 0)+1);
                } catch (Exception e) {
                    break;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        for (Map.Entry<Integer,Integer> entry : masp.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
