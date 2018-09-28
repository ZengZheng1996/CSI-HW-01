package com.company;
public class BeerSong {
public static void main(String[] args{
Ninety_Nine_Bottles_of_Beer();
}
public static void Ninety_Nine_Bottles_of_Beer() {
int numBeer = 99;
String bottleWord = "bottles";
while (numBeer > 0) {
if (numBeer == 1) {
bottleWord = "bottle";
}
System.out.print(numBeer + " " + bottleWord + " of beer on the wall, ");
System.out.print(numBeer + " " + bottleWord + " of beer take one down, pass it around, ");
numBeer--;
if(numBeer > 0) {
System.out.println(numBeer + " " + bottleWord + " of beer on the wall.");
} else {
System.out.println("no more bottles of beer on the wall.");
}
}
}
}
