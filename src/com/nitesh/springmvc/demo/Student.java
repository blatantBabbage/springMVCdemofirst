package com.nitesh.springmvc.demo;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String[] operatingSystems;
    private LinkedHashMap<String, String> operatingSystemsOptions;
    private LinkedHashMap<String,String> countryOptions;
    private LinkedHashMap<String, String> favouriteLanguageOptions;


    public Student() {

        //populate country options
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Brazil","Brazil");
        countryOptions.put("Germany","Germany");
        countryOptions.put("France","France");
        countryOptions.put("India","India");
        countryOptions.put("USA","United States Of America");

        //populate favouriteLanguage options
        favouriteLanguageOptions = new LinkedHashMap<>();
        favouriteLanguageOptions.put("Java","Java");
        favouriteLanguageOptions.put("C++","C++");
        favouriteLanguageOptions.put("Ruby","Ruby");
        favouriteLanguageOptions.put("Python","Python");
        favouriteLanguageOptions.put("JS","JS");

        //populate operatingSystems options
        operatingSystemsOptions = new LinkedHashMap<>();
        operatingSystemsOptions.put("Linux","Linux");
        operatingSystemsOptions.put("MacOS","MacOS");
        operatingSystemsOptions.put("Windows","Windows");
        operatingSystemsOptions.put("FireOS","FireOS");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
        return favouriteLanguageOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getOperatingSystemsOptions() {
        return operatingSystemsOptions;
    }
}
