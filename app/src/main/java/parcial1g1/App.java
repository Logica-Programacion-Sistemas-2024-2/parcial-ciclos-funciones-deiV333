
package parcial1g1;

public class App {

    public static void main(String[] args) {
        
        try {


            Scanner sc = new Scanner(System.in);
            int cantVehiculos = 0;
            float metrosRecorrido = 0;
            float kmRecorrido = 0;
            float litrosConsumidos = 0;
            float litrosAcum = 0;
            System.out.println("Ingrese la cantidad de vehiculos participantes: ");
            cantVehiculos = sc.nextInt();
            if(cantVehiculos > 0 ){
                for(int i = 1; i <= cantVehiculos; i++){
                    
                    System.out.println("Ingrese la cantidad de metros recorridos por el vehiculo " + i);
                    metrosRecorrido = sc.nextInt();
                    if(metrosRecorrido > 0){
                        kmRecorrido = (float)(metrosRecorrido/1000);
                        litrosConsumidos = calcularConsumoGasolina(kmRecorrido);
                    
                        System.out.println("Vehiculo " + i + ": " + kmRecorrido + "km -> " + litrosConsumidos + " Litros de gasolina");
                        litrosAcum += litrosConsumidos;
                    }else{
                        System.out.println("Ingrese un numero mayor a 0");
                    }
                    
                }
                
                System.out.println("Total de gasolina consumida por los " + cantVehiculos + " Vehiculos: " + litrosAcum + " Litros.");
                
            }else{
                System.out.println("Ingrese un numero de vehiculos mayor a 0");
            }

        } catch (Exception e) {
            System.out.println("El error es: " + e);
        }
    

    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try {
            float litrosConsumidos  = (kmRecorrido * 55) / 750;
            return litrosConsumidos;   
        } catch (Exception e) {
            return 1;
        }
    }
    //------------------------------------------------------------------

}
