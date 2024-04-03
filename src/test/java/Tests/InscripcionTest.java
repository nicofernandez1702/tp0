package Tests;

import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;
import org.junit.Test;
import org.junit.Assert;

public class InscripcionTest {

  private Inscripcion inscripcionA = new Inscripcion();
  private Inscripcion inscripcionB = new Inscripcion();
  private Materia materiaA = new Materia();
  private Materia materiaB = new Materia();
  private Materia materiaC = new Materia();

  private Alumno alumnoA = new Alumno();

  private Alumno alumnoB = new Alumno();

  @Test
  public void sePuedeInscribir(){

    alumnoA.aprobar(materiaA);
    alumnoA.aprobar(materiaB);
    inscripcionA.agregarMAteria(materiaC);
    inscripcionA.setAspirante(alumnoA);
    materiaC.agregarCorrelativa(materiaB);
    materiaC.agregarCorrelativa(materiaA);

    Assert.assertEquals(inscripcionA.aprobada(),true);

  }

  @Test
  public void noSePuedeInscribir(){

    alumnoB.aprobar(materiaA);
    inscripcionB.agregarMAteria(materiaC);
    inscripcionB.setAspirante(alumnoB);
    materiaC.agregarCorrelativa(materiaB);
    materiaC.agregarCorrelativa(materiaA);

    Assert.assertEquals(inscripcionB.aprobada(),false);

  }


}
