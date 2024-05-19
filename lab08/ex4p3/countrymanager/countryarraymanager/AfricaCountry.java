package lab08.ex4p3.countrymanager.countryarraymanager;

public class AfricaCountry extends Country {
    private int population;
    private double area;
    private double gdp;
    private String continent;

    public AfricaCountry(String code,
                         String name,
                         int population,
                         double area,
                         double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.continent = "Africa";
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
