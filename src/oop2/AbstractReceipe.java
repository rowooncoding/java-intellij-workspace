package oop2;

public class AbstractReceipe {public void execute() {
    getReady();
    doTheDish();
    cleanUp();
}

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanUp();
}
