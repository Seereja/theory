package weekSeven.task9.string;

public class task1 {
    public static void main(String[] args) {

        String myString = "MyString";


        int length = myString.length();

        char searchChar = 't';
        boolean haveChar = false;

        for (int i = 0; i < length; i++)
            if (myString.charAt(i) == searchChar)
                haveChar = true;
        System.out.println(haveChar);


        System.out.println(myString.indexOf(searchChar));
        System.out.println(myString.split(" "));
    }
}
