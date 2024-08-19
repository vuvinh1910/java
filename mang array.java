int[] myArray; //Khai báo mảng
int[] myArray = new int[5]; // Khởi tạo mảng với kích thước cố định
int[] myArray = {1, 2, 3, 4, 5}; // Khởi tạo mảng với các giá trị cụ thể

// duyet qua mang:
for (int i = 0; i < myArray.length; i++) {
    System.out.println("Phần tử thứ " + i + " là: " + myArray[i]);
}

// duyet qua mang dung for each"
for (int element : myArray) {
    System.out.println("Giá trị phần tử: " + element);
}

// mang 2 chieu:
int[][] arrayName; // Khai báo mảng 2 chiều
int[][] arrayName = new int[rows][columns]; // Khởi tạo với kích thước cố định

// duyet mang 2 chieu:
int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
// duyet:
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println(); // Xuống dòng sau mỗi hàng
}

