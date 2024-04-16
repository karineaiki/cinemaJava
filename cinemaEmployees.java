import java.util.Scanner;

class cinemaEmployees {
    public static void main(String[] args) {
        String[] employeeNames = {"Alice Dupont", "Bob Martin", "Charlie Besson", "Diane Loriot", "Eva Joly"};
        int[] hoursWorked = {35, 38, 35, 38, 40};
        double[] hourlyRates = {12.5, 15.0, 13.5, 14.5, 13.0};
        String[] positions = {"Caissier", "Projectionniste", "Caissier", "Manager", "Caissier"};

        for (int i=0; i < employeeNames.length; i++) {
            double salary = 0.0;
            if (hoursWorked[i] > 35) {
                salary = hoursWorked[i]*hourlyRates[i]*1.5;
            } else {
                salary = hoursWorked[i]*hourlyRates[i];
            };
            System.out.println("le salaire de " + employeeNames[i]+ " est de :" + salary + " par semaine.");
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez renseigner le poste de travail que vous cherchez :");
        String searchPosition = scanner.nextLine();
        int countFound = 0;
        for (int i=0; i < employeeNames.length; i++){
            if (searchPosition.equalsIgnoreCase(positions[i])) {
                System.out.println("L'employé " + employeeNames[i] + " est : " + searchPosition);
                countFound++;
            }
        }
        if (countFound == 0) {
            System.out.println("Aucun employé trouvé.");
        }
    } 
} 
