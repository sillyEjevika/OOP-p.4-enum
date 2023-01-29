package Transport.exaption;

public class DiagnosticFailedExaption extends Exception {
    public DiagnosticFailedExaption() {
        super("Необходимо указать тип прав!");
    }
}
