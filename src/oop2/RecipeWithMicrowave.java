package oop2;

public class RecipeWithMicrowave extends AbstractReceipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on microwave");

    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put it in the microwave");

    }

    @Override
    void cleanUp() {
        System.out.println("clean up the utensils");
        System.out.println("Switch off microwave");

    }
}
