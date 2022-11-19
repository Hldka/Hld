package Hl.day1911practicetekrar.OOP.restorant;

public class Mutfak {
   public String yemekler="Adanakebap, urfaciger,kusbasi,kusleme";
   public String araSicak="yaylacorbasi, mercimek,duguncorba,corbe";
   public String tatlilar="baklava, sutlac,güllac,kazandibi";
   public String icecekler="ayran, salgam,kola";

   public Mutfak(String adanakebap, String mercimek, String sutlac, String ayran) {
      this.yemekler=adanakebap;
      this.araSicak=mercimek;
      this.tatlilar=sutlac;
      this.icecekler=ayran;
   }
public Mutfak(){}
   @Override
   public String toString() {
      return "Mutfak{" +
              "yemekler='" + yemekler + '\'' +
              ", \n araSicak='" + araSicak + '\'' +
              ", \n tatlilar='" + tatlilar + '\'' +
              ",\n  icecekler='" + icecekler + '\'' +
              '}';
   }
}
