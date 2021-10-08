class Main {
  public static void main(String[] args) {
    
  Aluno aluno0 = new Aluno("Rogerio", "ADM", 333.55, 2);
  Aluno aluno1 = new Aluno("Maria", "ADS", 290.55, 1);
  Aluno aluno2 = new Aluno("Roberto Carlos Assis", "LOG", 500.55, 2); 
    
    Aluno [] vetAluno = new Aluno [3];

    vetAluno[0] = aluno0;
    vetAluno[1] = aluno1;
    vetAluno[2] = aluno2;


    for (int i = 0; i < vetAluno.length; i++)
    System.out.println(vetAluno[i]);

  ContaBancaria cliente1 = new ContaBancaria("Eliabe", "15", 522, false);
  ContaBancaria cliente2 = new ContaBancaria("Ana", "2765", 25.000, true);
  ContaBancaria cliente3 = new ContaBancaria("Silas", "29", 35.500, false);
    

    ContaBancaria [] vetCliente = new ContaBancaria [3];

    vetCliente[0] = cliente1;
    vetCliente[1] = cliente2;
    vetCliente[2] = cliente3;


    for (int e = 0; e < vetCliente.length; e++)
    System.out.println(vetCliente[e]);



  }
}