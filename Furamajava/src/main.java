import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
    Customer customer =new Customer(  );
    System.out.println( "nhap ten" );
    String Name = scanner.nextLine();
    customer.setName( Name );
    System.out.println( "nhap tuoi" );
    int Age = scanner.nextInt();
    customer.setAge( Age );
    System.out.println( "nhap so ngay" );
    int day = scanner.nextInt();
    System.out.println("Name"+"  "+customer.getName()+"  "+"Age"+"  "+customer.getAge()+"  "+"day"+"  "+customer.billPlease( day ) );

        Swimming swimming = new Swimming();

         swimming.setTime( "Thời gian mở cửa là 10h" );
         System.out.println( swimming.getTime() );
         System.out.println( "nhập giờ đến hồ bơi" );
         String time = scanner.nextLine();
         scanner.nextLine();

          System.out.println( swimming.businessBours( time ));
          System.out.println( "nhâp số tiền" );
       int Monye =   scanner.nextInt();

       swimming.CalculateTheDate( Monye );

       for(int i =1;i<6;i++){
           System.out.println( "vila" +i);
       }
       for(int i =1;i<3;i++){
           System.out.println( "house"+i );
       }
        ArrayList<Customer>list =new ArrayList<>(  );
       System.out.println( "nhập danh sách khác hàng" );
       int n = scanner.nextInt();
       for(int i =0;i<n;i++) {
           Customer customer1 = new Customer();
           System.out.println( "khác hàng thứ"+i );
           scanner.nextLine();


         System.out.println( "nhâp tên" );
         String nam = scanner.nextLine();

           customer1.setName( nam );
           System.out.println( "Nhập tuổi" );
           int age =scanner.nextInt();
           customer1.setAge( age );

           list.add( customer1 );


}
       System.out.println( "danh sách được in ra" );
               for(int i =0;i<list.size();i++){
        System.out.println( "khac hang"+"   "+i );
        System.out.println( list.get( i ).getName()+"  "+list.get( i ).getAge());
        }
        }

}
