import book.value_object.*;
import cupon.value_object.Percent;
import common.Result;

public class main {
    public static void main(String[] args) throws IllegalAccessException {


        Result<Name> name=Name.Create("cfeh");

       Result<Description> desc=Description.Create("");
        Result<Din> din=Din.of(24);
        Result<Pages> pages=Pages.Create(35);
        Result<Percent> percent=Percent.of(25);
        Result<Rating> rating=Rating.Create(2);
        Result<Stock> stock=Stock.Create(25);

//        StartDate startDate=StartDate.Create(new GregorianCalendar());
//        EndDate endDate =EndDate.Create(new GregorianCalendar(2022,2,2),startDate);
      //  Result<ReleaseDate> releaseDate=ReleaseDate.Create(new GregorianCalendar(2017,2,2));
       // book.Book b=new book.Book(name.getEntity(),din.getEntity(),pages.getEntity(),rating.getEntity(),stock.getEntity(),desc.getEntity(),releaseDate.getEntity());
//        //System.out.println(b.toString());




    }
}
