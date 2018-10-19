package observer;

public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData){
        weatherData.resisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
