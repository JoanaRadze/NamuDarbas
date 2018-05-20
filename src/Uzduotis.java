import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaičius ir ženklą tarp jų(kaip PVZ: 2 + 2) ");
        String gautiSkaicius= scanner.nextLine();
        String[] isdalinam = gautiSkaicius.split(" ");

        if(isdalinam.length == 3) {
            double suma;
            double skirtumas;
            double pirmas = gautiSkaiciu(isdalinam[0], scanner, "Įveskite pirmą skaičių");
            double antras = gautiSkaiciu(isdalinam[2], scanner, "Įveskite antrajį skaičių");
            if (antras != 0) {

                switch (isdalinam[1]) {
                    case "+":
                        suma = pirmas + antras;
                        System.out.println(suma);
                        break;
                    case "-":
                        skirtumas = pirmas - antras;
                        System.out.println(skirtumas);
                        break;
                    default:
                        System.out.println("Iveskite tinkmą ženklą");
                }
            } else {
                System.out.println("Klaidingai įvedėte, pakartokite");
            }
        }else{
            System.out.println("Antras skaičius negali būti = 0");
        }
    }
    private static double gautiSkaiciu(String skaicius, Scanner scanner, String tekstas){
        double result;
        try{
                result = Double.parseDouble(skaicius);
            }catch (InputMismatchException e){
            while (true) {
                System.out.println("Iveskite skaičių: ");
                try{
                    result = scanner.nextDouble();
                    break;
                }catch (InputMismatchException f){
                    System.out.println("Kartokite");
                    scanner.nextDouble();
                }
            }
        }
        return result;
    }
}
