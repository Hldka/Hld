package Hl.day2211.radyoproje.prj;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    static Scanner scan=new Scanner(System.in);
    static int entgegen= 0;
    static ArrayList<Lager> channelList= new ArrayList<>();

    public static  void eingang() throws InterruptedException {

        String eingang1="\n"+"*******************************+ZUG FM*******************\n"+
                "1  : BENUTZER EINGANG \n"+
                "2 :   MANAGER EINGANG \n"+
                "3:  AUSGANG ";
        System.out.println(eingang1);

        entgegen=scan.nextInt();
        switch (entgegen){
            case 1:
                break;
            case 2: manager();
                break;
            case 3:ausgang();
                break;
        }


    }

    private static void manager() throws InterruptedException {
        String manager="\n"+"1: ADD CHANNEL"+
                "2: CHANNEL  LIST"+
                "3 : LÖSCHEN CHANNEL"+
                "4: HAUPT MENU"+
                "5: AUSGANG";
        System.out.println(manager);
        entgegen=scan.nextInt();
        switch (entgegen){
            case 1: addChannel();
            sollWeiter();
            manager();
            break;
            case 2: aussihtChanneleList();
                System.out.println("ES WIRD HAUPTMENU  GEHT....");
                Thread.sleep(3000);
                manager();
                break;
            case 3:löschCHannel();
                System.out.println("ES WIRD HAUPTMENU  GEHT....");
                Thread.sleep(3000);
                manager();
            break;
            case 4:
                manager();
            break;
            case 5:
                ausgang();
        }
    }

    public static void ausgang() {
        System.out.println("Tschüss bis nächtesmal...");    }

    private static void löschCHannel() {
        if (channelList.isEmpty()){
            System.out.println("ES GIbt keine CHANNEL");
            System.out.println();
        }else System.out.println("Welche Channel wollen Sie loschen");
        System.out.println(channelList);
        System.out.println("welchen Channel wollen Sie löschen");
        String lösch=scan.nextLine();
        for (Lager w:channelList
             ) {if (w.getName().equalsIgnoreCase(lösch)){ channelList.remove(w);

        }

        }

    }

    private static void aussihtChanneleList() {
        for (Lager w:channelList) {
            System.out.println(w);
            
        }
    }

    public static void addChannel() {
        scan.nextLine();
        System.out.println("Welche Channel wollen Sie hinzufugen...");
        String name=scan.nextLine();
        System.out.println("Welche Frequenz wollen Sie hinzufügen....");
        String frequenz= scan.nextLine();
        Lager addChannel=new Lager(name,frequenz);
        channelList.add(addChannel);
    }public static boolean sollWeiter(){
        boolean sollWeiter=false;
        System.out.println("Wollen Sie neue CHannele hinzufügen\n"+"Wahlen Sie  Ja oder Nein ");

        String entgegen= scan.next().toLowerCase();
        while (entgegen.equalsIgnoreCase("ja")){ System.out.println("Wollen Sie neue CHannele hinzufügen\n"+"Wahlen Sie  Ja oder Nein ");
entgegen=scan.next();
        }
        return sollWeiter;
    }
}
