package autoModel;

/**
 * Created by USER on 06.09.15.
 */
public class Auto {
    boolean hasChassis;
    boolean hasSuspension;
    boolean hasBody;
    boolean hasSalon;
    boolean hasEngine;
    boolean hasTransmission;
    boolean hasWheels;

    public Auto(){
        hasChassis = true;
        hasBody = false;
        hasWheels = false;
        hasSuspension = false;
        hasSalon = false;
        hasTransmission = false;
        hasEngine = false;
    }

    public boolean isHasChassis() {
        return hasChassis;
    }

    public void setHasChassis(boolean hasChassis) {
        this.hasChassis = hasChassis;
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public void setHasBody(boolean hasBody) {
        this.hasBody = hasBody;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public boolean isHasSuspension() {
        return hasSuspension;
    }

    public void setHasSuspension(boolean hasSuspension) {
        this.hasSuspension = hasSuspension;
    }

    public boolean isHasSalon() {
        return hasSalon;
    }

    public void setHasSalon(boolean hasSalon) {
        this.hasSalon = hasSalon;
    }

    public boolean isHasTransmission() {
        return hasTransmission;
    }

    public void setHasTransmission(boolean hasTransmission) {
        this.hasTransmission = hasTransmission;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

}
