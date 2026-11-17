public class Solution {

    private String problem;
    private String basicTechnology;
    private String advancedTechnology;
    private String benefit;

    private double basicCost;
    private double advancedCost;

    public Solution(
            String problem,
            String basicTechnology,
            double basicCost,
            String advancedTechnology,
            double advancedCost,
            String benefit) {

        this.problem = problem;
        this.basicTechnology = basicTechnology;
        this.basicCost = basicCost;
        this.advancedTechnology = advancedTechnology;
        this.advancedCost = advancedCost;
        this.benefit = benefit;
    }

    public String getProblem() {
        return problem;
    }

    public String recommend(double budget, int urgency) {

        String selectedTechnology;
        double selectedCost;

        System.out.println("\n========== SOLUTION REPORT ==========");
        System.out.println("Problem: " + problem);

        System.out.println("\nBasic option: " + basicTechnology);
        System.out.printf("Sample cost: Rs. %.2f%n", basicCost);

        System.out.println("\nAdvanced option: " + advancedTechnology);
        System.out.printf("Sample cost: Rs. %.2f%n", advancedCost);

        if (budget >= advancedCost) {

            selectedTechnology = advancedTechnology;
            selectedCost = advancedCost;

            System.out.println("\nRecommendation: Advanced option");

        } else if (budget >= basicCost) {

            selectedTechnology = basicTechnology;
            selectedCost = basicCost;

            System.out.println("\nRecommendation: Basic option");

        } else {

            double shortage = basicCost - budget;

            System.out.println("\nBudget is below the basic option.");
            System.out.printf(
                    "Additional amount needed: Rs. %.2f%n",
                    shortage
            );

            showPriority(urgency);

            System.out.println(
                    "Next step: Review funding or reduce the project scope."
            );

            return problem + " | Budget insufficient";
        }

        System.out.println("Selected technology: " + selectedTechnology);
        System.out.println("Expected benefit: " + benefit);

        System.out.printf("Your budget: Rs. %.2f%n", budget);
        System.out.printf("Selected cost: Rs. %.2f%n", selectedCost);

        double remaining = budget - selectedCost;

        System.out.printf("Remaining budget: Rs. %.2f%n", remaining);

        showPriority(urgency);

        System.out.println("\nSuggested implementation steps:");
        System.out.println("1. Record the current problem.");
        System.out.println("2. Test the solution on a small scale.");
        System.out.println("3. Compare results before and after.");
        System.out.println("4. Expand if the trial is successful.");

        return problem + " | " + selectedTechnology
                + " | Rs. " + selectedCost;
    }

    private void showPriority(int urgency) {

        switch (urgency) {

            case 1:
                System.out.println("Priority: LOW");
                System.out.println("Action: Schedule a planned trial.");
                break;

            case 2:
                System.out.println("Priority: MEDIUM");
                System.out.println("Action: Prepare a trial soon.");
                break;

            case 3:
                System.out.println("Priority: HIGH");
                System.out.println(
                        "Action: Promptly review the issue with the responsible team."
                );
                break;

            default:
                System.out.println("Priority: Not specified.");
        }
    }
}