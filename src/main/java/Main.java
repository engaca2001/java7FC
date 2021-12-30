import Entities.*;
import Enums.Modalidad;
import Enums.Traslado;
import Memoria.Alumnos;
import Memoria.Candidatos;
import Output.Impresion;

public class Main {

    public static void main(String[] args) {

        Alumnos alumnos = new Alumnos();

        Usuario usuario1 = new Usuario(alumnos);


        usuario1.register("engaca2001@hotmail.com","palomino");


        usuario1.login("engaca2001@hotmail.com","palomino");

        int posicionAlumno = usuario1.buscar("engaca2001@hotmail.com");

        String passAlumno = alumnos.getAlumnos().get(posicionAlumno).getPassword();

        Alumno.AlumnoBuilder builder = new Alumno.AlumnoBuilder("engaca2001@hotmail.com",passAlumno);



        Pais pais1 = new Pais("España");
        Pais pais2 = new Pais("Francia");

        Ciudad madrid = new Ciudad("Madrid",pais1);


        Lenguaje lenguaje1= new Lenguaje("java");
        Lenguaje lenguaje2= new Lenguaje("python");



        Alumno alumno1 = builder.setNombreCompleto("Enrique Gallego Cabrales")
                .setTelefono("660046935")
                .setCv("Cv")
                .setFoto("foto")
                .setModalidad(Modalidad.REMOTO)
                .setTraslado(Traslado.NO)
                .setCiudad(madrid)
                .setPais(pais1)
                .build();

        alumnos.getAlumnos().remove(usuario1.buscar(alumno1.getEmail()));

        alumnos.añadirAlumno(alumno1);

        usuario1.matricula(alumno1,lenguaje1);
        usuario1.matricula(alumno1,lenguaje2);







        System.out.println(pais1.getAlumnos());
        System.out.println(pais1.getCiudades());






        Impresion impresion = new Impresion(alumno1);

        Candidatos candidatos = new Candidatos(alumnos);

        System.out.println("Estos son todos los usuarios registrados: " + usuario1.getAlumnos().getAlumnos());

       // candidatos.filtrarCiudad("Madrid");



        //candidatos.filtrarModalidad(Modalidad.REMOTO);

        // candidatos.filtrarTraslado(Traslado.NO);

        candidatos.filtrar("Madrid",Modalidad.REMOTO,Traslado.NO);

        System.out.println(candidatos.getCandidatos());

        System.out.println(candidatos.buscarTelefono("630046935"));

        Candidato candidato = new Candidato("engaca2001@hotmail.com", "660046935");



        //candidatos.borrar(candidato);

        System.out.println(candidatos.getCandidatos());



    }




}
