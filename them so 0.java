public class Quiz {
    public static void main(String[] args) {
        // In số 5 thành 0005
        System.out.println(String.format("MH%04d", 5)); // MH0005

        // In số 10 thành 0010
        System.out.println(String.format("%04d", 10)); // 0010
    }
}

public class Quiz {
    public static void main(String[] args) {
        // In số 5 thành 0005
        System.out.printf("%04d\n", 5); // 0005

        // In số 10 thành 0010
        System.out.printf("%04d\n", 10); // 0010
    }
}
