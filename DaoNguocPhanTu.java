package season_2.DaoNguocPhanTuArr;

import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int length;
        int array[] = new int[20];
        System.out.print("Nhập số lượng phần tử của mảng");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        //nhap mang
        for (int i=0;i<length;i++){
            System.out.println("array[" + i +"]");
            array[i] = sc.nextInt();
        }
        System.out.print("Mảng bạn nhập vào là: \n");
        for (int i=length;i>0;i--){
            System.out.println("Arr["+(i-1)+"]= "+ array[i-1]   );
        }
    }
}
