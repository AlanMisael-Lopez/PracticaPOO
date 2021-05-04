public  class Usuario extends Persona{


    @Override
    public void nombre(String nombre) {
        System.out.println(nombre);
    }

    @Override
    public void edad(int edad) {
        System.out.println(edad);
    }

    @Override
    public void correo(String correo) {
        System.out.printf("correo");
    }
}
