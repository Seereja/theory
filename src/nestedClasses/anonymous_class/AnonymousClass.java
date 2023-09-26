package nestedClasses.anonymous_class;

public class AnonymousClass {
    //анонимный класс может обращаться ко всем полям обрамляющего его класса - даже к private.
    // в анонимном классе сздается экземпляр и обращение идет через него.
    private int c = 10;

    public static void main(String[] args) {
//какой то класс (анонимный) импелементирует интерфейс MyMath
        MyMath myMath = new MyMath() {
            AnonymousClass ac = new AnonymousClass();

            @Override
            public int doOperation(int a, int b) {
                return a + b + ac.c;
            }
        };
        MyMath myMath2 = new MyMath() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(myMath.doOperation(3, 4));
        System.out.println(myMath2.doOperation(3, 4));


        MyMath2 math2 = new MyMath2() {
            @Override
            int doOperation(int a, int b) {
                return b / a;
            }
        };
        System.out.println(math2.doOperation(10, 2));


        MyMath2 math1 = new MyMath2() {
            @Override
            int doOperation(int a, int b) {
                return a - b;
            }
        };
        System.out.println(math1.doOperation(66, 13));
    }
}
