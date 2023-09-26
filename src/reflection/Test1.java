package reflection;

import reflection.menu.Dish;

public class Test1 {


    public static void main(String[] args) {

        //1 сопсоб - через класс .class
        // класс нужно обернуть в скобки
        Class<Dish> dish = Dish.class;
        System.out.println(dish);

        //2 способ
        String string = "my String";
        Class<? extends String> c2 = string.getClass();
        System.out.println(c2);

        //3 способ
        try {
            Class<?> classInteger = Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
