public class Contato {
 private String nome;
 private String telefone;
 public Contato(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
 }
 public String getTelefone() {
   return telefone;
 }
 public void setTelefone(String telefone) {
   this.telefone = telefone;
 }
 public String getNome() {
   return nome;
 }
 public void setNome(String nome) {
   this.nome = nome;
 }
 public String toString() {
   return "nome=" + nome + "Telefone " + telefone + '\n';
 }
}