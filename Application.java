public class Application {
    public static void main(String[] args) {
        Car mersedes = new Car();

        Kuzov pikap = new Kuzov();
        pikap.setKuzova("red", "pikap");
        System.out.println("Color kuzova is " + pikap.getKolor());

        Koleso chrom = new Koleso();
        chrom.setcolorKolesa(19.5, "chrome");
        System.out.println("Color kolesa is " + chrom.getColor());

        Kermo leather = new Kermo();
        leather.setmaterialKerma(7.5, "leather");
        System.out.println("Diametr kerma is " + leather.getDiametr());


        mersedes.setKolesoiKermo(2.7, 4, pikap, chrom, leather);
        mersedes.setPower(3.5);
        System.out.println(mersedes.toString());

        Kuzov kabr = new Kuzov();
        kabr.setKuzova("black","kabr");
        Koleso grey = new Koleso();
        grey.setcolorKolesa(20.0,"grey");
        Kermo met = new Kermo();
        met.setmaterialKerma(12,"metal");
    Car bmw = new Car();
    bmw.setKolesoiKermo(4.0,2,kabr,grey,met);
        System.out.println(bmw.toString());



    }

}