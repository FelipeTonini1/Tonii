/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios02felipe;

import java.util.Random;

/**
 *
 * @author IFSC
 */
public class Vetor {
    int vet[];
    
            
        
        /* Construtor */
        public Vetor(int size){
                
                vet =new int [size];
        }         
        /* Preenche o vetor com valores aleatórios*/
         public void randomFill(){
            Random r = new Random ();
                for( int i=0; i<vet.length;i++){
                    vet[i] =r.nextInt(1000);
                }
         }       
        /* Implementa o método de ordenação bubbleSort*/
        public void bubbleSort(){
            boolean troca=false;
            do{
                troca=false;
                for(int i=0;i<vet.length-1;i++){
                    if (vet[i] > vet[i+1]){
                        int aux = vet[i];
                        vet[i] = vet[i+1];
                        vet[i+1]=aux;
                    }
                }
            }while(troca==true);
        }    
        /* Converte o vetor para String*/
        public String toString(){ 
            String s="";
            for(int i=0;i<vet.length;i++){
                s=s + "" + String.valueOf(vet[i]);
            }
            return "s";
        }
        
        /*  Compara se dois vetores são iguais */
        public boolean equals(Vetor v){
            
            if(this.length()!= v.length()){
                return false;
            }
            
            for(int i=0; i<this.length();i++){
                //if (vet[i] != v.valueAt(i)){  
                if(this.valueAt(i)!=v.valueAt(i)){
                    return false;
                }
            }   
            return true;
        }
            
            
        /* Atribui um valor na posição pos do vetor */  
        public void setAt(int pos, int value){}
        
        /* Retorna o valor na posição pos do vetor. */
        public int valueAt(int pos){
            return vet[pos]; // retorna o valor direcinado como parametro no caso "pos"
        }
        
        /* Retorna o tamanho do vetor */
        public int length(){
            int tamanho = this.length();
            return tamanho;
        }
        
        /* Concatena dois vetores */
        public Vetor Concat(Vetor v){
            return new Vetor(0);
        }
    
    

}
