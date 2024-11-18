public class Race {
    String winnerName = "";
    int distance = 0;
    public void whoIsWinner (Car car) {
        if (car.carSpeed*24>distance) {
            winnerName = car.carName;
            distance=24* car.carSpeed;
        }
    }
}
