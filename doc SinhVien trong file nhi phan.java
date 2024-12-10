public class SinhVien implements Serializable {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sdf.parse(ngaysinh);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + String.format(" %.2f", gpa);
    }
}

FileInputStream fis = new FileInputStream("SV.in");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<SinhVien> list = (ArrayList<SinhVien>) ois.readObject();
            ois.close();
            fis.close();

            for (SinhVien sv : list) {
                System.out.println(sv);
            }
