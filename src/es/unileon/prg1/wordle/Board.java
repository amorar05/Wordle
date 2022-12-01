package es.unileon.prg1.wordle;
public class Board 
{
    private String  word;
    private int cont;
    public Board (String word)
        {
            this.word = word;
            cont=0;
        }
   public void Comparar(String word)
    {
     
     for(int i=0;i<word.longitud();i++)
     { 
      if (this.word[i].equals(word[i]))
          { 
           System.out.println("Encontrado"); 
           cont++;
          }
      else 
          {
           System.out.println("No encontrado");
          }
     }
         

    }
     public int getAciertos{
         cont=0;
        }
    
     public boolean Fin()
     cont=0;
     if (cont == word.longitud){
     return true;

     }
    public boolean Comparar(dictionary=diccionario)
    {
        Dictionary = diccionario;
        for(int i=0;i<diccionario.size();i++){
            if (diccionario.get(i)==word){
                return true;    
            }
            else{
                return false;
            }

    }
    public boolean emptyDictionary(){
      
        if(diccionario.size == 0){ 
            return true;
        }
        else{
            return false;
        }
      }
    public int leftTries(){
        int intentosPosibles=6;
        int intentosUsados=0;
        intentos_restantes = intentosPosibles-intentosUsados;
        return intentos_restantes;
    }    
    

}


