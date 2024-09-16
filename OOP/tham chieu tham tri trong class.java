package levinh;
import java.util.*;
public class WordSet {
    private Set<String> sett;
    public WordSet(String a){
        String[] b = a.trim().toLowerCase().split("\\s+");
        Set<String> c = new TreeSet<>(Arrays.asList(b));
        this.sett = c;
    }

    public WordSet intersection(WordSet other){
        WordSet temp = this     // tham chiếu làm thay đổi giá trị của this mặc dù gán temp = list nhưng thực chất temp tham chiếu đến this.
        WordSet temp = new WordSet(String.join(" ", this.sett)); // tham trị ko làm thay đổi giá trị cúa this.
        temp.sett.retainAll(other.sett);
        return temp;
    }
}
