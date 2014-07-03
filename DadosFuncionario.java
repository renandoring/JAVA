class DadosFuncionario{
    //Propriedades da minha classe
    String funcNome;
    String funcSobrenome;
    String funcRg;
    String funcCpf;
    int funcIdade;
    String funcDepto;
    String funcDataEntrada;
    double funcSalario;
    boolean funcAtivo = false;
    double funcAumentoAnual;

    //Metodo aumenta idade em 1 ano
    public void aumentaIdade(int aumenta){
        int novaIdade = this.funcIdade + aumenta;
        this.funcIdade = novaIdade;
    }

    //Metodo aumentaSalario
    public double aumentaSalario(double valor){
        double novoSalario = this.funcSalario + valor;
        this.funcSalario = novoSalario;
        return funcSalario;
    }

    //Metodo funcAtivo ou Não
    public String funcTrabalha(){
        if(!funcAtivo){
            String recebeDemitido = "Funcionario desligado!";
            return recebeDemitido;
        } else {
            String recebeTrabalha = "Funcionario Ativo!" + "\nDepto:" + funcDepto;
            return recebeTrabalha;
        }
    }

    //Metodo recebimentoAnual
    public double aumentoAnual(){
        double valorAnual = this.funcSalario * 12;
        this.funcAumentoAnual = valorAnual;
        return funcAumentoAnual;
    }

    //Metodo imprimir
    public void imprimeTudo(){
        System.out.println("Idade: " + this.funcIdade + 
                           "\nSalario: " + funcSalario + 
                           "\nStatus: " + this.funcTrabalha() + 
                           "\nValor Anual: " + this.aumentoAnual()
                           );
    }
}