package padrao;

/**
 *
 * @author Wagner Lucca
 */
public class Principal 
{
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    Aluno aluno = new Aluno();
        
    aluno.cadastrarAluno();
        
    aluno.exibirDados();
  }
  
}
