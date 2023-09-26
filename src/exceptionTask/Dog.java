package exceptionTask;

public class Dog {

    String name;
    boolean isCollarPut;
    boolean isMuzzlePut;
    boolean isLeashPutOn;

    public Dog(String name) {
        this.name = name;

    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPut = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isMuzzlePut = true;
    }


    public void putLeash() {
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }


    public void walk() throws ExceptionWalkDog {
        System.out.println("Песель готов идти на прогулку");
        if (isMuzzlePut && isLeashPutOn && isCollarPut) {
            System.out.println("Ура " + name + " идем гулять!!!");
        } else {
            throw new ExceptionWalkDog(name + " не готов идти гулять!" + "Проверьте снаряжение");
        }


    }

}