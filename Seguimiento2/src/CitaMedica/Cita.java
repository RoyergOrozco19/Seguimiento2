package CitaMedica;

public class Cita {

    private String codCita;
    private String fecha;
    private String hora;
    private int consultorio;
    private String nombrePaciente;
    private String nombreMedico;
    private String centroMedico;

    public Cita(String codCita, String fecha, String hora, String consultorio, String nombrePaciente, String nombreMedico, String centroMedico) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = Integer.parseInt(consultorio);
        this.nombrePaciente = nombrePaciente;
        this.nombreMedico = nombreMedico;
        this.centroMedico = centroMedico;
    }

    @Override
    public String toString() {
        return
                "Código de Cita: " + codCita + '\'' +
                "fecha: '" + fecha + '\'' +
                "Hora de la cita: " + hora + '\'' +
                "Consultorio: " + consultorio +
                "Paciente: " + nombrePaciente + '\'' +
                "Médico: " + nombreMedico + '\'' +
                "Centro medico: " + centroMedico + '\'' ;
    }
}