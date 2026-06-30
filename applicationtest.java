public class applicationtest {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" Jenkins Java Test Started");
        System.out.println("==================================");

        int passed = 0;
        int failed = 0;

        // Test 1
        if (5 + 5 == 10) {
            System.out.println("Test 1 PASSED");
            passed++;
        } else {
            System.out.println("Test 1 FAILED");
            failed++;
        }

        // Test 2
        String name = "TechNova";
        if (name.equals("TechNova")) {
            System.out.println("Test 2 PASSED");
            passed++;
        } else {
            System.out.println("Test 2 FAILED");
            failed++;
        }

        // Test 3
        if (100 > 50) {
            System.out.println("Test 3 PASSED");
            passed++;
        } else {
            System.out.println("Test 3 FAILED");
            failed++;
        }

        System.out.println("--------------------------");
        System.out.println("Passed : " + passed);
        System.out.println("Failed : " + failed);
        System.out.println("--------------------------");

        if (failed == 0) {
            System.out.println("BUILD SUCCESS");
        } else {
            System.exit(1);
        }
    }
}
