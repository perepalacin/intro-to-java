import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> {
                String[] parts = row.split(",");
                return new String[]{parts[2], parts[3], parts[4], parts[5]};
            })
            .sorted((p1, p2) -> {
                return p1[3].compareTo(p2[3]);
            })
            .forEach(p -> System.out.println(p[1] + " (" + p[2] + "), " + p[0].trim().split(" ")[0] + ", " + p[3]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
