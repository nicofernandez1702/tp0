package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

  private List<Materia> materiasAprobadas = new ArrayList<>();

  public boolean cumpleCorrelativas(Materia mat){
      return materiasAprobadas.containsAll(mat.getCorrelativas());
  }

  public void aprobar(Materia mat){
    materiasAprobadas.add(mat);
  }

}
