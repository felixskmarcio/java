package futebol;

import java.util.ArrayList;

public class Jogo {
   
    private Partida partida;
    private ArrayList<Time> times;
    private String status;
    
    public Jogo(){
      times = new ArrayList();  
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void iniciarJogo(){
        //IMPLEMENTAÇÃO AQUI
    }
    
    
}
