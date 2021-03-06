import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class GitDemo {

    public static void main(String args[]) {
        List<Double> list = DoubleStream.generate(() -> Math.random() * 10).limit(5).boxed().collect(Collectors.toList());
        System.out.println("The random numbers: ");
        list.stream().forEach(System.out::println);
        list.stream().filter(x -> x <5).forEach(System.out::println);
    }

}
