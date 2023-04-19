package metodo;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV(); //cria um novo objeto

        smartTV.diminuirVolume(); // chama o metodo de diminuir 
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();// chama o metodo de aumentar

        System.out.println("O canal atual: "+smartTV.canal);

        smartTV.mudarCanal(10);
        System.out.println("novo canal: "+smartTV.canal);

        System.out.println("A TV está ligada? "+smartTV.ligado);
        System.out.println("O volume atual:  "+smartTV.volume);

        smartTV.ligar();
        System.out.println("Nove status -> a TV está ligada? "+smartTV.ligado);

        smartTV.desligar();
        System.out.println("Novo status -> TV está ligada? "+smartTV.ligado);
    }
}
