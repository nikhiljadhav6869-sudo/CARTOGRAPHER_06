import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    private static final ArrayList<String> history =
            new ArrayList<>();

    private static final String[] industries = {
        "Agriculture",
        "Manufacturing",
        "Logistics",
        "Healthcare",
        "Retail",
        "Education",
        "Energy",
        "Waste Management"
    };

    private static final int[] industryVisits =
            new int[industries.length];

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("======================================");
        System.out.println("             CARTOGRAPHER");
        System.out.println(" Smart Technology Industry-Based");
        System.out.println("       Problem Solving System");
        System.out.println("======================================");

        while (running) {

            showMainMenu();

            int choice = readInt("Enter your choice: ", 0, 3);

            switch (choice) {

                case 1:
                    exploreIndustry();
                    break;

                case 2:
                    showHistory();
                    break;

                case 3:
                    showDashboard();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }

        System.out.println("\nThank you for using Cartographer!");
        input.close();
    }

    private static void showMainMenu() {

        System.out.println("\n========== MAIN MENU ==========");
        System.out.println("1. Find a technology solution");
        System.out.println("2. View recommendation history");
        System.out.println("3. View project dashboard");
        System.out.println("0. Exit");
    }

    private static void exploreIndustry() {

        System.out.println("\n========== INDUSTRIES ==========");

        for (int i = 0; i < industries.length; i++) {
            System.out.println((i + 1) + ". " + industries[i]);
        }

        System.out.println("0. Back");

        int industryChoice = readInt(
                "Select an industry: ",
                0,
                industries.length
        );

        if (industryChoice == 0) {
            return;
        }

        Solution[] solutions = getIndustrySolutions(industryChoice);

        System.out.println(
                "\nSelected industry: " + industries[industryChoice - 1]
        );

        System.out.println("\nChoose your problem:");

        for (int i = 0; i < solutions.length; i++) {
            System.out.println(
                    (i + 1) + ". " + solutions[i].getProblem()
            );
        }

        System.out.println("0. Back");

        int problemChoice = readInt(
                "Select a problem: ",
                0,
                solutions.length
        );

        if (problemChoice == 0) {
            return;
        }

        double budget = readBudget();

        System.out.println("\nHow urgent is the problem?");
        System.out.println("1. Low");
        System.out.println("2. Medium");
        System.out.println("3. High");

        int urgency = readInt("Select urgency: ", 1, 3);

        Solution selected = solutions[problemChoice - 1];

        String report = selected.recommend(budget, urgency);

        history.add(
                industries[industryChoice - 1] + " | " + report
        );

        industryVisits[industryChoice - 1]++;

        System.out.println("\nReport added to session history.");
    }

    private static Solution[] getIndustrySolutions(int choice) {

        switch (choice) {

            case 1:
                return Agriculture.getSolutions();

            case 2:
                return Manufacturing.getSolutions();

            case 3:
                return Logistics.getSolutions();

            case 4:
                return Healthcare.getSolutions();

            case 5:
                return Retail.getSolutions();

            case 6:
                return Education.getSolutions();

            case 7:
                return Energy.getSolutions();

            case 8:
                return WasteManagement.getSolutions();

            default:
                throw new IllegalArgumentException(
                        "Unknown industry choice."
                );
        }
    }

    private static void showHistory() {

        System.out.println("\n========== SESSION HISTORY ==========");

        if (history.isEmpty()) {
            System.out.println("No recommendations yet.");
            return;
        }

        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }

    private static void showDashboard() {

        System.out.println("\n========== PROJECT DASHBOARD ==========");
        System.out.println("Industries available: " + industries.length);

        int totalProblems = 0;

        for (int i = 1; i <= industries.length; i++) {
            totalProblems += getIndustrySolutions(i).length;
        }

        System.out.println("Problem cases available: " + totalProblems);
        System.out.println("Reports generated: " + history.size());

        System.out.println("\nReports by industry:");

        for (int i = 0; i < industries.length; i++) {
            System.out.println(
                    industries[i] + ": " + industryVisits[i]
            );
        }

        System.out.println("\nCosts are illustrative project estimates.");
        System.out.println("History resets when the program closes.");
    }

    private static int readInt(String prompt, int min, int max) {

        while (true) {

            System.out.print(prompt);

            String text = input.nextLine().trim();

            try {

                int value = Integer.parseInt(text);

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println(
                        "Enter a number from " + min + " to " + max + "."
                );

            } catch (NumberFormatException exception) {

                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static double readBudget() {

        while (true) {

            System.out.print("\nEnter your budget in rupees: ");

            String text = input.nextLine().trim();

            try {

                double budget = Double.parseDouble(text);

                if (Double.isFinite(budget) && budget >= 0) {
                    return budget;
                }

                System.out.println(
                        "Budget must be a finite, non-negative number."
                );

            } catch (NumberFormatException exception) {

                System.out.println(
                        "Enter a numeric amount, such as 5000 or 7500.50."
                );
            }
        }
    }
}