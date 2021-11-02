package thi;

public class Flight {
    public int number;
    public String destination;

    public Flight(int number, String destination) {
        if (number < 0)
            this.number = 0;
        else
            this.number = number;

        if (destination instanceof String || destination == null)
            this.destination = "";
        else
            this.destination = destination;
    }

    public Flight() {
    }

    public void display() {
        System.out.println("Number flight: " + this.number + ", destination flight: " + this.destination);
    }

    public int getNumber() {
        if (this.number < 0)
            return 0;
        else
            return this.number;

    }

    public String getDestination() {
        if (this.destination == null || destination == null)
            return "";
        return destination;
    }

    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
    }

}
