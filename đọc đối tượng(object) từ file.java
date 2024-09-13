// đọc một array,class,list,... được chứa trong file:

// cú pháp:
// File file = new File("Tên file");
// FileInputStream fis = new FileInputStream(file);
// ObjectInputStream obj = new ObjectInputStream(fis);
// Đọc đối tượng: "Định dạng kiểu đối tượng" myObject = ("Định dạng kiểu đối tượng") ois.readObject();
// vd : ArrayList<Integer> array = (ArrayList<Integer>) obj.readObject();


File file = new File("DATA.in");
try(ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file))){ // cho file vào streamfile rồi chuyển vào objectsteeam.
    ArrayList<Integer> arl = (ArrayList<Integer>) obj.readObject();
    for (Integer i : arl) {
        masp.put(i, masp.getOrDefault(i,0)+1);
    }
} catch (Exception e) {
    // TODO: handle exception
}
