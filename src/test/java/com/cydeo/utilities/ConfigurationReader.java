package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


//This class is only 1 time we are creating in utilities
public class ConfigurationReader {


    /**
     * - // 1- create the object of Property class
     * - // We need properties class to use methods coming from class like load(), getProperty("key")
     */
        //The purpose of this class is to read the configuration.properties file
    // It is static because we using it in static method
     // It is static because we using it in static method and static block
    // it is private because I will be using only in this class
   private static Properties properties = new Properties();


    /**
     // 2- Create the object of FileInputStream
     // - We need this object to open file as a stream in Java memory
     */


    /**
     - // 3- Load the properies object using FileInputStream object
     // - Load "properties" object with the "file" we opened using FileInputStream
     */

    //We want to open the properties file and load to properties object ONLY ONCE before reading
    //Having static block because static runs first

    static {
        try{


            FileInputStream file = new FileInputStream("Config.properties");


    properties.load(file);

    //close the file after loading
    //If we do not close the file, it will take space from computer memory like scanner
    file.close();


        }catch(IOException e){
            e.printStackTrace();

        }

    }

    /**
     * This method is used to read value from a configuration.properties file
     *
     * @param keyword
     * @return -> value for the key. returns null if the key is not found
     * driver.get(ConfigurationReader.getProperty("env"));
     */
    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

        }

    }
