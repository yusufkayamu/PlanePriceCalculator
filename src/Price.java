import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        int age, distance, travel;
        double per = 0.1;


        Scanner input = new Scanner(System.in);

        System.out.print("Distance (km)=");
        distance = input.nextInt();

        System.out.println("Normal Price =" + (distance * per) + "$");

        System.out.print("Age=");
        age = input.nextInt();

        System.out.println("Travel Type \n1-One way= \n2-Round Trip=");
        travel = input.nextInt();

        double np = (distance * per), child= np*0.5, teen= np*0.1,old= np*0.3, rp=np*0.2;

        if (travel < 0 || travel > 2 || age < 0 || distance < 0) {
            System.out.println("Please check the information that you provided");
        }else {

            if (age < 12 && travel == 1) {
                System.out.println("Discounted Price=" + (np - (np * child)) + "$");
            }else if (age < 12 && travel == 2) {
                System.out.println("Discounted Price" + (np - (np * child) - (np * rp)));
            }else if (age >= 12 && age < 25 && travel == 1) {
                System.out.println("Discounted Price" + (np - (np * teen)) + "$");
            } else if (age >= 12 && age < 25 && travel == 2){
                System.out.println("Discounted Price" + (np - (np * teen) - (np * rp)) + "$");
            }else if (age >= 65 && travel==1) {
                System.out.println("Discounted Price" + (np - (np * old)) + "$");
            }else {
                System.out.println("Discounted Price" + (np - (np * old) - (np * rp)) + "$");
            }

        }
    }
}
