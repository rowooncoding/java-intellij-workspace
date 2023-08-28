package oop;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerPrograming = new Book(1000);
        Book effectiveJava = new Book(1000);
        Book cleanCode = new Book(1000);

        artOfComputerPrograming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

    }

}
