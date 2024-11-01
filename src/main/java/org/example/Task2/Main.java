import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
    List<Integer> namber = new ArrayList<>();
    namber.add(12);
    namber.add(24);
    namber.add(7);
    namber.add(89);
    namber.add(134);
    namber.add(45);
    namber.add(67);
    namber.add(37);
    namber.add(69);
    namber.add(72);
    namber.add(61);
    namber.add(28);
    namber.add(29);

    List<Integer> namberes = namber.stream().filter(n -> n % 2 == 0).toList(); // создаем новый List,берем List в который мы добавили объекты наши, -> создаем стрим -> фильтруем по нашему условию   ->
    namberes.stream().forEach(n -> System.out.println(n)); // выводим
}
