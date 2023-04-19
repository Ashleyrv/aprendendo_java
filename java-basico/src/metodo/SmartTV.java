package metodo;

public class SmartTV {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;  
    
    public void aumentarVolume(){
        volume++;
        System.out.println(volume);
    }

    public void diminuirVolume(){    //metodo para diminuir o volume
        volume --;
        System.out.println("Diminuindo para: "+volume);      //imprime o novo volume
    }

    public void ligar(){  // metodo para ligar a tv
        ligado=true;
    }

    public void desligar(){ // metodo para desligar a tv
        ligado = false;
    }

    public void mudarCanal(int novoCanal){  //metodo para colocar o canal que deseja
        canal = novoCanal;
    }

    public void aumentarCanal(){  //metodo para aumentar o canal
        canal++;
    }

    public void diminuirCanal(){  //metodo para diminuir o canal
        canal--;
    }
}


