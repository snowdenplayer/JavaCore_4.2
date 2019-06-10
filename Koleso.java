public class Koleso {
    private double size;
    private String color;


    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Koleso [size=" + size + ", color=" + color + "]";
    }


    public void setcolorKolesa(double size ,String color) {
        this.size = size;
        this.color = color;
    }




}
