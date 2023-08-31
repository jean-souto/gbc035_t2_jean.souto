import java.util.Scanner;
public class ex2 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        figurinhas2 a = new figurinhas2();
        figurinhas2 b = new figurinhas2();
        figurinhas2 c = new figurinhas2();

        a.novo(("Joao"),("corredor"),("13/10"),("Brasil"),(80),(180));
        a.mostrar(a);

        b.novo(("Caio"),("andarilho"),("18/02"),("Brasil"),(80),(180));
        b.mostrar(b);

        c.novo(("Pedro"),("doido"),("13/10"),("Brasil"),(80),(180));
        c.mostrar(c);
    }

}
