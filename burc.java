import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        Scanner letter = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz:");
        month = letter.nextInt();
        System.out.println("doğduğunuz günü giriniz:");
        day = letter.nextInt();

        if (month == 1 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("oğlak");
            } else {
                System.out.println("kova");
            }


        } else {
            isError = true;
        }

        if (month == 2 && (day >= 1 && day <= 28)) {
            if (day < 20) {
                System.out.println("kova");
            } else {
                System.out.println("balık");
            }

        } else {
            isError = true;
        }


        if (month == 3 && (day >= 1 && day <= 31)) {
            if (day < 21) {
                System.out.println("balık");
            } else {
                System.out.println("koç");
            }

        } else {
            isError = true;
            System.out.println("gecersiz bir gün girdinz");
        }
        if (month == 4 && (day >= 1 && day <= 30)) {
            if (day < 22) {
                System.out.println("koç");
            } else {
                System.out.println("boğa");
            }

        } else {
            isError = true;
        }
        if (month == 5 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("boğa");
            } else {
                System.out.println("ikizler");
            }

        } else {
            isError = true;
        }
        if (month == 6 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("ikizler");
            } else {
                System.out.println("yengeç");
            }


        } else {
            isError = true;
        }
        if (month == 7 && (day >= 1 && day <= 30)) {
            if (day < 22) {
                System.out.println("yengeç");
            } else {
                System.out.println("aslan");
            }


        } else {
            isError = true;
        }
        if (month == 8 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("aslan");
            } else {
                System.out.println("başak");
            }


        } else {
            isError = true;
            ;
        }
        if (month == 9 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("başak");
            } else {
                System.out.println("terazi");
            }


        } else {
            isError = true;
        }

        if (month == 10 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("terazi");
            } else {
                System.out.println("akrep");
            }

        } else {
            isError = true;
            ;
        }

        if (month == 11 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("akrep");
            } else {
                System.out.println("yay");
            }


        } else {
            isError = true;

        }
        if (month == 12 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("yay");
            } else {
                System.out.println("oğlak");
            }


        } else {
            isError = true;
        }



    }


}

/*
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
 */



