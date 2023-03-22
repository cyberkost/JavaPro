package company;

//Сделать отдельный компаратор который сортирует по рейтингу

import java.util.Comparator;

public class ComparatorRating implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
         return e1.getRating().compareTo(e2.getRating());
    }
}
