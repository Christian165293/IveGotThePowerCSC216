package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!\n";
    }

    public int naivePower(int number, int power) {
        if (number == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        return number * naivePower(number, power - 1);
    }

  public int unoptimizedDCPower(int number, int power) {
    if (number == 0) {
      return 0;
    }
    if (power == 0) {
      return 1;
    }
    if ((power % 2) == 0) {
      return unoptimizedDCPower(number, power / 2) * unoptimizedDCPower(number, power / 2);
    } else {
      return number * unoptimizedDCPower(number, power / 2) * unoptimizedDCPower(number, power / 2);
    }
  }

  public int optimizedDCPower(int number, int power) {
    if (number == 0) {
      return 0;
    }
    if (power == 0) {
      return 1;
    }
    int temp = optimizedDCPower(number, power / 2);
    if ((power % 2) == 0) {
      return temp * temp;
    } else {
      return number * temp * temp;
    }
  }

  public static void main(String[] args) {
    App app = new App();
    System.out.println(new App().getGreeting());
    for (int i = 0; i < 10; i++) {
      int numberInput = (int) (Math.random() * 5);
      int powerInput = (int) (Math.random() * 5);
      System.out.println("number input:" + numberInput + "\tpower input:" + powerInput);
      System.out.println("these are the created methods which should match each other");
      System.out.println(app.naivePower(numberInput, powerInput));
      System.out.println(app.unoptimizedDCPower(numberInput, powerInput));
      System.out.println(app.optimizedDCPower(numberInput, powerInput) +"\n");
    }
  }
}
