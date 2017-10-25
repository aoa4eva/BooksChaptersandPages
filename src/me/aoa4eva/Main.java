package me.aoa4eva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String pageAns;
        String chapterAns;
        String pTitle;
        String cTitle;

        //Declare your variables
        //You instantiate the book here so that you can use it throughout the main method.
        Book aBook = new Book();

        //Declare the variables here, create new instances of them later when they are needed, so you can add pages to chapters, and chapters to the book
        Chapter c;
        Page p;

        do{

            c = new Chapter();
            System.out.println("Enter a chapter title");
            cTitle=keyboard.nextLine();
            c.setTitle(cTitle);
            aBook.addChapter(c);

            do{
                p = new Page();
                System.out.println("Enter a page title");
                pTitle=keyboard.nextLine();
                p.setTitle(pTitle);
                c.addPage(p);

                do{
                    System.out.println("Enter another page(Y/N)");
                    pageAns=keyboard.nextLine();
                }while(!pageAns.equalsIgnoreCase("y") && !pageAns.equalsIgnoreCase("n"));


            }while(pageAns.equalsIgnoreCase("y") && !pageAns.equalsIgnoreCase("n"));

            do{
                System.out.println("Enter another chapter(Y/N)");
                chapterAns=keyboard.nextLine();
            }while(!chapterAns.equalsIgnoreCase("y") && !chapterAns.equalsIgnoreCase("n"));


        }while(chapterAns.equalsIgnoreCase("y") && !chapterAns.equalsIgnoreCase("n"));


        for(Chapter x: aBook.getChapters())
        {
            System.out.println(x.getTitle());
            for(Page y: x.getPages())
            {
                System.out.println(y.getTitle());
            }
        }
    }
}
