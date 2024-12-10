import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Bt1 {

    public static void main(String[] args) throws Exception {
      //// xet snt
        boolean[] prime = new boolean[10001];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i < 10001; i++) {
            if(prime[i]) {
                for (int j = i*i; j < 10001; j+=i) {
                    prime[j] = false;
                }
            }
        }

        ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) obj1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) obj2.readObject();
        Map<Integer,Integer> map1 = new TreeMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();
        for(Integer i : list1) {
            if(prime[i]) {
                map1.put(i, map1.getOrDefault(i,0)+1);
            }
        }
        for(Integer i : list2) {
            if(prime[i]) {
                map2.put(i, map2.getOrDefault(i,0)+1);
            }
        }
        map1.keySet().retainAll(map2.keySet()); // dua ve set<>(key) va retainAll (retainAll ko dung truc tiep vs map)
        for(Integer i : map1.keySet()) {
            System.out.println(i+" "+map1.get(i)+" "+map2.get(i));
        }
    }
}
