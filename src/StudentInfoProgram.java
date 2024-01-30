import java.util.Scanner;

public class StudentInfoProgram {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Ввод информации о студенте
        System.out.print("Введите ФИО студента: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите возраст студента: ");
        int age = scanner.nextInt();

        System.out.print("Введите рост студента (в см): ");
        double height = scanner.nextDouble();

        System.out.print("Студент бюджетник? (Да/Нет): ");
        boolean isBudgetStudent = scanner.next().equalsIgnoreCase("Да");

        System.out.print("Введите пол студента (М/Ж): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        // Вывод информации о студенте
        System.out.println("\nИнформация о студенте:");
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Рост: " + height + " см");
        System.out.println("Бюджетник: " + (isBudgetStudent ? "Да" : "Нет"));
        System.out.println("Пол: " + (gender == 'М' ? "Мужской" : "Женский"));

        // Закрываем Scanner
        scanner.close();
    }
}
