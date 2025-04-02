class Book{
   private String title;
   private int publicationYear;

   public Book(String title, int publicationYear){
    this.title = title;
    this.publicationYear = publicationYear;
   }
   public String getTitle(){
    return this.title;
   }
   public int getPublicationYear(){
    return this.publicationYear;
   }
   
}

public class Author extends Book{

    public String authorName;
    public String bio;

    public Author( String title, int publicationYear, String authorName, String bio){
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    public void displayInfo(){
        System.out.println("Title: " + super.getTitle());
        System.out.println("Publication Year: " + super.getPublicationYear());
        System.out.println("Author Name: " + this.authorName);
        System.out.println("Bio: " + this.bio);

    }
    public static void main(String[] args) {
        Author author = new Author("IKIGAI", 2012, "MuraKami", "Ikigai is a japanese novel on healthy life styles!");
        author.displayInfo();
        
    }
}