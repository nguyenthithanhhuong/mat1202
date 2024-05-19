package lab08.ex4p3.countrymanager.countryarraymanager;

import java.util.LinkedList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            int minPopulation = newArray[i].getPopulation();
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                int temp = newArray[j].getPopulation();
                if (temp < minPopulation) {
                    minPopulation = temp;
                    minIdx = j;
                }
            }

            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            int maxPopulation = newArray[i].getPopulation();
            int maxIdx = i;
            for (int j = i + 1; j < size; j++) {
                int temp = newArray[j].getPopulation();
                if (temp > maxPopulation) {
                    maxPopulation = temp;
                    maxIdx = j;
                }
            }

            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            double minArea = newArray[i].getArea();
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                double temp = newArray[j].getArea();
                if (temp < minArea) {
                    minArea = temp;
                    minIdx = j;
                }
            }

            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            double maxArea = newArray[i].getArea();
            int maxIdx = i;
            for (int j = i + 1; j < size; j++) {
                double temp = newArray[j].getArea();
                if (Double.compare(temp, maxArea) > 0) {
                    maxArea = temp;
                    maxIdx = j;
                }
            }

            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            double minGdp = newArray[i].getGdp();
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                double temp = newArray[j].getGdp();
                if (temp < minGdp) {
                    minGdp = temp;
                    minIdx = j;
                }
            }

            Country temp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int size = newArray.length;

        for (int i = 0; i < size; i++) {
            double maxGdp = newArray[i].getArea();
            int maxIdx = i;
            for (int j = i + 1; j < size; j++) {
                double temp = newArray[j].getArea();
                if (Double.compare(temp, maxGdp) > 0) {
                    maxGdp = temp;
                    maxIdx = j;
                }
            }

            Country temp = newArray[maxIdx];
            newArray[maxIdx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        List<AfricaCountry> newAfricaList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "Africa") {
                newAfricaList.add((AfricaCountry) element);
            }
        }

        AfricaCountry[] newAfricaArray = new AfricaCountry[newAfricaList.size()];
        int i = 0;
        for (AfricaCountry element : newAfricaList) {
            newAfricaArray[i] = element;
            i++;
        }

        return newAfricaArray;
    }

    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> newAsiaList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "Asia") {
                newAsiaList.add((AsiaCountry) element);
            }
        }

        AsiaCountry[] newAsiaArray = new AsiaCountry[newAsiaList.size()];
        int i = 0;
        for (AsiaCountry element : newAsiaList) {
            newAsiaArray[i] = element;
            i++;
        }

        return newAsiaArray;
    }

    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> newEuropeList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "Europe") {
                newEuropeList.add((EuropeCountry) element);
            }
        }

        EuropeCountry[] newEuropeArray = new EuropeCountry[newEuropeList.size()];
        int i = 0;
        for (EuropeCountry element : newEuropeList) {
            newEuropeArray[i] = element;
            i++;
        }

        return newEuropeArray;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        List<NorthAmericaCountry> newNorthAmericaList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "North America") {
                newNorthAmericaList.add((NorthAmericaCountry) element);
            }
        }

        NorthAmericaCountry[] newAmericaArray = new NorthAmericaCountry[newNorthAmericaList.size()];
        int i = 0;
        for (NorthAmericaCountry element : newNorthAmericaList) {
            newAmericaArray[i] = element;
            i++;
        }

        return newAmericaArray;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        List<OceaniaCountry> newOceaniaList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "Oceania") {
                newOceaniaList.add((OceaniaCountry) element);
            }
        }

        OceaniaCountry[] newOceaniaArray = new OceaniaCountry[newOceaniaList.size()];
        int i = 0;
        for (OceaniaCountry element : newOceaniaList) {
            newOceaniaArray[i] = element;
            i++;
        }

        return newOceaniaArray;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        List<SouthAmericaCountry> newSouthAmericaList = new LinkedList<>();

        for (Country element : this.countries) {
            if (element != null && element.getContinent() == "South America") {
                newSouthAmericaList.add((SouthAmericaCountry) element);
            }
        }

        SouthAmericaCountry[] newSouthAmericaArray = new SouthAmericaCountry[newSouthAmericaList.size()];
        int i = 0;
        for (SouthAmericaCountry element : newSouthAmericaList) {
            newSouthAmericaArray[i] = element;
            i++;
        }

        return newSouthAmericaArray;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = this.sortByDecreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
         return result;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = this.sortByIncreasingPopulation();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newArray = this.sortByDecreasingArea();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newArray = this.sortByIncreasingArea();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newArray = this.sortByDecreasingGdp();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newArray = this.sortByIncreasingGdp();
        Country[] result = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            result[i] = newArray[i];
        }
        return result;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
