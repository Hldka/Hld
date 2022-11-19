package Hl.day1911practicetekrar;

public class Q09_practice {
    /*
    There is a lonely monkey in the island He needs to eat 4 bananas every day there are just 165 bananas 165 bananas
    in that island Create following variables and find how many days monkey can survive.Use do while loop, increment and decrement
    and if statements int numberofbananas=165, survivalDays=1;
    boolean mankeyAlive=true;
     */
    public static void main(String[] args) {
        int numberofbananas=165,survivalDays=1;

        boolean mankeyAlive=true;
        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberofbananas-=4;
            survivalDays++;
            if (numberofbananas<4){
                mankeyAlive=false;
                System.out.println("bugün "+survivalDays+".gi");
            }else System.out.println("bugün "+ survivalDays+"gün,maymun halen hayatta..:");
        }while (mankeyAlive);
        System.out.println("toplam yasdigi gun sayisi "+survivalDays);


    }
}
