
public class Kermo {
    private double diametr;
    private String material;



    public double getDiametr() {
        return diametr;
    }
    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Kermo [diametr=" + diametr + ", material=" + material + "]";
    }



    public void setmaterialKerma(double diametr,String material) {
        this.diametr = diametr;
        this.material = material;
    }



}