// --== CS400 File Header Information ==--
// Name: Jiaqi He
// Email: he279@wisc.edu
// Team: KA
// Role: Data Wrangler 2
// TA: Sid
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class loads data in a file into our application.
 * 
 * @author Jiaqi He
 *
 */
public class Data {
  private String path;

  /**
   * Constructor.
   * 
   * @param path the path of the file to be loaded
   */
  public Data(String path) {
    this.path = path;
  }

  /**
   * Load data into a CS400Graph object
   * 
   * @param graph
   * @throws FileNotFoundException
   */
  public void loadFile(CS400Graph<String> graph) throws FileNotFoundException {  
      File flightData = new File(path);
      Scanner scanner = new Scanner(flightData);
      while (scanner.hasNextLine()) {
        String[] line = scanner.nextLine().trim().split(",");
        String start = line[0].trim();
        String dest = line[1].trim();
        int weight = Integer.parseInt(line[2].trim());
        if (!graph.containsVertex(start)) graph.insertVertex(start);
        if (!graph.containsVertex(dest)) graph.insertVertex(dest);
        graph.insertEdge(start, dest, weight); 
      }
      scanner.close();
  }

}
