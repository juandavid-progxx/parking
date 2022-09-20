public class EspacioParqueo {
    public String id;
    public int horaEntrada;
    public int HoraSalida;
    private String vehiculo;

    public EspacioParqueo(String id,int horaEntrada,String vehiculo){
        this.id= id;
        this.horaEntrada= horaEntrada;
        this.vehiculo=vehiculo;


    }
    public int getHoraEntrada(){
        return horaEntrada ;


    }
    public String getID(){
        return id;
    }
    public double getHoraSalida(){
        return getHoraSalida();
    }

    public String getVehiculo (){
        return vehiculo ;
    }
    public void setID(){
        this.id=id;
    }
    public void SetHoraEntrada(){
        this.horaEntrada=horaEntrada;
    }
    public void SetHoraSalida(){
        this.horaEntrada=horaEntrada;
    }
    public String GenerarFactura() {
        float valorPagar=0;
        double tiempoVehiculo;
        tiempoVehiculo = getHoraEntrada() - getHoraSalida();
        if (getVehiculo().equalsIgnoreCase("moto")) {
            if (tiempoVehiculo <= 15) {
                valorPagar = 500;
            } else if (tiempoVehiculo <= 30) {
                valorPagar = 800;
            } else if (tiempoVehiculo <= 60) {
                valorPagar = 1000;
            } else if (tiempoVehiculo <= 90) {
                valorPagar = 1500;
            } else if (tiempoVehiculo <= 120) {
                valorPagar = 2000;
            } else if (tiempoVehiculo <= 180) {
                valorPagar = 2500;
            } else if (tiempoVehiculo <= 240) {
                valorPagar = 3000;
            }
        }

            else if (getVehiculo().equalsIgnoreCase("carro")) {
                if (tiempoVehiculo <= 15) {
                    valorPagar = 800;
                } else if (tiempoVehiculo <= 30) {
                    valorPagar = 1000;
                } else if (tiempoVehiculo <= 60) {
                    valorPagar = 1200;
                } else if (tiempoVehiculo <= 90) {
                    valorPagar = 1800;
                } else if (tiempoVehiculo <= 120) {
                    valorPagar = 2200;
                } else if (tiempoVehiculo <= 180) {
                    valorPagar = 3000;
                } else if (tiempoVehiculo <= 240) {
                    valorPagar = 4000;

                }

            }
            return "vehiculo  "+getVehiculo()+"\n placa "+getID()+"\nhora Entrada " +
                    "" +
                    " "+getHoraEntrada()+"valor"+valorPagar;
        }

    }
