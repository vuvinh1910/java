File file = new File("path/to/file.txt"); // duong dan chi tiet
File file = new File("DATA.in"); // duong dan hien tai chua file java
// exists(): Kiểm tra xem file hoặc thư mục có tồn tại không.
// createNewFile(): Tạo một file mới.
// delete(): Xóa file hoặc thư mục.
// length(): Lấy kích thước của file.
  File x = new File("DATA.in");
    try{
        Scanner sc = new Scanner(x);
        while(sc.hasNextLine()){ // dùng để kiểm tra xem có dòng còn trong file hay không. 
            System.out.println(sc.nextLine()); // in ra từng dòng dữ liệu trong file
        }

      while(sc.hasNext()){ // ktra dữ liệu tiếp theo có tồn tại trong file hay không. 
            System.out.println(sc.next()); // in ra từng dữ liệu trong file: vd: trong file có chục dòng, chục khoảng trống lớn nỏ và có 2 dữ liệu văn bản "vinh" và "19"
            // thí sẽ in ra "vinh" và "19" bỏ qua mọi khoảng cách và dòng trống.
        }
    }catch(FileNotFoundException e){ // kiểm tra xem có tồn tại file hay không.
  
    }
