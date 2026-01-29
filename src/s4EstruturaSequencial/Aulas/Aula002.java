package s4EstruturaSequencial.Aulas;

public class Aula002 {
    public static void main(String[] args) {
        //EXEMPLO 01
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);
        //EXEMPLO 02
        int k;
        double l;
        k = 5;
        l = 2 * k;
        System.out.println(k);
        System.out.println(l);

        //EXEMPLO 3
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //EXEMPLO 4
        int n, m;
        double resultado;
        n = 5;
        m = 2;
        resultado = n / m;
        // UTILIZANDO CASTING
        resultado = (double) n / m;
        System.out.println(resultado);


        //EXEMPLO 5
        double q;
        int p;
        // NAO é ACEITO = p = 5.0;
       // q = p;
        System.out.println(b);
    }
}
