import java.util.ArrayList;

public class GerenciarVeiculos {

boolean a;
double y;
String c,b;
Veiculo d;

    
private ArrayList<Veiculo> lista;
    
        public GerenciarVeiculos(){
            lista = new ArrayList<>();
        }


public void adicionar (Veiculo j){ 
        lista.add(j); }



public boolean remover (String placa){  


            for (Veiculo carro : lista) {

            if (carro.getplaca().equalsIgnoreCase(placa)) {
                lista.remove(carro); 
             return true;                  
        

               }       
                   
                
                
}
return false;  

}



public Veiculo buscarPorPlaca (String placa){

    for (Veiculo carro : lista) {
        if (carro.getplaca().equalsIgnoreCase(placa)) {
           return  carro;           
            }   
               

           }
           return null; 
         
}




public String listarVeiculos() {

    String V="Veiculo: " + lista +" \n";


    return V;



}



public double obeterValorImposto(String placa){

    for (Veiculo carro : lista) {
        if (carro.getplaca().equalsIgnoreCase(placa)) {

                                     
            y= carro.calcularImposto();}
            
           y= -1;
        }

   
   return y;
            


}



public String listarVeiculoPorCombustivel(String combustivel){

    for (Veiculo carro : lista) {
        if (carro.getCombustivel().equalsIgnoreCase(combustivel)) {

           b =  (" Veiculo :"+ carro);  
           
           System.out.println(b);
           
                }


        }

      
            return b;



}

}















    

