package Memoria;

import Entities.Alumno;
import Entities.Candidato;
import Enums.Modalidad;
import Enums.Traslado;

import java.util.ArrayList;
import java.util.List;

public class Candidatos {

    private List<Candidato> candidatos;
    Alumnos alumnos;



    public Candidatos(Alumnos alumnos) {

        candidatos = new ArrayList();
        this.alumnos = alumnos;


    }

    @Override
    public String toString() {
        return "Candidatos{" +
                "candidatos=" + candidatos +
                '}';
    }

    public List<Candidato> getCandidatos()
    {
        return candidatos;
    }

    public void añadir(Candidato candidato)
    {
           candidatos.add(candidato);

    }

    public Boolean borrar(Candidato candidato)
    {
        for (Candidato candidatoActual:candidatos)
        {
            if (candidatoActual.getEmail().equals(candidato.getEmail()))
            {
                return candidatos.remove(candidatoActual);

            }


        }
        return false;

    }

    public void filtrarCiudad(String  ciudad )
    {

       for (Alumno alumno: alumnos.getAlumnos())
       {
           if (alumno.getCiudad().getNombre().equals(ciudad))
           {
               Candidato candidato = new Candidato(alumno.getEmail(),alumno.getTelefono());
               candidatos.add(candidato);

           }
       }





    }

    public void filtrarModalidad(Modalidad modalidad )
    {

        for (Alumno alumno: alumnos.getAlumnos())
        {
            if (alumno.getModalidad().equals(modalidad))
            {
                Candidato candidato = new Candidato(alumno.getEmail(),alumno.getTelefono());
                candidatos.add(candidato);

            }
        }





    }

    public void filtrarTraslado(Traslado traslado )
    {

        for (Alumno alumno: alumnos.getAlumnos())
        {
            if (alumno.getTraslado().equals(traslado))
            {
                Candidato candidato = new Candidato(alumno.getEmail(),alumno.getTelefono());
                candidatos.add(candidato);

            }
        }





    }

    public void filtrar(String ciudad, Modalidad modalidad, Traslado traslado)
    {
        for (Alumno alumno: alumnos.getAlumnos())
        {
            if ((alumno.getCiudad().getNombre().equals(ciudad)) && (alumno.getModalidad().equals(modalidad))
                &&(alumno.getTraslado().equals(traslado))  )
            {
                Candidato candidato = new Candidato(alumno.getEmail(),alumno.getTelefono());
                candidatos.add(candidato);

            }
        }

    }


    public Candidato buscarEmail(String email){

        for (Candidato candidato:candidatos )
        {
            if (candidato.getEmail().equals(email))
            {
                return candidato;

            }

        }
        return null;
    }

    public Candidato buscarTelefono(String telefono)
    {
        for (Candidato candidato:candidatos )
        {
            if (candidato.getTelefono().equals(telefono))
            {
                return candidato;

            }

        }
        return null;
    }




}
