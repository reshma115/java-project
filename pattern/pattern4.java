class Star {

public static void printTriagle(int n) {

for (int i = 0; i < n; i++) {

for (int j = n - i; j > 1; j--) { //Loop for blank space

System.out.print(" "); //Print Space

}

for (int j = 0; j <= i; j++) { //loop for star

System.out.print("* "); //Print Star

}

System.out.println(); //Newline

}

}

public static void main(String args[]) {

int n = 5;

printTriagle(n);

}

}