import java.util.ArrayList;
import java.util.List;

    class LibrarySystem {
    public  String  name;
    public float price;
      public float getPrice() {
          return price;
      }

      public void setPrice(float price) {
          this.price = price;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }
      public LibrarySystem(String name,float price){
          this.name=name;
          this.price=price;
      }
  }

class Book extends LibrarySystem{
     public String author;
     public int publicationYear;
     public String type;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Book(String name,float price,String author,int publicationYear,String type) {
        super(name,price);
        this.author = author;
        this.publicationYear=publicationYear;
        this.type=type;

    }
    @Override
    public String toString() {
        return "Book [name="+ name +",price="+ price +", type=" + type + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }

}
class Magazine extends LibrarySystem{
    public String  writer;
    public int publicationYear;


    public String getWriter() {
        return  writer;
    }

    public void setWriter(String writerr) {
        this.writer = writer;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }



    public Magazine(String name,float price,String writer,int publicationYear ) {
        super(name,price);
        this. writer =  writer;
        this.publicationYear=publicationYear;


    }
    @Override
    public String toString() {
        return "Magazine[name="+ name +",price="+ price +",writer=" +  writer + ", publicationYear=" + publicationYear + "]";
    }

}
class DVD extends LibrarySystem{

    public int  madeYear;
    public String producer;





    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public DVD(String name, float price,  int  madeYear, String  producer) {
        super(name,price);

        this.madeYear=madeYear;
        this.producer=producer;

    }
    @Override
    public String toString() {
        return "DVD[name="+ name +",price="+ price +",madeYear=" + madeYear   + ",  producer=" + producer + "]";
    }

}
class LibraryStore {
     public List<Book> books;
     public List<DVD> dvds;
     public List<Magazine> magazines;

    public LibraryStore() {
        this.books = new ArrayList<>();
        this.dvds = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(Book book) {
        books.remove(book);
    }


    public void updateBook(Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if (index != -1) {
            books.set(index, newBook);
        }
    }
    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }


    public void removeDVD(DVD dvd) {
        dvds.remove(dvd);
    }


    public void updateDVD(DVD oldDVD, DVD newDVD) {
        int index = dvds.indexOf(oldDVD);
        if (index != -1) {
            dvds.set(index, newDVD);
        }
    }
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }


    public void removeMagazine(Magazine magazine) {
        magazines.remove(magazine);
    }


    public void updateMagazine(Magazine oldMagazine, Magazine newMagazine) {
        int index = magazines.indexOf(oldMagazine);
        if (index != -1) {
            magazines.set(index, newMagazine);
        }
    }


    public void displayBooks() {
        System.out.println("Books in the library store:");
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public void displayDVDs() {
        System.out.println("DVDs in the library store:");
        for (DVD dvd : dvds) {
            System.out.println(dvd);
        }
    }


    public void displayMagazines() {
        System.out.println("Magazines in the library store:");
        for (Magazine magazine : magazines) {
            System.out.println(magazine);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LibraryStore libraryStore = new LibraryStore();
        Book book1 = new Book("Java Programming", 300.0f, "John Doe", 2021, "learning");
        Book book2 = new Book("Python Programming", 500.0f, "Jane Smith", 2020, "learning");
        libraryStore.addBook(book1);
        libraryStore.addBook(book2);
        libraryStore.removeBook(book1);
        Magazine magazine1 = new Magazine("National Geographic", 50.f, "Pico Iyer", 2005);
        Magazine magazine2 = new Magazine("Time", 60.5f, "John Doe", 2021);
        libraryStore.addMagazine(magazine1);
        libraryStore.addMagazine(magazine2);
        libraryStore.removeMagazine(magazine2);
        DVD dvd1 = new DVD("The Matrix", 1000.0f, 1999, "Joel Silver");
        DVD dvd2 = new DVD("Inception", 750.90f, 2010, "Christopher");
        libraryStore.addDVD(dvd1);
        libraryStore.addDVD(dvd2);
        Book bookOld = libraryStore.books.get(0);
        Book bookNew=new Book("c++ Programming", 300.0f, "John Doe", 2021, "learning");
        libraryStore.updateBook(bookOld,bookNew );
        libraryStore.displayBooks();
        libraryStore.displayDVDs();
        libraryStore.displayMagazines();
    }
    }




