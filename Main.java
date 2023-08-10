// life is a highway, I want to ride it all night long 🚗
class Main {
  public static void main(String[] args) {
    // criando carros
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    
    // criando propriedades dos carros
    carro1.ano = 1980;
    carro1.marca = "VW";
    carro1.modelo = "Fusca";
    carro1.cor = "Azul";
    carro2.ano = 2000;
    carro2.marca = "Ford";
    carro2.modelo = "Fiesta";
    carro2.cor = "Vermelho";
    
    // chamando métodos dos carros
    carro1.exibirModelo();
    carro1.exibirAnoECor();
    carro2.exibirModelo();
    carro2.exibirAnoECor();

    // CARRO EXTRA! BI BI 📢
    Carro meuCarro = carro1;

    meuCarro.exibirModelo();
    
  }
}