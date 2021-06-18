package io.full.soumya.p2;

public class Test {
	

	public static void main(String[] args) {
		 // declares an Array of integers.
        Student[] arr;
  
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
  
        // initialize the first elements of the array
        arr[0] = new Student(1,"Rama");
  
        // initialize the second elements of the array
        arr[1] = new Student(2,"Hari");
  
        // so on...
        arr[2] = new Student(3,"Hk");
        arr[3] = new Student(4,"Bk");
        arr[4] = new Student(5,"Pk");
  
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " +
                        arr[i].rollNo +" "+ arr[i].name);
        }

	}

}
