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
            "Why do some products capture widespread attention while others flop? What makes us engage with certain products out of sheer habit? Is there a pattern underlying how technologies hook us?\n" +
                    "\n" +
                    "Nir Eyal answers these questions (and many more) by explaining the Hook Model—a four-step process embedded into the products of many successful companies to subtly encourage customer behavior. Through consecutive “hook cycles,” these products reach their ultimate goal of bringing users back again and again without depending on costly advertising or aggressive messaging.\n" +
                    "\n" +
                    "\n" +
                    "Hooked is based on Eyal’s years of research, consulting, and practical experience. He wrote the book he wished had been available to him as a start-up founder—not abstract theory, but a how-to guide for building better products. Hooked is written for product managers, designers, marketers, start-up founders, and anyone who seeks to understand how products influence our behavior.\n" +
                    "\n" +
                    "\n" +
                    "Eyal provides readers with:\n" +
                    "\n" +
                    "\n" +
                    "• Practical insights to create user habits that stick.\n" +
                    "• Actionable steps for building products people love.\n" +
                    "\n" +
                    "• Fascinating examples from the iPhone to Twitter, Pinterest to the Bible App, and many other habit-forming products.",
            "An inspiring guide to creativity in the digital age, Steal Like an Artist presents ten transformative principles that will help readers discover their artistic side and build a more creative life.\n" +
                    " \n" +
                    "Nothing is original, so embrace influence, school yourself through the work of others, remix and reimagine to discover your own path. Follow interests wherever they take you—what feels like a hobby may turn into you life’s work. Forget the old cliché about writing what you know: Instead, write the book you want to read, make the movie you want to watch.\n" +
                    " \n" +
                    "And finally, stay Smart, stay out of debt, and risk being boring in the everyday world so that you have the space to be wild and daring in your imagination and your work.\n" +
                    "\n" +
                    " “Brilliant and real and true.”—Rosanne Cash",
            "Are you Smart Enough to Work at Google? guides readers through the surprising solutions to dozens of the most challenging interview questions. Learn the importance of creative thinking, how to get a leg up on the competition, what your Facebook page says about you, and much more.\n" +
                    "You are shrunk to the height of a nickel and thrown in a blender. The blades start moving in 60 seconds. What do you do? If you want to work at Google, or any of America's best companies, you need to have an answer to this and other puzzling questions.\n" +
                    "Are you Smart Enough to Work at Google? is a must read for anyone who wants to succeed in today's job market.",
            "The Lean UX approach to interaction design is tailor-made for today’s web-driven reality. In this insightful book, leading advocate Jeff Gothelf teaches you valuable Lean UX principles, tactics, and techniques from the ground up—how to rapidly experiment with design ideas, validate them with real users, and continually adjust your design based on what you learn.\n" +
                    "\n" +
                    "Inspired by Lean and Agile development theories, Lean UX lets you focus on the actual experience being designed, rather than deliverables. This book shows you how to collaborate closely with other members of the product team, and gather feedback early and often. You’ll learn how to drive the design in short, iterative cycles to assess what works best for the business and the user. Lean UX shows you how to make this change—for the better.\n" +
                    "\n" +
                    "Frame a vision of the problem you’re solving and focus your team on the right outcomes\n" +
                    "Bring the designers’ toolkit to the rest of your product team\n" +
                    "Share your insights with your team much earlier in the process\n" +
                    "Create Minimum Viable Products to determine which ideas are valid\n" +
                    "Incorporate the voice of the customer throughout the project cycle\n" +
                    "Make your team more productive: combine Lean UX with Agile’s Scrum framework\n" +
                    "Understand the organizational shifts necessary to integrate Lean UX\n" +
                    "Lean UX received the 2013 Jolt Award from Dr. Dobb's Journal as the best book of the year. The publication's panel of judges chose five notable books, published during a 12-month period ending June 30, that every serious programmer should read.",
            "Since Don’t Make Me Think was first published in 2000, hundreds of thousands of Web designers and developers have relied on usability guru Steve Krug’s guide to help them understand the principles of intuitive navigation and information design. Witty, commonsensical, and eminently practical, it’s one of the best-loved and most recommended books on the subject.\n" +
                    "\n" +
                    "Now Steve returns with fresh perspective to reexamine the principles that made Don’t Make Me Think a classic–with updated examples and a new chapter on mobile usability. And it’s still short, profusely illustrated…and best of all–fun to read.\n" +
                    "\n" +
                    "If you’ve read it before, you’ll rediscover what made Don’t Make Me Think so essential to Web designers and developers around the world. If you’ve never read it, you’ll see why so many people have said it should be required reading for anyone working on Web sites.\n" +
                    "\n" +
                    "\n" +
                    "“After reading it over a couple of hours and putting its ideas to work for the past five years, I can say it has done more to improve my abilities as a Web designer than any other book.”\n" +
                    "–Jeffrey Zeldman, author of Designing with Web Standards",
            "Android Programming: The Big Nerd Ranch Guide: is an introductory Android book for programmers with Java experience. Based on Big Nerd Ranch’s popular Android Bootcamp course, this guide will lead you through the wilderness using hands-on example apps combined with clear explanations of key concepts and APIs. This book focuses on practical techniques for developing apps compatible with all versions of Android widely used today (Android 2.2 - 4.2). Write and run code every step of the way – creating apps that catalog crime scenes, browse photos, track your jogging route, and more. Each chapter and app has been designed and tested to provide the knowledge and experience you need to get started in Android development.\n" +
                    "Write and run code every step of the way — creating apps that catalog crime scenes, browse photos, track your jogging route, and more. Each chapter and app has been designed and tested to provide the knowledge and experience you need to get started in Android development.\n" +
                    "\n" +
                    "\"Big Nerd Ranch provided the training we needed to get hundreds of engineers building skillfully on Android. This book is a great distillation of that training and will be a huge help to anyone looking to ramp up as well.\" – Mike Shaver, Director of Mobile Engineering, Facebook\n" +
                    "\n" +
                    "\"…a must-have for the developer just starting in Android or ready for more advanced techniques. I was impressed with this book’s content and clarity of presentation. The authors explain simple and complex Android topics with equal ease.\" – James Steele, author of The Android Developer's Cookbook",
            "Google Android dominates the mobile market, and by targeting Android, your apps can run on most of the phones and tablets in the world. This new fourth edition of the #1 book for learning Android covers all modern Android versions from Android 4.1 through Android 5.0. Freshly added material covers new Android features such as Fragments and Google Play Services. Android is a platform you can't afford not to learn, and this book gets you started.\n" +
                    "\n" +
                    "Android is a software toolkit for mobile phones and tablets, created by Google. It's inside more than a billion devices, making Android the number one platform for application developers. Your own app could be running on all those devices!\n" +
                    "\n" +
                    "Getting started developing with Android is easy. You don't even need access to an Android phone, just a computer where you can install the Android SDK and the emulator that comes with it. Within minutes, Hello, Android gets you creating your first working application: Android's version of \"Hello, World.\" From there, you'll build up a more substantial example: an Ultimate Tic-Tac-Toe game. By gradually adding features to the game, you'll learn about many aspects of Android programming, such as creating animated user interfaces, playing music and sound effects, building location-based services (including GPS and cell-tower triangulation), and accessing web services. You'll also learn how to publish your applications to the Google Play Store.\n" +
                    "\n" +
                    "This fourth edition of the bestselling Android classic has been revised for Android 4.1-4.3 (Jelly Bean), 4.4 (KitKat), and Android 5.0 (Lollipop). Topics have been streamlined and simplified based on reader feedback, and every page and example has been reviewed and updated for compatibility with the latest versions of Android.",
            "What will you learn from this book?\n" +
                    "\n" +
                    "If you have an idea for a killer Android app, this book will help you build your first working application in a jiffy. You’ll learn hands-on how to structure your app, design interfaces, create a database, make your app work on various smartphones and tablets, and much more. It’s like having an experienced Android developer sitting right next to you! All you need is some Java know-how to get started.\n" +
                    "\n" +
                    "Why does this book look so different?\n" +
                    "\n" +
                    "Based on the latest research in cognitive science and learning theory, Head First Android Development uses a visually rich format to engage your mind, rather than a text-heavy approach that puts you to sleep. Why waste your time struggling with new concepts? This multi-sensory learning experience is designed for the way your brain really works.",
            "There are many Android programming guides that give you the basics. This book goes beyond simple apps into many areas of Android development that you simply will not find in competing books.\n" +
                    "\n" +
                    "Whether you want to add home screen app widgets to your arsenal, or create more complex maps, integrate multimedia features like the camera, integrate tightly with other applications, or integrate scripting languages, this book has you covered.\n" +
                    "\n" +
                    "Moreover, this book has over 50 pages of Honeycomb-specific material, from dynamic fragments, to integrating navigation into the action bar, to creating list-based app widgets. It also has a chapter on using NFC, the wireless technology behind Google Wallet and related services.\n" +
                    "\n" +
                    "This book is one in CommonsWare's growing series of Android related titles, including The Busy Coder's Guide to Android Development, Android Programming Tutorials, and the upcoming Tuning Android Applications.\n" +
                    "\n" +
                    "Table of Contents\n" +
                    "WebView, Inside and Out\n" +
                    "Crafting Your Own Views\n" +
                    "More Fun With ListViews\n" +
                    "Creating Drawables\n" +
                    "Home Screen App Widgets\n" +
                    "Interactive Maps\n" +
                    "Creating Custom Dialogs and Preferences\n" +
                    "Advanced Fragments and the Action Bar\n" +
                    "Animating Widgets\n" +
                    "Using the Camera\n" +
                    "Playing Media\n" +
                    "Handling System Events\n" +
                    "Advanced Service Patterns\n" +
                    "Using System Settings and Services\n" +
                    "Content Provider Theory\n" +
                    "Content Provider Implementation Patterns\n" +
                    "The Contacts ContentProvider\n" +
                    "Searching with SearchManager\n" +
                    "Introspection and Integration\n" +
                    "Tapjacking\n" +
                    "Working with SMS\n" +
                    "More on the Manifest\n" +
                    "Device Configuration\n" +
                    "Push Notifications with C2DM\n" +
                    "NFC\n" +
                    "The Role of Scripting Languages\n" +
                    "The Scripting Layer for Android\n" +
                    "JVM Scripting Languages\n" +
                    "Reusable Components\n" +
                    "Testing\n" +
                    "Production",
            "Bring your big ideas to the small screen with this one-of-a-kind guide to creating amazing Android applications\n" +
                    "\n" +
                    "The Android OS continues to rapidly expand offering app developers access to one of the largest platforms available, and this easy-to-follow guide walks you through the development process step by step. In this new edition of the bestselling Android Application Development For Dummies, Android programming experts Michael Burton and Donn Felker explain how to download the SDK, get Eclipse up and running, code Android applications, and share your finished products with the world.\n" +
                    "\n" +
                    "Featuring two sample programs, this book explores everything from the simple basics to advanced aspects of Android application development.\n" +
                    "\n" +
                    "Walks you through all the steps in developing applications for the Android platform, including the latest Android features like scrollable widgets, enhanced UI tools, social media integration, and new calendar and contact capabilities\n" +
                    "Starts off with downloading the SDK, then explains how to bring your applications to life and submit your work to the Android Market\n" +
                    "Includes real-world advice from expert programmers Donn Felker and Michael Burton, who break every aspect of the development process down into practical, digestible pieces\n" +
                    "Whether you're new to Android development or already on your way, Android Application Development For Dummies, 2nd Edition is the guide you need to dig into the app dev process!"
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
