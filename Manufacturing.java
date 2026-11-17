public class Manufacturing {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Machine overheating",
                "Temperature sensor with warning buzzer",
                6000,
                "Connected temperature monitoring dashboard",
                18000,
                "Helps operators identify overheating early."
            ),

            new Solution(
                "Missed equipment maintenance",
                "Digital maintenance schedule and reminders",
                3000,
                "Usage-based maintenance tracking system",
                16000,
                "Helps teams schedule equipment inspections."
            ),

            new Solution(
                "Difficulty recording defective products",
                "Digital defect recording application",
                4000,
                "Barcode-based quality inspection tracking",
                20000,
                "Helps trace defects and identify recurring issues."
            )
        };
    }
}