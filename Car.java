public class Car {
    private double power;
    private int places;
    private Kermo kermo;
    private Koleso koleso;
    private Kuzov kuzov;


    public void setKolesoiKermo(double power,int places,Kuzov kuzov ,Koleso koleso,Kermo kermo) {
        this.power = power;
        this.places = places;
        this.kermo = kermo;
        this.koleso = koleso;
        this.kuzov = kuzov;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public int getPlaces() {
        return places;
    }
    public void setPlaces(int places) {
        this.places = places;
    }
    public Kermo getKermo() {
        return kermo;
    }
    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }
    public Koleso getKoleso() {
        return koleso;
    }
    public void setKoleso(Koleso koleso) {
        this.koleso = koleso;
    }
    public Kuzov getKuzov() {
        return kuzov;
    }
    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    @Override
    public String toString() {
        return "Car [power=" + power + ", places=" + places + ", kermo=" + kermo + ", koleso=" + koleso + ", kuzov="
                + kuzov + "]";
    }

    public void setpower(double power) {
        this.power = power;
    }



}