 public class Funcionario {
    private String nomeFuncioanrio;
    private int id;
    private int nFuncionario;

    public Funcionario(String nomeFuncioanrio, String id) {
        this.nomeFuncioanrio = nomeFuncioanrio;
        this.id = ++nFuncionario;
    }

    public String getNomeFuncioanrio(Funcionario f) {
        if (nomeFuncioanrio == null) {
            f.add(new Funcionario(null, null));
        }
        return nomeFuncioanrio;
    }

    public void setNomeFuncioanrio(String nomeFuncioanrio) {
        this.nomeFuncioanrio = nomeFuncioanrio;       
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        for(int i = 0;i<id;i++)
        {if (id == i) {
            this.id = ++id;
            } else if (this.id == i) {
            this.id = id;
            }
        }
    }

    public void add(Funcionario funcionario) {
    }  
     
}


