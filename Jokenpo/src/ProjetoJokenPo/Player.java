package ProjetoJokenPo;

public class Player {
    // atributos
    private String nome;
 private Integer score;

    //Construtor
    public Player(String nome) {
        this.nome = nome;
        this.score = 0;
    }
    public  void incrementeScore(){
        setScore(getScore()+1);
    }

    public String getNome() {
        return nome;
    }

    public Integer getScore() {
        return score;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
