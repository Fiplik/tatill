import  java.util.Scanner;
public class tatil {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Hava Durumunuz: ");
        double hava= input.nextDouble();
        if(hava<5){
            System.out.println("Sizin İçin Uygun etkinlik: KAYAK ");
        }
        else if(hava<=5 || hava<15){
            System.out.print("Sizin İçin Uygun etkinlik: SİNEMA");
        } else if(hava<=15 || hava<25){
                System.out.print("Sizin İçin Uygun etkinlik: PİKNİK");
            }else{
                System.out.print("Sizin İçin Uygun etkinlik: YÜZMEK");
            }
    }
}
//Fiplik