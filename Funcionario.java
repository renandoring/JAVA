class Funcionario{
    public static void main(String[] args) {
        //Invocando classe DadosFuncionario
        DadosFuncionario funcUm;
        funcUm = new DadosFuncionario();

        //Atribuindo valor ao meu funcUm
        funcUm.funcNome = "Teste";
        funcUm.funcSobrenome = "TeseSobrenome";
        funcUm.funcSalario = 2000;
        funcUm.funcDepto = "TI";
        funcUm.funcIdade = 22;

        //Invocando metodo aumentaIdade
        funcUm.aumentaIdade(1);

        //Invocando metodo demitir
        funcUm.funcTrabalha();

        //Metodo de Imprimir
        funcUm.imprimeTudo();
    }
}