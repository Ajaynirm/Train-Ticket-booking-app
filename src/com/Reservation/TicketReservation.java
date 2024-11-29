package com.Reservation;

import com.Passengers.Children;
import com.Passengers.Passenger;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketReservation {
    private int totalBerth;
    private int lower;
    private int middle;
    private int upper;
    private int rac=9;
    private int totalRacBerth=18;
    private int WaitListTickets=10;
    private ArrayList<Passenger> bookedTickets;
    private ArrayList<Passenger> racList;
    private ArrayList<Passenger> waitList;
    private ArrayList<Children> children;

    public TicketReservation(int totalBerth,int lower,int middle,int upper ){
        this.totalBerth=totalBerth;
        this.lower=lower;
        this.middle=middle;
        this.upper=upper;
        bookedTickets=new ArrayList<>();
        racList=new ArrayList<>();
        waitList=new ArrayList<>();
        children=new ArrayList<>();
    }

    public void bookTickets(){
        Scanner in=new Scanner(System.in);
        if(WaitListTickets==0){
            System.out.println("No ticket Available");
            return;
        }
        System.out.println("Enter name");
        String name=in.nextLine().toLowerCase();
        System.out.println("Enter Age");
        int age=in.nextInt();
        in.nextLine();
        System.out.println("Enter Gender");
        String gender=in.nextLine().toLowerCase();
        System.out.println("Enter Berth preferences(Up/Low/Mid)");
        String berth=in.nextLine().toLowerCase();

        if(age<5){
            Children child=new Children(name,age,gender);
            children.add(child);
            System.out.println("No Ticket for Children");
            return;
        }
        if(bookedTickets.size()<totalBerth){
            if(berth=="upper" && upper>0){

            }
        }
    }
}
