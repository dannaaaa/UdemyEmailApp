package com.spartaglobal.UdemyEmailApp;

import java.util.Scanner;

public class Email {

    private String alternateEmail;
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;


    //construcor for firstname and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + firstName + " "+ lastName );

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment() {
        System.out.println("Enter department\n1 for Sales\n3 for Development\n3 for Accounting\n0 for none" );
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

    public String getPassword() {
        return password;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //ask for department

    //generate random password

    //set mailboc capacity

    //set alternate email

    //change password




}
