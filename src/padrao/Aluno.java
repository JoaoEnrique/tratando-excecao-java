/*
================================================================================
                        DECLARAÇÃO DE PACOTES
================================================================================
*/

package padrao;

/*
================================================================================
                        IMPORT DE BIBLIOTECAS
================================================================================
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
================================================================================
                        CLASSE ALUNO
================================================================================
*/

/**
 *
 * @author Aluno
 */
public class Aluno
{
  /*
  ==============================================================================
                        DECLARAÇÃO DE ATRIBUTOS
  ==============================================================================
  */
  
  // Variável que armazena o nome do aluno;
  private String nome = "";
  
  // Variável que armazena a idade do aluno;
  private int idade = 0;
  
  // Variável que armazena o RM do aluno;
  private int rm = 0;
  
  Scanner teclado = new Scanner(System.in);
    
  /*
  ==============================================================================
                        MÉTODO CONSTRUTOR PADRÃO
  ==============================================================================
  */
  
  public void Aluno()
  {
        
  }

  /*
  ==============================================================================
                        MÉTODOS SET & GET
  ==============================================================================
  */
  
  /**
   * @return the nome
   */
  public String getNome() 
  {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) 
  {
    this.nome = nome;
  }

  /**
   * @return the idade
   */
  public int getIdade() 
  {
    return idade;
  }

  /**
   * @param idade the idade to set
   */
  public void setIdade(int idade) 
  {
    this.idade = idade;
  }

  /**
   * @return the rm
   */
  public int getRm() 
  {
    return rm;
  }

  /**
   * @param rm the rm to set
   */
  public void setRm(int rm) 
  {
    this.rm = rm;
  }
  
  /*
  ==============================================================================
                        MÉTODO CADASTRARALUNO()
  ==============================================================================
  */
  
  public void cadastrarAluno()
  {
    try 
    {
     // PS = Double.parseDouble(JOptionPane.showInputDialog("Digite seu nome: "));
     this.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    } 
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"NOME\"\nDETALHE: " + e);
      System.exit(0);
    }

    try
    {
      this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar a \"IDADE\"\nDETALHE: " + e);
      System.exit(0);
    }
    
    try
    {
      this.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite seu RM: ")));
    }
    catch (Exception e) 
    {
      JOptionPane.showMessageDialog(null, "ERRO: Ocorreu um erro ao armazenar o \"RM\"\nDETALHE: " + e);
      System.exit(0);
    }
  }
  
  /*
  ==============================================================================
                        MÉTODO EXIBIRDADOS()
  ==============================================================================
  */
  
  public void exibirDados()
  {
    try
    {
      JOptionPane.showMessageDialog(null, "\n\nExibindo dados do aluno...\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nRM: " + this.getRm());
    }
    catch (Exception e) 
    {
      System.out.println("ERRO: Ocorreu um erro ao exibir os dados.\nDETALHE: " + e);
      System.exit(0);
    }
  }
  
  /*
  ==============================================================================
                        FIM CLASSE
  ==============================================================================
  */
}