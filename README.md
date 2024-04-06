# Tratamento_De_Erro-Java
Cadastro em Java com tratamento de erro e interface.

```java
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
