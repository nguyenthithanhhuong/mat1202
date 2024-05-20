package lab12.mylist;

public class BasicStatistic {
    private MyList data;

    public BasicStatistic(MyList data) {
        this.data = data;
    }

    public double max() {
        MyIterator iterator = data.iterator();
        double max = Double.NEGATIVE_INFINITY;
        while (iterator.hasNext()) {
            double value = (Double) iterator.next();
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double min() {
        MyIterator iterator = data.iterator();
        double min = Double.POSITIVE_INFINITY;
        while (iterator.hasNext()) {
            double value = (Double) iterator.next();
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double mean() {
        MyIterator iterator = data.iterator();
        double sum = 0;
        int count = 0;
        while (iterator.hasNext()) {
            sum += (Double) iterator.next();
            count++;
        }
        return sum / count;
    }

    public double variance() {
        double mean = mean();
        MyIterator iterator = data.iterator();
        double sum = 0;
        int count = 0;
        while (iterator.hasNext()) {
            double value = (Double) iterator.next();
            sum += Math.pow(value - mean, 2);
            count++;
        }
        return sum / count;
    }
}
