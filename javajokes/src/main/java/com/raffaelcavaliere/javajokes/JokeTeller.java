package com.raffaelcavaliere.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class JokeTeller {

    private ArrayList jokes = new ArrayList();

    public JokeTeller() {
        jokes.add("CSS Joke of the day :\n\n#wife {\n\tright: 100%;\n\tmargin: 0;\n}");
        jokes.add("CSS Joke of the day :\n\n#push-up-bra {\n\tmargin-top: -25%;\n\toverflow: visible;\n}");
        jokes.add("CSS Joke of the day :\n\n#ninja {\n\tcolor: black;\n\tvisibility: hidden;\n\tanimation-duration: 0.00001s;\n}");
        jokes.add("CSS Joke of the day :\n\n.ghost {\n\tcolor: white;\n\topacity: 0.1;\n}");
        jokes.add("CSS Joke of the day :\n\n.ikea {\n\tdisplay: table;\n}");
        jokes.add("CSS Joke of the day :\n\n.lego {\n\tdisplay: block;\n}");
        jokes.add("CSS Joke of the day :\n\n#tower-of-pisa {\n\tfont-style: italic;\n}");
    }

    public String getJoke() {

        Random r = new Random();
        return jokes.get(r.nextInt(7)).toString();
    }
}
