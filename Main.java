class Main {
  public static void main(String[] args) {
    
  Aluno aluno0 = new Aluno("Rogerio", "ADM", 333.55, 2);
  Aluno aluno1 = new Aluno("Maria", "ADS", 290.55, 1);
  Aluno aluno2 = new Aluno("Rogerio", "LOG", 500.55, 2); 
    
    Aluno [] vetAluno = new Aluno [3];

    vetAluno[0] = aluno0;
    vetAluno[1] = aluno1;
    vetAluno[2] = aluno2;


    for (int i = 0; i < vetAluno.length; i++)
    System.out.println(vetAluno[i]);

  ContaBancaria pessoa1 = new ContaBancaria("Eliabe", "15", 522, false);
    

  }
}