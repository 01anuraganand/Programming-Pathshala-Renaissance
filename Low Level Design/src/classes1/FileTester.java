package classes1;

public class FileTester {
    public static void  main(String[] args){
        File myFile = new File("./a1.txt");
        System.out.println(myFile.getDateOfCreation() + " " + myFile.getAbsolutePath());
        myFile.copy("/Desktop/a1Copy.txt");
        myFile.addContent("Hey, I am anurag anand,");
        System.out.println(myFile.getContent() + " " + myFile.getSize());

        File mySecondFile = new File("./a1.txt");
        System.out.println(myFile.getAbsolutePath() + " " + mySecondFile.getAbsolutePath());
        mySecondFile.addContent("I am new to Java Programming.");
        myFile.copy("/Desktop/copy.txt");
        mySecondFile.copy("/Desktop/copy.txt");

        // Static
        // Invoking of not-static data and methods from static method is not allowed.
        System.out.println(File.getCount());
        System.out.println(myFile.getCount()); // not good to create through object instance
    }
}