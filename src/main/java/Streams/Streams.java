package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    //method map() na streamie:
//    List number  = Arrays.asList(2, 3, 4, 5);
//    List square = number.stream().map(x -> x*x).collect(Collectors.toList());
//
//    method sorted() na stremie
//    List names = Arrays.asList("Reflection", "Collection", "Stream");
//    List result = (List)names.stream().sorted().collect(Collectors.toList());
//
//    method filter() na streamie:
//    List names2 = Arrays.asList("Refrection", "Collection", "Stream");
//    List result2 = names2.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//
//    method collect()
//    List names3 = Arrays.asList("Reflection", "Collection", "Stream");
//    List result3 = names3.stream().map(x -> x*x).collect(Collectors.toList());
//
//    method forEach:
//    List number2 = Arrays.asList(2, 3, 4, 5);
//    List result4 = number2.stream().map(x->x*x).forEach(y-> System.out.println(y));

    //method reduce()
//    List number3 = Arrays.asList(2, 3, 4, 5);
//    List result5 = number3.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
//
}
