public class BaiTap15 {
     public static void main(String [] agrs){       
        // Khai báo mảng
        int a[] = {5,10,7,1,6}; // -> mảng có 5 phần tử --> đánh chỉ số: 0,1,2,3,4

        for(int x : a){
            System.out.format("Giá trị là %d \n",x);
        }
        
        for(int x : a){
            x = 0;
        }

       System.out.println(a[0]);
       System.out.println(a[1]);
     }
}
