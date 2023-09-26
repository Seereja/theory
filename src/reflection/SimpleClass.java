package reflection;


import java.util.Date;

public class SimpleClass {

    private String string;
    private Integer integer;
    private Date date;

    public String publicString;
    public Integer publicInteger;
    public Date publicDate;

    @Override
    public String toString() {
        return "SimpleClass{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                ", date=" + date +
                ", publicString='" + publicString + '\'' +
                ", publicInteger=" + publicInteger +
                ", publicDate=" + publicDate +
                '}';
    }

    public SimpleClass() {

    }

    @Invoke
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    public SimpleClass(String string, Integer integer, Date date, String publicString, Integer publicInteger, Date publicDate) {
        this.string = string;
        this.integer = integer;
        this.date = date;
        this.publicString = publicString;
        this.publicInteger = publicInteger;
        this.publicDate = publicDate;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPublicString() {
        return publicString;
    }

    public void setPublicString(String publicString) {
        this.publicString = publicString;
    }

    public Integer getPublicInteger() {
        return publicInteger;
    }

    public void setPublicInteger(Integer publicInteger) {
        this.publicInteger = publicInteger;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }
}
