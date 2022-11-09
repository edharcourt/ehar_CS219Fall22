package Chap9ImmutableObjects;

public class Student {

    // private data cannot be accessed from outside of the class.
    private String first;
    private String last;
    private String id;

    private String nickname;

    public Student(String first_, String last_, String id_, String nickname_) {
        first = first_;
        last = last_;
        id = id_;
        nickname = nickname_;
    }

    public String toString() {
        return last + ", " + first + " (" + nickname + ")";
    }

}
