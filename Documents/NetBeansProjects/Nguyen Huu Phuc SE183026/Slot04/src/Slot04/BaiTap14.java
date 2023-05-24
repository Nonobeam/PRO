/**
 * Array:
 * 1. Khai báo mảng số nguyên
 * 2. Duyệt mảng: Xuất các phần tử trong mảng
 * 3. Thay đổi các phần tử có giá trị lẻ thành số zero
 * 4. Xuất lại các phần từ trong mảng để kiểm tra
 * @author hunagroup
 */
public class BaiTap14 {
    public static void main(String [] agrs){
        int a[] = {5,10,7,1,6}; 

        int x = a[2];
        System.out.format("Giá trị x = %d \n", x);
        
        a[1] = 100;
        System.out.format("Giá trị tại chỉ số 1 là %d \n", a[1]);
        
        System.out.format("Số phần tử trong mảng %d \n", a.length);
        
        for(int i = 0; i < a.length ; i++){
            System.out.format("Phần tử tại chỉ số %d có giá trị là %d \n",i,a[i]);
        }
        
        for(int i = 0; i < a.length ; i++){
            if(a[i]%2 == 1){
                a[i] = 0;
            }
        } 
        
        System.out.println("\n");
        
        for(int i = 0; i < a.length ; i++){
            System.out.format("Phần tử tại chỉ số %d có giá trị là %d \n",i,a[i]);
        }
    }
}
