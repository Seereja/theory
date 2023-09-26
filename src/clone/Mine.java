package clone;

public class Mine {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fett django = new Fett();
        django.setGan("Бластер");
        Mandalorean mandalorean = new Mandalorean();
        mandalorean.setChest("Мандалорская броня");
        mandalorean.i = 10;
        django.mandalorean = mandalorean;
        Fett boba = django.clone();
        boba.setGan("Межгалактическая пушка");
        System.out.println(django.getGan());
        System.out.println(boba.getGan());
        boba.mandalorean.i = 1;
        System.out.println(django.mandalorean.i);
        System.out.println(boba.mandalorean.i);
        System.out.println(django.mandalorean.i);
        System.out.println(boba.mandalorean.getChest());
        System.out.println(django.mandalorean.getChest());


    }

}
