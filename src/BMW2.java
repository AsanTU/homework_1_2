public class BMW2 extends BMW1{
    private int year;
    private Color color;
    private int maxSpeed;

    public BMW2(int year, Color color) {
        super(year, color);
    }

    public int Speed(int maxSpeed, int year) {
        return maxSpeed;
    }
        public final int Speed(int year){
            return year;
    }
    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public BMW2(int year, Color color, int year1, Color color1) {
        super(year, color);
        this.year = year1;
        this.color = color1;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
