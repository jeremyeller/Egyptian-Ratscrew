public class Main {

    Scanner letter = new Scanner(System.in);
    char go = letter.nextChar();

if (go == 'm') {

        Card c1 = new Card();
        counterP1--;
    }

else {
        gameOver();
    }

if (c1PV == 0) {
        Card r1 = new Card;
        counterP2--;
    }

else if (c1PV == 1) {
        jackMethod();
    }

else if (c1PV == 2) {
        queenMethod();
    }

else if (c1PV == 3) {

        kingMethod();
    }

else if (c1PV == 4) {
        aceMethod();
    }

else {
        gameOver();
    }

public void jackMethod() { }

public void queenMethod() { }

public void kingMethod() { }

public void aceMethod() { }


}
