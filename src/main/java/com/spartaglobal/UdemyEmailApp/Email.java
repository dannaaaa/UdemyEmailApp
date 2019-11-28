package com.spartaglobal.UdemyEmailApp;

import java.util.Scanner;

public class Email {

    private String alternateEmail;
    private String email;
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPassword = 9;
    private int mailboxCapacity = 500;
    private String companySuffix = "company.com";


    //constructor for firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + firstName + " "+ lastName );

        //call method asking for department then return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call method that generates random password
        this.password = randomPassword(defaultPassword);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email is: " + email);

    }

    //call a method that return a random password


    private String setDepartment() {
        System.out.println("Enter department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none" );
        Scanner in = new Scanner(System.in );
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "Sales";
        } else if(departmentChoice == 2 ){
            return "Development";
        } else if ( departmentChoice == 3){
            return "Accounting";
        } else
            return "Please select a department";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@$#%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + lastName; 
    }


    //ask for department

    //generate random password

    //set mailboc capacity

    //set alternate email

    //change password




}
