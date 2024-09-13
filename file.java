File file = new File("path/to/file.txt"); // duong dan chi tiet
File file = new File("DATA.in"); // duong dan hien tai chua file java
// exists(): Kiểm tra xem file hoặc thư mục có tồn tại không.
// createNewFile(): Tạo một file mới.
// delete(): Xóa file hoặc thư mục.
// length(): Lấy kích thước của file.
  File x = new File("DATA.in");
    try{
        Scanner sc = new Scanner(x);
        while(sc.hasNextLine()){ // hoặc hasNext, dùng để kiểm tra xem có dòng , dữ liệu tiếp theo trong file hay không. 
            System.out.println(sc.nextLine()); // in ra từng dòng dữ liệu trong file
        }
    }catch(FileNotFoundException e){ // kiểm tra xem có tồn tại file hay không.
  
    }
