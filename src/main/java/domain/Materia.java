package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {

  private List<Materia> correlativas = new ArrayList<>();


  public void agregarCorrelativa(Materia mat){
    correlativas.add(mat);
  }

  public List<Materia> getCorrelativas() {
    return correlativas;
  }


}
