package exceptionTask;

public class TestDogWalk {
    public static void main(String[] args) throws ExceptionWalkDog {

        Dog dog = new Dog("Тайсон");


        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (ExceptionWalkDog e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPut + "\r\n Поводок надет? "
                    + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePut);
        }

    }
}
