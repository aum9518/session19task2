import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class inventory implements Searchable{
    private Product[] product;

    public inventory(Product[] product) {
        this.product = product;
    }


    @Override
    public Product search(String name) {
        for (Product a:product) {
            if (name.equals(a.getName())){
                return a;
            }
        }
       return  null;
    }

    @Override
    public Product searchbyType(String type ) {  //tibine jazsak oshol tiptegi productunu chygaryp beret
        for (Product b: product) {
            if (b.getType().name().equals(type)){
                return b;

            }
        }
        return null;
    }

    @Override
    public void expirationDate() {
        for (Product c:product) {
          //  Period prp =Period.ofDays(10);
            int prp1 = Period.between(c.getMadeOfDate(), LocalDate.now()).getDays();
            if (prp1<10){
            c.setStatusExpirationDate("Valid");//eger 10 kumdon ahkan emes bolso statusexpiration poliasyna jaraktuu maanisin beret
            }else {
                c.setStatusExpirationDate("Invalid"); //eger 10 kundon ashyp ketse jaraksyz maaanisin beret
            }
        }
    }

    @Override
    public void discount() {
        for (Product s:product) {
            Period month = Period.ofMonths(6);
            int month1 = Period.between(s.getMadeOfDate(),LocalDate.now()).getMonths();
            if (month1>6){
                s.setStatusExpirationDate("Discount 50%"); //eger productuga 6 aidan ashsa anda 50% skidka maanisin beret
            }else {
               s.setStatusExpirationDate("New one"); //eger 6 ai bolo elek bolso jany tovar dep chygat
            }
        }
    }

    @Override
    public String toString() {
        return "inventory{" +
                "product=" + Arrays.toString(product) +
                '}';
    }
}
