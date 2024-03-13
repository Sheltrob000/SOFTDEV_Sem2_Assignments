import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        // List<Integer> myList = List.of(1, 2, 3);

        // Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        // System.out.println(cumulativeSum);
        
        // Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        //create  a list of strings.
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)
        List<String> string = new ArrayList<String>();
        string.add("English");
        string.add("Webdev");
        string.add("Phycics");
        string.add("Softdev");
        string.add("Precal");
        string.add("History");
        string.add("Art");

        Function<String, String> tolowercase = (s) -> s.toLowerCase();

        Stream<String> classstream = string.stream();
        var lowercaseClassList = classstream.map(tolowercase).toList();
        System.out.print(lowercaseClassList);



    }
}
