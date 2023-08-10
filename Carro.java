class Carro {
  int ano;
  String marca;
  String modelo;
  String cor;

  public void exibirModelo() {
    System.out.println("O modelo do carro é: " + modelo);
  }
  public void exibirAnoECor() {
    System.out.println("O ano do carro é " + ano + ", enquanto a cor é " + cor);
  }
}