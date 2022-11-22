package Hl.day2211.radyoproje.prj;

public class Lager {
    String name;
    String frequenz;

    public Lager(String name, String frequenz) {
        this.name = name;
        this.frequenz = frequenz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrequenz(String frequenz) {
        this.frequenz = frequenz;
    }

    public String getFrequenz() {
        return frequenz;
    }

    @Override
    public String toString() {
        return
                "ChannelName= " + name + '\'' +
                "Channelfrequenz= " + frequenz + '\'' ;
    }
}
