package reflection;

public class Test2 {
    //1 вариант
    // getName()
    //полное имя класса

    // getSimpleName
    //короткое без пакетов

    // 3 getPackage().getName()
    // получить только имя пакета

    public static void main(String[] args) {
        printNameForClass(int.class, "int.class (primitive)");
        printNameForClass(String.class, "String.class");
        printNameForClass(java.util.HashSet.class, "java.util.HashSet.class");


    }

    public static void printNameForClass(Class<?> cls, String label) {

        System.out.println(label + ": ");
        System.out.println("getName():\t\t\t\t\t\t\t\t\t\t" + cls.getName());
        //каноническое имя - это имя, которое будет использоваться в операторе импорта
        System.out.println("getCanonicalName():\t\t\t\t\t\t\t\t\t\t" + cls.getCanonicalName());
        System.out.println("getSimpleName():\t\t\t\t\t\t\t\t\t\t" + cls.getSimpleName());
        System.out.println("getPackageName():\t\t\t\t\t\t\t\t\t\t" + cls.getPackageName());
        System.out.println("getTypeName():\t\t\t\t\t\t\t\t\t\t" + cls.getTypeName());
        System.out.println();
    }

}
