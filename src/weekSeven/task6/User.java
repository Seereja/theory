package weekSeven.task6;

public class User {
    private String name;
    public User(String name) {
        this.name = name;
    }

//Отсюда следует ключевая особенность полиморфизма - использование объекта производного класса,
// вместо объекта базового
// (потомки могут изменять родительское поведение,
// даже если обращение к ним будет производиться по ссылке родительского типа).
    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }
}
