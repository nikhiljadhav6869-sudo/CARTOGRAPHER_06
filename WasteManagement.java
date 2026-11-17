public class WasteManagement {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Overflowing garbage bins",
                "Digital bin inspection and reporting application",
                3000,
                "Bin fill-level sensors with collection alerts",
                14000,
                "Helps identify bins requiring collection."
            ),

            new Solution(
                "Poor waste segregation",
                "Waste category guide and reporting application",
                2000,
                "Collection station dashboard with contamination reports",
                10000,
                "Helps teams track waste segregation problems."
            ),

            new Solution(
                "Missed waste collection rounds",
                "Digital collection schedule and checklist",
                3500,
                "Vehicle tracking with collection completion records",
                17000,
                "Helps supervisors track completed collection rounds."
            )
        };
    }
}