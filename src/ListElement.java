public class ListElement {
    private String s;
    private ListElement next;

    public ListElement(String s, ListElement next) {
        this.s = s;
        this.next = next;
    }

    public String getS() {
        return s;
    }

    public ListElement getNext() {
        return next;
    }
}
