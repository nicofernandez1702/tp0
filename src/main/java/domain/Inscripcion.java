package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

  private List<Materia> materias = new ArrayList<>();

  private Alumno aspirante;

  public void agregarMAteria(Materia mat){

    this.materias.add(mat);
  }

  public void setAspirante(Alumno aspirante) {
    this.aspirante = aspirante;
  }



  public boolean aprobada(){

    Boolean rta = materias.stream().allMatch(m -> aspirante.cumpleCorrelativas(m));

    return rta;
  }

}
