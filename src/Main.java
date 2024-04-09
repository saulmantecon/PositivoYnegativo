import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double sumaP = 0;
        double sumaN = 0;
        ArrayList<Double> Positivos = new ArrayList<Double>();
        ArrayList<Double> Negativos = new ArrayList<Double>();

        num = sc.nextDouble();

        while (num != 0) {

            if (num > 0) {
                Positivos.add(num);
                sumaP += num;
            } else {
                Negativos.add(num);
                sumaN += num;
            }
            num = sc.nextDouble();
        }

        for (double elemento : Positivos) {
            System.out.print(elemento + " / ");

        }
        System.out.println();//salto de linea

        for (double elemento : Negativos) {
            System.out.print(elemento + " / ");

        }

        System.out.println(" \n la suma de numeros psoitivos es: " + sumaP);
        System.out.println("la suma de numeros negativos es: " + sumaN);

        Iterator<Double> IteratorPositivos = Positivos.iterator();

        while (IteratorPositivos.hasNext()){
            double numpos = IteratorPositivos.next();
            if (numpos>10){
                IteratorPositivos.remove();
            }

        }
        Iterator<Double> IteratorNegativos = Negativos.iterator();

        while (IteratorNegativos.hasNext()){
            double numneg = IteratorNegativos.next();
            if (numneg<-10){
                IteratorNegativos.remove();
            }
        }

        System.out.println("Despues de borrar: \n");
        for (double elemento : Positivos) {
            System.out.print(elemento + " / ");

        }
        System.out.println();

        for (double elemento : Negativos) {
            System.out.print(elemento + " / ");

        }



    }
}