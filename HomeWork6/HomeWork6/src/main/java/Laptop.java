import java.util.Objects;

public class Laptop {

    private String manufacturer;

    private String color;
    private String RAM;
    private String GPU;
    private String HDD;
    private String SSD;
    private String motherboard;
    private String processor;

    @Override
    public String toString() {
        return "Laptops{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", RAM='" + RAM + '\'' +
                ", GPU='" + GPU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", SSD='" + SSD + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", processor='" + processor + '\'' +
                '}' + "\n";
    }




    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(manufacturer, laptop.manufacturer) && Objects.equals(color, laptop.color) && Objects.equals(RAM, laptop.RAM) && Objects.equals(GPU, laptop.GPU) && Objects.equals(HDD, laptop.HDD) && Objects.equals(SSD, laptop.SSD) && Objects.equals(motherboard, laptop.motherboard) && Objects.equals(processor, laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, color, RAM, GPU, HDD, SSD, motherboard, processor);
    }



}
