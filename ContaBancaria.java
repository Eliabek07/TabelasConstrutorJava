public class ContaBancaria{
  String nome;
  String numero;
  double saldo;
  boolean estado;

  public ContaBancaria(String nome, String numero, double saldo, boolean estado){

    this.nome = nome;
    this.numero = numero;
    this.saldo = saldo;
    this.estado = estado;


  } 

  @Override
  
  public String toString(){
    String str = "nome: " + this.nome +"\t\tNúmero: " + this.numero + "\n";
    str+="Saldo: " + this.saldo +"\tEstado: "+ this.estado +"\n";

    return str;

  }
}