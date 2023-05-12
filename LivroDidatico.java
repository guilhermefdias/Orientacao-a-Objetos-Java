public class LivroDidatico extends Livro {
  private String disciplina;
  
  public LivroDidatico(String titulo, String autor, int numPaginas, String disciplina) {
      super(titulo, autor, numPaginas);
      this.disciplina = disciplina;
  }
  
  public String getDisciplina() {
      return disciplina;
  }
  
  public void setDisciplina(String disciplina) {
      this.disciplina = disciplina;
  }
}
