public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return calculateDailyIncome() * (21 - freeDays);
    }

    // Getters pentru a accesa atributele
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getHourRate() {
        return hourRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFreeDays() {
        return freeDays;
    }
}
