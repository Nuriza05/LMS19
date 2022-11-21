import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Days days = Days.valueOf(scanner.nextLine());
            if (days.equals(Days.Duishombu)) {
                System.out.println("Duishombu kunu java okuim.");
            }else if(days.equals(Days.Sheishembi)){
                System.out.println("Sheishembi kunu anglis tilin okuim.");
            } else if (days.equals(Days.Sharshembi)) {
                System.out.println("Sharshembi kunu practic kylam.");
            } else if (days.equals(Days.Beishembi)) {
                System.out.println("Beishembi kunu soft skills okuim.");
            }else if(days.equals(Days.Juma)){
                System.out.println("Juma kunu java okuim");
            }else if(days.equals(Days.Ishembi)){
                System.out.println("Ishembi kunu kampuska kelem!");
            }else if(days.equals(Days.Jekshembi)){
                System.out.println("Jekshembi kunu es alam!");
            }else{
                System.out.println("Myndai kun jok!");
            }


    }
}