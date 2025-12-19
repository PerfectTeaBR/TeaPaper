package net.perfect.tea.launcher.teaPaper;

import java.io.File;
import net.perfect.tea.checkFile;

public class TeaPaperLauncher{
    public static void(String[] args()) {
        System.out.println("Welcome to the TeaPaper :3");
        System.out.println("");
        System.out.println("I Want to help the minecraft servers, but you have to  configurated me :3");
        System.out.println("");
        System.out.println("I Created a file called /"TeaPaper.conf"/");

           var configurationFile = teafileCheck()     ;

        if(!configurationFile.not.exists) {
            System.out.println("Hey! The configurationFile don't exists! Returning null...");
            return null;
        }
    }
}