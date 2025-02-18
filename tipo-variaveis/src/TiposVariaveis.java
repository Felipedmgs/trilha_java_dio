public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String nome = "Felipe", rs;
        
        int a, b, c;
        a=1;
        b=1;
        c=1;

        System.out.println("Hello, World!");
        System.out.println(a + b + nome + c);
        System.out.println(++a);

        //ternario
        rs = a == b ? "true" : "false";
        System.out.println(rs);

        ///operadores
        boolean sn = a == b;
        sn = a > b;
        //sn = a < b;
        System.out.println("Numeros são iguais? " + sn);

        System.out.println("Var são iguais? " + nome.equals(rs));

        if(a==b){
            System.out.println("as duas var são iguais");
        }

        //sintaxe - metodos

        




    }
}

