public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double ValorSolicitado = 22.0;

        if (ValorSolicitado < saldo){
            saldo = saldo - ValorSolicitado;
        System.out.println("Novo Saldo: " + saldo);


    }
        else
            System.out.println("Saldo insuficiente");

            System.out.println(saldo);


    }
}
