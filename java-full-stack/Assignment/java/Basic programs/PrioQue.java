import java.util.*;
public class PrioQue {
    public static void main(String [] args) {
        PriorityQueue<String> color = new PriorityQueue<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
	color.add("Purple");
	color.add("Orange");
	color.add("Indigo");
        System.out.print(color);

    }
}