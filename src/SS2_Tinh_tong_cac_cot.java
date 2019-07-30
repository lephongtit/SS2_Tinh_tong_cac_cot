import java.util.Scanner;
public class SS2_Tinh_tong_cac_cot {
    public static void main(String[] args) {
        int sum=0;
        Scanner sr = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int hang = sr.nextInt();
        System.out.print("Nhâp số cột: ");
        int cot = sr.nextInt();
        int[][] arr = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tủ arr[" + i + "][" + j + "]= ");
                arr[i][j] = sr.nextInt();
            }
        }
        System.out.println("Ta có mảng hai chiều là:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int x=sr.nextInt();
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                if (j==x){
                    sum+= arr[i][x];
                }
            }
        }
        System.out.println("Tổng phần tử ở cột "+x+" = "+sum);
    }
}
