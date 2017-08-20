package listaDeAlunos;

/**
 * Classe aluno, guarda todos os atributos de um aluno (nome e RA)
 * @author Clederson Cruz
 */
public class Aluno {
    private String nome;
    private int ra;

    /**
     * Construtor da classe
     */
    public Aluno() {
        super();
    }

    /**
     * Método para retornar o nome do aluno
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para retornar o RA do aluno
     * @return ra do aluno
     */
    public int getRa() {
        return ra;
    }

    /**
     * Método para renomear o aluno
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para renomear o RA do aluno
     * @param ra 
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * Método para retornar os dados do aluno
     * @return dados do aluno (String)
     */
    @Override
    public String toString() {
        return String.format("Aluno %s; RA %d", nome, ra);
    }
    
}
