package src.DepositoBebidas;
public class Bebida{
  private String nome;
  private double preco;
  private int quantidade;
  private String tipo;
  private String descricao;

   public Bebida(String nome,double preco,int quantidade,String tipo, String descricao){
      this.nome= nome;
      this.preco= preco;
     this.quantidade= quantidade;
      this.tipo= tipo;
      this.descricao=descricao;
  }

   public String toString(){
return "Nome da bebida: "+nome+"\nPreço: "+preco+"\nQuantidade: "+quantidade+"\nTipo: "+tipo+"\nDescrição: "+descricao;
   }

  public String getNome(){
  return this.nome;
  }

  public void setNome(String nome){
     this.nome= nome;
  }
    public double getPreco(){
     return this.preco;
     }
   public void setPreco(double preco){
        if(preco>0){
        this.preco= preco;
        }else{
           System.out.println("A bebida não pode custar R$0!!!");
        }
   }
      public int getQuantidade(){
        return this.quantidade;
        }
      
      public void setQuantidade(int quantidade){
         if(quantidade>=0){
           this.quantidade= quantidade;
      }else{
         System.out.println("Quantidade não pode ser menor que 0");
      }
   }
      public String getTipo(){
        return this.tipo;
        }
     
      public void setTipo(String tipo){
           this.tipo= tipo;
        }

      public String getDescricao(){
           return this.descricao;
           }
      public void setDescricao(String descricao){
           this.descricao= descricao;
        }
}
      