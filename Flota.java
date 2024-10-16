import java.util.ArrayList;
import java.util.List;

public class Flota {
    public List<MedioDeTransporte> medios;

    public Flota() {
        this.medios = new ArrayList<>();
    }

    public void agregarMedio(MedioDeTransporte medio) {
        medios.add(medio);
    }

    public void agregarMedios(List<MedioDeTransporte> medios) {
        this.medios.addAll(medios);
    }

    public void eliminarMedio(MedioDeTransporte medio) {
        medios.remove(medio);
    }

    public List<MedioDeTransporte> getMedios() {
        return medios;
    }

    public int cantidadMedios() {
        return medios.size();
    }
}
