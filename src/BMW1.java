public class BMW1 {
    private int year;
    private Color color;

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public BMW1(int year, Color color) {
        this.year = year;
        this.color = color;
    }
    public String getInfo(){
        return "Color : " + color +
                " Year: " + year;
    }
}
