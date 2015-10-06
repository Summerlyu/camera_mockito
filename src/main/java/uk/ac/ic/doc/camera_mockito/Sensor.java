package uk.ac.ic.doc.camera_mockito;

public interface Sensor {
    byte[] readData();
    void powerUp();
    void powerDown();
}
