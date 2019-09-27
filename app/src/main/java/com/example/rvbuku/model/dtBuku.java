package com.example.rvbuku.model;

import java.util.ArrayList;

public class dtBuku {
    private static String[] nameBook = {
            "Hooked: How to Build Habit-Forming Products",
            "Steal Like an Artist: 10 Things Nobody Told You About Being Creative",
            "Are You Smart Enough to Work at Google?",
            "Lean UX: Applying Lean Principles to Improve User Experience",
            "Don't Make Me Think, Revisited: A Common Sense Approach to Web Usability (Voices That Matter)",
            "Android Programming: The Big Nerd Ranch Guide (Big Nerd Ranch Guides)",
            "Hello, Android: Introducing Google's Mobile Development Platform",
            "Head First Android Development: A Brain-Friendly Guide",
            "The Busy Coder's Guide to Advanced Android Development",
            "Android Application Development for Dummies"
    };

    private static String[] timeBook = {
            "November 4, 2014",
            "February 28, 2012",
            "January 4, 2012",
            "March 11, 2013",
            "December 23, 2013",
            "April 7, 2013",
            "May 4, 2015",
            "July 3, 2015",
            "July 20, 2011",
            "October 23, 2012"
    };

    private static String[] publisherBook = {
            "Portfolio",
            "Workman Publishing",
            "Little, Brown Spark",
            "O'Reilly Media",
            "New Riders",
            "Big Nerd Ranch Guides",
            "Pragmatic Bookshelf",
            "O'Reilly Media",
            "CommonsWare",
            "For Dummies"
    };

    private static String[] rateBook = {
            "9.4",
            "9.2",
            "-",
            "8.6",
            "-",
            "8.8",
            "-",
            "9.2",
            "7.6",
            "6.6"
    };

    private static String[] authorBook = {
            "Nir Eyal",
            "Austin Kleon",
            "William Poundstone",
            "Jeff Gothelf",
            "Steve Krug",
            "Bill Phillips",
            "Ed Burnette",
            "Dawn Griffiths",
            "Mr. Mark L Murphy",
            "Micael Burton"
    };

    private static String[] genreBook = {
            "Product Management",
            "Design & Decorative Arts",
            "Logic & Brain Teasers",
            "Enterprise Application",
            "Business Software",
            "Mobile App Development",
            "Java Computer Programming",
            "Java Programming",
            "Software Development",
            "Software Development"
    };

    private static String[] photoBook = {
            "https://images-na.ssl-images-amazon.com/images/I/41aMEH29Z-L._SX329_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/51fIZsUhrpL._SY498_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/41PpEJ9PwfL.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/41JWTd4PCWL._SX331_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/51xzVPaFhfL._SX387_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/41nouthfOxL._SX348_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/41522iLnezL._SX415_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/51j0Gr0qBSL._SX430_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/51NGqVD68nL._SX403_BO1,204,203,200_.jpg",
            "https://images-na.ssl-images-amazon.com/images/I/51ATYjwrA-L._SX394_BO1,204,203,200_.jpg"
    };

    private static String[] descBook = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    public static ArrayList<Buku> getListData(){
        ArrayList<Buku> list = new ArrayList<>();
        for (int i = 0; i < nameBook.length; i++){
            Buku buku = new Buku();
            buku.setName(nameBook[i]);
            buku.setTime(timeBook[i]);
            buku.setPublisher(publisherBook[i]);
            buku.setRate(rateBook[i]);
            buku.setAuthor(authorBook[i]);
            buku.setGenre(genreBook[i]);
            buku.setDesc(descBook[i]);
            buku.setPhoto(photoBook[i]);
            list.add(buku);
        }
        return list;
    }
}
