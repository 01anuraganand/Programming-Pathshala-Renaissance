package classes1;

import java.util.Date;

public class File {
    private String absolutePath;
    private double size = 0;
    private Date dateOfCreation;
    private String content;

    public File(String absolutePath){
        this.absolutePath = absolutePath;
        this.size = 0;
        this.dateOfCreation = new Date();
        this.content = "";
    }

    public String getAbsolutePath(){
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