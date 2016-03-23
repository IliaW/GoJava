package HomeWorkExep_62.instrument;

public class NoInstrumentExсept extends Exception {
    private String noInstrument;

    public NoInstrumentExсept(String noInstrument) {
        this.noInstrument = noInstrument + "\n";
    }

    @Override
    public String getMessage() {
        return noInstrument;
    }
}
