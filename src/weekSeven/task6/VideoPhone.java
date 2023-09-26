package weekSeven.task6;

public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вы закончили видео связь с номером " + inputNumber);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вы звоните по видео связи " + outputNumber);
    }
}
