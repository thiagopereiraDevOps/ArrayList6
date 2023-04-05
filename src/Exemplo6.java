import java.util.ArrayList;
import java.util.List;

public class Exemplo6 {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("HD Case", 80.90));

        list.removeIf(new ProdutoPredicate());

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
