package weekSeven.task8;

abstract class MeansOfTransportation {

    int age;
    String name;

    public MeansOfTransportation(int age, String name) {
        this.age = age;
        this.name = name;
    }


    void ring(String name) {

    }

    public void drive(String name) {
        System.out.println("вы поехали " + name);
    }

    public void slowDown(String name) {
        System.out.println("вы затормозили " + name);
    }
}
