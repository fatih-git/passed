import java.util.Scanner;

/**
 * @author fatih-git
 */

public class Passed {

    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat=input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
        }

        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fiz=input.nextInt();
        if(fiz<0 || fiz>100){
            fiz=0;
        }

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        tur=input.nextInt();
        if(tur<0 || tur>100){
            tur=0;
        }

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kim=input.nextInt();
        if(kim<0 || kim>100){
            kim=0;
        }

        System.out.print("Lütfen müzik notunuzu giriniz: ");
        muz=input.nextInt();
        if(muz<0 || muz>100){
            muz=0;
        }

        double avg=(mat+fiz+kim+tur+muz)/5;

        if(avg>=55){
            System.out.println("Sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız");
        }

        System.out.println("Ortalamanız: "+avg);

    }

}
