public class Aluno{
  String nome;
  String curso;
  double mensalidade;
  int periodo;

  public Aluno (String nome, String curso, double mensalidade, int periodo){

    this.nome = nome;
    this.curso = curso;
    this.mensalidade = mensalidade;
    this.periodo = periodo;


  } 

  @Override
  
  public String toString(){
    String str = "nome: " + this.nome +"\t\tCurso: " + this.curso + "\n";
    str+="Mensalidade: " + this.mensalidade +"\tPeríodo: "+ "\n";

    return str;

  }

}