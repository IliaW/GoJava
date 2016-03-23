package HomeWorkExep_62.instrument;

public abstract class MusicalInstrument {

    public abstract String getType();

    @Override
    public String toString() {
        return "Musical instrument{" + getType() + "}";
    }
}