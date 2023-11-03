import java.time.LocalDate;

public class User {
    private String firstName;
    private int day;
    private int month;
    private int year;
    private int age;
    private String email;
    private String tel;
    private String lastName;
    private int weight;
    private int pressure;
    private int steps;

    User (String firstName, String lastName, int day, int month, int year, String email, String tel,
          int weight, int pressure, int steps) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.tel = tel;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

        LocalDate date = LocalDate.now();
        if (date.getYear() > year) {
            this.age = date.getYear() - year;
            if (date.getMonthValue() < month || (date.getMonthValue() == month && date.getDayOfMonth() < day))
                this.age--;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    void printAccountInfo() {
        System.out.printf("Ім'я - %s\nПрізвище - %s\nДень - %d\nМісяць - %d\nРік - %d\nВік - %d\ne-mail - %s\n" +
                          "Телефон - %s\nВага - %d\nТиск - %d\nШагів на день - %d\n", firstName, lastName,
                          day, month, year, age, email, tel, weight, pressure, steps);
    }
}
