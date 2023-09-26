package weekSeven.task6;

public class TomasEdisonPhone extends AbstractPhone {

    public TomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }
}
