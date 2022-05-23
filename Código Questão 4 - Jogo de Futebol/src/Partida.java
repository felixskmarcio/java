package futebol;

public class Partida {
    
    private Jogador jogador1;
    private Jogador jogador2;
    private CampoFutebol campo;
    private double tempo;
    private boolean okJogador1;
    private boolean okJogador2;
    
    public Partida(){
       okJogador1 = false;
       okJogador2 = false;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public CampoFutebol getCampo() {
        return campo;
    }

    public void setCampo(CampoFutebol campo) {
        this.campo = campo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public boolean isOkJogador1() {
        return okJogador1;
    }

    public void setOkJogador1(boolean okJogador1) {
        this.okJogador1 = okJogador1;
    }

    public boolean isOkJogador2() {
        return okJogador2;
    }

    public void setOkJogador2(boolean okJogador2) {
        this.okJogador2 = okJogador2;
    }
    
    public void determinarTempoJogo(double tempo){
        this.tempo = tempo;
    }
    
}
