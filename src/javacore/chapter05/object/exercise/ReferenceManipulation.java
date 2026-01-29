package javacore.chapter05.object.exercise;

public class ReferenceManipulation {

    String name;
    int counter;

    public static void main (String[] args) {

        ReferenceManipulation reference1 = new ReferenceManipulation("reference1");
        reference1.displayReferenceName();

        ReferenceManipulation copy1 = reference1;

        copy1.displayReferenceName();
        updateCounter(reference1);
        reference1.displayReferenceName();
        copy1.displayReferenceName();
        updateCounter(copy1);
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        copy1 = new ReferenceManipulation("reference2");
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        reference1 = new ReferenceManipulation("reference1");
        reference1.displayReferenceName();
    }

    public ReferenceManipulation (String name) {
        this.name = name;
        this.counter = 0;
    }

    public void displayReferenceName() {
        System.out.println("Reference name : " + this.name + " (counter : " + this.counter + ")");
    }

    public static void updateCounter(ReferenceManipulation object) {
        object.counter++;
    }
}
