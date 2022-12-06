import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        ListElement liste = new ListElement("a", new ListElement("b", new ListElement("c", null)));
        System.out.println(liste.getNext().getNext().getNext().getS());
    }
}