//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //odev4
        System.out.println(" sadece 3'e bolunebilen sayilar :");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + "");
                //%3 diyerek 3 e bolunenleri aldim %5! diyerek 5 e bolunenleri almadim.
            }
        }
        System.out.println("\n\n sadece 5'e bolunebilen sayilar: ");
        for (int s2=1 ; s2<=100; s2++){
            if (s2 % 5==0 && s2 % 3 !=0){
                System.out.println(s2+ "");
            }
        }
        System.out.println("\n\n Hem 3'e hem 5'e bolunebilen sayilar");
        for (int s3=1 ; s3 <=100; s3++){
            if(s3 % 3 ==0 && s3 % 5 ==0){
                System.out.println(s3+ "");
            }
        }
    }
}

