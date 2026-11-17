public class Retail {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Unexpected stock shortages",
                "Inventory register with low-stock alerts",
                4000,
                "Sales-linked inventory and reorder dashboard",
                14000,
                "Helps identify products that need replenishment."
            ),

            new Solution(
                "Slow manual billing",
                "Digital billing application",
                5000,
                "Barcode billing with inventory integration",
                18000,
                "Reduces repeated manual entry during billing."
            ),

            new Solution(
                "Difficulty understanding customer feedback",
                "Digital customer feedback form",
                2000,
                "Feedback dashboard with category-wise reports",
                10000,
                "Helps identify common customer concerns."
            )
        };
    }
}