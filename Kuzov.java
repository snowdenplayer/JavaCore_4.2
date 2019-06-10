public class Kuzov {
    public String kolor;
    public String type;



    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kuzov [kolor=" + kolor + ", type=" + type + "]";
    }

    public void setKuzova(String kolor,String type) {
        this.kolor = kolor;
        this.type = type;
    }







}