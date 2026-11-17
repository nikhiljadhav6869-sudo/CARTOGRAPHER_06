public class Energy {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Poor visibility of electricity consumption",
                "Daily electricity reading tracker",
                2500,
                "Smart meter consumption dashboard",
                15000,
                "Helps identify patterns in electricity usage."
            ),

            new Solution(
                "Lights left on in empty rooms",
                "Lighting schedule and reminder system",
                3000,
                "Occupancy sensor lighting control",
                12000,
                "Helps reduce unnecessary lighting usage."
            ),

            new Solution(
                "Difficulty tracking solar panel output",
                "Daily solar generation recording application",
                3500,
                "Connected solar generation monitoring dashboard",
                18000,
                "Helps compare generation across different days."
            )
        };
    }
}