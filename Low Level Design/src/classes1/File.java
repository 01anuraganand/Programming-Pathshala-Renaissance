package classes1;

import java.util.Date;

public class File {
    private String absolutePath;
    private double size = 0;
    private Date dateOfCreation;
    private String content;
    private static  int count = 0; // initialize during class loading step(i.e before instance invoked)

    public File(String absolutePath){
        this.absolutePath = absolutePath;
        this.size = 0;
        this.dateOfCreation = new Date();
        this.content = "";
        this.count++;
    }

    public static int getCount(){
        return count;
    }
    public String getAbsolutePath(){
        int x = count; // Accessing of static member is allowed in non-static method, but not vice-versa
        return this.absolutePath;
    }

    public double getSize(){
        return this.size;
    }

    public Date getDateOfCreation(){
        return this.dateOfCreation;
    }

    public String getContent(){
        return this.content;
    }

    public void rename(String name)
    {
        /**
         *
         */
    }

    public void delete(){
        /**
         *
         */
    }

    public void copy(String path){
        if(this.size > 10)
            System.out.println("Cannot Copy.");
        else
            System.out.println("Copy Successful.");
    }

    public void addContent(String content){
        this.content += content;
        this.size += content.length();
    }

}