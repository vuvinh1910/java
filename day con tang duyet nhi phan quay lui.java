import java.util.*;
import java.io.*;
import java.math.*;
public class Quiz {
    public static void Quay(int batdau, TreeSet<String> sett,int[] so, int n, List<Integer> ketqua,String ketquastr){
        if(ketqua.size() > 1) {
            sett.add(ketquastr);
        }
        if(batdau == n || ketqua.size()==n) {
            return;
        }
        for (int i = batdau; i < so.length; i++) {
            if(ketqua.size()==0){
                ketqua.add(so[i]);
                Quay(i+1,sett,so,n,ketqua,ketquastr+Integer.toString(so[i])+" ");
                ketqua.remove(ketqua.size()-1);
            } else{
                if(so[i] > ketqua.get(ketqua.size()-1)){
                ketqua.add(so[i]);
                Quay(i+1,sett,so,n,ketqua,ketquastr+Integer.toString(so[i])+" ");
                ketqua.remove(ketqua.size()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("DAYSO.in");
        try {
            Scanner sc = new Scanner(file);
            TreeSet<String> sett = new TreeSet<>();
            List<Integer> ketqua = new ArrayList<>();
            int n = sc.nextInt();
            int[] so = new int[n];
            for (int i = 0; i < n; i++) {
                so[i] = sc.nextInt();
            }
            Quay(0,sett,so,n,ketqua,"");
            for(String ss : sett){
                System.out.println(ss);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
