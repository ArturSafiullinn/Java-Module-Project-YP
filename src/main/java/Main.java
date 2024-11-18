import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в консольную игру \"24 часа Ле Мана\".");
        System.out.println("В этой игре определится победитель 24 часовой гонки по Ле Ману.");
        System.out.println("Всего будет 3 участника. Вам нужно будет ввести название участников и их скорость.");
        System.out.println("Введите название машины первого участника:");
        Scanner userInput = new Scanner(System.in);
        String carName = userInput.nextLine();
        System.out.println("Введите скорость машины первого участника (это должно быть число больше 0 и меньше или равно 250):");
        String inputCarSpeed = userInput.nextLine();
        int carSpeed = inputCarSpeedToInt(inputCarSpeed);
        Car firstCar = new Car(carName, carSpeed);
        Race race = new Race();
        race.whoIsWinner(firstCar);
        System.out.println("Введите название машины второго участника:");
        carName = userInput.nextLine();
        System.out.println("Введите скорость машины второго участника (это должно быть число больше 0 и меньше или равно 250):");
        inputCarSpeed = userInput.nextLine();
        carSpeed = inputCarSpeedToInt(inputCarSpeed);
        Car secondCar = new Car(carName, carSpeed);
        race.whoIsWinner(secondCar);
        System.out.println("Введите название машины третьего участника:");
        carName = userInput.nextLine();
        System.out.println("Введите скорость машины третьего участника (это должно быть число больше 0 и меньше или равно 250):");
        inputCarSpeed = userInput.nextLine();
        carSpeed = inputCarSpeedToInt(inputCarSpeed);
        Car thirdCar = new Car(carName, carSpeed);
        race.whoIsWinner(thirdCar);
        System.out.println("Самая быстрая машина: " + race.winnerName);
    }


    public static int inputCarSpeedToInt(String inputSpeed) {
        while (true) {
            try {
                int speed = Integer.parseInt(inputSpeed);
                if ((speed > 0) && (speed <= 250)) {
                    return speed;
                } else {
                    System.out.println("Неверно введена скорость! Введите число больше 0 и меньше или равной 250!");
                    Scanner userInputSpeed = new Scanner(System.in);
                    inputSpeed = userInputSpeed.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверно введена скорость! Введите число больше 0 и меньше или равной 250!");
                Scanner userInputSpeed = new Scanner(System.in);
                inputSpeed = userInputSpeed.nextLine();
            }
        }
    }
}