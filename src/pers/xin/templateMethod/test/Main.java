package pers.xin.templateMethod.test;

import pers.xin.templateMethod.CharDisplay;
import pers.xin.templateMethod.StirngDisplay;
import pers.xin.templateMethod.abs.AbstractDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay1 = new CharDisplay('h');
        AbstractDisplay abstractDisplay2 = new StirngDisplay("Hello, world!");
        abstractDisplay1.display();
        abstractDisplay2.display();
    }
}
