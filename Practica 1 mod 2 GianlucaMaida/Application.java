package tokio.school.maida;

public class Application {
    public static void main(String[]args){
        String guion = "____________________________";
        String n = "\n";

        Coche coche = new Coche();
        coche.setMarca("seat");
        coche.setMatricula("XRO-123");
        coche.setModelo("Ibiza");
        coche.setPotencia("120cf");
        coche.setVelocidadMaxima(200);

        Coche.Chasis chasis = new Coche.Chasis();
        chasis.setMaterial("acero");
        chasis.setPeso("300k");

        Coche.Rueda rueda = new Coche.Rueda();
        rueda.setMarca("seat");
        rueda.setModelo("deportiva");
        rueda.setMedida(17);
        rueda.setTipo("seco");

        System.out.println(guion);
        System.out.println("CARACTERISTICAS DEL COCHE : ");
        System.out.println("Marca : " + coche.getMarca() + n +
                "Matricula : " + coche.getMatricula() + n +
                "Modelo : " + coche.getModelo() + n +
                "potencia : " + coche.getPotencia()+ n +
                "Velocidad maxima : " + coche.getVelocidadMaxima() + n +
                guion  );

        System.out.println("RUEDAS  " + n +
                "Marca : " + rueda.getMarca() + n +
                "tipo : " + rueda.getTipo() + n +
                "Rodado : " + rueda.getMedida() + n +
                "modelo : " + rueda.getModelo() + n +
                guion);

        System.out.println("CHASIS" );
        System.out.println("Material : " + chasis.getMaterial() + n +
                "Peso : " + chasis.getPeso() + n + guion);

    }
}
