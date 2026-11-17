public class Education {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Time-consuming manual attendance",
                "Digital attendance register",
                3000,
                "Time-limited QR attendance with teacher verification",
                12000,
                "Helps teachers record and review attendance."
            ),

            new Solution(
                "Missed assignment deadlines",
                "Assignment calendar with reminders",
                2000,
                "Assignment submission and progress dashboard",
                10000,
                "Helps students track pending coursework."
            ),

            new Solution(
                "Difficulty locating library books",
                "Searchable digital book catalogue",
                4000,
                "Barcode library issue and return system",
                16000,
                "Helps track book availability and borrowing."
            )
        };
    }
}