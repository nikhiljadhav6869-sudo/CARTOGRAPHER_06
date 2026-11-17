public class Agriculture {

    public static Solution[] getSolutions() {

        return new Solution[] {

            new Solution(
                "Water wastage during irrigation",
                "Soil moisture sensor with watering alerts",
                5000,
                "Automatic irrigation with moisture sensors",
                15000,
                "Helps avoid unnecessary watering."
            ),

            new Solution(
                "Difficulty monitoring crop conditions",
                "Digital crop observation diary",
                2000,
                "Field sensor dashboard with weather alerts",
                12000,
                "Helps farmers track changes in field conditions."
            ),

            new Solution(
                "Poor storage conditions for harvested crops",
                "Temperature and humidity monitoring",
                4000,
                "Connected storage monitoring with remote alerts",
                14000,
                "Helps identify unsuitable storage conditions."
            )
        };
    }
}