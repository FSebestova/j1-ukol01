package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu


        /*
        //Část 1
        NakresliPrase(zofka);

        //Část 2
        zofka.penUp();
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

        Osmisten(zofka);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        UdelejKruh(zofka);

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        NakresliSlunce(zofka);


*/
        //Část 3
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(350);
        zofka.turnRight(180);
        zofka.penDown();

        NakresliPrase(zofka);

        zofka.penUp();
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        NakresliDomek(zofka);

        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        NakresliDomek(zofka);

        presun1(zofka);

        NakresliDomek(zofka);

        presun1(zofka);

        NakresliDomek(zofka);

        presun1(zofka);

        NakresliDomek(zofka);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        NakresliDomek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(750);
        zofka.turnRight(90);
        zofka.move(500);

        NakresliSlunce(zofka);

        //Část 4

        zofka.turnRight(90);
        zofka.move(800);
        zofka.turnLeft(180);



        nakresliF(zofka);

        nakresliA(zofka);

        nakresliN(zofka);

        nakresliN(zofka);

        nakresliY(zofka);

    }

    private static void nakresliY(Turtle zofka) {
        zofka.penDown();
        zofka.move(60);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(30);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(55);
        zofka.turnLeft(90);
    }

    private static void nakresliN(Turtle zofka) {
        zofka.penDown();
        zofka.move(110);
        zofka.turnRight(150);
        zofka.move(130);
        zofka.turnLeft(150);
        zofka.move(110);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.move(55);
        zofka.turnLeft(90);
    }

    private static void nakresliA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(120);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(55);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(55);
        zofka.turnRight(60);
        zofka.penDown();
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(55);
        zofka.turnLeft(90);
    }

    private static void nakresliF(Turtle zofka) {
        zofka.penDown();
        zofka.move(110);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
    }

    private static void presun1(Turtle zofka) {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private static void NakresliDomek(Turtle zofka) {
        zofka.turnRight(30);
        zofka.move(100);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(100);
        }
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(90);
            zofka.move(100);

        }
    }

    private static void NakresliPrase(Turtle zofka) {
        zofka.turnLeft(90);
        NakresliTrojukelnik(zofka);

        NohyPrase(zofka);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        NohyPrase(zofka);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(200);
    }

    private static void NakresliSlunce(Turtle zofka) {
        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(30);
            zofka.penDown();
            zofka.turnLeft(90);
            for (int j = 0; j < 6; j++) {
                zofka.move(3);
                zofka.turnRight(5);
            }
        }
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
    }


    private static void UdelejKruh(Turtle zofka) {
        for (int k = 0; k < 72; k++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }

    private static void Osmisten(Turtle zofka) {
        for (int d = 0; d < 8 ; d++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }

    private static void NohyPrase(Turtle zofka) {
        zofka.turnLeft(30);
        zofka.move(30);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(120);
        zofka.penDown();
        zofka.move(30);
    }


    private static void NakresliTrojukelnik(Turtle zofka) {
        zofka.turnRight(30);
        zofka.move(100);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(100);
        }

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
