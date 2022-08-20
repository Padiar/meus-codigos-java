public class GerenciamentodeCarro {
    //metodo main - inicializar o programa
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "FFF-0000";
        carro.marca = "C3";
        carro.modelo = "Citroem";
        carro.cor = "Branco";
        carro.valor = 30000.00;

        carro.mostrardados();
    }
}