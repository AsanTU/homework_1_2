public final class BMW3 extends BMW2{
    private int year;
    private Color color;

    public BMW3(int year, Color color) {
        super(year, color);
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public BMW3(int year, Color color, int year1, Color color1) {
        super(year, color);
        this.year = year1;
        this.color = color1;
    }

    @Override
    public int Speed(int maxSpeed, int year) {
        return super.Speed(maxSpeed, year);
    }

    public BMW3(int year, Color color, int year1, Color color1, int year2, Color color2) {
        super(year, color, year1, color1);
        this.year = year2;
        this.color = color2;

    }
}
